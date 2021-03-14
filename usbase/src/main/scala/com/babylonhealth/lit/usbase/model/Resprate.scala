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

object Resprate extends CompanionFor[Resprate] {
  override val baseType: CompanionFor[Observation] = Observation
  type EffectiveChoice = Choice[Union_0934386166]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/resprate"))),
      text: Option[Narrative] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      focus: LitSeq[Reference] = LitSeq.empty,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: OBSERVATION_STATUS,
      issued: Option[ZonedDateTime] = None,
      method: Option[CodeableConcept] = None,
      device: Option[Reference] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      language: Option[LANGUAGES] = None,
      category: NonEmptyLitSeq[CodeableConcept],
      value: Option[Quantity] = None,
      bodySite: Option[CodeableConcept] = None,
      specimen: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      performer: LitSeq[Reference] = LitSeq.empty,
      hasMember: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      derivedFrom: LitSeq[Reference] = LitSeq.empty,
      effective: Resprate.EffectiveChoice,
      implicitRules: Option[UriStr] = None,
      code: CodeableConcept,
      interpretation: LitSeq[CodeableConcept] = LitSeq.empty,
      dataAbsentReason: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      component: LitSeq[Observation.Component] = LitSeq.empty,
      referenceRange: LitSeq[Observation.ReferenceRange] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Resprate = new Resprate(
    id,
    meta,
    text,
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
    code,
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
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[NonEmptyLitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[NonEmptyLitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val value: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[Quantity]], true, lTagOf[Quantity])
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
  val effective: FHIRComponentFieldMeta[Resprate.EffectiveChoice] =
    FHIRComponentFieldMeta("effective", lTagOf[Resprate.EffectiveChoice], true, lTagOf[Union_0934386166])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val code: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
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
    code,
    interpretation,
    dataAbsentReason,
    modifierExtension,
    component,
    referenceRange
  )
  override def fields(t: Resprate): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[LitSeq[Reference]](focus, t.focus),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[OBSERVATION_STATUS](status, t.status),
    FHIRComponentField[Option[ZonedDateTime]](issued, t.issued),
    FHIRComponentField[Option[CodeableConcept]](method, t.method),
    FHIRComponentField[Option[Reference]](device, t.device),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Reference](subject, t.subject.get),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[NonEmptyLitSeq[CodeableConcept]](category, t.category.asNonEmpty),
    FHIRComponentField[Option[Quantity]](value, t.value.map(_.toSubRefNonUnion[Quantity])),
    FHIRComponentField[Option[CodeableConcept]](bodySite, t.bodySite),
    FHIRComponentField[Option[Reference]](specimen, t.specimen),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Reference]](performer, t.performer),
    FHIRComponentField[LitSeq[Reference]](hasMember, t.hasMember),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[Reference]](derivedFrom, t.derivedFrom),
    FHIRComponentField[Resprate.EffectiveChoice](effective, t.effective.get.toSubRef),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[CodeableConcept](code, t.code),
    FHIRComponentField[LitSeq[CodeableConcept]](interpretation, t.interpretation),
    FHIRComponentField[Option[CodeableConcept]](dataAbsentReason, t.dataAbsentReason),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Observation.Component]](component, t.component),
    FHIRComponentField[LitSeq[Observation.ReferenceRange]](referenceRange, t.referenceRange)
  )
  def extractId(t: Resprate): Option[String]                                 = t.id
  def extractMeta(t: Resprate): Option[Meta]                                 = t.meta
  def extractText(t: Resprate): Option[Narrative]                            = t.text
  def extractNote(t: Resprate): LitSeq[Annotation]                           = t.note
  def extractFocus(t: Resprate): LitSeq[Reference]                           = t.focus
  def extractPartOf(t: Resprate): LitSeq[Reference]                          = t.partOf
  def extractStatus(t: Resprate): OBSERVATION_STATUS                         = t.status
  def extractIssued(t: Resprate): Option[ZonedDateTime]                      = t.issued
  def extractMethod(t: Resprate): Option[CodeableConcept]                    = t.method
  def extractDevice(t: Resprate): Option[Reference]                          = t.device
  def extractBasedOn(t: Resprate): LitSeq[Reference]                         = t.basedOn
  def extractSubject(t: Resprate): Reference                                 = t.subject.get
  def extractLanguage(t: Resprate): Option[LANGUAGES]                        = t.language
  def extractCategory(t: Resprate): NonEmptyLitSeq[CodeableConcept]          = t.category.asNonEmpty
  def extractValue(t: Resprate): Option[Quantity]                            = t.value.map(_.toSubRefNonUnion[Quantity])
  def extractBodySite(t: Resprate): Option[CodeableConcept]                  = t.bodySite
  def extractSpecimen(t: Resprate): Option[Reference]                        = t.specimen
  def extractContained(t: Resprate): LitSeq[Resource]                        = t.contained
  def extractExtension(t: Resprate): LitSeq[Extension]                       = t.extension
  def extractEncounter(t: Resprate): Option[Reference]                       = t.encounter
  def extractPerformer(t: Resprate): LitSeq[Reference]                       = t.performer
  def extractHasMember(t: Resprate): LitSeq[Reference]                       = t.hasMember
  def extractIdentifier(t: Resprate): LitSeq[Identifier]                     = t.identifier
  def extractDerivedFrom(t: Resprate): LitSeq[Reference]                     = t.derivedFrom
  def extractEffective(t: Resprate): Resprate.EffectiveChoice                = t.effective.get.toSubRef
  def extractImplicitRules(t: Resprate): Option[UriStr]                      = t.implicitRules
  def extractCode(t: Resprate): CodeableConcept                              = t.code
  def extractInterpretation(t: Resprate): LitSeq[CodeableConcept]            = t.interpretation
  def extractDataAbsentReason(t: Resprate): Option[CodeableConcept]          = t.dataAbsentReason
  def extractModifierExtension(t: Resprate): LitSeq[Extension]               = t.modifierExtension
  def extractComponent(t: Resprate): LitSeq[Observation.Component]           = t.component
  def extractReferenceRange(t: Resprate): LitSeq[Observation.ReferenceRange] = t.referenceRange
  override val thisName: String                                              = "Resprate"
  override val searchParams: Map[String, Resprate => Seq[Any]]               = Vitalsigns.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Resprate] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Resprate(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("focus", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[OBSERVATION_STATUS]("status", None),
          cursor.decodeAs[Option[ZonedDateTime]]("issued", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
          cursor.decodeAs[Option[Reference]]("device", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[CodeableConcept]]("category", None),
          cursor.decodeAs[Option[Quantity]]("valueQuantity", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("bodySite", Some(None)),
          cursor.decodeAs[Option[Reference]]("specimen", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("hasMember", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("derivedFrom", Some(LitSeq.empty)),
          cursor.decodeRef[Union_0934386166]("effective"),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[CodeableConcept]("code", None),
          cursor.decodeAs[LitSeq[CodeableConcept]]("interpretation", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("dataAbsentReason", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Observation.Component]]("component", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Observation.ReferenceRange]]("referenceRange", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** FHIR Respiratory Rate Profile
  *
  *  Subclass of [[usbase.model.Vitalsigns]] (FHIR Vital Signs Profile)
  *
  * @constructor Inherits all params from parent.
  *              Refines the types of: value.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
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
  * @param value - Vital Signs value are recorded using the Quantity data type. For supporting observations such as Cuff size could use other datatypes such as CodeableConcept.
  * @param bodySite - Indicates the site on the subject's body where the observation was made (i.e. the target site).
  * @param specimen - The specimen that was used when this observation was made.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param encounter - The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made.
  * @param performer - Who was responsible for asserting the observed value as "true".
  * @param hasMember - Used when reporting vital signs panel components.
  * @param identifier - A unique identifier assigned to this observation.
  * @param derivedFrom - The target resource that represents a measurement from which this observation value is derived. For example, a calculated anion gap or a fetal measurement based on an ultrasound image.
  * @param effective - Often just a dateTime for Vital Signs.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param code - Respiratory Rate.
  * @param interpretation - A categorical assessment of an observation value.  For example, high, low, normal.
  * @param dataAbsentReason - Provides a reason why the expected value in the element Observation.value[x] is missing.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param component - Used when reporting systolic and diastolic blood pressure.
  * @param referenceRange - Guidance on how to interpret the value by comparison to a normal or recommended range.  Multiple reference ranges are interpreted as an "OR".   In other words, to represent two distinct target populations, two `referenceRange` elements would be used.
  */
@POJOBoilerplate
class Resprate(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/resprate"))),
    override val text: Option[Narrative] = None,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val focus: LitSeq[Reference] = LitSeq.empty,
    override val partOf: LitSeq[Reference] = LitSeq.empty,
    override val status: OBSERVATION_STATUS,
    override val issued: Option[ZonedDateTime] = None,
    override val method: Option[CodeableConcept] = None,
    override val device: Option[Reference] = None,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    subject: Reference,
    override val language: Option[LANGUAGES] = None,
    category: NonEmptyLitSeq[CodeableConcept],
    value: Option[Quantity] = None,
    override val bodySite: Option[CodeableConcept] = None,
    override val specimen: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val encounter: Option[Reference] = None,
    override val performer: LitSeq[Reference] = LitSeq.empty,
    override val hasMember: LitSeq[Reference] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val derivedFrom: LitSeq[Reference] = LitSeq.empty,
    effective: Resprate.EffectiveChoice,
    override val implicitRules: Option[UriStr] = None,
    override val code: CodeableConcept,
    override val interpretation: LitSeq[CodeableConcept] = LitSeq.empty,
    override val dataAbsentReason: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val component: LitSeq[Observation.Component] = LitSeq.empty,
    override val referenceRange: LitSeq[Observation.ReferenceRange] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Vitalsigns(
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
      value = value.map(choice(_)),
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
