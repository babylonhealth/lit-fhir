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

public interface CoverageEligibilityResponse_InsuranceBuilder {
  public CoverageEligibilityResponse.Insurance build();

  public static Impl init(Reference coverage) {
    return new Impl(coverage);
  }

  public static Impl builder(ReferenceBuilder coverage) {
    return new Impl(coverage.build());
  }

  public class Impl implements CoverageEligibilityResponse_InsuranceBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Boolean> inforce = Optional.empty();
    private Reference coverage;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Period> benefitPeriod = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<CoverageEligibilityResponse$Insurance$Item> item = Collections.emptyList();

    /**
     * Required fields for {@link CoverageEligibilityResponse.Insurance}
     *
     * @param coverage
     */
    public Impl(Reference coverage) {
      this.coverage = coverage;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CoverageEligibilityResponse_InsuranceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param inforce */
    public CoverageEligibilityResponse_InsuranceBuilder.Impl withInforce(@NonNull Boolean inforce) {
      this.inforce = Optional.of(inforce);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public CoverageEligibilityResponse_InsuranceBuilder.Impl withExtension(
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
    public CoverageEligibilityResponse_InsuranceBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CoverageEligibilityResponse_InsuranceBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param benefitPeriod */
    public CoverageEligibilityResponse_InsuranceBuilder.Impl withBenefitPeriod(
        @NonNull Period benefitPeriod) {
      this.benefitPeriod = Optional.of(benefitPeriod);
      return this;
    }

    public CoverageEligibilityResponse_InsuranceBuilder.Impl withBenefitPeriod(
        @NonNull PeriodBuilder benefitPeriod) {
      this.benefitPeriod = Optional.of(benefitPeriod.build());
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
    public CoverageEligibilityResponse_InsuranceBuilder.Impl withModifierExtension(
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
    public CoverageEligibilityResponse_InsuranceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public CoverageEligibilityResponse_InsuranceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param item */
    public CoverageEligibilityResponse_InsuranceBuilder.Impl withItem(
        @NonNull CoverageEligibilityResponse$Insurance$Item... item) {
      this.item = Arrays.asList(item);
      return this;
    }
    /** @param item */
    public CoverageEligibilityResponse_InsuranceBuilder.Impl withItem(
        @NonNull Collection<CoverageEligibilityResponse$Insurance$Item> item) {
      this.item = Collections.unmodifiableCollection(item);
      return this;
    }

    public CoverageEligibilityResponse_InsuranceBuilder.Impl withItem(
        @NonNull CoverageEligibilityResponse_Insurance_ItemBuilder... item) {
      this.item = Arrays.stream(item).map(e -> e.build()).collect(toList());
      return this;
    }

    public CoverageEligibilityResponse.Insurance build() {
      return new CoverageEligibilityResponse.Insurance(
          OptionConverters.toScala(id),
          OptionConverters.toScala(inforce.map(x -> (Object) x)),
          coverage,
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(benefitPeriod),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          item.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
