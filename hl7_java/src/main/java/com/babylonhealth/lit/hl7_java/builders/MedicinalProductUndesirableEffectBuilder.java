package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface MedicinalProductUndesirableEffectBuilder extends DomainResourceBuilder {
  public MedicinalProductUndesirableEffect build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements MedicinalProductUndesirableEffectBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<Reference> subject = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Choice> population = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> classification = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> frequencyOfOccurrence = Optional.empty();
    private Optional<CodeableConcept> symptomConditionEffect = Optional.empty();

    /** Required fields for {@link MedicinalProductUndesirableEffect} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicinalProductUndesirableEffectBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public MedicinalProductUndesirableEffectBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public MedicinalProductUndesirableEffectBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public MedicinalProductUndesirableEffectBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public MedicinalProductUndesirableEffectBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param subject - The medication for which this is an indication. */
    public MedicinalProductUndesirableEffectBuilder.Impl withSubject(
        @NonNull Reference... subject) {
      this.subject = Arrays.asList(subject);
      return this;
    }
    /** @param subject - The medication for which this is an indication. */
    public MedicinalProductUndesirableEffectBuilder.Impl withSubject(
        @NonNull Collection<Reference> subject) {
      this.subject = Collections.unmodifiableCollection(subject);
      return this;
    }

    public MedicinalProductUndesirableEffectBuilder.Impl withSubject(
        @NonNull ReferenceBuilder... subject) {
      this.subject = Arrays.stream(subject).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public MedicinalProductUndesirableEffectBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MedicinalProductUndesirableEffectBuilder.Impl withContained(
        @NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MedicinalProductUndesirableEffectBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public MedicinalProductUndesirableEffectBuilder.Impl withContained(
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
    public MedicinalProductUndesirableEffectBuilder.Impl withExtension(
        @NonNull Extension... extension) {
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
    public MedicinalProductUndesirableEffectBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicinalProductUndesirableEffectBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param population - The population group to which this applies. */
    public MedicinalProductUndesirableEffectBuilder.Impl withPopulation(
        @NonNull Choice... population) {
      this.population = Arrays.asList(population);
      return this;
    }
    /** @param population - The population group to which this applies. */
    public MedicinalProductUndesirableEffectBuilder.Impl withPopulation(
        @NonNull Collection<Choice> population) {
      this.population = Collections.unmodifiableCollection(population);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public MedicinalProductUndesirableEffectBuilder.Impl withImplicitRules(
        @NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param classification - Classification of the effect. */
    public MedicinalProductUndesirableEffectBuilder.Impl withClassification(
        @NonNull CodeableConcept classification) {
      this.classification = Optional.of(classification);
      return this;
    }

    public MedicinalProductUndesirableEffectBuilder.Impl withClassification(
        @NonNull CodeableConceptBuilder classification) {
      this.classification = Optional.of(classification.build());
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
    public MedicinalProductUndesirableEffectBuilder.Impl withModifierExtension(
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
    public MedicinalProductUndesirableEffectBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicinalProductUndesirableEffectBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param frequencyOfOccurrence - The frequency of occurrence of the effect. */
    public MedicinalProductUndesirableEffectBuilder.Impl withFrequencyOfOccurrence(
        @NonNull CodeableConcept frequencyOfOccurrence) {
      this.frequencyOfOccurrence = Optional.of(frequencyOfOccurrence);
      return this;
    }

    public MedicinalProductUndesirableEffectBuilder.Impl withFrequencyOfOccurrence(
        @NonNull CodeableConceptBuilder frequencyOfOccurrence) {
      this.frequencyOfOccurrence = Optional.of(frequencyOfOccurrence.build());
      return this;
    }
    /** @param symptomConditionEffect - The symptom, condition or undesirable effect. */
    public MedicinalProductUndesirableEffectBuilder.Impl withSymptomConditionEffect(
        @NonNull CodeableConcept symptomConditionEffect) {
      this.symptomConditionEffect = Optional.of(symptomConditionEffect);
      return this;
    }

    public MedicinalProductUndesirableEffectBuilder.Impl withSymptomConditionEffect(
        @NonNull CodeableConceptBuilder symptomConditionEffect) {
      this.symptomConditionEffect = Optional.of(symptomConditionEffect.build());
      return this;
    }

    public MedicinalProductUndesirableEffectBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public MedicinalProductUndesirableEffect build() {
      return new MedicinalProductUndesirableEffect(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          subject.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          (LitSeq) population.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(classification),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(frequencyOfOccurrence),
          OptionConverters.toScala(symptomConditionEffect),
          LitUtils.emptyMetaElMap());
    }
  }
}
