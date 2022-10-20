package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface RiskAssessmentBuilder extends DomainResourceBuilder {
  public RiskAssessment build();

  public static Impl init(OBSERVATION_STATUS status, Reference subject) {
    return new Impl(status, subject);
  }

  public static Impl builder(OBSERVATION_STATUS status, ReferenceBuilder subject) {
    return new Impl(status, subject.build());
  }

  public static ChoiceDateTimeOrPeriod occurrence(FHIRDateTime f) {
    return new ChoiceDateTimeOrPeriod(f);
  }

  public static ChoiceDateTimeOrPeriod occurrence(Period p) {
    return new ChoiceDateTimeOrPeriod(p);
  }

  public class Impl implements RiskAssessmentBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Collection<Reference> basis = Collections.emptyList();
    private Optional<Reference> parent = Optional.empty();
    private OBSERVATION_STATUS status;
    private Optional<CodeableConcept> method = Optional.empty();
    private Optional<Reference> basedOn = Optional.empty();
    private Reference subject;
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Optional<Reference> condition = Optional.empty();
    private Optional<Reference> performer = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<CodeableConcept> reasonCode = Collections.emptyList();
    private Optional<String> mitigation = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<ChoiceDateTimeOrPeriod> occurrence = Optional.empty();
    private Collection<Reference> reasonReference = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<RiskAssessment.Prediction> prediction = Collections.emptyList();

    /**
     * Required fields for {@link RiskAssessment}
     *
     * @param status - The status of the RiskAssessment, using the same statuses as an Observation.
     * @param subject - The patient or group the risk assessment applies to.
     */
    public Impl(OBSERVATION_STATUS status, Reference subject) {
      this.status = status;
      this.subject = subject;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public RiskAssessmentBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public RiskAssessmentBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public RiskAssessmentBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public RiskAssessmentBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public RiskAssessmentBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param code - The type of the risk assessment performed. */
    public RiskAssessmentBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public RiskAssessmentBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /** @param note - Additional comments about the risk assessment. */
    public RiskAssessmentBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - Additional comments about the risk assessment. */
    public RiskAssessmentBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public RiskAssessmentBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param basis - Indicates the source data considered as part of the assessment (for example,
     *     FamilyHistory, Observations, Procedures, Conditions, etc.).
     */
    public RiskAssessmentBuilder.Impl withBasis(@NonNull Reference... basis) {
      this.basis = Arrays.asList(basis);
      return this;
    }
    /**
     * @param basis - Indicates the source data considered as part of the assessment (for example,
     *     FamilyHistory, Observations, Procedures, Conditions, etc.).
     */
    public RiskAssessmentBuilder.Impl withBasis(@NonNull Collection<Reference> basis) {
      this.basis = Collections.unmodifiableCollection(basis);
      return this;
    }

    public RiskAssessmentBuilder.Impl withBasis(@NonNull ReferenceBuilder... basis) {
      this.basis = Arrays.stream(basis).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param parent - A reference to a resource that this risk assessment is part of, such as a
     *     Procedure.
     */
    public RiskAssessmentBuilder.Impl withParent(@NonNull Reference parent) {
      this.parent = Optional.of(parent);
      return this;
    }

    public RiskAssessmentBuilder.Impl withParent(@NonNull ReferenceBuilder parent) {
      this.parent = Optional.of(parent.build());
      return this;
    }
    /** @param method - The algorithm, process or mechanism used to evaluate the risk. */
    public RiskAssessmentBuilder.Impl withMethod(@NonNull CodeableConcept method) {
      this.method = Optional.of(method);
      return this;
    }

    public RiskAssessmentBuilder.Impl withMethod(@NonNull CodeableConceptBuilder method) {
      this.method = Optional.of(method.build());
      return this;
    }
    /** @param basedOn - A reference to the request that is fulfilled by this risk assessment. */
    public RiskAssessmentBuilder.Impl withBasedOn(@NonNull Reference basedOn) {
      this.basedOn = Optional.of(basedOn);
      return this;
    }

    public RiskAssessmentBuilder.Impl withBasedOn(@NonNull ReferenceBuilder basedOn) {
      this.basedOn = Optional.of(basedOn.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public RiskAssessmentBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public RiskAssessmentBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public RiskAssessmentBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public RiskAssessmentBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public RiskAssessmentBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public RiskAssessmentBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public RiskAssessmentBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param encounter - The encounter where the assessment was performed. */
    public RiskAssessmentBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public RiskAssessmentBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /**
     * @param condition - For assessments or prognosis specific to a particular condition, indicates
     *     the condition being assessed.
     */
    public RiskAssessmentBuilder.Impl withCondition(@NonNull Reference condition) {
      this.condition = Optional.of(condition);
      return this;
    }

    public RiskAssessmentBuilder.Impl withCondition(@NonNull ReferenceBuilder condition) {
      this.condition = Optional.of(condition.build());
      return this;
    }
    /** @param performer - The provider or software application that performed the assessment. */
    public RiskAssessmentBuilder.Impl withPerformer(@NonNull Reference performer) {
      this.performer = Optional.of(performer);
      return this;
    }

    public RiskAssessmentBuilder.Impl withPerformer(@NonNull ReferenceBuilder performer) {
      this.performer = Optional.of(performer.build());
      return this;
    }
    /** @param identifier - Business identifier assigned to the risk assessment. */
    public RiskAssessmentBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - Business identifier assigned to the risk assessment. */
    public RiskAssessmentBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public RiskAssessmentBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param reasonCode - The reason the risk assessment was performed. */
    public RiskAssessmentBuilder.Impl withReasonCode(@NonNull CodeableConcept... reasonCode) {
      this.reasonCode = Arrays.asList(reasonCode);
      return this;
    }
    /** @param reasonCode - The reason the risk assessment was performed. */
    public RiskAssessmentBuilder.Impl withReasonCode(
        @NonNull Collection<CodeableConcept> reasonCode) {
      this.reasonCode = Collections.unmodifiableCollection(reasonCode);
      return this;
    }

    public RiskAssessmentBuilder.Impl withReasonCode(
        @NonNull CodeableConceptBuilder... reasonCode) {
      this.reasonCode = Arrays.stream(reasonCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param mitigation - A description of the steps that might be taken to reduce the identified
     *     risk(s).
     */
    public RiskAssessmentBuilder.Impl withMitigation(@NonNull String mitigation) {
      this.mitigation = Optional.of(mitigation);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public RiskAssessmentBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param occurrence - The date (and possibly time) the risk assessment was performed. Field is
     *     a 'choice' field. Type should be one of FHIRDateTime, Period. To pass the value in, wrap
     *     with one of the RiskAssessmentBuilder.occurrence static methods
     */
    public RiskAssessmentBuilder.Impl withOccurrence(@NonNull ChoiceDateTimeOrPeriod occurrence) {
      this.occurrence = Optional.of(occurrence);
      return this;
    }
    /**
     * @param reasonReference - Resources supporting the reason the risk assessment was performed.
     */
    public RiskAssessmentBuilder.Impl withReasonReference(@NonNull Reference... reasonReference) {
      this.reasonReference = Arrays.asList(reasonReference);
      return this;
    }
    /**
     * @param reasonReference - Resources supporting the reason the risk assessment was performed.
     */
    public RiskAssessmentBuilder.Impl withReasonReference(
        @NonNull Collection<Reference> reasonReference) {
      this.reasonReference = Collections.unmodifiableCollection(reasonReference);
      return this;
    }

    public RiskAssessmentBuilder.Impl withReasonReference(
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
    public RiskAssessmentBuilder.Impl withModifierExtension(
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
    public RiskAssessmentBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public RiskAssessmentBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param prediction - Describes the expected outcome for the subject. */
    public RiskAssessmentBuilder.Impl withPrediction(
        @NonNull RiskAssessment.Prediction... prediction) {
      this.prediction = Arrays.asList(prediction);
      return this;
    }
    /** @param prediction - Describes the expected outcome for the subject. */
    public RiskAssessmentBuilder.Impl withPrediction(
        @NonNull Collection<RiskAssessment.Prediction> prediction) {
      this.prediction = Collections.unmodifiableCollection(prediction);
      return this;
    }

    public RiskAssessmentBuilder.Impl withPrediction(
        @NonNull RiskAssessment_PredictionBuilder... prediction) {
      this.prediction = Arrays.stream(prediction).map(e -> e.build()).collect(toList());
      return this;
    }

    public RiskAssessmentBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public RiskAssessment build() {
      return new RiskAssessment(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(code),
          note.stream().collect(new LitSeqJCollector<>()),
          basis.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(parent),
          status,
          OptionConverters.toScala(method),
          OptionConverters.toScala(basedOn),
          subject,
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          OptionConverters.toScala(condition),
          OptionConverters.toScala(performer),
          identifier.stream().collect(new LitSeqJCollector<>()),
          reasonCode.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(mitigation),
          OptionConverters.toScala(implicitRules),
          (Option) OptionConverters.toScala(occurrence),
          reasonReference.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          prediction.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
