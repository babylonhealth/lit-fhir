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

public interface ExplanationOfBenefit_DiagnosisBuilder {
  public ExplanationOfBenefit.Diagnosis build();

  public static Impl init(Integer sequence, @NonNull ChoiceCodeableConceptOrReference diagnosis) {
    return new Impl(sequence, diagnosis);
  }

  public static Impl builder(
      Integer sequence, @NonNull ChoiceCodeableConceptOrReference diagnosis) {
    return new Impl(sequence, diagnosis);
  }

  public static ChoiceCodeableConceptOrReference diagnosis(CodeableConcept c) {
    return new ChoiceCodeableConceptOrReference(c);
  }

  public static ChoiceCodeableConceptOrReference diagnosis(Reference r) {
    return new ChoiceCodeableConceptOrReference(r);
  }

  public class Impl implements ExplanationOfBenefit_DiagnosisBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<CodeableConcept> _type = Collections.emptyList();
    private Integer sequence;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<CodeableConcept> onAdmission = Optional.empty();
    private Optional<CodeableConcept> packageCode = Optional.empty();
    private ChoiceCodeableConceptOrReference diagnosis;
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link ExplanationOfBenefit.Diagnosis}
     *
     * @param sequence
     * @param diagnosis - Information about diagnoses relevant to the claim items. Field is a
     *     'choice' field. Type should be one of CodeableConcept, Reference. To pass the value in,
     *     wrap with one of the ExplanationOfBenefit_DiagnosisBuilder.diagnosis static methods
     */
    public Impl(Integer sequence, @NonNull ChoiceCodeableConceptOrReference diagnosis) {
      this.sequence = sequence;
      this.diagnosis = diagnosis;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ExplanationOfBenefit_DiagnosisBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param _type - The category of claim, e.g. oral, pharmacy, vision, institutional,
     *     professional.
     */
    public ExplanationOfBenefit_DiagnosisBuilder.Impl withType(@NonNull CodeableConcept... _type) {
      this._type = Arrays.asList(_type);
      return this;
    }
    /**
     * @param _type - The category of claim, e.g. oral, pharmacy, vision, institutional,
     *     professional.
     */
    public ExplanationOfBenefit_DiagnosisBuilder.Impl withType(
        @NonNull Collection<CodeableConcept> _type) {
      this._type = Collections.unmodifiableCollection(_type);
      return this;
    }

    public ExplanationOfBenefit_DiagnosisBuilder.Impl withType(
        @NonNull CodeableConceptBuilder... _type) {
      this._type = Arrays.stream(_type).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ExplanationOfBenefit_DiagnosisBuilder.Impl withExtension(
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
    public ExplanationOfBenefit_DiagnosisBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ExplanationOfBenefit_DiagnosisBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param onAdmission */
    public ExplanationOfBenefit_DiagnosisBuilder.Impl withOnAdmission(
        @NonNull CodeableConcept onAdmission) {
      this.onAdmission = Optional.of(onAdmission);
      return this;
    }

    public ExplanationOfBenefit_DiagnosisBuilder.Impl withOnAdmission(
        @NonNull CodeableConceptBuilder onAdmission) {
      this.onAdmission = Optional.of(onAdmission.build());
      return this;
    }
    /** @param packageCode */
    public ExplanationOfBenefit_DiagnosisBuilder.Impl withPackageCode(
        @NonNull CodeableConcept packageCode) {
      this.packageCode = Optional.of(packageCode);
      return this;
    }

    public ExplanationOfBenefit_DiagnosisBuilder.Impl withPackageCode(
        @NonNull CodeableConceptBuilder packageCode) {
      this.packageCode = Optional.of(packageCode.build());
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
    public ExplanationOfBenefit_DiagnosisBuilder.Impl withModifierExtension(
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
    public ExplanationOfBenefit_DiagnosisBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ExplanationOfBenefit_DiagnosisBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public ExplanationOfBenefit.Diagnosis build() {
      return new ExplanationOfBenefit.Diagnosis(
          OptionConverters.toScala(id),
          _type.stream().collect(new LitSeqJCollector<>()),
          sequence,
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(onAdmission),
          OptionConverters.toScala(packageCode),
          diagnosis,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
