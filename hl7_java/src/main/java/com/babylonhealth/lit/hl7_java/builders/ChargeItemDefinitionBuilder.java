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
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ChargeItemDefinitionBuilder {
  private Optional<String> id = Optional.empty();
  private String url;
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<FHIRDateTime> date = Optional.empty();
  private Optional<CodeableConcept> code = Optional.empty();
  private Optional<String> title = Optional.empty();
  private Collection<String> partOf = Collections.emptyList();
  private PUBLICATION_STATUS status;
  private Optional<String> version = Optional.empty();
  private Collection<ContactDetail> contact = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<String> replaces = Collections.emptyList();
  private Collection<Reference> instance = Collections.emptyList();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> publisher = Optional.empty();
  private Optional<String> copyright = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Collection<UsageContext> useContext = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private Optional<Boolean> experimental = Optional.empty();
  private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
  private Optional<FHIRDate> approvalDate = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<String> derivedFromUri = Collections.emptyList();
  private Optional<FHIRDate> lastReviewDate = Optional.empty();
  private Optional<Period> effectivePeriod = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<ChargeItemDefinition.Applicability> applicability = Collections.emptyList();
  private Collection<ChargeItemDefinition.PropertyGroup> propertyGroup = Collections.emptyList();

  /**
   * Required fields for {@link ChargeItemDefinition}
   *
   * @param url - An absolute URI that is used to identify this charge item definition when it is
   *     referenced in a specification, model, design or an instance; also called its canonical
   *     identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
   *     which an authoritative instance of this charge item definition is (or will be) published.
   *     This URL can be the target of a canonical reference. It SHALL remain the same when the
   *     charge item definition is stored on different servers.
   * @param status - The current state of the ChargeItemDefinition.
   */
  public ChargeItemDefinitionBuilder(String url, PUBLICATION_STATUS status) {
    this.url = url;
    this.status = status;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ChargeItemDefinitionBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public ChargeItemDefinitionBuilder withMeta(@NonNull Meta meta) {
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
  public ChargeItemDefinitionBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param date - The date (and optionally time) when the charge item definition was published. The
   *     date must change when the business version changes and it must change if the status code
   *     changes. In addition, it should change when the substantive content of the charge item
   *     definition changes.
   */
  public ChargeItemDefinitionBuilder withDate(@NonNull FHIRDateTime date) {
    this.date = Optional.of(date);
    return this;
  }
  /**
   * @param code - The defined billing details in this resource pertain to the given billing code.
   */
  public ChargeItemDefinitionBuilder withCode(@NonNull CodeableConcept code) {
    this.code = Optional.of(code);
    return this;
  }
  /** @param title - A short, descriptive, user-friendly title for the charge item definition. */
  public ChargeItemDefinitionBuilder withTitle(@NonNull String title) {
    this.title = Optional.of(title);
    return this;
  }
  /**
   * @param partOf - A larger definition of which this particular definition is a component or step.
   */
  public ChargeItemDefinitionBuilder withPartOf(@NonNull String... partOf) {
    this.partOf = Arrays.asList(partOf);
    return this;
  }
  /**
   * @param partOf - A larger definition of which this particular definition is a component or step.
   */
  public ChargeItemDefinitionBuilder withPartOf(@NonNull Collection<String> partOf) {
    this.partOf = Collections.unmodifiableCollection(partOf);
    return this;
  }
  /**
   * @param version - The identifier that is used to identify this version of the charge item
   *     definition when it is referenced in a specification, model, design or instance. This is an
   *     arbitrary value managed by the charge item definition author and is not expected to be
   *     globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version
   *     is not available. There is also no expectation that versions can be placed in a
   *     lexicographical sequence. To provide a version consistent with the Decision Support Service
   *     specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on
   *     versioning knowledge assets, refer to the Decision Support Service specification. Note that
   *     a version is required for non-experimental active assets.
   */
  public ChargeItemDefinitionBuilder withVersion(@NonNull String version) {
    this.version = Optional.of(version);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public ChargeItemDefinitionBuilder withContact(@NonNull ContactDetail... contact) {
    this.contact = Arrays.asList(contact);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public ChargeItemDefinitionBuilder withContact(@NonNull Collection<ContactDetail> contact) {
    this.contact = Collections.unmodifiableCollection(contact);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public ChargeItemDefinitionBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param replaces - As new versions of a protocol or guideline are defined, allows identification
   *     of what versions are replaced by a new instance.
   */
  public ChargeItemDefinitionBuilder withReplaces(@NonNull String... replaces) {
    this.replaces = Arrays.asList(replaces);
    return this;
  }
  /**
   * @param replaces - As new versions of a protocol or guideline are defined, allows identification
   *     of what versions are replaced by a new instance.
   */
  public ChargeItemDefinitionBuilder withReplaces(@NonNull Collection<String> replaces) {
    this.replaces = Collections.unmodifiableCollection(replaces);
    return this;
  }
  /**
   * @param instance - The defined billing details in this resource pertain to the given product
   *     instance(s).
   */
  public ChargeItemDefinitionBuilder withInstance(@NonNull Reference... instance) {
    this.instance = Arrays.asList(instance);
    return this;
  }
  /**
   * @param instance - The defined billing details in this resource pertain to the given product
   *     instance(s).
   */
  public ChargeItemDefinitionBuilder withInstance(@NonNull Collection<Reference> instance) {
    this.instance = Collections.unmodifiableCollection(instance);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ChargeItemDefinitionBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ChargeItemDefinitionBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public ChargeItemDefinitionBuilder withExtension(@NonNull Extension... extension) {
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
  public ChargeItemDefinitionBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param publisher - The name of the organization or individual that published the charge item
   *     definition.
   */
  public ChargeItemDefinitionBuilder withPublisher(@NonNull String publisher) {
    this.publisher = Optional.of(publisher);
    return this;
  }
  /**
   * @param copyright - A copyright statement relating to the charge item definition and/or its
   *     contents. Copyright statements are generally legal restrictions on the use and publishing
   *     of the charge item definition.
   */
  public ChargeItemDefinitionBuilder withCopyright(@NonNull String copyright) {
    this.copyright = Optional.of(copyright);
    return this;
  }
  /**
   * @param identifier - A formal identifier that is used to identify this charge item definition
   *     when it is represented in other formats, or referenced in a specification, model, design or
   *     an instance.
   */
  public ChargeItemDefinitionBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - A formal identifier that is used to identify this charge item definition
   *     when it is represented in other formats, or referenced in a specification, model, design or
   *     an instance.
   */
  public ChargeItemDefinitionBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate charge item definition instances.
   */
  public ChargeItemDefinitionBuilder withUseContext(@NonNull UsageContext... useContext) {
    this.useContext = Arrays.asList(useContext);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate charge item definition instances.
   */
  public ChargeItemDefinitionBuilder withUseContext(@NonNull Collection<UsageContext> useContext) {
    this.useContext = Collections.unmodifiableCollection(useContext);
    return this;
  }
  /**
   * @param description - A free text natural language description of the charge item definition
   *     from a consumer's perspective.
   */
  public ChargeItemDefinitionBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /**
   * @param experimental - A Boolean value to indicate that this charge item definition is authored
   *     for testing purposes (or education/evaluation/marketing) and is not intended to be used for
   *     genuine usage.
   */
  public ChargeItemDefinitionBuilder withExperimental(@NonNull Boolean experimental) {
    this.experimental = Optional.of(experimental);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the charge item definition is
   *     intended to be used.
   */
  public ChargeItemDefinitionBuilder withJurisdiction(@NonNull CodeableConcept... jurisdiction) {
    this.jurisdiction = Arrays.asList(jurisdiction);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the charge item definition is
   *     intended to be used.
   */
  public ChargeItemDefinitionBuilder withJurisdiction(
      @NonNull Collection<CodeableConcept> jurisdiction) {
    this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
    return this;
  }
  /**
   * @param approvalDate - The date on which the resource content was approved by the publisher.
   *     Approval happens once when the content is officially approved for usage.
   */
  public ChargeItemDefinitionBuilder withApprovalDate(@NonNull FHIRDate approvalDate) {
    this.approvalDate = Optional.of(approvalDate);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public ChargeItemDefinitionBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param derivedFromUri - The URL pointing to an externally-defined charge item definition that
   *     is adhered to in whole or in part by this definition.
   */
  public ChargeItemDefinitionBuilder withDerivedFromUri(@NonNull String... derivedFromUri) {
    this.derivedFromUri = Arrays.asList(derivedFromUri);
    return this;
  }
  /**
   * @param derivedFromUri - The URL pointing to an externally-defined charge item definition that
   *     is adhered to in whole or in part by this definition.
   */
  public ChargeItemDefinitionBuilder withDerivedFromUri(
      @NonNull Collection<String> derivedFromUri) {
    this.derivedFromUri = Collections.unmodifiableCollection(derivedFromUri);
    return this;
  }
  /**
   * @param lastReviewDate - The date on which the resource content was last reviewed. Review
   *     happens periodically after approval but does not change the original approval date.
   */
  public ChargeItemDefinitionBuilder withLastReviewDate(@NonNull FHIRDate lastReviewDate) {
    this.lastReviewDate = Optional.of(lastReviewDate);
    return this;
  }
  /**
   * @param effectivePeriod - The period during which the charge item definition content was or is
   *     planned to be in active use.
   */
  public ChargeItemDefinitionBuilder withEffectivePeriod(@NonNull Period effectivePeriod) {
    this.effectivePeriod = Optional.of(effectivePeriod);
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
  public ChargeItemDefinitionBuilder withModifierExtension(
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
  public ChargeItemDefinitionBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param applicability - Expressions that describe applicability criteria for the billing code.
   */
  public ChargeItemDefinitionBuilder withApplicability(
      @NonNull ChargeItemDefinition.Applicability... applicability) {
    this.applicability = Arrays.asList(applicability);
    return this;
  }
  /**
   * @param applicability - Expressions that describe applicability criteria for the billing code.
   */
  public ChargeItemDefinitionBuilder withApplicability(
      @NonNull Collection<ChargeItemDefinition.Applicability> applicability) {
    this.applicability = Collections.unmodifiableCollection(applicability);
    return this;
  }
  /**
   * @param propertyGroup - Group of properties which are applicable under the same conditions. If
   *     no applicability rules are established for the group, then all properties always apply.
   */
  public ChargeItemDefinitionBuilder withPropertyGroup(
      @NonNull ChargeItemDefinition.PropertyGroup... propertyGroup) {
    this.propertyGroup = Arrays.asList(propertyGroup);
    return this;
  }
  /**
   * @param propertyGroup - Group of properties which are applicable under the same conditions. If
   *     no applicability rules are established for the group, then all properties always apply.
   */
  public ChargeItemDefinitionBuilder withPropertyGroup(
      @NonNull Collection<ChargeItemDefinition.PropertyGroup> propertyGroup) {
    this.propertyGroup = Collections.unmodifiableCollection(propertyGroup);
    return this;
  }

  public ChargeItemDefinitionBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public ChargeItemDefinition build() {
    return new ChargeItemDefinition(
        OptionConverters.toScala(id),
        url,
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        OptionConverters.toScala(date),
        OptionConverters.toScala(code),
        OptionConverters.toScala(title),
        partOf.stream().collect(new LitSeqJCollector<>()),
        status,
        OptionConverters.toScala(version),
        contact.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(language),
        replaces.stream().collect(new LitSeqJCollector<>()),
        instance.stream().collect(new LitSeqJCollector<>()),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(publisher),
        OptionConverters.toScala(copyright),
        identifier.stream().collect(new LitSeqJCollector<>()),
        useContext.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(description),
        OptionConverters.toScala(experimental.map(x -> (Object) x)),
        jurisdiction.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(approvalDate),
        OptionConverters.toScala(implicitRules),
        derivedFromUri.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(lastReviewDate),
        OptionConverters.toScala(effectivePeriod),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        applicability.stream().collect(new LitSeqJCollector<>()),
        propertyGroup.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
