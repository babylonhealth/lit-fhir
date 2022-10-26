package com.babylonhealth.lit.core_java.builders;

import static java.util.stream.Collectors.toList;

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

public interface CodeableConceptBuilder extends ElementBuilder {
  public CodeableConcept build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements CodeableConceptBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> text = Optional.empty();
    private Collection<Coding> coding = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();

    /** Required fields for {@link CodeableConcept} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public CodeableConceptBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param text - A human language representation of the concept as seen/selected/uttered by the
     *     user who entered the data and/or which represents the intended meaning of the user.
     */
    public CodeableConceptBuilder.Impl withText(@NonNull String text) {
      this.text = Optional.of(text);
      return this;
    }
    /** @param coding - A reference to a code defined by a terminology system. */
    public CodeableConceptBuilder.Impl withCoding(@NonNull Coding... coding) {
      this.coding = Arrays.asList(coding);
      return this;
    }
    /** @param coding - A reference to a code defined by a terminology system. */
    public CodeableConceptBuilder.Impl withCoding(@NonNull Collection<Coding> coding) {
      this.coding = Collections.unmodifiableCollection(coding);
      return this;
    }

    public CodeableConceptBuilder.Impl withCoding(@NonNull CodingBuilder... coding) {
      this.coding = Arrays.stream(coding).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public CodeableConceptBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public CodeableConceptBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CodeableConceptBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }

    public CodeableConcept build() {
      return new CodeableConcept(
          OptionConverters.toScala(id),
          OptionConverters.toScala(text),
          coding.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
