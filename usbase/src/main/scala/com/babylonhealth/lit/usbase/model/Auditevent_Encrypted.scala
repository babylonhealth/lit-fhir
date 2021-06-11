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

object Auditevent_Encrypted extends CompanionFor[Auditevent_Encrypted] {
  implicit def summonObjectAndCompanionAuditevent_Encrypted1731401681(
      o: Auditevent_Encrypted): ObjectAndCompanion[Auditevent_Encrypted, Auditevent_Encrypted.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/auditevent-Encrypted")
  def apply(
      id: Option[String] = None,
      value: Boolean,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Auditevent_Encrypted = new Auditevent_Encrypted(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("value", lTagOf[Boolean], true, lTagOf[Boolean])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Boolean](value, t.value.get.toSubRefNonUnion[Boolean])
    ))
  override def fields(t: Auditevent_Encrypted): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Auditevent_Encrypted): Option[String]                   = t.id
  def extractValue(t: Auditevent_Encrypted): Boolean                       = t.value.get.toSubRefNonUnion[Boolean]
  override val thisName: String                                            = "Auditevent_Encrypted"
  override val searchParams: Map[String, Auditevent_Encrypted => Seq[Any]] = Extension.searchParams
  def unapply(o: Auditevent_Encrypted): Option[(Option[String], Boolean)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[Boolean]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Auditevent_Encrypted] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Auditevent_Encrypted(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Boolean]("valueBoolean", None),
          decodeAttributes(cursor)
        )
      ))
}

/** True or False indicating whether the data was encrypted.
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
class Auditevent_Encrypted(
    override val id: Option[String] = None,
    value: Boolean,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/auditevent-Encrypted",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
