package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.SMART_CAPABILITIES;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface CapabilitiesBuilder extends ExtensionBuilder {
  public Capabilities build();

  public static Impl init(SMART_CAPABILITIES value) {
    return new Impl(value);
  }

  public static Impl builder(SMART_CAPABILITIES value) {
    return new Impl(value);
  }

  public class Impl implements CapabilitiesBuilder {
    private Optional<String> id = Optional.empty();
    private SMART_CAPABILITIES value;

    /**
     * Required fields for {@link Capabilities}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(SMART_CAPABILITIES value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public CapabilitiesBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Capabilities build() {
      return new Capabilities(OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
