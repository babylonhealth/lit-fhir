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
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class TerminologyCapabilities_CodeSystem_VersionBuilder {
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
  public TerminologyCapabilities_CodeSystem_VersionBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public TerminologyCapabilities_CodeSystem_VersionBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param code */
  public TerminologyCapabilities_CodeSystem_VersionBuilder withCode(@NonNull String code) {
    this.code = Optional.of(code);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public TerminologyCapabilities_CodeSystem_VersionBuilder withLanguage(
      @NonNull String... language) {
    this.language = Arrays.asList(language);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public TerminologyCapabilities_CodeSystem_VersionBuilder withLanguage(
      @NonNull Collection<String> language) {
    this.language = Collections.unmodifiableCollection(language);
    return this;
  }
  /** @param property */
  public TerminologyCapabilities_CodeSystem_VersionBuilder withProperty(
      @NonNull String... property) {
    this.property = Arrays.asList(property);
    return this;
  }
  /** @param property */
  public TerminologyCapabilities_CodeSystem_VersionBuilder withProperty(
      @NonNull Collection<String> property) {
    this.property = Collections.unmodifiableCollection(property);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public TerminologyCapabilities_CodeSystem_VersionBuilder withExtension(
      @NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public TerminologyCapabilities_CodeSystem_VersionBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param isDefault */
  public TerminologyCapabilities_CodeSystem_VersionBuilder withIsDefault(
      @NonNull Boolean isDefault) {
    this.isDefault = Optional.of(isDefault);
    return this;
  }
  /** @param compositional */
  public TerminologyCapabilities_CodeSystem_VersionBuilder withCompositional(
      @NonNull Boolean compositional) {
    this.compositional = Optional.of(compositional);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public TerminologyCapabilities_CodeSystem_VersionBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public TerminologyCapabilities_CodeSystem_VersionBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param filter */
  public TerminologyCapabilities_CodeSystem_VersionBuilder withFilter(
      @NonNull TerminologyCapabilities$CodeSystem$Version$Filter... filter) {
    this.filter = Arrays.asList(filter);
    return this;
  }
  /** @param filter */
  public TerminologyCapabilities_CodeSystem_VersionBuilder withFilter(
      @NonNull Collection<TerminologyCapabilities$CodeSystem$Version$Filter> filter) {
    this.filter = Collections.unmodifiableCollection(filter);
    return this;
  }

  public TerminologyCapabilities$CodeSystem$Version build() {
    return new TerminologyCapabilities$CodeSystem$Version(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(code),
        language.stream().collect(new LitSeqJCollector<>()),
        property.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(isDefault.map(x -> (Object) x)),
        (Option) OptionConverters.toScala(compositional.map(x -> (Object) x)),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        filter.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
