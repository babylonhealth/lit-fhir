package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.Choice;
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
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface SubstancePolymer_Repeat_RepeatUnitBuilder {
  public SubstancePolymer$Repeat$RepeatUnit build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstancePolymer_Repeat_RepeatUnitBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Choice> amount = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> repeatUnit = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> orientationOfPolymerisation = Optional.empty();
    private Collection<SubstancePolymer$Repeat$RepeatUnit$DegreeOfPolymerisation>
        degreeOfPolymerisation = Collections.emptyList();
    private Collection<SubstancePolymer$Repeat$RepeatUnit$StructuralRepresentation>
        structuralRepresentation = Collections.emptyList();

    /** Required fields for {@link SubstancePolymer$Repeat$RepeatUnit} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param amount */
    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withAmount(@NonNull Choice amount) {
      this.amount = Optional.of(amount);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withExtension(
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
    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param repeatUnit */
    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withRepeatUnit(
        @NonNull String repeatUnit) {
      this.repeatUnit = Optional.of(repeatUnit);
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
    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withModifierExtension(
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
    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param orientationOfPolymerisation */
    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withOrientationOfPolymerisation(
        @NonNull CodeableConcept orientationOfPolymerisation) {
      this.orientationOfPolymerisation = Optional.of(orientationOfPolymerisation);
      return this;
    }

    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withOrientationOfPolymerisation(
        @NonNull CodeableConceptBuilder orientationOfPolymerisation) {
      this.orientationOfPolymerisation = Optional.of(orientationOfPolymerisation.build());
      return this;
    }
    /** @param degreeOfPolymerisation */
    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withDegreeOfPolymerisation(
        @NonNull
            SubstancePolymer$Repeat$RepeatUnit$DegreeOfPolymerisation... degreeOfPolymerisation) {
      this.degreeOfPolymerisation = Arrays.asList(degreeOfPolymerisation);
      return this;
    }
    /** @param degreeOfPolymerisation */
    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withDegreeOfPolymerisation(
        @NonNull
            Collection<SubstancePolymer$Repeat$RepeatUnit$DegreeOfPolymerisation>
                degreeOfPolymerisation) {
      this.degreeOfPolymerisation = Collections.unmodifiableCollection(degreeOfPolymerisation);
      return this;
    }

    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withDegreeOfPolymerisation(
        @NonNull
            SubstancePolymer_Repeat_RepeatUnit_DegreeOfPolymerisationBuilder...
                degreeOfPolymerisation) {
      this.degreeOfPolymerisation =
          Arrays.stream(degreeOfPolymerisation).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param structuralRepresentation */
    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withStructuralRepresentation(
        @NonNull
            SubstancePolymer$Repeat$RepeatUnit$StructuralRepresentation...
                structuralRepresentation) {
      this.structuralRepresentation = Arrays.asList(structuralRepresentation);
      return this;
    }
    /** @param structuralRepresentation */
    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withStructuralRepresentation(
        @NonNull
            Collection<SubstancePolymer$Repeat$RepeatUnit$StructuralRepresentation>
                structuralRepresentation) {
      this.structuralRepresentation = Collections.unmodifiableCollection(structuralRepresentation);
      return this;
    }

    public SubstancePolymer_Repeat_RepeatUnitBuilder.Impl withStructuralRepresentation(
        @NonNull
            SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentationBuilder...
                structuralRepresentation) {
      this.structuralRepresentation =
          Arrays.stream(structuralRepresentation).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubstancePolymer$Repeat$RepeatUnit build() {
      return new SubstancePolymer$Repeat$RepeatUnit(
          OptionConverters.toScala(id),
          (Option) OptionConverters.toScala(amount),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(repeatUnit),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(orientationOfPolymerisation),
          degreeOfPolymerisation.stream().collect(new LitSeqJCollector<>()),
          structuralRepresentation.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
