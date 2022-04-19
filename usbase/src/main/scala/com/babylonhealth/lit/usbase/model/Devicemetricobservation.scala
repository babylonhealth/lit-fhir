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
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Devicemetricobservation extends CompanionFor[Devicemetricobservation] {
  implicit def summonObjectAndCompanionDevicemetricobservation1867223409(
      o: Devicemetricobservation): ObjectAndCompanion[Devicemetricobservation, Devicemetricobservation.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Observation
  override type ParentType   = Observation
  override val baseType: CompanionFor[ResourceType] = Observation
  override val parentType: CompanionFor[ParentType] = Observation
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/devicemetricobservation")
  type ValueChoice = Choice[Union_0110816169]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/devicemetricobservation"))),
      text: Option[Narrative] = None,
      code: CodeableConcept,
      note: LitSeq[Annotation] = LitSeq.empty,
      focus: LitSeq[Reference] = LitSeq.empty,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: OBSERVATION_STATUS,
      method: Option[CodeableConcept] = None,
      device: Reference,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      value: Option[Devicemetricobservation.ValueChoice] = None,
      bodySite: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      performer: LitSeq[Reference] = LitSeq.empty,
      hasMember: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      derivedFrom: LitSeq[Reference] = LitSeq.empty,
      effective: FHIRDateTime,
      implicitRules: Option[UriStr] = None,
      interpretation: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      component: LitSeq[Observation.Component] = LitSeq.empty,
      referenceRange: Option[Observation.ReferenceRange] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Devicemetricobservation = new Devicemetricobservation(
    id,
    meta,
    text,
    code,
    note,
    focus,
    partOf,
    status,
    method,
    device,
    basedOn,
    subject,
    language,
    category,
    value,
    bodySite,
    contained,
    extension,
    performer,
    hasMember,
    identifier,
    derivedFrom,
    effective,
    implicitRules,
    interpretation,
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
  val method: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val device: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("device", lTagOf[Reference], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val value: FHIRComponentFieldMeta[Option[Devicemetricobservation.ValueChoice]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[Devicemetricobservation.ValueChoice]], true, lTagOf[Union_0110816169])
  val bodySite: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("bodySite", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val performer: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val hasMember: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("hasMember", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val derivedFrom: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("derivedFrom", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val effective: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("effective", lTagOf[FHIRDateTime], true, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val interpretation: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("interpretation", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val component: FHIRComponentFieldMeta[LitSeq[Observation.Component]] =
    FHIRComponentFieldMeta("component", lTagOf[LitSeq[Observation.Component]], false, lTagOf[Observation.Component])
  val referenceRange: FHIRComponentFieldMeta[Option[Observation.ReferenceRange]] =
    FHIRComponentFieldMeta(
      "referenceRange",
      lTagOf[Option[Observation.ReferenceRange]],
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
    method,
    device,
    basedOn,
    subject,
    language,
    category,
    value,
    bodySite,
    contained,
    extension,
    performer,
    hasMember,
    identifier,
    derivedFrom,
    effective,
    implicitRules,
    interpretation,
    modifierExtension,
    component,
    referenceRange
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[LitSeq[Reference]](focus, t.focus),
      FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
      FHIRComponentField[OBSERVATION_STATUS](status, t.status),
      FHIRComponentField[Option[CodeableConcept]](method, t.method),
      FHIRComponentField[Reference](device, t.device.get),
      FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
      FHIRComponentField[Reference](subject, t.subject.get),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
      FHIRComponentField[Option[Devicemetricobservation.ValueChoice]](value, t.value.map(_.toSubRef)),
      FHIRComponentField[Option[CodeableConcept]](bodySite, t.bodySite),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Reference]](performer, t.performer),
      FHIRComponentField[LitSeq[Reference]](hasMember, t.hasMember),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Reference]](derivedFrom, t.derivedFrom),
      FHIRComponentField[FHIRDateTime](effective, t.effective.get.toSubRefNonUnion[FHIRDateTime]),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[CodeableConcept]](interpretation, t.interpretation.headOption),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Observation.Component]](component, t.component),
      FHIRComponentField[Option[Observation.ReferenceRange]](referenceRange, t.referenceRange.headOption)
    ))
  override def fields(t: Devicemetricobservation): Seq[FHIRComponentField[_]]               = fieldsFromParent(t).get
  def extractId(t: Devicemetricobservation): Option[String]                                 = t.id
  def extractMeta(t: Devicemetricobservation): Option[Meta]                                 = t.meta
  def extractText(t: Devicemetricobservation): Option[Narrative]                            = t.text
  def extractCode(t: Devicemetricobservation): CodeableConcept                              = t.code
  def extractNote(t: Devicemetricobservation): LitSeq[Annotation]                           = t.note
  def extractFocus(t: Devicemetricobservation): LitSeq[Reference]                           = t.focus
  def extractPartOf(t: Devicemetricobservation): LitSeq[Reference]                          = t.partOf
  def extractStatus(t: Devicemetricobservation): OBSERVATION_STATUS                         = t.status
  def extractMethod(t: Devicemetricobservation): Option[CodeableConcept]                    = t.method
  def extractDevice(t: Devicemetricobservation): Reference                                  = t.device.get
  def extractBasedOn(t: Devicemetricobservation): LitSeq[Reference]                         = t.basedOn
  def extractSubject(t: Devicemetricobservation): Reference                                 = t.subject.get
  def extractLanguage(t: Devicemetricobservation): Option[LANGUAGES]                        = t.language
  def extractCategory(t: Devicemetricobservation): LitSeq[CodeableConcept]                  = t.category
  def extractValue(t: Devicemetricobservation): Option[Devicemetricobservation.ValueChoice] = t.value.map(_.toSubRef)
  def extractBodySite(t: Devicemetricobservation): Option[CodeableConcept]                  = t.bodySite
  def extractContained(t: Devicemetricobservation): LitSeq[Resource]                        = t.contained
  def extractExtension(t: Devicemetricobservation): LitSeq[Extension]                       = t.extension
  def extractPerformer(t: Devicemetricobservation): LitSeq[Reference]                       = t.performer
  def extractHasMember(t: Devicemetricobservation): LitSeq[Reference]                       = t.hasMember
  def extractIdentifier(t: Devicemetricobservation): LitSeq[Identifier]                     = t.identifier
  def extractDerivedFrom(t: Devicemetricobservation): LitSeq[Reference]                     = t.derivedFrom
  def extractEffective(t: Devicemetricobservation): FHIRDateTime                  = t.effective.get.toSubRefNonUnion[FHIRDateTime]
  def extractImplicitRules(t: Devicemetricobservation): Option[UriStr]            = t.implicitRules
  def extractInterpretation(t: Devicemetricobservation): Option[CodeableConcept]  = t.interpretation.headOption
  def extractModifierExtension(t: Devicemetricobservation): LitSeq[Extension]     = t.modifierExtension
  def extractComponent(t: Devicemetricobservation): LitSeq[Observation.Component] = t.component
  def extractReferenceRange(t: Devicemetricobservation): Option[Observation.ReferenceRange] = t.referenceRange.headOption
  override val thisName: String                                                             = "Devicemetricobservation"
  override val searchParams: Map[String, Devicemetricobservation => Seq[Any]]               = Observation.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Devicemetricobservation] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Devicemetricobservation(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("code", None),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("focus", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[OBSERVATION_STATUS]("status", None),
          cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
          cursor.decodeAs[Reference]("device", None),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union_0110816169]("value"),
          cursor.decodeAs[Option[CodeableConcept]]("bodySite", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("hasMember", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("derivedFrom", Some(LitSeq.empty)),
          cursor.decodeAs[FHIRDateTime]("effectiveDateTime", None),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeFromListAs[Option[CodeableConcept]]("interpretation", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Observation.Component]]("component", Some(LitSeq.empty)),
          cursor.decodeFromListAs[Option[Observation.ReferenceRange]]("referenceRange", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** This profile describes the direct or derived, qualitative or quantitative physiological measurement, setting, or calculation
  * data produced by a medical device or a device component.
  *
  * Subclass of [[hl7.model.Observation]] (Measurements and simple assertions made about a patient, device or other subject.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value, effective. Requires the following fields which were optional
  *   in the parent: device, subject, effective. Forbids the use of the following fields which were optional in the parent:
  *   issued, specimen, encounter, dataAbsentReason.
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
  * @param code
  *   \- Describes what was observed. Sometimes this is called the observation "name".
  * @param note
  *   \- Comments about the observation or the results.
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
  * @param status
  *   \- The status of the result value.
  * @param method
  *   \- Indicates the mechanism used to perform the observation.
  * @param device
  *   \- The device used to generate the observation data.
  * @param basedOn
  *   \- A plan, proposal or order that is fulfilled in whole or in part by this event. For example, a MedicationRequest may
  *   require a patient to have laboratory test performed before it is dispensed.
  * @param subject
  *   \- The patient, or group of patients, location, or device this observation is about and into whose record the observation is
  *   placed. If the actual focus of the observation is different from the subject (or a sample of, part, or region of the
  *   subject), the `focus` element or the `code` itself specifies the actual focus of the observation.
  * @param language
  *   \- The base language in which the resource is written.
  * @param category
  *   \- A code that classifies the general type of observation being made.
  * @param value
  *   \- The information determined as a result of making the observation, if the information has a simple value.
  * @param bodySite
  *   \- Indicates the site on the subject's body where the observation was made (i.e. the target site).
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param performer
  *   \- Who was responsible for asserting the observed value as "true".
  * @param hasMember
  *   \- This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that
  *   includes the target as a member of the group.
  * @param identifier
  *   \- A unique identifier assigned to this observation.
  * @param derivedFrom
  *   \- The target resource that represents a measurement from which this observation value is derived. For example, a calculated
  *   anion gap or a fetal measurement based on an ultrasound image.
  * @param effective
  *   \- The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients -
  *   this is usually called the "physiologically relevant time". This is usually either the time of the procedure or of specimen
  *   collection, but very often the source of the date/time is not known, only the date/time itself.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param interpretation
  *   \- A categorical assessment of an observation value. For example, high, low, normal.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param component
  *   \- Some observations have multiple component observations. These component observations are expressed as separate code value
  *   pairs that share the same attributes. Examples include systolic and diastolic component observations for blood pressure
  *   measurement and multiple component observations for genetics observations.
  * @param referenceRange
  *   \- Guidance on how to interpret the value by comparison to a normal or recommended range. Multiple reference ranges are
  *   interpreted as an "OR". In other words, to represent two distinct target populations, two `referenceRange` elements would be
  *   used.
  */
@POJOBoilerplate
class Devicemetricobservation(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/devicemetricobservation"))),
    override val text: Option[Narrative] = None,
    override val code: CodeableConcept,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val focus: LitSeq[Reference] = LitSeq.empty,
    override val partOf: LitSeq[Reference] = LitSeq.empty,
    override val status: OBSERVATION_STATUS,
    override val method: Option[CodeableConcept] = None,
    device: Reference,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    subject: Reference,
    override val language: Option[LANGUAGES] = None,
    override val category: LitSeq[CodeableConcept] = LitSeq.empty,
    value: Option[Devicemetricobservation.ValueChoice] = None,
    override val bodySite: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val performer: LitSeq[Reference] = LitSeq.empty,
    override val hasMember: LitSeq[Reference] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val derivedFrom: LitSeq[Reference] = LitSeq.empty,
    effective: FHIRDateTime,
    override val implicitRules: Option[UriStr] = None,
    interpretation: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val component: LitSeq[Observation.Component] = LitSeq.empty,
    referenceRange: Option[Observation.ReferenceRange] = None,
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
      method = method,
      device = Some(device),
      basedOn = basedOn,
      subject = Some(subject),
      language = language,
      category = category,
      value = value.map(_.toSuperRef),
      bodySite = bodySite,
      contained = contained,
      extension = extension,
      performer = performer,
      hasMember = hasMember,
      identifier = identifier,
      derivedFrom = derivedFrom,
      effective = Some(choice(effective)),
      implicitRules = implicitRules,
      interpretation = interpretation.to(LitSeq),
      modifierExtension = modifierExtension,
      component = component,
      referenceRange = referenceRange.to(LitSeq),
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Observation"
}
