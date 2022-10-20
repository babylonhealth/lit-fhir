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

public interface ExampleScenario_Process_Step_OperationBuilder {
  public ExampleScenario$Process$Step$Operation build();

  public static Impl init(String number) {
    return new Impl(number);
  }

  public static Impl builder(String number) {
    return new Impl(number);
  }

  public class Impl implements ExampleScenario_Process_Step_OperationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> _type = Optional.empty();
    private Optional<String> name = Optional.empty();
    private String number;
    private Optional<ExampleScenario$Instance$ContainedInstance> request = Optional.empty();
    private Optional<String> receiver = Optional.empty();
    private Optional<ExampleScenario$Instance$ContainedInstance> response = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> initiator = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<Boolean> receiverActive = Optional.empty();
    private Optional<Boolean> initiatorActive = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link ExampleScenario$Process$Step$Operation}
     *
     * @param number
     */
    public Impl(String number) {
      this.number = number;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ExampleScenario_Process_Step_OperationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type */
    public ExampleScenario_Process_Step_OperationBuilder.Impl withType(@NonNull String _type) {
      this._type = Optional.of(_type);
      return this;
    }
    /**
     * @param name - A natural language name identifying the example scenario. This name should be
     *     usable as an identifier for the module by machine processing applications such as code
     *     generation.
     */
    public ExampleScenario_Process_Step_OperationBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /** @param request */
    public ExampleScenario_Process_Step_OperationBuilder.Impl withRequest(
        @NonNull ExampleScenario$Instance$ContainedInstance request) {
      this.request = Optional.of(request);
      return this;
    }

    public ExampleScenario_Process_Step_OperationBuilder.Impl withRequest(
        @NonNull ExampleScenario_Instance_ContainedInstanceBuilder request) {
      this.request = Optional.of(request.build());
      return this;
    }
    /** @param receiver */
    public ExampleScenario_Process_Step_OperationBuilder.Impl withReceiver(
        @NonNull String receiver) {
      this.receiver = Optional.of(receiver);
      return this;
    }
    /** @param response */
    public ExampleScenario_Process_Step_OperationBuilder.Impl withResponse(
        @NonNull ExampleScenario$Instance$ContainedInstance response) {
      this.response = Optional.of(response);
      return this;
    }

    public ExampleScenario_Process_Step_OperationBuilder.Impl withResponse(
        @NonNull ExampleScenario_Instance_ContainedInstanceBuilder response) {
      this.response = Optional.of(response.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ExampleScenario_Process_Step_OperationBuilder.Impl withExtension(
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
    public ExampleScenario_Process_Step_OperationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ExampleScenario_Process_Step_OperationBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param initiator */
    public ExampleScenario_Process_Step_OperationBuilder.Impl withInitiator(
        @NonNull String initiator) {
      this.initiator = Optional.of(initiator);
      return this;
    }
    /** @param description */
    public ExampleScenario_Process_Step_OperationBuilder.Impl withDescription(
        @NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param receiverActive */
    public ExampleScenario_Process_Step_OperationBuilder.Impl withReceiverActive(
        @NonNull Boolean receiverActive) {
      this.receiverActive = Optional.of(receiverActive);
      return this;
    }
    /** @param initiatorActive */
    public ExampleScenario_Process_Step_OperationBuilder.Impl withInitiatorActive(
        @NonNull Boolean initiatorActive) {
      this.initiatorActive = Optional.of(initiatorActive);
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
    public ExampleScenario_Process_Step_OperationBuilder.Impl withModifierExtension(
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
    public ExampleScenario_Process_Step_OperationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ExampleScenario_Process_Step_OperationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public ExampleScenario$Process$Step$Operation build() {
      return new ExampleScenario$Process$Step$Operation(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(name),
          number,
          OptionConverters.toScala(request),
          OptionConverters.toScala(receiver),
          OptionConverters.toScala(response),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(initiator),
          OptionConverters.toScala(description),
          OptionConverters.toScala(receiverActive.map(x -> (Object) x)),
          OptionConverters.toScala(initiatorActive.map(x -> (Object) x)),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
