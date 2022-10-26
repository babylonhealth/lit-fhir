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

public interface Condition_occurredFollowingBuilder extends ExtensionBuilder {
  public Condition_occurredFollowing build();

  public static Impl init(@NonNull ChoiceCodeableConceptOrReference value) {
    return new Impl(value);
  }

  public static Impl builder(@NonNull ChoiceCodeableConceptOrReference value) {
    return new Impl(value);
  }

  public static ChoiceCodeableConceptOrReference value(CodeableConcept c) {
    return new ChoiceCodeableConceptOrReference(c);
  }

  public static ChoiceCodeableConceptOrReference value(Reference r) {
    return new ChoiceCodeableConceptOrReference(r);
  }

  public class Impl implements Condition_occurredFollowingBuilder {
    private Optional<String> id = Optional.empty();
    private ChoiceCodeableConceptOrReference value;

    /**
     * Required fields for {@link Condition_occurredFollowing}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list). Field is a 'choice'
     *     field. Type should be one of CodeableConcept, Reference. To pass the value in, wrap with
     *     one of the Condition_occurredFollowingBuilder.value static methods
     */
    public Impl(@NonNull ChoiceCodeableConceptOrReference value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Condition_occurredFollowingBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Condition_occurredFollowing build() {
      return new Condition_occurredFollowing(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
