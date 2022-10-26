package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.V3_ENTITYNAMEUSER2;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Iso21090_EN_useBuilder extends ExtensionBuilder {
  public Iso21090_EN_use build();

  public static Impl init(V3_ENTITYNAMEUSER2 value) {
    return new Impl(value);
  }

  public static Impl builder(V3_ENTITYNAMEUSER2 value) {
    return new Impl(value);
  }

  public class Impl implements Iso21090_EN_useBuilder {
    private Optional<String> id = Optional.empty();
    private V3_ENTITYNAMEUSER2 value;

    /**
     * Required fields for {@link Iso21090_EN_use}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(V3_ENTITYNAMEUSER2 value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Iso21090_EN_useBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Iso21090_EN_use build() {
      return new Iso21090_EN_use(OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
