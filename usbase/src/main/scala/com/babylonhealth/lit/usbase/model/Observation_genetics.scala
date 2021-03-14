package com.babylonhealth.lit.usbase.model

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
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Observation_genetics extends CompanionFor[Observation_genetics] {
  override val baseType: CompanionFor[Observation] = Observation
  type ValueChoice     = Choice[Union_0802685816]
  type EffectiveChoice = Choice[Union01473702374]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/observation-genetics"))),
      text: Option[Narrative] = None,
      code: CodeableConcept,
      note: LitSeq[Annotation] = LitSeq.empty,
      focus: LitSeq[Reference] = LitSeq.empty,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: OBSERVATION_STATUS,
      issued: Option[ZonedDateTime] = None,
      method: Option[CodeableConcept] = None,
      device: Option[Reference] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      value: Option[Observation_genetics.ValueChoice] = None,
      bodySite: Option[CodeableConcept] = None,
      specimen: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      performer: LitSeq[Reference] = LitSeq.empty,
      hasMember: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      derivedFrom: LitSeq[Reference] = LitSeq.empty,
      effective: Option[Observation_genetics.EffectiveChoice] = None,
      implicitRules: Option[UriStr] = None,
      interpretation: LitSeq[CodeableConcept] = LitSeq.empty,
      dataAbsentReason: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      component: LitSeq[Observation.Component] = LitSeq.empty,
      referenceRange: LitSeq[Observation.ReferenceRange] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Observation_genetics = new Observation_genetics(
    id,
    meta,
    text,
    code,
    note,
    focus,
    partOf,
    status,
    issued,
    method,
    device,
    basedOn,
    subject,
    language,
    category,
    value,
    bodySite,
    specimen,
    contained,
    extension,
    encounter,
    performer,
    hasMember,
    identifier,
    derivedFrom,
    effective,
    implicitRules,
    interpretation,
    dataAbsentReason,
    modifierExtension,
    component,
    referenceRange,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val code: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val focus: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("focus", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[OBSERVATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[OBSERVATION_STATUS], false, lTagOf[OBSERVATION_STATUS])
  val issued: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
    FHIRComponentFieldMeta("issued", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
  val method: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val device: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("device", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val value: FHIRComponentFieldMeta[Option[Observation_genetics.ValueChoice]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[Observation_genetics.ValueChoice]], true, lTagOf[Union_0802685816])
  val bodySite: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("bodySite", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val specimen: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("specimen", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val performer: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val hasMember: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("hasMember", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val derivedFrom: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("derivedFrom", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val effective: FHIRComponentFieldMeta[Option[Observation_genetics.EffectiveChoice]] =
    FHIRComponentFieldMeta(
      "effective",
      lTagOf[Option[Observation_genetics.EffectiveChoice]],
      true,
      lTagOf[Union01473702374])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val interpretation: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("interpretation", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val dataAbsentReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("dataAbsentReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val component: FHIRComponentFieldMeta[LitSeq[Observation.Component]] =
    FHIRComponentFieldMeta("component", lTagOf[LitSeq[Observation.Component]], false, lTagOf[Observation.Component])
  val referenceRange: FHIRComponentFieldMeta[LitSeq[Observation.ReferenceRange]] =
    FHIRComponentFieldMeta(
      "referenceRange",
      lTagOf[LitSeq[Observation.ReferenceRange]],
      false,
      lTagOf[Observation.ReferenceRange])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    note,
    focus,
    partOf,
    status,
    issued,
    method,
    device,
    basedOn,
    subject,
    language,
    category,
    value,
    bodySite,
    specimen,
    contained,
    extension,
    encounter,
    performer,
    hasMember,
    identifier,
    derivedFrom,
    effective,
    implicitRules,
    interpretation,
    dataAbsentReason,
    modifierExtension,
    component,
    referenceRange
  )
  override def fields(t: Observation_genetics): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[CodeableConcept](code, t.code),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[LitSeq[Reference]](focus, t.focus),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[OBSERVATION_STATUS](status, t.status),
    FHIRComponentField[Option[ZonedDateTime]](issued, t.issued),
    FHIRComponentField[Option[CodeableConcept]](method, t.method),
    FHIRComponentField[Option[Reference]](device, t.device),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[Observation_genetics.ValueChoice]](value, t.value),
    FHIRComponentField[Option[CodeableConcept]](bodySite, t.bodySite),
    FHIRComponentField[Option[Reference]](specimen, t.specimen),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Reference]](performer, t.performer),
    FHIRComponentField[LitSeq[Reference]](hasMember, t.hasMember),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[Reference]](derivedFrom, t.derivedFrom),
    FHIRComponentField[Option[Observation_genetics.EffectiveChoice]](effective, t.effective),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[CodeableConcept]](interpretation, t.interpretation),
    FHIRComponentField[Option[CodeableConcept]](dataAbsentReason, t.dataAbsentReason),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Observation.Component]](component, t.component),
    FHIRComponentField[LitSeq[Observation.ReferenceRange]](referenceRange, t.referenceRange)
  )
  def extractId(t: Observation_genetics): Option[String]                                      = t.id
  def extractMeta(t: Observation_genetics): Option[Meta]                                      = t.meta
  def extractText(t: Observation_genetics): Option[Narrative]                                 = t.text
  def extractCode(t: Observation_genetics): CodeableConcept                                   = t.code
  def extractNote(t: Observation_genetics): LitSeq[Annotation]                                = t.note
  def extractFocus(t: Observation_genetics): LitSeq[Reference]                                = t.focus
  def extractPartOf(t: Observation_genetics): LitSeq[Reference]                               = t.partOf
  def extractStatus(t: Observation_genetics): OBSERVATION_STATUS                              = t.status
  def extractIssued(t: Observation_genetics): Option[ZonedDateTime]                           = t.issued
  def extractMethod(t: Observation_genetics): Option[CodeableConcept]                         = t.method
  def extractDevice(t: Observation_genetics): Option[Reference]                               = t.device
  def extractBasedOn(t: Observation_genetics): LitSeq[Reference]                              = t.basedOn
  def extractSubject(t: Observation_genetics): Option[Reference]                              = t.subject
  def extractLanguage(t: Observation_genetics): Option[LANGUAGES]                             = t.language
  def extractCategory(t: Observation_genetics): LitSeq[CodeableConcept]                       = t.category
  def extractValue(t: Observation_genetics): Option[Observation_genetics.ValueChoice]         = t.value
  def extractBodySite(t: Observation_genetics): Option[CodeableConcept]                       = t.bodySite
  def extractSpecimen(t: Observation_genetics): Option[Reference]                             = t.specimen
  def extractContained(t: Observation_genetics): LitSeq[Resource]                             = t.contained
  def extractExtension(t: Observation_genetics): LitSeq[Extension]                            = t.extension
  def extractEncounter(t: Observation_genetics): Option[Reference]                            = t.encounter
  def extractPerformer(t: Observation_genetics): LitSeq[Reference]                            = t.performer
  def extractHasMember(t: Observation_genetics): LitSeq[Reference]                            = t.hasMember
  def extractIdentifier(t: Observation_genetics): LitSeq[Identifier]                          = t.identifier
  def extractDerivedFrom(t: Observation_genetics): LitSeq[Reference]                          = t.derivedFrom
  def extractEffective(t: Observation_genetics): Option[Observation_genetics.EffectiveChoice] = t.effective
  def extractImplicitRules(t: Observation_genetics): Option[UriStr]                           = t.implicitRules
  def extractInterpretation(t: Observation_genetics): LitSeq[CodeableConcept]                 = t.interpretation
  def extractDataAbsentReason(t: Observation_genetics): Option[CodeableConcept]               = t.dataAbsentReason
  def extractModifierExtension(t: Observation_genetics): LitSeq[Extension]                    = t.modifierExtension
  def extractComponent(t: Observation_genetics): LitSeq[Observation.Component]                = t.component
  def extractReferenceRange(t: Observation_genetics): LitSeq[Observation.ReferenceRange]      = t.referenceRange
  override val thisName: String                                                               = "Observation_genetics"
  override val searchParams: Map[String, Observation_genetics => Seq[Any]]                    = Observation.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Observation_genetics] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Observation_genetics(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("code", None),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("focus", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[OBSERVATION_STATUS]("status", None),
          cursor.decodeAs[Option[ZonedDateTime]]("issued", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
          cursor.decodeAs[Option[Reference]]("device", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union_0802685816]("value"),
          cursor.decodeAs[Option[CodeableConcept]]("bodySite", Some(None)),
          cursor.decodeAs[Option[Reference]]("specimen", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("hasMember", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("derivedFrom", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union01473702374]("effective"),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("interpretation", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("dataAbsentReason", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Observation.Component]]("component", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Observation.ReferenceRange]]("referenceRange", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Describes how the observation resource is used to report structured genetic test results
  *
  *  Subclass of [[hl7.model.Observation]] (Measurements and simple assertions made about a patient, device or other subject.)
  *
  * @constructor Inherits all params from parent.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param code - Describes what was observed. Sometimes this is called the observation "name".
  * @param note - Comments about the observation or the results.
  * @param focus - The actual focus of an observation when it is not the patient of record representing something or someone associated with the patient such as a spouse, parent, fetus, or donor. For example, fetus observations in a mother's record.  The focus of an observation could also be an existing condition,  an intervention, the subject's diet,  another observation of the subject,  or a body structure such as tumor or implanted device.   An example use case would be using the Observation resource to capture whether the mother is trained to change her child's tracheostomy tube. In this example, the child is the patient of record and the mother is the focus.
  * @param partOf - A larger event of which this particular Observation is a component or step.  For example,  an observation as part of a procedure.
  * @param status - The status of the result value.
  * @param issued - The date and time this version of the observation was made available to providers, typically after the results have been reviewed and verified.
  * @param method - Indicates the mechanism used to perform the observation.
  * @param device - The device used to generate the observation data.
  * @param basedOn - A plan, proposal or order that is fulfilled in whole or in part by this event.  For example, a MedicationRequest may require a patient to have laboratory test performed before  it is dispensed.
  * @param subject - The patient, or group of patients, location, or device this observation is about and into whose record the observation is placed. If the actual focus of the observation is different from the subject (or a sample of, part, or region of the subject), the `focus` element or the `code` itself specifies the actual focus of the observation.
  * @param language - The base language in which the resource is written.
  * @param category - A code that classifies the general type of observation being made.
  * @param value - The information determined as a result of making the observation, if the information has a simple value.
  * @param bodySite - Indicates the site on the subject's body where the observation was made (i.e. the target site).
  * @param specimen - The specimen that was used when this observation was made.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - An Extension
  * @param encounter - The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made.
  * @param performer - Who was responsible for asserting the observed value as "true".
  * @param hasMember - This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.
  * @param identifier - A unique identifier assigned to this observation.
  * @param derivedFrom - The target resource that represents a measurement from which this observation value is derived. For example, a calculated anion gap or a fetal measurement based on an ultrasound image.
  * @param effective - The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the "physiologically relevant time". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param interpretation - A categorical assessment of an observation value.  For example, high, low, normal.
  * @param dataAbsentReason - Provides a reason why the expected value in the element Observation.value[x] is missing.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param component - Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
  * @param referenceRange - Guidance on how to interpret the value by comparison to a normal or recommended range.  Multiple reference ranges are interpreted as an "OR".   In other words, to represent two distinct target populations, two `referenceRange` elements would be used.
  */
@POJOBoilerplate
class Observation_genetics(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/observation-genetics"))),
    override val text: Option[Narrative] = None,
    override val code: CodeableConcept,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val focus: LitSeq[Reference] = LitSeq.empty,
    override val partOf: LitSeq[Reference] = LitSeq.empty,
    override val status: OBSERVATION_STATUS,
    override val issued: Option[ZonedDateTime] = None,
    override val method: Option[CodeableConcept] = None,
    override val device: Option[Reference] = None,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val subject: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    override val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val value: Option[Observation_genetics.ValueChoice] = None,
    override val bodySite: Option[CodeableConcept] = None,
    override val specimen: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val encounter: Option[Reference] = None,
    override val performer: LitSeq[Reference] = LitSeq.empty,
    override val hasMember: LitSeq[Reference] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val derivedFrom: LitSeq[Reference] = LitSeq.empty,
    override val effective: Option[Observation_genetics.EffectiveChoice] = None,
    override val implicitRules: Option[UriStr] = None,
    override val interpretation: LitSeq[CodeableConcept] = LitSeq.empty,
    override val dataAbsentReason: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val component: LitSeq[Observation.Component] = LitSeq.empty,
    override val referenceRange: LitSeq[Observation.ReferenceRange] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Observation(
      id = id,
      meta = meta,
      text = text,
      code = code,
      note = note,
      focus = focus,
      partOf = partOf,
      status = status,
      issued = issued,
      method = method,
      device = device,
      basedOn = basedOn,
      subject = subject,
      language = language,
      category = category,
      value = value,
      bodySite = bodySite,
      specimen = specimen,
      contained = contained,
      extension = extension,
      encounter = encounter,
      performer = performer,
      hasMember = hasMember,
      identifier = identifier,
      derivedFrom = derivedFrom,
      effective = effective,
      implicitRules = implicitRules,
      interpretation = interpretation,
      dataAbsentReason = dataAbsentReason,
      modifierExtension = modifierExtension,
      component = component,
      referenceRange = referenceRange,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Observation"
}
