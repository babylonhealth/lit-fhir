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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class DocumentReference_ContextBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<CodeableConcept> event = Collections.emptyList();
  private Optional<Period> period = Optional.empty();
  private Collection<Reference> related = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Reference> encounter = Collections.emptyList();
  private Optional<CodeableConcept> facilityType = Optional.empty();
  private Optional<CodeableConcept> practiceSetting = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Reference> sourcePatientInfo = Optional.empty();

  /** Required fields for {@link DocumentReference.Context} */
  public DocumentReference_ContextBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public DocumentReference_ContextBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param event */
  public DocumentReference_ContextBuilder withEvent(@NonNull CodeableConcept... event) {
    this.event = Arrays.asList(event);
    return this;
  }
  /** @param event */
  public DocumentReference_ContextBuilder withEvent(@NonNull Collection<CodeableConcept> event) {
    this.event = Collections.unmodifiableCollection(event);
    return this;
  }
  /** @param period */
  public DocumentReference_ContextBuilder withPeriod(@NonNull Period period) {
    this.period = Optional.of(period);
    return this;
  }
  /** @param related */
  public DocumentReference_ContextBuilder withRelated(@NonNull Reference... related) {
    this.related = Arrays.asList(related);
    return this;
  }
  /** @param related */
  public DocumentReference_ContextBuilder withRelated(@NonNull Collection<Reference> related) {
    this.related = Collections.unmodifiableCollection(related);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public DocumentReference_ContextBuilder withExtension(@NonNull Extension... extension) {
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
  public DocumentReference_ContextBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param encounter */
  public DocumentReference_ContextBuilder withEncounter(@NonNull Reference... encounter) {
    this.encounter = Arrays.asList(encounter);
    return this;
  }
  /** @param encounter */
  public DocumentReference_ContextBuilder withEncounter(@NonNull Collection<Reference> encounter) {
    this.encounter = Collections.unmodifiableCollection(encounter);
    return this;
  }
  /** @param facilityType */
  public DocumentReference_ContextBuilder withFacilityType(@NonNull CodeableConcept facilityType) {
    this.facilityType = Optional.of(facilityType);
    return this;
  }
  /** @param practiceSetting */
  public DocumentReference_ContextBuilder withPracticeSetting(
      @NonNull CodeableConcept practiceSetting) {
    this.practiceSetting = Optional.of(practiceSetting);
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
  public DocumentReference_ContextBuilder withModifierExtension(
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
  public DocumentReference_ContextBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param sourcePatientInfo */
  public DocumentReference_ContextBuilder withSourcePatientInfo(
      @NonNull Reference sourcePatientInfo) {
    this.sourcePatientInfo = Optional.of(sourcePatientInfo);
    return this;
  }

  public DocumentReference.Context build() {
    return new DocumentReference.Context(
        OptionConverters.toScala(id),
        event.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(period),
        related.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        encounter.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(facilityType),
        OptionConverters.toScala(practiceSetting),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(sourcePatientInfo),
        LitUtils.emptyMetaElMap());
  }
}