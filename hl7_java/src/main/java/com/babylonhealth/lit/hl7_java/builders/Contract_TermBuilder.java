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

public interface Contract_TermBuilder {
  public Contract.Term build();

  public static Impl init(Contract$Term$Offer offer) {
    return new Impl(offer);
  }

  public static Impl builder(Contract_Term_OfferBuilder offer) {
    return new Impl(offer.build());
  }

  public static Choice01025009075 topic(CodeableConcept c) {
    return new Choice01025009075(c);
  }

  public static Choice01025009075 topic(Reference r) {
    return new Choice01025009075(r);
  }

  public class Impl implements Contract_TermBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<String> text = Optional.empty();
    private Collection<Contract.Term> group = Collections.emptyList();
    private Optional<FHIRDateTime> issued = Optional.empty();
    private Optional<Period> applies = Optional.empty();
    private Optional<CodeableConcept> subType = Optional.empty();
    private Optional<Choice01025009075> topic = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Identifier> identifier = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Contract$Term$Offer offer;
    private Collection<Contract$Term$SecurityLabel> securityLabel = Collections.emptyList();
    private Collection<Contract$Term$Action> action = Collections.emptyList();
    private Collection<Contract$Term$Asset> asset = Collections.emptyList();

    /**
     * Required fields for {@link Contract.Term}
     *
     * @param offer
     */
    public Impl(Contract$Term$Offer offer) {
      this.offer = offer;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Contract_TermBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param _type - A high-level category for the legal instrument, whether constructed as a
     *     Contract definition, derivative, or instance in any legal state. Provides additional
     *     information about its content within the context of the Contract's scope to distinguish
     *     the kinds of systems that would be interested in the contract.
     */
    public Contract_TermBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public Contract_TermBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
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
    public Contract_TermBuilder.Impl withText(@NonNull String text) {
      this.text = Optional.of(text);
      return this;
    }
    /** @param group */
    public Contract_TermBuilder.Impl withGroup(@NonNull Contract.Term... group) {
      this.group = Arrays.asList(group);
      return this;
    }
    /** @param group */
    public Contract_TermBuilder.Impl withGroup(@NonNull Collection<Contract.Term> group) {
      this.group = Collections.unmodifiableCollection(group);
      return this;
    }

    public Contract_TermBuilder.Impl withGroup(@NonNull Contract_TermBuilder... group) {
      this.group = Arrays.stream(group).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param issued - When this Contract was issued. */
    public Contract_TermBuilder.Impl withIssued(@NonNull FHIRDateTime issued) {
      this.issued = Optional.of(issued);
      return this;
    }
    /** @param applies - Relevant time or time-period when this Contract is applicable. */
    public Contract_TermBuilder.Impl withApplies(@NonNull Period applies) {
      this.applies = Optional.of(applies);
      return this;
    }

    public Contract_TermBuilder.Impl withApplies(@NonNull PeriodBuilder applies) {
      this.applies = Optional.of(applies.build());
      return this;
    }
    /**
     * @param subType - Sub-category for the Contract that distinguishes the kinds of systems that
     *     would be interested in the Contract within the context of the Contract's scope.
     */
    public Contract_TermBuilder.Impl withSubType(@NonNull CodeableConcept subType) {
      this.subType = Optional.of(subType);
      return this;
    }

    public Contract_TermBuilder.Impl withSubType(@NonNull CodeableConceptBuilder subType) {
      this.subType = Optional.of(subType.build());
      return this;
    }
    /**
     * @param topic - Narrows the range of legal concerns to focus on the achievement of specific
     *     contractual objectives. Field is a 'choice' field. Type should be one of CodeableConcept,
     *     Reference. To pass the value in, wrap with one of the Contract_TermBuilder.topic static
     *     methods
     */
    public Contract_TermBuilder.Impl withTopic(@NonNull Choice01025009075 topic) {
      this.topic = Optional.of(topic);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Contract_TermBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Contract_TermBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Contract_TermBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Unique identifier for this Contract or a derivative that references a
     *     Source Contract.
     */
    public Contract_TermBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public Contract_TermBuilder.Impl withIdentifier(@NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
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
    public Contract_TermBuilder.Impl withModifierExtension(
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
    public Contract_TermBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Contract_TermBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param securityLabel */
    public Contract_TermBuilder.Impl withSecurityLabel(
        @NonNull Contract$Term$SecurityLabel... securityLabel) {
      this.securityLabel = Arrays.asList(securityLabel);
      return this;
    }
    /** @param securityLabel */
    public Contract_TermBuilder.Impl withSecurityLabel(
        @NonNull Collection<Contract$Term$SecurityLabel> securityLabel) {
      this.securityLabel = Collections.unmodifiableCollection(securityLabel);
      return this;
    }

    public Contract_TermBuilder.Impl withSecurityLabel(
        @NonNull Contract_Term_SecurityLabelBuilder... securityLabel) {
      this.securityLabel = Arrays.stream(securityLabel).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param action */
    public Contract_TermBuilder.Impl withAction(@NonNull Contract$Term$Action... action) {
      this.action = Arrays.asList(action);
      return this;
    }
    /** @param action */
    public Contract_TermBuilder.Impl withAction(@NonNull Collection<Contract$Term$Action> action) {
      this.action = Collections.unmodifiableCollection(action);
      return this;
    }

    public Contract_TermBuilder.Impl withAction(@NonNull Contract_Term_ActionBuilder... action) {
      this.action = Arrays.stream(action).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param asset */
    public Contract_TermBuilder.Impl withAsset(@NonNull Contract$Term$Asset... asset) {
      this.asset = Arrays.asList(asset);
      return this;
    }
    /** @param asset */
    public Contract_TermBuilder.Impl withAsset(@NonNull Collection<Contract$Term$Asset> asset) {
      this.asset = Collections.unmodifiableCollection(asset);
      return this;
    }

    public Contract_TermBuilder.Impl withAsset(@NonNull Contract_Term_AssetBuilder... asset) {
      this.asset = Arrays.stream(asset).map(e -> e.build()).collect(toList());
      return this;
    }

    public Contract.Term build() {
      return new Contract.Term(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(text),
          group.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(issued),
          OptionConverters.toScala(applies),
          OptionConverters.toScala(subType),
          (Option) OptionConverters.toScala(topic),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(identifier),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          offer,
          securityLabel.stream().collect(new LitSeqJCollector<>()),
          action.stream().collect(new LitSeqJCollector<>()),
          asset.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
