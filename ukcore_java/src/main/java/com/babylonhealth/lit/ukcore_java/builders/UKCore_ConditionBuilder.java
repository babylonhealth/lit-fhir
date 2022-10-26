package com.babylonhealth.lit.ukcore_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.ukcore.model.*;
import com.babylonhealth.lit.ukcore_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface UKCore_ConditionBuilder extends ConditionBuilder {
  public UKCore_Condition build();

  public static Impl init(Reference subject) {
    return new Impl(subject);
  }

  public static Impl builder(ReferenceBuilder subject) {
    return new Impl(subject.build());
  }

  public static Choice01474038381 onset(Age a) {
    return new Choice01474038381(a);
  }

  public static Choice01474038381 onset(FHIRDateTime f) {
    return new Choice01474038381(f);
  }

  public static Choice01474038381 onset(Period p) {
    return new Choice01474038381(p);
  }

  public static Choice01474038381 onset(Range r) {
    return new Choice01474038381(r);
  }

  public static Choice01474038381 onset(String s) {
    return new Choice01474038381(s);
  }

  public static Choice01474038381 abatement(Age a) {
    return new Choice01474038381(a);
  }

  public static Choice01474038381 abatement(FHIRDateTime f) {
    return new Choice01474038381(f);
  }

  public static Choice01474038381 abatement(Period p) {
    return new Choice01474038381(p);
  }

  public static Choice01474038381 abatement(Range r) {
    return new Choice01474038381(r);
  }

  public static Choice01474038381 abatement(String s) {
    return new Choice01474038381(s);
  }

  public class Impl implements UKCore_ConditionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Condition")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private Reference subject;
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Optional<CodeableConcept> severity = Optional.empty();
    private Optional<Choice01474038381> onset = Optional.empty();
    private Optional<Reference> recorder = Optional.empty();
    private Optional<Reference> asserter = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Optional<Choice01474038381> abatement = Optional.empty();
    private Optional<FHIRDateTime> recordedDate = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> clinicalStatus = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> verificationStatus = Optional.empty();
    private Collection<CodeableConcept> bodySite = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<Condition.Stage> stage = Collections.emptyList();
    private Collection<Condition.Evidence> evidence = Collections.emptyList();

    /**
     * Required fields for {@link UKCore_Condition}
     *
     * @param subject - Indicates the patient or group who the condition record is associated with.
     */
    public Impl(Reference subject) {
      this.subject = subject;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public UKCore_ConditionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public UKCore_ConditionBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public UKCore_ConditionBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public UKCore_ConditionBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param category - A category assigned to the condition. */
    public UKCore_ConditionBuilder.Impl withCategory(@NonNull CodeableConcept... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /** @param category - A category assigned to the condition. */
    public UKCore_ConditionBuilder.Impl withCategory(
        @NonNull Collection<CodeableConcept> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withCategory(@NonNull CodeableConceptBuilder... category) {
      this.category = Arrays.stream(category).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param severity - A subjective assessment of the severity of the condition as evaluated by
     *     the clinician.
     */
    public UKCore_ConditionBuilder.Impl withSeverity(@NonNull CodeableConcept severity) {
      this.severity = Optional.of(severity);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withSeverity(@NonNull CodeableConceptBuilder severity) {
      this.severity = Optional.of(severity.build());
      return this;
    }
    /**
     * @param onset - Estimated or actual date or date-time the condition began, in the opinion of
     *     the clinician. Field is a 'choice' field. Type should be one of Age, FHIRDateTime,
     *     Period, Range, String. To pass the value in, wrap with one of the
     *     UKCore_ConditionBuilder.onset static methods
     */
    public UKCore_ConditionBuilder.Impl withOnset(@NonNull Choice01474038381 onset) {
      this.onset = Optional.of(onset);
      return this;
    }
    /**
     * @param recorder - Individual who recorded the record and takes responsibility for its
     *     content.
     */
    public UKCore_ConditionBuilder.Impl withRecorder(@NonNull Reference recorder) {
      this.recorder = Optional.of(recorder);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withRecorder(@NonNull ReferenceBuilder recorder) {
      this.recorder = Optional.of(recorder.build());
      return this;
    }
    /** @param asserter - Individual who is making the condition statement. */
    public UKCore_ConditionBuilder.Impl withAsserter(@NonNull Reference asserter) {
      this.asserter = Optional.of(asserter);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withAsserter(@NonNull ReferenceBuilder asserter) {
      this.asserter = Optional.of(asserter.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public UKCore_ConditionBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public UKCore_ConditionBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public UKCore_ConditionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public UKCore_ConditionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - The Encounter during which this Condition was created or to which the
     *     creation of this record is tightly associated.
     */
    public UKCore_ConditionBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /**
     * @param abatement - The date or estimated date that the condition resolved or went into
     *     remission. This is called "abatement" because of the many overloaded connotations
     *     associated with "remission" or "resolution" - Conditions are never really resolved, but
     *     they can abate. Field is a 'choice' field. Type should be one of Age, FHIRDateTime,
     *     Period, Range, String. To pass the value in, wrap with one of the
     *     UKCore_ConditionBuilder.abatement static methods
     */
    public UKCore_ConditionBuilder.Impl withAbatement(@NonNull Choice01474038381 abatement) {
      this.abatement = Optional.of(abatement);
      return this;
    }
    /**
     * @param recordedDate - The recordedDate represents when this particular Condition record was
     *     created in the system, which is often a system-generated date.
     */
    public UKCore_ConditionBuilder.Impl withRecordedDate(@NonNull FHIRDateTime recordedDate) {
      this.recordedDate = Optional.of(recordedDate);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public UKCore_ConditionBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param clinicalStatus - The clinical status of the condition. */
    public UKCore_ConditionBuilder.Impl withClinicalStatus(
        @NonNull CodeableConcept clinicalStatus) {
      this.clinicalStatus = Optional.of(clinicalStatus);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withClinicalStatus(
        @NonNull CodeableConceptBuilder clinicalStatus) {
      this.clinicalStatus = Optional.of(clinicalStatus.build());
      return this;
    }
    /** @param code - Identification of the condition, problem or diagnosis. */
    public UKCore_ConditionBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /**
     * @param note - Additional information about the Condition. This is a general notes/comments
     *     entry for description of the Condition, its diagnosis and prognosis.
     */
    public UKCore_ConditionBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Additional information about the Condition. This is a general notes/comments
     *     entry for description of the Condition, its diagnosis and prognosis.
     */
    public UKCore_ConditionBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
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
    public UKCore_ConditionBuilder.Impl withModifierExtension(
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
    public UKCore_ConditionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param verificationStatus - The verification status to support the clinical status of the
     *     condition.
     */
    public UKCore_ConditionBuilder.Impl withVerificationStatus(
        @NonNull CodeableConcept verificationStatus) {
      this.verificationStatus = Optional.of(verificationStatus);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withVerificationStatus(
        @NonNull CodeableConceptBuilder verificationStatus) {
      this.verificationStatus = Optional.of(verificationStatus.build());
      return this;
    }
    /** @param bodySite - The anatomical location where this condition manifests itself. */
    public UKCore_ConditionBuilder.Impl withBodySite(@NonNull CodeableConcept... bodySite) {
      this.bodySite = Arrays.asList(bodySite);
      return this;
    }
    /** @param bodySite - The anatomical location where this condition manifests itself. */
    public UKCore_ConditionBuilder.Impl withBodySite(
        @NonNull Collection<CodeableConcept> bodySite) {
      this.bodySite = Collections.unmodifiableCollection(bodySite);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withBodySite(@NonNull CodeableConceptBuilder... bodySite) {
      this.bodySite = Arrays.stream(bodySite).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this condition by the performer or other
     *     systems which remain constant as the resource is updated and propagates from server to
     *     server.
     */
    public UKCore_ConditionBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this condition by the performer or other
     *     systems which remain constant as the resource is updated and propagates from server to
     *     server.
     */
    public UKCore_ConditionBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param stage - Clinical stage or grade of a condition. May include formal severity
     *     assessments.
     */
    public UKCore_ConditionBuilder.Impl withStage(@NonNull Condition.Stage... stage) {
      this.stage = Arrays.asList(stage);
      return this;
    }
    /**
     * @param stage - Clinical stage or grade of a condition. May include formal severity
     *     assessments.
     */
    public UKCore_ConditionBuilder.Impl withStage(@NonNull Collection<Condition.Stage> stage) {
      this.stage = Collections.unmodifiableCollection(stage);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withStage(@NonNull Condition_StageBuilder... stage) {
      this.stage = Arrays.stream(stage).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param evidence - Supporting evidence / manifestations that are the basis of the Condition's
     *     verification status, such as evidence that confirmed or refuted the condition.
     */
    public UKCore_ConditionBuilder.Impl withEvidence(@NonNull Condition.Evidence... evidence) {
      this.evidence = Arrays.asList(evidence);
      return this;
    }
    /**
     * @param evidence - Supporting evidence / manifestations that are the basis of the Condition's
     *     verification status, such as evidence that confirmed or refuted the condition.
     */
    public UKCore_ConditionBuilder.Impl withEvidence(
        @NonNull Collection<Condition.Evidence> evidence) {
      this.evidence = Collections.unmodifiableCollection(evidence);
      return this;
    }

    public UKCore_ConditionBuilder.Impl withEvidence(
        @NonNull Condition_EvidenceBuilder... evidence) {
      this.evidence = Arrays.stream(evidence).map(e -> e.build()).collect(toList());
      return this;
    }

    public UKCore_ConditionBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public UKCore_Condition build() {
      return new UKCore_Condition(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          subject,
          OptionConverters.toScala(language),
          category.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(severity),
          (Option) OptionConverters.toScala(onset),
          OptionConverters.toScala(recorder),
          OptionConverters.toScala(asserter),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          (Option) OptionConverters.toScala(abatement),
          OptionConverters.toScala(recordedDate),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(clinicalStatus),
          OptionConverters.toScala(code),
          note.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(verificationStatus),
          bodySite.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          stage.stream().collect(new LitSeqJCollector<>()),
          evidence.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
