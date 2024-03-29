package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface MolecularSequence_StructureVariantBuilder {
  public MolecularSequence.StructureVariant build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements MolecularSequence_StructureVariantBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Boolean> exact = Optional.empty();
    private Optional<Integer> length = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<CodeableConcept> variantType = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<MolecularSequence$StructureVariant$Outer> outer = Optional.empty();
    private Optional<MolecularSequence$StructureVariant$Inner> inner = Optional.empty();

    /** Required fields for {@link MolecularSequence.StructureVariant} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MolecularSequence_StructureVariantBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param exact */
    public MolecularSequence_StructureVariantBuilder.Impl withExact(@NonNull Boolean exact) {
      this.exact = Optional.of(exact);
      return this;
    }
    /** @param length */
    public MolecularSequence_StructureVariantBuilder.Impl withLength(@NonNull Integer length) {
      this.length = Optional.of(length);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MolecularSequence_StructureVariantBuilder.Impl withExtension(
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
    public MolecularSequence_StructureVariantBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MolecularSequence_StructureVariantBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param variantType */
    public MolecularSequence_StructureVariantBuilder.Impl withVariantType(
        @NonNull CodeableConcept variantType) {
      this.variantType = Optional.of(variantType);
      return this;
    }

    public MolecularSequence_StructureVariantBuilder.Impl withVariantType(
        @NonNull CodeableConceptBuilder variantType) {
      this.variantType = Optional.of(variantType.build());
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
    public MolecularSequence_StructureVariantBuilder.Impl withModifierExtension(
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
    public MolecularSequence_StructureVariantBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MolecularSequence_StructureVariantBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param outer */
    public MolecularSequence_StructureVariantBuilder.Impl withOuter(
        @NonNull MolecularSequence$StructureVariant$Outer outer) {
      this.outer = Optional.of(outer);
      return this;
    }

    public MolecularSequence_StructureVariantBuilder.Impl withOuter(
        @NonNull MolecularSequence_StructureVariant_OuterBuilder outer) {
      this.outer = Optional.of(outer.build());
      return this;
    }
    /** @param inner */
    public MolecularSequence_StructureVariantBuilder.Impl withInner(
        @NonNull MolecularSequence$StructureVariant$Inner inner) {
      this.inner = Optional.of(inner);
      return this;
    }

    public MolecularSequence_StructureVariantBuilder.Impl withInner(
        @NonNull MolecularSequence_StructureVariant_InnerBuilder inner) {
      this.inner = Optional.of(inner.build());
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
}
