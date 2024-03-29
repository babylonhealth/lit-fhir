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

public interface CoverageEligibilityResponse_Insurance_ItemBuilder {
  public CoverageEligibilityResponse$Insurance$Item build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements CoverageEligibilityResponse_Insurance_ItemBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<CodeableConcept> unit = Optional.empty();
    private Optional<CodeableConcept> term = Optional.empty();
    private Optional<CodeableConcept> network = Optional.empty();
    private Optional<CodeableConcept> category = Optional.empty();
    private Collection<CodeableConcept> modifier = Collections.emptyList();
    private Optional<Reference> provider = Optional.empty();
    private Optional<Boolean> excluded = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<CodeableConcept> productOrService = Optional.empty();
    private Optional<String> authorizationUrl = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Boolean> authorizationRequired = Optional.empty();
    private Collection<CodeableConcept> authorizationSupporting = Collections.emptyList();
    private Collection<CoverageEligibilityResponse$Insurance$Item$Benefit> benefit =
        Collections.emptyList();

    /** Required fields for {@link CoverageEligibilityResponse$Insurance$Item} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param name */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /** @param unit */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withUnit(
        @NonNull CodeableConcept unit) {
      this.unit = Optional.of(unit);
      return this;
    }

    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withUnit(
        @NonNull CodeableConceptBuilder unit) {
      this.unit = Optional.of(unit.build());
      return this;
    }
    /** @param term */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withTerm(
        @NonNull CodeableConcept term) {
      this.term = Optional.of(term);
      return this;
    }

    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withTerm(
        @NonNull CodeableConceptBuilder term) {
      this.term = Optional.of(term.build());
      return this;
    }
    /** @param network */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withNetwork(
        @NonNull CodeableConcept network) {
      this.network = Optional.of(network);
      return this;
    }

    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withNetwork(
        @NonNull CodeableConceptBuilder network) {
      this.network = Optional.of(network.build());
      return this;
    }
    /** @param category */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withCategory(
        @NonNull CodeableConcept category) {
      this.category = Optional.of(category);
      return this;
    }

    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withCategory(
        @NonNull CodeableConceptBuilder category) {
      this.category = Optional.of(category.build());
      return this;
    }
    /** @param modifier */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withModifier(
        @NonNull CodeableConcept... modifier) {
      this.modifier = Arrays.asList(modifier);
      return this;
    }
    /** @param modifier */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withModifier(
        @NonNull Collection<CodeableConcept> modifier) {
      this.modifier = Collections.unmodifiableCollection(modifier);
      return this;
    }

    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withModifier(
        @NonNull CodeableConceptBuilder... modifier) {
      this.modifier = Arrays.stream(modifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param provider */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withProvider(
        @NonNull Reference provider) {
      this.provider = Optional.of(provider);
      return this;
    }

    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withProvider(
        @NonNull ReferenceBuilder provider) {
      this.provider = Optional.of(provider.build());
      return this;
    }
    /** @param excluded */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withExcluded(
        @NonNull Boolean excluded) {
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
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withExtension(
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
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withDescription(
        @NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param productOrService */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withProductOrService(
        @NonNull CodeableConcept productOrService) {
      this.productOrService = Optional.of(productOrService);
      return this;
    }

    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withProductOrService(
        @NonNull CodeableConceptBuilder productOrService) {
      this.productOrService = Optional.of(productOrService.build());
      return this;
    }
    /** @param authorizationUrl */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withAuthorizationUrl(
        @NonNull String authorizationUrl) {
      this.authorizationUrl = Optional.of(authorizationUrl);
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
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withModifierExtension(
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
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param authorizationRequired */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withAuthorizationRequired(
        @NonNull Boolean authorizationRequired) {
      this.authorizationRequired = Optional.of(authorizationRequired);
      return this;
    }
    /** @param authorizationSupporting */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withAuthorizationSupporting(
        @NonNull CodeableConcept... authorizationSupporting) {
      this.authorizationSupporting = Arrays.asList(authorizationSupporting);
      return this;
    }
    /** @param authorizationSupporting */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withAuthorizationSupporting(
        @NonNull Collection<CodeableConcept> authorizationSupporting) {
      this.authorizationSupporting = Collections.unmodifiableCollection(authorizationSupporting);
      return this;
    }

    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withAuthorizationSupporting(
        @NonNull CodeableConceptBuilder... authorizationSupporting) {
      this.authorizationSupporting =
          Arrays.stream(authorizationSupporting).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param benefit */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withBenefit(
        @NonNull CoverageEligibilityResponse$Insurance$Item$Benefit... benefit) {
      this.benefit = Arrays.asList(benefit);
      return this;
    }
    /** @param benefit */
    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withBenefit(
        @NonNull Collection<CoverageEligibilityResponse$Insurance$Item$Benefit> benefit) {
      this.benefit = Collections.unmodifiableCollection(benefit);
      return this;
    }

    public CoverageEligibilityResponse_Insurance_ItemBuilder.Impl withBenefit(
        @NonNull CoverageEligibilityResponse_Insurance_Item_BenefitBuilder... benefit) {
      this.benefit = Arrays.stream(benefit).map(e -> e.build()).collect(toList());
      return this;
    }

    public CoverageEligibilityResponse$Insurance$Item build() {
      return new CoverageEligibilityResponse$Insurance$Item(
          OptionConverters.toScala(id),
          OptionConverters.toScala(name),
          OptionConverters.toScala(unit),
          OptionConverters.toScala(term),
          OptionConverters.toScala(network),
          OptionConverters.toScala(category),
          modifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(provider),
          OptionConverters.toScala(excluded.map(x -> (Object) x)),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(productOrService),
          OptionConverters.toScala(authorizationUrl),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(authorizationRequired.map(x -> (Object) x)),
          authorizationSupporting.stream().collect(new LitSeqJCollector<>()),
          benefit.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
