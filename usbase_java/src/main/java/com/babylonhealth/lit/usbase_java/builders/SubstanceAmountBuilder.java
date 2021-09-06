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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class SubstanceAmountBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Choice_1527751898> amount = Optional.empty();
  private Optional<CodeableConcept> amountType = Optional.empty();
  private Optional<String> amountText = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<SubstanceAmount.ReferenceRange> referenceRange = Optional.empty();

  /** Required fields for {@link SubstanceAmount} */
  public SubstanceAmountBuilder() {}

  public static Choice_1527751898 amount(Quantity q) {
    return new Choice_1527751898(q);
  }

  public static Choice_1527751898 amount(Range r) {
    return new Choice_1527751898(r);
  }

  public static Choice_1527751898 amount(String s) {
    return new Choice_1527751898(s);
  }

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public SubstanceAmountBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public SubstanceAmountBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public SubstanceAmountBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param amount - Used to capture quantitative values for a variety of elements. If only limits
   *     are given, the arithmetic mean would be the average. If only a single definite value for a
   *     given element is given, it would be captured in this field. Field is a 'choice' field. Type
   *     should be one of Quantity, Range, String. To pass the value in, wrap with one of the
   *     SubstanceAmountBuilder.amount static methods
   */
  public SubstanceAmountBuilder withAmount(@NonNull Choice_1527751898 amount) {
    this.amount = Optional.of(amount);
    return this;
  }
  /**
   * @param amountType - Most elements that require a quantitative value will also have a field
   *     called amount type. Amount type should always be specified because the actual value of the
   *     amount is often dependent on it. EXAMPLE: In capturing the actual relative amounts of
   *     substances or molecular fragments it is essential to indicate whether the amount refers to
   *     a mole ratio or weight ratio. For any given element an effort should be made to use same
   *     the amount type for all related definitional elements.
   */
  public SubstanceAmountBuilder withAmountType(@NonNull CodeableConcept amountType) {
    this.amountType = Optional.of(amountType);
    return this;
  }
  /** @param amountText - A textual comment on a numeric value. */
  public SubstanceAmountBuilder withAmountText(@NonNull String amountText) {
    this.amountText = Optional.of(amountText);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the element and that modifies the understanding of the element in
   *     which it is contained and/or the understanding of the containing element's descendants.
   *     Usually modifier elements provide negation or qualification. To make the use of extensions
   *     safe and manageable, there is a strict set of governance applied to the definition and use
   *     of extensions. Though any implementer can define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public SubstanceAmountBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the element and that modifies the understanding of the element in
   *     which it is contained and/or the understanding of the containing element's descendants.
   *     Usually modifier elements provide negation or qualification. To make the use of extensions
   *     safe and manageable, there is a strict set of governance applied to the definition and use
   *     of extensions. Though any implementer can define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public SubstanceAmountBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param referenceRange - Reference range of possible or expected values. */
  public SubstanceAmountBuilder withReferenceRange(
      @NonNull SubstanceAmount.ReferenceRange referenceRange) {
    this.referenceRange = Optional.of(referenceRange);
    return this;
  }

  public SubstanceAmount build() {
    return new SubstanceAmount(
        OptionConverters.toScala(id),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(amount),
        OptionConverters.toScala(amountType),
        OptionConverters.toScala(amountText),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(referenceRange),
        LitUtils.emptyMetaElMap());
  }
}
