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
import com.babylonhealth.lit.hl7.SUPPLYREQUEST_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.REQUEST_PRIORITY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class SupplyRequestBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<SUPPLYREQUEST_STATUS> status = Optional.empty();
  private Choice<$bslash$div<CodeableConcept, Reference>> item;
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<CodeableConcept> category = Optional.empty();
  private Optional<REQUEST_PRIORITY> priority = Optional.empty();
  private Quantity quantity;
  private Collection<Reference> supplier = Collections.emptyList();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> requester = Optional.empty();
  private Optional<Reference> deliverTo = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<FHIRDateTime> authoredOn = Optional.empty();
  private Collection<CodeableConcept> reasonCode = Collections.emptyList();
  private Optional<Reference> deliverFrom = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<Choice<$bslash$div<$bslash$div<FHIRDateTime, Period>, Timing>>> occurrence =
      Optional.empty();
  private Collection<Reference> reasonReference = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<SupplyRequest.Parameter> parameter = Collections.emptyList();

  /**
   * Required fields for {@link SupplyRequest}
   *
   * @param item - The item that is requested to be supplied. This is either a link to a resource
   *     representing the details of the item or a code that identifies the item from a known list.
   *     Field is a 'choice' field. Type should be one of CodeableConcept, Reference.
   * @param quantity - The amount that is being ordered of the indicated item.
   */
  public SupplyRequestBuilder(@NonNull Object item, Quantity quantity) {
    this.item =
        (Choice)
            Choice$.MODULE$.fromSuffix(
                autoSuffix(item.getClass().getSimpleName(), SupplyRequest$.MODULE$.item()),
                item,
                SupplyRequest$.MODULE$.item());
    this.quantity = quantity;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public SupplyRequestBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public SupplyRequestBuilder withMeta(@NonNull Meta meta) {
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
  public SupplyRequestBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param status - Status of the supply request. */
  public SupplyRequestBuilder withStatus(@NonNull SUPPLYREQUEST_STATUS status) {
    this.status = Optional.of(status);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public SupplyRequestBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param category - Category of supply, e.g. central, non-stock, etc. This is used to support
   *     work flows associated with the supply process.
   */
  public SupplyRequestBuilder withCategory(@NonNull CodeableConcept category) {
    this.category = Optional.of(category);
    return this;
  }
  /**
   * @param priority - Indicates how quickly this SupplyRequest should be addressed with respect to
   *     other requests.
   */
  public SupplyRequestBuilder withPriority(@NonNull REQUEST_PRIORITY priority) {
    this.priority = Optional.of(priority);
    return this;
  }
  /** @param supplier - Who is intended to fulfill the request. */
  public SupplyRequestBuilder withSupplier(@NonNull Reference... supplier) {
    this.supplier = Arrays.asList(supplier);
    return this;
  }
  /** @param supplier - Who is intended to fulfill the request. */
  public SupplyRequestBuilder withSupplier(@NonNull Collection<Reference> supplier) {
    this.supplier = Collections.unmodifiableCollection(supplier);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public SupplyRequestBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public SupplyRequestBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public SupplyRequestBuilder withExtension(@NonNull Extension... extension) {
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
  public SupplyRequestBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param requester - The device, practitioner, etc. who initiated the request. */
  public SupplyRequestBuilder withRequester(@NonNull Reference requester) {
    this.requester = Optional.of(requester);
    return this;
  }
  /** @param deliverTo - Where the supply is destined to go. */
  public SupplyRequestBuilder withDeliverTo(@NonNull Reference deliverTo) {
    this.deliverTo = Optional.of(deliverTo);
    return this;
  }
  /**
   * @param identifier - Business identifiers assigned to this SupplyRequest by the author and/or
   *     other systems. These identifiers remain constant as the resource is updated and propagates
   *     from server to server.
   */
  public SupplyRequestBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Business identifiers assigned to this SupplyRequest by the author and/or
   *     other systems. These identifiers remain constant as the resource is updated and propagates
   *     from server to server.
   */
  public SupplyRequestBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param authoredOn - When the request was made. */
  public SupplyRequestBuilder withAuthoredOn(@NonNull FHIRDateTime authoredOn) {
    this.authoredOn = Optional.of(authoredOn);
    return this;
  }
  /** @param reasonCode - The reason why the supply item was requested. */
  public SupplyRequestBuilder withReasonCode(@NonNull CodeableConcept... reasonCode) {
    this.reasonCode = Arrays.asList(reasonCode);
    return this;
  }
  /** @param reasonCode - The reason why the supply item was requested. */
  public SupplyRequestBuilder withReasonCode(@NonNull Collection<CodeableConcept> reasonCode) {
    this.reasonCode = Collections.unmodifiableCollection(reasonCode);
    return this;
  }
  /** @param deliverFrom - Where the supply is expected to come from. */
  public SupplyRequestBuilder withDeliverFrom(@NonNull Reference deliverFrom) {
    this.deliverFrom = Optional.of(deliverFrom);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public SupplyRequestBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param occurrence - When the request should be fulfilled. Field is a 'choice' field. Type
   *     should be one of FHIRDateTime, Period, Timing.
   */
  public <T> SupplyRequestBuilder withOccurrence(@NonNull T occurrence) {
    var guessedSuffix =
        autoSuffix(occurrence.getClass().getSimpleName(), SupplyRequest$.MODULE$.occurrence());
    return withOccurrence(guessedSuffix, occurrence);
  }

  /**
   * Alternative to the 'main' withOccurrence method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param occurrence - The value to be passed to the builder
   */
  public <T> SupplyRequestBuilder withOccurrence(String suffix, @NonNull T occurrence) {
    guard(occurrence.getClass().getSimpleName(), suffix, SupplyRequest$.MODULE$.occurrence());
    this.occurrence =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, occurrence, SupplyRequest$.MODULE$.occurrence()));
    return this;
  }
  /** @param reasonReference - The reason why the supply item was requested. */
  public SupplyRequestBuilder withReasonReference(@NonNull Reference... reasonReference) {
    this.reasonReference = Arrays.asList(reasonReference);
    return this;
  }
  /** @param reasonReference - The reason why the supply item was requested. */
  public SupplyRequestBuilder withReasonReference(@NonNull Collection<Reference> reasonReference) {
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
  public SupplyRequestBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public SupplyRequestBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param parameter - Specific parameters for the ordered item. For example, the size of the
   *     indicated item.
   */
  public SupplyRequestBuilder withParameter(@NonNull SupplyRequest.Parameter... parameter) {
    this.parameter = Arrays.asList(parameter);
    return this;
  }
  /**
   * @param parameter - Specific parameters for the ordered item. For example, the size of the
   *     indicated item.
   */
  public SupplyRequestBuilder withParameter(
      @NonNull Collection<SupplyRequest.Parameter> parameter) {
    this.parameter = Collections.unmodifiableCollection(parameter);
    return this;
  }

  public SupplyRequestBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public SupplyRequest build() {
    return new SupplyRequest(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        OptionConverters.toScala(status),
        item,
        OptionConverters.toScala(language),
        OptionConverters.toScala(category),
        OptionConverters.toScala(priority),
        quantity,
        supplier.stream().collect(new LitSeqJCollector<>()),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(requester),
        OptionConverters.toScala(deliverTo),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(authoredOn),
        reasonCode.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(deliverFrom),
        OptionConverters.toScala(implicitRules),
        OptionConverters.toScala(occurrence),
        reasonReference.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        parameter.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}