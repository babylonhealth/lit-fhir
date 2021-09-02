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

public class Contract_Term_AssetBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<CodeableConcept> _type = Collections.emptyList();
  private Optional<String> text = Optional.empty();
  private Optional<CodeableConcept> scope = Optional.empty();
  private Collection<Period> period = Collections.emptyList();
  private Collection<String> linkId = Collections.emptyList();
  private Collection<Contract$Term$Offer$Answer> answer = Collections.emptyList();
  private Collection<CodeableConcept> subtype = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> condition = Optional.empty();
  private Collection<Period> usePeriod = Collections.emptyList();
  private Collection<CodeableConcept> periodType = Collections.emptyList();
  private Optional<Coding> relationship = Optional.empty();
  private Collection<Reference> typeReference = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Integer> securityLabelNumber = Collections.emptyList();
  private Collection<Contract$Term$Asset$Context> context = Collections.emptyList();
  private Collection<Contract$Term$Asset$ValuedItem> valuedItem = Collections.emptyList();

  /** Required fields for {@link Contract$Term$Asset} */
  public Contract_Term_AssetBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Contract_Term_AssetBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param _type - A high-level category for the legal instrument, whether constructed as a
   *     Contract definition, derivative, or instance in any legal state. Provides additional
   *     information about its content within the context of the Contract's scope to distinguish the
   *     kinds of systems that would be interested in the contract.
   */
  public Contract_Term_AssetBuilder withType(@NonNull CodeableConcept... _type) {
    this._type = Arrays.asList(_type);
    return this;
  }
  /**
   * @param _type - A high-level category for the legal instrument, whether constructed as a
   *     Contract definition, derivative, or instance in any legal state. Provides additional
   *     information about its content within the context of the Contract's scope to distinguish the
   *     kinds of systems that would be interested in the contract.
   */
  public Contract_Term_AssetBuilder withType(@NonNull Collection<CodeableConcept> _type) {
    this._type = Collections.unmodifiableCollection(_type);
    return this;
  }
  /**
   * @param text - A human-readable narrative that contains a summary of the resource and can be
   *     used to represent the content of the resource to a human. The narrative need not encode all
   *     the structured data, but is required to contain sufficient detail to make it "clinically
   *     safe" for a human to just read the narrative. Resource definitions may define what content
   *     should be represented in the narrative to ensure clinical safety.
   */
  public Contract_Term_AssetBuilder withText(@NonNull String text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param scope - A selector of legal concerns for this Contract definition, derivative, or
   *     instance in any legal state.
   */
  public Contract_Term_AssetBuilder withScope(@NonNull CodeableConcept scope) {
    this.scope = Optional.of(scope);
    return this;
  }
  /** @param period */
  public Contract_Term_AssetBuilder withPeriod(@NonNull Period... period) {
    this.period = Arrays.asList(period);
    return this;
  }
  /** @param period */
  public Contract_Term_AssetBuilder withPeriod(@NonNull Collection<Period> period) {
    this.period = Collections.unmodifiableCollection(period);
    return this;
  }
  /** @param linkId */
  public Contract_Term_AssetBuilder withLinkId(@NonNull String... linkId) {
    this.linkId = Arrays.asList(linkId);
    return this;
  }
  /** @param linkId */
  public Contract_Term_AssetBuilder withLinkId(@NonNull Collection<String> linkId) {
    this.linkId = Collections.unmodifiableCollection(linkId);
    return this;
  }
  /** @param answer */
  public Contract_Term_AssetBuilder withAnswer(@NonNull Contract$Term$Offer$Answer... answer) {
    this.answer = Arrays.asList(answer);
    return this;
  }
  /** @param answer */
  public Contract_Term_AssetBuilder withAnswer(
      @NonNull Collection<Contract$Term$Offer$Answer> answer) {
    this.answer = Collections.unmodifiableCollection(answer);
    return this;
  }
  /** @param subtype */
  public Contract_Term_AssetBuilder withSubtype(@NonNull CodeableConcept... subtype) {
    this.subtype = Arrays.asList(subtype);
    return this;
  }
  /** @param subtype */
  public Contract_Term_AssetBuilder withSubtype(@NonNull Collection<CodeableConcept> subtype) {
    this.subtype = Collections.unmodifiableCollection(subtype);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Contract_Term_AssetBuilder withExtension(@NonNull Extension... extension) {
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
  public Contract_Term_AssetBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param condition */
  public Contract_Term_AssetBuilder withCondition(@NonNull String condition) {
    this.condition = Optional.of(condition);
    return this;
  }
  /** @param usePeriod */
  public Contract_Term_AssetBuilder withUsePeriod(@NonNull Period... usePeriod) {
    this.usePeriod = Arrays.asList(usePeriod);
    return this;
  }
  /** @param usePeriod */
  public Contract_Term_AssetBuilder withUsePeriod(@NonNull Collection<Period> usePeriod) {
    this.usePeriod = Collections.unmodifiableCollection(usePeriod);
    return this;
  }
  /** @param periodType */
  public Contract_Term_AssetBuilder withPeriodType(@NonNull CodeableConcept... periodType) {
    this.periodType = Arrays.asList(periodType);
    return this;
  }
  /** @param periodType */
  public Contract_Term_AssetBuilder withPeriodType(
      @NonNull Collection<CodeableConcept> periodType) {
    this.periodType = Collections.unmodifiableCollection(periodType);
    return this;
  }
  /** @param relationship */
  public Contract_Term_AssetBuilder withRelationship(@NonNull Coding relationship) {
    this.relationship = Optional.of(relationship);
    return this;
  }
  /** @param typeReference */
  public Contract_Term_AssetBuilder withTypeReference(@NonNull Reference... typeReference) {
    this.typeReference = Arrays.asList(typeReference);
    return this;
  }
  /** @param typeReference */
  public Contract_Term_AssetBuilder withTypeReference(
      @NonNull Collection<Reference> typeReference) {
    this.typeReference = Collections.unmodifiableCollection(typeReference);
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
  public Contract_Term_AssetBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public Contract_Term_AssetBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param securityLabelNumber */
  public Contract_Term_AssetBuilder withSecurityLabelNumber(
      @NonNull Integer... securityLabelNumber) {
    this.securityLabelNumber = Arrays.asList(securityLabelNumber);
    return this;
  }
  /** @param securityLabelNumber */
  public Contract_Term_AssetBuilder withSecurityLabelNumber(
      @NonNull Collection<Integer> securityLabelNumber) {
    this.securityLabelNumber = Collections.unmodifiableCollection(securityLabelNumber);
    return this;
  }
  /** @param context */
  public Contract_Term_AssetBuilder withContext(@NonNull Contract$Term$Asset$Context... context) {
    this.context = Arrays.asList(context);
    return this;
  }
  /** @param context */
  public Contract_Term_AssetBuilder withContext(
      @NonNull Collection<Contract$Term$Asset$Context> context) {
    this.context = Collections.unmodifiableCollection(context);
    return this;
  }
  /** @param valuedItem */
  public Contract_Term_AssetBuilder withValuedItem(
      @NonNull Contract$Term$Asset$ValuedItem... valuedItem) {
    this.valuedItem = Arrays.asList(valuedItem);
    return this;
  }
  /** @param valuedItem */
  public Contract_Term_AssetBuilder withValuedItem(
      @NonNull Collection<Contract$Term$Asset$ValuedItem> valuedItem) {
    this.valuedItem = Collections.unmodifiableCollection(valuedItem);
    return this;
  }

  public Contract$Term$Asset build() {
    return new Contract$Term$Asset(
        (Option) OptionConverters.toScala(id),
        _type.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(text),
        (Option) OptionConverters.toScala(scope),
        period.stream().collect(new LitSeqJCollector<>()),
        linkId.stream().collect(new LitSeqJCollector<>()),
        answer.stream().collect(new LitSeqJCollector<>()),
        subtype.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(condition),
        usePeriod.stream().collect(new LitSeqJCollector<>()),
        periodType.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(relationship),
        typeReference.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        securityLabelNumber.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        context.stream().collect(new LitSeqJCollector<>()),
        valuedItem.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
