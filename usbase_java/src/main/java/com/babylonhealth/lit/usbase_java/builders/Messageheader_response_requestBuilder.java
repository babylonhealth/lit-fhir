package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.MESSAGEHEADER_RESPONSE_REQUEST;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Messageheader_response_requestBuilder extends ExtensionBuilder {
  public Messageheader_response_request build();

  public static Impl init(MESSAGEHEADER_RESPONSE_REQUEST value) {
    return new Impl(value);
  }

  public static Impl builder(MESSAGEHEADER_RESPONSE_REQUEST value) {
    return new Impl(value);
  }

  public class Impl implements Messageheader_response_requestBuilder {
    private Optional<String> id = Optional.empty();
    private MESSAGEHEADER_RESPONSE_REQUEST value;

    /**
     * Required fields for {@link Messageheader_response_request}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
     */
    public Impl(MESSAGEHEADER_RESPONSE_REQUEST value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Messageheader_response_requestBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public Messageheader_response_request build() {
      return new Messageheader_response_request(
          OptionConverters.toScala(id), value, LitUtils.emptyMetaElMap());
    }
  }
}
