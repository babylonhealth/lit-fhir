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
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface CatalogEntryBuilder extends DomainResourceBuilder {
  public CatalogEntry build();

  public static Impl init(Boolean orderable, Reference referencedItem) {
    return new Impl(orderable, referencedItem);
  }

  public static Impl builder(Boolean orderable, ReferenceBuilder referencedItem) {
    return new Impl(orderable, referencedItem.build());
  }

  public class Impl implements CatalogEntryBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<PUBLICATION_STATUS> status = Optional.empty();
    private Optional<FHIRDateTime> validTo = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Boolean orderable;
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<FHIRDateTime> lastUpdated = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Reference referencedItem;
    private Collection<CodeableConcept> classification = Collections.emptyList();
    private Optional<Period> validityPeriod = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Identifier> additionalIdentifier = Collections.emptyList();
    private Collection<CodeableConcept> additionalCharacteristic = Collections.emptyList();
    private Collection<CodeableConcept> additionalClassification = Collections.emptyList();
    private Collection<CatalogEntry.RelatedEntry> relatedEntry = Collections.emptyList();

    /**
     * Required fields for {@link CatalogEntry}
     *
     * @param orderable - Whether the entry represents an orderable item.
     * @param referencedItem - The item in a catalog or definition.
     */
    public Impl(Boolean orderable, Reference referencedItem) {
      this.orderable = orderable;
      this.referencedItem = referencedItem;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CatalogEntryBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public CatalogEntryBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public CatalogEntryBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public CatalogEntryBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public CatalogEntryBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param _type - The type of item - medication, device, service, protocol or other. */
    public CatalogEntryBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public CatalogEntryBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /**
     * @param status - Used to support catalog exchange even for unsupported products, e.g. getting
     *     list of medications even if not prescribable.
     */
    public CatalogEntryBuilder.Impl withStatus(@NonNull PUBLICATION_STATUS status) {
      this.status = Optional.of(status);
      return this;
    }
    /** @param validTo - The date until which this catalog entry is expected to be active. */
    public CatalogEntryBuilder.Impl withValidTo(@NonNull FHIRDateTime validTo) {
      this.validTo = Optional.of(validTo);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public CatalogEntryBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public CatalogEntryBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public CatalogEntryBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public CatalogEntryBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public CatalogEntryBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public CatalogEntryBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CatalogEntryBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Used in supporting different identifiers for the same product, e.g.
     *     manufacturer code and retailer code.
     */
    public CatalogEntryBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Used in supporting different identifiers for the same product, e.g.
     *     manufacturer code and retailer code.
     */
    public CatalogEntryBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public CatalogEntryBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param lastUpdated - Typically date of issue is different from the beginning of the validity.
     *     This can be used to see when an item was last updated.
     */
    public CatalogEntryBuilder.Impl withLastUpdated(@NonNull FHIRDateTime lastUpdated) {
      this.lastUpdated = Optional.of(lastUpdated);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public CatalogEntryBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param classification - Classes of devices, or ATC for medication. */
    public CatalogEntryBuilder.Impl withClassification(@NonNull CodeableConcept... classification) {
      this.classification = Arrays.asList(classification);
      return this;
    }
    /** @param classification - Classes of devices, or ATC for medication. */
    public CatalogEntryBuilder.Impl withClassification(
        @NonNull Collection<CodeableConcept> classification) {
      this.classification = Collections.unmodifiableCollection(classification);
      return this;
    }

    public CatalogEntryBuilder.Impl withClassification(
        @NonNull CodeableConceptBuilder... classification) {
      this.classification = Arrays.stream(classification).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param validityPeriod - The time period in which this catalog entry is expected to be active.
     */
    public CatalogEntryBuilder.Impl withValidityPeriod(@NonNull Period validityPeriod) {
      this.validityPeriod = Optional.of(validityPeriod);
      return this;
    }

    public CatalogEntryBuilder.Impl withValidityPeriod(@NonNull PeriodBuilder validityPeriod) {
      this.validityPeriod = Optional.of(validityPeriod.build());
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
    public CatalogEntryBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public CatalogEntryBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public CatalogEntryBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param additionalIdentifier - Used in supporting related concepts, e.g. NDC to RxNorm. */
    public CatalogEntryBuilder.Impl withAdditionalIdentifier(
        @NonNull Identifier... additionalIdentifier) {
      this.additionalIdentifier = Arrays.asList(additionalIdentifier);
      return this;
    }
    /** @param additionalIdentifier - Used in supporting related concepts, e.g. NDC to RxNorm. */
    public CatalogEntryBuilder.Impl withAdditionalIdentifier(
        @NonNull Collection<Identifier> additionalIdentifier) {
      this.additionalIdentifier = Collections.unmodifiableCollection(additionalIdentifier);
      return this;
    }

    public CatalogEntryBuilder.Impl withAdditionalIdentifier(
        @NonNull IdentifierBuilder... additionalIdentifier) {
      this.additionalIdentifier =
          Arrays.stream(additionalIdentifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param additionalCharacteristic - Used for examplefor Out of Formulary, or any specifics. */
    public CatalogEntryBuilder.Impl withAdditionalCharacteristic(
        @NonNull CodeableConcept... additionalCharacteristic) {
      this.additionalCharacteristic = Arrays.asList(additionalCharacteristic);
      return this;
    }
    /** @param additionalCharacteristic - Used for examplefor Out of Formulary, or any specifics. */
    public CatalogEntryBuilder.Impl withAdditionalCharacteristic(
        @NonNull Collection<CodeableConcept> additionalCharacteristic) {
      this.additionalCharacteristic = Collections.unmodifiableCollection(additionalCharacteristic);
      return this;
    }

    public CatalogEntryBuilder.Impl withAdditionalCharacteristic(
        @NonNull CodeableConceptBuilder... additionalCharacteristic) {
      this.additionalCharacteristic =
          Arrays.stream(additionalCharacteristic).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param additionalClassification - User for example for ATC classification, or. */
    public CatalogEntryBuilder.Impl withAdditionalClassification(
        @NonNull CodeableConcept... additionalClassification) {
      this.additionalClassification = Arrays.asList(additionalClassification);
      return this;
    }
    /** @param additionalClassification - User for example for ATC classification, or. */
    public CatalogEntryBuilder.Impl withAdditionalClassification(
        @NonNull Collection<CodeableConcept> additionalClassification) {
      this.additionalClassification = Collections.unmodifiableCollection(additionalClassification);
      return this;
    }

    public CatalogEntryBuilder.Impl withAdditionalClassification(
        @NonNull CodeableConceptBuilder... additionalClassification) {
      this.additionalClassification =
          Arrays.stream(additionalClassification).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param relatedEntry - Used for example, to point to a substance, or to a device used to
     *     administer a medication.
     */
    public CatalogEntryBuilder.Impl withRelatedEntry(
        @NonNull CatalogEntry.RelatedEntry... relatedEntry) {
      this.relatedEntry = Arrays.asList(relatedEntry);
      return this;
    }
    /**
     * @param relatedEntry - Used for example, to point to a substance, or to a device used to
     *     administer a medication.
     */
    public CatalogEntryBuilder.Impl withRelatedEntry(
        @NonNull Collection<CatalogEntry.RelatedEntry> relatedEntry) {
      this.relatedEntry = Collections.unmodifiableCollection(relatedEntry);
      return this;
    }

    public CatalogEntryBuilder.Impl withRelatedEntry(
        @NonNull CatalogEntry_RelatedEntryBuilder... relatedEntry) {
      this.relatedEntry = Arrays.stream(relatedEntry).map(e -> e.build()).collect(toList());
      return this;
    }

    public CatalogEntryBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public CatalogEntry build() {
      return new CatalogEntry(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(status),
          OptionConverters.toScala(validTo),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          orderable,
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(lastUpdated),
          OptionConverters.toScala(implicitRules),
          referencedItem,
          classification.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(validityPeriod),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          additionalIdentifier.stream().collect(new LitSeqJCollector<>()),
          additionalCharacteristic.stream().collect(new LitSeqJCollector<>()),
          additionalClassification.stream().collect(new LitSeqJCollector<>()),
          relatedEntry.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
