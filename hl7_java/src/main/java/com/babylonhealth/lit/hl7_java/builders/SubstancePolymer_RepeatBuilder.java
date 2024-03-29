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

public interface SubstancePolymer_RepeatBuilder {
  public SubstancePolymer.Repeat build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstancePolymer_RepeatBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Integer> numberOfUnits = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> repeatUnitAmountType = Optional.empty();
    private Optional<String> averageMolecularFormula = Optional.empty();
    private Collection<SubstancePolymer$Repeat$RepeatUnit> repeatUnit = Collections.emptyList();

    /** Required fields for {@link SubstancePolymer.Repeat} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstancePolymer_RepeatBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstancePolymer_RepeatBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SubstancePolymer_RepeatBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstancePolymer_RepeatBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param numberOfUnits */
    public SubstancePolymer_RepeatBuilder.Impl withNumberOfUnits(@NonNull Integer numberOfUnits) {
      this.numberOfUnits = Optional.of(numberOfUnits);
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
    public SubstancePolymer_RepeatBuilder.Impl withModifierExtension(
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
    public SubstancePolymer_RepeatBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstancePolymer_RepeatBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param repeatUnitAmountType */
    public SubstancePolymer_RepeatBuilder.Impl withRepeatUnitAmountType(
        @NonNull CodeableConcept repeatUnitAmountType) {
      this.repeatUnitAmountType = Optional.of(repeatUnitAmountType);
      return this;
    }

    public SubstancePolymer_RepeatBuilder.Impl withRepeatUnitAmountType(
        @NonNull CodeableConceptBuilder repeatUnitAmountType) {
      this.repeatUnitAmountType = Optional.of(repeatUnitAmountType.build());
      return this;
    }
    /** @param averageMolecularFormula */
    public SubstancePolymer_RepeatBuilder.Impl withAverageMolecularFormula(
        @NonNull String averageMolecularFormula) {
      this.averageMolecularFormula = Optional.of(averageMolecularFormula);
      return this;
    }
    /** @param repeatUnit */
    public SubstancePolymer_RepeatBuilder.Impl withRepeatUnit(
        @NonNull SubstancePolymer$Repeat$RepeatUnit... repeatUnit) {
      this.repeatUnit = Arrays.asList(repeatUnit);
      return this;
    }
    /** @param repeatUnit */
    public SubstancePolymer_RepeatBuilder.Impl withRepeatUnit(
        @NonNull Collection<SubstancePolymer$Repeat$RepeatUnit> repeatUnit) {
      this.repeatUnit = Collections.unmodifiableCollection(repeatUnit);
      return this;
    }

    public SubstancePolymer_RepeatBuilder.Impl withRepeatUnit(
        @NonNull SubstancePolymer_Repeat_RepeatUnitBuilder... repeatUnit) {
      this.repeatUnit = Arrays.stream(repeatUnit).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubstancePolymer.Repeat build() {
      return new SubstancePolymer.Repeat(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(numberOfUnits.map(x -> (Object) x)),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(repeatUnitAmountType),
          OptionConverters.toScala(averageMolecularFormula),
          repeatUnit.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
