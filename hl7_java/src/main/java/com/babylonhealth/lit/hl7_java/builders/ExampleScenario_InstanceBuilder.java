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
import com.babylonhealth.lit.hl7.RESOURCE_TYPES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ExampleScenario_InstanceBuilder {
  public ExampleScenario.Instance build();

  public static Impl init(String resourceId, RESOURCE_TYPES resourceType) {
    return new Impl(resourceId, resourceType);
  }

  public static Impl builder(String resourceId, RESOURCE_TYPES resourceType) {
    return new Impl(resourceId, resourceType);
  }

  public class Impl implements ExampleScenario_InstanceBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private String resourceId;
    private Optional<String> description = Optional.empty();
    private RESOURCE_TYPES resourceType;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ExampleScenario$Instance$Version> version = Collections.emptyList();
    private Collection<ExampleScenario$Instance$ContainedInstance> containedInstance =
        Collections.emptyList();

    /**
     * Required fields for {@link ExampleScenario.Instance}
     *
     * @param resourceId
     * @param resourceType
     */
    public Impl(String resourceId, RESOURCE_TYPES resourceType) {
      this.resourceId = resourceId;
      this.resourceType = resourceType;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ExampleScenario_InstanceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param name - A natural language name identifying the example scenario. This name should be
     *     usable as an identifier for the module by machine processing applications such as code
     *     generation.
     */
    public ExampleScenario_InstanceBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ExampleScenario_InstanceBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ExampleScenario_InstanceBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ExampleScenario_InstanceBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description */
    public ExampleScenario_InstanceBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
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
    public ExampleScenario_InstanceBuilder.Impl withModifierExtension(
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
    public ExampleScenario_InstanceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ExampleScenario_InstanceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the example scenario
     *     when it is referenced in a specification, model, design or instance. This is an arbitrary
     *     value managed by the example scenario author and is not expected to be globally unique.
     *     For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not
     *     available. There is also no expectation that versions can be placed in a lexicographical
     *     sequence.
     */
    public ExampleScenario_InstanceBuilder.Impl withVersion(
        @NonNull ExampleScenario$Instance$Version... version) {
      this.version = Arrays.asList(version);
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the example scenario
     *     when it is referenced in a specification, model, design or instance. This is an arbitrary
     *     value managed by the example scenario author and is not expected to be globally unique.
     *     For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not
     *     available. There is also no expectation that versions can be placed in a lexicographical
     *     sequence.
     */
    public ExampleScenario_InstanceBuilder.Impl withVersion(
        @NonNull Collection<ExampleScenario$Instance$Version> version) {
      this.version = Collections.unmodifiableCollection(version);
      return this;
    }

    public ExampleScenario_InstanceBuilder.Impl withVersion(
        @NonNull ExampleScenario_Instance_VersionBuilder... version) {
      this.version = Arrays.stream(version).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param containedInstance */
    public ExampleScenario_InstanceBuilder.Impl withContainedInstance(
        @NonNull ExampleScenario$Instance$ContainedInstance... containedInstance) {
      this.containedInstance = Arrays.asList(containedInstance);
      return this;
    }
    /** @param containedInstance */
    public ExampleScenario_InstanceBuilder.Impl withContainedInstance(
        @NonNull Collection<ExampleScenario$Instance$ContainedInstance> containedInstance) {
      this.containedInstance = Collections.unmodifiableCollection(containedInstance);
      return this;
    }

    public ExampleScenario_InstanceBuilder.Impl withContainedInstance(
        @NonNull ExampleScenario_Instance_ContainedInstanceBuilder... containedInstance) {
      this.containedInstance =
          Arrays.stream(containedInstance).map(e -> e.build()).collect(toList());
      return this;
    }

    public ExampleScenario.Instance build() {
      return new ExampleScenario.Instance(
          OptionConverters.toScala(id),
          OptionConverters.toScala(name),
          extension.stream().collect(new LitSeqJCollector<>()),
          resourceId,
          OptionConverters.toScala(description),
          resourceType,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          version.stream().collect(new LitSeqJCollector<>()),
          containedInstance.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
