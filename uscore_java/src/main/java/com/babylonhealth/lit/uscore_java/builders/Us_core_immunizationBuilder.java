package com.babylonhealth.lit.uscore_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.IMMUNIZATION_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.uscore.model.*;
import com.babylonhealth.lit.uscore_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Us_core_immunizationBuilder extends ImmunizationBuilder {
  public Us_core_immunization build();

  public static Impl init(
      IMMUNIZATION_STATUS status,
      Reference patient,
      CodeableConcept vaccineCode,
      @NonNull ChoiceDateTimeOrString occurrence,
      Boolean primarySource) {
    return new Impl(status, patient, vaccineCode, occurrence, primarySource);
  }

  public static Impl builder(
      IMMUNIZATION_STATUS status,
      ReferenceBuilder patient,
      CodeableConceptBuilder vaccineCode,
      @NonNull ChoiceDateTimeOrString occurrence,
      Boolean primarySource) {
    return new Impl(status, patient.build(), vaccineCode.build(), occurrence, primarySource);
  }

  public static ChoiceDateTimeOrString occurrence(FHIRDateTime f) {
    return new ChoiceDateTimeOrString(f);
  }

  public static ChoiceDateTimeOrString occurrence(String s) {
    return new ChoiceDateTimeOrString(s);
  }

  public class Impl implements Us_core_immunizationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-immunization")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> site = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<CodeableConcept> route = Optional.empty();
    private IMMUNIZATION_STATUS status;
    private Reference patient;
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<FHIRDateTime> recorded = Optional.empty();
    private Optional<Reference> location = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Optional<String> lotNumber = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<CodeableConcept> reasonCode = Collections.emptyList();
    private CodeableConcept vaccineCode;
    private Optional<Boolean> isSubpotent = Optional.empty();
    private Optional<CodeableConcept> statusReason = Optional.empty();
    private Optional<CodeableConcept> reportOrigin = Optional.empty();
    private Optional<Reference> manufacturer = Optional.empty();
    private Optional<Quantity> doseQuantity = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private ChoiceDateTimeOrString occurrence;
    private Boolean primarySource;
    private Optional<CodeableConcept> fundingSource = Optional.empty();
    private Optional<FHIRDate> expirationDate = Optional.empty();
    private Collection<Reference> reasonReference = Collections.emptyList();
    private Collection<CodeableConcept> subpotentReason = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<CodeableConcept> programEligibility = Collections.emptyList();
    private Collection<Immunization.Reaction> reaction = Collections.emptyList();
    private Collection<Immunization.Performer> performer = Collections.emptyList();
    private Collection<Immunization.Education> education = Collections.emptyList();
    private Collection<Immunization.ProtocolApplied> protocolApplied = Collections.emptyList();

    /**
     * Required fields for {@link Us_core_immunization}
     *
     * @param status - Indicates the current status of the immunization event.
     * @param patient - The patient who either received or did not receive the immunization.
     * @param vaccineCode - Vaccine that was administered or was to be administered.
     * @param occurrence - Date vaccine administered or was to be administered. Field is a 'choice'
     *     field. Type should be one of FHIRDateTime, String. To pass the value in, wrap with one of
     *     the Us_core_immunizationBuilder.occurrence static methods
     * @param primarySource - An indication that the content of the record is based on information
     *     from the person who administered the vaccine. This reflects the context under which the
     *     data was originally recorded.
     */
    public Impl(
        IMMUNIZATION_STATUS status,
        Reference patient,
        CodeableConcept vaccineCode,
        @NonNull ChoiceDateTimeOrString occurrence,
        Boolean primarySource) {
      this.status = status;
      this.patient = patient;
      this.vaccineCode = vaccineCode;
      this.occurrence = occurrence;
      this.primarySource = primarySource;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Us_core_immunizationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public Us_core_immunizationBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public Us_core_immunizationBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param site - Body site where vaccine was administered. */
    public Us_core_immunizationBuilder.Impl withSite(@NonNull CodeableConcept site) {
      this.site = Optional.of(site);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withSite(@NonNull CodeableConceptBuilder site) {
      this.site = Optional.of(site.build());
      return this;
    }
    /**
     * @param note - Extra information about the immunization that is not conveyed by the other
     *     attributes.
     */
    public Us_core_immunizationBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Extra information about the immunization that is not conveyed by the other
     *     attributes.
     */
    public Us_core_immunizationBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param route - The path by which the vaccine product is taken into the body. */
    public Us_core_immunizationBuilder.Impl withRoute(@NonNull CodeableConcept route) {
      this.route = Optional.of(route);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withRoute(@NonNull CodeableConceptBuilder route) {
      this.route = Optional.of(route.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public Us_core_immunizationBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param recorded - The date the occurrence of the immunization was first captured in the
     *     record - potentially significantly after the occurrence of the event.
     */
    public Us_core_immunizationBuilder.Impl withRecorded(@NonNull FHIRDateTime recorded) {
      this.recorded = Optional.of(recorded);
      return this;
    }
    /**
     * @param location - The service delivery location where the vaccine administration occurred.
     */
    public Us_core_immunizationBuilder.Impl withLocation(@NonNull Reference location) {
      this.location = Optional.of(location);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withLocation(@NonNull ReferenceBuilder location) {
      this.location = Optional.of(location.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_immunizationBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_immunizationBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public Us_core_immunizationBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Us_core_immunizationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - The visit or admission or other contact between patient and health care
     *     provider the immunization was performed as part of.
     */
    public Us_core_immunizationBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /** @param lotNumber - Lot number of the vaccine product. */
    public Us_core_immunizationBuilder.Impl withLotNumber(@NonNull String lotNumber) {
      this.lotNumber = Optional.of(lotNumber);
      return this;
    }
    /** @param identifier - A unique identifier assigned to this immunization record. */
    public Us_core_immunizationBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - A unique identifier assigned to this immunization record. */
    public Us_core_immunizationBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param reasonCode - Reasons why the vaccine was administered. */
    public Us_core_immunizationBuilder.Impl withReasonCode(@NonNull CodeableConcept... reasonCode) {
      this.reasonCode = Arrays.asList(reasonCode);
      return this;
    }
    /** @param reasonCode - Reasons why the vaccine was administered. */
    public Us_core_immunizationBuilder.Impl withReasonCode(
        @NonNull Collection<CodeableConcept> reasonCode) {
      this.reasonCode = Collections.unmodifiableCollection(reasonCode);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withReasonCode(
        @NonNull CodeableConceptBuilder... reasonCode) {
      this.reasonCode = Arrays.stream(reasonCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param isSubpotent - Indication if a dose is considered to be subpotent. By default, a dose
     *     should be considered to be potent.
     */
    public Us_core_immunizationBuilder.Impl withIsSubpotent(@NonNull Boolean isSubpotent) {
      this.isSubpotent = Optional.of(isSubpotent);
      return this;
    }
    /** @param statusReason - Indicates the reason the immunization event was not performed. */
    public Us_core_immunizationBuilder.Impl withStatusReason(
        @NonNull CodeableConcept statusReason) {
      this.statusReason = Optional.of(statusReason);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withStatusReason(
        @NonNull CodeableConceptBuilder statusReason) {
      this.statusReason = Optional.of(statusReason.build());
      return this;
    }
    /**
     * @param reportOrigin - The source of the data when the report of the immunization event is not
     *     based on information from the person who administered the vaccine.
     */
    public Us_core_immunizationBuilder.Impl withReportOrigin(
        @NonNull CodeableConcept reportOrigin) {
      this.reportOrigin = Optional.of(reportOrigin);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withReportOrigin(
        @NonNull CodeableConceptBuilder reportOrigin) {
      this.reportOrigin = Optional.of(reportOrigin.build());
      return this;
    }
    /** @param manufacturer - Name of vaccine manufacturer. */
    public Us_core_immunizationBuilder.Impl withManufacturer(@NonNull Reference manufacturer) {
      this.manufacturer = Optional.of(manufacturer);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withManufacturer(
        @NonNull ReferenceBuilder manufacturer) {
      this.manufacturer = Optional.of(manufacturer.build());
      return this;
    }
    /** @param doseQuantity - The quantity of vaccine product that was administered. */
    public Us_core_immunizationBuilder.Impl withDoseQuantity(@NonNull Quantity doseQuantity) {
      this.doseQuantity = Optional.of(doseQuantity);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withDoseQuantity(
        @NonNull QuantityBuilder doseQuantity) {
      this.doseQuantity = Optional.of(doseQuantity.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public Us_core_immunizationBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param fundingSource - Indicates the source of the vaccine actually administered. This may be
     *     different than the patient eligibility (e.g. the patient may be eligible for a publically
     *     purchased vaccine but due to inventory issues, vaccine purchased with private funds was
     *     actually administered).
     */
    public Us_core_immunizationBuilder.Impl withFundingSource(
        @NonNull CodeableConcept fundingSource) {
      this.fundingSource = Optional.of(fundingSource);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withFundingSource(
        @NonNull CodeableConceptBuilder fundingSource) {
      this.fundingSource = Optional.of(fundingSource.build());
      return this;
    }
    /** @param expirationDate - Date vaccine batch expires. */
    public Us_core_immunizationBuilder.Impl withExpirationDate(@NonNull FHIRDate expirationDate) {
      this.expirationDate = Optional.of(expirationDate);
      return this;
    }
    /**
     * @param reasonReference - Condition, Observation or DiagnosticReport that supports why the
     *     immunization was administered.
     */
    public Us_core_immunizationBuilder.Impl withReasonReference(
        @NonNull Reference... reasonReference) {
      this.reasonReference = Arrays.asList(reasonReference);
      return this;
    }
    /**
     * @param reasonReference - Condition, Observation or DiagnosticReport that supports why the
     *     immunization was administered.
     */
    public Us_core_immunizationBuilder.Impl withReasonReference(
        @NonNull Collection<Reference> reasonReference) {
      this.reasonReference = Collections.unmodifiableCollection(reasonReference);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withReasonReference(
        @NonNull ReferenceBuilder... reasonReference) {
      this.reasonReference = Arrays.stream(reasonReference).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param subpotentReason - Reason why a dose is considered to be subpotent. */
    public Us_core_immunizationBuilder.Impl withSubpotentReason(
        @NonNull CodeableConcept... subpotentReason) {
      this.subpotentReason = Arrays.asList(subpotentReason);
      return this;
    }
    /** @param subpotentReason - Reason why a dose is considered to be subpotent. */
    public Us_core_immunizationBuilder.Impl withSubpotentReason(
        @NonNull Collection<CodeableConcept> subpotentReason) {
      this.subpotentReason = Collections.unmodifiableCollection(subpotentReason);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withSubpotentReason(
        @NonNull CodeableConceptBuilder... subpotentReason) {
      this.subpotentReason = Arrays.stream(subpotentReason).map(e -> e.build()).collect(toList());
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
    public Us_core_immunizationBuilder.Impl withModifierExtension(
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
    public Us_core_immunizationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param programEligibility - Indicates a patient's eligibility for a funding program. */
    public Us_core_immunizationBuilder.Impl withProgramEligibility(
        @NonNull CodeableConcept... programEligibility) {
      this.programEligibility = Arrays.asList(programEligibility);
      return this;
    }
    /** @param programEligibility - Indicates a patient's eligibility for a funding program. */
    public Us_core_immunizationBuilder.Impl withProgramEligibility(
        @NonNull Collection<CodeableConcept> programEligibility) {
      this.programEligibility = Collections.unmodifiableCollection(programEligibility);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withProgramEligibility(
        @NonNull CodeableConceptBuilder... programEligibility) {
      this.programEligibility =
          Arrays.stream(programEligibility).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param reaction - Categorical data indicating that an adverse event is associated in time to
     *     an immunization.
     */
    public Us_core_immunizationBuilder.Impl withReaction(
        @NonNull Immunization.Reaction... reaction) {
      this.reaction = Arrays.asList(reaction);
      return this;
    }
    /**
     * @param reaction - Categorical data indicating that an adverse event is associated in time to
     *     an immunization.
     */
    public Us_core_immunizationBuilder.Impl withReaction(
        @NonNull Collection<Immunization.Reaction> reaction) {
      this.reaction = Collections.unmodifiableCollection(reaction);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withReaction(
        @NonNull Immunization_ReactionBuilder... reaction) {
      this.reaction = Arrays.stream(reaction).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param performer - Indicates who performed the immunization event. */
    public Us_core_immunizationBuilder.Impl withPerformer(
        @NonNull Immunization.Performer... performer) {
      this.performer = Arrays.asList(performer);
      return this;
    }
    /** @param performer - Indicates who performed the immunization event. */
    public Us_core_immunizationBuilder.Impl withPerformer(
        @NonNull Collection<Immunization.Performer> performer) {
      this.performer = Collections.unmodifiableCollection(performer);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withPerformer(
        @NonNull Immunization_PerformerBuilder... performer) {
      this.performer = Arrays.stream(performer).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param education - Educational material presented to the patient (or guardian) at the time of
     *     vaccine administration.
     */
    public Us_core_immunizationBuilder.Impl withEducation(
        @NonNull Immunization.Education... education) {
      this.education = Arrays.asList(education);
      return this;
    }
    /**
     * @param education - Educational material presented to the patient (or guardian) at the time of
     *     vaccine administration.
     */
    public Us_core_immunizationBuilder.Impl withEducation(
        @NonNull Collection<Immunization.Education> education) {
      this.education = Collections.unmodifiableCollection(education);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withEducation(
        @NonNull Immunization_EducationBuilder... education) {
      this.education = Arrays.stream(education).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param protocolApplied - The protocol (set of recommendations) being followed by the provider
     *     who administered the dose.
     */
    public Us_core_immunizationBuilder.Impl withProtocolApplied(
        @NonNull Immunization.ProtocolApplied... protocolApplied) {
      this.protocolApplied = Arrays.asList(protocolApplied);
      return this;
    }
    /**
     * @param protocolApplied - The protocol (set of recommendations) being followed by the provider
     *     who administered the dose.
     */
    public Us_core_immunizationBuilder.Impl withProtocolApplied(
        @NonNull Collection<Immunization.ProtocolApplied> protocolApplied) {
      this.protocolApplied = Collections.unmodifiableCollection(protocolApplied);
      return this;
    }

    public Us_core_immunizationBuilder.Impl withProtocolApplied(
        @NonNull Immunization_ProtocolAppliedBuilder... protocolApplied) {
      this.protocolApplied = Arrays.stream(protocolApplied).map(e -> e.build()).collect(toList());
      return this;
    }

    public Us_core_immunizationBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Us_core_immunization build() {
      return new Us_core_immunization(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(site),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(route),
          status,
          patient,
          OptionConverters.toScala(language),
          OptionConverters.toScala(recorded),
          OptionConverters.toScala(location),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          OptionConverters.toScala(lotNumber),
          identifier.stream().collect(new LitSeqJCollector<>()),
          reasonCode.stream().collect(new LitSeqJCollector<>()),
          vaccineCode,
          OptionConverters.toScala(isSubpotent.map(x -> (Object) x)),
          OptionConverters.toScala(statusReason),
          OptionConverters.toScala(reportOrigin),
          OptionConverters.toScala(manufacturer),
          OptionConverters.toScala(doseQuantity),
          OptionConverters.toScala(implicitRules),
          occurrence,
          primarySource,
          OptionConverters.toScala(fundingSource),
          OptionConverters.toScala(expirationDate),
          reasonReference.stream().collect(new LitSeqJCollector<>()),
          subpotentReason.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          programEligibility.stream().collect(new LitSeqJCollector<>()),
          reaction.stream().collect(new LitSeqJCollector<>()),
          performer.stream().collect(new LitSeqJCollector<>()),
          education.stream().collect(new LitSeqJCollector<>()),
          protocolApplied.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
