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

public interface Coverage_CostToBeneficiaryBuilder {
  public Coverage.CostToBeneficiary build();

  public static Impl init(@NonNull ChoiceMoneyOrQuantity value) {
    return new Impl(value);
  }

  public static Impl builder(@NonNull ChoiceMoneyOrQuantity value) {
    return new Impl(value);
  }

  public static ChoiceMoneyOrQuantity value(Money m) {
    return new ChoiceMoneyOrQuantity(m);
  }

  public static ChoiceMoneyOrQuantity value(Quantity q) {
    return new ChoiceMoneyOrQuantity(q);
  }

  public class Impl implements Coverage_CostToBeneficiaryBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private ChoiceMoneyOrQuantity value;
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Coverage$CostToBeneficiary$Exception> exception = Collections.emptyList();

    /**
     * Required fields for {@link Coverage.CostToBeneficiary}
     *
     * @param value Field is a 'choice' field. Type should be one of Money, Quantity. To pass the
     *     value in, wrap with one of the Coverage_CostToBeneficiaryBuilder.value static methods
     */
    public Impl(@NonNull ChoiceMoneyOrQuantity value) {
      this.value = value;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Coverage_CostToBeneficiaryBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param _type - The type of coverage: social program, medical plan, accident coverage (workers
     *     compensation, auto), group health or payment by an individual or organization.
     */
    public Coverage_CostToBeneficiaryBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public Coverage_CostToBeneficiaryBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Coverage_CostToBeneficiaryBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Coverage_CostToBeneficiaryBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Coverage_CostToBeneficiaryBuilder.Impl withExtension(
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
    public Coverage_CostToBeneficiaryBuilder.Impl withModifierExtension(
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
    public Coverage_CostToBeneficiaryBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Coverage_CostToBeneficiaryBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param exception */
    public Coverage_CostToBeneficiaryBuilder.Impl withException(
        @NonNull Coverage$CostToBeneficiary$Exception... exception) {
      this.exception = Arrays.asList(exception);
      return this;
    }
    /** @param exception */
    public Coverage_CostToBeneficiaryBuilder.Impl withException(
        @NonNull Collection<Coverage$CostToBeneficiary$Exception> exception) {
      this.exception = Collections.unmodifiableCollection(exception);
      return this;
    }

    public Coverage_CostToBeneficiaryBuilder.Impl withException(
        @NonNull Coverage_CostToBeneficiary_ExceptionBuilder... exception) {
      this.exception = Arrays.stream(exception).map(e -> e.build()).collect(toList());
      return this;
    }

    public Coverage.CostToBeneficiary build() {
      return new Coverage.CostToBeneficiary(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          value,
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          exception.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
