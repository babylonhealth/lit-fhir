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

public class SubstanceSpecificationBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<CodeableConcept> _type = Optional.empty();
  private Optional<CodeableConcept> status = Optional.empty();
  private Optional<CodeableConcept> domain = Optional.empty();
  private Collection<Reference> source = Collections.emptyList();
  private Optional<String> comment = Optional.empty();
  private Optional<Reference> polymer = Optional.empty();
  private Optional<Reference> protein = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Identifier> identifier = Optional.empty();
  private Optional<String> description = Optional.empty();
  private Optional<Reference> nucleicAcid = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<Reference> sourceMaterial = Optional.empty();
  private Collection<SubstanceSpecification$Structure$Isotope$MolecularWeight> molecularWeight =
      Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Reference> referenceInformation = Optional.empty();
  private Collection<SubstanceSpecification.Code> code = Collections.emptyList();
  private Collection<SubstanceSpecification.Moiety> moiety = Collections.emptyList();
  private Collection<SubstanceSpecification.Property> property = Collections.emptyList();
  private Collection<SubstanceSpecification.Name> name = Collections.emptyList();
  private Collection<SubstanceSpecification.Relationship> relationship = Collections.emptyList();
  private Optional<SubstanceSpecification.Structure> structure = Optional.empty();

  /** Required fields for {@link SubstanceSpecification} */
  public SubstanceSpecificationBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public SubstanceSpecificationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public SubstanceSpecificationBuilder withMeta(@NonNull Meta meta) {
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
  public SubstanceSpecificationBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param _type - High level categorization, e.g. polymer or nucleic acid. */
  public SubstanceSpecificationBuilder withType(@NonNull CodeableConcept _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /** @param status - Status of substance within the catalogue e.g. approved. */
  public SubstanceSpecificationBuilder withStatus(@NonNull CodeableConcept status) {
    this.status = Optional.of(status);
    return this;
  }
  /** @param domain - If the substance applies to only human or veterinary use. */
  public SubstanceSpecificationBuilder withDomain(@NonNull CodeableConcept domain) {
    this.domain = Optional.of(domain);
    return this;
  }
  /** @param source - Supporting literature. */
  public SubstanceSpecificationBuilder withSource(@NonNull Reference... source) {
    this.source = Arrays.asList(source);
    return this;
  }
  /** @param source - Supporting literature. */
  public SubstanceSpecificationBuilder withSource(@NonNull Collection<Reference> source) {
    this.source = Collections.unmodifiableCollection(source);
    return this;
  }
  /** @param comment - Textual comment about this record of a substance. */
  public SubstanceSpecificationBuilder withComment(@NonNull String comment) {
    this.comment = Optional.of(comment);
    return this;
  }
  /** @param polymer - Data items specific to polymers. */
  public SubstanceSpecificationBuilder withPolymer(@NonNull Reference polymer) {
    this.polymer = Optional.of(polymer);
    return this;
  }
  /** @param protein - Data items specific to proteins. */
  public SubstanceSpecificationBuilder withProtein(@NonNull Reference protein) {
    this.protein = Optional.of(protein);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public SubstanceSpecificationBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public SubstanceSpecificationBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public SubstanceSpecificationBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public SubstanceSpecificationBuilder withExtension(@NonNull Extension... extension) {
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
  public SubstanceSpecificationBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param identifier - Identifier by which this substance is known. */
  public SubstanceSpecificationBuilder withIdentifier(@NonNull Identifier identifier) {
    this.identifier = Optional.of(identifier);
    return this;
  }
  /** @param description - Textual description of the substance. */
  public SubstanceSpecificationBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /** @param nucleicAcid - Data items specific to nucleic acids. */
  public SubstanceSpecificationBuilder withNucleicAcid(@NonNull Reference nucleicAcid) {
    this.nucleicAcid = Optional.of(nucleicAcid);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public SubstanceSpecificationBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /** @param sourceMaterial - Material or taxonomic/anatomical source for the substance. */
  public SubstanceSpecificationBuilder withSourceMaterial(@NonNull Reference sourceMaterial) {
    this.sourceMaterial = Optional.of(sourceMaterial);
    return this;
  }
  /**
   * @param molecularWeight - The molecular weight or weight range (for proteins, polymers or
   *     nucleic acids).
   */
  public SubstanceSpecificationBuilder withMolecularWeight(
      @NonNull SubstanceSpecification$Structure$Isotope$MolecularWeight... molecularWeight) {
    this.molecularWeight = Arrays.asList(molecularWeight);
    return this;
  }
  /**
   * @param molecularWeight - The molecular weight or weight range (for proteins, polymers or
   *     nucleic acids).
   */
  public SubstanceSpecificationBuilder withMolecularWeight(
      @NonNull
          Collection<SubstanceSpecification$Structure$Isotope$MolecularWeight> molecularWeight) {
    this.molecularWeight = Collections.unmodifiableCollection(molecularWeight);
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
  public SubstanceSpecificationBuilder withModifierExtension(
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
  public SubstanceSpecificationBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param referenceInformation - General information detailing this substance. */
  public SubstanceSpecificationBuilder withReferenceInformation(
      @NonNull Reference referenceInformation) {
    this.referenceInformation = Optional.of(referenceInformation);
    return this;
  }
  /** @param code - Codes associated with the substance. */
  public SubstanceSpecificationBuilder withCode(@NonNull SubstanceSpecification.Code... code) {
    this.code = Arrays.asList(code);
    return this;
  }
  /** @param code - Codes associated with the substance. */
  public SubstanceSpecificationBuilder withCode(
      @NonNull Collection<SubstanceSpecification.Code> code) {
    this.code = Collections.unmodifiableCollection(code);
    return this;
  }
  /** @param moiety - Moiety, for structural modifications. */
  public SubstanceSpecificationBuilder withMoiety(
      @NonNull SubstanceSpecification.Moiety... moiety) {
    this.moiety = Arrays.asList(moiety);
    return this;
  }
  /** @param moiety - Moiety, for structural modifications. */
  public SubstanceSpecificationBuilder withMoiety(
      @NonNull Collection<SubstanceSpecification.Moiety> moiety) {
    this.moiety = Collections.unmodifiableCollection(moiety);
    return this;
  }
  /**
   * @param property - General specifications for this substance, including how it is related to
   *     other substances.
   */
  public SubstanceSpecificationBuilder withProperty(
      @NonNull SubstanceSpecification.Property... property) {
    this.property = Arrays.asList(property);
    return this;
  }
  /**
   * @param property - General specifications for this substance, including how it is related to
   *     other substances.
   */
  public SubstanceSpecificationBuilder withProperty(
      @NonNull Collection<SubstanceSpecification.Property> property) {
    this.property = Collections.unmodifiableCollection(property);
    return this;
  }
  /** @param name - Names applicable to this substance. */
  public SubstanceSpecificationBuilder withName(@NonNull SubstanceSpecification.Name... name) {
    this.name = Arrays.asList(name);
    return this;
  }
  /** @param name - Names applicable to this substance. */
  public SubstanceSpecificationBuilder withName(
      @NonNull Collection<SubstanceSpecification.Name> name) {
    this.name = Collections.unmodifiableCollection(name);
    return this;
  }
  /**
   * @param relationship - A link between this substance and another, with details of the
   *     relationship.
   */
  public SubstanceSpecificationBuilder withRelationship(
      @NonNull SubstanceSpecification.Relationship... relationship) {
    this.relationship = Arrays.asList(relationship);
    return this;
  }
  /**
   * @param relationship - A link between this substance and another, with details of the
   *     relationship.
   */
  public SubstanceSpecificationBuilder withRelationship(
      @NonNull Collection<SubstanceSpecification.Relationship> relationship) {
    this.relationship = Collections.unmodifiableCollection(relationship);
    return this;
  }
  /** @param structure - Structural information. */
  public SubstanceSpecificationBuilder withStructure(
      @NonNull SubstanceSpecification.Structure structure) {
    this.structure = Optional.of(structure);
    return this;
  }

  public SubstanceSpecificationBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public SubstanceSpecification build() {
    return new SubstanceSpecification(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        OptionConverters.toScala(_type),
        OptionConverters.toScala(status),
        OptionConverters.toScala(domain),
        source.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(comment),
        OptionConverters.toScala(polymer),
        OptionConverters.toScala(protein),
        OptionConverters.toScala(language),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(identifier),
        OptionConverters.toScala(description),
        OptionConverters.toScala(nucleicAcid),
        OptionConverters.toScala(implicitRules),
        OptionConverters.toScala(sourceMaterial),
        molecularWeight.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(referenceInformation),
        code.stream().collect(new LitSeqJCollector<>()),
        moiety.stream().collect(new LitSeqJCollector<>()),
        property.stream().collect(new LitSeqJCollector<>()),
        name.stream().collect(new LitSeqJCollector<>()),
        relationship.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(structure),
        LitUtils.emptyMetaElMap());
  }
}
