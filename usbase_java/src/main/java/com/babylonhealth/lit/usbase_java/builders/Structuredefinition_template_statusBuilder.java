package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.TEMPLATE_STATUS_CODE;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Structuredefinition_template_statusBuilder extends ExtensionBuilder {
  public Structuredefinition_template_status build();

  public static Impl init(TEMPLATE_STATUS_CODE value) {
    return new Impl(value);
  }

  public static Impl builder(TEMPLATE_STATUS_CODE value) {
    return new Impl(value);
  }

  public class Impl implements Structuredefinition_template_statusBuilder {
    private Optional<String> id = Optional.empty();
    private TEMPLATE_STATUS_CODE value;

    /**
     * Required fields for {@link Structuredefinition_template_status}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(TEMPLATE_STATUS_CODE value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Structuredefinition_template_statusBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Structuredefinition_template_status build() {
      return new Structuredefinition_template_status(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
