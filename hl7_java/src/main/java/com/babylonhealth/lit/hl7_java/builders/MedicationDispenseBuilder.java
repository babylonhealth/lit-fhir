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
import com.babylonhealth.lit.hl7.MEDICATIONDISPENSE_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface MedicationDispenseBuilder extends DomainResourceBuilder {
  public MedicationDispense build();

  public static Impl init(
      MEDICATIONDISPENSE_STATUS status, Reference subject, CodeableReference medication) {
    return new Impl(status, subject, medication);
  }

  public static Impl builder(
      MEDICATIONDISPENSE_STATUS status,
      ReferenceBuilder subject,
      CodeableReferenceBuilder medication) {
    return new Impl(status, subject.build(), medication.build());
  }

  public class Impl implements MedicationDispenseBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Collection<Reference> partOf = Collections.emptyList();
    private MEDICATIONDISPENSE_STATUS status;
    private Collection<Reference> basedOn = Collections.emptyList();
    private Reference subject;
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Optional<Reference> location = Optional.empty();
    private Optional<Quantity> quantity = Optional.empty();
    private Collection<Reference> receiver = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private CodeableReference medication;
    private Optional<Quantity> daysSupply = Optional.empty();
    private Optional<Reference> destination = Optional.empty();
    private Optional<CodeableReference> statusReason = Optional.empty();
    private Optional<FHIRDateTime> whenPrepared = Optional.empty();
    private Collection<Reference> eventHistory = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Reference> detectedIssue = Collections.emptyList();
    private Optional<FHIRDateTime> whenHandedOver = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Dosage> dosageInstruction = Collections.emptyList();
    private Collection<Reference> supportingInformation = Collections.emptyList();
    private Collection<Reference> authorizingPrescription = Collections.emptyList();
    private Optional<String> renderedDosageInstruction = Optional.empty();
    private Collection<MedicationDispense.Performer> performer = Collections.emptyList();
    private Optional<MedicationDispense.Substitution> substitution = Optional.empty();

    /**
     * Required fields for {@link MedicationDispense}
     *
     * @param status - A code specifying the state of the set of dispense events.
     * @param subject - A link to a resource representing the person or the group to whom the
     *     medication will be given.
     * @param medication - Identifies the medication being administered. This is either a link to a
     *     resource representing the details of the medication or a simple attribute carrying a code
     *     that identifies the medication from a known list of medications.
     */
    public Impl(MEDICATIONDISPENSE_STATUS status, Reference subject, CodeableReference medication) {
      this.status = status;
      this.subject = subject;
      this.medication = medication;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicationDispenseBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public MedicationDispenseBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public MedicationDispenseBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public MedicationDispenseBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public MedicationDispenseBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param _type - Indicates the type of dispensing event that is performed. For example, Trial
     *     Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
     */
    public MedicationDispenseBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public MedicationDispenseBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /**
     * @param note - Extra information about the dispense that could not be conveyed in the other
     *     attributes.
     */
    public MedicationDispenseBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Extra information about the dispense that could not be conveyed in the other
     *     attributes.
     */
    public MedicationDispenseBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public MedicationDispenseBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param partOf - The procedure or medication administration that triggered the dispense. */
    public MedicationDispenseBuilder.Impl withPartOf(@NonNull Reference... partOf) {
      this.partOf = Arrays.asList(partOf);
      return this;
    }
    /** @param partOf - The procedure or medication administration that triggered the dispense. */
    public MedicationDispenseBuilder.Impl withPartOf(@NonNull Collection<Reference> partOf) {
      this.partOf = Collections.unmodifiableCollection(partOf);
      return this;
    }

    public MedicationDispenseBuilder.Impl withPartOf(@NonNull ReferenceBuilder... partOf) {
      this.partOf = Arrays.stream(partOf).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param basedOn - A plan that is fulfilled in whole or in part by this MedicationDispense. */
    public MedicationDispenseBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /** @param basedOn - A plan that is fulfilled in whole or in part by this MedicationDispense. */
    public MedicationDispenseBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public MedicationDispenseBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public MedicationDispenseBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param category - Indicates the type of medication dispense (for example, drug classification
     *     like ATC, where meds would be administered, legal category of the medication.).
     */
    public MedicationDispenseBuilder.Impl withCategory(@NonNull CodeableConcept... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /**
     * @param category - Indicates the type of medication dispense (for example, drug classification
     *     like ATC, where meds would be administered, legal category of the medication.).
     */
    public MedicationDispenseBuilder.Impl withCategory(
        @NonNull Collection<CodeableConcept> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }

    public MedicationDispenseBuilder.Impl withCategory(
        @NonNull CodeableConceptBuilder... category) {
      this.category = Arrays.stream(category).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param location - The principal physical location where the dispense was performed. */
    public MedicationDispenseBuilder.Impl withLocation(@NonNull Reference location) {
      this.location = Optional.of(location);
      return this;
    }

    public MedicationDispenseBuilder.Impl withLocation(@NonNull ReferenceBuilder location) {
      this.location = Optional.of(location.build());
      return this;
    }
    /**
     * @param quantity - The amount of medication that has been dispensed. Includes unit of measure.
     */
    public MedicationDispenseBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public MedicationDispenseBuilder.Impl withQuantity(@NonNull QuantityBuilder quantity) {
      this.quantity = Optional.of(quantity.build());
      return this;
    }
    /**
     * @param receiver - Identifies the person who picked up the medication or the location of where
     *     the medication was delivered. This will usually be a patient or their caregiver, but some
     *     cases exist where it can be a healthcare professional or a location.
     */
    public MedicationDispenseBuilder.Impl withReceiver(@NonNull Reference... receiver) {
      this.receiver = Arrays.asList(receiver);
      return this;
    }
    /**
     * @param receiver - Identifies the person who picked up the medication or the location of where
     *     the medication was delivered. This will usually be a patient or their caregiver, but some
     *     cases exist where it can be a healthcare professional or a location.
     */
    public MedicationDispenseBuilder.Impl withReceiver(@NonNull Collection<Reference> receiver) {
      this.receiver = Collections.unmodifiableCollection(receiver);
      return this;
    }

    public MedicationDispenseBuilder.Impl withReceiver(@NonNull ReferenceBuilder... receiver) {
      this.receiver = Arrays.stream(receiver).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public MedicationDispenseBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public MedicationDispenseBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public MedicationDispenseBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public MedicationDispenseBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MedicationDispenseBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicationDispenseBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param encounter - The encounter that establishes the context for this event. */
    public MedicationDispenseBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public MedicationDispenseBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /**
     * @param identifier - Identifiers associated with this Medication Dispense that are defined by
     *     business processes and/or used to refer to it when a direct URL reference to the resource
     *     itself is not appropriate. They are business identifiers assigned to this resource by the
     *     performer or other systems and remain constant as the resource is updated and propagates
     *     from server to server.
     */
    public MedicationDispenseBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Identifiers associated with this Medication Dispense that are defined by
     *     business processes and/or used to refer to it when a direct URL reference to the resource
     *     itself is not appropriate. They are business identifiers assigned to this resource by the
     *     performer or other systems and remain constant as the resource is updated and propagates
     *     from server to server.
     */
    public MedicationDispenseBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public MedicationDispenseBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param daysSupply - The amount of medication expressed as a timing amount. */
    public MedicationDispenseBuilder.Impl withDaysSupply(@NonNull Quantity daysSupply) {
      this.daysSupply = Optional.of(daysSupply);
      return this;
    }

    public MedicationDispenseBuilder.Impl withDaysSupply(@NonNull QuantityBuilder daysSupply) {
      this.daysSupply = Optional.of(daysSupply.build());
      return this;
    }
    /**
     * @param destination - Identification of the facility/location where the medication was shipped
     *     to, as part of the dispense event.
     */
    public MedicationDispenseBuilder.Impl withDestination(@NonNull Reference destination) {
      this.destination = Optional.of(destination);
      return this;
    }

    public MedicationDispenseBuilder.Impl withDestination(@NonNull ReferenceBuilder destination) {
      this.destination = Optional.of(destination.build());
      return this;
    }
    /** @param statusReason - Indicates the reason why a dispense was not performed. */
    public MedicationDispenseBuilder.Impl withStatusReason(
        @NonNull CodeableReference statusReason) {
      this.statusReason = Optional.of(statusReason);
      return this;
    }

    public MedicationDispenseBuilder.Impl withStatusReason(
        @NonNull CodeableReferenceBuilder statusReason) {
      this.statusReason = Optional.of(statusReason.build());
      return this;
    }
    /** @param whenPrepared - The time when the dispensed product was packaged and reviewed. */
    public MedicationDispenseBuilder.Impl withWhenPrepared(@NonNull FHIRDateTime whenPrepared) {
      this.whenPrepared = Optional.of(whenPrepared);
      return this;
    }
    /**
     * @param eventHistory - A summary of the events of interest that have occurred, such as when
     *     the dispense was verified.
     */
    public MedicationDispenseBuilder.Impl withEventHistory(@NonNull Reference... eventHistory) {
      this.eventHistory = Arrays.asList(eventHistory);
      return this;
    }
    /**
     * @param eventHistory - A summary of the events of interest that have occurred, such as when
     *     the dispense was verified.
     */
    public MedicationDispenseBuilder.Impl withEventHistory(
        @NonNull Collection<Reference> eventHistory) {
      this.eventHistory = Collections.unmodifiableCollection(eventHistory);
      return this;
    }

    public MedicationDispenseBuilder.Impl withEventHistory(
        @NonNull ReferenceBuilder... eventHistory) {
      this.eventHistory = Arrays.stream(eventHistory).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public MedicationDispenseBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param detectedIssue - Indicates an actual or potential clinical issue with or between one or
     *     more active or proposed clinical actions for a patient; e.g. drug-drug interaction,
     *     duplicate therapy, dosage alert etc.
     */
    public MedicationDispenseBuilder.Impl withDetectedIssue(@NonNull Reference... detectedIssue) {
      this.detectedIssue = Arrays.asList(detectedIssue);
      return this;
    }
    /**
     * @param detectedIssue - Indicates an actual or potential clinical issue with or between one or
     *     more active or proposed clinical actions for a patient; e.g. drug-drug interaction,
     *     duplicate therapy, dosage alert etc.
     */
    public MedicationDispenseBuilder.Impl withDetectedIssue(
        @NonNull Collection<Reference> detectedIssue) {
      this.detectedIssue = Collections.unmodifiableCollection(detectedIssue);
      return this;
    }

    public MedicationDispenseBuilder.Impl withDetectedIssue(
        @NonNull ReferenceBuilder... detectedIssue) {
      this.detectedIssue = Arrays.stream(detectedIssue).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param whenHandedOver - The time the dispensed product was provided to the patient or their
     *     representative.
     */
    public MedicationDispenseBuilder.Impl withWhenHandedOver(@NonNull FHIRDateTime whenHandedOver) {
      this.whenHandedOver = Optional.of(whenHandedOver);
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
    public MedicationDispenseBuilder.Impl withModifierExtension(
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
    public MedicationDispenseBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicationDispenseBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param dosageInstruction - Indicates how the medication is to be used by the patient. */
    public MedicationDispenseBuilder.Impl withDosageInstruction(
        @NonNull Dosage... dosageInstruction) {
      this.dosageInstruction = Arrays.asList(dosageInstruction);
      return this;
    }
    /** @param dosageInstruction - Indicates how the medication is to be used by the patient. */
    public MedicationDispenseBuilder.Impl withDosageInstruction(
        @NonNull Collection<Dosage> dosageInstruction) {
      this.dosageInstruction = Collections.unmodifiableCollection(dosageInstruction);
      return this;
    }

    public MedicationDispenseBuilder.Impl withDosageInstruction(
        @NonNull DosageBuilder... dosageInstruction) {
      this.dosageInstruction =
          Arrays.stream(dosageInstruction).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param supportingInformation - Additional information that supports the medication being
     *     dispensed. For example, there may be requirements that a specific lab test has been
     *     completed prior to dispensing or the patient's weight at the time of dispensing is
     *     documented.
     */
    public MedicationDispenseBuilder.Impl withSupportingInformation(
        @NonNull Reference... supportingInformation) {
      this.supportingInformation = Arrays.asList(supportingInformation);
      return this;
    }
    /**
     * @param supportingInformation - Additional information that supports the medication being
     *     dispensed. For example, there may be requirements that a specific lab test has been
     *     completed prior to dispensing or the patient's weight at the time of dispensing is
     *     documented.
     */
    public MedicationDispenseBuilder.Impl withSupportingInformation(
        @NonNull Collection<Reference> supportingInformation) {
      this.supportingInformation = Collections.unmodifiableCollection(supportingInformation);
      return this;
    }

    public MedicationDispenseBuilder.Impl withSupportingInformation(
        @NonNull ReferenceBuilder... supportingInformation) {
      this.supportingInformation =
          Arrays.stream(supportingInformation).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param authorizingPrescription - Indicates the medication order that is being dispensed
     *     against.
     */
    public MedicationDispenseBuilder.Impl withAuthorizingPrescription(
        @NonNull Reference... authorizingPrescription) {
      this.authorizingPrescription = Arrays.asList(authorizingPrescription);
      return this;
    }
    /**
     * @param authorizingPrescription - Indicates the medication order that is being dispensed
     *     against.
     */
    public MedicationDispenseBuilder.Impl withAuthorizingPrescription(
        @NonNull Collection<Reference> authorizingPrescription) {
      this.authorizingPrescription = Collections.unmodifiableCollection(authorizingPrescription);
      return this;
    }

    public MedicationDispenseBuilder.Impl withAuthorizingPrescription(
        @NonNull ReferenceBuilder... authorizingPrescription) {
      this.authorizingPrescription =
          Arrays.stream(authorizingPrescription).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param renderedDosageInstruction - The full representation of the dose of the medication
     *     included in all dosage instructions. To be used when multiple dosage instructions are
     *     included to represent complex dosing such as increasing or tapering doses.
     */
    public MedicationDispenseBuilder.Impl withRenderedDosageInstruction(
        @NonNull String renderedDosageInstruction) {
      this.renderedDosageInstruction = Optional.of(renderedDosageInstruction);
      return this;
    }
    /** @param performer - Indicates who or what performed the event. */
    public MedicationDispenseBuilder.Impl withPerformer(
        @NonNull MedicationDispense.Performer... performer) {
      this.performer = Arrays.asList(performer);
      return this;
    }
    /** @param performer - Indicates who or what performed the event. */
    public MedicationDispenseBuilder.Impl withPerformer(
        @NonNull Collection<MedicationDispense.Performer> performer) {
      this.performer = Collections.unmodifiableCollection(performer);
      return this;
    }

    public MedicationDispenseBuilder.Impl withPerformer(
        @NonNull MedicationDispense_PerformerBuilder... performer) {
      this.performer = Arrays.stream(performer).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param substitution - Indicates whether or not substitution was made as part of the dispense.
     *     In some cases, substitution will be expected but does not happen, in other cases
     *     substitution is not expected but does happen. This block explains what substitution did
     *     or did not happen and why. If nothing is specified, substitution was not done.
     */
    public MedicationDispenseBuilder.Impl withSubstitution(
        @NonNull MedicationDispense.Substitution substitution) {
      this.substitution = Optional.of(substitution);
      return this;
    }

    public MedicationDispenseBuilder.Impl withSubstitution(
        @NonNull MedicationDispense_SubstitutionBuilder substitution) {
      this.substitution = Optional.of(substitution.build());
      return this;
    }

    public MedicationDispenseBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public MedicationDispense build() {
      return new MedicationDispense(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(_type),
          note.stream().collect(new LitSeqJCollector<>()),
          partOf.stream().collect(new LitSeqJCollector<>()),
          status,
          basedOn.stream().collect(new LitSeqJCollector<>()),
          subject,
          OptionConverters.toScala(language),
          category.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(location),
          OptionConverters.toScala(quantity),
          receiver.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          identifier.stream().collect(new LitSeqJCollector<>()),
          medication,
          OptionConverters.toScala(daysSupply),
          OptionConverters.toScala(destination),
          OptionConverters.toScala(statusReason),
          OptionConverters.toScala(whenPrepared),
          eventHistory.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          detectedIssue.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(whenHandedOver),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          dosageInstruction.stream().collect(new LitSeqJCollector<>()),
          supportingInformation.stream().collect(new LitSeqJCollector<>()),
          authorizingPrescription.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(renderedDosageInstruction),
          performer.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(substitution),
          LitUtils.emptyMetaElMap());
    }
  }
}
