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

public interface SubstanceReferenceInformation_TargetBuilder {
  public SubstanceReferenceInformation.Target build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceQuantityOrRangeOrString amount(Quantity q) {
    return new ChoiceQuantityOrRangeOrString(q);
  }

  public static ChoiceQuantityOrRangeOrString amount(Range r) {
    return new ChoiceQuantityOrRangeOrString(r);
  }

  public static ChoiceQuantityOrRangeOrString amount(String s) {
    return new ChoiceQuantityOrRangeOrString(s);
  }

  public class Impl implements SubstanceReferenceInformation_TargetBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<Identifier> target = Optional.empty();
    private Collection<Reference> source = Collections.emptyList();
    private Optional<CodeableConcept> organism = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceQuantityOrRangeOrString> amount = Optional.empty();
    private Optional<CodeableConcept> amountType = Optional.empty();
    private Optional<CodeableConcept> interaction = Optional.empty();
    private Optional<CodeableConcept> organismType = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link SubstanceReferenceInformation.Target} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceReferenceInformation_TargetBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type */
    public SubstanceReferenceInformation_TargetBuilder.Impl withType(
        @NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public SubstanceReferenceInformation_TargetBuilder.Impl withType(
        @NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param target - Todo. */
    public SubstanceReferenceInformation_TargetBuilder.Impl withTarget(@NonNull Identifier target) {
      this.target = Optional.of(target);
      return this;
    }

    public SubstanceReferenceInformation_TargetBuilder.Impl withTarget(
        @NonNull IdentifierBuilder target) {
      this.target = Optional.of(target.build());
      return this;
    }
    /** @param source */
    public SubstanceReferenceInformation_TargetBuilder.Impl withSource(
        @NonNull Reference... source) {
      this.source = Arrays.asList(source);
      return this;
    }
    /** @param source */
    public SubstanceReferenceInformation_TargetBuilder.Impl withSource(
        @NonNull Collection<Reference> source) {
      this.source = Collections.unmodifiableCollection(source);
      return this;
    }

    public SubstanceReferenceInformation_TargetBuilder.Impl withSource(
        @NonNull ReferenceBuilder... source) {
      this.source = Arrays.stream(source).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param organism */
    public SubstanceReferenceInformation_TargetBuilder.Impl withOrganism(
        @NonNull CodeableConcept organism) {
      this.organism = Optional.of(organism);
      return this;
    }

    public SubstanceReferenceInformation_TargetBuilder.Impl withOrganism(
        @NonNull CodeableConceptBuilder organism) {
      this.organism = Optional.of(organism.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstanceReferenceInformation_TargetBuilder.Impl withExtension(
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
    public SubstanceReferenceInformation_TargetBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceReferenceInformation_TargetBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param amount Field is a 'choice' field. Type should be one of Quantity, Range, String. To
     *     pass the value in, wrap with one of the
     *     SubstanceReferenceInformation_TargetBuilder.amount static methods
     */
    public SubstanceReferenceInformation_TargetBuilder.Impl withAmount(
        @NonNull ChoiceQuantityOrRangeOrString amount) {
      this.amount = Optional.of(amount);
      return this;
    }
    /** @param amountType */
    public SubstanceReferenceInformation_TargetBuilder.Impl withAmountType(
        @NonNull CodeableConcept amountType) {
      this.amountType = Optional.of(amountType);
      return this;
    }

    public SubstanceReferenceInformation_TargetBuilder.Impl withAmountType(
        @NonNull CodeableConceptBuilder amountType) {
      this.amountType = Optional.of(amountType.build());
      return this;
    }
    /** @param interaction */
    public SubstanceReferenceInformation_TargetBuilder.Impl withInteraction(
        @NonNull CodeableConcept interaction) {
      this.interaction = Optional.of(interaction);
      return this;
    }

    public SubstanceReferenceInformation_TargetBuilder.Impl withInteraction(
        @NonNull CodeableConceptBuilder interaction) {
      this.interaction = Optional.of(interaction.build());
      return this;
    }
    /** @param organismType */
    public SubstanceReferenceInformation_TargetBuilder.Impl withOrganismType(
        @NonNull CodeableConcept organismType) {
      this.organismType = Optional.of(organismType);
      return this;
    }

    public SubstanceReferenceInformation_TargetBuilder.Impl withOrganismType(
        @NonNull CodeableConceptBuilder organismType) {
      this.organismType = Optional.of(organismType.build());
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
    public SubstanceReferenceInformation_TargetBuilder.Impl withModifierExtension(
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
    public SubstanceReferenceInformation_TargetBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceReferenceInformation_TargetBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public SubstanceReferenceInformation.Target build() {
      return new SubstanceReferenceInformation.Target(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(target),
          source.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(organism),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(amount),
          OptionConverters.toScala(amountType),
          OptionConverters.toScala(interaction),
          OptionConverters.toScala(organismType),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
