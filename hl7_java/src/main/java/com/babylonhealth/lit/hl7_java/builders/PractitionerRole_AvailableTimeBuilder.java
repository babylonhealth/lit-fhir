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
import com.babylonhealth.lit.core.DAYS_OF_WEEK;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class PractitionerRole_AvailableTimeBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Boolean> allDay = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<DAYS_OF_WEEK> daysOfWeek = Collections.emptyList();
  private Optional<LocalTime> availableEndTime = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<LocalTime> availableStartTime = Optional.empty();

  /** Required fields for {@link PractitionerRole.AvailableTime} */
  public PractitionerRole_AvailableTimeBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public PractitionerRole_AvailableTimeBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param allDay */
  public PractitionerRole_AvailableTimeBuilder withAllDay(@NonNull Boolean allDay) {
    this.allDay = Optional.of(allDay);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public PractitionerRole_AvailableTimeBuilder withExtension(@NonNull Extension... extension) {
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
  public PractitionerRole_AvailableTimeBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param daysOfWeek */
  public PractitionerRole_AvailableTimeBuilder withDaysOfWeek(@NonNull DAYS_OF_WEEK... daysOfWeek) {
    this.daysOfWeek = Arrays.asList(daysOfWeek);
    return this;
  }
  /** @param daysOfWeek */
  public PractitionerRole_AvailableTimeBuilder withDaysOfWeek(
      @NonNull Collection<DAYS_OF_WEEK> daysOfWeek) {
    this.daysOfWeek = Collections.unmodifiableCollection(daysOfWeek);
    return this;
  }
  /** @param availableEndTime */
  public PractitionerRole_AvailableTimeBuilder withAvailableEndTime(
      @NonNull LocalTime availableEndTime) {
    this.availableEndTime = Optional.of(availableEndTime);
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
  public PractitionerRole_AvailableTimeBuilder withModifierExtension(
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
  public PractitionerRole_AvailableTimeBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param availableStartTime */
  public PractitionerRole_AvailableTimeBuilder withAvailableStartTime(
      @NonNull LocalTime availableStartTime) {
    this.availableStartTime = Optional.of(availableStartTime);
    return this;
  }

  public PractitionerRole.AvailableTime build() {
    return new PractitionerRole.AvailableTime(
        OptionConverters.toScala(id),
        OptionConverters.toScala(allDay.map(x -> (Object) x)),
        extension.stream().collect(new LitSeqJCollector<>()),
        daysOfWeek.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(availableEndTime),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(availableStartTime),
        LitUtils.emptyMetaElMap());
  }
}
