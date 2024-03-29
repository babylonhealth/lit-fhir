package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface CapabilityStatement_MessagingBuilder {
  public CapabilityStatement.Messaging build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements CapabilityStatement_MessagingBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Integer> reliableCache = Optional.empty();
    private Optional<String> documentation = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<CapabilityStatement$Messaging$Endpoint> endpoint = Collections.emptyList();
    private Collection<CapabilityStatement$Messaging$SupportedMessage> supportedMessage =
        Collections.emptyList();

    /** Required fields for {@link CapabilityStatement.Messaging} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CapabilityStatement_MessagingBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public CapabilityStatement_MessagingBuilder.Impl withExtension(
        @NonNull Extension... extension) {
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
    public CapabilityStatement_MessagingBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CapabilityStatement_MessagingBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param reliableCache */
    public CapabilityStatement_MessagingBuilder.Impl withReliableCache(
        @NonNull Integer reliableCache) {
      this.reliableCache = Optional.of(reliableCache);
      return this;
    }
    /** @param documentation */
    public CapabilityStatement_MessagingBuilder.Impl withDocumentation(
        @NonNull String documentation) {
      this.documentation = Optional.of(documentation);
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
    public CapabilityStatement_MessagingBuilder.Impl withModifierExtension(
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
    public CapabilityStatement_MessagingBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public CapabilityStatement_MessagingBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param endpoint */
    public CapabilityStatement_MessagingBuilder.Impl withEndpoint(
        @NonNull CapabilityStatement$Messaging$Endpoint... endpoint) {
      this.endpoint = Arrays.asList(endpoint);
      return this;
    }
    /** @param endpoint */
    public CapabilityStatement_MessagingBuilder.Impl withEndpoint(
        @NonNull Collection<CapabilityStatement$Messaging$Endpoint> endpoint) {
      this.endpoint = Collections.unmodifiableCollection(endpoint);
      return this;
    }

    public CapabilityStatement_MessagingBuilder.Impl withEndpoint(
        @NonNull CapabilityStatement_Messaging_EndpointBuilder... endpoint) {
      this.endpoint = Arrays.stream(endpoint).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param supportedMessage */
    public CapabilityStatement_MessagingBuilder.Impl withSupportedMessage(
        @NonNull CapabilityStatement$Messaging$SupportedMessage... supportedMessage) {
      this.supportedMessage = Arrays.asList(supportedMessage);
      return this;
    }
    /** @param supportedMessage */
    public CapabilityStatement_MessagingBuilder.Impl withSupportedMessage(
        @NonNull Collection<CapabilityStatement$Messaging$SupportedMessage> supportedMessage) {
      this.supportedMessage = Collections.unmodifiableCollection(supportedMessage);
      return this;
    }

    public CapabilityStatement_MessagingBuilder.Impl withSupportedMessage(
        @NonNull CapabilityStatement_Messaging_SupportedMessageBuilder... supportedMessage) {
      this.supportedMessage = Arrays.stream(supportedMessage).map(e -> e.build()).collect(toList());
      return this;
    }

    public CapabilityStatement.Messaging build() {
      return new CapabilityStatement.Messaging(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(reliableCache.map(x -> (Object) x)),
          OptionConverters.toScala(documentation),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          endpoint.stream().collect(new LitSeqJCollector<>()),
          supportedMessage.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
