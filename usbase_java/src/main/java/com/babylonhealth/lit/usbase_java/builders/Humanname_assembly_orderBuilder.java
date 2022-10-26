package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.NAME_ASSEMBLY_ORDER;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Humanname_assembly_orderBuilder extends ExtensionBuilder {
  public Humanname_assembly_order build();

  public static Impl init(NAME_ASSEMBLY_ORDER value) {
    return new Impl(value);
  }

  public static Impl builder(NAME_ASSEMBLY_ORDER value) {
    return new Impl(value);
  }

  public class Impl implements Humanname_assembly_orderBuilder {
    private Optional<String> id = Optional.empty();
    private NAME_ASSEMBLY_ORDER value;

    /**
     * Required fields for {@link Humanname_assembly_order}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(NAME_ASSEMBLY_ORDER value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Humanname_assembly_orderBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Humanname_assembly_order build() {
      return new Humanname_assembly_order(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
