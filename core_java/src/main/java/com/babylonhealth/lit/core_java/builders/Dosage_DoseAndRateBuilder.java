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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Dosage_DoseAndRateBuilder {
  public Dosage.DoseAndRate build();

  public static Impl init() {
    return new Impl();
  }

  public static Choice01639511888 dose(Quantity q) {
    return new Choice01639511888(q);
  }

  public static Choice01639511888 dose(Range r) {
    return new Choice01639511888(r);
  }

  public static Choice_0575082635 rate(Quantity q) {
    return new Choice_0575082635(q);
  }

  public static Choice_0575082635 rate(Range r) {
    return new Choice_0575082635(r);
  }

  public static Choice_0575082635 rate(Ratio r) {
    return new Choice_0575082635(r);
  }

  public class Impl implements Dosage_DoseAndRateBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<Choice01639511888> dose = Optional.empty();
    private Optional<Choice_0575082635> rate = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();

    /** Required fields for {@link Dosage.DoseAndRate} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Dosage_DoseAndRateBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type */
    public Dosage_DoseAndRateBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }
    /**
     * @param dose Field is a 'choice' field. Type should be one of Quantity, Range. To pass the
     *     value in, wrap with one of the Dosage_DoseAndRateBuilder.dose static methods
     */
    public Dosage_DoseAndRateBuilder.Impl withDose(@NonNull Choice01639511888 dose) {
      this.dose = Optional.of(dose);
      return this;
    }
    /**
     * @param rate Field is a 'choice' field. Type should be one of Quantity, Range, Ratio. To pass
     *     the value in, wrap with one of the Dosage_DoseAndRateBuilder.rate static methods
     */
    public Dosage_DoseAndRateBuilder.Impl withRate(@NonNull Choice_0575082635 rate) {
      this.rate = Optional.of(rate);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public Dosage_DoseAndRateBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Dosage_DoseAndRateBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Dosage.DoseAndRate build() {
      return new Dosage.DoseAndRate(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          (Option) OptionConverters.toScala(dose),
          (Option) OptionConverters.toScala(rate),
          extension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
