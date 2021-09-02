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

public class Claim_ItemBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Money> net = Optional.empty();
  private Collection<Reference> udi = Collections.emptyList();
  private Optional<BigDecimal> factor = Optional.empty();
  private Optional<CodeableConcept> revenue = Optional.empty();
  private Collection<CodeableConcept> subSite = Collections.emptyList();
  private Integer sequence;
  private Optional<CodeableConcept> category = Optional.empty();
  private Collection<CodeableConcept> modifier = Collections.emptyList();
  private Optional<Quantity> quantity = Optional.empty();
  private Optional<CodeableConcept> bodySite = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Money> unitPrice = Optional.empty();
  private Collection<Reference> encounter = Collections.emptyList();
  private Collection<CodeableConcept> programCode = Collections.emptyList();
  private Optional<Choice_0503196159> serviced = Optional.empty();
  private Optional<Choice_0316522316> location = Optional.empty();
  private Collection<Integer> careTeamSequence = Collections.emptyList();
  private CodeableConcept productOrService;
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Integer> diagnosisSequence = Collections.emptyList();
  private Collection<Integer> procedureSequence = Collections.emptyList();
  private Collection<Integer> informationSequence = Collections.emptyList();
  private Collection<Claim$Item$Detail> detail = Collections.emptyList();

  /**
   * Required fields for {@link Claim.Item}
   *
   * @param sequence
   * @param productOrService
   */
  public Claim_ItemBuilder(Integer sequence, CodeableConcept productOrService) {
    this.sequence = sequence;
    this.productOrService = productOrService;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Claim_ItemBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param net */
  public Claim_ItemBuilder withNet(@NonNull Money net) {
    this.net = Optional.of(net);
    return this;
  }
  /** @param udi */
  public Claim_ItemBuilder withUdi(@NonNull Reference... udi) {
    this.udi = Arrays.asList(udi);
    return this;
  }
  /** @param udi */
  public Claim_ItemBuilder withUdi(@NonNull Collection<Reference> udi) {
    this.udi = Collections.unmodifiableCollection(udi);
    return this;
  }
  /** @param factor */
  public Claim_ItemBuilder withFactor(@NonNull BigDecimal factor) {
    this.factor = Optional.of(factor);
    return this;
  }
  /** @param revenue */
  public Claim_ItemBuilder withRevenue(@NonNull CodeableConcept revenue) {
    this.revenue = Optional.of(revenue);
    return this;
  }
  /** @param subSite */
  public Claim_ItemBuilder withSubSite(@NonNull CodeableConcept... subSite) {
    this.subSite = Arrays.asList(subSite);
    return this;
  }
  /** @param subSite */
  public Claim_ItemBuilder withSubSite(@NonNull Collection<CodeableConcept> subSite) {
    this.subSite = Collections.unmodifiableCollection(subSite);
    return this;
  }
  /** @param category */
  public Claim_ItemBuilder withCategory(@NonNull CodeableConcept category) {
    this.category = Optional.of(category);
    return this;
  }
  /** @param modifier */
  public Claim_ItemBuilder withModifier(@NonNull CodeableConcept... modifier) {
    this.modifier = Arrays.asList(modifier);
    return this;
  }
  /** @param modifier */
  public Claim_ItemBuilder withModifier(@NonNull Collection<CodeableConcept> modifier) {
    this.modifier = Collections.unmodifiableCollection(modifier);
    return this;
  }
  /** @param quantity */
  public Claim_ItemBuilder withQuantity(@NonNull Quantity quantity) {
    this.quantity = Optional.of(quantity);
    return this;
  }
  /** @param bodySite */
  public Claim_ItemBuilder withBodySite(@NonNull CodeableConcept bodySite) {
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
  public Claim_ItemBuilder withExtension(@NonNull Extension... extension) {
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
  public Claim_ItemBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param unitPrice */
  public Claim_ItemBuilder withUnitPrice(@NonNull Money unitPrice) {
    this.unitPrice = Optional.of(unitPrice);
    return this;
  }
  /** @param encounter */
  public Claim_ItemBuilder withEncounter(@NonNull Reference... encounter) {
    this.encounter = Arrays.asList(encounter);
    return this;
  }
  /** @param encounter */
  public Claim_ItemBuilder withEncounter(@NonNull Collection<Reference> encounter) {
    this.encounter = Collections.unmodifiableCollection(encounter);
    return this;
  }
  /** @param programCode */
  public Claim_ItemBuilder withProgramCode(@NonNull CodeableConcept... programCode) {
    this.programCode = Arrays.asList(programCode);
    return this;
  }
  /** @param programCode */
  public Claim_ItemBuilder withProgramCode(@NonNull Collection<CodeableConcept> programCode) {
    this.programCode = Collections.unmodifiableCollection(programCode);
    return this;
  }
  /** @param serviced Field is a 'choice' field. Type should be one of FHIRDate, Period. */
  public Claim_ItemBuilder withServiced(@NonNull Choice_0503196159 serviced) {
    this.serviced = Optional.of(serviced);
    return this;
  }
  /**
   * @param location Field is a 'choice' field. Type should be one of Address, CodeableConcept,
   *     Reference.
   */
  public Claim_ItemBuilder withLocation(@NonNull Choice_0316522316 location) {
    this.location = Optional.of(location);
    return this;
  }
  /** @param careTeamSequence */
  public Claim_ItemBuilder withCareTeamSequence(@NonNull Integer... careTeamSequence) {
    this.careTeamSequence = Arrays.asList(careTeamSequence);
    return this;
  }
  /** @param careTeamSequence */
  public Claim_ItemBuilder withCareTeamSequence(@NonNull Collection<Integer> careTeamSequence) {
    this.careTeamSequence = Collections.unmodifiableCollection(careTeamSequence);
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
  public Claim_ItemBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public Claim_ItemBuilder withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param diagnosisSequence */
  public Claim_ItemBuilder withDiagnosisSequence(@NonNull Integer... diagnosisSequence) {
    this.diagnosisSequence = Arrays.asList(diagnosisSequence);
    return this;
  }
  /** @param diagnosisSequence */
  public Claim_ItemBuilder withDiagnosisSequence(@NonNull Collection<Integer> diagnosisSequence) {
    this.diagnosisSequence = Collections.unmodifiableCollection(diagnosisSequence);
    return this;
  }
  /** @param procedureSequence */
  public Claim_ItemBuilder withProcedureSequence(@NonNull Integer... procedureSequence) {
    this.procedureSequence = Arrays.asList(procedureSequence);
    return this;
  }
  /** @param procedureSequence */
  public Claim_ItemBuilder withProcedureSequence(@NonNull Collection<Integer> procedureSequence) {
    this.procedureSequence = Collections.unmodifiableCollection(procedureSequence);
    return this;
  }
  /** @param informationSequence */
  public Claim_ItemBuilder withInformationSequence(@NonNull Integer... informationSequence) {
    this.informationSequence = Arrays.asList(informationSequence);
    return this;
  }
  /** @param informationSequence */
  public Claim_ItemBuilder withInformationSequence(
      @NonNull Collection<Integer> informationSequence) {
    this.informationSequence = Collections.unmodifiableCollection(informationSequence);
    return this;
  }
  /** @param detail */
  public Claim_ItemBuilder withDetail(@NonNull Claim$Item$Detail... detail) {
    this.detail = Arrays.asList(detail);
    return this;
  }
  /** @param detail */
  public Claim_ItemBuilder withDetail(@NonNull Collection<Claim$Item$Detail> detail) {
    this.detail = Collections.unmodifiableCollection(detail);
    return this;
  }

  public Claim.Item build() {
    return new Claim.Item(
        OptionConverters.toScala(id),
        OptionConverters.toScala(net),
        udi.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(factor),
        OptionConverters.toScala(revenue),
        subSite.stream().collect(new LitSeqJCollector<>()),
        sequence,
        OptionConverters.toScala(category),
        modifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(quantity),
        OptionConverters.toScala(bodySite),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(unitPrice),
        encounter.stream().collect(new LitSeqJCollector<>()),
        programCode.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(serviced),
        (Option) OptionConverters.toScala(location),
        careTeamSequence.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        productOrService,
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        diagnosisSequence.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        procedureSequence.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        informationSequence.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        detail.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
