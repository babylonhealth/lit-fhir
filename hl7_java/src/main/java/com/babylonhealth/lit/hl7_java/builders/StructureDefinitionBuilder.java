package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.FHIR_VERSION;
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.hl7.STRUCTURE_DEFINITION_KIND;
import com.babylonhealth.lit.hl7.TYPE_DERIVATION_RULE;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface StructureDefinitionBuilder extends DomainResourceBuilder {
  public StructureDefinition build();

  public static Impl init(
      String url,
      String name,
      STRUCTURE_DEFINITION_KIND kind,
      String _type,
      PUBLICATION_STATUS status,
      Boolean _abstract) {
    return new Impl(url, name, kind, _type, status, _abstract);
  }

  public static Impl builder(
      String url,
      String name,
      STRUCTURE_DEFINITION_KIND kind,
      String _type,
      PUBLICATION_STATUS status,
      Boolean _abstract) {
    return new Impl(url, name, kind, _type, status, _abstract);
  }

  public class Impl implements StructureDefinitionBuilder {
    private Optional<String> id = Optional.empty();
    private String url;
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private String name;
    private Optional<FHIRDateTime> date = Optional.empty();
    private STRUCTURE_DEFINITION_KIND kind;
    private String _type;
    private Optional<String> title = Optional.empty();
    private PUBLICATION_STATUS status;
    private Optional<String> version = Optional.empty();
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Optional<String> purpose = Optional.empty();
    private Collection<Coding> keyword = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Boolean _abstract;
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> publisher = Optional.empty();
    private Optional<String> copyright = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<UsageContext> useContext = Collections.emptyList();
    private Optional<TYPE_DERIVATION_RULE> derivation = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<FHIR_VERSION> fhirVersion = Optional.empty();
    private Optional<Boolean> experimental = Optional.empty();
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<String> baseDefinition = Optional.empty();
    private Collection<String> contextInvariant = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<StructureDefinition.Mapping> mapping = Collections.emptyList();
    private Collection<StructureDefinition.Context> context = Collections.emptyList();
    private Optional<StructureDefinition.Snapshot> snapshot = Optional.empty();
    private Optional<StructureDefinition.Differential> differential = Optional.empty();

    /**
     * Required fields for {@link StructureDefinition}
     *
     * @param url - An absolute URI that is used to identify this structure definition when it is
     *     referenced in a specification, model, design or an instance; also called its canonical
     *     identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
     *     which an authoritative instance of this structure definition is (or will be) published.
     *     This URL can be the target of a canonical reference. It SHALL remain the same when the
     *     structure definition is stored on different servers.
     * @param name - A natural language name identifying the structure definition. This name should
     *     be usable as an identifier for the module by machine processing applications such as code
     *     generation.
     * @param kind - Defines the kind of structure that this definition is describing.
     * @param _type - The type this structure describes. If the derivation kind is 'specialization'
     *     then this is the master definition for a type, and there is always one of these (a data
     *     type, an extension, a resource, including abstract ones). Otherwise the structure
     *     definition is a constraint on the stated type (and in this case, the type cannot be an
     *     abstract type). References are URLs that are relative to
     *     http://hl7.org/fhir/StructureDefinition e.g. "string" is a reference to
     *     http://hl7.org/fhir/StructureDefinition/string. Absolute URLs are only allowed in logical
     *     models.
     * @param status - The status of this structure definition. Enables tracking the life-cycle of
     *     the content.
     * @param _abstract - Whether structure this definition describes is abstract or not - that is,
     *     whether the structure is not intended to be instantiated. For Resources and Data types,
     *     abstract types will never be exchanged between systems.
     */
    public Impl(
        String url,
        String name,
        STRUCTURE_DEFINITION_KIND kind,
        String _type,
        PUBLICATION_STATUS status,
        Boolean _abstract) {
      this.url = url;
      this.name = name;
      this.kind = kind;
      this._type = _type;
      this.status = status;
      this._abstract = _abstract;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public StructureDefinitionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public StructureDefinitionBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public StructureDefinitionBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public StructureDefinitionBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public StructureDefinitionBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param date - The date (and optionally time) when the structure definition was published. The
     *     date must change when the business version changes and it must change if the status code
     *     changes. In addition, it should change when the substantive content of the structure
     *     definition changes.
     */
    public StructureDefinitionBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /** @param title - A short, descriptive, user-friendly title for the structure definition. */
    public StructureDefinitionBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the structure
     *     definition when it is referenced in a specification, model, design or instance. This is
     *     an arbitrary value managed by the structure definition author and is not expected to be
     *     globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed
     *     version is not available. There is also no expectation that versions can be placed in a
     *     lexicographical sequence.
     */
    public StructureDefinitionBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public StructureDefinitionBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public StructureDefinitionBuilder.Impl withContact(@NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public StructureDefinitionBuilder.Impl withContact(@NonNull ContactDetailBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param purpose - Explanation of why this structure definition is needed and why it has been
     *     designed as it has.
     */
    public StructureDefinitionBuilder.Impl withPurpose(@NonNull String purpose) {
      this.purpose = Optional.of(purpose);
      return this;
    }
    /**
     * @param keyword - A set of key words or terms from external terminologies that may be used to
     *     assist with indexing and searching of templates nby describing the use of this structure
     *     definition, or the content it describes.
     */
    public StructureDefinitionBuilder.Impl withKeyword(@NonNull Coding... keyword) {
      this.keyword = Arrays.asList(keyword);
      return this;
    }
    /**
     * @param keyword - A set of key words or terms from external terminologies that may be used to
     *     assist with indexing and searching of templates nby describing the use of this structure
     *     definition, or the content it describes.
     */
    public StructureDefinitionBuilder.Impl withKeyword(@NonNull Collection<Coding> keyword) {
      this.keyword = Collections.unmodifiableCollection(keyword);
      return this;
    }

    public StructureDefinitionBuilder.Impl withKeyword(@NonNull CodingBuilder... keyword) {
      this.keyword = Arrays.stream(keyword).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public StructureDefinitionBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public StructureDefinitionBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public StructureDefinitionBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public StructureDefinitionBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public StructureDefinitionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public StructureDefinitionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public StructureDefinitionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param publisher - The name of the organization or individual that published the structure
     *     definition.
     */
    public StructureDefinitionBuilder.Impl withPublisher(@NonNull String publisher) {
      this.publisher = Optional.of(publisher);
      return this;
    }
    /**
     * @param copyright - A copyright statement relating to the structure definition and/or its
     *     contents. Copyright statements are generally legal restrictions on the use and publishing
     *     of the structure definition.
     */
    public StructureDefinitionBuilder.Impl withCopyright(@NonNull String copyright) {
      this.copyright = Optional.of(copyright);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this structure definition
     *     when it is represented in other formats, or referenced in a specification, model, design
     *     or an instance.
     */
    public StructureDefinitionBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this structure definition
     *     when it is represented in other formats, or referenced in a specification, model, design
     *     or an instance.
     */
    public StructureDefinitionBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public StructureDefinitionBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate structure definition instances.
     */
    public StructureDefinitionBuilder.Impl withUseContext(@NonNull UsageContext... useContext) {
      this.useContext = Arrays.asList(useContext);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate structure definition instances.
     */
    public StructureDefinitionBuilder.Impl withUseContext(
        @NonNull Collection<UsageContext> useContext) {
      this.useContext = Collections.unmodifiableCollection(useContext);
      return this;
    }

    public StructureDefinitionBuilder.Impl withUseContext(
        @NonNull UsageContextBuilder... useContext) {
      this.useContext = Arrays.stream(useContext).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param derivation - How the type relates to the baseDefinition. */
    public StructureDefinitionBuilder.Impl withDerivation(
        @NonNull TYPE_DERIVATION_RULE derivation) {
      this.derivation = Optional.of(derivation);
      return this;
    }
    /**
     * @param description - A free text natural language description of the structure definition
     *     from a consumer's perspective.
     */
    public StructureDefinitionBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param fhirVersion - The version of the FHIR specification on which this StructureDefinition
     *     is based - this is the formal version of the specification, without the revision number,
     *     e.g. [publication].[major].[minor], which is 4.0.1. for this version.
     */
    public StructureDefinitionBuilder.Impl withFhirVersion(@NonNull FHIR_VERSION fhirVersion) {
      this.fhirVersion = Optional.of(fhirVersion);
      return this;
    }
    /**
     * @param experimental - A Boolean value to indicate that this structure definition is authored
     *     for testing purposes (or education/evaluation/marketing) and is not intended to be used
     *     for genuine usage.
     */
    public StructureDefinitionBuilder.Impl withExperimental(@NonNull Boolean experimental) {
      this.experimental = Optional.of(experimental);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the structure definition is
     *     intended to be used.
     */
    public StructureDefinitionBuilder.Impl withJurisdiction(
        @NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the structure definition is
     *     intended to be used.
     */
    public StructureDefinitionBuilder.Impl withJurisdiction(
        @NonNull Collection<CodeableConcept> jurisdiction) {
      this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
      return this;
    }

    public StructureDefinitionBuilder.Impl withJurisdiction(
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
    public StructureDefinitionBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param baseDefinition - An absolute URI that is the base structure from which this type is
     *     derived, either by specialization or constraint.
     */
    public StructureDefinitionBuilder.Impl withBaseDefinition(@NonNull String baseDefinition) {
      this.baseDefinition = Optional.of(baseDefinition);
      return this;
    }
    /**
     * @param contextInvariant - A set of rules as FHIRPath Invariants about when the extension can
     *     be used (e.g. co-occurrence variants for the extension). All the rules must be true.
     */
    public StructureDefinitionBuilder.Impl withContextInvariant(
        @NonNull String... contextInvariant) {
      this.contextInvariant = Arrays.asList(contextInvariant);
      return this;
    }
    /**
     * @param contextInvariant - A set of rules as FHIRPath Invariants about when the extension can
     *     be used (e.g. co-occurrence variants for the extension). All the rules must be true.
     */
    public StructureDefinitionBuilder.Impl withContextInvariant(
        @NonNull Collection<String> contextInvariant) {
      this.contextInvariant = Collections.unmodifiableCollection(contextInvariant);
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
    public StructureDefinitionBuilder.Impl withModifierExtension(
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
    public StructureDefinitionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public StructureDefinitionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param mapping - An external specification that the content is mapped to. */
    public StructureDefinitionBuilder.Impl withMapping(
        @NonNull StructureDefinition.Mapping... mapping) {
      this.mapping = Arrays.asList(mapping);
      return this;
    }
    /** @param mapping - An external specification that the content is mapped to. */
    public StructureDefinitionBuilder.Impl withMapping(
        @NonNull Collection<StructureDefinition.Mapping> mapping) {
      this.mapping = Collections.unmodifiableCollection(mapping);
      return this;
    }

    public StructureDefinitionBuilder.Impl withMapping(
        @NonNull StructureDefinition_MappingBuilder... mapping) {
      this.mapping = Arrays.stream(mapping).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param context - Identifies the types of resource or data type elements to which the
     *     extension can be applied.
     */
    public StructureDefinitionBuilder.Impl withContext(
        @NonNull StructureDefinition.Context... context) {
      this.context = Arrays.asList(context);
      return this;
    }
    /**
     * @param context - Identifies the types of resource or data type elements to which the
     *     extension can be applied.
     */
    public StructureDefinitionBuilder.Impl withContext(
        @NonNull Collection<StructureDefinition.Context> context) {
      this.context = Collections.unmodifiableCollection(context);
      return this;
    }

    public StructureDefinitionBuilder.Impl withContext(
        @NonNull StructureDefinition_ContextBuilder... context) {
      this.context = Arrays.stream(context).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param snapshot - A snapshot view is expressed in a standalone form that can be used and
     *     interpreted without considering the base StructureDefinition.
     */
    public StructureDefinitionBuilder.Impl withSnapshot(
        @NonNull StructureDefinition.Snapshot snapshot) {
      this.snapshot = Optional.of(snapshot);
      return this;
    }

    public StructureDefinitionBuilder.Impl withSnapshot(
        @NonNull StructureDefinition_SnapshotBuilder snapshot) {
      this.snapshot = Optional.of(snapshot.build());
      return this;
    }
    /**
     * @param differential - A differential view is expressed relative to the base
     *     StructureDefinition - a statement of differences that it applies.
     */
    public StructureDefinitionBuilder.Impl withDifferential(
        @NonNull StructureDefinition.Differential differential) {
      this.differential = Optional.of(differential);
      return this;
    }

    public StructureDefinitionBuilder.Impl withDifferential(
        @NonNull StructureDefinition_DifferentialBuilder differential) {
      this.differential = Optional.of(differential.build());
      return this;
    }

    public StructureDefinitionBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public StructureDefinition build() {
      return new StructureDefinition(
          OptionConverters.toScala(id),
          url,
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          name,
          OptionConverters.toScala(date),
          kind,
          _type,
          OptionConverters.toScala(title),
          status,
          OptionConverters.toScala(version),
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(purpose),
          keyword.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          _abstract,
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(publisher),
          OptionConverters.toScala(copyright),
          identifier.stream().collect(new LitSeqJCollector<>()),
          useContext.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(derivation),
          OptionConverters.toScala(description),
          OptionConverters.toScala(fhirVersion),
          OptionConverters.toScala(experimental.map(x -> (Object) x)),
          jurisdiction.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(baseDefinition),
          contextInvariant.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          mapping.stream().collect(new LitSeqJCollector<>()),
          context.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(snapshot),
          OptionConverters.toScala(differential),
          LitUtils.emptyMetaElMap());
    }
  }
}
