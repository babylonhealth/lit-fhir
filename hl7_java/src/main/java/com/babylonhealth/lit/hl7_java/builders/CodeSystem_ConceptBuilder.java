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

public interface CodeSystem_ConceptBuilder {
  public CodeSystem.Concept build();

  public static Impl init(String code) {
    return new Impl(code);
  }

  public static Impl builder(String code) {
    return new Impl(code);
  }

  public class Impl implements CodeSystem_ConceptBuilder {
    private Optional<String> id = Optional.empty();
    private String code;
    private Optional<String> display = Optional.empty();
    private Collection<CodeSystem.Concept> concept = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> definition = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<CodeSystem$Concept$Property> property = Collections.emptyList();
    private Collection<CodeSystem$Concept$Designation> designation = Collections.emptyList();

    /**
     * Required fields for {@link CodeSystem.Concept}
     *
     * @param code
     */
    public Impl(String code) {
      this.code = code;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CodeSystem_ConceptBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param display */
    public CodeSystem_ConceptBuilder.Impl withDisplay(@NonNull String display) {
      this.display = Optional.of(display);
      return this;
    }
    /**
     * @param concept - Concepts that are in the code system. The concept definitions are inherently
     *     hierarchical, but the definitions must be consulted to determine what the meanings of the
     *     hierarchical relationships are.
     */
    public CodeSystem_ConceptBuilder.Impl withConcept(@NonNull CodeSystem.Concept... concept) {
      this.concept = Arrays.asList(concept);
      return this;
    }
    /**
     * @param concept - Concepts that are in the code system. The concept definitions are inherently
     *     hierarchical, but the definitions must be consulted to determine what the meanings of the
     *     hierarchical relationships are.
     */
    public CodeSystem_ConceptBuilder.Impl withConcept(
        @NonNull Collection<CodeSystem.Concept> concept) {
      this.concept = Collections.unmodifiableCollection(concept);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public CodeSystem_ConceptBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public CodeSystem_ConceptBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /** @param definition */
    public CodeSystem_ConceptBuilder.Impl withDefinition(@NonNull String definition) {
      this.definition = Optional.of(definition);
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
    public CodeSystem_ConceptBuilder.Impl withModifierExtension(
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
    public CodeSystem_ConceptBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /**
     * @param property - A property defines an additional slot through which additional information
     *     can be provided about a concept.
     */
    public CodeSystem_ConceptBuilder.Impl withProperty(
        @NonNull CodeSystem$Concept$Property... property) {
      this.property = Arrays.asList(property);
      return this;
    }
    /**
     * @param property - A property defines an additional slot through which additional information
     *     can be provided about a concept.
     */
    public CodeSystem_ConceptBuilder.Impl withProperty(
        @NonNull Collection<CodeSystem$Concept$Property> property) {
      this.property = Collections.unmodifiableCollection(property);
      return this;
    }
    /** @param designation */
    public CodeSystem_ConceptBuilder.Impl withDesignation(
        @NonNull CodeSystem$Concept$Designation... designation) {
      this.designation = Arrays.asList(designation);
      return this;
    }
    /** @param designation */
    public CodeSystem_ConceptBuilder.Impl withDesignation(
        @NonNull Collection<CodeSystem$Concept$Designation> designation) {
      this.designation = Collections.unmodifiableCollection(designation);
      return this;
    }

    public CodeSystem.Concept build() {
      return new CodeSystem.Concept(
          OptionConverters.toScala(id),
          code,
          OptionConverters.toScala(display),
          concept.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(definition),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          property.stream().collect(new LitSeqJCollector<>()),
          designation.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
