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

import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Familymemberhistory_abatement extends CompanionFor[Familymemberhistory_abatement] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/familymemberhistory-abatement")
  type ValueChoice = Choice[Union00813350082]
  def apply(
      id: Option[String] = None,
      value: Familymemberhistory_abatement.ValueChoice,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Familymemberhistory_abatement = new Familymemberhistory_abatement(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Familymemberhistory_abatement.ValueChoice] =
    FHIRComponentFieldMeta("value", lTagOf[Familymemberhistory_abatement.ValueChoice], true, lTagOf[Union00813350082])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fields(t: Familymemberhistory_abatement): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Familymemberhistory_abatement.ValueChoice](value, t.value.get.toSubRef)
  )
  def extractId(t: Familymemberhistory_abatement): Option[String]                               = t.id
  def extractValue(t: Familymemberhistory_abatement): Familymemberhistory_abatement.ValueChoice = t.value.get.toSubRef
  override val thisName: String                                                                 = "Familymemberhistory_abatement"
  override val searchParams: Map[String, Familymemberhistory_abatement => Seq[Any]]             = Extension.searchParams
  def unapply(o: Familymemberhistory_abatement): Option[(Option[String], Familymemberhistory_abatement.ValueChoice)] =
    Some((o.id, o.value.get.toSubRef))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Familymemberhistory_abatement] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Familymemberhistory_abatement(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeRef[Union00813350082]("value"),
          decodeAttributes(cursor)
        )
      ))
}

/** The approximate date, age, or flag indicating that the condition of the family member resolved. The abatement should only be specified if the condition is stated in the positive sense, i.e., the didNotHave flag is false.
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
class Familymemberhistory_abatement(
    override val id: Option[String] = None,
    value: Familymemberhistory_abatement.ValueChoice,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(value.toSuperRef),
      url = "http://hl7.org/fhir/StructureDefinition/familymemberhistory-abatement",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
