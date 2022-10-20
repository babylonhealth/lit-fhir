package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
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
import scala.math.BigDecimal;

public interface ClaimResponse_AddItem_DetailBuilder {
  public ClaimResponse$AddItem$Detail build();

  public static Impl init(
      Collection<ClaimResponse$Item$Adjudication> adjudication, CodeableConcept productOrService) {
    return new Impl(adjudication, productOrService);
  }

  public static Impl builder(
      Collection<ClaimResponse_Item_AdjudicationBuilder> adjudication,
      CodeableConceptBuilder productOrService) {
    return new Impl(
        new LitSeq<>(adjudication).map(ClaimResponse_Item_AdjudicationBuilder::build),
        productOrService.build());
  }

  public class Impl implements ClaimResponse_AddItem_DetailBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Money> net = Optional.empty();
    private Optional<BigDecimal> factor = Optional.empty();
    private Collection<CodeableConcept> modifier = Collections.emptyList();
    private Optional<Quantity> quantity = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Money> unitPrice = Optional.empty();
    private Collection<Integer> noteNumber = Collections.emptyList();
    private Collection<ClaimResponse$Item$Adjudication> adjudication;
    private CodeableConcept productOrService;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ClaimResponse$AddItem$Detail$SubDetail> subDetail = Collections.emptyList();

    /**
     * Required fields for {@link ClaimResponse$AddItem$Detail}
     *
     * @param adjudication - The adjudication results which are presented at the header level rather
     *     than at the line-item or add-item levels.
     * @param productOrService
     */
    public Impl(
        Collection<ClaimResponse$Item$Adjudication> adjudication,
        CodeableConcept productOrService) {
      this.adjudication = adjudication;
      this.productOrService = productOrService;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ClaimResponse_AddItem_DetailBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param net */
    public ClaimResponse_AddItem_DetailBuilder.Impl withNet(@NonNull Money net) {
      this.net = Optional.of(net);
      return this;
    }

    public ClaimResponse_AddItem_DetailBuilder.Impl withNet(@NonNull MoneyBuilder net) {
      this.net = Optional.of(net.build());
      return this;
    }
    /** @param factor */
    public ClaimResponse_AddItem_DetailBuilder.Impl withFactor(@NonNull BigDecimal factor) {
      this.factor = Optional.of(factor);
      return this;
    }
    /** @param modifier */
    public ClaimResponse_AddItem_DetailBuilder.Impl withModifier(
        @NonNull CodeableConcept... modifier) {
      this.modifier = Arrays.asList(modifier);
      return this;
    }
    /** @param modifier */
    public ClaimResponse_AddItem_DetailBuilder.Impl withModifier(
        @NonNull Collection<CodeableConcept> modifier) {
      this.modifier = Collections.unmodifiableCollection(modifier);
      return this;
    }

    public ClaimResponse_AddItem_DetailBuilder.Impl withModifier(
        @NonNull CodeableConceptBuilder... modifier) {
      this.modifier = Arrays.stream(modifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param quantity */
    public ClaimResponse_AddItem_DetailBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public ClaimResponse_AddItem_DetailBuilder.Impl withQuantity(
        @NonNull QuantityBuilder quantity) {
      this.quantity = Optional.of(quantity.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ClaimResponse_AddItem_DetailBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ClaimResponse_AddItem_DetailBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ClaimResponse_AddItem_DetailBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param unitPrice */
    public ClaimResponse_AddItem_DetailBuilder.Impl withUnitPrice(@NonNull Money unitPrice) {
      this.unitPrice = Optional.of(unitPrice);
      return this;
    }

    public ClaimResponse_AddItem_DetailBuilder.Impl withUnitPrice(@NonNull MoneyBuilder unitPrice) {
      this.unitPrice = Optional.of(unitPrice.build());
      return this;
    }
    /** @param noteNumber */
    public ClaimResponse_AddItem_DetailBuilder.Impl withNoteNumber(@NonNull Integer... noteNumber) {
      this.noteNumber = Arrays.asList(noteNumber);
      return this;
    }
    /** @param noteNumber */
    public ClaimResponse_AddItem_DetailBuilder.Impl withNoteNumber(
        @NonNull Collection<Integer> noteNumber) {
      this.noteNumber = Collections.unmodifiableCollection(noteNumber);
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
    public ClaimResponse_AddItem_DetailBuilder.Impl withModifierExtension(
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
    public ClaimResponse_AddItem_DetailBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ClaimResponse_AddItem_DetailBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param subDetail */
    public ClaimResponse_AddItem_DetailBuilder.Impl withSubDetail(
        @NonNull ClaimResponse$AddItem$Detail$SubDetail... subDetail) {
      this.subDetail = Arrays.asList(subDetail);
      return this;
    }
    /** @param subDetail */
    public ClaimResponse_AddItem_DetailBuilder.Impl withSubDetail(
        @NonNull Collection<ClaimResponse$AddItem$Detail$SubDetail> subDetail) {
      this.subDetail = Collections.unmodifiableCollection(subDetail);
      return this;
    }

    public ClaimResponse_AddItem_DetailBuilder.Impl withSubDetail(
        @NonNull ClaimResponse_AddItem_Detail_SubDetailBuilder... subDetail) {
      this.subDetail = Arrays.stream(subDetail).map(e -> e.build()).collect(toList());
      return this;
    }

    public ClaimResponse$AddItem$Detail build() {
      return new ClaimResponse$AddItem$Detail(
          OptionConverters.toScala(id),
          OptionConverters.toScala(net),
          OptionConverters.toScala(factor),
          modifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(quantity),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(unitPrice),
          noteNumber.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          adjudication.stream().collect(new NonEmptyLitSeqJCollector<>()),
          productOrService,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          subDetail.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
