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

public interface Patient_interpreterRequiredBuilder extends ExtensionBuilder {
  public Patient_interpreterRequired build();

  public static Impl init(Boolean value) {
    return new Impl(value);
  }

  public static Impl builder(Boolean value) {
    return new Impl(value);
  }

  public class Impl implements Patient_interpreterRequiredBuilder {
    private Optional<String> id = Optional.empty();
    private Boolean value;

    /**
     * Required fields for {@link Patient_interpreterRequired}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(Boolean value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Patient_interpreterRequiredBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Patient_interpreterRequired build() {
      return new Patient_interpreterRequired(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
