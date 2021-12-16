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

object Observation_geneticsAminoAcidChange extends CompanionFor[Observation_geneticsAminoAcidChange] {
  implicit def summonObjectAndCompanionObservation_geneticsAminoAcidChange_1251055237(
      o: Observation_geneticsAminoAcidChange): ObjectAndCompanion[Observation_geneticsAminoAcidChange, Observation_geneticsAminoAcidChange.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/observation-geneticsAminoAcidChange")
  def apply(
      id: Option[String] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Observation_geneticsAminoAcidChange = new Observation_geneticsAminoAcidChange(
    id,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension)
    ))
  override def fields(t: Observation_geneticsAminoAcidChange): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Observation_geneticsAminoAcidChange): Option[String]                   = t.id
  def extractExtension(t: Observation_geneticsAminoAcidChange): LitSeq[Extension]         = t.extension
  override val thisName: String                                                           = "Observation_geneticsAminoAcidChange"
  override val searchParams: Map[String, Observation_geneticsAminoAcidChange => Seq[Any]] = Extension.searchParams
  def unapply(o: Observation_geneticsAminoAcidChange): Option[(Option[String], LitSeq[Extension])] = Some((o.id, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Observation_geneticsAminoAcidChange] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Observation_geneticsAminoAcidChange(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** AminoAcidChange information.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all
  * resources.)
  *
  * @constructor
  *   Inherits all params from parent. Forbids the use of the following fields which were optional in the parent: value. Hardcodes
  *   the value of the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class Observation_geneticsAminoAcidChange(
    override val id: Option[String] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      extension = extension,
      url = "http://hl7.org/fhir/StructureDefinition/observation-geneticsAminoAcidChange",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
