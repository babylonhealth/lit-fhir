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
import com.babylonhealth.lit.hl7.EXPOSURE_STATE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class EffectEvidenceSynthesis_ResultsByExposureBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private Optional<CodeableConcept> variantState = Optional.empty();
  private Optional<EXPOSURE_STATE> exposureState = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Reference riskEvidenceSynthesis;

  /**
   * Required fields for {@link EffectEvidenceSynthesis.ResultsByExposure}
   *
   * @param riskEvidenceSynthesis
   */
  public EffectEvidenceSynthesis_ResultsByExposureBuilder(Reference riskEvidenceSynthesis) {
    this.riskEvidenceSynthesis = riskEvidenceSynthesis;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public EffectEvidenceSynthesis_ResultsByExposureBuilder withId(@NonNull String id) {
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
  public EffectEvidenceSynthesis_ResultsByExposureBuilder withExtension(
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
  public EffectEvidenceSynthesis_ResultsByExposureBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param description - A free text natural language description of the effect evidence synthesis
   *     from a consumer's perspective.
   */
  public EffectEvidenceSynthesis_ResultsByExposureBuilder withDescription(
      @NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /** @param variantState */
  public EffectEvidenceSynthesis_ResultsByExposureBuilder withVariantState(
      @NonNull CodeableConcept variantState) {
    this.variantState = Optional.of(variantState);
    return this;
  }
  /** @param exposureState */
  public EffectEvidenceSynthesis_ResultsByExposureBuilder withExposureState(
      @NonNull EXPOSURE_STATE exposureState) {
    this.exposureState = Optional.of(exposureState);
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
  public EffectEvidenceSynthesis_ResultsByExposureBuilder withModifierExtension(
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
  public EffectEvidenceSynthesis_ResultsByExposureBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public EffectEvidenceSynthesis.ResultsByExposure build() {
    return new EffectEvidenceSynthesis.ResultsByExposure(
        OptionConverters.toScala(id),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(description),
        OptionConverters.toScala(variantState),
        OptionConverters.toScala(exposureState),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        riskEvidenceSynthesis,
        LitUtils.emptyMetaElMap());
  }
}
