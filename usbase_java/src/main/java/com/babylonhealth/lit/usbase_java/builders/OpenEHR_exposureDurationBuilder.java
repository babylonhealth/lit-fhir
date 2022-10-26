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

public interface OpenEHR_exposureDurationBuilder extends ExtensionBuilder {
  public OpenEHR_exposureDuration build();

  public static Impl init(Duration value) {
    return new Impl(value);
  }

  public static Impl builder(DurationBuilder value) {
    return new Impl(value.build());
  }

  public class Impl implements OpenEHR_exposureDurationBuilder {
    private Optional<String> id = Optional.empty();
    private Duration value;

    /**
     * Required fields for {@link OpenEHR_exposureDuration}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(Duration value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public OpenEHR_exposureDurationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public OpenEHR_exposureDuration build() {
      return new OpenEHR_exposureDuration(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
