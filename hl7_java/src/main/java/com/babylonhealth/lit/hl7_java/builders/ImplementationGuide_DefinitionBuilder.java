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

public class ImplementationGuide_DefinitionBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<ImplementationGuide$Definition$Page> page = Optional.empty();
  private Collection<ImplementationGuide$Definition$Grouping> grouping = Collections.emptyList();
  private Collection<ImplementationGuide$Definition$Resource> resource;
  private Collection<ImplementationGuide$Definition$Template> template = Collections.emptyList();
  private Collection<ImplementationGuide$Definition$Parameter> parameter = Collections.emptyList();

  /**
   * Required fields for {@link ImplementationGuide.Definition}
   *
   * @param resource
   */
  public ImplementationGuide_DefinitionBuilder(
      Collection<ImplementationGuide$Definition$Resource> resource) {
    this.resource = resource;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ImplementationGuide_DefinitionBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ImplementationGuide_DefinitionBuilder withExtension(@NonNull Extension... extension) {
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
  public ImplementationGuide_DefinitionBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
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
  public ImplementationGuide_DefinitionBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
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
  public ImplementationGuide_DefinitionBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param page */
  public ImplementationGuide_DefinitionBuilder withPage(
      @NonNull ImplementationGuide$Definition$Page page) {
    this.page = Optional.of(page);
    return this;
  }
  /** @param grouping */
  public ImplementationGuide_DefinitionBuilder withGrouping(
      @NonNull ImplementationGuide$Definition$Grouping... grouping) {
    this.grouping = Arrays.asList(grouping);
    return this;
  }
  /** @param grouping */
  public ImplementationGuide_DefinitionBuilder withGrouping(
      @NonNull Collection<ImplementationGuide$Definition$Grouping> grouping) {
    this.grouping = Collections.unmodifiableCollection(grouping);
    return this;
  }
  /** @param template */
  public ImplementationGuide_DefinitionBuilder withTemplate(
      @NonNull ImplementationGuide$Definition$Template... template) {
    this.template = Arrays.asList(template);
    return this;
  }
  /** @param template */
  public ImplementationGuide_DefinitionBuilder withTemplate(
      @NonNull Collection<ImplementationGuide$Definition$Template> template) {
    this.template = Collections.unmodifiableCollection(template);
    return this;
  }
  /** @param parameter */
  public ImplementationGuide_DefinitionBuilder withParameter(
      @NonNull ImplementationGuide$Definition$Parameter... parameter) {
    this.parameter = Arrays.asList(parameter);
    return this;
  }
  /** @param parameter */
  public ImplementationGuide_DefinitionBuilder withParameter(
      @NonNull Collection<ImplementationGuide$Definition$Parameter> parameter) {
    this.parameter = Collections.unmodifiableCollection(parameter);
    return this;
  }

  public ImplementationGuide.Definition build() {
    return new ImplementationGuide.Definition(
        OptionConverters.toScala(id),
        extension.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(page),
        grouping.stream().collect(new LitSeqJCollector<>()),
        resource.stream().collect(new NonEmptyLitSeqJCollector<>()),
        template.stream().collect(new LitSeqJCollector<>()),
        parameter.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
