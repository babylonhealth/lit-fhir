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
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class MedicinalProductIndicationBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Collection<Reference> subject = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<Quantity> duration = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Choice> population = Collections.emptyList();
  private Collection<CodeableConcept> comorbidity = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<CodeableConcept> diseaseStatus = Optional.empty();
  private Optional<CodeableConcept> intendedEffect = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Reference> undesirableEffect = Collections.emptyList();
  private Optional<CodeableConcept> diseaseSymptomProcedure = Optional.empty();
  private Collection<MedicinalProductIndication.OtherTherapy> otherTherapy =
      Collections.emptyList();

  /** Required fields for {@link MedicinalProductIndication} */
  public MedicinalProductIndicationBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public MedicinalProductIndicationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public MedicinalProductIndicationBuilder withMeta(@NonNull Meta meta) {
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
  public MedicinalProductIndicationBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param subject - The medication for which this is an indication. */
  public MedicinalProductIndicationBuilder withSubject(@NonNull Reference... subject) {
    this.subject = Arrays.asList(subject);
    return this;
  }
  /** @param subject - The medication for which this is an indication. */
  public MedicinalProductIndicationBuilder withSubject(@NonNull Collection<Reference> subject) {
    this.subject = Collections.unmodifiableCollection(subject);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public MedicinalProductIndicationBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /** @param duration - Timing or duration information as part of the indication. */
  public MedicinalProductIndicationBuilder withDuration(@NonNull Quantity duration) {
    this.duration = Optional.of(duration);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public MedicinalProductIndicationBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public MedicinalProductIndicationBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public MedicinalProductIndicationBuilder withExtension(@NonNull Extension... extension) {
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
  public MedicinalProductIndicationBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param population - The population group to which this applies. */
  public MedicinalProductIndicationBuilder withPopulation(@NonNull Choice... population) {
    this.population = Arrays.asList(population);
    return this;
  }
  /** @param population - The population group to which this applies. */
  public MedicinalProductIndicationBuilder withPopulation(@NonNull Collection<Choice> population) {
    this.population = Collections.unmodifiableCollection(population);
    return this;
  }
  /**
   * @param comorbidity - Comorbidity (concurrent condition) or co-infection as part of the
   *     indication.
   */
  public MedicinalProductIndicationBuilder withComorbidity(
      @NonNull CodeableConcept... comorbidity) {
    this.comorbidity = Arrays.asList(comorbidity);
    return this;
  }
  /**
   * @param comorbidity - Comorbidity (concurrent condition) or co-infection as part of the
   *     indication.
   */
  public MedicinalProductIndicationBuilder withComorbidity(
      @NonNull Collection<CodeableConcept> comorbidity) {
    this.comorbidity = Collections.unmodifiableCollection(comorbidity);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public MedicinalProductIndicationBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param diseaseStatus - The status of the disease or symptom for which the indication applies.
   */
  public MedicinalProductIndicationBuilder withDiseaseStatus(
      @NonNull CodeableConcept diseaseStatus) {
    this.diseaseStatus = Optional.of(diseaseStatus);
    return this;
  }
  /**
   * @param intendedEffect - The intended effect, aim or strategy to be achieved by the indication.
   */
  public MedicinalProductIndicationBuilder withIntendedEffect(
      @NonNull CodeableConcept intendedEffect) {
    this.intendedEffect = Optional.of(intendedEffect);
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
  public MedicinalProductIndicationBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
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
  public MedicinalProductIndicationBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param undesirableEffect - Describe the undesirable effects of the medicinal product. */
  public MedicinalProductIndicationBuilder withUndesirableEffect(
      @NonNull Reference... undesirableEffect) {
    this.undesirableEffect = Arrays.asList(undesirableEffect);
    return this;
  }
  /** @param undesirableEffect - Describe the undesirable effects of the medicinal product. */
  public MedicinalProductIndicationBuilder withUndesirableEffect(
      @NonNull Collection<Reference> undesirableEffect) {
    this.undesirableEffect = Collections.unmodifiableCollection(undesirableEffect);
    return this;
  }
  /**
   * @param diseaseSymptomProcedure - The disease, symptom or procedure that is the indication for
   *     treatment.
   */
  public MedicinalProductIndicationBuilder withDiseaseSymptomProcedure(
      @NonNull CodeableConcept diseaseSymptomProcedure) {
    this.diseaseSymptomProcedure = Optional.of(diseaseSymptomProcedure);
    return this;
  }
  /**
   * @param otherTherapy - Information about the use of the medicinal product in relation to other
   *     therapies described as part of the indication.
   */
  public MedicinalProductIndicationBuilder withOtherTherapy(
      @NonNull MedicinalProductIndication.OtherTherapy... otherTherapy) {
    this.otherTherapy = Arrays.asList(otherTherapy);
    return this;
  }
  /**
   * @param otherTherapy - Information about the use of the medicinal product in relation to other
   *     therapies described as part of the indication.
   */
  public MedicinalProductIndicationBuilder withOtherTherapy(
      @NonNull Collection<MedicinalProductIndication.OtherTherapy> otherTherapy) {
    this.otherTherapy = Collections.unmodifiableCollection(otherTherapy);
    return this;
  }

  public MedicinalProductIndicationBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public MedicinalProductIndication build() {
    return new MedicinalProductIndication(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(meta),
        (Option) OptionConverters.toScala(text),
        subject.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(language),
        (Option) OptionConverters.toScala(duration),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        (LitSeq) population.stream().collect(new LitSeqJCollector<>()),
        comorbidity.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(implicitRules),
        (Option) OptionConverters.toScala(diseaseStatus),
        (Option) OptionConverters.toScala(intendedEffect),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        undesirableEffect.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(diseaseSymptomProcedure),
        otherTherapy.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
