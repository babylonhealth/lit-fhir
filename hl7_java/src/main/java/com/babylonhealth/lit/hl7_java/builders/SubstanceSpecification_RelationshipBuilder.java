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

public interface SubstanceSpecification_RelationshipBuilder {
  public SubstanceSpecification.Relationship build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static Choice00133982841 amount(Quantity q) {
    return new Choice00133982841(q);
  }

  public static Choice00133982841 amount(Range r) {
    return new Choice00133982841(r);
  }

  public static Choice00133982841 amount(Ratio r) {
    return new Choice00133982841(r);
  }

  public static Choice00133982841 amount(String s) {
    return new Choice00133982841(s);
  }

  public static ChoiceCodeableConceptOrReference substance(CodeableConcept c) {
    return new ChoiceCodeableConceptOrReference(c);
  }

  public static ChoiceCodeableConceptOrReference substance(Reference r) {
    return new ChoiceCodeableConceptOrReference(r);
  }

  public class Impl implements SubstanceSpecification_RelationshipBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Reference> source = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Choice00133982841> amount = Optional.empty();
    private Optional<Boolean> isDefining = Optional.empty();
    private Optional<CodeableConcept> amountType = Optional.empty();
    private Optional<ChoiceCodeableConceptOrReference> substance = Optional.empty();
    private Optional<CodeableConcept> relationship = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Ratio> amountRatioLowLimit = Optional.empty();

    /** Required fields for {@link SubstanceSpecification.Relationship} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceSpecification_RelationshipBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param source - Supporting literature. */
    public SubstanceSpecification_RelationshipBuilder.Impl withSource(
        @NonNull Reference... source) {
      this.source = Arrays.asList(source);
      return this;
    }
    /** @param source - Supporting literature. */
    public SubstanceSpecification_RelationshipBuilder.Impl withSource(
        @NonNull Collection<Reference> source) {
      this.source = Collections.unmodifiableCollection(source);
      return this;
    }

    public SubstanceSpecification_RelationshipBuilder.Impl withSource(
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
    public SubstanceSpecification_RelationshipBuilder.Impl withExtension(
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
    public SubstanceSpecification_RelationshipBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceSpecification_RelationshipBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param amount Field is a 'choice' field. Type should be one of Quantity, Range, Ratio,
     *     String. To pass the value in, wrap with one of the
     *     SubstanceSpecification_RelationshipBuilder.amount static methods
     */
    public SubstanceSpecification_RelationshipBuilder.Impl withAmount(
        @NonNull Choice00133982841 amount) {
      this.amount = Optional.of(amount);
      return this;
    }
    /** @param isDefining */
    public SubstanceSpecification_RelationshipBuilder.Impl withIsDefining(
        @NonNull Boolean isDefining) {
      this.isDefining = Optional.of(isDefining);
      return this;
    }
    /** @param amountType */
    public SubstanceSpecification_RelationshipBuilder.Impl withAmountType(
        @NonNull CodeableConcept amountType) {
      this.amountType = Optional.of(amountType);
      return this;
    }

    public SubstanceSpecification_RelationshipBuilder.Impl withAmountType(
        @NonNull CodeableConceptBuilder amountType) {
      this.amountType = Optional.of(amountType.build());
      return this;
    }
    /**
     * @param substance Field is a 'choice' field. Type should be one of CodeableConcept, Reference.
     *     To pass the value in, wrap with one of the
     *     SubstanceSpecification_RelationshipBuilder.substance static methods
     */
    public SubstanceSpecification_RelationshipBuilder.Impl withSubstance(
        @NonNull ChoiceCodeableConceptOrReference substance) {
      this.substance = Optional.of(substance);
      return this;
    }
    /**
     * @param relationship - A link between this substance and another, with details of the
     *     relationship.
     */
    public SubstanceSpecification_RelationshipBuilder.Impl withRelationship(
        @NonNull CodeableConcept relationship) {
      this.relationship = Optional.of(relationship);
      return this;
    }

    public SubstanceSpecification_RelationshipBuilder.Impl withRelationship(
        @NonNull CodeableConceptBuilder relationship) {
      this.relationship = Optional.of(relationship.build());
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
    public SubstanceSpecification_RelationshipBuilder.Impl withModifierExtension(
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
    public SubstanceSpecification_RelationshipBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceSpecification_RelationshipBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param amountRatioLowLimit */
    public SubstanceSpecification_RelationshipBuilder.Impl withAmountRatioLowLimit(
        @NonNull Ratio amountRatioLowLimit) {
      this.amountRatioLowLimit = Optional.of(amountRatioLowLimit);
      return this;
    }

    public SubstanceSpecification_RelationshipBuilder.Impl withAmountRatioLowLimit(
        @NonNull RatioBuilder amountRatioLowLimit) {
      this.amountRatioLowLimit = Optional.of(amountRatioLowLimit.build());
      return this;
    }

    public SubstanceSpecification.Relationship build() {
      return new SubstanceSpecification.Relationship(
          OptionConverters.toScala(id),
          source.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(amount),
          OptionConverters.toScala(isDefining.map(x -> (Object) x)),
          OptionConverters.toScala(amountType),
          (Option) OptionConverters.toScala(substance),
          OptionConverters.toScala(relationship),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(amountRatioLowLimit),
          LitUtils.emptyMetaElMap());
    }
  }
}
