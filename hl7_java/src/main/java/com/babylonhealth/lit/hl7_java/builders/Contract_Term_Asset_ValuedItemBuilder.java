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

public interface Contract_Term_Asset_ValuedItemBuilder {
  public Contract$Term$Asset$ValuedItem build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceCodeableConceptOrReference entity(CodeableConcept c) {
    return new ChoiceCodeableConceptOrReference(c);
  }

  public static ChoiceCodeableConceptOrReference entity(Reference r) {
    return new ChoiceCodeableConceptOrReference(r);
  }

  public class Impl implements Contract_Term_Asset_ValuedItemBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Money> net = Optional.empty();
    private Optional<BigDecimal> factor = Optional.empty();
    private Optional<BigDecimal> points = Optional.empty();
    private Collection<String> linkId = Collections.emptyList();
    private Optional<String> payment = Optional.empty();
    private Optional<Quantity> quantity = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceCodeableConceptOrReference> entity = Optional.empty();
    private Optional<Money> unitPrice = Optional.empty();
    private Optional<Reference> recipient = Optional.empty();
    private Optional<Identifier> identifier = Optional.empty();
    private Optional<FHIRDateTime> paymentDate = Optional.empty();
    private Optional<Reference> responsible = Optional.empty();
    private Optional<FHIRDateTime> effectiveTime = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Integer> securityLabelNumber = Collections.emptyList();

    /** Required fields for {@link Contract$Term$Asset$ValuedItem} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param net */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withNet(@NonNull Money net) {
      this.net = Optional.of(net);
      return this;
    }

    public Contract_Term_Asset_ValuedItemBuilder.Impl withNet(@NonNull MoneyBuilder net) {
      this.net = Optional.of(net.build());
      return this;
    }
    /** @param factor */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withFactor(@NonNull BigDecimal factor) {
      this.factor = Optional.of(factor);
      return this;
    }
    /** @param points */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withPoints(@NonNull BigDecimal points) {
      this.points = Optional.of(points);
      return this;
    }
    /** @param linkId */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withLinkId(@NonNull String... linkId) {
      this.linkId = Arrays.asList(linkId);
      return this;
    }
    /** @param linkId */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withLinkId(
        @NonNull Collection<String> linkId) {
      this.linkId = Collections.unmodifiableCollection(linkId);
      return this;
    }
    /** @param payment */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withPayment(@NonNull String payment) {
      this.payment = Optional.of(payment);
      return this;
    }
    /** @param quantity */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public Contract_Term_Asset_ValuedItemBuilder.Impl withQuantity(
        @NonNull QuantityBuilder quantity) {
      this.quantity = Optional.of(quantity.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withExtension(
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
    public Contract_Term_Asset_ValuedItemBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Contract_Term_Asset_ValuedItemBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param entity Field is a 'choice' field. Type should be one of CodeableConcept, Reference. To
     *     pass the value in, wrap with one of the Contract_Term_Asset_ValuedItemBuilder.entity
     *     static methods
     */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withEntity(
        @NonNull ChoiceCodeableConceptOrReference entity) {
      this.entity = Optional.of(entity);
      return this;
    }
    /** @param unitPrice */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withUnitPrice(@NonNull Money unitPrice) {
      this.unitPrice = Optional.of(unitPrice);
      return this;
    }

    public Contract_Term_Asset_ValuedItemBuilder.Impl withUnitPrice(
        @NonNull MoneyBuilder unitPrice) {
      this.unitPrice = Optional.of(unitPrice.build());
      return this;
    }
    /** @param recipient */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withRecipient(@NonNull Reference recipient) {
      this.recipient = Optional.of(recipient);
      return this;
    }

    public Contract_Term_Asset_ValuedItemBuilder.Impl withRecipient(
        @NonNull ReferenceBuilder recipient) {
      this.recipient = Optional.of(recipient.build());
      return this;
    }
    /**
     * @param identifier - Unique identifier for this Contract or a derivative that references a
     *     Source Contract.
     */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withIdentifier(
        @NonNull Identifier identifier) {
      this.identifier = Optional.of(identifier);
      return this;
    }

    public Contract_Term_Asset_ValuedItemBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder identifier) {
      this.identifier = Optional.of(identifier.build());
      return this;
    }
    /** @param paymentDate */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withPaymentDate(
        @NonNull FHIRDateTime paymentDate) {
      this.paymentDate = Optional.of(paymentDate);
      return this;
    }
    /** @param responsible */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withResponsible(
        @NonNull Reference responsible) {
      this.responsible = Optional.of(responsible);
      return this;
    }

    public Contract_Term_Asset_ValuedItemBuilder.Impl withResponsible(
        @NonNull ReferenceBuilder responsible) {
      this.responsible = Optional.of(responsible.build());
      return this;
    }
    /** @param effectiveTime */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withEffectiveTime(
        @NonNull FHIRDateTime effectiveTime) {
      this.effectiveTime = Optional.of(effectiveTime);
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
    public Contract_Term_Asset_ValuedItemBuilder.Impl withModifierExtension(
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
    public Contract_Term_Asset_ValuedItemBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Contract_Term_Asset_ValuedItemBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param securityLabelNumber */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withSecurityLabelNumber(
        @NonNull Integer... securityLabelNumber) {
      this.securityLabelNumber = Arrays.asList(securityLabelNumber);
      return this;
    }
    /** @param securityLabelNumber */
    public Contract_Term_Asset_ValuedItemBuilder.Impl withSecurityLabelNumber(
        @NonNull Collection<Integer> securityLabelNumber) {
      this.securityLabelNumber = Collections.unmodifiableCollection(securityLabelNumber);
      return this;
    }

    public Contract$Term$Asset$ValuedItem build() {
      return new Contract$Term$Asset$ValuedItem(
          OptionConverters.toScala(id),
          OptionConverters.toScala(net),
          OptionConverters.toScala(factor),
          OptionConverters.toScala(points),
          linkId.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(payment),
          OptionConverters.toScala(quantity),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(entity),
          OptionConverters.toScala(unitPrice),
          OptionConverters.toScala(recipient),
          OptionConverters.toScala(identifier),
          OptionConverters.toScala(paymentDate),
          OptionConverters.toScala(responsible),
          OptionConverters.toScala(effectiveTime),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          securityLabelNumber.stream()
              .map(x -> (Object) x)
              .collect(Collectors.toList())
              .stream()
              .collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
