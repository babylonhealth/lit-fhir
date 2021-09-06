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
import com.babylonhealth.lit.hl7.CODE_SEARCH_SUPPORT;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface TerminologyCapabilitiesBuilder extends DomainResourceBuilder {
  public TerminologyCapabilities build();

  public static Impl init(
      FHIRDateTime date, CAPABILITY_STATEMENT_KIND kind, PUBLICATION_STATUS status) {
    return new Impl(date, kind, status);
  }

  public static Impl builder(
      FHIRDateTime date, CAPABILITY_STATEMENT_KIND kind, PUBLICATION_STATUS status) {
    return new Impl(date, kind, status);
  }

  public class Impl implements TerminologyCapabilitiesBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> name = Optional.empty();
    private FHIRDateTime date;
    private CAPABILITY_STATEMENT_KIND kind;
    private Optional<String> title = Optional.empty();
    private PUBLICATION_STATUS status;
    private Optional<String> version = Optional.empty();
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Optional<String> purpose = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> publisher = Optional.empty();
    private Optional<String> copyright = Optional.empty();
    private Collection<UsageContext> useContext = Collections.emptyList();
    private Optional<Boolean> lockedDate = Optional.empty();
    private Optional<CODE_SEARCH_SUPPORT> codeSearch = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<Boolean> experimental = Optional.empty();
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<TerminologyCapabilities.Closure> closure = Optional.empty();
    private Optional<TerminologyCapabilities.Software> software = Optional.empty();
    private Optional<TerminologyCapabilities.Translation> translation = Optional.empty();
    private Optional<TerminologyCapabilities.ValidateCode> validateCode = Optional.empty();
    private Optional<TerminologyCapabilities.Implementation> implementation = Optional.empty();
    private Optional<TerminologyCapabilities.Expansion> expansion = Optional.empty();
    private Collection<TerminologyCapabilities.CodeSystem> codeSystem = Collections.emptyList();

    /**
     * Required fields for {@link TerminologyCapabilities}
     *
     * @param date - The date (and optionally time) when the terminology capabilities was published.
     *     The date must change when the business version changes and it must change if the status
     *     code changes. In addition, it should change when the substantive content of the
     *     terminology capabilities changes.
     * @param kind - The way that this statement is intended to be used, to describe an actual
     *     running instance of software, a particular product (kind, not instance of software) or a
     *     class of implementation (e.g. a desired purchase).
     * @param status - The status of this terminology capabilities. Enables tracking the life-cycle
     *     of the content.
     */
    public Impl(FHIRDateTime date, CAPABILITY_STATEMENT_KIND kind, PUBLICATION_STATUS status) {
      this.date = date;
      this.kind = kind;
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public TerminologyCapabilitiesBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - An absolute URI that is used to identify this terminology capabilities when it
     *     is referenced in a specification, model, design or an instance; also called its canonical
     *     identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
     *     which an authoritative instance of this terminology capabilities is (or will be)
     *     published. This URL can be the target of a canonical reference. It SHALL remain the same
     *     when the terminology capabilities is stored on different servers.
     */
    public TerminologyCapabilitiesBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public TerminologyCapabilitiesBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public TerminologyCapabilitiesBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param name - A natural language name identifying the terminology capabilities. This name
     *     should be usable as an identifier for the module by machine processing applications such
     *     as code generation.
     */
    public TerminologyCapabilitiesBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param title - A short, descriptive, user-friendly title for the terminology capabilities.
     */
    public TerminologyCapabilitiesBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the terminology
     *     capabilities when it is referenced in a specification, model, design or instance. This is
     *     an arbitrary value managed by the terminology capabilities author and is not expected to
     *     be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed
     *     version is not available. There is also no expectation that versions can be placed in a
     *     lexicographical sequence.
     */
    public TerminologyCapabilitiesBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public TerminologyCapabilitiesBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public TerminologyCapabilitiesBuilder.Impl withContact(
        @NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withContact(
        @NonNull ContactDetailBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param purpose - Explanation of why this terminology capabilities is needed and why it has
     *     been designed as it has.
     */
    public TerminologyCapabilitiesBuilder.Impl withPurpose(@NonNull String purpose) {
      this.purpose = Optional.of(purpose);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public TerminologyCapabilitiesBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public TerminologyCapabilitiesBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public TerminologyCapabilitiesBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withContained(
        @NonNull ResourceBuilder... contained) {
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
    public TerminologyCapabilitiesBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public TerminologyCapabilitiesBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param publisher - The name of the organization or individual that published the terminology
     *     capabilities.
     */
    public TerminologyCapabilitiesBuilder.Impl withPublisher(@NonNull String publisher) {
      this.publisher = Optional.of(publisher);
      return this;
    }
    /**
     * @param copyright - A copyright statement relating to the terminology capabilities and/or its
     *     contents. Copyright statements are generally legal restrictions on the use and publishing
     *     of the terminology capabilities.
     */
    public TerminologyCapabilitiesBuilder.Impl withCopyright(@NonNull String copyright) {
      this.copyright = Optional.of(copyright);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate terminology capabilities instances.
     */
    public TerminologyCapabilitiesBuilder.Impl withUseContext(@NonNull UsageContext... useContext) {
      this.useContext = Arrays.asList(useContext);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate terminology capabilities instances.
     */
    public TerminologyCapabilitiesBuilder.Impl withUseContext(
        @NonNull Collection<UsageContext> useContext) {
      this.useContext = Collections.unmodifiableCollection(useContext);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withUseContext(
        @NonNull UsageContextBuilder... useContext) {
      this.useContext = Arrays.stream(useContext).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param lockedDate - Whether the server supports lockedDate. */
    public TerminologyCapabilitiesBuilder.Impl withLockedDate(@NonNull Boolean lockedDate) {
      this.lockedDate = Optional.of(lockedDate);
      return this;
    }
    /**
     * @param codeSearch - The degree to which the server supports the code search parameter on
     *     ValueSet, if it is supported.
     */
    public TerminologyCapabilitiesBuilder.Impl withCodeSearch(
        @NonNull CODE_SEARCH_SUPPORT codeSearch) {
      this.codeSearch = Optional.of(codeSearch);
      return this;
    }
    /**
     * @param description - A free text natural language description of the terminology capabilities
     *     from a consumer's perspective. Typically, this is used when the capability statement
     *     describes a desired rather than an actual solution, for example as a formal expression of
     *     requirements as part of an RFP.
     */
    public TerminologyCapabilitiesBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param experimental - A Boolean value to indicate that this terminology capabilities is
     *     authored for testing purposes (or education/evaluation/marketing) and is not intended to
     *     be used for genuine usage.
     */
    public TerminologyCapabilitiesBuilder.Impl withExperimental(@NonNull Boolean experimental) {
      this.experimental = Optional.of(experimental);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the terminology capabilities is
     *     intended to be used.
     */
    public TerminologyCapabilitiesBuilder.Impl withJurisdiction(
        @NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the terminology capabilities is
     *     intended to be used.
     */
    public TerminologyCapabilitiesBuilder.Impl withJurisdiction(
        @NonNull Collection<CodeableConcept> jurisdiction) {
      this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withJurisdiction(
        @NonNull CodeableConceptBuilder... jurisdiction) {
      this.jurisdiction = Arrays.stream(jurisdiction).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public TerminologyCapabilitiesBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
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
    public TerminologyCapabilitiesBuilder.Impl withModifierExtension(
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
    public TerminologyCapabilitiesBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param closure - Whether the $closure operation is supported. */
    public TerminologyCapabilitiesBuilder.Impl withClosure(
        @NonNull TerminologyCapabilities.Closure closure) {
      this.closure = Optional.of(closure);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withClosure(
        @NonNull TerminologyCapabilities_ClosureBuilder closure) {
      this.closure = Optional.of(closure.build());
      return this;
    }
    /**
     * @param software - Software that is covered by this terminology capability statement. It is
     *     used when the statement describes the capabilities of a particular software version,
     *     independent of an installation.
     */
    public TerminologyCapabilitiesBuilder.Impl withSoftware(
        @NonNull TerminologyCapabilities.Software software) {
      this.software = Optional.of(software);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withSoftware(
        @NonNull TerminologyCapabilities_SoftwareBuilder software) {
      this.software = Optional.of(software.build());
      return this;
    }
    /**
     * @param translation - Information about the
     *     [ConceptMap/$translate](conceptmap-operation-translate.html) operation.
     */
    public TerminologyCapabilitiesBuilder.Impl withTranslation(
        @NonNull TerminologyCapabilities.Translation translation) {
      this.translation = Optional.of(translation);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withTranslation(
        @NonNull TerminologyCapabilities_TranslationBuilder translation) {
      this.translation = Optional.of(translation.build());
      return this;
    }
    /**
     * @param validateCode - Information about the
     *     [ValueSet/$validate-code](valueset-operation-validate-code.html) operation.
     */
    public TerminologyCapabilitiesBuilder.Impl withValidateCode(
        @NonNull TerminologyCapabilities.ValidateCode validateCode) {
      this.validateCode = Optional.of(validateCode);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withValidateCode(
        @NonNull TerminologyCapabilities_ValidateCodeBuilder validateCode) {
      this.validateCode = Optional.of(validateCode.build());
      return this;
    }
    /**
     * @param implementation - Identifies a specific implementation instance that is described by
     *     the terminology capability statement - i.e. a particular installation, rather than the
     *     capabilities of a software program.
     */
    public TerminologyCapabilitiesBuilder.Impl withImplementation(
        @NonNull TerminologyCapabilities.Implementation implementation) {
      this.implementation = Optional.of(implementation);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withImplementation(
        @NonNull TerminologyCapabilities_ImplementationBuilder implementation) {
      this.implementation = Optional.of(implementation.build());
      return this;
    }
    /**
     * @param expansion - Information about the [ValueSet/$expand](valueset-operation-expand.html)
     *     operation.
     */
    public TerminologyCapabilitiesBuilder.Impl withExpansion(
        @NonNull TerminologyCapabilities.Expansion expansion) {
      this.expansion = Optional.of(expansion);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withExpansion(
        @NonNull TerminologyCapabilities_ExpansionBuilder expansion) {
      this.expansion = Optional.of(expansion.build());
      return this;
    }
    /**
     * @param codeSystem - Identifies a code system that is supported by the server. If there is a
     *     no code system URL, then this declares the general assumptions a client can make about
     *     support for any CodeSystem resource.
     */
    public TerminologyCapabilitiesBuilder.Impl withCodeSystem(
        @NonNull TerminologyCapabilities.CodeSystem... codeSystem) {
      this.codeSystem = Arrays.asList(codeSystem);
      return this;
    }
    /**
     * @param codeSystem - Identifies a code system that is supported by the server. If there is a
     *     no code system URL, then this declares the general assumptions a client can make about
     *     support for any CodeSystem resource.
     */
    public TerminologyCapabilitiesBuilder.Impl withCodeSystem(
        @NonNull Collection<TerminologyCapabilities.CodeSystem> codeSystem) {
      this.codeSystem = Collections.unmodifiableCollection(codeSystem);
      return this;
    }

    public TerminologyCapabilitiesBuilder.Impl withCodeSystem(
        @NonNull TerminologyCapabilities_CodeSystemBuilder... codeSystem) {
      this.codeSystem = Arrays.stream(codeSystem).map(e -> e.build()).collect(toList());
      return this;
    }

    public TerminologyCapabilitiesBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public TerminologyCapabilities build() {
      return new TerminologyCapabilities(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(name),
          date,
          kind,
          OptionConverters.toScala(title),
          status,
          OptionConverters.toScala(version),
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(purpose),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(publisher),
          OptionConverters.toScala(copyright),
          useContext.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(lockedDate.map(x -> (Object) x)),
          OptionConverters.toScala(codeSearch),
          OptionConverters.toScala(description),
          OptionConverters.toScala(experimental.map(x -> (Object) x)),
          jurisdiction.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(closure),
          OptionConverters.toScala(software),
          OptionConverters.toScala(translation),
          OptionConverters.toScala(validateCode),
          OptionConverters.toScala(implementation),
          OptionConverters.toScala(expansion),
          codeSystem.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
