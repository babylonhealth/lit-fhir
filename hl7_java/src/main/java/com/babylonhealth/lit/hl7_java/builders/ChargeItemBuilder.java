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
import com.babylonhealth.lit.hl7.CHARGEITEM_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ChargeItemBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private CodeableConcept code;
  private Collection<Annotation> note = Collections.emptyList();
  private CHARGEITEM_STATUS status;
  private Collection<Reference> partOf = Collections.emptyList();
  private Collection<CodeableConcept> reason = Collections.emptyList();
  private Reference subject;
  private Optional<Reference> context = Optional.empty();
  private Optional<Reference> enterer = Optional.empty();
  private Collection<Reference> service = Collections.emptyList();
  private Collection<Reference> account = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<Quantity> quantity = Optional.empty();
  private Collection<CodeableConcept> bodysite = Collections.emptyList();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<Reference> costCenter = Optional.empty();
  private Optional<Choice<$bslash$div<CodeableConcept, Reference>>> product = Optional.empty();
  private Optional<FHIRDateTime> enteredDate = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<String> definitionUri = Collections.emptyList();
  private Optional<Choice<$bslash$div<$bslash$div<FHIRDateTime, Period>, Timing>>> occurrence =
      Optional.empty();
  private Optional<Money> priceOverride = Optional.empty();
  private Optional<BigDecimal> factorOverride = Optional.empty();
  private Optional<String> overrideReason = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<String> definitionCanonical = Collections.emptyList();
  private Collection<Reference> supportingInformation = Collections.emptyList();
  private Optional<Reference> performingOrganization = Optional.empty();
  private Optional<Reference> requestingOrganization = Optional.empty();
  private Collection<ChargeItem.Performer> performer = Collections.emptyList();

  /**
   * Required fields for {@link ChargeItem}
   *
   * @param code - A code that identifies the charge, like a billing code.
   * @param status - The current state of the ChargeItem.
   * @param subject - The individual or set of individuals the action is being or was performed on.
   */
  public ChargeItemBuilder(CodeableConcept code, CHARGEITEM_STATUS status, Reference subject) {
    this.code = code;
    this.status = status;
    this.subject = subject;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ChargeItemBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public ChargeItemBuilder withMeta(@NonNull Meta meta) {
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
  public ChargeItemBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param note - Comments made about the event by the performer, subject or other participants.
   */
  public ChargeItemBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /**
   * @param note - Comments made about the event by the performer, subject or other participants.
   */
  public ChargeItemBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /** @param partOf - ChargeItems can be grouped to larger ChargeItems covering the whole set. */
  public ChargeItemBuilder withPartOf(@NonNull Reference... partOf) {
    this.partOf = Arrays.asList(partOf);
    return this;
  }
  /** @param partOf - ChargeItems can be grouped to larger ChargeItems covering the whole set. */
  public ChargeItemBuilder withPartOf(@NonNull Collection<Reference> partOf) {
    this.partOf = Collections.unmodifiableCollection(partOf);
    return this;
  }
  /** @param reason - Describes why the event occurred in coded or textual form. */
  public ChargeItemBuilder withReason(@NonNull CodeableConcept... reason) {
    this.reason = Arrays.asList(reason);
    return this;
  }
  /** @param reason - Describes why the event occurred in coded or textual form. */
  public ChargeItemBuilder withReason(@NonNull Collection<CodeableConcept> reason) {
    this.reason = Collections.unmodifiableCollection(reason);
    return this;
  }
  /**
   * @param context - The encounter or episode of care that establishes the context for this event.
   */
  public ChargeItemBuilder withContext(@NonNull Reference context) {
    this.context = Optional.of(context);
    return this;
  }
  /** @param enterer - The device, practitioner, etc. who entered the charge item. */
  public ChargeItemBuilder withEnterer(@NonNull Reference enterer) {
    this.enterer = Optional.of(enterer);
    return this;
  }
  /** @param service - Indicated the rendered service that caused this charge. */
  public ChargeItemBuilder withService(@NonNull Reference... service) {
    this.service = Arrays.asList(service);
    return this;
  }
  /** @param service - Indicated the rendered service that caused this charge. */
  public ChargeItemBuilder withService(@NonNull Collection<Reference> service) {
    this.service = Collections.unmodifiableCollection(service);
    return this;
  }
  /** @param account - Account into which this ChargeItems belongs. */
  public ChargeItemBuilder withAccount(@NonNull Reference... account) {
    this.account = Arrays.asList(account);
    return this;
  }
  /** @param account - Account into which this ChargeItems belongs. */
  public ChargeItemBuilder withAccount(@NonNull Collection<Reference> account) {
    this.account = Collections.unmodifiableCollection(account);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public ChargeItemBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /** @param quantity - Quantity of which the charge item has been serviced. */
  public ChargeItemBuilder withQuantity(@NonNull Quantity quantity) {
    this.quantity = Optional.of(quantity);
    return this;
  }
  /** @param bodysite - The anatomical location where the related service has been applied. */
  public ChargeItemBuilder withBodysite(@NonNull CodeableConcept... bodysite) {
    this.bodysite = Arrays.asList(bodysite);
    return this;
  }
  /** @param bodysite - The anatomical location where the related service has been applied. */
  public ChargeItemBuilder withBodysite(@NonNull Collection<CodeableConcept> bodysite) {
    this.bodysite = Collections.unmodifiableCollection(bodysite);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ChargeItemBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ChargeItemBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public ChargeItemBuilder withExtension(@NonNull Extension... extension) {
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
  public ChargeItemBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param identifier - Identifiers assigned to this event performer or other systems. */
  public ChargeItemBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - Identifiers assigned to this event performer or other systems. */
  public ChargeItemBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param costCenter - The financial cost center permits the tracking of charge attribution. */
  public ChargeItemBuilder withCostCenter(@NonNull Reference costCenter) {
    this.costCenter = Optional.of(costCenter);
    return this;
  }
  /**
   * @param product - Identifies the device, food, drug or other product being charged either by
   *     type code or reference to an instance. Field is a 'choice' field. Type should be one of
   *     CodeableConcept, Reference.
   */
  public <T> ChargeItemBuilder withProduct(@NonNull T product) {
    var guessedSuffix =
        autoSuffix(product.getClass().getSimpleName(), ChargeItem$.MODULE$.product());
    return withProduct(guessedSuffix, product);
  }

  /**
   * Alternative to the 'main' withProduct method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param product - The value to be passed to the builder
   */
  public <T> ChargeItemBuilder withProduct(String suffix, @NonNull T product) {
    guard(product.getClass().getSimpleName(), suffix, ChargeItem$.MODULE$.product());
    this.product =
        Optional.of(
            (Choice) Choice$.MODULE$.fromSuffix(suffix, product, ChargeItem$.MODULE$.product()));
    return this;
  }
  /** @param enteredDate - Date the charge item was entered. */
  public ChargeItemBuilder withEnteredDate(@NonNull FHIRDateTime enteredDate) {
    this.enteredDate = Optional.of(enteredDate);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public ChargeItemBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param definitionUri - References the (external) source of pricing information, rules of
   *     application for the code this ChargeItem uses.
   */
  public ChargeItemBuilder withDefinitionUri(@NonNull String... definitionUri) {
    this.definitionUri = Arrays.asList(definitionUri);
    return this;
  }
  /**
   * @param definitionUri - References the (external) source of pricing information, rules of
   *     application for the code this ChargeItem uses.
   */
  public ChargeItemBuilder withDefinitionUri(@NonNull Collection<String> definitionUri) {
    this.definitionUri = Collections.unmodifiableCollection(definitionUri);
    return this;
  }
  /**
   * @param occurrence - Date/time(s) or duration when the charged service was applied. Field is a
   *     'choice' field. Type should be one of FHIRDateTime, Period, Timing.
   */
  public <T> ChargeItemBuilder withOccurrence(@NonNull T occurrence) {
    var guessedSuffix =
        autoSuffix(occurrence.getClass().getSimpleName(), ChargeItem$.MODULE$.occurrence());
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
  public <T> ChargeItemBuilder withOccurrence(String suffix, @NonNull T occurrence) {
    guard(occurrence.getClass().getSimpleName(), suffix, ChargeItem$.MODULE$.occurrence());
    this.occurrence =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(suffix, occurrence, ChargeItem$.MODULE$.occurrence()));
    return this;
  }
  /**
   * @param priceOverride - Total price of the charge overriding the list price associated with the
   *     code.
   */
  public ChargeItemBuilder withPriceOverride(@NonNull Money priceOverride) {
    this.priceOverride = Optional.of(priceOverride);
    return this;
  }
  /**
   * @param factorOverride - Factor overriding the factor determined by the rules associated with
   *     the code.
   */
  public ChargeItemBuilder withFactorOverride(@NonNull BigDecimal factorOverride) {
    this.factorOverride = Optional.of(factorOverride);
    return this;
  }
  /**
   * @param overrideReason - If the list price or the rule-based factor associated with the code is
   *     overridden, this attribute can capture a text to indicate the reason for this action.
   */
  public ChargeItemBuilder withOverrideReason(@NonNull String overrideReason) {
    this.overrideReason = Optional.of(overrideReason);
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
  public ChargeItemBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public ChargeItemBuilder withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param definitionCanonical - References the source of pricing information, rules of application
   *     for the code this ChargeItem uses.
   */
  public ChargeItemBuilder withDefinitionCanonical(@NonNull String... definitionCanonical) {
    this.definitionCanonical = Arrays.asList(definitionCanonical);
    return this;
  }
  /**
   * @param definitionCanonical - References the source of pricing information, rules of application
   *     for the code this ChargeItem uses.
   */
  public ChargeItemBuilder withDefinitionCanonical(
      @NonNull Collection<String> definitionCanonical) {
    this.definitionCanonical = Collections.unmodifiableCollection(definitionCanonical);
    return this;
  }
  /** @param supportingInformation - Further information supporting this charge. */
  public ChargeItemBuilder withSupportingInformation(@NonNull Reference... supportingInformation) {
    this.supportingInformation = Arrays.asList(supportingInformation);
    return this;
  }
  /** @param supportingInformation - Further information supporting this charge. */
  public ChargeItemBuilder withSupportingInformation(
      @NonNull Collection<Reference> supportingInformation) {
    this.supportingInformation = Collections.unmodifiableCollection(supportingInformation);
    return this;
  }
  /** @param performingOrganization - The organization requesting the service. */
  public ChargeItemBuilder withPerformingOrganization(@NonNull Reference performingOrganization) {
    this.performingOrganization = Optional.of(performingOrganization);
    return this;
  }
  /** @param requestingOrganization - The organization performing the service. */
  public ChargeItemBuilder withRequestingOrganization(@NonNull Reference requestingOrganization) {
    this.requestingOrganization = Optional.of(requestingOrganization);
    return this;
  }
  /** @param performer - Indicates who or what performed or participated in the charged service. */
  public ChargeItemBuilder withPerformer(@NonNull ChargeItem.Performer... performer) {
    this.performer = Arrays.asList(performer);
    return this;
  }
  /** @param performer - Indicates who or what performed or participated in the charged service. */
  public ChargeItemBuilder withPerformer(@NonNull Collection<ChargeItem.Performer> performer) {
    this.performer = Collections.unmodifiableCollection(performer);
    return this;
  }

  public ChargeItemBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public ChargeItem build() {
    return new ChargeItem(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        code,
        note.stream().collect(new LitSeqJCollector<>()),
        status,
        partOf.stream().collect(new LitSeqJCollector<>()),
        reason.stream().collect(new LitSeqJCollector<>()),
        subject,
        OptionConverters.toScala(context),
        OptionConverters.toScala(enterer),
        service.stream().collect(new LitSeqJCollector<>()),
        account.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(language),
        OptionConverters.toScala(quantity),
        bodysite.stream().collect(new LitSeqJCollector<>()),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(costCenter),
        OptionConverters.toScala(product),
        OptionConverters.toScala(enteredDate),
        OptionConverters.toScala(implicitRules),
        definitionUri.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(occurrence),
        OptionConverters.toScala(priceOverride),
        OptionConverters.toScala(factorOverride),
        OptionConverters.toScala(overrideReason),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        definitionCanonical.stream().collect(new LitSeqJCollector<>()),
        supportingInformation.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(performingOrganization),
        OptionConverters.toScala(requestingOrganization),
        performer.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}