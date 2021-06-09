package com.babylonhealth.lit.fhirpath

import cats.syntax.functor._
import scala.util.Try

import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.core.FHIRObject
import com.babylonhealth.lit.core.model.{ resourceTypeLookup, suffixDecoderTypeTagMap }

object model {

  sealed trait Expr {
    def apply[F[+_]: MErr: FhirPathFuncs](fhirObj: FHIRObject): F[List[Any]] =
      apply(List(Value.wrapFhirObject(fhirObj))).map(_.map(_.inner))

    def apply[F[+_]: MErr: FhirPathFuncs](collection: List[Value]): F[List[Value]] =
      new Evaluator().evalExpr(this)(collection)

    def apply(fieldName: String): InvocationExpr       = invoke(FieldAccess(fieldName))
    def invoke(invocation: Invocation): InvocationExpr = InvocationExpr(this, invocation)

    override def toString: String = this match {
      case InvocationExpr(expr, invocation)       => f"$expr.$invocation"
      case Index(expr, index)                     => f"$expr[$index]"
      case TypeOperation(expr, op, typeSpecifier) => f"($expr $op $typeSpecifier)"
      case BinaryOperation(left, op, right)       => f"($left $op $right)"
      case UnaryOperation(op, expr)               => f"($op$expr)"
      case RootPath(typeSpecifier)                => typeSpecifier.toString
      case EnvironmentVariable(name)              => f"%%$name"
      case Empty                                  => "{}"
      case SingleValue(value)                     => value.toString // TODO: escape and quote string values
      case FieldAccess(fieldName)                 => fieldName
      case Func(name, params)                     => f"$name(${params.mkString(", ")})"
      case OfType(typeSpecifier)                  => f"ofType($typeSpecifier)"
      case This                                   => "$this"
      case IndexInvoc                             => "$index"
      case Total                                  => "$total"
    }
  }

  case class InvocationExpr(expr: Expr, invocation: Invocation)                        extends Expr
  case class Index(expr: Expr, index: Expr)                                            extends Expr
  case class TypeOperation(expr: Expr, op: TypeOperator, typeSpecifier: TypeSpecifier) extends Expr
  case class BinaryOperation(left: Expr, op: BinaryOperator, right: Expr)              extends Expr
  case class UnaryOperation(op: UnaryOperator, expr: Expr)                             extends Expr
  case class RootPath(typeSpecifier: TypeSpecifier)                                    extends Expr

  // no, not THAT kind of environment variable... it's the term the fhirpath spec uses
  case class EnvironmentVariable(name: String) extends Expr

  sealed abstract class TypeOperator(override val toString: String)
  case object Is extends TypeOperator("is")
  case object As extends TypeOperator("as")

  sealed trait UnaryOperator
  sealed abstract class BinaryOperator(override val toString: String)

  case object Union        extends BinaryOperator("|")
  case object Lte          extends BinaryOperator("<=")
  case object Lt           extends BinaryOperator("<")
  case object Gt           extends BinaryOperator(">")
  case object Gte          extends BinaryOperator(">=")
  case object Eq           extends BinaryOperator("=")
  case object Equiv        extends BinaryOperator("~")
  case object Neq          extends BinaryOperator("!=")
  case object Nequiv       extends BinaryOperator("!~")
  case object In           extends BinaryOperator("in")
  case object Contains     extends BinaryOperator("contains")
  case object And          extends BinaryOperator("and")
  case object Or           extends BinaryOperator("or")
  case object Xor          extends BinaryOperator("xor")
  case object Implies      extends BinaryOperator("implies")
  case object StringConcat extends BinaryOperator("&")
  case object Plus         extends BinaryOperator("+") with UnaryOperator
  case object Minus        extends BinaryOperator("-") with UnaryOperator
  case object Mult         extends BinaryOperator("*")
  case object Div          extends BinaryOperator("/")
  case object TruncDiv     extends BinaryOperator("div")
  case object Mod          extends BinaryOperator("mod")

  sealed trait Literal                 extends Expr
  case object Empty                    extends Literal
  case class SingleValue(value: Value) extends Literal

  sealed trait Invocation                                      extends Expr
  case class FieldAccess(fieldName: String)                    extends Invocation
  case class Func(name: String, params: Seq[Expr] = Seq.empty) extends Invocation
  case class OfType(typeSpecifier: TypeSpecifier)              extends Invocation
  case object This                                             extends Invocation
  case object IndexInvoc                                       extends Invocation
  case object Total                                            extends Invocation

  case class TypeSpecifier(model: String, name: String) {
    def asTypeTag: Try[LTag[_]] =
      Try(typeMap.getOrElse(name.capitalize, throw new Exception(f"Unrecognised type $this")))

    override def toString: String = f"$model.$name"
  }

  private val fhirObjTypeMap: Map[String, LTag[_]] = resourceTypeLookup.map { case (k, v) => k -> v.thisTypeTag }
  private val typeMap: Map[String, LTag[_]] = fhirObjTypeMap ++ suffixDecoderTypeTagMap.map { case (k, v) =>
    k -> v.typeTag
  }
}
