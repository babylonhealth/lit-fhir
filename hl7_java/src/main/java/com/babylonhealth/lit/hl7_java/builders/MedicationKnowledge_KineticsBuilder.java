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

public interface MedicationKnowledge_KineticsBuilder {
  public MedicationKnowledge.Kinetics build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements MedicationKnowledge_KineticsBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Quantity> lethalDose50 = Collections.emptyList();
    private Collection<Quantity> areaUnderCurve = Collections.emptyList();
    private Optional<Duration> halfLifePeriod = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link MedicationKnowledge.Kinetics} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicationKnowledge_KineticsBuilder.Impl withId(@NonNull String id) {
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
    public MedicationKnowledge_KineticsBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MedicationKnowledge_KineticsBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicationKnowledge_KineticsBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param lethalDose50 */
    public MedicationKnowledge_KineticsBuilder.Impl withLethalDose50(
        @NonNull Quantity... lethalDose50) {
      this.lethalDose50 = Arrays.asList(lethalDose50);
      return this;
    }
    /** @param lethalDose50 */
    public MedicationKnowledge_KineticsBuilder.Impl withLethalDose50(
        @NonNull Collection<Quantity> lethalDose50) {
      this.lethalDose50 = Collections.unmodifiableCollection(lethalDose50);
      return this;
    }

    public MedicationKnowledge_KineticsBuilder.Impl withLethalDose50(
        @NonNull QuantityBuilder... lethalDose50) {
      this.lethalDose50 = Arrays.stream(lethalDose50).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param areaUnderCurve */
    public MedicationKnowledge_KineticsBuilder.Impl withAreaUnderCurve(
        @NonNull Quantity... areaUnderCurve) {
      this.areaUnderCurve = Arrays.asList(areaUnderCurve);
      return this;
    }
    /** @param areaUnderCurve */
    public MedicationKnowledge_KineticsBuilder.Impl withAreaUnderCurve(
        @NonNull Collection<Quantity> areaUnderCurve) {
      this.areaUnderCurve = Collections.unmodifiableCollection(areaUnderCurve);
      return this;
    }

    public MedicationKnowledge_KineticsBuilder.Impl withAreaUnderCurve(
        @NonNull QuantityBuilder... areaUnderCurve) {
      this.areaUnderCurve = Arrays.stream(areaUnderCurve).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param halfLifePeriod */
    public MedicationKnowledge_KineticsBuilder.Impl withHalfLifePeriod(
        @NonNull Duration halfLifePeriod) {
      this.halfLifePeriod = Optional.of(halfLifePeriod);
      return this;
    }

    public MedicationKnowledge_KineticsBuilder.Impl withHalfLifePeriod(
        @NonNull DurationBuilder halfLifePeriod) {
      this.halfLifePeriod = Optional.of(halfLifePeriod.build());
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
    public MedicationKnowledge_KineticsBuilder.Impl withModifierExtension(
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
    public MedicationKnowledge_KineticsBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicationKnowledge_KineticsBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicationKnowledge.Kinetics build() {
      return new MedicationKnowledge.Kinetics(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          lethalDose50.stream().collect(new LitSeqJCollector<>()),
          areaUnderCurve.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(halfLifePeriod),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
