package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.EXPANSION_PARAMETER_SOURCE;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Valueset_parameterSourceBuilder extends ExtensionBuilder {
  public Valueset_parameterSource build();

  public static Impl init(EXPANSION_PARAMETER_SOURCE value) {
    return new Impl(value);
  }

  public static Impl builder(EXPANSION_PARAMETER_SOURCE value) {
    return new Impl(value);
  }

  public class Impl implements Valueset_parameterSourceBuilder {
    private Optional<String> id = Optional.empty();
    private EXPANSION_PARAMETER_SOURCE value;

    /**
     * Required fields for {@link Valueset_parameterSource}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(EXPANSION_PARAMETER_SOURCE value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Valueset_parameterSourceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Valueset_parameterSource build() {
      return new Valueset_parameterSource(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
