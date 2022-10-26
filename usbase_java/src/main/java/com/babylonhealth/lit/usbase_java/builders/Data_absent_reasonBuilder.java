package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.DATA_ABSENT_REASON;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Data_absent_reasonBuilder extends ExtensionBuilder {
  public Data_absent_reason build();

  public static Impl init(DATA_ABSENT_REASON value) {
    return new Impl(value);
  }

  public static Impl builder(DATA_ABSENT_REASON value) {
    return new Impl(value);
  }

  public class Impl implements Data_absent_reasonBuilder {
    private Optional<String> id = Optional.empty();
    private DATA_ABSENT_REASON value;

    /**
     * Required fields for {@link Data_absent_reason}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(DATA_ABSENT_REASON value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Data_absent_reasonBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Data_absent_reason build() {
      return new Data_absent_reason(OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
