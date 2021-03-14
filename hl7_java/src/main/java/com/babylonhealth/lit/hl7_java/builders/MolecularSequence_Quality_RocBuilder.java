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

public class MolecularSequence_Quality_RocBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<Integer> score = Collections.emptyList();
  private Collection<Integer> numTP = Collections.emptyList();
  private Collection<Integer> numFP = Collections.emptyList();
  private Collection<Integer> numFN = Collections.emptyList();
  private Collection<BigDecimal> fMeasure = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<BigDecimal> precision = Collections.emptyList();
  private Collection<BigDecimal> sensitivity = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /** Required fields for {@link MolecularSequence$Quality$Roc} */
  public MolecularSequence_Quality_RocBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public MolecularSequence_Quality_RocBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param score */
  public MolecularSequence_Quality_RocBuilder withScore(@NonNull Integer... score) {
    this.score = Arrays.asList(score);
    return this;
  }
  /** @param score */
  public MolecularSequence_Quality_RocBuilder withScore(@NonNull Collection<Integer> score) {
    this.score = Collections.unmodifiableCollection(score);
    return this;
  }
  /** @param numTP */
  public MolecularSequence_Quality_RocBuilder withNumTP(@NonNull Integer... numTP) {
    this.numTP = Arrays.asList(numTP);
    return this;
  }
  /** @param numTP */
  public MolecularSequence_Quality_RocBuilder withNumTP(@NonNull Collection<Integer> numTP) {
    this.numTP = Collections.unmodifiableCollection(numTP);
    return this;
  }
  /** @param numFP */
  public MolecularSequence_Quality_RocBuilder withNumFP(@NonNull Integer... numFP) {
    this.numFP = Arrays.asList(numFP);
    return this;
  }
  /** @param numFP */
  public MolecularSequence_Quality_RocBuilder withNumFP(@NonNull Collection<Integer> numFP) {
    this.numFP = Collections.unmodifiableCollection(numFP);
    return this;
  }
  /** @param numFN */
  public MolecularSequence_Quality_RocBuilder withNumFN(@NonNull Integer... numFN) {
    this.numFN = Arrays.asList(numFN);
    return this;
  }
  /** @param numFN */
  public MolecularSequence_Quality_RocBuilder withNumFN(@NonNull Collection<Integer> numFN) {
    this.numFN = Collections.unmodifiableCollection(numFN);
    return this;
  }
  /** @param fMeasure */
  public MolecularSequence_Quality_RocBuilder withFMeasure(@NonNull BigDecimal... fMeasure) {
    this.fMeasure = Arrays.asList(fMeasure);
    return this;
  }
  /** @param fMeasure */
  public MolecularSequence_Quality_RocBuilder withFMeasure(
      @NonNull Collection<BigDecimal> fMeasure) {
    this.fMeasure = Collections.unmodifiableCollection(fMeasure);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public MolecularSequence_Quality_RocBuilder withExtension(@NonNull Extension... extension) {
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
  public MolecularSequence_Quality_RocBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param precision */
  public MolecularSequence_Quality_RocBuilder withPrecision(@NonNull BigDecimal... precision) {
    this.precision = Arrays.asList(precision);
    return this;
  }
  /** @param precision */
  public MolecularSequence_Quality_RocBuilder withPrecision(
      @NonNull Collection<BigDecimal> precision) {
    this.precision = Collections.unmodifiableCollection(precision);
    return this;
  }
  /** @param sensitivity */
  public MolecularSequence_Quality_RocBuilder withSensitivity(@NonNull BigDecimal... sensitivity) {
    this.sensitivity = Arrays.asList(sensitivity);
    return this;
  }
  /** @param sensitivity */
  public MolecularSequence_Quality_RocBuilder withSensitivity(
      @NonNull Collection<BigDecimal> sensitivity) {
    this.sensitivity = Collections.unmodifiableCollection(sensitivity);
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
  public MolecularSequence_Quality_RocBuilder withModifierExtension(
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
  public MolecularSequence_Quality_RocBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public MolecularSequence$Quality$Roc build() {
    return new MolecularSequence$Quality$Roc(
        OptionConverters.toScala(id),
        score.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        numTP.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        numFP.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        numFN.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        fMeasure.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        precision.stream().collect(new LitSeqJCollector<>()),
        sensitivity.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
