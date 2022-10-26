package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.FHIR_VERSION;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Structuredefinition_normative_versionBuilder extends ExtensionBuilder {
  public Structuredefinition_normative_version build();

  public static Impl init(FHIR_VERSION value) {
    return new Impl(value);
  }

  public static Impl builder(FHIR_VERSION value) {
    return new Impl(value);
  }

  public class Impl implements Structuredefinition_normative_versionBuilder {
    private Optional<String> id = Optional.empty();
    private FHIR_VERSION value;

    /**
     * Required fields for {@link Structuredefinition_normative_version}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(FHIR_VERSION value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Structuredefinition_normative_versionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Structuredefinition_normative_version build() {
      return new Structuredefinition_normative_version(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
