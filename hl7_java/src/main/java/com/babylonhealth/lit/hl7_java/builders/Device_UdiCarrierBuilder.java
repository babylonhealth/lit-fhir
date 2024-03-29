package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.UDI_ENTRY_TYPE;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Device_UdiCarrierBuilder {
  public Device.UdiCarrier build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Device_UdiCarrierBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> issuer = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<UDI_ENTRY_TYPE> entryType = Optional.empty();
    private Optional<String> carrierHRF = Optional.empty();
    private Optional<byte[]> carrierAIDC = Optional.empty();
    private Optional<String> jurisdiction = Optional.empty();
    private Optional<String> deviceIdentifier = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link Device.UdiCarrier} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Device_UdiCarrierBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param issuer */
    public Device_UdiCarrierBuilder.Impl withIssuer(@NonNull String issuer) {
      this.issuer = Optional.of(issuer);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Device_UdiCarrierBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Device_UdiCarrierBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Device_UdiCarrierBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param entryType */
    public Device_UdiCarrierBuilder.Impl withEntryType(@NonNull UDI_ENTRY_TYPE entryType) {
      this.entryType = Optional.of(entryType);
      return this;
    }
    /** @param carrierHRF */
    public Device_UdiCarrierBuilder.Impl withCarrierHRF(@NonNull String carrierHRF) {
      this.carrierHRF = Optional.of(carrierHRF);
      return this;
    }
    /** @param carrierAIDC */
    public Device_UdiCarrierBuilder.Impl withCarrierAIDC(@NonNull byte[] carrierAIDC) {
      this.carrierAIDC = Optional.of(carrierAIDC);
      return this;
    }
    /** @param jurisdiction */
    public Device_UdiCarrierBuilder.Impl withJurisdiction(@NonNull String jurisdiction) {
      this.jurisdiction = Optional.of(jurisdiction);
      return this;
    }
    /** @param deviceIdentifier */
    public Device_UdiCarrierBuilder.Impl withDeviceIdentifier(@NonNull String deviceIdentifier) {
      this.deviceIdentifier = Optional.of(deviceIdentifier);
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
    public Device_UdiCarrierBuilder.Impl withModifierExtension(
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
    public Device_UdiCarrierBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Device_UdiCarrierBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Device.UdiCarrier build() {
      return new Device.UdiCarrier(
          OptionConverters.toScala(id),
          OptionConverters.toScala(issuer),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(entryType),
          OptionConverters.toScala(carrierHRF),
          OptionConverters.toScala(carrierAIDC),
          OptionConverters.toScala(jurisdiction),
          OptionConverters.toScala(deviceIdentifier),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
