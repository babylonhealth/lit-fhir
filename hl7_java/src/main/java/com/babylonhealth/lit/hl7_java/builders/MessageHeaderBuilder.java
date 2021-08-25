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
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface MessageHeaderBuilder extends DomainResourceBuilder {
  public MessageHeader build();

  public static Impl init(@NonNull ChoiceCodingOrUri event, MessageHeader.Source source) {
    return new Impl(event, source);
  }

  public static Impl builder(@NonNull ChoiceCodingOrUri event, MessageHeader_SourceBuilder source) {
    return new Impl(event, source.build());
  }

  public static ChoiceCodingOrUri event(Coding c) {
    return new ChoiceCodingOrUri(c);
  }

  public static ChoiceCodingOrUri event(String s) {
    return new ChoiceCodingOrUri(s);
  }

  public class Impl implements MessageHeaderBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<Reference> focus = Collections.emptyList();
    private Optional<Reference> sender = Optional.empty();
    private Optional<Reference> author = Optional.empty();
    private Optional<CodeableConcept> reason = Optional.empty();
    private Optional<Reference> enterer = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private ChoiceCodingOrUri event;
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> definition = Optional.empty();
    private Optional<Reference> responsible = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private MessageHeader.Source source;
    private Optional<MessageHeader.Response> response = Optional.empty();
    private Collection<MessageHeader.Destination> destination = Collections.emptyList();

    /**
     * Required fields for {@link MessageHeader}
     *
     * @param event - Code that identifies the event this message represents and connects it with
     *     its definition. Events defined as part of the FHIR specification have the system value
     *     "http://terminology.hl7.org/CodeSystem/message-events". Alternatively uri to the
     *     EventDefinition. Field is a 'choice' field. Type should be one of Coding, String. To pass
     *     the value in, wrap with one of the MessageHeaderBuilder.event static methods
     * @param source - The source application from which this message originated.
     */
    public Impl(@NonNull ChoiceCodingOrUri event, MessageHeader.Source source) {
      this.event = event;
      this.source = source;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MessageHeaderBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public MessageHeaderBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public MessageHeaderBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public MessageHeaderBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public MessageHeaderBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param focus - The actual data of the message - a reference to the root/focus class of the
     *     event.
     */
    public MessageHeaderBuilder.Impl withFocus(@NonNull Reference... focus) {
      this.focus = Arrays.asList(focus);
      return this;
    }
    /**
     * @param focus - The actual data of the message - a reference to the root/focus class of the
     *     event.
     */
    public MessageHeaderBuilder.Impl withFocus(@NonNull Collection<Reference> focus) {
      this.focus = Collections.unmodifiableCollection(focus);
      return this;
    }

    public MessageHeaderBuilder.Impl withFocus(@NonNull ReferenceBuilder... focus) {
      this.focus = Arrays.stream(focus).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param sender - Identifies the sending system to allow the use of a trust relationship. */
    public MessageHeaderBuilder.Impl withSender(@NonNull Reference sender) {
      this.sender = Optional.of(sender);
      return this;
    }

    public MessageHeaderBuilder.Impl withSender(@NonNull ReferenceBuilder sender) {
      this.sender = Optional.of(sender.build());
      return this;
    }
    /**
     * @param author - The logical author of the message - the person or device that decided the
     *     described event should happen. When there is more than one candidate, pick the most
     *     proximal to the MessageHeader. Can provide other authors in extensions.
     */
    public MessageHeaderBuilder.Impl withAuthor(@NonNull Reference author) {
      this.author = Optional.of(author);
      return this;
    }

    public MessageHeaderBuilder.Impl withAuthor(@NonNull ReferenceBuilder author) {
      this.author = Optional.of(author.build());
      return this;
    }
    /**
     * @param reason - Coded indication of the cause for the event - indicates a reason for the
     *     occurrence of the event that is a focus of this message.
     */
    public MessageHeaderBuilder.Impl withReason(@NonNull CodeableConcept reason) {
      this.reason = Optional.of(reason);
      return this;
    }

    public MessageHeaderBuilder.Impl withReason(@NonNull CodeableConceptBuilder reason) {
      this.reason = Optional.of(reason.build());
      return this;
    }
    /**
     * @param enterer - The person or device that performed the data entry leading to this message.
     *     When there is more than one candidate, pick the most proximal to the message. Can provide
     *     other enterers in extensions.
     */
    public MessageHeaderBuilder.Impl withEnterer(@NonNull Reference enterer) {
      this.enterer = Optional.of(enterer);
      return this;
    }

    public MessageHeaderBuilder.Impl withEnterer(@NonNull ReferenceBuilder enterer) {
      this.enterer = Optional.of(enterer.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public MessageHeaderBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public MessageHeaderBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public MessageHeaderBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public MessageHeaderBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public MessageHeaderBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MessageHeaderBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MessageHeaderBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param definition - Permanent link to the MessageDefinition for this message. */
    public MessageHeaderBuilder.Impl withDefinition(@NonNull String definition) {
      this.definition = Optional.of(definition);
      return this;
    }
    /**
     * @param responsible - The person or organization that accepts overall responsibility for the
     *     contents of the message. The implication is that the message event happened under the
     *     policies of the responsible party.
     */
    public MessageHeaderBuilder.Impl withResponsible(@NonNull Reference responsible) {
      this.responsible = Optional.of(responsible);
      return this;
    }

    public MessageHeaderBuilder.Impl withResponsible(@NonNull ReferenceBuilder responsible) {
      this.responsible = Optional.of(responsible.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public MessageHeaderBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
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
    public MessageHeaderBuilder.Impl withModifierExtension(
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
    public MessageHeaderBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MessageHeaderBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param response - Information about the message that this message is a response to. Only
     *     present if this message is a response.
     */
    public MessageHeaderBuilder.Impl withResponse(@NonNull MessageHeader.Response response) {
      this.response = Optional.of(response);
      return this;
    }

    public MessageHeaderBuilder.Impl withResponse(@NonNull MessageHeader_ResponseBuilder response) {
      this.response = Optional.of(response.build());
      return this;
    }
    /** @param destination - The destination application which the message is intended for. */
    public MessageHeaderBuilder.Impl withDestination(
        @NonNull MessageHeader.Destination... destination) {
      this.destination = Arrays.asList(destination);
      return this;
    }
    /** @param destination - The destination application which the message is intended for. */
    public MessageHeaderBuilder.Impl withDestination(
        @NonNull Collection<MessageHeader.Destination> destination) {
      this.destination = Collections.unmodifiableCollection(destination);
      return this;
    }

    public MessageHeaderBuilder.Impl withDestination(
        @NonNull MessageHeader_DestinationBuilder... destination) {
      this.destination = Arrays.stream(destination).map(e -> e.build()).collect(toList());
      return this;
    }

    public MessageHeaderBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public MessageHeader build() {
      return new MessageHeader(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          focus.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(sender),
          OptionConverters.toScala(author),
          OptionConverters.toScala(reason),
          OptionConverters.toScala(enterer),
          OptionConverters.toScala(language),
          event,
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(definition),
          OptionConverters.toScala(responsible),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          source,
          OptionConverters.toScala(response),
          destination.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
