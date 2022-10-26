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
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface BodyStructureBuilder extends DomainResourceBuilder {
  public BodyStructure build();

  public static Impl init(Reference patient) {
    return new Impl(patient);
  }

  public static Impl builder(ReferenceBuilder patient) {
    return new Impl(patient.build());
  }

  public class Impl implements BodyStructureBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<Attachment> image = Collections.emptyList();
    private Optional<Boolean> active = Optional.empty();
    private Reference patient;
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<CodeableConcept> location = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<CodeableConcept> morphology = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<CodeableConcept> locationQualifier = Collections.emptyList();

    /**
     * Required fields for {@link BodyStructure}
     *
     * @param patient - The person to which the body site belongs.
     */
    public Impl(Reference patient) {
      this.patient = patient;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public BodyStructureBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public BodyStructureBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public BodyStructureBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public BodyStructureBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public BodyStructureBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param image - Image or images used to identify a location. */
    public BodyStructureBuilder.Impl withImage(@NonNull Attachment... image) {
      this.image = Arrays.asList(image);
      return this;
    }
    /** @param image - Image or images used to identify a location. */
    public BodyStructureBuilder.Impl withImage(@NonNull Collection<Attachment> image) {
      this.image = Collections.unmodifiableCollection(image);
      return this;
    }

    public BodyStructureBuilder.Impl withImage(@NonNull AttachmentBuilder... image) {
      this.image = Arrays.stream(image).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param active - Whether this body site is in active use. */
    public BodyStructureBuilder.Impl withActive(@NonNull Boolean active) {
      this.active = Optional.of(active);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public BodyStructureBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param location - The anatomical location or region of the specimen, lesion, or body
     *     structure.
     */
    public BodyStructureBuilder.Impl withLocation(@NonNull CodeableConcept location) {
      this.location = Optional.of(location);
      return this;
    }

    public BodyStructureBuilder.Impl withLocation(@NonNull CodeableConceptBuilder location) {
      this.location = Optional.of(location.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public BodyStructureBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public BodyStructureBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public BodyStructureBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public BodyStructureBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public BodyStructureBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public BodyStructureBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - Identifier for this instance of the anatomical structure. */
    public BodyStructureBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - Identifier for this instance of the anatomical structure. */
    public BodyStructureBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public BodyStructureBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param morphology - The kind of structure being represented by the body structure at
     *     `BodyStructure.location`. This can define both normal and abnormal morphologies.
     */
    public BodyStructureBuilder.Impl withMorphology(@NonNull CodeableConcept morphology) {
      this.morphology = Optional.of(morphology);
      return this;
    }

    public BodyStructureBuilder.Impl withMorphology(@NonNull CodeableConceptBuilder morphology) {
      this.morphology = Optional.of(morphology.build());
      return this;
    }
    /** @param description - A summary, characterization or explanation of the body structure. */
    public BodyStructureBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public BodyStructureBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
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
    public BodyStructureBuilder.Impl withModifierExtension(
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
    public BodyStructureBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public BodyStructureBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param locationQualifier - Qualifier to refine the anatomical location. These include
     *     qualifiers for laterality, relative location, directionality, number, and plane.
     */
    public BodyStructureBuilder.Impl withLocationQualifier(
        @NonNull CodeableConcept... locationQualifier) {
      this.locationQualifier = Arrays.asList(locationQualifier);
      return this;
    }
    /**
     * @param locationQualifier - Qualifier to refine the anatomical location. These include
     *     qualifiers for laterality, relative location, directionality, number, and plane.
     */
    public BodyStructureBuilder.Impl withLocationQualifier(
        @NonNull Collection<CodeableConcept> locationQualifier) {
      this.locationQualifier = Collections.unmodifiableCollection(locationQualifier);
      return this;
    }

    public BodyStructureBuilder.Impl withLocationQualifier(
        @NonNull CodeableConceptBuilder... locationQualifier) {
      this.locationQualifier =
          Arrays.stream(locationQualifier).map(e -> e.build()).collect(toList());
      return this;
    }

    public BodyStructureBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public BodyStructure build() {
      return new BodyStructure(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          image.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(active.map(x -> (Object) x)),
          patient,
          OptionConverters.toScala(language),
          OptionConverters.toScala(location),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(morphology),
          OptionConverters.toScala(description),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          locationQualifier.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
