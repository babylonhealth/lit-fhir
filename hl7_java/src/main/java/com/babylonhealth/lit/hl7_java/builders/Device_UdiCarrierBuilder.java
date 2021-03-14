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
import com.babylonhealth.lit.hl7.UDI_ENTRY_TYPE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Device_UdiCarrierBuilder {
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
  public Device_UdiCarrierBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Device_UdiCarrierBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param issuer */
  public Device_UdiCarrierBuilder withIssuer(@NonNull String issuer) {
    this.issuer = Optional.of(issuer);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Device_UdiCarrierBuilder withExtension(@NonNull Extension... extension) {
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
  public Device_UdiCarrierBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param entryType */
  public Device_UdiCarrierBuilder withEntryType(@NonNull UDI_ENTRY_TYPE entryType) {
    this.entryType = Optional.of(entryType);
    return this;
  }
  /** @param carrierHRF */
  public Device_UdiCarrierBuilder withCarrierHRF(@NonNull String carrierHRF) {
    this.carrierHRF = Optional.of(carrierHRF);
    return this;
  }
  /** @param carrierAIDC */
  public Device_UdiCarrierBuilder withCarrierAIDC(@NonNull byte[] carrierAIDC) {
    this.carrierAIDC = Optional.of(carrierAIDC);
    return this;
  }
  /** @param jurisdiction */
  public Device_UdiCarrierBuilder withJurisdiction(@NonNull String jurisdiction) {
    this.jurisdiction = Optional.of(jurisdiction);
    return this;
  }
  /** @param deviceIdentifier */
  public Device_UdiCarrierBuilder withDeviceIdentifier(@NonNull String deviceIdentifier) {
    this.deviceIdentifier = Optional.of(deviceIdentifier);
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
  public Device_UdiCarrierBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public Device_UdiCarrierBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
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
