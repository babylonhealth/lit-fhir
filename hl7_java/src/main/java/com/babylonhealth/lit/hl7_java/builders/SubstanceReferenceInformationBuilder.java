package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
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

public interface SubstanceReferenceInformationBuilder extends DomainResourceBuilder {
  public SubstanceReferenceInformation build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstanceReferenceInformationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> comment = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<SubstanceReferenceInformation.Gene> gene = Collections.emptyList();
    private Collection<SubstanceReferenceInformation.Target> target = Collections.emptyList();
    private Collection<SubstanceReferenceInformation.GeneElement> geneElement =
        Collections.emptyList();
    private Collection<SubstanceReferenceInformation.Classification> classification =
        Collections.emptyList();

    /** Required fields for {@link SubstanceReferenceInformation} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceReferenceInformationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public SubstanceReferenceInformationBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public SubstanceReferenceInformationBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public SubstanceReferenceInformationBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public SubstanceReferenceInformationBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param comment - Todo. */
    public SubstanceReferenceInformationBuilder.Impl withComment(@NonNull String comment) {
      this.comment = Optional.of(comment);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public SubstanceReferenceInformationBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SubstanceReferenceInformationBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SubstanceReferenceInformationBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public SubstanceReferenceInformationBuilder.Impl withContained(
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
    public SubstanceReferenceInformationBuilder.Impl withExtension(
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
    public SubstanceReferenceInformationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceReferenceInformationBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public SubstanceReferenceInformationBuilder.Impl withImplicitRules(
        @NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
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
    public SubstanceReferenceInformationBuilder.Impl withModifierExtension(
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
    public SubstanceReferenceInformationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceReferenceInformationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param gene - Todo. */
    public SubstanceReferenceInformationBuilder.Impl withGene(
        @NonNull SubstanceReferenceInformation.Gene... gene) {
      this.gene = Arrays.asList(gene);
      return this;
    }
    /** @param gene - Todo. */
    public SubstanceReferenceInformationBuilder.Impl withGene(
        @NonNull Collection<SubstanceReferenceInformation.Gene> gene) {
      this.gene = Collections.unmodifiableCollection(gene);
      return this;
    }

    public SubstanceReferenceInformationBuilder.Impl withGene(
        @NonNull SubstanceReferenceInformation_GeneBuilder... gene) {
      this.gene = Arrays.stream(gene).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param target - Todo. */
    public SubstanceReferenceInformationBuilder.Impl withTarget(
        @NonNull SubstanceReferenceInformation.Target... target) {
      this.target = Arrays.asList(target);
      return this;
    }
    /** @param target - Todo. */
    public SubstanceReferenceInformationBuilder.Impl withTarget(
        @NonNull Collection<SubstanceReferenceInformation.Target> target) {
      this.target = Collections.unmodifiableCollection(target);
      return this;
    }

    public SubstanceReferenceInformationBuilder.Impl withTarget(
        @NonNull SubstanceReferenceInformation_TargetBuilder... target) {
      this.target = Arrays.stream(target).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param geneElement - Todo. */
    public SubstanceReferenceInformationBuilder.Impl withGeneElement(
        @NonNull SubstanceReferenceInformation.GeneElement... geneElement) {
      this.geneElement = Arrays.asList(geneElement);
      return this;
    }
    /** @param geneElement - Todo. */
    public SubstanceReferenceInformationBuilder.Impl withGeneElement(
        @NonNull Collection<SubstanceReferenceInformation.GeneElement> geneElement) {
      this.geneElement = Collections.unmodifiableCollection(geneElement);
      return this;
    }

    public SubstanceReferenceInformationBuilder.Impl withGeneElement(
        @NonNull SubstanceReferenceInformation_GeneElementBuilder... geneElement) {
      this.geneElement = Arrays.stream(geneElement).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param classification - Todo. */
    public SubstanceReferenceInformationBuilder.Impl withClassification(
        @NonNull SubstanceReferenceInformation.Classification... classification) {
      this.classification = Arrays.asList(classification);
      return this;
    }
    /** @param classification - Todo. */
    public SubstanceReferenceInformationBuilder.Impl withClassification(
        @NonNull Collection<SubstanceReferenceInformation.Classification> classification) {
      this.classification = Collections.unmodifiableCollection(classification);
      return this;
    }

    public SubstanceReferenceInformationBuilder.Impl withClassification(
        @NonNull SubstanceReferenceInformation_ClassificationBuilder... classification) {
      this.classification = Arrays.stream(classification).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubstanceReferenceInformationBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public SubstanceReferenceInformation build() {
      return new SubstanceReferenceInformation(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(comment),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          gene.stream().collect(new LitSeqJCollector<>()),
          target.stream().collect(new LitSeqJCollector<>()),
          geneElement.stream().collect(new LitSeqJCollector<>()),
          classification.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
