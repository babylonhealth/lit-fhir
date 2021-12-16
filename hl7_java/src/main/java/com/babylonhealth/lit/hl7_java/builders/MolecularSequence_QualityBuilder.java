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
import com.babylonhealth.lit.hl7.QUALITY_TYPE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface MolecularSequence_QualityBuilder {
  public MolecularSequence.Quality build();

  public static Impl init(QUALITY_TYPE _type) {
    return new Impl(_type);
  }

  public static Impl builder(QUALITY_TYPE _type) {
    return new Impl(_type);
  }

  public class Impl implements MolecularSequence_QualityBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Integer> end = Optional.empty();
    private QUALITY_TYPE _type;
    private Optional<BigDecimal> gtFP = Optional.empty();
    private Optional<Integer> start = Optional.empty();
    private Optional<Quantity> score = Optional.empty();
    private Optional<CodeableConcept> method = Optional.empty();
    private Optional<BigDecimal> recall = Optional.empty();
    private Optional<BigDecimal> fScore = Optional.empty();
    private Optional<BigDecimal> truthTP = Optional.empty();
    private Optional<BigDecimal> queryTP = Optional.empty();
    private Optional<BigDecimal> truthFN = Optional.empty();
    private Optional<BigDecimal> queryFP = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<BigDecimal> precision = Optional.empty();
    private Optional<CodeableConcept> standardSequence = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<MolecularSequence$Quality$Roc> roc = Optional.empty();

    /**
     * Required fields for {@link MolecularSequence.Quality}
     *
     * @param _type - Amino Acid Sequence/ DNA Sequence / RNA Sequence.
     */
    public Impl(QUALITY_TYPE _type) {
      this._type = _type;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MolecularSequence_QualityBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param end */
    public MolecularSequence_QualityBuilder.Impl withEnd(@NonNull Integer end) {
      this.end = Optional.of(end);
      return this;
    }
    /** @param gtFP */
    public MolecularSequence_QualityBuilder.Impl withGtFP(@NonNull BigDecimal gtFP) {
      this.gtFP = Optional.of(gtFP);
      return this;
    }
    /** @param start */
    public MolecularSequence_QualityBuilder.Impl withStart(@NonNull Integer start) {
      this.start = Optional.of(start);
      return this;
    }
    /** @param score */
    public MolecularSequence_QualityBuilder.Impl withScore(@NonNull Quantity score) {
      this.score = Optional.of(score);
      return this;
    }

    public MolecularSequence_QualityBuilder.Impl withScore(@NonNull QuantityBuilder score) {
      this.score = Optional.of(score.build());
      return this;
    }
    /** @param method */
    public MolecularSequence_QualityBuilder.Impl withMethod(@NonNull CodeableConcept method) {
      this.method = Optional.of(method);
      return this;
    }

    public MolecularSequence_QualityBuilder.Impl withMethod(
        @NonNull CodeableConceptBuilder method) {
      this.method = Optional.of(method.build());
      return this;
    }
    /** @param recall */
    public MolecularSequence_QualityBuilder.Impl withRecall(@NonNull BigDecimal recall) {
      this.recall = Optional.of(recall);
      return this;
    }
    /** @param fScore */
    public MolecularSequence_QualityBuilder.Impl withFScore(@NonNull BigDecimal fScore) {
      this.fScore = Optional.of(fScore);
      return this;
    }
    /** @param truthTP */
    public MolecularSequence_QualityBuilder.Impl withTruthTP(@NonNull BigDecimal truthTP) {
      this.truthTP = Optional.of(truthTP);
      return this;
    }
    /** @param queryTP */
    public MolecularSequence_QualityBuilder.Impl withQueryTP(@NonNull BigDecimal queryTP) {
      this.queryTP = Optional.of(queryTP);
      return this;
    }
    /** @param truthFN */
    public MolecularSequence_QualityBuilder.Impl withTruthFN(@NonNull BigDecimal truthFN) {
      this.truthFN = Optional.of(truthFN);
      return this;
    }
    /** @param queryFP */
    public MolecularSequence_QualityBuilder.Impl withQueryFP(@NonNull BigDecimal queryFP) {
      this.queryFP = Optional.of(queryFP);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MolecularSequence_QualityBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MolecularSequence_QualityBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MolecularSequence_QualityBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param precision */
    public MolecularSequence_QualityBuilder.Impl withPrecision(@NonNull BigDecimal precision) {
      this.precision = Optional.of(precision);
      return this;
    }
    /** @param standardSequence */
    public MolecularSequence_QualityBuilder.Impl withStandardSequence(
        @NonNull CodeableConcept standardSequence) {
      this.standardSequence = Optional.of(standardSequence);
      return this;
    }

    public MolecularSequence_QualityBuilder.Impl withStandardSequence(
        @NonNull CodeableConceptBuilder standardSequence) {
      this.standardSequence = Optional.of(standardSequence.build());
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
    public MolecularSequence_QualityBuilder.Impl withModifierExtension(
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
    public MolecularSequence_QualityBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MolecularSequence_QualityBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param roc */
    public MolecularSequence_QualityBuilder.Impl withRoc(
        @NonNull MolecularSequence$Quality$Roc roc) {
      this.roc = Optional.of(roc);
      return this;
    }

    public MolecularSequence_QualityBuilder.Impl withRoc(
        @NonNull MolecularSequence_Quality_RocBuilder roc) {
      this.roc = Optional.of(roc.build());
      return this;
    }

    public MolecularSequence.Quality build() {
      return new MolecularSequence.Quality(
          OptionConverters.toScala(id),
          OptionConverters.toScala(end.map(x -> (Object) x)),
          _type,
          OptionConverters.toScala(gtFP),
          OptionConverters.toScala(start.map(x -> (Object) x)),
          OptionConverters.toScala(score),
          OptionConverters.toScala(method),
          OptionConverters.toScala(recall),
          OptionConverters.toScala(fScore),
          OptionConverters.toScala(truthTP),
          OptionConverters.toScala(queryTP),
          OptionConverters.toScala(truthFN),
          OptionConverters.toScala(queryFP),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(precision),
          OptionConverters.toScala(standardSequence),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(roc),
          LitUtils.emptyMetaElMap());
    }
  }
}
