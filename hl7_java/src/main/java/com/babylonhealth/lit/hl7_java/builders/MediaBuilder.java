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
import com.babylonhealth.lit.hl7.EVENT_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class MediaBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<CodeableConcept> _type = Optional.empty();
  private Optional<CodeableConcept> view = Optional.empty();
  private Collection<Annotation> note = Collections.emptyList();
  private Optional<Integer> width = Optional.empty();
  private Collection<Reference> partOf = Collections.emptyList();
  private EVENT_STATUS status;
  private Optional<ZonedDateTime> issued = Optional.empty();
  private Optional<Reference> device = Optional.empty();
  private Optional<Integer> height = Optional.empty();
  private Optional<Integer> frames = Optional.empty();
  private Collection<Reference> basedOn = Collections.emptyList();
  private Optional<Reference> subject = Optional.empty();
  private Attachment content;
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<CodeableConcept> modality = Optional.empty();
  private Optional<Reference> operator = Optional.empty();
  private Optional<CodeableConcept> bodySite = Optional.empty();
  private Optional<BigDecimal> duration = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> encounter = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<Choice_0934386166> created = Optional.empty();
  private Collection<CodeableConcept> reasonCode = Collections.emptyList();
  private Optional<String> deviceName = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link Media}
   *
   * @param status - The current state of the {{title}}.
   * @param content - The actual content of the media - inline or by direct reference to the media
   *     source file.
   */
  public MediaBuilder(EVENT_STATUS status, Attachment content) {
    this.status = status;
    this.content = content;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public MediaBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public MediaBuilder withMeta(@NonNull Meta meta) {
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
  public MediaBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param _type - A code that classifies whether the media is an image, video or audio recording
   *     or some other media category.
   */
  public MediaBuilder withType(@NonNull CodeableConcept _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /** @param view - The name of the imaging view e.g. Lateral or Antero-posterior (AP). */
  public MediaBuilder withView(@NonNull CodeableConcept view) {
    this.view = Optional.of(view);
    return this;
  }
  /**
   * @param note - Comments made about the media by the performer, subject or other participants.
   */
  public MediaBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /**
   * @param note - Comments made about the media by the performer, subject or other participants.
   */
  public MediaBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /** @param width - Width of the image in pixels (photo/video). */
  public MediaBuilder withWidth(@NonNull Integer width) {
    this.width = Optional.of(width);
    return this;
  }
  /** @param partOf - A larger event of which this particular event is a component or step. */
  public MediaBuilder withPartOf(@NonNull Reference... partOf) {
    this.partOf = Arrays.asList(partOf);
    return this;
  }
  /** @param partOf - A larger event of which this particular event is a component or step. */
  public MediaBuilder withPartOf(@NonNull Collection<Reference> partOf) {
    this.partOf = Collections.unmodifiableCollection(partOf);
    return this;
  }
  /**
   * @param issued - The date and time this version of the media was made available to providers,
   *     typically after having been reviewed.
   */
  public MediaBuilder withIssued(@NonNull ZonedDateTime issued) {
    this.issued = Optional.of(issued);
    return this;
  }
  /** @param device - The device used to collect the media. */
  public MediaBuilder withDevice(@NonNull Reference device) {
    this.device = Optional.of(device);
    return this;
  }
  /** @param height - Height of the image in pixels (photo/video). */
  public MediaBuilder withHeight(@NonNull Integer height) {
    this.height = Optional.of(height);
    return this;
  }
  /**
   * @param frames - The number of frames in a photo. This is used with a multi-page fax, or an
   *     imaging acquisition context that takes multiple slices in a single image, or an animated
   *     gif. If there is more than one frame, this SHALL have a value in order to alert interface
   *     software that a multi-frame capable rendering widget is required.
   */
  public MediaBuilder withFrames(@NonNull Integer frames) {
    this.frames = Optional.of(frames);
    return this;
  }
  /**
   * @param basedOn - A procedure that is fulfilled in whole or in part by the creation of this
   *     media.
   */
  public MediaBuilder withBasedOn(@NonNull Reference... basedOn) {
    this.basedOn = Arrays.asList(basedOn);
    return this;
  }
  /**
   * @param basedOn - A procedure that is fulfilled in whole or in part by the creation of this
   *     media.
   */
  public MediaBuilder withBasedOn(@NonNull Collection<Reference> basedOn) {
    this.basedOn = Collections.unmodifiableCollection(basedOn);
    return this;
  }
  /** @param subject - Who/What this Media is a record of. */
  public MediaBuilder withSubject(@NonNull Reference subject) {
    this.subject = Optional.of(subject);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public MediaBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param modality - Details of the type of the media - usually, how it was acquired (what type of
   *     device). If images sourced from a DICOM system, are wrapped in a Media resource, then this
   *     is the modality.
   */
  public MediaBuilder withModality(@NonNull CodeableConcept modality) {
    this.modality = Optional.of(modality);
    return this;
  }
  /** @param operator - The person who administered the collection of the image. */
  public MediaBuilder withOperator(@NonNull Reference operator) {
    this.operator = Optional.of(operator);
    return this;
  }
  /**
   * @param bodySite - Indicates the site on the subject's body where the observation was made (i.e.
   *     the target site).
   */
  public MediaBuilder withBodySite(@NonNull CodeableConcept bodySite) {
    this.bodySite = Optional.of(bodySite);
    return this;
  }
  /** @param duration - The duration of the recording in seconds - for audio and video. */
  public MediaBuilder withDuration(@NonNull BigDecimal duration) {
    this.duration = Optional.of(duration);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public MediaBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public MediaBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public MediaBuilder withExtension(@NonNull Extension... extension) {
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
  public MediaBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param encounter - The encounter that establishes the context for this media. */
  public MediaBuilder withEncounter(@NonNull Reference encounter) {
    this.encounter = Optional.of(encounter);
    return this;
  }
  /**
   * @param identifier - Identifiers associated with the image - these may include identifiers for
   *     the image itself, identifiers for the context of its collection (e.g. series ids) and
   *     context ids such as accession numbers or other workflow identifiers.
   */
  public MediaBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Identifiers associated with the image - these may include identifiers for
   *     the image itself, identifiers for the context of its collection (e.g. series ids) and
   *     context ids such as accession numbers or other workflow identifiers.
   */
  public MediaBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param created - The date and time(s) at which the media was collected. Field is a 'choice'
   *     field. Type should be one of FHIRDateTime, Period.
   */
  public MediaBuilder withCreated(@NonNull Choice_0934386166 created) {
    this.created = Optional.of(created);
    return this;
  }
  /** @param reasonCode - Describes why the event occurred in coded or textual form. */
  public MediaBuilder withReasonCode(@NonNull CodeableConcept... reasonCode) {
    this.reasonCode = Arrays.asList(reasonCode);
    return this;
  }
  /** @param reasonCode - Describes why the event occurred in coded or textual form. */
  public MediaBuilder withReasonCode(@NonNull Collection<CodeableConcept> reasonCode) {
    this.reasonCode = Collections.unmodifiableCollection(reasonCode);
    return this;
  }
  /**
   * @param deviceName - The name of the device / manufacturer of the device that was used to make
   *     the recording.
   */
  public MediaBuilder withDeviceName(@NonNull String deviceName) {
    this.deviceName = Optional.of(deviceName);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public MediaBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
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
  public MediaBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public MediaBuilder withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public MediaBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Media build() {
    return new Media(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        OptionConverters.toScala(_type),
        OptionConverters.toScala(view),
        note.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(width.map(x -> (Object) x)),
        partOf.stream().collect(new LitSeqJCollector<>()),
        status,
        OptionConverters.toScala(issued),
        OptionConverters.toScala(device),
        OptionConverters.toScala(height.map(x -> (Object) x)),
        OptionConverters.toScala(frames.map(x -> (Object) x)),
        basedOn.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(subject),
        content,
        OptionConverters.toScala(language),
        OptionConverters.toScala(modality),
        OptionConverters.toScala(operator),
        OptionConverters.toScala(bodySite),
        OptionConverters.toScala(duration),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(encounter),
        identifier.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(created),
        reasonCode.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(deviceName),
        OptionConverters.toScala(implicitRules),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
