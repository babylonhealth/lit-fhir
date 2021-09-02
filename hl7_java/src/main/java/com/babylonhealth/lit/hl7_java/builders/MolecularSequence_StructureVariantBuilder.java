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

public class MolecularSequence_StructureVariantBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Boolean> exact = Optional.empty();
  private Optional<Integer> length = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<CodeableConcept> variantType = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<MolecularSequence$StructureVariant$Outer> outer = Optional.empty();
  private Optional<MolecularSequence$StructureVariant$Inner> inner = Optional.empty();

  /** Required fields for {@link MolecularSequence.StructureVariant} */
  public MolecularSequence_StructureVariantBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public MolecularSequence_StructureVariantBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param exact */
  public MolecularSequence_StructureVariantBuilder withExact(@NonNull Boolean exact) {
    this.exact = Optional.of(exact);
    return this;
  }
  /** @param length */
  public MolecularSequence_StructureVariantBuilder withLength(@NonNull Integer length) {
    this.length = Optional.of(length);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public MolecularSequence_StructureVariantBuilder withExtension(@NonNull Extension... extension) {
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
  public MolecularSequence_StructureVariantBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param variantType */
  public MolecularSequence_StructureVariantBuilder withVariantType(
      @NonNull CodeableConcept variantType) {
    this.variantType = Optional.of(variantType);
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
  public MolecularSequence_StructureVariantBuilder withModifierExtension(
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
  public MolecularSequence_StructureVariantBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param outer */
  public MolecularSequence_StructureVariantBuilder withOuter(
      @NonNull MolecularSequence$StructureVariant$Outer outer) {
    this.outer = Optional.of(outer);
    return this;
  }
  /** @param inner */
  public MolecularSequence_StructureVariantBuilder withInner(
      @NonNull MolecularSequence$StructureVariant$Inner inner) {
    this.inner = Optional.of(inner);
    return this;
  }

  public MolecularSequence.StructureVariant build() {
    return new MolecularSequence.StructureVariant(
        OptionConverters.toScala(id),
        OptionConverters.toScala(exact.map(x -> (Object) x)),
        OptionConverters.toScala(length.map(x -> (Object) x)),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(variantType),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(outer),
        OptionConverters.toScala(inner),
        LitUtils.emptyMetaElMap());
  }
}
