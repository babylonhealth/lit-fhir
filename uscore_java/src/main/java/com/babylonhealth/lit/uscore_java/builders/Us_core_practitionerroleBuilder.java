package com.babylonhealth.lit.uscore_java.builders;

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
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.uscore.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.uscore_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.uscore_java.model.Unions.*;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Us_core_practitionerroleBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta =
      Optional.of(
          new MetaBuilder()
              .withProfile(
                  "http://hl7.org/fhir/us/core/StructureDefinition/us-core-practitionerrole")
              .build());
  private Optional<Narrative> text = Optional.empty();
  private Collection<CodeableConcept> code = Collections.emptyList();
  private Optional<Boolean> active = Optional.empty();
  private Optional<Period> period = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Reference> location = Collections.emptyList();
  private Collection<Reference> endpoint = Collections.emptyList();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<CodeableConcept> specialty = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Reference practitioner;
  private Reference organization;
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Reference> healthcareService = Collections.emptyList();
  private Collection<ContactPoint> telecom = Collections.emptyList();
  private Optional<String> availabilityExceptions = Optional.empty();
  private Collection<PractitionerRole.NotAvailable> notAvailable = Collections.emptyList();
  private Collection<PractitionerRole.AvailableTime> availableTime = Collections.emptyList();

  /**
   * Required fields for {@link Us_core_practitionerrole}
   *
   * @param practitioner - Practitioner that is able to provide the defined services for the
   *     organization.
   * @param organization - The organization where the Practitioner performs the roles associated.
   */
  public Us_core_practitionerroleBuilder(Reference practitioner, Reference organization) {
    this.practitioner = practitioner;
    this.organization = organization;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Us_core_practitionerroleBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public Us_core_practitionerroleBuilder withMeta(@NonNull Meta meta) {
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
  public Us_core_practitionerroleBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param code - Roles which this practitioner is authorized to perform for the organization. */
  public Us_core_practitionerroleBuilder withCode(@NonNull CodeableConcept... code) {
    this.code = Arrays.asList(code);
    return this;
  }
  /** @param code - Roles which this practitioner is authorized to perform for the organization. */
  public Us_core_practitionerroleBuilder withCode(@NonNull Collection<CodeableConcept> code) {
    this.code = Collections.unmodifiableCollection(code);
    return this;
  }
  /** @param active - Whether this practitioner role record is in active use. */
  public Us_core_practitionerroleBuilder withActive(@NonNull Boolean active) {
    this.active = Optional.of(active);
    return this;
  }
  /**
   * @param period - The period during which the person is authorized to act as a practitioner in
   *     these role(s) for the organization.
   */
  public Us_core_practitionerroleBuilder withPeriod(@NonNull Period period) {
    this.period = Optional.of(period);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public Us_core_practitionerroleBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /** @param location - The location(s) at which this practitioner provides care. */
  public Us_core_practitionerroleBuilder withLocation(@NonNull Reference... location) {
    this.location = Arrays.asList(location);
    return this;
  }
  /** @param location - The location(s) at which this practitioner provides care. */
  public Us_core_practitionerroleBuilder withLocation(@NonNull Collection<Reference> location) {
    this.location = Collections.unmodifiableCollection(location);
    return this;
  }
  /**
   * @param endpoint - Technical endpoints providing access to services operated for the
   *     practitioner with this role.
   */
  public Us_core_practitionerroleBuilder withEndpoint(@NonNull Reference... endpoint) {
    this.endpoint = Arrays.asList(endpoint);
    return this;
  }
  /**
   * @param endpoint - Technical endpoints providing access to services operated for the
   *     practitioner with this role.
   */
  public Us_core_practitionerroleBuilder withEndpoint(@NonNull Collection<Reference> endpoint) {
    this.endpoint = Collections.unmodifiableCollection(endpoint);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public Us_core_practitionerroleBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public Us_core_practitionerroleBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public Us_core_practitionerroleBuilder withExtension(@NonNull Extension... extension) {
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
  public Us_core_practitionerroleBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param specialty - Specific specialty of the practitioner. */
  public Us_core_practitionerroleBuilder withSpecialty(@NonNull CodeableConcept... specialty) {
    this.specialty = Arrays.asList(specialty);
    return this;
  }
  /** @param specialty - Specific specialty of the practitioner. */
  public Us_core_practitionerroleBuilder withSpecialty(
      @NonNull Collection<CodeableConcept> specialty) {
    this.specialty = Collections.unmodifiableCollection(specialty);
    return this;
  }
  /** @param identifier - Business Identifiers that are specific to a role/location. */
  public Us_core_practitionerroleBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - Business Identifiers that are specific to a role/location. */
  public Us_core_practitionerroleBuilder withIdentifier(
      @NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public Us_core_practitionerroleBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
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
  public Us_core_practitionerroleBuilder withModifierExtension(
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
  public Us_core_practitionerroleBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param healthcareService - The list of healthcare services that this worker provides for this
   *     role's Organization/Location(s).
   */
  public Us_core_practitionerroleBuilder withHealthcareService(
      @NonNull Reference... healthcareService) {
    this.healthcareService = Arrays.asList(healthcareService);
    return this;
  }
  /**
   * @param healthcareService - The list of healthcare services that this worker provides for this
   *     role's Organization/Location(s).
   */
  public Us_core_practitionerroleBuilder withHealthcareService(
      @NonNull Collection<Reference> healthcareService) {
    this.healthcareService = Collections.unmodifiableCollection(healthcareService);
    return this;
  }
  /** @param telecom - Contact details that are specific to the role/location/service. */
  public Us_core_practitionerroleBuilder withTelecom(@NonNull ContactPoint... telecom) {
    this.telecom = Arrays.asList(telecom);
    return this;
  }
  /** @param telecom - Contact details that are specific to the role/location/service. */
  public Us_core_practitionerroleBuilder withTelecom(@NonNull Collection<ContactPoint> telecom) {
    this.telecom = Collections.unmodifiableCollection(telecom);
    return this;
  }
  /**
   * @param availabilityExceptions - A description of site availability exceptions, e.g. public
   *     holiday availability. Succinctly describing all possible exceptions to normal site
   *     availability as details in the available Times and not available Times.
   */
  public Us_core_practitionerroleBuilder withAvailabilityExceptions(
      @NonNull String availabilityExceptions) {
    this.availabilityExceptions = Optional.of(availabilityExceptions);
    return this;
  }
  /**
   * @param notAvailable - The practitioner is not available or performing this role during this
   *     period of time due to the provided reason.
   */
  public Us_core_practitionerroleBuilder withNotAvailable(
      @NonNull PractitionerRole.NotAvailable... notAvailable) {
    this.notAvailable = Arrays.asList(notAvailable);
    return this;
  }
  /**
   * @param notAvailable - The practitioner is not available or performing this role during this
   *     period of time due to the provided reason.
   */
  public Us_core_practitionerroleBuilder withNotAvailable(
      @NonNull Collection<PractitionerRole.NotAvailable> notAvailable) {
    this.notAvailable = Collections.unmodifiableCollection(notAvailable);
    return this;
  }
  /**
   * @param availableTime - A collection of times the practitioner is available or performing this
   *     role at the location and/or healthcareservice.
   */
  public Us_core_practitionerroleBuilder withAvailableTime(
      @NonNull PractitionerRole.AvailableTime... availableTime) {
    this.availableTime = Arrays.asList(availableTime);
    return this;
  }
  /**
   * @param availableTime - A collection of times the practitioner is available or performing this
   *     role at the location and/or healthcareservice.
   */
  public Us_core_practitionerroleBuilder withAvailableTime(
      @NonNull Collection<PractitionerRole.AvailableTime> availableTime) {
    this.availableTime = Collections.unmodifiableCollection(availableTime);
    return this;
  }

  public Us_core_practitionerroleBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Us_core_practitionerrole build() {
    return new Us_core_practitionerrole(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        code.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(active.map(x -> (Object) x)),
        OptionConverters.toScala(period),
        OptionConverters.toScala(language),
        location.stream().collect(new LitSeqJCollector<>()),
        endpoint.stream().collect(new LitSeqJCollector<>()),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        specialty.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        practitioner,
        organization,
        OptionConverters.toScala(implicitRules),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        healthcareService.stream().collect(new LitSeqJCollector<>()),
        telecom.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(availabilityExceptions),
        notAvailable.stream().collect(new LitSeqJCollector<>()),
        availableTime.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
