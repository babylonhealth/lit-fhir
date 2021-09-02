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
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class HealthcareServiceBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Collection<CodeableConcept> _type = Collections.emptyList();
  private Optional<String> name = Optional.empty();
  private Optional<Attachment> photo = Optional.empty();
  private Optional<Boolean> active = Optional.empty();
  private Optional<String> comment = Optional.empty();
  private Collection<ContactPoint> telecom = Collections.emptyList();
  private Collection<CodeableConcept> program = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<CodeableConcept> category = Collections.emptyList();
  private Collection<Reference> location = Collections.emptyList();
  private Collection<Reference> endpoint = Collections.emptyList();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<CodeableConcept> specialty = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<Reference> providedBy = Optional.empty();
  private Optional<String> extraDetails = Optional.empty();
  private Collection<Reference> coverageArea = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<CodeableConcept> communication = Collections.emptyList();
  private Collection<CodeableConcept> characteristic = Collections.emptyList();
  private Collection<CodeableConcept> referralMethod = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Boolean> appointmentRequired = Optional.empty();
  private Collection<CodeableConcept> serviceProvisionCode = Collections.emptyList();
  private Optional<String> availabilityExceptions = Optional.empty();
  private Collection<HealthcareService.Eligibility> eligibility = Collections.emptyList();
  private Collection<HealthcareService.NotAvailable> notAvailable = Collections.emptyList();
  private Collection<HealthcareService.AvailableTime> availableTime = Collections.emptyList();

  /** Required fields for {@link HealthcareService} */
  public HealthcareServiceBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public HealthcareServiceBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public HealthcareServiceBuilder withMeta(@NonNull Meta meta) {
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
  public HealthcareServiceBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param _type - The specific type of service that may be delivered or performed. */
  public HealthcareServiceBuilder withType(@NonNull CodeableConcept... _type) {
    this._type = Arrays.asList(_type);
    return this;
  }
  /** @param _type - The specific type of service that may be delivered or performed. */
  public HealthcareServiceBuilder withType(@NonNull Collection<CodeableConcept> _type) {
    this._type = Collections.unmodifiableCollection(_type);
    return this;
  }
  /**
   * @param name - Further description of the service as it would be presented to a consumer while
   *     searching.
   */
  public HealthcareServiceBuilder withName(@NonNull String name) {
    this.name = Optional.of(name);
    return this;
  }
  /**
   * @param photo - If there is a photo/symbol associated with this HealthcareService, it may be
   *     included here to facilitate quick identification of the service in a list.
   */
  public HealthcareServiceBuilder withPhoto(@NonNull Attachment photo) {
    this.photo = Optional.of(photo);
    return this;
  }
  /**
   * @param active - This flag is used to mark the record to not be used. This is not used when a
   *     center is closed for maintenance, or for holidays, the notAvailable period is to be used
   *     for this.
   */
  public HealthcareServiceBuilder withActive(@NonNull Boolean active) {
    this.active = Optional.of(active);
    return this;
  }
  /**
   * @param comment - Any additional description of the service and/or any specific issues not
   *     covered by the other attributes, which can be displayed as further detail under the
   *     serviceName.
   */
  public HealthcareServiceBuilder withComment(@NonNull String comment) {
    this.comment = Optional.of(comment);
    return this;
  }
  /** @param telecom - List of contacts related to this specific healthcare service. */
  public HealthcareServiceBuilder withTelecom(@NonNull ContactPoint... telecom) {
    this.telecom = Arrays.asList(telecom);
    return this;
  }
  /** @param telecom - List of contacts related to this specific healthcare service. */
  public HealthcareServiceBuilder withTelecom(@NonNull Collection<ContactPoint> telecom) {
    this.telecom = Collections.unmodifiableCollection(telecom);
    return this;
  }
  /** @param program - Programs that this service is applicable to. */
  public HealthcareServiceBuilder withProgram(@NonNull CodeableConcept... program) {
    this.program = Arrays.asList(program);
    return this;
  }
  /** @param program - Programs that this service is applicable to. */
  public HealthcareServiceBuilder withProgram(@NonNull Collection<CodeableConcept> program) {
    this.program = Collections.unmodifiableCollection(program);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public HealthcareServiceBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /** @param category - Identifies the broad category of service being performed or delivered. */
  public HealthcareServiceBuilder withCategory(@NonNull CodeableConcept... category) {
    this.category = Arrays.asList(category);
    return this;
  }
  /** @param category - Identifies the broad category of service being performed or delivered. */
  public HealthcareServiceBuilder withCategory(@NonNull Collection<CodeableConcept> category) {
    this.category = Collections.unmodifiableCollection(category);
    return this;
  }
  /** @param location - The location(s) where this healthcare service may be provided. */
  public HealthcareServiceBuilder withLocation(@NonNull Reference... location) {
    this.location = Arrays.asList(location);
    return this;
  }
  /** @param location - The location(s) where this healthcare service may be provided. */
  public HealthcareServiceBuilder withLocation(@NonNull Collection<Reference> location) {
    this.location = Collections.unmodifiableCollection(location);
    return this;
  }
  /**
   * @param endpoint - Technical endpoints providing access to services operated for the specific
   *     healthcare services defined at this resource.
   */
  public HealthcareServiceBuilder withEndpoint(@NonNull Reference... endpoint) {
    this.endpoint = Arrays.asList(endpoint);
    return this;
  }
  /**
   * @param endpoint - Technical endpoints providing access to services operated for the specific
   *     healthcare services defined at this resource.
   */
  public HealthcareServiceBuilder withEndpoint(@NonNull Collection<Reference> endpoint) {
    this.endpoint = Collections.unmodifiableCollection(endpoint);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public HealthcareServiceBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public HealthcareServiceBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public HealthcareServiceBuilder withExtension(@NonNull Extension... extension) {
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
  public HealthcareServiceBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param specialty - Collection of specialties handled by the service site. This is more of a
   *     medical term.
   */
  public HealthcareServiceBuilder withSpecialty(@NonNull CodeableConcept... specialty) {
    this.specialty = Arrays.asList(specialty);
    return this;
  }
  /**
   * @param specialty - Collection of specialties handled by the service site. This is more of a
   *     medical term.
   */
  public HealthcareServiceBuilder withSpecialty(@NonNull Collection<CodeableConcept> specialty) {
    this.specialty = Collections.unmodifiableCollection(specialty);
    return this;
  }
  /** @param identifier - External identifiers for this item. */
  public HealthcareServiceBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - External identifiers for this item. */
  public HealthcareServiceBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param providedBy - The organization that provides this healthcare service. */
  public HealthcareServiceBuilder withProvidedBy(@NonNull Reference providedBy) {
    this.providedBy = Optional.of(providedBy);
    return this;
  }
  /**
   * @param extraDetails - Extra details about the service that can't be placed in the other fields.
   */
  public HealthcareServiceBuilder withExtraDetails(@NonNull String extraDetails) {
    this.extraDetails = Optional.of(extraDetails);
    return this;
  }
  /**
   * @param coverageArea - The location(s) that this service is available to (not where the service
   *     is provided).
   */
  public HealthcareServiceBuilder withCoverageArea(@NonNull Reference... coverageArea) {
    this.coverageArea = Arrays.asList(coverageArea);
    return this;
  }
  /**
   * @param coverageArea - The location(s) that this service is available to (not where the service
   *     is provided).
   */
  public HealthcareServiceBuilder withCoverageArea(@NonNull Collection<Reference> coverageArea) {
    this.coverageArea = Collections.unmodifiableCollection(coverageArea);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public HealthcareServiceBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param communication - Some services are specifically made available in multiple languages,
   *     this property permits a directory to declare the languages this is offered in. Typically
   *     this is only provided where a service operates in communities with mixed languages used.
   */
  public HealthcareServiceBuilder withCommunication(@NonNull CodeableConcept... communication) {
    this.communication = Arrays.asList(communication);
    return this;
  }
  /**
   * @param communication - Some services are specifically made available in multiple languages,
   *     this property permits a directory to declare the languages this is offered in. Typically
   *     this is only provided where a service operates in communities with mixed languages used.
   */
  public HealthcareServiceBuilder withCommunication(
      @NonNull Collection<CodeableConcept> communication) {
    this.communication = Collections.unmodifiableCollection(communication);
    return this;
  }
  /** @param characteristic - Collection of characteristics (attributes). */
  public HealthcareServiceBuilder withCharacteristic(@NonNull CodeableConcept... characteristic) {
    this.characteristic = Arrays.asList(characteristic);
    return this;
  }
  /** @param characteristic - Collection of characteristics (attributes). */
  public HealthcareServiceBuilder withCharacteristic(
      @NonNull Collection<CodeableConcept> characteristic) {
    this.characteristic = Collections.unmodifiableCollection(characteristic);
    return this;
  }
  /**
   * @param referralMethod - Ways that the service accepts referrals, if this is not provided then
   *     it is implied that no referral is required.
   */
  public HealthcareServiceBuilder withReferralMethod(@NonNull CodeableConcept... referralMethod) {
    this.referralMethod = Arrays.asList(referralMethod);
    return this;
  }
  /**
   * @param referralMethod - Ways that the service accepts referrals, if this is not provided then
   *     it is implied that no referral is required.
   */
  public HealthcareServiceBuilder withReferralMethod(
      @NonNull Collection<CodeableConcept> referralMethod) {
    this.referralMethod = Collections.unmodifiableCollection(referralMethod);
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
  public HealthcareServiceBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public HealthcareServiceBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param appointmentRequired - Indicates whether or not a prospective consumer will require an
   *     appointment for a particular service at a site to be provided by the Organization.
   *     Indicates if an appointment is required for access to this service.
   */
  public HealthcareServiceBuilder withAppointmentRequired(@NonNull Boolean appointmentRequired) {
    this.appointmentRequired = Optional.of(appointmentRequired);
    return this;
  }
  /**
   * @param serviceProvisionCode - The code(s) that detail the conditions under which the healthcare
   *     service is available/offered.
   */
  public HealthcareServiceBuilder withServiceProvisionCode(
      @NonNull CodeableConcept... serviceProvisionCode) {
    this.serviceProvisionCode = Arrays.asList(serviceProvisionCode);
    return this;
  }
  /**
   * @param serviceProvisionCode - The code(s) that detail the conditions under which the healthcare
   *     service is available/offered.
   */
  public HealthcareServiceBuilder withServiceProvisionCode(
      @NonNull Collection<CodeableConcept> serviceProvisionCode) {
    this.serviceProvisionCode = Collections.unmodifiableCollection(serviceProvisionCode);
    return this;
  }
  /**
   * @param availabilityExceptions - A description of site availability exceptions, e.g. public
   *     holiday availability. Succinctly describing all possible exceptions to normal site
   *     availability as details in the available Times and not available Times.
   */
  public HealthcareServiceBuilder withAvailabilityExceptions(
      @NonNull String availabilityExceptions) {
    this.availabilityExceptions = Optional.of(availabilityExceptions);
    return this;
  }
  /**
   * @param eligibility - Does this service have specific eligibility requirements that need to be
   *     met in order to use the service?
   */
  public HealthcareServiceBuilder withEligibility(
      @NonNull HealthcareService.Eligibility... eligibility) {
    this.eligibility = Arrays.asList(eligibility);
    return this;
  }
  /**
   * @param eligibility - Does this service have specific eligibility requirements that need to be
   *     met in order to use the service?
   */
  public HealthcareServiceBuilder withEligibility(
      @NonNull Collection<HealthcareService.Eligibility> eligibility) {
    this.eligibility = Collections.unmodifiableCollection(eligibility);
    return this;
  }
  /**
   * @param notAvailable - The HealthcareService is not available during this period of time due to
   *     the provided reason.
   */
  public HealthcareServiceBuilder withNotAvailable(
      @NonNull HealthcareService.NotAvailable... notAvailable) {
    this.notAvailable = Arrays.asList(notAvailable);
    return this;
  }
  /**
   * @param notAvailable - The HealthcareService is not available during this period of time due to
   *     the provided reason.
   */
  public HealthcareServiceBuilder withNotAvailable(
      @NonNull Collection<HealthcareService.NotAvailable> notAvailable) {
    this.notAvailable = Collections.unmodifiableCollection(notAvailable);
    return this;
  }
  /** @param availableTime - A collection of times that the Service Site is available. */
  public HealthcareServiceBuilder withAvailableTime(
      @NonNull HealthcareService.AvailableTime... availableTime) {
    this.availableTime = Arrays.asList(availableTime);
    return this;
  }
  /** @param availableTime - A collection of times that the Service Site is available. */
  public HealthcareServiceBuilder withAvailableTime(
      @NonNull Collection<HealthcareService.AvailableTime> availableTime) {
    this.availableTime = Collections.unmodifiableCollection(availableTime);
    return this;
  }

  public HealthcareServiceBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public HealthcareService build() {
    return new HealthcareService(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        _type.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(name),
        OptionConverters.toScala(photo),
        OptionConverters.toScala(active.map(x -> (Object) x)),
        OptionConverters.toScala(comment),
        telecom.stream().collect(new LitSeqJCollector<>()),
        program.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(language),
        category.stream().collect(new LitSeqJCollector<>()),
        location.stream().collect(new LitSeqJCollector<>()),
        endpoint.stream().collect(new LitSeqJCollector<>()),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        specialty.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(providedBy),
        OptionConverters.toScala(extraDetails),
        coverageArea.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        communication.stream().collect(new LitSeqJCollector<>()),
        characteristic.stream().collect(new LitSeqJCollector<>()),
        referralMethod.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(appointmentRequired.map(x -> (Object) x)),
        serviceProvisionCode.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(availabilityExceptions),
        eligibility.stream().collect(new LitSeqJCollector<>()),
        notAvailable.stream().collect(new LitSeqJCollector<>()),
        availableTime.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
