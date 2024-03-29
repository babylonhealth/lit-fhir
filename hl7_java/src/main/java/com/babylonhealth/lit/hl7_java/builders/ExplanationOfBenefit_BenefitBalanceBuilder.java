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

public interface ExplanationOfBenefit_BenefitBalanceBuilder {
  public ExplanationOfBenefit.BenefitBalance build();

  public static Impl init(CodeableConcept category) {
    return new Impl(category);
  }

  public static Impl builder(CodeableConceptBuilder category) {
    return new Impl(category.build());
  }

  public class Impl implements ExplanationOfBenefit_BenefitBalanceBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<CodeableConcept> unit = Optional.empty();
    private Optional<CodeableConcept> term = Optional.empty();
    private Optional<CodeableConcept> network = Optional.empty();
    private CodeableConcept category;
    private Optional<Boolean> excluded = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ExplanationOfBenefit$BenefitBalance$Financial> financial =
        Collections.emptyList();

    /**
     * Required fields for {@link ExplanationOfBenefit.BenefitBalance}
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
    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param name */
    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /** @param unit */
    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withUnit(@NonNull CodeableConcept unit) {
      this.unit = Optional.of(unit);
      return this;
    }

    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withUnit(
        @NonNull CodeableConceptBuilder unit) {
      this.unit = Optional.of(unit.build());
      return this;
    }
    /** @param term */
    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withTerm(@NonNull CodeableConcept term) {
      this.term = Optional.of(term);
      return this;
    }

    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withTerm(
        @NonNull CodeableConceptBuilder term) {
      this.term = Optional.of(term.build());
      return this;
    }
    /** @param network */
    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withNetwork(
        @NonNull CodeableConcept network) {
      this.network = Optional.of(network);
      return this;
    }

    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withNetwork(
        @NonNull CodeableConceptBuilder network) {
      this.network = Optional.of(network.build());
      return this;
    }
    /** @param excluded */
    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withExcluded(@NonNull Boolean excluded) {
      this.excluded = Optional.of(excluded);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withExtension(
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
    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description */
    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withDescription(
        @NonNull String description) {
      this.description = Optional.of(description);
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
    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withModifierExtension(
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
    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param financial */
    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withFinancial(
        @NonNull ExplanationOfBenefit$BenefitBalance$Financial... financial) {
      this.financial = Arrays.asList(financial);
      return this;
    }
    /** @param financial */
    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withFinancial(
        @NonNull Collection<ExplanationOfBenefit$BenefitBalance$Financial> financial) {
      this.financial = Collections.unmodifiableCollection(financial);
      return this;
    }

    public ExplanationOfBenefit_BenefitBalanceBuilder.Impl withFinancial(
        @NonNull ExplanationOfBenefit_BenefitBalance_FinancialBuilder... financial) {
      this.financial = Arrays.stream(financial).map(e -> e.build()).collect(toList());
      return this;
    }

    public ExplanationOfBenefit.BenefitBalance build() {
      return new ExplanationOfBenefit.BenefitBalance(
          OptionConverters.toScala(id),
          OptionConverters.toScala(name),
          OptionConverters.toScala(unit),
          OptionConverters.toScala(term),
          OptionConverters.toScala(network),
          category,
          OptionConverters.toScala(excluded.map(x -> (Object) x)),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          financial.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
