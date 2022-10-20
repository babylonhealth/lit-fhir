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

public interface Cqf_strengthOfRecommendationBuilder extends ExtensionBuilder {
  public Cqf_strengthOfRecommendation build();

  public static Impl init(CodeableConcept value) {
    return new Impl(value);
  }

  public static Impl builder(CodeableConceptBuilder value) {
    return new Impl(value.build());
  }

  public class Impl implements Cqf_strengthOfRecommendationBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept value;

    /**
     * Required fields for {@link Cqf_strengthOfRecommendation}
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
    public Cqf_strengthOfRecommendationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Cqf_strengthOfRecommendation build() {
      return new Cqf_strengthOfRecommendation(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
