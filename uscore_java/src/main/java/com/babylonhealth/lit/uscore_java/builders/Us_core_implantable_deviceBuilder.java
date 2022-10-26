package com.babylonhealth.lit.uscore_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.DEVICE_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.uscore.model.*;
import com.babylonhealth.lit.uscore_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Us_core_implantable_deviceBuilder extends DeviceBuilder {
  public Us_core_implantable_device build();

  public static Impl init(CodeableConcept _type, Reference patient) {
    return new Impl(_type, patient);
  }

  public static Impl builder(CodeableConceptBuilder _type, ReferenceBuilder patient) {
    return new Impl(_type.build(), patient.build());
  }

  public class Impl implements Us_core_implantable_deviceBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile(
                    "http://hl7.org/fhir/us/core/StructureDefinition/us-core-implantable-device")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private CodeableConcept _type;
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<Reference> owner = Optional.empty();
    private Optional<DEVICE_STATUS> status = Optional.empty();
    private Collection<CodeableConcept> safety = Collections.emptyList();
    private Optional<Reference> parent = Optional.empty();
    private Reference patient;
    private Collection<ContactPoint> contact = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<Reference> location = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> lotNumber = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<Reference> definition = Optional.empty();
    private Optional<String> partNumber = Optional.empty();
    private Optional<String> modelNumber = Optional.empty();
    private Collection<CodeableConcept> statusReason = Collections.emptyList();
    private Optional<String> manufacturer = Optional.empty();
    private Optional<String> serialNumber = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<FHIRDateTime> expirationDate = Optional.empty();
    private Optional<FHIRDateTime> manufactureDate = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<String> distinctIdentifier = Optional.empty();
    private Collection<Device.Version> version = Collections.emptyList();
    private Collection<Device.Property> property = Collections.emptyList();
    private Optional<Device.UdiCarrier> udiCarrier = Optional.empty();
    private Collection<Device.DeviceName> deviceName = Collections.emptyList();
    private Collection<Device.Specialization> specialization = Collections.emptyList();

    /**
     * Required fields for {@link Us_core_implantable_device}
     *
     * @param _type - The kind or type of device.
     * @param patient - Patient information, If the device is affixed to a person.
     */
    public Impl(CodeableConcept _type, Reference patient) {
      this._type = _type;
      this.patient = patient;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Us_core_implantable_deviceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param url - A network address on which the device may be contacted directly. */
    public Us_core_implantable_deviceBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public Us_core_implantable_deviceBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public Us_core_implantable_deviceBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param note - Descriptive information, usage information or implantation information that is
     *     not captured in an existing element.
     */
    public Us_core_implantable_deviceBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Descriptive information, usage information or implantation information that is
     *     not captured in an existing element.
     */
    public Us_core_implantable_deviceBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param owner - An organization that is responsible for the provision and ongoing maintenance
     *     of the device.
     */
    public Us_core_implantable_deviceBuilder.Impl withOwner(@NonNull Reference owner) {
      this.owner = Optional.of(owner);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withOwner(@NonNull ReferenceBuilder owner) {
      this.owner = Optional.of(owner.build());
      return this;
    }
    /** @param status - Status of the Device availability. */
    public Us_core_implantable_deviceBuilder.Impl withStatus(@NonNull DEVICE_STATUS status) {
      this.status = Optional.of(status);
      return this;
    }
    /**
     * @param safety - Provides additional safety characteristics about a medical device. For
     *     example devices containing latex.
     */
    public Us_core_implantable_deviceBuilder.Impl withSafety(@NonNull CodeableConcept... safety) {
      this.safety = Arrays.asList(safety);
      return this;
    }
    /**
     * @param safety - Provides additional safety characteristics about a medical device. For
     *     example devices containing latex.
     */
    public Us_core_implantable_deviceBuilder.Impl withSafety(
        @NonNull Collection<CodeableConcept> safety) {
      this.safety = Collections.unmodifiableCollection(safety);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withSafety(
        @NonNull CodeableConceptBuilder... safety) {
      this.safety = Arrays.stream(safety).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param parent - The parent device. */
    public Us_core_implantable_deviceBuilder.Impl withParent(@NonNull Reference parent) {
      this.parent = Optional.of(parent);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withParent(@NonNull ReferenceBuilder parent) {
      this.parent = Optional.of(parent.build());
      return this;
    }
    /**
     * @param contact - Contact details for an organization or a particular human that is
     *     responsible for the device.
     */
    public Us_core_implantable_deviceBuilder.Impl withContact(@NonNull ContactPoint... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details for an organization or a particular human that is
     *     responsible for the device.
     */
    public Us_core_implantable_deviceBuilder.Impl withContact(
        @NonNull Collection<ContactPoint> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withContact(
        @NonNull ContactPointBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public Us_core_implantable_deviceBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param location - The place where the device can be found. */
    public Us_core_implantable_deviceBuilder.Impl withLocation(@NonNull Reference location) {
      this.location = Optional.of(location);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withLocation(@NonNull ReferenceBuilder location) {
      this.location = Optional.of(location.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_implantable_deviceBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_implantable_deviceBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withContained(
        @NonNull ResourceBuilder... contained) {
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
    public Us_core_implantable_deviceBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Us_core_implantable_deviceBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param lotNumber - Lot number assigned by the manufacturer. */
    public Us_core_implantable_deviceBuilder.Impl withLotNumber(@NonNull String lotNumber) {
      this.lotNumber = Optional.of(lotNumber);
      return this;
    }
    /**
     * @param identifier - Unique instance identifiers assigned to a device by manufacturers other
     *     organizations or owners.
     */
    public Us_core_implantable_deviceBuilder.Impl withIdentifier(
        @NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Unique instance identifiers assigned to a device by manufacturers other
     *     organizations or owners.
     */
    public Us_core_implantable_deviceBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param definition - The reference to the definition for the device. */
    public Us_core_implantable_deviceBuilder.Impl withDefinition(@NonNull Reference definition) {
      this.definition = Optional.of(definition);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withDefinition(
        @NonNull ReferenceBuilder definition) {
      this.definition = Optional.of(definition.build());
      return this;
    }
    /** @param partNumber - The part number of the device. */
    public Us_core_implantable_deviceBuilder.Impl withPartNumber(@NonNull String partNumber) {
      this.partNumber = Optional.of(partNumber);
      return this;
    }
    /** @param modelNumber - The model number for the device. */
    public Us_core_implantable_deviceBuilder.Impl withModelNumber(@NonNull String modelNumber) {
      this.modelNumber = Optional.of(modelNumber);
      return this;
    }
    /** @param statusReason - Reason for the dtatus of the Device availability. */
    public Us_core_implantable_deviceBuilder.Impl withStatusReason(
        @NonNull CodeableConcept... statusReason) {
      this.statusReason = Arrays.asList(statusReason);
      return this;
    }
    /** @param statusReason - Reason for the dtatus of the Device availability. */
    public Us_core_implantable_deviceBuilder.Impl withStatusReason(
        @NonNull Collection<CodeableConcept> statusReason) {
      this.statusReason = Collections.unmodifiableCollection(statusReason);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withStatusReason(
        @NonNull CodeableConceptBuilder... statusReason) {
      this.statusReason = Arrays.stream(statusReason).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param manufacturer - A name of the manufacturer. */
    public Us_core_implantable_deviceBuilder.Impl withManufacturer(@NonNull String manufacturer) {
      this.manufacturer = Optional.of(manufacturer);
      return this;
    }
    /**
     * @param serialNumber - The serial number assigned by the organization when the device was
     *     manufactured.
     */
    public Us_core_implantable_deviceBuilder.Impl withSerialNumber(@NonNull String serialNumber) {
      this.serialNumber = Optional.of(serialNumber);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public Us_core_implantable_deviceBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param expirationDate - The date and time beyond which this device is no longer valid or
     *     should not be used (if applicable).
     */
    public Us_core_implantable_deviceBuilder.Impl withExpirationDate(
        @NonNull FHIRDateTime expirationDate) {
      this.expirationDate = Optional.of(expirationDate);
      return this;
    }
    /** @param manufactureDate - The date and time when the device was manufactured. */
    public Us_core_implantable_deviceBuilder.Impl withManufactureDate(
        @NonNull FHIRDateTime manufactureDate) {
      this.manufactureDate = Optional.of(manufactureDate);
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
    public Us_core_implantable_deviceBuilder.Impl withModifierExtension(
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
    public Us_core_implantable_deviceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param distinctIdentifier - The distinct identification string as required by regulation for
     *     a human cell, tissue, or cellular and tissue-based product.
     */
    public Us_core_implantable_deviceBuilder.Impl withDistinctIdentifier(
        @NonNull String distinctIdentifier) {
      this.distinctIdentifier = Optional.of(distinctIdentifier);
      return this;
    }
    /**
     * @param version - The actual design of the device or software version running on the device.
     */
    public Us_core_implantable_deviceBuilder.Impl withVersion(@NonNull Device.Version... version) {
      this.version = Arrays.asList(version);
      return this;
    }
    /**
     * @param version - The actual design of the device or software version running on the device.
     */
    public Us_core_implantable_deviceBuilder.Impl withVersion(
        @NonNull Collection<Device.Version> version) {
      this.version = Collections.unmodifiableCollection(version);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withVersion(
        @NonNull Device_VersionBuilder... version) {
      this.version = Arrays.stream(version).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param property - The actual configuration settings of a device as it actually operates,
     *     e.g., regulation status, time properties.
     */
    public Us_core_implantable_deviceBuilder.Impl withProperty(
        @NonNull Device.Property... property) {
      this.property = Arrays.asList(property);
      return this;
    }
    /**
     * @param property - The actual configuration settings of a device as it actually operates,
     *     e.g., regulation status, time properties.
     */
    public Us_core_implantable_deviceBuilder.Impl withProperty(
        @NonNull Collection<Device.Property> property) {
      this.property = Collections.unmodifiableCollection(property);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withProperty(
        @NonNull Device_PropertyBuilder... property) {
      this.property = Arrays.stream(property).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param udiCarrier - Unique device identifier (UDI) assigned to device label or package. Note
     *     that the Device may include multiple udiCarriers as it either may include just the
     *     udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have
     *     been sold.
     */
    public Us_core_implantable_deviceBuilder.Impl withUdiCarrier(
        @NonNull Device.UdiCarrier udiCarrier) {
      this.udiCarrier = Optional.of(udiCarrier);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withUdiCarrier(
        @NonNull Device_UdiCarrierBuilder udiCarrier) {
      this.udiCarrier = Optional.of(udiCarrier.build());
      return this;
    }
    /**
     * @param deviceName - This represents the manufacturer's name of the device as provided by the
     *     device, from a UDI label, or by a person describing the Device. This typically would be
     *     used when a person provides the name(s) or when the device represents one of the names
     *     available from DeviceDefinition.
     */
    public Us_core_implantable_deviceBuilder.Impl withDeviceName(
        @NonNull Device.DeviceName... deviceName) {
      this.deviceName = Arrays.asList(deviceName);
      return this;
    }
    /**
     * @param deviceName - This represents the manufacturer's name of the device as provided by the
     *     device, from a UDI label, or by a person describing the Device. This typically would be
     *     used when a person provides the name(s) or when the device represents one of the names
     *     available from DeviceDefinition.
     */
    public Us_core_implantable_deviceBuilder.Impl withDeviceName(
        @NonNull Collection<Device.DeviceName> deviceName) {
      this.deviceName = Collections.unmodifiableCollection(deviceName);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withDeviceName(
        @NonNull Device_DeviceNameBuilder... deviceName) {
      this.deviceName = Arrays.stream(deviceName).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param specialization - The capabilities supported on a device, the standards to which the
     *     device conforms for a particular purpose, and used for the communication.
     */
    public Us_core_implantable_deviceBuilder.Impl withSpecialization(
        @NonNull Device.Specialization... specialization) {
      this.specialization = Arrays.asList(specialization);
      return this;
    }
    /**
     * @param specialization - The capabilities supported on a device, the standards to which the
     *     device conforms for a particular purpose, and used for the communication.
     */
    public Us_core_implantable_deviceBuilder.Impl withSpecialization(
        @NonNull Collection<Device.Specialization> specialization) {
      this.specialization = Collections.unmodifiableCollection(specialization);
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withSpecialization(
        @NonNull Device_SpecializationBuilder... specialization) {
      this.specialization = Arrays.stream(specialization).map(e -> e.build()).collect(toList());
      return this;
    }

    public Us_core_implantable_deviceBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Us_core_implantable_device build() {
      return new Us_core_implantable_device(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          _type,
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(owner),
          OptionConverters.toScala(status),
          safety.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(parent),
          patient,
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          OptionConverters.toScala(location),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(lotNumber),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(definition),
          OptionConverters.toScala(partNumber),
          OptionConverters.toScala(modelNumber),
          statusReason.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(manufacturer),
          OptionConverters.toScala(serialNumber),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(expirationDate),
          OptionConverters.toScala(manufactureDate),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(distinctIdentifier),
          version.stream().collect(new LitSeqJCollector<>()),
          property.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(udiCarrier),
          deviceName.stream().collect(new LitSeqJCollector<>()),
          specialization.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
