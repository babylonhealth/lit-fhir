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

public interface MolecularSequence_VariantBuilder {
  public MolecularSequence.Variant build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements MolecularSequence_VariantBuilder {
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
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MolecularSequence_VariantBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param end */
    public MolecularSequence_VariantBuilder.Impl withEnd(@NonNull Integer end) {
      this.end = Optional.of(end);
      return this;
    }
    /** @param start */
    public MolecularSequence_VariantBuilder.Impl withStart(@NonNull Integer start) {
      this.start = Optional.of(start);
      return this;
    }
    /** @param cigar */
    public MolecularSequence_VariantBuilder.Impl withCigar(@NonNull String cigar) {
      this.cigar = Optional.of(cigar);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MolecularSequence_VariantBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MolecularSequence_VariantBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MolecularSequence_VariantBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param observedAllele */
    public MolecularSequence_VariantBuilder.Impl withObservedAllele(
        @NonNull String observedAllele) {
      this.observedAllele = Optional.of(observedAllele);
      return this;
    }
    /** @param variantPointer */
    public MolecularSequence_VariantBuilder.Impl withVariantPointer(
        @NonNull Reference variantPointer) {
      this.variantPointer = Optional.of(variantPointer);
      return this;
    }

    public MolecularSequence_VariantBuilder.Impl withVariantPointer(
        @NonNull ReferenceBuilder variantPointer) {
      this.variantPointer = Optional.of(variantPointer.build());
      return this;
    }
    /** @param referenceAllele */
    public MolecularSequence_VariantBuilder.Impl withReferenceAllele(
        @NonNull String referenceAllele) {
      this.referenceAllele = Optional.of(referenceAllele);
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
    public MolecularSequence_VariantBuilder.Impl withModifierExtension(
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
    public MolecularSequence_VariantBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MolecularSequence_VariantBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
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
}
