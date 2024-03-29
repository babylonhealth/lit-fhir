package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface Contract_Term_AssetBuilder {
  public Contract$Term$Asset build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Contract_Term_AssetBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<CodeableConcept> _type = Collections.emptyList();
    private Optional<String> text = Optional.empty();
    private Optional<CodeableConcept> scope = Optional.empty();
    private Collection<Period> period = Collections.emptyList();
    private Collection<String> linkId = Collections.emptyList();
    private Collection<Contract$Term$Offer$Answer> answer = Collections.emptyList();
    private Collection<CodeableConcept> subtype = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> condition = Optional.empty();
    private Collection<Period> usePeriod = Collections.emptyList();
    private Collection<CodeableConcept> periodType = Collections.emptyList();
    private Optional<Coding> relationship = Optional.empty();
    private Collection<Reference> typeReference = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Integer> securityLabelNumber = Collections.emptyList();
    private Collection<Contract$Term$Asset$Context> context = Collections.emptyList();
    private Collection<Contract$Term$Asset$ValuedItem> valuedItem = Collections.emptyList();

    /** Required fields for {@link Contract$Term$Asset} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Contract_Term_AssetBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param _type - A high-level category for the legal instrument, whether constructed as a
     *     Contract definition, derivative, or instance in any legal state. Provides additional
     *     information about its content within the context of the Contract's scope to distinguish
     *     the kinds of systems that would be interested in the contract.
     */
    public Contract_Term_AssetBuilder.Impl withType(@NonNull CodeableConcept... _type) {
      this._type = Arrays.asList(_type);
      return this;
    }
    /**
     * @param _type - A high-level category for the legal instrument, whether constructed as a
     *     Contract definition, derivative, or instance in any legal state. Provides additional
     *     information about its content within the context of the Contract's scope to distinguish
     *     the kinds of systems that would be interested in the contract.
     */
    public Contract_Term_AssetBuilder.Impl withType(@NonNull Collection<CodeableConcept> _type) {
      this._type = Collections.unmodifiableCollection(_type);
      return this;
    }

    public Contract_Term_AssetBuilder.Impl withType(@NonNull CodeableConceptBuilder... _type) {
      this._type = Arrays.stream(_type).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public Contract_Term_AssetBuilder.Impl withText(@NonNull String text) {
      this.text = Optional.of(text);
      return this;
    }
    /**
     * @param scope - A selector of legal concerns for this Contract definition, derivative, or
     *     instance in any legal state.
     */
    public Contract_Term_AssetBuilder.Impl withScope(@NonNull CodeableConcept scope) {
      this.scope = Optional.of(scope);
      return this;
    }

    public Contract_Term_AssetBuilder.Impl withScope(@NonNull CodeableConceptBuilder scope) {
      this.scope = Optional.of(scope.build());
      return this;
    }
    /** @param period */
    public Contract_Term_AssetBuilder.Impl withPeriod(@NonNull Period... period) {
      this.period = Arrays.asList(period);
      return this;
    }
    /** @param period */
    public Contract_Term_AssetBuilder.Impl withPeriod(@NonNull Collection<Period> period) {
      this.period = Collections.unmodifiableCollection(period);
      return this;
    }

    public Contract_Term_AssetBuilder.Impl withPeriod(@NonNull PeriodBuilder... period) {
      this.period = Arrays.stream(period).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param linkId */
    public Contract_Term_AssetBuilder.Impl withLinkId(@NonNull String... linkId) {
      this.linkId = Arrays.asList(linkId);
      return this;
    }
    /** @param linkId */
    public Contract_Term_AssetBuilder.Impl withLinkId(@NonNull Collection<String> linkId) {
      this.linkId = Collections.unmodifiableCollection(linkId);
      return this;
    }
    /** @param answer */
    public Contract_Term_AssetBuilder.Impl withAnswer(
        @NonNull Contract$Term$Offer$Answer... answer) {
      this.answer = Arrays.asList(answer);
      return this;
    }
    /** @param answer */
    public Contract_Term_AssetBuilder.Impl withAnswer(
        @NonNull Collection<Contract$Term$Offer$Answer> answer) {
      this.answer = Collections.unmodifiableCollection(answer);
      return this;
    }

    public Contract_Term_AssetBuilder.Impl withAnswer(
        @NonNull Contract_Term_Offer_AnswerBuilder... answer) {
      this.answer = Arrays.stream(answer).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param subtype */
    public Contract_Term_AssetBuilder.Impl withSubtype(@NonNull CodeableConcept... subtype) {
      this.subtype = Arrays.asList(subtype);
      return this;
    }
    /** @param subtype */
    public Contract_Term_AssetBuilder.Impl withSubtype(
        @NonNull Collection<CodeableConcept> subtype) {
      this.subtype = Collections.unmodifiableCollection(subtype);
      return this;
    }

    public Contract_Term_AssetBuilder.Impl withSubtype(@NonNull CodeableConceptBuilder... subtype) {
      this.subtype = Arrays.stream(subtype).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Contract_Term_AssetBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Contract_Term_AssetBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Contract_Term_AssetBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param condition */
    public Contract_Term_AssetBuilder.Impl withCondition(@NonNull String condition) {
      this.condition = Optional.of(condition);
      return this;
    }
    /** @param usePeriod */
    public Contract_Term_AssetBuilder.Impl withUsePeriod(@NonNull Period... usePeriod) {
      this.usePeriod = Arrays.asList(usePeriod);
      return this;
    }
    /** @param usePeriod */
    public Contract_Term_AssetBuilder.Impl withUsePeriod(@NonNull Collection<Period> usePeriod) {
      this.usePeriod = Collections.unmodifiableCollection(usePeriod);
      return this;
    }

    public Contract_Term_AssetBuilder.Impl withUsePeriod(@NonNull PeriodBuilder... usePeriod) {
      this.usePeriod = Arrays.stream(usePeriod).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param periodType */
    public Contract_Term_AssetBuilder.Impl withPeriodType(@NonNull CodeableConcept... periodType) {
      this.periodType = Arrays.asList(periodType);
      return this;
    }
    /** @param periodType */
    public Contract_Term_AssetBuilder.Impl withPeriodType(
        @NonNull Collection<CodeableConcept> periodType) {
      this.periodType = Collections.unmodifiableCollection(periodType);
      return this;
    }

    public Contract_Term_AssetBuilder.Impl withPeriodType(
        @NonNull CodeableConceptBuilder... periodType) {
      this.periodType = Arrays.stream(periodType).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param relationship */
    public Contract_Term_AssetBuilder.Impl withRelationship(@NonNull Coding relationship) {
      this.relationship = Optional.of(relationship);
      return this;
    }

    public Contract_Term_AssetBuilder.Impl withRelationship(@NonNull CodingBuilder relationship) {
      this.relationship = Optional.of(relationship.build());
      return this;
    }
    /** @param typeReference */
    public Contract_Term_AssetBuilder.Impl withTypeReference(@NonNull Reference... typeReference) {
      this.typeReference = Arrays.asList(typeReference);
      return this;
    }
    /** @param typeReference */
    public Contract_Term_AssetBuilder.Impl withTypeReference(
        @NonNull Collection<Reference> typeReference) {
      this.typeReference = Collections.unmodifiableCollection(typeReference);
      return this;
    }

    public Contract_Term_AssetBuilder.Impl withTypeReference(
        @NonNull ReferenceBuilder... typeReference) {
      this.typeReference = Arrays.stream(typeReference).map(e -> e.build()).collect(toList());
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
    public Contract_Term_AssetBuilder.Impl withModifierExtension(
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
    public Contract_Term_AssetBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Contract_Term_AssetBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param securityLabelNumber */
    public Contract_Term_AssetBuilder.Impl withSecurityLabelNumber(
        @NonNull Integer... securityLabelNumber) {
      this.securityLabelNumber = Arrays.asList(securityLabelNumber);
      return this;
    }
    /** @param securityLabelNumber */
    public Contract_Term_AssetBuilder.Impl withSecurityLabelNumber(
        @NonNull Collection<Integer> securityLabelNumber) {
      this.securityLabelNumber = Collections.unmodifiableCollection(securityLabelNumber);
      return this;
    }
    /** @param context */
    public Contract_Term_AssetBuilder.Impl withContext(
        @NonNull Contract$Term$Asset$Context... context) {
      this.context = Arrays.asList(context);
      return this;
    }
    /** @param context */
    public Contract_Term_AssetBuilder.Impl withContext(
        @NonNull Collection<Contract$Term$Asset$Context> context) {
      this.context = Collections.unmodifiableCollection(context);
      return this;
    }

    public Contract_Term_AssetBuilder.Impl withContext(
        @NonNull Contract_Term_Asset_ContextBuilder... context) {
      this.context = Arrays.stream(context).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param valuedItem */
    public Contract_Term_AssetBuilder.Impl withValuedItem(
        @NonNull Contract$Term$Asset$ValuedItem... valuedItem) {
      this.valuedItem = Arrays.asList(valuedItem);
      return this;
    }
    /** @param valuedItem */
    public Contract_Term_AssetBuilder.Impl withValuedItem(
        @NonNull Collection<Contract$Term$Asset$ValuedItem> valuedItem) {
      this.valuedItem = Collections.unmodifiableCollection(valuedItem);
      return this;
    }

    public Contract_Term_AssetBuilder.Impl withValuedItem(
        @NonNull Contract_Term_Asset_ValuedItemBuilder... valuedItem) {
      this.valuedItem = Arrays.stream(valuedItem).map(e -> e.build()).collect(toList());
      return this;
    }

    public Contract$Term$Asset build() {
      return new Contract$Term$Asset(
          OptionConverters.toScala(id),
          _type.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(text),
          OptionConverters.toScala(scope),
          period.stream().collect(new LitSeqJCollector<>()),
          linkId.stream().collect(new LitSeqJCollector<>()),
          answer.stream().collect(new LitSeqJCollector<>()),
          subtype.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(condition),
          usePeriod.stream().collect(new LitSeqJCollector<>()),
          periodType.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(relationship),
          typeReference.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          securityLabelNumber.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          context.stream().collect(new LitSeqJCollector<>()),
          valuedItem.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
