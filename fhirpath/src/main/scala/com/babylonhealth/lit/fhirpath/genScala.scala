package com.babylonhealth.lit.fhirpath

import scala.util.Try

import izumi.reflect.macrortti.{ LTag, LightTypeTag }

import com.babylonhealth.lit.common.CodegenUtils
import com.babylonhealth.lit.core.TagSummoners.{ lTagOf, lTypeOf }
import com.babylonhealth.lit.core.{ Choice, CompanionFor, EnumBase, FHIRComponentFieldMeta, FHIRObject, LitSeq, Utils }
import com.babylonhealth.lit.core.model.{ Reference, resourceTypeLookup }
import com.babylonhealth.lit.fhirpath.model._

object genScala {

  def gen(expr: Expr, params: GenScalaParams): GenScalaParams =
    expr match {
      case InvocationExpr(expr, invocation)       => gen(invocation, gen(expr, params))
      case Index(expr, _)                         => gen(expr, params) // TODO: don't ignore
      case TypeOperation(expr, As, typeSpecifier) => genAsType(typeSpecifier, gen(expr, params))
      case op: BinaryOperation                    => genBinaryOp(op, params)
      case _: RootPath                            => params
      case Empty                                  => params.copy(rootStr = "List.empty")
      case SingleValue(value) =>
        params.copy(rootStr = value fold {
          case s: String                 => s""""$s""""
          case x @ (_: Int | _: Boolean) => x.toString
          case x =>
            println(s"Alas, I don't know what to do with $x: ${x.getClass} as a value")
            "???"
        })
      case FieldAccess(fieldName)                  => genFieldAccess(fieldName, params)
      case Func("where", Seq(op: BinaryOperation)) => genFilterOperation(op, params)
      case Func("where", Seq(TypeOperation(Func("resolve", Seq()), Is, typeSpecifier))) =>
        genTypeFilterOperation(typeSpecifier, params)
      case Func(name, args) =>
        genFunc(name, args.map(gen(_, params.copy(rootStr = "_", baseCardinality = ExactlyOne)).rootStr), params)
      case OfType(typeSpec) => genAsType(typeSpec, params)
      case x                => throw new Exception(s"${x.getClass.getSimpleName} unsupported: $x")
    }

  def genAsType(typeSpecifier: TypeSpecifier, baseParams: GenScalaParams): GenScalaParams = {
    val baseStr  = baseParams.rootStr
    val tt       = typeSpecifier.asTypeTag.get
    def typeName = tt.tag.shortName
    val (nextStr, card) = baseParams.base match {
      case Right(meta) if meta.isRef =>
        if (baseParams.baseCardinality == ExactlyOne) (s"$baseStr.as[$typeName]", Optional)
        else if (baseParams.baseCardinality == Optional) (s"$baseStr.flatMap(_.as[$typeName])", Optional)
        else (s"$baseStr.flatMap(_.as[$typeName])", Many)
    }
    val companionMebbe: Option[CompanionFor[_ <: FHIRObject]] = resourceTypeLookup.get(typeName)
    val nextBase                                              = companionMebbe.fold(baseParams.base)(Left(_))
    GenScalaParams(nextBase, card, nextStr)
  }

