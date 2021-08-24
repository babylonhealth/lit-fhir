package com.babylonhealth.lit.usbase_java.builders;

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
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface MedicinalProductBuilder extends DomainResourceBuilder {
  public MedicinalProduct build();

  public static Impl init(Collection<MedicinalProduct.Name> name) {
    return new Impl(name);
  }

  public static Impl builder(Collection<MedicinalProduct_NameBuilder> name) {
    return new Impl(new LitSeq<>(name).map(MedicinalProduct_NameBuilder::build));
  }

  public class Impl implements MedicinalProductBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<Coding> domain = Optional.empty();
    private Collection<Reference> contact = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<Reference> masterFile = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Reference> clinicalTrial = Collections.emptyList();
    private Collection<Identifier> crossReference = Collections.emptyList();
    private Collection<String> specialMeasures = Collections.emptyList();
    private Collection<Choice> marketingStatus = Collections.emptyList();
    private Collection<Reference> attachedDocument = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> legalStatusOfSupply = Optional.empty();
    private Collection<CodeableConcept> productClassification = Collections.emptyList();
    private Collection<Reference> pharmaceuticalProduct = Collections.emptyList();
    private Optional<CodeableConcept> paediatricUseIndicator = Optional.empty();
    private Collection<Reference> packagedMedicinalProduct = Collections.emptyList();
    private Optional<CodeableConcept> additionalMonitoringIndicator = Optional.empty();
    private Optional<CodeableConcept> combinedPharmaceuticalDoseForm = Optional.empty();
    private Collection<MedicinalProduct.SpecialDesignation> specialDesignation =
        Collections.emptyList();
    private Collection<MedicinalProduct.Name> name;
    private Collection<MedicinalProduct.ManufacturingBusinessOperation>
        manufacturingBusinessOperation = Collections.emptyList();

    /**
     * Required fields for {@link MedicinalProduct}
     *
     * @param name - The product's name, including full name and possibly coded parts.
     */
    public Impl(Collection<MedicinalProduct.Name> name) {
      this.name = name;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicinalProductBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public MedicinalProductBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public MedicinalProductBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public MedicinalProductBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public MedicinalProductBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param _type - Regulatory type, e.g. Investigational or Authorized. */
    public MedicinalProductBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public MedicinalProductBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param domain - If this medicine applies to human or veterinary uses. */
    public MedicinalProductBuilder.Impl withDomain(@NonNull Coding domain) {
      this.domain = Optional.of(domain);
      return this;
    }

    public MedicinalProductBuilder.Impl withDomain(@NonNull CodingBuilder domain) {
      this.domain = Optional.of(domain.build());
      return this;
    }
    /** @param contact - A product specific contact, person (in a role), or an organization. */
    public MedicinalProductBuilder.Impl withContact(@NonNull Reference... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /** @param contact - A product specific contact, person (in a role), or an organization. */
    public MedicinalProductBuilder.Impl withContact(@NonNull Collection<Reference> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public MedicinalProductBuilder.Impl withContact(@NonNull ReferenceBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public MedicinalProductBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MedicinalProductBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MedicinalProductBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public MedicinalProductBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public MedicinalProductBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MedicinalProductBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicinalProductBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - Business identifier for this product. Could be an MPID. */
    public MedicinalProductBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - Business identifier for this product. Could be an MPID. */
    public MedicinalProductBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public MedicinalProductBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param masterFile - A master file for to the medicinal product (e.g. Pharmacovigilance System
     *     Master File).
     */
    public MedicinalProductBuilder.Impl withMasterFile(@NonNull Reference... masterFile) {
      this.masterFile = Arrays.asList(masterFile);
      return this;
    }
    /**
     * @param masterFile - A master file for to the medicinal product (e.g. Pharmacovigilance System
     *     Master File).
     */
    public MedicinalProductBuilder.Impl withMasterFile(@NonNull Collection<Reference> masterFile) {
      this.masterFile = Collections.unmodifiableCollection(masterFile);
      return this;
    }

    public MedicinalProductBuilder.Impl withMasterFile(@NonNull ReferenceBuilder... masterFile) {
      this.masterFile = Arrays.stream(masterFile).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public MedicinalProductBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param clinicalTrial - Clinical trials or studies that this product is involved in. */
    public MedicinalProductBuilder.Impl withClinicalTrial(@NonNull Reference... clinicalTrial) {
      this.clinicalTrial = Arrays.asList(clinicalTrial);
      return this;
    }
    /** @param clinicalTrial - Clinical trials or studies that this product is involved in. */
    public MedicinalProductBuilder.Impl withClinicalTrial(
        @NonNull Collection<Reference> clinicalTrial) {
      this.clinicalTrial = Collections.unmodifiableCollection(clinicalTrial);
      return this;
    }

    public MedicinalProductBuilder.Impl withClinicalTrial(
        @NonNull ReferenceBuilder... clinicalTrial) {
      this.clinicalTrial = Arrays.stream(clinicalTrial).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param crossReference - Reference to another product, e.g. for linking authorised to
     *     investigational product.
     */
    public MedicinalProductBuilder.Impl withCrossReference(@NonNull Identifier... crossReference) {
      this.crossReference = Arrays.asList(crossReference);
      return this;
    }
    /**
     * @param crossReference - Reference to another product, e.g. for linking authorised to
     *     investigational product.
     */
    public MedicinalProductBuilder.Impl withCrossReference(
        @NonNull Collection<Identifier> crossReference) {
      this.crossReference = Collections.unmodifiableCollection(crossReference);
      return this;
    }

    public MedicinalProductBuilder.Impl withCrossReference(
        @NonNull IdentifierBuilder... crossReference) {
      this.crossReference = Arrays.stream(crossReference).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param specialMeasures - Whether the Medicinal Product is subject to special measures for
     *     regulatory reasons.
     */
    public MedicinalProductBuilder.Impl withSpecialMeasures(@NonNull String... specialMeasures) {
      this.specialMeasures = Arrays.asList(specialMeasures);
      return this;
    }
    /**
     * @param specialMeasures - Whether the Medicinal Product is subject to special measures for
     *     regulatory reasons.
     */
    public MedicinalProductBuilder.Impl withSpecialMeasures(
        @NonNull Collection<String> specialMeasures) {
      this.specialMeasures = Collections.unmodifiableCollection(specialMeasures);
      return this;
    }
    /**
     * @param marketingStatus - Marketing status of the medicinal product, in contrast to marketing
     *     authorizaton.
     */
    public MedicinalProductBuilder.Impl withMarketingStatus(@NonNull Choice... marketingStatus) {
      this.marketingStatus = Arrays.asList(marketingStatus);
      return this;
    }
    /**
     * @param marketingStatus - Marketing status of the medicinal product, in contrast to marketing
     *     authorizaton.
     */
    public MedicinalProductBuilder.Impl withMarketingStatus(
        @NonNull Collection<Choice> marketingStatus) {
      this.marketingStatus = Collections.unmodifiableCollection(marketingStatus);
      return this;
    }
    /** @param attachedDocument - Supporting documentation, typically for regulatory submission. */
    public MedicinalProductBuilder.Impl withAttachedDocument(
        @NonNull Reference... attachedDocument) {
      this.attachedDocument = Arrays.asList(attachedDocument);
      return this;
    }
    /** @param attachedDocument - Supporting documentation, typically for regulatory submission. */
    public MedicinalProductBuilder.Impl withAttachedDocument(
        @NonNull Collection<Reference> attachedDocument) {
      this.attachedDocument = Collections.unmodifiableCollection(attachedDocument);
      return this;
    }

    public MedicinalProductBuilder.Impl withAttachedDocument(
        @NonNull ReferenceBuilder... attachedDocument) {
      this.attachedDocument = Arrays.stream(attachedDocument).map(e -> e.build()).collect(toList());
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
    public MedicinalProductBuilder.Impl withModifierExtension(
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
    public MedicinalProductBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicinalProductBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param legalStatusOfSupply - The legal status of supply of the medicinal product as
     *     classified by the regulator.
     */
    public MedicinalProductBuilder.Impl withLegalStatusOfSupply(
        @NonNull CodeableConcept legalStatusOfSupply) {
      this.legalStatusOfSupply = Optional.of(legalStatusOfSupply);
      return this;
    }

    public MedicinalProductBuilder.Impl withLegalStatusOfSupply(
        @NonNull CodeableConceptBuilder legalStatusOfSupply) {
      this.legalStatusOfSupply = Optional.of(legalStatusOfSupply.build());
      return this;
    }
    /** @param productClassification - Allows the product to be classified by various systems. */
    public MedicinalProductBuilder.Impl withProductClassification(
        @NonNull CodeableConcept... productClassification) {
      this.productClassification = Arrays.asList(productClassification);
      return this;
    }
    /** @param productClassification - Allows the product to be classified by various systems. */
    public MedicinalProductBuilder.Impl withProductClassification(
        @NonNull Collection<CodeableConcept> productClassification) {
      this.productClassification = Collections.unmodifiableCollection(productClassification);
      return this;
    }

    public MedicinalProductBuilder.Impl withProductClassification(
        @NonNull CodeableConceptBuilder... productClassification) {
      this.productClassification =
          Arrays.stream(productClassification).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param pharmaceuticalProduct - Pharmaceutical aspects of product. */
    public MedicinalProductBuilder.Impl withPharmaceuticalProduct(
        @NonNull Reference... pharmaceuticalProduct) {
      this.pharmaceuticalProduct = Arrays.asList(pharmaceuticalProduct);
      return this;
    }
    /** @param pharmaceuticalProduct - Pharmaceutical aspects of product. */
    public MedicinalProductBuilder.Impl withPharmaceuticalProduct(
        @NonNull Collection<Reference> pharmaceuticalProduct) {
      this.pharmaceuticalProduct = Collections.unmodifiableCollection(pharmaceuticalProduct);
      return this;
    }

    public MedicinalProductBuilder.Impl withPharmaceuticalProduct(
        @NonNull ReferenceBuilder... pharmaceuticalProduct) {
      this.pharmaceuticalProduct =
          Arrays.stream(pharmaceuticalProduct).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param paediatricUseIndicator - If authorised for use in children. */
    public MedicinalProductBuilder.Impl withPaediatricUseIndicator(
        @NonNull CodeableConcept paediatricUseIndicator) {
      this.paediatricUseIndicator = Optional.of(paediatricUseIndicator);
      return this;
    }

    public MedicinalProductBuilder.Impl withPaediatricUseIndicator(
        @NonNull CodeableConceptBuilder paediatricUseIndicator) {
      this.paediatricUseIndicator = Optional.of(paediatricUseIndicator.build());
      return this;
    }
    /** @param packagedMedicinalProduct - Package representation for the product. */
    public MedicinalProductBuilder.Impl withPackagedMedicinalProduct(
        @NonNull Reference... packagedMedicinalProduct) {
      this.packagedMedicinalProduct = Arrays.asList(packagedMedicinalProduct);
      return this;
    }
    /** @param packagedMedicinalProduct - Package representation for the product. */
    public MedicinalProductBuilder.Impl withPackagedMedicinalProduct(
        @NonNull Collection<Reference> packagedMedicinalProduct) {
      this.packagedMedicinalProduct = Collections.unmodifiableCollection(packagedMedicinalProduct);
      return this;
    }

    public MedicinalProductBuilder.Impl withPackagedMedicinalProduct(
        @NonNull ReferenceBuilder... packagedMedicinalProduct) {
      this.packagedMedicinalProduct =
          Arrays.stream(packagedMedicinalProduct).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param additionalMonitoringIndicator - Whether the Medicinal Product is subject to additional
     *     monitoring for regulatory reasons.
     */
    public MedicinalProductBuilder.Impl withAdditionalMonitoringIndicator(
        @NonNull CodeableConcept additionalMonitoringIndicator) {
      this.additionalMonitoringIndicator = Optional.of(additionalMonitoringIndicator);
      return this;
    }

    public MedicinalProductBuilder.Impl withAdditionalMonitoringIndicator(
        @NonNull CodeableConceptBuilder additionalMonitoringIndicator) {
      this.additionalMonitoringIndicator = Optional.of(additionalMonitoringIndicator.build());
      return this;
    }
    /**
     * @param combinedPharmaceuticalDoseForm - The dose form for a single part product, or combined
     *     form of a multiple part product.
     */
    public MedicinalProductBuilder.Impl withCombinedPharmaceuticalDoseForm(
        @NonNull CodeableConcept combinedPharmaceuticalDoseForm) {
      this.combinedPharmaceuticalDoseForm = Optional.of(combinedPharmaceuticalDoseForm);
      return this;
    }

    public MedicinalProductBuilder.Impl withCombinedPharmaceuticalDoseForm(
        @NonNull CodeableConceptBuilder combinedPharmaceuticalDoseForm) {
      this.combinedPharmaceuticalDoseForm = Optional.of(combinedPharmaceuticalDoseForm.build());
      return this;
    }
    /**
     * @param specialDesignation - Indicates if the medicinal product has an orphan designation for
     *     the treatment of a rare disease.
     */
    public MedicinalProductBuilder.Impl withSpecialDesignation(
        @NonNull MedicinalProduct.SpecialDesignation... specialDesignation) {
      this.specialDesignation = Arrays.asList(specialDesignation);
      return this;
    }
    /**
     * @param specialDesignation - Indicates if the medicinal product has an orphan designation for
     *     the treatment of a rare disease.
     */
    public MedicinalProductBuilder.Impl withSpecialDesignation(
        @NonNull Collection<MedicinalProduct.SpecialDesignation> specialDesignation) {
      this.specialDesignation = Collections.unmodifiableCollection(specialDesignation);
      return this;
    }

    public MedicinalProductBuilder.Impl withSpecialDesignation(
        @NonNull MedicinalProduct_SpecialDesignationBuilder... specialDesignation) {
      this.specialDesignation =
          Arrays.stream(specialDesignation).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param manufacturingBusinessOperation - An operation applied to the product, for
     *     manufacturing or adminsitrative purpose.
     */
    public MedicinalProductBuilder.Impl withManufacturingBusinessOperation(
        @NonNull
            MedicinalProduct.ManufacturingBusinessOperation... manufacturingBusinessOperation) {
      this.manufacturingBusinessOperation = Arrays.asList(manufacturingBusinessOperation);
      return this;
    }
    /**
     * @param manufacturingBusinessOperation - An operation applied to the product, for
     *     manufacturing or adminsitrative purpose.
     */
    public MedicinalProductBuilder.Impl withManufacturingBusinessOperation(
        @NonNull
            Collection<MedicinalProduct.ManufacturingBusinessOperation>
                manufacturingBusinessOperation) {
      this.manufacturingBusinessOperation =
          Collections.unmodifiableCollection(manufacturingBusinessOperation);
      return this;
    }

    public MedicinalProductBuilder.Impl withManufacturingBusinessOperation(
        @NonNull
            MedicinalProduct_ManufacturingBusinessOperationBuilder...
                manufacturingBusinessOperation) {
      this.manufacturingBusinessOperation =
          Arrays.stream(manufacturingBusinessOperation).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicinalProductBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public MedicinalProduct build() {
      return new MedicinalProduct(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(domain),
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          masterFile.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          clinicalTrial.stream().collect(new LitSeqJCollector<>()),
          crossReference.stream().collect(new LitSeqJCollector<>()),
          specialMeasures.stream().collect(new LitSeqJCollector<>()),
          (LitSeq) marketingStatus.stream().collect(new LitSeqJCollector<>()),
          attachedDocument.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(legalStatusOfSupply),
          productClassification.stream().collect(new LitSeqJCollector<>()),
          pharmaceuticalProduct.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(paediatricUseIndicator),
          packagedMedicinalProduct.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(additionalMonitoringIndicator),
          OptionConverters.toScala(combinedPharmaceuticalDoseForm),
          specialDesignation.stream().collect(new LitSeqJCollector<>()),
          name.stream().collect(new NonEmptyLitSeqJCollector<>()),
          manufacturingBusinessOperation.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
