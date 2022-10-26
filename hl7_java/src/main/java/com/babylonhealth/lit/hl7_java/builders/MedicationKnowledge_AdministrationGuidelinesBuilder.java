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
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface MedicationKnowledge_AdministrationGuidelinesBuilder {
  public MedicationKnowledge.AdministrationGuidelines build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceCodeableConceptOrReference indication(CodeableConcept c) {
    return new ChoiceCodeableConceptOrReference(c);
  }

  public static ChoiceCodeableConceptOrReference indication(Reference r) {
    return new ChoiceCodeableConceptOrReference(r);
  }

  public class Impl implements MedicationKnowledge_AdministrationGuidelinesBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceCodeableConceptOrReference> indication = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<MedicationKnowledge$AdministrationGuidelines$Dosage> dosage =
        Collections.emptyList();
    private Collection<MedicationKnowledge$AdministrationGuidelines$PatientCharacteristics>
        patientCharacteristics = Collections.emptyList();

    /** Required fields for {@link MedicationKnowledge.AdministrationGuidelines} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withId(@NonNull String id) {
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
    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withExtension(
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
    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param indication Field is a 'choice' field. Type should be one of CodeableConcept,
     *     Reference. To pass the value in, wrap with one of the
     *     MedicationKnowledge_AdministrationGuidelinesBuilder.indication static methods
     */
    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withIndication(
        @NonNull ChoiceCodeableConceptOrReference indication) {
      this.indication = Optional.of(indication);
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
    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withModifierExtension(
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
    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param dosage */
    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withDosage(
        @NonNull MedicationKnowledge$AdministrationGuidelines$Dosage... dosage) {
      this.dosage = Arrays.asList(dosage);
      return this;
    }
    /** @param dosage */
    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withDosage(
        @NonNull Collection<MedicationKnowledge$AdministrationGuidelines$Dosage> dosage) {
      this.dosage = Collections.unmodifiableCollection(dosage);
      return this;
    }

    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withDosage(
        @NonNull MedicationKnowledge_AdministrationGuidelines_DosageBuilder... dosage) {
      this.dosage = Arrays.stream(dosage).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param patientCharacteristics */
    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withPatientCharacteristics(
        @NonNull
            MedicationKnowledge$AdministrationGuidelines$PatientCharacteristics...
                patientCharacteristics) {
      this.patientCharacteristics = Arrays.asList(patientCharacteristics);
      return this;
    }
    /** @param patientCharacteristics */
    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withPatientCharacteristics(
        @NonNull
            Collection<MedicationKnowledge$AdministrationGuidelines$PatientCharacteristics>
                patientCharacteristics) {
      this.patientCharacteristics = Collections.unmodifiableCollection(patientCharacteristics);
      return this;
    }

    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withPatientCharacteristics(
        @NonNull
            MedicationKnowledge_AdministrationGuidelines_PatientCharacteristicsBuilder...
                patientCharacteristics) {
      this.patientCharacteristics =
          Arrays.stream(patientCharacteristics).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicationKnowledge.AdministrationGuidelines build() {
      return new MedicationKnowledge.AdministrationGuidelines(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(indication),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          dosage.stream().collect(new LitSeqJCollector<>()),
          patientCharacteristics.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
