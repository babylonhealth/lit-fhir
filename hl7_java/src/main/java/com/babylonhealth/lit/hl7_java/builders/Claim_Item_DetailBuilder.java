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
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Claim_Item_DetailBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Money> net = Optional.empty();
  private Collection<Reference> udi = Collections.emptyList();
  private Optional<BigDecimal> factor = Optional.empty();
  private Optional<CodeableConcept> revenue = Optional.empty();
  private Integer sequence;
  private Optional<CodeableConcept> category = Optional.empty();
  private Collection<CodeableConcept> modifier = Collections.emptyList();
  private Optional<Quantity> quantity = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Money> unitPrice = Optional.empty();
  private Collection<CodeableConcept> programCode = Collections.emptyList();
  private CodeableConcept productOrService;
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Claim$Item$Detail$SubDetail> subDetail = Collections.emptyList();

  /**
   * Required fields for {@link Claim$Item$Detail}
   *
   * @param sequence
   * @param productOrService
   */
  public Claim_Item_DetailBuilder(Integer sequence, CodeableConcept productOrService) {
    this.sequence = sequence;
    this.productOrService = productOrService;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Claim_Item_DetailBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param net */
  public Claim_Item_DetailBuilder withNet(@NonNull Money net) {
    this.net = Optional.of(net);
    return this;
  }
  /** @param udi */
  public Claim_Item_DetailBuilder withUdi(@NonNull Reference... udi) {
    this.udi = Arrays.asList(udi);
    return this;
  }
  /** @param udi */
  public Claim_Item_DetailBuilder withUdi(@NonNull Collection<Reference> udi) {
    this.udi = Collections.unmodifiableCollection(udi);
    return this;
  }
  /** @param factor */
  public Claim_Item_DetailBuilder withFactor(@NonNull BigDecimal factor) {
    this.factor = Optional.of(factor);
    return this;
  }
  /** @param revenue */
  public Claim_Item_DetailBuilder withRevenue(@NonNull CodeableConcept revenue) {
    this.revenue = Optional.of(revenue);
    return this;
  }
  /** @param category */
  public Claim_Item_DetailBuilder withCategory(@NonNull CodeableConcept category) {
    this.category = Optional.of(category);
    return this;
  }
  /** @param modifier */
  public Claim_Item_DetailBuilder withModifier(@NonNull CodeableConcept... modifier) {
    this.modifier = Arrays.asList(modifier);
    return this;
  }
  /** @param modifier */
  public Claim_Item_DetailBuilder withModifier(@NonNull Collection<CodeableConcept> modifier) {
    this.modifier = Collections.unmodifiableCollection(modifier);
    return this;
  }
  /** @param quantity */
  public Claim_Item_DetailBuilder withQuantity(@NonNull Quantity quantity) {
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
  public Claim_Item_DetailBuilder withExtension(@NonNull Extension... extension) {
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
  public Claim_Item_DetailBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param unitPrice */
  public Claim_Item_DetailBuilder withUnitPrice(@NonNull Money unitPrice) {
    this.unitPrice = Optional.of(unitPrice);
    return this;
  }
  /** @param programCode */
  public Claim_Item_DetailBuilder withProgramCode(@NonNull CodeableConcept... programCode) {
    this.programCode = Arrays.asList(programCode);
    return this;
  }
  /** @param programCode */
  public Claim_Item_DetailBuilder withProgramCode(
      @NonNull Collection<CodeableConcept> programCode) {
    this.programCode = Collections.unmodifiableCollection(programCode);
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
  public Claim_Item_DetailBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public Claim_Item_DetailBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param subDetail */
  public Claim_Item_DetailBuilder withSubDetail(@NonNull Claim$Item$Detail$SubDetail... subDetail) {
    this.subDetail = Arrays.asList(subDetail);
    return this;
  }
  /** @param subDetail */
  public Claim_Item_DetailBuilder withSubDetail(
      @NonNull Collection<Claim$Item$Detail$SubDetail> subDetail) {
    this.subDetail = Collections.unmodifiableCollection(subDetail);
    return this;
  }

  public Claim$Item$Detail build() {
    return new Claim$Item$Detail(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(net),
        udi.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(factor),
        (Option) OptionConverters.toScala(revenue),
        sequence,
        (Option) OptionConverters.toScala(category),
        modifier.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(quantity),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(unitPrice),
        programCode.stream().collect(new LitSeqJCollector<>()),
        productOrService,
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        subDetail.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
