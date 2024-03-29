package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.REACTION_EVENT_SEVERITY;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface AllergyIntolerance_ReactionBuilder {
  public AllergyIntolerance.Reaction build();

  public static Impl init(Collection<CodeableConcept> manifestation) {
    return new Impl(manifestation);
  }

  public static Impl builder(Collection<CodeableConceptBuilder> manifestation) {
    return new Impl(new LitSeq<>(manifestation).map(CodeableConceptBuilder::build));
  }

  public class Impl implements AllergyIntolerance_ReactionBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<FHIRDateTime> onset = Optional.empty();
    private Optional<REACTION_EVENT_SEVERITY> severity = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<CodeableConcept> substance = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Collection<CodeableConcept> manifestation;
    private Optional<CodeableConcept> exposureRoute = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link AllergyIntolerance.Reaction}
     *
     * @param manifestation
     */
    public Impl(Collection<CodeableConcept> manifestation) {
      this.manifestation = manifestation;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public AllergyIntolerance_ReactionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param note - Additional narrative about the propensity for the Adverse Reaction, not
     *     captured in other fields.
     */
    public AllergyIntolerance_ReactionBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Additional narrative about the propensity for the Adverse Reaction, not
     *     captured in other fields.
     */
    public AllergyIntolerance_ReactionBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public AllergyIntolerance_ReactionBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param onset - Estimated or actual date, date-time, or age when allergy or intolerance was
     *     identified.
     */
    public AllergyIntolerance_ReactionBuilder.Impl withOnset(@NonNull FHIRDateTime onset) {
      this.onset = Optional.of(onset);
      return this;
    }
    /** @param severity */
    public AllergyIntolerance_ReactionBuilder.Impl withSeverity(
        @NonNull REACTION_EVENT_SEVERITY severity) {
      this.severity = Optional.of(severity);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public AllergyIntolerance_ReactionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public AllergyIntolerance_ReactionBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public AllergyIntolerance_ReactionBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param substance */
    public AllergyIntolerance_ReactionBuilder.Impl withSubstance(
        @NonNull CodeableConcept substance) {
      this.substance = Optional.of(substance);
      return this;
    }

    public AllergyIntolerance_ReactionBuilder.Impl withSubstance(
        @NonNull CodeableConceptBuilder substance) {
      this.substance = Optional.of(substance.build());
      return this;
    }
    /** @param description */
    public AllergyIntolerance_ReactionBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param exposureRoute */
    public AllergyIntolerance_ReactionBuilder.Impl withExposureRoute(
        @NonNull CodeableConcept exposureRoute) {
      this.exposureRoute = Optional.of(exposureRoute);
      return this;
    }

    public AllergyIntolerance_ReactionBuilder.Impl withExposureRoute(
        @NonNull CodeableConceptBuilder exposureRoute) {
      this.exposureRoute = Optional.of(exposureRoute.build());
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
    public AllergyIntolerance_ReactionBuilder.Impl withModifierExtension(
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
    public AllergyIntolerance_ReactionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public AllergyIntolerance_ReactionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public AllergyIntolerance.Reaction build() {
      return new AllergyIntolerance.Reaction(
          OptionConverters.toScala(id),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(onset),
          OptionConverters.toScala(severity),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(substance),
          OptionConverters.toScala(description),
          manifestation.stream().collect(new NonEmptyLitSeqJCollector<>()),
          OptionConverters.toScala(exposureRoute),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
