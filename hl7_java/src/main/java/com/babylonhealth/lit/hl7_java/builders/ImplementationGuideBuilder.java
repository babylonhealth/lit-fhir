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
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.hl7.SPDX_LICENSE;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.FHIR_VERSION;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ImplementationGuideBuilder {
  private Optional<String> id = Optional.empty();
  private String url;
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private String name;
  private Optional<FHIRDateTime> date = Optional.empty();
  private Optional<String> title = Optional.empty();
  private PUBLICATION_STATUS status;
  private Optional<String> version = Optional.empty();
  private Collection<ContactDetail> contact = Collections.emptyList();
  private Optional<SPDX_LICENSE> license = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> publisher = Optional.empty();
  private Optional<String> copyright = Optional.empty();
  private String packageId;
  private Collection<UsageContext> useContext = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private Collection<FHIR_VERSION> fhirVersion;
  private Optional<Boolean> experimental = Optional.empty();
  private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<ImplementationGuide.Global> global = Collections.emptyList();
  private Collection<ImplementationGuide.DependsOn> dependsOn = Collections.emptyList();
  private Optional<ImplementationGuide.Manifest> manifest = Optional.empty();
  private Optional<ImplementationGuide.Definition> definition = Optional.empty();

  /**
   * Required fields for {@link ImplementationGuide}
   *
   * @param url - An absolute URI that is used to identify this implementation guide when it is
   *     referenced in a specification, model, design or an instance; also called its canonical
   *     identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
   *     which an authoritative instance of this implementation guide is (or will be) published.
   *     This URL can be the target of a canonical reference. It SHALL remain the same when the
   *     implementation guide is stored on different servers.
   * @param name - A natural language name identifying the implementation guide. This name should be
   *     usable as an identifier for the module by machine processing applications such as code
   *     generation.
   * @param status - The status of this implementation guide. Enables tracking the life-cycle of the
   *     content.
   * @param packageId - The NPM package name for this Implementation Guide, used in the NPM package
   *     distribution, which is the primary mechanism by which FHIR based tooling manages IG
   *     dependencies. This value must be globally unique, and should be assigned with care.
   * @param fhirVersion - The version(s) of the FHIR specification that this ImplementationGuide
   *     targets - e.g. describes how to use. The value of this element is the formal version of the
   *     specification, without the revision number, e.g. [publication].[major].[minor], which is
   *     4.0.1. for this version.
   */
  public ImplementationGuideBuilder(
      String url,
      String name,
      PUBLICATION_STATUS status,
      String packageId,
      Collection<FHIR_VERSION> fhirVersion) {
    this.url = url;
    this.name = name;
    this.status = status;
    this.packageId = packageId;
    this.fhirVersion = fhirVersion;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ImplementationGuideBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public ImplementationGuideBuilder withMeta(@NonNull Meta meta) {
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
  public ImplementationGuideBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param date - The date (and optionally time) when the implementation guide was published. The
   *     date must change when the business version changes and it must change if the status code
   *     changes. In addition, it should change when the substantive content of the implementation
   *     guide changes.
   */
  public ImplementationGuideBuilder withDate(@NonNull FHIRDateTime date) {
    this.date = Optional.of(date);
    return this;
  }
  /** @param title - A short, descriptive, user-friendly title for the implementation guide. */
  public ImplementationGuideBuilder withTitle(@NonNull String title) {
    this.title = Optional.of(title);
    return this;
  }
  /**
   * @param version - The identifier that is used to identify this version of the implementation
   *     guide when it is referenced in a specification, model, design or instance. This is an
   *     arbitrary value managed by the implementation guide author and is not expected to be
   *     globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version
   *     is not available. There is also no expectation that versions can be placed in a
   *     lexicographical sequence.
   */
  public ImplementationGuideBuilder withVersion(@NonNull String version) {
    this.version = Optional.of(version);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public ImplementationGuideBuilder withContact(@NonNull ContactDetail... contact) {
    this.contact = Arrays.asList(contact);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public ImplementationGuideBuilder withContact(@NonNull Collection<ContactDetail> contact) {
    this.contact = Collections.unmodifiableCollection(contact);
    return this;
  }
  /**
   * @param license - The license that applies to this Implementation Guide, using an SPDX license
   *     code, or 'not-open-source'.
   */
  public ImplementationGuideBuilder withLicense(@NonNull SPDX_LICENSE license) {
    this.license = Optional.of(license);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public ImplementationGuideBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ImplementationGuideBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ImplementationGuideBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public ImplementationGuideBuilder withExtension(@NonNull Extension... extension) {
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
  public ImplementationGuideBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param publisher - The name of the organization or individual that published the implementation
   *     guide.
   */
  public ImplementationGuideBuilder withPublisher(@NonNull String publisher) {
    this.publisher = Optional.of(publisher);
    return this;
  }
  /**
   * @param copyright - A copyright statement relating to the implementation guide and/or its
   *     contents. Copyright statements are generally legal restrictions on the use and publishing
   *     of the implementation guide.
   */
  public ImplementationGuideBuilder withCopyright(@NonNull String copyright) {
    this.copyright = Optional.of(copyright);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate implementation guide instances.
   */
  public ImplementationGuideBuilder withUseContext(@NonNull UsageContext... useContext) {
    this.useContext = Arrays.asList(useContext);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate implementation guide instances.
   */
  public ImplementationGuideBuilder withUseContext(@NonNull Collection<UsageContext> useContext) {
    this.useContext = Collections.unmodifiableCollection(useContext);
    return this;
  }
  /**
   * @param description - A free text natural language description of the implementation guide from
   *     a consumer's perspective.
   */
  public ImplementationGuideBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /**
   * @param experimental - A Boolean value to indicate that this implementation guide is authored
   *     for testing purposes (or education/evaluation/marketing) and is not intended to be used for
   *     genuine usage.
   */
  public ImplementationGuideBuilder withExperimental(@NonNull Boolean experimental) {
    this.experimental = Optional.of(experimental);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the implementation guide is
   *     intended to be used.
   */
  public ImplementationGuideBuilder withJurisdiction(@NonNull CodeableConcept... jurisdiction) {
    this.jurisdiction = Arrays.asList(jurisdiction);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the implementation guide is
   *     intended to be used.
   */
  public ImplementationGuideBuilder withJurisdiction(
      @NonNull Collection<CodeableConcept> jurisdiction) {
    this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public ImplementationGuideBuilder withImplicitRules(@NonNull String implicitRules) {
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
  public ImplementationGuideBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public ImplementationGuideBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param global - A set of profiles that all resources covered by this implementation guide must
   *     conform to.
   */
  public ImplementationGuideBuilder withGlobal(@NonNull ImplementationGuide.Global... global) {
    this.global = Arrays.asList(global);
    return this;
  }
  /**
   * @param global - A set of profiles that all resources covered by this implementation guide must
   *     conform to.
   */
  public ImplementationGuideBuilder withGlobal(
      @NonNull Collection<ImplementationGuide.Global> global) {
    this.global = Collections.unmodifiableCollection(global);
    return this;
  }
  /**
   * @param dependsOn - Another implementation guide that this implementation depends on. Typically,
   *     an implementation guide uses value sets, profiles etc.defined in other implementation
   *     guides.
   */
  public ImplementationGuideBuilder withDependsOn(
      @NonNull ImplementationGuide.DependsOn... dependsOn) {
    this.dependsOn = Arrays.asList(dependsOn);
    return this;
  }
  /**
   * @param dependsOn - Another implementation guide that this implementation depends on. Typically,
   *     an implementation guide uses value sets, profiles etc.defined in other implementation
   *     guides.
   */
  public ImplementationGuideBuilder withDependsOn(
      @NonNull Collection<ImplementationGuide.DependsOn> dependsOn) {
    this.dependsOn = Collections.unmodifiableCollection(dependsOn);
    return this;
  }
  /**
   * @param manifest - Information about an assembled implementation guide, created by the
   *     publication tooling.
   */
  public ImplementationGuideBuilder withManifest(@NonNull ImplementationGuide.Manifest manifest) {
    this.manifest = Optional.of(manifest);
    return this;
  }
  /**
   * @param definition - The information needed by an IG publisher tool to publish the whole
   *     implementation guide.
   */
  public ImplementationGuideBuilder withDefinition(
      @NonNull ImplementationGuide.Definition definition) {
    this.definition = Optional.of(definition);
    return this;
  }

  public ImplementationGuideBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public ImplementationGuide build() {
    return new ImplementationGuide(
        OptionConverters.toScala(id),
        url,
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        name,
        OptionConverters.toScala(date),
        OptionConverters.toScala(title),
        status,
        OptionConverters.toScala(version),
        contact.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(license),
        OptionConverters.toScala(language),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(publisher),
        OptionConverters.toScala(copyright),
        packageId,
        useContext.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(description),
        fhirVersion.stream().collect(new NonEmptyLitSeqJCollector<>()),
        OptionConverters.toScala(experimental.map(x -> (Object) x)),
        jurisdiction.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        global.stream().collect(new LitSeqJCollector<>()),
        dependsOn.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(manifest),
        OptionConverters.toScala(definition),
        LitUtils.emptyMetaElMap());
  }
}
