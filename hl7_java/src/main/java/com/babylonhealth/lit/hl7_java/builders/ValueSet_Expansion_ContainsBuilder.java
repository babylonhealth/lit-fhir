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

public interface ValueSet_Expansion_ContainsBuilder {
  public ValueSet$Expansion$Contains build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements ValueSet_Expansion_ContainsBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> code = Optional.empty();
    private Optional<String> system = Optional.empty();
    private Optional<String> version = Optional.empty();
    private Optional<String> display = Optional.empty();
    private Optional<Boolean> _abstract = Optional.empty();
    private Optional<Boolean> inactive = Optional.empty();
    private Collection<ValueSet$Expansion$Contains> contains = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<ValueSet$Compose$Include$Concept$Designation> designation =
        Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ValueSet$Expansion$Contains$Property> property = Collections.emptyList();

    /** Required fields for {@link ValueSet$Expansion$Contains} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ValueSet_Expansion_ContainsBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param code */
    public ValueSet_Expansion_ContainsBuilder.Impl withCode(@NonNull String code) {
      this.code = Optional.of(code);
      return this;
    }
    /** @param system */
    public ValueSet_Expansion_ContainsBuilder.Impl withSystem(@NonNull String system) {
      this.system = Optional.of(system);
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the value set when
     *     it is referenced in a specification, model, design or instance. This is an arbitrary
     *     value managed by the value set author and is not expected to be globally unique. For
     *     example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available.
     *     There is also no expectation that versions can be placed in a lexicographical sequence.
     */
    public ValueSet_Expansion_ContainsBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /** @param display */
    public ValueSet_Expansion_ContainsBuilder.Impl withDisplay(@NonNull String display) {
      this.display = Optional.of(display);
      return this;
    }
    /** @param _abstract */
    public ValueSet_Expansion_ContainsBuilder.Impl withAbstract(@NonNull Boolean _abstract) {
      this._abstract = Optional.of(_abstract);
      return this;
    }
    /** @param inactive */
    public ValueSet_Expansion_ContainsBuilder.Impl withInactive(@NonNull Boolean inactive) {
      this.inactive = Optional.of(inactive);
      return this;
    }
    /** @param contains */
    public ValueSet_Expansion_ContainsBuilder.Impl withContains(
        @NonNull ValueSet$Expansion$Contains... contains) {
      this.contains = Arrays.asList(contains);
      return this;
    }
    /** @param contains */
    public ValueSet_Expansion_ContainsBuilder.Impl withContains(
        @NonNull Collection<ValueSet$Expansion$Contains> contains) {
      this.contains = Collections.unmodifiableCollection(contains);
      return this;
    }

    public ValueSet_Expansion_ContainsBuilder.Impl withContains(
        @NonNull ValueSet_Expansion_ContainsBuilder... contains) {
      this.contains = Arrays.stream(contains).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ValueSet_Expansion_ContainsBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ValueSet_Expansion_ContainsBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ValueSet_Expansion_ContainsBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param designation */
    public ValueSet_Expansion_ContainsBuilder.Impl withDesignation(
        @NonNull ValueSet$Compose$Include$Concept$Designation... designation) {
      this.designation = Arrays.asList(designation);
      return this;
    }
    /** @param designation */
    public ValueSet_Expansion_ContainsBuilder.Impl withDesignation(
        @NonNull Collection<ValueSet$Compose$Include$Concept$Designation> designation) {
      this.designation = Collections.unmodifiableCollection(designation);
      return this;
    }

    public ValueSet_Expansion_ContainsBuilder.Impl withDesignation(
        @NonNull ValueSet_Compose_Include_Concept_DesignationBuilder... designation) {
      this.designation = Arrays.stream(designation).map(e -> e.build()).collect(toList());
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
    public ValueSet_Expansion_ContainsBuilder.Impl withModifierExtension(
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
    public ValueSet_Expansion_ContainsBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ValueSet_Expansion_ContainsBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param property */
    public ValueSet_Expansion_ContainsBuilder.Impl withProperty(
        @NonNull ValueSet$Expansion$Contains$Property... property) {
      this.property = Arrays.asList(property);
      return this;
    }
    /** @param property */
    public ValueSet_Expansion_ContainsBuilder.Impl withProperty(
        @NonNull Collection<ValueSet$Expansion$Contains$Property> property) {
      this.property = Collections.unmodifiableCollection(property);
      return this;
    }

    public ValueSet_Expansion_ContainsBuilder.Impl withProperty(
        @NonNull ValueSet_Expansion_Contains_PropertyBuilder... property) {
      this.property = Arrays.stream(property).map(e -> e.build()).collect(toList());
      return this;
    }

    public ValueSet$Expansion$Contains build() {
      return new ValueSet$Expansion$Contains(
          OptionConverters.toScala(id),
          OptionConverters.toScala(code),
          OptionConverters.toScala(system),
          OptionConverters.toScala(version),
          OptionConverters.toScala(display),
          OptionConverters.toScala(_abstract.map(x -> (Object) x)),
          OptionConverters.toScala(inactive.map(x -> (Object) x)),
          contains.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          designation.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          property.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
