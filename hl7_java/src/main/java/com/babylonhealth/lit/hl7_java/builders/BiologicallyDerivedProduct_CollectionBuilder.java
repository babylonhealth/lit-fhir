package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
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
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface BiologicallyDerivedProduct_CollectionBuilder {
  public BiologicallyDerivedProduct.Collection build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceDateTimeOrPeriod collected(FHIRDateTime f) {
    return new ChoiceDateTimeOrPeriod(f);
  }

  public static ChoiceDateTimeOrPeriod collected(Period p) {
    return new ChoiceDateTimeOrPeriod(p);
  }

  public class Impl implements BiologicallyDerivedProduct_CollectionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Reference> source = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> collector = Optional.empty();
    private Optional<ChoiceDateTimeOrPeriod> collected = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link BiologicallyDerivedProduct.Collection} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public BiologicallyDerivedProduct_CollectionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param source */
    public BiologicallyDerivedProduct_CollectionBuilder.Impl withSource(@NonNull Reference source) {
      this.source = Optional.of(source);
      return this;
    }

    public BiologicallyDerivedProduct_CollectionBuilder.Impl withSource(
        @NonNull ReferenceBuilder source) {
      this.source = Optional.of(source.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public BiologicallyDerivedProduct_CollectionBuilder.Impl withExtension(
        @NonNull Extension... extension) {
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
    public BiologicallyDerivedProduct_CollectionBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public BiologicallyDerivedProduct_CollectionBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param collector */
    public BiologicallyDerivedProduct_CollectionBuilder.Impl withCollector(
        @NonNull Reference collector) {
      this.collector = Optional.of(collector);
      return this;
    }

    public BiologicallyDerivedProduct_CollectionBuilder.Impl withCollector(
        @NonNull ReferenceBuilder collector) {
      this.collector = Optional.of(collector.build());
      return this;
    }
    /**
     * @param collected Field is a 'choice' field. Type should be one of FHIRDateTime, Period. To
     *     pass the value in, wrap with one of the
     *     BiologicallyDerivedProduct_CollectionBuilder.collected static methods
     */
    public BiologicallyDerivedProduct_CollectionBuilder.Impl withCollected(
        @NonNull ChoiceDateTimeOrPeriod collected) {
      this.collected = Optional.of(collected);
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
    public BiologicallyDerivedProduct_CollectionBuilder.Impl withModifierExtension(
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
    public BiologicallyDerivedProduct_CollectionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public BiologicallyDerivedProduct_CollectionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public BiologicallyDerivedProduct.Collection build() {
      return new BiologicallyDerivedProduct.Collection(
          OptionConverters.toScala(id),
          OptionConverters.toScala(source),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(collector),
          (Option) OptionConverters.toScala(collected),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
