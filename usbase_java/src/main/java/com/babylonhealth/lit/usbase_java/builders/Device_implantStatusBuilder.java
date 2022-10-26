package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.IMPLANTSTATUS;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Device_implantStatusBuilder extends ExtensionBuilder {
  public Device_implantStatus build();

  public static Impl init(IMPLANTSTATUS value) {
    return new Impl(value);
  }

  public static Impl builder(IMPLANTSTATUS value) {
    return new Impl(value);
  }

  public class Impl implements Device_implantStatusBuilder {
    private Optional<String> id = Optional.empty();
    private IMPLANTSTATUS value;

    /**
     * Required fields for {@link Device_implantStatus}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(IMPLANTSTATUS value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Device_implantStatusBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Device_implantStatus build() {
      return new Device_implantStatus(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
