package com.babylonhealth.lit.hl7_java.builders;

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
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ImplementationGuide_ManifestBuilder {
  public ImplementationGuide.Manifest build();

  public static Impl init(Collection<ImplementationGuide$Manifest$Resource> resource) {
    return new Impl(resource);
  }

  public static Impl builder(Collection<ImplementationGuide_Manifest_ResourceBuilder> resource) {
    return new Impl(
        new LitSeq<>(resource).map(ImplementationGuide_Manifest_ResourceBuilder::build));
  }

  public class Impl implements ImplementationGuide_ManifestBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<String> image = Collections.emptyList();
    private Collection<String> other = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> rendering = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ImplementationGuide$Manifest$Page> page = Collections.emptyList();
    private Collection<ImplementationGuide$Manifest$Resource> resource;

    /**
     * Required fields for {@link ImplementationGuide.Manifest}
     *
     * @param resource
     */
    public Impl(Collection<ImplementationGuide$Manifest$Resource> resource) {
      this.resource = resource;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ImplementationGuide_ManifestBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param image */
    public ImplementationGuide_ManifestBuilder.Impl withImage(@NonNull String... image) {
      this.image = Arrays.asList(image);
      return this;
    }
    /** @param image */
    public ImplementationGuide_ManifestBuilder.Impl withImage(@NonNull Collection<String> image) {
      this.image = Collections.unmodifiableCollection(image);
      return this;
    }
    /** @param other */
    public ImplementationGuide_ManifestBuilder.Impl withOther(@NonNull String... other) {
      this.other = Arrays.asList(other);
      return this;
    }
    /** @param other */
    public ImplementationGuide_ManifestBuilder.Impl withOther(@NonNull Collection<String> other) {
      this.other = Collections.unmodifiableCollection(other);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ImplementationGuide_ManifestBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ImplementationGuide_ManifestBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ImplementationGuide_ManifestBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param rendering */
    public ImplementationGuide_ManifestBuilder.Impl withRendering(@NonNull String rendering) {
      this.rendering = Optional.of(rendering);
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
    public ImplementationGuide_ManifestBuilder.Impl withModifierExtension(
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
    public ImplementationGuide_ManifestBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ImplementationGuide_ManifestBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param page */
    public ImplementationGuide_ManifestBuilder.Impl withPage(
        @NonNull ImplementationGuide$Manifest$Page... page) {
      this.page = Arrays.asList(page);
      return this;
    }
    /** @param page */
    public ImplementationGuide_ManifestBuilder.Impl withPage(
        @NonNull Collection<ImplementationGuide$Manifest$Page> page) {
      this.page = Collections.unmodifiableCollection(page);
      return this;
    }

    public ImplementationGuide_ManifestBuilder.Impl withPage(
        @NonNull ImplementationGuide_Manifest_PageBuilder... page) {
      this.page = Arrays.stream(page).map(e -> e.build()).collect(toList());
      return this;
    }

    public ImplementationGuide.Manifest build() {
      return new ImplementationGuide.Manifest(
          OptionConverters.toScala(id),
          image.stream().collect(new LitSeqJCollector<>()),
          other.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(rendering),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          page.stream().collect(new LitSeqJCollector<>()),
          resource.stream().collect(new NonEmptyLitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
