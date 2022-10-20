package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.CONTRACT_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface ContractBuilder extends DomainResourceBuilder {
  public Contract build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceCodeableConceptOrReference topic(CodeableConcept c) {
    return new ChoiceCodeableConceptOrReference(c);
  }

  public static ChoiceCodeableConceptOrReference topic(Reference r) {
    return new ChoiceCodeableConceptOrReference(r);
  }

  public static ChoiceAttachmentOrReference legallyBinding(Attachment a) {
    return new ChoiceAttachmentOrReference(a);
  }

  public static ChoiceAttachmentOrReference legallyBinding(Reference r) {
    return new ChoiceAttachmentOrReference(r);
  }

  public class Impl implements ContractBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<Reference> site = Collections.emptyList();
    private Optional<String> name = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<String> title = Optional.empty();
    private Collection<String> alias = Collections.emptyList();
    private Optional<CodeableConcept> scope = Optional.empty();
    private Optional<CONTRACT_STATUS> status = Optional.empty();
    private Optional<FHIRDateTime> issued = Optional.empty();
    private Collection<Reference> domain = Collections.emptyList();
    private Optional<Reference> author = Optional.empty();
    private Optional<String> version = Optional.empty();
    private Optional<Period> applies = Optional.empty();
    private Collection<Reference> subject = Collections.emptyList();
    private Collection<CodeableConcept> subType = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<String> subtitle = Optional.empty();
    private Optional<ChoiceCodeableConceptOrReference> topic = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Reference> authority = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<CodeableConcept> legalState = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> expirationType = Optional.empty();
    private Collection<Reference> supportingInfo = Collections.emptyList();
    private Optional<String> instantiatesUri = Optional.empty();
    private Collection<Reference> relevantHistory = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> contentDerivative = Optional.empty();
    private Optional<ChoiceAttachmentOrReference> legallyBinding = Optional.empty();
    private Optional<Reference> instantiatesCanonical = Optional.empty();
    private Collection<Contract.Rule> rule = Collections.emptyList();
    private Collection<Contract.Legal> legal = Collections.emptyList();
    private Collection<Contract.Signer> signer = Collections.emptyList();
    private Collection<Contract.Friendly> friendly = Collections.emptyList();
    private Optional<Contract.ContentDefinition> contentDefinition = Optional.empty();
    private Collection<Contract.Term> term = Collections.emptyList();

    /** Required fields for {@link Contract} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ContractBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - Canonical identifier for this contract, represented as a URI (globally unique).
     */
    public ContractBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public ContractBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public ContractBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public ContractBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public ContractBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param site - Sites in which the contract is complied with, exercised, or in force. */
    public ContractBuilder.Impl withSite(@NonNull Reference... site) {
      this.site = Arrays.asList(site);
      return this;
    }
    /** @param site - Sites in which the contract is complied with, exercised, or in force. */
    public ContractBuilder.Impl withSite(@NonNull Collection<Reference> site) {
      this.site = Collections.unmodifiableCollection(site);
      return this;
    }

    public ContractBuilder.Impl withSite(@NonNull ReferenceBuilder... site) {
      this.site = Arrays.stream(site).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param name - A natural language name identifying this Contract definition, derivative, or
     *     instance in any legal state. Provides additional information about its content. This name
     *     should be usable as an identifier for the module by machine processing applications such
     *     as code generation.
     */
    public ContractBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param _type - A high-level category for the legal instrument, whether constructed as a
     *     Contract definition, derivative, or instance in any legal state. Provides additional
     *     information about its content within the context of the Contract's scope to distinguish
     *     the kinds of systems that would be interested in the contract.
     */
    public ContractBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public ContractBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /**
     * @param title - A short, descriptive, user-friendly title for this Contract definition,
     *     derivative, or instance in any legal state.t giving additional information about its
     *     content.
     */
    public ContractBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param alias - Alternative representation of the title for this Contract definition,
     *     derivative, or instance in any legal state., e.g., a domain specific contract number
     *     related to legislation.
     */
    public ContractBuilder.Impl withAlias(@NonNull String... alias) {
      this.alias = Arrays.asList(alias);
      return this;
    }
    /**
     * @param alias - Alternative representation of the title for this Contract definition,
     *     derivative, or instance in any legal state., e.g., a domain specific contract number
     *     related to legislation.
     */
    public ContractBuilder.Impl withAlias(@NonNull Collection<String> alias) {
      this.alias = Collections.unmodifiableCollection(alias);
      return this;
    }
    /**
     * @param scope - A selector of legal concerns for this Contract definition, derivative, or
     *     instance in any legal state.
     */
    public ContractBuilder.Impl withScope(@NonNull CodeableConcept scope) {
      this.scope = Optional.of(scope);
      return this;
    }

    public ContractBuilder.Impl withScope(@NonNull CodeableConceptBuilder scope) {
      this.scope = Optional.of(scope.build());
      return this;
    }
    /** @param status - The status of the resource instance. */
    public ContractBuilder.Impl withStatus(@NonNull CONTRACT_STATUS status) {
      this.status = Optional.of(status);
      return this;
    }
    /** @param issued - When this Contract was issued. */
    public ContractBuilder.Impl withIssued(@NonNull FHIRDateTime issued) {
      this.issued = Optional.of(issued);
      return this;
    }
    /**
     * @param domain - Recognized governance framework or system operating with a circumscribed
     *     scope in accordance with specified principles, policies, processes or procedures for
     *     managing rights, actions, or behaviors of parties or principals relative to resources.
     */
    public ContractBuilder.Impl withDomain(@NonNull Reference... domain) {
      this.domain = Arrays.asList(domain);
      return this;
    }
    /**
     * @param domain - Recognized governance framework or system operating with a circumscribed
     *     scope in accordance with specified principles, policies, processes or procedures for
     *     managing rights, actions, or behaviors of parties or principals relative to resources.
     */
    public ContractBuilder.Impl withDomain(@NonNull Collection<Reference> domain) {
      this.domain = Collections.unmodifiableCollection(domain);
      return this;
    }

    public ContractBuilder.Impl withDomain(@NonNull ReferenceBuilder... domain) {
      this.domain = Arrays.stream(domain).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param author - The individual or organization that authored the Contract definition,
     *     derivative, or instance in any legal state.
     */
    public ContractBuilder.Impl withAuthor(@NonNull Reference author) {
      this.author = Optional.of(author);
      return this;
    }

    public ContractBuilder.Impl withAuthor(@NonNull ReferenceBuilder author) {
      this.author = Optional.of(author.build());
      return this;
    }
    /**
     * @param version - An edition identifier used for business purposes to label business
     *     significant variants.
     */
    public ContractBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /** @param applies - Relevant time or time-period when this Contract is applicable. */
    public ContractBuilder.Impl withApplies(@NonNull Period applies) {
      this.applies = Optional.of(applies);
      return this;
    }

    public ContractBuilder.Impl withApplies(@NonNull PeriodBuilder applies) {
      this.applies = Optional.of(applies.build());
      return this;
    }
    /**
     * @param subject - The target entity impacted by or of interest to parties to the agreement.
     */
    public ContractBuilder.Impl withSubject(@NonNull Reference... subject) {
      this.subject = Arrays.asList(subject);
      return this;
    }
    /**
     * @param subject - The target entity impacted by or of interest to parties to the agreement.
     */
    public ContractBuilder.Impl withSubject(@NonNull Collection<Reference> subject) {
      this.subject = Collections.unmodifiableCollection(subject);
      return this;
    }

    public ContractBuilder.Impl withSubject(@NonNull ReferenceBuilder... subject) {
      this.subject = Arrays.stream(subject).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param subType - Sub-category for the Contract that distinguishes the kinds of systems that
     *     would be interested in the Contract within the context of the Contract's scope.
     */
    public ContractBuilder.Impl withSubType(@NonNull CodeableConcept... subType) {
      this.subType = Arrays.asList(subType);
      return this;
    }
    /**
     * @param subType - Sub-category for the Contract that distinguishes the kinds of systems that
     *     would be interested in the Contract within the context of the Contract's scope.
     */
    public ContractBuilder.Impl withSubType(@NonNull Collection<CodeableConcept> subType) {
      this.subType = Collections.unmodifiableCollection(subType);
      return this;
    }

    public ContractBuilder.Impl withSubType(@NonNull CodeableConceptBuilder... subType) {
      this.subType = Arrays.stream(subType).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public ContractBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param subtitle - An explanatory or alternate user-friendly title for this Contract
     *     definition, derivative, or instance in any legal state.t giving additional information
     *     about its content.
     */
    public ContractBuilder.Impl withSubtitle(@NonNull String subtitle) {
      this.subtitle = Optional.of(subtitle);
      return this;
    }
    /**
     * @param topic - Narrows the range of legal concerns to focus on the achievement of specific
     *     contractual objectives. Field is a 'choice' field. Type should be one of CodeableConcept,
     *     Reference. To pass the value in, wrap with one of the ContractBuilder.topic static
     *     methods
     */
    public ContractBuilder.Impl withTopic(@NonNull ChoiceCodeableConceptOrReference topic) {
      this.topic = Optional.of(topic);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ContractBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ContractBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public ContractBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public ContractBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ContractBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ContractBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param authority - A formally or informally recognized grouping of people, principals,
     *     organizations, or jurisdictions formed for the purpose of achieving some form of
     *     collective action such as the promulgation, administration and enforcement of contracts
     *     and policies.
     */
    public ContractBuilder.Impl withAuthority(@NonNull Reference... authority) {
      this.authority = Arrays.asList(authority);
      return this;
    }
    /**
     * @param authority - A formally or informally recognized grouping of people, principals,
     *     organizations, or jurisdictions formed for the purpose of achieving some form of
     *     collective action such as the promulgation, administration and enforcement of contracts
     *     and policies.
     */
    public ContractBuilder.Impl withAuthority(@NonNull Collection<Reference> authority) {
      this.authority = Collections.unmodifiableCollection(authority);
      return this;
    }

    public ContractBuilder.Impl withAuthority(@NonNull ReferenceBuilder... authority) {
      this.authority = Arrays.stream(authority).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Unique identifier for this Contract or a derivative that references a
     *     Source Contract.
     */
    public ContractBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Unique identifier for this Contract or a derivative that references a
     *     Source Contract.
     */
    public ContractBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public ContractBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param legalState - Legal states of the formation of a legal instrument, which is a formally
     *     executed written document that can be formally attributed to its author, records and
     *     formally expresses a legally enforceable act, process, or contractual duty, obligation,
     *     or right, and therefore evidences that act, process, or agreement.
     */
    public ContractBuilder.Impl withLegalState(@NonNull CodeableConcept legalState) {
      this.legalState = Optional.of(legalState);
      return this;
    }

    public ContractBuilder.Impl withLegalState(@NonNull CodeableConceptBuilder legalState) {
      this.legalState = Optional.of(legalState.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public ContractBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param expirationType - Event resulting in discontinuation or termination of this Contract
     *     instance by one or more parties to the contract.
     */
    public ContractBuilder.Impl withExpirationType(@NonNull CodeableConcept expirationType) {
      this.expirationType = Optional.of(expirationType);
      return this;
    }

    public ContractBuilder.Impl withExpirationType(@NonNull CodeableConceptBuilder expirationType) {
      this.expirationType = Optional.of(expirationType.build());
      return this;
    }
    /**
     * @param supportingInfo - Information that may be needed by/relevant to the performer in their
     *     execution of this term action.
     */
    public ContractBuilder.Impl withSupportingInfo(@NonNull Reference... supportingInfo) {
      this.supportingInfo = Arrays.asList(supportingInfo);
      return this;
    }
    /**
     * @param supportingInfo - Information that may be needed by/relevant to the performer in their
     *     execution of this term action.
     */
    public ContractBuilder.Impl withSupportingInfo(@NonNull Collection<Reference> supportingInfo) {
      this.supportingInfo = Collections.unmodifiableCollection(supportingInfo);
      return this;
    }

    public ContractBuilder.Impl withSupportingInfo(@NonNull ReferenceBuilder... supportingInfo) {
      this.supportingInfo = Arrays.stream(supportingInfo).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained definition that is
     *     adhered to in whole or in part by this Contract.
     */
    public ContractBuilder.Impl withInstantiatesUri(@NonNull String instantiatesUri) {
      this.instantiatesUri = Optional.of(instantiatesUri);
      return this;
    }
    /**
     * @param relevantHistory - Links to Provenance records for past versions of this Contract
     *     definition, derivative, or instance, which identify key state transitions or updates that
     *     are likely to be relevant to a user looking at the current version of the Contract. The
     *     Provence.entity indicates the target that was changed in the update.
     *     http://build.fhir.org/provenance-definitions.html#Provenance.entity.
     */
    public ContractBuilder.Impl withRelevantHistory(@NonNull Reference... relevantHistory) {
      this.relevantHistory = Arrays.asList(relevantHistory);
      return this;
    }
    /**
     * @param relevantHistory - Links to Provenance records for past versions of this Contract
     *     definition, derivative, or instance, which identify key state transitions or updates that
     *     are likely to be relevant to a user looking at the current version of the Contract. The
     *     Provence.entity indicates the target that was changed in the update.
     *     http://build.fhir.org/provenance-definitions.html#Provenance.entity.
     */
    public ContractBuilder.Impl withRelevantHistory(
        @NonNull Collection<Reference> relevantHistory) {
      this.relevantHistory = Collections.unmodifiableCollection(relevantHistory);
      return this;
    }

    public ContractBuilder.Impl withRelevantHistory(@NonNull ReferenceBuilder... relevantHistory) {
      this.relevantHistory = Arrays.stream(relevantHistory).map(e -> e.build()).collect(toList());
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
    public ContractBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public ContractBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ContractBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contentDerivative - The minimal content derived from the basal information source at a
     *     specific stage in its lifecycle.
     */
    public ContractBuilder.Impl withContentDerivative(@NonNull CodeableConcept contentDerivative) {
      this.contentDerivative = Optional.of(contentDerivative);
      return this;
    }

    public ContractBuilder.Impl withContentDerivative(
        @NonNull CodeableConceptBuilder contentDerivative) {
      this.contentDerivative = Optional.of(contentDerivative.build());
      return this;
    }
    /**
     * @param legallyBinding - Legally binding Contract: This is the signed and legally recognized
     *     representation of the Contract, which is considered the "source of truth" and which would
     *     be the basis for legal action related to enforcement of this Contract. Field is a
     *     'choice' field. Type should be one of Attachment, Reference. To pass the value in, wrap
     *     with one of the ContractBuilder.legallyBinding static methods
     */
    public ContractBuilder.Impl withLegallyBinding(
        @NonNull ChoiceAttachmentOrReference legallyBinding) {
      this.legallyBinding = Optional.of(legallyBinding);
      return this;
    }
    /**
     * @param instantiatesCanonical - The URL pointing to a FHIR-defined Contract Definition that is
     *     adhered to in whole or part by this Contract.
     */
    public ContractBuilder.Impl withInstantiatesCanonical(
        @NonNull Reference instantiatesCanonical) {
      this.instantiatesCanonical = Optional.of(instantiatesCanonical);
      return this;
    }

    public ContractBuilder.Impl withInstantiatesCanonical(
        @NonNull ReferenceBuilder instantiatesCanonical) {
      this.instantiatesCanonical = Optional.of(instantiatesCanonical.build());
      return this;
    }
    /** @param rule - List of Computable Policy Rule Language Representations of this Contract. */
    public ContractBuilder.Impl withRule(@NonNull Contract.Rule... rule) {
      this.rule = Arrays.asList(rule);
      return this;
    }
    /** @param rule - List of Computable Policy Rule Language Representations of this Contract. */
    public ContractBuilder.Impl withRule(@NonNull Collection<Contract.Rule> rule) {
      this.rule = Collections.unmodifiableCollection(rule);
      return this;
    }

    public ContractBuilder.Impl withRule(@NonNull Contract_RuleBuilder... rule) {
      this.rule = Arrays.stream(rule).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param legal - List of Legal expressions or representations of this Contract. */
    public ContractBuilder.Impl withLegal(@NonNull Contract.Legal... legal) {
      this.legal = Arrays.asList(legal);
      return this;
    }
    /** @param legal - List of Legal expressions or representations of this Contract. */
    public ContractBuilder.Impl withLegal(@NonNull Collection<Contract.Legal> legal) {
      this.legal = Collections.unmodifiableCollection(legal);
      return this;
    }

    public ContractBuilder.Impl withLegal(@NonNull Contract_LegalBuilder... legal) {
      this.legal = Arrays.stream(legal).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param signer - Parties with legal standing in the Contract, including the principal parties,
     *     the grantor(s) and grantee(s), which are any person or organization bound by the
     *     contract, and any ancillary parties, which facilitate the execution of the contract such
     *     as a notary or witness.
     */
    public ContractBuilder.Impl withSigner(@NonNull Contract.Signer... signer) {
      this.signer = Arrays.asList(signer);
      return this;
    }
    /**
     * @param signer - Parties with legal standing in the Contract, including the principal parties,
     *     the grantor(s) and grantee(s), which are any person or organization bound by the
     *     contract, and any ancillary parties, which facilitate the execution of the contract such
     *     as a notary or witness.
     */
    public ContractBuilder.Impl withSigner(@NonNull Collection<Contract.Signer> signer) {
      this.signer = Collections.unmodifiableCollection(signer);
      return this;
    }

    public ContractBuilder.Impl withSigner(@NonNull Contract_SignerBuilder... signer) {
      this.signer = Arrays.stream(signer).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param friendly - The "patient friendly language" versionof the Contract in whole or in
     *     parts. "Patient friendly language" means the representation of the Contract and Contract
     *     Provisions in a manner that is readily accessible and understandable by a layperson in
     *     accordance with best practices for communication styles that ensure that those agreeing
     *     to or signing the Contract understand the roles, actions, obligations, responsibilities,
     *     and implication of the agreement.
     */
    public ContractBuilder.Impl withFriendly(@NonNull Contract.Friendly... friendly) {
      this.friendly = Arrays.asList(friendly);
      return this;
    }
    /**
     * @param friendly - The "patient friendly language" versionof the Contract in whole or in
     *     parts. "Patient friendly language" means the representation of the Contract and Contract
     *     Provisions in a manner that is readily accessible and understandable by a layperson in
     *     accordance with best practices for communication styles that ensure that those agreeing
     *     to or signing the Contract understand the roles, actions, obligations, responsibilities,
     *     and implication of the agreement.
     */
    public ContractBuilder.Impl withFriendly(@NonNull Collection<Contract.Friendly> friendly) {
      this.friendly = Collections.unmodifiableCollection(friendly);
      return this;
    }

    public ContractBuilder.Impl withFriendly(@NonNull Contract_FriendlyBuilder... friendly) {
      this.friendly = Arrays.stream(friendly).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contentDefinition - Precusory content developed with a focus and intent of supporting
     *     the formation a Contract instance, which may be associated with and transformable into a
     *     Contract.
     */
    public ContractBuilder.Impl withContentDefinition(
        @NonNull Contract.ContentDefinition contentDefinition) {
      this.contentDefinition = Optional.of(contentDefinition);
      return this;
    }

    public ContractBuilder.Impl withContentDefinition(
        @NonNull Contract_ContentDefinitionBuilder contentDefinition) {
      this.contentDefinition = Optional.of(contentDefinition.build());
      return this;
    }
    /**
     * @param term - One or more Contract Provisions, which may be related and conveyed as a group,
     *     and may contain nested groups.
     */
    public ContractBuilder.Impl withTerm(@NonNull Contract.Term... term) {
      this.term = Arrays.asList(term);
      return this;
    }
    /**
     * @param term - One or more Contract Provisions, which may be related and conveyed as a group,
     *     and may contain nested groups.
     */
    public ContractBuilder.Impl withTerm(@NonNull Collection<Contract.Term> term) {
      this.term = Collections.unmodifiableCollection(term);
      return this;
    }

    public ContractBuilder.Impl withTerm(@NonNull Contract_TermBuilder... term) {
      this.term = Arrays.stream(term).map(e -> e.build()).collect(toList());
      return this;
    }

    public ContractBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Contract build() {
      return new Contract(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          site.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(name),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(title),
          alias.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(scope),
          OptionConverters.toScala(status),
          OptionConverters.toScala(issued),
          domain.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(author),
          OptionConverters.toScala(version),
          OptionConverters.toScala(applies),
          subject.stream().collect(new LitSeqJCollector<>()),
          subType.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          OptionConverters.toScala(subtitle),
          (Option) OptionConverters.toScala(topic),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          authority.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(legalState),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(expirationType),
          supportingInfo.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(instantiatesUri),
          relevantHistory.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(contentDerivative),
          (Option) OptionConverters.toScala(legallyBinding),
          OptionConverters.toScala(instantiatesCanonical),
          rule.stream().collect(new LitSeqJCollector<>()),
          legal.stream().collect(new LitSeqJCollector<>()),
          signer.stream().collect(new LitSeqJCollector<>()),
          friendly.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(contentDefinition),
          term.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
