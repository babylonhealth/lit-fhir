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

public interface ValueSet_ExpansionBuilder {
  public ValueSet.Expansion build();

  public static Impl init(FHIRDateTime timestamp) {
    return new Impl(timestamp);
  }

  public static Impl builder(FHIRDateTime timestamp) {
    return new Impl(timestamp);
  }

  public class Impl implements ValueSet_ExpansionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Integer> total = Optional.empty();
    private Optional<Integer> offset = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private FHIRDateTime timestamp;
    private Optional<String> identifier = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ValueSet$Expansion$Contains> contains = Collections.emptyList();
    private Collection<ValueSet$Expansion$Parameter> parameter = Collections.emptyList();

    /**
     * Required fields for {@link ValueSet.Expansion}
     *
     * @param timestamp
     */
    public Impl(FHIRDateTime timestamp) {
      this.timestamp = timestamp;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ValueSet_ExpansionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param total */
    public ValueSet_ExpansionBuilder.Impl withTotal(@NonNull Integer total) {
      this.total = Optional.of(total);
      return this;
    }
    /** @param offset */
    public ValueSet_ExpansionBuilder.Impl withOffset(@NonNull Integer offset) {
      this.offset = Optional.of(offset);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ValueSet_ExpansionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ValueSet_ExpansionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this value set when it is
     *     represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public ValueSet_ExpansionBuilder.Impl withIdentifier(@NonNull String identifier) {
      this.identifier = Optional.of(identifier);
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
    public ValueSet_ExpansionBuilder.Impl withModifierExtension(
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
    public ValueSet_ExpansionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /** @param contains */
    public ValueSet_ExpansionBuilder.Impl withContains(
        @NonNull ValueSet$Expansion$Contains... contains) {
      this.contains = Arrays.asList(contains);
      return this;
    }
    /** @param contains */
    public ValueSet_ExpansionBuilder.Impl withContains(
        @NonNull Collection<ValueSet$Expansion$Contains> contains) {
      this.contains = Collections.unmodifiableCollection(contains);
      return this;
    }
    /** @param parameter */
    public ValueSet_ExpansionBuilder.Impl withParameter(
        @NonNull ValueSet$Expansion$Parameter... parameter) {
      this.parameter = Arrays.asList(parameter);
      return this;
    }
    /** @param parameter */
    public ValueSet_ExpansionBuilder.Impl withParameter(
        @NonNull Collection<ValueSet$Expansion$Parameter> parameter) {
      this.parameter = Collections.unmodifiableCollection(parameter);
      return this;
    }

    public ValueSet.Expansion build() {
      return new ValueSet.Expansion(
          OptionConverters.toScala(id),
          OptionConverters.toScala(total.map(x -> (Object) x)),
          OptionConverters.toScala(offset.map(x -> (Object) x)),
          extension.stream().collect(new LitSeqJCollector<>()),
          timestamp,
          OptionConverters.toScala(identifier),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          contains.stream().collect(new LitSeqJCollector<>()),
          parameter.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
