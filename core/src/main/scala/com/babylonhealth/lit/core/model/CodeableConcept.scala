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

object CodeableConcept extends CompanionFor[CodeableConcept] {
  implicit def summonObjectAndCompanionCodeableConcept1231013185(
      o: CodeableConcept): ObjectAndCompanion[CodeableConcept, CodeableConcept.type] = ObjectAndCompanion(o, this)
  override type ResourceType = CodeableConcept
  override type ParentType   = CodeableConcept
  override val baseType: CompanionFor[ResourceType] = CodeableConcept
  override val parentType: CompanionFor[ParentType] = CodeableConcept
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/CodeableConcept")
  def apply(
      id: Option[String] = None,
      text: Option[String] = None,
      coding: LitSeq[Coding] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): CodeableConcept = new CodeableConcept(
    id,
    text,
    coding,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val text: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
  val coding: FHIRComponentFieldMeta[LitSeq[Coding]] =
    FHIRComponentFieldMeta("coding", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, text, coding, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: CodeableConcept): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[String]](text, t.text),
    FHIRComponentField[LitSeq[Coding]](coding, t.coding),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: CodeableConcept): Option[String]           = t.id
  def extractText(t: CodeableConcept): Option[String]         = t.text
  def extractCoding(t: CodeableConcept): LitSeq[Coding]       = t.coding
  def extractExtension(t: CodeableConcept): LitSeq[Extension] = t.extension
  override val thisName: String                               = "CodeableConcept"
  def unapply(o: CodeableConcept): Option[(Option[String], Option[String], LitSeq[Coding], LitSeq[Extension])] = Some(
    (o.id, o.text, o.coding, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CodeableConcept] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new CodeableConcept(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[String]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Coding]]("coding", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for CodeableConcept Type: A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
  *
  *  Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a resource.)
  *
  * @constructor Introduces the fields text, coding.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param text - A human language representation of the concept as seen/selected/uttered by the user who entered the data and/or which represents the intended meaning of the user.
  * @param coding - A reference to a code defined by a terminology system.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  */
@POJOBoilerplate
class CodeableConcept(
    override val id: Option[String] = None,
    val text: Option[String] = None,
    val coding: LitSeq[Coding] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "CodeableConcept"
}
