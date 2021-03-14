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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ExampleScenario_Process_StepBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Boolean> pause = Optional.empty();
  private Collection<ExampleScenario.Process> process = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<ExampleScenario$Process$Step$Operation> operation = Optional.empty();
  private Collection<ExampleScenario$Process$Step$Alternative> alternative =
      Collections.emptyList();

  /** Required fields for {@link ExampleScenario$Process$Step} */
  public ExampleScenario_Process_StepBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ExampleScenario_Process_StepBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param pause */
  public ExampleScenario_Process_StepBuilder withPause(@NonNull Boolean pause) {
    this.pause = Optional.of(pause);
    return this;
  }
  /** @param process - Each major process - a group of operations. */
  public ExampleScenario_Process_StepBuilder withProcess(
      @NonNull ExampleScenario.Process... process) {
    this.process = Arrays.asList(process);
    return this;
  }
  /** @param process - Each major process - a group of operations. */
  public ExampleScenario_Process_StepBuilder withProcess(
      @NonNull Collection<ExampleScenario.Process> process) {
    this.process = Collections.unmodifiableCollection(process);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ExampleScenario_Process_StepBuilder withExtension(@NonNull Extension... extension) {
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
  public ExampleScenario_Process_StepBuilder withExtension(
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
  public ExampleScenario_Process_StepBuilder withModifierExtension(
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
  public ExampleScenario_Process_StepBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param operation */
  public ExampleScenario_Process_StepBuilder withOperation(
      @NonNull ExampleScenario$Process$Step$Operation operation) {
    this.operation = Optional.of(operation);
    return this;
  }
  /** @param alternative */
  public ExampleScenario_Process_StepBuilder withAlternative(
      @NonNull ExampleScenario$Process$Step$Alternative... alternative) {
    this.alternative = Arrays.asList(alternative);
    return this;
  }
  /** @param alternative */
  public ExampleScenario_Process_StepBuilder withAlternative(
      @NonNull Collection<ExampleScenario$Process$Step$Alternative> alternative) {
    this.alternative = Collections.unmodifiableCollection(alternative);
    return this;
  }

  public ExampleScenario$Process$Step build() {
    return new ExampleScenario$Process$Step(
        OptionConverters.toScala(id),
        OptionConverters.toScala(pause.map(x -> (Object) x)),
        process.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(operation),
        alternative.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
