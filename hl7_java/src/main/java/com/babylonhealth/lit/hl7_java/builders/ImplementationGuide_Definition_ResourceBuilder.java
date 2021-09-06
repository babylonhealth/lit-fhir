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
import com.babylonhealth.lit.hl7.FHIR_VERSION;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ImplementationGuide_Definition_ResourceBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> name = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Reference reference;
  private Optional<Choice00683246261> example = Optional.empty();
  private Optional<String> groupingId = Optional.empty();
  private Collection<FHIR_VERSION> fhirVersion = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link ImplementationGuide$Definition$Resource}
   *
   * @param reference
   */
  public ImplementationGuide_Definition_ResourceBuilder(Reference reference) {
    this.reference = reference;
  }

  public static Choice00683246261 example(Boolean b) {
    return new Choice00683246261(b);
  }

  public static Choice00683246261 example(String s) {
    return new Choice00683246261(s);
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ImplementationGuide_Definition_ResourceBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param name - A natural language name identifying the implementation guide. This name should be
   *     usable as an identifier for the module by machine processing applications such as code
   *     generation.
   */
  public ImplementationGuide_Definition_ResourceBuilder withName(@NonNull String name) {
    this.name = Optional.of(name);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ImplementationGuide_Definition_ResourceBuilder withExtension(
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
  public ImplementationGuide_Definition_ResourceBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param example Field is a 'choice' field. Type should be one of Boolean, String. To pass the
   *     value in, wrap with one of the ImplementationGuide_Definition_ResourceBuilder.example
   *     static methods
   */
  public ImplementationGuide_Definition_ResourceBuilder withExample(
      @NonNull Choice00683246261 example) {
    this.example = Optional.of(example);
    return this;
  }
  /** @param groupingId */
  public ImplementationGuide_Definition_ResourceBuilder withGroupingId(@NonNull String groupingId) {
    this.groupingId = Optional.of(groupingId);
    return this;
  }
  /**
   * @param fhirVersion - The version(s) of the FHIR specification that this ImplementationGuide
   *     targets - e.g. describes how to use. The value of this element is the formal version of the
   *     specification, without the revision number, e.g. [publication].[major].[minor], which is
   *     4.0.1. for this version.
   */
  public ImplementationGuide_Definition_ResourceBuilder withFhirVersion(
      @NonNull FHIR_VERSION... fhirVersion) {
    this.fhirVersion = Arrays.asList(fhirVersion);
    return this;
  }
  /**
   * @param fhirVersion - The version(s) of the FHIR specification that this ImplementationGuide
   *     targets - e.g. describes how to use. The value of this element is the formal version of the
   *     specification, without the revision number, e.g. [publication].[major].[minor], which is
   *     4.0.1. for this version.
   */
  public ImplementationGuide_Definition_ResourceBuilder withFhirVersion(
      @NonNull Collection<FHIR_VERSION> fhirVersion) {
    this.fhirVersion = Collections.unmodifiableCollection(fhirVersion);
    return this;
  }
  /**
   * @param description - A free text natural language description of the implementation guide from
   *     a consumer's perspective.
   */
  public ImplementationGuide_Definition_ResourceBuilder withDescription(
      @NonNull String description) {
    this.description = Optional.of(description);
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
  public ImplementationGuide_Definition_ResourceBuilder withModifierExtension(
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
  public ImplementationGuide_Definition_ResourceBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public ImplementationGuide$Definition$Resource build() {
    return new ImplementationGuide$Definition$Resource(
        OptionConverters.toScala(id),
        OptionConverters.toScala(name),
        extension.stream().collect(new LitSeqJCollector<>()),
        reference,
        (Option) OptionConverters.toScala(example),
        OptionConverters.toScala(groupingId),
        fhirVersion.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(description),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
