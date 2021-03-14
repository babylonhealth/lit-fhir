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
import com.babylonhealth.lit.hl7.EVENT_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ProcedureBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<CodeableConcept> code = Optional.empty();
  private Collection<Annotation> note = Collections.emptyList();
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
  private Collection<CodeableConcept> bodySite = Collections.emptyList();
  private Collection<CodeableConcept> followUp = Collections.emptyList();
  private Collection<CodeableConcept> usedCode = Collections.emptyList();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> encounter = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Collection<CodeableConcept> reasonCode = Collections.emptyList();
  private Optional<CodeableConcept> statusReason = Optional.empty();
  private Optional<
          Choice<
              $bslash$div<
                  $bslash$div<$bslash$div<$bslash$div<Age, FHIRDateTime>, Period>, Range>, String>>>
      performed = Optional.empty();
  private Collection<CodeableConcept> complication = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Reference> usedReference = Collections.emptyList();
  private Collection<String> instantiatesUri = Collections.emptyList();
  private Collection<Reference> reasonReference = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Reference> complicationDetail = Collections.emptyList();
  private Collection<String> instantiatesCanonical = Collections.emptyList();
  private Collection<Procedure.Performer> performer = Collections.emptyList();
  private Collection<Procedure.FocalDevice> focalDevice = Collections.emptyList();

  /**
   * Required fields for {@link Procedure}
   *
   * @param status - A code specifying the state of the procedure. Generally, this will be the
   *     in-progress or completed state.
   * @param subject - The person, animal or group on which the procedure was performed.
   */
  public ProcedureBuilder(EVENT_STATUS status, Reference subject) {
    this.status = status;
    this.subject = subject;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ProcedureBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public ProcedureBuilder withMeta(@NonNull Meta meta) {
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
  public ProcedureBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param code - The specific procedure that is performed. Use text if the exact nature of the
   *     procedure cannot be coded (e.g. "Laparoscopic Appendectomy").
   */
  public ProcedureBuilder withCode(@NonNull CodeableConcept code) {
    this.code = Optional.of(code);
    return this;
  }
  /** @param note - Any other notes and comments about the procedure. */
  public ProcedureBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /** @param note - Any other notes and comments about the procedure. */
  public ProcedureBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /** @param partOf - A larger event of which this particular procedure is a component or step. */
  public ProcedureBuilder withPartOf(@NonNull Reference... partOf) {
    this.partOf = Arrays.asList(partOf);
    return this;
  }
  /** @param partOf - A larger event of which this particular procedure is a component or step. */
  public ProcedureBuilder withPartOf(@NonNull Collection<Reference> partOf) {
    this.partOf = Collections.unmodifiableCollection(partOf);
    return this;
  }
  /** @param report - This could be a histology result, pathology report, surgical report, etc. */
  public ProcedureBuilder withReport(@NonNull Reference... report) {
    this.report = Arrays.asList(report);
    return this;
  }
  /** @param report - This could be a histology result, pathology report, surgical report, etc. */
  public ProcedureBuilder withReport(@NonNull Collection<Reference> report) {
    this.report = Collections.unmodifiableCollection(report);
    return this;
  }
  /**
   * @param basedOn - A reference to a resource that contains details of the request for this
   *     procedure.
   */
  public ProcedureBuilder withBasedOn(@NonNull Reference... basedOn) {
    this.basedOn = Arrays.asList(basedOn);
    return this;
  }
  /**
   * @param basedOn - A reference to a resource that contains details of the request for this
   *     procedure.
   */
  public ProcedureBuilder withBasedOn(@NonNull Collection<Reference> basedOn) {
    this.basedOn = Collections.unmodifiableCollection(basedOn);
    return this;
  }
  /**
   * @param outcome - The outcome of the procedure - did it resolve the reasons for the procedure
   *     being performed?
   */
  public ProcedureBuilder withOutcome(@NonNull CodeableConcept outcome) {
    this.outcome = Optional.of(outcome);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public ProcedureBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param category - A code that classifies the procedure for searching, sorting and display
   *     purposes (e.g. "Surgical Procedure").
   */
  public ProcedureBuilder withCategory(@NonNull CodeableConcept category) {
    this.category = Optional.of(category);
    return this;
  }
  /**
   * @param recorder - Individual who recorded the record and takes responsibility for its content.
   */
  public ProcedureBuilder withRecorder(@NonNull Reference recorder) {
    this.recorder = Optional.of(recorder);
    return this;
  }
  /** @param asserter - Individual who is making the procedure statement. */
  public ProcedureBuilder withAsserter(@NonNull Reference asserter) {
    this.asserter = Optional.of(asserter);
    return this;
  }
  /**
   * @param location - The location where the procedure actually happened. E.g. a newborn at home, a
   *     tracheostomy at a restaurant.
   */
  public ProcedureBuilder withLocation(@NonNull Reference location) {
    this.location = Optional.of(location);
    return this;
  }
  /**
   * @param bodySite - Detailed and structured anatomical location information. Multiple locations
   *     are allowed - e.g. multiple punch biopsies of a lesion.
   */
  public ProcedureBuilder withBodySite(@NonNull CodeableConcept... bodySite) {
    this.bodySite = Arrays.asList(bodySite);
    return this;
  }
  /**
   * @param bodySite - Detailed and structured anatomical location information. Multiple locations
   *     are allowed - e.g. multiple punch biopsies of a lesion.
   */
  public ProcedureBuilder withBodySite(@NonNull Collection<CodeableConcept> bodySite) {
    this.bodySite = Collections.unmodifiableCollection(bodySite);
    return this;
  }
  /**
   * @param followUp - If the procedure required specific follow up - e.g. removal of sutures. The
   *     follow up may be represented as a simple note or could potentially be more complex, in
   *     which case the CarePlan resource can be used.
   */
  public ProcedureBuilder withFollowUp(@NonNull CodeableConcept... followUp) {
    this.followUp = Arrays.asList(followUp);
    return this;
  }
  /**
   * @param followUp - If the procedure required specific follow up - e.g. removal of sutures. The
   *     follow up may be represented as a simple note or could potentially be more complex, in
   *     which case the CarePlan resource can be used.
   */
  public ProcedureBuilder withFollowUp(@NonNull Collection<CodeableConcept> followUp) {
    this.followUp = Collections.unmodifiableCollection(followUp);
    return this;
  }
  /** @param usedCode - Identifies coded items that were used as part of the procedure. */
  public ProcedureBuilder withUsedCode(@NonNull CodeableConcept... usedCode) {
    this.usedCode = Arrays.asList(usedCode);
    return this;
  }
  /** @param usedCode - Identifies coded items that were used as part of the procedure. */
  public ProcedureBuilder withUsedCode(@NonNull Collection<CodeableConcept> usedCode) {
    this.usedCode = Collections.unmodifiableCollection(usedCode);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ProcedureBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ProcedureBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public ProcedureBuilder withExtension(@NonNull Extension... extension) {
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
  public ProcedureBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param encounter - The Encounter during which this Procedure was created or performed or to
   *     which the creation of this record is tightly associated.
   */
  public ProcedureBuilder withEncounter(@NonNull Reference encounter) {
    this.encounter = Optional.of(encounter);
    return this;
  }
  /**
   * @param identifier - Business identifiers assigned to this procedure by the performer or other
   *     systems which remain constant as the resource is updated and is propagated from server to
   *     server.
   */
  public ProcedureBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Business identifiers assigned to this procedure by the performer or other
   *     systems which remain constant as the resource is updated and is propagated from server to
   *     server.
   */
  public ProcedureBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param reasonCode - The coded reason why the procedure was performed. This may be a coded
   *     entity of some type, or may simply be present as text.
   */
  public ProcedureBuilder withReasonCode(@NonNull CodeableConcept... reasonCode) {
    this.reasonCode = Arrays.asList(reasonCode);
    return this;
  }
  /**
   * @param reasonCode - The coded reason why the procedure was performed. This may be a coded
   *     entity of some type, or may simply be present as text.
   */
  public ProcedureBuilder withReasonCode(@NonNull Collection<CodeableConcept> reasonCode) {
    this.reasonCode = Collections.unmodifiableCollection(reasonCode);
    return this;
  }
  /** @param statusReason - Captures the reason for the current state of the procedure. */
  public ProcedureBuilder withStatusReason(@NonNull CodeableConcept statusReason) {
    this.statusReason = Optional.of(statusReason);
    return this;
  }
  /**
   * @param performed - Estimated or actual date, date-time, period, or age when the procedure was
   *     performed. Allows a period to support complex procedures that span more than one date, and
   *     also allows for the length of the procedure to be captured. Field is a 'choice' field. Type
   *     should be one of Age, FHIRDateTime, Period, Range, String.
   */
  public <T> ProcedureBuilder withPerformed(@NonNull T performed) {
    var guessedSuffix =
        autoSuffix(performed.getClass().getSimpleName(), Procedure$.MODULE$.performed());
    return withPerformed(guessedSuffix, performed);
  }

  /**
   * Alternative to the 'main' withPerformed method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param performed - The value to be passed to the builder
   */
  public <T> ProcedureBuilder withPerformed(String suffix, @NonNull T performed) {
    guard(performed.getClass().getSimpleName(), suffix, Procedure$.MODULE$.performed());
    this.performed =
        Optional.of(
            (Choice) Choice$.MODULE$.fromSuffix(suffix, performed, Procedure$.MODULE$.performed()));
    return this;
  }
  /**
   * @param complication - Any complications that occurred during the procedure, or in the immediate
   *     post-performance period. These are generally tracked separately from the notes, which will
   *     typically describe the procedure itself rather than any 'post procedure' issues.
   */
  public ProcedureBuilder withComplication(@NonNull CodeableConcept... complication) {
    this.complication = Arrays.asList(complication);
    return this;
  }
  /**
   * @param complication - Any complications that occurred during the procedure, or in the immediate
   *     post-performance period. These are generally tracked separately from the notes, which will
   *     typically describe the procedure itself rather than any 'post procedure' issues.
   */
  public ProcedureBuilder withComplication(@NonNull Collection<CodeableConcept> complication) {
    this.complication = Collections.unmodifiableCollection(complication);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public ProcedureBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param usedReference - Identifies medications, devices and any other substance used as part of
   *     the procedure.
   */
  public ProcedureBuilder withUsedReference(@NonNull Reference... usedReference) {
    this.usedReference = Arrays.asList(usedReference);
    return this;
  }
  /**
   * @param usedReference - Identifies medications, devices and any other substance used as part of
   *     the procedure.
   */
  public ProcedureBuilder withUsedReference(@NonNull Collection<Reference> usedReference) {
    this.usedReference = Collections.unmodifiableCollection(usedReference);
    return this;
  }
  /**
   * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
   *     order set or other definition that is adhered to in whole or in part by this Procedure.
   */
  public ProcedureBuilder withInstantiatesUri(@NonNull String... instantiatesUri) {
    this.instantiatesUri = Arrays.asList(instantiatesUri);
    return this;
  }
  /**
   * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
   *     order set or other definition that is adhered to in whole or in part by this Procedure.
   */
  public ProcedureBuilder withInstantiatesUri(@NonNull Collection<String> instantiatesUri) {
    this.instantiatesUri = Collections.unmodifiableCollection(instantiatesUri);
    return this;
  }
  /** @param reasonReference - The justification of why the procedure was performed. */
  public ProcedureBuilder withReasonReference(@NonNull Reference... reasonReference) {
    this.reasonReference = Arrays.asList(reasonReference);
    return this;
  }
  /** @param reasonReference - The justification of why the procedure was performed. */
  public ProcedureBuilder withReasonReference(@NonNull Collection<Reference> reasonReference) {
    this.reasonReference = Collections.unmodifiableCollection(reasonReference);
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
  public ProcedureBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public ProcedureBuilder withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param complicationDetail - Any complications that occurred during the procedure, or in the
   *     immediate post-performance period.
   */
  public ProcedureBuilder withComplicationDetail(@NonNull Reference... complicationDetail) {
    this.complicationDetail = Arrays.asList(complicationDetail);
    return this;
  }
  /**
   * @param complicationDetail - Any complications that occurred during the procedure, or in the
   *     immediate post-performance period.
   */
  public ProcedureBuilder withComplicationDetail(
      @NonNull Collection<Reference> complicationDetail) {
    this.complicationDetail = Collections.unmodifiableCollection(complicationDetail);
    return this;
  }
  /**
   * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline, order
   *     set or other definition that is adhered to in whole or in part by this Procedure.
   */
  public ProcedureBuilder withInstantiatesCanonical(@NonNull String... instantiatesCanonical) {
    this.instantiatesCanonical = Arrays.asList(instantiatesCanonical);
    return this;
  }
  /**
   * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline, order
   *     set or other definition that is adhered to in whole or in part by this Procedure.
   */
  public ProcedureBuilder withInstantiatesCanonical(
      @NonNull Collection<String> instantiatesCanonical) {
    this.instantiatesCanonical = Collections.unmodifiableCollection(instantiatesCanonical);
    return this;
  }
  /** @param performer - Limited to "real" people rather than equipment. */
  public ProcedureBuilder withPerformer(@NonNull Procedure.Performer... performer) {
    this.performer = Arrays.asList(performer);
    return this;
  }
  /** @param performer - Limited to "real" people rather than equipment. */
  public ProcedureBuilder withPerformer(@NonNull Collection<Procedure.Performer> performer) {
    this.performer = Collections.unmodifiableCollection(performer);
    return this;
  }
  /**
   * @param focalDevice - A device that is implanted, removed or otherwise manipulated (calibration,
   *     battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion
   *     of the Procedure.
   */
  public ProcedureBuilder withFocalDevice(@NonNull Procedure.FocalDevice... focalDevice) {
    this.focalDevice = Arrays.asList(focalDevice);
    return this;
  }
  /**
   * @param focalDevice - A device that is implanted, removed or otherwise manipulated (calibration,
   *     battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion
   *     of the Procedure.
   */
  public ProcedureBuilder withFocalDevice(@NonNull Collection<Procedure.FocalDevice> focalDevice) {
    this.focalDevice = Collections.unmodifiableCollection(focalDevice);
    return this;
  }

  public ProcedureBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Procedure build() {
    return new Procedure(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        OptionConverters.toScala(code),
        note.stream().collect(new LitSeqJCollector<>()),
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
        bodySite.stream().collect(new LitSeqJCollector<>()),
        followUp.stream().collect(new LitSeqJCollector<>()),
        usedCode.stream().collect(new LitSeqJCollector<>()),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(encounter),
        identifier.stream().collect(new LitSeqJCollector<>()),
        reasonCode.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(statusReason),
        OptionConverters.toScala(performed),
        complication.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        usedReference.stream().collect(new LitSeqJCollector<>()),
        instantiatesUri.stream().collect(new LitSeqJCollector<>()),
        reasonReference.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        complicationDetail.stream().collect(new LitSeqJCollector<>()),
        instantiatesCanonical.stream().collect(new LitSeqJCollector<>()),
        performer.stream().collect(new LitSeqJCollector<>()),
        focalDevice.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
