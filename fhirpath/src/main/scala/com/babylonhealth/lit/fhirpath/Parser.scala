package com.babylonhealth.lit.fhirpath

import cats.parse.Parser._

import com.babylonhealth.lit.core.model.Quantity
import com.babylonhealth.lit.fhirpath.Lexer.whitespaces0
import com.babylonhealth.lit.fhirpath.Parser.ParseException
import com.babylonhealth.lit.fhirpath.model._

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

  import Lexer.{ RichParser, RichParser_2 }

  // / Top vals
  val expression: P[Expr] = impliesExpr

  val top: P[Expr] = expression

  // / Mutually-recursive defs
  // Handles precedence by descending from lowest to highest precedence operators
  def impliesExpr: P[Expr] = P(orExpr ~+ ("implies".as(Implies) ~+ orExpr).rep0 map foldBinOp)
  def orExpr: P[Expr]      = P(andExpr ~+ (("or".as(Or) | "xor".as(Xor)) ~+ andExpr).rep0 map foldBinOp)
  def andExpr: P[Expr]     = P(inExpr ~+ ("and".as(And) ~+ inExpr).rep0 map foldBinOp)
  def inExpr: P[Expr]      = P(eqExpr ~+ (("in".as(In) | "contains".as(Contains)) ~+ eqExpr).rep0 map foldBinOp)
  def eqExpr: P[Expr]      = P(ineqExpr ~+ (eqOp ~+ ineqExpr).rep0 map foldBinOp)
  def ineqExpr: P[Expr]    = P(unionExpr ~+ (ineqOp ~+ unionExpr).rep0 map foldBinOp)
  def unionExpr: P[Expr]   = P(typeExpr ~+ ("|".as(Union) ~+ typeExpr).rep0 map foldBinOp)
  def typeExpr: P[Expr]    = P(addExpr ~+ (typeOp ~+ typeSpecifier).rep0 map { case (e, l) => foldOp(TypeOperation)(e, l) })
  def addExpr: P[Expr]     = P(multExpr ~+ ((signOp | "&".as(StringConcat)) ~+ multExpr).rep0 map foldBinOp)
  def multExpr: P[Expr]    = P(unaryExpr ~+ (multOp ~+ unaryExpr).rep0 map foldBinOp)
  def unaryExpr: P[Expr]   = P((signOp ~+ term map (UnaryOperation.apply _).tupled) | term)

  private val foldBinOp: ((Expr, List[(BinaryOperator, Expr)])) => Expr = { case (e, l) =>
    foldOp(BinaryOperation)(e, l)
  }

  private def foldOp[Op, Arg](f: (Expr, Op, Arg) => Expr): ((Expr, Seq[(Op, Arg)])) => Expr = { case (head, tail) =>
    tail.foldLeft(head) { case (accum, (op, next)) => f(accum, op, next) }
  }

  def atom: P[Expr] =
    P(
      functionCall.backtrack | rootPath | fieldAccess.backtrack | dollarKeyword | literal | envVar |
        (char('(') *> expression <* char(')')))

  // / Bottom vals
  private val indexTerm: P[Expr => Expr] = char('[') *> expression.map(e => model.Index(_, e)) <* char(']')

  val typeSpecifier: P[TypeSpecifier] =
    (
      ((string("FHIR") ~+ char('.')).?.with1 *> fhirType map ("FHIR" -> _)) |
        ((string("System") ~+ char('.')).?.with1 *> systemType map ("System" -> _))
    ).map((TypeSpecifier.apply _).tupled)

  private val rootPath: P[RootPath] = typeSpecifier.map(RootPath)

  val quantity: P[Quantity] =
    decimalOrInt ~+ unit map { case (value, unit) =>
      Quantity(value = Some(value), unit = Some(unit))
    }
  val singleValue: P[SingleValue] =
    (quantity.backtrack | boolean | str | decimal.backtrack | int | time | dateTime.backtrack | date)
      .map(Value.wrapSystem)
      .map(SingleValue)
  val literal: P[Literal] = ((char('{') ~+ char('}')).void.map(_ => Empty) | singleValue)

  val envVar: P[Expr] = char('%') *> (identifier | str) map EnvironmentVariable

  val fieldAccess: P[FieldAccess] = identifier.map(FieldAccess)

  val paramList: P0[Seq[Expr]] = expression.repSep0(sep = whitespaces0 *> char(',') <* whitespaces0).map(_.toList)
  val normalFunction: P[Func]  = (identifier <* char('(')) ~+ paramList <* char(')') map (Func.apply _).tupled

  val dollarKeyword: P[Invocation] = "$this".as(This) | "$index".as(IndexInvoc) | "$total".as(Total)

  val typeOp: P[TypeOperator]                      = "as".as(As) | "is".as(Is)
  val signOp: P[UnaryOperator with BinaryOperator] = "+".as(Plus) | "-".as(Minus)
  val multOp: P[BinaryOperator]                    = "*".as(Mult) | "/".as(Div) | "div".as(TruncDiv) | "mod".as(Mod)
  val eqOp: P[BinaryOperator]                      = "=".as(Eq) | "~".as(Equiv) | "!=".as(Neq) | "!~".as(Nequiv)
  val ineqOp: P[BinaryOperator]                    = "<=".as(Lte) | ">=".as(Gte) | "<".as(Lt) | ">".as(Gt)

  private val typeFunc: P[Expr => Expr] = char('.') *> (typeOp <* char('(')) ~+ typeSpecifier <* char(')') map { case (op, t) =>
    TypeOperation(_, op, t)
  }

  val ofType: P[OfType] = string("ofType") *> char('(') *> typeSpecifier <* char(')') map OfType

  val functionCall: P[Invocation] = ofType | normalFunction

  val invocation: P[Invocation] = functionCall.backtrack | fieldAccess | dollarKeyword

  private val invocTerm: P[Expr => Expr] = char('.') *> invocation map { i => InvocationExpr(_, i) }

  val termSuffix: P[Expr => Expr] = indexTerm | typeFunc.backtrack | invocTerm

  val term: P[Expr] = atom ~+ termSuffix.rep0 map { case (a, suffixes) => suffixes.foldLeft(a) { (x, y) => y(x) } }

  implicit class FHIRPathHelper(val sc: StringContext) {
    def fhir(args: Any*): Expr = parseUnsafe(sc.parts.head)
  }
}

object Parser extends Parser {
  class ParseException(msg: String) extends Exception(msg)
}
