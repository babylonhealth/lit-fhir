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
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ExampleScenarioBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> url = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<String> name = Optional.empty();
  private Optional<FHIRDateTime> date = Optional.empty();
  private PUBLICATION_STATUS status;
  private Optional<String> version = Optional.empty();
  private Collection<ContactDetail> contact = Collections.emptyList();
  private Optional<String> purpose = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<String> workflow = Collections.emptyList();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> publisher = Optional.empty();
  private Optional<String> copyright = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Collection<UsageContext> useContext = Collections.emptyList();
  private Optional<Boolean> experimental = Optional.empty();
  private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<ExampleScenario.Actor> actor = Collections.emptyList();
  private Collection<ExampleScenario.Process> process = Collections.emptyList();
  private Collection<ExampleScenario.Instance> instance = Collections.emptyList();

  /**
   * Required fields for {@link ExampleScenario}
   *
   * @param status - The status of this example scenario. Enables tracking the life-cycle of the
   *     content.
   */
  public ExampleScenarioBuilder(PUBLICATION_STATUS status) {
    this.status = status;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ExampleScenarioBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param url - An absolute URI that is used to identify this example scenario when it is
   *     referenced in a specification, model, design or an instance; also called its canonical
   *     identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
   *     which an authoritative instance of this example scenario is (or will be) published. This
   *     URL can be the target of a canonical reference. It SHALL remain the same when the example
   *     scenario is stored on different servers.
   */
  public ExampleScenarioBuilder withUrl(@NonNull String url) {
    this.url = Optional.of(url);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public ExampleScenarioBuilder withMeta(@NonNull Meta meta) {
    this.meta = Optional.of(meta);
    return this;
  }
  /**
   * @param text - A human-readable narrative that contains a summary of the resource and can be
   *     used to represent the content of the resource to a human. The narrative need not encode all
   *     the structured data, but is required to contain sufficient detail to make it "clinically
   *     safe" for a human to just read the narrative. Resource definitions may define what content
   *     should be represented in the narrative to ensure clinical safety.
   */
  public ExampleScenarioBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param name - A natural language name identifying the example scenario. This name should be
   *     usable as an identifier for the module by machine processing applications such as code
   *     generation.
   */
  public ExampleScenarioBuilder withName(@NonNull String name) {
    this.name = Optional.of(name);
    return this;
  }
  /**
   * @param date - The date (and optionally time) when the example scenario was published. The date
   *     must change when the business version changes and it must change if the status code
   *     changes. In addition, it should change when the substantive content of the example scenario
   *     changes. (e.g. the 'content logical definition').
   */
  public ExampleScenarioBuilder withDate(@NonNull FHIRDateTime date) {
    this.date = Optional.of(date);
    return this;
  }
  /**
   * @param version - The identifier that is used to identify this version of the example scenario
   *     when it is referenced in a specification, model, design or instance. This is an arbitrary
   *     value managed by the example scenario author and is not expected to be globally unique. For
   *     example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available.
   *     There is also no expectation that versions can be placed in a lexicographical sequence.
   */
  public ExampleScenarioBuilder withVersion(@NonNull String version) {
    this.version = Optional.of(version);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public ExampleScenarioBuilder withContact(@NonNull ContactDetail... contact) {
    this.contact = Arrays.asList(contact);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public ExampleScenarioBuilder withContact(@NonNull Collection<ContactDetail> contact) {
    this.contact = Collections.unmodifiableCollection(contact);
    return this;
  }
  /**
   * @param purpose - What the example scenario resource is created for. This should not be used to
   *     show the business purpose of the scenario itself, but the purpose of documenting a
   *     scenario.
   */
  public ExampleScenarioBuilder withPurpose(@NonNull String purpose) {
    this.purpose = Optional.of(purpose);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public ExampleScenarioBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /** @param workflow - Another nested workflow. */
  public ExampleScenarioBuilder withWorkflow(@NonNull String... workflow) {
    this.workflow = Arrays.asList(workflow);
    return this;
  }
  /** @param workflow - Another nested workflow. */
  public ExampleScenarioBuilder withWorkflow(@NonNull Collection<String> workflow) {
    this.workflow = Collections.unmodifiableCollection(workflow);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ExampleScenarioBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ExampleScenarioBuilder withContained(@NonNull Collection<Resource> contained) {
    this.contained = Collections.unmodifiableCollection(contained);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ExampleScenarioBuilder withExtension(@NonNull Extension... extension) {
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
  public ExampleScenarioBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param publisher - The name of the organization or individual that published the example
   *     scenario.
   */
  public ExampleScenarioBuilder withPublisher(@NonNull String publisher) {
    this.publisher = Optional.of(publisher);
    return this;
  }
  /**
   * @param copyright - A copyright statement relating to the example scenario and/or its contents.
   *     Copyright statements are generally legal restrictions on the use and publishing of the
   *     example scenario.
   */
  public ExampleScenarioBuilder withCopyright(@NonNull String copyright) {
    this.copyright = Optional.of(copyright);
    return this;
  }
  /**
   * @param identifier - A formal identifier that is used to identify this example scenario when it
   *     is represented in other formats, or referenced in a specification, model, design or an
   *     instance.
   */
  public ExampleScenarioBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - A formal identifier that is used to identify this example scenario when it
   *     is represented in other formats, or referenced in a specification, model, design or an
   *     instance.
   */
  public ExampleScenarioBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate example scenario instances.
   */
  public ExampleScenarioBuilder withUseContext(@NonNull UsageContext... useContext) {
    this.useContext = Arrays.asList(useContext);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate example scenario instances.
   */
  public ExampleScenarioBuilder withUseContext(@NonNull Collection<UsageContext> useContext) {
    this.useContext = Collections.unmodifiableCollection(useContext);
    return this;
  }
  /**
   * @param experimental - A Boolean value to indicate that this example scenario is authored for
   *     testing purposes (or education/evaluation/marketing) and is not intended to be used for
   *     genuine usage.
   */
  public ExampleScenarioBuilder withExperimental(@NonNull Boolean experimental) {
    this.experimental = Optional.of(experimental);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the example scenario is intended to
   *     be used.
   */
  public ExampleScenarioBuilder withJurisdiction(@NonNull CodeableConcept... jurisdiction) {
    this.jurisdiction = Arrays.asList(jurisdiction);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the example scenario is intended to
   *     be used.
   */
  public ExampleScenarioBuilder withJurisdiction(
      @NonNull Collection<CodeableConcept> jurisdiction) {
    this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public ExampleScenarioBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
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
  public ExampleScenarioBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public ExampleScenarioBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param actor - Actor participating in the resource. */
  public ExampleScenarioBuilder withActor(@NonNull ExampleScenario.Actor... actor) {
    this.actor = Arrays.asList(actor);
    return this;
  }
  /** @param actor - Actor participating in the resource. */
  public ExampleScenarioBuilder withActor(@NonNull Collection<ExampleScenario.Actor> actor) {
    this.actor = Collections.unmodifiableCollection(actor);
    return this;
  }
  /** @param process - Each major process - a group of operations. */
  public ExampleScenarioBuilder withProcess(@NonNull ExampleScenario.Process... process) {
    this.process = Arrays.asList(process);
    return this;
  }
  /** @param process - Each major process - a group of operations. */
  public ExampleScenarioBuilder withProcess(@NonNull Collection<ExampleScenario.Process> process) {
    this.process = Collections.unmodifiableCollection(process);
    return this;
  }
  /** @param instance - Each resource and each version that is present in the workflow. */
  public ExampleScenarioBuilder withInstance(@NonNull ExampleScenario.Instance... instance) {
    this.instance = Arrays.asList(instance);
    return this;
  }
  /** @param instance - Each resource and each version that is present in the workflow. */
  public ExampleScenarioBuilder withInstance(
      @NonNull Collection<ExampleScenario.Instance> instance) {
    this.instance = Collections.unmodifiableCollection(instance);
    return this;
  }

  public ExampleScenarioBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public ExampleScenario build() {
    return new ExampleScenario(
        OptionConverters.toScala(id),
        OptionConverters.toScala(url),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        OptionConverters.toScala(name),
        OptionConverters.toScala(date),
        status,
        OptionConverters.toScala(version),
        contact.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(purpose),
        OptionConverters.toScala(language),
        workflow.stream().collect(new LitSeqJCollector<>()),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(publisher),
        OptionConverters.toScala(copyright),
        identifier.stream().collect(new LitSeqJCollector<>()),
        useContext.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(experimental.map(x -> (Object) x)),
        jurisdiction.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        actor.stream().collect(new LitSeqJCollector<>()),
        process.stream().collect(new LitSeqJCollector<>()),
        instance.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
