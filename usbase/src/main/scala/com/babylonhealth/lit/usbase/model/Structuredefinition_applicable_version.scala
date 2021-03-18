package com.babylonhealth.lit.usbase.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.Try

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
import com.babylonhealth.lit.hl7.FHIR_VERSION
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Structuredefinition_applicable_version extends CompanionFor[Structuredefinition_applicable_version] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/structuredefinition-applicable-version")
  def apply(
      id: Option[String] = None,
      value: FHIR_VERSION,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Structuredefinition_applicable_version = new Structuredefinition_applicable_version(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[FHIR_VERSION] =
    FHIRComponentFieldMeta("value", lTagOf[FHIR_VERSION], true, lTagOf[FHIR_VERSION])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fields(t: Structuredefinition_applicable_version): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[FHIR_VERSION](value, t.value.get.toSubRefNonUnion[FHIR_VERSION])
  )
  def extractId(t: Structuredefinition_applicable_version): Option[String]                   = t.id
  def extractValue(t: Structuredefinition_applicable_version): FHIR_VERSION                  = t.value.get.toSubRefNonUnion[FHIR_VERSION]
  override val thisName: String                                                              = "Structuredefinition_applicable_version"
  override val searchParams: Map[String, Structuredefinition_applicable_version => Seq[Any]] = Extension.searchParams
  def unapply(o: Structuredefinition_applicable_version): Option[(Option[String], FHIR_VERSION)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[FHIR_VERSION]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Structuredefinition_applicable_version] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Structuredefinition_applicable_version(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[FHIR_VERSION]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** An additional version that this profile apples to, other than the version explicitly stated in StructureDefinition.fhirVersion.
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Refines the types of: value.
  *              Requires the following fields which were optional in the parent: value.
  *              Forbids the use of the following fields which were optional in the parent: extension.
  *              Hardcodes the value of the following fields: url.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param value - Value of extension - must be one of a constrained set of the data types (see [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Structuredefinition_applicable_version(
    override val id: Option[String] = None,
    value: FHIR_VERSION,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/structuredefinition-applicable-version",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
