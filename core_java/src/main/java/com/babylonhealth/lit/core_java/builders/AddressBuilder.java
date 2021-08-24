package com.babylonhealth.lit.core_java.builders;

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
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.core.ADDRESS_USE;
import com.babylonhealth.lit.core.ADDRESS_TYPE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface AddressBuilder extends DataTypeBuilder {
  public Address build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements AddressBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<ADDRESS_USE> use = Optional.empty();
    private Optional<ADDRESS_TYPE> _type = Optional.empty();
    private Optional<String> text = Optional.empty();
    private Collection<String> line = Collections.emptyList();
    private Optional<String> city = Optional.empty();
    private Optional<String> state = Optional.empty();
    private Optional<Period> period = Optional.empty();
    private Optional<String> country = Optional.empty();
    private Optional<String> district = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> postalCode = Optional.empty();

    /** Required fields for {@link Address} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public AddressBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param use - The purpose of this address. */
    public AddressBuilder.Impl withUse(@NonNull ADDRESS_USE use) {
      this.use = Optional.of(use);
      return this;
    }
    /**
     * @param _type - Distinguishes between physical addresses (those you can visit) and mailing
     *     addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
     */
    public AddressBuilder.Impl withType(@NonNull ADDRESS_TYPE _type) {
      this._type = Optional.of(_type);
      return this;
    }
    /**
     * @param text - Specifies the entire address as it should be displayed e.g. on a postal label.
     *     This may be provided instead of or as well as the specific parts.
     */
    public AddressBuilder.Impl withText(@NonNull String text) {
      this.text = Optional.of(text);
      return this;
    }
    /**
     * @param line - This component contains the house number, apartment number, street name, street
     *     direction, P.O. Box number, delivery hints, and similar address information.
     */
    public AddressBuilder.Impl withLine(@NonNull String... line) {
      this.line = Arrays.asList(line);
      return this;
    }
    /**
     * @param line - This component contains the house number, apartment number, street name, street
     *     direction, P.O. Box number, delivery hints, and similar address information.
     */
    public AddressBuilder.Impl withLine(@NonNull Collection<String> line) {
      this.line = Collections.unmodifiableCollection(line);
      return this;
    }
    /**
     * @param city - The name of the city, town, suburb, village or other community or delivery
     *     center.
     */
    public AddressBuilder.Impl withCity(@NonNull String city) {
      this.city = Optional.of(city);
      return this;
    }
    /**
     * @param state - Sub-unit of a country with limited sovereignty in a federally organized
     *     country. A code may be used if codes are in common use (e.g. US 2 letter state codes).
     */
    public AddressBuilder.Impl withState(@NonNull String state) {
      this.state = Optional.of(state);
      return this;
    }
    /** @param period - Time period when address was/is in use. */
    public AddressBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public AddressBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /** @param country - Country - a nation as commonly understood or generally accepted. */
    public AddressBuilder.Impl withCountry(@NonNull String country) {
      this.country = Optional.of(country);
      return this;
    }
    /** @param district - The name of the administrative area (county). */
    public AddressBuilder.Impl withDistrict(@NonNull String district) {
      this.district = Optional.of(district);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public AddressBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public AddressBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public AddressBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param postalCode - A postal code designating a region defined by the postal service. */
    public AddressBuilder.Impl withPostalCode(@NonNull String postalCode) {
      this.postalCode = Optional.of(postalCode);
      return this;
    }

    public Address build() {
      return new Address(
          OptionConverters.toScala(id),
          OptionConverters.toScala(use),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(text),
          line.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(city),
          OptionConverters.toScala(state),
          OptionConverters.toScala(period),
          OptionConverters.toScala(country),
          OptionConverters.toScala(district),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(postalCode),
          LitUtils.emptyMetaElMap());
    }
  }
}
