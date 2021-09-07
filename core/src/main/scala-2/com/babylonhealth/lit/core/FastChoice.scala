package com.babylonhealth.lit.core

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context
import scala.reflect.runtime.{ universe => ru }

import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.common.SuffixUtils

class FastChoiceMacro(val c: Context) {
  import c.universe._

  def choiceMacro[U <: _ \/ _, S](t: c.Expr[S])(ut: c.Expr[LTag[U]])(implicit
      UV: c.WeakTypeTag[U],
      TV: c.WeakTypeTag[S]
  ): c.Expr[Choice[U]] = {
//    val ltagName    = "_root_." + UV.tpe.toString + "Tag"
//    val ut: Ident = Ident(TermName(ltagName))

    def expandedList(iut: c.Type): List[c.Type] =
      if (iut.erasure <:< c.typeOf[\/[Any, Any]].erasure) {
        expandedList(iut.dealias.typeArgs(0)) ++ expandedList(iut.dealias.typeArgs(1))
      } else List(iut)

    def recursiveDestructureMatch(iut: c.Type): Boolean = expandedList(iut).exists(_ =:= TV.tpe)
    val typechecks                                      = recursiveDestructureMatch(UV.tpe)

    if (!typechecks)
      c.abort(c.enclosingPosition, s"the type ${TV.tpe} does not appear to be a valid member of the union ${UV.tpe}")
    val suffixLiteral = SuffixUtils.typeLookdown(TV.tpe.toString.split('.').last)

    c.Expr(q"""new com.babylonhealth.lit.core.Choice($suffixLiteral, $t)($ut)""")
  }

  def choiceLTagMacro[U <: _ \/ _, S](
      t: c.Expr[S])(ult: c.Expr[LTag[U]], slt: c.Expr[LTag[S]], uw: c.Expr[UnionWitness[U, S]])(
      implicit
      UV: c.WeakTypeTag[U],
      TV: c.WeakTypeTag[S]
  ): c.Expr[Choice[U]] = {
    val suffixLiteral = SuffixUtils.typeLookdown(TV.tpe.toString.split('.').last)

    c.Expr(q"""new com.babylonhealth.lit.core.Choice($suffixLiteral, $t)($ult)""")
  }

  def choiceTypeTagMacro[U <: _ \/ _, S](
      t: c.Expr[S])(uw: c.Expr[UnionWitness[U, S]], ult: c.Expr[LTag[U]], ut: c.Expr[ru.TypeTag[U]], lt: c.Expr[ru.TypeTag[S]])(
      implicit
      UV: c.WeakTypeTag[U],
      TV: c.WeakTypeTag[S]
  ): c.Expr[Choice[U]] = {

    val suffixLiteral = SuffixUtils.typeLookdown(TV.tpe.toString.split('.').last)

    c.Expr(q"""new com.babylonhealth.lit.core.Choice($suffixLiteral, $t)($ult)""")
  }
}
