package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.DISCRIMINATOR_TYPE;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface ElementDefinition_Slicing_DiscriminatorBuilder {
  public ElementDefinition$Slicing$Discriminator build();

  public static Impl init(DISCRIMINATOR_TYPE _type, String path) {
    return new Impl(_type, path);
  }

  public static Impl builder(DISCRIMINATOR_TYPE _type, String path) {
    return new Impl(_type, path);
  }

  public class Impl implements ElementDefinition_Slicing_DiscriminatorBuilder {
    private Optional<String> id = Optional.empty();
    private DISCRIMINATOR_TYPE _type;
    private String path;
    private Collection<Extension> extension = Collections.emptyList();

    /**
     * Required fields for {@link ElementDefinition$Slicing$Discriminator}
     *
     * @param _type - The data type or resource that the value of this element is permitted to be.
     * @param path - The path identifies the element and is expressed as a "."-separated list of
     *     ancestor elements, beginning with the name of the resource or extension.
     */
    public Impl(DISCRIMINATOR_TYPE _type, String path) {
      this._type = _type;
      this.path = path;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public ElementDefinition_Slicing_DiscriminatorBuilder.Impl withId(@NonNull String id) {
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
    public ElementDefinition_Slicing_DiscriminatorBuilder.Impl withExtension(
        @NonNull Extension... extension) {
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
    public ElementDefinition_Slicing_DiscriminatorBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ElementDefinition_Slicing_DiscriminatorBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }

    public ElementDefinition$Slicing$Discriminator build() {
      return new ElementDefinition$Slicing$Discriminator(
          OptionConverters.toScala(id),
          _type,
          path,
          extension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
