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

public class ClaimResponse_AddItemBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Money> net = Optional.empty();
  private Optional<BigDecimal> factor = Optional.empty();
  private Collection<CodeableConcept> subSite = Collections.emptyList();
  private Collection<Reference> provider = Collections.emptyList();
  private Collection<CodeableConcept> modifier = Collections.emptyList();
  private Optional<Quantity> quantity = Optional.empty();
  private Optional<CodeableConcept> bodySite = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Money> unitPrice = Optional.empty();
  private Collection<Integer> noteNumber = Collections.emptyList();
  private Collection<CodeableConcept> programCode = Collections.emptyList();
  private Optional<Choice_0503196159> serviced = Optional.empty();
  private Optional<Choice_0316522316> location = Optional.empty();
  private Collection<Integer> itemSequence = Collections.emptyList();
  private Collection<ClaimResponse$Item$Adjudication> adjudication;
  private Collection<Integer> detailSequence = Collections.emptyList();
  private CodeableConcept productOrService;
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Integer> subdetailSequence = Collections.emptyList();
  private Collection<ClaimResponse$AddItem$Detail> detail = Collections.emptyList();

  /**
   * Required fields for {@link ClaimResponse.AddItem}
   *
   * @param adjudication - The adjudication results which are presented at the header level rather
   *     than at the line-item or add-item levels.
   * @param productOrService
   */
  public ClaimResponse_AddItemBuilder(
      Collection<ClaimResponse$Item$Adjudication> adjudication, CodeableConcept productOrService) {
    this.adjudication = adjudication;
    this.productOrService = productOrService;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ClaimResponse_AddItemBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param net */
  public ClaimResponse_AddItemBuilder withNet(@NonNull Money net) {
    this.net = Optional.of(net);
    return this;
  }
  /** @param factor */
  public ClaimResponse_AddItemBuilder withFactor(@NonNull BigDecimal factor) {
    this.factor = Optional.of(factor);
    return this;
  }
  /** @param subSite */
  public ClaimResponse_AddItemBuilder withSubSite(@NonNull CodeableConcept... subSite) {
    this.subSite = Arrays.asList(subSite);
    return this;
  }
  /** @param subSite */
  public ClaimResponse_AddItemBuilder withSubSite(@NonNull Collection<CodeableConcept> subSite) {
    this.subSite = Collections.unmodifiableCollection(subSite);
    return this;
  }
  /** @param provider */
  public ClaimResponse_AddItemBuilder withProvider(@NonNull Reference... provider) {
    this.provider = Arrays.asList(provider);
    return this;
  }
  /** @param provider */
  public ClaimResponse_AddItemBuilder withProvider(@NonNull Collection<Reference> provider) {
    this.provider = Collections.unmodifiableCollection(provider);
    return this;
  }
  /** @param modifier */
  public ClaimResponse_AddItemBuilder withModifier(@NonNull CodeableConcept... modifier) {
    this.modifier = Arrays.asList(modifier);
    return this;
  }
  /** @param modifier */
  public ClaimResponse_AddItemBuilder withModifier(@NonNull Collection<CodeableConcept> modifier) {
    this.modifier = Collections.unmodifiableCollection(modifier);
    return this;
  }
  /** @param quantity */
  public ClaimResponse_AddItemBuilder withQuantity(@NonNull Quantity quantity) {
    this.quantity = Optional.of(quantity);
    return this;
  }
  /** @param bodySite */
  public ClaimResponse_AddItemBuilder withBodySite(@NonNull CodeableConcept bodySite) {
    this.bodySite = Optional.of(bodySite);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ClaimResponse_AddItemBuilder withExtension(@NonNull Extension... extension) {
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
  public ClaimResponse_AddItemBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param unitPrice */
  public ClaimResponse_AddItemBuilder withUnitPrice(@NonNull Money unitPrice) {
    this.unitPrice = Optional.of(unitPrice);
    return this;
  }
  /** @param noteNumber */
  public ClaimResponse_AddItemBuilder withNoteNumber(@NonNull Integer... noteNumber) {
    this.noteNumber = Arrays.asList(noteNumber);
    return this;
  }
  /** @param noteNumber */
  public ClaimResponse_AddItemBuilder withNoteNumber(@NonNull Collection<Integer> noteNumber) {
    this.noteNumber = Collections.unmodifiableCollection(noteNumber);
    return this;
  }
  /** @param programCode */
  public ClaimResponse_AddItemBuilder withProgramCode(@NonNull CodeableConcept... programCode) {
    this.programCode = Arrays.asList(programCode);
    return this;
  }
  /** @param programCode */
  public ClaimResponse_AddItemBuilder withProgramCode(
      @NonNull Collection<CodeableConcept> programCode) {
    this.programCode = Collections.unmodifiableCollection(programCode);
    return this;
  }
  /** @param serviced Field is a 'choice' field. Type should be one of FHIRDate, Period. */
  public ClaimResponse_AddItemBuilder withServiced(@NonNull Choice_0503196159 serviced) {
    this.serviced = Optional.of(serviced);
    return this;
  }
  /**
   * @param location Field is a 'choice' field. Type should be one of Address, CodeableConcept,
   *     Reference.
   */
  public ClaimResponse_AddItemBuilder withLocation(@NonNull Choice_0316522316 location) {
    this.location = Optional.of(location);
    return this;
  }
  /** @param itemSequence */
  public ClaimResponse_AddItemBuilder withItemSequence(@NonNull Integer... itemSequence) {
    this.itemSequence = Arrays.asList(itemSequence);
    return this;
  }
  /** @param itemSequence */
  public ClaimResponse_AddItemBuilder withItemSequence(@NonNull Collection<Integer> itemSequence) {
    this.itemSequence = Collections.unmodifiableCollection(itemSequence);
    return this;
  }
  /** @param detailSequence */
  public ClaimResponse_AddItemBuilder withDetailSequence(@NonNull Integer... detailSequence) {
    this.detailSequence = Arrays.asList(detailSequence);
    return this;
  }
  /** @param detailSequence */
  public ClaimResponse_AddItemBuilder withDetailSequence(
      @NonNull Collection<Integer> detailSequence) {
    this.detailSequence = Collections.unmodifiableCollection(detailSequence);
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
  public ClaimResponse_AddItemBuilder withModifierExtension(
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
  public ClaimResponse_AddItemBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param subdetailSequence */
  public ClaimResponse_AddItemBuilder withSubdetailSequence(@NonNull Integer... subdetailSequence) {
    this.subdetailSequence = Arrays.asList(subdetailSequence);
    return this;
  }
  /** @param subdetailSequence */
  public ClaimResponse_AddItemBuilder withSubdetailSequence(
      @NonNull Collection<Integer> subdetailSequence) {
    this.subdetailSequence = Collections.unmodifiableCollection(subdetailSequence);
    return this;
  }
  /** @param detail */
  public ClaimResponse_AddItemBuilder withDetail(@NonNull ClaimResponse$AddItem$Detail... detail) {
    this.detail = Arrays.asList(detail);
    return this;
  }
  /** @param detail */
  public ClaimResponse_AddItemBuilder withDetail(
      @NonNull Collection<ClaimResponse$AddItem$Detail> detail) {
    this.detail = Collections.unmodifiableCollection(detail);
    return this;
  }

  public ClaimResponse.AddItem build() {
    return new ClaimResponse.AddItem(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(net),
        (Option) OptionConverters.toScala(factor),
        subSite.stream().collect(new LitSeqJCollector<>()),
        provider.stream().collect(new LitSeqJCollector<>()),
        modifier.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(quantity),
        (Option) OptionConverters.toScala(bodySite),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(unitPrice),
        noteNumber.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        programCode.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(serviced),
        (Option) OptionConverters.toScala(location),
        itemSequence.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        adjudication.stream().collect(new NonEmptyLitSeqJCollector<>()),
        detailSequence.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        productOrService,
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        subdetailSequence.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        detail.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
