package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDate;
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
import scala.Option;
import scala.jdk.javaapi.OptionConverters;
import scala.math.BigDecimal;

public interface ExplanationOfBenefit_AddItemBuilder {
  public ExplanationOfBenefit.AddItem build();

  public static Impl init(CodeableConcept productOrService) {
    return new Impl(productOrService);
  }

  public static Impl builder(CodeableConceptBuilder productOrService) {
    return new Impl(productOrService.build());
  }

  public static ChoiceDateOrPeriod serviced(FHIRDate f) {
    return new ChoiceDateOrPeriod(f);
  }

  public static ChoiceDateOrPeriod serviced(Period p) {
    return new ChoiceDateOrPeriod(p);
  }

  public static ChoiceAddressOrCodeableConceptOrReference location(Address a) {
    return new ChoiceAddressOrCodeableConceptOrReference(a);
  }

  public static ChoiceAddressOrCodeableConceptOrReference location(CodeableConcept c) {
    return new ChoiceAddressOrCodeableConceptOrReference(c);
  }

  public static ChoiceAddressOrCodeableConceptOrReference location(Reference r) {
    return new ChoiceAddressOrCodeableConceptOrReference(r);
  }

  public class Impl implements ExplanationOfBenefit_AddItemBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Money> net = Optional.empty();
    private Optional<BigDecimal> factor = Optional.empty();
    private Collection<CodeableConcept> subSite = Collections.emptyList();
    private Collection<Reference> provider = Collections.emptyList();
    private Collection<CodeableConcept> modifier = Collections.emptyList();
    private Optional<Quantity> quantity = Optional.empty();
    private Optional<CodeableConcept> bodySite = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Money> unitPrice = Optional.empty();
    private Collection<Integer> noteNumber = Collections.emptyList();
    private Collection<CodeableConcept> programCode = Collections.emptyList();
    private Optional<ChoiceDateOrPeriod> serviced = Optional.empty();
    private Optional<ChoiceAddressOrCodeableConceptOrReference> location = Optional.empty();
    private Collection<Integer> itemSequence = Collections.emptyList();
    private Collection<ExplanationOfBenefit$Item$Adjudication> adjudication =
        Collections.emptyList();
    private Collection<Integer> detailSequence = Collections.emptyList();
    private CodeableConcept productOrService;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Integer> subDetailSequence = Collections.emptyList();
    private Collection<ExplanationOfBenefit$AddItem$Detail> detail = Collections.emptyList();

    /**
     * Required fields for {@link ExplanationOfBenefit.AddItem}
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
    public ExplanationOfBenefit_AddItemBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param net */
    public ExplanationOfBenefit_AddItemBuilder.Impl withNet(@NonNull Money net) {
      this.net = Optional.of(net);
      return this;
    }

    public ExplanationOfBenefit_AddItemBuilder.Impl withNet(@NonNull MoneyBuilder net) {
      this.net = Optional.of(net.build());
      return this;
    }
    /** @param factor */
    public ExplanationOfBenefit_AddItemBuilder.Impl withFactor(@NonNull BigDecimal factor) {
      this.factor = Optional.of(factor);
      return this;
    }
    /** @param subSite */
    public ExplanationOfBenefit_AddItemBuilder.Impl withSubSite(
        @NonNull CodeableConcept... subSite) {
      this.subSite = Arrays.asList(subSite);
      return this;
    }
    /** @param subSite */
    public ExplanationOfBenefit_AddItemBuilder.Impl withSubSite(
        @NonNull Collection<CodeableConcept> subSite) {
      this.subSite = Collections.unmodifiableCollection(subSite);
      return this;
    }

