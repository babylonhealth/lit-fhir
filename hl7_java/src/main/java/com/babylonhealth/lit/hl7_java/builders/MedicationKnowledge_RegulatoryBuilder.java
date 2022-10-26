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

public interface MedicationKnowledge_RegulatoryBuilder {
  public MedicationKnowledge.Regulatory build();

  public static Impl init(Reference regulatoryAuthority) {
    return new Impl(regulatoryAuthority);
  }

  public static Impl builder(ReferenceBuilder regulatoryAuthority) {
    return new Impl(regulatoryAuthority.build());
  }

  public class Impl implements MedicationKnowledge_RegulatoryBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Reference regulatoryAuthority;
    private Collection<MedicationKnowledge$Regulatory$Schedule> schedule = Collections.emptyList();
    private Optional<MedicationKnowledge$Regulatory$MaxDispense> maxDispense = Optional.empty();
    private Collection<MedicationKnowledge$Regulatory$Substitution> substitution =
        Collections.emptyList();

    /**
     * Required fields for {@link MedicationKnowledge.Regulatory}
     *
     * @param regulatoryAuthority
     */
    public Impl(Reference regulatoryAuthority) {
      this.regulatoryAuthority = regulatoryAuthority;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicationKnowledge_RegulatoryBuilder.Impl withId(@NonNull String id) {
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
    public MedicationKnowledge_RegulatoryBuilder.Impl withExtension(
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
    public MedicationKnowledge_RegulatoryBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicationKnowledge_RegulatoryBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
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
    public MedicationKnowledge_RegulatoryBuilder.Impl withModifierExtension(
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
    public MedicationKnowledge_RegulatoryBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicationKnowledge_RegulatoryBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param schedule */
    public MedicationKnowledge_RegulatoryBuilder.Impl withSchedule(
        @NonNull MedicationKnowledge$Regulatory$Schedule... schedule) {
      this.schedule = Arrays.asList(schedule);
      return this;
    }
    /** @param schedule */
    public MedicationKnowledge_RegulatoryBuilder.Impl withSchedule(
        @NonNull Collection<MedicationKnowledge$Regulatory$Schedule> schedule) {
      this.schedule = Collections.unmodifiableCollection(schedule);
      return this;
    }

    public MedicationKnowledge_RegulatoryBuilder.Impl withSchedule(
        @NonNull MedicationKnowledge_Regulatory_ScheduleBuilder... schedule) {
      this.schedule = Arrays.stream(schedule).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param maxDispense */
    public MedicationKnowledge_RegulatoryBuilder.Impl withMaxDispense(
        @NonNull MedicationKnowledge$Regulatory$MaxDispense maxDispense) {
      this.maxDispense = Optional.of(maxDispense);
      return this;
    }

    public MedicationKnowledge_RegulatoryBuilder.Impl withMaxDispense(
        @NonNull MedicationKnowledge_Regulatory_MaxDispenseBuilder maxDispense) {
      this.maxDispense = Optional.of(maxDispense.build());
      return this;
    }
    /** @param substitution */
    public MedicationKnowledge_RegulatoryBuilder.Impl withSubstitution(
        @NonNull MedicationKnowledge$Regulatory$Substitution... substitution) {
      this.substitution = Arrays.asList(substitution);
      return this;
    }
    /** @param substitution */
    public MedicationKnowledge_RegulatoryBuilder.Impl withSubstitution(
        @NonNull Collection<MedicationKnowledge$Regulatory$Substitution> substitution) {
      this.substitution = Collections.unmodifiableCollection(substitution);
      return this;
    }

    public MedicationKnowledge_RegulatoryBuilder.Impl withSubstitution(
        @NonNull MedicationKnowledge_Regulatory_SubstitutionBuilder... substitution) {
      this.substitution = Arrays.stream(substitution).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicationKnowledge.Regulatory build() {
      return new MedicationKnowledge.Regulatory(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          regulatoryAuthority,
          schedule.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(maxDispense),
          substitution.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
