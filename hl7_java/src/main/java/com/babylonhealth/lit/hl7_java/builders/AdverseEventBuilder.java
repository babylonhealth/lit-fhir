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
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.ADVERSE_EVENT_ACTUALITY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface AdverseEventBuilder extends DomainResourceBuilder {
  public AdverseEvent build();

  public static Impl init(Reference subject, ADVERSE_EVENT_ACTUALITY actuality) {
    return new Impl(subject, actuality);
  }

  public static Impl builder(ReferenceBuilder subject, ADVERSE_EVENT_ACTUALITY actuality) {
    return new Impl(subject.build(), actuality);
  }

  public class Impl implements AdverseEventBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<FHIRDateTime> date = Optional.empty();
    private Optional<CodeableConcept> event = Optional.empty();
    private Collection<Reference> study = Collections.emptyList();
    private Reference subject;
    private Optional<CodeableConcept> outcome = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Optional<FHIRDateTime> detected = Optional.empty();
    private Optional<Reference> location = Optional.empty();
    private Optional<CodeableConcept> severity = Optional.empty();
    private Optional<Reference> recorder = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private ADVERSE_EVENT_ACTUALITY actuality;
    private Optional<Reference> encounter = Optional.empty();
    private Optional<Identifier> identifier = Optional.empty();
    private Optional<CodeableConcept> seriousness = Optional.empty();
    private Collection<Reference> contributor = Collections.emptyList();
    private Optional<FHIRDateTime> recordedDate = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Reference> referenceDocument = Collections.emptyList();
    private Collection<Reference> resultingCondition = Collections.emptyList();
    private Collection<Reference> subjectMedicalHistory = Collections.emptyList();
    private Collection<AdverseEvent.SuspectEntity> suspectEntity = Collections.emptyList();

    /**
     * Required fields for {@link AdverseEvent}
     *
     * @param subject - This subject or group impacted by the event.
     * @param actuality - Whether the event actually happened, or just had the potential to. Note
     *     that this is independent of whether anyone was affected or harmed or how severely.
     */
    public Impl(Reference subject, ADVERSE_EVENT_ACTUALITY actuality) {
      this.subject = subject;
      this.actuality = actuality;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public AdverseEventBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public AdverseEventBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public AdverseEventBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }
    /** @param date - The date (and perhaps time) when the adverse event occurred. */
    public AdverseEventBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /**
     * @param event - This element defines the specific type of event that occurred or that was
     *     prevented from occurring.
     */
    public AdverseEventBuilder.Impl withEvent(@NonNull CodeableConcept event) {
      this.event = Optional.of(event);
      return this;
    }
    /** @param study - AdverseEvent.study. */
    public AdverseEventBuilder.Impl withStudy(@NonNull Reference... study) {
      this.study = Arrays.asList(study);
      return this;
    }
    /** @param study - AdverseEvent.study. */
    public AdverseEventBuilder.Impl withStudy(@NonNull Collection<Reference> study) {
      this.study = Collections.unmodifiableCollection(study);
      return this;
    }
    /** @param outcome - Describes the type of outcome from the adverse event. */
    public AdverseEventBuilder.Impl withOutcome(@NonNull CodeableConcept outcome) {
      this.outcome = Optional.of(outcome);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public AdverseEventBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param category - The overall type of event, intended for search and filtering purposes. */
    public AdverseEventBuilder.Impl withCategory(@NonNull CodeableConcept... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /** @param category - The overall type of event, intended for search and filtering purposes. */
    public AdverseEventBuilder.Impl withCategory(@NonNull Collection<CodeableConcept> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }
    /**
     * @param detected - Estimated or actual date the AdverseEvent began, in the opinion of the
     *     reporter.
     */
    public AdverseEventBuilder.Impl withDetected(@NonNull FHIRDateTime detected) {
      this.detected = Optional.of(detected);
      return this;
    }
    /** @param location - The information about where the adverse event occurred. */
    public AdverseEventBuilder.Impl withLocation(@NonNull Reference location) {
      this.location = Optional.of(location);
      return this;
    }
    /**
     * @param severity - Describes the severity of the adverse event, in relation to the subject.
     *     Contrast to AdverseEvent.seriousness - a severe rash might not be serious, but a mild
     *     heart problem is.
     */
    public AdverseEventBuilder.Impl withSeverity(@NonNull CodeableConcept severity) {
      this.severity = Optional.of(severity);
      return this;
    }
    /**
     * @param recorder - Information on who recorded the adverse event. May be the patient or a
     *     practitioner.
     */
    public AdverseEventBuilder.Impl withRecorder(@NonNull Reference recorder) {
      this.recorder = Optional.of(recorder);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public AdverseEventBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public AdverseEventBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public AdverseEventBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public AdverseEventBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param encounter - The Encounter during which AdverseEvent was created or to which the
     *     creation of this record is tightly associated.
     */
    public AdverseEventBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this adverse event by the performer or
     *     other systems which remain constant as the resource is updated and propagates from server
     *     to server.
     */
    public AdverseEventBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }
    /** @param seriousness - Assessment whether this event was of real importance. */
    public AdverseEventBuilder.Impl withSeriousness(@NonNull CodeableConcept seriousness) {
      this.seriousness = Optional.of(seriousness);
      return this;
    }
    /**
     * @param contributor - Parties that may or should contribute or have contributed information to
     *     the adverse event, which can consist of one or more activities. Such information includes
     *     information leading to the decision to perform the activity and how to perform the
     *     activity (e.g. consultant), information that the activity itself seeks to reveal (e.g.
     *     informant of clinical history), or information about what activity was performed (e.g.
     *     informant witness).
     */
    public AdverseEventBuilder.Impl withContributor(@NonNull Reference... contributor) {
      this.contributor = Arrays.asList(contributor);
      return this;
    }
    /**
     * @param contributor - Parties that may or should contribute or have contributed information to
     *     the adverse event, which can consist of one or more activities. Such information includes
     *     information leading to the decision to perform the activity and how to perform the
     *     activity (e.g. consultant), information that the activity itself seeks to reveal (e.g.
     *     informant of clinical history), or information about what activity was performed (e.g.
     *     informant witness).
     */
    public AdverseEventBuilder.Impl withContributor(@NonNull Collection<Reference> contributor) {
      this.contributor = Collections.unmodifiableCollection(contributor);
      return this;
    }
    /**
     * @param recordedDate - The date on which the existence of the AdverseEvent was first recorded.
     */
    public AdverseEventBuilder.Impl withRecordedDate(@NonNull FHIRDateTime recordedDate) {
      this.recordedDate = Optional.of(recordedDate);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public AdverseEventBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
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
    public AdverseEventBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public AdverseEventBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /** @param referenceDocument - AdverseEvent.referenceDocument. */
    public AdverseEventBuilder.Impl withReferenceDocument(@NonNull Reference... referenceDocument) {
      this.referenceDocument = Arrays.asList(referenceDocument);
      return this;
    }
    /** @param referenceDocument - AdverseEvent.referenceDocument. */
    public AdverseEventBuilder.Impl withReferenceDocument(
        @NonNull Collection<Reference> referenceDocument) {
      this.referenceDocument = Collections.unmodifiableCollection(referenceDocument);
      return this;
    }
    /**
     * @param resultingCondition - Includes information about the reaction that occurred as a result
     *     of exposure to a substance (for example, a drug or a chemical).
     */
    public AdverseEventBuilder.Impl withResultingCondition(
        @NonNull Reference... resultingCondition) {
      this.resultingCondition = Arrays.asList(resultingCondition);
      return this;
    }
    /**
     * @param resultingCondition - Includes information about the reaction that occurred as a result
     *     of exposure to a substance (for example, a drug or a chemical).
     */
    public AdverseEventBuilder.Impl withResultingCondition(
        @NonNull Collection<Reference> resultingCondition) {
      this.resultingCondition = Collections.unmodifiableCollection(resultingCondition);
      return this;
    }
    /** @param subjectMedicalHistory - AdverseEvent.subjectMedicalHistory. */
    public AdverseEventBuilder.Impl withSubjectMedicalHistory(
        @NonNull Reference... subjectMedicalHistory) {
      this.subjectMedicalHistory = Arrays.asList(subjectMedicalHistory);
      return this;
    }
    /** @param subjectMedicalHistory - AdverseEvent.subjectMedicalHistory. */
    public AdverseEventBuilder.Impl withSubjectMedicalHistory(
        @NonNull Collection<Reference> subjectMedicalHistory) {
      this.subjectMedicalHistory = Collections.unmodifiableCollection(subjectMedicalHistory);
      return this;
    }
    /**
     * @param suspectEntity - Describes the entity that is suspected to have caused the adverse
     *     event.
     */
    public AdverseEventBuilder.Impl withSuspectEntity(
        @NonNull AdverseEvent.SuspectEntity... suspectEntity) {
      this.suspectEntity = Arrays.asList(suspectEntity);
      return this;
    }
    /**
     * @param suspectEntity - Describes the entity that is suspected to have caused the adverse
     *     event.
     */
    public AdverseEventBuilder.Impl withSuspectEntity(
        @NonNull Collection<AdverseEvent.SuspectEntity> suspectEntity) {
      this.suspectEntity = Collections.unmodifiableCollection(suspectEntity);
      return this;
    }

    public AdverseEventBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public AdverseEvent build() {
      return new AdverseEvent(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(date),
          OptionConverters.toScala(event),
          study.stream().collect(new LitSeqJCollector<>()),
          subject,
          OptionConverters.toScala(outcome),
          OptionConverters.toScala(language),
          category.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(detected),
          OptionConverters.toScala(location),
          OptionConverters.toScala(severity),
          OptionConverters.toScala(recorder),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          actuality,
          OptionConverters.toScala(encounter),
          OptionConverters.toScala(identifier),
          OptionConverters.toScala(seriousness),
          contributor.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(recordedDate),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          referenceDocument.stream().collect(new LitSeqJCollector<>()),
          resultingCondition.stream().collect(new LitSeqJCollector<>()),
          subjectMedicalHistory.stream().collect(new LitSeqJCollector<>()),
          suspectEntity.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
