package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

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
import scala.math.BigDecimal;

public interface ExplanationOfBenefit_Item_AdjudicationBuilder {
  public ExplanationOfBenefit$Item$Adjudication build();

  public static Impl init(CodeableConcept category) {
    return new Impl(category);
  }

  public static Impl builder(CodeableConceptBuilder category) {
    return new Impl(category.build());
  }

  public class Impl implements ExplanationOfBenefit_Item_AdjudicationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<BigDecimal> value = Optional.empty();
    private Optional<CodeableConcept> reason = Optional.empty();
    private Optional<Money> amount = Optional.empty();
    private CodeableConcept category;
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link ExplanationOfBenefit$Item$Adjudication}
     *
     * @param category
     */
    public Impl(CodeableConcept category) {
      this.category = category;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ExplanationOfBenefit_Item_AdjudicationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param value */
    public ExplanationOfBenefit_Item_AdjudicationBuilder.Impl withValue(@NonNull BigDecimal value) {
      this.value = Optional.of(value);
      return this;
    }
    /** @param reason */
    public ExplanationOfBenefit_Item_AdjudicationBuilder.Impl withReason(
        @NonNull CodeableConcept reason) {
      this.reason = Optional.of(reason);
      return this;
    }

    public ExplanationOfBenefit_Item_AdjudicationBuilder.Impl withReason(
        @NonNull CodeableConceptBuilder reason) {
      this.reason = Optional.of(reason.build());
      return this;
    }
    /** @param amount */
    public ExplanationOfBenefit_Item_AdjudicationBuilder.Impl withAmount(@NonNull Money amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    public ExplanationOfBenefit_Item_AdjudicationBuilder.Impl withAmount(
        @NonNull MoneyBuilder amount) {
      this.amount = Optional.of(amount.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ExplanationOfBenefit_Item_AdjudicationBuilder.Impl withExtension(
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
    public ExplanationOfBenefit_Item_AdjudicationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ExplanationOfBenefit_Item_AdjudicationBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
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
    public ExplanationOfBenefit_Item_AdjudicationBuilder.Impl withModifierExtension(
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
    public ExplanationOfBenefit_Item_AdjudicationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ExplanationOfBenefit_Item_AdjudicationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public ExplanationOfBenefit$Item$Adjudication build() {
      return new ExplanationOfBenefit$Item$Adjudication(
          OptionConverters.toScala(id),
          OptionConverters.toScala(value),
          OptionConverters.toScala(reason),
          OptionConverters.toScala(amount),
          category,
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
