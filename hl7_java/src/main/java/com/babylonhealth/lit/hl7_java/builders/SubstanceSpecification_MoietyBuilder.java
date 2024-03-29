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
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface SubstanceSpecification_MoietyBuilder {
  public SubstanceSpecification.Moiety build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceQuantityOrString amount(Quantity q) {
    return new ChoiceQuantityOrString(q);
  }

  public static ChoiceQuantityOrString amount(String s) {
    return new ChoiceQuantityOrString(s);
  }

  public class Impl implements SubstanceSpecification_MoietyBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> role = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceQuantityOrString> amount = Optional.empty();
    private Optional<Identifier> identifier = Optional.empty();
    private Optional<CodeableConcept> stereochemistry = Optional.empty();
    private Optional<CodeableConcept> opticalActivity = Optional.empty();
    private Optional<String> molecularFormula = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link SubstanceSpecification.Moiety} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceSpecification_MoietyBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param role */
    public SubstanceSpecification_MoietyBuilder.Impl withRole(@NonNull CodeableConcept role) {
      this.role = Optional.of(role);
      return this;
    }

    public SubstanceSpecification_MoietyBuilder.Impl withRole(
        @NonNull CodeableConceptBuilder role) {
      this.role = Optional.of(role.build());
      return this;
    }
    /** @param name - Names applicable to this substance. */
    public SubstanceSpecification_MoietyBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstanceSpecification_MoietyBuilder.Impl withExtension(
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
    public SubstanceSpecification_MoietyBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceSpecification_MoietyBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param amount Field is a 'choice' field. Type should be one of Quantity, String. To pass the
     *     value in, wrap with one of the SubstanceSpecification_MoietyBuilder.amount static methods
     */
    public SubstanceSpecification_MoietyBuilder.Impl withAmount(
        @NonNull ChoiceQuantityOrString amount) {
      this.amount = Optional.of(amount);
      return this;
    }
    /** @param identifier - Identifier by which this substance is known. */
    public SubstanceSpecification_MoietyBuilder.Impl withIdentifier(
        @NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public SubstanceSpecification_MoietyBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }
    /** @param stereochemistry */
    public SubstanceSpecification_MoietyBuilder.Impl withStereochemistry(
        @NonNull CodeableConcept stereochemistry) {
      this.stereochemistry = Optional.of(stereochemistry);
      return this;
    }

    public SubstanceSpecification_MoietyBuilder.Impl withStereochemistry(
        @NonNull CodeableConceptBuilder stereochemistry) {
      this.stereochemistry = Optional.of(stereochemistry.build());
      return this;
    }
    /** @param opticalActivity */
    public SubstanceSpecification_MoietyBuilder.Impl withOpticalActivity(
        @NonNull CodeableConcept opticalActivity) {
      this.opticalActivity = Optional.of(opticalActivity);
      return this;
    }

    public SubstanceSpecification_MoietyBuilder.Impl withOpticalActivity(
        @NonNull CodeableConceptBuilder opticalActivity) {
      this.opticalActivity = Optional.of(opticalActivity.build());
      return this;
    }
    /** @param molecularFormula */
    public SubstanceSpecification_MoietyBuilder.Impl withMolecularFormula(
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
    public SubstanceSpecification_MoietyBuilder.Impl withModifierExtension(
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
    public SubstanceSpecification_MoietyBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceSpecification_MoietyBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubstanceSpecification.Moiety build() {
      return new SubstanceSpecification.Moiety(
          OptionConverters.toScala(id),
          OptionConverters.toScala(role),
          OptionConverters.toScala(name),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(amount),
          OptionConverters.toScala(identifier),
          OptionConverters.toScala(stereochemistry),
          OptionConverters.toScala(opticalActivity),
          OptionConverters.toScala(molecularFormula),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
