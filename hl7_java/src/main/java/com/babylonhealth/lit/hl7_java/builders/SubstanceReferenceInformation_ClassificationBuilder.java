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

public class SubstanceReferenceInformation_ClassificationBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CodeableConcept> domain = Optional.empty();
  private Collection<Reference> source = Collections.emptyList();
  private Collection<CodeableConcept> subtype = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<CodeableConcept> classification = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /** Required fields for {@link SubstanceReferenceInformation.Classification} */
  public SubstanceReferenceInformation_ClassificationBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public SubstanceReferenceInformation_ClassificationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param domain */
  public SubstanceReferenceInformation_ClassificationBuilder withDomain(
      @NonNull CodeableConcept domain) {
    this.domain = Optional.of(domain);
    return this;
  }
  /** @param source */
  public SubstanceReferenceInformation_ClassificationBuilder withSource(
      @NonNull Reference... source) {
    this.source = Arrays.asList(source);
    return this;
  }
  /** @param source */
  public SubstanceReferenceInformation_ClassificationBuilder withSource(
      @NonNull Collection<Reference> source) {
    this.source = Collections.unmodifiableCollection(source);
    return this;
  }
  /** @param subtype */
  public SubstanceReferenceInformation_ClassificationBuilder withSubtype(
      @NonNull CodeableConcept... subtype) {
    this.subtype = Arrays.asList(subtype);
    return this;
  }
  /** @param subtype */
  public SubstanceReferenceInformation_ClassificationBuilder withSubtype(
      @NonNull Collection<CodeableConcept> subtype) {
    this.subtype = Collections.unmodifiableCollection(subtype);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public SubstanceReferenceInformation_ClassificationBuilder withExtension(
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
  public SubstanceReferenceInformation_ClassificationBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param classification - Todo. */
  public SubstanceReferenceInformation_ClassificationBuilder withClassification(
      @NonNull CodeableConcept classification) {
    this.classification = Optional.of(classification);
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
  public SubstanceReferenceInformation_ClassificationBuilder withModifierExtension(
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
  public SubstanceReferenceInformation_ClassificationBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public SubstanceReferenceInformation.Classification build() {
    return new SubstanceReferenceInformation.Classification(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(domain),
        source.stream().collect(new LitSeqJCollector<>()),
        subtype.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(classification),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
