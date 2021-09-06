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

public interface MedicationRequest_DispenseRequestBuilder {
  public MedicationRequest.DispenseRequest build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements MedicationRequest_DispenseRequestBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Quantity> quantity = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> performer = Optional.empty();
    private Optional<Period> validityPeriod = Optional.empty();
    private Optional<Duration> dispenseInterval = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Integer> numberOfRepeatsAllowed = Optional.empty();
    private Optional<Duration> expectedSupplyDuration = Optional.empty();
    private Optional<MedicationRequest$DispenseRequest$InitialFill> initialFill = Optional.empty();

    /** Required fields for {@link MedicationRequest.DispenseRequest} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicationRequest_DispenseRequestBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param quantity */
    public MedicationRequest_DispenseRequestBuilder.Impl withQuantity(@NonNull Quantity quantity) {
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
    public MedicationRequest_DispenseRequestBuilder.Impl withExtension(
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
    public MedicationRequest_DispenseRequestBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param performer - The specified desired performer of the medication treatment (e.g. the
     *     performer of the medication administration).
     */
    public MedicationRequest_DispenseRequestBuilder.Impl withPerformer(
        @NonNull Reference performer) {
      this.performer = Optional.of(performer);
      return this;
    }
    /** @param validityPeriod */
    public MedicationRequest_DispenseRequestBuilder.Impl withValidityPeriod(
        @NonNull Period validityPeriod) {
      this.validityPeriod = Optional.of(validityPeriod);
      return this;
    }
    /** @param dispenseInterval */
    public MedicationRequest_DispenseRequestBuilder.Impl withDispenseInterval(
        @NonNull Duration dispenseInterval) {
      this.dispenseInterval = Optional.of(dispenseInterval);
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
    public MedicationRequest_DispenseRequestBuilder.Impl withModifierExtension(
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
    public MedicationRequest_DispenseRequestBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /** @param numberOfRepeatsAllowed */
    public MedicationRequest_DispenseRequestBuilder.Impl withNumberOfRepeatsAllowed(
        @NonNull Integer numberOfRepeatsAllowed) {
      this.numberOfRepeatsAllowed = Optional.of(numberOfRepeatsAllowed);
      return this;
    }
    /** @param expectedSupplyDuration */
    public MedicationRequest_DispenseRequestBuilder.Impl withExpectedSupplyDuration(
        @NonNull Duration expectedSupplyDuration) {
      this.expectedSupplyDuration = Optional.of(expectedSupplyDuration);
      return this;
    }
    /** @param initialFill */
    public MedicationRequest_DispenseRequestBuilder.Impl withInitialFill(
        @NonNull MedicationRequest$DispenseRequest$InitialFill initialFill) {
      this.initialFill = Optional.of(initialFill);
      return this;
    }

    public MedicationRequest.DispenseRequest build() {
      return new MedicationRequest.DispenseRequest(
          OptionConverters.toScala(id),
          OptionConverters.toScala(quantity),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(performer),
          OptionConverters.toScala(validityPeriod),
          OptionConverters.toScala(dispenseInterval),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(numberOfRepeatsAllowed.map(x -> (Object) x)),
          OptionConverters.toScala(expectedSupplyDuration),
          OptionConverters.toScala(initialFill),
          LitUtils.emptyMetaElMap());
    }
  }
}
