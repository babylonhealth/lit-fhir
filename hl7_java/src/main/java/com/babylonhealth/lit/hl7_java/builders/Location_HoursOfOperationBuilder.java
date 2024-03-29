package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.DAYS_OF_WEEK;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Location_HoursOfOperationBuilder {
  public Location.HoursOfOperation build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Location_HoursOfOperationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Boolean> allDay = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<DAYS_OF_WEEK> daysOfWeek = Collections.emptyList();
    private Optional<LocalTime> openingTime = Optional.empty();
    private Optional<LocalTime> closingTime = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link Location.HoursOfOperation} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Location_HoursOfOperationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param allDay */
    public Location_HoursOfOperationBuilder.Impl withAllDay(@NonNull Boolean allDay) {
      this.allDay = Optional.of(allDay);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Location_HoursOfOperationBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Location_HoursOfOperationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Location_HoursOfOperationBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param daysOfWeek */
    public Location_HoursOfOperationBuilder.Impl withDaysOfWeek(
        @NonNull DAYS_OF_WEEK... daysOfWeek) {
      this.daysOfWeek = Arrays.asList(daysOfWeek);
      return this;
    }
    /** @param daysOfWeek */
    public Location_HoursOfOperationBuilder.Impl withDaysOfWeek(
        @NonNull Collection<DAYS_OF_WEEK> daysOfWeek) {
      this.daysOfWeek = Collections.unmodifiableCollection(daysOfWeek);
      return this;
    }
    /** @param openingTime */
    public Location_HoursOfOperationBuilder.Impl withOpeningTime(@NonNull LocalTime openingTime) {
      this.openingTime = Optional.of(openingTime);
      return this;
    }
    /** @param closingTime */
    public Location_HoursOfOperationBuilder.Impl withClosingTime(@NonNull LocalTime closingTime) {
      this.closingTime = Optional.of(closingTime);
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
    public Location_HoursOfOperationBuilder.Impl withModifierExtension(
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
    public Location_HoursOfOperationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Location_HoursOfOperationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Location.HoursOfOperation build() {
      return new Location.HoursOfOperation(
          OptionConverters.toScala(id),
          OptionConverters.toScala(allDay.map(x -> (Object) x)),
          extension.stream().collect(new LitSeqJCollector<>()),
          daysOfWeek.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(openingTime),
          OptionConverters.toScala(closingTime),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
