package com.babylonhealth.lit.hl7_java.builders;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import scala.math.BigDecimal;
import scala.Option;
import scala.collection.immutable.Seq;
import scala.jdk.javaapi.CollectionConverters;
import scala.jdk.javaapi.OptionConverters;

import lombok.NonNull;

import com.babylonhealth.lit.core.FHIRComponentFieldMeta;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeq$;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.Choice$;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.hl7.FM_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface CoverageBuilder extends DomainResourceBuilder {
  public Coverage build();

  public static Impl init(Collection<Reference> payor, FM_STATUS status, Reference beneficiary) {
    return new Impl(payor, status, beneficiary);
  }

  public static Impl builder(
      Collection<ReferenceBuilder> payor, FM_STATUS status, ReferenceBuilder beneficiary) {
    return new Impl(new LitSeq<>(payor).map(ReferenceBuilder::build), status, beneficiary.build());
  }

  public class Impl implements CoverageBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Collection<Reference> payor;
    private Optional<Integer> order = Optional.empty();
    private FM_STATUS status;
    private Optional<Period> period = Optional.empty();
    private Optional<String> network = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Reference> contract = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> dependent = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<Reference> subscriber = Optional.empty();
    private Reference beneficiary;
    private Optional<Boolean> subrogation = Optional.empty();
    private Optional<Reference> policyHolder = Optional.empty();
    private Optional<String> subscriberId = Optional.empty();
    private Optional<CodeableConcept> relationship = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Coverage.Class> _class = Collections.emptyList();
    private Collection<Coverage.CostToBeneficiary> costToBeneficiary = Collections.emptyList();

    /**
     * Required fields for {@link Coverage}
     *
     * @param payor - The program or plan underwriter or payor including both insurance and
     *     non-insurance agreements, such as patient-pay agreements.
     * @param status - The status of the resource instance.
     * @param beneficiary - The party who benefits from the insurance coverage; the patient when
     *     products and/or services are provided.
     */
    public Impl(Collection<Reference> payor, FM_STATUS status, Reference beneficiary) {
      this.payor = payor;
      this.status = status;
      this.beneficiary = beneficiary;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CoverageBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public CoverageBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public CoverageBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public CoverageBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public CoverageBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param _type - The type of coverage: social program, medical plan, accident coverage (workers
     *     compensation, auto), group health or payment by an individual or organization.
     */
    public CoverageBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public CoverageBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /**
     * @param order - The order of applicability of this coverage relative to other coverages which
     *     are currently in force. Note, there may be gaps in the numbering and this does not imply
     *     primary, secondary etc. as the specific positioning of coverages depends upon the episode
     *     of care.
     */
    public CoverageBuilder.Impl withOrder(@NonNull Integer order) {
      this.order = Optional.of(order);
      return this;
    }
    /**
     * @param period - Time period during which the coverage is in force. A missing start date
     *     indicates the start date isn't known, a missing end date means the coverage is continuing
     *     to be in force.
     */
    public CoverageBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public CoverageBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /**
     * @param network - The insurer-specific identifier for the insurer-defined network of providers
     *     to which the beneficiary may seek treatment which will be covered at the 'in-network'
     *     rate, otherwise 'out of network' terms and conditions apply.
     */
    public CoverageBuilder.Impl withNetwork(@NonNull String network) {
      this.network = Optional.of(network);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public CoverageBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param contract - The policy(s) which constitute this insurance coverage. */
    public CoverageBuilder.Impl withContract(@NonNull Reference... contract) {
      this.contract = Arrays.asList(contract);
      return this;
    }
    /** @param contract - The policy(s) which constitute this insurance coverage. */
    public CoverageBuilder.Impl withContract(@NonNull Collection<Reference> contract) {
      this.contract = Collections.unmodifiableCollection(contract);
      return this;
    }

    public CoverageBuilder.Impl withContract(@NonNull ReferenceBuilder... contract) {
      this.contract = Arrays.stream(contract).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public CoverageBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public CoverageBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public CoverageBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public CoverageBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public CoverageBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CoverageBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param dependent - A unique identifier for a dependent under the coverage. */
    public CoverageBuilder.Impl withDependent(@NonNull String dependent) {
      this.dependent = Optional.of(dependent);
      return this;
    }
    /** @param identifier - A unique identifier assigned to this coverage. */
    public CoverageBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - A unique identifier assigned to this coverage. */
    public CoverageBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public CoverageBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param subscriber - The party who has signed-up for or 'owns' the contractual relationship to
     *     the policy or to whom the benefit of the policy for services rendered to them or their
     *     family is due.
     */
    public CoverageBuilder.Impl withSubscriber(@NonNull Reference subscriber) {
      this.subscriber = Optional.of(subscriber);
      return this;
    }

    public CoverageBuilder.Impl withSubscriber(@NonNull ReferenceBuilder subscriber) {
      this.subscriber = Optional.of(subscriber.build());
      return this;
    }
    /**
     * @param subrogation - When 'subrogation=true' this insurance instance has been included not
     *     for adjudication but to provide insurers with the details to recover costs.
     */
    public CoverageBuilder.Impl withSubrogation(@NonNull Boolean subrogation) {
      this.subrogation = Optional.of(subrogation);
      return this;
    }
    /** @param policyHolder - The party who 'owns' the insurance policy. */
    public CoverageBuilder.Impl withPolicyHolder(@NonNull Reference policyHolder) {
      this.policyHolder = Optional.of(policyHolder);
      return this;
    }

    public CoverageBuilder.Impl withPolicyHolder(@NonNull ReferenceBuilder policyHolder) {
      this.policyHolder = Optional.of(policyHolder.build());
      return this;
    }
    /** @param subscriberId - The insurer assigned ID for the Subscriber. */
    public CoverageBuilder.Impl withSubscriberId(@NonNull String subscriberId) {
      this.subscriberId = Optional.of(subscriberId);
      return this;
    }
    /** @param relationship - The relationship of beneficiary (patient) to the subscriber. */
    public CoverageBuilder.Impl withRelationship(@NonNull CodeableConcept relationship) {
      this.relationship = Optional.of(relationship);
      return this;
    }

    public CoverageBuilder.Impl withRelationship(@NonNull CodeableConceptBuilder relationship) {
      this.relationship = Optional.of(relationship.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public CoverageBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
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
    public CoverageBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public CoverageBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public CoverageBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param _class - A suite of underwriter specific classifiers. */
    public CoverageBuilder.Impl withClass(@NonNull Coverage.Class... _class) {
      this._class = Arrays.asList(_class);
      return this;
    }
    /** @param _class - A suite of underwriter specific classifiers. */
    public CoverageBuilder.Impl withClass(@NonNull Collection<Coverage.Class> _class) {
      this._class = Collections.unmodifiableCollection(_class);
      return this;
    }

    public CoverageBuilder.Impl withClass(@NonNull Coverage_ClassBuilder... _class) {
      this._class = Arrays.stream(_class).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param costToBeneficiary - A suite of codes indicating the cost category and associated
     *     amount which have been detailed in the policy and may have been included on the health
     *     card.
     */
    public CoverageBuilder.Impl withCostToBeneficiary(
        @NonNull Coverage.CostToBeneficiary... costToBeneficiary) {
      this.costToBeneficiary = Arrays.asList(costToBeneficiary);
      return this;
    }
    /**
     * @param costToBeneficiary - A suite of codes indicating the cost category and associated
     *     amount which have been detailed in the policy and may have been included on the health
     *     card.
     */
    public CoverageBuilder.Impl withCostToBeneficiary(
        @NonNull Collection<Coverage.CostToBeneficiary> costToBeneficiary) {
      this.costToBeneficiary = Collections.unmodifiableCollection(costToBeneficiary);
      return this;
    }

    public CoverageBuilder.Impl withCostToBeneficiary(
        @NonNull Coverage_CostToBeneficiaryBuilder... costToBeneficiary) {
      this.costToBeneficiary =
          Arrays.stream(costToBeneficiary).map(e -> e.build()).collect(toList());
      return this;
    }

    public CoverageBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Coverage build() {
      return new Coverage(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(_type),
          payor.stream().collect(new NonEmptyLitSeqJCollector<>()),
          OptionConverters.toScala(order.map(x -> (Object) x)),
          status,
          OptionConverters.toScala(period),
          OptionConverters.toScala(network),
          OptionConverters.toScala(language),
          contract.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(dependent),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(subscriber),
          beneficiary,
          OptionConverters.toScala(subrogation.map(x -> (Object) x)),
          OptionConverters.toScala(policyHolder),
          OptionConverters.toScala(subscriberId),
          OptionConverters.toScala(relationship),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          _class.stream().collect(new LitSeqJCollector<>()),
          costToBeneficiary.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
