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
  //   getIndexed | [ \t] ~ descendAndMaybeIndex | StringIn("or", "and") | end-of-input):1:5, found ".$%^.isInv"
  // Weird and verbose but still useful
  def parseUnsafe(str: String): Expr =
    parseToEither(str) match {
      case Right(value)  => value
      case Left(failure) => throw new ParseException(failure.expected.map(_.toString).toList.mkString("\n -[and]- "))
    }

  import Lexer.RichParser

  def top: P0[Expr] = expression

  def expression: P[Expr] = impliesExpr

  // Handles precedence by descending from lowest to highest precedence operators
  def impliesExpr: P[Expr] = orExpr ~ ("implies".as(Implies) ~ orExpr).rep map foldBinOp
  def orExpr: P[Expr]      = andExpr ~ (("or".as(Or) | "xor".as(Xor)) ~ andExpr).rep map foldBinOp
  def andExpr: P[Expr]     = inExpr ~ ("and".as(And) ~ inExpr).rep map foldBinOp
  def inExpr: P[Expr]      = eqExpr ~ (("in".as(In) | "contains".as(Contains)) ~ eqExpr).rep map foldBinOp
  def eqExpr: P[Expr]      = ineqExpr ~ (eqOp ~ ineqExpr).rep map foldBinOp
  def ineqExpr: P[Expr]    = unionExpr ~ (ineqOp ~ unionExpr).rep map foldBinOp
  def unionExpr: P[Expr]   = typeExpr ~ ("|".as(Union) ~ typeExpr).rep map foldBinOp
  def typeExpr: P[Expr]    = addExpr ~ (typeOp ~ typeSpecifier).rep map { case (e, l) => foldOp(TypeOperation)(e, l.toList) }
  def addExpr: P[Expr]     = multExpr ~ ((signOp | "&".as(StringConcat)) ~ multExpr).rep map foldBinOp
  def multExpr: P[Expr]    = unaryExpr ~ (multOp ~ unaryExpr).rep map foldBinOp
  def unaryExpr: P[Expr]   = (signOp ~ term map UnaryOperation.tupled) | term

  private val foldBinOp: ((Expr, NonEmptyList[(BinaryOperator, Expr)])) => Expr = { case (e, l) =>
    foldOp(BinaryOperation)(e, l.toList)
  }

  private def foldOp[Op, Arg](f: (Expr, Op, Arg) => Expr): ((Expr, Seq[(Op, Arg)])) => Expr = { case (head, tail) =>
    tail.foldLeft(head) { case (accum, (op, next)) => f(accum, op, next) }
  }

  def term: P[Expr] = atom ~ termSuffix.rep map { case (a, suffixes) => suffixes.foldLeft(a) { (x, y) => y(x) } }

  def termSuffix: P[Expr => Expr] = indexTerm | typeFunc | invocTerm

  private def indexTerm: P[Expr => Expr] = char('[') *> expression.map(e => model.Index(_, e)) <* char(']')
  private def typeFunc: P[Expr => Expr] = char('.') *> (typeOp <* char('(')) ~ typeSpecifier <* char(')') map { case (op, t) =>
    TypeOperation(_, op, t)
  }
  private def invocTerm: P[Expr => Expr] = char('.') *> invocation map { i => InvocationExpr(_, i) }

  def atom: P[Expr] =
    (functionCall | rootPath | fieldAccess | dollarKeyword | literal | envVar | (char('(') *> expression <* char(')')))

  private def rootPath: P[RootPath] = typeSpecifier.map(RootPath)

  def literal: P[Literal] = ((char('{') ~ char('}')).void.map(_ => Empty) | singleValue)

  private def singleValue: P[SingleValue] =
    (quantity | boolean | str | decimal | int | dateTime | date | time).map(Value.wrapSystem).map(SingleValue)

  def envVar: P[Expr] = char('%') *> (identifier | str) map EnvironmentVariable

  def invocation: P[Invocation] = P(functionCall | fieldAccess | dollarKeyword)

  def fieldAccess: P[FieldAccess] = identifier.map(FieldAccess)

  def functionCall: P[Invocation] = P(ofType | normalFunction)
  def normalFunction: P[Func]     = (identifier <* char('(')) ~ paramList <* char(')') map Func.tupled
  def ofType: P[OfType]           = string("ofType") *> char('(') *> typeSpecifier <* char(')') map OfType

  def paramList: P[Seq[Expr]] = expression.repSep(sep = char(',')).map(_.toList)

  def dollarKeyword: P[Invocation] = "$this".as(This) | "$index".as(IndexInvoc) | "$total".as(Total)

  def typeOp: P[TypeOperator]                      = "as".as(As) | "is".as(Is)
  def signOp: P[UnaryOperator with BinaryOperator] = "+".as(Plus) | "-".as(Minus)
  def multOp: P[BinaryOperator]                    = "*".as(Mult) | "/".as(Div) | "div".as(TruncDiv) | "mod".as(Mod)
  def eqOp: P[BinaryOperator]                      = "=".as(Eq) | "~".as(Equiv) | "!=".as(Neq) | "!~".as(Nequiv)
  def ineqOp: P[BinaryOperator]                    = "<=".as(Lte) | ">=".as(Gte) | "<".as(Lt) | ">".as(Gt)

  def quantity: P[Quantity] =
    P(decimalOrInt ~ unit) map { case (value, unit) =>
      Quantity(value = Some(value), unit = Some(unit))
    }

  def typeSpecifier: P[TypeSpecifier] =
    (
      ((string("FHIR") ~ char('.')).? ~~> fhirType map ("FHIR"         -> _)) |
        ((string("System") ~ char('.')).? ~~> systemType map ("System" -> _))
    ).map(TypeSpecifier.tupled)

  implicit class FHIRPathHelper(val sc: StringContext) {
    def fhir(args: Any*): Expr = parseUnsafe(sc.parts.head)
  }
}

object Parser extends Parser {
  class ParseException(msg: String) extends Exception(msg)
}
