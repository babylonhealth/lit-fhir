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

public interface SubscriptionBuilder extends DomainResourceBuilder {
  public Subscription build();

  public static Impl init(String topic, String status, Coding channelType) {
    return new Impl(topic, status, channelType);
  }

  public static Impl builder(String topic, String status, CodingBuilder channelType) {
    return new Impl(topic, status, channelType.build());
  }

  public class Impl implements SubscriptionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<ZonedDateTime> end = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> name = Optional.empty();
    private String topic;
    private String status;
    private Optional<String> reason = Optional.empty();
    private Collection<String> header = Collections.emptyList();
    private Collection<ContactPoint> contact = Collections.emptyList();
    private Optional<Integer> timeout = Optional.empty();
    private Optional<String> content = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<String> endpoint = Optional.empty();
    private Optional<Integer> maxCount = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Coding channelType;
    private Optional<String> contentType = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<Integer> heartbeatPeriod = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<String> notificationUrlLocation = Optional.empty();
    private Collection<Subscription.FilterBy> filterBy = Collections.emptyList();

    /**
     * Required fields for {@link Subscription}
     *
     * @param topic - The reference to the subscription topic to be notified about.
     * @param status - The status of the subscription, which marks the server state for managing the
     *     subscription.
     * @param channelType - The type of channel to send notifications on.
     */
    public Impl(String topic, String status, Coding channelType) {
      this.topic = topic;
      this.status = status;
      this.channelType = channelType;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubscriptionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param end - The time for the server to turn the subscription off. */
    public SubscriptionBuilder.Impl withEnd(@NonNull ZonedDateTime end) {
      this.end = Optional.of(end);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public SubscriptionBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public SubscriptionBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public SubscriptionBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public SubscriptionBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param name - A natural language name identifying the subscription. */
    public SubscriptionBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /** @param reason - A description of why this subscription is defined. */
    public SubscriptionBuilder.Impl withReason(@NonNull String reason) {
      this.reason = Optional.of(reason);
      return this;
    }
    /** @param header - Additional headers / information to send as part of the notification. */
    public SubscriptionBuilder.Impl withHeader(@NonNull String... header) {
      this.header = Arrays.asList(header);
      return this;
    }
    /** @param header - Additional headers / information to send as part of the notification. */
    public SubscriptionBuilder.Impl withHeader(@NonNull Collection<String> header) {
      this.header = Collections.unmodifiableCollection(header);
      return this;
    }
    /**
     * @param contact - Contact details for a human to contact about the subscription. The primary
     *     use of this for system administrator troubleshooting.
     */
    public SubscriptionBuilder.Impl withContact(@NonNull ContactPoint... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details for a human to contact about the subscription. The primary
     *     use of this for system administrator troubleshooting.
     */
    public SubscriptionBuilder.Impl withContact(@NonNull Collection<ContactPoint> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public SubscriptionBuilder.Impl withContact(@NonNull ContactPointBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param timeout - If present, the maximum amount of time a server will allow before failing a
     *     notification attempt.
     */
    public SubscriptionBuilder.Impl withTimeout(@NonNull Integer timeout) {
      this.timeout = Optional.of(timeout);
      return this;
    }
    /**
     * @param content - How much of the resource content to deliver in the notification payload. The
     *     choices are an empty payload, only the resource id, or the full resource content.
     */
    public SubscriptionBuilder.Impl withContent(@NonNull String content) {
      this.content = Optional.of(content);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public SubscriptionBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param endpoint - The url that describes the actual end-point to send messages to. */
    public SubscriptionBuilder.Impl withEndpoint(@NonNull String endpoint) {
      this.endpoint = Optional.of(endpoint);
      return this;
    }
    /**
     * @param maxCount - If present, the maximum number of triggering resources that will be
     *     included in a notification bundle (e.g., a server will not include more than this number
     *     of trigger resources in a single notification). Note that this is not a strict limit on
     *     the number of entries in a bundle, as dependent resources can be included.
     */
    public SubscriptionBuilder.Impl withMaxCount(@NonNull Integer maxCount) {
      this.maxCount = Optional.of(maxCount);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public SubscriptionBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public SubscriptionBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public SubscriptionBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public SubscriptionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SubscriptionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubscriptionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this code system when it is
     *     represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public SubscriptionBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this code system when it is
     *     represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public SubscriptionBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public SubscriptionBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contentType - The mime type to send the payload in - either application/fhir+xml, or
     *     application/fhir+json. The MIME types "text/plain" and "text/html" may also be used for
     *     Email subscriptions.
     */
    public SubscriptionBuilder.Impl withContentType(@NonNull String contentType) {
      this.contentType = Optional.of(contentType);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public SubscriptionBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param heartbeatPeriod - If present, a 'hearbeat" notification (keepalive) is sent via this
     *     channel with an the interval period equal to this elements integer value in seconds. If
     *     not present, a heartbeat notification is not sent.
     */
    public SubscriptionBuilder.Impl withHeartbeatPeriod(@NonNull Integer heartbeatPeriod) {
      this.heartbeatPeriod = Optional.of(heartbeatPeriod);
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
    public SubscriptionBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public SubscriptionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubscriptionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param notificationUrlLocation - If present, where to place URLs of resources in
     *     notifications.
     */
    public SubscriptionBuilder.Impl withNotificationUrlLocation(
        @NonNull String notificationUrlLocation) {
      this.notificationUrlLocation = Optional.of(notificationUrlLocation);
      return this;
    }
    /**
     * @param filterBy - The filter properties to be applied to narrow the subscription topic
     *     stream. When multiple filters are applied, evaluates to true if all the conditions are
     *     met; otherwise it returns false. (i.e., logical AND).
     */
    public SubscriptionBuilder.Impl withFilterBy(@NonNull Subscription.FilterBy... filterBy) {
      this.filterBy = Arrays.asList(filterBy);
      return this;
    }
    /**
     * @param filterBy - The filter properties to be applied to narrow the subscription topic
     *     stream. When multiple filters are applied, evaluates to true if all the conditions are
     *     met; otherwise it returns false. (i.e., logical AND).
     */
    public SubscriptionBuilder.Impl withFilterBy(
        @NonNull Collection<Subscription.FilterBy> filterBy) {
      this.filterBy = Collections.unmodifiableCollection(filterBy);
      return this;
    }

    public SubscriptionBuilder.Impl withFilterBy(
        @NonNull Subscription_FilterByBuilder... filterBy) {
      this.filterBy = Arrays.stream(filterBy).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubscriptionBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Subscription build() {
      return new Subscription(
          OptionConverters.toScala(id),
          OptionConverters.toScala(end),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(name),
          topic,
          status,
          OptionConverters.toScala(reason),
          header.stream().collect(new LitSeqJCollector<>()),
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(timeout.map(x -> (Object) x)),
          OptionConverters.toScala(content),
          OptionConverters.toScala(language),
          OptionConverters.toScala(endpoint),
          OptionConverters.toScala(maxCount.map(x -> (Object) x)),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          channelType,
          OptionConverters.toScala(contentType),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(heartbeatPeriod.map(x -> (Object) x)),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(notificationUrlLocation),
          filterBy.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
