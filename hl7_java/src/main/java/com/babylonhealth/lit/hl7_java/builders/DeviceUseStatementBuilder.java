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
import com.babylonhealth.lit.hl7.DEVICE_STATEMENT_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class DeviceUseStatementBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Collection<Annotation> note = Collections.emptyList();
  private DEVICE_STATEMENT_STATUS status;
  private Optional<Reference> source = Optional.empty();
  private Reference device;
  private Collection<Reference> basedOn = Collections.emptyList();
  private Reference subject;
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<CodeableConcept> bodySite = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Choice00609373412> timing = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<FHIRDateTime> recordedOn = Optional.empty();
  private Collection<CodeableConcept> reasonCode = Collections.emptyList();
  private Collection<Reference> derivedFrom = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Reference> reasonReference = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link DeviceUseStatement}
   *
   * @param status - A code representing the patient or other source's judgment about the state of
   *     the device used that this statement is about. Generally this will be active or completed.
   * @param device - The details of the device used.
   * @param subject - The patient who used the device.
   */
  public DeviceUseStatementBuilder(
      DEVICE_STATEMENT_STATUS status, Reference device, Reference subject) {
    this.status = status;
    this.device = device;
    this.subject = subject;
  }

  public static Choice00609373412 timing(FHIRDateTime f) {
    return new Choice00609373412(f);
  }

  public static Choice00609373412 timing(Period p) {
    return new Choice00609373412(p);
  }

  public static Choice00609373412 timing(Timing t) {
    return new Choice00609373412(t);
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public DeviceUseStatementBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public DeviceUseStatementBuilder withMeta(@NonNull Meta meta) {
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
  public DeviceUseStatementBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param note - Details about the device statement that were not represented at all or
   *     sufficiently in one of the attributes provided in a class. These may include for example a
   *     comment, an instruction, or a note associated with the statement.
   */
  public DeviceUseStatementBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /**
   * @param note - Details about the device statement that were not represented at all or
   *     sufficiently in one of the attributes provided in a class. These may include for example a
   *     comment, an instruction, or a note associated with the statement.
   */
  public DeviceUseStatementBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /** @param source - Who reported the device was being used by the patient. */
  public DeviceUseStatementBuilder withSource(@NonNull Reference source) {
    this.source = Optional.of(source);
    return this;
  }
  /**
   * @param basedOn - A plan, proposal or order that is fulfilled in whole or in part by this
   *     DeviceUseStatement.
   */
  public DeviceUseStatementBuilder withBasedOn(@NonNull Reference... basedOn) {
    this.basedOn = Arrays.asList(basedOn);
    return this;
  }
  /**
   * @param basedOn - A plan, proposal or order that is fulfilled in whole or in part by this
   *     DeviceUseStatement.
   */
  public DeviceUseStatementBuilder withBasedOn(@NonNull Collection<Reference> basedOn) {
    this.basedOn = Collections.unmodifiableCollection(basedOn);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public DeviceUseStatementBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param bodySite - Indicates the anotomic location on the subject's body where the device was
   *     used ( i.e. the target).
   */
  public DeviceUseStatementBuilder withBodySite(@NonNull CodeableConcept bodySite) {
    this.bodySite = Optional.of(bodySite);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public DeviceUseStatementBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public DeviceUseStatementBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public DeviceUseStatementBuilder withExtension(@NonNull Extension... extension) {
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
  public DeviceUseStatementBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param timing - How often the device was used. Field is a 'choice' field. Type should be one of
   *     FHIRDateTime, Period, Timing. To pass the value in, wrap with one of the
   *     DeviceUseStatementBuilder.timing static methods
   */
  public DeviceUseStatementBuilder withTiming(@NonNull Choice00609373412 timing) {
    this.timing = Optional.of(timing);
    return this;
  }
  /** @param identifier - An external identifier for this statement such as an IRI. */
  public DeviceUseStatementBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - An external identifier for this statement such as an IRI. */
  public DeviceUseStatementBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param recordedOn - The time at which the statement was made/recorded. */
  public DeviceUseStatementBuilder withRecordedOn(@NonNull FHIRDateTime recordedOn) {
    this.recordedOn = Optional.of(recordedOn);
    return this;
  }
  /** @param reasonCode - Reason or justification for the use of the device. */
  public DeviceUseStatementBuilder withReasonCode(@NonNull CodeableConcept... reasonCode) {
    this.reasonCode = Arrays.asList(reasonCode);
    return this;
  }
  /** @param reasonCode - Reason or justification for the use of the device. */
  public DeviceUseStatementBuilder withReasonCode(@NonNull Collection<CodeableConcept> reasonCode) {
    this.reasonCode = Collections.unmodifiableCollection(reasonCode);
    return this;
  }
  /**
   * @param derivedFrom - Allows linking the DeviceUseStatement to the underlying Request, or to
   *     other information that supports or is used to derive the DeviceUseStatement.
   */
  public DeviceUseStatementBuilder withDerivedFrom(@NonNull Reference... derivedFrom) {
    this.derivedFrom = Arrays.asList(derivedFrom);
    return this;
  }
  /**
   * @param derivedFrom - Allows linking the DeviceUseStatement to the underlying Request, or to
   *     other information that supports or is used to derive the DeviceUseStatement.
   */
  public DeviceUseStatementBuilder withDerivedFrom(@NonNull Collection<Reference> derivedFrom) {
    this.derivedFrom = Collections.unmodifiableCollection(derivedFrom);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public DeviceUseStatementBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param reasonReference - Indicates another resource whose existence justifies this
   *     DeviceUseStatement.
   */
  public DeviceUseStatementBuilder withReasonReference(@NonNull Reference... reasonReference) {
    this.reasonReference = Arrays.asList(reasonReference);
    return this;
  }
  /**
   * @param reasonReference - Indicates another resource whose existence justifies this
   *     DeviceUseStatement.
   */
  public DeviceUseStatementBuilder withReasonReference(
      @NonNull Collection<Reference> reasonReference) {
    this.reasonReference = Collections.unmodifiableCollection(reasonReference);
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
  public DeviceUseStatementBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public DeviceUseStatementBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public DeviceUseStatementBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public DeviceUseStatement build() {
    return new DeviceUseStatement(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        note.stream().collect(new LitSeqJCollector<>()),
        status,
        OptionConverters.toScala(source),
        device,
        basedOn.stream().collect(new LitSeqJCollector<>()),
        subject,
        OptionConverters.toScala(language),
        OptionConverters.toScala(bodySite),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(timing),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(recordedOn),
        reasonCode.stream().collect(new LitSeqJCollector<>()),
        derivedFrom.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        reasonReference.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
