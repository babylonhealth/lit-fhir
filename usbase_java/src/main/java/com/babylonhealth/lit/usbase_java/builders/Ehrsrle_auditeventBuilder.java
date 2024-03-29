package com.babylonhealth.lit.usbase_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.AUDIT_EVENT_ACTION;
import com.babylonhealth.lit.hl7.AUDIT_EVENT_OUTCOME;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Ehrsrle_auditeventBuilder extends AuditEventBuilder {
  public Ehrsrle_auditevent build();

  public static Impl init(
      Coding _type,
      ZonedDateTime recorded,
      AuditEvent.Source source,
      Collection<AuditEvent.Agent> agent) {
    return new Impl(_type, recorded, source, agent);
  }

  public static Impl builder(
      CodingBuilder _type,
      ZonedDateTime recorded,
      AuditEvent_SourceBuilder source,
      Collection<AuditEvent_AgentBuilder> agent) {
    return new Impl(
        _type.build(),
        recorded,
        source.build(),
        new LitSeq<>(agent).map(AuditEvent_AgentBuilder::build));
  }

  public class Impl implements Ehrsrle_auditeventBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("http://hl7.org/fhir/StructureDefinition/ehrsrle-auditevent")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private Coding _type;
    private Optional<AUDIT_EVENT_ACTION> action = Optional.empty();
    private Optional<Period> period = Optional.empty();
    private Collection<Coding> subtype = Collections.emptyList();
    private Optional<AUDIT_EVENT_OUTCOME> outcome = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private ZonedDateTime recorded;
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> outcomeDesc = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<CodeableConcept> purposeOfEvent = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private AuditEvent.Source source;
    private Collection<AuditEvent.Agent> agent;
    private Collection<AuditEvent.Entity> entity = Collections.emptyList();

    /**
     * Required fields for {@link Ehrsrle_auditevent}
     *
     * @param _type - Identifier for a family of the event. For example, a menu item, program, rule,
     *     policy, function code, application name or URL. It identifies the performed function.
     * @param recorded - The time when the event was recorded.
     * @param source - The system that is reporting the event.
     * @param agent - An actor taking an active role in the event or activity that is logged.
     */
    public Impl(
        Coding _type,
        ZonedDateTime recorded,
        AuditEvent.Source source,
        Collection<AuditEvent.Agent> agent) {
      this._type = _type;
      this.recorded = recorded;
      this.source = source;
      this.agent = agent;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Ehrsrle_auditeventBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public Ehrsrle_auditeventBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public Ehrsrle_auditeventBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public Ehrsrle_auditeventBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public Ehrsrle_auditeventBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param action - Indicator for type of action performed during the event that generated the
     *     audit.
     */
    public Ehrsrle_auditeventBuilder.Impl withAction(@NonNull AUDIT_EVENT_ACTION action) {
      this.action = Optional.of(action);
      return this;
    }
    /** @param period - The period during which the activity occurred. */
    public Ehrsrle_auditeventBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public Ehrsrle_auditeventBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /** @param subtype - Identifier for the category of event. */
    public Ehrsrle_auditeventBuilder.Impl withSubtype(@NonNull Coding... subtype) {
      this.subtype = Arrays.asList(subtype);
      return this;
    }
    /** @param subtype - Identifier for the category of event. */
    public Ehrsrle_auditeventBuilder.Impl withSubtype(@NonNull Collection<Coding> subtype) {
      this.subtype = Collections.unmodifiableCollection(subtype);
      return this;
    }

    public Ehrsrle_auditeventBuilder.Impl withSubtype(@NonNull CodingBuilder... subtype) {
      this.subtype = Arrays.stream(subtype).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param outcome - Indicates whether the event succeeded or failed. */
    public Ehrsrle_auditeventBuilder.Impl withOutcome(@NonNull AUDIT_EVENT_OUTCOME outcome) {
      this.outcome = Optional.of(outcome);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public Ehrsrle_auditeventBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Ehrsrle_auditeventBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Ehrsrle_auditeventBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public Ehrsrle_auditeventBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public Ehrsrle_auditeventBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Ehrsrle_auditeventBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Ehrsrle_auditeventBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param outcomeDesc - A free text description of the outcome of the event. */
    public Ehrsrle_auditeventBuilder.Impl withOutcomeDesc(@NonNull String outcomeDesc) {
      this.outcomeDesc = Optional.of(outcomeDesc);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public Ehrsrle_auditeventBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param purposeOfEvent - The purposeOfUse (reason) that was used during the event being
     *     recorded.
     */
    public Ehrsrle_auditeventBuilder.Impl withPurposeOfEvent(
        @NonNull CodeableConcept... purposeOfEvent) {
      this.purposeOfEvent = Arrays.asList(purposeOfEvent);
      return this;
    }
    /**
     * @param purposeOfEvent - The purposeOfUse (reason) that was used during the event being
     *     recorded.
     */
    public Ehrsrle_auditeventBuilder.Impl withPurposeOfEvent(
        @NonNull Collection<CodeableConcept> purposeOfEvent) {
      this.purposeOfEvent = Collections.unmodifiableCollection(purposeOfEvent);
      return this;
    }

    public Ehrsrle_auditeventBuilder.Impl withPurposeOfEvent(
        @NonNull CodeableConceptBuilder... purposeOfEvent) {
      this.purposeOfEvent = Arrays.stream(purposeOfEvent).map(e -> e.build()).collect(toList());
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
    public Ehrsrle_auditeventBuilder.Impl withModifierExtension(
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
    public Ehrsrle_auditeventBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Ehrsrle_auditeventBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param entity - Specific instances of data or objects that have been accessed. */
    public Ehrsrle_auditeventBuilder.Impl withEntity(@NonNull AuditEvent.Entity... entity) {
      this.entity = Arrays.asList(entity);
      return this;
    }
    /** @param entity - Specific instances of data or objects that have been accessed. */
    public Ehrsrle_auditeventBuilder.Impl withEntity(
        @NonNull Collection<AuditEvent.Entity> entity) {
      this.entity = Collections.unmodifiableCollection(entity);
      return this;
    }

    public Ehrsrle_auditeventBuilder.Impl withEntity(@NonNull AuditEvent_EntityBuilder... entity) {
      this.entity = Arrays.stream(entity).map(e -> e.build()).collect(toList());
      return this;
    }

    public Ehrsrle_auditeventBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Ehrsrle_auditevent build() {
      return new Ehrsrle_auditevent(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          _type,
          OptionConverters.toScala(action),
          OptionConverters.toScala(period),
          subtype.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(outcome),
          OptionConverters.toScala(language),
          recorded,
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(outcomeDesc),
          OptionConverters.toScala(implicitRules),
          purposeOfEvent.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          source,
          agent.stream().collect(new NonEmptyLitSeqJCollector<>()),
          entity.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
