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
import com.babylonhealth.lit.hl7.SPECIMEN_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class SpecimenBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<CodeableConcept> _type = Optional.empty();
  private Collection<Annotation> note = Collections.emptyList();
  private Optional<SPECIMEN_STATUS> status = Optional.empty();
  private Collection<Reference> parent = Collections.emptyList();
  private Optional<Reference> subject = Optional.empty();
  private Collection<Reference> request = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<CodeableConcept> condition = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<FHIRDateTime> receivedTime = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Identifier> accessionIdentifier = Optional.empty();
  private Collection<Specimen.Container> container = Collections.emptyList();
  private Optional<Specimen.Collection> collection = Optional.empty();
  private Collection<Specimen.Processing> processing = Collections.emptyList();

  /** Required fields for {@link Specimen} */
  public SpecimenBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public SpecimenBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public SpecimenBuilder withMeta(@NonNull Meta meta) {
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
  public SpecimenBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param _type - The kind of material that forms the specimen. */
  public SpecimenBuilder withType(@NonNull CodeableConcept _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /**
   * @param note - To communicate any details or issues about the specimen or during the specimen
   *     collection. (for example: broken vial, sent with patient, frozen).
   */
  public SpecimenBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /**
   * @param note - To communicate any details or issues about the specimen or during the specimen
   *     collection. (for example: broken vial, sent with patient, frozen).
   */
  public SpecimenBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /** @param status - The availability of the specimen. */
  public SpecimenBuilder withStatus(@NonNull SPECIMEN_STATUS status) {
    this.status = Optional.of(status);
    return this;
  }
  /**
   * @param parent - Reference to the parent (source) specimen which is used when the specimen was
   *     either derived from or a component of another specimen.
   */
  public SpecimenBuilder withParent(@NonNull Reference... parent) {
    this.parent = Arrays.asList(parent);
    return this;
  }
  /**
   * @param parent - Reference to the parent (source) specimen which is used when the specimen was
   *     either derived from or a component of another specimen.
   */
  public SpecimenBuilder withParent(@NonNull Collection<Reference> parent) {
    this.parent = Collections.unmodifiableCollection(parent);
    return this;
  }
  /**
   * @param subject - Where the specimen came from. This may be from patient(s), from a location
   *     (e.g., the source of an environmental sample), or a sampling of a substance or a device.
   */
  public SpecimenBuilder withSubject(@NonNull Reference subject) {
    this.subject = Optional.of(subject);
    return this;
  }
  /**
   * @param request - Details concerning a service request that required a specimen to be collected.
   */
  public SpecimenBuilder withRequest(@NonNull Reference... request) {
    this.request = Arrays.asList(request);
    return this;
  }
  /**
   * @param request - Details concerning a service request that required a specimen to be collected.
   */
  public SpecimenBuilder withRequest(@NonNull Collection<Reference> request) {
    this.request = Collections.unmodifiableCollection(request);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public SpecimenBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public SpecimenBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public SpecimenBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public SpecimenBuilder withExtension(@NonNull Extension... extension) {
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
  public SpecimenBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param condition - A mode or state of being that describes the nature of the specimen. */
  public SpecimenBuilder withCondition(@NonNull CodeableConcept... condition) {
    this.condition = Arrays.asList(condition);
    return this;
  }
  /** @param condition - A mode or state of being that describes the nature of the specimen. */
  public SpecimenBuilder withCondition(@NonNull Collection<CodeableConcept> condition) {
    this.condition = Collections.unmodifiableCollection(condition);
    return this;
  }
  /** @param identifier - Id for specimen. */
  public SpecimenBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - Id for specimen. */
  public SpecimenBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param receivedTime - Time when specimen was received for processing or testing. */
  public SpecimenBuilder withReceivedTime(@NonNull FHIRDateTime receivedTime) {
    this.receivedTime = Optional.of(receivedTime);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public SpecimenBuilder withImplicitRules(@NonNull String implicitRules) {
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
  public SpecimenBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public SpecimenBuilder withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param accessionIdentifier - The identifier assigned by the lab when accessioning specimen(s).
   *     This is not necessarily the same as the specimen identifier, depending on local lab
   *     procedures.
   */
  public SpecimenBuilder withAccessionIdentifier(@NonNull Identifier accessionIdentifier) {
    this.accessionIdentifier = Optional.of(accessionIdentifier);
    return this;
  }
  /**
   * @param container - The container holding the specimen. The recursive nature of containers; i.e.
   *     blood in tube in tray in rack is not addressed here.
   */
  public SpecimenBuilder withContainer(@NonNull Specimen.Container... container) {
    this.container = Arrays.asList(container);
    return this;
  }
  /**
   * @param container - The container holding the specimen. The recursive nature of containers; i.e.
   *     blood in tube in tray in rack is not addressed here.
   */
  public SpecimenBuilder withContainer(@NonNull Collection<Specimen.Container> container) {
    this.container = Collections.unmodifiableCollection(container);
    return this;
  }
  /** @param collection - Details concerning the specimen collection. */
  public SpecimenBuilder withCollection(@NonNull Specimen.Collection collection) {
    this.collection = Optional.of(collection);
    return this;
  }
  /** @param processing - Details concerning processing and processing steps for the specimen. */
  public SpecimenBuilder withProcessing(@NonNull Specimen.Processing... processing) {
    this.processing = Arrays.asList(processing);
    return this;
  }
  /** @param processing - Details concerning processing and processing steps for the specimen. */
  public SpecimenBuilder withProcessing(@NonNull Collection<Specimen.Processing> processing) {
    this.processing = Collections.unmodifiableCollection(processing);
    return this;
  }

  public SpecimenBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Specimen build() {
    return new Specimen(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        OptionConverters.toScala(_type),
        note.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(status),
        parent.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(subject),
        request.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(language),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        condition.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(receivedTime),
        OptionConverters.toScala(implicitRules),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(accessionIdentifier),
        container.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(collection),
        processing.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
