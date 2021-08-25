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
import com.babylonhealth.lit.hl7.INVOICE_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface InvoiceBuilder extends DomainResourceBuilder {
  public Invoice build();

  public static Impl init(INVOICE_STATUS status) {
    return new Impl(status);
  }

  public static Impl builder(INVOICE_STATUS status) {
    return new Impl(status);
  }

  public class Impl implements InvoiceBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<FHIRDateTime> date = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private INVOICE_STATUS status;
    private Optional<Reference> issuer = Optional.empty();
    private Optional<Reference> subject = Optional.empty();
    private Optional<Reference> account = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<Money> totalNet = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> recipient = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<Money> totalGross = Optional.empty();
    private Optional<String> paymentTerms = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<String> cancelledReason = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Invoice$LineItem$PriceComponent> totalPriceComponent =
        Collections.emptyList();
    private Collection<Invoice.Participant> participant = Collections.emptyList();
    private Collection<Invoice.LineItem> lineItem = Collections.emptyList();

    /**
     * Required fields for {@link Invoice}
     *
     * @param status - The current state of the Invoice.
     */
    public Impl(INVOICE_STATUS status) {
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public InvoiceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public InvoiceBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public InvoiceBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public InvoiceBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public InvoiceBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param _type - Type of Invoice depending on domain, realm an usage (e.g. internal/external,
     *     dental, preliminary).
     */
    public InvoiceBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public InvoiceBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param date - Date/time(s) of when this Invoice was posted. */
    public InvoiceBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /**
     * @param note - Comments made about the invoice by the issuer, subject, or other participants.
     */
    public InvoiceBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Comments made about the invoice by the issuer, subject, or other participants.
     */
    public InvoiceBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public InvoiceBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param issuer - The organizationissuing the Invoice. */
    public InvoiceBuilder.Impl withIssuer(@NonNull Reference issuer) {
      this.issuer = Optional.of(issuer);
      return this;
    }

    public InvoiceBuilder.Impl withIssuer(@NonNull ReferenceBuilder issuer) {
      this.issuer = Optional.of(issuer.build());
      return this;
    }
    /**
     * @param subject - The individual or set of individuals receiving the goods and services billed
     *     in this invoice.
     */
    public InvoiceBuilder.Impl withSubject(@NonNull Reference subject) {
      this.subject = Optional.of(subject);
      return this;
    }

    public InvoiceBuilder.Impl withSubject(@NonNull ReferenceBuilder subject) {
      this.subject = Optional.of(subject.build());
      return this;
    }
    /** @param account - Account which is supposed to be balanced with this Invoice. */
    public InvoiceBuilder.Impl withAccount(@NonNull Reference account) {
      this.account = Optional.of(account);
      return this;
    }

    public InvoiceBuilder.Impl withAccount(@NonNull ReferenceBuilder account) {
      this.account = Optional.of(account.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public InvoiceBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param totalNet - Invoice total , taxes excluded. */
    public InvoiceBuilder.Impl withTotalNet(@NonNull Money totalNet) {
      this.totalNet = Optional.of(totalNet);
      return this;
    }

    public InvoiceBuilder.Impl withTotalNet(@NonNull MoneyBuilder totalNet) {
      this.totalNet = Optional.of(totalNet.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public InvoiceBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public InvoiceBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public InvoiceBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public InvoiceBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public InvoiceBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public InvoiceBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param recipient - The individual or Organization responsible for balancing of this invoice.
     */
    public InvoiceBuilder.Impl withRecipient(@NonNull Reference recipient) {
      this.recipient = Optional.of(recipient);
      return this;
    }

    public InvoiceBuilder.Impl withRecipient(@NonNull ReferenceBuilder recipient) {
      this.recipient = Optional.of(recipient.build());
      return this;
    }
    /**
     * @param identifier - Identifier of this Invoice, often used for reference in correspondence
     *     about this invoice or for tracking of payments.
     */
    public InvoiceBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Identifier of this Invoice, often used for reference in correspondence
     *     about this invoice or for tracking of payments.
     */
    public InvoiceBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public InvoiceBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param totalGross - Invoice total, tax included. */
    public InvoiceBuilder.Impl withTotalGross(@NonNull Money totalGross) {
      this.totalGross = Optional.of(totalGross);
      return this;
    }

    public InvoiceBuilder.Impl withTotalGross(@NonNull MoneyBuilder totalGross) {
      this.totalGross = Optional.of(totalGross.build());
      return this;
    }
    /**
     * @param paymentTerms - Payment details such as banking details, period of payment,
     *     deductibles, methods of payment.
     */
    public InvoiceBuilder.Impl withPaymentTerms(@NonNull String paymentTerms) {
      this.paymentTerms = Optional.of(paymentTerms);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public InvoiceBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param cancelledReason - In case of Invoice cancellation a reason must be given (entered in
     *     error, superseded by corrected invoice etc.).
     */
    public InvoiceBuilder.Impl withCancelledReason(@NonNull String cancelledReason) {
      this.cancelledReason = Optional.of(cancelledReason);
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
    public InvoiceBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public InvoiceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public InvoiceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param totalPriceComponent - The total amount for the Invoice may be calculated as the sum of
     *     the line items with surcharges/deductions that apply in certain conditions. The
     *     priceComponent element can be used to offer transparency to the recipient of the Invoice
     *     of how the total price was calculated.
     */
    public InvoiceBuilder.Impl withTotalPriceComponent(
        @NonNull Invoice$LineItem$PriceComponent... totalPriceComponent) {
      this.totalPriceComponent = Arrays.asList(totalPriceComponent);
      return this;
    }
    /**
     * @param totalPriceComponent - The total amount for the Invoice may be calculated as the sum of
     *     the line items with surcharges/deductions that apply in certain conditions. The
     *     priceComponent element can be used to offer transparency to the recipient of the Invoice
     *     of how the total price was calculated.
     */
    public InvoiceBuilder.Impl withTotalPriceComponent(
        @NonNull Collection<Invoice$LineItem$PriceComponent> totalPriceComponent) {
      this.totalPriceComponent = Collections.unmodifiableCollection(totalPriceComponent);
      return this;
    }

    public InvoiceBuilder.Impl withTotalPriceComponent(
        @NonNull Invoice_LineItem_PriceComponentBuilder... totalPriceComponent) {
      this.totalPriceComponent =
          Arrays.stream(totalPriceComponent).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param participant - Indicates who or what performed or participated in the charged service.
     */
    public InvoiceBuilder.Impl withParticipant(@NonNull Invoice.Participant... participant) {
      this.participant = Arrays.asList(participant);
      return this;
    }
    /**
     * @param participant - Indicates who or what performed or participated in the charged service.
     */
    public InvoiceBuilder.Impl withParticipant(
        @NonNull Collection<Invoice.Participant> participant) {
      this.participant = Collections.unmodifiableCollection(participant);
      return this;
    }

    public InvoiceBuilder.Impl withParticipant(@NonNull Invoice_ParticipantBuilder... participant) {
      this.participant = Arrays.stream(participant).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param lineItem - Each line item represents one charge for goods and services rendered.
     *     Details such as date, code and amount are found in the referenced ChargeItem resource.
     */
    public InvoiceBuilder.Impl withLineItem(@NonNull Invoice.LineItem... lineItem) {
      this.lineItem = Arrays.asList(lineItem);
      return this;
    }
    /**
     * @param lineItem - Each line item represents one charge for goods and services rendered.
     *     Details such as date, code and amount are found in the referenced ChargeItem resource.
     */
    public InvoiceBuilder.Impl withLineItem(@NonNull Collection<Invoice.LineItem> lineItem) {
      this.lineItem = Collections.unmodifiableCollection(lineItem);
      return this;
    }

    public InvoiceBuilder.Impl withLineItem(@NonNull Invoice_LineItemBuilder... lineItem) {
      this.lineItem = Arrays.stream(lineItem).map(e -> e.build()).collect(toList());
      return this;
    }

    public InvoiceBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Invoice build() {
      return new Invoice(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(date),
          note.stream().collect(new LitSeqJCollector<>()),
          status,
          OptionConverters.toScala(issuer),
          OptionConverters.toScala(subject),
          OptionConverters.toScala(account),
          OptionConverters.toScala(language),
          OptionConverters.toScala(totalNet),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(recipient),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(totalGross),
          OptionConverters.toScala(paymentTerms),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(cancelledReason),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          totalPriceComponent.stream().collect(new LitSeqJCollector<>()),
          participant.stream().collect(new LitSeqJCollector<>()),
          lineItem.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
