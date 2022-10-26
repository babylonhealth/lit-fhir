package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.RESOURCE_SECURITY_CATEGORY;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Structuredefinition_security_categoryBuilder extends ExtensionBuilder {
  public Structuredefinition_security_category build();

  public static Impl init(RESOURCE_SECURITY_CATEGORY value) {
    return new Impl(value);
  }

  public static Impl builder(RESOURCE_SECURITY_CATEGORY value) {
    return new Impl(value);
  }

  public class Impl implements Structuredefinition_security_categoryBuilder {
    private Optional<String> id = Optional.empty();
    private RESOURCE_SECURITY_CATEGORY value;

    /**
     * Required fields for {@link Structuredefinition_security_category}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(RESOURCE_SECURITY_CATEGORY value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Structuredefinition_security_categoryBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Structuredefinition_security_category build() {
      return new Structuredefinition_security_category(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
