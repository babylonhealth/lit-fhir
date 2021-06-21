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

object Coding extends CompanionFor[Coding] {
  implicit def summonObjectAndCompanionCoding_462683970(o: Coding): ObjectAndCompanion[Coding, Coding.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Coding
  override type ParentType   = Coding
  override val baseType: CompanionFor[ResourceType] = Coding
  override val parentType: CompanionFor[ParentType] = Coding
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Coding")
  def apply(
      id: Option[String] = None,
      code: Option[Code] = None,
      system: Option[UriStr] = None,
      version: Option[String] = None,
      display: Option[String] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      userSelected: Option[Boolean] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Coding = new Coding(
    id,
    code,
    system,
    version,
    display,
    extension,
    userSelected,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val code: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[Code]], false, lTagOf[Code])
  val system: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("system", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val display: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("display", lTagOf[Option[String]], false, lTagOf[String])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val userSelected: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("userSelected", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, system, version, display, extension, userSelected)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Coding): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Code]](code, t.code),
    FHIRComponentField[Option[UriStr]](system, t.system),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[Option[String]](display, t.display),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Boolean]](userSelected, t.userSelected)
  )
  def extractId(t: Coding): Option[String]            = t.id
  def extractCode(t: Coding): Option[Code]            = t.code
  def extractSystem(t: Coding): Option[UriStr]        = t.system
  def extractVersion(t: Coding): Option[String]       = t.version
  def extractDisplay(t: Coding): Option[String]       = t.display
  def extractExtension(t: Coding): LitSeq[Extension]  = t.extension
  def extractUserSelected(t: Coding): Option[Boolean] = t.userSelected
  override val thisName: String                       = "Coding"
  def unapply(
      o: Coding): Option[(Option[String], Option[Code], Option[UriStr], Option[String], Option[String], LitSeq[Extension], Option[Boolean])] =
    Some((o.id, o.code, o.system, o.version, o.display, o.extension, o.userSelected))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Coding] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Coding(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Code]]("code", Some(None)),
          cursor.decodeAs[Option[UriStr]]("system", Some(None)),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[Option[String]]("display", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("userSelected", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Coding Type: A reference to a code defined by a terminology system.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields code, system, version, display, userSelected.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does
  *   not contain spaces.
  * @param code
  *   - A symbol in syntax defined by the system. The symbol may be a predefined code or an expression in a syntax
  *   defined by the coding system (e.g. post-coordination).
  * @param system
  *   - The identification of the code system that defines the meaning of the symbol in the code.
  * @param version
  *   - The version of the code system which was used when choosing this code. Note that a well-maintained code system
  *   does not need the version reported, because the meaning of codes is consistent across versions. However this
  *   cannot consistently be assured, and when the meaning is not guaranteed to be consistent, the version SHOULD be
  *   exchanged.
  * @param display
  *   - A representation of the meaning of the code in the system, following the rules of the system.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make
  *   the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use
  *   of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as
  *   part of the definition of the extension.
  * @param userSelected
  *   - Indicates that this coding was chosen by a user directly - e.g. off a pick list of available items (codes or
  *   displays).
  */
@POJOBoilerplate
class Coding(
    override val id: Option[String] = None,
    val code: Option[Code] = None,
    val system: Option[UriStr] = None,
    val version: Option[String] = None,
    val display: Option[String] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val userSelected: Option[Boolean] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Coding"
}
