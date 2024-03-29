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

public interface InsurancePlan_Plan_SpecificCostBuilder {
  public InsurancePlan$Plan$SpecificCost build();

  public static Impl init(CodeableConcept category) {
    return new Impl(category);
  }

  public static Impl builder(CodeableConceptBuilder category) {
    return new Impl(category.build());
  }

  public class Impl implements InsurancePlan_Plan_SpecificCostBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept category;
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<InsurancePlan$Plan$SpecificCost$Benefit> benefit = Collections.emptyList();

    /**
     * Required fields for {@link InsurancePlan$Plan$SpecificCost}
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
    public InsurancePlan_Plan_SpecificCostBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public InsurancePlan_Plan_SpecificCostBuilder.Impl withExtension(
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
    public InsurancePlan_Plan_SpecificCostBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public InsurancePlan_Plan_SpecificCostBuilder.Impl withExtension(
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
    public InsurancePlan_Plan_SpecificCostBuilder.Impl withModifierExtension(
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
    public InsurancePlan_Plan_SpecificCostBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public InsurancePlan_Plan_SpecificCostBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param benefit */
    public InsurancePlan_Plan_SpecificCostBuilder.Impl withBenefit(
        @NonNull InsurancePlan$Plan$SpecificCost$Benefit... benefit) {
      this.benefit = Arrays.asList(benefit);
      return this;
    }
    /** @param benefit */
    public InsurancePlan_Plan_SpecificCostBuilder.Impl withBenefit(
        @NonNull Collection<InsurancePlan$Plan$SpecificCost$Benefit> benefit) {
      this.benefit = Collections.unmodifiableCollection(benefit);
      return this;
    }

    public InsurancePlan_Plan_SpecificCostBuilder.Impl withBenefit(
        @NonNull InsurancePlan_Plan_SpecificCost_BenefitBuilder... benefit) {
      this.benefit = Arrays.stream(benefit).map(e -> e.build()).collect(toList());
      return this;
    }

    public InsurancePlan$Plan$SpecificCost build() {
      return new InsurancePlan$Plan$SpecificCost(
          OptionConverters.toScala(id),
          category,
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          benefit.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
