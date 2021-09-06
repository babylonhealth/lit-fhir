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
import com.babylonhealth.lit.hl7.ALLERGY_INTOLERANCE_TYPE;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.ALLERGY_INTOLERANCE_CATEGORY;
import com.babylonhealth.lit.hl7.ALLERGY_INTOLERANCE_CRITICALITY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface AllergyIntoleranceBuilder extends DomainResourceBuilder {
  public AllergyIntolerance build();

  public static Impl init(Reference patient) {
    return new Impl(patient);
  }

  public static Impl builder(ReferenceBuilder patient) {
    return new Impl(patient.build());
  }

  public static Choice01352864625 onset(Age a) {
    return new Choice01352864625(a);
  }

  public static Choice01352864625 onset(FHIRDateTime f) {
    return new Choice01352864625(f);
  }

  public static Choice01352864625 onset(Period p) {
    return new Choice01352864625(p);
  }

  public static Choice01352864625 onset(Range r) {
    return new Choice01352864625(r);
  }

  public static Choice01352864625 onset(String s) {
    return new Choice01352864625(s);
  }

  public class Impl implements AllergyIntoleranceBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<ALLERGY_INTOLERANCE_TYPE> _type = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Reference patient;
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<ALLERGY_INTOLERANCE_CATEGORY> category = Collections.emptyList();
    private Optional<Choice01352864625> onset = Optional.empty();
    private Optional<Reference> recorder = Optional.empty();
    private Optional<Reference> asserter = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<ALLERGY_INTOLERANCE_CRITICALITY> criticality = Optional.empty();
    private Optional<FHIRDateTime> recordedDate = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> clinicalStatus = Optional.empty();
    private Optional<FHIRDateTime> lastOccurrence = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> verificationStatus = Optional.empty();
    private Collection<AllergyIntolerance.Reaction> reaction = Collections.emptyList();

    /**
     * Required fields for {@link AllergyIntolerance}
     *
     * @param patient - The patient who has the allergy or intolerance.
     */
    public Impl(Reference patient) {
      this.patient = patient;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public AllergyIntoleranceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public AllergyIntoleranceBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public AllergyIntoleranceBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public AllergyIntoleranceBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public AllergyIntoleranceBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param _type - Identification of the underlying physiological mechanism for the reaction
     *     risk.
     */
    public AllergyIntoleranceBuilder.Impl withType(@NonNull ALLERGY_INTOLERANCE_TYPE _type) {
      this._type = Optional.of(_type);
      return this;
    }
    /**
     * @param code - Code for an allergy or intolerance statement (either a positive or a
     *     negated/excluded statement). This may be a code for a substance or pharmaceutical product
     *     that is considered to be responsible for the adverse reaction risk (e.g., "Latex"), an
     *     allergy or intolerance condition (e.g., "Latex allergy"), or a negated/excluded code for
     *     a specific substance or class (e.g., "No latex allergy") or a general or categorical
     *     negated statement (e.g., "No known allergy", "No known drug allergies"). Note: the
     *     substance for a specific reaction may be different from the substance identified as the
     *     cause of the risk, but it must be consistent with it. For instance, it may be a more
     *     specific substance (e.g. a brand medication) or a composite product that includes the
     *     identified substance. It must be clinically safe to only process the 'code' and ignore
     *     the 'reaction.substance'. If a receiving system is unable to confirm that
     *     AllergyIntolerance.reaction.substance falls within the semantic scope of
     *     AllergyIntolerance.code, then the receiving system should ignore
     *     AllergyIntolerance.reaction.substance.
     */
    public AllergyIntoleranceBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public AllergyIntoleranceBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /**
     * @param note - Additional narrative about the propensity for the Adverse Reaction, not
     *     captured in other fields.
     */
    public AllergyIntoleranceBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Additional narrative about the propensity for the Adverse Reaction, not
     *     captured in other fields.
     */
    public AllergyIntoleranceBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public AllergyIntoleranceBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public AllergyIntoleranceBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param category - Category of the identified substance. */
    public AllergyIntoleranceBuilder.Impl withCategory(
        @NonNull ALLERGY_INTOLERANCE_CATEGORY... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /** @param category - Category of the identified substance. */
    public AllergyIntoleranceBuilder.Impl withCategory(
        @NonNull Collection<ALLERGY_INTOLERANCE_CATEGORY> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }
    /**
     * @param onset - Estimated or actual date, date-time, or age when allergy or intolerance was
     *     identified. Field is a 'choice' field. Type should be one of Age, FHIRDateTime, Period,
     *     Range, String. To pass the value in, wrap with one of the AllergyIntoleranceBuilder.onset
     *     static methods
     */
    public AllergyIntoleranceBuilder.Impl withOnset(@NonNull Choice01352864625 onset) {
      this.onset = Optional.of(onset);
      return this;
    }
    /**
     * @param recorder - Individual who recorded the record and takes responsibility for its
     *     content.
     */
    public AllergyIntoleranceBuilder.Impl withRecorder(@NonNull Reference recorder) {
      this.recorder = Optional.of(recorder);
      return this;
    }

    public AllergyIntoleranceBuilder.Impl withRecorder(@NonNull ReferenceBuilder recorder) {
      this.recorder = Optional.of(recorder.build());
      return this;
    }
    /** @param asserter - The source of the information about the allergy that is recorded. */
    public AllergyIntoleranceBuilder.Impl withAsserter(@NonNull Reference asserter) {
      this.asserter = Optional.of(asserter);
      return this;
    }

    public AllergyIntoleranceBuilder.Impl withAsserter(@NonNull ReferenceBuilder asserter) {
      this.asserter = Optional.of(asserter.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public AllergyIntoleranceBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public AllergyIntoleranceBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public AllergyIntoleranceBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public AllergyIntoleranceBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public AllergyIntoleranceBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public AllergyIntoleranceBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param encounter - The encounter when the allergy or intolerance was asserted. */
    public AllergyIntoleranceBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public AllergyIntoleranceBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this AllergyIntolerance by the performer
     *     or other systems which remain constant as the resource is updated and propagates from
     *     server to server.
     */
    public AllergyIntoleranceBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this AllergyIntolerance by the performer
     *     or other systems which remain constant as the resource is updated and propagates from
     *     server to server.
     */
    public AllergyIntoleranceBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public AllergyIntoleranceBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param criticality - Estimate of the potential clinical harm, or seriousness, of the reaction
     *     to the identified substance.
     */
    public AllergyIntoleranceBuilder.Impl withCriticality(
        @NonNull ALLERGY_INTOLERANCE_CRITICALITY criticality) {
      this.criticality = Optional.of(criticality);
      return this;
    }
    /**
     * @param recordedDate - The recordedDate represents when this particular AllergyIntolerance
     *     record was created in the system, which is often a system-generated date.
     */
    public AllergyIntoleranceBuilder.Impl withRecordedDate(@NonNull FHIRDateTime recordedDate) {
      this.recordedDate = Optional.of(recordedDate);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public AllergyIntoleranceBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param clinicalStatus - The clinical status of the allergy or intolerance. */
    public AllergyIntoleranceBuilder.Impl withClinicalStatus(
        @NonNull CodeableConcept clinicalStatus) {
      this.clinicalStatus = Optional.of(clinicalStatus);
      return this;
    }

    public AllergyIntoleranceBuilder.Impl withClinicalStatus(
        @NonNull CodeableConceptBuilder clinicalStatus) {
      this.clinicalStatus = Optional.of(clinicalStatus.build());
      return this;
    }
    /**
     * @param lastOccurrence - Represents the date and/or time of the last known occurrence of a
     *     reaction event.
     */
    public AllergyIntoleranceBuilder.Impl withLastOccurrence(@NonNull FHIRDateTime lastOccurrence) {
      this.lastOccurrence = Optional.of(lastOccurrence);
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
    public AllergyIntoleranceBuilder.Impl withModifierExtension(
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
    public AllergyIntoleranceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public AllergyIntoleranceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param verificationStatus - Assertion about certainty associated with the propensity, or
     *     potential risk, of a reaction to the identified substance (including pharmaceutical
     *     product).
     */
    public AllergyIntoleranceBuilder.Impl withVerificationStatus(
        @NonNull CodeableConcept verificationStatus) {
      this.verificationStatus = Optional.of(verificationStatus);
      return this;
    }

    public AllergyIntoleranceBuilder.Impl withVerificationStatus(
        @NonNull CodeableConceptBuilder verificationStatus) {
      this.verificationStatus = Optional.of(verificationStatus.build());
      return this;
    }
    /**
     * @param reaction - Details about each adverse reaction event linked to exposure to the
     *     identified substance.
     */
    public AllergyIntoleranceBuilder.Impl withReaction(
        @NonNull AllergyIntolerance.Reaction... reaction) {
      this.reaction = Arrays.asList(reaction);
      return this;
    }
    /**
     * @param reaction - Details about each adverse reaction event linked to exposure to the
     *     identified substance.
     */
    public AllergyIntoleranceBuilder.Impl withReaction(
        @NonNull Collection<AllergyIntolerance.Reaction> reaction) {
      this.reaction = Collections.unmodifiableCollection(reaction);
      return this;
    }

    public AllergyIntoleranceBuilder.Impl withReaction(
        @NonNull AllergyIntolerance_ReactionBuilder... reaction) {
      this.reaction = Arrays.stream(reaction).map(e -> e.build()).collect(toList());
      return this;
    }

    public AllergyIntoleranceBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public AllergyIntolerance build() {
      return new AllergyIntolerance(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(code),
          note.stream().collect(new LitSeqJCollector<>()),
          patient,
          OptionConverters.toScala(language),
          category.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(onset),
          OptionConverters.toScala(recorder),
          OptionConverters.toScala(asserter),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(criticality),
          OptionConverters.toScala(recordedDate),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(clinicalStatus),
          OptionConverters.toScala(lastOccurrence),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(verificationStatus),
          reaction.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
