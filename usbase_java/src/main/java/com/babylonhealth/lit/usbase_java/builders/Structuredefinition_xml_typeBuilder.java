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

public interface Structuredefinition_xml_typeBuilder extends ExtensionBuilder {
  public Structuredefinition_xml_type build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Structuredefinition_xml_typeBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> value = Optional.empty();

    /** Required fields for {@link Structuredefinition_xml_type} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Structuredefinition_xml_typeBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Structuredefinition_xml_typeBuilder.Impl withValue(@NonNull String value) {
      this.value = Optional.of(value);
      return this;
    }

    public Structuredefinition_xml_type build() {
      return new Structuredefinition_xml_type(
          OptionConverters.toScala(id), OptionConverters.toScala(value), LitUtils.emptyMetaElMap());
    }
  }
}
