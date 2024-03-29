package com.babylonhealth.lit.usbase_java.builders;

import static java.util.stream.Collectors.toList;

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
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface SubstanceAmountBuilder extends BackboneElementBuilder {
  public SubstanceAmount build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceQuantityOrRangeOrString amount(Quantity q) {
    return new ChoiceQuantityOrRangeOrString(q);
  }

  public static ChoiceQuantityOrRangeOrString amount(Range r) {
    return new ChoiceQuantityOrRangeOrString(r);
  }

  public static ChoiceQuantityOrRangeOrString amount(String s) {
    return new ChoiceQuantityOrRangeOrString(s);
  }

  public class Impl implements SubstanceAmountBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceQuantityOrRangeOrString> amount = Optional.empty();
    private Optional<CodeableConcept> amountType = Optional.empty();
    private Optional<String> amountText = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<SubstanceAmount.ReferenceRange> referenceRange = Optional.empty();

    /** Required fields for {@link SubstanceAmount} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public SubstanceAmountBuilder.Impl withId(@NonNull String id) {
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
    public SubstanceAmountBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SubstanceAmountBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceAmountBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param amount - Used to capture quantitative values for a variety of elements. If only limits
     *     are given, the arithmetic mean would be the average. If only a single definite value for
     *     a given element is given, it would be captured in this field. Field is a 'choice' field.
     *     Type should be one of Quantity, Range, String. To pass the value in, wrap with one of the
     *     SubstanceAmountBuilder.amount static methods
     */
    public SubstanceAmountBuilder.Impl withAmount(@NonNull ChoiceQuantityOrRangeOrString amount) {
      this.amount = Optional.of(amount);
      return this;
    }
    /**
     * @param amountType - Most elements that require a quantitative value will also have a field
     *     called amount type. Amount type should always be specified because the actual value of
     *     the amount is often dependent on it. EXAMPLE: In capturing the actual relative amounts of
     *     substances or molecular fragments it is essential to indicate whether the amount refers
     *     to a mole ratio or weight ratio. For any given element an effort should be made to use
     *     same the amount type for all related definitional elements.
     */
    public SubstanceAmountBuilder.Impl withAmountType(@NonNull CodeableConcept amountType) {
      this.amountType = Optional.of(amountType);
      return this;
    }

    public SubstanceAmountBuilder.Impl withAmountType(@NonNull CodeableConceptBuilder amountType) {
      this.amountType = Optional.of(amountType.build());
      return this;
    }
    /** @param amountText - A textual comment on a numeric value. */
    public SubstanceAmountBuilder.Impl withAmountText(@NonNull String amountText) {
      this.amountText = Optional.of(amountText);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the element and that modifies the understanding of the element
     *     in which it is contained and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer can define an extension, there
     *     is a set of requirements that SHALL be met as part of the definition of the extension.
     *     Applications processing a resource are required to check for modifier extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public SubstanceAmountBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the element and that modifies the understanding of the element
     *     in which it is contained and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer can define an extension, there
     *     is a set of requirements that SHALL be met as part of the definition of the extension.
     *     Applications processing a resource are required to check for modifier extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public SubstanceAmountBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceAmountBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param referenceRange - Reference range of possible or expected values. */
    public SubstanceAmountBuilder.Impl withReferenceRange(
        @NonNull SubstanceAmount.ReferenceRange referenceRange) {
      this.referenceRange = Optional.of(referenceRange);
      return this;
    }

    public SubstanceAmountBuilder.Impl withReferenceRange(
        @NonNull SubstanceAmount_ReferenceRangeBuilder referenceRange) {
      this.referenceRange = Optional.of(referenceRange.build());
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
}
