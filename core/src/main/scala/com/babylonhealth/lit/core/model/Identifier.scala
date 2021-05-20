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
import com.babylonhealth.lit.core.IDENTIFIER_USE
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

<<<<<<< HEAD
object Identifier extends CompanionFor[Identifier] {
  implicit def summonObjectAndCompanionIdentifier_962757026(o: Identifier): ObjectAndCompanion[Identifier, Identifier.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Identifier
  override type ParentType   = Identifier
  override val baseType: CompanionFor[ResourceType] = Identifier
  override val parentType: CompanionFor[ParentType] = Identifier
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Identifier")
  def apply(
=======
object Identifier extends CompanionFor[Identifier[_]] {
  override type ResourceType[T] = Identifier[T]
  override val baseType: CompanionFor[ResourceType[_]] = Identifier
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Identifier")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      use: Option[IDENTIFIER_USE] = None,
      `type`: Option[CodeableConcept[Stage]] = None,
      value: Option[String] = None,
      system: Option[UriStr] = None,
      period: Option[Period[Stage]] = None,
      assigner: Option[Reference[Stage]] = None,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Identifier[Stage] = new Identifier[Stage](
    id,
    use,
    `type`,
    value,
    system,
    period,
    assigner,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val use: FHIRComponentFieldMeta[Option[IDENTIFIER_USE]] =
    FHIRComponentFieldMeta("use", lTagOf[Option[IDENTIFIER_USE]], false, lTagOf[IDENTIFIER_USE])
  def `type`[Stage]: FHIRComponentFieldMeta[Option[CodeableConcept[Stage]]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept[Stage]]], false, lTagOf[CodeableConcept[Stage]])
  val value: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[String]], false, lTagOf[String])
  val system: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("system", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
<<<<<<< HEAD
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val assigner: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("assigner", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, use, `type`, value, system, period, assigner, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Identifier): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[IDENTIFIER_USE]](use, t.use),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[String]](value, t.value),
    FHIRComponentField[Option[UriStr]](system, t.system),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[Option[Reference]](assigner, t.assigner),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
=======
  def period[Stage]: FHIRComponentFieldMeta[Option[Period[Stage]]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period[Stage]]], false, lTagOf[Period[Stage]])
  def assigner[Stage]: FHIRComponentFieldMeta[Option[Reference[Stage]]] =
    FHIRComponentFieldMeta("assigner", lTagOf[Option[Reference[Stage]]], false, lTagOf[Reference[Stage]])
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, use, `type`, value, system, period, assigner, extension)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Identifier[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, Option[IDENTIFIER_USE]](use, t.use),
    FHIRComponentField[Stage, Option[CodeableConcept[Stage]]](`type`, t.`type`),
    FHIRComponentField[Stage, Option[String]](value, t.value),
    FHIRComponentField[Stage, Option[UriStr]](system, t.system),
    FHIRComponentField[Stage, Option[Period[Stage]]](period, t.period),
    FHIRComponentField[Stage, Option[Reference[Stage]]](assigner, t.assigner),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension)
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
  )
  def extractId(t: Identifier[_]): Option[String]                              = t.id
  def extractUse(t: Identifier[_]): Option[IDENTIFIER_USE]                     = t.use
  def extractType[Stage](t: Identifier[Stage]): Option[CodeableConcept[Stage]] = t.`type`
  def extractValue(t: Identifier[_]): Option[String]                           = t.value
  def extractSystem(t: Identifier[_]): Option[UriStr]                          = t.system
  def extractPeriod[Stage](t: Identifier[Stage]): Option[Period[Stage]]        = t.period
  def extractAssigner[Stage](t: Identifier[Stage]): Option[Reference[Stage]]   = t.assigner
  def extractExtension[Stage](t: Identifier[Stage]): LitSeq[Extension[Stage]]  = t.extension
  override val thisName: String                                                = "Identifier"
  def unapply[Stage <: LifecycleStage: ValueOf](o: Identifier[
    Stage]): Option[(Option[String], Option[IDENTIFIER_USE], Option[CodeableConcept[Stage]], Option[String], Option[UriStr], Option[Period[Stage]], Option[Reference[Stage]], LitSeq[Extension[Stage]])] =
    Some((o.id, o.use, o.`type`, o.value, o.system, o.period, o.assigner, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Identifier[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Identifier[Completed.type](
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[IDENTIFIER_USE]]("use", Some(None)),
          cursor.decodeAs[Option[CodeableConcept[Completed.type]]]("type", Some(None)),
          cursor.decodeAs[Option[String]]("value", Some(None)),
          cursor.decodeAs[Option[UriStr]]("system", Some(None)),
          cursor.decodeAs[Option[Period[Completed.type]]]("period", Some(None)),
          cursor.decodeAs[Option[Reference[Completed.type]]]("assigner", Some(None)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Identifier Type: An identifier - identifies some entity uniquely and unambiguously. Typically
  * this is used for business identifiers.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields use, `type`, value, system, period, assigner.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param use
  *   - The purpose of this identifier.
  * @param `type`
  *   - A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.
  * @param value
  *   - The portion of the identifier typically relevant to the user and which is unique within the context of the system.
  * @param system
  *   - Establishes the namespace for the value - that is, a URL that describes a set values that are unique.
  * @param period
  *   - Time period during which identifier is/was valid for use.
  * @param assigner
  *   - Organization that issued/manages the identifier.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class Identifier[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val use: Option[IDENTIFIER_USE] = None,
    val `type`: Option[CodeableConcept[Stage]] = None,
    val value: Option[String] = None,
    val system: Option[UriStr] = None,
    val period: Option[Period[Stage]] = None,
    val assigner: Option[Reference[Stage]] = None,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Identifier"
}
