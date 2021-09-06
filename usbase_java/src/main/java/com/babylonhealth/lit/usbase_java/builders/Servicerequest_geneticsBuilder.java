package com.babylonhealth.lit.usbase_java.builders;

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
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.hl7.REQUEST_STATUS;
import com.babylonhealth.lit.hl7.REQUEST_INTENT;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.REQUEST_PRIORITY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Servicerequest_geneticsBuilder extends ServiceRequestBuilder {
  public Servicerequest_genetics build();

  public static Impl init(REQUEST_STATUS status, REQUEST_INTENT intent, Reference subject) {
    return new Impl(status, intent, subject);
  }

  public static Impl builder(
      REQUEST_STATUS status, REQUEST_INTENT intent, ReferenceBuilder subject) {
    return new Impl(status, intent, subject.build());
  }

  public static Choice_0575082635 quantity(Quantity q) {
    return new Choice_0575082635(q);
  }

  public static Choice_0575082635 quantity(Range r) {
    return new Choice_0575082635(r);
  }

  public static Choice_0575082635 quantity(Ratio r) {
    return new Choice_0575082635(r);
  }

  public static Choice_1768247138 asNeeded(Boolean b) {
    return new Choice_1768247138(b);
  }

  public static Choice_1768247138 asNeeded(CodeableConcept c) {
    return new Choice_1768247138(c);
  }

  public static Choice00609373412 occurrence(FHIRDateTime f) {
    return new Choice00609373412(f);
  }

  public static Choice00609373412 occurrence(Period p) {
    return new Choice00609373412(p);
  }

  public static Choice00609373412 occurrence(Timing t) {
    return new Choice00609373412(t);
  }

  public class Impl implements Servicerequest_geneticsBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("http://hl7.org/fhir/StructureDefinition/servicerequest-genetics")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private REQUEST_STATUS status;
    private REQUEST_INTENT intent;
    private Collection<Reference> basedOn = Collections.emptyList();
    private Reference subject;
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Reference> replaces = Collections.emptyList();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Optional<REQUEST_PRIORITY> priority = Optional.empty();
    private Collection<Reference> specimen = Collections.emptyList();
    private Collection<CodeableConcept> bodySite = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Optional<Reference> requester = Optional.empty();
    private Collection<Reference> performer = Collections.emptyList();
    private Collection<Reference> insurance = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<FHIRDateTime> authoredOn = Optional.empty();
    private Collection<CodeableConcept> reasonCode = Collections.emptyList();
    private Optional<Identifier> requisition = Optional.empty();
    private Collection<CodeableConcept> orderDetail = Collections.emptyList();
    private Optional<Choice_0575082635> quantity = Optional.empty();
    private Optional<Choice_1768247138> asNeeded = Optional.empty();
    private Optional<Boolean> doNotPerform = Optional.empty();
    private Collection<CodeableConcept> locationCode = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<Choice00609373412> occurrence = Optional.empty();
    private Optional<CodeableConcept> performerType = Optional.empty();
    private Collection<Reference> supportingInfo = Collections.emptyList();
    private Collection<String> instantiatesUri = Collections.emptyList();
    private Collection<Reference> reasonReference = Collections.emptyList();
    private Collection<Reference> relevantHistory = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Reference> locationReference = Collections.emptyList();
    private Optional<String> patientInstruction = Optional.empty();
    private Collection<String> instantiatesCanonical = Collections.emptyList();

    /**
     * Required fields for {@link Servicerequest_genetics}
     *
     * @param status - The status of the order.
     * @param intent - Whether the request is a proposal, plan, an original order or a reflex order.
     * @param subject - On whom or what the service is to be performed. This is usually a human
     *     patient, but can also be requested on animals, groups of humans or animals, devices such
     *     as dialysis machines, or even locations (typically for environmental scans).
     */
    public Impl(REQUEST_STATUS status, REQUEST_INTENT intent, Reference subject) {
      this.status = status;
      this.intent = intent;
      this.subject = subject;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Servicerequest_geneticsBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public Servicerequest_geneticsBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public Servicerequest_geneticsBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }
    /**
     * @param code - A code that identifies a particular service (i.e., procedure, diagnostic
     *     investigation, or panel of investigations) that have been requested.
     */
    public Servicerequest_geneticsBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }
    /**
     * @param note - Any other notes and comments made about the service request. For example,
     *     internal billing notes.
     */
    public Servicerequest_geneticsBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Any other notes and comments made about the service request. For example,
     *     internal billing notes.
     */
    public Servicerequest_geneticsBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }
    /** @param basedOn - Plan/proposal/order fulfilled by this request. */
    public Servicerequest_geneticsBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /** @param basedOn - Plan/proposal/order fulfilled by this request. */
    public Servicerequest_geneticsBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public Servicerequest_geneticsBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param replaces - The request takes the place of the referenced completed or terminated
     *     request(s).
     */
    public Servicerequest_geneticsBuilder.Impl withReplaces(@NonNull Reference... replaces) {
      this.replaces = Arrays.asList(replaces);
      return this;
    }
    /**
     * @param replaces - The request takes the place of the referenced completed or terminated
     *     request(s).
     */
    public Servicerequest_geneticsBuilder.Impl withReplaces(
        @NonNull Collection<Reference> replaces) {
      this.replaces = Collections.unmodifiableCollection(replaces);
      return this;
    }
    /**
     * @param category - A code that classifies the service for searching, sorting and display
     *     purposes (e.g. "Surgical Procedure").
     */
    public Servicerequest_geneticsBuilder.Impl withCategory(@NonNull CodeableConcept... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /**
     * @param category - A code that classifies the service for searching, sorting and display
     *     purposes (e.g. "Surgical Procedure").
     */
    public Servicerequest_geneticsBuilder.Impl withCategory(
        @NonNull Collection<CodeableConcept> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }
    /**
     * @param priority - Indicates how quickly the ServiceRequest should be addressed with respect
     *     to other requests.
     */
    public Servicerequest_geneticsBuilder.Impl withPriority(@NonNull REQUEST_PRIORITY priority) {
      this.priority = Optional.of(priority);
      return this;
    }
    /** @param specimen - One or more specimens that the laboratory procedure will use. */
    public Servicerequest_geneticsBuilder.Impl withSpecimen(@NonNull Reference... specimen) {
      this.specimen = Arrays.asList(specimen);
      return this;
    }
    /** @param specimen - One or more specimens that the laboratory procedure will use. */
    public Servicerequest_geneticsBuilder.Impl withSpecimen(
        @NonNull Collection<Reference> specimen) {
      this.specimen = Collections.unmodifiableCollection(specimen);
      return this;
    }
    /**
     * @param bodySite - Anatomic location where the procedure should be performed. This is the
     *     target site.
     */
    public Servicerequest_geneticsBuilder.Impl withBodySite(@NonNull CodeableConcept... bodySite) {
      this.bodySite = Arrays.asList(bodySite);
      return this;
    }
    /**
     * @param bodySite - Anatomic location where the procedure should be performed. This is the
     *     target site.
     */
    public Servicerequest_geneticsBuilder.Impl withBodySite(
        @NonNull Collection<CodeableConcept> bodySite) {
      this.bodySite = Collections.unmodifiableCollection(bodySite);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Servicerequest_geneticsBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Servicerequest_geneticsBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }
    /** @param extension - An Extension */
    public Servicerequest_geneticsBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /** @param extension - An Extension */
    public Servicerequest_geneticsBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param encounter - An encounter that provides additional information about the healthcare
     *     context in which this request is made.
     */
    public Servicerequest_geneticsBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }
    /**
     * @param requester - The individual who initiated the request and has responsibility for its
     *     activation.
     */
    public Servicerequest_geneticsBuilder.Impl withRequester(@NonNull Reference requester) {
      this.requester = Optional.of(requester);
      return this;
    }
    /**
     * @param performer - The desired performer for doing the requested service. For example, the
     *     surgeon, dermatopathologist, endoscopist, etc.
     */
    public Servicerequest_geneticsBuilder.Impl withPerformer(@NonNull Reference... performer) {
      this.performer = Arrays.asList(performer);
      return this;
    }
    /**
     * @param performer - The desired performer for doing the requested service. For example, the
     *     surgeon, dermatopathologist, endoscopist, etc.
     */
    public Servicerequest_geneticsBuilder.Impl withPerformer(
        @NonNull Collection<Reference> performer) {
      this.performer = Collections.unmodifiableCollection(performer);
      return this;
    }
    /**
     * @param insurance - Insurance plans, coverage extensions, pre-authorizations and/or
     *     pre-determinations that may be needed for delivering the requested service.
     */
    public Servicerequest_geneticsBuilder.Impl withInsurance(@NonNull Reference... insurance) {
      this.insurance = Arrays.asList(insurance);
      return this;
    }
    /**
     * @param insurance - Insurance plans, coverage extensions, pre-authorizations and/or
     *     pre-determinations that may be needed for delivering the requested service.
     */
    public Servicerequest_geneticsBuilder.Impl withInsurance(
        @NonNull Collection<Reference> insurance) {
      this.insurance = Collections.unmodifiableCollection(insurance);
      return this;
    }
    /**
     * @param identifier - Identifiers assigned to this order instance by the orderer and/or the
     *     receiver and/or order fulfiller.
     */
    public Servicerequest_geneticsBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Identifiers assigned to this order instance by the orderer and/or the
     *     receiver and/or order fulfiller.
     */
    public Servicerequest_geneticsBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }
    /** @param authoredOn - When the request transitioned to being actionable. */
    public Servicerequest_geneticsBuilder.Impl withAuthoredOn(@NonNull FHIRDateTime authoredOn) {
      this.authoredOn = Optional.of(authoredOn);
      return this;
    }
    /**
     * @param reasonCode - An explanation or justification for why this service is being requested
     *     in coded or textual form. This is often for billing purposes. May relate to the resources
     *     referred to in `supportingInfo`.
     */
    public Servicerequest_geneticsBuilder.Impl withReasonCode(
        @NonNull CodeableConcept... reasonCode) {
      this.reasonCode = Arrays.asList(reasonCode);
      return this;
    }
    /**
     * @param reasonCode - An explanation or justification for why this service is being requested
     *     in coded or textual form. This is often for billing purposes. May relate to the resources
     *     referred to in `supportingInfo`.
     */
    public Servicerequest_geneticsBuilder.Impl withReasonCode(
        @NonNull Collection<CodeableConcept> reasonCode) {
      this.reasonCode = Collections.unmodifiableCollection(reasonCode);
      return this;
    }
    /**
     * @param requisition - A shared identifier common to all service requests that were authorized
     *     more or less simultaneously by a single author, representing the composite or group
     *     identifier.
     */
    public Servicerequest_geneticsBuilder.Impl withRequisition(@NonNull Identifier requisition) {
      this.requisition = Optional.of(requisition);
      return this;
    }
    /**
     * @param orderDetail - Additional details and instructions about the how the services are to be
     *     delivered. For example, and order for a urinary catheter may have an order detail for an
     *     external or indwelling catheter, or an order for a bandage may require additional
     *     instructions specifying how the bandage should be applied.
     */
    public Servicerequest_geneticsBuilder.Impl withOrderDetail(
        @NonNull CodeableConcept... orderDetail) {
      this.orderDetail = Arrays.asList(orderDetail);
      return this;
    }
    /**
     * @param orderDetail - Additional details and instructions about the how the services are to be
     *     delivered. For example, and order for a urinary catheter may have an order detail for an
     *     external or indwelling catheter, or an order for a bandage may require additional
     *     instructions specifying how the bandage should be applied.
     */
    public Servicerequest_geneticsBuilder.Impl withOrderDetail(
        @NonNull Collection<CodeableConcept> orderDetail) {
      this.orderDetail = Collections.unmodifiableCollection(orderDetail);
      return this;
    }
    /**
     * @param quantity - An amount of service being requested which can be a quantity ( for example
     *     $1,500 home modification), a ratio ( for example, 20 half day visits per month), or a
     *     range (2.0 to 1.8 Gy per fraction). Field is a 'choice' field. Type should be one of
     *     Quantity, Range, Ratio. To pass the value in, wrap with one of the
     *     Servicerequest_geneticsBuilder.quantity static methods
     */
    public Servicerequest_geneticsBuilder.Impl withQuantity(@NonNull Choice_0575082635 quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }
    /**
     * @param asNeeded - If a CodeableConcept is present, it indicates the pre-condition for
     *     performing the service. For example "pain", "on flare-up", etc. Field is a 'choice'
     *     field. Type should be one of Boolean, CodeableConcept. To pass the value in, wrap with
     *     one of the Servicerequest_geneticsBuilder.asNeeded static methods
     */
    public Servicerequest_geneticsBuilder.Impl withAsNeeded(@NonNull Choice_1768247138 asNeeded) {
      this.asNeeded = Optional.of(asNeeded);
      return this;
    }
    /**
     * @param doNotPerform - Set this to true if the record is saying that the service/procedure
     *     should NOT be performed.
     */
    public Servicerequest_geneticsBuilder.Impl withDoNotPerform(@NonNull Boolean doNotPerform) {
      this.doNotPerform = Optional.of(doNotPerform);
      return this;
    }
    /**
     * @param locationCode - The preferred location(s) where the procedure should actually happen in
     *     coded or free text form. E.g. at home or nursing day care center.
     */
    public Servicerequest_geneticsBuilder.Impl withLocationCode(
        @NonNull CodeableConcept... locationCode) {
      this.locationCode = Arrays.asList(locationCode);
      return this;
    }
    /**
     * @param locationCode - The preferred location(s) where the procedure should actually happen in
     *     coded or free text form. E.g. at home or nursing day care center.
     */
    public Servicerequest_geneticsBuilder.Impl withLocationCode(
        @NonNull Collection<CodeableConcept> locationCode) {
      this.locationCode = Collections.unmodifiableCollection(locationCode);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public Servicerequest_geneticsBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param occurrence - The date/time at which the requested service should occur. Field is a
     *     'choice' field. Type should be one of FHIRDateTime, Period, Timing. To pass the value in,
     *     wrap with one of the Servicerequest_geneticsBuilder.occurrence static methods
     */
    public Servicerequest_geneticsBuilder.Impl withOccurrence(
        @NonNull Choice00609373412 occurrence) {
      this.occurrence = Optional.of(occurrence);
      return this;
    }
    /** @param performerType - Desired type of performer for doing the requested service. */
    public Servicerequest_geneticsBuilder.Impl withPerformerType(
        @NonNull CodeableConcept performerType) {
      this.performerType = Optional.of(performerType);
      return this;
    }
    /**
     * @param supportingInfo - Additional clinical information about the patient or specimen that
     *     may influence the services or their interpretations. This information includes diagnosis,
     *     clinical findings and other observations. In laboratory ordering these are typically
     *     referred to as "ask at order entry questions (AOEs)". This includes observations
     *     explicitly requested by the producer (filler) to provide context or supporting
     *     information needed to complete the order. For example, reporting the amount of inspired
     *     oxygen for blood gas measurements.
     */
    public Servicerequest_geneticsBuilder.Impl withSupportingInfo(
        @NonNull Reference... supportingInfo) {
      this.supportingInfo = Arrays.asList(supportingInfo);
      return this;
    }
    /**
     * @param supportingInfo - Additional clinical information about the patient or specimen that
     *     may influence the services or their interpretations. This information includes diagnosis,
     *     clinical findings and other observations. In laboratory ordering these are typically
     *     referred to as "ask at order entry questions (AOEs)". This includes observations
     *     explicitly requested by the producer (filler) to provide context or supporting
     *     information needed to complete the order. For example, reporting the amount of inspired
     *     oxygen for blood gas measurements.
     */
    public Servicerequest_geneticsBuilder.Impl withSupportingInfo(
        @NonNull Collection<Reference> supportingInfo) {
      this.supportingInfo = Collections.unmodifiableCollection(supportingInfo);
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this
     *     ServiceRequest.
     */
    public Servicerequest_geneticsBuilder.Impl withInstantiatesUri(
        @NonNull String... instantiatesUri) {
      this.instantiatesUri = Arrays.asList(instantiatesUri);
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this
     *     ServiceRequest.
     */
    public Servicerequest_geneticsBuilder.Impl withInstantiatesUri(
        @NonNull Collection<String> instantiatesUri) {
      this.instantiatesUri = Collections.unmodifiableCollection(instantiatesUri);
      return this;
    }
    /**
     * @param reasonReference - Indicates another resource that provides a justification for why
     *     this service is being requested. May relate to the resources referred to in
     *     `supportingInfo`.
     */
    public Servicerequest_geneticsBuilder.Impl withReasonReference(
        @NonNull Reference... reasonReference) {
      this.reasonReference = Arrays.asList(reasonReference);
      return this;
    }
    /**
     * @param reasonReference - Indicates another resource that provides a justification for why
     *     this service is being requested. May relate to the resources referred to in
     *     `supportingInfo`.
     */
    public Servicerequest_geneticsBuilder.Impl withReasonReference(
        @NonNull Collection<Reference> reasonReference) {
      this.reasonReference = Collections.unmodifiableCollection(reasonReference);
      return this;
    }
    /** @param relevantHistory - Key events in the history of the request. */
    public Servicerequest_geneticsBuilder.Impl withRelevantHistory(
        @NonNull Reference... relevantHistory) {
      this.relevantHistory = Arrays.asList(relevantHistory);
      return this;
    }
    /** @param relevantHistory - Key events in the history of the request. */
    public Servicerequest_geneticsBuilder.Impl withRelevantHistory(
        @NonNull Collection<Reference> relevantHistory) {
      this.relevantHistory = Collections.unmodifiableCollection(relevantHistory);
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
    public Servicerequest_geneticsBuilder.Impl withModifierExtension(
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
    public Servicerequest_geneticsBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /**
     * @param locationReference - A reference to the the preferred location(s) where the procedure
     *     should actually happen. E.g. at home or nursing day care center.
     */
    public Servicerequest_geneticsBuilder.Impl withLocationReference(
        @NonNull Reference... locationReference) {
      this.locationReference = Arrays.asList(locationReference);
      return this;
    }
    /**
     * @param locationReference - A reference to the the preferred location(s) where the procedure
     *     should actually happen. E.g. at home or nursing day care center.
     */
    public Servicerequest_geneticsBuilder.Impl withLocationReference(
        @NonNull Collection<Reference> locationReference) {
      this.locationReference = Collections.unmodifiableCollection(locationReference);
      return this;
    }
    /**
     * @param patientInstruction - Instructions in terms that are understood by the patient or
     *     consumer.
     */
    public Servicerequest_geneticsBuilder.Impl withPatientInstruction(
        @NonNull String patientInstruction) {
      this.patientInstruction = Optional.of(patientInstruction);
      return this;
    }
    /**
     * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this
     *     ServiceRequest.
     */
    public Servicerequest_geneticsBuilder.Impl withInstantiatesCanonical(
        @NonNull String... instantiatesCanonical) {
      this.instantiatesCanonical = Arrays.asList(instantiatesCanonical);
      return this;
    }
    /**
     * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this
     *     ServiceRequest.
     */
    public Servicerequest_geneticsBuilder.Impl withInstantiatesCanonical(
        @NonNull Collection<String> instantiatesCanonical) {
      this.instantiatesCanonical = Collections.unmodifiableCollection(instantiatesCanonical);
      return this;
    }

    public Servicerequest_geneticsBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Servicerequest_genetics build() {
      return new Servicerequest_genetics(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(code),
          note.stream().collect(new LitSeqJCollector<>()),
          status,
          intent,
          basedOn.stream().collect(new LitSeqJCollector<>()),
          subject,
          OptionConverters.toScala(language),
          replaces.stream().collect(new LitSeqJCollector<>()),
          category.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(priority),
          specimen.stream().collect(new LitSeqJCollector<>()),
          bodySite.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          OptionConverters.toScala(requester),
          performer.stream().collect(new LitSeqJCollector<>()),
          insurance.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(authoredOn),
          reasonCode.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(requisition),
          orderDetail.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(quantity),
          (Option) OptionConverters.toScala(asNeeded),
          OptionConverters.toScala(doNotPerform.map(x -> (Object) x)),
          locationCode.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          (Option) OptionConverters.toScala(occurrence),
          OptionConverters.toScala(performerType),
          supportingInfo.stream().collect(new LitSeqJCollector<>()),
          instantiatesUri.stream().collect(new LitSeqJCollector<>()),
          reasonReference.stream().collect(new LitSeqJCollector<>()),
          relevantHistory.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          locationReference.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(patientInstruction),
          instantiatesCanonical.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
