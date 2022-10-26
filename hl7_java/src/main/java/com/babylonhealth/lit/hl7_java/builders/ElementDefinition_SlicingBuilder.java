package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.RESOURCE_SLICING_RULES;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface ElementDefinition_SlicingBuilder {
  public ElementDefinition.Slicing build();

  public static Impl init(RESOURCE_SLICING_RULES rules) {
    return new Impl(rules);
  }

  public static Impl builder(RESOURCE_SLICING_RULES rules) {
    return new Impl(rules);
  }

  public class Impl implements ElementDefinition_SlicingBuilder {
    private Optional<String> id = Optional.empty();
    private RESOURCE_SLICING_RULES rules;
    private Optional<Boolean> ordered = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Collection<ElementDefinition$Slicing$Discriminator> discriminator =
        Collections.emptyList();

    /**
     * Required fields for {@link ElementDefinition.Slicing}
     *
     * @param rules
     */
    public Impl(RESOURCE_SLICING_RULES rules) {
      this.rules = rules;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public ElementDefinition_SlicingBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param ordered */
    public ElementDefinition_SlicingBuilder.Impl withOrdered(@NonNull Boolean ordered) {
      this.ordered = Optional.of(ordered);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public ElementDefinition_SlicingBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ElementDefinition_SlicingBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ElementDefinition_SlicingBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description */
    public ElementDefinition_SlicingBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param discriminator */
    public ElementDefinition_SlicingBuilder.Impl withDiscriminator(
        @NonNull ElementDefinition$Slicing$Discriminator... discriminator) {
      this.discriminator = Arrays.asList(discriminator);
      return this;
    }
    /** @param discriminator */
    public ElementDefinition_SlicingBuilder.Impl withDiscriminator(
        @NonNull Collection<ElementDefinition$Slicing$Discriminator> discriminator) {
      this.discriminator = Collections.unmodifiableCollection(discriminator);
      return this;
    }

    public ElementDefinition_SlicingBuilder.Impl withDiscriminator(
        @NonNull ElementDefinition_Slicing_DiscriminatorBuilder... discriminator) {
      this.discriminator = Arrays.stream(discriminator).map(e -> e.build()).collect(toList());
      return this;
    }

    public ElementDefinition.Slicing build() {
      return new ElementDefinition.Slicing(
          OptionConverters.toScala(id),
          rules,
          OptionConverters.toScala(ordered.map(x -> (Object) x)),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          discriminator.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
