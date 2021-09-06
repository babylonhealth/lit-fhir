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

public class CoverageEligibilityResponse_InsuranceBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Boolean> inforce = Optional.empty();
  private Reference coverage;
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Period> benefitPeriod = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<CoverageEligibilityResponse$Insurance$Item> item = Collections.emptyList();

  /**
   * Required fields for {@link CoverageEligibilityResponse.Insurance}
   *
   * @param coverage
   */
  public CoverageEligibilityResponse_InsuranceBuilder(Reference coverage) {
    this.coverage = coverage;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public CoverageEligibilityResponse_InsuranceBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param inforce */
  public CoverageEligibilityResponse_InsuranceBuilder withInforce(@NonNull Boolean inforce) {
    this.inforce = Optional.of(inforce);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public CoverageEligibilityResponse_InsuranceBuilder withExtension(
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
  public CoverageEligibilityResponse_InsuranceBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param benefitPeriod */
  public CoverageEligibilityResponse_InsuranceBuilder withBenefitPeriod(
      @NonNull Period benefitPeriod) {
    this.benefitPeriod = Optional.of(benefitPeriod);
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
  public CoverageEligibilityResponse_InsuranceBuilder withModifierExtension(
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
  public CoverageEligibilityResponse_InsuranceBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param item */
  public CoverageEligibilityResponse_InsuranceBuilder withItem(
      @NonNull CoverageEligibilityResponse$Insurance$Item... item) {
    this.item = Arrays.asList(item);
    return this;
  }
  /** @param item */
  public CoverageEligibilityResponse_InsuranceBuilder withItem(
      @NonNull Collection<CoverageEligibilityResponse$Insurance$Item> item) {
    this.item = Collections.unmodifiableCollection(item);
    return this;
  }

  public CoverageEligibilityResponse.Insurance build() {
    return new CoverageEligibilityResponse.Insurance(
        OptionConverters.toScala(id),
        OptionConverters.toScala(inforce.map(x -> (Object) x)),
        coverage,
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(benefitPeriod),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        item.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
