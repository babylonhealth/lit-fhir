package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.FM_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface PaymentNoticeBuilder extends DomainResourceBuilder {
  public PaymentNotice build();

  public static Impl init(
      FM_STATUS status,
      Money amount,
      FHIRDateTime created,
      Reference payment,
      Reference recipient) {
    return new Impl(status, amount, created, payment, recipient);
  }

  public static Impl builder(
      FM_STATUS status,
      MoneyBuilder amount,
      FHIRDateTime created,
      ReferenceBuilder payment,
      ReferenceBuilder recipient) {
    return new Impl(status, amount.build(), created, payment.build(), recipient.build());
  }

  public class Impl implements PaymentNoticeBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<Reference> payee = Optional.empty();
    private FM_STATUS status;
    private Money amount;
    private Optional<Reference> request = Optional.empty();
    private FHIRDateTime created;
    private Reference payment;
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<Reference> response = Optional.empty();
    private Optional<Reference> provider = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Reference recipient;
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<FHIRDate> paymentDate = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> paymentStatus = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link PaymentNotice}
     *
     * @param status - The status of the resource instance.
     * @param amount - The amount sent to the payee.
     * @param created - The date when this resource was created.
     * @param payment - A reference to the payment which is the subject of this notice.
     * @param recipient - The party who is notified of the payment status.
     */
    public Impl(
        FM_STATUS status,
        Money amount,
        FHIRDateTime created,
        Reference payment,
        Reference recipient) {
      this.status = status;
      this.amount = amount;
      this.created = created;
      this.payment = payment;
      this.recipient = recipient;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public PaymentNoticeBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public PaymentNoticeBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public PaymentNoticeBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
      this.meta = Optional.of(meta.build());
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public PaymentNoticeBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public PaymentNoticeBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param payee - The party who will receive or has received payment that is the subject of this
     *     notification.
     */
    public PaymentNoticeBuilder.Impl withPayee(@NonNull Reference payee) {
      this.payee = Optional.of(payee);
      return this;
    }

    public PaymentNoticeBuilder.Impl withPayee(@NonNull ReferenceBuilder payee) {
      this.payee = Optional.of(payee.build());
      return this;
    }
    /** @param request - Reference of resource for which payment is being made. */
    public PaymentNoticeBuilder.Impl withRequest(@NonNull Reference request) {
      this.request = Optional.of(request);
      return this;
    }

    public PaymentNoticeBuilder.Impl withRequest(@NonNull ReferenceBuilder request) {
      this.request = Optional.of(request.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public PaymentNoticeBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param response - Reference of response to resource for which payment is being made. */
    public PaymentNoticeBuilder.Impl withResponse(@NonNull Reference response) {
      this.response = Optional.of(response);
      return this;
    }

    public PaymentNoticeBuilder.Impl withResponse(@NonNull ReferenceBuilder response) {
      this.response = Optional.of(response.build());
      return this;
    }
    /**
     * @param provider - The practitioner who is responsible for the services rendered to the
     *     patient.
     */
    public PaymentNoticeBuilder.Impl withProvider(@NonNull Reference provider) {
      this.provider = Optional.of(provider);
      return this;
    }

    public PaymentNoticeBuilder.Impl withProvider(@NonNull ReferenceBuilder provider) {
      this.provider = Optional.of(provider.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public PaymentNoticeBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public PaymentNoticeBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public PaymentNoticeBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
      this.contained = Arrays.stream(contained).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public PaymentNoticeBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public PaymentNoticeBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public PaymentNoticeBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - A unique identifier assigned to this payment notice. */
    public PaymentNoticeBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - A unique identifier assigned to this payment notice. */
    public PaymentNoticeBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public PaymentNoticeBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param paymentDate - The date when the above payment action occurred. */
    public PaymentNoticeBuilder.Impl withPaymentDate(@NonNull FHIRDate paymentDate) {
      this.paymentDate = Optional.of(paymentDate);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public PaymentNoticeBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param paymentStatus - A code indicating whether payment has been sent or cleared. */
    public PaymentNoticeBuilder.Impl withPaymentStatus(@NonNull CodeableConcept paymentStatus) {
      this.paymentStatus = Optional.of(paymentStatus);
      return this;
    }

    public PaymentNoticeBuilder.Impl withPaymentStatus(
        @NonNull CodeableConceptBuilder paymentStatus) {
      this.paymentStatus = Optional.of(paymentStatus.build());
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
    public PaymentNoticeBuilder.Impl withModifierExtension(
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
    public PaymentNoticeBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public PaymentNoticeBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public PaymentNoticeBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public PaymentNotice build() {
      return new PaymentNotice(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(payee),
          status,
          amount,
          OptionConverters.toScala(request),
          created,
          payment,
          OptionConverters.toScala(language),
          OptionConverters.toScala(response),
          OptionConverters.toScala(provider),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          recipient,
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(paymentDate),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(paymentStatus),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
