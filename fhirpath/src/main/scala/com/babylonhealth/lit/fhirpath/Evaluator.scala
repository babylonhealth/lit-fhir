package com.babylonhealth.lit.fhirpath

import cats.syntax.applicative._
import cats.syntax.flatMap._
import cats.syntax.functor._
import cats.syntax.option._
import cats.Traverse.ops.toAllTraverseOps
import cats.implicits.catsSyntaxApplicativeErrorId
import cats.instances.list._
import com.babylonhealth.lit.core.{ Choice, FHIRObject }
import com.babylonhealth.lit.fhirpath.conversions._
import com.babylonhealth.lit.fhirpath.model._

class Evaluator[F[+_]: MErr](implicit functions: FhirPathFuncs[F]) {

  import functions.{ lift1, lift2, unsupported }

  def evalExpr(expr: Expr)(input: List[Value]): F[List[Value]] =
    expr match {
      case InvocationExpr(expr, invocation)       => expr(input) >>= (invocation(_))
      case Index(expr, index)                     => lift2(functions.index)(input)(expr, index)
      case TypeOperation(expr, Is, typeSpecifier) => expr(input) >>= lift1[Value, Boolean](functions.is(typeSpecifier))
      case TypeOperation(expr, As, typeSpecifier) => expr(input) >>= lift1[Value, Option[Value]](functions.as(typeSpecifier))
      case BinaryOperation(left, op, right)       => applyBinaryOperator(op)(input)(left, right)
      case UnaryOperation(op, expr)               => expr(input) >>= applyUnaryOperator(op)
      case r: RootPath                            => evalRootPath(r, input)
      case v: EnvironmentVariable                 => lookupVariable(v) >>= Value.wrapCollection[String, F]
      case Empty                                  => List.empty.pure[F]
      case SingleValue(value)                     => Value.wrapCollection(value)
      case FieldAccess(name)                      => accessField(input, name).pure[F]
      case OfType(typeSpecifier)                  => lift1(functions.ofType(typeSpecifier))(input)
      case func: Func                             => evalFunc(func, input)
      case This                                   => input.pure[F]
      case IndexInvoc                             => unsupported
      case Total                                  => unsupported
    }

  private def applyBinaryOperator(op: BinaryOperator): List[Value] => (Expr, Expr) => F[List[Value]] =
    op match {
      case Union        => lift2[List[Value], List[Value], List[Value]](functions.union)
      case Lte          => lift2[Value, Value, F[Boolean]](functions.lte)
      case Lt           => lift2[Value, Value, F[Boolean]](functions.lt)
      case Gt           => lift2[Value, Value, F[Boolean]](functions.gt)
      case Gte          => lift2[Value, Value, F[Boolean]](functions.gte)
      case Eq           => lift2[List[Value], List[Value], Option[Boolean]](functions.eq)
      case Equiv        => lift2[List[Value], List[Value], F[List[Value]]](functions.equiv)
      case Neq          => lift2[List[Value], List[Value], Option[Boolean]](functions.neq)
      case Nequiv       => lift2[List[Value], List[Value], F[List[Value]]](functions.nequiv)
      case In           => lift2[Value, List[Value], Boolean](functions.in)
      case Contains     => lift2[List[Value], Value, Boolean](functions.contains)
      case And          => lift2[Option[Boolean], Option[Boolean], Option[Boolean]](functions.and)
      case Or           => lift2[Option[Boolean], Option[Boolean], Option[Boolean]](functions.or)
      case Xor          => lift2[Boolean, Boolean, Boolean](functions.xor)
      case Implies      => lift2[Option[Boolean], Option[Boolean], Option[Boolean]](functions.implies)
      case StringConcat => lift2[Option[String], Option[String], String](functions.stringConcat)
      case Plus         => lift2[Value, Value, Value](functions.add)
      case Minus        => lift2[Value, Value, Value](functions.sub)
      case Mult         => lift2[Value, Value, Value](functions.mult)
      case Div          => lift2[Value, Value, Option[Value]](functions.div)
      case TruncDiv     => lift2[Value, Value, Option[Value]](functions.truncDiv)
      case Mod          => lift2[Value, Value, Option[Value]](functions.mod)
    }

  private def applyUnaryOperator(op: UnaryOperator): List[Value] => F[List[Value]] =
    op match {
      case Plus  => lift1[Value, Value](functions.pos)
      case Minus => lift1[Value, Value](functions.neg)
    }

  private def evalFunc(func: Func, input: List[Value]): F[List[Value]] =
    for {
      f      <- functions.lookupFunction(func.name, func.params.length)
      result <- f(input)(func.params)
    } yield result

  // The "root' is the first label in the path, e.g. `Patient` in `Patient.name`.
  // We should treat it as a type first. If the type is wrong then we treat it as a field. If there's no field we error.
  // Spec: http://hl7.org/fhirpath/#path-selection
  // Explanation of spec: https://chat.fhir.org/#narrow/stream/179266-fhirpath/topic/Behaviour.20of.20the.20root
  private def evalRootPath(rootPath: RootPath, input: List[Value]): F[List[Value]] = {
    val typeSpec = rootPath.typeSpecifier
    input flatTraverse { value =>
      // First, we try to treat the root as a type
      if (functions.is(typeSpec)(value)) {
        List(value).pure[F]
      } else {
        // Then we try to treat it like a field
        val fieldName = rootPath.typeSpecifier.name
        val fields    = value collect { case obj: FHIRObject => obj } flatMap { _.tryChildren(_.name == fieldName) }

        fields.liftTo[F] {
          // If there's also no field with that name, then we error
          new Exception(f"This FHIR path expects the initial object to be a $typeSpec, but it's a ${value.typeName}")
        }
      }
    }
  }

  private def accessField(input: List[Value], name: String): List[Value] =
    for {
      value <- input
      field <- value fold {
        case obj: FHIRObject =>
          obj.children { field =>
            field.name == name || field.suffixedName.contains(name)
          }
        case _ => Nil
      }
    } yield field

  private def lookupVariable(variable: EnvironmentVariable): F[String] = {
    variable.name match {
      case s"vs-$valueSet"   => s"http://hl7.org/fhir/ValueSet/$valueSet".pure[F]
      case s"ext-$extension" => s"http://hl7.org/fhir/StructureDefinition/$extension".pure[F]
      case "ucum"            => "http://unitsofmeasure.org".pure[F]
      case "sct"             => "http://snomed.info/sct".pure[F]
      case "loinc"           => "http://loinc.org".pure[F]
      case _                 => new Exception(s"Unrecognised variable $variable").raiseError
    }
  }
}
