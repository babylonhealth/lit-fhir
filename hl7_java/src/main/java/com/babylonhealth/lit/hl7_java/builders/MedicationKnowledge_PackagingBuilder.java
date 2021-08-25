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

public interface MedicationKnowledge_PackagingBuilder {
  public MedicationKnowledge.Packaging build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements MedicationKnowledge_PackagingBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<MedicationKnowledge.Cost> cost = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<Reference> device = Optional.empty();
    private Optional<Quantity> quantity = Optional.empty();
    private Optional<CodeableConcept> material = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<MedicationKnowledge.Packaging> packaging = Collections.emptyList();
    private Optional<Identifier> identifier = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link MedicationKnowledge.Packaging} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicationKnowledge_PackagingBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param cost - The price of the medication. */
    public MedicationKnowledge_PackagingBuilder.Impl withCost(
        @NonNull MedicationKnowledge.Cost cost) {
      this.cost = Optional.of(cost);
      return this;
    }

    public MedicationKnowledge_PackagingBuilder.Impl withCost(
        @NonNull MedicationKnowledge_CostBuilder cost) {
      this.cost = Optional.of(cost.build());
      return this;
    }
    /** @param _type */
    public MedicationKnowledge_PackagingBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public MedicationKnowledge_PackagingBuilder.Impl withType(
        @NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /**
     * @param device - A device associated with the medication (for example, a drug coated catheter
     *     or a drug impregnated dressing).
     */
    public MedicationKnowledge_PackagingBuilder.Impl withDevice(@NonNull Reference device) {
      this.device = Optional.of(device);
      return this;
    }

    public MedicationKnowledge_PackagingBuilder.Impl withDevice(@NonNull ReferenceBuilder device) {
      this.device = Optional.of(device.build());
      return this;
    }
    /** @param quantity */
    public MedicationKnowledge_PackagingBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public MedicationKnowledge_PackagingBuilder.Impl withQuantity(
        @NonNull QuantityBuilder quantity) {
      this.quantity = Optional.of(quantity.build());
      return this;
    }
    /** @param material */
    public MedicationKnowledge_PackagingBuilder.Impl withMaterial(
        @NonNull CodeableConcept material) {
      this.material = Optional.of(material);
      return this;
    }

    public MedicationKnowledge_PackagingBuilder.Impl withMaterial(
        @NonNull CodeableConceptBuilder material) {
      this.material = Optional.of(material.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MedicationKnowledge_PackagingBuilder.Impl withExtension(
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
    public MedicationKnowledge_PackagingBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicationKnowledge_PackagingBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param packaging - Information that only applies to packages (not products). */
    public MedicationKnowledge_PackagingBuilder.Impl withPackaging(
        @NonNull MedicationKnowledge.Packaging... packaging) {
      this.packaging = Arrays.asList(packaging);
      return this;
    }
    /** @param packaging - Information that only applies to packages (not products). */
    public MedicationKnowledge_PackagingBuilder.Impl withPackaging(
        @NonNull Collection<MedicationKnowledge.Packaging> packaging) {
      this.packaging = Collections.unmodifiableCollection(packaging);
      return this;
    }

    public MedicationKnowledge_PackagingBuilder.Impl withPackaging(
        @NonNull MedicationKnowledge_PackagingBuilder... packaging) {
      this.packaging = Arrays.stream(packaging).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - Business identifier for this medication. */
    public MedicationKnowledge_PackagingBuilder.Impl withIdentifier(
        @NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public MedicationKnowledge_PackagingBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
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
    public MedicationKnowledge_PackagingBuilder.Impl withModifierExtension(
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
    public MedicationKnowledge_PackagingBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicationKnowledge_PackagingBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicationKnowledge.Packaging build() {
      return new MedicationKnowledge.Packaging(
          OptionConverters.toScala(id),
          OptionConverters.toScala(cost),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(device),
          OptionConverters.toScala(quantity),
          OptionConverters.toScala(material),
          extension.stream().collect(new LitSeqJCollector<>()),
          packaging.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(identifier),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
