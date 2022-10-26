package com.babylonhealth.lit.core_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface DosageBuilder extends BackboneElementBuilder {
  public Dosage build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceBooleanOrCodeableConcept asNeeded(Boolean b) {
    return new ChoiceBooleanOrCodeableConcept(b);
  }

  public static ChoiceBooleanOrCodeableConcept asNeeded(CodeableConcept c) {
    return new ChoiceBooleanOrCodeableConcept(c);
  }

  public class Impl implements DosageBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> text = Optional.empty();
    private Optional<CodeableConcept> site = Optional.empty();
    private Optional<CodeableConcept> route = Optional.empty();
    private Optional<Timing> timing = Optional.empty();
    private Optional<CodeableConcept> method = Optional.empty();
    private Optional<Integer> sequence = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceBooleanOrCodeableConcept> asNeeded = Optional.empty();
    private Optional<Ratio> maxDosePerPeriod = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<String> patientInstruction = Optional.empty();
    private Optional<Quantity> maxDosePerLifetime = Optional.empty();
    private Collection<CodeableConcept> additionalInstruction = Collections.emptyList();
    private Collection<Dosage.DoseAndRate> doseAndRate = Collections.emptyList();
    private Optional<Quantity> maxDosePerAdministration = Optional.empty();

    /** Required fields for {@link Dosage} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public DosageBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param text - Free text dosage instructions e.g. SIG. */
    public DosageBuilder.Impl withText(@NonNull String text) {
      this.text = Optional.of(text);
      return this;
    }
    /** @param site - Body site to administer to. */
    public DosageBuilder.Impl withSite(@NonNull CodeableConcept site) {
      this.site = Optional.of(site);
      return this;
    }

    public DosageBuilder.Impl withSite(@NonNull CodeableConceptBuilder site) {
      this.site = Optional.of(site.build());
      return this;
    }
    /** @param route - How drug should enter body. */
    public DosageBuilder.Impl withRoute(@NonNull CodeableConcept route) {
      this.route = Optional.of(route);
      return this;
    }

    public DosageBuilder.Impl withRoute(@NonNull CodeableConceptBuilder route) {
      this.route = Optional.of(route.build());
      return this;
    }
    /** @param timing - When medication should be administered. */
    public DosageBuilder.Impl withTiming(@NonNull Timing timing) {
      this.timing = Optional.of(timing);
      return this;
    }

    public DosageBuilder.Impl withTiming(@NonNull TimingBuilder timing) {
      this.timing = Optional.of(timing.build());
      return this;
    }
    /** @param method - Technique for administering medication. */
    public DosageBuilder.Impl withMethod(@NonNull CodeableConcept method) {
      this.method = Optional.of(method);
      return this;
    }

    public DosageBuilder.Impl withMethod(@NonNull CodeableConceptBuilder method) {
      this.method = Optional.of(method.build());
      return this;
    }
    /**
     * @param sequence - Indicates the order in which the dosage instructions should be applied or
     *     interpreted.
     */
    public DosageBuilder.Impl withSequence(@NonNull Integer sequence) {
      this.sequence = Optional.of(sequence);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public DosageBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public DosageBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public DosageBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param asNeeded - Indicates whether the Medication is only taken when needed within a
     *     specific dosing schedule (Boolean option), or it indicates the precondition for taking
     *     the Medication (CodeableConcept). Field is a 'choice' field. Type should be one of
     *     Boolean, CodeableConcept. To pass the value in, wrap with one of the
     *     DosageBuilder.asNeeded static methods
     */
    public DosageBuilder.Impl withAsNeeded(@NonNull ChoiceBooleanOrCodeableConcept asNeeded) {
      this.asNeeded = Optional.of(asNeeded);
      return this;
    }
    /** @param maxDosePerPeriod - Upper limit on medication per unit of time. */
    public DosageBuilder.Impl withMaxDosePerPeriod(@NonNull Ratio maxDosePerPeriod) {
      this.maxDosePerPeriod = Optional.of(maxDosePerPeriod);
      return this;
    }

    public DosageBuilder.Impl withMaxDosePerPeriod(@NonNull RatioBuilder maxDosePerPeriod) {
      this.maxDosePerPeriod = Optional.of(maxDosePerPeriod.build());
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the element and that modifies the understanding of the element
     *     in which it is contained and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer can define an extension, there
     *     is a set of requirements that SHALL be met as part of the definition of the extension.
     *     Applications processing a resource are required to check for modifier extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public DosageBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the element and that modifies the understanding of the element
     *     in which it is contained and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer can define an extension, there
     *     is a set of requirements that SHALL be met as part of the definition of the extension.
     *     Applications processing a resource are required to check for modifier extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public DosageBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public DosageBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param patientInstruction - Instructions in terms that are understood by the patient or
     *     consumer.
     */
    public DosageBuilder.Impl withPatientInstruction(@NonNull String patientInstruction) {
      this.patientInstruction = Optional.of(patientInstruction);
      return this;
    }
    /** @param maxDosePerLifetime - Upper limit on medication per lifetime of the patient. */
    public DosageBuilder.Impl withMaxDosePerLifetime(@NonNull Quantity maxDosePerLifetime) {
      this.maxDosePerLifetime = Optional.of(maxDosePerLifetime);
      return this;
    }

    public DosageBuilder.Impl withMaxDosePerLifetime(@NonNull QuantityBuilder maxDosePerLifetime) {
      this.maxDosePerLifetime = Optional.of(maxDosePerLifetime.build());
      return this;
    }
    /**
     * @param additionalInstruction - Supplemental instructions to the patient on how to take the
     *     medication (e.g. "with meals" or"take half to one hour before food") or warnings for the
     *     patient about the medication (e.g. "may cause drowsiness" or "avoid exposure of skin to
     *     direct sunlight or sunlamps").
     */
    public DosageBuilder.Impl withAdditionalInstruction(
        @NonNull CodeableConcept... additionalInstruction) {
      this.additionalInstruction = Arrays.asList(additionalInstruction);
      return this;
    }
    /**
     * @param additionalInstruction - Supplemental instructions to the patient on how to take the
     *     medication (e.g. "with meals" or"take half to one hour before food") or warnings for the
     *     patient about the medication (e.g. "may cause drowsiness" or "avoid exposure of skin to
     *     direct sunlight or sunlamps").
     */
    public DosageBuilder.Impl withAdditionalInstruction(
        @NonNull Collection<CodeableConcept> additionalInstruction) {
      this.additionalInstruction = Collections.unmodifiableCollection(additionalInstruction);
      return this;
    }

    public DosageBuilder.Impl withAdditionalInstruction(
        @NonNull CodeableConceptBuilder... additionalInstruction) {
      this.additionalInstruction =
          Arrays.stream(additionalInstruction).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param doseAndRate - The amount of medication administered. */
    public DosageBuilder.Impl withDoseAndRate(@NonNull Dosage.DoseAndRate... doseAndRate) {
      this.doseAndRate = Arrays.asList(doseAndRate);
      return this;
    }
    /** @param doseAndRate - The amount of medication administered. */
    public DosageBuilder.Impl withDoseAndRate(@NonNull Collection<Dosage.DoseAndRate> doseAndRate) {
      this.doseAndRate = Collections.unmodifiableCollection(doseAndRate);
      return this;
    }

    public DosageBuilder.Impl withDoseAndRate(@NonNull Dosage_DoseAndRateBuilder... doseAndRate) {
      this.doseAndRate = Arrays.stream(doseAndRate).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param maxDosePerAdministration - Upper limit on medication per administration. */
    public DosageBuilder.Impl withMaxDosePerAdministration(
        @NonNull Quantity maxDosePerAdministration) {
      this.maxDosePerAdministration = Optional.of(maxDosePerAdministration);
      return this;
    }

    public DosageBuilder.Impl withMaxDosePerAdministration(
        @NonNull QuantityBuilder maxDosePerAdministration) {
      this.maxDosePerAdministration = Optional.of(maxDosePerAdministration.build());
      return this;
    }

    public Dosage build() {
      return new Dosage(
          OptionConverters.toScala(id),
          OptionConverters.toScala(text),
          OptionConverters.toScala(site),
          OptionConverters.toScala(route),
          OptionConverters.toScala(timing),
          OptionConverters.toScala(method),
          OptionConverters.toScala(sequence.map(x -> (Object) x)),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(asNeeded),
          OptionConverters.toScala(maxDosePerPeriod),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(patientInstruction),
          OptionConverters.toScala(maxDosePerLifetime),
          additionalInstruction.stream().collect(new LitSeqJCollector<>()),
          doseAndRate.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(maxDosePerAdministration),
          LitUtils.emptyMetaElMap());
    }
  }
}
