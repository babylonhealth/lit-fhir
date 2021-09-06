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
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.MESSAGE_SIGNIFICANCE_CATEGORY;
import com.babylonhealth.lit.hl7.MESSAGEHEADER_RESPONSE_REQUEST;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface MessageDefinitionBuilder extends DomainResourceBuilder {
  public MessageDefinition build();

  public static Impl init(
      FHIRDateTime date, PUBLICATION_STATUS status, @NonNull Choice01583485927 event) {
    return new Impl(date, status, event);
  }

  public static Impl builder(
      FHIRDateTime date, PUBLICATION_STATUS status, @NonNull Choice01583485927 event) {
    return new Impl(date, status, event);
  }

  public static Choice01583485927 event(Coding c) {
    return new Choice01583485927(c);
  }

  public static Choice01583485927 event(String s) {
    return new Choice01583485927(s);
  }

  public class Impl implements MessageDefinitionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> name = Optional.empty();
    private FHIRDateTime date;
    private Optional<String> base = Optional.empty();
    private Optional<String> title = Optional.empty();
    private Collection<String> graph = Collections.emptyList();
    private PUBLICATION_STATUS status;
    private Collection<String> parent = Collections.emptyList();
    private Optional<String> version = Optional.empty();
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Optional<String> purpose = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<String> replaces = Collections.emptyList();
    private Choice01583485927 event;
    private Optional<MESSAGE_SIGNIFICANCE_CATEGORY> category = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> publisher = Optional.empty();
    private Optional<String> copyright = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<UsageContext> useContext = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<Boolean> experimental = Optional.empty();
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<MESSAGEHEADER_RESPONSE_REQUEST> responseRequired = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<MessageDefinition.Focus> focus = Collections.emptyList();
    private Collection<MessageDefinition.AllowedResponse> allowedResponse = Collections.emptyList();

    /**
     * Required fields for {@link MessageDefinition}
     *
     * @param date - The date (and optionally time) when the message definition was published. The
     *     date must change when the business version changes and it must change if the status code
     *     changes. In addition, it should change when the substantive content of the message
     *     definition changes.
     * @param status - The status of this message definition. Enables tracking the life-cycle of the
     *     content.
     * @param event - Event code or link to the EventDefinition. Field is a 'choice' field. Type
     *     should be one of Coding, String. To pass the value in, wrap with one of the
     *     MessageDefinitionBuilder.event static methods
     */
    public Impl(FHIRDateTime date, PUBLICATION_STATUS status, @NonNull Choice01583485927 event) {
      this.date = date;
      this.status = status;
      this.event = event;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MessageDefinitionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - The business identifier that is used to reference the MessageDefinition and *is*
     *     expected to be consistent from server to server.
     */
    public MessageDefinitionBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public MessageDefinitionBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public MessageDefinitionBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }
    /**
     * @param name - A natural language name identifying the message definition. This name should be
     *     usable as an identifier for the module by machine processing applications such as code
     *     generation.
     */
    public MessageDefinitionBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /** @param base - The MessageDefinition that is the basis for the contents of this resource. */
    public MessageDefinitionBuilder.Impl withBase(@NonNull String base) {
      this.base = Optional.of(base);
      return this;
    }
    /** @param title - A short, descriptive, user-friendly title for the message definition. */
    public MessageDefinitionBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param graph - Canonical reference to a GraphDefinition. If a URL is provided, it is the
     *     canonical reference to a [GraphDefinition](graphdefinition.html) that it controls what
     *     resources are to be added to the bundle when building the document. The GraphDefinition
     *     can also specify profiles that apply to the various resources.
     */
    public MessageDefinitionBuilder.Impl withGraph(@NonNull String... graph) {
      this.graph = Arrays.asList(graph);
      return this;
    }
    /**
     * @param graph - Canonical reference to a GraphDefinition. If a URL is provided, it is the
     *     canonical reference to a [GraphDefinition](graphdefinition.html) that it controls what
     *     resources are to be added to the bundle when building the document. The GraphDefinition
     *     can also specify profiles that apply to the various resources.
     */
    public MessageDefinitionBuilder.Impl withGraph(@NonNull Collection<String> graph) {
      this.graph = Collections.unmodifiableCollection(graph);
      return this;
    }
    /**
     * @param parent - Identifies a protocol or workflow that this MessageDefinition represents a
     *     step in.
     */
    public MessageDefinitionBuilder.Impl withParent(@NonNull String... parent) {
      this.parent = Arrays.asList(parent);
      return this;
    }
    /**
     * @param parent - Identifies a protocol or workflow that this MessageDefinition represents a
     *     step in.
     */
    public MessageDefinitionBuilder.Impl withParent(@NonNull Collection<String> parent) {
      this.parent = Collections.unmodifiableCollection(parent);
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the message
     *     definition when it is referenced in a specification, model, design or instance. This is
     *     an arbitrary value managed by the message definition author and is not expected to be
     *     globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed
     *     version is not available. There is also no expectation that versions can be placed in a
     *     lexicographical sequence.
     */
    public MessageDefinitionBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public MessageDefinitionBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public MessageDefinitionBuilder.Impl withContact(@NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }
    /**
     * @param purpose - Explanation of why this message definition is needed and why it has been
     *     designed as it has.
     */
    public MessageDefinitionBuilder.Impl withPurpose(@NonNull String purpose) {
      this.purpose = Optional.of(purpose);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public MessageDefinitionBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param replaces - A MessageDefinition that is superseded by this definition. */
    public MessageDefinitionBuilder.Impl withReplaces(@NonNull String... replaces) {
      this.replaces = Arrays.asList(replaces);
      return this;
    }
    /** @param replaces - A MessageDefinition that is superseded by this definition. */
    public MessageDefinitionBuilder.Impl withReplaces(@NonNull Collection<String> replaces) {
      this.replaces = Collections.unmodifiableCollection(replaces);
      return this;
    }
    /** @param category - The impact of the content of the message. */
    public MessageDefinitionBuilder.Impl withCategory(
        @NonNull MESSAGE_SIGNIFICANCE_CATEGORY category) {
      this.category = Optional.of(category);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MessageDefinitionBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MessageDefinitionBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MessageDefinitionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MessageDefinitionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param publisher - The name of the organization or individual that published the message
     *     definition.
     */
    public MessageDefinitionBuilder.Impl withPublisher(@NonNull String publisher) {
      this.publisher = Optional.of(publisher);
      return this;
    }
    /**
     * @param copyright - A copyright statement relating to the message definition and/or its
     *     contents. Copyright statements are generally legal restrictions on the use and publishing
     *     of the message definition.
     */
    public MessageDefinitionBuilder.Impl withCopyright(@NonNull String copyright) {
      this.copyright = Optional.of(copyright);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this message definition when
     *     it is represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public MessageDefinitionBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this message definition when
     *     it is represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public MessageDefinitionBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate message definition instances.
     */
    public MessageDefinitionBuilder.Impl withUseContext(@NonNull UsageContext... useContext) {
      this.useContext = Arrays.asList(useContext);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate message definition instances.
     */
    public MessageDefinitionBuilder.Impl withUseContext(
        @NonNull Collection<UsageContext> useContext) {
      this.useContext = Collections.unmodifiableCollection(useContext);
      return this;
    }
    /**
     * @param description - A free text natural language description of the message definition from
     *     a consumer's perspective.
     */
    public MessageDefinitionBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param experimental - A Boolean value to indicate that this message definition is authored
     *     for testing purposes (or education/evaluation/marketing) and is not intended to be used
     *     for genuine usage.
     */
    public MessageDefinitionBuilder.Impl withExperimental(@NonNull Boolean experimental) {
      this.experimental = Optional.of(experimental);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the message definition is
     *     intended to be used.
     */
    public MessageDefinitionBuilder.Impl withJurisdiction(
        @NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the message definition is
     *     intended to be used.
     */
    public MessageDefinitionBuilder.Impl withJurisdiction(
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
    public MessageDefinitionBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param responseRequired - Declare at a message definition level whether a response is
     *     required or only upon error or success, or never.
     */
    public MessageDefinitionBuilder.Impl withResponseRequired(
        @NonNull MESSAGEHEADER_RESPONSE_REQUEST responseRequired) {
      this.responseRequired = Optional.of(responseRequired);
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
    public MessageDefinitionBuilder.Impl withModifierExtension(
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
    public MessageDefinitionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /**
     * @param focus - Identifies the resource (or resources) that are being addressed by the event.
     *     For example, the Encounter for an admit message or two Account records for a merge.
     */
    public MessageDefinitionBuilder.Impl withFocus(@NonNull MessageDefinition.Focus... focus) {
      this.focus = Arrays.asList(focus);
      return this;
    }
    /**
     * @param focus - Identifies the resource (or resources) that are being addressed by the event.
     *     For example, the Encounter for an admit message or two Account records for a merge.
     */
    public MessageDefinitionBuilder.Impl withFocus(
        @NonNull Collection<MessageDefinition.Focus> focus) {
      this.focus = Collections.unmodifiableCollection(focus);
      return this;
    }
    /**
     * @param allowedResponse - Indicates what types of messages may be sent as an application-level
     *     response to this message.
     */
    public MessageDefinitionBuilder.Impl withAllowedResponse(
        @NonNull MessageDefinition.AllowedResponse... allowedResponse) {
      this.allowedResponse = Arrays.asList(allowedResponse);
      return this;
    }
    /**
     * @param allowedResponse - Indicates what types of messages may be sent as an application-level
     *     response to this message.
     */
    public MessageDefinitionBuilder.Impl withAllowedResponse(
        @NonNull Collection<MessageDefinition.AllowedResponse> allowedResponse) {
      this.allowedResponse = Collections.unmodifiableCollection(allowedResponse);
      return this;
    }

    public MessageDefinitionBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public MessageDefinition build() {
      return new MessageDefinition(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(name),
          date,
          OptionConverters.toScala(base),
          OptionConverters.toScala(title),
          graph.stream().collect(new LitSeqJCollector<>()),
          status,
          parent.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(version),
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(purpose),
          OptionConverters.toScala(language),
          replaces.stream().collect(new LitSeqJCollector<>()),
          event,
          OptionConverters.toScala(category),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(publisher),
          OptionConverters.toScala(copyright),
          identifier.stream().collect(new LitSeqJCollector<>()),
          useContext.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(experimental.map(x -> (Object) x)),
          jurisdiction.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(responseRequired),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          focus.stream().collect(new LitSeqJCollector<>()),
          allowedResponse.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
