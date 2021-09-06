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
import com.babylonhealth.lit.hl7.REQUEST_STATUS;
import com.babylonhealth.lit.hl7.REQUEST_INTENT;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class NutritionOrderBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Collection<Annotation> note = Collections.emptyList();
  private REQUEST_STATUS status;
  private REQUEST_INTENT intent;
  private Reference patient;
  private Optional<Reference> orderer = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private FHIRDateTime dateTime;
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> encounter = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Collection<String> instantiates = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<String> instantiatesUri = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Reference> allergyIntolerance = Collections.emptyList();
  private Collection<CodeableConcept> excludeFoodModifier = Collections.emptyList();
  private Collection<String> instantiatesCanonical = Collections.emptyList();
  private Collection<CodeableConcept> foodPreferenceModifier = Collections.emptyList();
  private Collection<NutritionOrder.Supplement> supplement = Collections.emptyList();
  private Optional<NutritionOrder.OralDiet> oralDiet = Optional.empty();
  private Optional<NutritionOrder.EnteralFormula> enteralFormula = Optional.empty();

  /**
   * Required fields for {@link NutritionOrder}
   *
   * @param status - The workflow status of the nutrition order/request.
   * @param intent - Indicates the level of authority/intentionality associated with the
   *     NutrionOrder and where the request fits into the workflow chain.
   * @param patient - The person (patient) who needs the nutrition order for an oral diet,
   *     nutritional supplement and/or enteral or formula feeding.
   * @param dateTime - The date and time that this nutrition order was requested.
   */
  public NutritionOrderBuilder(
      REQUEST_STATUS status, REQUEST_INTENT intent, Reference patient, FHIRDateTime dateTime) {
    this.status = status;
    this.intent = intent;
    this.patient = patient;
    this.dateTime = dateTime;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public NutritionOrderBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public NutritionOrderBuilder withMeta(@NonNull Meta meta) {
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
  public NutritionOrderBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param note - Comments made about the {{title}} by the requester, performer, subject or other
   *     participants.
   */
  public NutritionOrderBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /**
   * @param note - Comments made about the {{title}} by the requester, performer, subject or other
   *     participants.
   */
  public NutritionOrderBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /**
   * @param orderer - The practitioner that holds legal responsibility for ordering the diet,
   *     nutritional supplement, or formula feedings.
   */
  public NutritionOrderBuilder withOrderer(@NonNull Reference orderer) {
    this.orderer = Optional.of(orderer);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public NutritionOrderBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public NutritionOrderBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public NutritionOrderBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public NutritionOrderBuilder withExtension(@NonNull Extension... extension) {
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
  public NutritionOrderBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param encounter - An encounter that provides additional information about the healthcare
   *     context in which this request is made.
   */
  public NutritionOrderBuilder withEncounter(@NonNull Reference encounter) {
    this.encounter = Optional.of(encounter);
    return this;
  }
  /**
   * @param identifier - Identifiers assigned to this order by the order sender or by the order
   *     receiver.
   */
  public NutritionOrderBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Identifiers assigned to this order by the order sender or by the order
   *     receiver.
   */
  public NutritionOrderBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param instantiates - The URL pointing to a protocol, guideline, orderset or other definition
   *     that is adhered to in whole or in part by this NutritionOrder.
   */
  public NutritionOrderBuilder withInstantiates(@NonNull String... instantiates) {
    this.instantiates = Arrays.asList(instantiates);
    return this;
  }
  /**
   * @param instantiates - The URL pointing to a protocol, guideline, orderset or other definition
   *     that is adhered to in whole or in part by this NutritionOrder.
   */
  public NutritionOrderBuilder withInstantiates(@NonNull Collection<String> instantiates) {
    this.instantiates = Collections.unmodifiableCollection(instantiates);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public NutritionOrderBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
   *     orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
   */
  public NutritionOrderBuilder withInstantiatesUri(@NonNull String... instantiatesUri) {
    this.instantiatesUri = Arrays.asList(instantiatesUri);
    return this;
  }
  /**
   * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
   *     orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
   */
  public NutritionOrderBuilder withInstantiatesUri(@NonNull Collection<String> instantiatesUri) {
    this.instantiatesUri = Collections.unmodifiableCollection(instantiatesUri);
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
  public NutritionOrderBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public NutritionOrderBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param allergyIntolerance - A link to a record of allergies or intolerances which should be
   *     included in the nutrition order.
   */
  public NutritionOrderBuilder withAllergyIntolerance(@NonNull Reference... allergyIntolerance) {
    this.allergyIntolerance = Arrays.asList(allergyIntolerance);
    return this;
  }
  /**
   * @param allergyIntolerance - A link to a record of allergies or intolerances which should be
   *     included in the nutrition order.
   */
  public NutritionOrderBuilder withAllergyIntolerance(
      @NonNull Collection<Reference> allergyIntolerance) {
    this.allergyIntolerance = Collections.unmodifiableCollection(allergyIntolerance);
    return this;
  }
  /**
   * @param excludeFoodModifier - This modifier is used to convey Order-specific modifier about the
   *     type of oral food or oral fluids that should not be given. These can be derived from
   *     patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or
   *     Gluten-Free. While it should not be necessary to repeat allergy or intolerance information
   *     captured in the referenced AllergyIntolerance resource in the excludeFoodModifier, this
   *     element may be used to convey additional specificity related to foods that should be
   *     eliminated from the patient’s diet for any reason. This modifier applies to the entire
   *     nutrition order inclusive of the oral diet, nutritional supplements and enteral formula
   *     feedings.
   */
  public NutritionOrderBuilder withExcludeFoodModifier(
      @NonNull CodeableConcept... excludeFoodModifier) {
    this.excludeFoodModifier = Arrays.asList(excludeFoodModifier);
    return this;
  }
  /**
   * @param excludeFoodModifier - This modifier is used to convey Order-specific modifier about the
   *     type of oral food or oral fluids that should not be given. These can be derived from
   *     patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or
   *     Gluten-Free. While it should not be necessary to repeat allergy or intolerance information
   *     captured in the referenced AllergyIntolerance resource in the excludeFoodModifier, this
   *     element may be used to convey additional specificity related to foods that should be
   *     eliminated from the patient’s diet for any reason. This modifier applies to the entire
   *     nutrition order inclusive of the oral diet, nutritional supplements and enteral formula
   *     feedings.
   */
  public NutritionOrderBuilder withExcludeFoodModifier(
      @NonNull Collection<CodeableConcept> excludeFoodModifier) {
    this.excludeFoodModifier = Collections.unmodifiableCollection(excludeFoodModifier);
    return this;
  }
  /**
   * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline, orderset
   *     or other definition that is adhered to in whole or in part by this NutritionOrder.
   */
  public NutritionOrderBuilder withInstantiatesCanonical(@NonNull String... instantiatesCanonical) {
    this.instantiatesCanonical = Arrays.asList(instantiatesCanonical);
    return this;
  }
  /**
   * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline, orderset
   *     or other definition that is adhered to in whole or in part by this NutritionOrder.
   */
  public NutritionOrderBuilder withInstantiatesCanonical(
      @NonNull Collection<String> instantiatesCanonical) {
    this.instantiatesCanonical = Collections.unmodifiableCollection(instantiatesCanonical);
    return this;
  }
  /**
   * @param foodPreferenceModifier - This modifier is used to convey order-specific modifiers about
   *     the type of food that should be given. These can be derived from patient allergies,
   *     intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the
   *     entire nutrition order inclusive of the oral diet, nutritional supplements and enteral
   *     formula feedings.
   */
  public NutritionOrderBuilder withFoodPreferenceModifier(
      @NonNull CodeableConcept... foodPreferenceModifier) {
    this.foodPreferenceModifier = Arrays.asList(foodPreferenceModifier);
    return this;
  }
  /**
   * @param foodPreferenceModifier - This modifier is used to convey order-specific modifiers about
   *     the type of food that should be given. These can be derived from patient allergies,
   *     intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the
   *     entire nutrition order inclusive of the oral diet, nutritional supplements and enteral
   *     formula feedings.
   */
  public NutritionOrderBuilder withFoodPreferenceModifier(
      @NonNull Collection<CodeableConcept> foodPreferenceModifier) {
    this.foodPreferenceModifier = Collections.unmodifiableCollection(foodPreferenceModifier);
    return this;
  }
  /**
   * @param supplement - Oral nutritional products given in order to add further nutritional value
   *     to the patient's diet.
   */
  public NutritionOrderBuilder withSupplement(@NonNull NutritionOrder.Supplement... supplement) {
    this.supplement = Arrays.asList(supplement);
    return this;
  }
  /**
   * @param supplement - Oral nutritional products given in order to add further nutritional value
   *     to the patient's diet.
   */
  public NutritionOrderBuilder withSupplement(
      @NonNull Collection<NutritionOrder.Supplement> supplement) {
    this.supplement = Collections.unmodifiableCollection(supplement);
    return this;
  }
  /** @param oralDiet - Diet given orally in contrast to enteral (tube) feeding. */
  public NutritionOrderBuilder withOralDiet(@NonNull NutritionOrder.OralDiet oralDiet) {
    this.oralDiet = Optional.of(oralDiet);
    return this;
  }
  /**
   * @param enteralFormula - Feeding provided through the gastrointestinal tract via a tube,
   *     catheter, or stoma that delivers nutrition distal to the oral cavity.
   */
  public NutritionOrderBuilder withEnteralFormula(
      @NonNull NutritionOrder.EnteralFormula enteralFormula) {
    this.enteralFormula = Optional.of(enteralFormula);
    return this;
  }

  public NutritionOrderBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public NutritionOrder build() {
    return new NutritionOrder(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        note.stream().collect(new LitSeqJCollector<>()),
        status,
        intent,
        patient,
        OptionConverters.toScala(orderer),
        OptionConverters.toScala(language),
        dateTime,
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(encounter),
        identifier.stream().collect(new LitSeqJCollector<>()),
        instantiates.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        instantiatesUri.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        allergyIntolerance.stream().collect(new LitSeqJCollector<>()),
        excludeFoodModifier.stream().collect(new LitSeqJCollector<>()),
        instantiatesCanonical.stream().collect(new LitSeqJCollector<>()),
        foodPreferenceModifier.stream().collect(new LitSeqJCollector<>()),
        supplement.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(oralDiet),
        OptionConverters.toScala(enteralFormula),
        LitUtils.emptyMetaElMap());
  }
}
