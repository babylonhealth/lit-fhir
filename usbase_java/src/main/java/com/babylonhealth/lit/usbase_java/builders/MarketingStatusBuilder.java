package com.babylonhealth.lit.usbase_java.builders;

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
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface MarketingStatusBuilder extends BackboneElementBuilder {
  public MarketingStatus build();

  public static Impl init(CodeableConcept status, CodeableConcept country, Period dateRange) {
    return new Impl(status, country, dateRange);
  }

  public static Impl builder(
      CodeableConceptBuilder status, CodeableConceptBuilder country, PeriodBuilder dateRange) {
    return new Impl(status.build(), country.build(), dateRange.build());
  }

  public class Impl implements MarketingStatusBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept status;
    private CodeableConcept country;
    private Collection<Extension> extension = Collections.emptyList();
    private Period dateRange;
    private Optional<FHIRDateTime> restoreDate = Optional.empty();
    private Optional<CodeableConcept> jurisdiction = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link MarketingStatus}
     *
     * @param status - This attribute provides information on the status of the marketing of the
     *     medicinal product See ISO/TS 20443 for more information and examples.
     * @param country - The country in which the marketing authorisation has been granted shall be
     *     specified It should be specified using the ISO 3166 ‑ 1 alpha-2 code elements.
     * @param dateRange - The date when the Medicinal Product is placed on the market by the
     *     Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a
     *     country and/or jurisdiction shall be provided A complete date consisting of day, month
     *     and year shall be specified using the ISO 8601 date format NOTE “Placed on the market”
     *     refers to the release of the Medicinal Product into the distribution chain.
     */
    public Impl(CodeableConcept status, CodeableConcept country, Period dateRange) {
      this.status = status;
      this.country = country;
      this.dateRange = dateRange;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public MarketingStatusBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public MarketingStatusBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public MarketingStatusBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param restoreDate - The date when the Medicinal Product is placed on the market by the
     *     Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a
     *     country and/or jurisdiction shall be provided A complete date consisting of day, month
     *     and year shall be specified using the ISO 8601 date format NOTE “Placed on the market”
     *     refers to the release of the Medicinal Product into the distribution chain.
     */
    public MarketingStatusBuilder.Impl withRestoreDate(@NonNull FHIRDateTime restoreDate) {
      this.restoreDate = Optional.of(restoreDate);
      return this;
    }
    /**
     * @param jurisdiction - Where a Medicines Regulatory Agency has granted a marketing
     *     authorisation for which specific provisions within a jurisdiction apply, the jurisdiction
     *     can be specified using an appropriate controlled terminology The controlled term and the
     *     controlled term identifier shall be specified.
     */
    public MarketingStatusBuilder.Impl withJurisdiction(@NonNull CodeableConcept jurisdiction) {
      this.jurisdiction = Optional.of(jurisdiction);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the element and that modifies the understanding of the element
     *     in which it is contained and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer can define an extension, there
     *     is a set of requirements that SHALL be met as part of the definition of the extension.
     *     Applications processing a resource are required to check for modifier extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public MarketingStatusBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the element and that modifies the understanding of the element
     *     in which it is contained and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer can define an extension, there
     *     is a set of requirements that SHALL be met as part of the definition of the extension.
     *     Applications processing a resource are required to check for modifier extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public MarketingStatusBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MarketingStatus build() {
      return new MarketingStatus(
          OptionConverters.toScala(id),
          status,
          country,
          extension.stream().collect(new LitSeqJCollector<>()),
          dateRange,
          OptionConverters.toScala(restoreDate),
          OptionConverters.toScala(jurisdiction),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
