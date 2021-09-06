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
import com.babylonhealth.lit.hl7.OPERATION_KIND;
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.RESOURCE_TYPES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class OperationDefinitionBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> url = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private String name;
  private OPERATION_KIND kind;
  private Optional<FHIRDateTime> date = Optional.empty();
  private String code;
  private Optional<String> base = Optional.empty();
  private Boolean _type;
  private Optional<String> title = Optional.empty();
  private PUBLICATION_STATUS status;
  private Boolean system;
  private Optional<String> version = Optional.empty();
  private Collection<ContactDetail> contact = Collections.emptyList();
  private Optional<String> purpose = Optional.empty();
  private Optional<String> comment = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<RESOURCE_TYPES> resource = Collections.emptyList();
  private Boolean instance;
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> publisher = Optional.empty();
  private Collection<UsageContext> useContext = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private Optional<Boolean> experimental = Optional.empty();
  private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
  private Optional<Boolean> affectsState = Optional.empty();
  private Optional<String> inputProfile = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<String> outputProfile = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<OperationDefinition.Overload> overload = Collections.emptyList();
  private Collection<OperationDefinition.Parameter> parameter = Collections.emptyList();

  /**
   * Required fields for {@link OperationDefinition}
   *
   * @param name - A natural language name identifying the operation definition. This name should be
   *     usable as an identifier for the module by machine processing applications such as code
   *     generation.
   * @param kind - Whether this is an operation or a named query.
   * @param code - The name used to invoke the operation.
   * @param _type - Indicates whether this operation or named query can be invoked at the resource
   *     type level for any given resource type level (e.g. without needing to choose a specific
   *     resource id for the context).
   * @param status - The status of this operation definition. Enables tracking the life-cycle of the
   *     content.
   * @param system - Indicates whether this operation or named query can be invoked at the system
   *     level (e.g. without needing to choose a resource type for the context).
   * @param instance - Indicates whether this operation can be invoked on a particular instance of
   *     one of the given types.
   */
  public OperationDefinitionBuilder(
      String name,
      OPERATION_KIND kind,
      String code,
      Boolean _type,
      PUBLICATION_STATUS status,
      Boolean system,
      Boolean instance) {
    this.name = name;
    this.kind = kind;
    this.code = code;
    this._type = _type;
    this.status = status;
    this.system = system;
    this.instance = instance;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public OperationDefinitionBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param url - An absolute URI that is used to identify this operation definition when it is
   *     referenced in a specification, model, design or an instance; also called its canonical
   *     identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
   *     which an authoritative instance of this operation definition is (or will be) published.
   *     This URL can be the target of a canonical reference. It SHALL remain the same when the
   *     operation definition is stored on different servers.
   */
  public OperationDefinitionBuilder withUrl(@NonNull String url) {
    this.url = Optional.of(url);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public OperationDefinitionBuilder withMeta(@NonNull Meta meta) {
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
  public OperationDefinitionBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param date - The date (and optionally time) when the operation definition was published. The
   *     date must change when the business version changes and it must change if the status code
   *     changes. In addition, it should change when the substantive content of the operation
   *     definition changes.
   */
  public OperationDefinitionBuilder withDate(@NonNull FHIRDateTime date) {
    this.date = Optional.of(date);
    return this;
  }
  /**
   * @param base - Indicates that this operation definition is a constraining profile on the base.
   */
  public OperationDefinitionBuilder withBase(@NonNull String base) {
    this.base = Optional.of(base);
    return this;
  }
  /** @param title - A short, descriptive, user-friendly title for the operation definition. */
  public OperationDefinitionBuilder withTitle(@NonNull String title) {
    this.title = Optional.of(title);
    return this;
  }
  /**
   * @param version - The identifier that is used to identify this version of the operation
   *     definition when it is referenced in a specification, model, design or instance. This is an
   *     arbitrary value managed by the operation definition author and is not expected to be
   *     globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version
   *     is not available. There is also no expectation that versions can be placed in a
   *     lexicographical sequence.
   */
  public OperationDefinitionBuilder withVersion(@NonNull String version) {
    this.version = Optional.of(version);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public OperationDefinitionBuilder withContact(@NonNull ContactDetail... contact) {
    this.contact = Arrays.asList(contact);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public OperationDefinitionBuilder withContact(@NonNull Collection<ContactDetail> contact) {
    this.contact = Collections.unmodifiableCollection(contact);
    return this;
  }
  /**
   * @param purpose - Explanation of why this operation definition is needed and why it has been
   *     designed as it has.
   */
  public OperationDefinitionBuilder withPurpose(@NonNull String purpose) {
    this.purpose = Optional.of(purpose);
    return this;
  }
  /** @param comment - Additional information about how to use this operation or named query. */
  public OperationDefinitionBuilder withComment(@NonNull String comment) {
    this.comment = Optional.of(comment);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public OperationDefinitionBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /** @param resource - The types on which this operation can be executed. */
  public OperationDefinitionBuilder withResource(@NonNull RESOURCE_TYPES... resource) {
    this.resource = Arrays.asList(resource);
    return this;
  }
  /** @param resource - The types on which this operation can be executed. */
  public OperationDefinitionBuilder withResource(@NonNull Collection<RESOURCE_TYPES> resource) {
    this.resource = Collections.unmodifiableCollection(resource);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public OperationDefinitionBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public OperationDefinitionBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public OperationDefinitionBuilder withExtension(@NonNull Extension... extension) {
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
  public OperationDefinitionBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param publisher - The name of the organization or individual that published the operation
   *     definition.
   */
  public OperationDefinitionBuilder withPublisher(@NonNull String publisher) {
    this.publisher = Optional.of(publisher);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate operation definition instances.
   */
  public OperationDefinitionBuilder withUseContext(@NonNull UsageContext... useContext) {
    this.useContext = Arrays.asList(useContext);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate operation definition instances.
   */
  public OperationDefinitionBuilder withUseContext(@NonNull Collection<UsageContext> useContext) {
    this.useContext = Collections.unmodifiableCollection(useContext);
    return this;
  }
  /**
   * @param description - A free text natural language description of the operation definition from
   *     a consumer's perspective.
   */
  public OperationDefinitionBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /**
   * @param experimental - A Boolean value to indicate that this operation definition is authored
   *     for testing purposes (or education/evaluation/marketing) and is not intended to be used for
   *     genuine usage.
   */
  public OperationDefinitionBuilder withExperimental(@NonNull Boolean experimental) {
    this.experimental = Optional.of(experimental);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the operation definition is
   *     intended to be used.
   */
  public OperationDefinitionBuilder withJurisdiction(@NonNull CodeableConcept... jurisdiction) {
    this.jurisdiction = Arrays.asList(jurisdiction);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the operation definition is
   *     intended to be used.
   */
  public OperationDefinitionBuilder withJurisdiction(
      @NonNull Collection<CodeableConcept> jurisdiction) {
    this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
    return this;
  }
  /**
   * @param affectsState - Whether the operation affects state. Side effects such as producing audit
   *     trail entries do not count as 'affecting state'.
   */
  public OperationDefinitionBuilder withAffectsState(@NonNull Boolean affectsState) {
    this.affectsState = Optional.of(affectsState);
    return this;
  }
  /**
   * @param inputProfile - Additional validation information for the in parameters - a single
   *     profile that covers all the parameters. The profile is a constraint on the parameters
   *     resource as a whole.
   */
  public OperationDefinitionBuilder withInputProfile(@NonNull String inputProfile) {
    this.inputProfile = Optional.of(inputProfile);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public OperationDefinitionBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param outputProfile - Additional validation information for the out parameters - a single
   *     profile that covers all the parameters. The profile is a constraint on the parameters
   *     resource.
   */
  public OperationDefinitionBuilder withOutputProfile(@NonNull String outputProfile) {
    this.outputProfile = Optional.of(outputProfile);
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
  public OperationDefinitionBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public OperationDefinitionBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param overload - Defines an appropriate combination of parameters to use when invoking this
   *     operation, to help code generators when generating overloaded parameter sets for this
   *     operation.
   */
  public OperationDefinitionBuilder withOverload(
      @NonNull OperationDefinition.Overload... overload) {
    this.overload = Arrays.asList(overload);
    return this;
  }
  /**
   * @param overload - Defines an appropriate combination of parameters to use when invoking this
   *     operation, to help code generators when generating overloaded parameter sets for this
   *     operation.
   */
  public OperationDefinitionBuilder withOverload(
      @NonNull Collection<OperationDefinition.Overload> overload) {
    this.overload = Collections.unmodifiableCollection(overload);
    return this;
  }
  /** @param parameter - The parameters for the operation/query. */
  public OperationDefinitionBuilder withParameter(
      @NonNull OperationDefinition.Parameter... parameter) {
    this.parameter = Arrays.asList(parameter);
    return this;
  }
  /** @param parameter - The parameters for the operation/query. */
  public OperationDefinitionBuilder withParameter(
      @NonNull Collection<OperationDefinition.Parameter> parameter) {
    this.parameter = Collections.unmodifiableCollection(parameter);
    return this;
  }

  public OperationDefinitionBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public OperationDefinition build() {
    return new OperationDefinition(
        OptionConverters.toScala(id),
        OptionConverters.toScala(url),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        name,
        kind,
        OptionConverters.toScala(date),
        code,
        OptionConverters.toScala(base),
        _type,
        OptionConverters.toScala(title),
        status,
        system,
        OptionConverters.toScala(version),
        contact.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(purpose),
        OptionConverters.toScala(comment),
        OptionConverters.toScala(language),
        resource.stream().collect(new LitSeqJCollector<>()),
        instance,
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(publisher),
        useContext.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(description),
        OptionConverters.toScala(experimental.map(x -> (Object) x)),
        jurisdiction.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(affectsState.map(x -> (Object) x)),
        OptionConverters.toScala(inputProfile),
        OptionConverters.toScala(implicitRules),
        OptionConverters.toScala(outputProfile),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        overload.stream().collect(new LitSeqJCollector<>()),
        parameter.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
