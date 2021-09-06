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
import com.babylonhealth.lit.hl7.MAP_TARGET_LIST_MODE;
import com.babylonhealth.lit.hl7.MAP_TRANSFORM;
import com.babylonhealth.lit.hl7.MAP_CONTEXT_TYPE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface StructureMap_Group_Rule_TargetBuilder {
  public StructureMap$Group$Rule$Target build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements StructureMap_Group_Rule_TargetBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> context = Optional.empty();
    private Optional<String> element = Optional.empty();
    private Optional<String> variable = Optional.empty();
    private Collection<MAP_TARGET_LIST_MODE> listMode = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<MAP_TRANSFORM> transform = Optional.empty();
    private Optional<String> listRuleId = Optional.empty();
    private Optional<MAP_CONTEXT_TYPE> contextType = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<StructureMap$Group$Rule$Target$Parameter> parameter =
        Collections.emptyList();

    /** Required fields for {@link StructureMap$Group$Rule$Target} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public StructureMap_Group_Rule_TargetBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param context */
    public StructureMap_Group_Rule_TargetBuilder.Impl withContext(@NonNull String context) {
      this.context = Optional.of(context);
      return this;
    }
    /** @param element */
    public StructureMap_Group_Rule_TargetBuilder.Impl withElement(@NonNull String element) {
      this.element = Optional.of(element);
      return this;
    }
    /** @param variable */
    public StructureMap_Group_Rule_TargetBuilder.Impl withVariable(@NonNull String variable) {
      this.variable = Optional.of(variable);
      return this;
    }
    /** @param listMode */
    public StructureMap_Group_Rule_TargetBuilder.Impl withListMode(
        @NonNull MAP_TARGET_LIST_MODE... listMode) {
      this.listMode = Arrays.asList(listMode);
      return this;
    }
    /** @param listMode */
    public StructureMap_Group_Rule_TargetBuilder.Impl withListMode(
        @NonNull Collection<MAP_TARGET_LIST_MODE> listMode) {
      this.listMode = Collections.unmodifiableCollection(listMode);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public StructureMap_Group_Rule_TargetBuilder.Impl withExtension(
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
    public StructureMap_Group_Rule_TargetBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public StructureMap_Group_Rule_TargetBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param transform */
    public StructureMap_Group_Rule_TargetBuilder.Impl withTransform(
        @NonNull MAP_TRANSFORM transform) {
      this.transform = Optional.of(transform);
      return this;
    }
    /** @param listRuleId */
    public StructureMap_Group_Rule_TargetBuilder.Impl withListRuleId(@NonNull String listRuleId) {
      this.listRuleId = Optional.of(listRuleId);
      return this;
    }
    /** @param contextType */
    public StructureMap_Group_Rule_TargetBuilder.Impl withContextType(
        @NonNull MAP_CONTEXT_TYPE contextType) {
      this.contextType = Optional.of(contextType);
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
    public StructureMap_Group_Rule_TargetBuilder.Impl withModifierExtension(
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
    public StructureMap_Group_Rule_TargetBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public StructureMap_Group_Rule_TargetBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param parameter */
    public StructureMap_Group_Rule_TargetBuilder.Impl withParameter(
        @NonNull StructureMap$Group$Rule$Target$Parameter... parameter) {
      this.parameter = Arrays.asList(parameter);
      return this;
    }
    /** @param parameter */
    public StructureMap_Group_Rule_TargetBuilder.Impl withParameter(
        @NonNull Collection<StructureMap$Group$Rule$Target$Parameter> parameter) {
      this.parameter = Collections.unmodifiableCollection(parameter);
      return this;
    }

    public StructureMap_Group_Rule_TargetBuilder.Impl withParameter(
        @NonNull StructureMap_Group_Rule_Target_ParameterBuilder... parameter) {
      this.parameter = Arrays.stream(parameter).map(e -> e.build()).collect(toList());
      return this;
    }

    public StructureMap$Group$Rule$Target build() {
      return new StructureMap$Group$Rule$Target(
          OptionConverters.toScala(id),
          OptionConverters.toScala(context),
          OptionConverters.toScala(element),
          OptionConverters.toScala(variable),
          listMode.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(transform),
          OptionConverters.toScala(listRuleId),
          OptionConverters.toScala(contextType),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          parameter.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
