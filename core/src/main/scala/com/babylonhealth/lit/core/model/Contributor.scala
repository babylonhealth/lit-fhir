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

object Contributor extends CompanionFor[Contributor] {
  implicit def summonObjectAndCompanionContributor1250805190(o: Contributor): ObjectAndCompanion[Contributor, Contributor.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Contributor
  override type ParentType   = Contributor
  override val baseType: CompanionFor[ResourceType] = Contributor
  override val parentType: CompanionFor[ParentType] = Contributor
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Contributor")
  def apply(
      id: Option[String] = None,
      `type`: CONTRIBUTOR_TYPE,
      name: String,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Contributor = new Contributor(
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
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, name, contact, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Contributor): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[CONTRIBUTOR_TYPE](`type`, t.`type`),
    FHIRComponentField[String](name, t.name),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: Contributor): Option[String]             = t.id
  def extractType(t: Contributor): CONTRIBUTOR_TYPE         = t.`type`
  def extractName(t: Contributor): String                   = t.name
  def extractContact(t: Contributor): LitSeq[ContactDetail] = t.contact
  def extractExtension(t: Contributor): LitSeq[Extension]   = t.extension
  override val thisName: String                             = "Contributor"
  def unapply(o: Contributor): Option[(Option[String], CONTRIBUTOR_TYPE, String, LitSeq[ContactDetail], LitSeq[Extension])] =
    Some((o.id, o.`type`, o.name, o.contact, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Contributor] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Contributor(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[CONTRIBUTOR_TYPE]("type", None),
          cursor.decodeAs[String]("name", None),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Contributor Type: A contributor to the content of a knowledge asset, including authors, editors,
  * reviewers, and endorsers.
  *
  * Subclass of [[core.model.DataType]] (Base StructureDefinition for DataType Type: The base class for all re-useable types
  * defined as part of the FHIR Specification.)
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
class Contributor(
    override val id: Option[String] = None,
    val `type`: CONTRIBUTOR_TYPE,
    val name: String,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends DataType(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Contributor"
}
