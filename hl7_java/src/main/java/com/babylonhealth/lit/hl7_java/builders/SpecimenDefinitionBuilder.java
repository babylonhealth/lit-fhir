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

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface SpecimenDefinitionBuilder extends DomainResourceBuilder {
  public SpecimenDefinition build();

  public static Impl init(PUBLICATION_STATUS status) {
    return new Impl(status);
  }

  public static Impl builder(PUBLICATION_STATUS status) {
    return new Impl(status);
  }

  public static ChoiceCodeableConceptOrReference subject(CodeableConcept c) {
    return new ChoiceCodeableConceptOrReference(c);
  }

  public static ChoiceCodeableConceptOrReference subject(Reference r) {
    return new ChoiceCodeableConceptOrReference(r);
  }

  public class Impl implements SpecimenDefinitionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<FHIRDateTime> date = Optional.empty();
    private Optional<String> title = Optional.empty();
    private PUBLICATION_STATUS status;
    private Optional<String> version = Optional.empty();
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Optional<String> purpose = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> publisher = Optional.empty();
    private Optional<String> copyright = Optional.empty();
    private Optional<Identifier> identifier = Optional.empty();
    private Optional<ChoiceCodeableConceptOrReference> subject = Optional.empty();
    private Collection<UsageContext> useContext = Collections.emptyList();
    private Optional<String> timeAspect = Optional.empty();
    private Collection<CodeableConcept> collection = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<Boolean> experimental = Optional.empty();
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Optional<FHIRDate> approvalDate = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> typeCollected = Optional.empty();
    private Collection<String> derivedFromUri = Collections.emptyList();
    private Optional<FHIRDate> lastReviewDate = Optional.empty();
    private Optional<Period> effectivePeriod = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<CodeableConcept> patientPreparation = Collections.emptyList();
    private Collection<String> derivedFromCanonical = Collections.emptyList();
    private Collection<SpecimenDefinition.TypeTested> typeTested = Collections.emptyList();

    /**
     * Required fields for {@link SpecimenDefinition}
     *
     * @param status - The current state of theSpecimenDefinition.
     */
    public Impl(PUBLICATION_STATUS status) {
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SpecimenDefinitionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - An absolute URL that is used to identify this SpecimenDefinition when it is
     *     referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD
     *     be globally unique, and SHOULD be an address at which this SpecimenDefinition is (or will
     *     be) published. The URL SHOULD include the major version of the SpecimenDefinition. For
     *     more information see Technical and Business Versions.
     */
    public SpecimenDefinitionBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public SpecimenDefinitionBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public SpecimenDefinitionBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param date - For draft definitions, indicates the date of initial creation. For active
     *     definitions, represents the date of activation. For withdrawn definitions, indicates the
     *     date of withdrawal.
     */
    public SpecimenDefinitionBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /** @param title - A short, descriptive, user-friendly title for the SpecimenDefinition. */
    public SpecimenDefinitionBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the
     *     SpecimenDefinition when it is referenced in a specification, model, design or instance.
     *     This is an arbitrary value managed by the SpecimenDefinition author and is not expected
     *     to be globally unique.
     */
    public SpecimenDefinitionBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public SpecimenDefinitionBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public SpecimenDefinitionBuilder.Impl withContact(@NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withContact(@NonNull ContactDetailBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param purpose - Explains why this SpecimeDefinition is needed and why it has been designed
     *     as it has.
     */
    public SpecimenDefinitionBuilder.Impl withPurpose(@NonNull String purpose) {
      this.purpose = Optional.of(purpose);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public SpecimenDefinitionBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public SpecimenDefinitionBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public SpecimenDefinitionBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public SpecimenDefinitionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SpecimenDefinitionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param publisher - Helps establish the "authority/credibility" of the SpecimenDefinition. May
     *     also allow for contact.
     */
    public SpecimenDefinitionBuilder.Impl withPublisher(@NonNull Reference publisher) {
      this.publisher = Optional.of(publisher);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withPublisher(@NonNull ReferenceBuilder publisher) {
      this.publisher = Optional.of(publisher.build());
      return this;
    }
    /**
     * @param copyright - Copyright statement relating to the SpecimenDefinition and/or its
     *     contents. Copyright statements are generally legal restrictions on the use and publishing
     *     of the SpecimenDefinition.
     */
    public SpecimenDefinitionBuilder.Impl withCopyright(@NonNull String copyright) {
      this.copyright = Optional.of(copyright);
      return this;
    }
    /** @param identifier - A business identifier assigned to this SpecimenDefinition. */
    public SpecimenDefinitionBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withIdentifier(@NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }
    /**
     * @param subject - A code or group definition that describes the intended subject from which
     *     this kind of specimen is to be collected. Field is a 'choice' field. Type should be one
     *     of CodeableConcept, Reference. To pass the value in, wrap with one of the
     *     SpecimenDefinitionBuilder.subject static methods
     */
    public SpecimenDefinitionBuilder.Impl withSubject(
        @NonNull ChoiceCodeableConceptOrReference subject) {
      this.subject = Optional.of(subject);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These terms may be used to assist with indexing and searching
     *     of specimen definitions.
     */
    public SpecimenDefinitionBuilder.Impl withUseContext(@NonNull UsageContext... useContext) {
      this.useContext = Arrays.asList(useContext);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These terms may be used to assist with indexing and searching
     *     of specimen definitions.
     */
    public SpecimenDefinitionBuilder.Impl withUseContext(
        @NonNull Collection<UsageContext> useContext) {
      this.useContext = Collections.unmodifiableCollection(useContext);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withUseContext(
        @NonNull UsageContextBuilder... useContext) {
      this.useContext = Arrays.stream(useContext).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param timeAspect - Time aspect of specimen collection (duration or offset). */
    public SpecimenDefinitionBuilder.Impl withTimeAspect(@NonNull String timeAspect) {
      this.timeAspect = Optional.of(timeAspect);
      return this;
    }
    /** @param collection - The action to be performed for collecting the specimen. */
    public SpecimenDefinitionBuilder.Impl withCollection(@NonNull CodeableConcept... collection) {
      this.collection = Arrays.asList(collection);
      return this;
    }
    /** @param collection - The action to be performed for collecting the specimen. */
    public SpecimenDefinitionBuilder.Impl withCollection(
        @NonNull Collection<CodeableConcept> collection) {
      this.collection = Collections.unmodifiableCollection(collection);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withCollection(
        @NonNull CodeableConceptBuilder... collection) {
      this.collection = Arrays.stream(collection).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - A free text natural language description of the SpecimenDefinition from
     *     the consumer's perspective.
     */
    public SpecimenDefinitionBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param experimental - A flag to indicate that this SpecimenDefinition is not authored for
     *     genuine usage.
     */
    public SpecimenDefinitionBuilder.Impl withExperimental(@NonNull Boolean experimental) {
      this.experimental = Optional.of(experimental);
      return this;
    }
    /**
     * @param jurisdiction - A jurisdiction in which the SpecimenDefinition is intended to be used.
     */
    public SpecimenDefinitionBuilder.Impl withJurisdiction(
        @NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /**
     * @param jurisdiction - A jurisdiction in which the SpecimenDefinition is intended to be used.
     */
    public SpecimenDefinitionBuilder.Impl withJurisdiction(
        @NonNull Collection<CodeableConcept> jurisdiction) {
      this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withJurisdiction(
        @NonNull CodeableConceptBuilder... jurisdiction) {
      this.jurisdiction = Arrays.stream(jurisdiction).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param approvalDate - The date on which the asset content was approved by the publisher.
     *     Approval happens once when the content is officially approved for usage.
     */
    public SpecimenDefinitionBuilder.Impl withApprovalDate(@NonNull FHIRDate approvalDate) {
      this.approvalDate = Optional.of(approvalDate);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public SpecimenDefinitionBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param typeCollected - The kind of material to be collected. */
    public SpecimenDefinitionBuilder.Impl withTypeCollected(
        @NonNull CodeableConcept typeCollected) {
      this.typeCollected = Optional.of(typeCollected);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withTypeCollected(
        @NonNull CodeableConceptBuilder typeCollected) {
      this.typeCollected = Optional.of(typeCollected.build());
      return this;
    }
    /**
     * @param derivedFromUri - The URL pointing to an externally-defined type of specimen, guideline
     *     or other definition that is adhered to in whole or in part by this definition.
     */
    public SpecimenDefinitionBuilder.Impl withDerivedFromUri(@NonNull String... derivedFromUri) {
      this.derivedFromUri = Arrays.asList(derivedFromUri);
      return this;
    }
    /**
     * @param derivedFromUri - The URL pointing to an externally-defined type of specimen, guideline
     *     or other definition that is adhered to in whole or in part by this definition.
     */
    public SpecimenDefinitionBuilder.Impl withDerivedFromUri(
        @NonNull Collection<String> derivedFromUri) {
      this.derivedFromUri = Collections.unmodifiableCollection(derivedFromUri);
      return this;
    }
    /**
     * @param lastReviewDate - The date on which the asset content was last reviewed. Review happens
     *     periodically after that, but doesn't change the original approval date.
     */
    public SpecimenDefinitionBuilder.Impl withLastReviewDate(@NonNull FHIRDate lastReviewDate) {
      this.lastReviewDate = Optional.of(lastReviewDate);
      return this;
    }
    /**
     * @param effectivePeriod - The period during which the SpecimenDefinition content was or is
     *     planned to be effective.
     */
    public SpecimenDefinitionBuilder.Impl withEffectivePeriod(@NonNull Period effectivePeriod) {
      this.effectivePeriod = Optional.of(effectivePeriod);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withEffectivePeriod(
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
    public SpecimenDefinitionBuilder.Impl withModifierExtension(
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
    public SpecimenDefinitionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param patientPreparation - Preparation of the patient for specimen collection. */
    public SpecimenDefinitionBuilder.Impl withPatientPreparation(
        @NonNull CodeableConcept... patientPreparation) {
      this.patientPreparation = Arrays.asList(patientPreparation);
      return this;
    }
    /** @param patientPreparation - Preparation of the patient for specimen collection. */
    public SpecimenDefinitionBuilder.Impl withPatientPreparation(
        @NonNull Collection<CodeableConcept> patientPreparation) {
      this.patientPreparation = Collections.unmodifiableCollection(patientPreparation);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withPatientPreparation(
        @NonNull CodeableConceptBuilder... patientPreparation) {
      this.patientPreparation =
          Arrays.stream(patientPreparation).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param derivedFromCanonical - The canonical URL pointing to another FHIR-defined
     *     SpecimenDefinition that is adhered to in whole or in part by this definition.
     */
    public SpecimenDefinitionBuilder.Impl withDerivedFromCanonical(
        @NonNull String... derivedFromCanonical) {
      this.derivedFromCanonical = Arrays.asList(derivedFromCanonical);
      return this;
    }
    /**
     * @param derivedFromCanonical - The canonical URL pointing to another FHIR-defined
     *     SpecimenDefinition that is adhered to in whole or in part by this definition.
     */
    public SpecimenDefinitionBuilder.Impl withDerivedFromCanonical(
        @NonNull Collection<String> derivedFromCanonical) {
      this.derivedFromCanonical = Collections.unmodifiableCollection(derivedFromCanonical);
      return this;
    }
    /**
     * @param typeTested - Specimen conditioned in a container as expected by the testing
     *     laboratory.
     */
    public SpecimenDefinitionBuilder.Impl withTypeTested(
        @NonNull SpecimenDefinition.TypeTested... typeTested) {
      this.typeTested = Arrays.asList(typeTested);
      return this;
    }
    /**
     * @param typeTested - Specimen conditioned in a container as expected by the testing
     *     laboratory.
     */
    public SpecimenDefinitionBuilder.Impl withTypeTested(
        @NonNull Collection<SpecimenDefinition.TypeTested> typeTested) {
      this.typeTested = Collections.unmodifiableCollection(typeTested);
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withTypeTested(
        @NonNull SpecimenDefinition_TypeTestedBuilder... typeTested) {
      this.typeTested = Arrays.stream(typeTested).map(e -> e.build()).collect(toList());
      return this;
    }

    public SpecimenDefinitionBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public SpecimenDefinition build() {
      return new SpecimenDefinition(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(date),
          OptionConverters.toScala(title),
          status,
          OptionConverters.toScala(version),
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(purpose),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(publisher),
          OptionConverters.toScala(copyright),
          OptionConverters.toScala(identifier),
          (Option) OptionConverters.toScala(subject),
          useContext.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(timeAspect),
          collection.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(experimental.map(x -> (Object) x)),
          jurisdiction.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(approvalDate),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(typeCollected),
          derivedFromUri.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(lastReviewDate),
          OptionConverters.toScala(effectivePeriod),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          patientPreparation.stream().collect(new LitSeqJCollector<>()),
          derivedFromCanonical.stream().collect(new LitSeqJCollector<>()),
          typeTested.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
