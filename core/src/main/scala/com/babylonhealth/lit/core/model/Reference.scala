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
object Reference extends CompanionFor[Reference] {
  implicit def summonObjectAndCompanionReference1035657974(o: Reference): ObjectAndCompanion[Reference, Reference.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Reference
  override type ParentType   = Reference
  override val baseType: CompanionFor[ResourceType] = Reference
  override val parentType: CompanionFor[ParentType] = Reference
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Reference")
  def apply(
=======
object Reference extends CompanionFor[Reference[_]] {
  override type ResourceType[T] = Reference[T]
  override val baseType: CompanionFor[ResourceType[_]] = Reference
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Reference")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      `type`: Option[UriStr] = None,
      display: Option[String] = None,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      reference: Option[String] = None,
      identifier: Option[Identifier[Stage]] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Reference[Stage] = new Reference[Stage](
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
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  val reference: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("reference", lTagOf[Option[String]], false, lTagOf[String])
<<<<<<< HEAD
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
=======
  def identifier[Stage]: FHIRComponentFieldMeta[Option[Identifier[Stage]]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier[Stage]]], false, lTagOf[Identifier[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, `type`, display, extension, reference, identifier)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Reference[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, Option[UriStr]](`type`, t.`type`),
    FHIRComponentField[Stage, Option[String]](display, t.display),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension),
    FHIRComponentField[Stage, Option[String]](reference, t.reference),
    FHIRComponentField[Stage, Option[Identifier[Stage]]](identifier, t.identifier)
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
  )
  def extractId(t: Reference[_]): Option[String]                               = t.id
  def extractType(t: Reference[_]): Option[UriStr]                             = t.`type`
  def extractDisplay(t: Reference[_]): Option[String]                          = t.display
  def extractExtension[Stage](t: Reference[Stage]): LitSeq[Extension[Stage]]   = t.extension
  def extractReference(t: Reference[_]): Option[String]                        = t.reference
  def extractIdentifier[Stage](t: Reference[Stage]): Option[Identifier[Stage]] = t.identifier
  override val thisName: String                                                = "Reference"
  def unapply[Stage <: LifecycleStage: ValueOf](o: Reference[
    Stage]): Option[(Option[String], Option[UriStr], Option[String], LitSeq[Extension[Stage]], Option[String], Option[Identifier[Stage]])] =
    Some((o.id, o.`type`, o.display, o.extension, o.reference, o.identifier))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Reference[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Reference(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("type", Some(None)),
          cursor.decodeAs[Option[String]]("display", Some(None)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("reference", Some(None)),
          cursor.decodeAs[Option[Identifier[Completed.type]]]("identifier", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Reference Type: A reference from one resource to another.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
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
class Reference[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val `type`: Option[UriStr] = None,
    val display: Option[String] = None,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    val reference: Option[String] = None,
    val identifier: Option[Identifier[Stage]] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Reference"
}
