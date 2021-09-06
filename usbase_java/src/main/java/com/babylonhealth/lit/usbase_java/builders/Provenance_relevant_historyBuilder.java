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
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Provenance_relevant_historyBuilder extends ProvenanceBuilder {
  public Provenance_relevant_history build();

  public static Impl init(
      Collection<Reference> target,
      ZonedDateTime recorded,
      CodeableConcept activity,
      FHIRDateTime occurred,
      Collection<Provenance.Agent> agent) {
    return new Impl(target, recorded, activity, occurred, agent);
  }

  public class Impl implements Provenance_relevant_historyBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("http://hl7.org/fhir/StructureDefinition/provenance-relevant-history")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private Collection<Reference> target;
    private Collection<String> policy = Collections.emptyList();
    private Collection<CodeableConcept> reason = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private ZonedDateTime recorded;
    private Optional<Reference> location = Optional.empty();
    private CodeableConcept activity;
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Signature> signature = Collections.emptyList();
    private FHIRDateTime occurred;
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Provenance.Agent> agent;
    private Collection<Provenance.Entity> entity = Collections.emptyList();

    /**
     * Required fields for {@link Provenance_relevant_history}
     *
     * @param target - This points to the version of the resource that was created as a result of
     *     this historical record action. Typically only a single resource will be referenced, but
     *     if the same action is performed to multiple resources in the context of a transaction,
     *     some systems may link multiple resource instances.
     * @param recorded - The instant of time at which the activity was recorded.
     * @param activity - Indicates what action occurred to the referenced resource.
     * @param occurred - This indicates the time the resource action (creation, revision, deletion,
     *     etc.) occurred.
     * @param agent - Who was involved with change.
     */
    public Impl(
        Collection<Reference> target,
        ZonedDateTime recorded,
        CodeableConcept activity,
        FHIRDateTime occurred,
        Collection<Provenance.Agent> agent) {
      this.target = target;
      this.recorded = recorded;
      this.activity = activity;
      this.occurred = occurred;
      this.agent = agent;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Provenance_relevant_historyBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public Provenance_relevant_historyBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public Provenance_relevant_historyBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }
    /**
     * @param policy - Policy or plan the activity was defined by. Typically, a single activity may
     *     have multiple applicable policy documents, such as patient consent, guarantor funding,
     *     etc.
     */
    public Provenance_relevant_historyBuilder.Impl withPolicy(@NonNull String... policy) {
      this.policy = Arrays.asList(policy);
      return this;
    }
    /**
     * @param policy - Policy or plan the activity was defined by. Typically, a single activity may
     *     have multiple applicable policy documents, such as patient consent, guarantor funding,
     *     etc.
     */
    public Provenance_relevant_historyBuilder.Impl withPolicy(@NonNull Collection<String> policy) {
      this.policy = Collections.unmodifiableCollection(policy);
      return this;
    }
    /** @param reason - The reason that the activity was taking place. */
    public Provenance_relevant_historyBuilder.Impl withReason(@NonNull CodeableConcept... reason) {
      this.reason = Arrays.asList(reason);
      return this;
    }
    /** @param reason - The reason that the activity was taking place. */
    public Provenance_relevant_historyBuilder.Impl withReason(
        @NonNull Collection<CodeableConcept> reason) {
      this.reason = Collections.unmodifiableCollection(reason);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public Provenance_relevant_historyBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param location - Where the activity occurred, if relevant. */
    public Provenance_relevant_historyBuilder.Impl withLocation(@NonNull Reference location) {
      this.location = Optional.of(location);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Provenance_relevant_historyBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Provenance_relevant_historyBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Provenance_relevant_historyBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Provenance_relevant_historyBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param signature - A digital signature on the target Reference(s). The signer should match a
     *     Provenance.agent. The purpose of the signature is indicated.
     */
    public Provenance_relevant_historyBuilder.Impl withSignature(@NonNull Signature... signature) {
      this.signature = Arrays.asList(signature);
      return this;
    }
    /**
     * @param signature - A digital signature on the target Reference(s). The signer should match a
     *     Provenance.agent. The purpose of the signature is indicated.
     */
    public Provenance_relevant_historyBuilder.Impl withSignature(
        @NonNull Collection<Signature> signature) {
      this.signature = Collections.unmodifiableCollection(signature);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public Provenance_relevant_historyBuilder.Impl withImplicitRules(
        @NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
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
    public Provenance_relevant_historyBuilder.Impl withModifierExtension(
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
    public Provenance_relevant_historyBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /** @param entity - An entity used in this activity. */
    public Provenance_relevant_historyBuilder.Impl withEntity(
        @NonNull Provenance.Entity... entity) {
      this.entity = Arrays.asList(entity);
      return this;
    }
    /** @param entity - An entity used in this activity. */
    public Provenance_relevant_historyBuilder.Impl withEntity(
        @NonNull Collection<Provenance.Entity> entity) {
      this.entity = Collections.unmodifiableCollection(entity);
      return this;
    }

    public Provenance_relevant_historyBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Provenance_relevant_history build() {
      return new Provenance_relevant_history(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          target.stream().collect(new NonEmptyLitSeqJCollector<>()),
          policy.stream().collect(new LitSeqJCollector<>()),
          reason.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          recorded,
          OptionConverters.toScala(location),
          activity,
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          signature.stream().collect(new LitSeqJCollector<>()),
          occurred,
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          agent.stream().collect(new NonEmptyLitSeqJCollector<>()),
          entity.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
