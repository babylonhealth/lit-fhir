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

public interface MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder {
  public MedicinalProductAuthorization.JurisdictionalAuthorization build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> country = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Optional<Period> validityPeriod = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> legalStatusOfSupply = Optional.empty();

    /** Required fields for {@link MedicinalProductAuthorization.JurisdictionalAuthorization} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl withId(
        @NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param country - The country in which the marketing authorization has been granted. */
    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl withCountry(
        @NonNull CodeableConcept country) {
      this.country = Optional.of(country);
      return this;
    }

    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl withCountry(
        @NonNull CodeableConceptBuilder country) {
      this.country = Optional.of(country.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl withExtension(
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
    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Business identifier for the marketing authorization, as assigned by a
     *     regulator.
     */
    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl withIdentifier(
        @NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Business identifier for the marketing authorization, as assigned by a
     *     regulator.
     */
    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param jurisdiction - Jurisdiction within a country. */
    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl withJurisdiction(
        @NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /** @param jurisdiction - Jurisdiction within a country. */
    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl withJurisdiction(
        @NonNull Collection<CodeableConcept> jurisdiction) {
      this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
      return this;
    }

    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl withJurisdiction(
        @NonNull CodeableConceptBuilder... jurisdiction) {
      this.jurisdiction = Arrays.stream(jurisdiction).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param validityPeriod - The beginning of the time period in which the marketing authorization
     *     is in the specific status shall be specified A complete date consisting of day, month and
     *     year shall be specified using the ISO 8601 date format.
     */
    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl withValidityPeriod(
        @NonNull Period validityPeriod) {
      this.validityPeriod = Optional.of(validityPeriod);
      return this;
    }

    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl withValidityPeriod(
        @NonNull PeriodBuilder validityPeriod) {
      this.validityPeriod = Optional.of(validityPeriod.build());
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
    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl
        withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl
        withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl
        withModifierExtension(@NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param legalStatusOfSupply */
    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl
        withLegalStatusOfSupply(@NonNull CodeableConcept legalStatusOfSupply) {
      this.legalStatusOfSupply = Optional.of(legalStatusOfSupply);
      return this;
    }

    public MedicinalProductAuthorization_JurisdictionalAuthorizationBuilder.Impl
        withLegalStatusOfSupply(@NonNull CodeableConceptBuilder legalStatusOfSupply) {
      this.legalStatusOfSupply = Optional.of(legalStatusOfSupply.build());
      return this;
    }

    public MedicinalProductAuthorization.JurisdictionalAuthorization build() {
      return new MedicinalProductAuthorization.JurisdictionalAuthorization(
          OptionConverters.toScala(id),
          OptionConverters.toScala(country),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          jurisdiction.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(validityPeriod),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(legalStatusOfSupply),
          LitUtils.emptyMetaElMap());
    }
  }
}
