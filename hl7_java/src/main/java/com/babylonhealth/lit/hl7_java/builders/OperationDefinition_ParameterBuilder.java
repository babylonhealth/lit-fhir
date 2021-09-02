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
import com.babylonhealth.lit.core.OPERATION_PARAMETER_USE;
import com.babylonhealth.lit.core.ALL_TYPES;
import com.babylonhealth.lit.hl7.SEARCH_PARAM_TYPE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class OperationDefinition_ParameterBuilder {
  private Optional<String> id = Optional.empty();
  private OPERATION_PARAMETER_USE use;
  private Integer min;
  private String max;
  private String name;
  private Optional<ALL_TYPES> _type = Optional.empty();
  private Collection<OperationDefinition.Parameter> part = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<SEARCH_PARAM_TYPE> searchType = Optional.empty();
  private Optional<String> documentation = Optional.empty();
  private Collection<String> targetProfile = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<OperationDefinition$Parameter$Binding> binding = Optional.empty();
  private Collection<OperationDefinition$Parameter$ReferencedFrom> referencedFrom =
      Collections.emptyList();

  /**
   * Required fields for {@link OperationDefinition.Parameter}
   *
   * @param use
   * @param min
   * @param max
   * @param name - A natural language name identifying the operation definition. This name should be
   *     usable as an identifier for the module by machine processing applications such as code
   *     generation.
   */
  public OperationDefinition_ParameterBuilder(
      OPERATION_PARAMETER_USE use, Integer min, String max, String name) {
    this.use = use;
    this.min = min;
    this.max = max;
    this.name = name;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public OperationDefinition_ParameterBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param _type - Indicates whether this operation or named query can be invoked at the resource
   *     type level for any given resource type level (e.g. without needing to choose a specific
   *     resource id for the context).
   */
  public OperationDefinition_ParameterBuilder withType(@NonNull ALL_TYPES _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /** @param part */
  public OperationDefinition_ParameterBuilder withPart(
      @NonNull OperationDefinition.Parameter... part) {
    this.part = Arrays.asList(part);
    return this;
  }
  /** @param part */
  public OperationDefinition_ParameterBuilder withPart(
      @NonNull Collection<OperationDefinition.Parameter> part) {
    this.part = Collections.unmodifiableCollection(part);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public OperationDefinition_ParameterBuilder withExtension(@NonNull Extension... extension) {
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
  public OperationDefinition_ParameterBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param searchType */
  public OperationDefinition_ParameterBuilder withSearchType(
      @NonNull SEARCH_PARAM_TYPE searchType) {
    this.searchType = Optional.of(searchType);
    return this;
  }
  /** @param documentation */
  public OperationDefinition_ParameterBuilder withDocumentation(@NonNull String documentation) {
    this.documentation = Optional.of(documentation);
    return this;
  }
  /** @param targetProfile */
  public OperationDefinition_ParameterBuilder withTargetProfile(@NonNull String... targetProfile) {
    this.targetProfile = Arrays.asList(targetProfile);
    return this;
  }
  /** @param targetProfile */
  public OperationDefinition_ParameterBuilder withTargetProfile(
      @NonNull Collection<String> targetProfile) {
    this.targetProfile = Collections.unmodifiableCollection(targetProfile);
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
  public OperationDefinition_ParameterBuilder withModifierExtension(
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
  public OperationDefinition_ParameterBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param binding */
  public OperationDefinition_ParameterBuilder withBinding(
      @NonNull OperationDefinition$Parameter$Binding binding) {
    this.binding = Optional.of(binding);
    return this;
  }
  /** @param referencedFrom */
  public OperationDefinition_ParameterBuilder withReferencedFrom(
      @NonNull OperationDefinition$Parameter$ReferencedFrom... referencedFrom) {
    this.referencedFrom = Arrays.asList(referencedFrom);
    return this;
  }
  /** @param referencedFrom */
  public OperationDefinition_ParameterBuilder withReferencedFrom(
      @NonNull Collection<OperationDefinition$Parameter$ReferencedFrom> referencedFrom) {
    this.referencedFrom = Collections.unmodifiableCollection(referencedFrom);
    return this;
  }

  public OperationDefinition.Parameter build() {
    return new OperationDefinition.Parameter(
        OptionConverters.toScala(id),
        use,
        min,
        max,
        name,
        OptionConverters.toScala(_type),
        part.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(searchType),
        OptionConverters.toScala(documentation),
        targetProfile.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(binding),
        referencedFrom.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
