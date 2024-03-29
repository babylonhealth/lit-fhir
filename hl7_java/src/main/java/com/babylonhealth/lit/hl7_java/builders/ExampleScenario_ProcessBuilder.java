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

public interface ExampleScenario_ProcessBuilder {
  public ExampleScenario.Process build();

  public static Impl init(String title) {
    return new Impl(title);
  }

  public static Impl builder(String title) {
    return new Impl(title);
  }

  public class Impl implements ExampleScenario_ProcessBuilder {
    private Optional<String> id = Optional.empty();
    private String title;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<String> preConditions = Optional.empty();
    private Optional<String> postConditions = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ExampleScenario$Process$Step> step = Collections.emptyList();

    /**
     * Required fields for {@link ExampleScenario.Process}
     *
     * @param title
     */
    public Impl(String title) {
      this.title = title;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ExampleScenario_ProcessBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ExampleScenario_ProcessBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ExampleScenario_ProcessBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ExampleScenario_ProcessBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description */
    public ExampleScenario_ProcessBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param preConditions */
    public ExampleScenario_ProcessBuilder.Impl withPreConditions(@NonNull String preConditions) {
      this.preConditions = Optional.of(preConditions);
      return this;
    }
    /** @param postConditions */
    public ExampleScenario_ProcessBuilder.Impl withPostConditions(@NonNull String postConditions) {
      this.postConditions = Optional.of(postConditions);
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
    public ExampleScenario_ProcessBuilder.Impl withModifierExtension(
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
    public ExampleScenario_ProcessBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ExampleScenario_ProcessBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param step */
    public ExampleScenario_ProcessBuilder.Impl withStep(
        @NonNull ExampleScenario$Process$Step... step) {
      this.step = Arrays.asList(step);
      return this;
    }
    /** @param step */
    public ExampleScenario_ProcessBuilder.Impl withStep(
        @NonNull Collection<ExampleScenario$Process$Step> step) {
      this.step = Collections.unmodifiableCollection(step);
      return this;
    }

    public ExampleScenario_ProcessBuilder.Impl withStep(
        @NonNull ExampleScenario_Process_StepBuilder... step) {
      this.step = Arrays.stream(step).map(e -> e.build()).collect(toList());
      return this;
    }

    public ExampleScenario.Process build() {
      return new ExampleScenario.Process(
          OptionConverters.toScala(id),
          title,
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(preConditions),
          OptionConverters.toScala(postConditions),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          step.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