  val choiceTypeNoArgs: LightTypeTag = lTypeOf[Choice[_]].withoutArgs
  def genFilterOperation(operation: BinaryOperation, baseParams: GenScalaParams): GenScalaParams = {
    val baseStr = baseParams.rootStr
    val returnProps =
      gen(operation.left, baseParams.copy(baseCardinality = ExactlyOne, rootStr = "_"))
    val propExpr = returnProps.rootStr
    // munged because the fhirpath comparison literals will be strings
    def mungedPropExpr =
      returnProps.base match {
        case Right(c) if c.unwrappedTT.tag <:< lTypeOf[EnumBase] =>
          if (returnProps.baseCardinality == ExactlyOne) s"$propExpr.name"
          else s"$propExpr.map(_.name)"
        case _ => propExpr
      }

    val filterValueString = gen(operation.right, baseParams.copy(baseCardinality = ExactlyOne, rootStr = "_")).rootStr
    // TODO: Handle remaining conditions (<, >, contains, etc), validate eq
    val (str, result) =
      if (operation.op == Eq || operation.op == Contains)
        (baseParams.base, baseParams.baseCardinality, returnProps.baseCardinality) match {
          case (Right(meta), ExactlyOne, ExactlyOne) if meta.unwrappedTT.tag.withoutArgs =:= choiceTypeNoArgs =>
            s"""$baseStr.seqIf($mungedPropExpr.value == $filterValueString)""" -> baseParams.copy(baseCardinality = Many)
          case (_, ExactlyOne, ExactlyOne) =>
            s"""$baseStr.seqIf($mungedPropExpr == $filterValueString)""" -> baseParams.copy(baseCardinality = Many)
          case (Right(meta), ExactlyOne, _) if meta.unwrappedTT.tag.withoutArgs =:= choiceTypeNoArgs =>
            s"""$baseStr.seqIf($mungedPropExpr.map(_.value) contains $filterValueString)""" -> baseParams
              .copy(baseCardinality = Many)
          case (_, ExactlyOne, _) =>
            s"""$baseStr.seqIf($mungedPropExpr contains $filterValueString)""" -> baseParams.copy(baseCardinality = Many)
          case (Right(meta), _, ExactlyOne) if meta.unwrappedTT.tag.withoutArgs =:= choiceTypeNoArgs =>
            s"$baseStr.filter($mungedPropExpr.value == $filterValueString)" -> baseParams
          case (_, _, ExactlyOne) => s"$baseStr.filter($mungedPropExpr == $filterValueString)" -> baseParams
          case (Right(meta), _, _) if meta.unwrappedTT.tag.withoutArgs =:= choiceTypeNoArgs =>
            s"""$baseStr.filter($mungedPropExpr.map(_.value) contains $filterValueString)""" -> baseParams
          case _ => s"""$baseStr.filter($mungedPropExpr contains $filterValueString)""" -> baseParams
        }
      else if (operation.op == Neq)
        (baseParams.base, baseParams.baseCardinality, returnProps.baseCardinality) match {
          case (Right(meta), ExactlyOne, ExactlyOne) if meta.unwrappedTT.tag.withoutArgs =:= choiceTypeNoArgs =>
            s"""$baseStr.seqIf($mungedPropExpr.value != $filterValueString)""" -> baseParams.copy(baseCardinality = Many)
          case (_, ExactlyOne, ExactlyOne) =>
            s"""$baseStr.seqIf($mungedPropExpr != $filterValueString)""" -> baseParams.copy(baseCardinality = Many)
          case (Right(meta), ExactlyOne, _) if meta.unwrappedTT.tag.withoutArgs =:= choiceTypeNoArgs =>
            s"""$baseStr.seqIf(!$mungedPropExpr.exists(_.value == $filterValueString))""" -> baseParams
              .copy(baseCardinality = Many)
          case (_, ExactlyOne, _) =>
            s"""$baseStr.seqIf(!$mungedPropExpr.contains($filterValueString))""" -> baseParams.copy(baseCardinality = Many)
          case (Right(meta), _, ExactlyOne) if meta.unwrappedTT.tag.withoutArgs =:= choiceTypeNoArgs =>
            s"$baseStr.filter($mungedPropExpr.value != $filterValueString)" -> baseParams
          case (_, _, ExactlyOne) => s"$baseStr.filter($mungedPropExpr != $filterValueString)" -> baseParams
          case (Right(meta), _, _) if meta.unwrappedTT.tag.withoutArgs =:= choiceTypeNoArgs =>
            s"$baseStr.filter(!$mungedPropExpr.exists(_.value == $filterValueString))" -> baseParams
          case _ => s"""$baseStr.filter(!$mungedPropExpr.contains($filterValueString))""" -> baseParams
        }
      else {
        println(s"Unable to handle genScala on PropertyFilter op $operation")
        throw new RuntimeException("Nope")
      }

    result.copy(rootStr = str)
  }

