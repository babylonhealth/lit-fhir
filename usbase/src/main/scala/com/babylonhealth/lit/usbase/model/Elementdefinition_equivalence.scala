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
import com.babylonhealth.lit.hl7.CONCEPT_MAP_EQUIVALENCE
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Elementdefinition_equivalence extends CompanionFor[Elementdefinition_equivalence] {
  implicit def summonObjectAndCompanionElementdefinition_equivalence761890297(
      o: Elementdefinition_equivalence): ObjectAndCompanion[Elementdefinition_equivalence, Elementdefinition_equivalence.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/elementdefinition-equivalence")
  def apply(
      id: Option[String] = None,
      value: CONCEPT_MAP_EQUIVALENCE,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Elementdefinition_equivalence = new Elementdefinition_equivalence(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[CONCEPT_MAP_EQUIVALENCE] =
    FHIRComponentFieldMeta("value", lTagOf[CONCEPT_MAP_EQUIVALENCE], true, lTagOf[CONCEPT_MAP_EQUIVALENCE])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CONCEPT_MAP_EQUIVALENCE](value, CONCEPT_MAP_EQUIVALENCE.withName(t.value.get.toSubRefNonUnion[Code]))
    ))
  override def fields(t: Elementdefinition_equivalence): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Elementdefinition_equivalence): Option[String]                   = t.id
  def extractValue(t: Elementdefinition_equivalence): CONCEPT_MAP_EQUIVALENCE =
    CONCEPT_MAP_EQUIVALENCE.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String                                                     = "Elementdefinition_equivalence"
  override val searchParams: Map[String, Elementdefinition_equivalence => Seq[Any]] = Extension.searchParams
  def unapply(o: Elementdefinition_equivalence): Option[(Option[String], CONCEPT_MAP_EQUIVALENCE)] = Some(
    (o.id, CONCEPT_MAP_EQUIVALENCE.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Elementdefinition_equivalence] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Elementdefinition_equivalence(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[CONCEPT_MAP_EQUIVALENCE]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The level of equivalence between the element containing the mapping and the element mapped to.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all
  * resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Requires the following fields which were optional in the
  *   parent: value. Forbids the use of the following fields which were optional in the parent: extension. Hardcodes the value of
  *   the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *     spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Elementdefinition_equivalence(
    override val id: Option[String] = None,
    value: CONCEPT_MAP_EQUIVALENCE,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choiceFromEnum(value)),
      url = "http://hl7.org/fhir/StructureDefinition/elementdefinition-equivalence",
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Extension"
}
