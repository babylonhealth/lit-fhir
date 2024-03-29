package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.SUBSCRIPTION_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface SubscriptionBuilder extends DomainResourceBuilder {
  public Subscription build();

  public static Impl init(
      SUBSCRIPTION_STATUS status, String reason, String criteria, Subscription.Channel channel) {
    return new Impl(status, reason, criteria, channel);
  }

  public static Impl builder(
      SUBSCRIPTION_STATUS status,
      String reason,
      String criteria,
      Subscription_ChannelBuilder channel) {
    return new Impl(status, reason, criteria, channel.build());
  }

  public class Impl implements SubscriptionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<ZonedDateTime> end = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> error = Optional.empty();
    private SUBSCRIPTION_STATUS status;
    private String reason;
    private Collection<ContactPoint> contact = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private String criteria;
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Subscription.Channel channel;

    /**
     * Required fields for {@link Subscription}
     *
     * @param status - The status of the subscription, which marks the server state for managing the
     *     subscription.
     * @param reason - A description of why this subscription is defined.
     * @param criteria - The rules that the server should use to determine when to generate
     *     notifications for this subscription.
     * @param channel - Details where to send notifications when resources are received that meet
     *     the criteria.
     */
    public Impl(
        SUBSCRIPTION_STATUS status, String reason, String criteria, Subscription.Channel channel) {
      this.status = status;
      this.reason = reason;
      this.criteria = criteria;
      this.channel = channel;
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
    /**
     * @param error - A record of the last error that occurred when the server processed a
     *     notification.
     */
    public SubscriptionBuilder.Impl withError(@NonNull String error) {
      this.error = Optional.of(error);
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
    /** @param language - The base language in which the resource is written. */
    public SubscriptionBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SubscriptionBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
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
          OptionConverters.toScala(error),
          status,
          reason,
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          criteria,
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          channel,
          LitUtils.emptyMetaElMap());
    }
  }
}
