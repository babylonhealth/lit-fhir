package com.babylonhealth.lit.core_java.builders;

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
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.core.OPERATION_PARAMETER_USE;
import com.babylonhealth.lit.core.ALL_TYPES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ParameterDefinitionBuilder extends ElementBuilder {
  public ParameterDefinition build();

  public static Impl init(OPERATION_PARAMETER_USE use, ALL_TYPES _type) {
    return new Impl(use, _type);
  }

  public static Impl builder(OPERATION_PARAMETER_USE use, ALL_TYPES _type) {
    return new Impl(use, _type);
  }

  public class Impl implements ParameterDefinitionBuilder {
    private Optional<String> id = Optional.empty();
    private OPERATION_PARAMETER_USE use;
    private Optional<Integer> min = Optional.empty();
    private Optional<String> max = Optional.empty();
    private Optional<String> name = Optional.empty();
    private ALL_TYPES _type;
    private Optional<String> profile = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> documentation = Optional.empty();

    /**
     * Required fields for {@link ParameterDefinition}
     *
     * @param use - Whether the parameter is input or output for the module.
     * @param _type - The type of the parameter.
     */
    public Impl(OPERATION_PARAMETER_USE use, ALL_TYPES _type) {
      this.use = use;
      this._type = _type;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public ParameterDefinitionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param min - The minimum number of times this parameter SHALL appear in the request or
     *     response.
     */
    public ParameterDefinitionBuilder.Impl withMin(@NonNull Integer min) {
      this.min = Optional.of(min);
      return this;
    }
    /**
     * @param max - The maximum number of times this element is permitted to appear in the request
     *     or response.
     */
    public ParameterDefinitionBuilder.Impl withMax(@NonNull String max) {
      this.max = Optional.of(max);
      return this;
    }
    /**
     * @param name - The name of the parameter used to allow access to the value of the parameter in
     *     evaluation contexts.
     */
    public ParameterDefinitionBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param profile - If specified, this indicates a profile that the input data must conform to,
     *     or that the output data will conform to.
     */
    public ParameterDefinitionBuilder.Impl withProfile(@NonNull String profile) {
      this.profile = Optional.of(profile);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ParameterDefinitionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ParameterDefinitionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param documentation - A brief discussion of what the parameter is for and how it is used by
     *     the module.
     */
    public ParameterDefinitionBuilder.Impl withDocumentation(@NonNull String documentation) {
      this.documentation = Optional.of(documentation);
      return this;
    }

    public ParameterDefinition build() {
      return new ParameterDefinition(
          OptionConverters.toScala(id),
          use,
          OptionConverters.toScala(min.map(x -> (Object) x)),
          OptionConverters.toScala(max),
          OptionConverters.toScala(name),
          _type,
          OptionConverters.toScala(profile),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(documentation),
          LitUtils.emptyMetaElMap());
    }
  }
}
