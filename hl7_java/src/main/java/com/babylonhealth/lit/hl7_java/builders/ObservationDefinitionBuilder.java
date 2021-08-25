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
import com.babylonhealth.lit.hl7.PERMITTED_DATA_TYPE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ObservationDefinitionBuilder extends DomainResourceBuilder {
  public ObservationDefinition build();

  public static Impl init(CodeableConcept code, PUBLICATION_STATUS status) {
    return new Impl(code, status);
  }

  public static Impl builder(CodeableConceptBuilder code, PUBLICATION_STATUS status) {
    return new Impl(code.build(), status);
  }

  public class Impl implements ObservationDefinitionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<FHIRDateTime> date = Optional.empty();
    private CodeableConcept code;
    private Optional<String> title = Optional.empty();
    private PUBLICATION_STATUS status;
    private Optional<CodeableConcept> method = Optional.empty();
    private Collection<Reference> device = Collections.emptyList();
    private Optional<String> version = Optional.empty();
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Optional<String> purpose = Optional.empty();
    private Optional<CodeableConcept> subject = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Optional<CodeableConcept> bodySite = Optional.empty();
    private Collection<Reference> specimen = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> publisher = Optional.empty();
    private Optional<String> copyright = Optional.empty();
    private Collection<Reference> hasMember = Collections.emptyList();
    private Optional<Identifier> identifier = Optional.empty();
    private Collection<UsageContext> useContext = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<Boolean> experimental = Optional.empty();
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Optional<FHIRDate> approvalDate = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> performerType = Optional.empty();
    private Optional<FHIRDate> lastReviewDate = Optional.empty();
    private Collection<String> derivedFromUri = Collections.emptyList();
    private Optional<Period> effectivePeriod = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<PERMITTED_DATA_TYPE> permittedDataType = Collections.emptyList();
    private Optional<String> preferredReportName = Optional.empty();
    private Collection<String> derivedFromCanonical = Collections.emptyList();
    private Optional<Boolean> multipleResultsAllowed = Optional.empty();
    private Collection<ObservationDefinition.Component> component = Collections.emptyList();
    private Collection<ObservationDefinition.QualifiedValue> qualifiedValue =
        Collections.emptyList();
    private Optional<ObservationDefinition.QuantitativeDetails> quantitativeDetails =
        Optional.empty();

    /**
     * Required fields for {@link ObservationDefinition}
     *
     * @param code - Describes what will be observed. Sometimes this is called the observation
     *     "name".
     * @param status - The current state of the ObservationDefinition.
     */
    public Impl(CodeableConcept code, PUBLICATION_STATUS status) {
      this.code = code;
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ObservationDefinitionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - An absolute URL that is used to identify this ObservationDefinition when it is
     *     referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD
     *     be globally unique, and SHOULD be an address at which this ObservationDefinition is (or
     *     will be) published. The URL SHOULD include the major version of the
     *     ObservationDefinition. For more information see Technical and Business Versions.
     */
    public ObservationDefinitionBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public ObservationDefinitionBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public ObservationDefinitionBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param name - A natural language name identifying the ObservationDefinition. This name should
     *     be usable as an identifier for the module by machine processing applications such as code
     *     generation.
     */
    public ObservationDefinitionBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param date - The date (and optionally time) when the ObservationDefinition was published.
     *     The date must change when the business version changes and it must change if the status
     *     code changes. In addition, it should change when the substantive content of the
     *     ObservationDefinition changes.
     */
    public ObservationDefinitionBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /** @param title - A short, descriptive, user-friendly title for the ObservationDefinition. */
    public ObservationDefinitionBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /** @param method - The method or technique used to perform the observation. */
    public ObservationDefinitionBuilder.Impl withMethod(@NonNull CodeableConcept method) {
      this.method = Optional.of(method);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withMethod(@NonNull CodeableConceptBuilder method) {
      this.method = Optional.of(method.build());
      return this;
    }
    /**
     * @param device - The measurement model of device or actual device used to produce observations
     *     of this type.
     */
    public ObservationDefinitionBuilder.Impl withDevice(@NonNull Reference... device) {
      this.device = Arrays.asList(device);
      return this;
    }
    /**
     * @param device - The measurement model of device or actual device used to produce observations
     *     of this type.
     */
    public ObservationDefinitionBuilder.Impl withDevice(@NonNull Collection<Reference> device) {
      this.device = Collections.unmodifiableCollection(device);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withDevice(@NonNull ReferenceBuilder... device) {
      this.device = Arrays.stream(device).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the
     *     ObservationDefinition when it is referenced in a specification, model, design or
     *     instance. This is an arbitrary value managed by the ObservationDefinition author and is
     *     not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd)
     *     if a managed version is not available. There is also no expectation that versions are
     *     orderable.
     */
    public ObservationDefinitionBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public ObservationDefinitionBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public ObservationDefinitionBuilder.Impl withContact(
        @NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withContact(@NonNull ContactDetailBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param purpose - Explains why this ObservationDefinition is needed and why it has been
     *     designed as it has.
     */
    public ObservationDefinitionBuilder.Impl withPurpose(@NonNull String purpose) {
      this.purpose = Optional.of(purpose);
      return this;
    }
    /**
     * @param subject - A code that describes the intended kind of subject of Observation instances
     *     conforming to this ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withSubject(@NonNull CodeableConcept subject) {
      this.subject = Optional.of(subject);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withSubject(@NonNull CodeableConceptBuilder subject) {
      this.subject = Optional.of(subject.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public ObservationDefinitionBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param category - A code that classifies the general type of observation. */
    public ObservationDefinitionBuilder.Impl withCategory(@NonNull CodeableConcept... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /** @param category - A code that classifies the general type of observation. */
    public ObservationDefinitionBuilder.Impl withCategory(
        @NonNull Collection<CodeableConcept> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withCategory(
        @NonNull CodeableConceptBuilder... category) {
      this.category = Arrays.stream(category).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param bodySite - The site on the subject's body where the observation is to be made. */
    public ObservationDefinitionBuilder.Impl withBodySite(@NonNull CodeableConcept bodySite) {
      this.bodySite = Optional.of(bodySite);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withBodySite(
        @NonNull CodeableConceptBuilder bodySite) {
      this.bodySite = Optional.of(bodySite.build());
      return this;
    }
    /** @param specimen - The kind of specimen that this type of observation is produced on. */
    public ObservationDefinitionBuilder.Impl withSpecimen(@NonNull Reference... specimen) {
      this.specimen = Arrays.asList(specimen);
      return this;
    }
    /** @param specimen - The kind of specimen that this type of observation is produced on. */
    public ObservationDefinitionBuilder.Impl withSpecimen(@NonNull Collection<Reference> specimen) {
      this.specimen = Collections.unmodifiableCollection(specimen);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withSpecimen(@NonNull ReferenceBuilder... specimen) {
      this.specimen = Arrays.stream(specimen).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public ObservationDefinitionBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public ObservationDefinitionBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public ObservationDefinitionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ObservationDefinitionBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param publisher - Helps establish the "authority/credibility" of the ObservationDefinition.
     *     May also allow for contact.
     */
    public ObservationDefinitionBuilder.Impl withPublisher(@NonNull Reference publisher) {
      this.publisher = Optional.of(publisher);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withPublisher(@NonNull ReferenceBuilder publisher) {
      this.publisher = Optional.of(publisher.build());
      return this;
    }
    /**
     * @param copyright - Copyright statement relating to the ObservationDefinition and/or its
     *     contents. Copyright statements are generally legal restrictions on the use and publishing
     *     of the ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withCopyright(@NonNull String copyright) {
      this.copyright = Optional.of(copyright);
      return this;
    }
    /**
     * @param hasMember - This ObservationDefinition defines a group observation (e.g. a battery, a
     *     panel of tests, a set of vital sign measurements) that includes the target as a member of
     *     the group.
     */
    public ObservationDefinitionBuilder.Impl withHasMember(@NonNull Reference... hasMember) {
      this.hasMember = Arrays.asList(hasMember);
      return this;
    }
    /**
     * @param hasMember - This ObservationDefinition defines a group observation (e.g. a battery, a
     *     panel of tests, a set of vital sign measurements) that includes the target as a member of
     *     the group.
     */
    public ObservationDefinitionBuilder.Impl withHasMember(
        @NonNull Collection<Reference> hasMember) {
      this.hasMember = Collections.unmodifiableCollection(hasMember);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withHasMember(@NonNull ReferenceBuilder... hasMember) {
      this.hasMember = Arrays.stream(hasMember).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this ObservationDefinition. by the
     *     performer and/or other systems. These identifiers remain constant as the resource is
     *     updated and propagates from server to server.
     */
    public ObservationDefinitionBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withIdentifier(@NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate ObservationDefinition instances.
     */
    public ObservationDefinitionBuilder.Impl withUseContext(@NonNull UsageContext... useContext) {
      this.useContext = Arrays.asList(useContext);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate ObservationDefinition instances.
     */
    public ObservationDefinitionBuilder.Impl withUseContext(
        @NonNull Collection<UsageContext> useContext) {
      this.useContext = Collections.unmodifiableCollection(useContext);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withUseContext(
        @NonNull UsageContextBuilder... useContext) {
      this.useContext = Arrays.stream(useContext).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - A free text natural language description of the ObservationDefinition
     *     from the consumer's perspective.
     */
    public ObservationDefinitionBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param experimental - A flag to indicate that this ObservationDefinition is authored for
     *     testing purposes (or education/evaluation/marketing), and is not intended to be used for
     *     genuine usage.
     */
    public ObservationDefinitionBuilder.Impl withExperimental(@NonNull Boolean experimental) {
      this.experimental = Optional.of(experimental);
      return this;
    }
    /**
     * @param jurisdiction - A jurisdiction in which the ObservationDefinition is intended to be
     *     used.
     */
    public ObservationDefinitionBuilder.Impl withJurisdiction(
        @NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /**
     * @param jurisdiction - A jurisdiction in which the ObservationDefinition is intended to be
     *     used.
     */
    public ObservationDefinitionBuilder.Impl withJurisdiction(
        @NonNull Collection<CodeableConcept> jurisdiction) {
      this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withJurisdiction(
        @NonNull CodeableConceptBuilder... jurisdiction) {
      this.jurisdiction = Arrays.stream(jurisdiction).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param approvalDate - The date on which the asset content was approved by the publisher.
     *     Approval happens once when the content is officially approved for usage.
     */
    public ObservationDefinitionBuilder.Impl withApprovalDate(@NonNull FHIRDate approvalDate) {
      this.approvalDate = Optional.of(approvalDate);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public ObservationDefinitionBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param performerType - The type of individual/organization/device that is expected to act
     *     upon instances of this definition.
     */
    public ObservationDefinitionBuilder.Impl withPerformerType(
        @NonNull CodeableConcept performerType) {
      this.performerType = Optional.of(performerType);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withPerformerType(
        @NonNull CodeableConceptBuilder performerType) {
      this.performerType = Optional.of(performerType.build());
      return this;
    }
    /**
     * @param lastReviewDate - The date on which the asset content was last reviewed. Review happens
     *     periodically after that, but doesn't change the original approval date.
     */
    public ObservationDefinitionBuilder.Impl withLastReviewDate(@NonNull FHIRDate lastReviewDate) {
      this.lastReviewDate = Optional.of(lastReviewDate);
      return this;
    }
    /**
     * @param derivedFromUri - The URL pointing to an externally-defined observation definition,
     *     guideline or other definition that is adhered to in whole or in part by this definition.
     */
    public ObservationDefinitionBuilder.Impl withDerivedFromUri(@NonNull String... derivedFromUri) {
      this.derivedFromUri = Arrays.asList(derivedFromUri);
      return this;
    }
    /**
     * @param derivedFromUri - The URL pointing to an externally-defined observation definition,
     *     guideline or other definition that is adhered to in whole or in part by this definition.
     */
    public ObservationDefinitionBuilder.Impl withDerivedFromUri(
        @NonNull Collection<String> derivedFromUri) {
      this.derivedFromUri = Collections.unmodifiableCollection(derivedFromUri);
      return this;
    }
    /**
     * @param effectivePeriod - The period during which the ObservationDefinition content was or is
     *     planned to be effective.
     */
    public ObservationDefinitionBuilder.Impl withEffectivePeriod(@NonNull Period effectivePeriod) {
      this.effectivePeriod = Optional.of(effectivePeriod);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withEffectivePeriod(
        @NonNull PeriodBuilder effectivePeriod) {
      this.effectivePeriod = Optional.of(effectivePeriod.build());
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
    public ObservationDefinitionBuilder.Impl withModifierExtension(
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
    public ObservationDefinitionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param permittedDataType - The data types allowed for the value element of the instance
     *     observations conforming to this ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withPermittedDataType(
        @NonNull PERMITTED_DATA_TYPE... permittedDataType) {
      this.permittedDataType = Arrays.asList(permittedDataType);
      return this;
    }
    /**
     * @param permittedDataType - The data types allowed for the value element of the instance
     *     observations conforming to this ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withPermittedDataType(
        @NonNull Collection<PERMITTED_DATA_TYPE> permittedDataType) {
      this.permittedDataType = Collections.unmodifiableCollection(permittedDataType);
      return this;
    }
    /**
     * @param preferredReportName - The preferred name to be used when reporting the results of
     *     observations conforming to this ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withPreferredReportName(
        @NonNull String preferredReportName) {
      this.preferredReportName = Optional.of(preferredReportName);
      return this;
    }
    /**
     * @param derivedFromCanonical - The canonical URL pointing to another FHIR-defined
     *     ObservationDefinition that is adhered to in whole or in part by this definition.
     */
    public ObservationDefinitionBuilder.Impl withDerivedFromCanonical(
        @NonNull String... derivedFromCanonical) {
      this.derivedFromCanonical = Arrays.asList(derivedFromCanonical);
      return this;
    }
    /**
     * @param derivedFromCanonical - The canonical URL pointing to another FHIR-defined
     *     ObservationDefinition that is adhered to in whole or in part by this definition.
     */
    public ObservationDefinitionBuilder.Impl withDerivedFromCanonical(
        @NonNull Collection<String> derivedFromCanonical) {
      this.derivedFromCanonical = Collections.unmodifiableCollection(derivedFromCanonical);
      return this;
    }
    /**
     * @param multipleResultsAllowed - Multiple results allowed for observations conforming to this
     *     ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withMultipleResultsAllowed(
        @NonNull Boolean multipleResultsAllowed) {
      this.multipleResultsAllowed = Optional.of(multipleResultsAllowed);
      return this;
    }
    /**
     * @param component - Some observations have multiple component observations, expressed as
     *     separate code value pairs.
     */
    public ObservationDefinitionBuilder.Impl withComponent(
        @NonNull ObservationDefinition.Component... component) {
      this.component = Arrays.asList(component);
      return this;
    }
    /**
     * @param component - Some observations have multiple component observations, expressed as
     *     separate code value pairs.
     */
    public ObservationDefinitionBuilder.Impl withComponent(
        @NonNull Collection<ObservationDefinition.Component> component) {
      this.component = Collections.unmodifiableCollection(component);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withComponent(
        @NonNull ObservationDefinition_ComponentBuilder... component) {
      this.component = Arrays.stream(component).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param qualifiedValue - A set of qualified values associated with a context and a set of
     *     conditions - provides a range for quantitative and ordinal observations and a collection
     *     of value sets for qualitative observations.
     */
    public ObservationDefinitionBuilder.Impl withQualifiedValue(
        @NonNull ObservationDefinition.QualifiedValue... qualifiedValue) {
      this.qualifiedValue = Arrays.asList(qualifiedValue);
      return this;
    }
    /**
     * @param qualifiedValue - A set of qualified values associated with a context and a set of
     *     conditions - provides a range for quantitative and ordinal observations and a collection
     *     of value sets for qualitative observations.
     */
    public ObservationDefinitionBuilder.Impl withQualifiedValue(
        @NonNull Collection<ObservationDefinition.QualifiedValue> qualifiedValue) {
      this.qualifiedValue = Collections.unmodifiableCollection(qualifiedValue);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withQualifiedValue(
        @NonNull ObservationDefinition_QualifiedValueBuilder... qualifiedValue) {
      this.qualifiedValue = Arrays.stream(qualifiedValue).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param quantitativeDetails - Characteristics for quantitative results of observations
     *     conforming to this ObservationDefinition.
     */
    public ObservationDefinitionBuilder.Impl withQuantitativeDetails(
        @NonNull ObservationDefinition.QuantitativeDetails quantitativeDetails) {
      this.quantitativeDetails = Optional.of(quantitativeDetails);
      return this;
    }

    public ObservationDefinitionBuilder.Impl withQuantitativeDetails(
        @NonNull ObservationDefinition_QuantitativeDetailsBuilder quantitativeDetails) {
      this.quantitativeDetails = Optional.of(quantitativeDetails.build());
      return this;
    }

    public ObservationDefinitionBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public ObservationDefinition build() {
      return new ObservationDefinition(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(name),
          OptionConverters.toScala(date),
          code,
          OptionConverters.toScala(title),
          status,
          OptionConverters.toScala(method),
          device.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(version),
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(purpose),
          OptionConverters.toScala(subject),
          OptionConverters.toScala(language),
          category.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(bodySite),
          specimen.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(publisher),
          OptionConverters.toScala(copyright),
          hasMember.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(identifier),
          useContext.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(experimental.map(x -> (Object) x)),
          jurisdiction.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(approvalDate),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(performerType),
          OptionConverters.toScala(lastReviewDate),
          derivedFromUri.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(effectivePeriod),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          permittedDataType.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(preferredReportName),
          derivedFromCanonical.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(multipleResultsAllowed.map(x -> (Object) x)),
          component.stream().collect(new LitSeqJCollector<>()),
          qualifiedValue.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(quantitativeDetails),
          LitUtils.emptyMetaElMap());
    }
  }
}
