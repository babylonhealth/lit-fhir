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

object Patient_birthPlace extends CompanionFor[Patient_birthPlace] {
  implicit def summonObjectAndCompanionPatient_birthPlace1072889829(
      o: Patient_birthPlace): ObjectAndCompanion[Patient_birthPlace, Patient_birthPlace.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/patient-birthPlace")
  def apply(
      id: Option[String] = None,
      value: Address,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Patient_birthPlace = new Patient_birthPlace(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Address] =
    FHIRComponentFieldMeta("value", lTagOf[Address], true, lTagOf[Address])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Address](value, t.value.get.toSubRefNonUnion[Address])
    ))
  override def fields(t: Patient_birthPlace): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Patient_birthPlace): Option[String]                   = t.id
  def extractValue(t: Patient_birthPlace): Address                       = t.value.get.toSubRefNonUnion[Address]
  override val thisName: String                                          = "Patient_birthPlace"
  override val searchParams: Map[String, Patient_birthPlace => Seq[Any]] = Extension.searchParams
  def unapply(o: Patient_birthPlace): Option[(Option[String], Address)]  = Some((o.id, o.value.get.toSubRefNonUnion[Address]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Patient_birthPlace] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Patient_birthPlace(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Address]("valueAddress", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The registered place of birth of the patient. A sytem may use the address.text if they don't store the birthPlace address in
  * discrete elements.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all
  * resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Requires the following fields which were optional in the
  *   parent: value. Forbids the use of the following fields which were optional in the parent: extension. Hardcodes the value of
  *   the following fields: url.
  * @param id
  *   \- Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param url
  *   \- Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   \- Value of extension - must be one of a constrained set of the data types (see
  *   [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Patient_birthPlace(
    override val id: Option[String] = None,
    value: Address,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/patient-birthPlace",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
