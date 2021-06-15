package com.babylonhealth.lit.uscore.model

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
import com.babylonhealth.lit.usbase.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.usbase.UnionAliases._

import com.babylonhealth.lit.{ core, hl7, usbase, uscore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Us_core_direct extends CompanionFor[Us_core_direct] {
  implicit def summonObjectAndCompanionUs_core_direct1315378894(
      o: Us_core_direct): ObjectAndCompanion[Us_core_direct, Us_core_direct.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/us/core/StructureDefinition/us-core-direct")
  def apply(
      id: Option[String] = None,
      value: Option[Boolean] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Us_core_direct = new Us_core_direct(
    id,
    value,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[Boolean]], true, lTagOf[Boolean])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Boolean]](value, t.value.map(_.toSubRefNonUnion[Boolean])),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension)
    ))
  override def fields(t: Us_core_direct): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Us_core_direct): Option[String]                   = t.id
  def extractValue(t: Us_core_direct): Option[Boolean]               = t.value.map(_.toSubRefNonUnion[Boolean])
  def extractExtension(t: Us_core_direct): LitSeq[Extension]         = t.extension
  override val thisName: String                                      = "Us_core_direct"
  override val searchParams: Map[String, Us_core_direct => Seq[Any]] = Extension.searchParams
  def unapply(o: Us_core_direct): Option[(Option[String], Option[Boolean], LitSeq[Extension])] = Some(
    (o.id, o.value.map(_.toSubRefNonUnion[Boolean]), o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Us_core_direct] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Us_core_direct(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Boolean]]("valueBoolean", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** This email address is associated with a [direct](http://wiki.directproject.org/Addressing+Specification) service.
  * This extension can only be used on contact points where the system = 'email'
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element -
  * found in all resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Hardcodes the value of the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does
  *   not contain spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *   [Extensibility](http://hl7.org/fhir/R4/extensibility.html) for a list).
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make
  *   the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use
  *   of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as
  *   part of the definition of the extension.
  */
@POJOBoilerplate
class Us_core_direct(
    override val id: Option[String] = None,
    value: Option[Boolean] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = value.map(choice(_)),
      extension = extension,
      url = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-direct",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
