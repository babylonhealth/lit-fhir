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

public class Contract_Term_Asset_ValuedItemBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Money> net = Optional.empty();
  private Optional<BigDecimal> factor = Optional.empty();
  private Optional<BigDecimal> points = Optional.empty();
  private Collection<String> linkId = Collections.emptyList();
  private Optional<String> payment = Optional.empty();
  private Optional<Quantity> quantity = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Choice<$bslash$div<CodeableConcept, Reference>>> entity = Optional.empty();
  private Optional<Money> unitPrice = Optional.empty();
  private Optional<Reference> recipient = Optional.empty();
  private Optional<Identifier> identifier = Optional.empty();
  private Optional<FHIRDateTime> paymentDate = Optional.empty();
  private Optional<Reference> responsible = Optional.empty();
  private Optional<FHIRDateTime> effectiveTime = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Integer> securityLabelNumber = Collections.emptyList();

  /** Required fields for {@link Contract$Term$Asset$ValuedItem} */
  public Contract_Term_Asset_ValuedItemBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Contract_Term_Asset_ValuedItemBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param net */
  public Contract_Term_Asset_ValuedItemBuilder withNet(@NonNull Money net) {
    this.net = Optional.of(net);
    return this;
  }
  /** @param factor */
  public Contract_Term_Asset_ValuedItemBuilder withFactor(@NonNull BigDecimal factor) {
    this.factor = Optional.of(factor);
    return this;
  }
  /** @param points */
  public Contract_Term_Asset_ValuedItemBuilder withPoints(@NonNull BigDecimal points) {
    this.points = Optional.of(points);
    return this;
  }
  /** @param linkId */
  public Contract_Term_Asset_ValuedItemBuilder withLinkId(@NonNull String... linkId) {
    this.linkId = Arrays.asList(linkId);
    return this;
  }
  /** @param linkId */
  public Contract_Term_Asset_ValuedItemBuilder withLinkId(@NonNull Collection<String> linkId) {
    this.linkId = Collections.unmodifiableCollection(linkId);
    return this;
  }
  /** @param payment */
  public Contract_Term_Asset_ValuedItemBuilder withPayment(@NonNull String payment) {
    this.payment = Optional.of(payment);
    return this;
  }
  /** @param quantity */
  public Contract_Term_Asset_ValuedItemBuilder withQuantity(@NonNull Quantity quantity) {
    this.quantity = Optional.of(quantity);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Contract_Term_Asset_ValuedItemBuilder withExtension(@NonNull Extension... extension) {
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
  public Contract_Term_Asset_ValuedItemBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param entity Field is a 'choice' field. Type should be one of CodeableConcept, Reference. */
  public <T> Contract_Term_Asset_ValuedItemBuilder withEntity(@NonNull T entity) {
    var guessedSuffix =
        autoSuffix(
            entity.getClass().getSimpleName(), Contract$Term$Asset$ValuedItem$.MODULE$.entity());
    return withEntity(guessedSuffix, entity);
  }

  /**
   * Alternative to the 'main' withEntity method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param entity - The value to be passed to the builder
   */
  public <T> Contract_Term_Asset_ValuedItemBuilder withEntity(String suffix, @NonNull T entity) {
    guard(
        entity.getClass().getSimpleName(),
        suffix,
        Contract$Term$Asset$ValuedItem$.MODULE$.entity());
    this.entity =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, entity, Contract$Term$Asset$ValuedItem$.MODULE$.entity()));
    return this;
  }
  /** @param unitPrice */
  public Contract_Term_Asset_ValuedItemBuilder withUnitPrice(@NonNull Money unitPrice) {
    this.unitPrice = Optional.of(unitPrice);
    return this;
  }
  /** @param recipient */
  public Contract_Term_Asset_ValuedItemBuilder withRecipient(@NonNull Reference recipient) {
    this.recipient = Optional.of(recipient);
    return this;
  }
  /**
   * @param identifier - Unique identifier for this Contract or a derivative that references a
   *     Source Contract.
   */
  public Contract_Term_Asset_ValuedItemBuilder withIdentifier(@NonNull Identifier identifier) {
    this.identifier = Optional.of(identifier);
    return this;
  }
  /** @param paymentDate */
  public Contract_Term_Asset_ValuedItemBuilder withPaymentDate(@NonNull FHIRDateTime paymentDate) {
    this.paymentDate = Optional.of(paymentDate);
    return this;
  }
  /** @param responsible */
  public Contract_Term_Asset_ValuedItemBuilder withResponsible(@NonNull Reference responsible) {
    this.responsible = Optional.of(responsible);
    return this;
  }
  /** @param effectiveTime */
  public Contract_Term_Asset_ValuedItemBuilder withEffectiveTime(
      @NonNull FHIRDateTime effectiveTime) {
    this.effectiveTime = Optional.of(effectiveTime);
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
  public Contract_Term_Asset_ValuedItemBuilder withModifierExtension(
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
  public Contract_Term_Asset_ValuedItemBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param securityLabelNumber */
  public Contract_Term_Asset_ValuedItemBuilder withSecurityLabelNumber(
      @NonNull Integer... securityLabelNumber) {
    this.securityLabelNumber = Arrays.asList(securityLabelNumber);
    return this;
  }
  /** @param securityLabelNumber */
  public Contract_Term_Asset_ValuedItemBuilder withSecurityLabelNumber(
      @NonNull Collection<Integer> securityLabelNumber) {
    this.securityLabelNumber = Collections.unmodifiableCollection(securityLabelNumber);
    return this;
  }

  public Contract$Term$Asset$ValuedItem build() {
    return new Contract$Term$Asset$ValuedItem(
        OptionConverters.toScala(id),
        OptionConverters.toScala(net),
        OptionConverters.toScala(factor),
        OptionConverters.toScala(points),
        linkId.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(payment),
        OptionConverters.toScala(quantity),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(entity),
        OptionConverters.toScala(unitPrice),
        OptionConverters.toScala(recipient),
        OptionConverters.toScala(identifier),
        OptionConverters.toScala(paymentDate),
        OptionConverters.toScala(responsible),
        OptionConverters.toScala(effectiveTime),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        securityLabelNumber.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
