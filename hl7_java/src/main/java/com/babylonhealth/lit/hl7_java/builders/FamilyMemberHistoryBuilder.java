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
import com.babylonhealth.lit.hl7.HISTORY_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class FamilyMemberHistoryBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CodeableConcept> sex = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<FHIRDateTime> date = Optional.empty();
  private Optional<String> name = Optional.empty();
  private Collection<Annotation> note = Collections.emptyList();
  private HISTORY_STATUS status;
  private Optional<Choice_1507098327> age = Optional.empty();
  private Reference patient;
  private Optional<Choice01486281057> born = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Collection<CodeableConcept> reasonCode = Collections.emptyList();
  private Optional<Choice_0966801288> deceased = Optional.empty();
  private CodeableConcept relationship;
  private Optional<Boolean> estimatedAge = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<String> instantiatesUri = Collections.emptyList();
  private Collection<Reference> reasonReference = Collections.emptyList();
  private Optional<CodeableConcept> dataAbsentReason = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<String> instantiatesCanonical = Collections.emptyList();
  private Collection<FamilyMemberHistory.Condition> condition = Collections.emptyList();

  /**
   * Required fields for {@link FamilyMemberHistory}
   *
   * @param status - A code specifying the status of the record of the family history of a specific
   *     family member.
   * @param patient - The person who this history concerns.
   * @param relationship - The type of relationship this person has to the patient (father, mother,
   *     brother etc.).
   */
  public FamilyMemberHistoryBuilder(
      HISTORY_STATUS status, Reference patient, CodeableConcept relationship) {
    this.status = status;
    this.patient = patient;
    this.relationship = relationship;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public FamilyMemberHistoryBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param sex - The birth sex of the family member. */
  public FamilyMemberHistoryBuilder withSex(@NonNull CodeableConcept sex) {
    this.sex = Optional.of(sex);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public FamilyMemberHistoryBuilder withMeta(@NonNull Meta meta) {
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
  public FamilyMemberHistoryBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param date - The date (and possibly time) when the family member history was recorded or last
   *     updated.
   */
  public FamilyMemberHistoryBuilder withDate(@NonNull FHIRDateTime date) {
    this.date = Optional.of(date);
    return this;
  }
  /**
   * @param name - This will either be a name or a description; e.g. "Aunt Susan", "my cousin with
   *     the red hair".
   */
  public FamilyMemberHistoryBuilder withName(@NonNull String name) {
    this.name = Optional.of(name);
    return this;
  }
  /**
   * @param note - This property allows a non condition-specific note to the made about the related
   *     person. Ideally, the note would be in the condition property, but this is not always
   *     possible.
   */
  public FamilyMemberHistoryBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /**
   * @param note - This property allows a non condition-specific note to the made about the related
   *     person. Ideally, the note would be in the condition property, but this is not always
   *     possible.
   */
  public FamilyMemberHistoryBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /**
   * @param age - The age of the relative at the time the family member history is recorded. Field
   *     is a 'choice' field. Type should be one of Age, Range, String.
   */
  public FamilyMemberHistoryBuilder withAge(@NonNull Choice_1507098327 age) {
    this.age = Optional.of(age);
    return this;
  }
  /**
   * @param born - The actual or approximate date of birth of the relative. Field is a 'choice'
   *     field. Type should be one of FHIRDate, Period, String.
   */
  public FamilyMemberHistoryBuilder withBorn(@NonNull Choice01486281057 born) {
    this.born = Optional.of(born);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public FamilyMemberHistoryBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public FamilyMemberHistoryBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public FamilyMemberHistoryBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public FamilyMemberHistoryBuilder withExtension(@NonNull Extension... extension) {
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
  public FamilyMemberHistoryBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param identifier - Business identifiers assigned to this family member history by the
   *     performer or other systems which remain constant as the resource is updated and propagates
   *     from server to server.
   */
  public FamilyMemberHistoryBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Business identifiers assigned to this family member history by the
   *     performer or other systems which remain constant as the resource is updated and propagates
   *     from server to server.
   */
  public FamilyMemberHistoryBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param reasonCode - Describes why the family member history occurred in coded or textual form.
   */
  public FamilyMemberHistoryBuilder withReasonCode(@NonNull CodeableConcept... reasonCode) {
    this.reasonCode = Arrays.asList(reasonCode);
    return this;
  }
  /**
   * @param reasonCode - Describes why the family member history occurred in coded or textual form.
   */
  public FamilyMemberHistoryBuilder withReasonCode(
      @NonNull Collection<CodeableConcept> reasonCode) {
    this.reasonCode = Collections.unmodifiableCollection(reasonCode);
    return this;
  }
  /**
   * @param deceased - Deceased flag or the actual or approximate age of the relative at the time of
   *     death for the family member history record. Field is a 'choice' field. Type should be one
   *     of Age, Boolean, FHIRDate, Range, String.
   */
  public FamilyMemberHistoryBuilder withDeceased(@NonNull Choice_0966801288 deceased) {
    this.deceased = Optional.of(deceased);
    return this;
  }
  /**
   * @param estimatedAge - If true, indicates that the age value specified is an estimated value.
   */
  public FamilyMemberHistoryBuilder withEstimatedAge(@NonNull Boolean estimatedAge) {
    this.estimatedAge = Optional.of(estimatedAge);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public FamilyMemberHistoryBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
   *     orderset or other definition that is adhered to in whole or in part by this
   *     FamilyMemberHistory.
   */
  public FamilyMemberHistoryBuilder withInstantiatesUri(@NonNull String... instantiatesUri) {
    this.instantiatesUri = Arrays.asList(instantiatesUri);
    return this;
  }
  /**
   * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
   *     orderset or other definition that is adhered to in whole or in part by this
   *     FamilyMemberHistory.
   */
  public FamilyMemberHistoryBuilder withInstantiatesUri(
      @NonNull Collection<String> instantiatesUri) {
    this.instantiatesUri = Collections.unmodifiableCollection(instantiatesUri);
    return this;
  }
  /**
   * @param reasonReference - Indicates a Condition, Observation, AllergyIntolerance, or
   *     QuestionnaireResponse that justifies this family member history event.
   */
  public FamilyMemberHistoryBuilder withReasonReference(@NonNull Reference... reasonReference) {
    this.reasonReference = Arrays.asList(reasonReference);
    return this;
  }
  /**
   * @param reasonReference - Indicates a Condition, Observation, AllergyIntolerance, or
   *     QuestionnaireResponse that justifies this family member history event.
   */
  public FamilyMemberHistoryBuilder withReasonReference(
      @NonNull Collection<Reference> reasonReference) {
    this.reasonReference = Collections.unmodifiableCollection(reasonReference);
    return this;
  }
  /** @param dataAbsentReason - Describes why the family member's history is not available. */
  public FamilyMemberHistoryBuilder withDataAbsentReason(
      @NonNull CodeableConcept dataAbsentReason) {
    this.dataAbsentReason = Optional.of(dataAbsentReason);
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
  public FamilyMemberHistoryBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public FamilyMemberHistoryBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline, orderset
   *     or other definition that is adhered to in whole or in part by this FamilyMemberHistory.
   */
  public FamilyMemberHistoryBuilder withInstantiatesCanonical(
      @NonNull String... instantiatesCanonical) {
    this.instantiatesCanonical = Arrays.asList(instantiatesCanonical);
    return this;
  }
  /**
   * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline, orderset
   *     or other definition that is adhered to in whole or in part by this FamilyMemberHistory.
   */
  public FamilyMemberHistoryBuilder withInstantiatesCanonical(
      @NonNull Collection<String> instantiatesCanonical) {
    this.instantiatesCanonical = Collections.unmodifiableCollection(instantiatesCanonical);
    return this;
  }
  /**
   * @param condition - The significant Conditions (or condition) that the family member had. This
   *     is a repeating section to allow a system to represent more than one condition per resource,
   *     though there is nothing stopping multiple resources - one per condition.
   */
  public FamilyMemberHistoryBuilder withCondition(
      @NonNull FamilyMemberHistory.Condition... condition) {
    this.condition = Arrays.asList(condition);
    return this;
  }
  /**
   * @param condition - The significant Conditions (or condition) that the family member had. This
   *     is a repeating section to allow a system to represent more than one condition per resource,
   *     though there is nothing stopping multiple resources - one per condition.
   */
  public FamilyMemberHistoryBuilder withCondition(
      @NonNull Collection<FamilyMemberHistory.Condition> condition) {
    this.condition = Collections.unmodifiableCollection(condition);
    return this;
  }

  public FamilyMemberHistoryBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public FamilyMemberHistory build() {
    return new FamilyMemberHistory(
        OptionConverters.toScala(id),
        OptionConverters.toScala(sex),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        OptionConverters.toScala(date),
        OptionConverters.toScala(name),
        note.stream().collect(new LitSeqJCollector<>()),
        status,
        (Option) OptionConverters.toScala(age),
        patient,
        (Option) OptionConverters.toScala(born),
        OptionConverters.toScala(language),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        reasonCode.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(deceased),
        relationship,
        OptionConverters.toScala(estimatedAge.map(x -> (Object) x)),
        OptionConverters.toScala(implicitRules),
        instantiatesUri.stream().collect(new LitSeqJCollector<>()),
        reasonReference.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(dataAbsentReason),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        instantiatesCanonical.stream().collect(new LitSeqJCollector<>()),
        condition.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
