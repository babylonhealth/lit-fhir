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

public interface CoverageEligibilityResponse_Insurance_Item_BenefitBuilder {
  public CoverageEligibilityResponse$Insurance$Item$Benefit build();

  public static Impl init(CodeableConcept _type) {
    return new Impl(_type);
  }

  public static Impl builder(CodeableConceptBuilder _type) {
    return new Impl(_type.build());
  }

  public static ChoiceMoneyOrStringOrUnsignedInt used(Money m) {
    return new ChoiceMoneyOrStringOrUnsignedInt(m);
  }

  public static ChoiceMoneyOrStringOrUnsignedInt used(String s) {
    return new ChoiceMoneyOrStringOrUnsignedInt(s);
  }

  public static ChoiceMoneyOrStringOrUnsignedInt used(Integer i) {
    return new ChoiceMoneyOrStringOrUnsignedInt(i);
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

  public class Impl implements CoverageEligibilityResponse_Insurance_Item_BenefitBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept _type;
    private Optional<ChoiceMoneyOrStringOrUnsignedInt> used = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceMoneyOrStringOrUnsignedInt> allowed = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link CoverageEligibilityResponse$Insurance$Item$Benefit}
     *
     * @param _type
     */
    public Impl(CodeableConcept _type) {
      this._type = _type;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CoverageEligibilityResponse_Insurance_Item_BenefitBuilder.Impl withId(
        @NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param used Field is a 'choice' field. Type should be one of Money, String, Integer. To pass
     *     the value in, wrap with one of the
     *     CoverageEligibilityResponse_Insurance_Item_BenefitBuilder.used static methods
     */
    public CoverageEligibilityResponse_Insurance_Item_BenefitBuilder.Impl withUsed(
        @NonNull ChoiceMoneyOrStringOrUnsignedInt used) {
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
    public CoverageEligibilityResponse_Insurance_Item_BenefitBuilder.Impl withExtension(
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
    public CoverageEligibilityResponse_Insurance_Item_BenefitBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CoverageEligibilityResponse_Insurance_Item_BenefitBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param allowed Field is a 'choice' field. Type should be one of Money, String, Integer. To
     *     pass the value in, wrap with one of the
     *     CoverageEligibilityResponse_Insurance_Item_BenefitBuilder.allowed static methods
     */
    public CoverageEligibilityResponse_Insurance_Item_BenefitBuilder.Impl withAllowed(
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
    public CoverageEligibilityResponse_Insurance_Item_BenefitBuilder.Impl withModifierExtension(
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
    public CoverageEligibilityResponse_Insurance_Item_BenefitBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public CoverageEligibilityResponse_Insurance_Item_BenefitBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public CoverageEligibilityResponse$Insurance$Item$Benefit build() {
      return new CoverageEligibilityResponse$Insurance$Item$Benefit(
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
