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
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;
import scala.math.BigDecimal;

public interface Claim_Item_DetailBuilder {
  public Claim$Item$Detail build();

  public static Impl init(Integer sequence, CodeableConcept productOrService) {
    return new Impl(sequence, productOrService);
  }

  public static Impl builder(Integer sequence, CodeableConceptBuilder productOrService) {
    return new Impl(sequence, productOrService.build());
  }

  public class Impl implements Claim_Item_DetailBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Money> net = Optional.empty();
    private Collection<Reference> udi = Collections.emptyList();
    private Optional<BigDecimal> factor = Optional.empty();
    private Optional<CodeableConcept> revenue = Optional.empty();
    private Integer sequence;
    private Optional<CodeableConcept> category = Optional.empty();
    private Collection<CodeableConcept> modifier = Collections.emptyList();
    private Optional<Quantity> quantity = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Money> unitPrice = Optional.empty();
    private Collection<CodeableConcept> programCode = Collections.emptyList();
    private CodeableConcept productOrService;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Claim$Item$Detail$SubDetail> subDetail = Collections.emptyList();

    /**
     * Required fields for {@link Claim$Item$Detail}
     *
     * @param sequence
     * @param productOrService
     */
    public Impl(Integer sequence, CodeableConcept productOrService) {
      this.sequence = sequence;
      this.productOrService = productOrService;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Claim_Item_DetailBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param net */
    public Claim_Item_DetailBuilder.Impl withNet(@NonNull Money net) {
      this.net = Optional.of(net);
      return this;
    }

    public Claim_Item_DetailBuilder.Impl withNet(@NonNull MoneyBuilder net) {
      this.net = Optional.of(net.build());
      return this;
    }
    /** @param udi */
    public Claim_Item_DetailBuilder.Impl withUdi(@NonNull Reference... udi) {
      this.udi = Arrays.asList(udi);
      return this;
    }
    /** @param udi */
    public Claim_Item_DetailBuilder.Impl withUdi(@NonNull Collection<Reference> udi) {
      this.udi = Collections.unmodifiableCollection(udi);
      return this;
    }

    public Claim_Item_DetailBuilder.Impl withUdi(@NonNull ReferenceBuilder... udi) {
      this.udi = Arrays.stream(udi).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param factor */
    public Claim_Item_DetailBuilder.Impl withFactor(@NonNull BigDecimal factor) {
      this.factor = Optional.of(factor);
      return this;
    }
    /** @param revenue */
    public Claim_Item_DetailBuilder.Impl withRevenue(@NonNull CodeableConcept revenue) {
      this.revenue = Optional.of(revenue);
      return this;
    }

    public Claim_Item_DetailBuilder.Impl withRevenue(@NonNull CodeableConceptBuilder revenue) {
      this.revenue = Optional.of(revenue.build());
      return this;
    }
    /** @param category */
    public Claim_Item_DetailBuilder.Impl withCategory(@NonNull CodeableConcept category) {
      this.category = Optional.of(category);
      return this;
    }

    public Claim_Item_DetailBuilder.Impl withCategory(@NonNull CodeableConceptBuilder category) {
      this.category = Optional.of(category.build());
      return this;
    }
    /** @param modifier */
    public Claim_Item_DetailBuilder.Impl withModifier(@NonNull CodeableConcept... modifier) {
      this.modifier = Arrays.asList(modifier);
      return this;
    }
    /** @param modifier */
    public Claim_Item_DetailBuilder.Impl withModifier(
        @NonNull Collection<CodeableConcept> modifier) {
      this.modifier = Collections.unmodifiableCollection(modifier);
      return this;
    }

    public Claim_Item_DetailBuilder.Impl withModifier(@NonNull CodeableConceptBuilder... modifier) {
      this.modifier = Arrays.stream(modifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param quantity */
    public Claim_Item_DetailBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public Claim_Item_DetailBuilder.Impl withQuantity(@NonNull QuantityBuilder quantity) {
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
    public Claim_Item_DetailBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Claim_Item_DetailBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Claim_Item_DetailBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param unitPrice */
    public Claim_Item_DetailBuilder.Impl withUnitPrice(@NonNull Money unitPrice) {
      this.unitPrice = Optional.of(unitPrice);
      return this;
    }

    public Claim_Item_DetailBuilder.Impl withUnitPrice(@NonNull MoneyBuilder unitPrice) {
      this.unitPrice = Optional.of(unitPrice.build());
      return this;
    }
    /** @param programCode */
    public Claim_Item_DetailBuilder.Impl withProgramCode(@NonNull CodeableConcept... programCode) {
      this.programCode = Arrays.asList(programCode);
      return this;
    }
    /** @param programCode */
    public Claim_Item_DetailBuilder.Impl withProgramCode(
        @NonNull Collection<CodeableConcept> programCode) {
      this.programCode = Collections.unmodifiableCollection(programCode);
      return this;
    }

    public Claim_Item_DetailBuilder.Impl withProgramCode(
        @NonNull CodeableConceptBuilder... programCode) {
      this.programCode = Arrays.stream(programCode).map(e -> e.build()).collect(toList());
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
    public Claim_Item_DetailBuilder.Impl withModifierExtension(
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
    public Claim_Item_DetailBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Claim_Item_DetailBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param subDetail */
    public Claim_Item_DetailBuilder.Impl withSubDetail(
        @NonNull Claim$Item$Detail$SubDetail... subDetail) {
      this.subDetail = Arrays.asList(subDetail);
      return this;
    }
    /** @param subDetail */
    public Claim_Item_DetailBuilder.Impl withSubDetail(
        @NonNull Collection<Claim$Item$Detail$SubDetail> subDetail) {
      this.subDetail = Collections.unmodifiableCollection(subDetail);
      return this;
    }

    public Claim_Item_DetailBuilder.Impl withSubDetail(
        @NonNull Claim_Item_Detail_SubDetailBuilder... subDetail) {
      this.subDetail = Arrays.stream(subDetail).map(e -> e.build()).collect(toList());
      return this;
    }

    public Claim$Item$Detail build() {
      return new Claim$Item$Detail(
          OptionConverters.toScala(id),
          OptionConverters.toScala(net),
          udi.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(factor),
          OptionConverters.toScala(revenue),
          sequence,
          OptionConverters.toScala(category),
          modifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(quantity),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(unitPrice),
          programCode.stream().collect(new LitSeqJCollector<>()),
          productOrService,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          subDetail.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
