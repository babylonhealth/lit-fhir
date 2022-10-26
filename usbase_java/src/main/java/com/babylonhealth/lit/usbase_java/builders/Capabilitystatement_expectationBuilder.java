package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.CONFORMANCE_EXPECTATION;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Capabilitystatement_expectationBuilder extends ExtensionBuilder {
  public Capabilitystatement_expectation build();

  public static Impl init(CONFORMANCE_EXPECTATION value) {
    return new Impl(value);
  }

  public static Impl builder(CONFORMANCE_EXPECTATION value) {
    return new Impl(value);
  }

  public class Impl implements Capabilitystatement_expectationBuilder {
    private Optional<String> id = Optional.empty();
    private CONFORMANCE_EXPECTATION value;

    /**
     * Required fields for {@link Capabilitystatement_expectation}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(CONFORMANCE_EXPECTATION value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Capabilitystatement_expectationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Capabilitystatement_expectation build() {
      return new Capabilitystatement_expectation(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
