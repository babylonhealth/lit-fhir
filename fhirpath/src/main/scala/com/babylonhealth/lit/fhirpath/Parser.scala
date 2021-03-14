package com.babylonhealth.lit.fhirpath

import fastparse._

import com.babylonhealth.lit.core.model.Quantity
import com.babylonhealth.lit.fhirpath.Parser.ParseException
import com.babylonhealth.lit.fhirpath.model._
import fastparse.JavaWhitespace.whitespace

trait Parser extends Lexer {

  def parse(str: String): Parsed[Expr] = fastparse.parse(str, top(_))

  // Example of trace error message:
  //   getIndexed | [ \t] ~ descendAndMaybeIndex | StringIn("or", "and") | end-of-input):1:5, found ".$%^.isInv"
  // Weird and verbose but still useful
  def parseUnsafe(str: String): Expr =
    parse(str) match {
      case Parsed.Success(value, _) => value
      case failure: Parsed.Failure  => throw new ParseException(failure.trace().aggregateMsg)
    }

  import Lexer.RichParser

  def top[_: P]: P[Expr] = expression ~ End

  def expression[_: P]: P[Expr] = P(impliesExpr)

  // Handles precedence by descending from lowest to highest precedence operators
  def impliesExpr[_: P]: P[Expr] = orExpr ~ ("implies".as(Implies) ~/ orExpr).rep map foldBinOp
  def orExpr[_: P]: P[Expr]      = andExpr ~ (("or".as(Or) | "xor".as(Xor)) ~/ andExpr).rep map foldBinOp
  def andExpr[_: P]: P[Expr]     = inExpr ~ ("and".as(And) ~/ inExpr).rep map foldBinOp
  def inExpr[_: P]: P[Expr]      = eqExpr ~ (("in".as(In) | "contains".as(Contains)) ~/ eqExpr).rep map foldBinOp
  def eqExpr[_: P]: P[Expr]      = ineqExpr ~ (eqOp ~/ ineqExpr).rep map foldBinOp
  def ineqExpr[_: P]: P[Expr]    = unionExpr ~ (ineqOp ~/ unionExpr).rep map foldBinOp
  def unionExpr[_: P]: P[Expr]   = typeExpr ~ ("|".as(Union) ~/ typeExpr).rep map foldBinOp
  def typeExpr[_: P]: P[Expr]    = addExpr ~ (typeOp ~/ typeSpecifier).rep map foldOp(TypeOperation)
  def addExpr[_: P]: P[Expr]     = multExpr ~ ((signOp | "&".as(StringConcat)) ~/ multExpr).rep map foldBinOp
  def multExpr[_: P]: P[Expr]    = unaryExpr ~ (multOp ~/ unaryExpr).rep map foldBinOp
  def unaryExpr[_: P]: P[Expr]   = (signOp ~/ term map UnaryOperation.tupled) | term

  private val foldBinOp: ((Expr, Seq[(BinaryOperator, Expr)])) => Expr = foldOp(BinaryOperation)

  private def foldOp[Op, Arg](f: (Expr, Op, Arg) => Expr): ((Expr, Seq[(Op, Arg)])) => Expr = { case (head, tail) =>
    tail.foldLeft(head) { case (accum, (op, next)) => f(accum, op, next) }
  }

  def term[_: P]: P[Expr] = atom ~ termSuffix.rep map { case (a, suffixes) => suffixes.foldLeft(a) { (x, y) => y(x) } }

  def termSuffix[_: P]: P[Expr => Expr] = indexTerm | typeFunc | invocTerm

  private def indexTerm[_: P] = "[" ~/ expression.map(e => model.Index(_, e)) ~ "]"
  private def typeFunc[_: P] = "." ~ typeOp ~ "(" ~/ typeSpecifier ~ ")" map { case (op, t) =>
    TypeOperation(_, op, t)
  }
  private def invocTerm[_: P] = "." ~/ invocation map { i => InvocationExpr(_, i) }

  def atom[_: P]: P[Expr] =
    P(functionCall | rootPath | fieldAccess | dollarKeyword | literal | envVar | "(" ~/ expression ~ ")")

  private def rootPath[_: P]: P[RootPath] = P(typeSpecifier).map(RootPath)

  def literal[_: P]: P[Literal] = P(("{" ~ "}").map(_ => Empty) | singleValue)

  private def singleValue[_: P]: P[SingleValue] =
    (quantity | boolean | str | decimal | int | dateTime | date | time).map(Value.wrapSystem).map(SingleValue)

  def envVar[_: P]: P[Expr] = "%" ~~ (identifier | str) map EnvironmentVariable

  def invocation[_: P]: P[Invocation] = P(functionCall | fieldAccess | dollarKeyword)

  def fieldAccess[_: P]: P[FieldAccess] = identifier.map(FieldAccess)

  def functionCall[_: P]: P[Invocation] = P(ofType | normalFunction)
  def normalFunction[_: P]: P[Func]     = identifier ~ "(" ~/ paramList ~ ")" map Func.tupled
  def ofType[_: P]: P[OfType]           = "ofType" ~ "(" ~/ typeSpecifier ~ ")" map OfType

  def paramList[_: P]: P[Seq[Expr]] = P(expression.rep(sep = ","))

  def dollarKeyword[_: P]: P[Invocation] = "$this".as(This) | "$index".as(IndexInvoc) | "$total".as(Total)

  def typeOp[_: P]: P[TypeOperator]                      = "as".as(As) | "is".as(Is)
  def signOp[_: P]: P[UnaryOperator with BinaryOperator] = "+".as(Plus) | "-".as(Minus)
  def multOp[_: P]: P[BinaryOperator]                    = "*".as(Mult) | "/".as(Div) | "div".as(TruncDiv) | "mod".as(Mod)
  def eqOp[_: P]: P[BinaryOperator]                      = "=".as(Eq) | "~".as(Equiv) | "!=".as(Neq) | "!~".as(Nequiv)
  def ineqOp[_: P]: P[BinaryOperator]                    = "<=".as(Lte) | ">=".as(Gte) | "<".as(Lt) | ">".as(Gt)

  def quantity[_: P]: P[Quantity] =
    P(decimalOrInt ~ unit) map { case (value, unit) =>
      Quantity(value = Some(value), unit = Some(unit))
    }

  def typeSpecifier[_: P]: P[TypeSpecifier] =
    P(
      (("FHIR" ~ ".").? ~ fhirType map ("FHIR"         -> _)) |
        (("System" ~ ".").? ~ systemType map ("System" -> _))
    ).map(TypeSpecifier.tupled)

  implicit class FHIRPathHelper(val sc: StringContext) {
    def fhir(args: Any*): Expr = parseUnsafe(sc.parts.head)
  }
}

object Parser extends Parser {
  class ParseException(msg: String) extends Exception(msg)
}
