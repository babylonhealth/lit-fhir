package com.babylonhealth.lit.usbase_java.builders;

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
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class BodyweightBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta =
      Optional.of(
          new MetaBuilder()
              .withProfile("http://hl7.org/fhir/StructureDefinition/bodyweight")
              .build());
  private Optional<Narrative> text = Optional.empty();
  private Collection<Annotation> note = Collections.emptyList();
  private Collection<Reference> focus = Collections.emptyList();
  private Collection<Reference> partOf = Collections.emptyList();
  private OBSERVATION_STATUS status;
  private Optional<ZonedDateTime> issued = Optional.empty();
  private Optional<CodeableConcept> method = Optional.empty();
  private Optional<Reference> device = Optional.empty();
  private Collection<Reference> basedOn = Collections.emptyList();
  private Reference subject;
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<CodeableConcept> category;
  private Optional<Quantity> value = Optional.empty();
  private Optional<CodeableConcept> bodySite = Optional.empty();
  private Optional<Reference> specimen = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> encounter = Optional.empty();
  private Collection<Reference> performer = Collections.emptyList();
  private Collection<Reference> hasMember = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Collection<Reference> derivedFrom = Collections.emptyList();
  private Choice_0934386166 effective;
  private Optional<String> implicitRules = Optional.empty();
  private CodeableConcept code;
  private Collection<CodeableConcept> interpretation = Collections.emptyList();
  private Optional<CodeableConcept> dataAbsentReason = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Observation.Component> component = Collections.emptyList();
  private Collection<Observation.ReferenceRange> referenceRange = Collections.emptyList();

  /**
   * Required fields for {@link Bodyweight}
   *
   * @param status - The status of the result value.
   * @param subject - The patient, or group of patients, location, or device this observation is
   *     about and into whose record the observation is placed. If the actual focus of the
   *     observation is different from the subject (or a sample of, part, or region of the subject),
   *     the `focus` element or the `code` itself specifies the actual focus of the observation.
   * @param category - A code that classifies the general type of observation being made.
   * @param effective - Often just a dateTime for Vital Signs. Field is a 'choice' field. Type
   *     should be one of FHIRDateTime, Period.
   * @param code - Body Weight.
   */
  public BodyweightBuilder(
      OBSERVATION_STATUS status,
      Reference subject,
      Collection<CodeableConcept> category,
      @NonNull Choice_0934386166 effective,
      CodeableConcept code) {
    this.status = status;
    this.subject = subject;
    this.category = category;
    this.effective = effective;
    this.code = code;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public BodyweightBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public BodyweightBuilder withMeta(@NonNull Meta meta) {
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
  public BodyweightBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param note - Comments about the observation or the results. */
  public BodyweightBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /** @param note - Comments about the observation or the results. */
  public BodyweightBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /**
   * @param focus - The actual focus of an observation when it is not the patient of record
   *     representing something or someone associated with the patient such as a spouse, parent,
   *     fetus, or donor. For example, fetus observations in a mother's record. The focus of an
   *     observation could also be an existing condition, an intervention, the subject's diet,
   *     another observation of the subject, or a body structure such as tumor or implanted device.
   *     An example use case would be using the Observation resource to capture whether the mother
   *     is trained to change her child's tracheostomy tube. In this example, the child is the
   *     patient of record and the mother is the focus.
   */
  public BodyweightBuilder withFocus(@NonNull Reference... focus) {
    this.focus = Arrays.asList(focus);
    return this;
  }
  /**
   * @param focus - The actual focus of an observation when it is not the patient of record
   *     representing something or someone associated with the patient such as a spouse, parent,
   *     fetus, or donor. For example, fetus observations in a mother's record. The focus of an
   *     observation could also be an existing condition, an intervention, the subject's diet,
   *     another observation of the subject, or a body structure such as tumor or implanted device.
   *     An example use case would be using the Observation resource to capture whether the mother
   *     is trained to change her child's tracheostomy tube. In this example, the child is the
   *     patient of record and the mother is the focus.
   */
  public BodyweightBuilder withFocus(@NonNull Collection<Reference> focus) {
    this.focus = Collections.unmodifiableCollection(focus);
    return this;
  }
  /**
   * @param partOf - A larger event of which this particular Observation is a component or step. For
   *     example, an observation as part of a procedure.
   */
  public BodyweightBuilder withPartOf(@NonNull Reference... partOf) {
    this.partOf = Arrays.asList(partOf);
    return this;
  }
  /**
   * @param partOf - A larger event of which this particular Observation is a component or step. For
   *     example, an observation as part of a procedure.
   */
  public BodyweightBuilder withPartOf(@NonNull Collection<Reference> partOf) {
    this.partOf = Collections.unmodifiableCollection(partOf);
    return this;
  }
  /**
   * @param issued - The date and time this version of the observation was made available to
   *     providers, typically after the results have been reviewed and verified.
   */
  public BodyweightBuilder withIssued(@NonNull ZonedDateTime issued) {
    this.issued = Optional.of(issued);
    return this;
  }
  /** @param method - Indicates the mechanism used to perform the observation. */
  public BodyweightBuilder withMethod(@NonNull CodeableConcept method) {
    this.method = Optional.of(method);
    return this;
  }
  /** @param device - The device used to generate the observation data. */
  public BodyweightBuilder withDevice(@NonNull Reference device) {
    this.device = Optional.of(device);
    return this;
  }
  /**
   * @param basedOn - A plan, proposal or order that is fulfilled in whole or in part by this event.
   *     For example, a MedicationRequest may require a patient to have laboratory test performed
   *     before it is dispensed.
   */
  public BodyweightBuilder withBasedOn(@NonNull Reference... basedOn) {
    this.basedOn = Arrays.asList(basedOn);
    return this;
  }
  /**
   * @param basedOn - A plan, proposal or order that is fulfilled in whole or in part by this event.
   *     For example, a MedicationRequest may require a patient to have laboratory test performed
   *     before it is dispensed.
   */
  public BodyweightBuilder withBasedOn(@NonNull Collection<Reference> basedOn) {
    this.basedOn = Collections.unmodifiableCollection(basedOn);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public BodyweightBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param value - Vital Signs value are recorded using the Quantity data type. For supporting
   *     observations such as Cuff size could use other datatypes such as CodeableConcept.
   */
  public BodyweightBuilder withValue(@NonNull Quantity value) {
    this.value = Optional.of(value);
    return this;
  }
  /**
   * @param bodySite - Indicates the site on the subject's body where the observation was made (i.e.
   *     the target site).
   */
  public BodyweightBuilder withBodySite(@NonNull CodeableConcept bodySite) {
    this.bodySite = Optional.of(bodySite);
    return this;
  }
  /** @param specimen - The specimen that was used when this observation was made. */
  public BodyweightBuilder withSpecimen(@NonNull Reference specimen) {
    this.specimen = Optional.of(specimen);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public BodyweightBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public BodyweightBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public BodyweightBuilder withExtension(@NonNull Extension... extension) {
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
  public BodyweightBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param encounter - The healthcare event (e.g. a patient and healthcare provider interaction)
   *     during which this observation is made.
   */
  public BodyweightBuilder withEncounter(@NonNull Reference encounter) {
    this.encounter = Optional.of(encounter);
    return this;
  }
  /** @param performer - Who was responsible for asserting the observed value as "true". */
  public BodyweightBuilder withPerformer(@NonNull Reference... performer) {
    this.performer = Arrays.asList(performer);
    return this;
  }
  /** @param performer - Who was responsible for asserting the observed value as "true". */
  public BodyweightBuilder withPerformer(@NonNull Collection<Reference> performer) {
    this.performer = Collections.unmodifiableCollection(performer);
    return this;
  }
  /** @param hasMember - Used when reporting vital signs panel components. */
  public BodyweightBuilder withHasMember(@NonNull Reference... hasMember) {
    this.hasMember = Arrays.asList(hasMember);
    return this;
  }
  /** @param hasMember - Used when reporting vital signs panel components. */
  public BodyweightBuilder withHasMember(@NonNull Collection<Reference> hasMember) {
    this.hasMember = Collections.unmodifiableCollection(hasMember);
    return this;
  }
  /** @param identifier - A unique identifier assigned to this observation. */
  public BodyweightBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - A unique identifier assigned to this observation. */
  public BodyweightBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param derivedFrom - The target resource that represents a measurement from which this
   *     observation value is derived. For example, a calculated anion gap or a fetal measurement
   *     based on an ultrasound image.
   */
  public BodyweightBuilder withDerivedFrom(@NonNull Reference... derivedFrom) {
    this.derivedFrom = Arrays.asList(derivedFrom);
    return this;
  }
  /**
   * @param derivedFrom - The target resource that represents a measurement from which this
   *     observation value is derived. For example, a calculated anion gap or a fetal measurement
   *     based on an ultrasound image.
   */
  public BodyweightBuilder withDerivedFrom(@NonNull Collection<Reference> derivedFrom) {
    this.derivedFrom = Collections.unmodifiableCollection(derivedFrom);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public BodyweightBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param interpretation - A categorical assessment of an observation value. For example, high,
   *     low, normal.
   */
  public BodyweightBuilder withInterpretation(@NonNull CodeableConcept... interpretation) {
    this.interpretation = Arrays.asList(interpretation);
    return this;
  }
  /**
   * @param interpretation - A categorical assessment of an observation value. For example, high,
   *     low, normal.
   */
  public BodyweightBuilder withInterpretation(@NonNull Collection<CodeableConcept> interpretation) {
    this.interpretation = Collections.unmodifiableCollection(interpretation);
    return this;
  }
  /**
   * @param dataAbsentReason - Provides a reason why the expected value in the element
   *     Observation.value[x] is missing.
   */
  public BodyweightBuilder withDataAbsentReason(@NonNull CodeableConcept dataAbsentReason) {
    this.dataAbsentReason = Optional.of(dataAbsentReason);
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
  public BodyweightBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public BodyweightBuilder withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param component - Used when reporting systolic and diastolic blood pressure. */
  public BodyweightBuilder withComponent(@NonNull Observation.Component... component) {
    this.component = Arrays.asList(component);
    return this;
  }
  /** @param component - Used when reporting systolic and diastolic blood pressure. */
  public BodyweightBuilder withComponent(@NonNull Collection<Observation.Component> component) {
    this.component = Collections.unmodifiableCollection(component);
    return this;
  }
  /**
   * @param referenceRange - Guidance on how to interpret the value by comparison to a normal or
   *     recommended range. Multiple reference ranges are interpreted as an "OR". In other words, to
   *     represent two distinct target populations, two `referenceRange` elements would be used.
   */
  public BodyweightBuilder withReferenceRange(
      @NonNull Observation.ReferenceRange... referenceRange) {
    this.referenceRange = Arrays.asList(referenceRange);
    return this;
  }
  /**
   * @param referenceRange - Guidance on how to interpret the value by comparison to a normal or
   *     recommended range. Multiple reference ranges are interpreted as an "OR". In other words, to
   *     represent two distinct target populations, two `referenceRange` elements would be used.
   */
  public BodyweightBuilder withReferenceRange(
      @NonNull Collection<Observation.ReferenceRange> referenceRange) {
    this.referenceRange = Collections.unmodifiableCollection(referenceRange);
    return this;
  }

  public BodyweightBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Bodyweight build() {
    return new Bodyweight(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        note.stream().collect(new LitSeqJCollector<>()),
        focus.stream().collect(new LitSeqJCollector<>()),
        partOf.stream().collect(new LitSeqJCollector<>()),
        status,
        OptionConverters.toScala(issued),
        OptionConverters.toScala(method),
        OptionConverters.toScala(device),
        basedOn.stream().collect(new LitSeqJCollector<>()),
        subject,
        OptionConverters.toScala(language),
        category.stream().collect(new NonEmptyLitSeqJCollector<>()),
        OptionConverters.toScala(value),
        OptionConverters.toScala(bodySite),
        OptionConverters.toScala(specimen),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(encounter),
        performer.stream().collect(new LitSeqJCollector<>()),
        hasMember.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        derivedFrom.stream().collect(new LitSeqJCollector<>()),
        effective,
        OptionConverters.toScala(implicitRules),
        code,
        interpretation.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(dataAbsentReason),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        component.stream().collect(new LitSeqJCollector<>()),
        referenceRange.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
