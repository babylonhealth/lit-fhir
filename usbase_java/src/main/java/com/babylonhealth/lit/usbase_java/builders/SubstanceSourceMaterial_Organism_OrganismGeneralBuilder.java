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

public interface SubstanceSourceMaterial_Organism_OrganismGeneralBuilder {
  public SubstanceSourceMaterial$Organism$OrganismGeneral build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstanceSourceMaterial_Organism_OrganismGeneralBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _class = Optional.empty();
    private Optional<CodeableConcept> order = Optional.empty();
    private Optional<CodeableConcept> phylum = Optional.empty();
    private Optional<CodeableConcept> kingdom = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link SubstanceSourceMaterial$Organism$OrganismGeneral} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _class */
    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withClass(
        @NonNull CodeableConcept _class) {
      this._class = Optional.of(_class);
      return this;
    }

    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withClass(
        @NonNull CodeableConceptBuilder _class) {
      this._class = Optional.of(_class.build());
      return this;
    }
    /** @param order */
    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withOrder(
        @NonNull CodeableConcept order) {
      this.order = Optional.of(order);
      return this;
    }

    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withOrder(
        @NonNull CodeableConceptBuilder order) {
      this.order = Optional.of(order.build());
      return this;
    }
    /** @param phylum */
    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withPhylum(
        @NonNull CodeableConcept phylum) {
      this.phylum = Optional.of(phylum);
      return this;
    }

    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withPhylum(
        @NonNull CodeableConceptBuilder phylum) {
      this.phylum = Optional.of(phylum.build());
      return this;
    }
    /** @param kingdom */
    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withKingdom(
        @NonNull CodeableConcept kingdom) {
      this.kingdom = Optional.of(kingdom);
      return this;
    }

    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withKingdom(
        @NonNull CodeableConceptBuilder kingdom) {
      this.kingdom = Optional.of(kingdom.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withExtension(
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
    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withExtension(
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
    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withModifierExtension(
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
    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceSourceMaterial_Organism_OrganismGeneralBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubstanceSourceMaterial$Organism$OrganismGeneral build() {
      return new SubstanceSourceMaterial$Organism$OrganismGeneral(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_class),
          OptionConverters.toScala(order),
          OptionConverters.toScala(phylum),
          OptionConverters.toScala(kingdom),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
