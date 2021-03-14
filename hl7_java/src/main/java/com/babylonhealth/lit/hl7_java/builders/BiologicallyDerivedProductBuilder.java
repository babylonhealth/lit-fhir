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
import com.babylonhealth.lit.hl7.PRODUCT_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.PRODUCT_CATEGORY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class BiologicallyDerivedProductBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<PRODUCT_STATUS> status = Optional.empty();
  private Collection<Reference> parent = Collections.emptyList();
  private Collection<Reference> request = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<Integer> quantity = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<CodeableConcept> productCode = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<PRODUCT_CATEGORY> productCategory = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<BiologicallyDerivedProduct.Storage> storage = Collections.emptyList();
  private Optional<BiologicallyDerivedProduct.Collection> collection = Optional.empty();
  private Collection<BiologicallyDerivedProduct.Processing> processing = Collections.emptyList();
  private Optional<BiologicallyDerivedProduct.Manipulation> manipulation = Optional.empty();

  /** Required fields for {@link BiologicallyDerivedProduct} */
  public BiologicallyDerivedProductBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public BiologicallyDerivedProductBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public BiologicallyDerivedProductBuilder withMeta(@NonNull Meta meta) {
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
  public BiologicallyDerivedProductBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param status - Whether the product is currently available. */
  public BiologicallyDerivedProductBuilder withStatus(@NonNull PRODUCT_STATUS status) {
    this.status = Optional.of(status);
    return this;
  }
  /** @param parent - Parent product (if any). */
  public BiologicallyDerivedProductBuilder withParent(@NonNull Reference... parent) {
    this.parent = Arrays.asList(parent);
    return this;
  }
  /** @param parent - Parent product (if any). */
  public BiologicallyDerivedProductBuilder withParent(@NonNull Collection<Reference> parent) {
    this.parent = Collections.unmodifiableCollection(parent);
    return this;
  }
  /** @param request - Procedure request to obtain this biologically derived product. */
  public BiologicallyDerivedProductBuilder withRequest(@NonNull Reference... request) {
    this.request = Arrays.asList(request);
    return this;
  }
  /** @param request - Procedure request to obtain this biologically derived product. */
  public BiologicallyDerivedProductBuilder withRequest(@NonNull Collection<Reference> request) {
    this.request = Collections.unmodifiableCollection(request);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public BiologicallyDerivedProductBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /** @param quantity - Number of discrete units within this product. */
  public BiologicallyDerivedProductBuilder withQuantity(@NonNull Integer quantity) {
    this.quantity = Optional.of(quantity);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public BiologicallyDerivedProductBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public BiologicallyDerivedProductBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public BiologicallyDerivedProductBuilder withExtension(@NonNull Extension... extension) {
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
  public BiologicallyDerivedProductBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param identifier - This records identifiers associated with this biologically derived product
   *     instance that are defined by business processes and/or used to refer to it when a direct
   *     URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in
   *     written / printed documentation).
   */
  public BiologicallyDerivedProductBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - This records identifiers associated with this biologically derived product
   *     instance that are defined by business processes and/or used to refer to it when a direct
   *     URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in
   *     written / printed documentation).
   */
  public BiologicallyDerivedProductBuilder withIdentifier(
      @NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param productCode - A code that identifies the kind of this biologically derived product
   *     (SNOMED Ctcode).
   */
  public BiologicallyDerivedProductBuilder withProductCode(@NonNull CodeableConcept productCode) {
    this.productCode = Optional.of(productCode);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public BiologicallyDerivedProductBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /** @param productCategory - Broad category of this product. */
  public BiologicallyDerivedProductBuilder withProductCategory(
      @NonNull PRODUCT_CATEGORY productCategory) {
    this.productCategory = Optional.of(productCategory);
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
  public BiologicallyDerivedProductBuilder withModifierExtension(
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
  public BiologicallyDerivedProductBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param storage - Product storage. */
  public BiologicallyDerivedProductBuilder withStorage(
      @NonNull BiologicallyDerivedProduct.Storage... storage) {
    this.storage = Arrays.asList(storage);
    return this;
  }
  /** @param storage - Product storage. */
  public BiologicallyDerivedProductBuilder withStorage(
      @NonNull Collection<BiologicallyDerivedProduct.Storage> storage) {
    this.storage = Collections.unmodifiableCollection(storage);
    return this;
  }
  /** @param collection - How this product was collected. */
  public BiologicallyDerivedProductBuilder withCollection(
      @NonNull BiologicallyDerivedProduct.Collection collection) {
    this.collection = Optional.of(collection);
    return this;
  }
  /**
   * @param processing - Any processing of the product during collection that does not change the
   *     fundamental nature of the product. For example adding anti-coagulants during the collection
   *     of Peripheral Blood Stem Cells.
   */
  public BiologicallyDerivedProductBuilder withProcessing(
      @NonNull BiologicallyDerivedProduct.Processing... processing) {
    this.processing = Arrays.asList(processing);
    return this;
  }
  /**
   * @param processing - Any processing of the product during collection that does not change the
   *     fundamental nature of the product. For example adding anti-coagulants during the collection
   *     of Peripheral Blood Stem Cells.
   */
  public BiologicallyDerivedProductBuilder withProcessing(
      @NonNull Collection<BiologicallyDerivedProduct.Processing> processing) {
    this.processing = Collections.unmodifiableCollection(processing);
    return this;
  }
  /**
   * @param manipulation - Any manipulation of product post-collection that is intended to alter the
   *     product. For example a buffy-coat enrichment or CD8 reduction of Peripheral Blood Stem
   *     Cells to make it more suitable for infusion.
   */
  public BiologicallyDerivedProductBuilder withManipulation(
      @NonNull BiologicallyDerivedProduct.Manipulation manipulation) {
    this.manipulation = Optional.of(manipulation);
    return this;
  }

  public BiologicallyDerivedProductBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public BiologicallyDerivedProduct build() {
    return new BiologicallyDerivedProduct(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        OptionConverters.toScala(status),
        parent.stream().collect(new LitSeqJCollector<>()),
        request.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(language),
        OptionConverters.toScala(quantity.map(x -> (Object) x)),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(productCode),
        OptionConverters.toScala(implicitRules),
        OptionConverters.toScala(productCategory),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        storage.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(collection),
        processing.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(manipulation),
        LitUtils.emptyMetaElMap());
  }
}