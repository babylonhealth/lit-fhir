package com.babylonhealth.lit.core_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.IDENTIFIER_USE;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface IdentifierBuilder extends ElementBuilder {
  public Identifier build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements IdentifierBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<IDENTIFIER_USE> use = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<String> value = Optional.empty();
    private Optional<String> system = Optional.empty();
    private Optional<Period> period = Optional.empty();
    private Optional<Reference> assigner = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();

    /** Required fields for {@link Identifier} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public IdentifierBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param use - The purpose of this identifier. */
    public IdentifierBuilder.Impl withUse(@NonNull IDENTIFIER_USE use) {
      this.use = Optional.of(use);
      return this;
    }
    /**
     * @param _type - A coded type for the identifier that can be used to determine which identifier
     *     to use for a specific purpose.
     */
    public IdentifierBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public IdentifierBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /**
     * @param value - The portion of the identifier typically relevant to the user and which is
     *     unique within the context of the system.
     */
    public IdentifierBuilder.Impl withValue(@NonNull String value) {
      this.value = Optional.of(value);
      return this;
    }
    /**
     * @param system - Establishes the namespace for the value - that is, a URL that describes a set
     *     values that are unique.
     */
    public IdentifierBuilder.Impl withSystem(@NonNull String system) {
      this.system = Optional.of(system);
      return this;
    }
    /** @param period - Time period during which identifier is/was valid for use. */
    public IdentifierBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public IdentifierBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /** @param assigner - Organization that issued/manages the identifier. */
    public IdentifierBuilder.Impl withAssigner(@NonNull Reference assigner) {
      this.assigner = Optional.of(assigner);
      return this;
    }

    public IdentifierBuilder.Impl withAssigner(@NonNull ReferenceBuilder assigner) {
      this.assigner = Optional.of(assigner.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public IdentifierBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public IdentifierBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public IdentifierBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Identifier build() {
      return new Identifier(
          OptionConverters.toScala(id),
          OptionConverters.toScala(use),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(value),
          OptionConverters.toScala(system),
          OptionConverters.toScala(period),
          OptionConverters.toScala(assigner),
          extension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
