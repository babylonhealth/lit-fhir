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

public class PlanDefinition_GoalBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CodeableConcept> start = Optional.empty();
  private Optional<CodeableConcept> category = Optional.empty();
  private Optional<CodeableConcept> priority = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<CodeableConcept> addresses = Collections.emptyList();
  private CodeableConcept description;
  private Collection<RelatedArtifact> documentation = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<PlanDefinition$Goal$Target> target = Collections.emptyList();

  /**
   * Required fields for {@link PlanDefinition.Goal}
   *
   * @param description - A free text natural language description of the plan definition from a
   *     consumer's perspective.
   */
  public PlanDefinition_GoalBuilder(CodeableConcept description) {
    this.description = description;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public PlanDefinition_GoalBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param start */
  public PlanDefinition_GoalBuilder withStart(@NonNull CodeableConcept start) {
    this.start = Optional.of(start);
    return this;
  }
  /** @param category */
  public PlanDefinition_GoalBuilder withCategory(@NonNull CodeableConcept category) {
    this.category = Optional.of(category);
    return this;
  }
  /** @param priority */
  public PlanDefinition_GoalBuilder withPriority(@NonNull CodeableConcept priority) {
    this.priority = Optional.of(priority);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public PlanDefinition_GoalBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public PlanDefinition_GoalBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param addresses */
  public PlanDefinition_GoalBuilder withAddresses(@NonNull CodeableConcept... addresses) {
    this.addresses = Arrays.asList(addresses);
    return this;
  }
  /** @param addresses */
  public PlanDefinition_GoalBuilder withAddresses(@NonNull Collection<CodeableConcept> addresses) {
    this.addresses = Collections.unmodifiableCollection(addresses);
    return this;
  }
  /** @param documentation */
  public PlanDefinition_GoalBuilder withDocumentation(@NonNull RelatedArtifact... documentation) {
    this.documentation = Arrays.asList(documentation);
    return this;
  }
  /** @param documentation */
  public PlanDefinition_GoalBuilder withDocumentation(
      @NonNull Collection<RelatedArtifact> documentation) {
    this.documentation = Collections.unmodifiableCollection(documentation);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public PlanDefinition_GoalBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public PlanDefinition_GoalBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param target */
  public PlanDefinition_GoalBuilder withTarget(@NonNull PlanDefinition$Goal$Target... target) {
    this.target = Arrays.asList(target);
    return this;
  }
  /** @param target */
  public PlanDefinition_GoalBuilder withTarget(
      @NonNull Collection<PlanDefinition$Goal$Target> target) {
    this.target = Collections.unmodifiableCollection(target);
    return this;
  }

  public PlanDefinition.Goal build() {
    return new PlanDefinition.Goal(
        OptionConverters.toScala(id),
        OptionConverters.toScala(start),
        OptionConverters.toScala(category),
        OptionConverters.toScala(priority),
        extension.stream().collect(new LitSeqJCollector<>()),
        addresses.stream().collect(new LitSeqJCollector<>()),
        description,
        documentation.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        target.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
