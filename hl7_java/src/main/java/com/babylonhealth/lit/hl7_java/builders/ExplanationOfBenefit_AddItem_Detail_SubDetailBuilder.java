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
import scala.math.BigDecimal;

public interface ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder {
  public ExplanationOfBenefit$AddItem$Detail$SubDetail build();

  public static Impl init(CodeableConcept productOrService) {
    return new Impl(productOrService);
  }

  public static Impl builder(CodeableConceptBuilder productOrService) {
    return new Impl(productOrService.build());
  }

  public class Impl implements ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Money> net = Optional.empty();
    private Optional<BigDecimal> factor = Optional.empty();
    private Collection<CodeableConcept> modifier = Collections.emptyList();
    private Optional<Quantity> quantity = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Money> unitPrice = Optional.empty();
    private Collection<Integer> noteNumber = Collections.emptyList();
    private Collection<ExplanationOfBenefit$Item$Adjudication> adjudication =
        Collections.emptyList();
    private CodeableConcept productOrService;
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link ExplanationOfBenefit$AddItem$Detail$SubDetail}
     *
     * @param productOrService
     */
    public Impl(CodeableConcept productOrService) {
      this.productOrService = productOrService;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param net */
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withNet(@NonNull Money net) {
      this.net = Optional.of(net);
      return this;
    }

    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withNet(
        @NonNull MoneyBuilder net) {
      this.net = Optional.of(net.build());
      return this;
    }
    /** @param factor */
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withFactor(
        @NonNull BigDecimal factor) {
      this.factor = Optional.of(factor);
      return this;
    }
    /** @param modifier */
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withModifier(
        @NonNull CodeableConcept... modifier) {
      this.modifier = Arrays.asList(modifier);
      return this;
    }
    /** @param modifier */
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withModifier(
        @NonNull Collection<CodeableConcept> modifier) {
      this.modifier = Collections.unmodifiableCollection(modifier);
      return this;
    }

    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withModifier(
        @NonNull CodeableConceptBuilder... modifier) {
      this.modifier = Arrays.stream(modifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param quantity */
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withQuantity(
        @NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withQuantity(
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
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withExtension(
        @NonNull Extension... extension) {
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
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param unitPrice */
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withUnitPrice(
        @NonNull Money unitPrice) {
      this.unitPrice = Optional.of(unitPrice);
      return this;
    }

    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withUnitPrice(
        @NonNull MoneyBuilder unitPrice) {
      this.unitPrice = Optional.of(unitPrice.build());
      return this;
    }
    /** @param noteNumber */
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withNoteNumber(
        @NonNull Integer... noteNumber) {
      this.noteNumber = Arrays.asList(noteNumber);
      return this;
    }
    /** @param noteNumber */
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withNoteNumber(
        @NonNull Collection<Integer> noteNumber) {
      this.noteNumber = Collections.unmodifiableCollection(noteNumber);
      return this;
    }
    /**
     * @param adjudication - The adjudication results which are presented at the header level rather
     *     than at the line-item or add-item levels.
     */
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withAdjudication(
        @NonNull ExplanationOfBenefit$Item$Adjudication... adjudication) {
      this.adjudication = Arrays.asList(adjudication);
      return this;
    }
    /**
     * @param adjudication - The adjudication results which are presented at the header level rather
     *     than at the line-item or add-item levels.
     */
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withAdjudication(
        @NonNull Collection<ExplanationOfBenefit$Item$Adjudication> adjudication) {
      this.adjudication = Collections.unmodifiableCollection(adjudication);
      return this;
    }

    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withAdjudication(
        @NonNull ExplanationOfBenefit_Item_AdjudicationBuilder... adjudication) {
      this.adjudication = Arrays.stream(adjudication).map(e -> e.build()).collect(toList());
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
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withModifierExtension(
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
    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ExplanationOfBenefit_AddItem_Detail_SubDetailBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public ExplanationOfBenefit$AddItem$Detail$SubDetail build() {
      return new ExplanationOfBenefit$AddItem$Detail$SubDetail(
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
          adjudication.stream().collect(new LitSeqJCollector<>()),
          productOrService,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
