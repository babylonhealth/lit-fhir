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
object Meta extends CompanionFor[Meta] {
  implicit def summonObjectAndCompanionMeta_2065656966(o: Meta): ObjectAndCompanion[Meta, Meta.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Meta
  override type ParentType   = Meta
  override val baseType: CompanionFor[ResourceType] = Meta
  override val parentType: CompanionFor[ParentType] = Meta
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Meta")
  def apply(
=======
object Meta extends CompanionFor[Meta[_]] {
  override type ResourceType[T] = Meta[T]
  override val baseType: CompanionFor[ResourceType[_]] = Meta
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Meta")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      tag: LitSeq[Coding[Stage]] = LitSeq.empty,
      source: Option[UriStr] = None,
      profile: LitSeq[Canonical] = LitSeq.empty,
      security: LitSeq[Coding[Stage]] = LitSeq.empty,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      versionId: Option[Id] = None,
      lastUpdated: Option[ZonedDateTime] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Meta[Stage] = new Meta[Stage](
    id,
    tag,
    source,
    profile,
    security,
    extension,
    versionId,
    lastUpdated,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  def tag[Stage]: FHIRComponentFieldMeta[LitSeq[Coding[Stage]]] =
    FHIRComponentFieldMeta("tag", lTagOf[LitSeq[Coding[Stage]]], false, lTagOf[Coding[Stage]])
  val source: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("source", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val profile: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("profile", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  def security[Stage]: FHIRComponentFieldMeta[LitSeq[Coding[Stage]]] =
    FHIRComponentFieldMeta("security", lTagOf[LitSeq[Coding[Stage]]], false, lTagOf[Coding[Stage]])
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  val versionId: FHIRComponentFieldMeta[Option[Id]] =
    FHIRComponentFieldMeta("versionId", lTagOf[Option[Id]], false, lTagOf[Id])
  val lastUpdated: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
    FHIRComponentFieldMeta("lastUpdated", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
<<<<<<< HEAD
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, tag, source, profile, security, extension, versionId, lastUpdated)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Meta): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[LitSeq[Coding]](tag, t.tag),
    FHIRComponentField[Option[UriStr]](source, t.source),
    FHIRComponentField[LitSeq[Canonical]](profile, t.profile),
    FHIRComponentField[LitSeq[Coding]](security, t.security),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Id]](versionId, t.versionId),
    FHIRComponentField[Option[ZonedDateTime]](lastUpdated, t.lastUpdated)
=======
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, tag, source, profile, security, extension, versionId, lastUpdated)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Meta[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, LitSeq[Coding[Stage]]](tag, t.tag),
    FHIRComponentField[Stage, Option[UriStr]](source, t.source),
    FHIRComponentField[Stage, LitSeq[Canonical]](profile, t.profile),
    FHIRComponentField[Stage, LitSeq[Coding[Stage]]](security, t.security),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension),
    FHIRComponentField[Stage, Option[Id]](versionId, t.versionId),
    FHIRComponentField[Stage, Option[ZonedDateTime]](lastUpdated, t.lastUpdated)
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
  )
  def extractId(t: Meta[_]): Option[String]                             = t.id
  def extractTag[Stage](t: Meta[Stage]): LitSeq[Coding[Stage]]          = t.tag
  def extractSource(t: Meta[_]): Option[UriStr]                         = t.source
  def extractProfile(t: Meta[_]): LitSeq[Canonical]                     = t.profile
  def extractSecurity[Stage](t: Meta[Stage]): LitSeq[Coding[Stage]]     = t.security
  def extractExtension[Stage](t: Meta[Stage]): LitSeq[Extension[Stage]] = t.extension
  def extractVersionId(t: Meta[_]): Option[Id]                          = t.versionId
  def extractLastUpdated(t: Meta[_]): Option[ZonedDateTime]             = t.lastUpdated
  override val thisName: String                                         = "Meta"
  def unapply[Stage <: LifecycleStage: ValueOf](o: Meta[
    Stage]): Option[(Option[String], LitSeq[Coding[Stage]], Option[UriStr], LitSeq[Canonical], LitSeq[Coding[Stage]], LitSeq[Extension[Stage]], Option[Id], Option[ZonedDateTime])] =
    Some((o.id, o.tag, o.source, o.profile, o.security, o.extension, o.versionId, o.lastUpdated))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Meta[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Meta[Completed.type](
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[LitSeq[Coding[Completed.type]]]("tag", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("source", Some(None)),
          cursor.decodeAs[LitSeq[Canonical]]("profile", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Coding[Completed.type]]]("security", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Id]]("versionId", Some(None)),
          cursor.decodeAs[Option[ZonedDateTime]]("lastUpdated", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Meta Type: The metadata about a resource. This is content in the resource that is maintained by
  * the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields tag, source, profile, security, versionId, lastUpdated.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param tag
  *   - Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and
  *   applications are not required to consider the tags when interpreting the meaning of a resource.
  * @param source
  *   - A uri that identifies the source system of the resource. This provides a minimal amount of [Provenance](provenance.html#)
  *   information that can be used to track or differentiate the source of information in the resource. The source may identify
  *   another FHIR server, document, message, database, etc.
  * @param profile
  *   - A list of profiles (references to [StructureDefinition](structuredefinition.html#) resources) that this resource claims to
  *   conform to. The URL is a reference to
  *   [StructureDefinition.url](structuredefinition-definitions.html#StructureDefinition.url).
  * @param security
  *   - Security labels applied to this resource. These tags connect specific resources to the overall security policy and
  *   infrastructure.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param versionId
  *   - The version specific identifier, as it appears in the version portion of the URL. This value changes when the resource is
  *   created, updated, or deleted.
  * @param lastUpdated
  *   - When the resource last changed - e.g. when the version changed.
  */
@POJOBoilerplate
class Meta[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val tag: LitSeq[Coding[Stage]] = LitSeq.empty,
    val source: Option[UriStr] = None,
    val profile: LitSeq[Canonical] = LitSeq.empty,
    val security: LitSeq[Coding[Stage]] = LitSeq.empty,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    val versionId: Option[Id] = None,
    val lastUpdated: Option[ZonedDateTime] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Meta"
}
