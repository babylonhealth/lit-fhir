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

object Identifier extends CompanionFor[Identifier] {
  implicit def summonObjectAndCompanionIdentifier_962757026(o: Identifier): ObjectAndCompanion[Identifier, Identifier.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Identifier
  override type ParentType   = Identifier
  override val baseType: CompanionFor[ResourceType] = Identifier
  override val parentType: CompanionFor[ParentType] = Identifier
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Identifier")
  def apply(
      id: Option[String] = None,
      use: Option[IDENTIFIER_USE] = None,
      `type`: Option[CodeableConcept] = None,
      value: Option[String] = None,
      system: Option[UriStr] = None,
      period: Option[Period] = None,
      assigner: Option[Reference] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Identifier = new Identifier(
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
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val value: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[String]], false, lTagOf[String])
  val system: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("system", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
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
  )
  def extractId(t: Identifier): Option[String]            = t.id
  def extractUse(t: Identifier): Option[IDENTIFIER_USE]   = t.use
  def extractType(t: Identifier): Option[CodeableConcept] = t.`type`
  def extractValue(t: Identifier): Option[String]         = t.value
  def extractSystem(t: Identifier): Option[UriStr]        = t.system
  def extractPeriod(t: Identifier): Option[Period]        = t.period
  def extractAssigner(t: Identifier): Option[Reference]   = t.assigner
  def extractExtension(t: Identifier): LitSeq[Extension]  = t.extension
  override val thisName: String                           = "Identifier"
  def unapply(
      o: Identifier): Option[(Option[String], Option[IDENTIFIER_USE], Option[CodeableConcept], Option[String], Option[UriStr], Option[Period], Option[Reference], LitSeq[Extension])] =
    Some((o.id, o.use, o.`type`, o.value, o.system, o.period, o.assigner, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Identifier] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Identifier(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[IDENTIFIER_USE]]("use", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[Option[String]]("value", Some(None)),
          cursor.decodeAs[Option[UriStr]]("system", Some(None)),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Option[Reference]]("assigner", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
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
  *     spaces.
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
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  */
@POJOBoilerplate
class Identifier(
    override val id: Option[String] = None,
    val use: Option[IDENTIFIER_USE] = None,
    val `type`: Option[CodeableConcept] = None,
    val value: Option[String] = None,
    val system: Option[UriStr] = None,
    val period: Option[Period] = None,
    val assigner: Option[Reference] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Identifier"
}
