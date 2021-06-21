package com.babylonhealth.lit.usbase.model

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
import com.babylonhealth.lit.usbase.UnionAliases._

import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Operationdefinition_profile extends CompanionFor[Operationdefinition_profile] {
  implicit def summonObjectAndCompanionOperationdefinition_profile_1465239998(
      o: Operationdefinition_profile): ObjectAndCompanion[Operationdefinition_profile, Operationdefinition_profile.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/operationdefinition-profile")
  def apply(
      id: Option[String] = None,
      value: UriStr,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Operationdefinition_profile = new Operationdefinition_profile(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[UriStr] =
    FHIRComponentFieldMeta("value", lTagOf[UriStr], true, lTagOf[UriStr])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[UriStr](value, t.value.get.toSubRefNonUnion[UriStr])
    ))
  override def fields(t: Operationdefinition_profile): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Operationdefinition_profile): Option[String]                   = t.id
  def extractValue(t: Operationdefinition_profile): UriStr                        = t.value.get.toSubRefNonUnion[UriStr]
  override val thisName: String                                                   = "Operationdefinition_profile"
  override val searchParams: Map[String, Operationdefinition_profile => Seq[Any]] = Extension.searchParams
  def unapply(o: Operationdefinition_profile): Option[(Option[String], UriStr)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[UriStr]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Operationdefinition_profile] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Operationdefinition_profile(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[UriStr]("valueUri", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Identifies a profile structure or implementation Guide that applies to the datatype this element refers to. If any
  * profiles are specified, then the content must conform to at least one of them. The URL can be a local reference - to
  * a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a
  * canonical URL. When an implementation guide is specified, the type SHALL conform to at least one profile defined in
  * the implementation guide.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element -
  * found in all resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Requires the following fields which were optional in
  *   the parent: value. Forbids the use of the following fields which were optional in the parent: extension. Hardcodes
  *   the value of the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does
  *   not contain spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *   [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Operationdefinition_profile(
    override val id: Option[String] = None,
    value: UriStr,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/operationdefinition-profile",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
