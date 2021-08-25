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
import com.babylonhealth.lit.hl7.DOCUMENT_REFERENCE_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.COMPOSITION_STATUS;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface DocumentReferenceBuilder extends DomainResourceBuilder {
  public DocumentReference build();

  public static Impl init(
      DOCUMENT_REFERENCE_STATUS status, Collection<DocumentReference.Content> content) {
    return new Impl(status, content);
  }

  public static Impl builder(
      DOCUMENT_REFERENCE_STATUS status, Collection<DocumentReference_ContentBuilder> content) {
    return new Impl(status, new LitSeq<>(content).map(DocumentReference_ContentBuilder::build));
  }

  public class Impl implements DocumentReferenceBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<ZonedDateTime> date = Optional.empty();
    private Collection<CodeableConcept> event = Collections.emptyList();
    private DOCUMENT_REFERENCE_STATUS status;
    private Optional<Period> period = Optional.empty();
    private Collection<Reference> author = Collections.emptyList();
    private Collection<Reference> basedOn = Collections.emptyList();
    private Optional<Reference> subject = Optional.empty();
    private Collection<Reference> related = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<COMPOSITION_STATUS> docStatus = Optional.empty();
    private Collection<Reference> encounter = Collections.emptyList();
    private Optional<Reference> custodian = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<CodeableConcept> facilityType = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<CodeableConcept> securityLabel = Collections.emptyList();
    private Optional<CodeableConcept> practiceSetting = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Reference> sourcePatientInfo = Optional.empty();
    private Collection<DocumentReference.Content> content;
    private Collection<DocumentReference.Attester> attester = Collections.emptyList();
    private Collection<DocumentReference.RelatesTo> relatesTo = Collections.emptyList();

    /**
     * Required fields for {@link DocumentReference}
     *
     * @param status - The status of this document reference.
     * @param content - The document and format referenced. If there are multiple content element
     *     repetitions, these must all represent the same document in different format, or
     *     attachment metadata.
     */
    public Impl(DOCUMENT_REFERENCE_STATUS status, Collection<DocumentReference.Content> content) {
      this.status = status;
      this.content = content;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public DocumentReferenceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public DocumentReferenceBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public DocumentReferenceBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public DocumentReferenceBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public DocumentReferenceBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param _type - Specifies the particular kind of document referenced (e.g. History and
     *     Physical, Discharge Summary, Progress Note). This usually equates to the purpose of
     *     making the document referenced.
     */
    public DocumentReferenceBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public DocumentReferenceBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param date - When the document reference was created. */
    public DocumentReferenceBuilder.Impl withDate(@NonNull ZonedDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /**
     * @param event - This list of codes represents the main clinical acts, such as a colonoscopy or
     *     an appendectomy, being documented. In some cases, the event is inherent in the type Code,
     *     such as a "History and Physical Report" in which the procedure being documented is
     *     necessarily a "History and Physical" act.
     */
    public DocumentReferenceBuilder.Impl withEvent(@NonNull CodeableConcept... event) {
      this.event = Arrays.asList(event);
      return this;
    }
    /**
     * @param event - This list of codes represents the main clinical acts, such as a colonoscopy or
     *     an appendectomy, being documented. In some cases, the event is inherent in the type Code,
     *     such as a "History and Physical Report" in which the procedure being documented is
     *     necessarily a "History and Physical" act.
     */
    public DocumentReferenceBuilder.Impl withEvent(@NonNull Collection<CodeableConcept> event) {
      this.event = Collections.unmodifiableCollection(event);
      return this;
    }

    public DocumentReferenceBuilder.Impl withEvent(@NonNull CodeableConceptBuilder... event) {
      this.event = Arrays.stream(event).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param period - The time period over which the service that is described by the document was
     *     provided.
     */
    public DocumentReferenceBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public DocumentReferenceBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /** @param author - Identifies who is responsible for adding the information to the document. */
    public DocumentReferenceBuilder.Impl withAuthor(@NonNull Reference... author) {
      this.author = Arrays.asList(author);
      return this;
    }
    /** @param author - Identifies who is responsible for adding the information to the document. */
    public DocumentReferenceBuilder.Impl withAuthor(@NonNull Collection<Reference> author) {
      this.author = Collections.unmodifiableCollection(author);
      return this;
    }

    public DocumentReferenceBuilder.Impl withAuthor(@NonNull ReferenceBuilder... author) {
      this.author = Arrays.stream(author).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param basedOn - A procedure that is fulfilled in whole or in part by the creation of this
     *     media.
     */
    public DocumentReferenceBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /**
     * @param basedOn - A procedure that is fulfilled in whole or in part by the creation of this
     *     media.
     */
    public DocumentReferenceBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public DocumentReferenceBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param subject - Who or what the document is about. The document can be about a person,
     *     (patient or healthcare practitioner), a device (e.g. a machine) or even a group of
     *     subjects (such as a document about a herd of farm animals, or a set of patients that
     *     share a common exposure).
     */
    public DocumentReferenceBuilder.Impl withSubject(@NonNull Reference subject) {
      this.subject = Optional.of(subject);
      return this;
    }

    public DocumentReferenceBuilder.Impl withSubject(@NonNull ReferenceBuilder subject) {
      this.subject = Optional.of(subject.build());
      return this;
    }
    /** @param related - Related identifiers or resources associated with the DocumentReference. */
    public DocumentReferenceBuilder.Impl withRelated(@NonNull Reference... related) {
      this.related = Arrays.asList(related);
      return this;
    }
    /** @param related - Related identifiers or resources associated with the DocumentReference. */
    public DocumentReferenceBuilder.Impl withRelated(@NonNull Collection<Reference> related) {
      this.related = Collections.unmodifiableCollection(related);
      return this;
    }

    public DocumentReferenceBuilder.Impl withRelated(@NonNull ReferenceBuilder... related) {
      this.related = Arrays.stream(related).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public DocumentReferenceBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param category - A categorization for the type of document referenced - helps for indexing
     *     and searching. This may be implied by or derived from the code specified in the
     *     DocumentReference.type.
     */
    public DocumentReferenceBuilder.Impl withCategory(@NonNull CodeableConcept... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /**
     * @param category - A categorization for the type of document referenced - helps for indexing
     *     and searching. This may be implied by or derived from the code specified in the
     *     DocumentReference.type.
     */
    public DocumentReferenceBuilder.Impl withCategory(
        @NonNull Collection<CodeableConcept> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }

    public DocumentReferenceBuilder.Impl withCategory(@NonNull CodeableConceptBuilder... category) {
      this.category = Arrays.stream(category).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public DocumentReferenceBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public DocumentReferenceBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public DocumentReferenceBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public DocumentReferenceBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public DocumentReferenceBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public DocumentReferenceBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param docStatus - The status of the underlying document. */
    public DocumentReferenceBuilder.Impl withDocStatus(@NonNull COMPOSITION_STATUS docStatus) {
      this.docStatus = Optional.of(docStatus);
      return this;
    }
    /**
     * @param encounter - Describes the clinical encounter or type of care that the document content
     *     is associated with.
     */
    public DocumentReferenceBuilder.Impl withEncounter(@NonNull Reference... encounter) {
      this.encounter = Arrays.asList(encounter);
      return this;
    }
    /**
     * @param encounter - Describes the clinical encounter or type of care that the document content
     *     is associated with.
     */
    public DocumentReferenceBuilder.Impl withEncounter(@NonNull Collection<Reference> encounter) {
      this.encounter = Collections.unmodifiableCollection(encounter);
      return this;
    }

    public DocumentReferenceBuilder.Impl withEncounter(@NonNull ReferenceBuilder... encounter) {
      this.encounter = Arrays.stream(encounter).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param custodian - Identifies the organization or group who is responsible for ongoing
     *     maintenance of and access to the document.
     */
    public DocumentReferenceBuilder.Impl withCustodian(@NonNull Reference custodian) {
      this.custodian = Optional.of(custodian);
      return this;
    }

    public DocumentReferenceBuilder.Impl withCustodian(@NonNull ReferenceBuilder custodian) {
      this.custodian = Optional.of(custodian.build());
      return this;
    }
    /**
     * @param identifier - Other identifiers associated with the document, including version
     *     independent identifiers.
     */
    public DocumentReferenceBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Other identifiers associated with the document, including version
     *     independent identifiers.
     */
    public DocumentReferenceBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public DocumentReferenceBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description - Human-readable description of the source document. */
    public DocumentReferenceBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param facilityType - The kind of facility where the patient was seen. */
    public DocumentReferenceBuilder.Impl withFacilityType(@NonNull CodeableConcept facilityType) {
      this.facilityType = Optional.of(facilityType);
      return this;
    }

    public DocumentReferenceBuilder.Impl withFacilityType(
        @NonNull CodeableConceptBuilder facilityType) {
      this.facilityType = Optional.of(facilityType.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public DocumentReferenceBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param securityLabel - A set of Security-Tag codes specifying the level of privacy/security
     *     of the Document. Note that DocumentReference.meta.security contains the security labels
     *     of the "reference" to the document, while DocumentReference.securityLabel contains a
     *     snapshot of the security labels on the document the reference refers to.
     */
    public DocumentReferenceBuilder.Impl withSecurityLabel(
        @NonNull CodeableConcept... securityLabel) {
      this.securityLabel = Arrays.asList(securityLabel);
      return this;
    }
    /**
     * @param securityLabel - A set of Security-Tag codes specifying the level of privacy/security
     *     of the Document. Note that DocumentReference.meta.security contains the security labels
     *     of the "reference" to the document, while DocumentReference.securityLabel contains a
     *     snapshot of the security labels on the document the reference refers to.
     */
    public DocumentReferenceBuilder.Impl withSecurityLabel(
        @NonNull Collection<CodeableConcept> securityLabel) {
      this.securityLabel = Collections.unmodifiableCollection(securityLabel);
      return this;
    }

    public DocumentReferenceBuilder.Impl withSecurityLabel(
        @NonNull CodeableConceptBuilder... securityLabel) {
      this.securityLabel = Arrays.stream(securityLabel).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param practiceSetting - This property may convey specifics about the practice setting where
     *     the content was created, often reflecting the clinical specialty.
     */
    public DocumentReferenceBuilder.Impl withPracticeSetting(
        @NonNull CodeableConcept practiceSetting) {
      this.practiceSetting = Optional.of(practiceSetting);
      return this;
    }

    public DocumentReferenceBuilder.Impl withPracticeSetting(
        @NonNull CodeableConceptBuilder practiceSetting) {
      this.practiceSetting = Optional.of(practiceSetting.build());
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
    public DocumentReferenceBuilder.Impl withModifierExtension(
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
    public DocumentReferenceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public DocumentReferenceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param sourcePatientInfo - The Patient Information as known when the document was published.
     *     May be a reference to a version specific, or contained.
     */
    public DocumentReferenceBuilder.Impl withSourcePatientInfo(
        @NonNull Reference sourcePatientInfo) {
      this.sourcePatientInfo = Optional.of(sourcePatientInfo);
      return this;
    }

    public DocumentReferenceBuilder.Impl withSourcePatientInfo(
        @NonNull ReferenceBuilder sourcePatientInfo) {
      this.sourcePatientInfo = Optional.of(sourcePatientInfo.build());
      return this;
    }
    /**
     * @param attester - A participant who has attested to the accuracy of the composition/document.
     */
    public DocumentReferenceBuilder.Impl withAttester(
        @NonNull DocumentReference.Attester... attester) {
      this.attester = Arrays.asList(attester);
      return this;
    }
    /**
     * @param attester - A participant who has attested to the accuracy of the composition/document.
     */
    public DocumentReferenceBuilder.Impl withAttester(
        @NonNull Collection<DocumentReference.Attester> attester) {
      this.attester = Collections.unmodifiableCollection(attester);
      return this;
    }

    public DocumentReferenceBuilder.Impl withAttester(
        @NonNull DocumentReference_AttesterBuilder... attester) {
      this.attester = Arrays.stream(attester).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param relatesTo - Relationships that this document has with other document references that
     *     already exist.
     */
    public DocumentReferenceBuilder.Impl withRelatesTo(
        @NonNull DocumentReference.RelatesTo... relatesTo) {
      this.relatesTo = Arrays.asList(relatesTo);
      return this;
    }
    /**
     * @param relatesTo - Relationships that this document has with other document references that
     *     already exist.
     */
    public DocumentReferenceBuilder.Impl withRelatesTo(
        @NonNull Collection<DocumentReference.RelatesTo> relatesTo) {
      this.relatesTo = Collections.unmodifiableCollection(relatesTo);
      return this;
    }

    public DocumentReferenceBuilder.Impl withRelatesTo(
        @NonNull DocumentReference_RelatesToBuilder... relatesTo) {
      this.relatesTo = Arrays.stream(relatesTo).map(e -> e.build()).collect(toList());
      return this;
    }

    public DocumentReferenceBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public DocumentReference build() {
      return new DocumentReference(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(date),
          event.stream().collect(new LitSeqJCollector<>()),
          status,
          OptionConverters.toScala(period),
          author.stream().collect(new LitSeqJCollector<>()),
          basedOn.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(subject),
          related.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          category.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(docStatus),
          encounter.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(custodian),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(facilityType),
          OptionConverters.toScala(implicitRules),
          securityLabel.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(practiceSetting),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(sourcePatientInfo),
          content.stream().collect(new NonEmptyLitSeqJCollector<>()),
          attester.stream().collect(new LitSeqJCollector<>()),
          relatesTo.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
