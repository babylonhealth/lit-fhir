package com.babylonhealth.lit.hl7_java.builders;

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
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface MedicinalProductIngredient_SpecifiedSubstanceBuilder {
  public MedicinalProductIngredient.SpecifiedSubstance build();

  public static Impl init(CodeableConcept code, CodeableConcept group) {
    return new Impl(code, group);
  }

  public static Impl builder(CodeableConceptBuilder code, CodeableConceptBuilder group) {
    return new Impl(code.build(), group.build());
  }

  public class Impl implements MedicinalProductIngredient_SpecifiedSubstanceBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept code;
    private CodeableConcept group;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<CodeableConcept> confidentiality = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<MedicinalProductIngredient$SpecifiedSubstance$Strength> strength =
        Collections.emptyList();

    /**
     * Required fields for {@link MedicinalProductIngredient.SpecifiedSubstance}
     *
     * @param code
     * @param group
     */
    public Impl(CodeableConcept code, CodeableConcept group) {
      this.code = code;
      this.group = group;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicinalProductIngredient_SpecifiedSubstanceBuilder.Impl withId(@NonNull String id) {
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
    public MedicinalProductIngredient_SpecifiedSubstanceBuilder.Impl withExtension(
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
    public MedicinalProductIngredient_SpecifiedSubstanceBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstanceBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param confidentiality */
    public MedicinalProductIngredient_SpecifiedSubstanceBuilder.Impl withConfidentiality(
        @NonNull CodeableConcept confidentiality) {
      this.confidentiality = Optional.of(confidentiality);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstanceBuilder.Impl withConfidentiality(
        @NonNull CodeableConceptBuilder confidentiality) {
      this.confidentiality = Optional.of(confidentiality.build());
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
    public MedicinalProductIngredient_SpecifiedSubstanceBuilder.Impl withModifierExtension(
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
    public MedicinalProductIngredient_SpecifiedSubstanceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstanceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param strength */
    public MedicinalProductIngredient_SpecifiedSubstanceBuilder.Impl withStrength(
        @NonNull MedicinalProductIngredient$SpecifiedSubstance$Strength... strength) {
      this.strength = Arrays.asList(strength);
      return this;
    }
    /** @param strength */
    public MedicinalProductIngredient_SpecifiedSubstanceBuilder.Impl withStrength(
        @NonNull Collection<MedicinalProductIngredient$SpecifiedSubstance$Strength> strength) {
      this.strength = Collections.unmodifiableCollection(strength);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstanceBuilder.Impl withStrength(
        @NonNull MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder... strength) {
      this.strength = Arrays.stream(strength).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicinalProductIngredient.SpecifiedSubstance build() {
      return new MedicinalProductIngredient.SpecifiedSubstance(
          OptionConverters.toScala(id),
          code,
          group,
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(confidentiality),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          strength.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
