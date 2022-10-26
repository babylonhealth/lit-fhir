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

public interface ElementDefinition_MappingBuilder {
  public ElementDefinition.Mapping build();

  public static Impl init(String map, String identity) {
    return new Impl(map, identity);
  }

  public static Impl builder(String map, String identity) {
    return new Impl(map, identity);
  }

  public class Impl implements ElementDefinition_MappingBuilder {
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
    public Impl(String map, String identity) {
      this.map = map;
      this.identity = identity;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public ElementDefinition_MappingBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param comment - Explanatory notes and implementation guidance about the data element,
     *     including notes about how to use the data properly, exceptions to proper use, etc. (Note:
     *     The text you are reading is specified in ElementDefinition.comment).
     */
    public ElementDefinition_MappingBuilder.Impl withComment(@NonNull String comment) {
      this.comment = Optional.of(comment);
      return this;
    }
    /** @param language */
    public ElementDefinition_MappingBuilder.Impl withLanguage(@NonNull String language) {
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
    public ElementDefinition_MappingBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ElementDefinition_MappingBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ElementDefinition_MappingBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
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
}
