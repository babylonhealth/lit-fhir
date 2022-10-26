package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.REQUEST_INTENT;
import com.babylonhealth.lit.hl7.REQUEST_PRIORITY;
import com.babylonhealth.lit.hl7.REQUEST_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface DeviceRequestBuilder extends DomainResourceBuilder {
  public DeviceRequest build();

  public static Impl init(
      REQUEST_INTENT intent, @NonNull ChoiceCodeableConceptOrReference code, Reference subject) {
    return new Impl(intent, code, subject);
  }

  public static Impl builder(
      REQUEST_INTENT intent,
      @NonNull ChoiceCodeableConceptOrReference code,
      ReferenceBuilder subject) {
    return new Impl(intent, code, subject.build());
  }

  public static ChoiceCodeableConceptOrReference code(CodeableConcept c) {
    return new ChoiceCodeableConceptOrReference(c);
  }

  public static ChoiceCodeableConceptOrReference code(Reference r) {
    return new ChoiceCodeableConceptOrReference(r);
  }

  public static ChoiceDateTimeOrPeriodOrTiming occurrence(FHIRDateTime f) {
    return new ChoiceDateTimeOrPeriodOrTiming(f);
  }

  public static ChoiceDateTimeOrPeriodOrTiming occurrence(Period p) {
    return new ChoiceDateTimeOrPeriodOrTiming(p);
  }

  public static ChoiceDateTimeOrPeriodOrTiming occurrence(Timing t) {
    return new ChoiceDateTimeOrPeriodOrTiming(t);
  }

  public class Impl implements DeviceRequestBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<REQUEST_STATUS> status = Optional.empty();
    private REQUEST_INTENT intent;
    private Collection<Reference> basedOn = Collections.emptyList();
    private ChoiceCodeableConceptOrReference code;
    private Reference subject;
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<REQUEST_PRIORITY> priority = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Optional<Reference> requester = Optional.empty();
    private Optional<Reference> performer = Optional.empty();
    private Collection<Reference> insurance = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<FHIRDateTime> authoredOn = Optional.empty();
    private Collection<CodeableConcept> reasonCode = Collections.emptyList();
    private Collection<Reference> priorRequest = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<ChoiceDateTimeOrPeriodOrTiming> occurrence = Optional.empty();
    private Optional<CodeableConcept> performerType = Optional.empty();
    private Collection<Reference> supportingInfo = Collections.emptyList();
    private Collection<String> instantiatesUri = Collections.emptyList();
    private Optional<Identifier> groupIdentifier = Optional.empty();
    private Collection<Reference> reasonReference = Collections.emptyList();
    private Collection<Reference> relevantHistory = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<String> instantiatesCanonical = Collections.emptyList();
    private Collection<DeviceRequest.Parameter> parameter = Collections.emptyList();

    /**
     * Required fields for {@link DeviceRequest}
     *
     * @param intent - Whether the request is a proposal, plan, an original order or a reflex order.
     * @param code - The details of the device to be used. Field is a 'choice' field. Type should be
     *     one of CodeableConcept, Reference. To pass the value in, wrap with one of the
     *     DeviceRequestBuilder.code static methods
     * @param subject - The patient who will use the device.
     */
    public Impl(
        REQUEST_INTENT intent, @NonNull ChoiceCodeableConceptOrReference code, Reference subject) {
      this.intent = intent;
      this.code = code;
      this.subject = subject;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public DeviceRequestBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public DeviceRequestBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public DeviceRequestBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public DeviceRequestBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public DeviceRequestBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param note - Details about this request that were not represented at all or sufficiently in
     *     one of the attributes provided in a class. These may include for example a comment, an
     *     instruction, or a note associated with the statement.
     */
    public DeviceRequestBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Details about this request that were not represented at all or sufficiently in
     *     one of the attributes provided in a class. These may include for example a comment, an
     *     instruction, or a note associated with the statement.
     */
    public DeviceRequestBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public DeviceRequestBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param status - The status of the request. */
    public DeviceRequestBuilder.Impl withStatus(@NonNull REQUEST_STATUS status) {
      this.status = Optional.of(status);
      return this;
    }
    /** @param basedOn - Plan/proposal/order fulfilled by this request. */
    public DeviceRequestBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /** @param basedOn - Plan/proposal/order fulfilled by this request. */
    public DeviceRequestBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public DeviceRequestBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public DeviceRequestBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param priority - Indicates how quickly the {{title}} should be addressed with respect to
     *     other requests.
     */
    public DeviceRequestBuilder.Impl withPriority(@NonNull REQUEST_PRIORITY priority) {
      this.priority = Optional.of(priority);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public DeviceRequestBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public DeviceRequestBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public DeviceRequestBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public DeviceRequestBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public DeviceRequestBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public DeviceRequestBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - An encounter that provides additional context in which this request is
     *     made.
     */
    public DeviceRequestBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public DeviceRequestBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /**
     * @param requester - The individual who initiated the request and has responsibility for its
     *     activation.
     */
    public DeviceRequestBuilder.Impl withRequester(@NonNull Reference requester) {
      this.requester = Optional.of(requester);
      return this;
    }

    public DeviceRequestBuilder.Impl withRequester(@NonNull ReferenceBuilder requester) {
      this.requester = Optional.of(requester.build());
      return this;
    }
    /** @param performer - The desired performer for doing the diagnostic testing. */
    public DeviceRequestBuilder.Impl withPerformer(@NonNull Reference performer) {
      this.performer = Optional.of(performer);
      return this;
    }

    public DeviceRequestBuilder.Impl withPerformer(@NonNull ReferenceBuilder performer) {
      this.performer = Optional.of(performer.build());
      return this;
    }
    /**
     * @param insurance - Insurance plans, coverage extensions, pre-authorizations and/or
     *     pre-determinations that may be required for delivering the requested service.
     */
    public DeviceRequestBuilder.Impl withInsurance(@NonNull Reference... insurance) {
      this.insurance = Arrays.asList(insurance);
      return this;
    }
    /**
     * @param insurance - Insurance plans, coverage extensions, pre-authorizations and/or
     *     pre-determinations that may be required for delivering the requested service.
     */
    public DeviceRequestBuilder.Impl withInsurance(@NonNull Collection<Reference> insurance) {
      this.insurance = Collections.unmodifiableCollection(insurance);
      return this;
    }

    public DeviceRequestBuilder.Impl withInsurance(@NonNull ReferenceBuilder... insurance) {
      this.insurance = Arrays.stream(insurance).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - Identifiers assigned to this order by the orderer or by the receiver. */
    public DeviceRequestBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - Identifiers assigned to this order by the orderer or by the receiver. */
    public DeviceRequestBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public DeviceRequestBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param authoredOn - When the request transitioned to being actionable. */
    public DeviceRequestBuilder.Impl withAuthoredOn(@NonNull FHIRDateTime authoredOn) {
      this.authoredOn = Optional.of(authoredOn);
      return this;
    }
    /** @param reasonCode - Reason or justification for the use of this device. */
    public DeviceRequestBuilder.Impl withReasonCode(@NonNull CodeableConcept... reasonCode) {
      this.reasonCode = Arrays.asList(reasonCode);
      return this;
    }
    /** @param reasonCode - Reason or justification for the use of this device. */
    public DeviceRequestBuilder.Impl withReasonCode(
        @NonNull Collection<CodeableConcept> reasonCode) {
      this.reasonCode = Collections.unmodifiableCollection(reasonCode);
      return this;
    }

    public DeviceRequestBuilder.Impl withReasonCode(@NonNull CodeableConceptBuilder... reasonCode) {
      this.reasonCode = Arrays.stream(reasonCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param priorRequest - The request takes the place of the referenced completed or terminated
     *     request(s).
     */
    public DeviceRequestBuilder.Impl withPriorRequest(@NonNull Reference... priorRequest) {
      this.priorRequest = Arrays.asList(priorRequest);
      return this;
    }
    /**
     * @param priorRequest - The request takes the place of the referenced completed or terminated
     *     request(s).
     */
    public DeviceRequestBuilder.Impl withPriorRequest(@NonNull Collection<Reference> priorRequest) {
      this.priorRequest = Collections.unmodifiableCollection(priorRequest);
      return this;
    }

    public DeviceRequestBuilder.Impl withPriorRequest(@NonNull ReferenceBuilder... priorRequest) {
      this.priorRequest = Arrays.stream(priorRequest).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public DeviceRequestBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param occurrence - The timing schedule for the use of the device. The Schedule data type
     *     allows many different expressions, for example. "Every 8 hours"; "Three times a day";
     *     "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013
     *     and 1 Nov 2013". Field is a 'choice' field. Type should be one of FHIRDateTime, Period,
     *     Timing. To pass the value in, wrap with one of the DeviceRequestBuilder.occurrence static
     *     methods
     */
    public DeviceRequestBuilder.Impl withOccurrence(
        @NonNull ChoiceDateTimeOrPeriodOrTiming occurrence) {
      this.occurrence = Optional.of(occurrence);
      return this;
    }
    /** @param performerType - Desired type of performer for doing the diagnostic testing. */
    public DeviceRequestBuilder.Impl withPerformerType(@NonNull CodeableConcept performerType) {
      this.performerType = Optional.of(performerType);
      return this;
    }

    public DeviceRequestBuilder.Impl withPerformerType(
        @NonNull CodeableConceptBuilder performerType) {
      this.performerType = Optional.of(performerType.build());
      return this;
    }
    /**
     * @param supportingInfo - Additional clinical information about the patient that may influence
     *     the request fulfilment. For example, this may include where on the subject's body the
     *     device will be used (i.e. the target site).
     */
    public DeviceRequestBuilder.Impl withSupportingInfo(@NonNull Reference... supportingInfo) {
      this.supportingInfo = Arrays.asList(supportingInfo);
      return this;
    }
    /**
     * @param supportingInfo - Additional clinical information about the patient that may influence
     *     the request fulfilment. For example, this may include where on the subject's body the
     *     device will be used (i.e. the target site).
     */
    public DeviceRequestBuilder.Impl withSupportingInfo(
        @NonNull Collection<Reference> supportingInfo) {
      this.supportingInfo = Collections.unmodifiableCollection(supportingInfo);
      return this;
    }

    public DeviceRequestBuilder.Impl withSupportingInfo(
        @NonNull ReferenceBuilder... supportingInfo) {
      this.supportingInfo = Arrays.stream(supportingInfo).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this
     *     DeviceRequest.
     */
    public DeviceRequestBuilder.Impl withInstantiatesUri(@NonNull String... instantiatesUri) {
      this.instantiatesUri = Arrays.asList(instantiatesUri);
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this
     *     DeviceRequest.
     */
    public DeviceRequestBuilder.Impl withInstantiatesUri(
        @NonNull Collection<String> instantiatesUri) {
      this.instantiatesUri = Collections.unmodifiableCollection(instantiatesUri);
      return this;
    }
    /** @param groupIdentifier - Composite request this is part of. */
    public DeviceRequestBuilder.Impl withGroupIdentifier(@NonNull Identifier groupIdentifier) {
      this.groupIdentifier = Optional.of(groupIdentifier);
      return this;
    }

    public DeviceRequestBuilder.Impl withGroupIdentifier(
        @NonNull IdentifierBuilder groupIdentifier) {
      this.groupIdentifier = Optional.of(groupIdentifier.build());
      return this;
    }
    /** @param reasonReference - Reason or justification for the use of this device. */
    public DeviceRequestBuilder.Impl withReasonReference(@NonNull Reference... reasonReference) {
      this.reasonReference = Arrays.asList(reasonReference);
      return this;
    }
    /** @param reasonReference - Reason or justification for the use of this device. */
    public DeviceRequestBuilder.Impl withReasonReference(
        @NonNull Collection<Reference> reasonReference) {
      this.reasonReference = Collections.unmodifiableCollection(reasonReference);
      return this;
    }

    public DeviceRequestBuilder.Impl withReasonReference(
        @NonNull ReferenceBuilder... reasonReference) {
      this.reasonReference = Arrays.stream(reasonReference).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param relevantHistory - Key events in the history of the request. */
    public DeviceRequestBuilder.Impl withRelevantHistory(@NonNull Reference... relevantHistory) {
      this.relevantHistory = Arrays.asList(relevantHistory);
      return this;
    }
    /** @param relevantHistory - Key events in the history of the request. */
    public DeviceRequestBuilder.Impl withRelevantHistory(
        @NonNull Collection<Reference> relevantHistory) {
      this.relevantHistory = Collections.unmodifiableCollection(relevantHistory);
      return this;
    }

    public DeviceRequestBuilder.Impl withRelevantHistory(
        @NonNull ReferenceBuilder... relevantHistory) {
      this.relevantHistory = Arrays.stream(relevantHistory).map(e -> e.build()).collect(toList());
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
    public DeviceRequestBuilder.Impl withModifierExtension(
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
    public DeviceRequestBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public DeviceRequestBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this
     *     DeviceRequest.
     */
    public DeviceRequestBuilder.Impl withInstantiatesCanonical(
        @NonNull String... instantiatesCanonical) {
      this.instantiatesCanonical = Arrays.asList(instantiatesCanonical);
      return this;
    }
    /**
     * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this
     *     DeviceRequest.
     */
    public DeviceRequestBuilder.Impl withInstantiatesCanonical(
        @NonNull Collection<String> instantiatesCanonical) {
      this.instantiatesCanonical = Collections.unmodifiableCollection(instantiatesCanonical);
      return this;
    }
    /**
     * @param parameter - Specific parameters for the ordered item. For example, the prism value for
     *     lenses.
     */
    public DeviceRequestBuilder.Impl withParameter(@NonNull DeviceRequest.Parameter... parameter) {
      this.parameter = Arrays.asList(parameter);
      return this;
    }
    /**
     * @param parameter - Specific parameters for the ordered item. For example, the prism value for
     *     lenses.
     */
    public DeviceRequestBuilder.Impl withParameter(
        @NonNull Collection<DeviceRequest.Parameter> parameter) {
      this.parameter = Collections.unmodifiableCollection(parameter);
      return this;
    }

    public DeviceRequestBuilder.Impl withParameter(
        @NonNull DeviceRequest_ParameterBuilder... parameter) {
      this.parameter = Arrays.stream(parameter).map(e -> e.build()).collect(toList());
      return this;
    }

    public DeviceRequestBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public DeviceRequest build() {
      return new DeviceRequest(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(status),
          intent,
          basedOn.stream().collect(new LitSeqJCollector<>()),
          code,
          subject,
          OptionConverters.toScala(language),
          OptionConverters.toScala(priority),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          OptionConverters.toScala(requester),
          OptionConverters.toScala(performer),
          insurance.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(authoredOn),
          reasonCode.stream().collect(new LitSeqJCollector<>()),
          priorRequest.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          (Option) OptionConverters.toScala(occurrence),
          OptionConverters.toScala(performerType),
          supportingInfo.stream().collect(new LitSeqJCollector<>()),
          instantiatesUri.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(groupIdentifier),
          reasonReference.stream().collect(new LitSeqJCollector<>()),
          relevantHistory.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          instantiatesCanonical.stream().collect(new LitSeqJCollector<>()),
          parameter.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
