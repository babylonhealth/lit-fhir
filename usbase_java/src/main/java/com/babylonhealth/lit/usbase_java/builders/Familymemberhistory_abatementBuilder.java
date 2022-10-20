package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.FHIRDate;
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

public interface Familymemberhistory_abatementBuilder extends ExtensionBuilder {
  public Familymemberhistory_abatement build();

  public static Impl init(@NonNull ChoiceAgeOrBooleanOrDate value) {
    return new Impl(value);
  }

  public static Impl builder(@NonNull ChoiceAgeOrBooleanOrDate value) {
    return new Impl(value);
  }

  public static ChoiceAgeOrBooleanOrDate value(Age a) {
    return new ChoiceAgeOrBooleanOrDate(a);
  }

  public static ChoiceAgeOrBooleanOrDate value(Boolean b) {
    return new ChoiceAgeOrBooleanOrDate(b);
  }

  public static ChoiceAgeOrBooleanOrDate value(FHIRDate f) {
    return new ChoiceAgeOrBooleanOrDate(f);
  }

  public class Impl implements Familymemberhistory_abatementBuilder {
    private Optional<String> id = Optional.empty();
    private ChoiceAgeOrBooleanOrDate value;

    /**
     * Required fields for {@link Familymemberhistory_abatement}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list). Field is a 'choice'
     *     field. Type should be one of Age, Boolean, FHIRDate. To pass the value in, wrap with one
     *     of the Familymemberhistory_abatementBuilder.value static methods
     */
    public Impl(@NonNull ChoiceAgeOrBooleanOrDate value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Familymemberhistory_abatementBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Familymemberhistory_abatement build() {
      return new Familymemberhistory_abatement(
          OptionConverters.toScala(id), (Choice) value, LitUtils.emptyMetaElMap());
    }
  }
}
