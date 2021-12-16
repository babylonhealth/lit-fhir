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
import com.babylonhealth.lit.hl7.NARRATIVE_STATUS
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Narrative extends CompanionFor[Narrative] {
  implicit def summonObjectAndCompanionNarrative_583701475(o: Narrative): ObjectAndCompanion[Narrative, Narrative.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Narrative
  override type ParentType   = Narrative
  override val baseType: CompanionFor[ResourceType] = Narrative
  override val parentType: CompanionFor[ParentType] = Narrative
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Narrative")
  def apply(
      id: Option[String] = None,
      div: XHTML,
      status: NARRATIVE_STATUS,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Narrative = new Narrative(
    id,
    div,
    status,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val div: FHIRComponentFieldMeta[XHTML] =
    FHIRComponentFieldMeta("div", lTagOf[XHTML], false, lTagOf[XHTML])
  val status: FHIRComponentFieldMeta[NARRATIVE_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[NARRATIVE_STATUS], false, lTagOf[NARRATIVE_STATUS])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, div, status, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Narrative): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[XHTML](div, t.div),
    FHIRComponentField[NARRATIVE_STATUS](status, t.status),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: Narrative): Option[String]           = t.id
  def extractDiv(t: Narrative): XHTML                   = t.div
  def extractStatus(t: Narrative): NARRATIVE_STATUS     = t.status
  def extractExtension(t: Narrative): LitSeq[Extension] = t.extension
  override val thisName: String                         = "Narrative"
  def unapply(o: Narrative): Option[(Option[String], XHTML, NARRATIVE_STATUS, LitSeq[Extension])] = Some(
    (o.id, o.div, o.status, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Narrative] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Narrative(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[XHTML]("div", None),
          cursor.decodeAs[NARRATIVE_STATUS]("status", None),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Narrative Type: A human-readable summary of the resource conveying the essential clinical and
  * business information for the resource.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields div, status.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *     spaces.
  * @param div
  *   - The actual narrative content, a stripped down version of XHTML.
  * @param status
  *   - The status of the narrative - whether it's entirely generated (from just the defined data or the extensions too), or
  *     whether a human authored it and it may contain additional data.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  */
@POJOBoilerplate
class Narrative(
    override val id: Option[String] = None,
    val div: XHTML,
    val status: NARRATIVE_STATUS,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Narrative"
}
