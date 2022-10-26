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

public interface Elementdefinition_allowedUnitsBuilder extends ExtensionBuilder {
  public Elementdefinition_allowedUnits build();

  public static Impl init(@NonNull ChoiceCanonicalOrCodeableConcept value) {
    return new Impl(value);
  }

  public static Impl builder(@NonNull ChoiceCanonicalOrCodeableConcept value) {
    return new Impl(value);
  }

  public static ChoiceCanonicalOrCodeableConcept value(String s) {
    return new ChoiceCanonicalOrCodeableConcept(s);
  }

  public static ChoiceCanonicalOrCodeableConcept value(CodeableConcept c) {
    return new ChoiceCanonicalOrCodeableConcept(c);
  }

  public class Impl implements Elementdefinition_allowedUnitsBuilder {
    private Optional<String> id = Optional.empty();
    private ChoiceCanonicalOrCodeableConcept value;

    /**
     * Required fields for {@link Elementdefinition_allowedUnits}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list). Field is a 'choice'
     *     field. Type should be one of String, CodeableConcept. To pass the value in, wrap with one
     *     of the Elementdefinition_allowedUnitsBuilder.value static methods
     */
    public Impl(@NonNull ChoiceCanonicalOrCodeableConcept value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Elementdefinition_allowedUnitsBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Elementdefinition_allowedUnits build() {
      return new Elementdefinition_allowedUnits(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
