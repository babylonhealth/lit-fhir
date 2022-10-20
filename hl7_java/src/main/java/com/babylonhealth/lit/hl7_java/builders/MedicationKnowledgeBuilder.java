package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.MEDICATIONKNOWLEDGE_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface MedicationKnowledgeBuilder extends DomainResourceBuilder {
  public MedicationKnowledge build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements MedicationKnowledgeBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Optional<MEDICATIONKNOWLEDGE_STATUS> status = Optional.empty();
    private Optional<Quantity> amount = Optional.empty();
    private Collection<String> synonym = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<CodeableConcept> doseForm = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<CodeableConcept> productType = Collections.emptyList();
    private Optional<Reference> manufacturer = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<CodeableConcept> intendedRoute = Collections.emptyList();
    private Collection<Reference> contraindication = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Reference> associatedMedication = Collections.emptyList();
    private Optional<String> preparationInstruction = Optional.empty();
    private Collection<MedicationKnowledge.Cost> cost = Collections.emptyList();
    private Collection<MedicationKnowledge.Kinetics> kinetics = Collections.emptyList();
    private Collection<MedicationKnowledge.Monograph> monograph = Collections.emptyList();
    private Optional<MedicationKnowledge.Packaging> packaging = Optional.empty();
    private Collection<MedicationKnowledge.Ingredient> ingredient = Collections.emptyList();
    private Collection<MedicationKnowledge.MonitoringProgram> monitoringProgram =
        Collections.emptyList();
    private Collection<MedicationKnowledge.DrugCharacteristic> drugCharacteristic =
        Collections.emptyList();
    private Collection<MedicationKnowledge.MedicineClassification> medicineClassification =
        Collections.emptyList();
    private Collection<MedicationKnowledge.Regulatory> regulatory = Collections.emptyList();
    private Collection<MedicationKnowledge.RelatedMedicationKnowledge> relatedMedicationKnowledge =
        Collections.emptyList();
    private Collection<MedicationKnowledge.AdministrationGuidelines> administrationGuidelines =
        Collections.emptyList();

    /** Required fields for {@link MedicationKnowledge} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicationKnowledgeBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public MedicationKnowledgeBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public MedicationKnowledgeBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param code - A code that specifies this medication, or a textual description if no code is
     *     available. Usage note: This could be a standard medication code such as a code from
     *     RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code,
     *     optionally with translations to other code systems.
     */
    public MedicationKnowledgeBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /**
     * @param status - A code to indicate if the medication is in active use. The status refers to
     *     the validity about the information of the medication and not to its medicinal properties.
     */
    public MedicationKnowledgeBuilder.Impl withStatus(@NonNull MEDICATIONKNOWLEDGE_STATUS status) {
      this.status = Optional.of(status);
      return this;
    }
    /**
     * @param amount - Specific amount of the drug in the packaged product. For example, when
     *     specifying a product that has the same strength (For example, Insulin glargine 100 unit
     *     per mL solution for injection), this attribute provides additional clarification of the
     *     package amount (For example, 3 mL, 10mL, etc.).
     */
    public MedicationKnowledgeBuilder.Impl withAmount(@NonNull Quantity amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withAmount(@NonNull QuantityBuilder amount) {
      this.amount = Optional.of(amount.build());
      return this;
    }
    /**
     * @param synonym - Additional names for a medication, for example, the name(s) given to a
     *     medication in different countries. For example, acetaminophen and paracetamol or
     *     salbutamol and albuterol.
     */
    public MedicationKnowledgeBuilder.Impl withSynonym(@NonNull String... synonym) {
      this.synonym = Arrays.asList(synonym);
      return this;
    }
    /**
     * @param synonym - Additional names for a medication, for example, the name(s) given to a
     *     medication in different countries. For example, acetaminophen and paracetamol or
     *     salbutamol and albuterol.
     */
    public MedicationKnowledgeBuilder.Impl withSynonym(@NonNull Collection<String> synonym) {
      this.synonym = Collections.unmodifiableCollection(synonym);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public MedicationKnowledgeBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param doseForm - Describes the form of the item. Powder; tablets; capsule. */
    public MedicationKnowledgeBuilder.Impl withDoseForm(@NonNull CodeableConcept doseForm) {
      this.doseForm = Optional.of(doseForm);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withDoseForm(@NonNull CodeableConceptBuilder doseForm) {
      this.doseForm = Optional.of(doseForm.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MedicationKnowledgeBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MedicationKnowledgeBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public MedicationKnowledgeBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MedicationKnowledgeBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param productType - Category of the medication or product (e.g. branded product, therapeutic
     *     moeity, generic product, innovator product, etc.).
     */
    public MedicationKnowledgeBuilder.Impl withProductType(
        @NonNull CodeableConcept... productType) {
      this.productType = Arrays.asList(productType);
      return this;
    }
    /**
     * @param productType - Category of the medication or product (e.g. branded product, therapeutic
     *     moeity, generic product, innovator product, etc.).
     */
    public MedicationKnowledgeBuilder.Impl withProductType(
        @NonNull Collection<CodeableConcept> productType) {
      this.productType = Collections.unmodifiableCollection(productType);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withProductType(
        @NonNull CodeableConceptBuilder... productType) {
      this.productType = Arrays.stream(productType).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param manufacturer - Describes the details of the manufacturer of the medication product.
     *     This is not intended to represent the distributor of a medication product.
     */
    public MedicationKnowledgeBuilder.Impl withManufacturer(@NonNull Reference manufacturer) {
      this.manufacturer = Optional.of(manufacturer);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withManufacturer(
        @NonNull ReferenceBuilder manufacturer) {
      this.manufacturer = Optional.of(manufacturer.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public MedicationKnowledgeBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param intendedRoute - The intended or approved route of administration. */
    public MedicationKnowledgeBuilder.Impl withIntendedRoute(
        @NonNull CodeableConcept... intendedRoute) {
      this.intendedRoute = Arrays.asList(intendedRoute);
      return this;
    }
    /** @param intendedRoute - The intended or approved route of administration. */
    public MedicationKnowledgeBuilder.Impl withIntendedRoute(
        @NonNull Collection<CodeableConcept> intendedRoute) {
      this.intendedRoute = Collections.unmodifiableCollection(intendedRoute);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withIntendedRoute(
        @NonNull CodeableConceptBuilder... intendedRoute) {
      this.intendedRoute = Arrays.stream(intendedRoute).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contraindication - Potential clinical issue with or between medication(s) (for
     *     example, drug-drug interaction, drug-disease contraindication, drug-allergy interaction,
     *     etc.).
     */
    public MedicationKnowledgeBuilder.Impl withContraindication(
        @NonNull Reference... contraindication) {
      this.contraindication = Arrays.asList(contraindication);
      return this;
    }
    /**
     * @param contraindication - Potential clinical issue with or between medication(s) (for
     *     example, drug-drug interaction, drug-disease contraindication, drug-allergy interaction,
     *     etc.).
     */
    public MedicationKnowledgeBuilder.Impl withContraindication(
        @NonNull Collection<Reference> contraindication) {
      this.contraindication = Collections.unmodifiableCollection(contraindication);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withContraindication(
        @NonNull ReferenceBuilder... contraindication) {
      this.contraindication = Arrays.stream(contraindication).map(e -> e.build()).collect(toList());
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
    public MedicationKnowledgeBuilder.Impl withModifierExtension(
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
    public MedicationKnowledgeBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param associatedMedication - Associated or related medications. For example, if the
     *     medication is a branded product (e.g. Crestor), this is the Therapeutic Moeity (e.g.
     *     Rosuvastatin) or if this is a generic medication (e.g. Rosuvastatin), this would link to
     *     a branded product (e.g. Crestor).
     */
    public MedicationKnowledgeBuilder.Impl withAssociatedMedication(
        @NonNull Reference... associatedMedication) {
      this.associatedMedication = Arrays.asList(associatedMedication);
      return this;
    }
    /**
     * @param associatedMedication - Associated or related medications. For example, if the
     *     medication is a branded product (e.g. Crestor), this is the Therapeutic Moeity (e.g.
     *     Rosuvastatin) or if this is a generic medication (e.g. Rosuvastatin), this would link to
     *     a branded product (e.g. Crestor).
     */
    public MedicationKnowledgeBuilder.Impl withAssociatedMedication(
        @NonNull Collection<Reference> associatedMedication) {
      this.associatedMedication = Collections.unmodifiableCollection(associatedMedication);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withAssociatedMedication(
        @NonNull ReferenceBuilder... associatedMedication) {
      this.associatedMedication =
          Arrays.stream(associatedMedication).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param preparationInstruction - The instructions for preparing the medication. */
    public MedicationKnowledgeBuilder.Impl withPreparationInstruction(
        @NonNull String preparationInstruction) {
      this.preparationInstruction = Optional.of(preparationInstruction);
      return this;
    }
    /** @param cost - The price of the medication. */
    public MedicationKnowledgeBuilder.Impl withCost(@NonNull MedicationKnowledge.Cost... cost) {
      this.cost = Arrays.asList(cost);
      return this;
    }
    /** @param cost - The price of the medication. */
    public MedicationKnowledgeBuilder.Impl withCost(
        @NonNull Collection<MedicationKnowledge.Cost> cost) {
      this.cost = Collections.unmodifiableCollection(cost);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withCost(
        @NonNull MedicationKnowledge_CostBuilder... cost) {
      this.cost = Arrays.stream(cost).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param kinetics - The time course of drug absorption, distribution, metabolism and excretion
     *     of a medication from the body.
     */
    public MedicationKnowledgeBuilder.Impl withKinetics(
        @NonNull MedicationKnowledge.Kinetics... kinetics) {
      this.kinetics = Arrays.asList(kinetics);
      return this;
    }
    /**
     * @param kinetics - The time course of drug absorption, distribution, metabolism and excretion
     *     of a medication from the body.
     */
    public MedicationKnowledgeBuilder.Impl withKinetics(
        @NonNull Collection<MedicationKnowledge.Kinetics> kinetics) {
      this.kinetics = Collections.unmodifiableCollection(kinetics);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withKinetics(
        @NonNull MedicationKnowledge_KineticsBuilder... kinetics) {
      this.kinetics = Arrays.stream(kinetics).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param monograph - Associated documentation about the medication. */
    public MedicationKnowledgeBuilder.Impl withMonograph(
        @NonNull MedicationKnowledge.Monograph... monograph) {
      this.monograph = Arrays.asList(monograph);
      return this;
    }
    /** @param monograph - Associated documentation about the medication. */
    public MedicationKnowledgeBuilder.Impl withMonograph(
        @NonNull Collection<MedicationKnowledge.Monograph> monograph) {
      this.monograph = Collections.unmodifiableCollection(monograph);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withMonograph(
        @NonNull MedicationKnowledge_MonographBuilder... monograph) {
      this.monograph = Arrays.stream(monograph).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param packaging - Information that only applies to packages (not products). */
    public MedicationKnowledgeBuilder.Impl withPackaging(
        @NonNull MedicationKnowledge.Packaging packaging) {
      this.packaging = Optional.of(packaging);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withPackaging(
        @NonNull MedicationKnowledge_PackagingBuilder packaging) {
      this.packaging = Optional.of(packaging.build());
      return this;
    }
    /** @param ingredient - Identifies a particular constituent of interest in the product. */
    public MedicationKnowledgeBuilder.Impl withIngredient(
        @NonNull MedicationKnowledge.Ingredient... ingredient) {
      this.ingredient = Arrays.asList(ingredient);
      return this;
    }
    /** @param ingredient - Identifies a particular constituent of interest in the product. */
    public MedicationKnowledgeBuilder.Impl withIngredient(
        @NonNull Collection<MedicationKnowledge.Ingredient> ingredient) {
      this.ingredient = Collections.unmodifiableCollection(ingredient);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withIngredient(
        @NonNull MedicationKnowledge_IngredientBuilder... ingredient) {
      this.ingredient = Arrays.stream(ingredient).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param monitoringProgram - The program under which the medication is reviewed. */
    public MedicationKnowledgeBuilder.Impl withMonitoringProgram(
        @NonNull MedicationKnowledge.MonitoringProgram... monitoringProgram) {
      this.monitoringProgram = Arrays.asList(monitoringProgram);
      return this;
    }
    /** @param monitoringProgram - The program under which the medication is reviewed. */
    public MedicationKnowledgeBuilder.Impl withMonitoringProgram(
        @NonNull Collection<MedicationKnowledge.MonitoringProgram> monitoringProgram) {
      this.monitoringProgram = Collections.unmodifiableCollection(monitoringProgram);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withMonitoringProgram(
        @NonNull MedicationKnowledge_MonitoringProgramBuilder... monitoringProgram) {
      this.monitoringProgram =
          Arrays.stream(monitoringProgram).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param drugCharacteristic - Specifies descriptive properties of the medicine, such as color,
     *     shape, imprints, etc.
     */
    public MedicationKnowledgeBuilder.Impl withDrugCharacteristic(
        @NonNull MedicationKnowledge.DrugCharacteristic... drugCharacteristic) {
      this.drugCharacteristic = Arrays.asList(drugCharacteristic);
      return this;
    }
    /**
     * @param drugCharacteristic - Specifies descriptive properties of the medicine, such as color,
     *     shape, imprints, etc.
     */
    public MedicationKnowledgeBuilder.Impl withDrugCharacteristic(
        @NonNull Collection<MedicationKnowledge.DrugCharacteristic> drugCharacteristic) {
      this.drugCharacteristic = Collections.unmodifiableCollection(drugCharacteristic);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withDrugCharacteristic(
        @NonNull MedicationKnowledge_DrugCharacteristicBuilder... drugCharacteristic) {
      this.drugCharacteristic =
          Arrays.stream(drugCharacteristic).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param medicineClassification - Categorization of the medication within a formulary or
     *     classification system.
     */
    public MedicationKnowledgeBuilder.Impl withMedicineClassification(
        @NonNull MedicationKnowledge.MedicineClassification... medicineClassification) {
      this.medicineClassification = Arrays.asList(medicineClassification);
      return this;
    }
    /**
     * @param medicineClassification - Categorization of the medication within a formulary or
     *     classification system.
     */
    public MedicationKnowledgeBuilder.Impl withMedicineClassification(
        @NonNull Collection<MedicationKnowledge.MedicineClassification> medicineClassification) {
      this.medicineClassification = Collections.unmodifiableCollection(medicineClassification);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withMedicineClassification(
        @NonNull MedicationKnowledge_MedicineClassificationBuilder... medicineClassification) {
      this.medicineClassification =
          Arrays.stream(medicineClassification).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param regulatory - Regulatory information about a medication. */
    public MedicationKnowledgeBuilder.Impl withRegulatory(
        @NonNull MedicationKnowledge.Regulatory... regulatory) {
      this.regulatory = Arrays.asList(regulatory);
      return this;
    }
    /** @param regulatory - Regulatory information about a medication. */
    public MedicationKnowledgeBuilder.Impl withRegulatory(
        @NonNull Collection<MedicationKnowledge.Regulatory> regulatory) {
      this.regulatory = Collections.unmodifiableCollection(regulatory);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withRegulatory(
        @NonNull MedicationKnowledge_RegulatoryBuilder... regulatory) {
      this.regulatory = Arrays.stream(regulatory).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param relatedMedicationKnowledge - Associated or related knowledge about a medication. */
    public MedicationKnowledgeBuilder.Impl withRelatedMedicationKnowledge(
        @NonNull MedicationKnowledge.RelatedMedicationKnowledge... relatedMedicationKnowledge) {
      this.relatedMedicationKnowledge = Arrays.asList(relatedMedicationKnowledge);
      return this;
    }
    /** @param relatedMedicationKnowledge - Associated or related knowledge about a medication. */
    public MedicationKnowledgeBuilder.Impl withRelatedMedicationKnowledge(
        @NonNull
            Collection<MedicationKnowledge.RelatedMedicationKnowledge> relatedMedicationKnowledge) {
      this.relatedMedicationKnowledge =
          Collections.unmodifiableCollection(relatedMedicationKnowledge);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withRelatedMedicationKnowledge(
        @NonNull
            MedicationKnowledge_RelatedMedicationKnowledgeBuilder... relatedMedicationKnowledge) {
      this.relatedMedicationKnowledge =
          Arrays.stream(relatedMedicationKnowledge).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param administrationGuidelines - Guidelines for the administration of the medication. */
    public MedicationKnowledgeBuilder.Impl withAdministrationGuidelines(
        @NonNull MedicationKnowledge.AdministrationGuidelines... administrationGuidelines) {
      this.administrationGuidelines = Arrays.asList(administrationGuidelines);
      return this;
    }
    /** @param administrationGuidelines - Guidelines for the administration of the medication. */
    public MedicationKnowledgeBuilder.Impl withAdministrationGuidelines(
        @NonNull
            Collection<MedicationKnowledge.AdministrationGuidelines> administrationGuidelines) {
      this.administrationGuidelines = Collections.unmodifiableCollection(administrationGuidelines);
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withAdministrationGuidelines(
        @NonNull MedicationKnowledge_AdministrationGuidelinesBuilder... administrationGuidelines) {
      this.administrationGuidelines =
          Arrays.stream(administrationGuidelines).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicationKnowledgeBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public MedicationKnowledge build() {
      return new MedicationKnowledge(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(code),
          OptionConverters.toScala(status),
          OptionConverters.toScala(amount),
          synonym.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          OptionConverters.toScala(doseForm),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          productType.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(manufacturer),
          OptionConverters.toScala(implicitRules),
          intendedRoute.stream().collect(new LitSeqJCollector<>()),
          contraindication.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          associatedMedication.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(preparationInstruction),
          cost.stream().collect(new LitSeqJCollector<>()),
          kinetics.stream().collect(new LitSeqJCollector<>()),
          monograph.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(packaging),
          ingredient.stream().collect(new LitSeqJCollector<>()),
          monitoringProgram.stream().collect(new LitSeqJCollector<>()),
          drugCharacteristic.stream().collect(new LitSeqJCollector<>()),
          medicineClassification.stream().collect(new LitSeqJCollector<>()),
          regulatory.stream().collect(new LitSeqJCollector<>()),
          relatedMedicationKnowledge.stream().collect(new LitSeqJCollector<>()),
          administrationGuidelines.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
