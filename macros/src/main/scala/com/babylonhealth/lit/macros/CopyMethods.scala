package com.babylonhealth.lit.macros

import scala.annotation.{ StaticAnnotation, compileTimeOnly }
import scala.language.experimental.macros
import scala.reflect.api.Trees
import scala.reflect.macros.blackbox

@compileTimeOnly("add 'scalacOptions += \"-Ymacro-annotations\"' to your build file to enable macro annotations")
class CopyMethods extends StaticAnnotation {
  def macroTransform(annottees: Any*): Any = macro copyMethodsMacro.impl
}

class CoptMethods(val c: blackbox.Context) {
  import c.universe._

  private def toPlainName(arg: Tree): String = arg.toString.replaceAll("`", "")

  def isOverride(pparams: Seq[Trees#Tree], x: ValDef, ifExistsDef: Boolean = false): Boolean =
    x.mods.hasFlag(Flag.OVERRIDE) || pparams.exists {
      // TODO: These string comparisons feel pretty hacky. What's the 'right' way?
      //  Ideally, we'd just compare the types...
      case other: NamedArg if !ifExistsDef =>
        toPlainName(other.lhs) == x.name.decodedName.toString && toPlainName(other.lhs) == toPlainName(other.rhs)
      case other: NamedArg if ifExistsDef =>
        toPlainName(other.lhs) == x.name.decodedName.toString && !Set("choice", "toSuperRef").exists(
          toPlainName(other.rhs).contains)
      case _ => false
    }

  def withDefx(tpe: TypeName, params: Seq[Trees#Tree], pparams: Seq[Trees#Tree]): List[Seq[Tree]] =
    params.map {
      case x: ValDef if x.name.encodedName.toString == "primitiveAttributes" => Nil
      case x: ValDef =>
        val defSymbol = TermName(s"with${x.name.encodedName.toString.capitalize}")
        val newDef =
          if (isOverride(pparams, x))
            q"override def $defSymbol(x: ${x.tpt}): $tpe = _set[${x.tpt}](${x.name.encodedName.toString}, x)"
          else q"def $defSymbol(x: ${x.tpt}): $tpe = _set[${x.tpt}](${x.name.encodedName.toString}, x)"
        Seq(newDef)
      case x =>
        println("Unexpected application of CopyMethods:\n", x.getClass, "\n:::\n", x.children, x, "<<<<<<<<<")
        Nil
    }.toList

  def updateDefx(tpe: TypeName, params: Seq[Trees#Tree], pparams: Seq[Trees#Tree]): List[Seq[Tree]] =
    params.map {
      case x: ValDef if x.name.encodedName.toString == "primitiveAttributes" => Nil
      case x: ValDef =>
        val defSymbol = TermName(s"update${x.name.encodedName.toString.capitalize}")
        val newDef =
          if (isOverride(pparams, x))
            q"override def $defSymbol(fn: ${x.tpt} => ${x.tpt}): $tpe = _update[${x.tpt}](${x.name.encodedName.toString}, fn)"
          else
            q"def $defSymbol(fn: ${x.tpt} => ${x.tpt}): $tpe = _update[${x.tpt}](${x.name.encodedName.toString}, fn)"
        Seq(newDef)
      case x =>
        println("Unexpected application of CopyMethods:\n", x.getClass, "\n:::\n", x.children, x, "<<<<<<<<<")
        Nil
    }.toList

  def updateIfExistsDefx(tpe: TypeName, params: Seq[Trees#Tree], pparams: Seq[Trees#Tree]): List[Seq[Tree]] =
    params.map {
      case x: ValDef if x.name.encodedName.toString == "primitiveAttributes" => Nil
      case x: ValDef if x.tpt.toString.matches("(Option|LitSeq|NonEmptyLitSeq)\\[.+") =>
        val innerTpe  = x.tpt.children(1)
        val defSymbol = TermName(s"update${x.name.encodedName.toString.capitalize}IfExists")
        val newDef =
          if (isOverride(pparams, x, ifExistsDef = true))
            q"override def $defSymbol(fn: ${innerTpe} => ${innerTpe}): $tpe = _update[${x.tpt}](${x.name.encodedName.toString}, _.map(fn))"
          else
            q"def $defSymbol(fn: ${innerTpe} => ${innerTpe}): $tpe = _update[${x.tpt}](${x.name.encodedName.toString}, _.map(fn))"
        Seq(newDef)
      case _ => Nil
    }.toList

}

object copyMethodsMacro {
  def impl(context: blackbox.Context)(annottees: context.Expr[Any]*): context.Expr[Any] = {
    val ctx = new CoptMethods(context)
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
          (withDefx(tpe.asInstanceOf[c.TypeName], params, pparams).flatten ++
            updateDefx(tpe.asInstanceOf[c.TypeName], params, pparams).flatten ++
            updateIfExistsDefx(tpe.asInstanceOf[c.TypeName], params, pparams).flatten).asInstanceOf[List[Tree]];
        q"""class $tpe(..$params) extends $p(..$pparams) {
         private final def _set[T](f: String, v: T): $tpe          = withFieldUnsafe[T, $tpe](f, v)
         private final def _update[T](f: String, fn: T => T): $tpe = modifyFieldUnsafe[T, $tpe](f, fn)
         ..$body
         ..$defdefdef
        }"""
    }
    val outputs = classWithCopyMethods +: expandees
    context.Expr[Any](q"..$outputs")
  }
}
