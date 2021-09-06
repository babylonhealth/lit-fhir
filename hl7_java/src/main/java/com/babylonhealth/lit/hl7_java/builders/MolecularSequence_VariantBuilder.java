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

public class MolecularSequence_VariantBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Integer> end = Optional.empty();
  private Optional<Integer> start = Optional.empty();
  private Optional<String> cigar = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> observedAllele = Optional.empty();
  private Optional<Reference> variantPointer = Optional.empty();
  private Optional<String> referenceAllele = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /** Required fields for {@link MolecularSequence.Variant} */
  public MolecularSequence_VariantBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public MolecularSequence_VariantBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param end */
  public MolecularSequence_VariantBuilder withEnd(@NonNull Integer end) {
    this.end = Optional.of(end);
    return this;
  }
  /** @param start */
  public MolecularSequence_VariantBuilder withStart(@NonNull Integer start) {
    this.start = Optional.of(start);
    return this;
  }
  /** @param cigar */
  public MolecularSequence_VariantBuilder withCigar(@NonNull String cigar) {
    this.cigar = Optional.of(cigar);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public MolecularSequence_VariantBuilder withExtension(@NonNull Extension... extension) {
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
  public MolecularSequence_VariantBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param observedAllele */
  public MolecularSequence_VariantBuilder withObservedAllele(@NonNull String observedAllele) {
    this.observedAllele = Optional.of(observedAllele);
    return this;
  }
  /** @param variantPointer */
  public MolecularSequence_VariantBuilder withVariantPointer(@NonNull Reference variantPointer) {
    this.variantPointer = Optional.of(variantPointer);
    return this;
  }
  /** @param referenceAllele */
  public MolecularSequence_VariantBuilder withReferenceAllele(@NonNull String referenceAllele) {
    this.referenceAllele = Optional.of(referenceAllele);
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
  public MolecularSequence_VariantBuilder withModifierExtension(
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
  public MolecularSequence_VariantBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public MolecularSequence.Variant build() {
    return new MolecularSequence.Variant(
        OptionConverters.toScala(id),
        OptionConverters.toScala(end.map(x -> (Object) x)),
        OptionConverters.toScala(start.map(x -> (Object) x)),
        OptionConverters.toScala(cigar),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(observedAllele),
        OptionConverters.toScala(variantPointer),
        OptionConverters.toScala(referenceAllele),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
