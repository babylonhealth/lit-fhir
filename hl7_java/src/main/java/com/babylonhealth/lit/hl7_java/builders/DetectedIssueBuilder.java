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
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.DETECTEDISSUE_SEVERITY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface DetectedIssueBuilder extends DomainResourceBuilder {
  public DetectedIssue build();

  public static Impl init(OBSERVATION_STATUS status) {
    return new Impl(status);
  }

  public static Impl builder(OBSERVATION_STATUS status) {
    return new Impl(status);
  }

  public static ChoiceDateTimeOrPeriod identified(FHIRDateTime f) {
    return new ChoiceDateTimeOrPeriod(f);
  }

  public static ChoiceDateTimeOrPeriod identified(Period p) {
    return new ChoiceDateTimeOrPeriod(p);
  }

  public class Impl implements DetectedIssueBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private OBSERVATION_STATUS status;
    private Optional<Reference> author = Optional.empty();
    private Optional<String> detail = Optional.empty();
    private Optional<Reference> patient = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<DETECTEDISSUE_SEVERITY> severity = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> reference = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<Reference> implicated = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<ChoiceDateTimeOrPeriod> identified = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<DetectedIssue.Evidence> evidence = Collections.emptyList();
    private Collection<DetectedIssue.Mitigation> mitigation = Collections.emptyList();

    /**
     * Required fields for {@link DetectedIssue}
     *
     * @param status - Indicates the status of the detected issue.
     */
    public Impl(OBSERVATION_STATUS status) {
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public DetectedIssueBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public DetectedIssueBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public DetectedIssueBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public DetectedIssueBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public DetectedIssueBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param code - Identifies the general type of issue identified. */
    public DetectedIssueBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public DetectedIssueBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /**
     * @param author - Individual or device responsible for the issue being raised. For example, a
     *     decision support application or a pharmacist conducting a medication review.
     */
    public DetectedIssueBuilder.Impl withAuthor(@NonNull Reference author) {
      this.author = Optional.of(author);
      return this;
    }

    public DetectedIssueBuilder.Impl withAuthor(@NonNull ReferenceBuilder author) {
      this.author = Optional.of(author.build());
      return this;
    }
    /** @param detail - A textual explanation of the detected issue. */
    public DetectedIssueBuilder.Impl withDetail(@NonNull String detail) {
      this.detail = Optional.of(detail);
      return this;
    }
    /**
     * @param patient - Indicates the patient whose record the detected issue is associated with.
     */
    public DetectedIssueBuilder.Impl withPatient(@NonNull Reference patient) {
      this.patient = Optional.of(patient);
      return this;
    }

    public DetectedIssueBuilder.Impl withPatient(@NonNull ReferenceBuilder patient) {
      this.patient = Optional.of(patient.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public DetectedIssueBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param severity - Indicates the degree of importance associated with the identified issue
     *     based on the potential impact on the patient.
     */
    public DetectedIssueBuilder.Impl withSeverity(@NonNull DETECTEDISSUE_SEVERITY severity) {
      this.severity = Optional.of(severity);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public DetectedIssueBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public DetectedIssueBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public DetectedIssueBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public DetectedIssueBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public DetectedIssueBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public DetectedIssueBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param reference - The literature, knowledge-base or similar reference that describes the
     *     propensity for the detected issue identified.
     */
    public DetectedIssueBuilder.Impl withReference(@NonNull String reference) {
      this.reference = Optional.of(reference);
      return this;
    }
    /** @param identifier - Business identifier associated with the detected issue record. */
    public DetectedIssueBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - Business identifier associated with the detected issue record. */
    public DetectedIssueBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public DetectedIssueBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicated - Indicates the resource representing the current activity or proposed
     *     activity that is potentially problematic.
     */
    public DetectedIssueBuilder.Impl withImplicated(@NonNull Reference... implicated) {
      this.implicated = Arrays.asList(implicated);
      return this;
    }
    /**
     * @param implicated - Indicates the resource representing the current activity or proposed
     *     activity that is potentially problematic.
     */
    public DetectedIssueBuilder.Impl withImplicated(@NonNull Collection<Reference> implicated) {
      this.implicated = Collections.unmodifiableCollection(implicated);
      return this;
    }

    public DetectedIssueBuilder.Impl withImplicated(@NonNull ReferenceBuilder... implicated) {
      this.implicated = Arrays.stream(implicated).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public DetectedIssueBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param identified - The date or period when the detected issue was initially identified.
     *     Field is a 'choice' field. Type should be one of FHIRDateTime, Period. To pass the value
     *     in, wrap with one of the DetectedIssueBuilder.identified static methods
     */
    public DetectedIssueBuilder.Impl withIdentified(@NonNull ChoiceDateTimeOrPeriod identified) {
      this.identified = Optional.of(identified);
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
    public DetectedIssueBuilder.Impl withModifierExtension(
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
    public DetectedIssueBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public DetectedIssueBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param evidence - Supporting evidence or manifestations that provide the basis for
     *     identifying the detected issue such as a GuidanceResponse or MeasureReport.
     */
    public DetectedIssueBuilder.Impl withEvidence(@NonNull DetectedIssue.Evidence... evidence) {
      this.evidence = Arrays.asList(evidence);
      return this;
    }
    /**
     * @param evidence - Supporting evidence or manifestations that provide the basis for
     *     identifying the detected issue such as a GuidanceResponse or MeasureReport.
     */
    public DetectedIssueBuilder.Impl withEvidence(
        @NonNull Collection<DetectedIssue.Evidence> evidence) {
      this.evidence = Collections.unmodifiableCollection(evidence);
      return this;
    }

    public DetectedIssueBuilder.Impl withEvidence(
        @NonNull DetectedIssue_EvidenceBuilder... evidence) {
      this.evidence = Arrays.stream(evidence).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param mitigation - Indicates an action that has been taken or is committed to reduce or
     *     eliminate the likelihood of the risk identified by the detected issue from manifesting.
     *     Can also reflect an observation of known mitigating factors that may reduce/eliminate the
     *     need for any action.
     */
    public DetectedIssueBuilder.Impl withMitigation(
        @NonNull DetectedIssue.Mitigation... mitigation) {
      this.mitigation = Arrays.asList(mitigation);
      return this;
    }
    /**
     * @param mitigation - Indicates an action that has been taken or is committed to reduce or
     *     eliminate the likelihood of the risk identified by the detected issue from manifesting.
     *     Can also reflect an observation of known mitigating factors that may reduce/eliminate the
     *     need for any action.
     */
    public DetectedIssueBuilder.Impl withMitigation(
        @NonNull Collection<DetectedIssue.Mitigation> mitigation) {
      this.mitigation = Collections.unmodifiableCollection(mitigation);
      return this;
    }

    public DetectedIssueBuilder.Impl withMitigation(
        @NonNull DetectedIssue_MitigationBuilder... mitigation) {
      this.mitigation = Arrays.stream(mitigation).map(e -> e.build()).collect(toList());
      return this;
    }

    public DetectedIssueBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public DetectedIssue build() {
      return new DetectedIssue(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(code),
          status,
          OptionConverters.toScala(author),
          OptionConverters.toScala(detail),
          OptionConverters.toScala(patient),
          OptionConverters.toScala(language),
          OptionConverters.toScala(severity),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(reference),
          identifier.stream().collect(new LitSeqJCollector<>()),
          implicated.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          (Option) OptionConverters.toScala(identified),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          evidence.stream().collect(new LitSeqJCollector<>()),
          mitigation.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
