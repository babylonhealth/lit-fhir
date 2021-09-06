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

public interface DeviceDefinitionBuilder extends DomainResourceBuilder {
  public DeviceDefinition build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static Choice_1128709984 manufacturer(Reference r) {
    return new Choice_1128709984(r);
  }

  public static Choice_1128709984 manufacturer(String s) {
    return new Choice_1128709984(s);
  }

  public class Impl implements DeviceDefinitionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<Reference> owner = Optional.empty();
    private Collection<CodeableConcept> safety = Collections.emptyList();
    private Collection<String> version = Collections.emptyList();
    private Collection<ContactPoint> contact = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<Quantity> quantity = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<String> modelNumber = Optional.empty();
    private Collection<CodeableConcept> languageCode = Collections.emptyList();
    private Optional<Reference> parentDevice = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<Choice_1128709984> manufacturer = Optional.empty();
    private Collection<Choice> shelfLifeStorage = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<String> onlineInformation = Optional.empty();
    private Optional<Choice> physicalCharacteristics = Optional.empty();
    private Collection<DeviceDefinition.Property> property = Collections.emptyList();
    private Collection<DeviceDefinition.DeviceName> deviceName = Collections.emptyList();
    private Collection<DeviceDefinition.Capability> capability = Collections.emptyList();
    private Collection<DeviceDefinition.Material> material = Collections.emptyList();
    private Collection<DeviceDefinition.Specialization> specialization = Collections.emptyList();
    private Collection<DeviceDefinition.UdiDeviceIdentifier> udiDeviceIdentifier =
        Collections.emptyList();

