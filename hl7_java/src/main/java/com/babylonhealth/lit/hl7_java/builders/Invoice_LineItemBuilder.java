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

public interface Invoice_LineItemBuilder {
  public Invoice.LineItem build();

  public static Impl init(@NonNull ChoiceCodeableConceptOrReference chargeItem) {
    return new Impl(chargeItem);
  }

  public static Impl builder(@NonNull ChoiceCodeableConceptOrReference chargeItem) {
    return new Impl(chargeItem);
  }

  public static ChoiceCodeableConceptOrReference chargeItem(CodeableConcept c) {
    return new ChoiceCodeableConceptOrReference(c);
  }

  public static ChoiceCodeableConceptOrReference chargeItem(Reference r) {
    return new ChoiceCodeableConceptOrReference(r);
  }

  public class Impl implements Invoice_LineItemBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Integer> sequence = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private ChoiceCodeableConceptOrReference chargeItem;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Invoice$LineItem$PriceComponent> priceComponent = Collections.emptyList();

    /**
     * Required fields for {@link Invoice.LineItem}
     *
     * @param chargeItem Field is a 'choice' field. Type should be one of CodeableConcept,
     *     Reference. To pass the value in, wrap with one of the Invoice_LineItemBuilder.chargeItem
     *     static methods
     */
    public Impl(@NonNull ChoiceCodeableConceptOrReference chargeItem) {
      this.chargeItem = chargeItem;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Invoice_LineItemBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param sequence */
    public Invoice_LineItemBuilder.Impl withSequence(@NonNull Integer sequence) {
      this.sequence = Optional.of(sequence);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Invoice_LineItemBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Invoice_LineItemBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Invoice_LineItemBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
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
    public Invoice_LineItemBuilder.Impl withModifierExtension(
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
    public Invoice_LineItemBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Invoice_LineItemBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param priceComponent */
    public Invoice_LineItemBuilder.Impl withPriceComponent(
        @NonNull Invoice$LineItem$PriceComponent... priceComponent) {
      this.priceComponent = Arrays.asList(priceComponent);
      return this;
    }
    /** @param priceComponent */
    public Invoice_LineItemBuilder.Impl withPriceComponent(
        @NonNull Collection<Invoice$LineItem$PriceComponent> priceComponent) {
      this.priceComponent = Collections.unmodifiableCollection(priceComponent);
      return this;
    }

    public Invoice_LineItemBuilder.Impl withPriceComponent(
        @NonNull Invoice_LineItem_PriceComponentBuilder... priceComponent) {
      this.priceComponent = Arrays.stream(priceComponent).map(e -> e.build()).collect(toList());
      return this;
    }

    public Invoice.LineItem build() {
      return new Invoice.LineItem(
          OptionConverters.toScala(id),
          OptionConverters.toScala(sequence.map(x -> (Object) x)),
          extension.stream().collect(new LitSeqJCollector<>()),
          chargeItem,
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          priceComponent.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
