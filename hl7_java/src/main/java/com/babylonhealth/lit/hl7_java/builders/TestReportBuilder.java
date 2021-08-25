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
import com.babylonhealth.lit.hl7.REPORT_STATUS_CODES;
import com.babylonhealth.lit.hl7.REPORT_RESULT_CODES;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface TestReportBuilder extends DomainResourceBuilder {
  public TestReport build();

  public static Impl init(
      REPORT_STATUS_CODES status, REPORT_RESULT_CODES result, Reference testScript) {
    return new Impl(status, result, testScript);
  }

  public static Impl builder(
      REPORT_STATUS_CODES status, REPORT_RESULT_CODES result, ReferenceBuilder testScript) {
    return new Impl(status, result, testScript.build());
  }

  public class Impl implements TestReportBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<BigDecimal> score = Optional.empty();
    private REPORT_STATUS_CODES status;
    private REPORT_RESULT_CODES result;
    private Optional<String> tester = Optional.empty();
    private Optional<FHIRDateTime> issued = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Identifier> identifier = Optional.empty();
    private Reference testScript;
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<TestReport.Participant> participant = Collections.emptyList();
    private Collection<TestReport.Test> test = Collections.emptyList();
    private Optional<TestReport.Teardown> teardown = Optional.empty();
    private Optional<TestReport.Setup> setup = Optional.empty();

    /**
     * Required fields for {@link TestReport}
     *
     * @param status - The current state of this test report.
     * @param result - The overall result from the execution of the TestScript.
     * @param testScript - Ideally this is an absolute URL that is used to identify the
     *     version-specific TestScript that was executed, matching the `TestScript.url`.
     */
    public Impl(REPORT_STATUS_CODES status, REPORT_RESULT_CODES result, Reference testScript) {
      this.status = status;
      this.result = result;
      this.testScript = testScript;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public TestReportBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public TestReportBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public TestReportBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public TestReportBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public TestReportBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param name - A free text natural language name identifying the executed TestScript. */
    public TestReportBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param score - The final score (percentage of tests passed) resulting from the execution of
     *     the TestScript.
     */
    public TestReportBuilder.Impl withScore(@NonNull BigDecimal score) {
      this.score = Optional.of(score);
      return this;
    }
    /** @param tester - Name of the tester producing this report (Organization or individual). */
    public TestReportBuilder.Impl withTester(@NonNull String tester) {
      this.tester = Optional.of(tester);
      return this;
    }
    /** @param issued - When the TestScript was executed and this TestReport was generated. */
    public TestReportBuilder.Impl withIssued(@NonNull FHIRDateTime issued) {
      this.issued = Optional.of(issued);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public TestReportBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public TestReportBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public TestReportBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public TestReportBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public TestReportBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public TestReportBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public TestReportBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Identifier for the TestScript assigned for external purposes outside the
     *     context of FHIR.
     */
    public TestReportBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public TestReportBuilder.Impl withIdentifier(@NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public TestReportBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
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
    public TestReportBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public TestReportBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public TestReportBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param participant - A participant in the test execution, either the execution engine, a
     *     client, or a server.
     */
    public TestReportBuilder.Impl withParticipant(@NonNull TestReport.Participant... participant) {
      this.participant = Arrays.asList(participant);
      return this;
    }
    /**
     * @param participant - A participant in the test execution, either the execution engine, a
     *     client, or a server.
     */
    public TestReportBuilder.Impl withParticipant(
        @NonNull Collection<TestReport.Participant> participant) {
      this.participant = Collections.unmodifiableCollection(participant);
      return this;
    }

    public TestReportBuilder.Impl withParticipant(
        @NonNull TestReport_ParticipantBuilder... participant) {
      this.participant = Arrays.stream(participant).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param test - A test executed from the test script. */
    public TestReportBuilder.Impl withTest(@NonNull TestReport.Test... test) {
      this.test = Arrays.asList(test);
      return this;
    }
    /** @param test - A test executed from the test script. */
    public TestReportBuilder.Impl withTest(@NonNull Collection<TestReport.Test> test) {
      this.test = Collections.unmodifiableCollection(test);
      return this;
    }

    public TestReportBuilder.Impl withTest(@NonNull TestReport_TestBuilder... test) {
      this.test = Arrays.stream(test).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param teardown - The results of the series of operations required to clean up after all the
     *     tests were executed (successfully or otherwise).
     */
    public TestReportBuilder.Impl withTeardown(@NonNull TestReport.Teardown teardown) {
      this.teardown = Optional.of(teardown);
      return this;
    }

    public TestReportBuilder.Impl withTeardown(@NonNull TestReport_TeardownBuilder teardown) {
      this.teardown = Optional.of(teardown.build());
      return this;
    }
    /**
     * @param setup - The results of the series of required setup operations before the tests were
     *     executed.
     */
    public TestReportBuilder.Impl withSetup(@NonNull TestReport.Setup setup) {
      this.setup = Optional.of(setup);
      return this;
    }

    public TestReportBuilder.Impl withSetup(@NonNull TestReport_SetupBuilder setup) {
      this.setup = Optional.of(setup.build());
      return this;
    }

    public TestReportBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public TestReport build() {
      return new TestReport(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(name),
          OptionConverters.toScala(score),
          status,
          result,
          OptionConverters.toScala(tester),
          OptionConverters.toScala(issued),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(identifier),
          testScript,
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          participant.stream().collect(new LitSeqJCollector<>()),
          test.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(teardown),
          OptionConverters.toScala(setup),
          LitUtils.emptyMetaElMap());
    }
  }
}
