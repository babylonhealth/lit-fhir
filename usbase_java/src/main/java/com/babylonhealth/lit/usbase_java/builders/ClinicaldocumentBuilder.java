package com.babylonhealth.lit.usbase_java.builders;

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
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.hl7.COMPOSITION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.V3_CONFIDENTIALITYCLASSIFICATION;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ClinicaldocumentBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta =
      Optional.of(
          new MetaBuilder()
              .withProfile("http://hl7.org/fhir/StructureDefinition/clinicaldocument")
              .build());
  private Optional<Narrative> text = Optional.empty();
  private CodeableConcept _type;
  private FHIRDateTime date;
  private String title;
  private COMPOSITION_STATUS status;
  private Collection<Reference> author;
  private Optional<Reference> subject = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<CodeableConcept> category = Collections.emptyList();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> encounter = Optional.empty();
  private Optional<Reference> custodian = Optional.empty();
  private Optional<Identifier> identifier = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<V3_CONFIDENTIALITYCLASSIFICATION> confidentiality = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Composition.Event> event = Collections.emptyList();
  private Collection<Composition.Section> section = Collections.emptyList();
  private Collection<Composition.Attester> attester = Collections.emptyList();
  private Collection<Composition.RelatesTo> relatesTo = Collections.emptyList();

  /**
   * Required fields for {@link Clinicaldocument}
   *
   * @param _type - Specifies the particular kind of composition (e.g. History and Physical,
   *     Discharge Summary, Progress Note). This usually equates to the purpose of making the
   *     composition.
   * @param date - The composition editing time, when the composition was last logically changed by
   *     the author.
   * @param title - Official human-readable label for the composition.
   * @param status - The workflow/clinical status of this composition. The status is a marker for
   *     the clinical standing of the document.
   * @param author - Identifies who is responsible for the information in the composition, not
   *     necessarily who typed it in.
   */
  public ClinicaldocumentBuilder(
      CodeableConcept _type,
      FHIRDateTime date,
      String title,
      COMPOSITION_STATUS status,
      Collection<Reference> author) {
    this._type = _type;
    this.date = date;
    this.title = title;
    this.status = status;
    this.author = author;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ClinicaldocumentBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public ClinicaldocumentBuilder withMeta(@NonNull Meta meta) {
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
  public ClinicaldocumentBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param subject - Who or what the composition is about. The composition can be about a person,
   *     (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects
   *     (such as a document about a herd of livestock, or a set of patients that share a common
   *     exposure).
   */
  public ClinicaldocumentBuilder withSubject(@NonNull Reference subject) {
    this.subject = Optional.of(subject);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public ClinicaldocumentBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param category - A categorization for the type of the composition - helps for indexing and
   *     searching. This may be implied by or derived from the code specified in the Composition
   *     Type.
   */
  public ClinicaldocumentBuilder withCategory(@NonNull CodeableConcept... category) {
    this.category = Arrays.asList(category);
    return this;
  }
  /**
   * @param category - A categorization for the type of the composition - helps for indexing and
   *     searching. This may be implied by or derived from the code specified in the Composition
   *     Type.
   */
  public ClinicaldocumentBuilder withCategory(@NonNull Collection<CodeableConcept> category) {
    this.category = Collections.unmodifiableCollection(category);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ClinicaldocumentBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ClinicaldocumentBuilder withContained(@NonNull Collection<Resource> contained) {
    this.contained = Collections.unmodifiableCollection(contained);
    return this;
  }
  /** @param extension - An Extension */
  public ClinicaldocumentBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /** @param extension - An Extension */
  public ClinicaldocumentBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param encounter - Describes the clinical encounter or type of care this documentation is
   *     associated with.
   */
  public ClinicaldocumentBuilder withEncounter(@NonNull Reference encounter) {
    this.encounter = Optional.of(encounter);
    return this;
  }
  /**
   * @param custodian - Identifies the organization or group who is responsible for ongoing
   *     maintenance of and access to the composition/document information.
   */
  public ClinicaldocumentBuilder withCustodian(@NonNull Reference custodian) {
    this.custodian = Optional.of(custodian);
    return this;
  }
  /**
   * @param identifier - A version-independent identifier for the Composition. This identifier stays
   *     constant as the composition is changed over time.
   */
  public ClinicaldocumentBuilder withIdentifier(@NonNull Identifier identifier) {
    this.identifier = Optional.of(identifier);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public ClinicaldocumentBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param confidentiality - The code specifying the level of confidentiality of the Composition.
   */
  public ClinicaldocumentBuilder withConfidentiality(
      @NonNull V3_CONFIDENTIALITYCLASSIFICATION confidentiality) {
    this.confidentiality = Optional.of(confidentiality);
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
  public ClinicaldocumentBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public ClinicaldocumentBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param event - The clinical service, such as a colonoscopy or an appendectomy, being
   *     documented.
   */
  public ClinicaldocumentBuilder withEvent(@NonNull Composition.Event... event) {
    this.event = Arrays.asList(event);
    return this;
  }
  /**
   * @param event - The clinical service, such as a colonoscopy or an appendectomy, being
   *     documented.
   */
  public ClinicaldocumentBuilder withEvent(@NonNull Collection<Composition.Event> event) {
    this.event = Collections.unmodifiableCollection(event);
    return this;
  }
  /** @param section - The root of the sections that make up the composition. */
  public ClinicaldocumentBuilder withSection(@NonNull Composition.Section... section) {
    this.section = Arrays.asList(section);
    return this;
  }
  /** @param section - The root of the sections that make up the composition. */
  public ClinicaldocumentBuilder withSection(@NonNull Collection<Composition.Section> section) {
    this.section = Collections.unmodifiableCollection(section);
    return this;
  }
  /**
   * @param attester - A participant who has attested to the accuracy of the composition/document.
   */
  public ClinicaldocumentBuilder withAttester(@NonNull Composition.Attester... attester) {
    this.attester = Arrays.asList(attester);
    return this;
  }
  /**
   * @param attester - A participant who has attested to the accuracy of the composition/document.
   */
  public ClinicaldocumentBuilder withAttester(@NonNull Collection<Composition.Attester> attester) {
    this.attester = Collections.unmodifiableCollection(attester);
    return this;
  }
  /**
   * @param relatesTo - Relationships that this composition has with other compositions or documents
   *     that already exist.
   */
  public ClinicaldocumentBuilder withRelatesTo(@NonNull Composition.RelatesTo... relatesTo) {
    this.relatesTo = Arrays.asList(relatesTo);
    return this;
  }
  /**
   * @param relatesTo - Relationships that this composition has with other compositions or documents
   *     that already exist.
   */
  public ClinicaldocumentBuilder withRelatesTo(
      @NonNull Collection<Composition.RelatesTo> relatesTo) {
    this.relatesTo = Collections.unmodifiableCollection(relatesTo);
    return this;
  }

  public ClinicaldocumentBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Clinicaldocument build() {
    return new Clinicaldocument(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(meta),
        (Option) OptionConverters.toScala(text),
        _type,
        date,
        title,
        status,
        author.stream().collect(new NonEmptyLitSeqJCollector<>()),
        (Option) OptionConverters.toScala(subject),
        (Option) OptionConverters.toScala(language),
        category.stream().collect(new LitSeqJCollector<>()),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(encounter),
        (Option) OptionConverters.toScala(custodian),
        (Option) OptionConverters.toScala(identifier),
        (Option) OptionConverters.toScala(implicitRules),
        (Option) OptionConverters.toScala(confidentiality),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        event.stream().collect(new LitSeqJCollector<>()),
        section.stream().collect(new LitSeqJCollector<>()),
        attester.stream().collect(new LitSeqJCollector<>()),
        relatesTo.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
