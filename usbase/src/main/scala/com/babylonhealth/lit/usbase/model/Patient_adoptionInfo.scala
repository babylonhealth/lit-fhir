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

object Patient_adoptionInfo extends CompanionFor[Patient_adoptionInfo] {
  implicit def summonObjectAndCompanionPatient_adoptionInfo_1088445(
      o: Patient_adoptionInfo): ObjectAndCompanion[Patient_adoptionInfo, Patient_adoptionInfo.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/patient-adoptionInfo")
  def apply(
      id: Option[String] = None,
      value: CodeableConcept,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Patient_adoptionInfo = new Patient_adoptionInfo(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("value", lTagOf[CodeableConcept], true, lTagOf[CodeableConcept])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](value, t.value.get.toSubRefNonUnion[CodeableConcept])
    ))
  override def fields(t: Patient_adoptionInfo): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Patient_adoptionInfo): Option[String]                   = t.id
  def extractValue(t: Patient_adoptionInfo): CodeableConcept               = t.value.get.toSubRefNonUnion[CodeableConcept]
  override val thisName: String                                            = "Patient_adoptionInfo"
  override val searchParams: Map[String, Patient_adoptionInfo => Seq[Any]] = Extension.searchParams
  def unapply(o: Patient_adoptionInfo): Option[(Option[String], CodeableConcept)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[CodeableConcept]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Patient_adoptionInfo] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Patient_adoptionInfo(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[CodeableConcept]("valueCodeableConcept", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Code indication the adoption status of the patient.
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
class Patient_adoptionInfo(
    override val id: Option[String] = None,
    value: CodeableConcept,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/patient-adoptionInfo",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
