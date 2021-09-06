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
import com.babylonhealth.lit.hl7.MEDICATION_ADMIN_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class MedicationAdministrationBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Collection<Annotation> note = Collections.emptyList();
  private Collection<Reference> partOf = Collections.emptyList();
  private MEDICATION_ADMIN_STATUS status;
  private Collection<Reference> device = Collections.emptyList();
  private Reference subject;
  private Optional<Reference> context = Optional.empty();
  private Optional<Reference> request = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<CodeableConcept> category = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Collection<CodeableConcept> reasonCode = Collections.emptyList();
  private Collection<String> instantiates = Collections.emptyList();
  private Collection<CodeableConcept> statusReason = Collections.emptyList();
  private Choice_0934386166 effective;
  private Collection<Reference> eventHistory = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Choice01025009075 medication;
  private Collection<Reference> reasonReference = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Reference> supportingInformation = Collections.emptyList();
  private Optional<MedicationAdministration.Dosage> dosage = Optional.empty();
  private Collection<MedicationAdministration.Performer> performer = Collections.emptyList();

  /**
   * Required fields for {@link MedicationAdministration}
   *
   * @param status - Will generally be set to show that the administration has been completed. For
   *     some long running administrations such as infusions, it is possible for an administration
   *     to be started but not completed or it may be paused while some other process is under way.
   * @param subject - The person or animal or group receiving the medication.
   * @param effective - A specific date/time or interval of time during which the administration
   *     took place (or did not take place, when the 'notGiven' attribute is true). For many
   *     administrations, such as swallowing a tablet the use of dateTime is more appropriate. Field
   *     is a 'choice' field. Type should be one of FHIRDateTime, Period. To pass the value in, wrap
   *     with one of the MedicationAdministrationBuilder.effective static methods
   * @param medication - Identifies the medication that was administered. This is either a link to a
   *     resource representing the details of the medication or a simple attribute carrying a code
   *     that identifies the medication from a known list of medications. Field is a 'choice' field.
   *     Type should be one of CodeableConcept, Reference. To pass the value in, wrap with one of
   *     the MedicationAdministrationBuilder.medication static methods
   */
  public MedicationAdministrationBuilder(
      MEDICATION_ADMIN_STATUS status,
      Reference subject,
      @NonNull Choice_0934386166 effective,
      @NonNull Choice01025009075 medication) {
    this.status = status;
    this.subject = subject;
    this.effective = effective;
    this.medication = medication;
  }

  public static Choice_0934386166 effective(FHIRDateTime f) {
    return new Choice_0934386166(f);
  }

  public static Choice_0934386166 effective(Period p) {
    return new Choice_0934386166(p);
  }

  public static Choice01025009075 medication(CodeableConcept c) {
    return new Choice01025009075(c);
  }

  public static Choice01025009075 medication(Reference r) {
    return new Choice01025009075(r);
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public MedicationAdministrationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public MedicationAdministrationBuilder withMeta(@NonNull Meta meta) {
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
  public MedicationAdministrationBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param note - Extra information about the medication administration that is not conveyed by the
   *     other attributes.
   */
  public MedicationAdministrationBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /**
   * @param note - Extra information about the medication administration that is not conveyed by the
   *     other attributes.
   */
  public MedicationAdministrationBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /** @param partOf - A larger event of which this particular event is a component or step. */
  public MedicationAdministrationBuilder withPartOf(@NonNull Reference... partOf) {
    this.partOf = Arrays.asList(partOf);
    return this;
  }
  /** @param partOf - A larger event of which this particular event is a component or step. */
  public MedicationAdministrationBuilder withPartOf(@NonNull Collection<Reference> partOf) {
    this.partOf = Collections.unmodifiableCollection(partOf);
    return this;
  }
  /**
   * @param device - The device used in administering the medication to the patient. For example, a
   *     particular infusion pump.
   */
  public MedicationAdministrationBuilder withDevice(@NonNull Reference... device) {
    this.device = Arrays.asList(device);
    return this;
  }
  /**
   * @param device - The device used in administering the medication to the patient. For example, a
   *     particular infusion pump.
   */
  public MedicationAdministrationBuilder withDevice(@NonNull Collection<Reference> device) {
    this.device = Collections.unmodifiableCollection(device);
    return this;
  }
  /**
   * @param context - The visit, admission, or other contact between patient and health care
   *     provider during which the medication administration was performed.
   */
  public MedicationAdministrationBuilder withContext(@NonNull Reference context) {
    this.context = Optional.of(context);
    return this;
  }
  /**
   * @param request - The original request, instruction or authority to perform the administration.
   */
  public MedicationAdministrationBuilder withRequest(@NonNull Reference request) {
    this.request = Optional.of(request);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public MedicationAdministrationBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param category - Indicates where the medication is expected to be consumed or administered.
   */
  public MedicationAdministrationBuilder withCategory(@NonNull CodeableConcept category) {
    this.category = Optional.of(category);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public MedicationAdministrationBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public MedicationAdministrationBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public MedicationAdministrationBuilder withExtension(@NonNull Extension... extension) {
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
  public MedicationAdministrationBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param identifier - Identifiers associated with this Medication Administration that are defined
   *     by business processes and/or used to refer to it when a direct URL reference to the
   *     resource itself is not appropriate. They are business identifiers assigned to this resource
   *     by the performer or other systems and remain constant as the resource is updated and
   *     propagates from server to server.
   */
  public MedicationAdministrationBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Identifiers associated with this Medication Administration that are defined
   *     by business processes and/or used to refer to it when a direct URL reference to the
   *     resource itself is not appropriate. They are business identifiers assigned to this resource
   *     by the performer or other systems and remain constant as the resource is updated and
   *     propagates from server to server.
   */
  public MedicationAdministrationBuilder withIdentifier(
      @NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param reasonCode - A code indicating why the medication was given. */
  public MedicationAdministrationBuilder withReasonCode(@NonNull CodeableConcept... reasonCode) {
    this.reasonCode = Arrays.asList(reasonCode);
    return this;
  }
  /** @param reasonCode - A code indicating why the medication was given. */
  public MedicationAdministrationBuilder withReasonCode(
      @NonNull Collection<CodeableConcept> reasonCode) {
    this.reasonCode = Collections.unmodifiableCollection(reasonCode);
    return this;
  }
  /**
   * @param instantiates - A protocol, guideline, orderset, or other definition that was adhered to
   *     in whole or in part by this event.
   */
  public MedicationAdministrationBuilder withInstantiates(@NonNull String... instantiates) {
    this.instantiates = Arrays.asList(instantiates);
    return this;
  }
  /**
   * @param instantiates - A protocol, guideline, orderset, or other definition that was adhered to
   *     in whole or in part by this event.
   */
  public MedicationAdministrationBuilder withInstantiates(
      @NonNull Collection<String> instantiates) {
    this.instantiates = Collections.unmodifiableCollection(instantiates);
    return this;
  }
  /** @param statusReason - A code indicating why the administration was not performed. */
  public MedicationAdministrationBuilder withStatusReason(
      @NonNull CodeableConcept... statusReason) {
    this.statusReason = Arrays.asList(statusReason);
    return this;
  }
  /** @param statusReason - A code indicating why the administration was not performed. */
  public MedicationAdministrationBuilder withStatusReason(
      @NonNull Collection<CodeableConcept> statusReason) {
    this.statusReason = Collections.unmodifiableCollection(statusReason);
    return this;
  }
  /**
   * @param eventHistory - A summary of the events of interest that have occurred, such as when the
   *     administration was verified.
   */
  public MedicationAdministrationBuilder withEventHistory(@NonNull Reference... eventHistory) {
    this.eventHistory = Arrays.asList(eventHistory);
    return this;
  }
  /**
   * @param eventHistory - A summary of the events of interest that have occurred, such as when the
   *     administration was verified.
   */
  public MedicationAdministrationBuilder withEventHistory(
      @NonNull Collection<Reference> eventHistory) {
    this.eventHistory = Collections.unmodifiableCollection(eventHistory);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public MedicationAdministrationBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param reasonReference - Condition or observation that supports why the medication was
   *     administered.
   */
  public MedicationAdministrationBuilder withReasonReference(
      @NonNull Reference... reasonReference) {
    this.reasonReference = Arrays.asList(reasonReference);
    return this;
  }
  /**
   * @param reasonReference - Condition or observation that supports why the medication was
   *     administered.
   */
  public MedicationAdministrationBuilder withReasonReference(
      @NonNull Collection<Reference> reasonReference) {
    this.reasonReference = Collections.unmodifiableCollection(reasonReference);
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
  public MedicationAdministrationBuilder withModifierExtension(
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
  public MedicationAdministrationBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param supportingInformation - Additional information (for example, patient height and weight)
   *     that supports the administration of the medication.
   */
  public MedicationAdministrationBuilder withSupportingInformation(
      @NonNull Reference... supportingInformation) {
    this.supportingInformation = Arrays.asList(supportingInformation);
    return this;
  }
  /**
   * @param supportingInformation - Additional information (for example, patient height and weight)
   *     that supports the administration of the medication.
   */
  public MedicationAdministrationBuilder withSupportingInformation(
      @NonNull Collection<Reference> supportingInformation) {
    this.supportingInformation = Collections.unmodifiableCollection(supportingInformation);
    return this;
  }
  /**
   * @param dosage - Describes the medication dosage information details e.g. dose, rate, site,
   *     route, etc.
   */
  public MedicationAdministrationBuilder withDosage(
      @NonNull MedicationAdministration.Dosage dosage) {
    this.dosage = Optional.of(dosage);
    return this;
  }
  /**
   * @param performer - Indicates who or what performed the medication administration and how they
   *     were involved.
   */
  public MedicationAdministrationBuilder withPerformer(
      @NonNull MedicationAdministration.Performer... performer) {
    this.performer = Arrays.asList(performer);
    return this;
  }
  /**
   * @param performer - Indicates who or what performed the medication administration and how they
   *     were involved.
   */
  public MedicationAdministrationBuilder withPerformer(
      @NonNull Collection<MedicationAdministration.Performer> performer) {
    this.performer = Collections.unmodifiableCollection(performer);
    return this;
  }

  public MedicationAdministrationBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public MedicationAdministration build() {
    return new MedicationAdministration(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        note.stream().collect(new LitSeqJCollector<>()),
        partOf.stream().collect(new LitSeqJCollector<>()),
        status,
        device.stream().collect(new LitSeqJCollector<>()),
        subject,
        OptionConverters.toScala(context),
        OptionConverters.toScala(request),
        OptionConverters.toScala(language),
        OptionConverters.toScala(category),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        reasonCode.stream().collect(new LitSeqJCollector<>()),
        instantiates.stream().collect(new LitSeqJCollector<>()),
        statusReason.stream().collect(new LitSeqJCollector<>()),
        effective,
        eventHistory.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        medication,
        reasonReference.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        supportingInformation.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(dosage),
        performer.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
