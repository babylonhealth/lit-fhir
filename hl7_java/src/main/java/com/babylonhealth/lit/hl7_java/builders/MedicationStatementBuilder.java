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
import com.babylonhealth.lit.hl7.MEDICATION_STATEMENT_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class MedicationStatementBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Collection<Annotation> note = Collections.emptyList();
  private Collection<Reference> partOf = Collections.emptyList();
  private MEDICATION_STATEMENT_STATUS status;
  private Collection<Dosage> dosage = Collections.emptyList();
  private Collection<Reference> basedOn = Collections.emptyList();
  private Reference subject;
  private Optional<Reference> context = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<CodeableConcept> category = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Collection<CodeableConcept> reasonCode = Collections.emptyList();
  private Collection<Reference> derivedFrom = Collections.emptyList();
  private Collection<CodeableConcept> statusReason = Collections.emptyList();
  private Optional<Choice<$bslash$div<FHIRDateTime, Period>>> effective = Optional.empty();
  private Optional<FHIRDateTime> dateAsserted = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Choice<$bslash$div<CodeableConcept, Reference>> medication;
  private Collection<Reference> reasonReference = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Reference> informationSource = Optional.empty();

  /**
   * Required fields for {@link MedicationStatement}
   *
   * @param status - A code representing the patient or other source's judgment about the state of
   *     the medication used that this statement is about. Generally, this will be active or
   *     completed.
   * @param subject - The person, animal or group who is/was taking the medication.
   * @param medication - Identifies the medication being administered. This is either a link to a
   *     resource representing the details of the medication or a simple attribute carrying a code
   *     that identifies the medication from a known list of medications. Field is a 'choice' field.
   *     Type should be one of CodeableConcept, Reference.
   */
  public MedicationStatementBuilder(
      MEDICATION_STATEMENT_STATUS status, Reference subject, @NonNull Object medication) {
    this.status = status;
    this.subject = subject;
    this.medication =
        (Choice)
            Choice$.MODULE$.fromSuffix(
                autoSuffix(
                    medication.getClass().getSimpleName(),
                    MedicationStatement$.MODULE$.medication()),
                medication,
                MedicationStatement$.MODULE$.medication());
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public MedicationStatementBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public MedicationStatementBuilder withMeta(@NonNull Meta meta) {
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
  public MedicationStatementBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param note - Provides extra information about the medication statement that is not conveyed by
   *     the other attributes.
   */
  public MedicationStatementBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /**
   * @param note - Provides extra information about the medication statement that is not conveyed by
   *     the other attributes.
   */
  public MedicationStatementBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /** @param partOf - A larger event of which this particular event is a component or step. */
  public MedicationStatementBuilder withPartOf(@NonNull Reference... partOf) {
    this.partOf = Arrays.asList(partOf);
    return this;
  }
  /** @param partOf - A larger event of which this particular event is a component or step. */
  public MedicationStatementBuilder withPartOf(@NonNull Collection<Reference> partOf) {
    this.partOf = Collections.unmodifiableCollection(partOf);
    return this;
  }
  /** @param dosage - Indicates how the medication is/was or should be taken by the patient. */
  public MedicationStatementBuilder withDosage(@NonNull Dosage... dosage) {
    this.dosage = Arrays.asList(dosage);
    return this;
  }
  /** @param dosage - Indicates how the medication is/was or should be taken by the patient. */
  public MedicationStatementBuilder withDosage(@NonNull Collection<Dosage> dosage) {
    this.dosage = Collections.unmodifiableCollection(dosage);
    return this;
  }
  /**
   * @param basedOn - A plan, proposal or order that is fulfilled in whole or in part by this event.
   */
  public MedicationStatementBuilder withBasedOn(@NonNull Reference... basedOn) {
    this.basedOn = Arrays.asList(basedOn);
    return this;
  }
  /**
   * @param basedOn - A plan, proposal or order that is fulfilled in whole or in part by this event.
   */
  public MedicationStatementBuilder withBasedOn(@NonNull Collection<Reference> basedOn) {
    this.basedOn = Collections.unmodifiableCollection(basedOn);
    return this;
  }
  /**
   * @param context - The encounter or episode of care that establishes the context for this
   *     MedicationStatement.
   */
  public MedicationStatementBuilder withContext(@NonNull Reference context) {
    this.context = Optional.of(context);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public MedicationStatementBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param category - Indicates where the medication is expected to be consumed or administered.
   */
  public MedicationStatementBuilder withCategory(@NonNull CodeableConcept category) {
    this.category = Optional.of(category);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public MedicationStatementBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public MedicationStatementBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public MedicationStatementBuilder withExtension(@NonNull Extension... extension) {
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
  public MedicationStatementBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param identifier - Identifiers associated with this Medication Statement that are defined by
   *     business processes and/or used to refer to it when a direct URL reference to the resource
   *     itself is not appropriate. They are business identifiers assigned to this resource by the
   *     performer or other systems and remain constant as the resource is updated and propagates
   *     from server to server.
   */
  public MedicationStatementBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Identifiers associated with this Medication Statement that are defined by
   *     business processes and/or used to refer to it when a direct URL reference to the resource
   *     itself is not appropriate. They are business identifiers assigned to this resource by the
   *     performer or other systems and remain constant as the resource is updated and propagates
   *     from server to server.
   */
  public MedicationStatementBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param reasonCode - A reason for why the medication is being/was taken. */
  public MedicationStatementBuilder withReasonCode(@NonNull CodeableConcept... reasonCode) {
    this.reasonCode = Arrays.asList(reasonCode);
    return this;
  }
  /** @param reasonCode - A reason for why the medication is being/was taken. */
  public MedicationStatementBuilder withReasonCode(
      @NonNull Collection<CodeableConcept> reasonCode) {
    this.reasonCode = Collections.unmodifiableCollection(reasonCode);
    return this;
  }
  /**
   * @param derivedFrom - Allows linking the MedicationStatement to the underlying
   *     MedicationRequest, or to other information that supports or is used to derive the
   *     MedicationStatement.
   */
  public MedicationStatementBuilder withDerivedFrom(@NonNull Reference... derivedFrom) {
    this.derivedFrom = Arrays.asList(derivedFrom);
    return this;
  }
  /**
   * @param derivedFrom - Allows linking the MedicationStatement to the underlying
   *     MedicationRequest, or to other information that supports or is used to derive the
   *     MedicationStatement.
   */
  public MedicationStatementBuilder withDerivedFrom(@NonNull Collection<Reference> derivedFrom) {
    this.derivedFrom = Collections.unmodifiableCollection(derivedFrom);
    return this;
  }
  /** @param statusReason - Captures the reason for the current state of the MedicationStatement. */
  public MedicationStatementBuilder withStatusReason(@NonNull CodeableConcept... statusReason) {
    this.statusReason = Arrays.asList(statusReason);
    return this;
  }
  /** @param statusReason - Captures the reason for the current state of the MedicationStatement. */
  public MedicationStatementBuilder withStatusReason(
      @NonNull Collection<CodeableConcept> statusReason) {
    this.statusReason = Collections.unmodifiableCollection(statusReason);
    return this;
  }
  /**
   * @param effective - The interval of time during which it is being asserted that the patient
   *     is/was/will be taking the medication (or was not taking, when the MedicationStatement.taken
   *     element is No). Field is a 'choice' field. Type should be one of FHIRDateTime, Period.
   */
  public <T> MedicationStatementBuilder withEffective(@NonNull T effective) {
    var guessedSuffix =
        autoSuffix(effective.getClass().getSimpleName(), MedicationStatement$.MODULE$.effective());
    return withEffective(guessedSuffix, effective);
  }

  /**
   * Alternative to the 'main' withEffective method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param effective - The value to be passed to the builder
   */
  public <T> MedicationStatementBuilder withEffective(String suffix, @NonNull T effective) {
    guard(effective.getClass().getSimpleName(), suffix, MedicationStatement$.MODULE$.effective());
    this.effective =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, effective, MedicationStatement$.MODULE$.effective()));
    return this;
  }
  /**
   * @param dateAsserted - The date when the medication statement was asserted by the information
   *     source.
   */
  public MedicationStatementBuilder withDateAsserted(@NonNull FHIRDateTime dateAsserted) {
    this.dateAsserted = Optional.of(dateAsserted);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public MedicationStatementBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param reasonReference - Condition or observation that supports why the medication is being/was
   *     taken.
   */
  public MedicationStatementBuilder withReasonReference(@NonNull Reference... reasonReference) {
    this.reasonReference = Arrays.asList(reasonReference);
    return this;
  }
  /**
   * @param reasonReference - Condition or observation that supports why the medication is being/was
   *     taken.
   */
  public MedicationStatementBuilder withReasonReference(
      @NonNull Collection<Reference> reasonReference) {
    this.reasonReference = Collections.unmodifiableCollection(reasonReference);
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
  public MedicationStatementBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public MedicationStatementBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param informationSource - The person or organization that provided the information about the
   *     taking of this medication. Note: Use derivedFrom when a MedicationStatement is derived from
   *     other resources, e.g. Claim or MedicationRequest.
   */
  public MedicationStatementBuilder withInformationSource(@NonNull Reference informationSource) {
    this.informationSource = Optional.of(informationSource);
    return this;
  }

  public MedicationStatementBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public MedicationStatement build() {
    return new MedicationStatement(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        note.stream().collect(new LitSeqJCollector<>()),
        partOf.stream().collect(new LitSeqJCollector<>()),
        status,
        dosage.stream().collect(new LitSeqJCollector<>()),
        basedOn.stream().collect(new LitSeqJCollector<>()),
        subject,
        OptionConverters.toScala(context),
        OptionConverters.toScala(language),
        OptionConverters.toScala(category),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        reasonCode.stream().collect(new LitSeqJCollector<>()),
        derivedFrom.stream().collect(new LitSeqJCollector<>()),
        statusReason.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(effective),
        OptionConverters.toScala(dateAsserted),
        OptionConverters.toScala(implicitRules),
        medication,
        reasonReference.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(informationSource),
        LitUtils.emptyMetaElMap());
  }
}
