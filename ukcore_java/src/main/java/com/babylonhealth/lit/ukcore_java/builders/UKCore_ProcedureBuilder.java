package com.babylonhealth.lit.ukcore_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.EVENT_STATUS;
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

public interface UKCore_ProcedureBuilder extends ProcedureBuilder {
  public UKCore_Procedure build();

  public static Impl init(EVENT_STATUS status, Reference subject) {
    return new Impl(status, subject);
  }

  public static Impl builder(EVENT_STATUS status, ReferenceBuilder subject) {
    return new Impl(status, subject.build());
  }

  public static Choice01474038381 performed(Age a) {
    return new Choice01474038381(a);
  }

  public static Choice01474038381 performed(FHIRDateTime f) {
    return new Choice01474038381(f);
  }

  public static Choice01474038381 performed(Period p) {
    return new Choice01474038381(p);
  }

  public static Choice01474038381 performed(Range r) {
    return new Choice01474038381(r);
  }

  public static Choice01474038381 performed(String s) {
    return new Choice01474038381(s);
  }

  public class Impl implements UKCore_ProcedureBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Procedure")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private Collection<Reference> partOf = Collections.emptyList();
    private EVENT_STATUS status;
    private Collection<Reference> report = Collections.emptyList();
    private Collection<Reference> basedOn = Collections.emptyList();
    private Reference subject;
    private Optional<CodeableConcept> outcome = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<CodeableConcept> category = Optional.empty();
    private Optional<Reference> recorder = Optional.empty();
    private Optional<Reference> asserter = Optional.empty();
    private Optional<Reference> location = Optional.empty();
    private Collection<CodeableConcept> followUp = Collections.emptyList();
    private Collection<CodeableConcept> usedCode = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Collection<CodeableConcept> reasonCode = Collections.emptyList();
    private Optional<CodeableConcept> statusReason = Optional.empty();
    private Optional<Choice01474038381> performed = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Reference> usedReference = Collections.emptyList();
    private Optional<CodeableConcept> code = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Collection<String> instantiatesUri = Collections.emptyList();
    private Collection<Reference> reasonReference = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<CodeableConcept> bodySite = Collections.emptyList();
    private Collection<Reference> complicationDetail = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<String> instantiatesCanonical = Collections.emptyList();
    private Collection<CodeableConcept> complication = Collections.emptyList();
    private Collection<Procedure.Performer> performer = Collections.emptyList();
    private Collection<Procedure.FocalDevice> focalDevice = Collections.emptyList();

