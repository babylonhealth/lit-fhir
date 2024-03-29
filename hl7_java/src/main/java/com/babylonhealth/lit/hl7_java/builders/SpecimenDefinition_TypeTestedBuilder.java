package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.SPECIMEN_CONTAINED_PREFERENCE;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface SpecimenDefinition_TypeTestedBuilder {
  public SpecimenDefinition.TypeTested build();

  public static Impl init(SPECIMEN_CONTAINED_PREFERENCE preference) {
    return new Impl(preference);
  }

  public static Impl builder(SPECIMEN_CONTAINED_PREFERENCE preference) {
    return new Impl(preference);
  }

  public class Impl implements SpecimenDefinition_TypeTestedBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Boolean> isDerived = Optional.empty();
    private SPECIMEN_CONTAINED_PREFERENCE preference;
    private Optional<String> requirement = Optional.empty();
    private Optional<Duration> retentionTime = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<CodeableConcept> rejectionCriterion = Collections.emptyList();
    private Collection<SpecimenDefinition$TypeTested$Handling> handling = Collections.emptyList();
    private Optional<SpecimenDefinition$TypeTested$Container> container = Optional.empty();

    /**
     * Required fields for {@link SpecimenDefinition.TypeTested}
     *
     * @param preference
     */
    public Impl(SPECIMEN_CONTAINED_PREFERENCE preference) {
      this.preference = preference;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SpecimenDefinition_TypeTestedBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type */
    public SpecimenDefinition_TypeTestedBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public SpecimenDefinition_TypeTestedBuilder.Impl withType(
        @NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SpecimenDefinition_TypeTestedBuilder.Impl withExtension(
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
    public SpecimenDefinition_TypeTestedBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SpecimenDefinition_TypeTestedBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param isDerived */
    public SpecimenDefinition_TypeTestedBuilder.Impl withIsDerived(@NonNull Boolean isDerived) {
      this.isDerived = Optional.of(isDerived);
      return this;
    }
    /** @param requirement */
    public SpecimenDefinition_TypeTestedBuilder.Impl withRequirement(@NonNull String requirement) {
      this.requirement = Optional.of(requirement);
      return this;
    }
    /** @param retentionTime */
    public SpecimenDefinition_TypeTestedBuilder.Impl withRetentionTime(
        @NonNull Duration retentionTime) {
      this.retentionTime = Optional.of(retentionTime);
      return this;
    }

    public SpecimenDefinition_TypeTestedBuilder.Impl withRetentionTime(
        @NonNull DurationBuilder retentionTime) {
      this.retentionTime = Optional.of(retentionTime.build());
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
    public SpecimenDefinition_TypeTestedBuilder.Impl withModifierExtension(
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
    public SpecimenDefinition_TypeTestedBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SpecimenDefinition_TypeTestedBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param rejectionCriterion */
    public SpecimenDefinition_TypeTestedBuilder.Impl withRejectionCriterion(
        @NonNull CodeableConcept... rejectionCriterion) {
      this.rejectionCriterion = Arrays.asList(rejectionCriterion);
      return this;
    }
    /** @param rejectionCriterion */
    public SpecimenDefinition_TypeTestedBuilder.Impl withRejectionCriterion(
        @NonNull Collection<CodeableConcept> rejectionCriterion) {
      this.rejectionCriterion = Collections.unmodifiableCollection(rejectionCriterion);
      return this;
    }

    public SpecimenDefinition_TypeTestedBuilder.Impl withRejectionCriterion(
        @NonNull CodeableConceptBuilder... rejectionCriterion) {
      this.rejectionCriterion =
          Arrays.stream(rejectionCriterion).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param handling */
    public SpecimenDefinition_TypeTestedBuilder.Impl withHandling(
        @NonNull SpecimenDefinition$TypeTested$Handling... handling) {
      this.handling = Arrays.asList(handling);
      return this;
    }
    /** @param handling */
    public SpecimenDefinition_TypeTestedBuilder.Impl withHandling(
        @NonNull Collection<SpecimenDefinition$TypeTested$Handling> handling) {
      this.handling = Collections.unmodifiableCollection(handling);
      return this;
    }

    public SpecimenDefinition_TypeTestedBuilder.Impl withHandling(
        @NonNull SpecimenDefinition_TypeTested_HandlingBuilder... handling) {
      this.handling = Arrays.stream(handling).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param container */
    public SpecimenDefinition_TypeTestedBuilder.Impl withContainer(
        @NonNull SpecimenDefinition$TypeTested$Container container) {
      this.container = Optional.of(container);
      return this;
    }

    public SpecimenDefinition_TypeTestedBuilder.Impl withContainer(
        @NonNull SpecimenDefinition_TypeTested_ContainerBuilder container) {
      this.container = Optional.of(container.build());
      return this;
    }

    public SpecimenDefinition.TypeTested build() {
      return new SpecimenDefinition.TypeTested(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(isDerived.map(x -> (Object) x)),
          preference,
          OptionConverters.toScala(requirement),
          OptionConverters.toScala(retentionTime),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          rejectionCriterion.stream().collect(new LitSeqJCollector<>()),
          handling.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(container),
          LitUtils.emptyMetaElMap());
    }
  }
}
