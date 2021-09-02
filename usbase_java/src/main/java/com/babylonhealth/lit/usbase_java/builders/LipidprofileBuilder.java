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
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.hl7.DIAGNOSTIC_REPORT_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class LipidprofileBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta =
      Optional.of(
          new MetaBuilder()
              .withProfile("http://hl7.org/fhir/StructureDefinition/lipidprofile")
              .build());
  private Optional<Narrative> text = Optional.empty();
  private CodeableConcept code;
  private DIAGNOSTIC_REPORT_STATUS status;
  private Optional<ZonedDateTime> issued = Optional.empty();
  private Collection<Reference> result;
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
  private Optional<Choice_0934386166> effective = Optional.empty();
  private Collection<Reference> imagingStudy = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Attachment> presentedForm = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Reference> resultsInterpreter = Collections.emptyList();
  private Collection<DiagnosticReport.Media> media = Collections.emptyList();

  /**
   * Required fields for {@link Lipidprofile}
   *
   * @param code - LOINC Code for Lipid Panel with LDL.
   * @param status - The status of the diagnostic report.
   * @param result - [Observations](http://hl7.org/fhir/observation.html) that are part of this
   *     diagnostic report.
   */
  public LipidprofileBuilder(
      CodeableConcept code, DIAGNOSTIC_REPORT_STATUS status, Collection<Reference> result) {
    this.code = code;
    this.status = status;
    this.result = result;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public LipidprofileBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public LipidprofileBuilder withMeta(@NonNull Meta meta) {
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
  public LipidprofileBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param issued - The date and time that this version of the report was made available to
   *     providers, typically after the report was reviewed and verified.
   */
  public LipidprofileBuilder withIssued(@NonNull ZonedDateTime issued) {
    this.issued = Optional.of(issued);
    return this;
  }
  /** @param basedOn - Details concerning a service requested. */
  public LipidprofileBuilder withBasedOn(@NonNull Reference... basedOn) {
    this.basedOn = Arrays.asList(basedOn);
    return this;
  }
  /** @param basedOn - Details concerning a service requested. */
  public LipidprofileBuilder withBasedOn(@NonNull Collection<Reference> basedOn) {
    this.basedOn = Collections.unmodifiableCollection(basedOn);
    return this;
  }
  /**
   * @param subject - The subject of the report. Usually, but not always, this is a patient.
   *     However, diagnostic services also perform analyses on specimens collected from a variety of
   *     other sources.
   */
  public LipidprofileBuilder withSubject(@NonNull Reference subject) {
    this.subject = Optional.of(subject);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public LipidprofileBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param category - A code that classifies the clinical discipline, department or diagnostic
   *     service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is
   *     used for searching, sorting and display purposes.
   */
  public LipidprofileBuilder withCategory(@NonNull CodeableConcept... category) {
    this.category = Arrays.asList(category);
    return this;
  }
  /**
   * @param category - A code that classifies the clinical discipline, department or diagnostic
   *     service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is
   *     used for searching, sorting and display purposes.
   */
  public LipidprofileBuilder withCategory(@NonNull Collection<CodeableConcept> category) {
    this.category = Collections.unmodifiableCollection(category);
    return this;
  }
  /** @param specimen - Details about the specimens on which this diagnostic report is based. */
  public LipidprofileBuilder withSpecimen(@NonNull Reference... specimen) {
    this.specimen = Arrays.asList(specimen);
    return this;
  }
  /** @param specimen - Details about the specimens on which this diagnostic report is based. */
  public LipidprofileBuilder withSpecimen(@NonNull Collection<Reference> specimen) {
    this.specimen = Collections.unmodifiableCollection(specimen);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public LipidprofileBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public LipidprofileBuilder withContained(@NonNull Collection<Resource> contained) {
    this.contained = Collections.unmodifiableCollection(contained);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public LipidprofileBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public LipidprofileBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param encounter - The healthcare event (e.g. a patient and healthcare provider interaction)
   *     which this DiagnosticReport is about.
   */
  public LipidprofileBuilder withEncounter(@NonNull Reference encounter) {
    this.encounter = Optional.of(encounter);
    return this;
  }
  /** @param performer - The diagnostic service that is responsible for issuing the report. */
  public LipidprofileBuilder withPerformer(@NonNull Reference... performer) {
    this.performer = Arrays.asList(performer);
    return this;
  }
  /** @param performer - The diagnostic service that is responsible for issuing the report. */
  public LipidprofileBuilder withPerformer(@NonNull Collection<Reference> performer) {
    this.performer = Collections.unmodifiableCollection(performer);
    return this;
  }
  /** @param identifier - Identifiers assigned to this report by the performer or other systems. */
  public LipidprofileBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - Identifiers assigned to this report by the performer or other systems. */
  public LipidprofileBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param conclusion - May include diagnosis or suggestions for follow up testing. */
  public LipidprofileBuilder withConclusion(@NonNull String conclusion) {
    this.conclusion = Optional.of(conclusion);
    return this;
  }
  /**
   * @param effective - The time or time-period the observed values are related to. When the subject
   *     of the report is a patient, this is usually either the time of the procedure or of specimen
   *     collection(s), but very often the source of the date/time is not known, only the date/time
   *     itself. Field is a 'choice' field. Type should be one of FHIRDateTime, Period.
   */
  public LipidprofileBuilder withEffective(@NonNull Choice_0934386166 effective) {
    this.effective = Optional.of(effective);
    return this;
  }
  /**
   * @param imagingStudy - One or more links to full details of any imaging performed during the
   *     diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities,
   *     but this is not required. A fully enabled PACS viewer can use this information to provide
   *     views of the source images.
   */
  public LipidprofileBuilder withImagingStudy(@NonNull Reference... imagingStudy) {
    this.imagingStudy = Arrays.asList(imagingStudy);
    return this;
  }
  /**
   * @param imagingStudy - One or more links to full details of any imaging performed during the
   *     diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities,
   *     but this is not required. A fully enabled PACS viewer can use this information to provide
   *     views of the source images.
   */
  public LipidprofileBuilder withImagingStudy(@NonNull Collection<Reference> imagingStudy) {
    this.imagingStudy = Collections.unmodifiableCollection(imagingStudy);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public LipidprofileBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param presentedForm - Rich text representation of the entire result as issued by the
   *     diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
   */
  public LipidprofileBuilder withPresentedForm(@NonNull Attachment... presentedForm) {
    this.presentedForm = Arrays.asList(presentedForm);
    return this;
  }
  /**
   * @param presentedForm - Rich text representation of the entire result as issued by the
   *     diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
   */
  public LipidprofileBuilder withPresentedForm(@NonNull Collection<Attachment> presentedForm) {
    this.presentedForm = Collections.unmodifiableCollection(presentedForm);
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
  public LipidprofileBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public LipidprofileBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param resultsInterpreter - The practitioner or organization that is responsible for the
   *     report's conclusions and interpretations.
   */
  public LipidprofileBuilder withResultsInterpreter(@NonNull Reference... resultsInterpreter) {
    this.resultsInterpreter = Arrays.asList(resultsInterpreter);
    return this;
  }
  /**
   * @param resultsInterpreter - The practitioner or organization that is responsible for the
   *     report's conclusions and interpretations.
   */
  public LipidprofileBuilder withResultsInterpreter(
      @NonNull Collection<Reference> resultsInterpreter) {
    this.resultsInterpreter = Collections.unmodifiableCollection(resultsInterpreter);
    return this;
  }
  /**
   * @param media - A list of key images associated with this report. The images are generally
   *     created during the diagnostic process, and may be directly of the patient, or of treated
   *     specimens (i.e. slides of interest).
   */
  public LipidprofileBuilder withMedia(@NonNull DiagnosticReport.Media... media) {
    this.media = Arrays.asList(media);
    return this;
  }
  /**
   * @param media - A list of key images associated with this report. The images are generally
   *     created during the diagnostic process, and may be directly of the patient, or of treated
   *     specimens (i.e. slides of interest).
   */
  public LipidprofileBuilder withMedia(@NonNull Collection<DiagnosticReport.Media> media) {
    this.media = Collections.unmodifiableCollection(media);
    return this;
  }

  public LipidprofileBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Lipidprofile build() {
    return new Lipidprofile(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        code,
        status,
        OptionConverters.toScala(issued),
        result.stream().collect(new NonEmptyLitSeqJCollector<>()),
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
        (Option) OptionConverters.toScala(effective),
        imagingStudy.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        presentedForm.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        resultsInterpreter.stream().collect(new LitSeqJCollector<>()),
        media.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
