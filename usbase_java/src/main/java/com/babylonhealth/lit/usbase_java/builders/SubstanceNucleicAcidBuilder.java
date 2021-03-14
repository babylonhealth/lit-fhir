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
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class SubstanceNucleicAcidBuilder {
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
  public SubstanceNucleicAcidBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public SubstanceNucleicAcidBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public SubstanceNucleicAcidBuilder withMeta(@NonNull Meta meta) {
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
  public SubstanceNucleicAcidBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public SubstanceNucleicAcidBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public SubstanceNucleicAcidBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public SubstanceNucleicAcidBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public SubstanceNucleicAcidBuilder withExtension(@NonNull Extension... extension) {
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
  public SubstanceNucleicAcidBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param sequenceType - The type of the sequence shall be specified based on a controlled
   *     vocabulary.
   */
  public SubstanceNucleicAcidBuilder withSequenceType(@NonNull CodeableConcept sequenceType) {
    this.sequenceType = Optional.of(sequenceType);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public SubstanceNucleicAcidBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param numberOfSubunits - The number of linear sequences of nucleotides linked through
   *     phosphodiester bonds shall be described. Subunits would be strands of nucleic acids that
   *     are tightly associated typically through Watson-Crick base pairing. NOTE: If not specified
   *     in the reference source, the assumption is that there is 1 subunit.
   */
  public SubstanceNucleicAcidBuilder withNumberOfSubunits(@NonNull Integer numberOfSubunits) {
    this.numberOfSubunits = Optional.of(numberOfSubunits);
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
  public SubstanceNucleicAcidBuilder withModifierExtension(
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
  public SubstanceNucleicAcidBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param areaOfHybridisation - The area of hybridisation shall be described if applicable for
   *     double stranded RNA or DNA. The number associated with the subunit followed by the number
   *     associated to the residue shall be specified in increasing order. The underscore “” shall
   *     be used as separator as follows: “Subunitnumber Residue”.
   */
  public SubstanceNucleicAcidBuilder withAreaOfHybridisation(@NonNull String areaOfHybridisation) {
    this.areaOfHybridisation = Optional.of(areaOfHybridisation);
    return this;
  }
  /** @param oligoNucleotideType - (TBC). */
  public SubstanceNucleicAcidBuilder withOligoNucleotideType(
      @NonNull CodeableConcept oligoNucleotideType) {
    this.oligoNucleotideType = Optional.of(oligoNucleotideType);
    return this;
  }
  /**
   * @param subunit - Subunits are listed in order of decreasing length; sequences of the same
   *     length will be ordered by molecular weight; subunits that have identical sequences will be
   *     repeated multiple times.
   */
  public SubstanceNucleicAcidBuilder withSubunit(@NonNull SubstanceNucleicAcid.Subunit... subunit) {
    this.subunit = Arrays.asList(subunit);
    return this;
  }
  /**
   * @param subunit - Subunits are listed in order of decreasing length; sequences of the same
   *     length will be ordered by molecular weight; subunits that have identical sequences will be
   *     repeated multiple times.
   */
  public SubstanceNucleicAcidBuilder withSubunit(
      @NonNull Collection<SubstanceNucleicAcid.Subunit> subunit) {
    this.subunit = Collections.unmodifiableCollection(subunit);
    return this;
  }

  public SubstanceNucleicAcidBuilder withoutMeta() {
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
