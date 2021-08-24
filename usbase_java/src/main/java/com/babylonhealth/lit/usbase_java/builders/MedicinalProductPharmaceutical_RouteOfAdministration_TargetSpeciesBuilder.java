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

public interface MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpeciesBuilder {
  public MedicinalProductPharmaceutical$RouteOfAdministration$TargetSpecies build();

  public static Impl init(CodeableConcept code) {
    return new Impl(code);
  }

  public static Impl builder(CodeableConceptBuilder code) {
    return new Impl(code.build());
  }

  public class Impl
      implements MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpeciesBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept code;
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<
            MedicinalProductPharmaceutical$RouteOfAdministration$TargetSpecies$WithdrawalPeriod>
        withdrawalPeriod = Collections.emptyList();

    /**
     * Required fields for {@link
     * MedicinalProductPharmaceutical$RouteOfAdministration$TargetSpecies}
     *
     * @param code
     */
    public Impl(CodeableConcept code) {
      this.code = code;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpeciesBuilder.Impl withId(
        @NonNull String id) {
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
    public MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpeciesBuilder.Impl
        withExtension(@NonNull Extension... extension) {
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
    public MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpeciesBuilder.Impl
        withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpeciesBuilder.Impl
        withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
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
    public MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpeciesBuilder.Impl
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
    public MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpeciesBuilder.Impl
        withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpeciesBuilder.Impl
        withModifierExtension(@NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param withdrawalPeriod */
    public MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpeciesBuilder.Impl
        withWithdrawalPeriod(
            @NonNull
                MedicinalProductPharmaceutical$RouteOfAdministration$TargetSpecies$WithdrawalPeriod
                        ...
                    withdrawalPeriod) {
      this.withdrawalPeriod = Arrays.asList(withdrawalPeriod);
      return this;
    }
    /** @param withdrawalPeriod */
    public MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpeciesBuilder.Impl
        withWithdrawalPeriod(
            @NonNull
                Collection<
                        MedicinalProductPharmaceutical$RouteOfAdministration$TargetSpecies$WithdrawalPeriod>
                    withdrawalPeriod) {
      this.withdrawalPeriod = Collections.unmodifiableCollection(withdrawalPeriod);
      return this;
    }

    public MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpeciesBuilder.Impl
        withWithdrawalPeriod(
            @NonNull
                MedicinalProductPharmaceutical_RouteOfAdministration_TargetSpecies_WithdrawalPeriodBuilder
                        ...
                    withdrawalPeriod) {
      this.withdrawalPeriod = Arrays.stream(withdrawalPeriod).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicinalProductPharmaceutical$RouteOfAdministration$TargetSpecies build() {
      return new MedicinalProductPharmaceutical$RouteOfAdministration$TargetSpecies(
          OptionConverters.toScala(id),
          code,
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          withdrawalPeriod.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
