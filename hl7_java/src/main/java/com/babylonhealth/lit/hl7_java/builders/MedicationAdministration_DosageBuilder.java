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

public interface MedicationAdministration_DosageBuilder {
  public MedicationAdministration.Dosage build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceQuantityOrRatio rate(Quantity q) {
    return new ChoiceQuantityOrRatio(q);
  }

  public static ChoiceQuantityOrRatio rate(Ratio r) {
    return new ChoiceQuantityOrRatio(r);
  }

  public class Impl implements MedicationAdministration_DosageBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> text = Optional.empty();
    private Optional<CodeableConcept> site = Optional.empty();
    private Optional<Quantity> dose = Optional.empty();
    private Optional<CodeableConcept> route = Optional.empty();
    private Optional<CodeableConcept> method = Optional.empty();
    private Optional<ChoiceQuantityOrRatio> rate = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link MedicationAdministration.Dosage} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicationAdministration_DosageBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public MedicationAdministration_DosageBuilder.Impl withText(@NonNull String text) {
      this.text = Optional.of(text);
      return this;
    }
    /** @param site */
    public MedicationAdministration_DosageBuilder.Impl withSite(@NonNull CodeableConcept site) {
      this.site = Optional.of(site);
      return this;
    }

    public MedicationAdministration_DosageBuilder.Impl withSite(
        @NonNull CodeableConceptBuilder site) {
      this.site = Optional.of(site.build());
      return this;
    }
    /** @param dose */
    public MedicationAdministration_DosageBuilder.Impl withDose(@NonNull Quantity dose) {
      this.dose = Optional.of(dose);
      return this;
    }

    public MedicationAdministration_DosageBuilder.Impl withDose(@NonNull QuantityBuilder dose) {
      this.dose = Optional.of(dose.build());
      return this;
    }
    /** @param route */
    public MedicationAdministration_DosageBuilder.Impl withRoute(@NonNull CodeableConcept route) {
      this.route = Optional.of(route);
      return this;
    }

    public MedicationAdministration_DosageBuilder.Impl withRoute(
        @NonNull CodeableConceptBuilder route) {
      this.route = Optional.of(route.build());
      return this;
    }
    /** @param method */
    public MedicationAdministration_DosageBuilder.Impl withMethod(@NonNull CodeableConcept method) {
      this.method = Optional.of(method);
      return this;
    }

    public MedicationAdministration_DosageBuilder.Impl withMethod(
        @NonNull CodeableConceptBuilder method) {
      this.method = Optional.of(method.build());
      return this;
    }
    /**
     * @param rate Field is a 'choice' field. Type should be one of Quantity, Ratio. To pass the
     *     value in, wrap with one of the MedicationAdministration_DosageBuilder.rate static methods
     */
    public MedicationAdministration_DosageBuilder.Impl withRate(
        @NonNull ChoiceQuantityOrRatio rate) {
      this.rate = Optional.of(rate);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MedicationAdministration_DosageBuilder.Impl withExtension(
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
    public MedicationAdministration_DosageBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicationAdministration_DosageBuilder.Impl withExtension(
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
    public MedicationAdministration_DosageBuilder.Impl withModifierExtension(
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
    public MedicationAdministration_DosageBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicationAdministration_DosageBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicationAdministration.Dosage build() {
      return new MedicationAdministration.Dosage(
          OptionConverters.toScala(id),
          OptionConverters.toScala(text),
          OptionConverters.toScala(site),
          OptionConverters.toScala(dose),
          OptionConverters.toScala(route),
          OptionConverters.toScala(method),
          (Option) OptionConverters.toScala(rate),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
