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

public class ClaimResponse_AddItem_Detail_SubDetailBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Money> net = Optional.empty();
  private Optional<BigDecimal> factor = Optional.empty();
  private Collection<CodeableConcept> modifier = Collections.emptyList();
  private Optional<Quantity> quantity = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Money> unitPrice = Optional.empty();
  private Collection<Integer> noteNumber = Collections.emptyList();
  private Collection<ClaimResponse$Item$Adjudication> adjudication;
  private CodeableConcept productOrService;
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link ClaimResponse$AddItem$Detail$SubDetail}
   *
   * @param adjudication - The adjudication results which are presented at the header level rather
   *     than at the line-item or add-item levels.
   * @param productOrService
   */
  public ClaimResponse_AddItem_Detail_SubDetailBuilder(
      Collection<ClaimResponse$Item$Adjudication> adjudication, CodeableConcept productOrService) {
    this.adjudication = adjudication;
    this.productOrService = productOrService;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ClaimResponse_AddItem_Detail_SubDetailBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param net */
  public ClaimResponse_AddItem_Detail_SubDetailBuilder withNet(@NonNull Money net) {
    this.net = Optional.of(net);
    return this;
  }
  /** @param factor */
  public ClaimResponse_AddItem_Detail_SubDetailBuilder withFactor(@NonNull BigDecimal factor) {
    this.factor = Optional.of(factor);
    return this;
  }
  /** @param modifier */
  public ClaimResponse_AddItem_Detail_SubDetailBuilder withModifier(
      @NonNull CodeableConcept... modifier) {
    this.modifier = Arrays.asList(modifier);
    return this;
  }
  /** @param modifier */
  public ClaimResponse_AddItem_Detail_SubDetailBuilder withModifier(
      @NonNull Collection<CodeableConcept> modifier) {
    this.modifier = Collections.unmodifiableCollection(modifier);
    return this;
  }
  /** @param quantity */
  public ClaimResponse_AddItem_Detail_SubDetailBuilder withQuantity(@NonNull Quantity quantity) {
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
  public ClaimResponse_AddItem_Detail_SubDetailBuilder withExtension(
      @NonNull Extension... extension) {
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
  public ClaimResponse_AddItem_Detail_SubDetailBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param unitPrice */
  public ClaimResponse_AddItem_Detail_SubDetailBuilder withUnitPrice(@NonNull Money unitPrice) {
    this.unitPrice = Optional.of(unitPrice);
    return this;
  }
  /** @param noteNumber */
  public ClaimResponse_AddItem_Detail_SubDetailBuilder withNoteNumber(
      @NonNull Integer... noteNumber) {
    this.noteNumber = Arrays.asList(noteNumber);
    return this;
  }
  /** @param noteNumber */
  public ClaimResponse_AddItem_Detail_SubDetailBuilder withNoteNumber(
      @NonNull Collection<Integer> noteNumber) {
    this.noteNumber = Collections.unmodifiableCollection(noteNumber);
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
  public ClaimResponse_AddItem_Detail_SubDetailBuilder withModifierExtension(
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
  public ClaimResponse_AddItem_Detail_SubDetailBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public ClaimResponse$AddItem$Detail$SubDetail build() {
    return new ClaimResponse$AddItem$Detail$SubDetail(
        OptionConverters.toScala(id),
        OptionConverters.toScala(net),
        OptionConverters.toScala(factor),
        modifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(quantity),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(unitPrice),
        noteNumber.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        adjudication.stream().collect(new NonEmptyLitSeqJCollector<>()),
        productOrService,
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
