package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface InsurancePlanBuilder extends DomainResourceBuilder {
  public InsurancePlan build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements InsurancePlanBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<CodeableConcept> _type = Collections.emptyList();
    private Optional<String> name = Optional.empty();
    private Collection<String> alias = Collections.emptyList();
    private Optional<PUBLICATION_STATUS> status = Optional.empty();
    private Optional<Period> period = Optional.empty();
    private Optional<Reference> ownedBy = Optional.empty();
    private Collection<Reference> network = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Reference> endpoint = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<Reference> coverageArea = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<Reference> administeredBy = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<InsurancePlan.Contact> contact = Collections.emptyList();
    private Collection<InsurancePlan.Coverage> coverage = Collections.emptyList();
    private Collection<InsurancePlan.Plan> plan = Collections.emptyList();

    /** Required fields for {@link InsurancePlan} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public InsurancePlanBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public InsurancePlanBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public InsurancePlanBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
      this.meta = Optional.of(meta.build());
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public InsurancePlanBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public InsurancePlanBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param _type - The kind of health insurance product. */
    public InsurancePlanBuilder.Impl withType(@NonNull CodeableConcept... _type) {
      this._type = Arrays.asList(_type);
      return this;
    }
    /** @param _type - The kind of health insurance product. */
    public InsurancePlanBuilder.Impl withType(@NonNull Collection<CodeableConcept> _type) {
      this._type = Collections.unmodifiableCollection(_type);
      return this;
    }

    public InsurancePlanBuilder.Impl withType(@NonNull CodeableConceptBuilder... _type) {
      this._type = Arrays.stream(_type).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param name - Official name of the health insurance product as designated by the owner. */
    public InsurancePlanBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param alias - A list of alternate names that the product is known as, or was known as in the
     *     past.
     */
    public InsurancePlanBuilder.Impl withAlias(@NonNull String... alias) {
      this.alias = Arrays.asList(alias);
      return this;
    }
    /**
     * @param alias - A list of alternate names that the product is known as, or was known as in the
     *     past.
     */
    public InsurancePlanBuilder.Impl withAlias(@NonNull Collection<String> alias) {
      this.alias = Collections.unmodifiableCollection(alias);
      return this;
    }
    /** @param status - The current state of the health insurance product. */
    public InsurancePlanBuilder.Impl withStatus(@NonNull PUBLICATION_STATUS status) {
      this.status = Optional.of(status);
      return this;
    }
    /** @param period - The period of time that the health insurance product is available. */
    public InsurancePlanBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public InsurancePlanBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /**
     * @param ownedBy - The entity that is providing the health insurance product and underwriting
     *     the risk. This is typically an insurance carriers, other third-party payers, or health
     *     plan sponsors comonly referred to as 'payers'.
     */
    public InsurancePlanBuilder.Impl withOwnedBy(@NonNull Reference ownedBy) {
      this.ownedBy = Optional.of(ownedBy);
      return this;
    }

    public InsurancePlanBuilder.Impl withOwnedBy(@NonNull ReferenceBuilder ownedBy) {
      this.ownedBy = Optional.of(ownedBy.build());
      return this;
    }
    /** @param network - Reference to the network included in the health insurance product. */
    public InsurancePlanBuilder.Impl withNetwork(@NonNull Reference... network) {
      this.network = Arrays.asList(network);
      return this;
    }
    /** @param network - Reference to the network included in the health insurance product. */
    public InsurancePlanBuilder.Impl withNetwork(@NonNull Collection<Reference> network) {
      this.network = Collections.unmodifiableCollection(network);
      return this;
    }

    public InsurancePlanBuilder.Impl withNetwork(@NonNull ReferenceBuilder... network) {
      this.network = Arrays.stream(network).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public InsurancePlanBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param endpoint - The technical endpoints providing access to services operated for the
     *     health insurance product.
     */
    public InsurancePlanBuilder.Impl withEndpoint(@NonNull Reference... endpoint) {
      this.endpoint = Arrays.asList(endpoint);
      return this;
    }
    /**
     * @param endpoint - The technical endpoints providing access to services operated for the
     *     health insurance product.
     */
    public InsurancePlanBuilder.Impl withEndpoint(@NonNull Collection<Reference> endpoint) {
      this.endpoint = Collections.unmodifiableCollection(endpoint);
      return this;
    }

    public InsurancePlanBuilder.Impl withEndpoint(@NonNull ReferenceBuilder... endpoint) {
      this.endpoint = Arrays.stream(endpoint).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public InsurancePlanBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public InsurancePlanBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public InsurancePlanBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
      this.contained = Arrays.stream(contained).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public InsurancePlanBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public InsurancePlanBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public InsurancePlanBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this health insurance product which
     *     remain constant as the resource is updated and propagates from server to server.
     */
    public InsurancePlanBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this health insurance product which
     *     remain constant as the resource is updated and propagates from server to server.
     */
    public InsurancePlanBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public InsurancePlanBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param coverageArea - The geographic region in which a health insurance product's benefits
     *     apply.
     */
    public InsurancePlanBuilder.Impl withCoverageArea(@NonNull Reference... coverageArea) {
      this.coverageArea = Arrays.asList(coverageArea);
      return this;
    }
    /**
     * @param coverageArea - The geographic region in which a health insurance product's benefits
     *     apply.
     */
    public InsurancePlanBuilder.Impl withCoverageArea(@NonNull Collection<Reference> coverageArea) {
      this.coverageArea = Collections.unmodifiableCollection(coverageArea);
      return this;
    }

    public InsurancePlanBuilder.Impl withCoverageArea(@NonNull ReferenceBuilder... coverageArea) {
      this.coverageArea = Arrays.stream(coverageArea).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public InsurancePlanBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param administeredBy - An organization which administer other services such as underwriting,
     *     customer service and/or claims processing on behalf of the health insurance product
     *     owner.
     */
    public InsurancePlanBuilder.Impl withAdministeredBy(@NonNull Reference administeredBy) {
      this.administeredBy = Optional.of(administeredBy);
      return this;
    }

    public InsurancePlanBuilder.Impl withAdministeredBy(@NonNull ReferenceBuilder administeredBy) {
      this.administeredBy = Optional.of(administeredBy.build());
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
    public InsurancePlanBuilder.Impl withModifierExtension(
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
    public InsurancePlanBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public InsurancePlanBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param contact - The contact for the health insurance product for a certain purpose. */
    public InsurancePlanBuilder.Impl withContact(@NonNull InsurancePlan.Contact... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /** @param contact - The contact for the health insurance product for a certain purpose. */
    public InsurancePlanBuilder.Impl withContact(
        @NonNull Collection<InsurancePlan.Contact> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public InsurancePlanBuilder.Impl withContact(@NonNull InsurancePlan_ContactBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param coverage - Details about the coverage offered by the insurance product. */
    public InsurancePlanBuilder.Impl withCoverage(@NonNull InsurancePlan.Coverage... coverage) {
      this.coverage = Arrays.asList(coverage);
      return this;
    }
    /** @param coverage - Details about the coverage offered by the insurance product. */
    public InsurancePlanBuilder.Impl withCoverage(
        @NonNull Collection<InsurancePlan.Coverage> coverage) {
      this.coverage = Collections.unmodifiableCollection(coverage);
      return this;
    }

    public InsurancePlanBuilder.Impl withCoverage(
        @NonNull InsurancePlan_CoverageBuilder... coverage) {
      this.coverage = Arrays.stream(coverage).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param plan - Details about an insurance plan. */
    public InsurancePlanBuilder.Impl withPlan(@NonNull InsurancePlan.Plan... plan) {
      this.plan = Arrays.asList(plan);
      return this;
    }
    /** @param plan - Details about an insurance plan. */
    public InsurancePlanBuilder.Impl withPlan(@NonNull Collection<InsurancePlan.Plan> plan) {
      this.plan = Collections.unmodifiableCollection(plan);
      return this;
    }

    public InsurancePlanBuilder.Impl withPlan(@NonNull InsurancePlan_PlanBuilder... plan) {
      this.plan = Arrays.stream(plan).map(e -> e.build()).collect(toList());
      return this;
    }

    public InsurancePlanBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public InsurancePlan build() {
      return new InsurancePlan(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          _type.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(name),
          alias.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(status),
          OptionConverters.toScala(period),
          OptionConverters.toScala(ownedBy),
          network.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          endpoint.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          coverageArea.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(administeredBy),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          contact.stream().collect(new LitSeqJCollector<>()),
          coverage.stream().collect(new LitSeqJCollector<>()),
          plan.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
