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
import com.babylonhealth.lit.hl7.EVENT_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.REQUEST_PRIORITY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface CommunicationBuilder extends DomainResourceBuilder {
  public Communication build();

  public static Impl init(EVENT_STATUS status) {
    return new Impl(status);
  }

  public static Impl builder(EVENT_STATUS status) {
    return new Impl(status);
  }

  public class Impl implements CommunicationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<FHIRDateTime> sent = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<CodeableConcept> topic = Optional.empty();
    private Collection<Reference> about = Collections.emptyList();
    private Collection<Reference> partOf = Collections.emptyList();
    private EVENT_STATUS status;
    private Collection<CodeableConcept> medium = Collections.emptyList();
    private Optional<Reference> sender = Optional.empty();
    private Collection<Reference> basedOn = Collections.emptyList();
    private Optional<Reference> subject = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Optional<REQUEST_PRIORITY> priority = Optional.empty();
    private Optional<FHIRDateTime> received = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Collection<Reference> recipient = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<CodeableConcept> reasonCode = Collections.emptyList();
    private Collection<Reference> inResponseTo = Collections.emptyList();
    private Optional<CodeableConcept> statusReason = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<String> instantiatesUri = Collections.emptyList();
    private Collection<Reference> reasonReference = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<String> instantiatesCanonical = Collections.emptyList();
    private Collection<Communication.Payload> payload = Collections.emptyList();

    /**
     * Required fields for {@link Communication}
     *
     * @param status - The status of the transmission.
     */
    public Impl(EVENT_STATUS status) {
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CommunicationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public CommunicationBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public CommunicationBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public CommunicationBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public CommunicationBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param sent - The time when this communication was sent. */
    public CommunicationBuilder.Impl withSent(@NonNull FHIRDateTime sent) {
      this.sent = Optional.of(sent);
      return this;
    }
    /**
     * @param note - Additional notes or commentary about the communication by the sender, receiver
     *     or other interested parties.
     */
    public CommunicationBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Additional notes or commentary about the communication by the sender, receiver
     *     or other interested parties.
     */
    public CommunicationBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public CommunicationBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param topic - Description of the purpose/content, similar to a subject line in an email. */
    public CommunicationBuilder.Impl withTopic(@NonNull CodeableConcept topic) {
      this.topic = Optional.of(topic);
      return this;
    }

    public CommunicationBuilder.Impl withTopic(@NonNull CodeableConceptBuilder topic) {
      this.topic = Optional.of(topic.build());
      return this;
    }
    /**
     * @param about - Other resources that pertain to this communication and to which this
     *     communication should be associated.
     */
    public CommunicationBuilder.Impl withAbout(@NonNull Reference... about) {
      this.about = Arrays.asList(about);
      return this;
    }
    /**
     * @param about - Other resources that pertain to this communication and to which this
     *     communication should be associated.
     */
    public CommunicationBuilder.Impl withAbout(@NonNull Collection<Reference> about) {
      this.about = Collections.unmodifiableCollection(about);
      return this;
    }

    public CommunicationBuilder.Impl withAbout(@NonNull ReferenceBuilder... about) {
      this.about = Arrays.stream(about).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param partOf - Part of this action. */
    public CommunicationBuilder.Impl withPartOf(@NonNull Reference... partOf) {
      this.partOf = Arrays.asList(partOf);
      return this;
    }
    /** @param partOf - Part of this action. */
    public CommunicationBuilder.Impl withPartOf(@NonNull Collection<Reference> partOf) {
      this.partOf = Collections.unmodifiableCollection(partOf);
      return this;
    }

    public CommunicationBuilder.Impl withPartOf(@NonNull ReferenceBuilder... partOf) {
      this.partOf = Arrays.stream(partOf).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param medium - A channel that was used for this communication (e.g. email, fax). */
    public CommunicationBuilder.Impl withMedium(@NonNull CodeableConcept... medium) {
      this.medium = Arrays.asList(medium);
      return this;
    }
    /** @param medium - A channel that was used for this communication (e.g. email, fax). */
    public CommunicationBuilder.Impl withMedium(@NonNull Collection<CodeableConcept> medium) {
      this.medium = Collections.unmodifiableCollection(medium);
      return this;
    }

    public CommunicationBuilder.Impl withMedium(@NonNull CodeableConceptBuilder... medium) {
      this.medium = Arrays.stream(medium).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param sender - The entity (e.g. person, organization, clinical information system, or
     *     device) which was the source of the communication.
     */
    public CommunicationBuilder.Impl withSender(@NonNull Reference sender) {
      this.sender = Optional.of(sender);
      return this;
    }

    public CommunicationBuilder.Impl withSender(@NonNull ReferenceBuilder sender) {
      this.sender = Optional.of(sender.build());
      return this;
    }
    /**
     * @param basedOn - An order, proposal or plan fulfilled in whole or in part by this
     *     Communication.
     */
    public CommunicationBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /**
     * @param basedOn - An order, proposal or plan fulfilled in whole or in part by this
     *     Communication.
     */
    public CommunicationBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public CommunicationBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param subject - The patient or group that was the focus of this communication. */
    public CommunicationBuilder.Impl withSubject(@NonNull Reference subject) {
      this.subject = Optional.of(subject);
      return this;
    }

    public CommunicationBuilder.Impl withSubject(@NonNull ReferenceBuilder subject) {
      this.subject = Optional.of(subject.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public CommunicationBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param category - The type of message conveyed such as alert, notification, reminder,
     *     instruction, etc.
     */
    public CommunicationBuilder.Impl withCategory(@NonNull CodeableConcept... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /**
     * @param category - The type of message conveyed such as alert, notification, reminder,
     *     instruction, etc.
     */
    public CommunicationBuilder.Impl withCategory(@NonNull Collection<CodeableConcept> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }

    public CommunicationBuilder.Impl withCategory(@NonNull CodeableConceptBuilder... category) {
      this.category = Arrays.stream(category).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param priority - Characterizes how quickly the planned or in progress communication must be
     *     addressed. Includes concepts such as stat, urgent, routine.
     */
    public CommunicationBuilder.Impl withPriority(@NonNull REQUEST_PRIORITY priority) {
      this.priority = Optional.of(priority);
      return this;
    }
    /** @param received - The time when this communication arrived at the destination. */
    public CommunicationBuilder.Impl withReceived(@NonNull FHIRDateTime received) {
      this.received = Optional.of(received);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public CommunicationBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public CommunicationBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public CommunicationBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public CommunicationBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public CommunicationBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CommunicationBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - The Encounter during which this Communication was created or to which the
     *     creation of this record is tightly associated.
     */
    public CommunicationBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public CommunicationBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /**
     * @param recipient - The entity (e.g. person, organization, clinical information system, care
     *     team or device) which was the target of the communication. If receipts need to be tracked
     *     by an individual, a separate resource instance will need to be created for each
     *     recipient. Multiple recipient communications are intended where either receipts are not
     *     tracked (e.g. a mass mail-out) or a receipt is captured in aggregate (all emails
     *     confirmed received by a particular time).
     */
    public CommunicationBuilder.Impl withRecipient(@NonNull Reference... recipient) {
      this.recipient = Arrays.asList(recipient);
      return this;
    }
    /**
     * @param recipient - The entity (e.g. person, organization, clinical information system, care
     *     team or device) which was the target of the communication. If receipts need to be tracked
     *     by an individual, a separate resource instance will need to be created for each
     *     recipient. Multiple recipient communications are intended where either receipts are not
     *     tracked (e.g. a mass mail-out) or a receipt is captured in aggregate (all emails
     *     confirmed received by a particular time).
     */
    public CommunicationBuilder.Impl withRecipient(@NonNull Collection<Reference> recipient) {
      this.recipient = Collections.unmodifiableCollection(recipient);
      return this;
    }

    public CommunicationBuilder.Impl withRecipient(@NonNull ReferenceBuilder... recipient) {
      this.recipient = Arrays.stream(recipient).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this communication by the performer or
     *     other systems which remain constant as the resource is updated and propagates from server
     *     to server.
     */
    public CommunicationBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this communication by the performer or
     *     other systems which remain constant as the resource is updated and propagates from server
     *     to server.
     */
    public CommunicationBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public CommunicationBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param reasonCode - The reason or justification for the communication. */
    public CommunicationBuilder.Impl withReasonCode(@NonNull CodeableConcept... reasonCode) {
      this.reasonCode = Arrays.asList(reasonCode);
      return this;
    }
    /** @param reasonCode - The reason or justification for the communication. */
    public CommunicationBuilder.Impl withReasonCode(
        @NonNull Collection<CodeableConcept> reasonCode) {
      this.reasonCode = Collections.unmodifiableCollection(reasonCode);
      return this;
    }

    public CommunicationBuilder.Impl withReasonCode(@NonNull CodeableConceptBuilder... reasonCode) {
      this.reasonCode = Arrays.stream(reasonCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param inResponseTo - Prior communication that this communication is in response to. */
    public CommunicationBuilder.Impl withInResponseTo(@NonNull Reference... inResponseTo) {
      this.inResponseTo = Arrays.asList(inResponseTo);
      return this;
    }
    /** @param inResponseTo - Prior communication that this communication is in response to. */
    public CommunicationBuilder.Impl withInResponseTo(@NonNull Collection<Reference> inResponseTo) {
      this.inResponseTo = Collections.unmodifiableCollection(inResponseTo);
      return this;
    }

    public CommunicationBuilder.Impl withInResponseTo(@NonNull ReferenceBuilder... inResponseTo) {
      this.inResponseTo = Arrays.stream(inResponseTo).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param statusReason - Captures the reason for the current state of the Communication. */
    public CommunicationBuilder.Impl withStatusReason(@NonNull CodeableConcept statusReason) {
      this.statusReason = Optional.of(statusReason);
      return this;
    }

    public CommunicationBuilder.Impl withStatusReason(
        @NonNull CodeableConceptBuilder statusReason) {
      this.statusReason = Optional.of(statusReason.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public CommunicationBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this
     *     Communication.
     */
    public CommunicationBuilder.Impl withInstantiatesUri(@NonNull String... instantiatesUri) {
      this.instantiatesUri = Arrays.asList(instantiatesUri);
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this
     *     Communication.
     */
    public CommunicationBuilder.Impl withInstantiatesUri(
        @NonNull Collection<String> instantiatesUri) {
      this.instantiatesUri = Collections.unmodifiableCollection(instantiatesUri);
      return this;
    }
    /**
     * @param reasonReference - Indicates another resource whose existence justifies this
     *     communication.
     */
    public CommunicationBuilder.Impl withReasonReference(@NonNull Reference... reasonReference) {
      this.reasonReference = Arrays.asList(reasonReference);
      return this;
    }
    /**
     * @param reasonReference - Indicates another resource whose existence justifies this
     *     communication.
     */
    public CommunicationBuilder.Impl withReasonReference(
        @NonNull Collection<Reference> reasonReference) {
      this.reasonReference = Collections.unmodifiableCollection(reasonReference);
      return this;
    }

    public CommunicationBuilder.Impl withReasonReference(
        @NonNull ReferenceBuilder... reasonReference) {
      this.reasonReference = Arrays.stream(reasonReference).map(e -> e.build()).collect(toList());
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
    public CommunicationBuilder.Impl withModifierExtension(
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
    public CommunicationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public CommunicationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this
     *     Communication.
     */
    public CommunicationBuilder.Impl withInstantiatesCanonical(
        @NonNull String... instantiatesCanonical) {
      this.instantiatesCanonical = Arrays.asList(instantiatesCanonical);
      return this;
    }
    /**
     * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this
     *     Communication.
     */
    public CommunicationBuilder.Impl withInstantiatesCanonical(
        @NonNull Collection<String> instantiatesCanonical) {
      this.instantiatesCanonical = Collections.unmodifiableCollection(instantiatesCanonical);
      return this;
    }
    /**
     * @param payload - Text, attachment(s), or resource(s) that was communicated to the recipient.
     */
    public CommunicationBuilder.Impl withPayload(@NonNull Communication.Payload... payload) {
      this.payload = Arrays.asList(payload);
      return this;
    }
    /**
     * @param payload - Text, attachment(s), or resource(s) that was communicated to the recipient.
     */
    public CommunicationBuilder.Impl withPayload(
        @NonNull Collection<Communication.Payload> payload) {
      this.payload = Collections.unmodifiableCollection(payload);
      return this;
    }

    public CommunicationBuilder.Impl withPayload(@NonNull Communication_PayloadBuilder... payload) {
      this.payload = Arrays.stream(payload).map(e -> e.build()).collect(toList());
      return this;
    }

    public CommunicationBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Communication build() {
      return new Communication(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(sent),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(topic),
          about.stream().collect(new LitSeqJCollector<>()),
          partOf.stream().collect(new LitSeqJCollector<>()),
          status,
          medium.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(sender),
          basedOn.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(subject),
          OptionConverters.toScala(language),
          category.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(priority),
          OptionConverters.toScala(received),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          recipient.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          reasonCode.stream().collect(new LitSeqJCollector<>()),
          inResponseTo.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(statusReason),
          OptionConverters.toScala(implicitRules),
          instantiatesUri.stream().collect(new LitSeqJCollector<>()),
          reasonReference.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          instantiatesCanonical.stream().collect(new LitSeqJCollector<>()),
          payload.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
