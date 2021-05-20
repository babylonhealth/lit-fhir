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

<<<<<<< HEAD
object ContactDetail extends CompanionFor[ContactDetail] {
  implicit def summonObjectAndCompanionContactDetail_98408772(
      o: ContactDetail): ObjectAndCompanion[ContactDetail, ContactDetail.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ContactDetail
  override type ParentType   = ContactDetail
  override val baseType: CompanionFor[ResourceType] = ContactDetail
  override val parentType: CompanionFor[ParentType] = ContactDetail
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ContactDetail")
  def apply(
=======
object ContactDetail extends CompanionFor[ContactDetail[_]] {
  override type ResourceType[T] = ContactDetail[T]
  override val baseType: CompanionFor[ResourceType[_]] = ContactDetail
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/ContactDetail")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      name: Option[String] = None,
      telecom: LitSeq[ContactPoint[Stage]] = LitSeq.empty,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ContactDetail[Stage] = new ContactDetail[Stage](
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
<<<<<<< HEAD
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
  def unapply(o: ContactDetail): Option[(Option[String], Option[String], LitSeq[ContactPoint], LitSeq[Extension])] = Some(
    (o.id, o.name, o.telecom, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ContactDetail] =
=======
  def telecom[Stage]: FHIRComponentFieldMeta[LitSeq[ContactPoint[Stage]]] =
    FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint[Stage]]], false, lTagOf[ContactPoint[Stage]])
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, telecom, extension)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t[Stage]))
  override def fields[Stage <: LifecycleStage: ValueOf](t: ContactDetail[Stage]): Seq[FHIRComponentField[Stage, _]] =
    Seq(
      FHIRComponentField[Stage, Option[String]](id, t.id),
      FHIRComponentField[Stage, Option[String]](name, t.name),
      FHIRComponentField[Stage, LitSeq[ContactPoint[Stage]]](telecom, t.telecom),
      FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension)
    )
  def extractId(t: ContactDetail[_]): Option[String]                              = t.id
  def extractName(t: ContactDetail[_]): Option[String]                            = t.name
  def extractTelecom[Stage](t: ContactDetail[Stage]): LitSeq[ContactPoint[Stage]] = t.telecom
  def extractExtension[Stage](t: ContactDetail[Stage]): LitSeq[Extension[Stage]]  = t.extension
  override val thisName: String                                                   = "ContactDetail"
  def unapply[Stage <: LifecycleStage: ValueOf](
      o: ContactDetail[
        Stage]): Option[(Option[String], Option[String], LitSeq[ContactPoint], LitSeq[Extension[Stage]])] =
    Some((o.id, o.name, o.telecom, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ContactDetail[Completed.type]] =
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ContactDetail(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[LitSeq[ContactPoint[Completed.type]]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
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
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param name
  *   - The name of an individual to contact.
  * @param telecom
  *   - The contact details for the individual (if a name was provided) or the organization.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class ContactDetail[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val name: Option[String] = None,
    val telecom: LitSeq[ContactPoint[Stage]] = LitSeq.empty,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "ContactDetail"
}
