package com.babylonhealth.lit.hl7.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.Try

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
import com.babylonhealth.lit.hl7.DEVICE_STATEMENT_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object DeviceUseStatement extends CompanionFor[DeviceUseStatement] {
  override val baseType: CompanionFor[DeviceUseStatement] = DeviceUseStatement
  type TimingChoice = Choice[Union00609373412]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: DEVICE_STATEMENT_STATUS,
      source: Option[Reference] = None,
      device: Reference,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      language: Option[LANGUAGES] = None,
      bodySite: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      timing: Option[DeviceUseStatement.TimingChoice] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      recordedOn: Option[FHIRDateTime] = None,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      derivedFrom: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): DeviceUseStatement = new DeviceUseStatement(
    id,
    meta,
    text,
    note,
    status,
    source,
    device,
    basedOn,
    subject,
    language,
    bodySite,
    contained,
    extension,
    timing,
    identifier,
    recordedOn,
    reasonCode,
    derivedFrom,
    implicitRules,
    reasonReference,
    modifierExtension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val status: FHIRComponentFieldMeta[DEVICE_STATEMENT_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[DEVICE_STATEMENT_STATUS], false, lTagOf[DEVICE_STATEMENT_STATUS])
  val source: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("source", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val device: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("device", lTagOf[Reference], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val bodySite: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("bodySite", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val timing: FHIRComponentFieldMeta[Option[DeviceUseStatement.TimingChoice]] =
    FHIRComponentFieldMeta("timing", lTagOf[Option[DeviceUseStatement.TimingChoice]], true, lTagOf[Union00609373412])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val recordedOn: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("recordedOn", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val derivedFrom: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("derivedFrom", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    note,
    status,
    source,
    device,
    basedOn,
    subject,
    language,
    bodySite,
    contained,
    extension,
    timing,
    identifier,
    recordedOn,
    reasonCode,
    derivedFrom,
    implicitRules,
    reasonReference,
    modifierExtension
  )
  override def fields(t: DeviceUseStatement): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[DEVICE_STATEMENT_STATUS](status, t.status),
    FHIRComponentField[Option[Reference]](source, t.source),
    FHIRComponentField[Reference](device, t.device),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[CodeableConcept]](bodySite, t.bodySite),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[DeviceUseStatement.TimingChoice]](timing, t.timing),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[FHIRDateTime]](recordedOn, t.recordedOn),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[LitSeq[Reference]](derivedFrom, t.derivedFrom),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
  )
  def extractId(t: DeviceUseStatement): Option[String]                              = t.id
  def extractMeta(t: DeviceUseStatement): Option[Meta]                              = t.meta
  def extractText(t: DeviceUseStatement): Option[Narrative]                         = t.text
  def extractNote(t: DeviceUseStatement): LitSeq[Annotation]                        = t.note
  def extractStatus(t: DeviceUseStatement): DEVICE_STATEMENT_STATUS                 = t.status
  def extractSource(t: DeviceUseStatement): Option[Reference]                       = t.source
  def extractDevice(t: DeviceUseStatement): Reference                               = t.device
  def extractBasedOn(t: DeviceUseStatement): LitSeq[Reference]                      = t.basedOn
  def extractSubject(t: DeviceUseStatement): Reference                              = t.subject
  def extractLanguage(t: DeviceUseStatement): Option[LANGUAGES]                     = t.language
  def extractBodySite(t: DeviceUseStatement): Option[CodeableConcept]               = t.bodySite
  def extractContained(t: DeviceUseStatement): LitSeq[Resource]                     = t.contained
  def extractExtension(t: DeviceUseStatement): LitSeq[Extension]                    = t.extension
  def extractTiming(t: DeviceUseStatement): Option[DeviceUseStatement.TimingChoice] = t.timing
  def extractIdentifier(t: DeviceUseStatement): LitSeq[Identifier]                  = t.identifier
  def extractRecordedOn(t: DeviceUseStatement): Option[FHIRDateTime]                = t.recordedOn
  def extractReasonCode(t: DeviceUseStatement): LitSeq[CodeableConcept]             = t.reasonCode
  def extractDerivedFrom(t: DeviceUseStatement): LitSeq[Reference]                  = t.derivedFrom
  def extractImplicitRules(t: DeviceUseStatement): Option[UriStr]                   = t.implicitRules
  def extractReasonReference(t: DeviceUseStatement): LitSeq[Reference]              = t.reasonReference
  def extractModifierExtension(t: DeviceUseStatement): LitSeq[Extension]            = t.modifierExtension
  override val thisName: String                                                     = "DeviceUseStatement"
  override val searchParams: Map[String, DeviceUseStatement => Seq[Any]] = Map(
    "device"     -> (obj => Seq(obj.device)),
    "identifier" -> (obj => obj.identifier.toSeq),
    "subject"    -> (obj => Seq(obj.subject)),
    "patient"    -> (obj => Seq(obj.subject))
  )
  def unapply(
      o: DeviceUseStatement): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[Annotation], DEVICE_STATEMENT_STATUS, Option[Reference], Reference, LitSeq[Reference], Reference, Option[LANGUAGES], Option[CodeableConcept], LitSeq[Resource], LitSeq[Extension], Option[DeviceUseStatement.TimingChoice], LitSeq[Identifier], Option[FHIRDateTime], LitSeq[CodeableConcept], LitSeq[Reference], Option[UriStr], LitSeq[Reference], LitSeq[Extension])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.note,
        o.status,
        o.source,
        o.device,
        o.basedOn,
        o.subject,
        o.language,
        o.bodySite,
        o.contained,
        o.extension,
        o.timing,
        o.identifier,
        o.recordedOn,
        o.reasonCode,
        o.derivedFrom,
        o.implicitRules,
        o.reasonReference,
        o.modifierExtension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DeviceUseStatement] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new DeviceUseStatement(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[DEVICE_STATEMENT_STATUS]("status", None),
          cursor.decodeAs[Option[Reference]]("source", Some(None)),
          cursor.decodeAs[Reference]("device", None),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("bodySite", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union00609373412]("timing"),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("recordedOn", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("derivedFrom", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields note, status, source, device, basedOn, subject, bodySite, timing, identifier, recordedOn, reasonCode, derivedFrom, reasonReference.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param note - Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
  * @param status - A code representing the patient or other source's judgment about the state of the device used that this statement is about.  Generally this will be active or completed.
  * @param source - Who reported the device was being used by the patient.
  * @param device - The details of the device used.
  * @param basedOn - A plan, proposal or order that is fulfilled in whole or in part by this DeviceUseStatement.
  * @param subject - The patient who used the device.
  * @param language - The base language in which the resource is written.
  * @param bodySite - Indicates the anotomic location on the subject's body where the device was used ( i.e. the target).
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param timing - How often the device was used.
  * @param identifier - An external identifier for this statement such as an IRI.
  * @param recordedOn - The time at which the statement was made/recorded.
  * @param reasonCode - Reason or justification for the use of the device.
  * @param derivedFrom - Allows linking the DeviceUseStatement to the underlying Request, or to other information that supports or is used to derive the DeviceUseStatement.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param reasonReference - Indicates another resource whose existence justifies this DeviceUseStatement.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  */
@POJOBoilerplate
class DeviceUseStatement(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val status: DEVICE_STATEMENT_STATUS,
    val source: Option[Reference] = None,
    val device: Reference,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val subject: Reference,
    override val language: Option[LANGUAGES] = None,
    val bodySite: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val timing: Option[DeviceUseStatement.TimingChoice] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val recordedOn: Option[FHIRDateTime] = None,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val derivedFrom: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends DomainResource(
      id = id,
      meta = meta,
      text = text,
      language = language,
      contained = contained,
      extension = extension,
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "DeviceUseStatement"
}
