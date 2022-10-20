package com.babylonhealth.lit.usbase_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface SubstanceNucleicAcidBuilder extends DomainResourceBuilder {
  public SubstanceNucleicAcid build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstanceNucleicAcidBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<CodeableConcept> sequenceType = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<Integer> numberOfSubunits = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<String> areaOfHybridisation = Optional.empty();
    private Optional<CodeableConcept> oligoNucleotideType = Optional.empty();
    private Collection<SubstanceNucleicAcid.Subunit> subunit = Collections.emptyList();

    /** Required fields for {@link SubstanceNucleicAcid} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceNucleicAcidBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public SubstanceNucleicAcidBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public SubstanceNucleicAcidBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public SubstanceNucleicAcidBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public SubstanceNucleicAcidBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public SubstanceNucleicAcidBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SubstanceNucleicAcidBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SubstanceNucleicAcidBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public SubstanceNucleicAcidBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public SubstanceNucleicAcidBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SubstanceNucleicAcidBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceNucleicAcidBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param sequenceType - The type of the sequence shall be specified based on a controlled
     *     vocabulary.
     */
    public SubstanceNucleicAcidBuilder.Impl withSequenceType(
        @NonNull CodeableConcept sequenceType) {
      this.sequenceType = Optional.of(sequenceType);
      return this;
    }

    public SubstanceNucleicAcidBuilder.Impl withSequenceType(
        @NonNull CodeableConceptBuilder sequenceType) {
      this.sequenceType = Optional.of(sequenceType.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public SubstanceNucleicAcidBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param numberOfSubunits - The number of linear sequences of nucleotides linked through
     *     phosphodiester bonds shall be described. Subunits would be strands of nucleic acids that
     *     are tightly associated typically through Watson-Crick base pairing. NOTE: If not
     *     specified in the reference source, the assumption is that there is 1 subunit.
     */
    public SubstanceNucleicAcidBuilder.Impl withNumberOfSubunits(
        @NonNull Integer numberOfSubunits) {
      this.numberOfSubunits = Optional.of(numberOfSubunits);
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
    public SubstanceNucleicAcidBuilder.Impl withModifierExtension(
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
    public SubstanceNucleicAcidBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceNucleicAcidBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param areaOfHybridisation - The area of hybridisation shall be described if applicable for
     *     double stranded RNA or DNA. The number associated with the subunit followed by the number
     *     associated to the residue shall be specified in increasing order. The underscore “” shall
     *     be used as separator as follows: “Subunitnumber Residue”.
     */
    public SubstanceNucleicAcidBuilder.Impl withAreaOfHybridisation(
        @NonNull String areaOfHybridisation) {
      this.areaOfHybridisation = Optional.of(areaOfHybridisation);
      return this;
    }
    /** @param oligoNucleotideType - (TBC). */
    public SubstanceNucleicAcidBuilder.Impl withOligoNucleotideType(
        @NonNull CodeableConcept oligoNucleotideType) {
      this.oligoNucleotideType = Optional.of(oligoNucleotideType);
      return this;
    }

    public SubstanceNucleicAcidBuilder.Impl withOligoNucleotideType(
        @NonNull CodeableConceptBuilder oligoNucleotideType) {
      this.oligoNucleotideType = Optional.of(oligoNucleotideType.build());
      return this;
    }
    /**
     * @param subunit - Subunits are listed in order of decreasing length; sequences of the same
     *     length will be ordered by molecular weight; subunits that have identical sequences will
     *     be repeated multiple times.
     */
    public SubstanceNucleicAcidBuilder.Impl withSubunit(
        @NonNull SubstanceNucleicAcid.Subunit... subunit) {
      this.subunit = Arrays.asList(subunit);
      return this;
    }
    /**
     * @param subunit - Subunits are listed in order of decreasing length; sequences of the same
     *     length will be ordered by molecular weight; subunits that have identical sequences will
     *     be repeated multiple times.
     */
    public SubstanceNucleicAcidBuilder.Impl withSubunit(
        @NonNull Collection<SubstanceNucleicAcid.Subunit> subunit) {
      this.subunit = Collections.unmodifiableCollection(subunit);
      return this;
    }

    public SubstanceNucleicAcidBuilder.Impl withSubunit(
        @NonNull SubstanceNucleicAcid_SubunitBuilder... subunit) {
      this.subunit = Arrays.stream(subunit).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubstanceNucleicAcidBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public SubstanceNucleicAcid build() {
      return new SubstanceNucleicAcid(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(sequenceType),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(numberOfSubunits.map(x -> (Object) x)),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(areaOfHybridisation),
          OptionConverters.toScala(oligoNucleotideType),
          subunit.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