    public ExplanationOfBenefit_AddItemBuilder.Impl withSubSite(
        @NonNull CodeableConceptBuilder... subSite) {
      this.subSite = Arrays.stream(subSite).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param provider - The provider which is responsible for the claim, predetermination or
     *     preauthorization.
     */
    public ExplanationOfBenefit_AddItemBuilder.Impl withProvider(@NonNull Reference... provider) {
      this.provider = Arrays.asList(provider);
      return this;
    }
    /**
     * @param provider - The provider which is responsible for the claim, predetermination or
     *     preauthorization.
     */
    public ExplanationOfBenefit_AddItemBuilder.Impl withProvider(
        @NonNull Collection<Reference> provider) {
      this.provider = Collections.unmodifiableCollection(provider);
      return this;
    }

    public ExplanationOfBenefit_AddItemBuilder.Impl withProvider(
        @NonNull ReferenceBuilder... provider) {
      this.provider = Arrays.stream(provider).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param modifier */
    public ExplanationOfBenefit_AddItemBuilder.Impl withModifier(
        @NonNull CodeableConcept... modifier) {
      this.modifier = Arrays.asList(modifier);
      return this;
    }
    /** @param modifier */
    public ExplanationOfBenefit_AddItemBuilder.Impl withModifier(
        @NonNull Collection<CodeableConcept> modifier) {
      this.modifier = Collections.unmodifiableCollection(modifier);
      return this;
    }

    public ExplanationOfBenefit_AddItemBuilder.Impl withModifier(
        @NonNull CodeableConceptBuilder... modifier) {
      this.modifier = Arrays.stream(modifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param quantity */
    public ExplanationOfBenefit_AddItemBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public ExplanationOfBenefit_AddItemBuilder.Impl withQuantity(
        @NonNull QuantityBuilder quantity) {
      this.quantity = Optional.of(quantity.build());
      return this;
    }
    /** @param bodySite */
    public ExplanationOfBenefit_AddItemBuilder.Impl withBodySite(
        @NonNull CodeableConcept bodySite) {
      this.bodySite = Optional.of(bodySite);
      return this;
    }

    public ExplanationOfBenefit_AddItemBuilder.Impl withBodySite(
        @NonNull CodeableConceptBuilder bodySite) {
      this.bodySite = Optional.of(bodySite.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ExplanationOfBenefit_AddItemBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ExplanationOfBenefit_AddItemBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ExplanationOfBenefit_AddItemBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param unitPrice */
    public ExplanationOfBenefit_AddItemBuilder.Impl withUnitPrice(@NonNull Money unitPrice) {
      this.unitPrice = Optional.of(unitPrice);
      return this;
    }

    public ExplanationOfBenefit_AddItemBuilder.Impl withUnitPrice(@NonNull MoneyBuilder unitPrice) {
      this.unitPrice = Optional.of(unitPrice.build());
      return this;
    }
    /** @param noteNumber */
    public ExplanationOfBenefit_AddItemBuilder.Impl withNoteNumber(@NonNull Integer... noteNumber) {
      this.noteNumber = Arrays.asList(noteNumber);
      return this;
    }
    /** @param noteNumber */
    public ExplanationOfBenefit_AddItemBuilder.Impl withNoteNumber(
        @NonNull Collection<Integer> noteNumber) {
      this.noteNumber = Collections.unmodifiableCollection(noteNumber);
      return this;
    }
    /** @param programCode */
    public ExplanationOfBenefit_AddItemBuilder.Impl withProgramCode(
        @NonNull CodeableConcept... programCode) {
      this.programCode = Arrays.asList(programCode);
      return this;
    }
    /** @param programCode */
    public ExplanationOfBenefit_AddItemBuilder.Impl withProgramCode(
        @NonNull Collection<CodeableConcept> programCode) {
      this.programCode = Collections.unmodifiableCollection(programCode);
      return this;
    }

    public ExplanationOfBenefit_AddItemBuilder.Impl withProgramCode(
        @NonNull CodeableConceptBuilder... programCode) {
      this.programCode = Arrays.stream(programCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param serviced Field is a 'choice' field. Type should be one of FHIRDate, Period. To pass
     *     the value in, wrap with one of the ExplanationOfBenefit_AddItemBuilder.serviced static
     *     methods
     */
    public ExplanationOfBenefit_AddItemBuilder.Impl withServiced(
        @NonNull ChoiceDateOrPeriod serviced) {
      this.serviced = Optional.of(serviced);
      return this;
    }
    /**
     * @param location Field is a 'choice' field. Type should be one of Address, CodeableConcept,
     *     Reference. To pass the value in, wrap with one of the
     *     ExplanationOfBenefit_AddItemBuilder.location static methods
     */
    public ExplanationOfBenefit_AddItemBuilder.Impl withLocation(
        @NonNull ChoiceAddressOrCodeableConceptOrReference location) {
      this.location = Optional.of(location);
      return this;
    }
    /** @param itemSequence */
    public ExplanationOfBenefit_AddItemBuilder.Impl withItemSequence(
        @NonNull Integer... itemSequence) {
      this.itemSequence = Arrays.asList(itemSequence);
      return this;
    }
    /** @param itemSequence */
    public ExplanationOfBenefit_AddItemBuilder.Impl withItemSequence(
        @NonNull Collection<Integer> itemSequence) {
      this.itemSequence = Collections.unmodifiableCollection(itemSequence);
      return this;
    }
    /**
     * @param adjudication - The adjudication results which are presented at the header level rather
     *     than at the line-item or add-item levels.
     */
    public ExplanationOfBenefit_AddItemBuilder.Impl withAdjudication(
        @NonNull ExplanationOfBenefit$Item$Adjudication... adjudication) {
      this.adjudication = Arrays.asList(adjudication);
      return this;
    }
    /**
     * @param adjudication - The adjudication results which are presented at the header level rather
     *     than at the line-item or add-item levels.
     */
    public ExplanationOfBenefit_AddItemBuilder.Impl withAdjudication(
        @NonNull Collection<ExplanationOfBenefit$Item$Adjudication> adjudication) {
      this.adjudication = Collections.unmodifiableCollection(adjudication);
      return this;
    }

    public ExplanationOfBenefit_AddItemBuilder.Impl withAdjudication(
        @NonNull ExplanationOfBenefit_Item_AdjudicationBuilder... adjudication) {
      this.adjudication = Arrays.stream(adjudication).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param detailSequence */
    public ExplanationOfBenefit_AddItemBuilder.Impl withDetailSequence(
        @NonNull Integer... detailSequence) {
      this.detailSequence = Arrays.asList(detailSequence);
      return this;
    }
    /** @param detailSequence */
    public ExplanationOfBenefit_AddItemBuilder.Impl withDetailSequence(
        @NonNull Collection<Integer> detailSequence) {
      this.detailSequence = Collections.unmodifiableCollection(detailSequence);
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
    public ExplanationOfBenefit_AddItemBuilder.Impl withModifierExtension(
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
    public ExplanationOfBenefit_AddItemBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ExplanationOfBenefit_AddItemBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param subDetailSequence */
    public ExplanationOfBenefit_AddItemBuilder.Impl withSubDetailSequence(
        @NonNull Integer... subDetailSequence) {
      this.subDetailSequence = Arrays.asList(subDetailSequence);
      return this;
    }
    /** @param subDetailSequence */
    public ExplanationOfBenefit_AddItemBuilder.Impl withSubDetailSequence(
        @NonNull Collection<Integer> subDetailSequence) {
      this.subDetailSequence = Collections.unmodifiableCollection(subDetailSequence);
      return this;
    }
    /** @param detail */
    public ExplanationOfBenefit_AddItemBuilder.Impl withDetail(
        @NonNull ExplanationOfBenefit$AddItem$Detail... detail) {
      this.detail = Arrays.asList(detail);
      return this;
    }
    /** @param detail */
    public ExplanationOfBenefit_AddItemBuilder.Impl withDetail(
        @NonNull Collection<ExplanationOfBenefit$AddItem$Detail> detail) {
      this.detail = Collections.unmodifiableCollection(detail);
      return this;
    }

    public ExplanationOfBenefit_AddItemBuilder.Impl withDetail(
        @NonNull ExplanationOfBenefit_AddItem_DetailBuilder... detail) {
      this.detail = Arrays.stream(detail).map(e -> e.build()).collect(toList());
      return this;
    }

    public ExplanationOfBenefit.AddItem build() {
      return new ExplanationOfBenefit.AddItem(
          OptionConverters.toScala(id),
          OptionConverters.toScala(net),
          OptionConverters.toScala(factor),
          subSite.stream().collect(new LitSeqJCollector<>()),
          provider.stream().collect(new LitSeqJCollector<>()),
          modifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(quantity),
          OptionConverters.toScala(bodySite),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(unitPrice),
          noteNumber.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          programCode.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(serviced),
          (Option) OptionConverters.toScala(location),
          itemSequence.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          adjudication.stream().collect(new LitSeqJCollector<>()),
          detailSequence.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          productOrService,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          subDetailSequence.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          detail.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
