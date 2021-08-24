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

object Reference extends CompanionFor[Reference] {
  implicit def summonObjectAndCompanionReference1035657974(o: Reference): ObjectAndCompanion[Reference, Reference.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Reference
  override type ParentType   = Reference
  override val baseType: CompanionFor[ResourceType] = Reference
  override val parentType: CompanionFor[ParentType] = Reference
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Reference")
  def apply(
      id: Option[String] = None,
      `type`: Option[UriStr] = None,
      display: Option[String] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      reference: Option[String] = None,
      identifier: Option[Identifier] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Reference = new Reference(
    id,
    `type`,
    display,
    extension,
    reference,
    identifier,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val `type`: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val display: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("display", lTagOf[Option[String]], false, lTagOf[String])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val reference: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("reference", lTagOf[Option[String]], false, lTagOf[String])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, display, extension, reference, identifier)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Reference): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](`type`, t.`type`),
    FHIRComponentField[Option[String]](display, t.display),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](reference, t.reference),
    FHIRComponentField[Option[Identifier]](identifier, t.identifier)
  )
  def extractId(t: Reference): Option[String]             = t.id
  def extractType(t: Reference): Option[UriStr]           = t.`type`
  def extractDisplay(t: Reference): Option[String]        = t.display
  def extractExtension(t: Reference): LitSeq[Extension]   = t.extension
  def extractReference(t: Reference): Option[String]      = t.reference
  def extractIdentifier(t: Reference): Option[Identifier] = t.identifier
  override val thisName: String                           = "Reference"
  def unapply(
      o: Reference): Option[(Option[String], Option[UriStr], Option[String], LitSeq[Extension], Option[String], Option[Identifier])] =
    Some((o.id, o.`type`, o.display, o.extension, o.reference, o.identifier))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Reference] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Reference(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("type", Some(None)),
          cursor.decodeAs[Option[String]]("display", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("reference", Some(None)),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Reference Type: A reference from one resource to another.
  *
  * Subclass of [[core.model.DataType]] (Base StructureDefinition for DataType Type: The base class for all re-useable types
  * defined as part of the FHIR Specification.)
  *
  * @constructor
  *   Introduces the fields `type`, display, reference, identifier.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param `type`
  *   - The expected type of the target of the reference. If both Reference.type and Reference.reference are populated and
  *   Reference.reference is a FHIR URL, both SHALL be consistent. The type is the Canonical URL of Resource Definition that is
  *   the type this reference refers to. References are URLs that are relative to http://hl7.org/fhir/StructureDefinition/ e.g.
  *   "Patient" is a reference to http://hl7.org/fhir/StructureDefinition/Patient. Absolute URLs are only allowed for logical
  *   models (and can only be used in references in logical models, not resources).
  * @param display
  *   - Plain text narrative that identifies the resource in addition to the resource reference.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param reference
  *   - A reference to a location at which the other resource is found. The reference may be a relative reference, in which case
  *   it is relative to the service base URL, or an absolute URL that resolves to the location where the resource is found. The
  *   reference may be version specific or not. If the reference is not to a FHIR RESTful server, then it should be assumed to be
  *   version specific. Internal fragment references (start with '#') refer to contained resources.
  * @param identifier
  *   - An identifier for the target resource. This is used when there is no way to reference the other resource directly, either
  *   because the entity it represents is not available through a FHIR server, or because there is no way for the author of the
  *   resource to convert a known identifier to an actual location. There is no requirement that a Reference.identifier point to
  *   something that is actually exposed as a FHIR instance, but it SHALL point to a business concept that would be expected to be
  *   exposed as a FHIR instance, and that instance would need to be of a FHIR resource type allowed by the reference.
  */
@POJOBoilerplate
class Reference(
    override val id: Option[String] = None,
    val `type`: Option[UriStr] = None,
    val display: Option[String] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val reference: Option[String] = None,
    val identifier: Option[Identifier] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends DataType(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Reference"
}
