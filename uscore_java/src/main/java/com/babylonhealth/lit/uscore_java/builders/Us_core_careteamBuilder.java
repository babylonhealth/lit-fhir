package com.babylonhealth.lit.uscore_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.CARE_TEAM_STATUS;
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

public interface Us_core_careteamBuilder extends CareTeamBuilder {
  public Us_core_careteam build();

  public static Impl init(Reference subject, Collection<CareTeam.Participant> participant) {
    return new Impl(subject, participant);
  }

  public static Impl builder(
      ReferenceBuilder subject, Collection<CareTeam_ParticipantBuilder> participant) {
    return new Impl(
        subject.build(), new LitSeq<>(participant).map(CareTeam_ParticipantBuilder::build));
  }

  public class Impl implements Us_core_careteamBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-careteam")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<CARE_TEAM_STATUS> status = Optional.empty();
    private Optional<Period> period = Optional.empty();
    private Reference subject;
    private Collection<ContactPoint> telecom = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<CodeableConcept> reasonCode = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Reference> reasonReference = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Reference> managingOrganization = Collections.emptyList();
    private Collection<CareTeam.Participant> participant;

    /**
     * Required fields for {@link Us_core_careteam}
     *
     * @param subject - Identifies the patient or group whose intended care is handled by the team.
     * @param participant - Identifies all people and organizations who are expected to be involved
     *     in the care team.
     */
    public Impl(Reference subject, Collection<CareTeam.Participant> participant) {
      this.subject = subject;
      this.participant = participant;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Us_core_careteamBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public Us_core_careteamBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public Us_core_careteamBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public Us_core_careteamBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public Us_core_careteamBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param name - A label for human use intended to distinguish like teams. E.g. the "red" vs.
     *     "green" trauma teams.
     */
    public Us_core_careteamBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /** @param note - Comments made about the CareTeam. */
    public Us_core_careteamBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - Comments made about the CareTeam. */
    public Us_core_careteamBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public Us_core_careteamBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param status - Indicates the current state of the care team. */
    public Us_core_careteamBuilder.Impl withStatus(@NonNull CARE_TEAM_STATUS status) {
      this.status = Optional.of(status);
      return this;
    }
    /** @param period - Indicates when the team did (or is intended to) come into effect and end. */
    public Us_core_careteamBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public Us_core_careteamBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /**
     * @param telecom - A central contact detail for the care team (that applies to all members).
     */
    public Us_core_careteamBuilder.Impl withTelecom(@NonNull ContactPoint... telecom) {
      this.telecom = Arrays.asList(telecom);
      return this;
    }
    /**
     * @param telecom - A central contact detail for the care team (that applies to all members).
     */
    public Us_core_careteamBuilder.Impl withTelecom(@NonNull Collection<ContactPoint> telecom) {
      this.telecom = Collections.unmodifiableCollection(telecom);
      return this;
    }

    public Us_core_careteamBuilder.Impl withTelecom(@NonNull ContactPointBuilder... telecom) {
      this.telecom = Arrays.stream(telecom).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public Us_core_careteamBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param category - Identifies what kind of team. This is to support differentiation between
     *     multiple co-existing teams, such as care plan team, episode of care team, longitudinal
     *     care team.
     */
    public Us_core_careteamBuilder.Impl withCategory(@NonNull CodeableConcept... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /**
     * @param category - Identifies what kind of team. This is to support differentiation between
     *     multiple co-existing teams, such as care plan team, episode of care team, longitudinal
     *     care team.
     */
    public Us_core_careteamBuilder.Impl withCategory(
        @NonNull Collection<CodeableConcept> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }

    public Us_core_careteamBuilder.Impl withCategory(@NonNull CodeableConceptBuilder... category) {
      this.category = Arrays.stream(category).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_careteamBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Us_core_careteamBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public Us_core_careteamBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public Us_core_careteamBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Us_core_careteamBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Us_core_careteamBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - The Encounter during which this CareTeam was created or to which the
     *     creation of this record is tightly associated.
     */
    public Us_core_careteamBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public Us_core_careteamBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this care team by the performer or other
     *     systems which remain constant as the resource is updated and propagates from server to
     *     server.
     */
    public Us_core_careteamBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this care team by the performer or other
     *     systems which remain constant as the resource is updated and propagates from server to
     *     server.
     */
    public Us_core_careteamBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public Us_core_careteamBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param reasonCode - Describes why the care team exists. */
    public Us_core_careteamBuilder.Impl withReasonCode(@NonNull CodeableConcept... reasonCode) {
      this.reasonCode = Arrays.asList(reasonCode);
      return this;
    }
    /** @param reasonCode - Describes why the care team exists. */
    public Us_core_careteamBuilder.Impl withReasonCode(
        @NonNull Collection<CodeableConcept> reasonCode) {
      this.reasonCode = Collections.unmodifiableCollection(reasonCode);
      return this;
    }

    public Us_core_careteamBuilder.Impl withReasonCode(
        @NonNull CodeableConceptBuilder... reasonCode) {
      this.reasonCode = Arrays.stream(reasonCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public Us_core_careteamBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param reasonReference - Condition(s) that this care team addresses. */
    public Us_core_careteamBuilder.Impl withReasonReference(@NonNull Reference... reasonReference) {
      this.reasonReference = Arrays.asList(reasonReference);
      return this;
    }
    /** @param reasonReference - Condition(s) that this care team addresses. */
    public Us_core_careteamBuilder.Impl withReasonReference(
        @NonNull Collection<Reference> reasonReference) {
      this.reasonReference = Collections.unmodifiableCollection(reasonReference);
      return this;
    }

    public Us_core_careteamBuilder.Impl withReasonReference(
        @NonNull ReferenceBuilder... reasonReference) {
      this.reasonReference = Arrays.stream(reasonReference).map(e -> e.build()).collect(toList());
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
    public Us_core_careteamBuilder.Impl withModifierExtension(
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
    public Us_core_careteamBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Us_core_careteamBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param managingOrganization - The organization responsible for the care team. */
    public Us_core_careteamBuilder.Impl withManagingOrganization(
        @NonNull Reference... managingOrganization) {
      this.managingOrganization = Arrays.asList(managingOrganization);
      return this;
    }
    /** @param managingOrganization - The organization responsible for the care team. */
    public Us_core_careteamBuilder.Impl withManagingOrganization(
        @NonNull Collection<Reference> managingOrganization) {
      this.managingOrganization = Collections.unmodifiableCollection(managingOrganization);
      return this;
    }

    public Us_core_careteamBuilder.Impl withManagingOrganization(
        @NonNull ReferenceBuilder... managingOrganization) {
      this.managingOrganization =
          Arrays.stream(managingOrganization).map(e -> e.build()).collect(toList());
      return this;
    }

    public Us_core_careteamBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Us_core_careteam build() {
      return new Us_core_careteam(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(name),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(status),
          OptionConverters.toScala(period),
          subject,
          telecom.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          category.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          identifier.stream().collect(new LitSeqJCollector<>()),
          reasonCode.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          reasonReference.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          managingOrganization.stream().collect(new LitSeqJCollector<>()),
          participant.stream().collect(new NonEmptyLitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
