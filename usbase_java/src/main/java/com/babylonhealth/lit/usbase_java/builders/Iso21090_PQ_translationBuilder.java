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

public interface Iso21090_PQ_translationBuilder extends ExtensionBuilder {
  public Iso21090_PQ_translation build();

  public static Impl init(Quantity value) {
    return new Impl(value);
  }

  public static Impl builder(QuantityBuilder value) {
    return new Impl(value.build());
  }

  public class Impl implements Iso21090_PQ_translationBuilder {
    private Optional<String> id = Optional.empty();
    private Quantity value;

    /**
     * Required fields for {@link Iso21090_PQ_translation}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(Quantity value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Iso21090_PQ_translationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Iso21090_PQ_translation build() {
      return new Iso21090_PQ_translation(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
