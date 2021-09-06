package com.babylonhealth.lit

import scala.collection.concurrent.TrieMap

import com.babylonhealth.lit.core.LitSeq
import com.babylonhealth.lit.hl7.BINDING_STRENGTH
import com.babylonhealth.lit.hl7.model.ElementDefinition

object ElementTreee extends Commonish with Logging {
  private val unionDeclarations = TrieMap.empty[Seq[String], String]
  def hashForUnion(s: Seq[String], declaringClass: String, fieldName: String): String =
    if (s.size == 50) "All"
    else if (s.size <= 3) s.map(typeLookdown).mkString("Or")
    // If no other good name, use the first declaration site
    // TODO: disabled because of type clashes, but some types would be clearer with this
//    else unionDeclarations.getOrElseUpdate(s, declaringClass.capitalize + "_" + fieldName.capitalize.replace("[x]", ""))
    // If no good name, generate a stable hash, then left-pad with zeros just for neatness' sake
    else "%011d".format(s.to(LitSeq).hashCode).replace('-', '_')

  private val unionTypes                                     = TrieMap[String, (Seq[String], Seq[String])]()
  def getUnionTypes: Map[String, (Seq[String], Seq[String])] = unionTypes.toMap

  def lookupSuffixByType(t: String): String                                = inverseTypeLookup(t).capitalize
  def getUnionAlias(pkg: String, s: Seq[String], field: BaseField): String = getUnionAlias(pkg, s, field.className, field.name)
  def getUnionAlias(pkg: String, s: Seq[String], declaringClass: String, fieldName: String): String = {
    if (s.size == 1) {
      s.head
    } else {
      val hashName = s"Union${hashForUnion(s, declaringClass, fieldName)}"
      unionTypes
        .updateWith(hashName) {
          case None              => Some(Seq(pkg), s)
          case Some((pkgs, `s`)) => Some(pkgs :+ pkg distinct, s)
          case Some((pkgs, clash)) =>
            throw new Exception(s"Clashing hashed name $pkg.$hashName for unions $s and $clash (from pkgs ${pkgs})")
        }
        .map(_ => hashName)
        .get
    }
  }

  implicit class ElementTree(tree: DAG[ElementWithSlices]) {
    def el: ElementDefinition                            = tree.parent.el
    private def children: Vector[DAG[ElementWithSlices]] = tree.children

    val sliceHeads               = tree.parent.slices.map(_.parent.el)
    val minSum                   = sliceHeads.map(_.min.getOrElse(0)).sum
    def cardinality: Cardinality = Cardinality(math.max(el.min.getOrElse(0), minSum), el.max.getOrElse("*")).get

    def deriveFieldInformation(
        pkg: String,
        parentClassName: String,
        fieldMap: Map[String, BaseField],
        declaringClassChain: Seq[String],
        fetchValueSet: (String, BINDING_STRENGTH) => Option[CodeValueSet]): BaseField = {
      val fieldName        = el.id.get.split("\\.").last
      val fieldNameAsClass = fieldName.capitalize
      val typeIsGen        = el.`type`.headOption.exists(e => e.code == "BackboneElement" || e.code == "Element")

      val base: Either[String, Map[String, String]] = el.`type` match {
        case LitSeq.emptyInstance =>
          Left(
            el.contentReference
              .map(_.dropWhile(_ == '#').split("\\.").map(_.capitalize).mkString("."))
              .orElse(fieldMap.get(fieldName).flatMap(x => if (x.types.size == 1) x.types.headOption else None))
              .getOrElse("Choice[\"Any\"]"))
        case l if l.length == 1 && typeIsGen => Left(fieldNameAsClass)
        case l if l.length == 1              => Left(typeLookup(l.head.code))
        case tpes                            => Right(tpes.map(tpe => tpe.code -> typeLookup(tpe.code)).toMap)
      }
      val baseStrings: Seq[String] = base match {
        case Left(s) => Seq(s)
        case Right(m) =>
          m.values.toSeq.sorted.distinct // Sorting here, because sorting later is a total ballache
      }
      val baseString: String = getUnionAlias(pkg, baseStrings, parentClassName, fieldName)
      val codeOpt            = el.`type`.map(_.code)
      val className          = if (codeOpt.contains(Seq("Element"))) fieldNameAsClass else baseString
      val childFields =
        if (typeIsGen)
          children.map(_.deriveFieldInformation(pkg, className, Map.empty, declaringClassChain :+ className, fetchValueSet))
        else Vector.empty
      val elementEnumeration: Option[CodeValueSet] =
        if (Config.expandValueSets && !typeIsGen && baseStrings.size == 1 && baseStrings.head == "Code") // TODO: Are any other types legitimately enumish?
          el.binding.flatMap(_.valueSet).flatMap { fetchValueSet(_, el.binding.get.strength) }
        else None

      BaseField(
        fieldName,
        baseStrings,
        None,
        cardinality,
        typeIsGen,
        parentClassName,
        fieldMap.get(fieldName),
        childFields,
        declaringClassChain,
        elementEnumeration,
        el,
        pkg
      )
    }
  }
}
