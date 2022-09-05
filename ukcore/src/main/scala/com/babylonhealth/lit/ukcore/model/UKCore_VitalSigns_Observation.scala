package com.babylonhealth.lit.ukcore.model

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
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_VitalSigns_Observation extends CompanionFor[UKCore_VitalSigns_Observation] {
  implicit def summonObjectAndCompanionUKCore_VitalSigns_Observation298092760(
      o: UKCore_VitalSigns_Observation): ObjectAndCompanion[UKCore_VitalSigns_Observation, UKCore_VitalSigns_Observation.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Observation
  override type ParentType   = UKCore_Observation
  override val baseType: CompanionFor[ResourceType] = Observation
  override val parentType: CompanionFor[ParentType] = UKCore_Observation
  override val profileUrl: Option[String] = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-VitalSigns-Observation")
  type ValueChoice     = Choice[Union02118820890]
  type EffectiveChoice = Choice[Union00107722725]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-VitalSigns-Observation"))),
      text: Option[Narrative] = None,
      status: OBSERVATION_STATUS,
      issued: Option[ZonedDateTime] = None,
      method: Option[CodeableConcept] = None,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      value: Option[UKCore_VitalSigns_Observation.ValueChoice] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      effective: Option[UKCore_VitalSigns_Observation.EffectiveChoice] = None,
      implicitRules: Option[UriStr] = None,
      code: CodeableConcept,
      interpretation: LitSeq[CodeableConcept] = LitSeq.empty,
      note: LitSeq[Annotation] = LitSeq.empty,
      dataAbsentReason: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      bodySite: Option[CodeableConcept] = None,
      focus: LitSeq[Reference] = LitSeq.empty,
      partOf: LitSeq[Reference] = LitSeq.empty,
      device: Option[Reference] = None,
      component: LitSeq[Observation.Component] = LitSeq.empty,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      specimen: Option[Reference] = None,
      encounter: Option[Reference] = None,
      performer: LitSeq[Reference] = LitSeq.empty,
      hasMember: LitSeq[Reference] = LitSeq.empty,
      referenceRange: LitSeq[Observation.ReferenceRange] = LitSeq.empty,
      derivedFrom: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_VitalSigns_Observation = new UKCore_VitalSigns_Observation(
    id,
    meta,
    text,
    status,
    issued,
    method,
    language,
    category,
    value,
    contained,
    extension,
    effective,
    implicitRules,
    code,
    interpretation,
    note,
    dataAbsentReason,
    modifierExtension,
    bodySite,
    focus,
    partOf,
    device,
    component,
    basedOn,
    subject,
    specimen,
    encounter,
    performer,
    hasMember,
    referenceRange,
    derivedFrom,
    identifier,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val status: FHIRComponentFieldMeta[OBSERVATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[OBSERVATION_STATUS], false, lTagOf[OBSERVATION_STATUS])
  val issued: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
    FHIRComponentFieldMeta("issued", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
  val method: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val value: FHIRComponentFieldMeta[Option[UKCore_VitalSigns_Observation.ValueChoice]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[UKCore_VitalSigns_Observation.ValueChoice]], true, lTagOf[Union02118820890])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val effective: FHIRComponentFieldMeta[Option[UKCore_VitalSigns_Observation.EffectiveChoice]] =
    FHIRComponentFieldMeta(
      "effective",
      lTagOf[Option[UKCore_VitalSigns_Observation.EffectiveChoice]],
      true,
      lTagOf[Union00107722725])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val code: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val interpretation: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("interpretation", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val dataAbsentReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("dataAbsentReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val bodySite: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("bodySite", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val focus: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("focus", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val device: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("device", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val component: FHIRComponentFieldMeta[LitSeq[Observation.Component]] =
    FHIRComponentFieldMeta("component", lTagOf[LitSeq[Observation.Component]], false, lTagOf[Observation.Component])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val specimen: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("specimen", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val performer: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val hasMember: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("hasMember", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val referenceRange: FHIRComponentFieldMeta[LitSeq[Observation.ReferenceRange]] =
    FHIRComponentFieldMeta(
      "referenceRange",
      lTagOf[LitSeq[Observation.ReferenceRange]],
      false,
      lTagOf[Observation.ReferenceRange])
  val derivedFrom: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("derivedFrom", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    status,
    issued,
    method,
    language,
    category,
    value,
    contained,
    extension,
    effective,
    implicitRules,
    code,
    interpretation,
    note,
    dataAbsentReason,
    modifierExtension,
    bodySite,
    focus,
    partOf,
    device,
    component,
    basedOn,
    subject,
    specimen,
    encounter,
    performer,
    hasMember,
    referenceRange,
    derivedFrom,
    identifier
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[OBSERVATION_STATUS](status, t.status),
      FHIRComponentField[Option[ZonedDateTime]](issued, t.issued),
      FHIRComponentField[Option[CodeableConcept]](method, t.method),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
      FHIRComponentField[Option[UKCore_VitalSigns_Observation.ValueChoice]](value, t.value),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UKCore_VitalSigns_Observation.EffectiveChoice]](effective, t.effective),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[LitSeq[CodeableConcept]](interpretation, t.interpretation),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[Option[CodeableConcept]](dataAbsentReason, t.dataAbsentReason),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[CodeableConcept]](bodySite, t.bodySite),
      FHIRComponentField[LitSeq[Reference]](focus, t.focus),
      FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
      FHIRComponentField[Option[Reference]](device, t.device),
      FHIRComponentField[LitSeq[Observation.Component]](component, t.component),
      FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
      FHIRComponentField[Option[Reference]](subject, t.subject),
      FHIRComponentField[Option[Reference]](specimen, t.specimen),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[LitSeq[Reference]](performer, t.performer),
      FHIRComponentField[LitSeq[Reference]](hasMember, t.hasMember),
      FHIRComponentField[LitSeq[Observation.ReferenceRange]](referenceRange, t.referenceRange),
      FHIRComponentField[LitSeq[Reference]](derivedFrom, t.derivedFrom),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier)
    ))
  override def fields(t: UKCore_VitalSigns_Observation): Seq[FHIRComponentField[_]]                     = fieldsFromParent(t).get
  def extractId(t: UKCore_VitalSigns_Observation): Option[String]                                       = t.id
  def extractMeta(t: UKCore_VitalSigns_Observation): Option[Meta]                                       = t.meta
  def extractText(t: UKCore_VitalSigns_Observation): Option[Narrative]                                  = t.text
  def extractStatus(t: UKCore_VitalSigns_Observation): OBSERVATION_STATUS                               = t.status
  def extractIssued(t: UKCore_VitalSigns_Observation): Option[ZonedDateTime]                            = t.issued
  def extractMethod(t: UKCore_VitalSigns_Observation): Option[CodeableConcept]                          = t.method
  def extractLanguage(t: UKCore_VitalSigns_Observation): Option[LANGUAGES]                              = t.language
  def extractCategory(t: UKCore_VitalSigns_Observation): LitSeq[CodeableConcept]                        = t.category
  def extractValue(t: UKCore_VitalSigns_Observation): Option[UKCore_VitalSigns_Observation.ValueChoice] = t.value
  def extractContained(t: UKCore_VitalSigns_Observation): LitSeq[Resource]                              = t.contained
  def extractExtension(t: UKCore_VitalSigns_Observation): LitSeq[Extension]                             = t.extension
  def extractEffective(t: UKCore_VitalSigns_Observation): Option[UKCore_VitalSigns_Observation.EffectiveChoice] = t.effective
  def extractImplicitRules(t: UKCore_VitalSigns_Observation): Option[UriStr]                                    = t.implicitRules
  def extractCode(t: UKCore_VitalSigns_Observation): CodeableConcept                                            = t.code
  def extractInterpretation(t: UKCore_VitalSigns_Observation): LitSeq[CodeableConcept]                          = t.interpretation
  def extractNote(t: UKCore_VitalSigns_Observation): LitSeq[Annotation]                                         = t.note
  def extractDataAbsentReason(t: UKCore_VitalSigns_Observation): Option[CodeableConcept]          = t.dataAbsentReason
  def extractModifierExtension(t: UKCore_VitalSigns_Observation): LitSeq[Extension]               = t.modifierExtension
  def extractBodySite(t: UKCore_VitalSigns_Observation): Option[CodeableConcept]                  = t.bodySite
  def extractFocus(t: UKCore_VitalSigns_Observation): LitSeq[Reference]                           = t.focus
  def extractPartOf(t: UKCore_VitalSigns_Observation): LitSeq[Reference]                          = t.partOf
  def extractDevice(t: UKCore_VitalSigns_Observation): Option[Reference]                          = t.device
  def extractComponent(t: UKCore_VitalSigns_Observation): LitSeq[Observation.Component]           = t.component
  def extractBasedOn(t: UKCore_VitalSigns_Observation): LitSeq[Reference]                         = t.basedOn
  def extractSubject(t: UKCore_VitalSigns_Observation): Option[Reference]                         = t.subject
  def extractSpecimen(t: UKCore_VitalSigns_Observation): Option[Reference]                        = t.specimen
  def extractEncounter(t: UKCore_VitalSigns_Observation): Option[Reference]                       = t.encounter
  def extractPerformer(t: UKCore_VitalSigns_Observation): LitSeq[Reference]                       = t.performer
  def extractHasMember(t: UKCore_VitalSigns_Observation): LitSeq[Reference]                       = t.hasMember
  def extractReferenceRange(t: UKCore_VitalSigns_Observation): LitSeq[Observation.ReferenceRange] = t.referenceRange
  def extractDerivedFrom(t: UKCore_VitalSigns_Observation): LitSeq[Reference]                     = t.derivedFrom
  def extractIdentifier(t: UKCore_VitalSigns_Observation): LitSeq[Identifier]                     = t.identifier
  override val thisName: String                                                     = "UKCore_VitalSigns_Observation"
  override val searchParams: Map[String, UKCore_VitalSigns_Observation => Seq[Any]] = UKCore_Observation.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_VitalSigns_Observation] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_VitalSigns_Observation(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[OBSERVATION_STATUS]("status", None),
          cursor.decodeAs[Option[ZonedDateTime]]("issued", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union02118820890]("value"),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union00107722725]("effective"),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[CodeableConcept]("code", None),
          cursor.decodeAs[LitSeq[CodeableConcept]]("interpretation", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("dataAbsentReason", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("bodySite", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("focus", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("device", Some(None)),
          cursor.decodeAs[LitSeq[Observation.Component]]("component", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[Reference]]("specimen", Some(None)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("hasMember", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Observation.ReferenceRange]]("referenceRange", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("derivedFrom", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the observation constraints and extensions on the UK Core observation resource for the minimal set of data to query
  * and retrieve clinical vital signs observation information.
  *
  * Subclass of [[ukcore.model.UKCore_Observation]] (Defines the UK Core constraints and extensions on the observation resource
  * for the minimal set of data to query and retrieve generic observation information.)
  *
  * @constructor
  *   Inherits all params from parent.
  * @param id
  *   \- The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   \- The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   \- A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param status
  *   \- The status of the result value.
  * @param issued
  *   \- The date and time this version of the observation was made available to providers, typically after the results have been
  *   reviewed and verified.
  * @param method
  *   \- Indicates the mechanism used to perform the observation.
  * @param language
  *   \- The base language in which the resource is written.
  * @param category
  *   \- A code that classifies the general type of observation being made.
  * @param value
  *   \- The information determined as a result of making the observation, if the information has a simple value.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param effective
  *   \- The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients -
  *   this is usually called the "physiologically relevant time". This is usually either the time of the procedure or of specimen
  *   collection, but very often the source of the date/time is not known, only the date/time itself.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param code
  *   \- Describes what was observed. Sometimes this is called the observation "name".
  * @param interpretation
  *   \- A categorical assessment of an observation value. For example, high, low, normal.
  * @param note
  *   \- Comments about the observation or the results.
  * @param dataAbsentReason
  *   \- Provides a reason why the expected value in the element Observation.value[x] is missing.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param bodySite
  *   \- Indicates the site on the subject's body where the observation was made (i.e. the target site).
  * @param focus
  *   \- The actual focus of an observation when it is not the patient of record representing something or someone associated with
  *   the patient such as a spouse, parent, fetus, or donor. For example, fetus observations in a mother's record. The focus of an
  *   observation could also be an existing condition, an intervention, the subject's diet, another observation of the subject, or
  *   a body structure such as tumor or implanted device. An example use case would be using the Observation resource to capture
  *   whether the mother is trained to change her child's tracheostomy tube. In this example, the child is the patient of record
  *   and the mother is the focus.
  * @param partOf
  *   \- A larger event of which this particular Observation is a component or step. For example, an observation as part of a
  *   procedure.
  * @param device
  *   \- The device used to generate the observation data.
  * @param component
  *   \- Some observations have multiple component observations. These component observations are expressed as separate code value
  *   pairs that share the same attributes. Examples include systolic and diastolic component observations for blood pressure
  *   measurement and multiple component observations for genetics observations.
  * @param basedOn
  *   \- A plan, proposal or order that is fulfilled in whole or in part by this event. For example, a MedicationRequest may
  *   require a patient to have laboratory test performed before it is dispensed.
  * @param subject
  *   \- The patient, or group of patients, location, or device this observation is about and into whose record the observation is
  *   placed. If the actual focus of the observation is different from the subject (or a sample of, part, or region of the
  *   subject), the `focus` element or the `code` itself specifies the actual focus of the observation.
  * @param specimen
  *   \- The specimen that was used when this observation was made.
  * @param encounter
  *   \- The healthcare event (e.g. a patient and healthcare provider interaction) during which this observation is made.
  * @param performer
  *   \- Who was responsible for asserting the observed value as "true".
  * @param hasMember
  *   \- This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that
  *   includes the target as a member of the group.
  * @param referenceRange
  *   \- Guidance on how to interpret the value by comparison to a normal or recommended range. Multiple reference ranges are
  *   interpreted as an "OR". In other words, to represent two distinct target populations, two `referenceRange` elements would be
  *   used.
  * @param derivedFrom
  *   \- The target resource that represents a measurement from which this observation value is derived. For example, a calculated
  *   anion gap or a fetal measurement based on an ultrasound image.
  * @param identifier
  *   \- A unique identifier assigned to this observation.
  */
@POJOBoilerplate
class UKCore_VitalSigns_Observation(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-VitalSigns-Observation"))),
    override val text: Option[Narrative] = None,
    override val status: OBSERVATION_STATUS,
    override val issued: Option[ZonedDateTime] = None,
    override val method: Option[CodeableConcept] = None,
    override val language: Option[LANGUAGES] = None,
    override val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val value: Option[UKCore_VitalSigns_Observation.ValueChoice] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val effective: Option[UKCore_VitalSigns_Observation.EffectiveChoice] = None,
    override val implicitRules: Option[UriStr] = None,
    override val code: CodeableConcept,
    override val interpretation: LitSeq[CodeableConcept] = LitSeq.empty,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val dataAbsentReason: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val bodySite: Option[CodeableConcept] = None,
    override val focus: LitSeq[Reference] = LitSeq.empty,
    override val partOf: LitSeq[Reference] = LitSeq.empty,
    override val device: Option[Reference] = None,
    override val component: LitSeq[Observation.Component] = LitSeq.empty,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val subject: Option[Reference] = None,
    override val specimen: Option[Reference] = None,
    override val encounter: Option[Reference] = None,
    override val performer: LitSeq[Reference] = LitSeq.empty,
    override val hasMember: LitSeq[Reference] = LitSeq.empty,
    override val referenceRange: LitSeq[Observation.ReferenceRange] = LitSeq.empty,
    override val derivedFrom: LitSeq[Reference] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends UKCore_Observation(
      id = id,
      meta = meta,
      text = text,
      status = status,
      issued = issued,
      method = method,
      language = language,
      category = category,
      value = value,
      contained = contained,
      extension = extension,
      effective = effective,
      implicitRules = implicitRules,
      code = code,
      interpretation = interpretation,
      note = note,
      dataAbsentReason = dataAbsentReason,
      modifierExtension = modifierExtension,
      bodySite = bodySite,
      identifier = identifier,
      focus = focus,
      partOf = partOf,
      device = device,
      component = component,
      basedOn = basedOn,
      subject = subject,
      specimen = specimen,
      encounter = encounter,
      performer = performer,
      hasMember = hasMember,
      referenceRange = referenceRange,
      derivedFrom = derivedFrom,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Observation"
}
