package com.babylonhealth.lit.macros

import scala.annotation.{ StaticAnnotation, compileTimeOnly }
import scala.language.experimental.macros
import scala.reflect.macros.blackbox

@compileTimeOnly("add 'scalacOptions += \"-Ymacro-annotations\"' to your build file to enable macro annotations")
class POJOBoilerplate extends StaticAnnotation {
  def macroTransform(annottees: Any*): Any = macro boilerplateMethodsMacro.impl
}

/**  override val thisTypeName: String               = "AppointmentResponse"
  */

trait EqMethods {
  val c: blackbox.Context

  import c.universe._

  private def toPlainName(arg: Tree): String = arg.toString.replaceAll("`", "")

  def withCompanion(tpe: TypeName): Tree =
    q"""override def companion: CompanionFor[this.type] = ${tpe.toTermName}.asInstanceOf[CompanionFor[this.type]]"""
  def withClassName(tpe: TypeName): Tree = q"""override val thisClassName: String = ${tpe.toString}"""

  def withHashCode(params: Seq[ValDef], pparams: Seq[NamedArg]): Option[Tree] = {
    val newParams: Seq[TermName] = pparams
      .foldLeft(params) { case (acc, next) =>
        acc.find(_.name.decodedName.toString == toPlainName(next.lhs)) match {
          case None           => c.abort(c.enclosingPosition, "Can't find matching constructor val")
          case Some(matching) => acc.filterNot(_ eq matching)
        }
      }
      .map(_.name.toTermName)
    if (newParams.isEmpty) None
    else {
      val baseCode = if (pparams.size == 1) q"primitiveAttributes.##" else q"super.hashCode()"
      Some(q"override def hashCode(): Int = List(..$newParams).foldLeft($baseCode)((acc, next) => 31 * acc + next.##)")
    }
  }

  def withEqs(tpe: TypeName, params: Seq[ValDef], pparams: Seq[NamedArg]): Option[Tree] = {
    val pset                 = pparams.map(p => toPlainName(p.lhs)).toSet
    val noNewParams: Boolean = params.map(_.name.decodedName.toString).forall(pset)
    if (noNewParams) None
    else {
      val exprs: Seq[Expr[(Any, Any)]] =
        params.map(_.name.toTermName).map { p => c.Expr[(Any, Any)](q"(this.$p, that.$p)") }
      Some(q"""
           override def equals(obj: Any): Boolean = obj match {
             case that: $tpe if this eq that => true
             case that: $tpe => thisTypeName == that.thisTypeName && Seq(..$exprs).forall{
               case (x, y) => x == y
             }
             case _ => false
           }""")
    }
  }

}
object boilerplateMethodsMacro {
  def impl(context: blackbox.Context)(annottees: context.Expr[Any]*): context.Expr[Any] = {
    val ctx = new CoptMethods(context) with EqMethods
    import ctx._
    import context.universe._

    val inputs: List[Tree] = annottees.map(_.tree).toList
    val (annottee: Tree, expandees: List[Tree]) = inputs match {
      case (param: ClassDef) :: (rest @ (_ :: _)) => (param, rest)
      case _                                      => (EmptyTree, inputs)
    }

    val classWithCopyMethods = annottee match {
      case q"class $tpe(..$params) extends $p(..$pparams) { ..$body } " =>
        val defdefdef: List[Tree] =
          (idExtSugar(tpe.asInstanceOf[c.TypeName], p) ++
            withDefx(tpe.asInstanceOf[c.TypeName], params, pparams).flatten ++
            updateDefx(tpe.asInstanceOf[c.TypeName], params, pparams).flatten ++
            updateIfExistsDefx(tpe.asInstanceOf[c.TypeName], params, pparams).flatten ++
            withEqs(
              tpe.asInstanceOf[c.TypeName],
              params.asInstanceOf[Seq[c.universe.ValDef]],
              pparams.asInstanceOf[Seq[c.universe.NamedArg]]) ++
            withHashCode(params.asInstanceOf[Seq[c.universe.ValDef]], pparams.asInstanceOf[Seq[c.universe.NamedArg]]) :+
            withClassName(tpe.asInstanceOf[c.TypeName]) :+
            withCompanion(tpe.asInstanceOf[c.TypeName]))
            .asInstanceOf[List[Tree]]
        q"""class $tpe(..$params) extends $p(..$pparams) {
         private final def set[T](f: String, v: T): $tpe          = withFieldUnsafe[T, $tpe](f, v)
         private final def update[T](f: String, fn: T => T): $tpe = modifyFieldUnsafe[T, $tpe](f, fn)
         ..$body
         ..$defdefdef
        }"""
    }
    val outputs = classWithCopyMethods +: expandees
    context.Expr[Any](q"..$outputs")
  }
}
