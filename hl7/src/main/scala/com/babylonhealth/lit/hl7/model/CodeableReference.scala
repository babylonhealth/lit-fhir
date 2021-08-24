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

import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object CodeableReference extends CompanionFor[CodeableReference] {
  implicit def summonObjectAndCompanionCodeableReference_1143860497(
      o: CodeableReference): ObjectAndCompanion[CodeableReference, CodeableReference.type] = ObjectAndCompanion(o, this)
  override type ResourceType = CodeableReference
  override type ParentType   = CodeableReference
  override val baseType: CompanionFor[ResourceType] = CodeableReference
  override val parentType: CompanionFor[ParentType] = CodeableReference
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/CodeableReference")
  def apply(
      id: Option[String] = None,
      concept: Option[CodeableConcept] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      reference: Option[Reference] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): CodeableReference = new CodeableReference(
    id,
    concept,
    extension,
    reference,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val concept: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("concept", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val reference: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("reference", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, concept, extension, reference)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: CodeableReference): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[CodeableConcept]](concept, t.concept),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](reference, t.reference)
  )
  def extractId(t: CodeableReference): Option[String]               = t.id
  def extractConcept(t: CodeableReference): Option[CodeableConcept] = t.concept
  def extractExtension(t: CodeableReference): LitSeq[Extension]     = t.extension
  def extractReference(t: CodeableReference): Option[Reference]     = t.reference
  override val thisName: String                                     = "CodeableReference"
  def unapply(o: CodeableReference): Option[(Option[String], Option[CodeableConcept], LitSeq[Extension], Option[Reference])] =
    Some((o.id, o.concept, o.extension, o.reference))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CodeableReference] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new CodeableReference(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("concept", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("reference", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for CodeableReference Type: A reference to a resource (by instance), or instead, a reference to a
  * cencept defined in a terminology or ontology (by class).
  *
  * Subclass of [[core.model.DataType]] (Base StructureDefinition for DataType Type: The base class for all re-useable types
  * defined as part of the FHIR Specification.)
  *
  * @constructor
  *   Introduces the fields concept, reference.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param concept
  *   - A reference to a concept - e.g. the information is identified by it's general classto the degree of precision found in the
  *   terminology.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param reference
  *   - A reference to a resource the provides exact details about the information being referenced.
  */
@POJOBoilerplate
class CodeableReference(
    override val id: Option[String] = None,
    val concept: Option[CodeableConcept] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val reference: Option[Reference] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends DataType(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "CodeableReference"
}
