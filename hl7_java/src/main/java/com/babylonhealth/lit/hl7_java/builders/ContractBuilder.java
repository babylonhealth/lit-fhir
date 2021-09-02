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
import com.babylonhealth.lit.hl7.CONTRACT_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ContractBuilder {
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
  private Optional<Choice01025009075> topic = Optional.empty();
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
  private Optional<Choice_0340660840> legallyBinding = Optional.empty();
  private Optional<Reference> instantiatesCanonical = Optional.empty();
  private Collection<Contract.Rule> rule = Collections.emptyList();
  private Collection<Contract.Legal> legal = Collections.emptyList();
  private Collection<Contract.Signer> signer = Collections.emptyList();
  private Collection<Contract.Friendly> friendly = Collections.emptyList();
  private Optional<Contract.ContentDefinition> contentDefinition = Optional.empty();
  private Collection<Contract.Term> term = Collections.emptyList();

  /** Required fields for {@link Contract} */
  public ContractBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ContractBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param url - Canonical identifier for this contract, represented as a URI (globally unique).
   */
  public ContractBuilder withUrl(@NonNull String url) {
    this.url = Optional.of(url);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public ContractBuilder withMeta(@NonNull Meta meta) {
    this.meta = Optional.of(meta);
    return this;
  }
  /**
   * @param text - A human-readable narrative that contains a summary of the resource and can be
   *     used to represent the content of the resource to a human. The narrative need not encode all
   *     the structured data, but is required to contain sufficient detail to make it "clinically
   *     safe" for a human to just read the narrative. Resource definitions may define what content
   *     should be represented in the narrative to ensure clinical safety.
   */
  public ContractBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param site - Sites in which the contract is complied with, exercised, or in force. */
  public ContractBuilder withSite(@NonNull Reference... site) {
    this.site = Arrays.asList(site);
    return this;
  }
  /** @param site - Sites in which the contract is complied with, exercised, or in force. */
  public ContractBuilder withSite(@NonNull Collection<Reference> site) {
    this.site = Collections.unmodifiableCollection(site);
    return this;
  }
  /**
   * @param name - A natural language name identifying this Contract definition, derivative, or
   *     instance in any legal state. Provides additional information about its content. This name
   *     should be usable as an identifier for the module by machine processing applications such as
   *     code generation.
   */
  public ContractBuilder withName(@NonNull String name) {
    this.name = Optional.of(name);
    return this;
  }
  /**
   * @param _type - A high-level category for the legal instrument, whether constructed as a
   *     Contract definition, derivative, or instance in any legal state. Provides additional
   *     information about its content within the context of the Contract's scope to distinguish the
   *     kinds of systems that would be interested in the contract.
   */
  public ContractBuilder withType(@NonNull CodeableConcept _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /**
   * @param title - A short, descriptive, user-friendly title for this Contract definition,
   *     derivative, or instance in any legal state.t giving additional information about its
   *     content.
   */
  public ContractBuilder withTitle(@NonNull String title) {
    this.title = Optional.of(title);
    return this;
  }
  /**
   * @param alias - Alternative representation of the title for this Contract definition,
   *     derivative, or instance in any legal state., e.g., a domain specific contract number
   *     related to legislation.
   */
  public ContractBuilder withAlias(@NonNull String... alias) {
    this.alias = Arrays.asList(alias);
    return this;
  }
  /**
   * @param alias - Alternative representation of the title for this Contract definition,
   *     derivative, or instance in any legal state., e.g., a domain specific contract number
   *     related to legislation.
   */
  public ContractBuilder withAlias(@NonNull Collection<String> alias) {
    this.alias = Collections.unmodifiableCollection(alias);
    return this;
  }
  /**
   * @param scope - A selector of legal concerns for this Contract definition, derivative, or
   *     instance in any legal state.
   */
  public ContractBuilder withScope(@NonNull CodeableConcept scope) {
    this.scope = Optional.of(scope);
    return this;
  }
  /** @param status - The status of the resource instance. */
  public ContractBuilder withStatus(@NonNull CONTRACT_STATUS status) {
    this.status = Optional.of(status);
    return this;
  }
  /** @param issued - When this Contract was issued. */
  public ContractBuilder withIssued(@NonNull FHIRDateTime issued) {
    this.issued = Optional.of(issued);
    return this;
  }
  /**
   * @param domain - Recognized governance framework or system operating with a circumscribed scope
   *     in accordance with specified principles, policies, processes or procedures for managing
   *     rights, actions, or behaviors of parties or principals relative to resources.
   */
  public ContractBuilder withDomain(@NonNull Reference... domain) {
    this.domain = Arrays.asList(domain);
    return this;
  }
  /**
   * @param domain - Recognized governance framework or system operating with a circumscribed scope
   *     in accordance with specified principles, policies, processes or procedures for managing
   *     rights, actions, or behaviors of parties or principals relative to resources.
   */
  public ContractBuilder withDomain(@NonNull Collection<Reference> domain) {
    this.domain = Collections.unmodifiableCollection(domain);
    return this;
  }
  /**
   * @param author - The individual or organization that authored the Contract definition,
   *     derivative, or instance in any legal state.
   */
  public ContractBuilder withAuthor(@NonNull Reference author) {
    this.author = Optional.of(author);
    return this;
  }
  /**
   * @param version - An edition identifier used for business purposes to label business significant
   *     variants.
   */
  public ContractBuilder withVersion(@NonNull String version) {
    this.version = Optional.of(version);
    return this;
  }
  /** @param applies - Relevant time or time-period when this Contract is applicable. */
  public ContractBuilder withApplies(@NonNull Period applies) {
    this.applies = Optional.of(applies);
    return this;
  }
  /** @param subject - The target entity impacted by or of interest to parties to the agreement. */
  public ContractBuilder withSubject(@NonNull Reference... subject) {
    this.subject = Arrays.asList(subject);
    return this;
  }
  /** @param subject - The target entity impacted by or of interest to parties to the agreement. */
  public ContractBuilder withSubject(@NonNull Collection<Reference> subject) {
    this.subject = Collections.unmodifiableCollection(subject);
    return this;
  }
  /**
   * @param subType - Sub-category for the Contract that distinguishes the kinds of systems that
   *     would be interested in the Contract within the context of the Contract's scope.
   */
  public ContractBuilder withSubType(@NonNull CodeableConcept... subType) {
    this.subType = Arrays.asList(subType);
    return this;
  }
  /**
   * @param subType - Sub-category for the Contract that distinguishes the kinds of systems that
   *     would be interested in the Contract within the context of the Contract's scope.
   */
  public ContractBuilder withSubType(@NonNull Collection<CodeableConcept> subType) {
    this.subType = Collections.unmodifiableCollection(subType);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public ContractBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param subtitle - An explanatory or alternate user-friendly title for this Contract definition,
   *     derivative, or instance in any legal state.t giving additional information about its
   *     content.
   */
  public ContractBuilder withSubtitle(@NonNull String subtitle) {
    this.subtitle = Optional.of(subtitle);
    return this;
  }
  /**
   * @param topic - Narrows the range of legal concerns to focus on the achievement of specific
   *     contractual objectives. Field is a 'choice' field. Type should be one of CodeableConcept,
   *     Reference.
   */
  public ContractBuilder withTopic(@NonNull Choice01025009075 topic) {
    this.topic = Optional.of(topic);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ContractBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ContractBuilder withContained(@NonNull Collection<Resource> contained) {
    this.contained = Collections.unmodifiableCollection(contained);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ContractBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ContractBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param authority - A formally or informally recognized grouping of people, principals,
   *     organizations, or jurisdictions formed for the purpose of achieving some form of collective
   *     action such as the promulgation, administration and enforcement of contracts and policies.
   */
  public ContractBuilder withAuthority(@NonNull Reference... authority) {
    this.authority = Arrays.asList(authority);
    return this;
  }
  /**
   * @param authority - A formally or informally recognized grouping of people, principals,
   *     organizations, or jurisdictions formed for the purpose of achieving some form of collective
   *     action such as the promulgation, administration and enforcement of contracts and policies.
   */
  public ContractBuilder withAuthority(@NonNull Collection<Reference> authority) {
    this.authority = Collections.unmodifiableCollection(authority);
    return this;
  }
  /**
   * @param identifier - Unique identifier for this Contract or a derivative that references a
   *     Source Contract.
   */
  public ContractBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Unique identifier for this Contract or a derivative that references a
   *     Source Contract.
   */
  public ContractBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param legalState - Legal states of the formation of a legal instrument, which is a formally
   *     executed written document that can be formally attributed to its author, records and
   *     formally expresses a legally enforceable act, process, or contractual duty, obligation, or
   *     right, and therefore evidences that act, process, or agreement.
   */
  public ContractBuilder withLegalState(@NonNull CodeableConcept legalState) {
    this.legalState = Optional.of(legalState);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public ContractBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param expirationType - Event resulting in discontinuation or termination of this Contract
   *     instance by one or more parties to the contract.
   */
  public ContractBuilder withExpirationType(@NonNull CodeableConcept expirationType) {
    this.expirationType = Optional.of(expirationType);
    return this;
  }
  /**
   * @param supportingInfo - Information that may be needed by/relevant to the performer in their
   *     execution of this term action.
   */
  public ContractBuilder withSupportingInfo(@NonNull Reference... supportingInfo) {
    this.supportingInfo = Arrays.asList(supportingInfo);
    return this;
  }
  /**
   * @param supportingInfo - Information that may be needed by/relevant to the performer in their
   *     execution of this term action.
   */
  public ContractBuilder withSupportingInfo(@NonNull Collection<Reference> supportingInfo) {
    this.supportingInfo = Collections.unmodifiableCollection(supportingInfo);
    return this;
  }
  /**
   * @param instantiatesUri - The URL pointing to an externally maintained definition that is
   *     adhered to in whole or in part by this Contract.
   */
  public ContractBuilder withInstantiatesUri(@NonNull String instantiatesUri) {
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
  public ContractBuilder withRelevantHistory(@NonNull Reference... relevantHistory) {
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
  public ContractBuilder withRelevantHistory(@NonNull Collection<Reference> relevantHistory) {
    this.relevantHistory = Collections.unmodifiableCollection(relevantHistory);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public ContractBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public ContractBuilder withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param contentDerivative - The minimal content derived from the basal information source at a
   *     specific stage in its lifecycle.
   */
  public ContractBuilder withContentDerivative(@NonNull CodeableConcept contentDerivative) {
    this.contentDerivative = Optional.of(contentDerivative);
    return this;
  }
  /**
   * @param legallyBinding - Legally binding Contract: This is the signed and legally recognized
   *     representation of the Contract, which is considered the "source of truth" and which would
   *     be the basis for legal action related to enforcement of this Contract. Field is a 'choice'
   *     field. Type should be one of Attachment, Reference.
   */
  public ContractBuilder withLegallyBinding(@NonNull Choice_0340660840 legallyBinding) {
    this.legallyBinding = Optional.of(legallyBinding);
    return this;
  }
  /**
   * @param instantiatesCanonical - The URL pointing to a FHIR-defined Contract Definition that is
   *     adhered to in whole or part by this Contract.
   */
  public ContractBuilder withInstantiatesCanonical(@NonNull Reference instantiatesCanonical) {
    this.instantiatesCanonical = Optional.of(instantiatesCanonical);
    return this;
  }
  /** @param rule - List of Computable Policy Rule Language Representations of this Contract. */
  public ContractBuilder withRule(@NonNull Contract.Rule... rule) {
    this.rule = Arrays.asList(rule);
    return this;
  }
  /** @param rule - List of Computable Policy Rule Language Representations of this Contract. */
  public ContractBuilder withRule(@NonNull Collection<Contract.Rule> rule) {
    this.rule = Collections.unmodifiableCollection(rule);
    return this;
  }
  /** @param legal - List of Legal expressions or representations of this Contract. */
  public ContractBuilder withLegal(@NonNull Contract.Legal... legal) {
    this.legal = Arrays.asList(legal);
    return this;
  }
  /** @param legal - List of Legal expressions or representations of this Contract. */
  public ContractBuilder withLegal(@NonNull Collection<Contract.Legal> legal) {
    this.legal = Collections.unmodifiableCollection(legal);
    return this;
  }
  /**
   * @param signer - Parties with legal standing in the Contract, including the principal parties,
   *     the grantor(s) and grantee(s), which are any person or organization bound by the contract,
   *     and any ancillary parties, which facilitate the execution of the contract such as a notary
   *     or witness.
   */
  public ContractBuilder withSigner(@NonNull Contract.Signer... signer) {
    this.signer = Arrays.asList(signer);
    return this;
  }
  /**
   * @param signer - Parties with legal standing in the Contract, including the principal parties,
   *     the grantor(s) and grantee(s), which are any person or organization bound by the contract,
   *     and any ancillary parties, which facilitate the execution of the contract such as a notary
   *     or witness.
   */
  public ContractBuilder withSigner(@NonNull Collection<Contract.Signer> signer) {
    this.signer = Collections.unmodifiableCollection(signer);
    return this;
  }
  /**
   * @param friendly - The "patient friendly language" versionof the Contract in whole or in parts.
   *     "Patient friendly language" means the representation of the Contract and Contract
   *     Provisions in a manner that is readily accessible and understandable by a layperson in
   *     accordance with best practices for communication styles that ensure that those agreeing to
   *     or signing the Contract understand the roles, actions, obligations, responsibilities, and
   *     implication of the agreement.
   */
  public ContractBuilder withFriendly(@NonNull Contract.Friendly... friendly) {
    this.friendly = Arrays.asList(friendly);
    return this;
  }
  /**
   * @param friendly - The "patient friendly language" versionof the Contract in whole or in parts.
   *     "Patient friendly language" means the representation of the Contract and Contract
   *     Provisions in a manner that is readily accessible and understandable by a layperson in
   *     accordance with best practices for communication styles that ensure that those agreeing to
   *     or signing the Contract understand the roles, actions, obligations, responsibilities, and
   *     implication of the agreement.
   */
  public ContractBuilder withFriendly(@NonNull Collection<Contract.Friendly> friendly) {
    this.friendly = Collections.unmodifiableCollection(friendly);
    return this;
  }
  /**
   * @param contentDefinition - Precusory content developed with a focus and intent of supporting
   *     the formation a Contract instance, which may be associated with and transformable into a
   *     Contract.
   */
  public ContractBuilder withContentDefinition(
      @NonNull Contract.ContentDefinition contentDefinition) {
    this.contentDefinition = Optional.of(contentDefinition);
    return this;
  }
  /**
   * @param term - One or more Contract Provisions, which may be related and conveyed as a group,
   *     and may contain nested groups.
   */
  public ContractBuilder withTerm(@NonNull Contract.Term... term) {
    this.term = Arrays.asList(term);
    return this;
  }
  /**
   * @param term - One or more Contract Provisions, which may be related and conveyed as a group,
   *     and may contain nested groups.
   */
  public ContractBuilder withTerm(@NonNull Collection<Contract.Term> term) {
    this.term = Collections.unmodifiableCollection(term);
    return this;
  }

  public ContractBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Contract build() {
    return new Contract(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(url),
        (Option) OptionConverters.toScala(meta),
        (Option) OptionConverters.toScala(text),
        site.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(name),
        (Option) OptionConverters.toScala(_type),
        (Option) OptionConverters.toScala(title),
        alias.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(scope),
        (Option) OptionConverters.toScala(status),
        (Option) OptionConverters.toScala(issued),
        domain.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(author),
        (Option) OptionConverters.toScala(version),
        (Option) OptionConverters.toScala(applies),
        subject.stream().collect(new LitSeqJCollector<>()),
        subType.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(language),
        (Option) OptionConverters.toScala(subtitle),
        (Option) OptionConverters.toScala(topic),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        authority.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(legalState),
        (Option) OptionConverters.toScala(implicitRules),
        (Option) OptionConverters.toScala(expirationType),
        supportingInfo.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(instantiatesUri),
        relevantHistory.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(contentDerivative),
        (Option) OptionConverters.toScala(legallyBinding),
        (Option) OptionConverters.toScala(instantiatesCanonical),
        rule.stream().collect(new LitSeqJCollector<>()),
        legal.stream().collect(new LitSeqJCollector<>()),
        signer.stream().collect(new LitSeqJCollector<>()),
        friendly.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(contentDefinition),
        term.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
