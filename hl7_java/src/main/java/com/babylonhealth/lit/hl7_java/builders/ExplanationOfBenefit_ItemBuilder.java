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

public interface ExplanationOfBenefit_ItemBuilder {
  public ExplanationOfBenefit.Item build();

  public static Impl init(Integer sequence, CodeableConcept productOrService) {
    return new Impl(sequence, productOrService);
  }

  public static Impl builder(Integer sequence, CodeableConceptBuilder productOrService) {
    return new Impl(sequence, productOrService.build());
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

  public class Impl implements ExplanationOfBenefit_ItemBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Money> net = Optional.empty();
    private Collection<Reference> udi = Collections.emptyList();
    private Optional<BigDecimal> factor = Optional.empty();
    private Optional<CodeableConcept> revenue = Optional.empty();
    private Collection<CodeableConcept> subSite = Collections.emptyList();
    private Integer sequence;
    private Optional<CodeableConcept> category = Optional.empty();
    private Collection<CodeableConcept> modifier = Collections.emptyList();
    private Optional<Quantity> quantity = Optional.empty();
    private Optional<CodeableConcept> bodySite = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Money> unitPrice = Optional.empty();
    private Collection<Reference> encounter = Collections.emptyList();
    private Collection<Integer> noteNumber = Collections.emptyList();
    private Collection<CodeableConcept> programCode = Collections.emptyList();
    private Optional<ChoiceDateOrPeriod> serviced = Optional.empty();
    private Optional<ChoiceAddressOrCodeableConceptOrReference> location = Optional.empty();
    private Collection<Integer> careTeamSequence = Collections.emptyList();
    private CodeableConcept productOrService;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Integer> diagnosisSequence = Collections.emptyList();
    private Collection<Integer> procedureSequence = Collections.emptyList();
    private Collection<Integer> informationSequence = Collections.emptyList();
    private Collection<ExplanationOfBenefit$Item$Adjudication> adjudication =
        Collections.emptyList();
    private Collection<ExplanationOfBenefit$Item$Detail> detail = Collections.emptyList();

    /**
     * Required fields for {@link ExplanationOfBenefit.Item}
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
    public ExplanationOfBenefit_ItemBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param net */
    public ExplanationOfBenefit_ItemBuilder.Impl withNet(@NonNull Money net) {
      this.net = Optional.of(net);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withNet(@NonNull MoneyBuilder net) {
      this.net = Optional.of(net.build());
      return this;
    }
    /** @param udi */
    public ExplanationOfBenefit_ItemBuilder.Impl withUdi(@NonNull Reference... udi) {
      this.udi = Arrays.asList(udi);
      return this;
    }
    /** @param udi */
    public ExplanationOfBenefit_ItemBuilder.Impl withUdi(@NonNull Collection<Reference> udi) {
      this.udi = Collections.unmodifiableCollection(udi);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withUdi(@NonNull ReferenceBuilder... udi) {
      this.udi = Arrays.stream(udi).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param factor */
    public ExplanationOfBenefit_ItemBuilder.Impl withFactor(@NonNull BigDecimal factor) {
      this.factor = Optional.of(factor);
      return this;
    }
    /** @param revenue */
    public ExplanationOfBenefit_ItemBuilder.Impl withRevenue(@NonNull CodeableConcept revenue) {
      this.revenue = Optional.of(revenue);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withRevenue(
        @NonNull CodeableConceptBuilder revenue) {
      this.revenue = Optional.of(revenue.build());
      return this;
    }
    /** @param subSite */
    public ExplanationOfBenefit_ItemBuilder.Impl withSubSite(@NonNull CodeableConcept... subSite) {
      this.subSite = Arrays.asList(subSite);
      return this;
    }
    /** @param subSite */
    public ExplanationOfBenefit_ItemBuilder.Impl withSubSite(
        @NonNull Collection<CodeableConcept> subSite) {
      this.subSite = Collections.unmodifiableCollection(subSite);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withSubSite(
        @NonNull CodeableConceptBuilder... subSite) {
      this.subSite = Arrays.stream(subSite).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param category */
    public ExplanationOfBenefit_ItemBuilder.Impl withCategory(@NonNull CodeableConcept category) {
      this.category = Optional.of(category);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withCategory(
        @NonNull CodeableConceptBuilder category) {
      this.category = Optional.of(category.build());
      return this;
    }
    /** @param modifier */
    public ExplanationOfBenefit_ItemBuilder.Impl withModifier(
        @NonNull CodeableConcept... modifier) {
      this.modifier = Arrays.asList(modifier);
      return this;
    }
    /** @param modifier */
    public ExplanationOfBenefit_ItemBuilder.Impl withModifier(
        @NonNull Collection<CodeableConcept> modifier) {
      this.modifier = Collections.unmodifiableCollection(modifier);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withModifier(
        @NonNull CodeableConceptBuilder... modifier) {
      this.modifier = Arrays.stream(modifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param quantity */
    public ExplanationOfBenefit_ItemBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withQuantity(@NonNull QuantityBuilder quantity) {
      this.quantity = Optional.of(quantity.build());
      return this;
    }
    /** @param bodySite */
    public ExplanationOfBenefit_ItemBuilder.Impl withBodySite(@NonNull CodeableConcept bodySite) {
      this.bodySite = Optional.of(bodySite);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withBodySite(
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
    public ExplanationOfBenefit_ItemBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ExplanationOfBenefit_ItemBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param unitPrice */
    public ExplanationOfBenefit_ItemBuilder.Impl withUnitPrice(@NonNull Money unitPrice) {
      this.unitPrice = Optional.of(unitPrice);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withUnitPrice(@NonNull MoneyBuilder unitPrice) {
      this.unitPrice = Optional.of(unitPrice.build());
      return this;
    }
    /** @param encounter */
    public ExplanationOfBenefit_ItemBuilder.Impl withEncounter(@NonNull Reference... encounter) {
      this.encounter = Arrays.asList(encounter);
      return this;
    }
    /** @param encounter */
    public ExplanationOfBenefit_ItemBuilder.Impl withEncounter(
        @NonNull Collection<Reference> encounter) {
      this.encounter = Collections.unmodifiableCollection(encounter);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withEncounter(
        @NonNull ReferenceBuilder... encounter) {
      this.encounter = Arrays.stream(encounter).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param noteNumber */
    public ExplanationOfBenefit_ItemBuilder.Impl withNoteNumber(@NonNull Integer... noteNumber) {
      this.noteNumber = Arrays.asList(noteNumber);
      return this;
    }
    /** @param noteNumber */
    public ExplanationOfBenefit_ItemBuilder.Impl withNoteNumber(
        @NonNull Collection<Integer> noteNumber) {
      this.noteNumber = Collections.unmodifiableCollection(noteNumber);
      return this;
    }
    /** @param programCode */
    public ExplanationOfBenefit_ItemBuilder.Impl withProgramCode(
        @NonNull CodeableConcept... programCode) {
      this.programCode = Arrays.asList(programCode);
      return this;
    }
    /** @param programCode */
    public ExplanationOfBenefit_ItemBuilder.Impl withProgramCode(
        @NonNull Collection<CodeableConcept> programCode) {
      this.programCode = Collections.unmodifiableCollection(programCode);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withProgramCode(
        @NonNull CodeableConceptBuilder... programCode) {
      this.programCode = Arrays.stream(programCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param serviced Field is a 'choice' field. Type should be one of FHIRDate, Period. To pass
     *     the value in, wrap with one of the ExplanationOfBenefit_ItemBuilder.serviced static
     *     methods
     */
    public ExplanationOfBenefit_ItemBuilder.Impl withServiced(
        @NonNull ChoiceDateOrPeriod serviced) {
      this.serviced = Optional.of(serviced);
      return this;
    }
    /**
     * @param location Field is a 'choice' field. Type should be one of Address, CodeableConcept,
     *     Reference. To pass the value in, wrap with one of the
     *     ExplanationOfBenefit_ItemBuilder.location static methods
     */
    public ExplanationOfBenefit_ItemBuilder.Impl withLocation(
        @NonNull ChoiceAddressOrCodeableConceptOrReference location) {
      this.location = Optional.of(location);
      return this;
    }
    /** @param careTeamSequence */
    public ExplanationOfBenefit_ItemBuilder.Impl withCareTeamSequence(
        @NonNull Integer... careTeamSequence) {
      this.careTeamSequence = Arrays.asList(careTeamSequence);
      return this;
    }
    /** @param careTeamSequence */
    public ExplanationOfBenefit_ItemBuilder.Impl withCareTeamSequence(
        @NonNull Collection<Integer> careTeamSequence) {
      this.careTeamSequence = Collections.unmodifiableCollection(careTeamSequence);
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
    public ExplanationOfBenefit_ItemBuilder.Impl withModifierExtension(
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
    public ExplanationOfBenefit_ItemBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param diagnosisSequence */
    public ExplanationOfBenefit_ItemBuilder.Impl withDiagnosisSequence(
        @NonNull Integer... diagnosisSequence) {
      this.diagnosisSequence = Arrays.asList(diagnosisSequence);
      return this;
    }
    /** @param diagnosisSequence */
    public ExplanationOfBenefit_ItemBuilder.Impl withDiagnosisSequence(
        @NonNull Collection<Integer> diagnosisSequence) {
      this.diagnosisSequence = Collections.unmodifiableCollection(diagnosisSequence);
      return this;
    }
    /** @param procedureSequence */
    public ExplanationOfBenefit_ItemBuilder.Impl withProcedureSequence(
        @NonNull Integer... procedureSequence) {
      this.procedureSequence = Arrays.asList(procedureSequence);
      return this;
    }
    /** @param procedureSequence */
    public ExplanationOfBenefit_ItemBuilder.Impl withProcedureSequence(
        @NonNull Collection<Integer> procedureSequence) {
      this.procedureSequence = Collections.unmodifiableCollection(procedureSequence);
      return this;
    }
    /** @param informationSequence */
    public ExplanationOfBenefit_ItemBuilder.Impl withInformationSequence(
        @NonNull Integer... informationSequence) {
      this.informationSequence = Arrays.asList(informationSequence);
      return this;
    }
    /** @param informationSequence */
    public ExplanationOfBenefit_ItemBuilder.Impl withInformationSequence(
        @NonNull Collection<Integer> informationSequence) {
      this.informationSequence = Collections.unmodifiableCollection(informationSequence);
      return this;
    }
    /**
     * @param adjudication - The adjudication results which are presented at the header level rather
     *     than at the line-item or add-item levels.
     */
    public ExplanationOfBenefit_ItemBuilder.Impl withAdjudication(
        @NonNull ExplanationOfBenefit$Item$Adjudication... adjudication) {
      this.adjudication = Arrays.asList(adjudication);
      return this;
    }
    /**
     * @param adjudication - The adjudication results which are presented at the header level rather
     *     than at the line-item or add-item levels.
     */
    public ExplanationOfBenefit_ItemBuilder.Impl withAdjudication(
        @NonNull Collection<ExplanationOfBenefit$Item$Adjudication> adjudication) {
      this.adjudication = Collections.unmodifiableCollection(adjudication);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withAdjudication(
        @NonNull ExplanationOfBenefit_Item_AdjudicationBuilder... adjudication) {
      this.adjudication = Arrays.stream(adjudication).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param detail */
    public ExplanationOfBenefit_ItemBuilder.Impl withDetail(
        @NonNull ExplanationOfBenefit$Item$Detail... detail) {
      this.detail = Arrays.asList(detail);
      return this;
    }
    /** @param detail */
    public ExplanationOfBenefit_ItemBuilder.Impl withDetail(
        @NonNull Collection<ExplanationOfBenefit$Item$Detail> detail) {
      this.detail = Collections.unmodifiableCollection(detail);
      return this;
    }

    public ExplanationOfBenefit_ItemBuilder.Impl withDetail(
        @NonNull ExplanationOfBenefit_Item_DetailBuilder... detail) {
      this.detail = Arrays.stream(detail).map(e -> e.build()).collect(toList());
      return this;
    }

    public ExplanationOfBenefit.Item build() {
      return new ExplanationOfBenefit.Item(
          OptionConverters.toScala(id),
          OptionConverters.toScala(net),
          udi.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(factor),
          OptionConverters.toScala(revenue),
          subSite.stream().collect(new LitSeqJCollector<>()),
          sequence,
          OptionConverters.toScala(category),
          modifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(quantity),
          OptionConverters.toScala(bodySite),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(unitPrice),
          encounter.stream().collect(new LitSeqJCollector<>()),
          noteNumber.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          programCode.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(serviced),
          (Option) OptionConverters.toScala(location),
          careTeamSequence.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          productOrService,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          diagnosisSequence.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          procedureSequence.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          informationSequence.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          adjudication.stream().collect(new LitSeqJCollector<>()),
          detail.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
