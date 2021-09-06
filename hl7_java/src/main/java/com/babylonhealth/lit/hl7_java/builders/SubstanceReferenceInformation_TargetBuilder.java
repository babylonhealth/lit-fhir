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

public interface SubstanceReferenceInformation_TargetBuilder {
  public SubstanceReferenceInformation.Target build();

  public static Impl init() {
    return new Impl();
  }

  public static Choice_1527751898 amount(Quantity q) {
    return new Choice_1527751898(q);
  }

  public static Choice_1527751898 amount(Range r) {
    return new Choice_1527751898(r);
  }

  public static Choice_1527751898 amount(String s) {
    return new Choice_1527751898(s);
  }

  public class Impl implements SubstanceReferenceInformation_TargetBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<Identifier> target = Optional.empty();
    private Collection<Reference> source = Collections.emptyList();
    private Optional<CodeableConcept> organism = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Choice_1527751898> amount = Optional.empty();
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
    /** @param target - Todo. */
    public SubstanceReferenceInformation_TargetBuilder.Impl withTarget(@NonNull Identifier target) {
      this.target = Optional.of(target);
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
    /** @param organism */
    public SubstanceReferenceInformation_TargetBuilder.Impl withOrganism(
        @NonNull CodeableConcept organism) {
      this.organism = Optional.of(organism);
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
    /**
     * @param amount Field is a 'choice' field. Type should be one of Quantity, Range, String. To
     *     pass the value in, wrap with one of the
     *     SubstanceReferenceInformation_TargetBuilder.amount static methods
     */
    public SubstanceReferenceInformation_TargetBuilder.Impl withAmount(
        @NonNull Choice_1527751898 amount) {
      this.amount = Optional.of(amount);
      return this;
    }
    /** @param amountType */
    public SubstanceReferenceInformation_TargetBuilder.Impl withAmountType(
        @NonNull CodeableConcept amountType) {
      this.amountType = Optional.of(amountType);
      return this;
    }
    /** @param interaction */
    public SubstanceReferenceInformation_TargetBuilder.Impl withInteraction(
        @NonNull CodeableConcept interaction) {
      this.interaction = Optional.of(interaction);
      return this;
    }
    /** @param organismType */
    public SubstanceReferenceInformation_TargetBuilder.Impl withOrganismType(
        @NonNull CodeableConcept organismType) {
      this.organismType = Optional.of(organismType);
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
