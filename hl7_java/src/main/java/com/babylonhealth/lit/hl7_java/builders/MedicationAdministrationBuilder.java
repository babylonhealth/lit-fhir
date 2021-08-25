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

public interface MedicationAdministrationBuilder extends DomainResourceBuilder {
  public MedicationAdministration build();

  public static Impl init(
      MEDICATION_ADMIN_STATUS status,
      Reference subject,
      CodeableReference medication,
      @NonNull ChoiceDateTimeOrPeriod occurence) {
    return new Impl(status, subject, medication, occurence);
  }

  public static Impl builder(
      MEDICATION_ADMIN_STATUS status,
      ReferenceBuilder subject,
      CodeableReferenceBuilder medication,
      @NonNull ChoiceDateTimeOrPeriod occurence) {
    return new Impl(status, subject.build(), medication.build(), occurence);
  }

  public static ChoiceDateTimeOrPeriod occurence(FHIRDateTime f) {
    return new ChoiceDateTimeOrPeriod(f);
  }

  public static ChoiceDateTimeOrPeriod occurence(Period p) {
    return new ChoiceDateTimeOrPeriod(p);
  }

  public class Impl implements MedicationAdministrationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Collection<Reference> partOf = Collections.emptyList();
    private MEDICATION_ADMIN_STATUS status;
    private Collection<CodeableReference> reason = Collections.emptyList();
    private Collection<Reference> device = Collections.emptyList();
    private Collection<Reference> basedOn = Collections.emptyList();
    private Reference subject;
    private Optional<Reference> request = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Optional<FHIRDateTime> recorded = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private CodeableReference medication;
    private Collection<CodeableConcept> statusReason = Collections.emptyList();
    private ChoiceDateTimeOrPeriod occurence;
    private Collection<Reference> eventHistory = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<String> instantiatesUri = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<String> instantiatesCanonical = Collections.emptyList();
    private Collection<Reference> supportingInformation = Collections.emptyList();
    private Optional<MedicationAdministration.Dosage> dosage = Optional.empty();
    private Collection<MedicationAdministration.Performer> performer = Collections.emptyList();

