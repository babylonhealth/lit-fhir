package com.babylonhealth.lit.uscore_java.builders;

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
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.uscore.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.uscore_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.uscore_java.model.Unions.*;
import com.babylonhealth.lit.hl7.DOCUMENT_REFERENCE_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.COMPOSITION_STATUS;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Us_core_documentreferenceBuilder extends DocumentReferenceBuilder {
  public Us_core_documentreference build();

  public static Impl init(
      CodeableConcept _type,
      DOCUMENT_REFERENCE_STATUS status,
      Reference subject,
      Collection<CodeableConcept> category,
      DocumentReference.Content content) {
    return new Impl(_type, status, subject, category, content);
  }

  public static Impl builder(
      CodeableConceptBuilder _type,
      DOCUMENT_REFERENCE_STATUS status,
      ReferenceBuilder subject,
      Collection<CodeableConceptBuilder> category,
      DocumentReference_ContentBuilder content) {
    return new Impl(
        _type.build(),
        status,
        subject.build(),
        new LitSeq<>(category).map(CodeableConceptBuilder::build),
        content.build());
  }

  public class Impl implements Us_core_documentreferenceBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile(
                    "http://hl7.org/fhir/us/core/StructureDefinition/us-core-documentreference")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private CodeableConcept _type;
    private Optional<ZonedDateTime> date = Optional.empty();
    private DOCUMENT_REFERENCE_STATUS status;
    private Collection<Reference> author = Collections.emptyList();
    private Reference subject;
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category;
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<COMPOSITION_STATUS> docStatus = Optional.empty();
    private Optional<Reference> custodian = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<Reference> authenticator = Optional.empty();
    private Collection<CodeableConcept> securityLabel = Collections.emptyList();
    private Optional<Identifier> masterIdentifier = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<DocumentReference.Context> context = Optional.empty();
    private Collection<DocumentReference.RelatesTo> relatesTo = Collections.emptyList();
    private DocumentReference.Content content;

    /**
     * Required fields for {@link Us_core_documentreference}
     *
     * @param _type - Specifies the particular kind of document referenced (e.g. History and
     *     Physical, Discharge Summary, Progress Note). This usually equates to the purpose of
     *     making the document referenced.
     * @param status - The status of this document reference.
     * @param subject - Who or what the document is about. The document can be about a person,
     *     (patient or healthcare practitioner), a device (e.g. a machine) or even a group of
     *     subjects (such as a document about a herd of farm animals, or a set of patients that
     *     share a common exposure).
     * @param category - A categorization for the type of document referenced - helps for indexing
     *     and searching. This may be implied by or derived from the code specified in the
     *     DocumentReference.type.
     * @param content - The document and format referenced. There may be multiple content element
     *     repetitions, each with a different format.
     */
    public Impl(
        CodeableConcept _type,
        DOCUMENT_REFERENCE_STATUS status,
        Reference subject,
        Collection<CodeableConcept> category,
        DocumentReference.Content content) {
      this._type = _type;
      this.status = status;
      this.subject = subject;
      this.category = category;
      this.content = content;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Us_core_documentreferenceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public Us_core_documentreferenceBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public Us_core_documentreferenceBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public Us_core_documentreferenceBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public Us_core_documentreferenceBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param date - When the document reference was created. */
    public Us_core_documentreferenceBuilder.Impl withDate(@NonNull ZonedDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /** @param author - Identifies who is responsible for adding the information to the document. */
    public Us_core_documentreferenceBuilder.Impl withAuthor(@NonNull Reference... author) {
      this.author = Arrays.asList(author);
      return this;
    }
    /** @param author - Identifies who is responsible for adding the information to the document. */
    public Us_core_documentreferenceBuilder.Impl withAuthor(@NonNull Collection<Reference> author) {
      this.author = Collections.unmodifiableCollection(author);
      return this;
    }

    public Us_core_documentreferenceBuilder.Impl withAuthor(@NonNull ReferenceBuilder... author) {
      this.author = Arrays.stream(author).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public Us_core_documentreferenceBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_documentreferenceBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_documentreferenceBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public Us_core_documentreferenceBuilder.Impl withContained(
        @NonNull ResourceBuilder... contained) {
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
    public Us_core_documentreferenceBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Us_core_documentreferenceBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Us_core_documentreferenceBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param docStatus - The status of the underlying document. */
    public Us_core_documentreferenceBuilder.Impl withDocStatus(
        @NonNull COMPOSITION_STATUS docStatus) {
      this.docStatus = Optional.of(docStatus);
      return this;
    }
    /**
     * @param custodian - Identifies the organization or group who is responsible for ongoing
     *     maintenance of and access to the document.
     */
    public Us_core_documentreferenceBuilder.Impl withCustodian(@NonNull Reference custodian) {
      this.custodian = Optional.of(custodian);
      return this;
    }

    public Us_core_documentreferenceBuilder.Impl withCustodian(
        @NonNull ReferenceBuilder custodian) {
      this.custodian = Optional.of(custodian.build());
      return this;
    }
    /**
     * @param identifier - Other identifiers associated with the document, including version
     *     independent identifiers.
     */
    public Us_core_documentreferenceBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Other identifiers associated with the document, including version
     *     independent identifiers.
     */
    public Us_core_documentreferenceBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public Us_core_documentreferenceBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description - Human-readable description of the source document. */
    public Us_core_documentreferenceBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public Us_core_documentreferenceBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param authenticator - Which person or organization authenticates that this document is
     *     valid.
     */
    public Us_core_documentreferenceBuilder.Impl withAuthenticator(
        @NonNull Reference authenticator) {
      this.authenticator = Optional.of(authenticator);
      return this;
    }

    public Us_core_documentreferenceBuilder.Impl withAuthenticator(
        @NonNull ReferenceBuilder authenticator) {
      this.authenticator = Optional.of(authenticator.build());
      return this;
    }
    /**
     * @param securityLabel - A set of Security-Tag codes specifying the level of privacy/security
     *     of the Document. Note that DocumentReference.meta.security contains the security labels
     *     of the "reference" to the document, while DocumentReference.securityLabel contains a
     *     snapshot of the security labels on the document the reference refers to.
     */
    public Us_core_documentreferenceBuilder.Impl withSecurityLabel(
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
    public Us_core_documentreferenceBuilder.Impl withSecurityLabel(
        @NonNull Collection<CodeableConcept> securityLabel) {
      this.securityLabel = Collections.unmodifiableCollection(securityLabel);
      return this;
    }

    public Us_core_documentreferenceBuilder.Impl withSecurityLabel(
        @NonNull CodeableConceptBuilder... securityLabel) {
      this.securityLabel = Arrays.stream(securityLabel).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param masterIdentifier - Document identifier as assigned by the source of the document. This
     *     identifier is specific to this version of the document. This unique identifier may be
     *     used elsewhere to identify this version of the document.
     */
    public Us_core_documentreferenceBuilder.Impl withMasterIdentifier(
        @NonNull Identifier masterIdentifier) {
      this.masterIdentifier = Optional.of(masterIdentifier);
      return this;
    }

    public Us_core_documentreferenceBuilder.Impl withMasterIdentifier(
        @NonNull IdentifierBuilder masterIdentifier) {
      this.masterIdentifier = Optional.of(masterIdentifier.build());
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
    public Us_core_documentreferenceBuilder.Impl withModifierExtension(
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
    public Us_core_documentreferenceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Us_core_documentreferenceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param context - The clinical context in which the document was prepared. */
    public Us_core_documentreferenceBuilder.Impl withContext(
        @NonNull DocumentReference.Context context) {
      this.context = Optional.of(context);
      return this;
    }

    public Us_core_documentreferenceBuilder.Impl withContext(
        @NonNull DocumentReference_ContextBuilder context) {
      this.context = Optional.of(context.build());
      return this;
    }
    /**
     * @param relatesTo - Relationships that this document has with other document references that
     *     already exist.
     */
    public Us_core_documentreferenceBuilder.Impl withRelatesTo(
        @NonNull DocumentReference.RelatesTo... relatesTo) {
      this.relatesTo = Arrays.asList(relatesTo);
      return this;
    }
    /**
     * @param relatesTo - Relationships that this document has with other document references that
     *     already exist.
     */
    public Us_core_documentreferenceBuilder.Impl withRelatesTo(
        @NonNull Collection<DocumentReference.RelatesTo> relatesTo) {
      this.relatesTo = Collections.unmodifiableCollection(relatesTo);
      return this;
    }

    public Us_core_documentreferenceBuilder.Impl withRelatesTo(
        @NonNull DocumentReference_RelatesToBuilder... relatesTo) {
      this.relatesTo = Arrays.stream(relatesTo).map(e -> e.build()).collect(toList());
      return this;
    }

    public Us_core_documentreferenceBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Us_core_documentreference build() {
      return new Us_core_documentreference(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          _type,
          OptionConverters.toScala(date),
          status,
          author.stream().collect(new LitSeqJCollector<>()),
          subject,
          OptionConverters.toScala(language),
          category.stream().collect(new NonEmptyLitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(docStatus),
          OptionConverters.toScala(custodian),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(authenticator),
          securityLabel.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(masterIdentifier),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(context),
          relatesTo.stream().collect(new LitSeqJCollector<>()),
          content,
          LitUtils.emptyMetaElMap());
    }
  }
}
