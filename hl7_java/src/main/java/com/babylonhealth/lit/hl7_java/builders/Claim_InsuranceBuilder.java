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

public interface Claim_InsuranceBuilder {
  public Claim.Insurance build();

  public static Impl init(Boolean focal, Integer sequence, Reference coverage) {
    return new Impl(focal, sequence, coverage);
  }

  public static Impl builder(Boolean focal, Integer sequence, ReferenceBuilder coverage) {
    return new Impl(focal, sequence, coverage.build());
  }

  public class Impl implements Claim_InsuranceBuilder {
    private Optional<String> id = Optional.empty();
    private Boolean focal;
    private Integer sequence;
    private Reference coverage;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Identifier> identifier = Optional.empty();
    private Collection<String> preAuthRef = Collections.emptyList();
    private Optional<Reference> claimResponse = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<String> businessArrangement = Optional.empty();

    /**
     * Required fields for {@link Claim.Insurance}
     *
     * @param focal
     * @param sequence
     * @param coverage
     */
    public Impl(Boolean focal, Integer sequence, Reference coverage) {
      this.focal = focal;
      this.sequence = sequence;
      this.coverage = coverage;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Claim_InsuranceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Claim_InsuranceBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Claim_InsuranceBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Claim_InsuranceBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - A unique identifier assigned to this claim. */
    public Claim_InsuranceBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public Claim_InsuranceBuilder.Impl withIdentifier(@NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }
    /** @param preAuthRef */
    public Claim_InsuranceBuilder.Impl withPreAuthRef(@NonNull String... preAuthRef) {
      this.preAuthRef = Arrays.asList(preAuthRef);
      return this;
    }
    /** @param preAuthRef */
    public Claim_InsuranceBuilder.Impl withPreAuthRef(@NonNull Collection<String> preAuthRef) {
      this.preAuthRef = Collections.unmodifiableCollection(preAuthRef);
      return this;
    }
    /** @param claimResponse */
    public Claim_InsuranceBuilder.Impl withClaimResponse(@NonNull Reference claimResponse) {
      this.claimResponse = Optional.of(claimResponse);
      return this;
    }

    public Claim_InsuranceBuilder.Impl withClaimResponse(@NonNull ReferenceBuilder claimResponse) {
      this.claimResponse = Optional.of(claimResponse.build());
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
    public Claim_InsuranceBuilder.Impl withModifierExtension(
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
    public Claim_InsuranceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Claim_InsuranceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param businessArrangement */
    public Claim_InsuranceBuilder.Impl withBusinessArrangement(
        @NonNull String businessArrangement) {
      this.businessArrangement = Optional.of(businessArrangement);
      return this;
    }

    public Claim.Insurance build() {
      return new Claim.Insurance(
          OptionConverters.toScala(id),
          focal,
          sequence,
          coverage,
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(identifier),
          preAuthRef.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(claimResponse),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(businessArrangement),
          LitUtils.emptyMetaElMap());
    }
  }
}
