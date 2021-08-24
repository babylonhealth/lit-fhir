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

public interface ResearchStudy_ComparisonGroupBuilder {
  public ResearchStudy.ComparisonGroup build();

  public static Impl init(String name) {
    return new Impl(name);
  }

  public static Impl builder(String name) {
    return new Impl(name);
  }

  public static ChoiceIdentifierOrUri identifier(Identifier i) {
    return new ChoiceIdentifierOrUri(i);
  }

  public static ChoiceIdentifierOrUri identifier(String s) {
    return new ChoiceIdentifierOrUri(s);
  }

  public class Impl implements ResearchStudy_ComparisonGroupBuilder {
    private Optional<String> id = Optional.empty();
    private String name;
    private Optional<CodeableConcept> _type = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<ChoiceIdentifierOrUri> identifier = Optional.empty();
    private Optional<Reference> observedGroup = Optional.empty();
    private Collection<Reference> intendedExposure = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link ResearchStudy.ComparisonGroup}
     *
     * @param name - Name for this study (computer friendly).
     */
    public Impl(String name) {
      this.name = name;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ResearchStudy_ComparisonGroupBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type */
    public ResearchStudy_ComparisonGroupBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public ResearchStudy_ComparisonGroupBuilder.Impl withType(
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
    public ResearchStudy_ComparisonGroupBuilder.Impl withExtension(
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
    public ResearchStudy_ComparisonGroupBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ResearchStudy_ComparisonGroupBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - A full description of how the study is being conducted. For a
     *     description of what the study objectives are see ResearchStudy.objective.description.
     */
    public ResearchStudy_ComparisonGroupBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param identifier - Identifiers assigned to this research study by the sponsor or other
     *     systems. Field is a 'choice' field. Type should be one of Identifier, String. To pass the
     *     value in, wrap with one of the ResearchStudy_ComparisonGroupBuilder.identifier static
     *     methods
     */
    public ResearchStudy_ComparisonGroupBuilder.Impl withIdentifier(
        @NonNull ChoiceIdentifierOrUri identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }
    /** @param observedGroup */
    public ResearchStudy_ComparisonGroupBuilder.Impl withObservedGroup(
        @NonNull Reference observedGroup) {
      this.observedGroup = Optional.of(observedGroup);
      return this;
    }

    public ResearchStudy_ComparisonGroupBuilder.Impl withObservedGroup(
        @NonNull ReferenceBuilder observedGroup) {
      this.observedGroup = Optional.of(observedGroup.build());
      return this;
    }
    /** @param intendedExposure */
    public ResearchStudy_ComparisonGroupBuilder.Impl withIntendedExposure(
        @NonNull Reference... intendedExposure) {
      this.intendedExposure = Arrays.asList(intendedExposure);
      return this;
    }
    /** @param intendedExposure */
    public ResearchStudy_ComparisonGroupBuilder.Impl withIntendedExposure(
        @NonNull Collection<Reference> intendedExposure) {
      this.intendedExposure = Collections.unmodifiableCollection(intendedExposure);
      return this;
    }

    public ResearchStudy_ComparisonGroupBuilder.Impl withIntendedExposure(
        @NonNull ReferenceBuilder... intendedExposure) {
      this.intendedExposure = Arrays.stream(intendedExposure).map(e -> e.build()).collect(toList());
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
    public ResearchStudy_ComparisonGroupBuilder.Impl withModifierExtension(
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
    public ResearchStudy_ComparisonGroupBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ResearchStudy_ComparisonGroupBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public ResearchStudy.ComparisonGroup build() {
      return new ResearchStudy.ComparisonGroup(
          OptionConverters.toScala(id),
          name,
          OptionConverters.toScala(_type),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          (Option) OptionConverters.toScala(identifier),
          OptionConverters.toScala(observedGroup),
          intendedExposure.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
