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

public interface ChargeItemDefinition_PropertyGroupBuilder {
  public ChargeItemDefinition.PropertyGroup build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements ChargeItemDefinition_PropertyGroupBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<ChargeItemDefinition.Applicability> applicability = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<ChargeItemDefinition$PropertyGroup$PriceComponent> priceComponent =
        Collections.emptyList();

    /** Required fields for {@link ChargeItemDefinition.PropertyGroup} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ChargeItemDefinition_PropertyGroupBuilder.Impl withId(@NonNull String id) {
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
    public ChargeItemDefinition_PropertyGroupBuilder.Impl withExtension(
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
    public ChargeItemDefinition_PropertyGroupBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ChargeItemDefinition_PropertyGroupBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param applicability - Expressions that describe applicability criteria for the billing code.
     */
    public ChargeItemDefinition_PropertyGroupBuilder.Impl withApplicability(
        @NonNull ChargeItemDefinition.Applicability... applicability) {
      this.applicability = Arrays.asList(applicability);
      return this;
    }
    /**
     * @param applicability - Expressions that describe applicability criteria for the billing code.
     */
    public ChargeItemDefinition_PropertyGroupBuilder.Impl withApplicability(
        @NonNull Collection<ChargeItemDefinition.Applicability> applicability) {
      this.applicability = Collections.unmodifiableCollection(applicability);
      return this;
    }

    public ChargeItemDefinition_PropertyGroupBuilder.Impl withApplicability(
        @NonNull ChargeItemDefinition_ApplicabilityBuilder... applicability) {
      this.applicability = Arrays.stream(applicability).map(e -> e.build()).collect(toList());
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
    public ChargeItemDefinition_PropertyGroupBuilder.Impl withModifierExtension(
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
    public ChargeItemDefinition_PropertyGroupBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ChargeItemDefinition_PropertyGroupBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param priceComponent */
    public ChargeItemDefinition_PropertyGroupBuilder.Impl withPriceComponent(
        @NonNull ChargeItemDefinition$PropertyGroup$PriceComponent... priceComponent) {
      this.priceComponent = Arrays.asList(priceComponent);
      return this;
    }
    /** @param priceComponent */
    public ChargeItemDefinition_PropertyGroupBuilder.Impl withPriceComponent(
        @NonNull Collection<ChargeItemDefinition$PropertyGroup$PriceComponent> priceComponent) {
      this.priceComponent = Collections.unmodifiableCollection(priceComponent);
      return this;
    }

    public ChargeItemDefinition_PropertyGroupBuilder.Impl withPriceComponent(
        @NonNull ChargeItemDefinition_PropertyGroup_PriceComponentBuilder... priceComponent) {
      this.priceComponent = Arrays.stream(priceComponent).map(e -> e.build()).collect(toList());
      return this;
    }

    public ChargeItemDefinition.PropertyGroup build() {
      return new ChargeItemDefinition.PropertyGroup(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          applicability.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          priceComponent.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
