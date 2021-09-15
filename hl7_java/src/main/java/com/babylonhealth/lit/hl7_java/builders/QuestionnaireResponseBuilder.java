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
import com.babylonhealth.lit.hl7.QUESTIONNAIRE_ANSWERS_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface QuestionnaireResponseBuilder extends DomainResourceBuilder {
  public QuestionnaireResponse build();

  public static Impl init(QUESTIONNAIRE_ANSWERS_STATUS status) {
    return new Impl(status);
  }

  public static Impl builder(QUESTIONNAIRE_ANSWERS_STATUS status) {
    return new Impl(status);
  }

  public class Impl implements QuestionnaireResponseBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<Reference> partOf = Collections.emptyList();
    private QUESTIONNAIRE_ANSWERS_STATUS status;
    private Optional<Reference> author = Optional.empty();
    private Optional<Reference> source = Optional.empty();
    private Collection<Reference> basedOn = Collections.emptyList();
    private Optional<Reference> subject = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<FHIRDateTime> authored = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Optional<Identifier> identifier = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<String> questionnaire = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<QuestionnaireResponse.Item> item = Collections.emptyList();

    /**
     * Required fields for {@link QuestionnaireResponse}
     *
     * @param status - The position of the questionnaire response within its overall lifecycle.
     */
    public Impl(QUESTIONNAIRE_ANSWERS_STATUS status) {
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public QuestionnaireResponseBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public QuestionnaireResponseBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public QuestionnaireResponseBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public QuestionnaireResponseBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public QuestionnaireResponseBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param partOf - A procedure or observation that this questionnaire was performed as part of
     *     the execution of. For example, the surgery a checklist was executed as part of.
     */
    public QuestionnaireResponseBuilder.Impl withPartOf(@NonNull Reference... partOf) {
      this.partOf = Arrays.asList(partOf);
      return this;
    }
    /**
     * @param partOf - A procedure or observation that this questionnaire was performed as part of
     *     the execution of. For example, the surgery a checklist was executed as part of.
     */
    public QuestionnaireResponseBuilder.Impl withPartOf(@NonNull Collection<Reference> partOf) {
      this.partOf = Collections.unmodifiableCollection(partOf);
      return this;
    }

    public QuestionnaireResponseBuilder.Impl withPartOf(@NonNull ReferenceBuilder... partOf) {
      this.partOf = Arrays.stream(partOf).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param author - Person who received the answers to the questions in the QuestionnaireResponse
     *     and recorded them in the system.
     */
    public QuestionnaireResponseBuilder.Impl withAuthor(@NonNull Reference author) {
      this.author = Optional.of(author);
      return this;
    }

    public QuestionnaireResponseBuilder.Impl withAuthor(@NonNull ReferenceBuilder author) {
      this.author = Optional.of(author.build());
      return this;
    }
    /** @param source - The person who answered the questions about the subject. */
    public QuestionnaireResponseBuilder.Impl withSource(@NonNull Reference source) {
      this.source = Optional.of(source);
      return this;
    }

    public QuestionnaireResponseBuilder.Impl withSource(@NonNull ReferenceBuilder source) {
      this.source = Optional.of(source.build());
      return this;
    }
    /**
     * @param basedOn - The order, proposal or plan that is fulfilled in whole or in part by this
     *     QuestionnaireResponse. For example, a ServiceRequest seeking an intake assessment or a
     *     decision support recommendation to assess for post-partum depression.
     */
    public QuestionnaireResponseBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /**
     * @param basedOn - The order, proposal or plan that is fulfilled in whole or in part by this
     *     QuestionnaireResponse. For example, a ServiceRequest seeking an intake assessment or a
     *     decision support recommendation to assess for post-partum depression.
     */
    public QuestionnaireResponseBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public QuestionnaireResponseBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param subject - The subject of the questionnaire response. This could be a patient,
     *     organization, practitioner, device, etc. This is who/what the answers apply to, but is
     *     not necessarily the source of information.
     */
    public QuestionnaireResponseBuilder.Impl withSubject(@NonNull Reference subject) {
      this.subject = Optional.of(subject);
      return this;
    }

    public QuestionnaireResponseBuilder.Impl withSubject(@NonNull ReferenceBuilder subject) {
      this.subject = Optional.of(subject.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public QuestionnaireResponseBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param authored - The date and/or time that this set of answers were last changed. */
    public QuestionnaireResponseBuilder.Impl withAuthored(@NonNull FHIRDateTime authored) {
      this.authored = Optional.of(authored);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public QuestionnaireResponseBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public QuestionnaireResponseBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public QuestionnaireResponseBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public QuestionnaireResponseBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public QuestionnaireResponseBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public QuestionnaireResponseBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - The Encounter during which this questionnaire response was created or to
     *     which the creation of this record is tightly associated.
     */
    public QuestionnaireResponseBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public QuestionnaireResponseBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /**
     * @param identifier - A business identifier assigned to a particular completed (or partially
     *     completed) questionnaire.
     */
    public QuestionnaireResponseBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public QuestionnaireResponseBuilder.Impl withIdentifier(@NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public QuestionnaireResponseBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param questionnaire - The Questionnaire that defines and organizes the questions for which
     *     answers are being provided.
     */
    public QuestionnaireResponseBuilder.Impl withQuestionnaire(@NonNull String questionnaire) {
      this.questionnaire = Optional.of(questionnaire);
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
    public QuestionnaireResponseBuilder.Impl withModifierExtension(
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
    public QuestionnaireResponseBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public QuestionnaireResponseBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param item - A group or question item from the original questionnaire for which answers are
     *     provided.
     */
    public QuestionnaireResponseBuilder.Impl withItem(@NonNull QuestionnaireResponse.Item... item) {
      this.item = Arrays.asList(item);
      return this;
    }
    /**
     * @param item - A group or question item from the original questionnaire for which answers are
     *     provided.
     */
    public QuestionnaireResponseBuilder.Impl withItem(
        @NonNull Collection<QuestionnaireResponse.Item> item) {
      this.item = Collections.unmodifiableCollection(item);
      return this;
    }

    public QuestionnaireResponseBuilder.Impl withItem(
        @NonNull QuestionnaireResponse_ItemBuilder... item) {
      this.item = Arrays.stream(item).map(e -> e.build()).collect(toList());
      return this;
    }

    public QuestionnaireResponseBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public QuestionnaireResponse build() {
      return new QuestionnaireResponse(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          partOf.stream().collect(new LitSeqJCollector<>()),
          status,
          OptionConverters.toScala(author),
          OptionConverters.toScala(source),
          basedOn.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(subject),
          OptionConverters.toScala(language),
          OptionConverters.toScala(authored),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          OptionConverters.toScala(identifier),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(questionnaire),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          item.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
