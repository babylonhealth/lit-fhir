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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface DeviceDefinition_PackagingBuilder {
  public DeviceDefinition.Packaging build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements DeviceDefinition_PackagingBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<Integer> count = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<DeviceDefinition.Packaging> packaging = Collections.emptyList();
    private Optional<Identifier> identifier = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<DeviceDefinition$Packaging$Distributor> distributor =
        Collections.emptyList();
    private Collection<DeviceDefinition$Packaging$UdiDeviceIdentifier> udiDeviceIdentifier =
        Collections.emptyList();

    /** Required fields for {@link DeviceDefinition.Packaging} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public DeviceDefinition_PackagingBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type - What kind of device or device system this is. */
    public DeviceDefinition_PackagingBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public DeviceDefinition_PackagingBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param count */
    public DeviceDefinition_PackagingBuilder.Impl withCount(@NonNull Integer count) {
      this.count = Optional.of(count);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public DeviceDefinition_PackagingBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public DeviceDefinition_PackagingBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public DeviceDefinition_PackagingBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param packaging - Information about the packaging of the device, i.e. how the device is
     *     packaged.
     */
    public DeviceDefinition_PackagingBuilder.Impl withPackaging(
        @NonNull DeviceDefinition.Packaging... packaging) {
      this.packaging = Arrays.asList(packaging);
      return this;
    }
    /**
     * @param packaging - Information about the packaging of the device, i.e. how the device is
     *     packaged.
     */
    public DeviceDefinition_PackagingBuilder.Impl withPackaging(
        @NonNull Collection<DeviceDefinition.Packaging> packaging) {
      this.packaging = Collections.unmodifiableCollection(packaging);
      return this;
    }

    public DeviceDefinition_PackagingBuilder.Impl withPackaging(
        @NonNull DeviceDefinition_PackagingBuilder... packaging) {
      this.packaging = Arrays.stream(packaging).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Unique instance identifiers assigned to a device by the software,
     *     manufacturers, other organizations or owners. For example: handle ID.
     */
    public DeviceDefinition_PackagingBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public DeviceDefinition_PackagingBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
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
    public DeviceDefinition_PackagingBuilder.Impl withModifierExtension(
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
    public DeviceDefinition_PackagingBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public DeviceDefinition_PackagingBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param distributor */
    public DeviceDefinition_PackagingBuilder.Impl withDistributor(
        @NonNull DeviceDefinition$Packaging$Distributor... distributor) {
      this.distributor = Arrays.asList(distributor);
      return this;
    }
    /** @param distributor */
    public DeviceDefinition_PackagingBuilder.Impl withDistributor(
        @NonNull Collection<DeviceDefinition$Packaging$Distributor> distributor) {
      this.distributor = Collections.unmodifiableCollection(distributor);
      return this;
    }

    public DeviceDefinition_PackagingBuilder.Impl withDistributor(
        @NonNull DeviceDefinition_Packaging_DistributorBuilder... distributor) {
      this.distributor = Arrays.stream(distributor).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param udiDeviceIdentifier - Unique device identifier (UDI) assigned to device label or
     *     package. Note that the Device may include multiple udiCarriers as it either may include
     *     just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it
     *     could have been sold.
     */
    public DeviceDefinition_PackagingBuilder.Impl withUdiDeviceIdentifier(
        @NonNull DeviceDefinition$Packaging$UdiDeviceIdentifier... udiDeviceIdentifier) {
      this.udiDeviceIdentifier = Arrays.asList(udiDeviceIdentifier);
      return this;
    }
    /**
     * @param udiDeviceIdentifier - Unique device identifier (UDI) assigned to device label or
     *     package. Note that the Device may include multiple udiCarriers as it either may include
     *     just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it
     *     could have been sold.
     */
    public DeviceDefinition_PackagingBuilder.Impl withUdiDeviceIdentifier(
        @NonNull Collection<DeviceDefinition$Packaging$UdiDeviceIdentifier> udiDeviceIdentifier) {
      this.udiDeviceIdentifier = Collections.unmodifiableCollection(udiDeviceIdentifier);
      return this;
    }

    public DeviceDefinition_PackagingBuilder.Impl withUdiDeviceIdentifier(
        @NonNull DeviceDefinition_Packaging_UdiDeviceIdentifierBuilder... udiDeviceIdentifier) {
      this.udiDeviceIdentifier =
          Arrays.stream(udiDeviceIdentifier).map(e -> e.build()).collect(toList());
      return this;
    }

    public DeviceDefinition.Packaging build() {
      return new DeviceDefinition.Packaging(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(count.map(x -> (Object) x)),
          extension.stream().collect(new LitSeqJCollector<>()),
          packaging.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(identifier),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          distributor.stream().collect(new LitSeqJCollector<>()),
          udiDeviceIdentifier.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
