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
import com.babylonhealth.lit.hl7.SEQUENCE_TYPE;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface MolecularSequenceBuilder extends DomainResourceBuilder {
  public MolecularSequence build();

  public static Impl init(Integer coordinateSystem) {
    return new Impl(coordinateSystem);
  }

  public static Impl builder(Integer coordinateSystem) {
    return new Impl(coordinateSystem);
  }

  public class Impl implements MolecularSequenceBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<SEQUENCE_TYPE> _type = Optional.empty();
    private Optional<Reference> device = Optional.empty();
    private Optional<Reference> patient = Optional.empty();
    private Collection<Reference> pointer = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<Reference> specimen = Optional.empty();
    private Optional<Quantity> quantity = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> performer = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<String> observedSeq = Optional.empty();
    private Optional<Integer> readCoverage = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Integer coordinateSystem;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<MolecularSequence.Variant> variant = Collections.emptyList();
    private Collection<MolecularSequence.Repository> repository = Collections.emptyList();
    private Collection<MolecularSequence.Quality> quality = Collections.emptyList();
    private Optional<MolecularSequence.ReferenceSeq> referenceSeq = Optional.empty();
    private Collection<MolecularSequence.StructureVariant> structureVariant =
        Collections.emptyList();

    /**
     * Required fields for {@link MolecularSequence}
     *
     * @param coordinateSystem - Whether the sequence is numbered starting at 0 (0-based numbering
     *     or coordinates, inclusive start, exclusive end) or starting at 1 (1-based numbering,
     *     inclusive start and inclusive end).
     */
    public Impl(Integer coordinateSystem) {
      this.coordinateSystem = coordinateSystem;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MolecularSequenceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public MolecularSequenceBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public MolecularSequenceBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public MolecularSequenceBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public MolecularSequenceBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param _type - Amino Acid Sequence/ DNA Sequence / RNA Sequence. */
    public MolecularSequenceBuilder.Impl withType(@NonNull SEQUENCE_TYPE _type) {
      this._type = Optional.of(_type);
      return this;
    }
    /** @param device - The method for sequencing, for example, chip information. */
    public MolecularSequenceBuilder.Impl withDevice(@NonNull Reference device) {
      this.device = Optional.of(device);
      return this;
    }

    public MolecularSequenceBuilder.Impl withDevice(@NonNull ReferenceBuilder device) {
      this.device = Optional.of(device.build());
      return this;
    }
    /** @param patient - The patient whose sequencing results are described by this resource. */
    public MolecularSequenceBuilder.Impl withPatient(@NonNull Reference patient) {
      this.patient = Optional.of(patient);
      return this;
    }

    public MolecularSequenceBuilder.Impl withPatient(@NonNull ReferenceBuilder patient) {
      this.patient = Optional.of(patient.build());
      return this;
    }
    /** @param pointer - Pointer to next atomic sequence which at most contains one variant. */
    public MolecularSequenceBuilder.Impl withPointer(@NonNull Reference... pointer) {
      this.pointer = Arrays.asList(pointer);
      return this;
    }
    /** @param pointer - Pointer to next atomic sequence which at most contains one variant. */
    public MolecularSequenceBuilder.Impl withPointer(@NonNull Collection<Reference> pointer) {
      this.pointer = Collections.unmodifiableCollection(pointer);
      return this;
    }

    public MolecularSequenceBuilder.Impl withPointer(@NonNull ReferenceBuilder... pointer) {
      this.pointer = Arrays.stream(pointer).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public MolecularSequenceBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param specimen - Specimen used for sequencing. */
    public MolecularSequenceBuilder.Impl withSpecimen(@NonNull Reference specimen) {
      this.specimen = Optional.of(specimen);
      return this;
    }

    public MolecularSequenceBuilder.Impl withSpecimen(@NonNull ReferenceBuilder specimen) {
      this.specimen = Optional.of(specimen.build());
      return this;
    }
    /** @param quantity - The number of copies of the sequence of interest. (RNASeq). */
    public MolecularSequenceBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public MolecularSequenceBuilder.Impl withQuantity(@NonNull QuantityBuilder quantity) {
      this.quantity = Optional.of(quantity.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MolecularSequenceBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MolecularSequenceBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public MolecularSequenceBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public MolecularSequenceBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MolecularSequenceBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MolecularSequenceBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param performer - The organization or lab that should be responsible for this result. */
    public MolecularSequenceBuilder.Impl withPerformer(@NonNull Reference performer) {
      this.performer = Optional.of(performer);
      return this;
    }

    public MolecularSequenceBuilder.Impl withPerformer(@NonNull ReferenceBuilder performer) {
      this.performer = Optional.of(performer.build());
      return this;
    }
    /**
     * @param identifier - A unique identifier for this particular sequence instance. This is a
     *     FHIR-defined id.
     */
    public MolecularSequenceBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - A unique identifier for this particular sequence instance. This is a
     *     FHIR-defined id.
     */
    public MolecularSequenceBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public MolecularSequenceBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param observedSeq - Sequence that was observed. It is the result marked by referenceSeq
     *     along with variant records on referenceSeq. This shall start from
     *     referenceSeq.windowStart and end by referenceSeq.windowEnd.
     */
    public MolecularSequenceBuilder.Impl withObservedSeq(@NonNull String observedSeq) {
      this.observedSeq = Optional.of(observedSeq);
      return this;
    }
    /**
     * @param readCoverage - Coverage (read depth or depth) is the average number of reads
     *     representing a given nucleotide in the reconstructed sequence.
     */
    public MolecularSequenceBuilder.Impl withReadCoverage(@NonNull Integer readCoverage) {
      this.readCoverage = Optional.of(readCoverage);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public MolecularSequenceBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
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
    public MolecularSequenceBuilder.Impl withModifierExtension(
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
    public MolecularSequenceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MolecularSequenceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param variant - The definition of variant here originates from Sequence ontology
     *     ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This
     *     element can represent amino acid or nucleic sequence change(including
     *     insertion,deletion,SNP,etc.) It can represent some complex mutation or segment variation
     *     with the assist of CIGAR string.
     */
    public MolecularSequenceBuilder.Impl withVariant(
        @NonNull MolecularSequence.Variant... variant) {
      this.variant = Arrays.asList(variant);
      return this;
    }
    /**
     * @param variant - The definition of variant here originates from Sequence ontology
     *     ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This
     *     element can represent amino acid or nucleic sequence change(including
     *     insertion,deletion,SNP,etc.) It can represent some complex mutation or segment variation
     *     with the assist of CIGAR string.
     */
    public MolecularSequenceBuilder.Impl withVariant(
        @NonNull Collection<MolecularSequence.Variant> variant) {
      this.variant = Collections.unmodifiableCollection(variant);
      return this;
    }

    public MolecularSequenceBuilder.Impl withVariant(
        @NonNull MolecularSequence_VariantBuilder... variant) {
      this.variant = Arrays.stream(variant).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param repository - Configurations of the external repository. The repository shall store
     *     target's observedSeq or records related with target's observedSeq.
     */
    public MolecularSequenceBuilder.Impl withRepository(
        @NonNull MolecularSequence.Repository... repository) {
      this.repository = Arrays.asList(repository);
      return this;
    }
    /**
     * @param repository - Configurations of the external repository. The repository shall store
     *     target's observedSeq or records related with target's observedSeq.
     */
    public MolecularSequenceBuilder.Impl withRepository(
        @NonNull Collection<MolecularSequence.Repository> repository) {
      this.repository = Collections.unmodifiableCollection(repository);
      return this;
    }

    public MolecularSequenceBuilder.Impl withRepository(
        @NonNull MolecularSequence_RepositoryBuilder... repository) {
      this.repository = Arrays.stream(repository).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param quality - An experimental feature attribute that defines the quality of the feature in
     *     a quantitative way, such as a phred quality score
     *     ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
     */
    public MolecularSequenceBuilder.Impl withQuality(
        @NonNull MolecularSequence.Quality... quality) {
      this.quality = Arrays.asList(quality);
      return this;
    }
    /**
     * @param quality - An experimental feature attribute that defines the quality of the feature in
     *     a quantitative way, such as a phred quality score
     *     ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
     */
    public MolecularSequenceBuilder.Impl withQuality(
        @NonNull Collection<MolecularSequence.Quality> quality) {
      this.quality = Collections.unmodifiableCollection(quality);
      return this;
    }

    public MolecularSequenceBuilder.Impl withQuality(
        @NonNull MolecularSequence_QualityBuilder... quality) {
      this.quality = Arrays.stream(quality).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param referenceSeq - A sequence that is used as a reference to describe variants that are
     *     present in a sequence analyzed.
     */
    public MolecularSequenceBuilder.Impl withReferenceSeq(
        @NonNull MolecularSequence.ReferenceSeq referenceSeq) {
      this.referenceSeq = Optional.of(referenceSeq);
      return this;
    }

    public MolecularSequenceBuilder.Impl withReferenceSeq(
        @NonNull MolecularSequence_ReferenceSeqBuilder referenceSeq) {
      this.referenceSeq = Optional.of(referenceSeq.build());
      return this;
    }
    /** @param structureVariant - Information about chromosome structure variation. */
    public MolecularSequenceBuilder.Impl withStructureVariant(
        @NonNull MolecularSequence.StructureVariant... structureVariant) {
      this.structureVariant = Arrays.asList(structureVariant);
      return this;
    }
    /** @param structureVariant - Information about chromosome structure variation. */
    public MolecularSequenceBuilder.Impl withStructureVariant(
        @NonNull Collection<MolecularSequence.StructureVariant> structureVariant) {
      this.structureVariant = Collections.unmodifiableCollection(structureVariant);
      return this;
    }

    public MolecularSequenceBuilder.Impl withStructureVariant(
        @NonNull MolecularSequence_StructureVariantBuilder... structureVariant) {
      this.structureVariant = Arrays.stream(structureVariant).map(e -> e.build()).collect(toList());
      return this;
    }

    public MolecularSequenceBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public MolecularSequence build() {
      return new MolecularSequence(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(device),
          OptionConverters.toScala(patient),
          pointer.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          OptionConverters.toScala(specimen),
          OptionConverters.toScala(quantity),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(performer),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(observedSeq),
          OptionConverters.toScala(readCoverage.map(x -> (Object) x)),
          OptionConverters.toScala(implicitRules),
          coordinateSystem,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          variant.stream().collect(new LitSeqJCollector<>()),
          repository.stream().collect(new LitSeqJCollector<>()),
          quality.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(referenceSeq),
          structureVariant.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
