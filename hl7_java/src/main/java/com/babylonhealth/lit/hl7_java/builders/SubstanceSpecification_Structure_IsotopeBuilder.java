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

public interface SubstanceSpecification_Structure_IsotopeBuilder {
  public SubstanceSpecification$Structure$Isotope build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstanceSpecification_Structure_IsotopeBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> name = Optional.empty();
    private Optional<Quantity> halfLife = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Identifier> identifier = Optional.empty();
    private Optional<CodeableConcept> substitution = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<SubstanceSpecification$Structure$Isotope$MolecularWeight> molecularWeight =
        Optional.empty();

    /** Required fields for {@link SubstanceSpecification$Structure$Isotope} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param name - Names applicable to this substance. */
    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withName(
        @NonNull CodeableConcept name) {
      this.name = Optional.of(name);
      return this;
    }

    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withName(
        @NonNull CodeableConceptBuilder name) {
      this.name = Optional.of(name.build());
      return this;
    }
    /** @param halfLife */
    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withHalfLife(
        @NonNull Quantity halfLife) {
      this.halfLife = Optional.of(halfLife);
      return this;
    }

    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withHalfLife(
        @NonNull QuantityBuilder halfLife) {
      this.halfLife = Optional.of(halfLife.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withExtension(
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
    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - Identifier by which this substance is known. */
    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withIdentifier(
        @NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }
    /** @param substitution */
    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withSubstitution(
        @NonNull CodeableConcept substitution) {
      this.substitution = Optional.of(substitution);
      return this;
    }

    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withSubstitution(
        @NonNull CodeableConceptBuilder substitution) {
      this.substitution = Optional.of(substitution.build());
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
    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withModifierExtension(
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
    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param molecularWeight - The molecular weight or weight range (for proteins, polymers or
     *     nucleic acids).
     */
    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withMolecularWeight(
        @NonNull SubstanceSpecification$Structure$Isotope$MolecularWeight molecularWeight) {
      this.molecularWeight = Optional.of(molecularWeight);
      return this;
    }

    public SubstanceSpecification_Structure_IsotopeBuilder.Impl withMolecularWeight(
        @NonNull SubstanceSpecification_Structure_Isotope_MolecularWeightBuilder molecularWeight) {
      this.molecularWeight = Optional.of(molecularWeight.build());
      return this;
    }

    public SubstanceSpecification$Structure$Isotope build() {
      return new SubstanceSpecification$Structure$Isotope(
          OptionConverters.toScala(id),
          OptionConverters.toScala(name),
          OptionConverters.toScala(halfLife),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(identifier),
          OptionConverters.toScala(substitution),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(molecularWeight),
          LitUtils.emptyMetaElMap());
    }
  }
}
