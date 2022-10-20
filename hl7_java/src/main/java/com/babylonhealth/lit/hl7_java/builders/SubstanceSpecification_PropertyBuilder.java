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

public interface SubstanceSpecification_PropertyBuilder {
  public SubstanceSpecification.Property build();

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

  public static ChoiceCodeableConceptOrReference definingSubstance(CodeableConcept c) {
    return new ChoiceCodeableConceptOrReference(c);
  }

  public static ChoiceCodeableConceptOrReference definingSubstance(Reference r) {
    return new ChoiceCodeableConceptOrReference(r);
  }

  public class Impl implements SubstanceSpecification_PropertyBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Optional<CodeableConcept> category = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceQuantityOrString> amount = Optional.empty();
    private Optional<String> parameters = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<ChoiceCodeableConceptOrReference> definingSubstance = Optional.empty();

    /** Required fields for {@link SubstanceSpecification.Property} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SubstanceSpecification_PropertyBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param code - Codes associated with the substance. */
    public SubstanceSpecification_PropertyBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public SubstanceSpecification_PropertyBuilder.Impl withCode(
        @NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /** @param category */
    public SubstanceSpecification_PropertyBuilder.Impl withCategory(
        @NonNull CodeableConcept category) {
      this.category = Optional.of(category);
      return this;
    }

    public SubstanceSpecification_PropertyBuilder.Impl withCategory(
        @NonNull CodeableConceptBuilder category) {
      this.category = Optional.of(category.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SubstanceSpecification_PropertyBuilder.Impl withExtension(
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
    public SubstanceSpecification_PropertyBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceSpecification_PropertyBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param amount Field is a 'choice' field. Type should be one of Quantity, String. To pass the
     *     value in, wrap with one of the SubstanceSpecification_PropertyBuilder.amount static
     *     methods
     */
    public SubstanceSpecification_PropertyBuilder.Impl withAmount(
        @NonNull ChoiceQuantityOrString amount) {
      this.amount = Optional.of(amount);
      return this;
    }
    /** @param parameters */
    public SubstanceSpecification_PropertyBuilder.Impl withParameters(@NonNull String parameters) {
      this.parameters = Optional.of(parameters);
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
    public SubstanceSpecification_PropertyBuilder.Impl withModifierExtension(
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
    public SubstanceSpecification_PropertyBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SubstanceSpecification_PropertyBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param definingSubstance Field is a 'choice' field. Type should be one of CodeableConcept,
     *     Reference. To pass the value in, wrap with one of the
     *     SubstanceSpecification_PropertyBuilder.definingSubstance static methods
     */
    public SubstanceSpecification_PropertyBuilder.Impl withDefiningSubstance(
        @NonNull ChoiceCodeableConceptOrReference definingSubstance) {
      this.definingSubstance = Optional.of(definingSubstance);
      return this;
    }

    public SubstanceSpecification.Property build() {
      return new SubstanceSpecification.Property(
          OptionConverters.toScala(id),
          OptionConverters.toScala(code),
          OptionConverters.toScala(category),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(amount),
          OptionConverters.toScala(parameters),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(definingSubstance),
          LitUtils.emptyMetaElMap());
    }
  }
}
