package com.babylonhealth.lit.core_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.SORT_DIRECTION;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface DataRequirement_SortBuilder {
  public DataRequirement.Sort build();

  public static Impl init(String path, SORT_DIRECTION direction) {
    return new Impl(path, direction);
  }

  public static Impl builder(String path, SORT_DIRECTION direction) {
    return new Impl(path, direction);
  }

  public class Impl implements DataRequirement_SortBuilder {
    private Optional<String> id = Optional.empty();
    private String path;
    private Collection<Extension> extension = Collections.emptyList();
    private SORT_DIRECTION direction;

    /**
     * Required fields for {@link DataRequirement.Sort}
     *
     * @param path
     * @param direction
     */
    public Impl(String path, SORT_DIRECTION direction) {
      this.path = path;
      this.direction = direction;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public DataRequirement_SortBuilder.Impl withId(@NonNull String id) {
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
    public DataRequirement_SortBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public DataRequirement_SortBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public DataRequirement_SortBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }

    public DataRequirement.Sort build() {
      return new DataRequirement.Sort(
          OptionConverters.toScala(id),
          path,
          extension.stream().collect(new LitSeqJCollector<>()),
          direction,
          LitUtils.emptyMetaElMap());
    }
  }
}
