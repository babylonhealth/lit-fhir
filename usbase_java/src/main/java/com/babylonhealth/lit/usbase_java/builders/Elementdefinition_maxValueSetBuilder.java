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

public interface Elementdefinition_maxValueSetBuilder extends ExtensionBuilder {
  public Elementdefinition_maxValueSet build();

  public static Impl init(@NonNull ChoiceCanonicalOrUri value) {
    return new Impl(value);
  }

  public static Impl builder(@NonNull ChoiceCanonicalOrUri value) {
    return new Impl(value);
  }

  public static ChoiceCanonicalOrUri valueCanonical(String s) {
    return ChoiceCanonicalOrUri.ChoiceCanonicalOrUriCanonical(s);
  }

  public static ChoiceCanonicalOrUri valueUri(String s) {
    return ChoiceCanonicalOrUri.ChoiceCanonicalOrUriUriStr(s);
  }

  public class Impl implements Elementdefinition_maxValueSetBuilder {
    private Optional<String> id = Optional.empty();
    private ChoiceCanonicalOrUri value;

    /**
     * Required fields for {@link Elementdefinition_maxValueSet}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list). Field is a 'choice'
     *     field. Type should be one of String. To pass the value in, wrap with one of the
     *     Elementdefinition_maxValueSetBuilder.value static methods
     */
    public Impl(@NonNull ChoiceCanonicalOrUri value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Elementdefinition_maxValueSetBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Elementdefinition_maxValueSet build() {
      return new Elementdefinition_maxValueSet(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
