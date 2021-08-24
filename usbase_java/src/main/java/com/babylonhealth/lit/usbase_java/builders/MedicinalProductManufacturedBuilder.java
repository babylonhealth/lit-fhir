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

public interface MedicinalProductManufacturedBuilder extends DomainResourceBuilder {
  public MedicinalProductManufactured build();

  public static Impl init(Quantity quantity, CodeableConcept manufacturedDoseForm) {
    return new Impl(quantity, manufacturedDoseForm);
  }

  public static Impl builder(
      QuantityBuilder quantity, CodeableConceptBuilder manufacturedDoseForm) {
    return new Impl(quantity.build(), manufacturedDoseForm.build());
  }

  public class Impl implements MedicinalProductManufacturedBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Quantity quantity;
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Reference> ingredient = Collections.emptyList();
    private Collection<Reference> manufacturer = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> unitOfPresentation = Optional.empty();
    private CodeableConcept manufacturedDoseForm;
    private Collection<CodeableConcept> otherCharacteristics = Collections.emptyList();
    private Optional<Choice> physicalCharacteristics = Optional.empty();

    /**
     * Required fields for {@link MedicinalProductManufactured}
     *
     * @param quantity - The quantity or "count number" of the manufactured item.
     * @param manufacturedDoseForm - Dose form as manufactured and before any transformation into
     *     the pharmaceutical product.
     */
    public Impl(Quantity quantity, CodeableConcept manufacturedDoseForm) {
      this.quantity = quantity;
      this.manufacturedDoseForm = manufacturedDoseForm;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicinalProductManufacturedBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public MedicinalProductManufacturedBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public MedicinalProductManufacturedBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public MedicinalProductManufacturedBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public MedicinalProductManufacturedBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public MedicinalProductManufacturedBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MedicinalProductManufacturedBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MedicinalProductManufacturedBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public MedicinalProductManufacturedBuilder.Impl withContained(
        @NonNull ResourceBuilder... contained) {
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
    public MedicinalProductManufacturedBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MedicinalProductManufacturedBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicinalProductManufacturedBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param ingredient - Ingredient. */
    public MedicinalProductManufacturedBuilder.Impl withIngredient(
        @NonNull Reference... ingredient) {
      this.ingredient = Arrays.asList(ingredient);
      return this;
    }
    /** @param ingredient - Ingredient. */
    public MedicinalProductManufacturedBuilder.Impl withIngredient(
        @NonNull Collection<Reference> ingredient) {
      this.ingredient = Collections.unmodifiableCollection(ingredient);
      return this;
    }

    public MedicinalProductManufacturedBuilder.Impl withIngredient(
        @NonNull ReferenceBuilder... ingredient) {
      this.ingredient = Arrays.stream(ingredient).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param manufacturer - Manufacturer of the item (Note that this should be named "manufacturer"
     *     but it currently causes technical issues).
     */
    public MedicinalProductManufacturedBuilder.Impl withManufacturer(
        @NonNull Reference... manufacturer) {
      this.manufacturer = Arrays.asList(manufacturer);
      return this;
    }
    /**
     * @param manufacturer - Manufacturer of the item (Note that this should be named "manufacturer"
     *     but it currently causes technical issues).
     */
    public MedicinalProductManufacturedBuilder.Impl withManufacturer(
        @NonNull Collection<Reference> manufacturer) {
      this.manufacturer = Collections.unmodifiableCollection(manufacturer);
      return this;
    }

    public MedicinalProductManufacturedBuilder.Impl withManufacturer(
        @NonNull ReferenceBuilder... manufacturer) {
      this.manufacturer = Arrays.stream(manufacturer).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public MedicinalProductManufacturedBuilder.Impl withImplicitRules(
        @NonNull String implicitRules) {
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
    public MedicinalProductManufacturedBuilder.Impl withModifierExtension(
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
    public MedicinalProductManufacturedBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicinalProductManufacturedBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param unitOfPresentation - The “real world” units in which the quantity of the manufactured
     *     item is described.
     */
    public MedicinalProductManufacturedBuilder.Impl withUnitOfPresentation(
        @NonNull CodeableConcept unitOfPresentation) {
      this.unitOfPresentation = Optional.of(unitOfPresentation);
      return this;
    }

    public MedicinalProductManufacturedBuilder.Impl withUnitOfPresentation(
        @NonNull CodeableConceptBuilder unitOfPresentation) {
      this.unitOfPresentation = Optional.of(unitOfPresentation.build());
      return this;
    }
    /** @param otherCharacteristics - Other codeable characteristics. */
    public MedicinalProductManufacturedBuilder.Impl withOtherCharacteristics(
        @NonNull CodeableConcept... otherCharacteristics) {
      this.otherCharacteristics = Arrays.asList(otherCharacteristics);
      return this;
    }
    /** @param otherCharacteristics - Other codeable characteristics. */
    public MedicinalProductManufacturedBuilder.Impl withOtherCharacteristics(
        @NonNull Collection<CodeableConcept> otherCharacteristics) {
      this.otherCharacteristics = Collections.unmodifiableCollection(otherCharacteristics);
      return this;
    }

    public MedicinalProductManufacturedBuilder.Impl withOtherCharacteristics(
        @NonNull CodeableConceptBuilder... otherCharacteristics) {
      this.otherCharacteristics =
          Arrays.stream(otherCharacteristics).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param physicalCharacteristics - Dimensions, color etc. */
    public MedicinalProductManufacturedBuilder.Impl withPhysicalCharacteristics(
        @NonNull Choice physicalCharacteristics) {
      this.physicalCharacteristics = Optional.of(physicalCharacteristics);
      return this;
    }

    public MedicinalProductManufacturedBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public MedicinalProductManufactured build() {
      return new MedicinalProductManufactured(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(language),
          quantity,
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          ingredient.stream().collect(new LitSeqJCollector<>()),
          manufacturer.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(unitOfPresentation),
          manufacturedDoseForm,
          otherCharacteristics.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(physicalCharacteristics),
          LitUtils.emptyMetaElMap());
    }
  }
}
