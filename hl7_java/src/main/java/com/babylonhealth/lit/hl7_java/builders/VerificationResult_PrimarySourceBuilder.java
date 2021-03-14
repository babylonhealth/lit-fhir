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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class VerificationResult_PrimarySourceBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Reference> who = Optional.empty();
  private Collection<CodeableConcept> _type = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<FHIRDateTime> validationDate = Optional.empty();
  private Optional<CodeableConcept> canPushUpdates = Optional.empty();
  private Optional<CodeableConcept> validationStatus = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<CodeableConcept> pushTypeAvailable = Collections.emptyList();
  private Collection<CodeableConcept> communicationMethod = Collections.emptyList();

  /** Required fields for {@link VerificationResult.PrimarySource} */
  public VerificationResult_PrimarySourceBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public VerificationResult_PrimarySourceBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param who */
  public VerificationResult_PrimarySourceBuilder withWho(@NonNull Reference who) {
    this.who = Optional.of(who);
    return this;
  }
  /** @param _type */
  public VerificationResult_PrimarySourceBuilder withType(@NonNull CodeableConcept... _type) {
    this._type = Arrays.asList(_type);
    return this;
  }
  /** @param _type */
  public VerificationResult_PrimarySourceBuilder withType(
      @NonNull Collection<CodeableConcept> _type) {
    this._type = Collections.unmodifiableCollection(_type);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public VerificationResult_PrimarySourceBuilder withExtension(@NonNull Extension... extension) {
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
  public VerificationResult_PrimarySourceBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param validationDate */
  public VerificationResult_PrimarySourceBuilder withValidationDate(
      @NonNull FHIRDateTime validationDate) {
    this.validationDate = Optional.of(validationDate);
    return this;
  }
  /** @param canPushUpdates */
  public VerificationResult_PrimarySourceBuilder withCanPushUpdates(
      @NonNull CodeableConcept canPushUpdates) {
    this.canPushUpdates = Optional.of(canPushUpdates);
    return this;
  }
  /** @param validationStatus */
  public VerificationResult_PrimarySourceBuilder withValidationStatus(
      @NonNull CodeableConcept validationStatus) {
    this.validationStatus = Optional.of(validationStatus);
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
  public VerificationResult_PrimarySourceBuilder withModifierExtension(
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
  public VerificationResult_PrimarySourceBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param pushTypeAvailable */
  public VerificationResult_PrimarySourceBuilder withPushTypeAvailable(
      @NonNull CodeableConcept... pushTypeAvailable) {
    this.pushTypeAvailable = Arrays.asList(pushTypeAvailable);
    return this;
  }
  /** @param pushTypeAvailable */
  public VerificationResult_PrimarySourceBuilder withPushTypeAvailable(
      @NonNull Collection<CodeableConcept> pushTypeAvailable) {
    this.pushTypeAvailable = Collections.unmodifiableCollection(pushTypeAvailable);
    return this;
  }
  /** @param communicationMethod */
  public VerificationResult_PrimarySourceBuilder withCommunicationMethod(
      @NonNull CodeableConcept... communicationMethod) {
    this.communicationMethod = Arrays.asList(communicationMethod);
    return this;
  }
  /** @param communicationMethod */
  public VerificationResult_PrimarySourceBuilder withCommunicationMethod(
      @NonNull Collection<CodeableConcept> communicationMethod) {
    this.communicationMethod = Collections.unmodifiableCollection(communicationMethod);
    return this;
  }

  public VerificationResult.PrimarySource build() {
    return new VerificationResult.PrimarySource(
        OptionConverters.toScala(id),
        OptionConverters.toScala(who),
        _type.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(validationDate),
        OptionConverters.toScala(canPushUpdates),
        OptionConverters.toScala(validationStatus),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        pushTypeAvailable.stream().collect(new LitSeqJCollector<>()),
        communicationMethod.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
