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

public interface MedicationKnowledge_AdministrationGuidelines_PatientCharacteristicsBuilder {
  public MedicationKnowledge$AdministrationGuidelines$PatientCharacteristics build();

  public static Impl init(@NonNull ChoiceCodeableConceptOrQuantity characteristic) {
    return new Impl(characteristic);
  }

  public static Impl builder(@NonNull ChoiceCodeableConceptOrQuantity characteristic) {
    return new Impl(characteristic);
  }

  public static ChoiceCodeableConceptOrQuantity characteristic(CodeableConcept c) {
    return new ChoiceCodeableConceptOrQuantity(c);
  }

  public static ChoiceCodeableConceptOrQuantity characteristic(Quantity q) {
    return new ChoiceCodeableConceptOrQuantity(q);
  }

  public class Impl
      implements MedicationKnowledge_AdministrationGuidelines_PatientCharacteristicsBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<String> value = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private ChoiceCodeableConceptOrQuantity characteristic;

    /**
     * Required fields for {@link
     * MedicationKnowledge$AdministrationGuidelines$PatientCharacteristics}
     *
     * @param characteristic Field is a 'choice' field. Type should be one of CodeableConcept,
     *     Quantity. To pass the value in, wrap with one of the
     *     MedicationKnowledge_AdministrationGuidelines_PatientCharacteristicsBuilder.characteristic
     *     static methods
     */
    public Impl(@NonNull ChoiceCodeableConceptOrQuantity characteristic) {
      this.characteristic = characteristic;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicationKnowledge_AdministrationGuidelines_PatientCharacteristicsBuilder.Impl withId(
        @NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param value */
    public MedicationKnowledge_AdministrationGuidelines_PatientCharacteristicsBuilder.Impl
        withValue(@NonNull String... value) {
      this.value = Arrays.asList(value);
      return this;
    }
    /** @param value */
    public MedicationKnowledge_AdministrationGuidelines_PatientCharacteristicsBuilder.Impl
        withValue(@NonNull Collection<String> value) {
      this.value = Collections.unmodifiableCollection(value);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MedicationKnowledge_AdministrationGuidelines_PatientCharacteristicsBuilder.Impl
        withExtension(@NonNull Extension... extension) {
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
    public MedicationKnowledge_AdministrationGuidelines_PatientCharacteristicsBuilder.Impl
        withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicationKnowledge_AdministrationGuidelines_PatientCharacteristicsBuilder.Impl
        withExtension(@NonNull ExtensionBuilder... extension) {
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
    public MedicationKnowledge_AdministrationGuidelines_PatientCharacteristicsBuilder.Impl
        withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public MedicationKnowledge_AdministrationGuidelines_PatientCharacteristicsBuilder.Impl
        withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicationKnowledge_AdministrationGuidelines_PatientCharacteristicsBuilder.Impl
        withModifierExtension(@NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicationKnowledge$AdministrationGuidelines$PatientCharacteristics build() {
      return new MedicationKnowledge$AdministrationGuidelines$PatientCharacteristics(
          OptionConverters.toScala(id),
          value.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          characteristic,
          LitUtils.emptyMetaElMap());
    }
  }
}
