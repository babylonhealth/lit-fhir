package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface SubstanceSpecification_StructureBuilder {
  public SubstanceSpecification.Structure build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstanceSpecification_StructureBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Reference> source = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<CodeableConcept> stereochemistry = Optional.empty();
    private Optional<CodeableConcept> opticalActivity = Optional.empty();
    private Optional<SubstanceSpecification$Structure$Isotope$MolecularWeight> molecularWeight =
        Optional.empty();
    private Optional<String> molecularFormula = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<String> molecularFormulaByMoiety = Optional.empty();
    private Collection<SubstanceSpecification$Structure$Representation> representation =
        Collections.emptyList();
    private Collection<SubstanceSpecification$Structure$Isotope> isotope = Collections.emptyList();

    /** Required fields for {@link SubstanceSpecification.Structure} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceSpecification_StructureBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param source - Supporting literature. */
    public SubstanceSpecification_StructureBuilder.Impl withSource(@NonNull Reference... source) {
      this.source = Arrays.asList(source);
      return this;
    }
    /** @param source - Supporting literature. */
    public SubstanceSpecification_StructureBuilder.Impl withSource(
        @NonNull Collection<Reference> source) {
      this.source = Collections.unmodifiableCollection(source);
      return this;
    }

    public SubstanceSpecification_StructureBuilder.Impl withSource(
        @NonNull ReferenceBuilder... source) {
      this.source = Arrays.stream(source).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstanceSpecification_StructureBuilder.Impl withExtension(
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
    public SubstanceSpecification_StructureBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceSpecification_StructureBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param stereochemistry */
    public SubstanceSpecification_StructureBuilder.Impl withStereochemistry(
        @NonNull CodeableConcept stereochemistry) {
      this.stereochemistry = Optional.of(stereochemistry);
      return this;
    }

    public SubstanceSpecification_StructureBuilder.Impl withStereochemistry(
        @NonNull CodeableConceptBuilder stereochemistry) {
      this.stereochemistry = Optional.of(stereochemistry.build());
      return this;
    }
    /** @param opticalActivity */
    public SubstanceSpecification_StructureBuilder.Impl withOpticalActivity(
        @NonNull CodeableConcept opticalActivity) {
      this.opticalActivity = Optional.of(opticalActivity);
      return this;
    }

    public SubstanceSpecification_StructureBuilder.Impl withOpticalActivity(
        @NonNull CodeableConceptBuilder opticalActivity) {
      this.opticalActivity = Optional.of(opticalActivity.build());
      return this;
    }
    /**
     * @param molecularWeight - The molecular weight or weight range (for proteins, polymers or
     *     nucleic acids).
     */
    public SubstanceSpecification_StructureBuilder.Impl withMolecularWeight(
        @NonNull SubstanceSpecification$Structure$Isotope$MolecularWeight molecularWeight) {
      this.molecularWeight = Optional.of(molecularWeight);
      return this;
    }

    public SubstanceSpecification_StructureBuilder.Impl withMolecularWeight(
        @NonNull SubstanceSpecification_Structure_Isotope_MolecularWeightBuilder molecularWeight) {
      this.molecularWeight = Optional.of(molecularWeight.build());
      return this;
    }
    /** @param molecularFormula */
    public SubstanceSpecification_StructureBuilder.Impl withMolecularFormula(
        @NonNull String molecularFormula) {
      this.molecularFormula = Optional.of(molecularFormula);
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
    public SubstanceSpecification_StructureBuilder.Impl withModifierExtension(
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
    public SubstanceSpecification_StructureBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceSpecification_StructureBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param molecularFormulaByMoiety */
    public SubstanceSpecification_StructureBuilder.Impl withMolecularFormulaByMoiety(
        @NonNull String molecularFormulaByMoiety) {
      this.molecularFormulaByMoiety = Optional.of(molecularFormulaByMoiety);
      return this;
    }
    /** @param representation */
    public SubstanceSpecification_StructureBuilder.Impl withRepresentation(
        @NonNull SubstanceSpecification$Structure$Representation... representation) {
      this.representation = Arrays.asList(representation);
      return this;
    }
    /** @param representation */
    public SubstanceSpecification_StructureBuilder.Impl withRepresentation(
        @NonNull Collection<SubstanceSpecification$Structure$Representation> representation) {
      this.representation = Collections.unmodifiableCollection(representation);
      return this;
    }

    public SubstanceSpecification_StructureBuilder.Impl withRepresentation(
        @NonNull SubstanceSpecification_Structure_RepresentationBuilder... representation) {
      this.representation = Arrays.stream(representation).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param isotope */
    public SubstanceSpecification_StructureBuilder.Impl withIsotope(
        @NonNull SubstanceSpecification$Structure$Isotope... isotope) {
      this.isotope = Arrays.asList(isotope);
      return this;
    }
    /** @param isotope */
    public SubstanceSpecification_StructureBuilder.Impl withIsotope(
        @NonNull Collection<SubstanceSpecification$Structure$Isotope> isotope) {
      this.isotope = Collections.unmodifiableCollection(isotope);
      return this;
    }

    public SubstanceSpecification_StructureBuilder.Impl withIsotope(
        @NonNull SubstanceSpecification_Structure_IsotopeBuilder... isotope) {
      this.isotope = Arrays.stream(isotope).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubstanceSpecification.Structure build() {
      return new SubstanceSpecification.Structure(
          OptionConverters.toScala(id),
          source.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(stereochemistry),
          OptionConverters.toScala(opticalActivity),
          OptionConverters.toScala(molecularWeight),
          OptionConverters.toScala(molecularFormula),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(molecularFormulaByMoiety),
          representation.stream().collect(new LitSeqJCollector<>()),
          isotope.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
