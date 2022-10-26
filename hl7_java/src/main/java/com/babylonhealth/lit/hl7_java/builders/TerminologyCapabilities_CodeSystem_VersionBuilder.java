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

public interface TerminologyCapabilities_CodeSystem_VersionBuilder {
  public TerminologyCapabilities$CodeSystem$Version build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements TerminologyCapabilities_CodeSystem_VersionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> code = Optional.empty();
    private Collection<String> language = Collections.emptyList();
    private Collection<String> property = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Boolean> isDefault = Optional.empty();
    private Optional<Boolean> compositional = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<TerminologyCapabilities$CodeSystem$Version$Filter> filter =
        Collections.emptyList();

    /** Required fields for {@link TerminologyCapabilities$CodeSystem$Version} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param code */
    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withCode(@NonNull String code) {
      this.code = Optional.of(code);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withLanguage(
        @NonNull String... language) {
      this.language = Arrays.asList(language);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withLanguage(
        @NonNull Collection<String> language) {
      this.language = Collections.unmodifiableCollection(language);
      return this;
    }
    /** @param property */
    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withProperty(
        @NonNull String... property) {
      this.property = Arrays.asList(property);
      return this;
    }
    /** @param property */
    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withProperty(
        @NonNull Collection<String> property) {
      this.property = Collections.unmodifiableCollection(property);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withExtension(
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
    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param isDefault */
    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withIsDefault(
        @NonNull Boolean isDefault) {
      this.isDefault = Optional.of(isDefault);
      return this;
    }
    /** @param compositional */
    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withCompositional(
        @NonNull Boolean compositional) {
      this.compositional = Optional.of(compositional);
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
    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withModifierExtension(
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
    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param filter */
    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withFilter(
        @NonNull TerminologyCapabilities$CodeSystem$Version$Filter... filter) {
      this.filter = Arrays.asList(filter);
      return this;
    }
    /** @param filter */
    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withFilter(
        @NonNull Collection<TerminologyCapabilities$CodeSystem$Version$Filter> filter) {
      this.filter = Collections.unmodifiableCollection(filter);
      return this;
    }

    public TerminologyCapabilities_CodeSystem_VersionBuilder.Impl withFilter(
        @NonNull TerminologyCapabilities_CodeSystem_Version_FilterBuilder... filter) {
      this.filter = Arrays.stream(filter).map(e -> e.build()).collect(toList());
      return this;
    }

    public TerminologyCapabilities$CodeSystem$Version build() {
      return new TerminologyCapabilities$CodeSystem$Version(
          OptionConverters.toScala(id),
          OptionConverters.toScala(code),
          language.stream().collect(new LitSeqJCollector<>()),
          property.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(isDefault.map(x -> (Object) x)),
          OptionConverters.toScala(compositional.map(x -> (Object) x)),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          filter.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
