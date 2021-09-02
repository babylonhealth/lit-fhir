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
import com.babylonhealth.lit.hl7.CAPABILITY_STATEMENT_KIND;
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.FHIR_VERSION;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class CapabilityStatementBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> url = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<String> name = Optional.empty();
  private FHIRDateTime date;
  private CAPABILITY_STATEMENT_KIND kind;
  private Optional<String> title = Optional.empty();
  private PUBLICATION_STATUS status;
  private Collection<String> format;
  private Optional<String> version = Optional.empty();
  private Collection<ContactDetail> contact = Collections.emptyList();
  private Optional<String> purpose = Optional.empty();
  private Collection<String> imports = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> publisher = Optional.empty();
  private Optional<String> copyright = Optional.empty();
  private Collection<UsageContext> useContext = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private FHIR_VERSION fhirVersion;
  private Collection<String> patchFormat = Collections.emptyList();
  private Optional<Boolean> experimental = Optional.empty();
  private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
  private Collection<String> instantiates = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<String> implementationGuide = Collections.emptyList();
  private Optional<CapabilityStatement.Software> software = Optional.empty();
  private Collection<CapabilityStatement.Document> document = Collections.emptyList();
  private Optional<CapabilityStatement.Implementation> implementation = Optional.empty();
  private Collection<CapabilityStatement.Rest> rest = Collections.emptyList();
  private Collection<CapabilityStatement.Messaging> messaging = Collections.emptyList();

  /**
   * Required fields for {@link CapabilityStatement}
   *
   * @param date - The date (and optionally time) when the capability statement was published. The
   *     date must change when the business version changes and it must change if the status code
   *     changes. In addition, it should change when the substantive content of the capability
   *     statement changes.
   * @param kind - The way that this statement is intended to be used, to describe an actual running
   *     instance of software, a particular product (kind, not instance of software) or a class of
   *     implementation (e.g. a desired purchase).
   * @param status - The status of this capability statement. Enables tracking the life-cycle of the
   *     content.
   * @param format - A list of the formats supported by this implementation using their content
   *     types.
   * @param fhirVersion - The version of the FHIR specification that this CapabilityStatement
   *     describes (which SHALL be the same as the FHIR version of the CapabilityStatement itself).
   *     There is no default value.
   */
  public CapabilityStatementBuilder(
      FHIRDateTime date,
      CAPABILITY_STATEMENT_KIND kind,
      PUBLICATION_STATUS status,
      Collection<String> format,
      FHIR_VERSION fhirVersion) {
    this.date = date;
    this.kind = kind;
    this.status = status;
    this.format = format;
    this.fhirVersion = fhirVersion;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public CapabilityStatementBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param url - An absolute URI that is used to identify this capability statement when it is
   *     referenced in a specification, model, design or an instance; also called its canonical
   *     identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
   *     which an authoritative instance of this capability statement is (or will be) published.
   *     This URL can be the target of a canonical reference. It SHALL remain the same when the
   *     capability statement is stored on different servers.
   */
  public CapabilityStatementBuilder withUrl(@NonNull String url) {
    this.url = Optional.of(url);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public CapabilityStatementBuilder withMeta(@NonNull Meta meta) {
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
  public CapabilityStatementBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param name - A natural language name identifying the capability statement. This name should be
   *     usable as an identifier for the module by machine processing applications such as code
   *     generation.
   */
  public CapabilityStatementBuilder withName(@NonNull String name) {
    this.name = Optional.of(name);
    return this;
  }
  /** @param title - A short, descriptive, user-friendly title for the capability statement. */
  public CapabilityStatementBuilder withTitle(@NonNull String title) {
    this.title = Optional.of(title);
    return this;
  }
  /**
   * @param version - The identifier that is used to identify this version of the capability
   *     statement when it is referenced in a specification, model, design or instance. This is an
   *     arbitrary value managed by the capability statement author and is not expected to be
   *     globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version
   *     is not available. There is also no expectation that versions can be placed in a
   *     lexicographical sequence.
   */
  public CapabilityStatementBuilder withVersion(@NonNull String version) {
    this.version = Optional.of(version);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public CapabilityStatementBuilder withContact(@NonNull ContactDetail... contact) {
    this.contact = Arrays.asList(contact);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public CapabilityStatementBuilder withContact(@NonNull Collection<ContactDetail> contact) {
    this.contact = Collections.unmodifiableCollection(contact);
    return this;
  }
  /**
   * @param purpose - Explanation of why this capability statement is needed and why it has been
   *     designed as it has.
   */
  public CapabilityStatementBuilder withPurpose(@NonNull String purpose) {
    this.purpose = Optional.of(purpose);
    return this;
  }
  /**
   * @param imports - Reference to a canonical URL of another CapabilityStatement that this software
   *     adds to. The capability statement automatically includes everything in the other statement,
   *     and it is not duplicated, though the server may repeat the same resources, interactions and
   *     operations to add additional details to them.
   */
  public CapabilityStatementBuilder withImports(@NonNull String... imports) {
    this.imports = Arrays.asList(imports);
    return this;
  }
  /**
   * @param imports - Reference to a canonical URL of another CapabilityStatement that this software
   *     adds to. The capability statement automatically includes everything in the other statement,
   *     and it is not duplicated, though the server may repeat the same resources, interactions and
   *     operations to add additional details to them.
   */
  public CapabilityStatementBuilder withImports(@NonNull Collection<String> imports) {
    this.imports = Collections.unmodifiableCollection(imports);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public CapabilityStatementBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public CapabilityStatementBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public CapabilityStatementBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public CapabilityStatementBuilder withExtension(@NonNull Extension... extension) {
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
  public CapabilityStatementBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param publisher - The name of the organization or individual that published the capability
   *     statement.
   */
  public CapabilityStatementBuilder withPublisher(@NonNull String publisher) {
    this.publisher = Optional.of(publisher);
    return this;
  }
  /**
   * @param copyright - A copyright statement relating to the capability statement and/or its
   *     contents. Copyright statements are generally legal restrictions on the use and publishing
   *     of the capability statement.
   */
  public CapabilityStatementBuilder withCopyright(@NonNull String copyright) {
    this.copyright = Optional.of(copyright);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate capability statement instances.
   */
  public CapabilityStatementBuilder withUseContext(@NonNull UsageContext... useContext) {
    this.useContext = Arrays.asList(useContext);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate capability statement instances.
   */
  public CapabilityStatementBuilder withUseContext(@NonNull Collection<UsageContext> useContext) {
    this.useContext = Collections.unmodifiableCollection(useContext);
    return this;
  }
  /**
   * @param description - A free text natural language description of the capability statement from
   *     a consumer's perspective. Typically, this is used when the capability statement describes a
   *     desired rather than an actual solution, for example as a formal expression of requirements
   *     as part of an RFP.
   */
  public CapabilityStatementBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /**
   * @param patchFormat - A list of the patch formats supported by this implementation using their
   *     content types.
   */
  public CapabilityStatementBuilder withPatchFormat(@NonNull String... patchFormat) {
    this.patchFormat = Arrays.asList(patchFormat);
    return this;
  }
  /**
   * @param patchFormat - A list of the patch formats supported by this implementation using their
   *     content types.
   */
  public CapabilityStatementBuilder withPatchFormat(@NonNull Collection<String> patchFormat) {
    this.patchFormat = Collections.unmodifiableCollection(patchFormat);
    return this;
  }
  /**
   * @param experimental - A Boolean value to indicate that this capability statement is authored
   *     for testing purposes (or education/evaluation/marketing) and is not intended to be used for
   *     genuine usage.
   */
  public CapabilityStatementBuilder withExperimental(@NonNull Boolean experimental) {
    this.experimental = Optional.of(experimental);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the capability statement is
   *     intended to be used.
   */
  public CapabilityStatementBuilder withJurisdiction(@NonNull CodeableConcept... jurisdiction) {
    this.jurisdiction = Arrays.asList(jurisdiction);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the capability statement is
   *     intended to be used.
   */
  public CapabilityStatementBuilder withJurisdiction(
      @NonNull Collection<CodeableConcept> jurisdiction) {
    this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
    return this;
  }
  /**
   * @param instantiates - Reference to a canonical URL of another CapabilityStatement that this
   *     software implements. This capability statement is a published API description that
   *     corresponds to a business service. The server may actually implement a subset of the
   *     capability statement it claims to implement, so the capability statement must specify the
   *     full capability details.
   */
  public CapabilityStatementBuilder withInstantiates(@NonNull String... instantiates) {
    this.instantiates = Arrays.asList(instantiates);
    return this;
  }
  /**
   * @param instantiates - Reference to a canonical URL of another CapabilityStatement that this
   *     software implements. This capability statement is a published API description that
   *     corresponds to a business service. The server may actually implement a subset of the
   *     capability statement it claims to implement, so the capability statement must specify the
   *     full capability details.
   */
  public CapabilityStatementBuilder withInstantiates(@NonNull Collection<String> instantiates) {
    this.instantiates = Collections.unmodifiableCollection(instantiates);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public CapabilityStatementBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
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
  public CapabilityStatementBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public CapabilityStatementBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param implementationGuide - A list of implementation guides that the server does (or should)
   *     support in their entirety.
   */
  public CapabilityStatementBuilder withImplementationGuide(
      @NonNull String... implementationGuide) {
    this.implementationGuide = Arrays.asList(implementationGuide);
    return this;
  }
  /**
   * @param implementationGuide - A list of implementation guides that the server does (or should)
   *     support in their entirety.
   */
  public CapabilityStatementBuilder withImplementationGuide(
      @NonNull Collection<String> implementationGuide) {
    this.implementationGuide = Collections.unmodifiableCollection(implementationGuide);
    return this;
  }
  /**
   * @param software - Software that is covered by this capability statement. It is used when the
   *     capability statement describes the capabilities of a particular software version,
   *     independent of an installation.
   */
  public CapabilityStatementBuilder withSoftware(@NonNull CapabilityStatement.Software software) {
    this.software = Optional.of(software);
    return this;
  }
  /** @param document - A document definition. */
  public CapabilityStatementBuilder withDocument(
      @NonNull CapabilityStatement.Document... document) {
    this.document = Arrays.asList(document);
    return this;
  }
  /** @param document - A document definition. */
  public CapabilityStatementBuilder withDocument(
      @NonNull Collection<CapabilityStatement.Document> document) {
    this.document = Collections.unmodifiableCollection(document);
    return this;
  }
  /**
   * @param implementation - Identifies a specific implementation instance that is described by the
   *     capability statement - i.e. a particular installation, rather than the capabilities of a
   *     software program.
   */
  public CapabilityStatementBuilder withImplementation(
      @NonNull CapabilityStatement.Implementation implementation) {
    this.implementation = Optional.of(implementation);
    return this;
  }
  /** @param rest - A definition of the restful capabilities of the solution, if any. */
  public CapabilityStatementBuilder withRest(@NonNull CapabilityStatement.Rest... rest) {
    this.rest = Arrays.asList(rest);
    return this;
  }
  /** @param rest - A definition of the restful capabilities of the solution, if any. */
  public CapabilityStatementBuilder withRest(@NonNull Collection<CapabilityStatement.Rest> rest) {
    this.rest = Collections.unmodifiableCollection(rest);
    return this;
  }
  /** @param messaging - A description of the messaging capabilities of the solution. */
  public CapabilityStatementBuilder withMessaging(
      @NonNull CapabilityStatement.Messaging... messaging) {
    this.messaging = Arrays.asList(messaging);
    return this;
  }
  /** @param messaging - A description of the messaging capabilities of the solution. */
  public CapabilityStatementBuilder withMessaging(
      @NonNull Collection<CapabilityStatement.Messaging> messaging) {
    this.messaging = Collections.unmodifiableCollection(messaging);
    return this;
  }

  public CapabilityStatementBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public CapabilityStatement build() {
    return new CapabilityStatement(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(url),
        (Option) OptionConverters.toScala(meta),
        (Option) OptionConverters.toScala(text),
        (Option) OptionConverters.toScala(name),
        date,
        kind,
        (Option) OptionConverters.toScala(title),
        status,
        format.stream().collect(new NonEmptyLitSeqJCollector<>()),
        (Option) OptionConverters.toScala(version),
        contact.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(purpose),
        imports.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(language),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(publisher),
        (Option) OptionConverters.toScala(copyright),
        useContext.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(description),
        fhirVersion,
        patchFormat.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(experimental.map(x -> (Object) x)),
        jurisdiction.stream().collect(new LitSeqJCollector<>()),
        instantiates.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(implicitRules),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        implementationGuide.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(software),
        document.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(implementation),
        rest.stream().collect(new LitSeqJCollector<>()),
        messaging.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
