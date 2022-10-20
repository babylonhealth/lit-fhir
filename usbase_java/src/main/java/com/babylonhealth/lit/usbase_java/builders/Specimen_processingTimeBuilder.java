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

public interface Specimen_processingTimeBuilder extends ExtensionBuilder {
  public Specimen_processingTime build();

  public static Impl init(@NonNull ChoiceDurationOrPeriod value) {
    return new Impl(value);
  }

  public static Impl builder(@NonNull ChoiceDurationOrPeriod value) {
    return new Impl(value);
  }

  public static ChoiceDurationOrPeriod value(Duration d) {
    return new ChoiceDurationOrPeriod(d);
  }

  public static ChoiceDurationOrPeriod value(Period p) {
    return new ChoiceDurationOrPeriod(p);
  }

  public class Impl implements Specimen_processingTimeBuilder {
    private Optional<String> id = Optional.empty();
    private ChoiceDurationOrPeriod value;

    /**
     * Required fields for {@link Specimen_processingTime}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list). Field is a 'choice'
     *     field. Type should be one of Duration, Period. To pass the value in, wrap with one of the
     *     Specimen_processingTimeBuilder.value static methods
     */
    public Impl(@NonNull ChoiceDurationOrPeriod value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Specimen_processingTimeBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Specimen_processingTime build() {
      return new Specimen_processingTime(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