  def genTypeFilterOperation(typeSpec: TypeSpecifier, baseParams: GenScalaParams): GenScalaParams = {
    val (root, nextParams) = (baseParams.rootStr, baseParams)
    val tt                 = typeSpec.asTypeTag.get
    def typeName           = tt.tag.shortName
    val str =
      if (nextParams.base.left.exists(_ == Reference))
        if (nextParams.baseCardinality == ExactlyOne)
          s"""$root.seqIf(_.reference.exists(_.contains("$typeName/")))"""
        else
          s"""$root.filter(_.reference.exists(_.contains("$typeName/")))"""
      else if (nextParams.base.exists(_.unwrappedTT.tag =:= lTypeOf[String]))
        if (nextParams.baseCardinality == ExactlyOne)
          s"""$root.seqIf(_.contains("$typeName/"))"""
        else
          s"""$root.filter(_.contains("$typeName/"))"""
      else
        throw new RuntimeException(s"${nextParams.base.map(_.tt).left.map(_.thisName)} is neither a String nor a Reference")
    nextParams.copy(rootStr = str, baseCardinality = Many)
  }

  def genFieldAccess(fieldName: String, baseParams: GenScalaParams): GenScalaParams = {
    val baseStr        = baseParams.rootStr
    val childScalaName = CodegenUtils.fieldScalaName(fieldName)
    val childCard      = baseParams.deriveCardinality(fieldName)
    val nextStr: String = (baseParams.baseCardinality, childCard) match {
      case (ExactlyOne, _)  => s"$baseStr.$childScalaName"
      case (_, ExactlyOne)  => s"$baseStr.map(_.$childScalaName)"
      case (Optional, Many) => s"$baseStr.toSeq.flatMap(_.$childScalaName)"
      case _                => s"$baseStr.flatMap(_.$childScalaName)"
    }
    Try {
      val nextCard: FieldCardinality = baseParams.baseCardinality max childCard
      GenScalaParams(baseParams.companions(fieldName), nextCard, nextStr)
    }.fold(
      e => {
        println(s"FAILED:: $fieldName # $childCard\n\n$baseStr\n\t$baseParams")
        throw new RuntimeException(e)
      },
      x => x)
  }

  def genFunc(name: String, args: Seq[String], initialParams: GenScalaParams): GenScalaParams = {
    val baseParams = initialParams
    val baseStr    = initialParams.rootStr
    val (str, params) = (name, baseParams.baseCardinality) match {
      case ("exists", ExactlyOne)     => "true"                           -> valueParams[Boolean]
      case ("exists", _)              => s"$baseStr.nonEmpty"             -> valueParams[Boolean]
      case ("distinct", ExactlyOne)   => baseStr                          -> baseParams
      case ("distinct", _)            => s"$baseStr.distinct"             -> baseParams
      case ("isDistinct", ExactlyOne) => "true"                           -> valueParams[Boolean]
      case ("where", Many | Optional) => s"$baseStr.filter(${args.head})" -> baseParams
      case ("extension", ExactlyOne) =>
        s"$baseStr.extension.filter(_.url == ${args.head})" -> baseParams.copy(baseCardinality = Many)
      case ("hasExtension", ExactlyOne) =>
        s"""$baseStr.extension.exists(_.url == ${args.head})""" -> valueParams[Boolean]
      case ("hasExtension", _) =>
        s"""$baseStr.exists(_.extension.exists(_.url == ${args.head}))""" -> valueParams[Boolean]
    }
    params.copy(rootStr = str)
  }

