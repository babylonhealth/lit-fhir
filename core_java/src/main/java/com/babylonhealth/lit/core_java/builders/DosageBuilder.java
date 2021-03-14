package com.babylonhealth.lit.core_java.builders;

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
import com.babylonhealth.lit.core_java.builders.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class DosageBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> text = Optional.empty();
  private Optional<CodeableConcept> site = Optional.empty();
  private Optional<CodeableConcept> route = Optional.empty();
  private Optional<Timing> timing = Optional.empty();
  private Optional<CodeableConcept> method = Optional.empty();
  private Optional<Integer> sequence = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Choice> asNeeded = Optional.empty();
  private Optional<Ratio> maxDosePerPeriod = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<String> patientInstruction = Optional.empty();
  private Optional<Quantity> maxDosePerLifetime = Optional.empty();
  private Collection<CodeableConcept> additionalInstruction = Collections.emptyList();
  private Collection<Dosage.DoseAndRate> doseAndRate = Collections.emptyList();
  private Optional<Quantity> maxDosePerAdministration = Optional.empty();

  /** Required fields for {@link Dosage} */
  public DosageBuilder() {}

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public DosageBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param text - Free text dosage instructions e.g. SIG. */
  public DosageBuilder withText(@NonNull String text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param site - Body site to administer to. */
  public DosageBuilder withSite(@NonNull CodeableConcept site) {
    this.site = Optional.of(site);
    return this;
  }
  /** @param route - How drug should enter body. */
  public DosageBuilder withRoute(@NonNull CodeableConcept route) {
    this.route = Optional.of(route);
    return this;
  }
  /** @param timing - When medication should be administered. */
  public DosageBuilder withTiming(@NonNull Timing timing) {
    this.timing = Optional.of(timing);
    return this;
  }
  /** @param method - Technique for administering medication. */
  public DosageBuilder withMethod(@NonNull CodeableConcept method) {
    this.method = Optional.of(method);
    return this;
  }
  /**
   * @param sequence - Indicates the order in which the dosage instructions should be applied or
   *     interpreted.
   */
  public DosageBuilder withSequence(@NonNull Integer sequence) {
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
  public DosageBuilder withExtension(@NonNull Extension... extension) {
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
  public DosageBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param asNeeded - Indicates whether the Medication is only taken when needed within a specific
   *     dosing schedule (Boolean option), or it indicates the precondition for taking the
   *     Medication (CodeableConcept). Field is a 'choice' field. Type should be one of Boolean,
   *     CodeableConcept.
   */
  public <T> DosageBuilder withAsNeeded(@NonNull T asNeeded) {
    var guessedSuffix = autoSuffix(asNeeded.getClass().getSimpleName(), Dosage$.MODULE$.asNeeded());
    return withAsNeeded(guessedSuffix, asNeeded);
  }

  /**
   * Alternative to the 'main' withAsNeeded method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param asNeeded - The value to be passed to the builder
   */
  public <T> DosageBuilder withAsNeeded(String suffix, @NonNull T asNeeded) {
    guard(asNeeded.getClass().getSimpleName(), suffix, Dosage$.MODULE$.asNeeded());
    this.asNeeded =
        Optional.of(
            (Choice) Choice$.MODULE$.fromSuffix(suffix, asNeeded, Dosage$.MODULE$.asNeeded()));
    return this;
  }
  /** @param maxDosePerPeriod - Upper limit on medication per unit of time. */
  public DosageBuilder withMaxDosePerPeriod(@NonNull Ratio maxDosePerPeriod) {
    this.maxDosePerPeriod = Optional.of(maxDosePerPeriod);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the element and that modifies the understanding of the element in
   *     which it is contained and/or the understanding of the containing element's descendants.
   *     Usually modifier elements provide negation or qualification. To make the use of extensions
   *     safe and manageable, there is a strict set of governance applied to the definition and use
   *     of extensions. Though any implementer can define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public DosageBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the element and that modifies the understanding of the element in
   *     which it is contained and/or the understanding of the containing element's descendants.
   *     Usually modifier elements provide negation or qualification. To make the use of extensions
   *     safe and manageable, there is a strict set of governance applied to the definition and use
   *     of extensions. Though any implementer can define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public DosageBuilder withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param patientInstruction - Instructions in terms that are understood by the patient or
   *     consumer.
   */
  public DosageBuilder withPatientInstruction(@NonNull String patientInstruction) {
    this.patientInstruction = Optional.of(patientInstruction);
    return this;
  }
  /** @param maxDosePerLifetime - Upper limit on medication per lifetime of the patient. */
  public DosageBuilder withMaxDosePerLifetime(@NonNull Quantity maxDosePerLifetime) {
    this.maxDosePerLifetime = Optional.of(maxDosePerLifetime);
    return this;
  }
  /**
   * @param additionalInstruction - Supplemental instructions to the patient on how to take the
   *     medication (e.g. "with meals" or"take half to one hour before food") or warnings for the
   *     patient about the medication (e.g. "may cause drowsiness" or "avoid exposure of skin to
   *     direct sunlight or sunlamps").
   */
  public DosageBuilder withAdditionalInstruction(
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
  public DosageBuilder withAdditionalInstruction(
      @NonNull Collection<CodeableConcept> additionalInstruction) {
    this.additionalInstruction = Collections.unmodifiableCollection(additionalInstruction);
    return this;
  }
  /** @param doseAndRate - The amount of medication administered. */
  public DosageBuilder withDoseAndRate(@NonNull Dosage.DoseAndRate... doseAndRate) {
    this.doseAndRate = Arrays.asList(doseAndRate);
    return this;
  }
  /** @param doseAndRate - The amount of medication administered. */
  public DosageBuilder withDoseAndRate(@NonNull Collection<Dosage.DoseAndRate> doseAndRate) {
    this.doseAndRate = Collections.unmodifiableCollection(doseAndRate);
    return this;
  }
  /** @param maxDosePerAdministration - Upper limit on medication per administration. */
  public DosageBuilder withMaxDosePerAdministration(@NonNull Quantity maxDosePerAdministration) {
    this.maxDosePerAdministration = Optional.of(maxDosePerAdministration);
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