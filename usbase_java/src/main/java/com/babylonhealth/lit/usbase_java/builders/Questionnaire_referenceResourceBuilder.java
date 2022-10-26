package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.RESOURCE_TYPES;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Questionnaire_referenceResourceBuilder extends ExtensionBuilder {
  public Questionnaire_referenceResource build();

  public static Impl init(RESOURCE_TYPES value) {
    return new Impl(value);
  }

  public static Impl builder(RESOURCE_TYPES value) {
    return new Impl(value);
  }

  public class Impl implements Questionnaire_referenceResourceBuilder {
    private Optional<String> id = Optional.empty();
    private RESOURCE_TYPES value;

    /**
     * Required fields for {@link Questionnaire_referenceResource}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(RESOURCE_TYPES value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Questionnaire_referenceResourceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Questionnaire_referenceResource build() {
      return new Questionnaire_referenceResource(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
