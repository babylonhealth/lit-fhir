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

public class MedicinalProduct_SpecialDesignationBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CodeableConcept> _type = Optional.empty();
  private Optional<FHIRDateTime> date = Optional.empty();
  private Optional<CodeableConcept> status = Optional.empty();
  private Optional<CodeableConcept> species = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<CodeableConcept> intendedUse = Optional.empty();
  private Optional<Choice<$bslash$div<CodeableConcept, Reference>>> indication = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /** Required fields for {@link MedicinalProduct.SpecialDesignation} */
  public MedicinalProduct_SpecialDesignationBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public MedicinalProduct_SpecialDesignationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param _type - Regulatory type, e.g. Investigational or Authorized. */
  public MedicinalProduct_SpecialDesignationBuilder withType(@NonNull CodeableConcept _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /** @param date */
  public MedicinalProduct_SpecialDesignationBuilder withDate(@NonNull FHIRDateTime date) {
    this.date = Optional.of(date);
    return this;
  }
  /** @param status */
  public MedicinalProduct_SpecialDesignationBuilder withStatus(@NonNull CodeableConcept status) {
    this.status = Optional.of(status);
    return this;
  }
  /** @param species */
  public MedicinalProduct_SpecialDesignationBuilder withSpecies(@NonNull CodeableConcept species) {
    this.species = Optional.of(species);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public MedicinalProduct_SpecialDesignationBuilder withExtension(@NonNull Extension... extension) {
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
  public MedicinalProduct_SpecialDesignationBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param identifier - Business identifier for this product. Could be an MPID. */
  public MedicinalProduct_SpecialDesignationBuilder withIdentifier(
      @NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - Business identifier for this product. Could be an MPID. */
  public MedicinalProduct_SpecialDesignationBuilder withIdentifier(
      @NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param intendedUse */
  public MedicinalProduct_SpecialDesignationBuilder withIntendedUse(
      @NonNull CodeableConcept intendedUse) {
    this.intendedUse = Optional.of(intendedUse);
    return this;
  }
  /**
   * @param indication Field is a 'choice' field. Type should be one of CodeableConcept, Reference.
   */
  public <T> MedicinalProduct_SpecialDesignationBuilder withIndication(@NonNull T indication) {
    var guessedSuffix =
        autoSuffix(
            indication.getClass().getSimpleName(),
            MedicinalProduct.SpecialDesignation$.MODULE$.indication());
    return withIndication(guessedSuffix, indication);
  }

  /**
   * Alternative to the 'main' withIndication method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param indication - The value to be passed to the builder
   */
  public <T> MedicinalProduct_SpecialDesignationBuilder withIndication(
      String suffix, @NonNull T indication) {
    guard(
        indication.getClass().getSimpleName(),
        suffix,
        MedicinalProduct.SpecialDesignation$.MODULE$.indication());
    this.indication =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, indication, MedicinalProduct.SpecialDesignation$.MODULE$.indication()));
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
  public MedicinalProduct_SpecialDesignationBuilder withModifierExtension(
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
  public MedicinalProduct_SpecialDesignationBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public MedicinalProduct.SpecialDesignation build() {
    return new MedicinalProduct.SpecialDesignation(
        OptionConverters.toScala(id),
        OptionConverters.toScala(_type),
        OptionConverters.toScala(date),
        OptionConverters.toScala(status),
        OptionConverters.toScala(species),
        extension.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(intendedUse),
        OptionConverters.toScala(indication),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}