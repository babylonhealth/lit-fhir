package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.CLINICALIMPRESSION_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface ClinicalImpressionBuilder extends DomainResourceBuilder {
  public ClinicalImpression build();

  public static Impl init(CLINICALIMPRESSION_STATUS status, Reference subject) {
    return new Impl(status, subject);
  }

  public static Impl builder(CLINICALIMPRESSION_STATUS status, ReferenceBuilder subject) {
    return new Impl(status, subject.build());
  }

  public static ChoiceDateTimeOrPeriod effective(FHIRDateTime f) {
    return new ChoiceDateTimeOrPeriod(f);
  }

  public static ChoiceDateTimeOrPeriod effective(Period p) {
    return new ChoiceDateTimeOrPeriod(p);
  }

  public class Impl implements ClinicalImpressionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Optional<FHIRDateTime> date = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private CLINICALIMPRESSION_STATUS status;
    private Reference subject;
    private Collection<Reference> problem = Collections.emptyList();
    private Optional<String> summary = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<Reference> assessor = Optional.empty();
    private Optional<Reference> previous = Optional.empty();
    private Collection<String> protocol = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<CodeableConcept> statusReason = Optional.empty();
    private Optional<ChoiceDateTimeOrPeriod> effective = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Reference> supportingInfo = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Reference> prognosisReference = Collections.emptyList();
    private Collection<CodeableConcept> prognosisCodeableConcept = Collections.emptyList();
    private Collection<ClinicalImpression.Finding> finding = Collections.emptyList();
    private Collection<ClinicalImpression.Investigation> investigation = Collections.emptyList();

    /**
     * Required fields for {@link ClinicalImpression}
     *
     * @param status - Identifies the workflow status of the assessment.
     * @param subject - The patient or group of individuals assessed as part of this record.
     */
    public Impl(CLINICALIMPRESSION_STATUS status, Reference subject) {
      this.status = status;
      this.subject = subject;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ClinicalImpressionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public ClinicalImpressionBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public ClinicalImpressionBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param code - Categorizes the type of clinical assessment performed. */
    public ClinicalImpressionBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /** @param date - Indicates when the documentation of the assessment was complete. */
    public ClinicalImpressionBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /**
     * @param note - Commentary about the impression, typically recorded after the impression itself
     *     was made, though supplemental notes by the original author could also appear.
     */
    public ClinicalImpressionBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Commentary about the impression, typically recorded after the impression itself
     *     was made, though supplemental notes by the original author could also appear.
     */
    public ClinicalImpressionBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param problem - A list of the relevant problems/conditions for a patient. */
    public ClinicalImpressionBuilder.Impl withProblem(@NonNull Reference... problem) {
      this.problem = Arrays.asList(problem);
      return this;
    }
    /** @param problem - A list of the relevant problems/conditions for a patient. */
    public ClinicalImpressionBuilder.Impl withProblem(@NonNull Collection<Reference> problem) {
      this.problem = Collections.unmodifiableCollection(problem);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withProblem(@NonNull ReferenceBuilder... problem) {
      this.problem = Arrays.stream(problem).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param summary - A text summary of the investigations and the diagnosis. */
    public ClinicalImpressionBuilder.Impl withSummary(@NonNull String summary) {
      this.summary = Optional.of(summary);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public ClinicalImpressionBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param assessor - The clinician performing the assessment. */
    public ClinicalImpressionBuilder.Impl withAssessor(@NonNull Reference assessor) {
      this.assessor = Optional.of(assessor);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withAssessor(@NonNull ReferenceBuilder assessor) {
      this.assessor = Optional.of(assessor.build());
      return this;
    }
    /**
     * @param previous - A reference to the last assessment that was conducted on this patient.
     *     Assessments are often/usually ongoing in nature; a care provider (practitioner or team)
     *     will make new assessments on an ongoing basis as new data arises or the patient's
     *     conditions changes.
     */
    public ClinicalImpressionBuilder.Impl withPrevious(@NonNull Reference previous) {
      this.previous = Optional.of(previous);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withPrevious(@NonNull ReferenceBuilder previous) {
      this.previous = Optional.of(previous.build());
      return this;
    }
    /**
     * @param protocol - Reference to a specific published clinical protocol that was followed
     *     during this assessment, and/or that provides evidence in support of the diagnosis.
     */
    public ClinicalImpressionBuilder.Impl withProtocol(@NonNull String... protocol) {
      this.protocol = Arrays.asList(protocol);
      return this;
    }
    /**
     * @param protocol - Reference to a specific published clinical protocol that was followed
     *     during this assessment, and/or that provides evidence in support of the diagnosis.
     */
    public ClinicalImpressionBuilder.Impl withProtocol(@NonNull Collection<String> protocol) {
      this.protocol = Collections.unmodifiableCollection(protocol);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ClinicalImpressionBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ClinicalImpressionBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public ClinicalImpressionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ClinicalImpressionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - The Encounter during which this ClinicalImpression was created or to which
     *     the creation of this record is tightly associated.
     */
    public ClinicalImpressionBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this clinical impression by the
     *     performer or other systems which remain constant as the resource is updated and
     *     propagates from server to server.
     */
    public ClinicalImpressionBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this clinical impression by the
     *     performer or other systems which remain constant as the resource is updated and
     *     propagates from server to server.
     */
    public ClinicalImpressionBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - A summary of the context and/or cause of the assessment - why / where it
     *     was performed, and what patient events/status prompted it.
     */
    public ClinicalImpressionBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param statusReason - Captures the reason for the current state of the ClinicalImpression.
     */
    public ClinicalImpressionBuilder.Impl withStatusReason(@NonNull CodeableConcept statusReason) {
      this.statusReason = Optional.of(statusReason);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withStatusReason(
        @NonNull CodeableConceptBuilder statusReason) {
      this.statusReason = Optional.of(statusReason.build());
      return this;
    }
    /**
     * @param effective - The point in time or period over which the subject was assessed. Field is
     *     a 'choice' field. Type should be one of FHIRDateTime, Period. To pass the value in, wrap
     *     with one of the ClinicalImpressionBuilder.effective static methods
     */
    public ClinicalImpressionBuilder.Impl withEffective(@NonNull ChoiceDateTimeOrPeriod effective) {
      this.effective = Optional.of(effective);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public ClinicalImpressionBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param supportingInfo - Information supporting the clinical impression. */
    public ClinicalImpressionBuilder.Impl withSupportingInfo(@NonNull Reference... supportingInfo) {
      this.supportingInfo = Arrays.asList(supportingInfo);
      return this;
    }
    /** @param supportingInfo - Information supporting the clinical impression. */
    public ClinicalImpressionBuilder.Impl withSupportingInfo(
        @NonNull Collection<Reference> supportingInfo) {
      this.supportingInfo = Collections.unmodifiableCollection(supportingInfo);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withSupportingInfo(
        @NonNull ReferenceBuilder... supportingInfo) {
      this.supportingInfo = Arrays.stream(supportingInfo).map(e -> e.build()).collect(toList());
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
    public ClinicalImpressionBuilder.Impl withModifierExtension(
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
    public ClinicalImpressionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param prognosisReference - RiskAssessment expressing likely outcome. */
    public ClinicalImpressionBuilder.Impl withPrognosisReference(
        @NonNull Reference... prognosisReference) {
      this.prognosisReference = Arrays.asList(prognosisReference);
      return this;
    }
    /** @param prognosisReference - RiskAssessment expressing likely outcome. */
    public ClinicalImpressionBuilder.Impl withPrognosisReference(
        @NonNull Collection<Reference> prognosisReference) {
      this.prognosisReference = Collections.unmodifiableCollection(prognosisReference);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withPrognosisReference(
        @NonNull ReferenceBuilder... prognosisReference) {
      this.prognosisReference =
          Arrays.stream(prognosisReference).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param prognosisCodeableConcept - Estimate of likely outcome. */
    public ClinicalImpressionBuilder.Impl withPrognosisCodeableConcept(
        @NonNull CodeableConcept... prognosisCodeableConcept) {
      this.prognosisCodeableConcept = Arrays.asList(prognosisCodeableConcept);
      return this;
    }
    /** @param prognosisCodeableConcept - Estimate of likely outcome. */
    public ClinicalImpressionBuilder.Impl withPrognosisCodeableConcept(
        @NonNull Collection<CodeableConcept> prognosisCodeableConcept) {
      this.prognosisCodeableConcept = Collections.unmodifiableCollection(prognosisCodeableConcept);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withPrognosisCodeableConcept(
        @NonNull CodeableConceptBuilder... prognosisCodeableConcept) {
      this.prognosisCodeableConcept =
          Arrays.stream(prognosisCodeableConcept).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param finding - Specific findings or diagnoses that were considered likely or relevant to
     *     ongoing treatment.
     */
    public ClinicalImpressionBuilder.Impl withFinding(
        @NonNull ClinicalImpression.Finding... finding) {
      this.finding = Arrays.asList(finding);
      return this;
    }
    /**
     * @param finding - Specific findings or diagnoses that were considered likely or relevant to
     *     ongoing treatment.
     */
    public ClinicalImpressionBuilder.Impl withFinding(
        @NonNull Collection<ClinicalImpression.Finding> finding) {
      this.finding = Collections.unmodifiableCollection(finding);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withFinding(
        @NonNull ClinicalImpression_FindingBuilder... finding) {
      this.finding = Arrays.stream(finding).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param investigation - One or more sets of investigations (signs, symptoms, etc.). The actual
     *     grouping of investigations varies greatly depending on the type and context of the
     *     assessment. These investigations may include data generated during the assessment
     *     process, or data previously generated and recorded that is pertinent to the outcomes.
     */
    public ClinicalImpressionBuilder.Impl withInvestigation(
        @NonNull ClinicalImpression.Investigation... investigation) {
      this.investigation = Arrays.asList(investigation);
      return this;
    }
    /**
     * @param investigation - One or more sets of investigations (signs, symptoms, etc.). The actual
     *     grouping of investigations varies greatly depending on the type and context of the
     *     assessment. These investigations may include data generated during the assessment
     *     process, or data previously generated and recorded that is pertinent to the outcomes.
     */
    public ClinicalImpressionBuilder.Impl withInvestigation(
        @NonNull Collection<ClinicalImpression.Investigation> investigation) {
      this.investigation = Collections.unmodifiableCollection(investigation);
      return this;
    }

    public ClinicalImpressionBuilder.Impl withInvestigation(
        @NonNull ClinicalImpression_InvestigationBuilder... investigation) {
      this.investigation = Arrays.stream(investigation).map(e -> e.build()).collect(toList());
      return this;
    }

    public ClinicalImpressionBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public ClinicalImpression build() {
      return new ClinicalImpression(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(code),
          OptionConverters.toScala(date),
          note.stream().collect(new LitSeqJCollector<>()),
          status,
          subject,
          problem.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(summary),
          OptionConverters.toScala(language),
          OptionConverters.toScala(assessor),
          OptionConverters.toScala(previous),
          protocol.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(statusReason),
          (Option) OptionConverters.toScala(effective),
          OptionConverters.toScala(implicitRules),
          supportingInfo.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          prognosisReference.stream().collect(new LitSeqJCollector<>()),
          prognosisCodeableConcept.stream().collect(new LitSeqJCollector<>()),
          finding.stream().collect(new LitSeqJCollector<>()),
          investigation.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
