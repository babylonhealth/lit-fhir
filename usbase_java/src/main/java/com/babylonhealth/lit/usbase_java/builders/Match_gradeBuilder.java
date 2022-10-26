package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.MATCH_GRADE;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Match_gradeBuilder extends ExtensionBuilder {
  public Match_grade build();

  public static Impl init(MATCH_GRADE value) {
    return new Impl(value);
  }

  public static Impl builder(MATCH_GRADE value) {
    return new Impl(value);
  }

  public class Impl implements Match_gradeBuilder {
    private Optional<String> id = Optional.empty();
    private MATCH_GRADE value;

    /**
     * Required fields for {@link Match_grade}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(MATCH_GRADE value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Match_gradeBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Match_grade build() {
      return new Match_grade(OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
