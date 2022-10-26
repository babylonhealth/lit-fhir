package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface TestScriptBuilder extends DomainResourceBuilder {
  public TestScript build();

  public static Impl init(String url, String name, PUBLICATION_STATUS status) {
    return new Impl(url, name, status);
  }

  public static Impl builder(String url, String name, PUBLICATION_STATUS status) {
    return new Impl(url, name, status);
  }

  public class Impl implements TestScriptBuilder {
    private Optional<String> id = Optional.empty();
    private String url;
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private String name;
    private Optional<FHIRDateTime> date = Optional.empty();
    private Optional<String> title = Optional.empty();
    private PUBLICATION_STATUS status;
    private Optional<String> version = Optional.empty();
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Optional<String> purpose = Optional.empty();
    private Collection<Reference> profile = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> publisher = Optional.empty();
    private Optional<String> copyright = Optional.empty();
    private Optional<Identifier> identifier = Optional.empty();
    private Collection<UsageContext> useContext = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<Boolean> experimental = Optional.empty();
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<TestScript.Origin> origin = Collections.emptyList();
    private Collection<TestScript.Fixture> fixture = Collections.emptyList();
    private Collection<TestScript.Variable> variable = Collections.emptyList();
    private Collection<TestScript.Destination> destination = Collections.emptyList();
    private Collection<TestScript.Test> test = Collections.emptyList();
    private Optional<TestScript.Teardown> teardown = Optional.empty();
    private Optional<TestScript.Metadata> metadata = Optional.empty();
    private Optional<TestScript.Setup> setup = Optional.empty();

    /**
     * Required fields for {@link TestScript}
     *
     * @param url - An absolute URI that is used to identify this test script when it is referenced
     *     in a specification, model, design or an instance; also called its canonical identifier.
     *     This SHOULD be globally unique and SHOULD be a literal address at which at which an
     *     authoritative instance of this test script is (or will be) published. This URL can be the
     *     target of a canonical reference. It SHALL remain the same when the test script is stored
     *     on different servers.
     * @param name - A natural language name identifying the test script. This name should be usable
     *     as an identifier for the module by machine processing applications such as code
     *     generation.
     * @param status - The status of this test script. Enables tracking the life-cycle of the
     *     content.
     */
    public Impl(String url, String name, PUBLICATION_STATUS status) {
      this.url = url;
      this.name = name;
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public TestScriptBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public TestScriptBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public TestScriptBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public TestScriptBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public TestScriptBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param date - The date (and optionally time) when the test script was published. The date
     *     must change when the business version changes and it must change if the status code
     *     changes. In addition, it should change when the substantive content of the test script
     *     changes.
     */
    public TestScriptBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /** @param title - A short, descriptive, user-friendly title for the test script. */
    public TestScriptBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the test script when
     *     it is referenced in a specification, model, design or instance. This is an arbitrary
     *     value managed by the test script author and is not expected to be globally unique. For
     *     example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available.
     *     There is also no expectation that versions can be placed in a lexicographical sequence.
     */
    public TestScriptBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public TestScriptBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public TestScriptBuilder.Impl withContact(@NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public TestScriptBuilder.Impl withContact(@NonNull ContactDetailBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param purpose - Explanation of why this test script is needed and why it has been designed
     *     as it has.
     */
    public TestScriptBuilder.Impl withPurpose(@NonNull String purpose) {
      this.purpose = Optional.of(purpose);
      return this;
    }
    /** @param profile - Reference to the profile to be used for validation. */
    public TestScriptBuilder.Impl withProfile(@NonNull Reference... profile) {
      this.profile = Arrays.asList(profile);
      return this;
    }
    /** @param profile - Reference to the profile to be used for validation. */
    public TestScriptBuilder.Impl withProfile(@NonNull Collection<Reference> profile) {
      this.profile = Collections.unmodifiableCollection(profile);
      return this;
    }

    public TestScriptBuilder.Impl withProfile(@NonNull ReferenceBuilder... profile) {
      this.profile = Arrays.stream(profile).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public TestScriptBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public TestScriptBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public TestScriptBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public TestScriptBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public TestScriptBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public TestScriptBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public TestScriptBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param publisher - The name of the organization or individual that published the test script.
     */
    public TestScriptBuilder.Impl withPublisher(@NonNull String publisher) {
      this.publisher = Optional.of(publisher);
      return this;
    }
    /**
     * @param copyright - A copyright statement relating to the test script and/or its contents.
     *     Copyright statements are generally legal restrictions on the use and publishing of the
     *     test script.
     */
    public TestScriptBuilder.Impl withCopyright(@NonNull String copyright) {
      this.copyright = Optional.of(copyright);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this test script when it is
     *     represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public TestScriptBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public TestScriptBuilder.Impl withIdentifier(@NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate test script instances.
     */
    public TestScriptBuilder.Impl withUseContext(@NonNull UsageContext... useContext) {
      this.useContext = Arrays.asList(useContext);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate test script instances.
     */
    public TestScriptBuilder.Impl withUseContext(@NonNull Collection<UsageContext> useContext) {
      this.useContext = Collections.unmodifiableCollection(useContext);
      return this;
    }

    public TestScriptBuilder.Impl withUseContext(@NonNull UsageContextBuilder... useContext) {
      this.useContext = Arrays.stream(useContext).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - A free text natural language description of the test script from a
     *     consumer's perspective.
     */
    public TestScriptBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param experimental - A Boolean value to indicate that this test script is authored for
     *     testing purposes (or education/evaluation/marketing) and is not intended to be used for
     *     genuine usage.
     */
    public TestScriptBuilder.Impl withExperimental(@NonNull Boolean experimental) {
      this.experimental = Optional.of(experimental);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the test script is intended to be
     *     used.
     */
    public TestScriptBuilder.Impl withJurisdiction(@NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the test script is intended to be
     *     used.
     */
    public TestScriptBuilder.Impl withJurisdiction(
        @NonNull Collection<CodeableConcept> jurisdiction) {
      this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
      return this;
    }

    public TestScriptBuilder.Impl withJurisdiction(
        @NonNull CodeableConceptBuilder... jurisdiction) {
      this.jurisdiction = Arrays.stream(jurisdiction).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public TestScriptBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
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
    public TestScriptBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public TestScriptBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public TestScriptBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param origin - An abstract server used in operations within this test script in the origin
     *     element.
     */
    public TestScriptBuilder.Impl withOrigin(@NonNull TestScript.Origin... origin) {
      this.origin = Arrays.asList(origin);
      return this;
    }
    /**
     * @param origin - An abstract server used in operations within this test script in the origin
     *     element.
     */
    public TestScriptBuilder.Impl withOrigin(@NonNull Collection<TestScript.Origin> origin) {
      this.origin = Collections.unmodifiableCollection(origin);
      return this;
    }

    public TestScriptBuilder.Impl withOrigin(@NonNull TestScript_OriginBuilder... origin) {
      this.origin = Arrays.stream(origin).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param fixture - Fixture in the test script - by reference (uri). All fixtures are required
     *     for the test script to execute.
     */
    public TestScriptBuilder.Impl withFixture(@NonNull TestScript.Fixture... fixture) {
      this.fixture = Arrays.asList(fixture);
      return this;
    }
    /**
     * @param fixture - Fixture in the test script - by reference (uri). All fixtures are required
     *     for the test script to execute.
     */
    public TestScriptBuilder.Impl withFixture(@NonNull Collection<TestScript.Fixture> fixture) {
      this.fixture = Collections.unmodifiableCollection(fixture);
      return this;
    }

    public TestScriptBuilder.Impl withFixture(@NonNull TestScript_FixtureBuilder... fixture) {
      this.fixture = Arrays.stream(fixture).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param variable - Variable is set based either on element value in response body or on header
     *     field value in the response headers.
     */
    public TestScriptBuilder.Impl withVariable(@NonNull TestScript.Variable... variable) {
      this.variable = Arrays.asList(variable);
      return this;
    }
    /**
     * @param variable - Variable is set based either on element value in response body or on header
     *     field value in the response headers.
     */
    public TestScriptBuilder.Impl withVariable(@NonNull Collection<TestScript.Variable> variable) {
      this.variable = Collections.unmodifiableCollection(variable);
      return this;
    }

    public TestScriptBuilder.Impl withVariable(@NonNull TestScript_VariableBuilder... variable) {
      this.variable = Arrays.stream(variable).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param destination - An abstract server used in operations within this test script in the
     *     destination element.
     */
    public TestScriptBuilder.Impl withDestination(@NonNull TestScript.Destination... destination) {
      this.destination = Arrays.asList(destination);
      return this;
    }
    /**
     * @param destination - An abstract server used in operations within this test script in the
     *     destination element.
     */
    public TestScriptBuilder.Impl withDestination(
        @NonNull Collection<TestScript.Destination> destination) {
      this.destination = Collections.unmodifiableCollection(destination);
      return this;
    }

    public TestScriptBuilder.Impl withDestination(
        @NonNull TestScript_DestinationBuilder... destination) {
      this.destination = Arrays.stream(destination).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param test - A test in this script. */
    public TestScriptBuilder.Impl withTest(@NonNull TestScript.Test... test) {
      this.test = Arrays.asList(test);
      return this;
    }
    /** @param test - A test in this script. */
    public TestScriptBuilder.Impl withTest(@NonNull Collection<TestScript.Test> test) {
      this.test = Collections.unmodifiableCollection(test);
      return this;
    }

    public TestScriptBuilder.Impl withTest(@NonNull TestScript_TestBuilder... test) {
      this.test = Arrays.stream(test).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param teardown - A series of operations required to clean up after all the tests are
     *     executed (successfully or otherwise).
     */
    public TestScriptBuilder.Impl withTeardown(@NonNull TestScript.Teardown teardown) {
      this.teardown = Optional.of(teardown);
      return this;
    }

    public TestScriptBuilder.Impl withTeardown(@NonNull TestScript_TeardownBuilder teardown) {
      this.teardown = Optional.of(teardown.build());
      return this;
    }
    /**
     * @param metadata - The required capability must exist and are assumed to function correctly on
     *     the FHIR server being tested.
     */
    public TestScriptBuilder.Impl withMetadata(@NonNull TestScript.Metadata metadata) {
      this.metadata = Optional.of(metadata);
      return this;
    }

    public TestScriptBuilder.Impl withMetadata(@NonNull TestScript_MetadataBuilder metadata) {
      this.metadata = Optional.of(metadata.build());
      return this;
    }
    /** @param setup - A series of required setup operations before tests are executed. */
    public TestScriptBuilder.Impl withSetup(@NonNull TestScript.Setup setup) {
      this.setup = Optional.of(setup);
      return this;
    }

    public TestScriptBuilder.Impl withSetup(@NonNull TestScript_SetupBuilder setup) {
      this.setup = Optional.of(setup.build());
      return this;
    }

    public TestScriptBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public TestScript build() {
      return new TestScript(
          OptionConverters.toScala(id),
          url,
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          name,
          OptionConverters.toScala(date),
          OptionConverters.toScala(title),
          status,
          OptionConverters.toScala(version),
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(purpose),
          profile.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(publisher),
          OptionConverters.toScala(copyright),
          OptionConverters.toScala(identifier),
          useContext.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(experimental.map(x -> (Object) x)),
          jurisdiction.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          origin.stream().collect(new LitSeqJCollector<>()),
          fixture.stream().collect(new LitSeqJCollector<>()),
          variable.stream().collect(new LitSeqJCollector<>()),
          destination.stream().collect(new LitSeqJCollector<>()),
          test.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(teardown),
          OptionConverters.toScala(metadata),
          OptionConverters.toScala(setup),
          LitUtils.emptyMetaElMap());
    }
  }
}
