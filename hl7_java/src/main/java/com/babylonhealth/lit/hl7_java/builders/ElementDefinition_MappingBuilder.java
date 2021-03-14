package com.babylonhealth.lit.hl7_java.builders;

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
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ElementDefinition_MappingBuilder {
  private Optional<String> id = Optional.empty();
  private String map;
  private Optional<String> comment = Optional.empty();
  private String identity;
  private Optional<String> language = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();

  /**
   * Required fields for {@link ElementDefinition.Mapping}
   *
   * @param map
   * @param identity
   */
  public ElementDefinition_MappingBuilder(String map, String identity) {
    this.map = map;
    this.identity = identity;
  }

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public ElementDefinition_MappingBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param comment - Explanatory notes and implementation guidance about the data element,
   *     including notes about how to use the data properly, exceptions to proper use, etc. (Note:
   *     The text you are reading is specified in ElementDefinition.comment).
   */
  public ElementDefinition_MappingBuilder withComment(@NonNull String comment) {
    this.comment = Optional.of(comment);
    return this;
  }
  /** @param language */
  public ElementDefinition_MappingBuilder withLanguage(@NonNull String language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ElementDefinition_MappingBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ElementDefinition_MappingBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }

  public ElementDefinition.Mapping build() {
    return new ElementDefinition.Mapping(
        OptionConverters.toScala(id),
        map,
        OptionConverters.toScala(comment),
        identity,
        OptionConverters.toScala(language),
        extension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
