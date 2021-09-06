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
import com.babylonhealth.lit.hl7.MEASURE_REPORT_TYPE;
import com.babylonhealth.lit.hl7.MEASURE_REPORT_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface MeasureReportBuilder extends DomainResourceBuilder {
  public MeasureReport build();

  public static Impl init(
      MEASURE_REPORT_TYPE _type, MEASURE_REPORT_STATUS status, Period period, String measure) {
    return new Impl(_type, status, period, measure);
  }

  public class Impl implements MeasureReportBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private MEASURE_REPORT_TYPE _type;
    private Optional<FHIRDateTime> date = Optional.empty();
    private MEASURE_REPORT_STATUS status;
    private Period period;
    private String measure;
    private Optional<Reference> subject = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<Reference> reporter = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Reference> evaluatedResource = Collections.emptyList();
    private Optional<CodeableConcept> improvementNotation = Optional.empty();
    private Collection<MeasureReport.Group> group = Collections.emptyList();

    /**
     * Required fields for {@link MeasureReport}
     *
     * @param _type - The type of measure report. This may be an individual report, which provides
     *     the score for the measure for an individual member of the population; a subject-listing,
     *     which returns the list of members that meet the various criteria in the measure; a
     *     summary report, which returns a population count for each of the criteria in the measure;
     *     or a data-collection, which enables the MeasureReport to be used to exchange the
     *     data-of-interest for a quality measure.
     * @param status - The MeasureReport status. No data will be available until the MeasureReport
     *     status is complete.
     * @param period - The reporting period for which the report was calculated.
     * @param measure - A reference to the Measure that was calculated to produce this report.
     */
    public Impl(
        MEASURE_REPORT_TYPE _type, MEASURE_REPORT_STATUS status, Period period, String measure) {
      this._type = _type;
      this.status = status;
      this.period = period;
      this.measure = measure;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MeasureReportBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public MeasureReportBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public MeasureReportBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }
    /** @param date - The date this measure report was generated. */
    public MeasureReportBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /**
     * @param subject - Optional subject identifying the individual or individuals the report is
     *     for.
     */
    public MeasureReportBuilder.Impl withSubject(@NonNull Reference subject) {
      this.subject = Optional.of(subject);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public MeasureReportBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param reporter - The individual, location, or organization that is reporting the data. */
    public MeasureReportBuilder.Impl withReporter(@NonNull Reference reporter) {
      this.reporter = Optional.of(reporter);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MeasureReportBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public MeasureReportBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MeasureReportBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MeasureReportBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this MeasureReport when it
     *     is represented in other formats or referenced in a specification, model, design or an
     *     instance.
     */
    public MeasureReportBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this MeasureReport when it
     *     is represented in other formats or referenced in a specification, model, design or an
     *     instance.
     */
    public MeasureReportBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public MeasureReportBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
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
    public MeasureReportBuilder.Impl withModifierExtension(
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
    public MeasureReportBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /**
     * @param evaluatedResource - A reference to a Bundle containing the Resources that were used in
     *     the calculation of this measure.
     */
    public MeasureReportBuilder.Impl withEvaluatedResource(
        @NonNull Reference... evaluatedResource) {
      this.evaluatedResource = Arrays.asList(evaluatedResource);
      return this;
    }
    /**
     * @param evaluatedResource - A reference to a Bundle containing the Resources that were used in
     *     the calculation of this measure.
     */
    public MeasureReportBuilder.Impl withEvaluatedResource(
        @NonNull Collection<Reference> evaluatedResource) {
      this.evaluatedResource = Collections.unmodifiableCollection(evaluatedResource);
      return this;
    }
    /**
     * @param improvementNotation - Whether improvement in the measure is noted by an increase or
     *     decrease in the measure score.
     */
    public MeasureReportBuilder.Impl withImprovementNotation(
        @NonNull CodeableConcept improvementNotation) {
      this.improvementNotation = Optional.of(improvementNotation);
      return this;
    }
    /**
     * @param group - The results of the calculation, one for each population group in the measure.
     */
    public MeasureReportBuilder.Impl withGroup(@NonNull MeasureReport.Group... group) {
      this.group = Arrays.asList(group);
      return this;
    }
    /**
     * @param group - The results of the calculation, one for each population group in the measure.
     */
    public MeasureReportBuilder.Impl withGroup(@NonNull Collection<MeasureReport.Group> group) {
      this.group = Collections.unmodifiableCollection(group);
      return this;
    }

    public MeasureReportBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public MeasureReport build() {
      return new MeasureReport(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          _type,
          OptionConverters.toScala(date),
          status,
          period,
          measure,
          OptionConverters.toScala(subject),
          OptionConverters.toScala(language),
          OptionConverters.toScala(reporter),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          evaluatedResource.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(improvementNotation),
          group.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