    /** Required fields for {@link DeviceDefinition} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public DeviceDefinitionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param url - A network address on which the device may be contacted directly. */
    public DeviceDefinitionBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public DeviceDefinitionBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public DeviceDefinitionBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param _type - What kind of device or device system this is. */
    public DeviceDefinitionBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /**
     * @param note - Descriptive information, usage information or implantation information that is
     *     not captured in an existing element.
     */
    public DeviceDefinitionBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Descriptive information, usage information or implantation information that is
     *     not captured in an existing element.
     */
    public DeviceDefinitionBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param owner - An organization that is responsible for the provision and ongoing maintenance
     *     of the device.
     */
    public DeviceDefinitionBuilder.Impl withOwner(@NonNull Reference owner) {
      this.owner = Optional.of(owner);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withOwner(@NonNull ReferenceBuilder owner) {
      this.owner = Optional.of(owner.build());
      return this;
    }
    /** @param safety - Safety characteristics of the device. */
    public DeviceDefinitionBuilder.Impl withSafety(@NonNull CodeableConcept... safety) {
      this.safety = Arrays.asList(safety);
      return this;
    }
    /** @param safety - Safety characteristics of the device. */
    public DeviceDefinitionBuilder.Impl withSafety(@NonNull Collection<CodeableConcept> safety) {
      this.safety = Collections.unmodifiableCollection(safety);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withSafety(@NonNull CodeableConceptBuilder... safety) {
      this.safety = Arrays.stream(safety).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param version - The available versions of the device, e.g., software versions. */
    public DeviceDefinitionBuilder.Impl withVersion(@NonNull String... version) {
      this.version = Arrays.asList(version);
      return this;
    }
    /** @param version - The available versions of the device, e.g., software versions. */
    public DeviceDefinitionBuilder.Impl withVersion(@NonNull Collection<String> version) {
      this.version = Collections.unmodifiableCollection(version);
      return this;
    }
    /**
     * @param contact - Contact details for an organization or a particular human that is
     *     responsible for the device.
     */
    public DeviceDefinitionBuilder.Impl withContact(@NonNull ContactPoint... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details for an organization or a particular human that is
     *     responsible for the device.
     */
    public DeviceDefinitionBuilder.Impl withContact(@NonNull Collection<ContactPoint> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withContact(@NonNull ContactPointBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public DeviceDefinitionBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param quantity - The quantity of the device present in the packaging (e.g. the number of
     *     devices present in a pack, or the number of devices in the same package of the medicinal
     *     product).
     */
    public DeviceDefinitionBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withQuantity(@NonNull QuantityBuilder quantity) {
      this.quantity = Optional.of(quantity.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public DeviceDefinitionBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public DeviceDefinitionBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public DeviceDefinitionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public DeviceDefinitionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Unique instance identifiers assigned to a device by the software,
     *     manufacturers, other organizations or owners. For example: handle ID.
     */
    public DeviceDefinitionBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Unique instance identifiers assigned to a device by the software,
     *     manufacturers, other organizations or owners. For example: handle ID.
     */
    public DeviceDefinitionBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param modelNumber - The model number for the device. */
    public DeviceDefinitionBuilder.Impl withModelNumber(@NonNull String modelNumber) {
      this.modelNumber = Optional.of(modelNumber);
      return this;
    }
    /**
     * @param languageCode - Language code for the human-readable text strings produced by the
     *     device (all supported).
     */
    public DeviceDefinitionBuilder.Impl withLanguageCode(@NonNull CodeableConcept... languageCode) {
      this.languageCode = Arrays.asList(languageCode);
      return this;
    }
    /**
     * @param languageCode - Language code for the human-readable text strings produced by the
     *     device (all supported).
     */
    public DeviceDefinitionBuilder.Impl withLanguageCode(
        @NonNull Collection<CodeableConcept> languageCode) {
      this.languageCode = Collections.unmodifiableCollection(languageCode);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withLanguageCode(
        @NonNull CodeableConceptBuilder... languageCode) {
      this.languageCode = Arrays.stream(languageCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param parentDevice - The parent device it can be part of. */
    public DeviceDefinitionBuilder.Impl withParentDevice(@NonNull Reference parentDevice) {
      this.parentDevice = Optional.of(parentDevice);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withParentDevice(@NonNull ReferenceBuilder parentDevice) {
      this.parentDevice = Optional.of(parentDevice.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public DeviceDefinitionBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param manufacturer - A name of the manufacturer. Field is a 'choice' field. Type should be
     *     one of Reference, String. To pass the value in, wrap with one of the
     *     DeviceDefinitionBuilder.manufacturer static methods
     */
    public DeviceDefinitionBuilder.Impl withManufacturer(@NonNull Choice_1128709984 manufacturer) {
      this.manufacturer = Optional.of(manufacturer);
      return this;
    }
    /** @param shelfLifeStorage - Shelf Life and storage information. */
    public DeviceDefinitionBuilder.Impl withShelfLifeStorage(@NonNull Choice... shelfLifeStorage) {
      this.shelfLifeStorage = Arrays.asList(shelfLifeStorage);
      return this;
    }
    /** @param shelfLifeStorage - Shelf Life and storage information. */
    public DeviceDefinitionBuilder.Impl withShelfLifeStorage(
        @NonNull Collection<Choice> shelfLifeStorage) {
      this.shelfLifeStorage = Collections.unmodifiableCollection(shelfLifeStorage);
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
    public DeviceDefinitionBuilder.Impl withModifierExtension(
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
    public DeviceDefinitionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param onlineInformation - Access to on-line information about the device. */
    public DeviceDefinitionBuilder.Impl withOnlineInformation(@NonNull String onlineInformation) {
      this.onlineInformation = Optional.of(onlineInformation);
      return this;
    }
    /** @param physicalCharacteristics - Dimensions, color etc. */
    public DeviceDefinitionBuilder.Impl withPhysicalCharacteristics(
        @NonNull Choice physicalCharacteristics) {
      this.physicalCharacteristics = Optional.of(physicalCharacteristics);
      return this;
    }
    /**
     * @param property - The actual configuration settings of a device as it actually operates,
     *     e.g., regulation status, time properties.
     */
    public DeviceDefinitionBuilder.Impl withProperty(
        @NonNull DeviceDefinition.Property... property) {
      this.property = Arrays.asList(property);
      return this;
    }
    /**
     * @param property - The actual configuration settings of a device as it actually operates,
     *     e.g., regulation status, time properties.
     */
    public DeviceDefinitionBuilder.Impl withProperty(
        @NonNull Collection<DeviceDefinition.Property> property) {
      this.property = Collections.unmodifiableCollection(property);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withProperty(
        @NonNull DeviceDefinition_PropertyBuilder... property) {
      this.property = Arrays.stream(property).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param deviceName - A name given to the device to identify it. */
    public DeviceDefinitionBuilder.Impl withDeviceName(
        @NonNull DeviceDefinition.DeviceName... deviceName) {
      this.deviceName = Arrays.asList(deviceName);
      return this;
    }
    /** @param deviceName - A name given to the device to identify it. */
    public DeviceDefinitionBuilder.Impl withDeviceName(
        @NonNull Collection<DeviceDefinition.DeviceName> deviceName) {
      this.deviceName = Collections.unmodifiableCollection(deviceName);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withDeviceName(
        @NonNull DeviceDefinition_DeviceNameBuilder... deviceName) {
      this.deviceName = Arrays.stream(deviceName).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param capability - Device capabilities. */
    public DeviceDefinitionBuilder.Impl withCapability(
        @NonNull DeviceDefinition.Capability... capability) {
      this.capability = Arrays.asList(capability);
      return this;
    }
    /** @param capability - Device capabilities. */
    public DeviceDefinitionBuilder.Impl withCapability(
        @NonNull Collection<DeviceDefinition.Capability> capability) {
      this.capability = Collections.unmodifiableCollection(capability);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withCapability(
        @NonNull DeviceDefinition_CapabilityBuilder... capability) {
      this.capability = Arrays.stream(capability).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param material - A substance used to create the material(s) of which the device is made. */
    public DeviceDefinitionBuilder.Impl withMaterial(
        @NonNull DeviceDefinition.Material... material) {
      this.material = Arrays.asList(material);
      return this;
    }
    /** @param material - A substance used to create the material(s) of which the device is made. */
    public DeviceDefinitionBuilder.Impl withMaterial(
        @NonNull Collection<DeviceDefinition.Material> material) {
      this.material = Collections.unmodifiableCollection(material);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withMaterial(
        @NonNull DeviceDefinition_MaterialBuilder... material) {
      this.material = Arrays.stream(material).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param specialization - The capabilities supported on a device, the standards to which the
     *     device conforms for a particular purpose, and used for the communication.
     */
    public DeviceDefinitionBuilder.Impl withSpecialization(
        @NonNull DeviceDefinition.Specialization... specialization) {
      this.specialization = Arrays.asList(specialization);
      return this;
    }
    /**
     * @param specialization - The capabilities supported on a device, the standards to which the
     *     device conforms for a particular purpose, and used for the communication.
     */
    public DeviceDefinitionBuilder.Impl withSpecialization(
        @NonNull Collection<DeviceDefinition.Specialization> specialization) {
      this.specialization = Collections.unmodifiableCollection(specialization);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withSpecialization(
        @NonNull DeviceDefinition_SpecializationBuilder... specialization) {
      this.specialization = Arrays.stream(specialization).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param udiDeviceIdentifier - Unique device identifier (UDI) assigned to device label or
     *     package. Note that the Device may include multiple udiCarriers as it either may include
     *     just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it
     *     could have been sold.
     */
    public DeviceDefinitionBuilder.Impl withUdiDeviceIdentifier(
        @NonNull DeviceDefinition.UdiDeviceIdentifier... udiDeviceIdentifier) {
      this.udiDeviceIdentifier = Arrays.asList(udiDeviceIdentifier);
      return this;
    }
    /**
     * @param udiDeviceIdentifier - Unique device identifier (UDI) assigned to device label or
     *     package. Note that the Device may include multiple udiCarriers as it either may include
     *     just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it
     *     could have been sold.
     */
    public DeviceDefinitionBuilder.Impl withUdiDeviceIdentifier(
        @NonNull Collection<DeviceDefinition.UdiDeviceIdentifier> udiDeviceIdentifier) {
      this.udiDeviceIdentifier = Collections.unmodifiableCollection(udiDeviceIdentifier);
      return this;
    }

    public DeviceDefinitionBuilder.Impl withUdiDeviceIdentifier(
        @NonNull DeviceDefinition_UdiDeviceIdentifierBuilder... udiDeviceIdentifier) {
      this.udiDeviceIdentifier =
          Arrays.stream(udiDeviceIdentifier).map(e -> e.build()).collect(toList());
      return this;
    }

    public DeviceDefinitionBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public DeviceDefinition build() {
      return new DeviceDefinition(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(_type),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(owner),
          safety.stream().collect(new LitSeqJCollector<>()),
          version.stream().collect(new LitSeqJCollector<>()),
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          OptionConverters.toScala(quantity),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(modelNumber),
          languageCode.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(parentDevice),
          OptionConverters.toScala(implicitRules),
          (Option) OptionConverters.toScala(manufacturer),
          (LitSeq) shelfLifeStorage.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(onlineInformation),
          (Option) OptionConverters.toScala(physicalCharacteristics),
          property.stream().collect(new LitSeqJCollector<>()),
          deviceName.stream().collect(new LitSeqJCollector<>()),
          capability.stream().collect(new LitSeqJCollector<>()),
          material.stream().collect(new LitSeqJCollector<>()),
          specialization.stream().collect(new LitSeqJCollector<>()),
          udiDeviceIdentifier.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
