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

import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Composition_clinicaldocument_otherConfidentiality extends CompanionFor[Composition_clinicaldocument_otherConfidentiality] {
  implicit def summonObjectAndCompanionComposition_clinicaldocument_otherConfidentiality_1251335395(
      o: Composition_clinicaldocument_otherConfidentiality): ObjectAndCompanion[Composition_clinicaldocument_otherConfidentiality, Composition_clinicaldocument_otherConfidentiality.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/composition-clinicaldocument-otherConfidentiality")
  def apply(
      id: Option[String] = None,
      value: Coding,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Composition_clinicaldocument_otherConfidentiality = new Composition_clinicaldocument_otherConfidentiality(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Coding] =
    FHIRComponentFieldMeta("value", lTagOf[Coding], true, lTagOf[Coding])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Coding](value, t.value.get.toSubRefNonUnion[Coding])
    ))
  override def fields(t: Composition_clinicaldocument_otherConfidentiality): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Composition_clinicaldocument_otherConfidentiality): Option[String]                   = t.id
  def extractValue(t: Composition_clinicaldocument_otherConfidentiality): Coding = t.value.get.toSubRefNonUnion[Coding]
  override val thisName: String = "Composition_clinicaldocument_otherConfidentiality"
  override val searchParams: Map[String, Composition_clinicaldocument_otherConfidentiality => Seq[Any]] = Extension.searchParams
  def unapply(o: Composition_clinicaldocument_otherConfidentiality): Option[(Option[String], Coding)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[Coding]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Composition_clinicaldocument_otherConfidentiality] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Composition_clinicaldocument_otherConfidentiality(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Coding]("valueCoding", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Carries additional confidentiality codes beyond the base fixed code specified in the CDA document.
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
class Composition_clinicaldocument_otherConfidentiality(
    override val id: Option[String] = None,
    value: Coding,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/composition-clinicaldocument-otherConfidentiality",
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Extension"
}
