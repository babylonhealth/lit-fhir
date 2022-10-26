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
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface ExplanationOfBenefit_BenefitBalance_FinancialBuilder {
  public ExplanationOfBenefit$BenefitBalance$Financial build();

  public static Impl init(CodeableConcept _type) {
    return new Impl(_type);
  }

  public static Impl builder(CodeableConceptBuilder _type) {
    return new Impl(_type.build());
  }

  public static ChoiceMoneyOrUnsignedInt used(Money m) {
    return new ChoiceMoneyOrUnsignedInt(m);
  }

  public static ChoiceMoneyOrUnsignedInt used(Integer i) {
    return new ChoiceMoneyOrUnsignedInt(i);
  }

  public static ChoiceMoneyOrStringOrUnsignedInt allowed(Money m) {
    return new ChoiceMoneyOrStringOrUnsignedInt(m);
  }

  public static ChoiceMoneyOrStringOrUnsignedInt allowed(String s) {
    return new ChoiceMoneyOrStringOrUnsignedInt(s);
  }

  public static ChoiceMoneyOrStringOrUnsignedInt allowed(Integer i) {
    return new ChoiceMoneyOrStringOrUnsignedInt(i);
  }

  public class Impl implements ExplanationOfBenefit_BenefitBalance_FinancialBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept _type;
    private Optional<ChoiceMoneyOrUnsignedInt> used = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceMoneyOrStringOrUnsignedInt> allowed = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link ExplanationOfBenefit$BenefitBalance$Financial}
     *
     * @param _type - The category of claim, e.g. oral, pharmacy, vision, institutional,
     *     professional.
     */
    public Impl(CodeableConcept _type) {
      this._type = _type;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ExplanationOfBenefit_BenefitBalance_FinancialBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param used Field is a 'choice' field. Type should be one of Money, Integer. To pass the
     *     value in, wrap with one of the ExplanationOfBenefit_BenefitBalance_FinancialBuilder.used
     *     static methods
     */
    public ExplanationOfBenefit_BenefitBalance_FinancialBuilder.Impl withUsed(
        @NonNull ChoiceMoneyOrUnsignedInt used) {
      this.used = Optional.of(used);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ExplanationOfBenefit_BenefitBalance_FinancialBuilder.Impl withExtension(
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
    public ExplanationOfBenefit_BenefitBalance_FinancialBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ExplanationOfBenefit_BenefitBalance_FinancialBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param allowed Field is a 'choice' field. Type should be one of Money, String, Integer. To
     *     pass the value in, wrap with one of the
     *     ExplanationOfBenefit_BenefitBalance_FinancialBuilder.allowed static methods
     */
    public ExplanationOfBenefit_BenefitBalance_FinancialBuilder.Impl withAllowed(
        @NonNull ChoiceMoneyOrStringOrUnsignedInt allowed) {
      this.allowed = Optional.of(allowed);
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
    public ExplanationOfBenefit_BenefitBalance_FinancialBuilder.Impl withModifierExtension(
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
    public ExplanationOfBenefit_BenefitBalance_FinancialBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ExplanationOfBenefit_BenefitBalance_FinancialBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public ExplanationOfBenefit$BenefitBalance$Financial build() {
      return new ExplanationOfBenefit$BenefitBalance$Financial(
          OptionConverters.toScala(id),
          _type,
          (Option) OptionConverters.toScala(used),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(allowed),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
