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

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface TriglycerideBuilder extends ObservationBuilder {
  public Triglyceride build();

  public static Impl init(
      CodeableConcept code, OBSERVATION_STATUS status, Observation.ReferenceRange referenceRange) {
    return new Impl(code, status, referenceRange);
  }

  public static Impl builder(
      CodeableConceptBuilder code,
      OBSERVATION_STATUS status,
      Observation_ReferenceRangeBuilder referenceRange) {
    return new Impl(code.build(), status, referenceRange.build());
  }

  public static Choice00107722725 effective(FHIRDateTime f) {
    return new Choice00107722725(f);
  }

  public static Choice00107722725 effective(Period p) {
    return new Choice00107722725(p);
  }

  public static Choice00107722725 effective(Timing t) {
    return new Choice00107722725(t);
  }

  public static Choice00107722725 effective(ZonedDateTime z) {
    return new Choice00107722725(z);
  }

  public class Impl implements TriglycerideBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("http://hl7.org/fhir/StructureDefinition/triglyceride")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private CodeableConcept code;
    private Collection<Annotation> note = Collections.emptyList();
    private Collection<Reference> focus = Collections.emptyList();
    private Collection<Reference> partOf = Collections.emptyList();
    private OBSERVATION_STATUS status;
    private Optional<ZonedDateTime> issued = Optional.empty();
    private Optional<CodeableConcept> method = Optional.empty();
    private Optional<Reference> device = Optional.empty();
    private Collection<Reference> basedOn = Collections.emptyList();
    private Optional<Reference> subject = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Optional<Quantity> value = Optional.empty();
    private Optional<CodeableConcept> bodySite = Optional.empty();
    private Optional<Reference> specimen = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Collection<Reference> performer = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<Choice00107722725> effective = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> interpretation = Optional.empty();
    private Optional<CodeableConcept> dataAbsentReason = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Observation.Component> component = Collections.emptyList();
    private Observation.ReferenceRange referenceRange;

    /**
     * Required fields for {@link Triglyceride}
     *
     * @param code - Triglyceride.
     * @param status - The status of the result value.
     * @param referenceRange - Guidance on how to interpret the value by comparison to a normal or
     *     recommended range. Multiple reference ranges are interpreted as an "OR". In other words,
     *     to represent two distinct target populations, two `referenceRange` elements would be
     *     used.
     */
    public Impl(
        CodeableConcept code,
        OBSERVATION_STATUS status,
        Observation.ReferenceRange referenceRange) {
      this.code = code;
      this.status = status;
      this.referenceRange = referenceRange;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public TriglycerideBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public TriglycerideBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public TriglycerideBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
      this.meta = Optional.of(meta.build());
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public TriglycerideBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public TriglycerideBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param note - Comments about result. */
    public TriglycerideBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - Comments about result. */
    public TriglycerideBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public TriglycerideBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param focus - The actual focus of an observation when it is not the patient of record
     *     representing something or someone associated with the patient such as a spouse, parent,
     *     fetus, or donor. For example, fetus observations in a mother's record. The focus of an
     *     observation could also be an existing condition, an intervention, the subject's diet,
     *     another observation of the subject, or a body structure such as tumor or implanted
     *     device. An example use case would be using the Observation resource to capture whether
     *     the mother is trained to change her child's tracheostomy tube. In this example, the child
     *     is the patient of record and the mother is the focus.
     */
    public TriglycerideBuilder.Impl withFocus(@NonNull Reference... focus) {
      this.focus = Arrays.asList(focus);
      return this;
    }
    /**
     * @param focus - The actual focus of an observation when it is not the patient of record
     *     representing something or someone associated with the patient such as a spouse, parent,
     *     fetus, or donor. For example, fetus observations in a mother's record. The focus of an
     *     observation could also be an existing condition, an intervention, the subject's diet,
     *     another observation of the subject, or a body structure such as tumor or implanted
     *     device. An example use case would be using the Observation resource to capture whether
     *     the mother is trained to change her child's tracheostomy tube. In this example, the child
     *     is the patient of record and the mother is the focus.
     */
    public TriglycerideBuilder.Impl withFocus(@NonNull Collection<Reference> focus) {
      this.focus = Collections.unmodifiableCollection(focus);
      return this;
    }

    public TriglycerideBuilder.Impl withFocus(@NonNull ReferenceBuilder... focus) {
      this.focus = Arrays.stream(focus).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param partOf - A larger event of which this particular Observation is a component or step.
     *     For example, an observation as part of a procedure.
     */
    public TriglycerideBuilder.Impl withPartOf(@NonNull Reference... partOf) {
      this.partOf = Arrays.asList(partOf);
      return this;
    }
    /**
     * @param partOf - A larger event of which this particular Observation is a component or step.
     *     For example, an observation as part of a procedure.
     */
    public TriglycerideBuilder.Impl withPartOf(@NonNull Collection<Reference> partOf) {
      this.partOf = Collections.unmodifiableCollection(partOf);
      return this;
    }

    public TriglycerideBuilder.Impl withPartOf(@NonNull ReferenceBuilder... partOf) {
      this.partOf = Arrays.stream(partOf).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param issued - The date and time this version of the observation was made available to
     *     providers, typically after the results have been reviewed and verified.
     */
    public TriglycerideBuilder.Impl withIssued(@NonNull ZonedDateTime issued) {
      this.issued = Optional.of(issued);
      return this;
    }
    /** @param method - Indicates the mechanism used to perform the observation. */
    public TriglycerideBuilder.Impl withMethod(@NonNull CodeableConcept method) {
      this.method = Optional.of(method);
      return this;
    }

    public TriglycerideBuilder.Impl withMethod(@NonNull CodeableConceptBuilder method) {
      this.method = Optional.of(method.build());
      return this;
    }
    /** @param device - The device used to generate the observation data. */
    public TriglycerideBuilder.Impl withDevice(@NonNull Reference device) {
      this.device = Optional.of(device);
      return this;
    }

    public TriglycerideBuilder.Impl withDevice(@NonNull ReferenceBuilder device) {
      this.device = Optional.of(device.build());
      return this;
    }
    /**
     * @param basedOn - A plan, proposal or order that is fulfilled in whole or in part by this
     *     event. For example, a MedicationRequest may require a patient to have laboratory test
     *     performed before it is dispensed.
     */
    public TriglycerideBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /**
     * @param basedOn - A plan, proposal or order that is fulfilled in whole or in part by this
     *     event. For example, a MedicationRequest may require a patient to have laboratory test
     *     performed before it is dispensed.
     */
    public TriglycerideBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public TriglycerideBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param subject - The patient, or group of patients, location, or device this observation is
     *     about and into whose record the observation is placed. If the actual focus of the
     *     observation is different from the subject (or a sample of, part, or region of the
     *     subject), the `focus` element or the `code` itself specifies the actual focus of the
     *     observation.
     */
    public TriglycerideBuilder.Impl withSubject(@NonNull Reference subject) {
      this.subject = Optional.of(subject);
      return this;
    }

    public TriglycerideBuilder.Impl withSubject(@NonNull ReferenceBuilder subject) {
      this.subject = Optional.of(subject.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public TriglycerideBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param category - A code that classifies the general type of observation being made. */
    public TriglycerideBuilder.Impl withCategory(@NonNull CodeableConcept... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /** @param category - A code that classifies the general type of observation being made. */
    public TriglycerideBuilder.Impl withCategory(@NonNull Collection<CodeableConcept> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }

    public TriglycerideBuilder.Impl withCategory(@NonNull CodeableConceptBuilder... category) {
      this.category = Arrays.stream(category).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param value - The information determined as a result of making the observation, if the
     *     information has a simple value.
     */
    public TriglycerideBuilder.Impl withValue(@NonNull Quantity value) {
      this.value = Optional.of(value);
      return this;
    }

    public TriglycerideBuilder.Impl withValue(@NonNull QuantityBuilder value) {
      this.value = Optional.of(value.build());
      return this;
    }
    /**
     * @param bodySite - Indicates the site on the subject's body where the observation was made
     *     (i.e. the target site).
     */
    public TriglycerideBuilder.Impl withBodySite(@NonNull CodeableConcept bodySite) {
      this.bodySite = Optional.of(bodySite);
      return this;
    }

    public TriglycerideBuilder.Impl withBodySite(@NonNull CodeableConceptBuilder bodySite) {
      this.bodySite = Optional.of(bodySite.build());
      return this;
    }
    /** @param specimen - The specimen that was used when this observation was made. */
    public TriglycerideBuilder.Impl withSpecimen(@NonNull Reference specimen) {
      this.specimen = Optional.of(specimen);
      return this;
    }

    public TriglycerideBuilder.Impl withSpecimen(@NonNull ReferenceBuilder specimen) {
      this.specimen = Optional.of(specimen.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public TriglycerideBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public TriglycerideBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public TriglycerideBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
      this.contained = Arrays.stream(contained).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public TriglycerideBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public TriglycerideBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public TriglycerideBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - The healthcare event (e.g. a patient and healthcare provider interaction)
     *     during which this observation is made.
     */
    public TriglycerideBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public TriglycerideBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /** @param performer - Who was responsible for asserting the observed value as "true". */
    public TriglycerideBuilder.Impl withPerformer(@NonNull Reference... performer) {
      this.performer = Arrays.asList(performer);
      return this;
    }
    /** @param performer - Who was responsible for asserting the observed value as "true". */
    public TriglycerideBuilder.Impl withPerformer(@NonNull Collection<Reference> performer) {
      this.performer = Collections.unmodifiableCollection(performer);
      return this;
    }

    public TriglycerideBuilder.Impl withPerformer(@NonNull ReferenceBuilder... performer) {
      this.performer = Arrays.stream(performer).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - A unique identifier assigned to this observation. */
    public TriglycerideBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - A unique identifier assigned to this observation. */
    public TriglycerideBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public TriglycerideBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param effective - The time or time-period the observed value is asserted as being true. For
     *     biological subjects - e.g. human patients - this is usually called the "physiologically
     *     relevant time". This is usually either the time of the procedure or of specimen
     *     collection, but very often the source of the date/time is not known, only the date/time
     *     itself. Field is a 'choice' field. Type should be one of FHIRDateTime, Period, Timing,
     *     ZonedDateTime. To pass the value in, wrap with one of the TriglycerideBuilder.effective
     *     static methods
     */
    public TriglycerideBuilder.Impl withEffective(@NonNull Choice00107722725 effective) {
      this.effective = Optional.of(effective);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public TriglycerideBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param interpretation - + | ++ | +++ | - | -- | ---. */
    public TriglycerideBuilder.Impl withInterpretation(@NonNull CodeableConcept interpretation) {
      this.interpretation = Optional.of(interpretation);
      return this;
    }

    public TriglycerideBuilder.Impl withInterpretation(
        @NonNull CodeableConceptBuilder interpretation) {
      this.interpretation = Optional.of(interpretation.build());
      return this;
    }
    /**
     * @param dataAbsentReason - Provides a reason why the expected value in the element
     *     Observation.value[x] is missing.
     */
    public TriglycerideBuilder.Impl withDataAbsentReason(
        @NonNull CodeableConcept dataAbsentReason) {
      this.dataAbsentReason = Optional.of(dataAbsentReason);
      return this;
    }

    public TriglycerideBuilder.Impl withDataAbsentReason(
        @NonNull CodeableConceptBuilder dataAbsentReason) {
      this.dataAbsentReason = Optional.of(dataAbsentReason.build());
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public TriglycerideBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public TriglycerideBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public TriglycerideBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param component - Some observations have multiple component observations. These component
     *     observations are expressed as separate code value pairs that share the same attributes.
     *     Examples include systolic and diastolic component observations for blood pressure
     *     measurement and multiple component observations for genetics observations.
     */
    public TriglycerideBuilder.Impl withComponent(@NonNull Observation.Component... component) {
      this.component = Arrays.asList(component);
      return this;
    }
    /**
     * @param component - Some observations have multiple component observations. These component
     *     observations are expressed as separate code value pairs that share the same attributes.
     *     Examples include systolic and diastolic component observations for blood pressure
     *     measurement and multiple component observations for genetics observations.
     */
    public TriglycerideBuilder.Impl withComponent(
        @NonNull Collection<Observation.Component> component) {
      this.component = Collections.unmodifiableCollection(component);
      return this;
    }

    public TriglycerideBuilder.Impl withComponent(
        @NonNull Observation_ComponentBuilder... component) {
      this.component = Arrays.stream(component).map(e -> e.build()).collect(toList());
      return this;
    }

    public TriglycerideBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Triglyceride build() {
      return new Triglyceride(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          code,
          note.stream().collect(new LitSeqJCollector<>()),
          focus.stream().collect(new LitSeqJCollector<>()),
          partOf.stream().collect(new LitSeqJCollector<>()),
          status,
          OptionConverters.toScala(issued),
          OptionConverters.toScala(method),
          OptionConverters.toScala(device),
          basedOn.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(subject),
          OptionConverters.toScala(language),
          category.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(value),
          OptionConverters.toScala(bodySite),
          OptionConverters.toScala(specimen),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          performer.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(effective),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(interpretation),
          OptionConverters.toScala(dataAbsentReason),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          component.stream().collect(new LitSeqJCollector<>()),
          referenceRange,
          LitUtils.emptyMetaElMap());
    }
  }
}
