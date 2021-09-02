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
import com.babylonhealth.lit.hl7.CODESYSTEM_CONTENT_MODE;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.CODESYSTEM_HIERARCHY_MEANING;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ShareablecodesystemBuilder {
  private Optional<String> id = Optional.empty();
  private String url;
  private Optional<Meta> meta =
      Optional.of(
          new MetaBuilder()
              .withProfile("http://hl7.org/fhir/StructureDefinition/shareablecodesystem")
              .build());
  private Optional<Narrative> text = Optional.empty();
  private String name;
  private Optional<FHIRDateTime> date = Optional.empty();
  private Optional<String> title = Optional.empty();
  private Optional<Integer> count = Optional.empty();
  private PUBLICATION_STATUS status;
  private String version;
  private Collection<ContactDetail> contact = Collections.emptyList();
  private Optional<String> purpose = Optional.empty();
  private CODESYSTEM_CONTENT_MODE content;
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<String> valueSet = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private String publisher;
  private Optional<String> copyright = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Collection<UsageContext> useContext = Collections.emptyList();
  private String description;
  private Optional<String> supplements = Optional.empty();
  private Boolean experimental;
  private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<Boolean> caseSensitive = Optional.empty();
  private Optional<Boolean> compositional = Optional.empty();
  private Optional<Boolean> versionNeeded = Optional.empty();
  private Optional<CODESYSTEM_HIERARCHY_MEANING> hierarchyMeaning = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<CodeSystem.Filter> filter = Collections.emptyList();
  private Collection<CodeSystem.Property> property = Collections.emptyList();
  private Collection<CodeSystem.Concept> concept;

  /**
   * Required fields for {@link Shareablecodesystem}
   *
   * @param url - An absolute URI that is used to identify this code system when it is referenced in
   *     a specification, model, design or an instance; also called its canonical identifier. This
   *     SHOULD be globally unique and SHOULD be a literal address at which at which an
   *     authoritative instance of this code system is (or will be) published. This URL can be the
   *     target of a canonical reference. It SHALL remain the same when the code system is stored on
   *     different servers. This is used in
   *     [Coding](http://hl7.org/fhir/datatypes.html#Coding).system.
   * @param name - A natural language name identifying the code system. This name should be usable
   *     as an identifier for the module by machine processing applications such as code generation.
   * @param status - The date (and optionally time) when the code system resource was created or
   *     revised.
   * @param version - The identifier that is used to identify this version of the code system when
   *     it is referenced in a specification, model, design or instance. This is an arbitrary value
   *     managed by the code system author and is not expected to be globally unique. For example,
   *     it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is
   *     also no expectation that versions can be placed in a lexicographical sequence. This is used
   *     in [Coding](http://hl7.org/fhir/datatypes.html#Coding).version.
   * @param content - The extent of the content of the code system (the concepts and codes it
   *     defines) are represented in this resource instance.
   * @param publisher - The name of the organization or individual that published the code system.
   * @param description - A free text natural language description of the code system from a
   *     consumer's perspective.
   * @param experimental - A Boolean value to indicate that this code system is authored for testing
   *     purposes (or education/evaluation/marketing) and is not intended to be used for genuine
   *     usage.
   * @param concept - Concepts that are in the code system. The concept definitions are inherently
   *     hierarchical, but the definitions must be consulted to determine what the meanings of the
   *     hierarchical relationships are.
   */
  public ShareablecodesystemBuilder(
      String url,
      String name,
      PUBLICATION_STATUS status,
      String version,
      CODESYSTEM_CONTENT_MODE content,
      String publisher,
      String description,
      Boolean experimental,
      Collection<CodeSystem.Concept> concept) {
    this.url = url;
    this.name = name;
    this.status = status;
    this.version = version;
    this.content = content;
    this.publisher = publisher;
    this.description = description;
    this.experimental = experimental;
    this.concept = concept;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ShareablecodesystemBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public ShareablecodesystemBuilder withMeta(@NonNull Meta meta) {
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
  public ShareablecodesystemBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param date - The date (and optionally time) when the code system was published. The date must
   *     change when the business version changes and it must change if the status code changes. In
   *     addition, it should change when the substantive content of the code system changes.
   */
  public ShareablecodesystemBuilder withDate(@NonNull FHIRDateTime date) {
    this.date = Optional.of(date);
    return this;
  }
  /** @param title - A short, descriptive, user-friendly title for the code system. */
  public ShareablecodesystemBuilder withTitle(@NonNull String title) {
    this.title = Optional.of(title);
    return this;
  }
  /**
   * @param count - The total number of concepts defined by the code system. Where the code system
   *     has a compositional grammar, the basis of this count is defined by the system steward.
   */
  public ShareablecodesystemBuilder withCount(@NonNull Integer count) {
    this.count = Optional.of(count);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public ShareablecodesystemBuilder withContact(@NonNull ContactDetail... contact) {
    this.contact = Arrays.asList(contact);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public ShareablecodesystemBuilder withContact(@NonNull Collection<ContactDetail> contact) {
    this.contact = Collections.unmodifiableCollection(contact);
    return this;
  }
  /**
   * @param purpose - Explanation of why this code system is needed and why it has been designed as
   *     it has.
   */
  public ShareablecodesystemBuilder withPurpose(@NonNull String purpose) {
    this.purpose = Optional.of(purpose);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public ShareablecodesystemBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param valueSet - Canonical reference to the value set that contains the entire code system.
   */
  public ShareablecodesystemBuilder withValueSet(@NonNull String valueSet) {
    this.valueSet = Optional.of(valueSet);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ShareablecodesystemBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ShareablecodesystemBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public ShareablecodesystemBuilder withExtension(@NonNull Extension... extension) {
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
  public ShareablecodesystemBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param copyright - A copyright statement relating to the code system and/or its contents.
   *     Copyright statements are generally legal restrictions on the use and publishing of the code
   *     system.
   */
  public ShareablecodesystemBuilder withCopyright(@NonNull String copyright) {
    this.copyright = Optional.of(copyright);
    return this;
  }
  /**
   * @param identifier - A formal identifier that is used to identify this code system when it is
   *     represented in other formats, or referenced in a specification, model, design or an
   *     instance.
   */
  public ShareablecodesystemBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - A formal identifier that is used to identify this code system when it is
   *     represented in other formats, or referenced in a specification, model, design or an
   *     instance.
   */
  public ShareablecodesystemBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate code system instances.
   */
  public ShareablecodesystemBuilder withUseContext(@NonNull UsageContext... useContext) {
    this.useContext = Arrays.asList(useContext);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate code system instances.
   */
  public ShareablecodesystemBuilder withUseContext(@NonNull Collection<UsageContext> useContext) {
    this.useContext = Collections.unmodifiableCollection(useContext);
    return this;
  }
  /**
   * @param supplements - The canonical URL of the code system that this code system supplement is
   *     adding designations and properties to.
   */
  public ShareablecodesystemBuilder withSupplements(@NonNull String supplements) {
    this.supplements = Optional.of(supplements);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the code system is intended to be
   *     used.
   */
  public ShareablecodesystemBuilder withJurisdiction(@NonNull CodeableConcept... jurisdiction) {
    this.jurisdiction = Arrays.asList(jurisdiction);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the code system is intended to be
   *     used.
   */
  public ShareablecodesystemBuilder withJurisdiction(
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
  public ShareablecodesystemBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param caseSensitive - If code comparison is case sensitive when codes within this system are
   *     compared to each other.
   */
  public ShareablecodesystemBuilder withCaseSensitive(@NonNull Boolean caseSensitive) {
    this.caseSensitive = Optional.of(caseSensitive);
    return this;
  }
  /** @param compositional - The code system defines a compositional (post-coordination) grammar. */
  public ShareablecodesystemBuilder withCompositional(@NonNull Boolean compositional) {
    this.compositional = Optional.of(compositional);
    return this;
  }
  /**
   * @param versionNeeded - This flag is used to signify that the code system does not commit to
   *     concept permanence across versions. If true, a version must be specified when referencing
   *     this code system.
   */
  public ShareablecodesystemBuilder withVersionNeeded(@NonNull Boolean versionNeeded) {
    this.versionNeeded = Optional.of(versionNeeded);
    return this;
  }
  /**
   * @param hierarchyMeaning - The meaning of the hierarchy of concepts as represented in this
   *     resource.
   */
  public ShareablecodesystemBuilder withHierarchyMeaning(
      @NonNull CODESYSTEM_HIERARCHY_MEANING hierarchyMeaning) {
    this.hierarchyMeaning = Optional.of(hierarchyMeaning);
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
  public ShareablecodesystemBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public ShareablecodesystemBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param filter - A filter that can be used in a value set compose statement when selecting
   *     concepts using a filter.
   */
  public ShareablecodesystemBuilder withFilter(@NonNull CodeSystem.Filter... filter) {
    this.filter = Arrays.asList(filter);
    return this;
  }
  /**
   * @param filter - A filter that can be used in a value set compose statement when selecting
   *     concepts using a filter.
   */
  public ShareablecodesystemBuilder withFilter(@NonNull Collection<CodeSystem.Filter> filter) {
    this.filter = Collections.unmodifiableCollection(filter);
    return this;
  }
  /**
   * @param property - A property defines an additional slot through which additional information
   *     can be provided about a concept.
   */
  public ShareablecodesystemBuilder withProperty(@NonNull CodeSystem.Property... property) {
    this.property = Arrays.asList(property);
    return this;
  }
  /**
   * @param property - A property defines an additional slot through which additional information
   *     can be provided about a concept.
   */
  public ShareablecodesystemBuilder withProperty(
      @NonNull Collection<CodeSystem.Property> property) {
    this.property = Collections.unmodifiableCollection(property);
    return this;
  }

  public ShareablecodesystemBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Shareablecodesystem build() {
    return new Shareablecodesystem(
        (Option) OptionConverters.toScala(id),
        url,
        (Option) OptionConverters.toScala(meta),
        (Option) OptionConverters.toScala(text),
        name,
        (Option) OptionConverters.toScala(date),
        (Option) OptionConverters.toScala(title),
        (Option) OptionConverters.toScala(count.map(x -> (Object) x)),
        status,
        version,
        contact.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(purpose),
        content,
        (Option) OptionConverters.toScala(language),
        (Option) OptionConverters.toScala(valueSet),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        publisher,
        (Option) OptionConverters.toScala(copyright),
        identifier.stream().collect(new LitSeqJCollector<>()),
        useContext.stream().collect(new LitSeqJCollector<>()),
        description,
        (Option) OptionConverters.toScala(supplements),
        experimental,
        jurisdiction.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(implicitRules),
        (Option) OptionConverters.toScala(caseSensitive.map(x -> (Object) x)),
        (Option) OptionConverters.toScala(compositional.map(x -> (Object) x)),
        (Option) OptionConverters.toScala(versionNeeded.map(x -> (Object) x)),
        (Option) OptionConverters.toScala(hierarchyMeaning),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        filter.stream().collect(new LitSeqJCollector<>()),
        property.stream().collect(new LitSeqJCollector<>()),
        concept.stream().collect(new NonEmptyLitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
