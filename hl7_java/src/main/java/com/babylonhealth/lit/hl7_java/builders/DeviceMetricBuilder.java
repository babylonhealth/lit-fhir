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
import com.babylonhealth.lit.hl7.METRIC_COLOR;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.METRIC_CATEGORY;
import com.babylonhealth.lit.hl7.METRIC_OPERATIONAL_STATUS;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface DeviceMetricBuilder extends DomainResourceBuilder {
  public DeviceMetric build();

  public static Impl init(CodeableConcept _type, METRIC_CATEGORY category) {
    return new Impl(_type, category);
  }

  public static Impl builder(CodeableConceptBuilder _type, METRIC_CATEGORY category) {
    return new Impl(_type.build(), category);
  }

  public class Impl implements DeviceMetricBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private CodeableConcept _type;
    private Optional<CodeableConcept> unit = Optional.empty();
    private Optional<METRIC_COLOR> color = Optional.empty();
    private Optional<Reference> source = Optional.empty();
    private Optional<Reference> parent = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private METRIC_CATEGORY category;
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<METRIC_OPERATIONAL_STATUS> operationalStatus = Optional.empty();
    private Optional<Timing> measurementPeriod = Optional.empty();
    private Collection<DeviceMetric.Calibration> calibration = Collections.emptyList();

    /**
     * Required fields for {@link DeviceMetric}
     *
     * @param _type - Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.
     * @param category - Indicates the category of the observation generation process. A
     *     DeviceMetric can be for example a setting, measurement, or calculation.
     */
    public Impl(CodeableConcept _type, METRIC_CATEGORY category) {
      this._type = _type;
      this.category = category;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public DeviceMetricBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public DeviceMetricBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public DeviceMetricBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
      this.meta = Optional.of(meta.build());
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public DeviceMetricBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public DeviceMetricBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param unit - Describes the unit that an observed value determined for this metric will have.
     *     For example: Percent, Seconds, etc.
     */
    public DeviceMetricBuilder.Impl withUnit(@NonNull CodeableConcept unit) {
      this.unit = Optional.of(unit);
      return this;
    }

    public DeviceMetricBuilder.Impl withUnit(@NonNull CodeableConceptBuilder unit) {
      this.unit = Optional.of(unit.build());
      return this;
    }
    /**
     * @param color - Describes the color representation for the metric. This is often used to aid
     *     clinicians to track and identify parameter types by color. In practice, consider a
     *     Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in
     *     different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
     */
    public DeviceMetricBuilder.Impl withColor(@NonNull METRIC_COLOR color) {
      this.color = Optional.of(color);
      return this;
    }
    /**
     * @param source - Describes the link to the Device that this DeviceMetric belongs to and that
     *     contains administrative device information such as manufacturer, serial number, etc.
     */
    public DeviceMetricBuilder.Impl withSource(@NonNull Reference source) {
      this.source = Optional.of(source);
      return this;
    }

    public DeviceMetricBuilder.Impl withSource(@NonNull ReferenceBuilder source) {
      this.source = Optional.of(source.build());
      return this;
    }
    /**
     * @param parent - Describes the link to the Device that this DeviceMetric belongs to and that
     *     provide information about the location of this DeviceMetric in the containment structure
     *     of the parent Device. An example would be a Device that represents a Channel. This
     *     reference can be used by a client application to distinguish DeviceMetrics that have the
     *     same type, but should be interpreted based on their containment location.
     */
    public DeviceMetricBuilder.Impl withParent(@NonNull Reference parent) {
      this.parent = Optional.of(parent);
      return this;
    }

    public DeviceMetricBuilder.Impl withParent(@NonNull ReferenceBuilder parent) {
      this.parent = Optional.of(parent.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public DeviceMetricBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public DeviceMetricBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public DeviceMetricBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public DeviceMetricBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
      this.contained = Arrays.stream(contained).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public DeviceMetricBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public DeviceMetricBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public DeviceMetricBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Unique instance identifiers assigned to a device by the device or gateway
     *     software, manufacturers, other organizations or owners. For example: handle ID.
     */
    public DeviceMetricBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Unique instance identifiers assigned to a device by the device or gateway
     *     software, manufacturers, other organizations or owners. For example: handle ID.
     */
    public DeviceMetricBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public DeviceMetricBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public DeviceMetricBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
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
    public DeviceMetricBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public DeviceMetricBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public DeviceMetricBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param operationalStatus - Indicates current operational state of the device. For example:
     *     On, Off, Standby, etc.
     */
    public DeviceMetricBuilder.Impl withOperationalStatus(
        @NonNull METRIC_OPERATIONAL_STATUS operationalStatus) {
      this.operationalStatus = Optional.of(operationalStatus);
      return this;
    }
    /**
     * @param measurementPeriod - Describes the measurement repetition time. This is not necessarily
     *     the same as the update period. The measurement repetition time can range from
     *     milliseconds up to hours. An example for a measurement repetition time in the range of
     *     milliseconds is the sampling rate of an ECG. An example for a measurement repetition time
     *     in the range of hours is a NIBP that is triggered automatically every hour. The update
     *     period may be different than the measurement repetition time, if the device does not
     *     update the published observed value with the same frequency as it was measured.
     */
    public DeviceMetricBuilder.Impl withMeasurementPeriod(@NonNull Timing measurementPeriod) {
      this.measurementPeriod = Optional.of(measurementPeriod);
      return this;
    }

    public DeviceMetricBuilder.Impl withMeasurementPeriod(
        @NonNull TimingBuilder measurementPeriod) {
      this.measurementPeriod = Optional.of(measurementPeriod.build());
      return this;
    }
    /**
     * @param calibration - Describes the calibrations that have been performed or that are required
     *     to be performed.
     */
    public DeviceMetricBuilder.Impl withCalibration(
        @NonNull DeviceMetric.Calibration... calibration) {
      this.calibration = Arrays.asList(calibration);
      return this;
    }
    /**
     * @param calibration - Describes the calibrations that have been performed or that are required
     *     to be performed.
     */
    public DeviceMetricBuilder.Impl withCalibration(
        @NonNull Collection<DeviceMetric.Calibration> calibration) {
      this.calibration = Collections.unmodifiableCollection(calibration);
      return this;
    }

    public DeviceMetricBuilder.Impl withCalibration(
        @NonNull DeviceMetric_CalibrationBuilder... calibration) {
      this.calibration = Arrays.stream(calibration).map(e -> e.build()).collect(toList());
      return this;
    }

    public DeviceMetricBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public DeviceMetric build() {
      return new DeviceMetric(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          _type,
          OptionConverters.toScala(unit),
          OptionConverters.toScala(color),
          OptionConverters.toScala(source),
          OptionConverters.toScala(parent),
          OptionConverters.toScala(language),
          category,
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(operationalStatus),
          OptionConverters.toScala(measurementPeriod),
          calibration.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
