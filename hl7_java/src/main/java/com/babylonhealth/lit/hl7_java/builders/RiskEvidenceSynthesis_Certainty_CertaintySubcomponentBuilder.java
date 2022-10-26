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
import scala.jdk.javaapi.OptionConverters;

public interface RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder {
  public RiskEvidenceSynthesis$Certainty$CertaintySubcomponent build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Collection<CodeableConcept> rating = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link RiskEvidenceSynthesis$Certainty$CertaintySubcomponent} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withId(
        @NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type */
    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withType(
        @NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withType(
        @NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param note - A human-readable string to clarify or explain concepts about the resource. */
    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withNote(
        @NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - A human-readable string to clarify or explain concepts about the resource. */
    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withNote(
        @NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withNote(
        @NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param rating */
    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withRating(
        @NonNull CodeableConcept... rating) {
      this.rating = Arrays.asList(rating);
      return this;
    }
    /** @param rating */
    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withRating(
        @NonNull Collection<CodeableConcept> rating) {
      this.rating = Collections.unmodifiableCollection(rating);
      return this;
    }

    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withRating(
        @NonNull CodeableConceptBuilder... rating) {
      this.rating = Arrays.stream(rating).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withExtension(
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
    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
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
    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withModifierExtension(
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
    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public RiskEvidenceSynthesis_Certainty_CertaintySubcomponentBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public RiskEvidenceSynthesis$Certainty$CertaintySubcomponent build() {
      return new RiskEvidenceSynthesis$Certainty$CertaintySubcomponent(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          note.stream().collect(new LitSeqJCollector<>()),
          rating.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
