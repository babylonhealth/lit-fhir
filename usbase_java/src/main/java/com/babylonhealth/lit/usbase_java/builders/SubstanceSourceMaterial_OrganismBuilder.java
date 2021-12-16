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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface SubstanceSourceMaterial_OrganismBuilder {
  public SubstanceSourceMaterial.Organism build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstanceSourceMaterial_OrganismBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> genus = Optional.empty();
    private Optional<CodeableConcept> family = Optional.empty();
    private Optional<CodeableConcept> species = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> intraspecificType = Optional.empty();
    private Optional<String> intraspecificDescription = Optional.empty();
    private Collection<SubstanceSourceMaterial$Organism$Author> author = Collections.emptyList();
    private Optional<SubstanceSourceMaterial$Organism$Hybrid> hybrid = Optional.empty();
    private Optional<SubstanceSourceMaterial$Organism$OrganismGeneral> organismGeneral =
        Optional.empty();

    /** Required fields for {@link SubstanceSourceMaterial.Organism} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceSourceMaterial_OrganismBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param genus */
    public SubstanceSourceMaterial_OrganismBuilder.Impl withGenus(@NonNull CodeableConcept genus) {
      this.genus = Optional.of(genus);
      return this;
    }

    public SubstanceSourceMaterial_OrganismBuilder.Impl withGenus(
        @NonNull CodeableConceptBuilder genus) {
      this.genus = Optional.of(genus.build());
      return this;
    }
    /** @param family */
    public SubstanceSourceMaterial_OrganismBuilder.Impl withFamily(
        @NonNull CodeableConcept family) {
      this.family = Optional.of(family);
      return this;
    }

    public SubstanceSourceMaterial_OrganismBuilder.Impl withFamily(
        @NonNull CodeableConceptBuilder family) {
      this.family = Optional.of(family.build());
      return this;
    }
    /** @param species */
    public SubstanceSourceMaterial_OrganismBuilder.Impl withSpecies(
        @NonNull CodeableConcept species) {
      this.species = Optional.of(species);
      return this;
    }

    public SubstanceSourceMaterial_OrganismBuilder.Impl withSpecies(
        @NonNull CodeableConceptBuilder species) {
      this.species = Optional.of(species.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstanceSourceMaterial_OrganismBuilder.Impl withExtension(
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
    public SubstanceSourceMaterial_OrganismBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceSourceMaterial_OrganismBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
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
    public SubstanceSourceMaterial_OrganismBuilder.Impl withModifierExtension(
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
    public SubstanceSourceMaterial_OrganismBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceSourceMaterial_OrganismBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param intraspecificType */
    public SubstanceSourceMaterial_OrganismBuilder.Impl withIntraspecificType(
        @NonNull CodeableConcept intraspecificType) {
      this.intraspecificType = Optional.of(intraspecificType);
      return this;
    }

    public SubstanceSourceMaterial_OrganismBuilder.Impl withIntraspecificType(
        @NonNull CodeableConceptBuilder intraspecificType) {
      this.intraspecificType = Optional.of(intraspecificType.build());
      return this;
    }
    /** @param intraspecificDescription */
    public SubstanceSourceMaterial_OrganismBuilder.Impl withIntraspecificDescription(
        @NonNull String intraspecificDescription) {
      this.intraspecificDescription = Optional.of(intraspecificDescription);
      return this;
    }
    /** @param author */
    public SubstanceSourceMaterial_OrganismBuilder.Impl withAuthor(
        @NonNull SubstanceSourceMaterial$Organism$Author... author) {
      this.author = Arrays.asList(author);
      return this;
    }
    /** @param author */
    public SubstanceSourceMaterial_OrganismBuilder.Impl withAuthor(
        @NonNull Collection<SubstanceSourceMaterial$Organism$Author> author) {
      this.author = Collections.unmodifiableCollection(author);
      return this;
    }

    public SubstanceSourceMaterial_OrganismBuilder.Impl withAuthor(
        @NonNull SubstanceSourceMaterial_Organism_AuthorBuilder... author) {
      this.author = Arrays.stream(author).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param hybrid */
    public SubstanceSourceMaterial_OrganismBuilder.Impl withHybrid(
        @NonNull SubstanceSourceMaterial$Organism$Hybrid hybrid) {
      this.hybrid = Optional.of(hybrid);
      return this;
    }

    public SubstanceSourceMaterial_OrganismBuilder.Impl withHybrid(
        @NonNull SubstanceSourceMaterial_Organism_HybridBuilder hybrid) {
      this.hybrid = Optional.of(hybrid.build());
      return this;
    }
    /** @param organismGeneral */
    public SubstanceSourceMaterial_OrganismBuilder.Impl withOrganismGeneral(
        @NonNull SubstanceSourceMaterial$Organism$OrganismGeneral organismGeneral) {
      this.organismGeneral = Optional.of(organismGeneral);
      return this;
    }

    public SubstanceSourceMaterial_OrganismBuilder.Impl withOrganismGeneral(
        @NonNull SubstanceSourceMaterial_Organism_OrganismGeneralBuilder organismGeneral) {
      this.organismGeneral = Optional.of(organismGeneral.build());
      return this;
    }

    public SubstanceSourceMaterial.Organism build() {
      return new SubstanceSourceMaterial.Organism(
          OptionConverters.toScala(id),
          OptionConverters.toScala(genus),
          OptionConverters.toScala(family),
          OptionConverters.toScala(species),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(intraspecificType),
          OptionConverters.toScala(intraspecificDescription),
          author.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(hybrid),
          OptionConverters.toScala(organismGeneral),
          LitUtils.emptyMetaElMap());
    }
  }
}
