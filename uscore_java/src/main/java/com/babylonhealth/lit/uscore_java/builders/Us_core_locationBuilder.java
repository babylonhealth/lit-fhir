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
import com.babylonhealth.lit.hl7.LOCATION_MODE;
import com.babylonhealth.lit.hl7.LOCATION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Us_core_locationBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta =
      Optional.of(
          new MetaBuilder()
              .withProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-location")
              .build());
  private Optional<Narrative> text = Optional.empty();
  private String name;
  private Optional<LOCATION_MODE> mode = Optional.empty();
  private Collection<CodeableConcept> _type = Collections.emptyList();
  private Collection<String> alias = Collections.emptyList();
  private Optional<LOCATION_STATUS> status = Optional.empty();
  private Optional<Reference> partOf = Optional.empty();
  private Collection<ContactPoint> telecom = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Reference> endpoint = Collections.emptyList();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private Optional<CodeableConcept> physicalType = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Coding> operationalStatus = Optional.empty();
  private Optional<Address> address = Optional.empty();
  private Optional<Reference> managingOrganization = Optional.empty();
  private Optional<String> availabilityExceptions = Optional.empty();
  private Optional<Location.Position> position = Optional.empty();
  private Collection<Location.HoursOfOperation> hoursOfOperation = Collections.emptyList();

  /**
   * Required fields for {@link Us_core_location}
   *
   * @param name - Name of the location as used by humans. Does not need to be unique.
   */
  public Us_core_locationBuilder(String name) {
    this.name = name;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Us_core_locationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public Us_core_locationBuilder withMeta(@NonNull Meta meta) {
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
  public Us_core_locationBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param mode - Indicates whether a resource instance represents a specific location or a class
   *     of locations.
   */
  public Us_core_locationBuilder withMode(@NonNull LOCATION_MODE mode) {
    this.mode = Optional.of(mode);
    return this;
  }
  /** @param _type - Indicates the type of function performed at the location. */
  public Us_core_locationBuilder withType(@NonNull CodeableConcept... _type) {
    this._type = Arrays.asList(_type);
    return this;
  }
  /** @param _type - Indicates the type of function performed at the location. */
  public Us_core_locationBuilder withType(@NonNull Collection<CodeableConcept> _type) {
    this._type = Collections.unmodifiableCollection(_type);
    return this;
  }
  /**
   * @param alias - A list of alternate names that the location is known as, or was known as, in the
   *     past.
   */
  public Us_core_locationBuilder withAlias(@NonNull String... alias) {
    this.alias = Arrays.asList(alias);
    return this;
  }
  /**
   * @param alias - A list of alternate names that the location is known as, or was known as, in the
   *     past.
   */
  public Us_core_locationBuilder withAlias(@NonNull Collection<String> alias) {
    this.alias = Collections.unmodifiableCollection(alias);
    return this;
  }
  /**
   * @param status - The status property covers the general availability of the resource, not the
   *     current value which may be covered by the operationStatus, or by a schedule/slots if they
   *     are configured for the location.
   */
  public Us_core_locationBuilder withStatus(@NonNull LOCATION_STATUS status) {
    this.status = Optional.of(status);
    return this;
  }
  /** @param partOf - Another Location of which this Location is physically a part of. */
  public Us_core_locationBuilder withPartOf(@NonNull Reference partOf) {
    this.partOf = Optional.of(partOf);
    return this;
  }
  /**
   * @param telecom - The contact details of communication devices available at the location. This
   *     can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.
   */
  public Us_core_locationBuilder withTelecom(@NonNull ContactPoint... telecom) {
    this.telecom = Arrays.asList(telecom);
    return this;
  }
  /**
   * @param telecom - The contact details of communication devices available at the location. This
   *     can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.
   */
  public Us_core_locationBuilder withTelecom(@NonNull Collection<ContactPoint> telecom) {
    this.telecom = Collections.unmodifiableCollection(telecom);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public Us_core_locationBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param endpoint - Technical endpoints providing access to services operated for the location.
   */
  public Us_core_locationBuilder withEndpoint(@NonNull Reference... endpoint) {
    this.endpoint = Arrays.asList(endpoint);
    return this;
  }
  /**
   * @param endpoint - Technical endpoints providing access to services operated for the location.
   */
  public Us_core_locationBuilder withEndpoint(@NonNull Collection<Reference> endpoint) {
    this.endpoint = Collections.unmodifiableCollection(endpoint);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public Us_core_locationBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public Us_core_locationBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public Us_core_locationBuilder withExtension(@NonNull Extension... extension) {
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
  public Us_core_locationBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param identifier - Unique code or number identifying the location to its users. */
  public Us_core_locationBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - Unique code or number identifying the location to its users. */
  public Us_core_locationBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param description - Description of the Location, which helps in finding or referencing the
   *     place.
   */
  public Us_core_locationBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /** @param physicalType - Physical form of the location, e.g. building, room, vehicle, road. */
  public Us_core_locationBuilder withPhysicalType(@NonNull CodeableConcept physicalType) {
    this.physicalType = Optional.of(physicalType);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public Us_core_locationBuilder withImplicitRules(@NonNull String implicitRules) {
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
  public Us_core_locationBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public Us_core_locationBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param operationalStatus - The operational status covers operation values most relevant to beds
   *     (but can also apply to rooms/units/chairs/etc. such as an isolation unit/dialysis chair).
   *     This typically covers concepts such as contamination, housekeeping, and other activities
   *     like maintenance.
   */
  public Us_core_locationBuilder withOperationalStatus(@NonNull Coding operationalStatus) {
    this.operationalStatus = Optional.of(operationalStatus);
    return this;
  }
  /** @param address - Physical location. */
  public Us_core_locationBuilder withAddress(@NonNull Address address) {
    this.address = Optional.of(address);
    return this;
  }
  /**
   * @param managingOrganization - The organization responsible for the provisioning and upkeep of
   *     the location.
   */
  public Us_core_locationBuilder withManagingOrganization(@NonNull Reference managingOrganization) {
    this.managingOrganization = Optional.of(managingOrganization);
    return this;
  }
  /**
   * @param availabilityExceptions - A description of when the locations opening ours are different
   *     to normal, e.g. public holiday availability. Succinctly describing all possible exceptions
   *     to normal site availability as detailed in the opening hours Times.
   */
  public Us_core_locationBuilder withAvailabilityExceptions(
      @NonNull String availabilityExceptions) {
    this.availabilityExceptions = Optional.of(availabilityExceptions);
    return this;
  }
  /**
   * @param position - The absolute geographic location of the Location, expressed using the WGS84
   *     datum (This is the same co-ordinate system used in KML).
   */
  public Us_core_locationBuilder withPosition(@NonNull Location.Position position) {
    this.position = Optional.of(position);
    return this;
  }
  /** @param hoursOfOperation - What days/times during a week is this location usually open. */
  public Us_core_locationBuilder withHoursOfOperation(
      @NonNull Location.HoursOfOperation... hoursOfOperation) {
    this.hoursOfOperation = Arrays.asList(hoursOfOperation);
    return this;
  }
  /** @param hoursOfOperation - What days/times during a week is this location usually open. */
  public Us_core_locationBuilder withHoursOfOperation(
      @NonNull Collection<Location.HoursOfOperation> hoursOfOperation) {
    this.hoursOfOperation = Collections.unmodifiableCollection(hoursOfOperation);
    return this;
  }

  public Us_core_locationBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Us_core_location build() {
    return new Us_core_location(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        name,
        OptionConverters.toScala(mode),
        _type.stream().collect(new LitSeqJCollector<>()),
        alias.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(status),
        OptionConverters.toScala(partOf),
        telecom.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(language),
        endpoint.stream().collect(new LitSeqJCollector<>()),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(description),
        OptionConverters.toScala(physicalType),
        OptionConverters.toScala(implicitRules),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(operationalStatus),
        OptionConverters.toScala(address),
        OptionConverters.toScala(managingOrganization),
        OptionConverters.toScala(availabilityExceptions),
        OptionConverters.toScala(position),
        hoursOfOperation.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
