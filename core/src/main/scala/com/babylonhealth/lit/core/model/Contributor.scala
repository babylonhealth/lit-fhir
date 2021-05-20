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
import com.babylonhealth.lit.core.CONTRIBUTOR_TYPE
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

<<<<<<< HEAD
object Contributor extends CompanionFor[Contributor] {
  implicit def summonObjectAndCompanionContributor1250805190(o: Contributor): ObjectAndCompanion[Contributor, Contributor.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Contributor
  override type ParentType   = Contributor
  override val baseType: CompanionFor[ResourceType] = Contributor
  override val parentType: CompanionFor[ParentType] = Contributor
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Contributor")
  def apply(
=======
object Contributor extends CompanionFor[Contributor[_]] {
  override type ResourceType[T] = Contributor[T]
  override val baseType: CompanionFor[ResourceType[_]] = Contributor
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Contributor")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      `type`: CONTRIBUTOR_TYPE,
      name: String,
      contact: LitSeq[ContactDetail[Stage]] = LitSeq.empty,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Contributor[Stage] = new Contributor(
    id,
    `type`,
    name,
    contact,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val `type`: FHIRComponentFieldMeta[CONTRIBUTOR_TYPE] =
    FHIRComponentFieldMeta("type", lTagOf[CONTRIBUTOR_TYPE], false, lTagOf[CONTRIBUTOR_TYPE])
  val name: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
  def contact[Stage]: FHIRComponentFieldMeta[LitSeq[ContactDetail[Stage]]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail[Stage]]], false, lTagOf[ContactDetail[Stage]])
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, `type`, name, contact, extension)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Contributor[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, CONTRIBUTOR_TYPE](`type`, t.`type`),
    FHIRComponentField[Stage, String](name, t.name),
    FHIRComponentField[Stage, LitSeq[ContactDetail[Stage]]](contact, t.contact),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension)
  )
<<<<<<< HEAD
  def extractId(t: Contributor): Option[String]             = t.id
  def extractType(t: Contributor): CONTRIBUTOR_TYPE         = t.`type`
  def extractName(t: Contributor): String                   = t.name
  def extractContact(t: Contributor): LitSeq[ContactDetail] = t.contact
  def extractExtension(t: Contributor): LitSeq[Extension]   = t.extension
  override val thisName: String                             = "Contributor"
  def unapply(o: Contributor): Option[(Option[String], CONTRIBUTOR_TYPE, String, LitSeq[ContactDetail], LitSeq[Extension])] =
=======
  def extractId(t: Contributor[_]): Option[String]                               = t.id
  def extractType(t: Contributor[_]): CONTRIBUTOR_TYPE                           = t.`type`
  def extractName(t: Contributor[_]): String                                     = t.name
  def extractContact[Stage](t: Contributor[Stage]): LitSeq[ContactDetail[Stage]] = t.contact
  def extractExtension[Stage](t: Contributor[Stage]): LitSeq[Extension[Stage]]   = t.extension
  override val thisName: String                                                  = "Contributor"
  def unapply[Stage <: LifecycleStage: ValueOf](o: Contributor[
    Stage]): Option[(Option[String], CONTRIBUTOR_TYPE, String, LitSeq[ContactDetail[Stage]], LitSeq[Extension[Stage]])] =
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
    Some((o.id, o.`type`, o.name, o.contact, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Contributor[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Contributor(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[CONTRIBUTOR_TYPE]("type", None),
          cursor.decodeAs[String]("name", None),
          cursor.decodeAs[LitSeq[ContactDetail[Completed.type]]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Contributor Type: A contributor to the content of a knowledge asset, including authors, editors,
  * reviewers, and endorsers.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields `type`, name, contact.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param `type`
  *   - The type of contributor.
  * @param name
  *   - The name of the individual or organization responsible for the contribution.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the contributor.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class Contributor[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val `type`: CONTRIBUTOR_TYPE,
    val name: String,
    val contact: LitSeq[ContactDetail[Stage]] = LitSeq.empty,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Contributor"
}
