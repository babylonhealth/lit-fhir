package com.babylonhealth.lit.hl7.model

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
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Binary extends CompanionFor[Binary] {
  implicit def summonObjectAndCompanionBinary_1132855242(o: Binary): ObjectAndCompanion[Binary, Binary.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Binary
  override type ParentType   = Binary
  override val baseType: CompanionFor[ResourceType] = Binary
  override val parentType: CompanionFor[ParentType] = Binary
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Binary")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      data: Option[Base64Binary] = None,
      language: Option[LANGUAGES] = None,
      contentType: Code,
      implicitRules: Option[UriStr] = None,
      securityContext: Option[Reference] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Binary = new Binary(
    id,
    meta,
    data,
    language,
    contentType,
    implicitRules,
    securityContext,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val data: FHIRComponentFieldMeta[Option[Base64Binary]] =
    FHIRComponentFieldMeta("data", lTagOf[Option[Base64Binary]], false, lTagOf[Base64Binary])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contentType: FHIRComponentFieldMeta[Code] =
    FHIRComponentFieldMeta("contentType", lTagOf[Code], false, lTagOf[Code])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val securityContext: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("securityContext", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, meta, data, language, contentType, implicitRules, securityContext)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Binary): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Base64Binary]](data, t.data),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Code](contentType, t.contentType),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Reference]](securityContext, t.securityContext)
  )
  def extractId(t: Binary): Option[String]                 = t.id
  def extractMeta(t: Binary): Option[Meta]                 = t.meta
  def extractData(t: Binary): Option[Base64Binary]         = t.data
  def extractLanguage(t: Binary): Option[LANGUAGES]        = t.language
  def extractContentType(t: Binary): Code                  = t.contentType
  def extractImplicitRules(t: Binary): Option[UriStr]      = t.implicitRules
  def extractSecurityContext(t: Binary): Option[Reference] = t.securityContext
  override val thisName: String                            = "Binary"
  def unapply(
      o: Binary): Option[(Option[String], Option[Meta], Option[Base64Binary], Option[LANGUAGES], Code, Option[UriStr], Option[Reference])] =
    Some((o.id, o.meta, o.data, o.language, o.contentType, o.implicitRules, o.securityContext))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Binary] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Binary(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Base64Binary]]("data", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Code]("contentType", None),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Reference]]("securityContext", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** A resource that represents the data of a single raw artifact as digital content accessible in its native format. A Binary
  * resource can contain any content, whether text, image, pdf, zip archive, etc.
  *
  * Subclass of [[core.model.Resource]] (This is the base resource type for everything.)
  *
  * @constructor
  *   Introduces the fields data, contentType, securityContext.
  * @param id
  *   \- The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   \- The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param data
  *   \- The actual content, base64 encoded.
  * @param language
  *   \- The base language in which the resource is written.
  * @param contentType
  *   \- MimeType of the binary content represented as a standard MimeType (BCP 13).
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param securityContext
  *   \- This element identifies another resource that can be used as a proxy of the security sensitivity to use when deciding and
  *   enforcing access control rules for the Binary resource. Given that the Binary resource contains very few elements that can
  *   be used to determine the sensitivity of the data and relationships to individuals, the referenced resource stands in as a
  *   proxy equivalent for this purpose. This referenced resource may be related to the Binary (e.g. Media, DocumentReference), or
  *   may be some non-related Resource purely as a security proxy. E.g. to identify that the binary resource relates to a patient,
  *   and access should only be granted to applications that have access to the patient.
  */
@POJOBoilerplate
class Binary(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    val data: Option[Base64Binary] = None,
    override val language: Option[LANGUAGES] = None,
    val contentType: Code,
    override val implicitRules: Option[UriStr] = None,
    val securityContext: Option[Reference] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Resource(
      id = id,
      meta = meta,
      language = language,
      implicitRules = implicitRules,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Binary"
}