    /**
     * Required fields for {@link MedicationAdministration}
     *
     * @param status - Will generally be set to show that the administration has been completed. For
     *     some long running administrations such as infusions, it is possible for an administration
     *     to be started but not completed or it may be paused while some other process is under
     *     way.
     * @param subject - The person or animal or group receiving the medication.
     * @param medication - Identifies the medication that was administered. This is either a link to
     *     a resource representing the details of the medication or a simple attribute carrying a
     *     code that identifies the medication from a known list of medications.
     * @param occurence - A specific date/time or interval of time during which the administration
     *     took place (or did not take place). For many administrations, such as swallowing a tablet
     *     the use of dateTime is more appropriate. Field is a 'choice' field. Type should be one of
     *     FHIRDateTime, Period. To pass the value in, wrap with one of the
     *     MedicationAdministrationBuilder.occurence static methods
     */
    public Impl(
        MEDICATION_ADMIN_STATUS status,
        Reference subject,
        CodeableReference medication,
        @NonNull ChoiceDateTimeOrPeriod occurence) {
      this.status = status;
      this.subject = subject;
      this.medication = medication;
      this.occurence = occurence;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicationAdministrationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public MedicationAdministrationBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public MedicationAdministrationBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param note - Extra information about the medication administration that is not conveyed by
     *     the other attributes.
     */
    public MedicationAdministrationBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Extra information about the medication administration that is not conveyed by
     *     the other attributes.
     */
    public MedicationAdministrationBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param partOf - A larger event of which this particular event is a component or step. */
    public MedicationAdministrationBuilder.Impl withPartOf(@NonNull Reference... partOf) {
      this.partOf = Arrays.asList(partOf);
      return this;
    }
    /** @param partOf - A larger event of which this particular event is a component or step. */
    public MedicationAdministrationBuilder.Impl withPartOf(@NonNull Collection<Reference> partOf) {
      this.partOf = Collections.unmodifiableCollection(partOf);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withPartOf(@NonNull ReferenceBuilder... partOf) {
      this.partOf = Arrays.stream(partOf).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param reason - A code, Condition or observation that supports why the medication was
     *     administered.
     */
    public MedicationAdministrationBuilder.Impl withReason(@NonNull CodeableReference... reason) {
      this.reason = Arrays.asList(reason);
      return this;
    }
    /**
     * @param reason - A code, Condition or observation that supports why the medication was
     *     administered.
     */
    public MedicationAdministrationBuilder.Impl withReason(
        @NonNull Collection<CodeableReference> reason) {
      this.reason = Collections.unmodifiableCollection(reason);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withReason(
        @NonNull CodeableReferenceBuilder... reason) {
      this.reason = Arrays.stream(reason).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param device - The device used in administering the medication to the patient. For example,
     *     a particular infusion pump.
     */
    public MedicationAdministrationBuilder.Impl withDevice(@NonNull Reference... device) {
      this.device = Arrays.asList(device);
      return this;
    }
    /**
     * @param device - The device used in administering the medication to the patient. For example,
     *     a particular infusion pump.
     */
    public MedicationAdministrationBuilder.Impl withDevice(@NonNull Collection<Reference> device) {
      this.device = Collections.unmodifiableCollection(device);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withDevice(@NonNull ReferenceBuilder... device) {
      this.device = Arrays.stream(device).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param basedOn - A plan that is fulfilled in whole or in part by this
     *     MedicationAdministration.
     */
    public MedicationAdministrationBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /**
     * @param basedOn - A plan that is fulfilled in whole or in part by this
     *     MedicationAdministration.
     */
    public MedicationAdministrationBuilder.Impl withBasedOn(
        @NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param request - The original request, instruction or authority to perform the
     *     administration.
     */
    public MedicationAdministrationBuilder.Impl withRequest(@NonNull Reference request) {
      this.request = Optional.of(request);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withRequest(@NonNull ReferenceBuilder request) {
      this.request = Optional.of(request.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public MedicationAdministrationBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param category - The type of medication administration (for example, drug classification
     *     like ATC, where meds would be administered, legal category of the medication).
     */
    public MedicationAdministrationBuilder.Impl withCategory(@NonNull CodeableConcept... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /**
     * @param category - The type of medication administration (for example, drug classification
     *     like ATC, where meds would be administered, legal category of the medication).
     */
    public MedicationAdministrationBuilder.Impl withCategory(
        @NonNull Collection<CodeableConcept> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withCategory(
        @NonNull CodeableConceptBuilder... category) {
      this.category = Arrays.stream(category).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param recorded - The date the occurrence of the MedicationAdministration was first captured
     *     in the record - potentially significantly after the occurrence of the event.
     */
    public MedicationAdministrationBuilder.Impl withRecorded(@NonNull FHIRDateTime recorded) {
      this.recorded = Optional.of(recorded);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public MedicationAdministrationBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public MedicationAdministrationBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withContained(
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
    public MedicationAdministrationBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MedicationAdministrationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - The visit, admission, or other contact between patient and health care
     *     provider during which the medication administration was performed.
     */
    public MedicationAdministrationBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /**
     * @param identifier - Identifiers associated with this Medication Administration that are
     *     defined by business processes and/or used to refer to it when a direct URL reference to
     *     the resource itself is not appropriate. They are business identifiers assigned to this
     *     resource by the performer or other systems and remain constant as the resource is updated
     *     and propagates from server to server.
     */
    public MedicationAdministrationBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Identifiers associated with this Medication Administration that are
     *     defined by business processes and/or used to refer to it when a direct URL reference to
     *     the resource itself is not appropriate. They are business identifiers assigned to this
     *     resource by the performer or other systems and remain constant as the resource is updated
     *     and propagates from server to server.
     */
    public MedicationAdministrationBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param statusReason - A code indicating why the administration was not performed. */
    public MedicationAdministrationBuilder.Impl withStatusReason(
        @NonNull CodeableConcept... statusReason) {
      this.statusReason = Arrays.asList(statusReason);
      return this;
    }
    /** @param statusReason - A code indicating why the administration was not performed. */
    public MedicationAdministrationBuilder.Impl withStatusReason(
        @NonNull Collection<CodeableConcept> statusReason) {
      this.statusReason = Collections.unmodifiableCollection(statusReason);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withStatusReason(
        @NonNull CodeableConceptBuilder... statusReason) {
      this.statusReason = Arrays.stream(statusReason).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param eventHistory - A summary of the events of interest that have occurred, such as when
     *     the administration was verified.
     */
    public MedicationAdministrationBuilder.Impl withEventHistory(
        @NonNull Reference... eventHistory) {
      this.eventHistory = Arrays.asList(eventHistory);
      return this;
    }
    /**
     * @param eventHistory - A summary of the events of interest that have occurred, such as when
     *     the administration was verified.
     */
    public MedicationAdministrationBuilder.Impl withEventHistory(
        @NonNull Collection<Reference> eventHistory) {
      this.eventHistory = Collections.unmodifiableCollection(eventHistory);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withEventHistory(
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
    public MedicationAdministrationBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this
     *     MedicationAdministration.
     */
    public MedicationAdministrationBuilder.Impl withInstantiatesUri(
        @NonNull String... instantiatesUri) {
      this.instantiatesUri = Arrays.asList(instantiatesUri);
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this
     *     MedicationAdministration.
     */
    public MedicationAdministrationBuilder.Impl withInstantiatesUri(
        @NonNull Collection<String> instantiatesUri) {
      this.instantiatesUri = Collections.unmodifiableCollection(instantiatesUri);
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
    public MedicationAdministrationBuilder.Impl withModifierExtension(
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
    public MedicationAdministrationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param instantiatesCanonical - A protocol, guideline, orderset, or other definition that was
     *     adhered to in whole or in part by this event.
     */
    public MedicationAdministrationBuilder.Impl withInstantiatesCanonical(
        @NonNull String... instantiatesCanonical) {
      this.instantiatesCanonical = Arrays.asList(instantiatesCanonical);
      return this;
    }
    /**
     * @param instantiatesCanonical - A protocol, guideline, orderset, or other definition that was
     *     adhered to in whole or in part by this event.
     */
    public MedicationAdministrationBuilder.Impl withInstantiatesCanonical(
        @NonNull Collection<String> instantiatesCanonical) {
      this.instantiatesCanonical = Collections.unmodifiableCollection(instantiatesCanonical);
      return this;
    }
    /**
     * @param supportingInformation - Additional information (for example, patient height and
     *     weight) that supports the administration of the medication. This attribute can be used to
     *     provide documentation of specific characteristics of the patient present at the time of
     *     administration. For example, if the dose says "give "x" if the heartrate exceeds "y"",
     *     then the heart rate can be included using this attribute.
     */
    public MedicationAdministrationBuilder.Impl withSupportingInformation(
        @NonNull Reference... supportingInformation) {
      this.supportingInformation = Arrays.asList(supportingInformation);
      return this;
    }
    /**
     * @param supportingInformation - Additional information (for example, patient height and
     *     weight) that supports the administration of the medication. This attribute can be used to
     *     provide documentation of specific characteristics of the patient present at the time of
     *     administration. For example, if the dose says "give "x" if the heartrate exceeds "y"",
     *     then the heart rate can be included using this attribute.
     */
    public MedicationAdministrationBuilder.Impl withSupportingInformation(
        @NonNull Collection<Reference> supportingInformation) {
      this.supportingInformation = Collections.unmodifiableCollection(supportingInformation);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withSupportingInformation(
        @NonNull ReferenceBuilder... supportingInformation) {
      this.supportingInformation =
          Arrays.stream(supportingInformation).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param dosage - Describes the medication dosage information details e.g. dose, rate, site,
     *     route, etc.
     */
    public MedicationAdministrationBuilder.Impl withDosage(
        @NonNull MedicationAdministration.Dosage dosage) {
      this.dosage = Optional.of(dosage);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withDosage(
        @NonNull MedicationAdministration_DosageBuilder dosage) {
      this.dosage = Optional.of(dosage.build());
      return this;
    }
    /**
     * @param performer - Indicates who or what performed the medication administration and how they
     *     were involved.
     */
    public MedicationAdministrationBuilder.Impl withPerformer(
        @NonNull MedicationAdministration.Performer... performer) {
      this.performer = Arrays.asList(performer);
      return this;
    }
    /**
     * @param performer - Indicates who or what performed the medication administration and how they
     *     were involved.
     */
    public MedicationAdministrationBuilder.Impl withPerformer(
        @NonNull Collection<MedicationAdministration.Performer> performer) {
      this.performer = Collections.unmodifiableCollection(performer);
      return this;
    }

    public MedicationAdministrationBuilder.Impl withPerformer(
        @NonNull MedicationAdministration_PerformerBuilder... performer) {
      this.performer = Arrays.stream(performer).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicationAdministrationBuilder.Impl withoutMeta() {
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
          reason.stream().collect(new LitSeqJCollector<>()),
          device.stream().collect(new LitSeqJCollector<>()),
          basedOn.stream().collect(new LitSeqJCollector<>()),
          subject,
          OptionConverters.toScala(request),
          OptionConverters.toScala(language),
          category.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(recorded),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          identifier.stream().collect(new LitSeqJCollector<>()),
          medication,
          statusReason.stream().collect(new LitSeqJCollector<>()),
          occurence,
          eventHistory.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          instantiatesUri.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          instantiatesCanonical.stream().collect(new LitSeqJCollector<>()),
          supportingInformation.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(dosage),
          performer.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
