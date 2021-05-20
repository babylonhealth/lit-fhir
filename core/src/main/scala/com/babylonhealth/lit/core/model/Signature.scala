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
object Signature extends CompanionFor[Signature] {
  implicit def summonObjectAndCompanionSignature_1260569501(o: Signature): ObjectAndCompanion[Signature, Signature.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Signature
  override type ParentType   = Signature
  override val baseType: CompanionFor[ResourceType] = Signature
  override val parentType: CompanionFor[ParentType] = Signature
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Signature")
  def apply(
=======
object Signature extends CompanionFor[Signature[_]] {
  override type ResourceType[T] = Signature[T]
  override val baseType: CompanionFor[ResourceType[_]] = Signature
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Signature")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      who: Reference[Stage],
      `type`: NonEmptyLitSeq[Coding[Stage]],
      when: ZonedDateTime,
      data: Option[Base64Binary] = None,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      sigFormat: Option[Code] = None,
      onBehalfOf: Option[Reference[Stage]] = None,
      targetFormat: Option[Code] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Signature[Stage] = new Signature[Stage](
    id,
    who,
    `type`,
    when,
    data,
    extension,
    sigFormat,
    onBehalfOf,
    targetFormat,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  def who[Stage]: FHIRComponentFieldMeta[Reference[Stage]] =
    FHIRComponentFieldMeta("who", lTagOf[Reference[Stage]], false, lTagOf[Reference[Stage]])
  def `type`[Stage]: FHIRComponentFieldMeta[NonEmptyLitSeq[Coding[Stage]]] =
    FHIRComponentFieldMeta("type", lTagOf[NonEmptyLitSeq[Coding[Stage]]], false, lTagOf[Coding[Stage]])
  val when: FHIRComponentFieldMeta[ZonedDateTime] =
    FHIRComponentFieldMeta("when", lTagOf[ZonedDateTime], false, lTagOf[ZonedDateTime])
  val data: FHIRComponentFieldMeta[Option[Base64Binary]] =
    FHIRComponentFieldMeta("data", lTagOf[Option[Base64Binary]], false, lTagOf[Base64Binary])
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  val sigFormat: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("sigFormat", lTagOf[Option[Code]], false, lTagOf[Code])
  def onBehalfOf[Stage]: FHIRComponentFieldMeta[Option[Reference[Stage]]] =
    FHIRComponentFieldMeta("onBehalfOf", lTagOf[Option[Reference[Stage]]], false, lTagOf[Reference[Stage]])
  val targetFormat: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("targetFormat", lTagOf[Option[Code]], false, lTagOf[Code])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, who, `type`, when, data, extension, sigFormat, onBehalfOf, targetFormat)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Signature[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, Reference[Stage]](who, t.who),
    FHIRComponentField[Stage, NonEmptyLitSeq[Coding[Stage]]](`type`, t.`type`),
    FHIRComponentField[Stage, ZonedDateTime](when, t.when),
    FHIRComponentField[Stage, Option[Base64Binary]](data, t.data),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension),
    FHIRComponentField[Stage, Option[Code]](sigFormat, t.sigFormat),
    FHIRComponentField[Stage, Option[Reference[Stage]]](onBehalfOf, t.onBehalfOf),
    FHIRComponentField[Stage, Option[Code]](targetFormat, t.targetFormat)
  )
  def extractId(t: Signature[_]): Option[String]                              = t.id
  def extractWho[Stage](t: Signature[Stage]): Reference[Stage]                = t.who
  def extractType[Stage](t: Signature[Stage]): NonEmptyLitSeq[Coding[Stage]]  = t.`type`
  def extractWhen(t: Signature[_]): ZonedDateTime                             = t.when
  def extractData(t: Signature[_]): Option[Base64Binary]                      = t.data
  def extractExtension[Stage](t: Signature[Stage]): LitSeq[Extension[Stage]]  = t.extension
  def extractSigFormat(t: Signature[_]): Option[Code]                         = t.sigFormat
  def extractOnBehalfOf[Stage](t: Signature[Stage]): Option[Reference[Stage]] = t.onBehalfOf
  def extractTargetFormat(t: Signature[_]): Option[Code]                      = t.targetFormat
  override val thisName: String                                               = "Signature"
  def unapply[Stage <: LifecycleStage: ValueOf](o: Signature[
    Stage]): Option[(Option[String], Reference[Stage], NonEmptyLitSeq[Coding[Stage]], ZonedDateTime, Option[Base64Binary], LitSeq[Extension[Stage]], Option[Code], Option[Reference[Stage]], Option[Code])] =
    Some((o.id, o.who, o.`type`, o.when, o.data, o.extension, o.sigFormat, o.onBehalfOf, o.targetFormat))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Signature[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Signature(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Reference[Completed.type]]("who", None),
          cursor.decodeAs[NonEmptyLitSeq[Coding[Completed.type]]]("type", None),
          cursor.decodeAs[ZonedDateTime]("when", None),
          cursor.decodeAs[Option[Base64Binary]]("data", Some(None)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Code]]("sigFormat", Some(None)),
          cursor.decodeAs[Option[Reference[Completed.type]]]("onBehalfOf", Some(None)),
          cursor.decodeAs[Option[Code]]("targetFormat", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Signature Type: A signature along with supporting context. The signature may be a digital
  * signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as
  * simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have
  * different utilities.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields who, `type`, when, data, sigFormat, onBehalfOf, targetFormat.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param who
  *   - A reference to an application-usable description of the identity that signed (e.g. the signature used their private key).
  * @param `type`
  *   - An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature
  *   information and can be used when determining accountability for various actions concerning the document.
  * @param when
  *   - When the digital signature was signed.
  * @param data
  *   - The base64 encoding of the Signature content. When signature is not recorded electronically this element would be empty.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param sigFormat
  *   - A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X
  *   ML DigSig, application/jose for JWS, and image/\* for a graphical image of a signature, etc.
  * @param onBehalfOf
  *   - A reference to an application-usable description of the identity that is represented by the signature.
  * @param targetFormat
  *   - A mime type that indicates the technical format of the target resources signed by the signature.
  */
@POJOBoilerplate
class Signature[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val who: Reference[Stage],
    val `type`: NonEmptyLitSeq[Coding[Stage]],
    val when: ZonedDateTime,
    val data: Option[Base64Binary] = None,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    val sigFormat: Option[Code] = None,
    val onBehalfOf: Option[Reference[Stage]] = None,
    val targetFormat: Option[Code] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Signature"
}
