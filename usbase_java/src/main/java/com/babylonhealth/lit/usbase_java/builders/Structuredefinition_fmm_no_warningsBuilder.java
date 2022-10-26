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

public interface Structuredefinition_fmm_no_warningsBuilder extends ExtensionBuilder {
  public Structuredefinition_fmm_no_warnings build();

  public static Impl init(Integer value) {
    return new Impl(value);
  }

  public static Impl builder(Integer value) {
    return new Impl(value);
  }

  public class Impl implements Structuredefinition_fmm_no_warningsBuilder {
    private Optional<String> id = Optional.empty();
    private Integer value;

    /**
     * Required fields for {@link Structuredefinition_fmm_no_warnings}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(Integer value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Structuredefinition_fmm_no_warningsBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Structuredefinition_fmm_no_warnings build() {
      return new Structuredefinition_fmm_no_warnings(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
