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

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface MedicinalProductContraindicationBuilder extends DomainResourceBuilder {
  public MedicinalProductContraindication build();

  public static Impl init() {
    return new Impl();
  }

  public class Impl implements MedicinalProductContraindicationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<Reference> subject = Collections.emptyList();
    private Optional<CodeableConcept> disease = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Choice> population = Collections.emptyList();
    private Collection<CodeableConcept> comorbidity = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> diseaseStatus = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Reference> therapeuticIndication = Collections.emptyList();
    private Collection<MedicinalProductContraindication.OtherTherapy> otherTherapy =
        Collections.emptyList();

    /** Required fields for {@link MedicinalProductContraindication} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicinalProductContraindicationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public MedicinalProductContraindicationBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public MedicinalProductContraindicationBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }
    /** @param subject - The medication for which this is an indication. */
    public MedicinalProductContraindicationBuilder.Impl withSubject(@NonNull Reference... subject) {
      this.subject = Arrays.asList(subject);
      return this;
    }
    /** @param subject - The medication for which this is an indication. */
    public MedicinalProductContraindicationBuilder.Impl withSubject(
        @NonNull Collection<Reference> subject) {
      this.subject = Collections.unmodifiableCollection(subject);
      return this;
    }
    /** @param disease - The disease, symptom or procedure for the contraindication. */
    public MedicinalProductContraindicationBuilder.Impl withDisease(
        @NonNull CodeableConcept disease) {
      this.disease = Optional.of(disease);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public MedicinalProductContraindicationBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MedicinalProductContraindicationBuilder.Impl withContained(
        @NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MedicinalProductContraindicationBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MedicinalProductContraindicationBuilder.Impl withExtension(
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
    public MedicinalProductContraindicationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /** @param population - The population group to which this applies. */
    public MedicinalProductContraindicationBuilder.Impl withPopulation(
        @NonNull Choice... population) {
      this.population = Arrays.asList(population);
      return this;
    }
    /** @param population - The population group to which this applies. */
    public MedicinalProductContraindicationBuilder.Impl withPopulation(
        @NonNull Collection<Choice> population) {
      this.population = Collections.unmodifiableCollection(population);
      return this;
    }
    /** @param comorbidity - A comorbidity (concurrent condition) or coinfection. */
    public MedicinalProductContraindicationBuilder.Impl withComorbidity(
        @NonNull CodeableConcept... comorbidity) {
      this.comorbidity = Arrays.asList(comorbidity);
      return this;
    }
    /** @param comorbidity - A comorbidity (concurrent condition) or coinfection. */
    public MedicinalProductContraindicationBuilder.Impl withComorbidity(
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
    public MedicinalProductContraindicationBuilder.Impl withImplicitRules(
        @NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param diseaseStatus - The status of the disease or symptom for the contraindication. */
    public MedicinalProductContraindicationBuilder.Impl withDiseaseStatus(
        @NonNull CodeableConcept diseaseStatus) {
      this.diseaseStatus = Optional.of(diseaseStatus);
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
    public MedicinalProductContraindicationBuilder.Impl withModifierExtension(
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
    public MedicinalProductContraindicationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /**
     * @param therapeuticIndication - Information about the use of the medicinal product in relation
     *     to other therapies as part of the indication.
     */
    public MedicinalProductContraindicationBuilder.Impl withTherapeuticIndication(
        @NonNull Reference... therapeuticIndication) {
      this.therapeuticIndication = Arrays.asList(therapeuticIndication);
      return this;
    }
    /**
     * @param therapeuticIndication - Information about the use of the medicinal product in relation
     *     to other therapies as part of the indication.
     */
    public MedicinalProductContraindicationBuilder.Impl withTherapeuticIndication(
        @NonNull Collection<Reference> therapeuticIndication) {
      this.therapeuticIndication = Collections.unmodifiableCollection(therapeuticIndication);
      return this;
    }
    /**
     * @param otherTherapy - Information about the use of the medicinal product in relation to other
     *     therapies described as part of the indication.
     */
    public MedicinalProductContraindicationBuilder.Impl withOtherTherapy(
        @NonNull MedicinalProductContraindication.OtherTherapy... otherTherapy) {
      this.otherTherapy = Arrays.asList(otherTherapy);
      return this;
    }
    /**
     * @param otherTherapy - Information about the use of the medicinal product in relation to other
     *     therapies described as part of the indication.
     */
    public MedicinalProductContraindicationBuilder.Impl withOtherTherapy(
        @NonNull Collection<MedicinalProductContraindication.OtherTherapy> otherTherapy) {
      this.otherTherapy = Collections.unmodifiableCollection(otherTherapy);
      return this;
    }

    public MedicinalProductContraindicationBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public MedicinalProductContraindication build() {
      return new MedicinalProductContraindication(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          subject.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(disease),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          (LitSeq) population.stream().collect(new LitSeqJCollector<>()),
          comorbidity.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(diseaseStatus),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          therapeuticIndication.stream().collect(new LitSeqJCollector<>()),
          otherTherapy.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