  def genBinaryOp(operation: BinaryOperation, initialParams: GenScalaParams): GenScalaParams = {
    val baseParams = gen(operation.left, initialParams)
    val baseStr    = baseParams.rootStr
    val thatParams = gen(operation.right, initialParams)
    val thatStr    = thatParams.rootStr
    def seqFromBase: (String, GenScalaParams) => String =
      (s, ps) =>
        ps.baseCardinality match {
          case ExactlyOne => s"Seq($s)"
          case Optional   => s"$s.toSeq"
          case Many       => s
        }
    def boolFromBase: (String, GenScalaParams) => String =
      (s, ps) =>
        ps.baseCardinality match {
          case ExactlyOne => s
          case Optional   => s"$s.contains(true)"
          case Many       => s"$s.forall(_ == true)"
        }
    val nextStr = (baseParams.baseCardinality, operation.op, thatParams.baseCardinality) match {
      case (_, Union, _)                      => s"${seqFromBase(baseStr, baseParams)} ++ ${seqFromBase(thatStr, thatParams)}"
      case (Optional | Many, Eq, ExactlyOne)  => s"$baseStr.contains($thatStr)"  // TODO: probably wrong for Many
      case (_, Eq, _)                         => s"$baseStr == $thatStr"
      case (Optional | Many, Neq, ExactlyOne) => s"!$baseStr.contains($thatStr)" // TODO: probably wrong for Many
      case (_, Neq, _)                        => s"$baseStr != $thatStr"
      case (_, And, _)                        => s"${boolFromBase(baseStr, baseParams)} && ${boolFromBase(thatStr, thatParams)}"
      case (_, Or, _)                         => s"${boolFromBase(baseStr, baseParams)} || ${boolFromBase(thatStr, thatParams)}"
      case (_, Implies, _)                    => s"!${boolFromBase(baseStr, baseParams)} || ${boolFromBase(thatStr, thatParams)}"
    }
    val nextCard = operation.op match {
      case Union => Many
      case _     => ExactlyOne
    }
    initialParams.copy(baseCardinality = nextCard, rootStr = nextStr)
  }

  // All scalagen methods will need to know the type of the base field... We can't uniquely determine the type of a field
  // by name, so we'd need to consider multiple possible compilation paths to handle it, and would be unable to build the
  // code up in a strictly templated manner. If this becomes a blocker, we can consider addressing it then.
  case class GenScalaParams(
      base: Either[CompanionFor[_ <: FHIRObject], FHIRComponentFieldMeta[_]],
      baseCardinality: FieldCardinality,
      rootStr: String = "_")
      extends Utils {

    private def companionFromTagAlone[T <: FHIRObject](implicit tag: LTag[T]): CompanionFor[T] =
      Try[CompanionFor[T]](
        Class.forName(companionClassName[T](tag) + "$").getField("MODULE$").get(null).asInstanceOf[CompanionFor[T]]
      ).fold(e => throw new RuntimeException(s"Could not get companion object for type ${tag.tag.longName}", e), identity)
    private def baseAsCompanion: CompanionFor[_ <: FHIRObject] =
      base match {
        case Left(c) => c
        case Right(meta) if meta.unwrappedTT.tag <:< lTypeOf[FHIRObject] =>
          companionFromTagAlone(meta.unwrappedTT.asInstanceOf[LTag[FHIRObject]])
      }
    def fields: String => FHIRComponentFieldMeta[_] = name => baseAsCompanion.fieldsMeta.find(_.name == name).get
    val companions: String => Either[CompanionFor[_], FHIRComponentFieldMeta[_]] = name =>
      fields(name) match {
        case meta if meta.isRef || !(meta.unwrappedTT.tag <:< lTypeOf[FHIRObject]) => Right(meta)
        case meta => Left(companionFromTagAlone(meta.unwrappedTT.asInstanceOf[LTag[FHIRObject]]))
      }
    def deriveCardinality(name: String): FieldCardinality =
      Try(fields(name)).fold(
        e => {
          println(
            s"name being called on non-fhir thing .. wut?  ${base.map(_.tt.tag).fold(_.toString, _.toString)}.$name #$baseCardinality $e")
          baseCardinality
        },
        {
          case field if field.tt.tag.withoutArgs <:< lTypeOf[LitSeq[_]].withoutArgs => Many
          case field if field.tt.tag.withoutArgs =:= lTypeOf[Option[_]].withoutArgs => Optional
          case _                                                                    => ExactlyOne
        }
      )
  }

  sealed trait FieldCardinality {
    def max(that: FieldCardinality): FieldCardinality =
      (this, that) match {
        case (Many, _) | (_, Many)         => Many
        case (Optional, _) | (_, Optional) => Optional
        case (ExactlyOne, ExactlyOne)      => ExactlyOne
      }
  }

  case object ExactlyOne extends FieldCardinality
  case object Optional   extends FieldCardinality
  case object Many       extends FieldCardinality

  private def valueParams[T: LTag] =
    GenScalaParams(Right(FHIRComponentFieldMeta("-", lTagOf[T], isRef = false, lTagOf[T])), ExactlyOne)

}
