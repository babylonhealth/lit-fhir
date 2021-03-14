package com.babylonhealth.lit.usbase_java.builders;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import scala.math.BigDecimal;
import scala.Option;
import scala.collection.immutable.Seq;
import scala.jdk.javaapi.CollectionConverters;
import scala.jdk.javaapi.OptionConverters;

import lombok.NonNull;

import com.babylonhealth.lit.core.FHIRComponentFieldMeta;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeq$;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.Choice$;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Specimen_processingTimeBuilder {
  private Optional<String> id = Optional.empty();
  private String url;
  private Choice<$bslash$div<Duration, Period>> value;

  /**
   * Required fields for {@link Specimen_processingTime}
   *
   * @param url - Source of the definition for the extension code - a logical name or a URL.
   * @param value - Value of extension - must be one of a constrained set of the data types (see
   *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list). Field is a 'choice'
   *     field. Type should be one of Duration, Period.
   */
  public Specimen_processingTimeBuilder(String url, @NonNull Object value) {
    this.url = url;
    this.value =
        (Choice)
            Choice$.MODULE$.fromSuffix(
                autoSuffix(
                    value.getClass().getSimpleName(), Specimen_processingTime$.MODULE$.value()),
                value,
                Specimen_processingTime$.MODULE$.value());
  }

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public Specimen_processingTimeBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }

  public Specimen_processingTime build() {
    return new Specimen_processingTime(
        OptionConverters.toScala(id), url, value, LitUtils.emptyMetaElMap());
  }
}