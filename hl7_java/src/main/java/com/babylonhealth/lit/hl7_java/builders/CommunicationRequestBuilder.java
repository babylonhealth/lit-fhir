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
import com.babylonhealth.lit.hl7.REQUEST_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.REQUEST_PRIORITY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class CommunicationRequestBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Collection<Annotation> note = Collections.emptyList();
  private Collection<Reference> about = Collections.emptyList();
  private REQUEST_STATUS status;
  private Collection<CodeableConcept> medium = Collections.emptyList();
  private Optional<Reference> sender = Optional.empty();
  private Collection<Reference> basedOn = Collections.emptyList();
  private Optional<Reference> subject = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Reference> replaces = Collections.emptyList();
  private Collection<CodeableConcept> category = Collections.emptyList();
  private Optional<REQUEST_PRIORITY> priority = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> encounter = Optional.empty();
  private Optional<Reference> requester = Optional.empty();
  private Collection<Reference> recipient = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<FHIRDateTime> authoredOn = Optional.empty();
  private Collection<CodeableConcept> reasonCode = Collections.emptyList();
  private Optional<CodeableConcept> statusReason = Optional.empty();
  private Optional<Boolean> doNotPerform = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<Choice<$bslash$div<FHIRDateTime, Period>>> occurrence = Optional.empty();
  private Optional<Identifier> groupIdentifier = Optional.empty();
  private Collection<Reference> reasonReference = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<CommunicationRequest.Payload> payload = Collections.emptyList();

  /**
   * Required fields for {@link CommunicationRequest}
   *
   * @param status - The status of the proposal or order.
   */
  public CommunicationRequestBuilder(REQUEST_STATUS status) {
    this.status = status;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public CommunicationRequestBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public CommunicationRequestBuilder withMeta(@NonNull Meta meta) {
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
  public CommunicationRequestBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param note - Comments made about the request by the requester, sender, recipient, subject or
   *     other participants.
   */
  public CommunicationRequestBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /**
   * @param note - Comments made about the request by the requester, sender, recipient, subject or
   *     other participants.
   */
  public CommunicationRequestBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /**
   * @param about - Other resources that pertain to this communication request and to which this
   *     communication request should be associated.
   */
  public CommunicationRequestBuilder withAbout(@NonNull Reference... about) {
    this.about = Arrays.asList(about);
    return this;
  }
  /**
   * @param about - Other resources that pertain to this communication request and to which this
   *     communication request should be associated.
   */
  public CommunicationRequestBuilder withAbout(@NonNull Collection<Reference> about) {
    this.about = Collections.unmodifiableCollection(about);
    return this;
  }
  /** @param medium - A channel that was used for this communication (e.g. email, fax). */
  public CommunicationRequestBuilder withMedium(@NonNull CodeableConcept... medium) {
    this.medium = Arrays.asList(medium);
    return this;
  }
  /** @param medium - A channel that was used for this communication (e.g. email, fax). */
  public CommunicationRequestBuilder withMedium(@NonNull Collection<CodeableConcept> medium) {
    this.medium = Collections.unmodifiableCollection(medium);
    return this;
  }
  /**
   * @param sender - The entity (e.g. person, organization, clinical information system, or device)
   *     which is to be the source of the communication.
   */
  public CommunicationRequestBuilder withSender(@NonNull Reference sender) {
    this.sender = Optional.of(sender);
    return this;
  }
  /** @param basedOn - A plan or proposal that is fulfilled in whole or in part by this request. */
  public CommunicationRequestBuilder withBasedOn(@NonNull Reference... basedOn) {
    this.basedOn = Arrays.asList(basedOn);
    return this;
  }
  /** @param basedOn - A plan or proposal that is fulfilled in whole or in part by this request. */
  public CommunicationRequestBuilder withBasedOn(@NonNull Collection<Reference> basedOn) {
    this.basedOn = Collections.unmodifiableCollection(basedOn);
    return this;
  }
  /** @param subject - The patient or group that is the focus of this communication request. */
  public CommunicationRequestBuilder withSubject(@NonNull Reference subject) {
    this.subject = Optional.of(subject);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public CommunicationRequestBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param replaces - Completed or terminated request(s) whose function is taken by this new
   *     request.
   */
  public CommunicationRequestBuilder withReplaces(@NonNull Reference... replaces) {
    this.replaces = Arrays.asList(replaces);
    return this;
  }
  /**
   * @param replaces - Completed or terminated request(s) whose function is taken by this new
   *     request.
   */
  public CommunicationRequestBuilder withReplaces(@NonNull Collection<Reference> replaces) {
    this.replaces = Collections.unmodifiableCollection(replaces);
    return this;
  }
  /**
   * @param category - The type of message to be sent such as alert, notification, reminder,
   *     instruction, etc.
   */
  public CommunicationRequestBuilder withCategory(@NonNull CodeableConcept... category) {
    this.category = Arrays.asList(category);
    return this;
  }
  /**
   * @param category - The type of message to be sent such as alert, notification, reminder,
   *     instruction, etc.
   */
  public CommunicationRequestBuilder withCategory(@NonNull Collection<CodeableConcept> category) {
    this.category = Collections.unmodifiableCollection(category);
    return this;
  }
  /**
   * @param priority - Characterizes how quickly the proposed act must be initiated. Includes
   *     concepts such as stat, urgent, routine.
   */
  public CommunicationRequestBuilder withPriority(@NonNull REQUEST_PRIORITY priority) {
    this.priority = Optional.of(priority);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public CommunicationRequestBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public CommunicationRequestBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public CommunicationRequestBuilder withExtension(@NonNull Extension... extension) {
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
  public CommunicationRequestBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param encounter - The Encounter during which this CommunicationRequest was created or to which
   *     the creation of this record is tightly associated.
   */
  public CommunicationRequestBuilder withEncounter(@NonNull Reference encounter) {
    this.encounter = Optional.of(encounter);
    return this;
  }
  /**
   * @param requester - The device, individual, or organization who initiated the request and has
   *     responsibility for its activation.
   */
  public CommunicationRequestBuilder withRequester(@NonNull Reference requester) {
    this.requester = Optional.of(requester);
    return this;
  }
  /**
   * @param recipient - The entity (e.g. person, organization, clinical information system, device,
   *     group, or care team) which is the intended target of the communication.
   */
  public CommunicationRequestBuilder withRecipient(@NonNull Reference... recipient) {
    this.recipient = Arrays.asList(recipient);
    return this;
  }
  /**
   * @param recipient - The entity (e.g. person, organization, clinical information system, device,
   *     group, or care team) which is the intended target of the communication.
   */
  public CommunicationRequestBuilder withRecipient(@NonNull Collection<Reference> recipient) {
    this.recipient = Collections.unmodifiableCollection(recipient);
    return this;
  }
  /**
   * @param identifier - Business identifiers assigned to this communication request by the
   *     performer or other systems which remain constant as the resource is updated and propagates
   *     from server to server.
   */
  public CommunicationRequestBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Business identifiers assigned to this communication request by the
   *     performer or other systems which remain constant as the resource is updated and propagates
   *     from server to server.
   */
  public CommunicationRequestBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param authoredOn - For draft requests, indicates the date of initial creation. For requests
   *     with other statuses, indicates the date of activation.
   */
  public CommunicationRequestBuilder withAuthoredOn(@NonNull FHIRDateTime authoredOn) {
    this.authoredOn = Optional.of(authoredOn);
    return this;
  }
  /** @param reasonCode - Describes why the request is being made in coded or textual form. */
  public CommunicationRequestBuilder withReasonCode(@NonNull CodeableConcept... reasonCode) {
    this.reasonCode = Arrays.asList(reasonCode);
    return this;
  }
  /** @param reasonCode - Describes why the request is being made in coded or textual form. */
  public CommunicationRequestBuilder withReasonCode(
      @NonNull Collection<CodeableConcept> reasonCode) {
    this.reasonCode = Collections.unmodifiableCollection(reasonCode);
    return this;
  }
  /**
   * @param statusReason - Captures the reason for the current state of the CommunicationRequest.
   */
  public CommunicationRequestBuilder withStatusReason(@NonNull CodeableConcept statusReason) {
    this.statusReason = Optional.of(statusReason);
    return this;
  }
  /**
   * @param doNotPerform - If true indicates that the CommunicationRequest is asking for the
   *     specified action to *not* occur.
   */
  public CommunicationRequestBuilder withDoNotPerform(@NonNull Boolean doNotPerform) {
    this.doNotPerform = Optional.of(doNotPerform);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public CommunicationRequestBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param occurrence - The time when this communication is to occur. Field is a 'choice' field.
   *     Type should be one of FHIRDateTime, Period.
   */
  public <T> CommunicationRequestBuilder withOccurrence(@NonNull T occurrence) {
    var guessedSuffix =
        autoSuffix(
            occurrence.getClass().getSimpleName(), CommunicationRequest$.MODULE$.occurrence());
    return withOccurrence(guessedSuffix, occurrence);
  }

  /**
   * Alternative to the 'main' withOccurrence method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param occurrence - The value to be passed to the builder
   */
  public <T> CommunicationRequestBuilder withOccurrence(String suffix, @NonNull T occurrence) {
    guard(
        occurrence.getClass().getSimpleName(), suffix, CommunicationRequest$.MODULE$.occurrence());
    this.occurrence =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, occurrence, CommunicationRequest$.MODULE$.occurrence()));
    return this;
  }
  /**
   * @param groupIdentifier - A shared identifier common to all requests that were authorized more
   *     or less simultaneously by a single author, representing the identifier of the requisition,
   *     prescription or similar form.
   */
  public CommunicationRequestBuilder withGroupIdentifier(@NonNull Identifier groupIdentifier) {
    this.groupIdentifier = Optional.of(groupIdentifier);
    return this;
  }
  /** @param reasonReference - Indicates another resource whose existence justifies this request. */
  public CommunicationRequestBuilder withReasonReference(@NonNull Reference... reasonReference) {
    this.reasonReference = Arrays.asList(reasonReference);
    return this;
  }
  /** @param reasonReference - Indicates another resource whose existence justifies this request. */
  public CommunicationRequestBuilder withReasonReference(
      @NonNull Collection<Reference> reasonReference) {
    this.reasonReference = Collections.unmodifiableCollection(reasonReference);
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
  public CommunicationRequestBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
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
  public CommunicationRequestBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param payload - Text, attachment(s), or resource(s) to be communicated to the recipient. */
  public CommunicationRequestBuilder withPayload(@NonNull CommunicationRequest.Payload... payload) {
    this.payload = Arrays.asList(payload);
    return this;
  }
  /** @param payload - Text, attachment(s), or resource(s) to be communicated to the recipient. */
  public CommunicationRequestBuilder withPayload(
      @NonNull Collection<CommunicationRequest.Payload> payload) {
    this.payload = Collections.unmodifiableCollection(payload);
    return this;
  }

  public CommunicationRequestBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public CommunicationRequest build() {
    return new CommunicationRequest(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        note.stream().collect(new LitSeqJCollector<>()),
        about.stream().collect(new LitSeqJCollector<>()),
        status,
        medium.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(sender),
        basedOn.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(subject),
        OptionConverters.toScala(language),
        replaces.stream().collect(new LitSeqJCollector<>()),
        category.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(priority),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(encounter),
        OptionConverters.toScala(requester),
        recipient.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(authoredOn),
        reasonCode.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(statusReason),
        OptionConverters.toScala(doNotPerform.map(x -> (Object) x)),
        OptionConverters.toScala(implicitRules),
        OptionConverters.toScala(occurrence),
        OptionConverters.toScala(groupIdentifier),
        reasonReference.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        payload.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
