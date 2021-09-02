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
import com.babylonhealth.lit.hl7.STRAND_TYPE;
import com.babylonhealth.lit.hl7.ORIENTATION_TYPE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class MolecularSequence_ReferenceSeqBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<STRAND_TYPE> strand = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Integer> windowEnd = Optional.empty();
  private Optional<CodeableConcept> chromosome = Optional.empty();
  private Optional<String> genomeBuild = Optional.empty();
  private Optional<ORIENTATION_TYPE> orientation = Optional.empty();
  private Optional<Integer> windowStart = Optional.empty();
  private Optional<CodeableConcept> referenceSeqId = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<String> referenceSeqString = Optional.empty();
  private Optional<Reference> referenceSeqPointer = Optional.empty();

  /** Required fields for {@link MolecularSequence.ReferenceSeq} */
  public MolecularSequence_ReferenceSeqBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public MolecularSequence_ReferenceSeqBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param strand */
  public MolecularSequence_ReferenceSeqBuilder withStrand(@NonNull STRAND_TYPE strand) {
    this.strand = Optional.of(strand);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public MolecularSequence_ReferenceSeqBuilder withExtension(@NonNull Extension... extension) {
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
  public MolecularSequence_ReferenceSeqBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param windowEnd */
  public MolecularSequence_ReferenceSeqBuilder withWindowEnd(@NonNull Integer windowEnd) {
    this.windowEnd = Optional.of(windowEnd);
    return this;
  }
  /** @param chromosome */
  public MolecularSequence_ReferenceSeqBuilder withChromosome(@NonNull CodeableConcept chromosome) {
    this.chromosome = Optional.of(chromosome);
    return this;
  }
  /** @param genomeBuild */
  public MolecularSequence_ReferenceSeqBuilder withGenomeBuild(@NonNull String genomeBuild) {
    this.genomeBuild = Optional.of(genomeBuild);
    return this;
  }
  /** @param orientation */
  public MolecularSequence_ReferenceSeqBuilder withOrientation(
      @NonNull ORIENTATION_TYPE orientation) {
    this.orientation = Optional.of(orientation);
    return this;
  }
  /** @param windowStart */
  public MolecularSequence_ReferenceSeqBuilder withWindowStart(@NonNull Integer windowStart) {
    this.windowStart = Optional.of(windowStart);
    return this;
  }
  /** @param referenceSeqId */
  public MolecularSequence_ReferenceSeqBuilder withReferenceSeqId(
      @NonNull CodeableConcept referenceSeqId) {
    this.referenceSeqId = Optional.of(referenceSeqId);
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
  public MolecularSequence_ReferenceSeqBuilder withModifierExtension(
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
  public MolecularSequence_ReferenceSeqBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param referenceSeqString */
  public MolecularSequence_ReferenceSeqBuilder withReferenceSeqString(
      @NonNull String referenceSeqString) {
    this.referenceSeqString = Optional.of(referenceSeqString);
    return this;
  }
  /** @param referenceSeqPointer */
  public MolecularSequence_ReferenceSeqBuilder withReferenceSeqPointer(
      @NonNull Reference referenceSeqPointer) {
    this.referenceSeqPointer = Optional.of(referenceSeqPointer);
    return this;
  }

  public MolecularSequence.ReferenceSeq build() {
    return new MolecularSequence.ReferenceSeq(
        OptionConverters.toScala(id),
        OptionConverters.toScala(strand),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(windowEnd.map(x -> (Object) x)),
        OptionConverters.toScala(chromosome),
        OptionConverters.toScala(genomeBuild),
        OptionConverters.toScala(orientation),
        OptionConverters.toScala(windowStart.map(x -> (Object) x)),
        OptionConverters.toScala(referenceSeqId),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(referenceSeqString),
        OptionConverters.toScala(referenceSeqPointer),
        LitUtils.emptyMetaElMap());
  }
}
