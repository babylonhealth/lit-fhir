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

public interface GraphDefinition_LinkBuilder {
  public GraphDefinition.Link build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements GraphDefinition_LinkBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Integer> min = Optional.empty();
    private Optional<String> max = Optional.empty();
    private Optional<String> path = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> sliceName = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<GraphDefinition$Link$Target> target = Collections.emptyList();

    /** Required fields for {@link GraphDefinition.Link} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public GraphDefinition_LinkBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param min */
    public GraphDefinition_LinkBuilder.Impl withMin(@NonNull Integer min) {
      this.min = Optional.of(min);
      return this;
    }
    /** @param max */
    public GraphDefinition_LinkBuilder.Impl withMax(@NonNull String max) {
      this.max = Optional.of(max);
      return this;
    }
    /** @param path */
    public GraphDefinition_LinkBuilder.Impl withPath(@NonNull String path) {
      this.path = Optional.of(path);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public GraphDefinition_LinkBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public GraphDefinition_LinkBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public GraphDefinition_LinkBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param sliceName */
    public GraphDefinition_LinkBuilder.Impl withSliceName(@NonNull String sliceName) {
      this.sliceName = Optional.of(sliceName);
      return this;
    }
    /**
     * @param description - A free text natural language description of the graph definition from a
     *     consumer's perspective.
     */
    public GraphDefinition_LinkBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public GraphDefinition_LinkBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public GraphDefinition_LinkBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public GraphDefinition_LinkBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param target */
    public GraphDefinition_LinkBuilder.Impl withTarget(
        @NonNull GraphDefinition$Link$Target... target) {
      this.target = Arrays.asList(target);
      return this;
    }
    /** @param target */
    public GraphDefinition_LinkBuilder.Impl withTarget(
        @NonNull Collection<GraphDefinition$Link$Target> target) {
      this.target = Collections.unmodifiableCollection(target);
      return this;
    }

    public GraphDefinition_LinkBuilder.Impl withTarget(
        @NonNull GraphDefinition_Link_TargetBuilder... target) {
      this.target = Arrays.stream(target).map(e -> e.build()).collect(toList());
      return this;
    }

    public GraphDefinition.Link build() {
      return new GraphDefinition.Link(
          OptionConverters.toScala(id),
          OptionConverters.toScala(min.map(x -> (Object) x)),
          OptionConverters.toScala(max),
          OptionConverters.toScala(path),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(sliceName),
          OptionConverters.toScala(description),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          target.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
