package com.babylonhealth.lit.usbase.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.{ Success, Try }

import io.circe.{ Decoder, HCursor }

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.BaseFieldDecoders._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.TagSummoners.lTagOf
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.hl7.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.usbase.EXPANSION_PROCESSING_RULE
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Valueset_expand_rules extends CompanionFor[Valueset_expand_rules] {
  implicit def summonObjectAndCompanionValueset_expand_rules_1088865382(
      o: Valueset_expand_rules): ObjectAndCompanion[Valueset_expand_rules, Valueset_expand_rules.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/valueset-expand-rules")
  def apply(
      id: Option[String] = None,
      value: EXPANSION_PROCESSING_RULE,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Valueset_expand_rules = new Valueset_expand_rules(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[EXPANSION_PROCESSING_RULE] =
    FHIRComponentFieldMeta("value", lTagOf[EXPANSION_PROCESSING_RULE], true, lTagOf[EXPANSION_PROCESSING_RULE])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[EXPANSION_PROCESSING_RULE](
        value,
        EXPANSION_PROCESSING_RULE.withName(t.value.get.toSubRefNonUnion[Code]))
    ))
  override def fields(t: Valueset_expand_rules): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Valueset_expand_rules): Option[String]                   = t.id
  def extractValue(t: Valueset_expand_rules): EXPANSION_PROCESSING_RULE =
    EXPANSION_PROCESSING_RULE.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String                                             = "Valueset_expand_rules"
  override val searchParams: Map[String, Valueset_expand_rules => Seq[Any]] = Extension.searchParams
  def unapply(o: Valueset_expand_rules): Option[(Option[String], EXPANSION_PROCESSING_RULE)] = Some(
    (o.id, EXPANSION_PROCESSING_RULE.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Valueset_expand_rules] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Valueset_expand_rules(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[EXPANSION_PROCESSING_RULE]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines how concepts are processed into the expansion when it's for UI presentation.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element -
  * found in all resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Requires the following fields which were optional in
  *   the parent: value. Forbids the use of the following fields which were optional in the parent: extension. Hardcodes
  *   the value of the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does
  *   not contain spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *   [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Valueset_expand_rules(
    override val id: Option[String] = None,
    value: EXPANSION_PROCESSING_RULE,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/valueset-expand-rules",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
