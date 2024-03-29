package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.BINDING_STRENGTH;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface ElementDefinition_BindingBuilder {
  public ElementDefinition.Binding build();

  public static Impl init(BINDING_STRENGTH strength) {
    return new Impl(strength);
  }

  public static Impl builder(BINDING_STRENGTH strength) {
    return new Impl(strength);
  }

  public class Impl implements ElementDefinition_BindingBuilder {
    private Optional<String> id = Optional.empty();
    private BINDING_STRENGTH strength;
    private Optional<String> valueSet = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();

    /**
     * Required fields for {@link ElementDefinition.Binding}
     *
     * @param strength
     */
    public Impl(BINDING_STRENGTH strength) {
      this.strength = strength;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public ElementDefinition_BindingBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param valueSet */
    public ElementDefinition_BindingBuilder.Impl withValueSet(@NonNull String valueSet) {
      this.valueSet = Optional.of(valueSet);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ElementDefinition_BindingBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ElementDefinition_BindingBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ElementDefinition_BindingBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description */
    public ElementDefinition_BindingBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }

    public ElementDefinition.Binding build() {
      return new ElementDefinition.Binding(
          OptionConverters.toScala(id),
          strength,
          OptionConverters.toScala(valueSet),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          LitUtils.emptyMetaElMap());
    }
  }
}
