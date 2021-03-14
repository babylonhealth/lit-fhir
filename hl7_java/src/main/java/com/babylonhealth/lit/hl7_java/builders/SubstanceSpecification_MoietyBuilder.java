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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class SubstanceSpecification_MoietyBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CodeableConcept> role = Optional.empty();
  private Optional<String> name = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Choice<$bslash$div<Quantity, String>>> amount = Optional.empty();
  private Optional<Identifier> identifier = Optional.empty();
  private Optional<CodeableConcept> stereochemistry = Optional.empty();
  private Optional<CodeableConcept> opticalActivity = Optional.empty();
  private Optional<String> molecularFormula = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /** Required fields for {@link SubstanceSpecification.Moiety} */
  public SubstanceSpecification_MoietyBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public SubstanceSpecification_MoietyBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param role */
  public SubstanceSpecification_MoietyBuilder withRole(@NonNull CodeableConcept role) {
    this.role = Optional.of(role);
    return this;
  }
  /** @param name - Names applicable to this substance. */
  public SubstanceSpecification_MoietyBuilder withName(@NonNull String name) {
    this.name = Optional.of(name);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public SubstanceSpecification_MoietyBuilder withExtension(@NonNull Extension... extension) {
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
  public SubstanceSpecification_MoietyBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param amount Field is a 'choice' field. Type should be one of Quantity, String. */
  public <T> SubstanceSpecification_MoietyBuilder withAmount(@NonNull T amount) {
    var guessedSuffix =
        autoSuffix(
            amount.getClass().getSimpleName(), SubstanceSpecification.Moiety$.MODULE$.amount());
    return withAmount(guessedSuffix, amount);
  }

  /**
   * Alternative to the 'main' withAmount method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param amount - The value to be passed to the builder
   */
  public <T> SubstanceSpecification_MoietyBuilder withAmount(String suffix, @NonNull T amount) {
    guard(
        amount.getClass().getSimpleName(), suffix, SubstanceSpecification.Moiety$.MODULE$.amount());
    this.amount =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, amount, SubstanceSpecification.Moiety$.MODULE$.amount()));
    return this;
  }
  /** @param identifier - Identifier by which this substance is known. */
  public SubstanceSpecification_MoietyBuilder withIdentifier(@NonNull Identifier identifier) {
    this.identifier = Optional.of(identifier);
    return this;
  }
  /** @param stereochemistry */
  public SubstanceSpecification_MoietyBuilder withStereochemistry(
      @NonNull CodeableConcept stereochemistry) {
    this.stereochemistry = Optional.of(stereochemistry);
    return this;
  }
  /** @param opticalActivity */
  public SubstanceSpecification_MoietyBuilder withOpticalActivity(
      @NonNull CodeableConcept opticalActivity) {
    this.opticalActivity = Optional.of(opticalActivity);
    return this;
  }
  /** @param molecularFormula */
  public SubstanceSpecification_MoietyBuilder withMolecularFormula(
      @NonNull String molecularFormula) {
    this.molecularFormula = Optional.of(molecularFormula);
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
  public SubstanceSpecification_MoietyBuilder withModifierExtension(
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
  public SubstanceSpecification_MoietyBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public SubstanceSpecification.Moiety build() {
    return new SubstanceSpecification.Moiety(
        OptionConverters.toScala(id),
        OptionConverters.toScala(role),
        OptionConverters.toScala(name),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(amount),
        OptionConverters.toScala(identifier),
        OptionConverters.toScala(stereochemistry),
        OptionConverters.toScala(opticalActivity),
        OptionConverters.toScala(molecularFormula),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
