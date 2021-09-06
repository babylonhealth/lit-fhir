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

public interface ExplanationOfBenefit_Item_DetailBuilder {
  public ExplanationOfBenefit$Item$Detail build();

  public static Impl init(Integer sequence, CodeableConcept productOrService) {
    return new Impl(sequence, productOrService);
  }

  public static Impl builder(Integer sequence, CodeableConceptBuilder productOrService) {
    return new Impl(sequence, productOrService.build());
  }

  public class Impl implements ExplanationOfBenefit_Item_DetailBuilder {
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
    private Collection<Integer> noteNumber = Collections.emptyList();
    private Collection<CodeableConcept> programCode = Collections.emptyList();
    private Collection<ExplanationOfBenefit$Item$Adjudication> adjudication =
        Collections.emptyList();
    private CodeableConcept productOrService;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ExplanationOfBenefit$Item$Detail$SubDetail> subDetail =
        Collections.emptyList();

    /**
     * Required fields for {@link ExplanationOfBenefit$Item$Detail}
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
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param net */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withNet(@NonNull Money net) {
      this.net = Optional.of(net);
      return this;
    }
    /** @param udi */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withUdi(@NonNull Reference... udi) {
      this.udi = Arrays.asList(udi);
      return this;
    }
    /** @param udi */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withUdi(
        @NonNull Collection<Reference> udi) {
      this.udi = Collections.unmodifiableCollection(udi);
      return this;
    }
    /** @param factor */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withFactor(@NonNull BigDecimal factor) {
      this.factor = Optional.of(factor);
      return this;
    }
    /** @param revenue */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withRevenue(
        @NonNull CodeableConcept revenue) {
      this.revenue = Optional.of(revenue);
      return this;
    }
    /** @param category */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withCategory(
        @NonNull CodeableConcept category) {
      this.category = Optional.of(category);
      return this;
    }
    /** @param modifier */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withModifier(
        @NonNull CodeableConcept... modifier) {
      this.modifier = Arrays.asList(modifier);
      return this;
    }
    /** @param modifier */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withModifier(
        @NonNull Collection<CodeableConcept> modifier) {
      this.modifier = Collections.unmodifiableCollection(modifier);
      return this;
    }
    /** @param quantity */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withExtension(
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
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /** @param unitPrice */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withUnitPrice(@NonNull Money unitPrice) {
      this.unitPrice = Optional.of(unitPrice);
      return this;
    }
    /** @param noteNumber */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withNoteNumber(
        @NonNull Integer... noteNumber) {
      this.noteNumber = Arrays.asList(noteNumber);
      return this;
    }
    /** @param noteNumber */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withNoteNumber(
        @NonNull Collection<Integer> noteNumber) {
      this.noteNumber = Collections.unmodifiableCollection(noteNumber);
      return this;
    }
    /** @param programCode */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withProgramCode(
        @NonNull CodeableConcept... programCode) {
      this.programCode = Arrays.asList(programCode);
      return this;
    }
    /** @param programCode */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withProgramCode(
        @NonNull Collection<CodeableConcept> programCode) {
      this.programCode = Collections.unmodifiableCollection(programCode);
      return this;
    }
    /**
     * @param adjudication - The adjudication results which are presented at the header level rather
     *     than at the line-item or add-item levels.
     */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withAdjudication(
        @NonNull ExplanationOfBenefit$Item$Adjudication... adjudication) {
      this.adjudication = Arrays.asList(adjudication);
      return this;
    }
    /**
     * @param adjudication - The adjudication results which are presented at the header level rather
     *     than at the line-item or add-item levels.
     */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withAdjudication(
        @NonNull Collection<ExplanationOfBenefit$Item$Adjudication> adjudication) {
      this.adjudication = Collections.unmodifiableCollection(adjudication);
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
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withModifierExtension(
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
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /** @param subDetail */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withSubDetail(
        @NonNull ExplanationOfBenefit$Item$Detail$SubDetail... subDetail) {
      this.subDetail = Arrays.asList(subDetail);
      return this;
    }
    /** @param subDetail */
    public ExplanationOfBenefit_Item_DetailBuilder.Impl withSubDetail(
        @NonNull Collection<ExplanationOfBenefit$Item$Detail$SubDetail> subDetail) {
      this.subDetail = Collections.unmodifiableCollection(subDetail);
      return this;
    }

    public ExplanationOfBenefit$Item$Detail build() {
      return new ExplanationOfBenefit$Item$Detail(
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
          noteNumber.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          programCode.stream().collect(new LitSeqJCollector<>()),
          adjudication.stream().collect(new LitSeqJCollector<>()),
          productOrService,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          subDetail.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
