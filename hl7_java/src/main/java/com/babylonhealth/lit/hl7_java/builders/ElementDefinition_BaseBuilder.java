package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

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

public interface ElementDefinition_BaseBuilder {
  public ElementDefinition.Base build();

  public static Impl init(Integer min, String max, String path) {
    return new Impl(min, max, path);
  }

  public static Impl builder(Integer min, String max, String path) {
    return new Impl(min, max, path);
  }

  public class Impl implements ElementDefinition_BaseBuilder {
    private Optional<String> id = Optional.empty();
    private Integer min;
    private String max;
    private String path;
    private Collection<Extension> extension = Collections.emptyList();

    /**
     * Required fields for {@link ElementDefinition.Base}
     *
     * @param min - The minimum number of times this element SHALL appear in the instance.
     * @param max - The maximum number of times this element is permitted to appear in the instance.
     * @param path - The path identifies the element and is expressed as a "."-separated list of
     *     ancestor elements, beginning with the name of the resource or extension.
     */
    public Impl(Integer min, String max, String path) {
      this.min = min;
      this.max = max;
      this.path = path;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public ElementDefinition_BaseBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ElementDefinition_BaseBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ElementDefinition_BaseBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ElementDefinition_BaseBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }

    public ElementDefinition.Base build() {
      return new ElementDefinition.Base(
          OptionConverters.toScala(id),
          min,
          max,
          path,
          extension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
