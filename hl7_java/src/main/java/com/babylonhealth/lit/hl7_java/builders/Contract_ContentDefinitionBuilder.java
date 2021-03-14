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
import com.babylonhealth.lit.hl7.CONTRACT_PUBLICATIONSTATUS;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Contract_ContentDefinitionBuilder {
  private Optional<String> id = Optional.empty();
  private CodeableConcept _type;
  private Optional<CodeableConcept> subType = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> publisher = Optional.empty();
  private Optional<String> copyright = Optional.empty();
  private Optional<FHIRDateTime> publicationDate = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private CONTRACT_PUBLICATIONSTATUS publicationStatus;

  /**
   * Required fields for {@link Contract.ContentDefinition}
   *
   * @param _type - A high-level category for the legal instrument, whether constructed as a
   *     Contract definition, derivative, or instance in any legal state. Provides additional
   *     information about its content within the context of the Contract's scope to distinguish the
   *     kinds of systems that would be interested in the contract.
   * @param publicationStatus
   */
  public Contract_ContentDefinitionBuilder(
      CodeableConcept _type, CONTRACT_PUBLICATIONSTATUS publicationStatus) {
    this._type = _type;
    this.publicationStatus = publicationStatus;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Contract_ContentDefinitionBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param subType - Sub-category for the Contract that distinguishes the kinds of systems that
   *     would be interested in the Contract within the context of the Contract's scope.
   */
  public Contract_ContentDefinitionBuilder withSubType(@NonNull CodeableConcept subType) {
    this.subType = Optional.of(subType);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Contract_ContentDefinitionBuilder withExtension(@NonNull Extension... extension) {
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
  public Contract_ContentDefinitionBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param publisher */
  public Contract_ContentDefinitionBuilder withPublisher(@NonNull Reference publisher) {
    this.publisher = Optional.of(publisher);
    return this;
  }
  /** @param copyright */
  public Contract_ContentDefinitionBuilder withCopyright(@NonNull String copyright) {
    this.copyright = Optional.of(copyright);
    return this;
  }
  /** @param publicationDate */
  public Contract_ContentDefinitionBuilder withPublicationDate(
      @NonNull FHIRDateTime publicationDate) {
    this.publicationDate = Optional.of(publicationDate);
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
  public Contract_ContentDefinitionBuilder withModifierExtension(
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
  public Contract_ContentDefinitionBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public Contract.ContentDefinition build() {
    return new Contract.ContentDefinition(
        OptionConverters.toScala(id),
        _type,
        OptionConverters.toScala(subType),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(publisher),
        OptionConverters.toScala(copyright),
        OptionConverters.toScala(publicationDate),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        publicationStatus,
        LitUtils.emptyMetaElMap());
  }
}
