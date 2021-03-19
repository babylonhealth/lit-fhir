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

object Signature extends CompanionFor[Signature] {
  override type ResourceType = Signature
  override val baseType: CompanionFor[ResourceType] = Signature
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Signature")
  def apply(
      id: Option[String] = None,
      who: Reference,
      `type`: NonEmptyLitSeq[Coding],
      when: ZonedDateTime,
      data: Option[Base64Binary] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      sigFormat: Option[Code] = None,
      onBehalfOf: Option[Reference] = None,
      targetFormat: Option[Code] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Signature = new Signature(
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
  val who: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("who", lTagOf[Reference], false, lTagOf[Reference])
  val `type`: FHIRComponentFieldMeta[NonEmptyLitSeq[Coding]] =
    FHIRComponentFieldMeta("type", lTagOf[NonEmptyLitSeq[Coding]], false, lTagOf[Coding])
  val when: FHIRComponentFieldMeta[ZonedDateTime] =
    FHIRComponentFieldMeta("when", lTagOf[ZonedDateTime], false, lTagOf[ZonedDateTime])
  val data: FHIRComponentFieldMeta[Option[Base64Binary]] =
    FHIRComponentFieldMeta("data", lTagOf[Option[Base64Binary]], false, lTagOf[Base64Binary])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val sigFormat: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("sigFormat", lTagOf[Option[Code]], false, lTagOf[Code])
  val onBehalfOf: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("onBehalfOf", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val targetFormat: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("targetFormat", lTagOf[Option[Code]], false, lTagOf[Code])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, who, `type`, when, data, extension, sigFormat, onBehalfOf, targetFormat)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Signature): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Reference](who, t.who),
    FHIRComponentField[NonEmptyLitSeq[Coding]](`type`, t.`type`),
    FHIRComponentField[ZonedDateTime](when, t.when),
    FHIRComponentField[Option[Base64Binary]](data, t.data),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Code]](sigFormat, t.sigFormat),
    FHIRComponentField[Option[Reference]](onBehalfOf, t.onBehalfOf),
    FHIRComponentField[Option[Code]](targetFormat, t.targetFormat)
  )
  def extractId(t: Signature): Option[String]            = t.id
  def extractWho(t: Signature): Reference                = t.who
  def extractType(t: Signature): NonEmptyLitSeq[Coding]  = t.`type`
  def extractWhen(t: Signature): ZonedDateTime           = t.when
  def extractData(t: Signature): Option[Base64Binary]    = t.data
  def extractExtension(t: Signature): LitSeq[Extension]  = t.extension
  def extractSigFormat(t: Signature): Option[Code]       = t.sigFormat
  def extractOnBehalfOf(t: Signature): Option[Reference] = t.onBehalfOf
  def extractTargetFormat(t: Signature): Option[Code]    = t.targetFormat
  override val thisName: String                          = "Signature"
  def unapply(
      o: Signature): Option[(Option[String], Reference, NonEmptyLitSeq[Coding], ZonedDateTime, Option[Base64Binary], LitSeq[Extension], Option[Code], Option[Reference], Option[Code])] =
    Some((o.id, o.who, o.`type`, o.when, o.data, o.extension, o.sigFormat, o.onBehalfOf, o.targetFormat))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Signature] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Signature(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Reference]("who", None),
          cursor.decodeAs[NonEmptyLitSeq[Coding]]("type", None),
          cursor.decodeAs[ZonedDateTime]("when", None),
          cursor.decodeAs[Option[Base64Binary]]("data", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Code]]("sigFormat", Some(None)),
          cursor.decodeAs[Option[Reference]]("onBehalfOf", Some(None)),
          cursor.decodeAs[Option[Code]]("targetFormat", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Signature Type: A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
  *
  *  Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a resource.)
  *
  * @constructor Introduces the fields who, `type`, when, data, sigFormat, onBehalfOf, targetFormat.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param who - A reference to an application-usable description of the identity that signed  (e.g. the signature used their private key).
  * @param `type` - An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
  * @param when - When the digital signature was signed.
  * @param data - The base64 encoding of the Signature content. When signature is not recorded electronically this element would be empty.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param sigFormat - A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jose for JWS, and image/\* for a graphical image of a signature, etc.
  * @param onBehalfOf - A reference to an application-usable description of the identity that is represented by the signature.
  * @param targetFormat - A mime type that indicates the technical format of the target resources signed by the signature.
  */
@POJOBoilerplate
class Signature(
    override val id: Option[String] = None,
    val who: Reference,
    val `type`: NonEmptyLitSeq[Coding],
    val when: ZonedDateTime,
    val data: Option[Base64Binary] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val sigFormat: Option[Code] = None,
    val onBehalfOf: Option[Reference] = None,
    val targetFormat: Option[Code] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Signature"
}
