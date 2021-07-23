package com.babylonhealth.lit.fhirpath

//import fastparse._
import cats.data.NonEmptyList
import cats.parse.{ Parser0 => CatsParser0, _ }
import cats.parse.Parser._

import com.babylonhealth.lit.core.model.Quantity
import com.babylonhealth.lit.fhirpath.Parser.ParseException
import com.babylonhealth.lit.fhirpath.model._
//import fastparse.JavaWhitespace.whitespace

object Parsed {
  sealed trait Result[+T] { def isSuccess: Boolean }
  case class Success[T](value: T, idx: Int)               extends Result[T]       { override def isSuccess: Boolean = true  }
  case class Failure(label: String, index: Int, e: Error) extends Result[Nothing] { override def isSuccess: Boolean = false }
}

trait Parser extends Lexer {

  def parse(str: String): Parsed.Result[Expr] = top.parseAll(str) match {
    case Left(e)  => Parsed.Failure("Fail", e.failedAtOffset, e)
    case Right(v) => Parsed.Success(v, str.length - 1)
  }
  def parseToEither(str: String): Either[Error, Expr] = top.parseAll(str)

  // Example of trace error message:
  //   getIndexed | [ \t] ~+ descendAndMaybeIndex | StringIn("or", "and") | end-of-input):1:5, found ".$%^.isInv"
  // Weird and verbose but still useful
  def parseUnsafe(str: String): Expr =
    parseToEither(str) match {
      case Right(value)  => value
      case Left(failure) => throw new ParseException(failure.expected.map(_.toString).toList.mkString("\n -[and]- "))
    }

  import Lexer.RichParser
  import Lexer.RichParser_2

  def top: P[Expr] = expression

  def expression: P[Expr] = impliesExpr

  // Handles precedence by descending from lowest to highest precedence operators
  def impliesExpr: P[Expr] = P(orExpr ~+ ("implies".as(Implies) ~+ orExpr).rep0 map foldBinOp)
  def orExpr: P[Expr]      = P(andExpr ~+ (("or".as(Or) | "xor".as(Xor)) ~+ andExpr).rep0 map foldBinOp)
  def andExpr: P[Expr]     = P(inExpr ~+ ("and".as(And) ~+ inExpr).rep0 map foldBinOp)
  def inExpr: P[Expr]      = P(eqExpr ~+ (("in".as(In) | "contains".as(Contains)) ~+ eqExpr).rep0 map foldBinOp)
  def eqExpr: P[Expr]      = P(ineqExpr ~+ (eqOp ~+ ineqExpr).rep0 map foldBinOp)
  def ineqExpr: P[Expr]    = P(unionExpr ~+ (ineqOp ~+ unionExpr).rep0 map foldBinOp)
  def unionExpr: P[Expr]   = P(typeExpr ~+ ("|".as(Union) ~+ typeExpr).rep0 map foldBinOp)
  def typeExpr: P[Expr]    = P(addExpr ~+ (typeOp ~+ typeSpecifier).rep0 map { case (e, l) => foldOp(TypeOperation)(e, l.toList) })
  def addExpr: P[Expr]     = P(multExpr ~+ ((signOp | "&".as(StringConcat)) ~+ multExpr).rep0 map foldBinOp)
  def multExpr: P[Expr]    = P(unaryExpr ~+ (multOp ~+ unaryExpr).rep0 map foldBinOp)
  def unaryExpr: P[Expr]   = P((signOp ~+ term map (UnaryOperation.apply _).tupled) | term)

  private val foldBinOp: ((Expr, List[(BinaryOperator, Expr)])) => Expr = { case (e, l) =>
    foldOp(BinaryOperation)(e, l.toList)
  }

  private def foldOp[Op, Arg](f: (Expr, Op, Arg) => Expr): ((Expr, Seq[(Op, Arg)])) => Expr = { case (head, tail) =>
    tail.foldLeft(head) { case (accum, (op, next)) => f(accum, op, next) }
  }

  def term: P[Expr] = atom ~+ termSuffix.rep0 map { case (a, suffixes) => suffixes.foldLeft(a) { (x, y) => y(x) } }

  def termSuffix: P[Expr => Expr] = indexTerm | typeFunc.backtrack | invocTerm

  private def indexTerm: P[Expr => Expr] = char('[') *> expression.map(e => model.Index(_, e)) <* char(']')
  private def typeFunc: P[Expr => Expr] = char('.') *> (typeOp <* char('(')) ~+ typeSpecifier <* char(')') map { case (op, t) =>
    TypeOperation(_, op, t)
  }
  private def invocTerm: P[Expr => Expr] = char('.') *> invocation map { i => InvocationExpr(_, i) }

  def atom: P[Expr] =
    P(functionCall.backtrack | rootPath | fieldAccess.backtrack | dollarKeyword | literal | envVar | (char('(') *> expression <* char(')')))

  private def rootPath: P[RootPath] = typeSpecifier.map(RootPath)

  def literal: P[Literal] = ((char('{') ~+ char('}')).void.map(_ => Empty) | singleValue)

  def singleValue: P[SingleValue] =
    (quantity.backtrack | boolean | str | decimal.backtrack | int | time | dateTime.backtrack | date).map(Value.wrapSystem).map(SingleValue)

  def envVar: P[Expr] = char('%') *> (identifier | str) map EnvironmentVariable

  def invocation: P[Invocation] = functionCall.backtrack | fieldAccess | dollarKeyword

  def fieldAccess: P[FieldAccess] = identifier.map(FieldAccess)

  def functionCall: P[Invocation] = ofType | normalFunction
  def normalFunction: P[Func]     = (identifier <* char('(')) ~+ paramList <* char(')') map (Func.apply _).tupled
  def ofType: P[OfType]           = string("ofType") *> char('(') *> typeSpecifier <* char(')') map OfType

  def paramList: P0[Seq[Expr]] = expression.repSep0(sep = char(',')).map(_.toList)

  def dollarKeyword: P[Invocation] = "$this".as(This) | "$index".as(IndexInvoc) | "$total".as(Total)

  def typeOp: P[TypeOperator]                      = "as".as(As) | "is".as(Is)
  def signOp: P[UnaryOperator with BinaryOperator] = "+".as(Plus) | "-".as(Minus)
  def multOp: P[BinaryOperator]                    = "*".as(Mult) | "/".as(Div) | "div".as(TruncDiv) | "mod".as(Mod)
  def eqOp: P[BinaryOperator]                      = "=".as(Eq) | "~".as(Equiv) | "!=".as(Neq) | "!~".as(Nequiv)
  def ineqOp: P[BinaryOperator]                    = "<=".as(Lte) | ">=".as(Gte) | "<".as(Lt) | ">".as(Gt)

  def quantity: P[Quantity] =
    decimalOrInt ~+ unit map { case (value, unit) =>
      Quantity(value = Some(value), unit = Some(unit))
    }

  def typeSpecifier: P[TypeSpecifier] =
    (
      ((string("FHIR") ~+ char('.')).? ~~> fhirType map ("FHIR"         -> _)) |
        ((string("System") ~+ char('.')).? ~~> systemType map ("System" -> _))
    ).map((TypeSpecifier.apply _).tupled)

  implicit class FHIRPathHelper(val sc: StringContext) {
    def fhir(args: Any*): Expr = parseUnsafe(sc.parts.head)
  }
}

object Parser extends Parser {
  class ParseException(msg: String) extends Exception(msg)
}
