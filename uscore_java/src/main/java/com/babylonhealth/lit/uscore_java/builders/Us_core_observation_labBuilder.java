package com.babylonhealth.lit.uscore_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.uscore.model.*;
import com.babylonhealth.lit.uscore_java.model.Unions.*;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface Us_core_observation_labBuilder extends ObservationBuilder {
  public Us_core_observation_lab build();

  public static Impl init(
      CodeableConcept code,
      OBSERVATION_STATUS status,
      Reference subject,
      Collection<CodeableConcept> category) {
    return new Impl(code, status, subject, category);
  }

  public static Impl builder(
      CodeableConceptBuilder code,
      OBSERVATION_STATUS status,
      ReferenceBuilder subject,
      Collection<CodeableConceptBuilder> category) {
    return new Impl(
        code.build(),
        status,
        subject.build(),
        new LitSeq<>(category).map(CodeableConceptBuilder::build));
  }

  public static Choice02118820890 value(Boolean b) {
    return new Choice02118820890(b);
  }

  public static Choice02118820890 value(CodeableConcept c) {
    return new Choice02118820890(c);
  }

  public static Choice02118820890 value(FHIRDateTime f) {
    return new Choice02118820890(f);
  }

  public static Choice02118820890 value(Integer i) {
    return new Choice02118820890(i);
  }

  public static Choice02118820890 value(LocalTime l) {
    return new Choice02118820890(l);
  }

  public static Choice02118820890 value(Period p) {
    return new Choice02118820890(p);
  }

  public static Choice02118820890 value(Quantity q) {
    return new Choice02118820890(q);
  }

  public static Choice02118820890 value(Range r) {
    return new Choice02118820890(r);
  }

  public static Choice02118820890 value(Ratio r) {
    return new Choice02118820890(r);
  }

  public static Choice02118820890 value(SampledData s) {
    return new Choice02118820890(s);
  }

  public static Choice02118820890 value(String s) {
    return new Choice02118820890(s);
  }

  public static ChoiceDateTimeOrPeriod effective(FHIRDateTime f) {
    return new ChoiceDateTimeOrPeriod(f);
  }

  public static ChoiceDateTimeOrPeriod effective(Period p) {
    return new ChoiceDateTimeOrPeriod(p);
  }

  public class Impl implements Us_core_observation_labBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile(
                    "http://hl7.org/fhir/us/core/StructureDefinition/us-core-observation-lab")
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
    private Reference subject;
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category;
    private Optional<Choice02118820890> value = Optional.empty();
    private Optional<CodeableConcept> bodySite = Optional.empty();
    private Optional<Reference> specimen = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Collection<Reference> performer = Collections.emptyList();
    private Collection<Reference> hasMember = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<Reference> derivedFrom = Collections.emptyList();
    private Optional<ChoiceDateTimeOrPeriod> effective = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<CodeableConcept> interpretation = Collections.emptyList();
    private Optional<CodeableConcept> dataAbsentReason = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Observation.Component> component = Collections.emptyList();
    private Collection<Observation.ReferenceRange> referenceRange = Collections.emptyList();

    /**
     * Required fields for {@link Us_core_observation_lab}
     *
     * @param code - The test that was performed. A LOINC **SHALL** be used if the concept is
     *     present in LOINC.
     * @param status - The status of the result value.
     * @param subject - The patient, or group of patients, location, or device this observation is
     *     about and into whose record the observation is placed. If the actual focus of the
     *     observation is different from the subject (or a sample of, part, or region of the
     *     subject), the `focus` element or the `code` itself specifies the actual focus of the
     *     observation.
     * @param category - A code that classifies the general type of observation being made.
     */
    public Impl(
        CodeableConcept code,
        OBSERVATION_STATUS status,
        Reference subject,
        Collection<CodeableConcept> category) {
      this.code = code;
      this.status = status;
      this.subject = subject;
      this.category = category;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Us_core_observation_labBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public Us_core_observation_labBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public Us_core_observation_labBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param note - Comments about the observation or the results. */
    public Us_core_observation_labBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - Comments about the observation or the results. */
    public Us_core_observation_labBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
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
    public Us_core_observation_labBuilder.Impl withFocus(@NonNull Reference... focus) {
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
    public Us_core_observation_labBuilder.Impl withFocus(@NonNull Collection<Reference> focus) {
      this.focus = Collections.unmodifiableCollection(focus);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withFocus(@NonNull ReferenceBuilder... focus) {
      this.focus = Arrays.stream(focus).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param partOf - A larger event of which this particular Observation is a component or step.
     *     For example, an observation as part of a procedure.
     */
    public Us_core_observation_labBuilder.Impl withPartOf(@NonNull Reference... partOf) {
      this.partOf = Arrays.asList(partOf);
      return this;
    }
    /**
     * @param partOf - A larger event of which this particular Observation is a component or step.
     *     For example, an observation as part of a procedure.
     */
    public Us_core_observation_labBuilder.Impl withPartOf(@NonNull Collection<Reference> partOf) {
      this.partOf = Collections.unmodifiableCollection(partOf);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withPartOf(@NonNull ReferenceBuilder... partOf) {
      this.partOf = Arrays.stream(partOf).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param issued - The date and time this version of the observation was made available to
     *     providers, typically after the results have been reviewed and verified.
     */
    public Us_core_observation_labBuilder.Impl withIssued(@NonNull ZonedDateTime issued) {
      this.issued = Optional.of(issued);
      return this;
    }
    /** @param method - Indicates the mechanism used to perform the observation. */
    public Us_core_observation_labBuilder.Impl withMethod(@NonNull CodeableConcept method) {
      this.method = Optional.of(method);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withMethod(@NonNull CodeableConceptBuilder method) {
      this.method = Optional.of(method.build());
      return this;
    }
    /** @param device - The device used to generate the observation data. */
    public Us_core_observation_labBuilder.Impl withDevice(@NonNull Reference device) {
      this.device = Optional.of(device);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withDevice(@NonNull ReferenceBuilder device) {
      this.device = Optional.of(device.build());
      return this;
    }
    /**
     * @param basedOn - A plan, proposal or order that is fulfilled in whole or in part by this
     *     event. For example, a MedicationRequest may require a patient to have laboratory test
     *     performed before it is dispensed.
     */
    public Us_core_observation_labBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /**
     * @param basedOn - A plan, proposal or order that is fulfilled in whole or in part by this
     *     event. For example, a MedicationRequest may require a patient to have laboratory test
     *     performed before it is dispensed.
     */
    public Us_core_observation_labBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public Us_core_observation_labBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param value - The Laboratory result value. If a coded value, the valueCodeableConcept.code
     *     **SHOULD** be selected from [SNOMED
     *     CT](http://hl7.org/fhir/ValueSet/uslab-obs-codedresults). If a numeric value,
     *     valueQuantity.code **SHALL** be selected from [UCUM](http://unitsofmeasure.org). A FHIR
     *     [UCUM Codes value set](http://hl7.org/fhir/STU3/valueset-ucum-units.html) that defines
     *     all UCUM codes is in the FHIR specification. Field is a 'choice' field. Type should be
     *     one of Boolean, CodeableConcept, FHIRDateTime, Integer, LocalTime, Period, Quantity,
     *     Range, Ratio, SampledData, String. To pass the value in, wrap with one of the
     *     Us_core_observation_labBuilder.value static methods
     */
    public Us_core_observation_labBuilder.Impl withValue(@NonNull Choice02118820890 value) {
      this.value = Optional.of(value);
      return this;
    }
    /**
     * @param bodySite - Indicates the site on the subject's body where the observation was made
     *     (i.e. the target site).
     */
    public Us_core_observation_labBuilder.Impl withBodySite(@NonNull CodeableConcept bodySite) {
      this.bodySite = Optional.of(bodySite);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withBodySite(
        @NonNull CodeableConceptBuilder bodySite) {
      this.bodySite = Optional.of(bodySite.build());
      return this;
    }
    /** @param specimen - The specimen that was used when this observation was made. */
    public Us_core_observation_labBuilder.Impl withSpecimen(@NonNull Reference specimen) {
      this.specimen = Optional.of(specimen);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withSpecimen(@NonNull ReferenceBuilder specimen) {
      this.specimen = Optional.of(specimen.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_observation_labBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_observation_labBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withContained(
        @NonNull ResourceBuilder... contained) {
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
    public Us_core_observation_labBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Us_core_observation_labBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - The healthcare event (e.g. a patient and healthcare provider interaction)
     *     during which this observation is made.
     */
    public Us_core_observation_labBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /** @param performer - Who was responsible for asserting the observed value as "true". */
    public Us_core_observation_labBuilder.Impl withPerformer(@NonNull Reference... performer) {
      this.performer = Arrays.asList(performer);
      return this;
    }
    /** @param performer - Who was responsible for asserting the observed value as "true". */
    public Us_core_observation_labBuilder.Impl withPerformer(
        @NonNull Collection<Reference> performer) {
      this.performer = Collections.unmodifiableCollection(performer);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withPerformer(
        @NonNull ReferenceBuilder... performer) {
      this.performer = Arrays.stream(performer).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param hasMember - This observation is a group observation (e.g. a battery, a panel of tests,
     *     a set of vital sign measurements) that includes the target as a member of the group.
     */
    public Us_core_observation_labBuilder.Impl withHasMember(@NonNull Reference... hasMember) {
      this.hasMember = Arrays.asList(hasMember);
      return this;
    }
    /**
     * @param hasMember - This observation is a group observation (e.g. a battery, a panel of tests,
     *     a set of vital sign measurements) that includes the target as a member of the group.
     */
    public Us_core_observation_labBuilder.Impl withHasMember(
        @NonNull Collection<Reference> hasMember) {
      this.hasMember = Collections.unmodifiableCollection(hasMember);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withHasMember(
        @NonNull ReferenceBuilder... hasMember) {
      this.hasMember = Arrays.stream(hasMember).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - A unique identifier assigned to this observation. */
    public Us_core_observation_labBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - A unique identifier assigned to this observation. */
    public Us_core_observation_labBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param derivedFrom - The target resource that represents a measurement from which this
     *     observation value is derived. For example, a calculated anion gap or a fetal measurement
     *     based on an ultrasound image.
     */
    public Us_core_observation_labBuilder.Impl withDerivedFrom(@NonNull Reference... derivedFrom) {
      this.derivedFrom = Arrays.asList(derivedFrom);
      return this;
    }
    /**
     * @param derivedFrom - The target resource that represents a measurement from which this
     *     observation value is derived. For example, a calculated anion gap or a fetal measurement
     *     based on an ultrasound image.
     */
    public Us_core_observation_labBuilder.Impl withDerivedFrom(
        @NonNull Collection<Reference> derivedFrom) {
      this.derivedFrom = Collections.unmodifiableCollection(derivedFrom);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withDerivedFrom(
        @NonNull ReferenceBuilder... derivedFrom) {
      this.derivedFrom = Arrays.stream(derivedFrom).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param effective - For lab tests this is the specimen collection date. For Ask at Order Entry
     *     Questions (AOE)'s this is the date the question was asked. Field is a 'choice' field.
     *     Type should be one of FHIRDateTime, Period. To pass the value in, wrap with one of the
     *     Us_core_observation_labBuilder.effective static methods
     */
    public Us_core_observation_labBuilder.Impl withEffective(
        @NonNull ChoiceDateTimeOrPeriod effective) {
      this.effective = Optional.of(effective);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public Us_core_observation_labBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param interpretation - A categorical assessment of an observation value. For example, high,
     *     low, normal.
     */
    public Us_core_observation_labBuilder.Impl withInterpretation(
        @NonNull CodeableConcept... interpretation) {
      this.interpretation = Arrays.asList(interpretation);
      return this;
    }
    /**
     * @param interpretation - A categorical assessment of an observation value. For example, high,
     *     low, normal.
     */
    public Us_core_observation_labBuilder.Impl withInterpretation(
        @NonNull Collection<CodeableConcept> interpretation) {
      this.interpretation = Collections.unmodifiableCollection(interpretation);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withInterpretation(
        @NonNull CodeableConceptBuilder... interpretation) {
      this.interpretation = Arrays.stream(interpretation).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param dataAbsentReason - Provides a reason why the expected value in the element
     *     Observation.value[x] is missing.
     */
    public Us_core_observation_labBuilder.Impl withDataAbsentReason(
        @NonNull CodeableConcept dataAbsentReason) {
      this.dataAbsentReason = Optional.of(dataAbsentReason);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withDataAbsentReason(
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
    public Us_core_observation_labBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
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
    public Us_core_observation_labBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withModifierExtension(
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
    public Us_core_observation_labBuilder.Impl withComponent(
        @NonNull Observation.Component... component) {
      this.component = Arrays.asList(component);
      return this;
    }
    /**
     * @param component - Some observations have multiple component observations. These component
     *     observations are expressed as separate code value pairs that share the same attributes.
     *     Examples include systolic and diastolic component observations for blood pressure
     *     measurement and multiple component observations for genetics observations.
     */
    public Us_core_observation_labBuilder.Impl withComponent(
        @NonNull Collection<Observation.Component> component) {
      this.component = Collections.unmodifiableCollection(component);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withComponent(
        @NonNull Observation_ComponentBuilder... component) {
      this.component = Arrays.stream(component).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param referenceRange - Guidance on how to interpret the value by comparison to a normal or
     *     recommended range. Multiple reference ranges are interpreted as an "OR". In other words,
     *     to represent two distinct target populations, two `referenceRange` elements would be
     *     used.
     */
    public Us_core_observation_labBuilder.Impl withReferenceRange(
        @NonNull Observation.ReferenceRange... referenceRange) {
      this.referenceRange = Arrays.asList(referenceRange);
      return this;
    }
    /**
     * @param referenceRange - Guidance on how to interpret the value by comparison to a normal or
     *     recommended range. Multiple reference ranges are interpreted as an "OR". In other words,
     *     to represent two distinct target populations, two `referenceRange` elements would be
     *     used.
     */
    public Us_core_observation_labBuilder.Impl withReferenceRange(
        @NonNull Collection<Observation.ReferenceRange> referenceRange) {
      this.referenceRange = Collections.unmodifiableCollection(referenceRange);
      return this;
    }

    public Us_core_observation_labBuilder.Impl withReferenceRange(
        @NonNull Observation_ReferenceRangeBuilder... referenceRange) {
      this.referenceRange = Arrays.stream(referenceRange).map(e -> e.build()).collect(toList());
      return this;
    }

    public Us_core_observation_labBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Us_core_observation_lab build() {
      return new Us_core_observation_lab(
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
          subject,
          OptionConverters.toScala(language),
          category.stream().collect(new NonEmptyLitSeqJCollector<>()),
          (Option) OptionConverters.toScala(value),
          OptionConverters.toScala(bodySite),
          OptionConverters.toScala(specimen),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          performer.stream().collect(new LitSeqJCollector<>()),
          hasMember.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          derivedFrom.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(effective),
          OptionConverters.toScala(implicitRules),
          interpretation.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(dataAbsentReason),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          component.stream().collect(new LitSeqJCollector<>()),
          referenceRange.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
