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

public interface Questionnaire_unitBuilder extends ExtensionBuilder {
  public Questionnaire_unit build();

  public static Impl init(Coding value) {
    return new Impl(value);
  }

  public static Impl builder(CodingBuilder value) {
    return new Impl(value.build());
  }

  public class Impl implements Questionnaire_unitBuilder {
    private Optional<String> id = Optional.empty();
    private Coding value;

    /**
     * Required fields for {@link Questionnaire_unit}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(Coding value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Questionnaire_unitBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Questionnaire_unit build() {
      return new Questionnaire_unit(OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
