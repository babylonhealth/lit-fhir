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

public interface MedicationKnowledge_AdministrationGuidelinesBuilder {
  public MedicationKnowledge.AdministrationGuidelines build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static Choice01025009075 indication(CodeableConcept c) {
    return new Choice01025009075(c);
  }

  public static Choice01025009075 indication(Reference r) {
    return new Choice01025009075(r);
  }

  public class Impl implements MedicationKnowledge_AdministrationGuidelinesBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Choice01025009075> indication = Optional.empty();
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
    /**
     * @param indication Field is a 'choice' field. Type should be one of CodeableConcept,
     *     Reference. To pass the value in, wrap with one of the
     *     MedicationKnowledge_AdministrationGuidelinesBuilder.indication static methods
     */
    public MedicationKnowledge_AdministrationGuidelinesBuilder.Impl withIndication(
        @NonNull Choice01025009075 indication) {
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
