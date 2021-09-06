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

public interface RiskEvidenceSynthesis_RiskEstimate_PrecisionEstimateBuilder {
  public RiskEvidenceSynthesis$RiskEstimate$PrecisionEstimate build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements RiskEvidenceSynthesis_RiskEstimate_PrecisionEstimateBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<BigDecimal> to = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<BigDecimal> from = Optional.empty();
    private Optional<BigDecimal> level = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link RiskEvidenceSynthesis$RiskEstimate$PrecisionEstimate} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public RiskEvidenceSynthesis_RiskEstimate_PrecisionEstimateBuilder.Impl withId(
        @NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param to */
    public RiskEvidenceSynthesis_RiskEstimate_PrecisionEstimateBuilder.Impl withTo(
        @NonNull BigDecimal to) {
      this.to = Optional.of(to);
      return this;
    }
    /** @param _type */
    public RiskEvidenceSynthesis_RiskEstimate_PrecisionEstimateBuilder.Impl withType(
        @NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }
    /** @param from */
    public RiskEvidenceSynthesis_RiskEstimate_PrecisionEstimateBuilder.Impl withFrom(
        @NonNull BigDecimal from) {
      this.from = Optional.of(from);
      return this;
    }
    /** @param level */
    public RiskEvidenceSynthesis_RiskEstimate_PrecisionEstimateBuilder.Impl withLevel(
        @NonNull BigDecimal level) {
      this.level = Optional.of(level);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public RiskEvidenceSynthesis_RiskEstimate_PrecisionEstimateBuilder.Impl withExtension(
        @NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public RiskEvidenceSynthesis_RiskEstimate_PrecisionEstimateBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public RiskEvidenceSynthesis_RiskEstimate_PrecisionEstimateBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public RiskEvidenceSynthesis_RiskEstimate_PrecisionEstimateBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public RiskEvidenceSynthesis$RiskEstimate$PrecisionEstimate build() {
      return new RiskEvidenceSynthesis$RiskEstimate$PrecisionEstimate(
          OptionConverters.toScala(id),
          OptionConverters.toScala(to),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(from),
          OptionConverters.toScala(level),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
