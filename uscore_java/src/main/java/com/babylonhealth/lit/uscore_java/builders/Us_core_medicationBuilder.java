package com.babylonhealth.lit.uscore_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.MEDICATION_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.uscore.model.*;
import com.babylonhealth.lit.uscore_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Us_core_medicationBuilder extends MedicationBuilder {
  public Us_core_medication build();

  public static Impl init(CodeableConcept code) {
    return new Impl(code);
  }

  public static Impl builder(CodeableConceptBuilder code) {
    return new Impl(code.build());
  }

  public class Impl implements Us_core_medicationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-medication")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private CodeableConcept code;
    private Optional<CodeableConcept> form = Optional.empty();
    private Optional<MEDICATION_STATUS> status = Optional.empty();
    private Optional<Ratio> amount = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<Reference> manufacturer = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Medication.Batch> batch = Optional.empty();
    private Collection<Medication.Ingredient> ingredient = Collections.emptyList();

    /**
     * Required fields for {@link Us_core_medication}
     *
     * @param code - A code (or set of codes) that specify this medication, or a textual description
     *     if no code is available. Usage note: This could be a standard medication code such as a
     *     code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary
     *     code, optionally with translations to other code systems.
     */
    public Impl(CodeableConcept code) {
      this.code = code;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Us_core_medicationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public Us_core_medicationBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public Us_core_medicationBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public Us_core_medicationBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public Us_core_medicationBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param form - Describes the form of the item. Powder; tablets; capsule. */
    public Us_core_medicationBuilder.Impl withForm(@NonNull CodeableConcept form) {
      this.form = Optional.of(form);
      return this;
    }

    public Us_core_medicationBuilder.Impl withForm(@NonNull CodeableConceptBuilder form) {
      this.form = Optional.of(form.build());
      return this;
    }
    /** @param status - A code to indicate if the medication is in active use. */
    public Us_core_medicationBuilder.Impl withStatus(@NonNull MEDICATION_STATUS status) {
      this.status = Optional.of(status);
      return this;
    }
    /**
     * @param amount - Specific amount of the drug in the packaged product. For example, when
     *     specifying a product that has the same strength (For example, Insulin glargine 100 unit
     *     per mL solution for injection), this attribute provides additional clarification of the
     *     package amount (For example, 3 mL, 10mL, etc.).
     */
    public Us_core_medicationBuilder.Impl withAmount(@NonNull Ratio amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    public Us_core_medicationBuilder.Impl withAmount(@NonNull RatioBuilder amount) {
      this.amount = Optional.of(amount.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public Us_core_medicationBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_medicationBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_medicationBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public Us_core_medicationBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public Us_core_medicationBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Us_core_medicationBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Us_core_medicationBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - Business identifier for this medication. */
    public Us_core_medicationBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - Business identifier for this medication. */
    public Us_core_medicationBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public Us_core_medicationBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param manufacturer - Describes the details of the manufacturer of the medication product.
     *     This is not intended to represent the distributor of a medication product.
     */
    public Us_core_medicationBuilder.Impl withManufacturer(@NonNull Reference manufacturer) {
      this.manufacturer = Optional.of(manufacturer);
      return this;
    }

    public Us_core_medicationBuilder.Impl withManufacturer(@NonNull ReferenceBuilder manufacturer) {
      this.manufacturer = Optional.of(manufacturer.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public Us_core_medicationBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
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
    public Us_core_medicationBuilder.Impl withModifierExtension(
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
    public Us_core_medicationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Us_core_medicationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param batch - Information that only applies to packages (not products). */
    public Us_core_medicationBuilder.Impl withBatch(@NonNull Medication.Batch batch) {
      this.batch = Optional.of(batch);
      return this;
    }

    public Us_core_medicationBuilder.Impl withBatch(@NonNull Medication_BatchBuilder batch) {
      this.batch = Optional.of(batch.build());
      return this;
    }
    /** @param ingredient - Identifies a particular constituent of interest in the product. */
    public Us_core_medicationBuilder.Impl withIngredient(
        @NonNull Medication.Ingredient... ingredient) {
      this.ingredient = Arrays.asList(ingredient);
      return this;
    }
    /** @param ingredient - Identifies a particular constituent of interest in the product. */
    public Us_core_medicationBuilder.Impl withIngredient(
        @NonNull Collection<Medication.Ingredient> ingredient) {
      this.ingredient = Collections.unmodifiableCollection(ingredient);
      return this;
    }

    public Us_core_medicationBuilder.Impl withIngredient(
        @NonNull Medication_IngredientBuilder... ingredient) {
      this.ingredient = Arrays.stream(ingredient).map(e -> e.build()).collect(toList());
      return this;
    }

    public Us_core_medicationBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Us_core_medication build() {
      return new Us_core_medication(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          code,
          OptionConverters.toScala(form),
          OptionConverters.toScala(status),
          OptionConverters.toScala(amount),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(manufacturer),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(batch),
          ingredient.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
