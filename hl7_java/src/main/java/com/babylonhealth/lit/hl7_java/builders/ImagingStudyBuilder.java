package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.IMAGINGSTUDY_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface ImagingStudyBuilder extends DomainResourceBuilder {
  public ImagingStudy build();

  public static Impl init(IMAGINGSTUDY_STATUS status, Reference subject) {
    return new Impl(status, subject);
  }

  public static Impl builder(IMAGINGSTUDY_STATUS status, ReferenceBuilder subject) {
    return new Impl(status, subject.build());
  }

  public class Impl implements ImagingStudyBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private IMAGINGSTUDY_STATUS status;
    private Reference subject;
    private Optional<FHIRDateTime> started = Optional.empty();
    private Collection<Reference> basedOn = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Coding> modality = Collections.emptyList();
    private Optional<Reference> referrer = Optional.empty();
    private Collection<Reference> endpoint = Collections.emptyList();
    private Optional<Reference> location = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<CodeableConcept> reasonCode = Collections.emptyList();
    private Collection<Reference> interpreter = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<CodeableConcept> procedureCode = Collections.emptyList();
    private Optional<Integer> numberOfSeries = Optional.empty();
    private Collection<Reference> reasonReference = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Integer> numberOfInstances = Optional.empty();
    private Optional<Reference> procedureReference = Optional.empty();
    private Collection<ImagingStudy.Series> series = Collections.emptyList();

    /**
     * Required fields for {@link ImagingStudy}
     *
     * @param status - The current state of the ImagingStudy.
     * @param subject - The subject, typically a patient, of the imaging study.
     */
    public Impl(IMAGINGSTUDY_STATUS status, Reference subject) {
      this.status = status;
      this.subject = subject;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ImagingStudyBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public ImagingStudyBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public ImagingStudyBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
      this.meta = Optional.of(meta.build());
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public ImagingStudyBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public ImagingStudyBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param note - Per the recommended DICOM mapping, this element is derived from the Study
     *     Description attribute (0008,1030). Observations or findings about the imaging study
     *     should be recorded in another resource, e.g. Observation, and not in this element.
     */
    public ImagingStudyBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Per the recommended DICOM mapping, this element is derived from the Study
     *     Description attribute (0008,1030). Observations or findings about the imaging study
     *     should be recorded in another resource, e.g. Observation, and not in this element.
     */
    public ImagingStudyBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public ImagingStudyBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param started - Date and time the study started. */
    public ImagingStudyBuilder.Impl withStarted(@NonNull FHIRDateTime started) {
      this.started = Optional.of(started);
      return this;
    }
    /**
     * @param basedOn - A list of the diagnostic requests that resulted in this imaging study being
     *     performed.
     */
    public ImagingStudyBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /**
     * @param basedOn - A list of the diagnostic requests that resulted in this imaging study being
     *     performed.
     */
    public ImagingStudyBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public ImagingStudyBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public ImagingStudyBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param modality - A list of all the series.modality values that are actual acquisition
     *     modalities, i.e. those in the DICOM Context Group 29 (value set OID
     *     1.2.840.10008.6.1.19).
     */
    public ImagingStudyBuilder.Impl withModality(@NonNull Coding... modality) {
      this.modality = Arrays.asList(modality);
      return this;
    }
    /**
     * @param modality - A list of all the series.modality values that are actual acquisition
     *     modalities, i.e. those in the DICOM Context Group 29 (value set OID
     *     1.2.840.10008.6.1.19).
     */
    public ImagingStudyBuilder.Impl withModality(@NonNull Collection<Coding> modality) {
      this.modality = Collections.unmodifiableCollection(modality);
      return this;
    }

    public ImagingStudyBuilder.Impl withModality(@NonNull CodingBuilder... modality) {
      this.modality = Arrays.stream(modality).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param referrer - The requesting/referring physician. */
    public ImagingStudyBuilder.Impl withReferrer(@NonNull Reference referrer) {
      this.referrer = Optional.of(referrer);
      return this;
    }

    public ImagingStudyBuilder.Impl withReferrer(@NonNull ReferenceBuilder referrer) {
      this.referrer = Optional.of(referrer.build());
      return this;
    }
    /**
     * @param endpoint - The network service providing access (e.g., query, view, or retrieval) for
     *     the study. See implementation notes for information about using DICOM endpoints. A
     *     study-level endpoint applies to each series in the study, unless overridden by a
     *     series-level endpoint with the same Endpoint.connectionType.
     */
    public ImagingStudyBuilder.Impl withEndpoint(@NonNull Reference... endpoint) {
      this.endpoint = Arrays.asList(endpoint);
      return this;
    }
    /**
     * @param endpoint - The network service providing access (e.g., query, view, or retrieval) for
     *     the study. See implementation notes for information about using DICOM endpoints. A
     *     study-level endpoint applies to each series in the study, unless overridden by a
     *     series-level endpoint with the same Endpoint.connectionType.
     */
    public ImagingStudyBuilder.Impl withEndpoint(@NonNull Collection<Reference> endpoint) {
      this.endpoint = Collections.unmodifiableCollection(endpoint);
      return this;
    }

    public ImagingStudyBuilder.Impl withEndpoint(@NonNull ReferenceBuilder... endpoint) {
      this.endpoint = Arrays.stream(endpoint).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param location - The principal physical location where the ImagingStudy was performed. */
    public ImagingStudyBuilder.Impl withLocation(@NonNull Reference location) {
      this.location = Optional.of(location);
      return this;
    }

    public ImagingStudyBuilder.Impl withLocation(@NonNull ReferenceBuilder location) {
      this.location = Optional.of(location.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ImagingStudyBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ImagingStudyBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public ImagingStudyBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
      this.contained = Arrays.stream(contained).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ImagingStudyBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ImagingStudyBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ImagingStudyBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - The healthcare event (e.g. a patient and healthcare provider interaction)
     *     during which this ImagingStudy is made.
     */
    public ImagingStudyBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public ImagingStudyBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /**
     * @param identifier - Identifiers for the ImagingStudy such as DICOM Study Instance UID, and
     *     Accession Number.
     */
    public ImagingStudyBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Identifiers for the ImagingStudy such as DICOM Study Instance UID, and
     *     Accession Number.
     */
    public ImagingStudyBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public ImagingStudyBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param reasonCode - Description of clinical condition indicating why the ImagingStudy was
     *     requested.
     */
    public ImagingStudyBuilder.Impl withReasonCode(@NonNull CodeableConcept... reasonCode) {
      this.reasonCode = Arrays.asList(reasonCode);
      return this;
    }
    /**
     * @param reasonCode - Description of clinical condition indicating why the ImagingStudy was
     *     requested.
     */
    public ImagingStudyBuilder.Impl withReasonCode(
        @NonNull Collection<CodeableConcept> reasonCode) {
      this.reasonCode = Collections.unmodifiableCollection(reasonCode);
      return this;
    }

    public ImagingStudyBuilder.Impl withReasonCode(@NonNull CodeableConceptBuilder... reasonCode) {
      this.reasonCode = Arrays.stream(reasonCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param interpreter - Who read the study and interpreted the images or other content. */
    public ImagingStudyBuilder.Impl withInterpreter(@NonNull Reference... interpreter) {
      this.interpreter = Arrays.asList(interpreter);
      return this;
    }
    /** @param interpreter - Who read the study and interpreted the images or other content. */
    public ImagingStudyBuilder.Impl withInterpreter(@NonNull Collection<Reference> interpreter) {
      this.interpreter = Collections.unmodifiableCollection(interpreter);
      return this;
    }

    public ImagingStudyBuilder.Impl withInterpreter(@NonNull ReferenceBuilder... interpreter) {
      this.interpreter = Arrays.stream(interpreter).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - The Imaging Manager description of the study. Institution-generated
     *     description or classification of the Study (component) performed.
     */
    public ImagingStudyBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public ImagingStudyBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param procedureCode - The code for the performed procedure type. */
    public ImagingStudyBuilder.Impl withProcedureCode(@NonNull CodeableConcept... procedureCode) {
      this.procedureCode = Arrays.asList(procedureCode);
      return this;
    }
    /** @param procedureCode - The code for the performed procedure type. */
    public ImagingStudyBuilder.Impl withProcedureCode(
        @NonNull Collection<CodeableConcept> procedureCode) {
      this.procedureCode = Collections.unmodifiableCollection(procedureCode);
      return this;
    }

    public ImagingStudyBuilder.Impl withProcedureCode(
        @NonNull CodeableConceptBuilder... procedureCode) {
      this.procedureCode = Arrays.stream(procedureCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param numberOfSeries - Number of Series in the Study. This value given may be larger than
     *     the number of series elements this Resource contains due to resource availability,
     *     security, or other factors. This element should be present if any series elements are
     *     present.
     */
    public ImagingStudyBuilder.Impl withNumberOfSeries(@NonNull Integer numberOfSeries) {
      this.numberOfSeries = Optional.of(numberOfSeries);
      return this;
    }
    /** @param reasonReference - Indicates another resource whose existence justifies this Study. */
    public ImagingStudyBuilder.Impl withReasonReference(@NonNull Reference... reasonReference) {
      this.reasonReference = Arrays.asList(reasonReference);
      return this;
    }
    /** @param reasonReference - Indicates another resource whose existence justifies this Study. */
    public ImagingStudyBuilder.Impl withReasonReference(
        @NonNull Collection<Reference> reasonReference) {
      this.reasonReference = Collections.unmodifiableCollection(reasonReference);
      return this;
    }

    public ImagingStudyBuilder.Impl withReasonReference(
        @NonNull ReferenceBuilder... reasonReference) {
      this.reasonReference = Arrays.stream(reasonReference).map(e -> e.build()).collect(toList());
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
    public ImagingStudyBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public ImagingStudyBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ImagingStudyBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param numberOfInstances - Number of SOP Instances in Study. This value given may be larger
     *     than the number of instance elements this resource contains due to resource availability,
     *     security, or other factors. This element should be present if any instance elements are
     *     present.
     */
    public ImagingStudyBuilder.Impl withNumberOfInstances(@NonNull Integer numberOfInstances) {
      this.numberOfInstances = Optional.of(numberOfInstances);
      return this;
    }
    /** @param procedureReference - The procedure which this ImagingStudy was part of. */
    public ImagingStudyBuilder.Impl withProcedureReference(@NonNull Reference procedureReference) {
      this.procedureReference = Optional.of(procedureReference);
      return this;
    }

    public ImagingStudyBuilder.Impl withProcedureReference(
        @NonNull ReferenceBuilder procedureReference) {
      this.procedureReference = Optional.of(procedureReference.build());
      return this;
    }
    /** @param series - Each study has one or more series of images or other content. */
    public ImagingStudyBuilder.Impl withSeries(@NonNull ImagingStudy.Series... series) {
      this.series = Arrays.asList(series);
      return this;
    }
    /** @param series - Each study has one or more series of images or other content. */
    public ImagingStudyBuilder.Impl withSeries(@NonNull Collection<ImagingStudy.Series> series) {
      this.series = Collections.unmodifiableCollection(series);
      return this;
    }

    public ImagingStudyBuilder.Impl withSeries(@NonNull ImagingStudy_SeriesBuilder... series) {
      this.series = Arrays.stream(series).map(e -> e.build()).collect(toList());
      return this;
    }

    public ImagingStudyBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public ImagingStudy build() {
      return new ImagingStudy(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          note.stream().collect(new LitSeqJCollector<>()),
          status,
          subject,
          OptionConverters.toScala(started),
          basedOn.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          modality.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(referrer),
          endpoint.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(location),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          identifier.stream().collect(new LitSeqJCollector<>()),
          reasonCode.stream().collect(new LitSeqJCollector<>()),
          interpreter.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(implicitRules),
          procedureCode.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(numberOfSeries.map(x -> (Object) x)),
          reasonReference.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(numberOfInstances.map(x -> (Object) x)),
          OptionConverters.toScala(procedureReference),
          series.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
