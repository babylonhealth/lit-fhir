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
import com.babylonhealth.lit.hl7.GUIDANCE_RESPONSE_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class GuidanceResponseBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Collection<Annotation> note = Collections.emptyList();
  private GUIDANCE_RESPONSE_STATUS status;
  private Optional<Reference> result = Optional.empty();
  private Optional<Reference> subject = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Choice_0687680458 module;
  private Optional<Reference> encounter = Optional.empty();
  private Optional<Reference> performer = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Collection<CodeableConcept> reasonCode = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Reference> reasonReference = Collections.emptyList();
  private Collection<DataRequirement> dataRequirement = Collections.emptyList();
  private Optional<Reference> outputParameters = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Identifier> requestIdentifier = Optional.empty();
  private Collection<Reference> evaluationMessage = Collections.emptyList();
  private Optional<FHIRDateTime> occurrenceDateTime = Optional.empty();

  /**
   * Required fields for {@link GuidanceResponse}
   *
   * @param status - The status of the response. If the evaluation is completed successfully, the
   *     status will indicate success. However, in order to complete the evaluation, the engine may
   *     require more information. In this case, the status will be data-required, and the response
   *     will contain a description of the additional required information. If the evaluation
   *     completed successfully, but the engine determines that a potentially more accurate response
   *     could be provided if more data was available, the status will be data-requested, and the
   *     response will contain a description of the additional requested information.
   * @param module - An identifier, CodeableConcept or canonical reference to the guidance that was
   *     requested. Field is a 'choice' field. Type should be one of String, CodeableConcept. There
   *     are multiple valid json suffixes which correspond to values of type String -- to
   *     distinguish between the specific subtype, pass $value wrapped in
   *     ParamDistinguisher.choose("foo". $value), where foo is one of: Canonical, Uri
   */
  public GuidanceResponseBuilder(
      GUIDANCE_RESPONSE_STATUS status, @NonNull Choice_0687680458 module) {
    this.status = status;
    this.module = module;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public GuidanceResponseBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public GuidanceResponseBuilder withMeta(@NonNull Meta meta) {
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
  public GuidanceResponseBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param note - Provides a mechanism to communicate additional information about the response.
   */
  public GuidanceResponseBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /**
   * @param note - Provides a mechanism to communicate additional information about the response.
   */
  public GuidanceResponseBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /** @param result - The actions, if any, produced by the evaluation of the artifact. */
  public GuidanceResponseBuilder withResult(@NonNull Reference result) {
    this.result = Optional.of(result);
    return this;
  }
  /** @param subject - The patient for which the request was processed. */
  public GuidanceResponseBuilder withSubject(@NonNull Reference subject) {
    this.subject = Optional.of(subject);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public GuidanceResponseBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public GuidanceResponseBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public GuidanceResponseBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public GuidanceResponseBuilder withExtension(@NonNull Extension... extension) {
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
  public GuidanceResponseBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param encounter - The encounter during which this response was created or to which the
   *     creation of this record is tightly associated.
   */
  public GuidanceResponseBuilder withEncounter(@NonNull Reference encounter) {
    this.encounter = Optional.of(encounter);
    return this;
  }
  /** @param performer - Provides a reference to the device that performed the guidance. */
  public GuidanceResponseBuilder withPerformer(@NonNull Reference performer) {
    this.performer = Optional.of(performer);
    return this;
  }
  /**
   * @param identifier - Allows a service to provide unique, business identifiers for the response.
   */
  public GuidanceResponseBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Allows a service to provide unique, business identifiers for the response.
   */
  public GuidanceResponseBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param reasonCode - Describes the reason for the guidance response in coded or textual form.
   */
  public GuidanceResponseBuilder withReasonCode(@NonNull CodeableConcept... reasonCode) {
    this.reasonCode = Arrays.asList(reasonCode);
    return this;
  }
  /**
   * @param reasonCode - Describes the reason for the guidance response in coded or textual form.
   */
  public GuidanceResponseBuilder withReasonCode(@NonNull Collection<CodeableConcept> reasonCode) {
    this.reasonCode = Collections.unmodifiableCollection(reasonCode);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public GuidanceResponseBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param reasonReference - Indicates the reason the request was initiated. This is typically
   *     provided as a parameter to the evaluation and echoed by the service, although for some use
   *     cases, such as subscription- or event-based scenarios, it may provide an indication of the
   *     cause for the response.
   */
  public GuidanceResponseBuilder withReasonReference(@NonNull Reference... reasonReference) {
    this.reasonReference = Arrays.asList(reasonReference);
    return this;
  }
  /**
   * @param reasonReference - Indicates the reason the request was initiated. This is typically
   *     provided as a parameter to the evaluation and echoed by the service, although for some use
   *     cases, such as subscription- or event-based scenarios, it may provide an indication of the
   *     cause for the response.
   */
  public GuidanceResponseBuilder withReasonReference(
      @NonNull Collection<Reference> reasonReference) {
    this.reasonReference = Collections.unmodifiableCollection(reasonReference);
    return this;
  }
  /**
   * @param dataRequirement - If the evaluation could not be completed due to lack of information,
   *     or additional information would potentially result in a more accurate response, this
   *     element will a description of the data required in order to proceed with the evaluation. A
   *     subsequent request to the service should include this data.
   */
  public GuidanceResponseBuilder withDataRequirement(@NonNull DataRequirement... dataRequirement) {
    this.dataRequirement = Arrays.asList(dataRequirement);
    return this;
  }
  /**
   * @param dataRequirement - If the evaluation could not be completed due to lack of information,
   *     or additional information would potentially result in a more accurate response, this
   *     element will a description of the data required in order to proceed with the evaluation. A
   *     subsequent request to the service should include this data.
   */
  public GuidanceResponseBuilder withDataRequirement(
      @NonNull Collection<DataRequirement> dataRequirement) {
    this.dataRequirement = Collections.unmodifiableCollection(dataRequirement);
    return this;
  }
  /**
   * @param outputParameters - The output parameters of the evaluation, if any. Many modules will
   *     result in the return of specific resources such as procedure or communication requests that
   *     are returned as part of the operation result. However, modules may define specific outputs
   *     that would be returned as the result of the evaluation, and these would be returned in this
   *     element.
   */
  public GuidanceResponseBuilder withOutputParameters(@NonNull Reference outputParameters) {
    this.outputParameters = Optional.of(outputParameters);
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
  public GuidanceResponseBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public GuidanceResponseBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param requestIdentifier - The identifier of the request associated with this response. If an
   *     identifier was given as part of the request, it will be reproduced here to enable the
   *     requester to more easily identify the response in a multi-request scenario.
   */
  public GuidanceResponseBuilder withRequestIdentifier(@NonNull Identifier requestIdentifier) {
    this.requestIdentifier = Optional.of(requestIdentifier);
    return this;
  }
  /**
   * @param evaluationMessage - Messages resulting from the evaluation of the artifact or artifacts.
   *     As part of evaluating the request, the engine may produce informational or warning
   *     messages. These messages will be provided by this element.
   */
  public GuidanceResponseBuilder withEvaluationMessage(@NonNull Reference... evaluationMessage) {
    this.evaluationMessage = Arrays.asList(evaluationMessage);
    return this;
  }
  /**
   * @param evaluationMessage - Messages resulting from the evaluation of the artifact or artifacts.
   *     As part of evaluating the request, the engine may produce informational or warning
   *     messages. These messages will be provided by this element.
   */
  public GuidanceResponseBuilder withEvaluationMessage(
      @NonNull Collection<Reference> evaluationMessage) {
    this.evaluationMessage = Collections.unmodifiableCollection(evaluationMessage);
    return this;
  }
  /** @param occurrenceDateTime - Indicates when the guidance response was processed. */
  public GuidanceResponseBuilder withOccurrenceDateTime(@NonNull FHIRDateTime occurrenceDateTime) {
    this.occurrenceDateTime = Optional.of(occurrenceDateTime);
    return this;
  }

  public GuidanceResponseBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public GuidanceResponse build() {
    return new GuidanceResponse(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        note.stream().collect(new LitSeqJCollector<>()),
        status,
        OptionConverters.toScala(result),
        OptionConverters.toScala(subject),
        OptionConverters.toScala(language),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        module,
        OptionConverters.toScala(encounter),
        OptionConverters.toScala(performer),
        identifier.stream().collect(new LitSeqJCollector<>()),
        reasonCode.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        reasonReference.stream().collect(new LitSeqJCollector<>()),
        dataRequirement.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(outputParameters),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(requestIdentifier),
        evaluationMessage.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(occurrenceDateTime),
        LitUtils.emptyMetaElMap());
  }
}
