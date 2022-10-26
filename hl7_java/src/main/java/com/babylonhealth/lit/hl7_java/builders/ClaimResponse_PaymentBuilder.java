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
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface ClaimResponse_PaymentBuilder {
  public ClaimResponse.Payment build();

  public static Impl init(CodeableConcept _type, Money amount) {
    return new Impl(_type, amount);
  }

  public static Impl builder(CodeableConceptBuilder _type, MoneyBuilder amount) {
    return new Impl(_type.build(), amount.build());
  }

  public class Impl implements ClaimResponse_PaymentBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept _type;
    private Optional<FHIRDate> date = Optional.empty();
    private Money amount;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Money> adjustment = Optional.empty();
    private Optional<Identifier> identifier = Optional.empty();
    private Optional<CodeableConcept> adjustmentReason = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link ClaimResponse.Payment}
     *
     * @param _type - A finer grained suite of claim type codes which may convey additional
     *     information such as Inpatient vs Outpatient and/or a specialty service.
     * @param amount
     */
    public Impl(CodeableConcept _type, Money amount) {
      this._type = _type;
      this.amount = amount;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ClaimResponse_PaymentBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param date */
    public ClaimResponse_PaymentBuilder.Impl withDate(@NonNull FHIRDate date) {
      this.date = Optional.of(date);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ClaimResponse_PaymentBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ClaimResponse_PaymentBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ClaimResponse_PaymentBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param adjustment */
    public ClaimResponse_PaymentBuilder.Impl withAdjustment(@NonNull Money adjustment) {
      this.adjustment = Optional.of(adjustment);
      return this;
    }

    public ClaimResponse_PaymentBuilder.Impl withAdjustment(@NonNull MoneyBuilder adjustment) {
      this.adjustment = Optional.of(adjustment.build());
      return this;
    }
    /** @param identifier - A unique identifier assigned to this claim response. */
    public ClaimResponse_PaymentBuilder.Impl withIdentifier(@NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public ClaimResponse_PaymentBuilder.Impl withIdentifier(@NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }
    /** @param adjustmentReason */
    public ClaimResponse_PaymentBuilder.Impl withAdjustmentReason(
        @NonNull CodeableConcept adjustmentReason) {
      this.adjustmentReason = Optional.of(adjustmentReason);
      return this;
    }

    public ClaimResponse_PaymentBuilder.Impl withAdjustmentReason(
        @NonNull CodeableConceptBuilder adjustmentReason) {
      this.adjustmentReason = Optional.of(adjustmentReason.build());
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
    public ClaimResponse_PaymentBuilder.Impl withModifierExtension(
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
    public ClaimResponse_PaymentBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ClaimResponse_PaymentBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public ClaimResponse.Payment build() {
      return new ClaimResponse.Payment(
          OptionConverters.toScala(id),
          _type,
          OptionConverters.toScala(date),
          amount,
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(adjustment),
          OptionConverters.toScala(identifier),
          OptionConverters.toScala(adjustmentReason),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
