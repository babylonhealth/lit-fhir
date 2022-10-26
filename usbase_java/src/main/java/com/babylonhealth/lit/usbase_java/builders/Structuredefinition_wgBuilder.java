package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.HL7_WORK_GROUP;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Structuredefinition_wgBuilder extends ExtensionBuilder {
  public Structuredefinition_wg build();

  public static Impl init(HL7_WORK_GROUP value) {
    return new Impl(value);
  }

  public static Impl builder(HL7_WORK_GROUP value) {
    return new Impl(value);
  }

  public class Impl implements Structuredefinition_wgBuilder {
    private Optional<String> id = Optional.empty();
    private HL7_WORK_GROUP value;

    /**
     * Required fields for {@link Structuredefinition_wg}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(HL7_WORK_GROUP value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Structuredefinition_wgBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Structuredefinition_wg build() {
      return new Structuredefinition_wg(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
