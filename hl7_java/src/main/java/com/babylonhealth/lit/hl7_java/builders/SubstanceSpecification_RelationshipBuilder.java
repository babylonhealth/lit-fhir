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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class SubstanceSpecification_RelationshipBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<Reference> source = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Choice00910671146> amount = Optional.empty();
  private Optional<Boolean> isDefining = Optional.empty();
  private Optional<CodeableConcept> amountType = Optional.empty();
  private Optional<Choice01025009075> substance = Optional.empty();
  private Optional<CodeableConcept> relationship = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Ratio> amountRatioLowLimit = Optional.empty();

  /** Required fields for {@link SubstanceSpecification.Relationship} */
  public SubstanceSpecification_RelationshipBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public SubstanceSpecification_RelationshipBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param source - Supporting literature. */
  public SubstanceSpecification_RelationshipBuilder withSource(@NonNull Reference... source) {
    this.source = Arrays.asList(source);
    return this;
  }
  /** @param source - Supporting literature. */
  public SubstanceSpecification_RelationshipBuilder withSource(
      @NonNull Collection<Reference> source) {
    this.source = Collections.unmodifiableCollection(source);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public SubstanceSpecification_RelationshipBuilder withExtension(@NonNull Extension... extension) {
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
  public SubstanceSpecification_RelationshipBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param amount Field is a 'choice' field. Type should be one of Quantity, Range, Ratio, String.
   */
  public SubstanceSpecification_RelationshipBuilder withAmount(@NonNull Choice00910671146 amount) {
    this.amount = Optional.of(amount);
    return this;
  }
  /** @param isDefining */
  public SubstanceSpecification_RelationshipBuilder withIsDefining(@NonNull Boolean isDefining) {
    this.isDefining = Optional.of(isDefining);
    return this;
  }
  /** @param amountType */
  public SubstanceSpecification_RelationshipBuilder withAmountType(
      @NonNull CodeableConcept amountType) {
    this.amountType = Optional.of(amountType);
    return this;
  }
  /**
   * @param substance Field is a 'choice' field. Type should be one of CodeableConcept, Reference.
   */
  public SubstanceSpecification_RelationshipBuilder withSubstance(
      @NonNull Choice01025009075 substance) {
    this.substance = Optional.of(substance);
    return this;
  }
  /**
   * @param relationship - A link between this substance and another, with details of the
   *     relationship.
   */
  public SubstanceSpecification_RelationshipBuilder withRelationship(
      @NonNull CodeableConcept relationship) {
    this.relationship = Optional.of(relationship);
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
  public SubstanceSpecification_RelationshipBuilder withModifierExtension(
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
  public SubstanceSpecification_RelationshipBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param amountRatioLowLimit */
  public SubstanceSpecification_RelationshipBuilder withAmountRatioLowLimit(
      @NonNull Ratio amountRatioLowLimit) {
    this.amountRatioLowLimit = Optional.of(amountRatioLowLimit);
    return this;
  }

  public SubstanceSpecification.Relationship build() {
    return new SubstanceSpecification.Relationship(
        OptionConverters.toScala(id),
        source.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(amount),
        OptionConverters.toScala(isDefining.map(x -> (Object) x)),
        OptionConverters.toScala(amountType),
        (Option) OptionConverters.toScala(substance),
        OptionConverters.toScala(relationship),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(amountRatioLowLimit),
        LitUtils.emptyMetaElMap());
  }
}
