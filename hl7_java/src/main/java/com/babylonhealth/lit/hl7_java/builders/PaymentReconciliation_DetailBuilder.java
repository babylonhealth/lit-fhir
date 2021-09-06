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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class PaymentReconciliation_DetailBuilder {
  private Optional<String> id = Optional.empty();
  private CodeableConcept _type;
  private Optional<FHIRDate> date = Optional.empty();
  private Optional<Reference> payee = Optional.empty();
  private Optional<Money> amount = Optional.empty();
  private Optional<Reference> request = Optional.empty();
  private Optional<Reference> response = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> submitter = Optional.empty();
  private Optional<Identifier> identifier = Optional.empty();
  private Optional<Identifier> predecessor = Optional.empty();
  private Optional<Reference> responsible = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link PaymentReconciliation.Detail}
   *
   * @param _type
   */
  public PaymentReconciliation_DetailBuilder(CodeableConcept _type) {
    this._type = _type;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public PaymentReconciliation_DetailBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param date */
  public PaymentReconciliation_DetailBuilder withDate(@NonNull FHIRDate date) {
    this.date = Optional.of(date);
    return this;
  }
  /** @param payee */
  public PaymentReconciliation_DetailBuilder withPayee(@NonNull Reference payee) {
    this.payee = Optional.of(payee);
    return this;
  }
  /** @param amount */
  public PaymentReconciliation_DetailBuilder withAmount(@NonNull Money amount) {
    this.amount = Optional.of(amount);
    return this;
  }
  /** @param request - Original request resource reference. */
  public PaymentReconciliation_DetailBuilder withRequest(@NonNull Reference request) {
    this.request = Optional.of(request);
    return this;
  }
  /** @param response */
  public PaymentReconciliation_DetailBuilder withResponse(@NonNull Reference response) {
    this.response = Optional.of(response);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public PaymentReconciliation_DetailBuilder withExtension(@NonNull Extension... extension) {
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
  public PaymentReconciliation_DetailBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param submitter */
  public PaymentReconciliation_DetailBuilder withSubmitter(@NonNull Reference submitter) {
    this.submitter = Optional.of(submitter);
    return this;
  }
  /** @param identifier - A unique identifier assigned to this payment reconciliation. */
  public PaymentReconciliation_DetailBuilder withIdentifier(@NonNull Identifier identifier) {
    this.identifier = Optional.of(identifier);
    return this;
  }
  /** @param predecessor */
  public PaymentReconciliation_DetailBuilder withPredecessor(@NonNull Identifier predecessor) {
    this.predecessor = Optional.of(predecessor);
    return this;
  }
  /** @param responsible */
  public PaymentReconciliation_DetailBuilder withResponsible(@NonNull Reference responsible) {
    this.responsible = Optional.of(responsible);
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
  public PaymentReconciliation_DetailBuilder withModifierExtension(
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
  public PaymentReconciliation_DetailBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public PaymentReconciliation.Detail build() {
    return new PaymentReconciliation.Detail(
        OptionConverters.toScala(id),
        _type,
        OptionConverters.toScala(date),
        OptionConverters.toScala(payee),
        OptionConverters.toScala(amount),
        OptionConverters.toScala(request),
        OptionConverters.toScala(response),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(submitter),
        OptionConverters.toScala(identifier),
        OptionConverters.toScala(predecessor),
        OptionConverters.toScala(responsible),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
