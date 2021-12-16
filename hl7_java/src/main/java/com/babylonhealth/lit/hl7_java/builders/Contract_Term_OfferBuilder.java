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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Contract_Term_OfferBuilder {
  public Contract$Term$Offer build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Contract_Term_OfferBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<String> text = Optional.empty();
    private Optional<Reference> topic = Optional.empty();
    private Collection<String> linkId = Collections.emptyList();
    private Optional<CodeableConcept> decision = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<CodeableConcept> decisionMode = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Integer> securityLabelNumber = Collections.emptyList();
    private Collection<Contract$Term$Offer$Party> party = Collections.emptyList();
    private Collection<Contract$Term$Offer$Answer> answer = Collections.emptyList();

    /** Required fields for {@link Contract$Term$Offer} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Contract_Term_OfferBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param _type - A high-level category for the legal instrument, whether constructed as a
     *     Contract definition, derivative, or instance in any legal state. Provides additional
     *     information about its content within the context of the Contract's scope to distinguish
     *     the kinds of systems that would be interested in the contract.
     */
    public Contract_Term_OfferBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public Contract_Term_OfferBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public Contract_Term_OfferBuilder.Impl withText(@NonNull String text) {
      this.text = Optional.of(text);
      return this;
    }
    /**
     * @param topic - Narrows the range of legal concerns to focus on the achievement of specific
     *     contractual objectives.
     */
    public Contract_Term_OfferBuilder.Impl withTopic(@NonNull Reference topic) {
      this.topic = Optional.of(topic);
      return this;
    }

    public Contract_Term_OfferBuilder.Impl withTopic(@NonNull ReferenceBuilder topic) {
      this.topic = Optional.of(topic.build());
      return this;
    }
    /** @param linkId */
    public Contract_Term_OfferBuilder.Impl withLinkId(@NonNull String... linkId) {
      this.linkId = Arrays.asList(linkId);
      return this;
    }
    /** @param linkId */
    public Contract_Term_OfferBuilder.Impl withLinkId(@NonNull Collection<String> linkId) {
      this.linkId = Collections.unmodifiableCollection(linkId);
      return this;
    }
    /** @param decision */
    public Contract_Term_OfferBuilder.Impl withDecision(@NonNull CodeableConcept decision) {
      this.decision = Optional.of(decision);
      return this;
    }

    public Contract_Term_OfferBuilder.Impl withDecision(@NonNull CodeableConceptBuilder decision) {
      this.decision = Optional.of(decision.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Contract_Term_OfferBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Contract_Term_OfferBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Contract_Term_OfferBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Unique identifier for this Contract or a derivative that references a
     *     Source Contract.
     */
    public Contract_Term_OfferBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Unique identifier for this Contract or a derivative that references a
     *     Source Contract.
     */
    public Contract_Term_OfferBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public Contract_Term_OfferBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param decisionMode */
    public Contract_Term_OfferBuilder.Impl withDecisionMode(
        @NonNull CodeableConcept... decisionMode) {
      this.decisionMode = Arrays.asList(decisionMode);
      return this;
    }
    /** @param decisionMode */
    public Contract_Term_OfferBuilder.Impl withDecisionMode(
        @NonNull Collection<CodeableConcept> decisionMode) {
      this.decisionMode = Collections.unmodifiableCollection(decisionMode);
      return this;
    }

    public Contract_Term_OfferBuilder.Impl withDecisionMode(
        @NonNull CodeableConceptBuilder... decisionMode) {
      this.decisionMode = Arrays.stream(decisionMode).map(e -> e.build()).collect(toList());
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
    public Contract_Term_OfferBuilder.Impl withModifierExtension(
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
    public Contract_Term_OfferBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Contract_Term_OfferBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param securityLabelNumber */
    public Contract_Term_OfferBuilder.Impl withSecurityLabelNumber(
        @NonNull Integer... securityLabelNumber) {
      this.securityLabelNumber = Arrays.asList(securityLabelNumber);
      return this;
    }
    /** @param securityLabelNumber */
    public Contract_Term_OfferBuilder.Impl withSecurityLabelNumber(
        @NonNull Collection<Integer> securityLabelNumber) {
      this.securityLabelNumber = Collections.unmodifiableCollection(securityLabelNumber);
      return this;
    }
    /** @param party */
    public Contract_Term_OfferBuilder.Impl withParty(@NonNull Contract$Term$Offer$Party... party) {
      this.party = Arrays.asList(party);
      return this;
    }
    /** @param party */
    public Contract_Term_OfferBuilder.Impl withParty(
        @NonNull Collection<Contract$Term$Offer$Party> party) {
      this.party = Collections.unmodifiableCollection(party);
      return this;
    }

    public Contract_Term_OfferBuilder.Impl withParty(
        @NonNull Contract_Term_Offer_PartyBuilder... party) {
      this.party = Arrays.stream(party).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param answer */
    public Contract_Term_OfferBuilder.Impl withAnswer(
        @NonNull Contract$Term$Offer$Answer... answer) {
      this.answer = Arrays.asList(answer);
      return this;
    }
    /** @param answer */
    public Contract_Term_OfferBuilder.Impl withAnswer(
        @NonNull Collection<Contract$Term$Offer$Answer> answer) {
      this.answer = Collections.unmodifiableCollection(answer);
      return this;
    }

    public Contract_Term_OfferBuilder.Impl withAnswer(
        @NonNull Contract_Term_Offer_AnswerBuilder... answer) {
      this.answer = Arrays.stream(answer).map(e -> e.build()).collect(toList());
      return this;
    }

    public Contract$Term$Offer build() {
      return new Contract$Term$Offer(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(text),
          OptionConverters.toScala(topic),
          linkId.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(decision),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          decisionMode.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          securityLabelNumber.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          party.stream().collect(new LitSeqJCollector<>()),
          answer.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
