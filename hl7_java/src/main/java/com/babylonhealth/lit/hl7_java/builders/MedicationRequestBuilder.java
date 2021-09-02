package com.babylonhealth.lit.hl7_java.builders;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import scala.math.BigDecimal;
import scala.Option;
import scala.collection.immutable.Seq;
import scala.jdk.javaapi.CollectionConverters;
import scala.jdk.javaapi.OptionConverters;

import lombok.NonNull;

import com.babylonhealth.lit.core.FHIRComponentFieldMeta;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeq$;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.Choice$;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.hl7.MEDICATIONREQUEST_STATUS;
import com.babylonhealth.lit.hl7.MEDICATIONREQUEST_INTENT;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.REQUEST_PRIORITY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class MedicationRequestBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Collection<Annotation> note = Collections.emptyList();
  private MEDICATIONREQUEST_STATUS status;
  private MEDICATIONREQUEST_INTENT intent;
  private Reference subject;
  private Collection<Reference> basedOn = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<CodeableConcept> category = Collections.emptyList();
  private Optional<REQUEST_PRIORITY> priority = Optional.empty();
  private Optional<Reference> recorder = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> encounter = Optional.empty();
  private Optional<Reference> requester = Optional.empty();
  private Optional<Reference> performer = Optional.empty();
  private Collection<Reference> insurance = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<FHIRDateTime> authoredOn = Optional.empty();
  private Collection<CodeableConcept> reasonCode = Collections.emptyList();
  private Optional<Choice_1524702593> reported = Optional.empty();
  private Optional<CodeableConcept> statusReason = Optional.empty();
  private Optional<Boolean> doNotPerform = Optional.empty();
  private Collection<Reference> eventHistory = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Choice01025009075 medication;
  private Optional<CodeableConcept> performerType = Optional.empty();
  private Collection<Reference> detectedIssue = Collections.emptyList();
  private Collection<Reference> reasonReference = Collections.emptyList();
  private Collection<String> instantiatesUri = Collections.emptyList();
  private Optional<Identifier> groupIdentifier = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Dosage> dosageInstruction = Collections.emptyList();
  private Optional<Reference> priorPrescription = Optional.empty();
  private Optional<CodeableConcept> courseOfTherapyType = Optional.empty();
  private Collection<Reference> supportingInformation = Collections.emptyList();
  private Collection<String> instantiatesCanonical = Collections.emptyList();
  private Optional<MedicationRequest.Substitution> substitution = Optional.empty();
  private Optional<MedicationRequest.DispenseRequest> dispenseRequest = Optional.empty();

  /**
   * Required fields for {@link MedicationRequest}
   *
   * @param status - A code specifying the current state of the order. Generally, this will be
   *     active or completed state.
   * @param intent - Whether the request is a proposal, plan, or an original order.
   * @param subject - A link to a resource representing the person or set of individuals to whom the
   *     medication will be given.
   * @param medication - Identifies the medication being requested. This is a link to a resource
   *     that represents the medication which may be the details of the medication or simply an
   *     attribute carrying a code that identifies the medication from a known list of medications.
   *     Field is a 'choice' field. Type should be one of CodeableConcept, Reference.
   */
  public MedicationRequestBuilder(
      MEDICATIONREQUEST_STATUS status,
      MEDICATIONREQUEST_INTENT intent,
      Reference subject,
      @NonNull Choice01025009075 medication) {
    this.status = status;
    this.intent = intent;
    this.subject = subject;
    this.medication = medication;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public MedicationRequestBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public MedicationRequestBuilder withMeta(@NonNull Meta meta) {
    this.meta = Optional.of(meta);
    return this;
  }
  /**
   * @param text - A human-readable narrative that contains a summary of the resource and can be
   *     used to represent the content of the resource to a human. The narrative need not encode all
   *     the structured data, but is required to contain sufficient detail to make it "clinically
   *     safe" for a human to just read the narrative. Resource definitions may define what content
   *     should be represented in the narrative to ensure clinical safety.
   */
  public MedicationRequestBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param note - Extra information about the prescription that could not be conveyed by the other
   *     attributes.
   */
  public MedicationRequestBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /**
   * @param note - Extra information about the prescription that could not be conveyed by the other
   *     attributes.
   */
  public MedicationRequestBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /**
   * @param basedOn - A plan or request that is fulfilled in whole or in part by this medication
   *     request.
   */
  public MedicationRequestBuilder withBasedOn(@NonNull Reference... basedOn) {
    this.basedOn = Arrays.asList(basedOn);
    return this;
  }
  /**
   * @param basedOn - A plan or request that is fulfilled in whole or in part by this medication
   *     request.
   */
  public MedicationRequestBuilder withBasedOn(@NonNull Collection<Reference> basedOn) {
    this.basedOn = Collections.unmodifiableCollection(basedOn);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public MedicationRequestBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param category - Indicates the type of medication request (for example, where the medication
   *     is expected to be consumed or administered (i.e. inpatient or outpatient)).
   */
  public MedicationRequestBuilder withCategory(@NonNull CodeableConcept... category) {
    this.category = Arrays.asList(category);
    return this;
  }
  /**
   * @param category - Indicates the type of medication request (for example, where the medication
   *     is expected to be consumed or administered (i.e. inpatient or outpatient)).
   */
  public MedicationRequestBuilder withCategory(@NonNull Collection<CodeableConcept> category) {
    this.category = Collections.unmodifiableCollection(category);
    return this;
  }
  /**
   * @param priority - Indicates how quickly the Medication Request should be addressed with respect
   *     to other requests.
   */
  public MedicationRequestBuilder withPriority(@NonNull REQUEST_PRIORITY priority) {
    this.priority = Optional.of(priority);
    return this;
  }
  /**
   * @param recorder - The person who entered the order on behalf of another individual for example
   *     in the case of a verbal or a telephone order.
   */
  public MedicationRequestBuilder withRecorder(@NonNull Reference recorder) {
    this.recorder = Optional.of(recorder);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public MedicationRequestBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public MedicationRequestBuilder withContained(@NonNull Collection<Resource> contained) {
    this.contained = Collections.unmodifiableCollection(contained);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public MedicationRequestBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public MedicationRequestBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param encounter - The Encounter during which this [x] was created or to which the creation of
   *     this record is tightly associated.
   */
  public MedicationRequestBuilder withEncounter(@NonNull Reference encounter) {
    this.encounter = Optional.of(encounter);
    return this;
  }
  /**
   * @param requester - The individual, organization, or device that initiated the request and has
   *     responsibility for its activation.
   */
  public MedicationRequestBuilder withRequester(@NonNull Reference requester) {
    this.requester = Optional.of(requester);
    return this;
  }
  /**
   * @param performer - The specified desired performer of the medication treatment (e.g. the
   *     performer of the medication administration).
   */
  public MedicationRequestBuilder withPerformer(@NonNull Reference performer) {
    this.performer = Optional.of(performer);
    return this;
  }
  /**
   * @param insurance - Insurance plans, coverage extensions, pre-authorizations and/or
   *     pre-determinations that may be required for delivering the requested service.
   */
  public MedicationRequestBuilder withInsurance(@NonNull Reference... insurance) {
    this.insurance = Arrays.asList(insurance);
    return this;
  }
  /**
   * @param insurance - Insurance plans, coverage extensions, pre-authorizations and/or
   *     pre-determinations that may be required for delivering the requested service.
   */
  public MedicationRequestBuilder withInsurance(@NonNull Collection<Reference> insurance) {
    this.insurance = Collections.unmodifiableCollection(insurance);
    return this;
  }
  /**
   * @param identifier - Identifiers associated with this medication request that are defined by
   *     business processes and/or used to refer to it when a direct URL reference to the resource
   *     itself is not appropriate. They are business identifiers assigned to this resource by the
   *     performer or other systems and remain constant as the resource is updated and propagates
   *     from server to server.
   */
  public MedicationRequestBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Identifiers associated with this medication request that are defined by
   *     business processes and/or used to refer to it when a direct URL reference to the resource
   *     itself is not appropriate. They are business identifiers assigned to this resource by the
   *     performer or other systems and remain constant as the resource is updated and propagates
   *     from server to server.
   */
  public MedicationRequestBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param authoredOn - The date (and perhaps time) when the prescription was initially written or
   *     authored on.
   */
  public MedicationRequestBuilder withAuthoredOn(@NonNull FHIRDateTime authoredOn) {
    this.authoredOn = Optional.of(authoredOn);
    return this;
  }
  /**
   * @param reasonCode - The reason or the indication for ordering or not ordering the medication.
   */
  public MedicationRequestBuilder withReasonCode(@NonNull CodeableConcept... reasonCode) {
    this.reasonCode = Arrays.asList(reasonCode);
    return this;
  }
  /**
   * @param reasonCode - The reason or the indication for ordering or not ordering the medication.
   */
  public MedicationRequestBuilder withReasonCode(@NonNull Collection<CodeableConcept> reasonCode) {
    this.reasonCode = Collections.unmodifiableCollection(reasonCode);
    return this;
  }
  /**
   * @param reported - Indicates if this record was captured as a secondary 'reported' record rather
   *     than as an original primary source-of-truth record. It may also indicate the source of the
   *     report. Field is a 'choice' field. Type should be one of Boolean, Reference.
   */
  public MedicationRequestBuilder withReported(@NonNull Choice_1524702593 reported) {
    this.reported = Optional.of(reported);
    return this;
  }
  /** @param statusReason - Captures the reason for the current state of the MedicationRequest. */
  public MedicationRequestBuilder withStatusReason(@NonNull CodeableConcept statusReason) {
    this.statusReason = Optional.of(statusReason);
    return this;
  }
  /**
   * @param doNotPerform - If true indicates that the provider is asking for the medication request
   *     not to occur.
   */
  public MedicationRequestBuilder withDoNotPerform(@NonNull Boolean doNotPerform) {
    this.doNotPerform = Optional.of(doNotPerform);
    return this;
  }
  /**
   * @param eventHistory - Links to Provenance records for past versions of this resource or
   *     fulfilling request or event resources that identify key state transitions or updates that
   *     are likely to be relevant to a user looking at the current version of the resource.
   */
  public MedicationRequestBuilder withEventHistory(@NonNull Reference... eventHistory) {
    this.eventHistory = Arrays.asList(eventHistory);
    return this;
  }
  /**
   * @param eventHistory - Links to Provenance records for past versions of this resource or
   *     fulfilling request or event resources that identify key state transitions or updates that
   *     are likely to be relevant to a user looking at the current version of the resource.
   */
  public MedicationRequestBuilder withEventHistory(@NonNull Collection<Reference> eventHistory) {
    this.eventHistory = Collections.unmodifiableCollection(eventHistory);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public MedicationRequestBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param performerType - Indicates the type of performer of the administration of the medication.
   */
  public MedicationRequestBuilder withPerformerType(@NonNull CodeableConcept performerType) {
    this.performerType = Optional.of(performerType);
    return this;
  }
  /**
   * @param detectedIssue - Indicates an actual or potential clinical issue with or between one or
   *     more active or proposed clinical actions for a patient; e.g. Drug-drug interaction,
   *     duplicate therapy, dosage alert etc.
   */
  public MedicationRequestBuilder withDetectedIssue(@NonNull Reference... detectedIssue) {
    this.detectedIssue = Arrays.asList(detectedIssue);
    return this;
  }
  /**
   * @param detectedIssue - Indicates an actual or potential clinical issue with or between one or
   *     more active or proposed clinical actions for a patient; e.g. Drug-drug interaction,
   *     duplicate therapy, dosage alert etc.
   */
  public MedicationRequestBuilder withDetectedIssue(@NonNull Collection<Reference> detectedIssue) {
    this.detectedIssue = Collections.unmodifiableCollection(detectedIssue);
    return this;
  }
  /**
   * @param reasonReference - Condition or observation that supports why the medication was ordered.
   */
  public MedicationRequestBuilder withReasonReference(@NonNull Reference... reasonReference) {
    this.reasonReference = Arrays.asList(reasonReference);
    return this;
  }
  /**
   * @param reasonReference - Condition or observation that supports why the medication was ordered.
   */
  public MedicationRequestBuilder withReasonReference(
      @NonNull Collection<Reference> reasonReference) {
    this.reasonReference = Collections.unmodifiableCollection(reasonReference);
    return this;
  }
  /**
   * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
   *     orderset or other definition that is adhered to in whole or in part by this
   *     MedicationRequest.
   */
  public MedicationRequestBuilder withInstantiatesUri(@NonNull String... instantiatesUri) {
    this.instantiatesUri = Arrays.asList(instantiatesUri);
    return this;
  }
  /**
   * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
   *     orderset or other definition that is adhered to in whole or in part by this
   *     MedicationRequest.
   */
  public MedicationRequestBuilder withInstantiatesUri(@NonNull Collection<String> instantiatesUri) {
    this.instantiatesUri = Collections.unmodifiableCollection(instantiatesUri);
    return this;
  }
  /**
   * @param groupIdentifier - A shared identifier common to all requests that were authorized more
   *     or less simultaneously by a single author, representing the identifier of the requisition
   *     or prescription.
   */
  public MedicationRequestBuilder withGroupIdentifier(@NonNull Identifier groupIdentifier) {
    this.groupIdentifier = Optional.of(groupIdentifier);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public MedicationRequestBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public MedicationRequestBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param dosageInstruction - Indicates how the medication is to be used by the patient. */
  public MedicationRequestBuilder withDosageInstruction(@NonNull Dosage... dosageInstruction) {
    this.dosageInstruction = Arrays.asList(dosageInstruction);
    return this;
  }
  /** @param dosageInstruction - Indicates how the medication is to be used by the patient. */
  public MedicationRequestBuilder withDosageInstruction(
      @NonNull Collection<Dosage> dosageInstruction) {
    this.dosageInstruction = Collections.unmodifiableCollection(dosageInstruction);
    return this;
  }
  /**
   * @param priorPrescription - A link to a resource representing an earlier order related order or
   *     prescription.
   */
  public MedicationRequestBuilder withPriorPrescription(@NonNull Reference priorPrescription) {
    this.priorPrescription = Optional.of(priorPrescription);
    return this;
  }
  /**
   * @param courseOfTherapyType - The description of the overall patte3rn of the administration of
   *     the medication to the patient.
   */
  public MedicationRequestBuilder withCourseOfTherapyType(
      @NonNull CodeableConcept courseOfTherapyType) {
    this.courseOfTherapyType = Optional.of(courseOfTherapyType);
    return this;
  }
  /**
   * @param supportingInformation - Include additional information (for example, patient height and
   *     weight) that supports the ordering of the medication.
   */
  public MedicationRequestBuilder withSupportingInformation(
      @NonNull Reference... supportingInformation) {
    this.supportingInformation = Arrays.asList(supportingInformation);
    return this;
  }
  /**
   * @param supportingInformation - Include additional information (for example, patient height and
   *     weight) that supports the ordering of the medication.
   */
  public MedicationRequestBuilder withSupportingInformation(
      @NonNull Collection<Reference> supportingInformation) {
    this.supportingInformation = Collections.unmodifiableCollection(supportingInformation);
    return this;
  }
  /**
   * @param instantiatesCanonical - The URL pointing to a protocol, guideline, orderset, or other
   *     definition that is adhered to in whole or in part by this MedicationRequest.
   */
  public MedicationRequestBuilder withInstantiatesCanonical(
      @NonNull String... instantiatesCanonical) {
    this.instantiatesCanonical = Arrays.asList(instantiatesCanonical);
    return this;
  }
  /**
   * @param instantiatesCanonical - The URL pointing to a protocol, guideline, orderset, or other
   *     definition that is adhered to in whole or in part by this MedicationRequest.
   */
  public MedicationRequestBuilder withInstantiatesCanonical(
      @NonNull Collection<String> instantiatesCanonical) {
    this.instantiatesCanonical = Collections.unmodifiableCollection(instantiatesCanonical);
    return this;
  }
  /**
   * @param substitution - Indicates whether or not substitution can or should be part of the
   *     dispense. In some cases, substitution must happen, in other cases substitution must not
   *     happen. This block explains the prescriber's intent. If nothing is specified substitution
   *     may be done.
   */
  public MedicationRequestBuilder withSubstitution(
      @NonNull MedicationRequest.Substitution substitution) {
    this.substitution = Optional.of(substitution);
    return this;
  }
  /**
   * @param dispenseRequest - Indicates the specific details for the dispense or medication supply
   *     part of a medication request (also known as a Medication Prescription or Medication Order).
   *     Note that this information is not always sent with the order. There may be in some settings
   *     (e.g. hospitals) institutional or system support for completing the dispense details in the
   *     pharmacy department.
   */
  public MedicationRequestBuilder withDispenseRequest(
      @NonNull MedicationRequest.DispenseRequest dispenseRequest) {
    this.dispenseRequest = Optional.of(dispenseRequest);
    return this;
  }

  public MedicationRequestBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public MedicationRequest build() {
    return new MedicationRequest(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        note.stream().collect(new LitSeqJCollector<>()),
        status,
        intent,
        subject,
        basedOn.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(language),
        category.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(priority),
        OptionConverters.toScala(recorder),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(encounter),
        OptionConverters.toScala(requester),
        OptionConverters.toScala(performer),
        insurance.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(authoredOn),
        reasonCode.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(reported),
        OptionConverters.toScala(statusReason),
        OptionConverters.toScala(doNotPerform.map(x -> (Object) x)),
        eventHistory.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        medication,
        OptionConverters.toScala(performerType),
        detectedIssue.stream().collect(new LitSeqJCollector<>()),
        reasonReference.stream().collect(new LitSeqJCollector<>()),
        instantiatesUri.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(groupIdentifier),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        dosageInstruction.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(priorPrescription),
        OptionConverters.toScala(courseOfTherapyType),
        supportingInformation.stream().collect(new LitSeqJCollector<>()),
        instantiatesCanonical.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(substitution),
        OptionConverters.toScala(dispenseRequest),
        LitUtils.emptyMetaElMap());
  }
}
