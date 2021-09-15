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
import com.babylonhealth.lit.hl7.ENDPOINT_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface EndpointBuilder extends DomainResourceBuilder {
  public Endpoint build();

  public static Impl init(
      ENDPOINT_STATUS status,
      String address,
      Collection<CodeableConcept> payloadType,
      Coding connectionType) {
    return new Impl(status, address, payloadType, connectionType);
  }

  public static Impl builder(
      ENDPOINT_STATUS status,
      String address,
      Collection<CodeableConceptBuilder> payloadType,
      CodingBuilder connectionType) {
    return new Impl(
        status,
        address,
        new LitSeq<>(payloadType).map(CodeableConceptBuilder::build),
        connectionType.build());
  }

  public class Impl implements EndpointBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> name = Optional.empty();
    private ENDPOINT_STATUS status;
    private Optional<Period> period = Optional.empty();
    private Collection<String> header = Collections.emptyList();
    private Collection<ContactPoint> contact = Collections.emptyList();
    private String address;
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<CodeableConcept> payloadType;
    private Optional<String> implicitRules = Optional.empty();
    private Coding connectionType;
    private Collection<String> payloadMimeType = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Reference> managingOrganization = Optional.empty();

    /**
     * Required fields for {@link Endpoint}
     *
     * @param status - active | suspended | error | off | test.
     * @param address - The uri that describes the actual end-point to connect to.
     * @param payloadType - The payload type describes the acceptable content that can be
     *     communicated on the endpoint.
     * @param connectionType - A coded value that represents the technical details of the usage of
     *     this endpoint, such as what WSDLs should be used in what way. (e.g.
     *     XDS.b/DICOM/cds-hook).
     */
    public Impl(
        ENDPOINT_STATUS status,
        String address,
        Collection<CodeableConcept> payloadType,
        Coding connectionType) {
      this.status = status;
      this.address = address;
      this.payloadType = payloadType;
      this.connectionType = connectionType;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public EndpointBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public EndpointBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public EndpointBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public EndpointBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public EndpointBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param name - A friendly name that this endpoint can be referred to with. */
    public EndpointBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /** @param period - The interval during which the endpoint is expected to be operational. */
    public EndpointBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public EndpointBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /** @param header - Additional headers / information to send as part of the notification. */
    public EndpointBuilder.Impl withHeader(@NonNull String... header) {
      this.header = Arrays.asList(header);
      return this;
    }
    /** @param header - Additional headers / information to send as part of the notification. */
    public EndpointBuilder.Impl withHeader(@NonNull Collection<String> header) {
      this.header = Collections.unmodifiableCollection(header);
      return this;
    }
    /**
     * @param contact - Contact details for a human to contact about the subscription. The primary
     *     use of this for system administrator troubleshooting.
     */
    public EndpointBuilder.Impl withContact(@NonNull ContactPoint... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details for a human to contact about the subscription. The primary
     *     use of this for system administrator troubleshooting.
     */
    public EndpointBuilder.Impl withContact(@NonNull Collection<ContactPoint> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public EndpointBuilder.Impl withContact(@NonNull ContactPointBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public EndpointBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public EndpointBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public EndpointBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public EndpointBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public EndpointBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public EndpointBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public EndpointBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Identifier for the organization that is used to identify the endpoint
     *     across multiple disparate systems.
     */
    public EndpointBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Identifier for the organization that is used to identify the endpoint
     *     across multiple disparate systems.
     */
    public EndpointBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public EndpointBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public EndpointBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param payloadMimeType - The mime type to send the payload in - e.g. application/fhir+xml,
     *     application/fhir+json. If the mime type is not specified, then the sender could send any
     *     content (including no content depending on the connectionType).
     */
    public EndpointBuilder.Impl withPayloadMimeType(@NonNull String... payloadMimeType) {
      this.payloadMimeType = Arrays.asList(payloadMimeType);
      return this;
    }
    /**
     * @param payloadMimeType - The mime type to send the payload in - e.g. application/fhir+xml,
     *     application/fhir+json. If the mime type is not specified, then the sender could send any
     *     content (including no content depending on the connectionType).
     */
    public EndpointBuilder.Impl withPayloadMimeType(@NonNull Collection<String> payloadMimeType) {
      this.payloadMimeType = Collections.unmodifiableCollection(payloadMimeType);
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
    public EndpointBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public EndpointBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public EndpointBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param managingOrganization - The organization that manages this endpoint (even if
     *     technically another organization is hosting this in the cloud, it is the organization
     *     associated with the data).
     */
    public EndpointBuilder.Impl withManagingOrganization(@NonNull Reference managingOrganization) {
      this.managingOrganization = Optional.of(managingOrganization);
      return this;
    }

    public EndpointBuilder.Impl withManagingOrganization(
        @NonNull ReferenceBuilder managingOrganization) {
      this.managingOrganization = Optional.of(managingOrganization.build());
      return this;
    }

    public EndpointBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Endpoint build() {
      return new Endpoint(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(name),
          status,
          OptionConverters.toScala(period),
          header.stream().collect(new LitSeqJCollector<>()),
          contact.stream().collect(new LitSeqJCollector<>()),
          address,
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          payloadType.stream().collect(new NonEmptyLitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          connectionType,
          payloadMimeType.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(managingOrganization),
          LitUtils.emptyMetaElMap());
    }
  }
}
