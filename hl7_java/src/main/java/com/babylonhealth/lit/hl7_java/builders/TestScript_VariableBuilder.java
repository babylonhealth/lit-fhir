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

public interface TestScript_VariableBuilder {
  public TestScript.Variable build();

  public static Impl init(String name) {
    return new Impl(name);
  }

  public static Impl builder(String name) {
    return new Impl(name);
  }

  public class Impl implements TestScript_VariableBuilder {
    private Optional<String> id = Optional.empty();
    private String name;
    private Optional<String> hint = Optional.empty();
    private Optional<String> path = Optional.empty();
    private Optional<String> sourceId = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> expression = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<String> headerField = Optional.empty();
    private Optional<String> defaultValue = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link TestScript.Variable}
     *
     * @param name - A natural language name identifying the test script. This name should be usable
     *     as an identifier for the module by machine processing applications such as code
     *     generation.
     */
    public Impl(String name) {
      this.name = name;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public TestScript_VariableBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param hint */
    public TestScript_VariableBuilder.Impl withHint(@NonNull String hint) {
      this.hint = Optional.of(hint);
      return this;
    }
    /** @param path */
    public TestScript_VariableBuilder.Impl withPath(@NonNull String path) {
      this.path = Optional.of(path);
      return this;
    }
    /** @param sourceId */
    public TestScript_VariableBuilder.Impl withSourceId(@NonNull String sourceId) {
      this.sourceId = Optional.of(sourceId);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public TestScript_VariableBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public TestScript_VariableBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public TestScript_VariableBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param expression */
    public TestScript_VariableBuilder.Impl withExpression(@NonNull String expression) {
      this.expression = Optional.of(expression);
      return this;
    }
    /**
     * @param description - A free text natural language description of the test script from a
     *     consumer's perspective.
     */
    public TestScript_VariableBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param headerField */
    public TestScript_VariableBuilder.Impl withHeaderField(@NonNull String headerField) {
      this.headerField = Optional.of(headerField);
      return this;
    }
    /** @param defaultValue */
    public TestScript_VariableBuilder.Impl withDefaultValue(@NonNull String defaultValue) {
      this.defaultValue = Optional.of(defaultValue);
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
    public TestScript_VariableBuilder.Impl withModifierExtension(
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
    public TestScript_VariableBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public TestScript_VariableBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public TestScript.Variable build() {
      return new TestScript.Variable(
          OptionConverters.toScala(id),
          name,
          OptionConverters.toScala(hint),
          OptionConverters.toScala(path),
          OptionConverters.toScala(sourceId),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(expression),
          OptionConverters.toScala(description),
          OptionConverters.toScala(headerField),
          OptionConverters.toScala(defaultValue),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
