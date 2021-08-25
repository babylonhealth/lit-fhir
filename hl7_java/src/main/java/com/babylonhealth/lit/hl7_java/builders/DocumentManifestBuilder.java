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
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface DocumentManifestBuilder extends DomainResourceBuilder {
  public DocumentManifest build();

  public static Impl init(DOCUMENT_REFERENCE_STATUS status, Collection<Reference> content) {
    return new Impl(status, content);
  }

  public static Impl builder(
      DOCUMENT_REFERENCE_STATUS status, Collection<ReferenceBuilder> content) {
    return new Impl(status, new LitSeq<>(content).map(ReferenceBuilder::build));
  }

  public class Impl implements DocumentManifestBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private DOCUMENT_REFERENCE_STATUS status;
    private Collection<Reference> author = Collections.emptyList();
    private Optional<String> source = Optional.empty();
    private Optional<Reference> subject = Optional.empty();
    private Optional<FHIRDateTime> created = Optional.empty();
    private Collection<Reference> content;
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Reference> recipient = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<Identifier> masterIdentifier = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<DocumentManifest.Related> related = Collections.emptyList();

    /**
     * Required fields for {@link DocumentManifest}
     *
     * @param status - The status of this document manifest.
     * @param content - The list of Resources that consist of the parts of this manifest.
     */
    public Impl(DOCUMENT_REFERENCE_STATUS status, Collection<Reference> content) {
      this.status = status;
      this.content = content;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public DocumentManifestBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public DocumentManifestBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public DocumentManifestBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public DocumentManifestBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public DocumentManifestBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param _type - The code specifying the type of clinical activity that resulted in placing the
     *     associated content into the DocumentManifest.
     */
    public DocumentManifestBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public DocumentManifestBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /**
     * @param author - Identifies who is the author of the manifest. Manifest author is not
     *     necessarly the author of the references included.
     */
    public DocumentManifestBuilder.Impl withAuthor(@NonNull Reference... author) {
      this.author = Arrays.asList(author);
      return this;
    }
    /**
     * @param author - Identifies who is the author of the manifest. Manifest author is not
     *     necessarly the author of the references included.
     */
    public DocumentManifestBuilder.Impl withAuthor(@NonNull Collection<Reference> author) {
      this.author = Collections.unmodifiableCollection(author);
      return this;
    }

    public DocumentManifestBuilder.Impl withAuthor(@NonNull ReferenceBuilder... author) {
      this.author = Arrays.stream(author).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param source - Identifies the source system, application, or software that produced the
     *     document manifest.
     */
    public DocumentManifestBuilder.Impl withSource(@NonNull String source) {
      this.source = Optional.of(source);
      return this;
    }
    /**
     * @param subject - Who or what the set of documents is about. The documents can be about a
     *     person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of
     *     subjects (such as a document about a herd of farm animals, or a set of patients that
     *     share a common exposure). If the documents cross more than one subject, then more than
     *     one subject is allowed here (unusual use case).
     */
    public DocumentManifestBuilder.Impl withSubject(@NonNull Reference subject) {
      this.subject = Optional.of(subject);
      return this;
    }

    public DocumentManifestBuilder.Impl withSubject(@NonNull ReferenceBuilder subject) {
      this.subject = Optional.of(subject.build());
      return this;
    }
    /**
     * @param created - When the document manifest was created for submission to the server (not
     *     necessarily the same thing as the actual resource last modified time, since it may be
     *     modified, replicated, etc.).
     */
    public DocumentManifestBuilder.Impl withCreated(@NonNull FHIRDateTime created) {
      this.created = Optional.of(created);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public DocumentManifestBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public DocumentManifestBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public DocumentManifestBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public DocumentManifestBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public DocumentManifestBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public DocumentManifestBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public DocumentManifestBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param recipient - A patient, practitioner, or organization for which this set of documents
     *     is intended.
     */
    public DocumentManifestBuilder.Impl withRecipient(@NonNull Reference... recipient) {
      this.recipient = Arrays.asList(recipient);
      return this;
    }
    /**
     * @param recipient - A patient, practitioner, or organization for which this set of documents
     *     is intended.
     */
    public DocumentManifestBuilder.Impl withRecipient(@NonNull Collection<Reference> recipient) {
      this.recipient = Collections.unmodifiableCollection(recipient);
      return this;
    }

    public DocumentManifestBuilder.Impl withRecipient(@NonNull ReferenceBuilder... recipient) {
      this.recipient = Arrays.stream(recipient).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Other identifiers associated with the document manifest, including
     *     version independent identifiers.
     */
    public DocumentManifestBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Other identifiers associated with the document manifest, including
     *     version independent identifiers.
     */
    public DocumentManifestBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public DocumentManifestBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - Human-readable description of the source document. This is sometimes
     *     known as the "title".
     */
    public DocumentManifestBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public DocumentManifestBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param masterIdentifier - A single identifier that uniquely identifies this manifest.
     *     Principally used to refer to the manifest in non-FHIR contexts.
     */
    public DocumentManifestBuilder.Impl withMasterIdentifier(@NonNull Identifier masterIdentifier) {
      this.masterIdentifier = Optional.of(masterIdentifier);
      return this;
    }

    public DocumentManifestBuilder.Impl withMasterIdentifier(
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
    public DocumentManifestBuilder.Impl withModifierExtension(
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
    public DocumentManifestBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public DocumentManifestBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param related - Related identifiers or resources associated with the DocumentManifest. */
    public DocumentManifestBuilder.Impl withRelated(@NonNull DocumentManifest.Related... related) {
      this.related = Arrays.asList(related);
      return this;
    }
    /** @param related - Related identifiers or resources associated with the DocumentManifest. */
    public DocumentManifestBuilder.Impl withRelated(
        @NonNull Collection<DocumentManifest.Related> related) {
      this.related = Collections.unmodifiableCollection(related);
      return this;
    }

    public DocumentManifestBuilder.Impl withRelated(
        @NonNull DocumentManifest_RelatedBuilder... related) {
      this.related = Arrays.stream(related).map(e -> e.build()).collect(toList());
      return this;
    }

    public DocumentManifestBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public DocumentManifest build() {
      return new DocumentManifest(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(_type),
          status,
          author.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(source),
          OptionConverters.toScala(subject),
          OptionConverters.toScala(created),
          content.stream().collect(new NonEmptyLitSeqJCollector<>()),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          recipient.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(masterIdentifier),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          related.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
