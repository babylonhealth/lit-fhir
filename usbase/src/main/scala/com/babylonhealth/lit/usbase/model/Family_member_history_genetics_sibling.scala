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

object Family_member_history_genetics_sibling extends CompanionFor[Family_member_history_genetics_sibling] {
  override type ResourceType = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/family-member-history-genetics-sibling")
  def apply(
      id: Option[String] = None,
      extension: NonEmptyLitSeq[Extension],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Family_member_history_genetics_sibling = new Family_member_history_genetics_sibling(
    id,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val extension: FHIRComponentFieldMeta[NonEmptyLitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[NonEmptyLitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[NonEmptyLitSeq[Extension]](extension, t.extension.asNonEmpty)
    ))
  override def fields(t: Family_member_history_genetics_sibling): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Family_member_history_genetics_sibling): Option[String]                   = t.id
  def extractExtension(t: Family_member_history_genetics_sibling): NonEmptyLitSeq[Extension] = t.extension.asNonEmpty
  override val thisName: String                                                              = "Family_member_history_genetics_sibling"
  override val searchParams: Map[String, Family_member_history_genetics_sibling => Seq[Any]] = Extension.searchParams
  def unapply(o: Family_member_history_genetics_sibling): Option[(Option[String], NonEmptyLitSeq[Extension])] = Some(
    (o.id, o.extension.asNonEmpty))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Family_member_history_genetics_sibling] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Family_member_history_genetics_sibling(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[Extension]]("extension", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Identifies a sibling of the relative.
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Requires the following fields which were optional in the parent: extension.
  *              Forbids the use of the following fields which were optional in the parent: value.
  *              Hardcodes the value of the following fields: url.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  */
@POJOBoilerplate
class Family_member_history_genetics_sibling(
    override val id: Option[String] = None,
    extension: NonEmptyLitSeq[Extension],
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      extension = extension.refine,
      url = "http://hl7.org/fhir/StructureDefinition/family-member-history-genetics-sibling",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
