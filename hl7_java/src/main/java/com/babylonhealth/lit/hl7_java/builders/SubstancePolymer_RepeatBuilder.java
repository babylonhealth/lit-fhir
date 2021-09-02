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

public class SubstancePolymer_RepeatBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Integer> numberOfUnits = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<CodeableConcept> repeatUnitAmountType = Optional.empty();
  private Optional<String> averageMolecularFormula = Optional.empty();
  private Collection<SubstancePolymer$Repeat$RepeatUnit> repeatUnit = Collections.emptyList();

  /** Required fields for {@link SubstancePolymer.Repeat} */
  public SubstancePolymer_RepeatBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public SubstancePolymer_RepeatBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public SubstancePolymer_RepeatBuilder withExtension(@NonNull Extension... extension) {
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
  public SubstancePolymer_RepeatBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param numberOfUnits */
  public SubstancePolymer_RepeatBuilder withNumberOfUnits(@NonNull Integer numberOfUnits) {
    this.numberOfUnits = Optional.of(numberOfUnits);
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
  public SubstancePolymer_RepeatBuilder withModifierExtension(
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
  public SubstancePolymer_RepeatBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param repeatUnitAmountType */
  public SubstancePolymer_RepeatBuilder withRepeatUnitAmountType(
      @NonNull CodeableConcept repeatUnitAmountType) {
    this.repeatUnitAmountType = Optional.of(repeatUnitAmountType);
    return this;
  }
  /** @param averageMolecularFormula */
  public SubstancePolymer_RepeatBuilder withAverageMolecularFormula(
      @NonNull String averageMolecularFormula) {
    this.averageMolecularFormula = Optional.of(averageMolecularFormula);
    return this;
  }
  /** @param repeatUnit */
  public SubstancePolymer_RepeatBuilder withRepeatUnit(
      @NonNull SubstancePolymer$Repeat$RepeatUnit... repeatUnit) {
    this.repeatUnit = Arrays.asList(repeatUnit);
    return this;
  }
  /** @param repeatUnit */
  public SubstancePolymer_RepeatBuilder withRepeatUnit(
      @NonNull Collection<SubstancePolymer$Repeat$RepeatUnit> repeatUnit) {
    this.repeatUnit = Collections.unmodifiableCollection(repeatUnit);
    return this;
  }

  public SubstancePolymer.Repeat build() {
    return new SubstancePolymer.Repeat(
        (Option) OptionConverters.toScala(id),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(numberOfUnits.map(x -> (Object) x)),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(repeatUnitAmountType),
        (Option) OptionConverters.toScala(averageMolecularFormula),
        repeatUnit.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
