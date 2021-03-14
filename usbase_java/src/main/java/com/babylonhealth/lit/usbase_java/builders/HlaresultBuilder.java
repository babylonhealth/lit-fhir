package com.babylonhealth.lit.usbase_java.builders;

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
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.hl7.DIAGNOSTIC_REPORT_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class HlaresultBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta =
      Optional.of(
          new MetaBuilder()
              .withProfile("http://hl7.org/fhir/StructureDefinition/hlaresult")
              .build());
  private Optional<Narrative> text = Optional.empty();
  private CodeableConcept code;
  private DIAGNOSTIC_REPORT_STATUS status;
  private Optional<ZonedDateTime> issued = Optional.empty();
  private Collection<Reference> result = Collections.emptyList();
  private Collection<Reference> basedOn = Collections.emptyList();
  private Optional<Reference> subject = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<CodeableConcept> category = Collections.emptyList();
  private Collection<Reference> specimen = Collections.emptyList();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> encounter = Optional.empty();
  private Collection<Reference> performer = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<String> conclusion = Optional.empty();
  private Optional<Choice<$bslash$div<FHIRDateTime, Period>>> effective = Optional.empty();
  private Collection<Reference> imagingStudy = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Attachment> presentedForm = Collections.emptyList();
  private Collection<CodeableConcept> conclusionCode = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Reference> resultsInterpreter = Collections.emptyList();
  private Collection<DiagnosticReport.Media> media = Collections.emptyList();

  /**
   * Required fields for {@link Hlaresult}
   *
   * @param code - A code or name that describes this diagnostic report.
   * @param status - The status of the diagnostic report.
   */
  public HlaresultBuilder(CodeableConcept code, DIAGNOSTIC_REPORT_STATUS status) {
    this.code = code;
    this.status = status;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public HlaresultBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public HlaresultBuilder withMeta(@NonNull Meta meta) {
    this.meta = Optional.of(meta);
    return this;
  }
  /**
   * @param text - A human-readable narrative that contains a summary of the resource and can be
   *     used to represent the content of the resource to a human. The narrative need not encode all
   *     the structured data, but is required to contain sufficient detail to make it "clinically
   *     safe" for a human to just read the narrative. Resource definitions may define what content
   *     should be represented in the narrative to ensure clinical safety.
   */
  public HlaresultBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param issued - The date and time that this version of the report was made available to
   *     providers, typically after the report was reviewed and verified.
   */
  public HlaresultBuilder withIssued(@NonNull ZonedDateTime issued) {
    this.issued = Optional.of(issued);
    return this;
  }
  /**
   * @param result - [Observations](http://hl7.org/fhir/observation.html) that are part of this
   *     diagnostic report.
   */
  public HlaresultBuilder withResult(@NonNull Reference... result) {
    this.result = Arrays.asList(result);
    return this;
  }
  /**
   * @param result - [Observations](http://hl7.org/fhir/observation.html) that are part of this
   *     diagnostic report.
   */
  public HlaresultBuilder withResult(@NonNull Collection<Reference> result) {
    this.result = Collections.unmodifiableCollection(result);
    return this;
  }
  /** @param basedOn - Details concerning a service requested. */
  public HlaresultBuilder withBasedOn(@NonNull Reference... basedOn) {
    this.basedOn = Arrays.asList(basedOn);
    return this;
  }
  /** @param basedOn - Details concerning a service requested. */
  public HlaresultBuilder withBasedOn(@NonNull Collection<Reference> basedOn) {
    this.basedOn = Collections.unmodifiableCollection(basedOn);
    return this;
  }
  /**
   * @param subject - The subject of the report. Usually, but not always, this is a patient.
   *     However, diagnostic services also perform analyses on specimens collected from a variety of
   *     other sources.
   */
  public HlaresultBuilder withSubject(@NonNull Reference subject) {
    this.subject = Optional.of(subject);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public HlaresultBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param category - A code that classifies the clinical discipline, department or diagnostic
   *     service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is
   *     used for searching, sorting and display purposes.
   */
  public HlaresultBuilder withCategory(@NonNull CodeableConcept... category) {
    this.category = Arrays.asList(category);
    return this;
  }
  /**
   * @param category - A code that classifies the clinical discipline, department or diagnostic
   *     service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is
   *     used for searching, sorting and display purposes.
   */
  public HlaresultBuilder withCategory(@NonNull Collection<CodeableConcept> category) {
    this.category = Collections.unmodifiableCollection(category);
    return this;
  }
  /** @param specimen - Details about the specimens on which this diagnostic report is based. */
  public HlaresultBuilder withSpecimen(@NonNull Reference... specimen) {
    this.specimen = Arrays.asList(specimen);
    return this;
  }
  /** @param specimen - Details about the specimens on which this diagnostic report is based. */
  public HlaresultBuilder withSpecimen(@NonNull Collection<Reference> specimen) {
    this.specimen = Collections.unmodifiableCollection(specimen);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public HlaresultBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public HlaresultBuilder withContained(@NonNull Collection<Resource> contained) {
    this.contained = Collections.unmodifiableCollection(contained);
    return this;
  }
  /** @param extension - An Extension */
  public HlaresultBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /** @param extension - An Extension */
  public HlaresultBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param encounter - The healthcare event (e.g. a patient and healthcare provider interaction)
   *     which this DiagnosticReport is about.
   */
  public HlaresultBuilder withEncounter(@NonNull Reference encounter) {
    this.encounter = Optional.of(encounter);
    return this;
  }
  /** @param performer - The diagnostic service that is responsible for issuing the report. */
  public HlaresultBuilder withPerformer(@NonNull Reference... performer) {
    this.performer = Arrays.asList(performer);
    return this;
  }
  /** @param performer - The diagnostic service that is responsible for issuing the report. */
  public HlaresultBuilder withPerformer(@NonNull Collection<Reference> performer) {
    this.performer = Collections.unmodifiableCollection(performer);
    return this;
  }
  /** @param identifier - Identifiers assigned to this report by the performer or other systems. */
  public HlaresultBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - Identifiers assigned to this report by the performer or other systems. */
  public HlaresultBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param conclusion - Concise and clinically contextualized summary conclusion
   *     (interpretation/impression) of the diagnostic report.
   */
  public HlaresultBuilder withConclusion(@NonNull String conclusion) {
    this.conclusion = Optional.of(conclusion);
    return this;
  }
  /**
   * @param effective - The time or time-period the observed values are related to. When the subject
   *     of the report is a patient, this is usually either the time of the procedure or of specimen
   *     collection(s), but very often the source of the date/time is not known, only the date/time
   *     itself. Field is a 'choice' field. Type should be one of FHIRDateTime, Period.
   */
  public <T> HlaresultBuilder withEffective(@NonNull T effective) {
    var guessedSuffix =
        autoSuffix(effective.getClass().getSimpleName(), Hlaresult$.MODULE$.effective());
    return withEffective(guessedSuffix, effective);
  }

  /**
   * Alternative to the 'main' withEffective method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param effective - The value to be passed to the builder
   */
  public <T> HlaresultBuilder withEffective(String suffix, @NonNull T effective) {
    guard(effective.getClass().getSimpleName(), suffix, Hlaresult$.MODULE$.effective());
    this.effective =
        Optional.of(
            (Choice) Choice$.MODULE$.fromSuffix(suffix, effective, Hlaresult$.MODULE$.effective()));
    return this;
  }
  /**
   * @param imagingStudy - One or more links to full details of any imaging performed during the
   *     diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities,
   *     but this is not required. A fully enabled PACS viewer can use this information to provide
   *     views of the source images.
   */
  public HlaresultBuilder withImagingStudy(@NonNull Reference... imagingStudy) {
    this.imagingStudy = Arrays.asList(imagingStudy);
    return this;
  }
  /**
   * @param imagingStudy - One or more links to full details of any imaging performed during the
   *     diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities,
   *     but this is not required. A fully enabled PACS viewer can use this information to provide
   *     views of the source images.
   */
  public HlaresultBuilder withImagingStudy(@NonNull Collection<Reference> imagingStudy) {
    this.imagingStudy = Collections.unmodifiableCollection(imagingStudy);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public HlaresultBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param presentedForm - Rich text representation of the entire result as issued by the
   *     diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
   */
  public HlaresultBuilder withPresentedForm(@NonNull Attachment... presentedForm) {
    this.presentedForm = Arrays.asList(presentedForm);
    return this;
  }
  /**
   * @param presentedForm - Rich text representation of the entire result as issued by the
   *     diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
   */
  public HlaresultBuilder withPresentedForm(@NonNull Collection<Attachment> presentedForm) {
    this.presentedForm = Collections.unmodifiableCollection(presentedForm);
    return this;
  }
  /**
   * @param conclusionCode - One or more codes that represent the summary conclusion
   *     (interpretation/impression) of the diagnostic report.
   */
  public HlaresultBuilder withConclusionCode(@NonNull CodeableConcept... conclusionCode) {
    this.conclusionCode = Arrays.asList(conclusionCode);
    return this;
  }
  /**
   * @param conclusionCode - One or more codes that represent the summary conclusion
   *     (interpretation/impression) of the diagnostic report.
   */
  public HlaresultBuilder withConclusionCode(@NonNull Collection<CodeableConcept> conclusionCode) {
    this.conclusionCode = Collections.unmodifiableCollection(conclusionCode);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public HlaresultBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public HlaresultBuilder withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param resultsInterpreter - The practitioner or organization that is responsible for the
   *     report's conclusions and interpretations.
   */
  public HlaresultBuilder withResultsInterpreter(@NonNull Reference... resultsInterpreter) {
    this.resultsInterpreter = Arrays.asList(resultsInterpreter);
    return this;
  }
  /**
   * @param resultsInterpreter - The practitioner or organization that is responsible for the
   *     report's conclusions and interpretations.
   */
  public HlaresultBuilder withResultsInterpreter(
      @NonNull Collection<Reference> resultsInterpreter) {
    this.resultsInterpreter = Collections.unmodifiableCollection(resultsInterpreter);
    return this;
  }
  /**
   * @param media - A list of key images associated with this report. The images are generally
   *     created during the diagnostic process, and may be directly of the patient, or of treated
   *     specimens (i.e. slides of interest).
   */
  public HlaresultBuilder withMedia(@NonNull DiagnosticReport.Media... media) {
    this.media = Arrays.asList(media);
    return this;
  }
  /**
   * @param media - A list of key images associated with this report. The images are generally
   *     created during the diagnostic process, and may be directly of the patient, or of treated
   *     specimens (i.e. slides of interest).
   */
  public HlaresultBuilder withMedia(@NonNull Collection<DiagnosticReport.Media> media) {
    this.media = Collections.unmodifiableCollection(media);
    return this;
  }

  public HlaresultBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Hlaresult build() {
    return new Hlaresult(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        code,
        status,
        OptionConverters.toScala(issued),
        result.stream().collect(new LitSeqJCollector<>()),
        basedOn.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(subject),
        OptionConverters.toScala(language),
        category.stream().collect(new LitSeqJCollector<>()),
        specimen.stream().collect(new LitSeqJCollector<>()),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(encounter),
        performer.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(conclusion),
        OptionConverters.toScala(effective),
        imagingStudy.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        presentedForm.stream().collect(new LitSeqJCollector<>()),
        conclusionCode.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        resultsInterpreter.stream().collect(new LitSeqJCollector<>()),
        media.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
