package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface ParametersBuilder extends ResourceBuilder {
  public Parameters build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements ParametersBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Parameters.Parameter> parameter = Collections.emptyList();

    /** Required fields for {@link Parameters} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ParametersBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public ParametersBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public ParametersBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
      this.meta = Optional.of(meta.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public ParametersBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public ParametersBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param parameter - A parameter passed to or received from the operation. */
    public ParametersBuilder.Impl withParameter(@NonNull Parameters.Parameter... parameter) {
      this.parameter = Arrays.asList(parameter);
      return this;
    }
    /** @param parameter - A parameter passed to or received from the operation. */
    public ParametersBuilder.Impl withParameter(
        @NonNull Collection<Parameters.Parameter> parameter) {
      this.parameter = Collections.unmodifiableCollection(parameter);
      return this;
    }

    public ParametersBuilder.Impl withParameter(@NonNull Parameters_ParameterBuilder... parameter) {
      this.parameter = Arrays.stream(parameter).map(e -> e.build()).collect(toList());
      return this;
    }

    public ParametersBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Parameters build() {
      return new Parameters(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(language),
          OptionConverters.toScala(implicitRules),
          parameter.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
