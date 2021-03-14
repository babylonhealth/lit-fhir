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

public class VerificationResult_AttestationBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Reference> who = Optional.empty();
  private Optional<FHIRDate> date = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> onBehalfOf = Optional.empty();
  private Optional<Signature> proxySignature = Optional.empty();
  private Optional<Signature> sourceSignature = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<CodeableConcept> communicationMethod = Optional.empty();
  private Optional<String> proxyIdentityCertificate = Optional.empty();
  private Optional<String> sourceIdentityCertificate = Optional.empty();

  /** Required fields for {@link VerificationResult.Attestation} */
  public VerificationResult_AttestationBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public VerificationResult_AttestationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param who */
  public VerificationResult_AttestationBuilder withWho(@NonNull Reference who) {
    this.who = Optional.of(who);
    return this;
  }
  /** @param date */
  public VerificationResult_AttestationBuilder withDate(@NonNull FHIRDate date) {
    this.date = Optional.of(date);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public VerificationResult_AttestationBuilder withExtension(@NonNull Extension... extension) {
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
  public VerificationResult_AttestationBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param onBehalfOf */
  public VerificationResult_AttestationBuilder withOnBehalfOf(@NonNull Reference onBehalfOf) {
    this.onBehalfOf = Optional.of(onBehalfOf);
    return this;
  }
  /** @param proxySignature */
  public VerificationResult_AttestationBuilder withProxySignature(
      @NonNull Signature proxySignature) {
    this.proxySignature = Optional.of(proxySignature);
    return this;
  }
  /** @param sourceSignature */
  public VerificationResult_AttestationBuilder withSourceSignature(
      @NonNull Signature sourceSignature) {
    this.sourceSignature = Optional.of(sourceSignature);
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
  public VerificationResult_AttestationBuilder withModifierExtension(
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
  public VerificationResult_AttestationBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param communicationMethod */
  public VerificationResult_AttestationBuilder withCommunicationMethod(
      @NonNull CodeableConcept communicationMethod) {
    this.communicationMethod = Optional.of(communicationMethod);
    return this;
  }
  /** @param proxyIdentityCertificate */
  public VerificationResult_AttestationBuilder withProxyIdentityCertificate(
      @NonNull String proxyIdentityCertificate) {
    this.proxyIdentityCertificate = Optional.of(proxyIdentityCertificate);
    return this;
  }
  /** @param sourceIdentityCertificate */
  public VerificationResult_AttestationBuilder withSourceIdentityCertificate(
      @NonNull String sourceIdentityCertificate) {
    this.sourceIdentityCertificate = Optional.of(sourceIdentityCertificate);
    return this;
  }

  public VerificationResult.Attestation build() {
    return new VerificationResult.Attestation(
        OptionConverters.toScala(id),
        OptionConverters.toScala(who),
        OptionConverters.toScala(date),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(onBehalfOf),
        OptionConverters.toScala(proxySignature),
        OptionConverters.toScala(sourceSignature),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(communicationMethod),
        OptionConverters.toScala(proxyIdentityCertificate),
        OptionConverters.toScala(sourceIdentityCertificate),
        LitUtils.emptyMetaElMap());
  }
}