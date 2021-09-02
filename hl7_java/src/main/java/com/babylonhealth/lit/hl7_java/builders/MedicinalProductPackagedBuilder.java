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
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class MedicinalProductPackagedBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Collection<Reference> subject = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private Collection<Reference> manufacturer = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Choice> marketingStatus = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<CodeableConcept> legalStatusOfSupply = Optional.empty();
  private Optional<Reference> marketingAuthorization = Optional.empty();
  private Collection<MedicinalProductPackaged.BatchIdentifier> batchIdentifier =
      Collections.emptyList();
  private Collection<MedicinalProductPackaged.PackageItem> packageItem;

  /**
   * Required fields for {@link MedicinalProductPackaged}
   *
   * @param packageItem - A packaging item, as a contained for medicine, possibly with other
   *     packaging items within.
   */
  public MedicinalProductPackagedBuilder(
      Collection<MedicinalProductPackaged.PackageItem> packageItem) {
    this.packageItem = packageItem;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public MedicinalProductPackagedBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public MedicinalProductPackagedBuilder withMeta(@NonNull Meta meta) {
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
  public MedicinalProductPackagedBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param subject - The product with this is a pack for. */
  public MedicinalProductPackagedBuilder withSubject(@NonNull Reference... subject) {
    this.subject = Arrays.asList(subject);
    return this;
  }
  /** @param subject - The product with this is a pack for. */
  public MedicinalProductPackagedBuilder withSubject(@NonNull Collection<Reference> subject) {
    this.subject = Collections.unmodifiableCollection(subject);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public MedicinalProductPackagedBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public MedicinalProductPackagedBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public MedicinalProductPackagedBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public MedicinalProductPackagedBuilder withExtension(@NonNull Extension... extension) {
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
  public MedicinalProductPackagedBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param identifier - Unique identifier. */
  public MedicinalProductPackagedBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - Unique identifier. */
  public MedicinalProductPackagedBuilder withIdentifier(
      @NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param description - Textual description. */
  public MedicinalProductPackagedBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /** @param manufacturer - Manufacturer of this Package Item. */
  public MedicinalProductPackagedBuilder withManufacturer(@NonNull Reference... manufacturer) {
    this.manufacturer = Arrays.asList(manufacturer);
    return this;
  }
  /** @param manufacturer - Manufacturer of this Package Item. */
  public MedicinalProductPackagedBuilder withManufacturer(
      @NonNull Collection<Reference> manufacturer) {
    this.manufacturer = Collections.unmodifiableCollection(manufacturer);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public MedicinalProductPackagedBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /** @param marketingStatus - Marketing information. */
  public MedicinalProductPackagedBuilder withMarketingStatus(@NonNull Choice... marketingStatus) {
    this.marketingStatus = Arrays.asList(marketingStatus);
    return this;
  }
  /** @param marketingStatus - Marketing information. */
  public MedicinalProductPackagedBuilder withMarketingStatus(
      @NonNull Collection<Choice> marketingStatus) {
    this.marketingStatus = Collections.unmodifiableCollection(marketingStatus);
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
  public MedicinalProductPackagedBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
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
  public MedicinalProductPackagedBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param legalStatusOfSupply - The legal status of supply of the medicinal product as classified
   *     by the regulator.
   */
  public MedicinalProductPackagedBuilder withLegalStatusOfSupply(
      @NonNull CodeableConcept legalStatusOfSupply) {
    this.legalStatusOfSupply = Optional.of(legalStatusOfSupply);
    return this;
  }
  /** @param marketingAuthorization - Manufacturer of this Package Item. */
  public MedicinalProductPackagedBuilder withMarketingAuthorization(
      @NonNull Reference marketingAuthorization) {
    this.marketingAuthorization = Optional.of(marketingAuthorization);
    return this;
  }
  /** @param batchIdentifier - Batch numbering. */
  public MedicinalProductPackagedBuilder withBatchIdentifier(
      @NonNull MedicinalProductPackaged.BatchIdentifier... batchIdentifier) {
    this.batchIdentifier = Arrays.asList(batchIdentifier);
    return this;
  }
  /** @param batchIdentifier - Batch numbering. */
  public MedicinalProductPackagedBuilder withBatchIdentifier(
      @NonNull Collection<MedicinalProductPackaged.BatchIdentifier> batchIdentifier) {
    this.batchIdentifier = Collections.unmodifiableCollection(batchIdentifier);
    return this;
  }

  public MedicinalProductPackagedBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public MedicinalProductPackaged build() {
    return new MedicinalProductPackaged(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(meta),
        (Option) OptionConverters.toScala(text),
        subject.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(language),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(description),
        manufacturer.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(implicitRules),
        (LitSeq) marketingStatus.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(legalStatusOfSupply),
        (Option) OptionConverters.toScala(marketingAuthorization),
        batchIdentifier.stream().collect(new LitSeqJCollector<>()),
        packageItem.stream().collect(new NonEmptyLitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
