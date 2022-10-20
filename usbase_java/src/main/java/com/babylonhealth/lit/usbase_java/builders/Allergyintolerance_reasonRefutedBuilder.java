package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Allergyintolerance_reasonRefutedBuilder extends ExtensionBuilder {
  public Allergyintolerance_reasonRefuted build();

  public static Impl init(CodeableConcept value) {
    return new Impl(value);
  }

  public static Impl builder(CodeableConceptBuilder value) {
    return new Impl(value.build());
  }

  public class Impl implements Allergyintolerance_reasonRefutedBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept value;

    /**
     * Required fields for {@link Allergyintolerance_reasonRefuted}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(CodeableConcept value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Allergyintolerance_reasonRefutedBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Allergyintolerance_reasonRefuted build() {
      return new Allergyintolerance_reasonRefuted(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
