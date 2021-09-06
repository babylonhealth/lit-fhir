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
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface SubstanceSourceMaterialBuilder extends DomainResourceBuilder {
  public SubstanceSourceMaterial build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstanceSourceMaterialBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Identifier> organismId = Optional.empty();
    private Optional<String> organismName = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<CodeableConcept> countryOfOrigin = Collections.emptyList();
    private Optional<CodeableConcept> developmentStage = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Identifier> parentSubstanceId = Collections.emptyList();
    private Optional<CodeableConcept> sourceMaterialType = Optional.empty();
    private Optional<CodeableConcept> sourceMaterialClass = Optional.empty();
    private Optional<CodeableConcept> sourceMaterialState = Optional.empty();
    private Collection<String> parentSubstanceName = Collections.emptyList();
    private Collection<String> geographicalLocation = Collections.emptyList();
    private Collection<SubstanceSourceMaterial.PartDescription> partDescription =
        Collections.emptyList();
    private Collection<SubstanceSourceMaterial.FractionDescription> fractionDescription =
        Collections.emptyList();
    private Optional<SubstanceSourceMaterial.Organism> organism = Optional.empty();

    /** Required fields for {@link SubstanceSourceMaterial} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceSourceMaterialBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public SubstanceSourceMaterialBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public SubstanceSourceMaterialBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public SubstanceSourceMaterialBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SubstanceSourceMaterialBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SubstanceSourceMaterialBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withContained(
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
    public SubstanceSourceMaterialBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SubstanceSourceMaterialBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param organismId - The unique identifier associated with the source material parent organism
     *     shall be specified.
     */
    public SubstanceSourceMaterialBuilder.Impl withOrganismId(@NonNull Identifier organismId) {
      this.organismId = Optional.of(organismId);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withOrganismId(
        @NonNull IdentifierBuilder organismId) {
      this.organismId = Optional.of(organismId.build());
      return this;
    }
    /**
     * @param organismName - The organism accepted Scientific name shall be provided based on the
     *     organism taxonomy.
     */
    public SubstanceSourceMaterialBuilder.Impl withOrganismName(@NonNull String organismName) {
      this.organismName = Optional.of(organismName);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public SubstanceSourceMaterialBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param countryOfOrigin - The country where the plant material is harvested or the countries
     *     where the plasma is sourced from as laid down in accordance with the Plasma Master File.
     *     For “Plasma-derived substances” the attribute country of origin provides information
     *     about the countries used for the manufacturing of the Cryopoor plama or Crioprecipitate.
     */
    public SubstanceSourceMaterialBuilder.Impl withCountryOfOrigin(
        @NonNull CodeableConcept... countryOfOrigin) {
      this.countryOfOrigin = Arrays.asList(countryOfOrigin);
      return this;
    }
    /**
     * @param countryOfOrigin - The country where the plant material is harvested or the countries
     *     where the plasma is sourced from as laid down in accordance with the Plasma Master File.
     *     For “Plasma-derived substances” the attribute country of origin provides information
     *     about the countries used for the manufacturing of the Cryopoor plama or Crioprecipitate.
     */
    public SubstanceSourceMaterialBuilder.Impl withCountryOfOrigin(
        @NonNull Collection<CodeableConcept> countryOfOrigin) {
      this.countryOfOrigin = Collections.unmodifiableCollection(countryOfOrigin);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withCountryOfOrigin(
        @NonNull CodeableConceptBuilder... countryOfOrigin) {
      this.countryOfOrigin = Arrays.stream(countryOfOrigin).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param developmentStage - Stage of life for animals, plants, insects and microorganisms. This
     *     information shall be provided only when the substance is significantly different in these
     *     stages (e.g. foetal bovine serum).
     */
    public SubstanceSourceMaterialBuilder.Impl withDevelopmentStage(
        @NonNull CodeableConcept developmentStage) {
      this.developmentStage = Optional.of(developmentStage);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withDevelopmentStage(
        @NonNull CodeableConceptBuilder developmentStage) {
      this.developmentStage = Optional.of(developmentStage.build());
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
    public SubstanceSourceMaterialBuilder.Impl withModifierExtension(
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
    public SubstanceSourceMaterialBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param parentSubstanceId - The parent of the herbal drug Ginkgo biloba, Leaf is the substance
     *     ID of the substance (fresh) of Ginkgo biloba L. or Ginkgo biloba L. (Whole plant).
     */
    public SubstanceSourceMaterialBuilder.Impl withParentSubstanceId(
        @NonNull Identifier... parentSubstanceId) {
      this.parentSubstanceId = Arrays.asList(parentSubstanceId);
      return this;
    }
    /**
     * @param parentSubstanceId - The parent of the herbal drug Ginkgo biloba, Leaf is the substance
     *     ID of the substance (fresh) of Ginkgo biloba L. or Ginkgo biloba L. (Whole plant).
     */
    public SubstanceSourceMaterialBuilder.Impl withParentSubstanceId(
        @NonNull Collection<Identifier> parentSubstanceId) {
      this.parentSubstanceId = Collections.unmodifiableCollection(parentSubstanceId);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withParentSubstanceId(
        @NonNull IdentifierBuilder... parentSubstanceId) {
      this.parentSubstanceId =
          Arrays.stream(parentSubstanceId).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param sourceMaterialType - The type of the source material shall be specified based on a
     *     controlled vocabulary. For vaccines, this subclause refers to the class of infectious
     *     agent.
     */
    public SubstanceSourceMaterialBuilder.Impl withSourceMaterialType(
        @NonNull CodeableConcept sourceMaterialType) {
      this.sourceMaterialType = Optional.of(sourceMaterialType);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withSourceMaterialType(
        @NonNull CodeableConceptBuilder sourceMaterialType) {
      this.sourceMaterialType = Optional.of(sourceMaterialType.build());
      return this;
    }
    /**
     * @param sourceMaterialClass - General high level classification of the source material
     *     specific to the origin of the material.
     */
    public SubstanceSourceMaterialBuilder.Impl withSourceMaterialClass(
        @NonNull CodeableConcept sourceMaterialClass) {
      this.sourceMaterialClass = Optional.of(sourceMaterialClass);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withSourceMaterialClass(
        @NonNull CodeableConceptBuilder sourceMaterialClass) {
      this.sourceMaterialClass = Optional.of(sourceMaterialClass.build());
      return this;
    }
    /** @param sourceMaterialState - The state of the source material when extracted. */
    public SubstanceSourceMaterialBuilder.Impl withSourceMaterialState(
        @NonNull CodeableConcept sourceMaterialState) {
      this.sourceMaterialState = Optional.of(sourceMaterialState);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withSourceMaterialState(
        @NonNull CodeableConceptBuilder sourceMaterialState) {
      this.sourceMaterialState = Optional.of(sourceMaterialState.build());
      return this;
    }
    /**
     * @param parentSubstanceName - The parent substance of the Herbal Drug, or Herbal preparation.
     */
    public SubstanceSourceMaterialBuilder.Impl withParentSubstanceName(
        @NonNull String... parentSubstanceName) {
      this.parentSubstanceName = Arrays.asList(parentSubstanceName);
      return this;
    }
    /**
     * @param parentSubstanceName - The parent substance of the Herbal Drug, or Herbal preparation.
     */
    public SubstanceSourceMaterialBuilder.Impl withParentSubstanceName(
        @NonNull Collection<String> parentSubstanceName) {
      this.parentSubstanceName = Collections.unmodifiableCollection(parentSubstanceName);
      return this;
    }
    /**
     * @param geographicalLocation - The place/region where the plant is harvested or the
     *     places/regions where the animal source material has its habitat.
     */
    public SubstanceSourceMaterialBuilder.Impl withGeographicalLocation(
        @NonNull String... geographicalLocation) {
      this.geographicalLocation = Arrays.asList(geographicalLocation);
      return this;
    }
    /**
     * @param geographicalLocation - The place/region where the plant is harvested or the
     *     places/regions where the animal source material has its habitat.
     */
    public SubstanceSourceMaterialBuilder.Impl withGeographicalLocation(
        @NonNull Collection<String> geographicalLocation) {
      this.geographicalLocation = Collections.unmodifiableCollection(geographicalLocation);
      return this;
    }
    /** @param partDescription - To do. */
    public SubstanceSourceMaterialBuilder.Impl withPartDescription(
        @NonNull SubstanceSourceMaterial.PartDescription... partDescription) {
      this.partDescription = Arrays.asList(partDescription);
      return this;
    }
    /** @param partDescription - To do. */
    public SubstanceSourceMaterialBuilder.Impl withPartDescription(
        @NonNull Collection<SubstanceSourceMaterial.PartDescription> partDescription) {
      this.partDescription = Collections.unmodifiableCollection(partDescription);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withPartDescription(
        @NonNull SubstanceSourceMaterial_PartDescriptionBuilder... partDescription) {
      this.partDescription = Arrays.stream(partDescription).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param fractionDescription - Many complex materials are fractions of parts of plants,
     *     animals, or minerals. Fraction elements are often necessary to define both Substances and
     *     Specified Group 1 Substances. For substances derived from Plants, fraction information
     *     will be captured at the Substance information level ( . Oils, Juices and Exudates).
     *     Additional information for Extracts, such as extraction solvent composition, will be
     *     captured at the Specified Substance Group 1 information level. For plasma-derived
     *     products fraction information will be captured at the Substance and the Specified
     *     Substance Group 1 levels.
     */
    public SubstanceSourceMaterialBuilder.Impl withFractionDescription(
        @NonNull SubstanceSourceMaterial.FractionDescription... fractionDescription) {
      this.fractionDescription = Arrays.asList(fractionDescription);
      return this;
    }
    /**
     * @param fractionDescription - Many complex materials are fractions of parts of plants,
     *     animals, or minerals. Fraction elements are often necessary to define both Substances and
     *     Specified Group 1 Substances. For substances derived from Plants, fraction information
     *     will be captured at the Substance information level ( . Oils, Juices and Exudates).
     *     Additional information for Extracts, such as extraction solvent composition, will be
     *     captured at the Specified Substance Group 1 information level. For plasma-derived
     *     products fraction information will be captured at the Substance and the Specified
     *     Substance Group 1 levels.
     */
    public SubstanceSourceMaterialBuilder.Impl withFractionDescription(
        @NonNull Collection<SubstanceSourceMaterial.FractionDescription> fractionDescription) {
      this.fractionDescription = Collections.unmodifiableCollection(fractionDescription);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withFractionDescription(
        @NonNull SubstanceSourceMaterial_FractionDescriptionBuilder... fractionDescription) {
      this.fractionDescription =
          Arrays.stream(fractionDescription).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param organism - This subclause describes the organism which the substance is derived from.
     *     For vaccines, the parent organism shall be specified based on these subclause elements.
     *     As an example, full taxonomy will be described for the Substance Name: ., Leaf.
     */
    public SubstanceSourceMaterialBuilder.Impl withOrganism(
        @NonNull SubstanceSourceMaterial.Organism organism) {
      this.organism = Optional.of(organism);
      return this;
    }

    public SubstanceSourceMaterialBuilder.Impl withOrganism(
        @NonNull SubstanceSourceMaterial_OrganismBuilder organism) {
      this.organism = Optional.of(organism.build());
      return this;
    }

    public SubstanceSourceMaterialBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public SubstanceSourceMaterial build() {
      return new SubstanceSourceMaterial(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(organismId),
          OptionConverters.toScala(organismName),
          OptionConverters.toScala(implicitRules),
          countryOfOrigin.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(developmentStage),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          parentSubstanceId.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(sourceMaterialType),
          OptionConverters.toScala(sourceMaterialClass),
          OptionConverters.toScala(sourceMaterialState),
          parentSubstanceName.stream().collect(new LitSeqJCollector<>()),
          geographicalLocation.stream().collect(new LitSeqJCollector<>()),
          partDescription.stream().collect(new LitSeqJCollector<>()),
          fractionDescription.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(organism),
          LitUtils.emptyMetaElMap());
    }
  }
}