    /**
     * Required fields for {@link UKCore_Procedure}
     *
     * @param status - A code specifying the state of the procedure. Generally, this will be the
     *     in-progress or completed state.
     * @param subject - The person, animal or group on which the procedure was performed.
     */
    public Impl(EVENT_STATUS status, Reference subject) {
      this.status = status;
      this.subject = subject;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public UKCore_ProcedureBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public UKCore_ProcedureBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public UKCore_ProcedureBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param partOf - A larger event of which this particular procedure is a component or step. */
    public UKCore_ProcedureBuilder.Impl withPartOf(@NonNull Reference... partOf) {
      this.partOf = Arrays.asList(partOf);
      return this;
    }
    /** @param partOf - A larger event of which this particular procedure is a component or step. */
    public UKCore_ProcedureBuilder.Impl withPartOf(@NonNull Collection<Reference> partOf) {
      this.partOf = Collections.unmodifiableCollection(partOf);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withPartOf(@NonNull ReferenceBuilder... partOf) {
      this.partOf = Arrays.stream(partOf).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param report - This could be a histology result, pathology report, surgical report, etc. */
    public UKCore_ProcedureBuilder.Impl withReport(@NonNull Reference... report) {
      this.report = Arrays.asList(report);
      return this;
    }
    /** @param report - This could be a histology result, pathology report, surgical report, etc. */
    public UKCore_ProcedureBuilder.Impl withReport(@NonNull Collection<Reference> report) {
      this.report = Collections.unmodifiableCollection(report);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withReport(@NonNull ReferenceBuilder... report) {
      this.report = Arrays.stream(report).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param basedOn - A reference to a resource that contains details of the request for this
     *     procedure.
     */
    public UKCore_ProcedureBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /**
     * @param basedOn - A reference to a resource that contains details of the request for this
     *     procedure.
     */
    public UKCore_ProcedureBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param outcome - The outcome of the procedure - did it resolve the reasons for the procedure
     *     being performed?
     */
    public UKCore_ProcedureBuilder.Impl withOutcome(@NonNull CodeableConcept outcome) {
      this.outcome = Optional.of(outcome);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withOutcome(@NonNull CodeableConceptBuilder outcome) {
      this.outcome = Optional.of(outcome.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public UKCore_ProcedureBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param category - A code that classifies the procedure for searching, sorting and display
     *     purposes (e.g. "Surgical Procedure").
     */
    public UKCore_ProcedureBuilder.Impl withCategory(@NonNull CodeableConcept category) {
      this.category = Optional.of(category);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withCategory(@NonNull CodeableConceptBuilder category) {
      this.category = Optional.of(category.build());
      return this;
    }
    /**
     * @param recorder - Individual who recorded the record and takes responsibility for its
     *     content.
     */
    public UKCore_ProcedureBuilder.Impl withRecorder(@NonNull Reference recorder) {
      this.recorder = Optional.of(recorder);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withRecorder(@NonNull ReferenceBuilder recorder) {
      this.recorder = Optional.of(recorder.build());
      return this;
    }
    /** @param asserter - Individual who is making the procedure statement. */
    public UKCore_ProcedureBuilder.Impl withAsserter(@NonNull Reference asserter) {
      this.asserter = Optional.of(asserter);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withAsserter(@NonNull ReferenceBuilder asserter) {
      this.asserter = Optional.of(asserter.build());
      return this;
    }
    /**
     * @param location - The location where the procedure actually happened. E.g. a newborn at home,
     *     a tracheostomy at a restaurant.
     */
    public UKCore_ProcedureBuilder.Impl withLocation(@NonNull Reference location) {
      this.location = Optional.of(location);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withLocation(@NonNull ReferenceBuilder location) {
      this.location = Optional.of(location.build());
      return this;
    }
    /**
     * @param followUp - If the procedure required specific follow up - e.g. removal of sutures. The
     *     follow up may be represented as a simple note or could potentially be more complex, in
     *     which case the CarePlan resource can be used.
     */
    public UKCore_ProcedureBuilder.Impl withFollowUp(@NonNull CodeableConcept... followUp) {
      this.followUp = Arrays.asList(followUp);
      return this;
    }
    /**
     * @param followUp - If the procedure required specific follow up - e.g. removal of sutures. The
     *     follow up may be represented as a simple note or could potentially be more complex, in
     *     which case the CarePlan resource can be used.
     */
    public UKCore_ProcedureBuilder.Impl withFollowUp(
        @NonNull Collection<CodeableConcept> followUp) {
      this.followUp = Collections.unmodifiableCollection(followUp);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withFollowUp(@NonNull CodeableConceptBuilder... followUp) {
      this.followUp = Arrays.stream(followUp).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param usedCode - Identifies coded items that were used as part of the procedure. */
    public UKCore_ProcedureBuilder.Impl withUsedCode(@NonNull CodeableConcept... usedCode) {
      this.usedCode = Arrays.asList(usedCode);
      return this;
    }
    /** @param usedCode - Identifies coded items that were used as part of the procedure. */
    public UKCore_ProcedureBuilder.Impl withUsedCode(
        @NonNull Collection<CodeableConcept> usedCode) {
      this.usedCode = Collections.unmodifiableCollection(usedCode);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withUsedCode(@NonNull CodeableConceptBuilder... usedCode) {
      this.usedCode = Arrays.stream(usedCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public UKCore_ProcedureBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public UKCore_ProcedureBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public UKCore_ProcedureBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public UKCore_ProcedureBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - The Encounter during which this Procedure was created or performed or to
     *     which the creation of this record is tightly associated.
     */
    public UKCore_ProcedureBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /**
     * @param reasonCode - The coded reason why the procedure was performed. This may be a coded
     *     entity of some type, or may simply be present as text.
     */
    public UKCore_ProcedureBuilder.Impl withReasonCode(@NonNull CodeableConcept... reasonCode) {
      this.reasonCode = Arrays.asList(reasonCode);
      return this;
    }
    /**
     * @param reasonCode - The coded reason why the procedure was performed. This may be a coded
     *     entity of some type, or may simply be present as text.
     */
    public UKCore_ProcedureBuilder.Impl withReasonCode(
        @NonNull Collection<CodeableConcept> reasonCode) {
      this.reasonCode = Collections.unmodifiableCollection(reasonCode);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withReasonCode(
        @NonNull CodeableConceptBuilder... reasonCode) {
      this.reasonCode = Arrays.stream(reasonCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param statusReason - Captures the reason for the current state of the procedure. */
    public UKCore_ProcedureBuilder.Impl withStatusReason(@NonNull CodeableConcept statusReason) {
      this.statusReason = Optional.of(statusReason);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withStatusReason(
        @NonNull CodeableConceptBuilder statusReason) {
      this.statusReason = Optional.of(statusReason.build());
      return this;
    }
    /**
     * @param performed - Estimated or actual date, date-time, period, or age when the procedure was
     *     performed. Allows a period to support complex procedures that span more than one date,
     *     and also allows for the length of the procedure to be captured. Field is a 'choice'
     *     field. Type should be one of Age, FHIRDateTime, Period, Range, String. To pass the value
     *     in, wrap with one of the UKCore_ProcedureBuilder.performed static methods
     */
    public UKCore_ProcedureBuilder.Impl withPerformed(@NonNull Choice01474038381 performed) {
      this.performed = Optional.of(performed);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public UKCore_ProcedureBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param usedReference - Identifies medications, devices and any other substance used as part
     *     of the procedure.
     */
    public UKCore_ProcedureBuilder.Impl withUsedReference(@NonNull Reference... usedReference) {
      this.usedReference = Arrays.asList(usedReference);
      return this;
    }
    /**
     * @param usedReference - Identifies medications, devices and any other substance used as part
     *     of the procedure.
     */
    public UKCore_ProcedureBuilder.Impl withUsedReference(
        @NonNull Collection<Reference> usedReference) {
      this.usedReference = Collections.unmodifiableCollection(usedReference);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withUsedReference(
        @NonNull ReferenceBuilder... usedReference) {
      this.usedReference = Arrays.stream(usedReference).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param code - The specific procedure that is performed. Use text if the exact nature of the
     *     procedure cannot be coded (e.g. "Laparoscopic Appendectomy").
     */
    public UKCore_ProcedureBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /** @param note - Any other notes and comments about the procedure. */
    public UKCore_ProcedureBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - Any other notes and comments about the procedure. */
    public UKCore_ProcedureBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
     *     order set or other definition that is adhered to in whole or in part by this Procedure.
     */
    public UKCore_ProcedureBuilder.Impl withInstantiatesUri(@NonNull String... instantiatesUri) {
      this.instantiatesUri = Arrays.asList(instantiatesUri);
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
     *     order set or other definition that is adhered to in whole or in part by this Procedure.
     */
    public UKCore_ProcedureBuilder.Impl withInstantiatesUri(
        @NonNull Collection<String> instantiatesUri) {
      this.instantiatesUri = Collections.unmodifiableCollection(instantiatesUri);
      return this;
    }
    /** @param reasonReference - The justification of why the procedure was performed. */
    public UKCore_ProcedureBuilder.Impl withReasonReference(@NonNull Reference... reasonReference) {
      this.reasonReference = Arrays.asList(reasonReference);
      return this;
    }
    /** @param reasonReference - The justification of why the procedure was performed. */
    public UKCore_ProcedureBuilder.Impl withReasonReference(
        @NonNull Collection<Reference> reasonReference) {
      this.reasonReference = Collections.unmodifiableCollection(reasonReference);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withReasonReference(
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
    public UKCore_ProcedureBuilder.Impl withModifierExtension(
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
    public UKCore_ProcedureBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param bodySite - Detailed and structured anatomical location information. Multiple locations
     *     are allowed - e.g. multiple punch biopsies of a lesion.
     */
    public UKCore_ProcedureBuilder.Impl withBodySite(@NonNull CodeableConcept... bodySite) {
      this.bodySite = Arrays.asList(bodySite);
      return this;
    }
    /**
     * @param bodySite - Detailed and structured anatomical location information. Multiple locations
     *     are allowed - e.g. multiple punch biopsies of a lesion.
     */
    public UKCore_ProcedureBuilder.Impl withBodySite(
        @NonNull Collection<CodeableConcept> bodySite) {
      this.bodySite = Collections.unmodifiableCollection(bodySite);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withBodySite(@NonNull CodeableConceptBuilder... bodySite) {
      this.bodySite = Arrays.stream(bodySite).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param complicationDetail - Any complications that occurred during the procedure, or in the
     *     immediate post-performance period.
     */
    public UKCore_ProcedureBuilder.Impl withComplicationDetail(
        @NonNull Reference... complicationDetail) {
      this.complicationDetail = Arrays.asList(complicationDetail);
      return this;
    }
    /**
     * @param complicationDetail - Any complications that occurred during the procedure, or in the
     *     immediate post-performance period.
     */
    public UKCore_ProcedureBuilder.Impl withComplicationDetail(
        @NonNull Collection<Reference> complicationDetail) {
      this.complicationDetail = Collections.unmodifiableCollection(complicationDetail);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withComplicationDetail(
        @NonNull ReferenceBuilder... complicationDetail) {
      this.complicationDetail =
          Arrays.stream(complicationDetail).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this procedure by the performer or other
     *     systems which remain constant as the resource is updated and is propagated from server to
     *     server.
     */
    public UKCore_ProcedureBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this procedure by the performer or other
     *     systems which remain constant as the resource is updated and is propagated from server to
     *     server.
     */
    public UKCore_ProcedureBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline, order
     *     set or other definition that is adhered to in whole or in part by this Procedure.
     */
    public UKCore_ProcedureBuilder.Impl withInstantiatesCanonical(
        @NonNull String... instantiatesCanonical) {
      this.instantiatesCanonical = Arrays.asList(instantiatesCanonical);
      return this;
    }
    /**
     * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline, order
     *     set or other definition that is adhered to in whole or in part by this Procedure.
     */
    public UKCore_ProcedureBuilder.Impl withInstantiatesCanonical(
        @NonNull Collection<String> instantiatesCanonical) {
      this.instantiatesCanonical = Collections.unmodifiableCollection(instantiatesCanonical);
      return this;
    }
    /**
     * @param complication - Any complications that occurred during the procedure, or in the
     *     immediate post-performance period. These are generally tracked separately from the notes,
     *     which will typically describe the procedure itself rather than any 'post procedure'
     *     issues.
     */
    public UKCore_ProcedureBuilder.Impl withComplication(@NonNull CodeableConcept... complication) {
      this.complication = Arrays.asList(complication);
      return this;
    }
    /**
     * @param complication - Any complications that occurred during the procedure, or in the
     *     immediate post-performance period. These are generally tracked separately from the notes,
     *     which will typically describe the procedure itself rather than any 'post procedure'
     *     issues.
     */
    public UKCore_ProcedureBuilder.Impl withComplication(
        @NonNull Collection<CodeableConcept> complication) {
      this.complication = Collections.unmodifiableCollection(complication);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withComplication(
        @NonNull CodeableConceptBuilder... complication) {
      this.complication = Arrays.stream(complication).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param performer - Limited to "real" people rather than equipment. */
    public UKCore_ProcedureBuilder.Impl withPerformer(@NonNull Procedure.Performer... performer) {
      this.performer = Arrays.asList(performer);
      return this;
    }
    /** @param performer - Limited to "real" people rather than equipment. */
    public UKCore_ProcedureBuilder.Impl withPerformer(
        @NonNull Collection<Procedure.Performer> performer) {
      this.performer = Collections.unmodifiableCollection(performer);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withPerformer(
        @NonNull Procedure_PerformerBuilder... performer) {
      this.performer = Arrays.stream(performer).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param focalDevice - A device that is implanted, removed or otherwise manipulated
     *     (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as
     *     a focal portion of the Procedure.
     */
    public UKCore_ProcedureBuilder.Impl withFocalDevice(
        @NonNull Procedure.FocalDevice... focalDevice) {
      this.focalDevice = Arrays.asList(focalDevice);
      return this;
    }
    /**
     * @param focalDevice - A device that is implanted, removed or otherwise manipulated
     *     (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as
     *     a focal portion of the Procedure.
     */
    public UKCore_ProcedureBuilder.Impl withFocalDevice(
        @NonNull Collection<Procedure.FocalDevice> focalDevice) {
      this.focalDevice = Collections.unmodifiableCollection(focalDevice);
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withFocalDevice(
        @NonNull Procedure_FocalDeviceBuilder... focalDevice) {
      this.focalDevice = Arrays.stream(focalDevice).map(e -> e.build()).collect(toList());
      return this;
    }

    public UKCore_ProcedureBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public UKCore_Procedure build() {
      return new UKCore_Procedure(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          partOf.stream().collect(new LitSeqJCollector<>()),
          status,
          report.stream().collect(new LitSeqJCollector<>()),
          basedOn.stream().collect(new LitSeqJCollector<>()),
          subject,
          OptionConverters.toScala(outcome),
          OptionConverters.toScala(language),
          OptionConverters.toScala(category),
          OptionConverters.toScala(recorder),
          OptionConverters.toScala(asserter),
          OptionConverters.toScala(location),
          followUp.stream().collect(new LitSeqJCollector<>()),
          usedCode.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          reasonCode.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(statusReason),
          (Option) OptionConverters.toScala(performed),
          OptionConverters.toScala(implicitRules),
          usedReference.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(code),
          note.stream().collect(new LitSeqJCollector<>()),
          instantiatesUri.stream().collect(new LitSeqJCollector<>()),
          reasonReference.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          bodySite.stream().collect(new LitSeqJCollector<>()),
          complicationDetail.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          instantiatesCanonical.stream().collect(new LitSeqJCollector<>()),
          complication.stream().collect(new LitSeqJCollector<>()),
          performer.stream().collect(new LitSeqJCollector<>()),
          focalDevice.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
