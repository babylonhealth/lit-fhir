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

public interface TerminologyCapabilities_ExpansionBuilder {
  public TerminologyCapabilities.Expansion build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements TerminologyCapabilities_ExpansionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Boolean> paging = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Boolean> incomplete = Optional.empty();
    private Optional<String> textFilter = Optional.empty();
    private Optional<Boolean> hierarchical = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<TerminologyCapabilities$Expansion$Parameter> parameter =
        Collections.emptyList();

    /** Required fields for {@link TerminologyCapabilities.Expansion} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public TerminologyCapabilities_ExpansionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param paging */
    public TerminologyCapabilities_ExpansionBuilder.Impl withPaging(@NonNull Boolean paging) {
      this.paging = Optional.of(paging);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public TerminologyCapabilities_ExpansionBuilder.Impl withExtension(
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
    public TerminologyCapabilities_ExpansionBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /** @param incomplete */
    public TerminologyCapabilities_ExpansionBuilder.Impl withIncomplete(
        @NonNull Boolean incomplete) {
      this.incomplete = Optional.of(incomplete);
      return this;
    }
    /** @param textFilter */
    public TerminologyCapabilities_ExpansionBuilder.Impl withTextFilter(
        @NonNull String textFilter) {
      this.textFilter = Optional.of(textFilter);
      return this;
    }
    /** @param hierarchical */
    public TerminologyCapabilities_ExpansionBuilder.Impl withHierarchical(
        @NonNull Boolean hierarchical) {
      this.hierarchical = Optional.of(hierarchical);
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
    public TerminologyCapabilities_ExpansionBuilder.Impl withModifierExtension(
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
    public TerminologyCapabilities_ExpansionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /** @param parameter */
    public TerminologyCapabilities_ExpansionBuilder.Impl withParameter(
        @NonNull TerminologyCapabilities$Expansion$Parameter... parameter) {
      this.parameter = Arrays.asList(parameter);
      return this;
    }
    /** @param parameter */
    public TerminologyCapabilities_ExpansionBuilder.Impl withParameter(
        @NonNull Collection<TerminologyCapabilities$Expansion$Parameter> parameter) {
      this.parameter = Collections.unmodifiableCollection(parameter);
      return this;
    }

    public TerminologyCapabilities.Expansion build() {
      return new TerminologyCapabilities.Expansion(
          OptionConverters.toScala(id),
          OptionConverters.toScala(paging.map(x -> (Object) x)),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(incomplete.map(x -> (Object) x)),
          OptionConverters.toScala(textFilter),
          OptionConverters.toScala(hierarchical.map(x -> (Object) x)),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          parameter.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
