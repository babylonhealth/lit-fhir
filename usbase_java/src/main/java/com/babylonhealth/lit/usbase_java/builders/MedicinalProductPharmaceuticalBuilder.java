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

public interface MedicinalProductPharmaceuticalBuilder extends DomainResourceBuilder {
  public MedicinalProductPharmaceutical build();

  public static Impl init(
      CodeableConcept administrableDoseForm,
      Collection<MedicinalProductPharmaceutical.RouteOfAdministration> routeOfAdministration) {
    return new Impl(administrableDoseForm, routeOfAdministration);
  }

  public static Impl builder(
      CodeableConceptBuilder administrableDoseForm,
      Collection<MedicinalProductPharmaceutical_RouteOfAdministrationBuilder>
          routeOfAdministration) {
    return new Impl(
        administrableDoseForm.build(),
        new LitSeq<>(routeOfAdministration)
            .map(MedicinalProductPharmaceutical_RouteOfAdministrationBuilder::build));
  }

  public class Impl implements MedicinalProductPharmaceuticalBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<Reference> device = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<Reference> ingredient = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> unitOfPresentation = Optional.empty();
    private CodeableConcept administrableDoseForm;
    private Collection<MedicinalProductPharmaceutical.Characteristics> characteristics =
        Collections.emptyList();
    private Collection<MedicinalProductPharmaceutical.RouteOfAdministration> routeOfAdministration;

    /**
     * Required fields for {@link MedicinalProductPharmaceutical}
     *
     * @param administrableDoseForm - The administrable dose form, after necessary reconstitution.
     * @param routeOfAdministration - The path by which the pharmaceutical product is taken into or
     *     makes contact with the body.
     */
    public Impl(
        CodeableConcept administrableDoseForm,
        Collection<MedicinalProductPharmaceutical.RouteOfAdministration> routeOfAdministration) {
      this.administrableDoseForm = administrableDoseForm;
      this.routeOfAdministration = routeOfAdministration;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicinalProductPharmaceuticalBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public MedicinalProductPharmaceuticalBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public MedicinalProductPharmaceuticalBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public MedicinalProductPharmaceuticalBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public MedicinalProductPharmaceuticalBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param device - Accompanying device. */
    public MedicinalProductPharmaceuticalBuilder.Impl withDevice(@NonNull Reference... device) {
      this.device = Arrays.asList(device);
      return this;
    }
    /** @param device - Accompanying device. */
    public MedicinalProductPharmaceuticalBuilder.Impl withDevice(
        @NonNull Collection<Reference> device) {
      this.device = Collections.unmodifiableCollection(device);
      return this;
    }

    public MedicinalProductPharmaceuticalBuilder.Impl withDevice(
        @NonNull ReferenceBuilder... device) {
      this.device = Arrays.stream(device).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public MedicinalProductPharmaceuticalBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MedicinalProductPharmaceuticalBuilder.Impl withContained(
        @NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MedicinalProductPharmaceuticalBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public MedicinalProductPharmaceuticalBuilder.Impl withContained(
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
    public MedicinalProductPharmaceuticalBuilder.Impl withExtension(
        @NonNull Extension... extension) {
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
    public MedicinalProductPharmaceuticalBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicinalProductPharmaceuticalBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - An identifier for the pharmaceutical medicinal product. */
    public MedicinalProductPharmaceuticalBuilder.Impl withIdentifier(
        @NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - An identifier for the pharmaceutical medicinal product. */
    public MedicinalProductPharmaceuticalBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public MedicinalProductPharmaceuticalBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param ingredient - Ingredient. */
    public MedicinalProductPharmaceuticalBuilder.Impl withIngredient(
        @NonNull Reference... ingredient) {
      this.ingredient = Arrays.asList(ingredient);
      return this;
    }
    /** @param ingredient - Ingredient. */
    public MedicinalProductPharmaceuticalBuilder.Impl withIngredient(
        @NonNull Collection<Reference> ingredient) {
      this.ingredient = Collections.unmodifiableCollection(ingredient);
      return this;
    }

    public MedicinalProductPharmaceuticalBuilder.Impl withIngredient(
        @NonNull ReferenceBuilder... ingredient) {
      this.ingredient = Arrays.stream(ingredient).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public MedicinalProductPharmaceuticalBuilder.Impl withImplicitRules(
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
    public MedicinalProductPharmaceuticalBuilder.Impl withModifierExtension(
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
    public MedicinalProductPharmaceuticalBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicinalProductPharmaceuticalBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param unitOfPresentation - Todo. */
    public MedicinalProductPharmaceuticalBuilder.Impl withUnitOfPresentation(
        @NonNull CodeableConcept unitOfPresentation) {
      this.unitOfPresentation = Optional.of(unitOfPresentation);
      return this;
    }

    public MedicinalProductPharmaceuticalBuilder.Impl withUnitOfPresentation(
        @NonNull CodeableConceptBuilder unitOfPresentation) {
      this.unitOfPresentation = Optional.of(unitOfPresentation.build());
      return this;
    }
    /** @param characteristics - Characteristics e.g. a products onset of action. */
    public MedicinalProductPharmaceuticalBuilder.Impl withCharacteristics(
        @NonNull MedicinalProductPharmaceutical.Characteristics... characteristics) {
      this.characteristics = Arrays.asList(characteristics);
      return this;
    }
    /** @param characteristics - Characteristics e.g. a products onset of action. */
    public MedicinalProductPharmaceuticalBuilder.Impl withCharacteristics(
        @NonNull Collection<MedicinalProductPharmaceutical.Characteristics> characteristics) {
      this.characteristics = Collections.unmodifiableCollection(characteristics);
      return this;
    }

    public MedicinalProductPharmaceuticalBuilder.Impl withCharacteristics(
        @NonNull MedicinalProductPharmaceutical_CharacteristicsBuilder... characteristics) {
      this.characteristics = Arrays.stream(characteristics).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicinalProductPharmaceuticalBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public MedicinalProductPharmaceutical build() {
      return new MedicinalProductPharmaceutical(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          device.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          ingredient.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(unitOfPresentation),
          administrableDoseForm,
          characteristics.stream().collect(new LitSeqJCollector<>()),
          routeOfAdministration.stream().collect(new NonEmptyLitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
