package com.babylonhealth.lit.core.model

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
import com.babylonhealth.lit.core.UnionAliases._

import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ContactDetail extends CompanionFor[ContactDetail] {
  implicit def summonObjectAndCompanionContactDetail_1828331805(
      o: ContactDetail): ObjectAndCompanion[ContactDetail, ContactDetail.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ContactDetail
  override type ParentType   = ContactDetail
  override val baseType: CompanionFor[ResourceType] = ContactDetail
  override val parentType: CompanionFor[ParentType] = ContactDetail
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ContactDetail")
  def apply(
      id: Option[String] = None,
      name: Option[String] = None,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ContactDetail = new ContactDetail(
    id,
    name,
    telecom,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val telecom: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, name, telecom, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ContactDetail): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: ContactDetail): Option[String]            = t.id
  def extractName(t: ContactDetail): Option[String]          = t.name
  def extractTelecom(t: ContactDetail): LitSeq[ContactPoint] = t.telecom
  def extractExtension(t: ContactDetail): LitSeq[Extension]  = t.extension
  override val thisName: String                              = "ContactDetail"
  def unapply(o: ContactDetail): Option[(Option[String], Option[String], LitSeq[ContactPoint], LitSeq[Extension])] =
    Some((o.id, o.name, o.telecom, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ContactDetail] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ContactDetail(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for ContactDetail Type: Specifies contact information for a person or organization.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields name, telecom.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does
  *   not contain spaces.
  * @param name
  *   - The name of an individual to contact.
  * @param telecom
  *   - The contact details for the individual (if a name was provided) or the organization.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make
  *   the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use
  *   of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as
  *   part of the definition of the extension.
  */
@POJOBoilerplate
class ContactDetail(
    override val id: Option[String] = None,
    val name: Option[String] = None,
    val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "ContactDetail"
}
