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

public interface InsurancePlan_PlanBuilder {
  public InsurancePlan.Plan build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements InsurancePlan_PlanBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Collection<Reference> network = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<Reference> coverageArea = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<InsurancePlan$Plan$GeneralCost> generalCost = Collections.emptyList();
    private Collection<InsurancePlan$Plan$SpecificCost> specificCost = Collections.emptyList();

    /** Required fields for {@link InsurancePlan.Plan} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public InsurancePlan_PlanBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type - The kind of health insurance product. */
    public InsurancePlan_PlanBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public InsurancePlan_PlanBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param network - Reference to the network included in the health insurance product. */
    public InsurancePlan_PlanBuilder.Impl withNetwork(@NonNull Reference... network) {
      this.network = Arrays.asList(network);
      return this;
    }
    /** @param network - Reference to the network included in the health insurance product. */
    public InsurancePlan_PlanBuilder.Impl withNetwork(@NonNull Collection<Reference> network) {
      this.network = Collections.unmodifiableCollection(network);
      return this;
    }

    public InsurancePlan_PlanBuilder.Impl withNetwork(@NonNull ReferenceBuilder... network) {
      this.network = Arrays.stream(network).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public InsurancePlan_PlanBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public InsurancePlan_PlanBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public InsurancePlan_PlanBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this health insurance product which
     *     remain constant as the resource is updated and propagates from server to server.
     */
    public InsurancePlan_PlanBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this health insurance product which
     *     remain constant as the resource is updated and propagates from server to server.
     */
    public InsurancePlan_PlanBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public InsurancePlan_PlanBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param coverageArea - The geographic region in which a health insurance product's benefits
     *     apply.
     */
    public InsurancePlan_PlanBuilder.Impl withCoverageArea(@NonNull Reference... coverageArea) {
      this.coverageArea = Arrays.asList(coverageArea);
      return this;
    }
    /**
     * @param coverageArea - The geographic region in which a health insurance product's benefits
     *     apply.
     */
    public InsurancePlan_PlanBuilder.Impl withCoverageArea(
        @NonNull Collection<Reference> coverageArea) {
      this.coverageArea = Collections.unmodifiableCollection(coverageArea);
      return this;
    }

    public InsurancePlan_PlanBuilder.Impl withCoverageArea(
        @NonNull ReferenceBuilder... coverageArea) {
      this.coverageArea = Arrays.stream(coverageArea).map(e -> e.build()).collect(toList());
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
    public InsurancePlan_PlanBuilder.Impl withModifierExtension(
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
    public InsurancePlan_PlanBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public InsurancePlan_PlanBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param generalCost */
    public InsurancePlan_PlanBuilder.Impl withGeneralCost(
        @NonNull InsurancePlan$Plan$GeneralCost... generalCost) {
      this.generalCost = Arrays.asList(generalCost);
      return this;
    }
    /** @param generalCost */
    public InsurancePlan_PlanBuilder.Impl withGeneralCost(
        @NonNull Collection<InsurancePlan$Plan$GeneralCost> generalCost) {
      this.generalCost = Collections.unmodifiableCollection(generalCost);
      return this;
    }

    public InsurancePlan_PlanBuilder.Impl withGeneralCost(
        @NonNull InsurancePlan_Plan_GeneralCostBuilder... generalCost) {
      this.generalCost = Arrays.stream(generalCost).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param specificCost */
    public InsurancePlan_PlanBuilder.Impl withSpecificCost(
        @NonNull InsurancePlan$Plan$SpecificCost... specificCost) {
      this.specificCost = Arrays.asList(specificCost);
      return this;
    }
    /** @param specificCost */
    public InsurancePlan_PlanBuilder.Impl withSpecificCost(
        @NonNull Collection<InsurancePlan$Plan$SpecificCost> specificCost) {
      this.specificCost = Collections.unmodifiableCollection(specificCost);
      return this;
    }

    public InsurancePlan_PlanBuilder.Impl withSpecificCost(
        @NonNull InsurancePlan_Plan_SpecificCostBuilder... specificCost) {
      this.specificCost = Arrays.stream(specificCost).map(e -> e.build()).collect(toList());
      return this;
    }

    public InsurancePlan.Plan build() {
      return new InsurancePlan.Plan(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          network.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          coverageArea.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          generalCost.stream().collect(new LitSeqJCollector<>()),
          specificCost.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
