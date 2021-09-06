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

public interface Ehrsrle_provenanceBuilder extends ProvenanceBuilder {
  public Ehrsrle_provenance build();

  public static Impl init(
      Collection<Reference> target, ZonedDateTime recorded, Collection<Provenance.Agent> agent) {
    return new Impl(target, recorded, agent);
  }

  public static Impl builder(
      Collection<ReferenceBuilder> target,
      ZonedDateTime recorded,
      Collection<Provenance_AgentBuilder> agent) {
    return new Impl(
        new LitSeq<>(target).map(ReferenceBuilder::build),
        recorded,
        new LitSeq<>(agent).map(Provenance_AgentBuilder::build));
  }

  public static ChoiceFHIRDateTimeOrPeriod occurred(FHIRDateTime f) {
    return new ChoiceFHIRDateTimeOrPeriod(f);
  }

  public static ChoiceFHIRDateTimeOrPeriod occurred(Period p) {
    return new ChoiceFHIRDateTimeOrPeriod(p);
  }

  public class Impl implements Ehrsrle_provenanceBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("http://hl7.org/fhir/StructureDefinition/ehrsrle-provenance")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private Collection<Reference> target;
    private Collection<String> policy = Collections.emptyList();
    private Collection<CodeableConcept> reason = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private ZonedDateTime recorded;
    private Optional<Reference> location = Optional.empty();
    private Optional<CodeableConcept> activity = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Signature> signature = Collections.emptyList();
    private Optional<ChoiceFHIRDateTimeOrPeriod> occurred = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Provenance.Agent> agent;
    private Collection<Provenance.Entity> entity = Collections.emptyList();

    /**
     * Required fields for {@link Ehrsrle_provenance}
     *
     * @param target - The Reference(s) that were generated or updated by the activity described in
     *     this resource. A provenance can point to more than one target if multiple resources were
     *     created/updated by the same activity.
     * @param recorded - The instant of time at which the activity was recorded.
     * @param agent - An actor taking a role in an activity for which it can be assigned some degree
     *     of responsibility for the activity taking place.
     */
    public Impl(
        Collection<Reference> target, ZonedDateTime recorded, Collection<Provenance.Agent> agent) {
      this.target = target;
      this.recorded = recorded;
      this.agent = agent;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Ehrsrle_provenanceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public Ehrsrle_provenanceBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public Ehrsrle_provenanceBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public Ehrsrle_provenanceBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public Ehrsrle_provenanceBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param policy - Policy or plan the activity was defined by. Typically, a single activity may
     *     have multiple applicable policy documents, such as patient consent, guarantor funding,
     *     etc.
     */
    public Ehrsrle_provenanceBuilder.Impl withPolicy(@NonNull String... policy) {
      this.policy = Arrays.asList(policy);
      return this;
    }
    /**
     * @param policy - Policy or plan the activity was defined by. Typically, a single activity may
     *     have multiple applicable policy documents, such as patient consent, guarantor funding,
     *     etc.
     */
    public Ehrsrle_provenanceBuilder.Impl withPolicy(@NonNull Collection<String> policy) {
      this.policy = Collections.unmodifiableCollection(policy);
      return this;
    }
    /** @param reason - The reason that the activity was taking place. */
    public Ehrsrle_provenanceBuilder.Impl withReason(@NonNull CodeableConcept... reason) {
      this.reason = Arrays.asList(reason);
      return this;
    }
    /** @param reason - The reason that the activity was taking place. */
    public Ehrsrle_provenanceBuilder.Impl withReason(@NonNull Collection<CodeableConcept> reason) {
      this.reason = Collections.unmodifiableCollection(reason);
      return this;
    }

    public Ehrsrle_provenanceBuilder.Impl withReason(@NonNull CodeableConceptBuilder... reason) {
      this.reason = Arrays.stream(reason).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public Ehrsrle_provenanceBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param location - Where the activity occurred, if relevant. */
    public Ehrsrle_provenanceBuilder.Impl withLocation(@NonNull Reference location) {
      this.location = Optional.of(location);
      return this;
    }

    public Ehrsrle_provenanceBuilder.Impl withLocation(@NonNull ReferenceBuilder location) {
      this.location = Optional.of(location.build());
      return this;
    }
    /**
     * @param activity - An activity is something that occurs over a period of time and acts upon or
     *     with entities; it may include consuming, processing, transforming, modifying, relocating,
     *     using, or generating entities.
     */
    public Ehrsrle_provenanceBuilder.Impl withActivity(@NonNull CodeableConcept activity) {
      this.activity = Optional.of(activity);
      return this;
    }

    public Ehrsrle_provenanceBuilder.Impl withActivity(@NonNull CodeableConceptBuilder activity) {
      this.activity = Optional.of(activity.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Ehrsrle_provenanceBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public Ehrsrle_provenanceBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public Ehrsrle_provenanceBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public Ehrsrle_provenanceBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Ehrsrle_provenanceBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Ehrsrle_provenanceBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param signature - A digital signature on the target Reference(s). The signer should match a
     *     Provenance.agent. The purpose of the signature is indicated.
     */
    public Ehrsrle_provenanceBuilder.Impl withSignature(@NonNull Signature... signature) {
      this.signature = Arrays.asList(signature);
      return this;
    }
    /**
     * @param signature - A digital signature on the target Reference(s). The signer should match a
     *     Provenance.agent. The purpose of the signature is indicated.
     */
    public Ehrsrle_provenanceBuilder.Impl withSignature(@NonNull Collection<Signature> signature) {
      this.signature = Collections.unmodifiableCollection(signature);
      return this;
    }

    public Ehrsrle_provenanceBuilder.Impl withSignature(@NonNull SignatureBuilder... signature) {
      this.signature = Arrays.stream(signature).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param occurred - The period during which the activity occurred. Field is a 'choice' field.
     *     Type should be one of FHIRDateTime, Period. To pass the value in, wrap with one of the
     *     Ehrsrle_provenanceBuilder.occurred static methods
     */
    public Ehrsrle_provenanceBuilder.Impl withOccurred(
        @NonNull ChoiceFHIRDateTimeOrPeriod occurred) {
      this.occurred = Optional.of(occurred);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public Ehrsrle_provenanceBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
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
    public Ehrsrle_provenanceBuilder.Impl withModifierExtension(
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
    public Ehrsrle_provenanceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Ehrsrle_provenanceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param entity - An entity used in this activity. */
    public Ehrsrle_provenanceBuilder.Impl withEntity(@NonNull Provenance.Entity... entity) {
      this.entity = Arrays.asList(entity);
      return this;
    }
    /** @param entity - An entity used in this activity. */
    public Ehrsrle_provenanceBuilder.Impl withEntity(
        @NonNull Collection<Provenance.Entity> entity) {
      this.entity = Collections.unmodifiableCollection(entity);
      return this;
    }

    public Ehrsrle_provenanceBuilder.Impl withEntity(@NonNull Provenance_EntityBuilder... entity) {
      this.entity = Arrays.stream(entity).map(e -> e.build()).collect(toList());
      return this;
    }

    public Ehrsrle_provenanceBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Ehrsrle_provenance build() {
      return new Ehrsrle_provenance(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          target.stream().collect(new NonEmptyLitSeqJCollector<>()),
          policy.stream().collect(new LitSeqJCollector<>()),
          reason.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          recorded,
          OptionConverters.toScala(location),
          OptionConverters.toScala(activity),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          signature.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(occurred),
          OptionConverters.toScala(implicitRules),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          agent.stream().collect(new NonEmptyLitSeqJCollector<>()),
          entity.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
