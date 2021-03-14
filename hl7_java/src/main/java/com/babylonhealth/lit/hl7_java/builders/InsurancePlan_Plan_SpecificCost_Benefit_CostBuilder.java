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

public class InsurancePlan_Plan_SpecificCost_Benefit_CostBuilder {
  private Optional<String> id = Optional.empty();
  private CodeableConcept _type;
  private Optional<Quantity> value = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<CodeableConcept> qualifiers = Collections.emptyList();
  private Optional<CodeableConcept> applicability = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link InsurancePlan$Plan$SpecificCost$Benefit$Cost}
   *
   * @param _type - The kind of health insurance product.
   */
  public InsurancePlan_Plan_SpecificCost_Benefit_CostBuilder(CodeableConcept _type) {
    this._type = _type;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public InsurancePlan_Plan_SpecificCost_Benefit_CostBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param value */
  public InsurancePlan_Plan_SpecificCost_Benefit_CostBuilder withValue(@NonNull Quantity value) {
    this.value = Optional.of(value);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public InsurancePlan_Plan_SpecificCost_Benefit_CostBuilder withExtension(
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
  public InsurancePlan_Plan_SpecificCost_Benefit_CostBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param qualifiers */
  public InsurancePlan_Plan_SpecificCost_Benefit_CostBuilder withQualifiers(
      @NonNull CodeableConcept... qualifiers) {
    this.qualifiers = Arrays.asList(qualifiers);
    return this;
  }
  /** @param qualifiers */
  public InsurancePlan_Plan_SpecificCost_Benefit_CostBuilder withQualifiers(
      @NonNull Collection<CodeableConcept> qualifiers) {
    this.qualifiers = Collections.unmodifiableCollection(qualifiers);
    return this;
  }
  /** @param applicability */
  public InsurancePlan_Plan_SpecificCost_Benefit_CostBuilder withApplicability(
      @NonNull CodeableConcept applicability) {
    this.applicability = Optional.of(applicability);
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
  public InsurancePlan_Plan_SpecificCost_Benefit_CostBuilder withModifierExtension(
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
  public InsurancePlan_Plan_SpecificCost_Benefit_CostBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public InsurancePlan$Plan$SpecificCost$Benefit$Cost build() {
    return new InsurancePlan$Plan$SpecificCost$Benefit$Cost(
        OptionConverters.toScala(id),
        _type,
        OptionConverters.toScala(value),
        extension.stream().collect(new LitSeqJCollector<>()),
        qualifiers.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(applicability),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
