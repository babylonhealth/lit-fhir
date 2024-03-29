package com.babylonhealth.lit.usbase_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface SubstanceSourceMaterial_Organism_HybridBuilder {
  public SubstanceSourceMaterial$Organism$Hybrid build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstanceSourceMaterial_Organism_HybridBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<CodeableConcept> hybridType = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<String> maternalOrganismId = Optional.empty();
    private Optional<String> paternalOrganismId = Optional.empty();
    private Optional<String> maternalOrganismName = Optional.empty();
    private Optional<String> paternalOrganismName = Optional.empty();

    /** Required fields for {@link SubstanceSourceMaterial$Organism$Hybrid} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceSourceMaterial_Organism_HybridBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstanceSourceMaterial_Organism_HybridBuilder.Impl withExtension(
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
    public SubstanceSourceMaterial_Organism_HybridBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceSourceMaterial_Organism_HybridBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param hybridType */
    public SubstanceSourceMaterial_Organism_HybridBuilder.Impl withHybridType(
        @NonNull CodeableConcept hybridType) {
      this.hybridType = Optional.of(hybridType);
      return this;
    }

    public SubstanceSourceMaterial_Organism_HybridBuilder.Impl withHybridType(
        @NonNull CodeableConceptBuilder hybridType) {
      this.hybridType = Optional.of(hybridType.build());
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
    public SubstanceSourceMaterial_Organism_HybridBuilder.Impl withModifierExtension(
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
    public SubstanceSourceMaterial_Organism_HybridBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceSourceMaterial_Organism_HybridBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param maternalOrganismId */
    public SubstanceSourceMaterial_Organism_HybridBuilder.Impl withMaternalOrganismId(
        @NonNull String maternalOrganismId) {
      this.maternalOrganismId = Optional.of(maternalOrganismId);
      return this;
    }
    /** @param paternalOrganismId */
    public SubstanceSourceMaterial_Organism_HybridBuilder.Impl withPaternalOrganismId(
        @NonNull String paternalOrganismId) {
      this.paternalOrganismId = Optional.of(paternalOrganismId);
      return this;
    }
    /** @param maternalOrganismName */
    public SubstanceSourceMaterial_Organism_HybridBuilder.Impl withMaternalOrganismName(
        @NonNull String maternalOrganismName) {
      this.maternalOrganismName = Optional.of(maternalOrganismName);
      return this;
    }
    /** @param paternalOrganismName */
    public SubstanceSourceMaterial_Organism_HybridBuilder.Impl withPaternalOrganismName(
        @NonNull String paternalOrganismName) {
      this.paternalOrganismName = Optional.of(paternalOrganismName);
      return this;
    }

    public SubstanceSourceMaterial$Organism$Hybrid build() {
      return new SubstanceSourceMaterial$Organism$Hybrid(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(hybridType),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(maternalOrganismId),
          OptionConverters.toScala(paternalOrganismId),
          OptionConverters.toScala(maternalOrganismName),
          OptionConverters.toScala(paternalOrganismName),
          LitUtils.emptyMetaElMap());
    }
  }
}
