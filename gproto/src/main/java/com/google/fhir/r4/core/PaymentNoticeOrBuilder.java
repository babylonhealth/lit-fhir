// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/payment_notice.proto

package com.google.fhir.r4.core;

public interface PaymentNoticeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.PaymentNotice)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   *
   * @return The id.
   */
  com.google.fhir.r4.core.Id getId();
  /**
   *
   *
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   */
  com.google.fhir.r4.core.IdOrBuilder getIdOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   *
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   *
   *
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   *
   * @return The meta.
   */
  com.google.fhir.r4.core.Meta getMeta();
  /**
   *
   *
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   */
  com.google.fhir.r4.core.MetaOrBuilder getMetaOrBuilder();

  /**
   *
   *
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   *
   * @return Whether the implicitRules field is set.
   */
  boolean hasImplicitRules();
  /**
   *
   *
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   *
   * @return The implicitRules.
   */
  com.google.fhir.r4.core.Uri getImplicitRules();
  /**
   *
   *
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getImplicitRulesOrBuilder();

  /**
   *
   *
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   *
   * @return Whether the language field is set.
   */
  boolean hasLanguage();
  /**
   *
   *
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   *
   * @return The language.
   */
  com.google.fhir.r4.core.Code getLanguage();
  /**
   *
   *
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   */
  com.google.fhir.r4.core.CodeOrBuilder getLanguageOrBuilder();

  /**
   *
   *
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   *
   * @return The text.
   */
  com.google.fhir.r4.core.Narrative getText();
  /**
   *
   *
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   */
  com.google.fhir.r4.core.NarrativeOrBuilder getTextOrBuilder();

  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  java.util.List<com.google.protobuf.Any> getContainedList();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  com.google.protobuf.Any getContained(int index);
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  int getContainedCount();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> getContainedOrBuilderList();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  com.google.protobuf.AnyOrBuilder getContainedOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> getExtensionList();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  int getExtensionCount();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> getExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> getModifierExtensionList();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  com.google.fhir.r4.core.Extension getModifierExtension(int index);
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  int getModifierExtensionCount();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder>
      getModifierExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getModifierExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Business Identifier for the payment noctice
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Business Identifier for the payment noctice
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Business Identifier for the payment noctice
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Business Identifier for the payment noctice
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder>
      getIdentifierOrBuilderList();
  /**
   *
   *
   * <pre>
   * Business Identifier for the payment noctice
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   * <code>
   * .google.fhir.r4.core.PaymentNotice.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>
   * .google.fhir.r4.core.PaymentNotice.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.r4.core.PaymentNotice.StatusCode getStatus();
  /**
   * <code>
   * .google.fhir.r4.core.PaymentNotice.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.PaymentNotice.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Request reference
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference request = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   *
   *
   * <pre>
   * Request reference
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference request = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return The request.
   */
  com.google.fhir.r4.core.Reference getRequest();
  /**
   *
   *
   * <pre>
   * Request reference
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference request = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * Response reference
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference response = 13 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   *
   *
   * <pre>
   * Response reference
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference response = 13 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return The response.
   */
  com.google.fhir.r4.core.Reference getResponse();
  /**
   *
   *
   * <pre>
   * Response reference
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference response = 13 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getResponseOrBuilder();

  /**
   *
   *
   * <pre>
   * Creation date
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.DateTime created = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the created field is set.
   */
  boolean hasCreated();
  /**
   *
   *
   * <pre>
   * Creation date
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.DateTime created = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The created.
   */
  com.google.fhir.r4.core.DateTime getCreated();
  /**
   *
   *
   * <pre>
   * Creation date
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.DateTime created = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getCreatedOrBuilder();

  /**
   *
   *
   * <pre>
   * Responsible practitioner
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference provider = 15 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the provider field is set.
   */
  boolean hasProvider();
  /**
   *
   *
   * <pre>
   * Responsible practitioner
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference provider = 15 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The provider.
   */
  com.google.fhir.r4.core.Reference getProvider();
  /**
   *
   *
   * <pre>
   * Responsible practitioner
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference provider = 15 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getProviderOrBuilder();

  /**
   *
   *
   * <pre>
   * Payment reference
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference payment = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "PaymentReconciliation"];
   * </code>
   *
   * @return Whether the payment field is set.
   */
  boolean hasPayment();
  /**
   *
   *
   * <pre>
   * Payment reference
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference payment = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "PaymentReconciliation"];
   * </code>
   *
   * @return The payment.
   */
  com.google.fhir.r4.core.Reference getPayment();
  /**
   *
   *
   * <pre>
   * Payment reference
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference payment = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "PaymentReconciliation"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPaymentOrBuilder();

  /**
   *
   *
   * <pre>
   * Payment or clearing date
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date payment_date = 17;</code>
   *
   * @return Whether the paymentDate field is set.
   */
  boolean hasPaymentDate();
  /**
   *
   *
   * <pre>
   * Payment or clearing date
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date payment_date = 17;</code>
   *
   * @return The paymentDate.
   */
  com.google.fhir.r4.core.Date getPaymentDate();
  /**
   *
   *
   * <pre>
   * Payment or clearing date
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date payment_date = 17;</code>
   */
  com.google.fhir.r4.core.DateOrBuilder getPaymentDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Party being paid
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference payee = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the payee field is set.
   */
  boolean hasPayee();
  /**
   *
   *
   * <pre>
   * Party being paid
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference payee = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The payee.
   */
  com.google.fhir.r4.core.Reference getPayee();
  /**
   *
   *
   * <pre>
   * Party being paid
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference payee = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPayeeOrBuilder();

  /**
   *
   *
   * <pre>
   * Party being notified
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference recipient = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the recipient field is set.
   */
  boolean hasRecipient();
  /**
   *
   *
   * <pre>
   * Party being notified
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference recipient = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The recipient.
   */
  com.google.fhir.r4.core.Reference getRecipient();
  /**
   *
   *
   * <pre>
   * Party being notified
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference recipient = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getRecipientOrBuilder();

  /**
   *
   *
   * <pre>
   * Monetary amount of the payment
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Money amount = 20 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   *
   *
   * <pre>
   * Monetary amount of the payment
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Money amount = 20 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The amount.
   */
  com.google.fhir.r4.core.Money getAmount();
  /**
   *
   *
   * <pre>
   * Monetary amount of the payment
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Money amount = 20 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.MoneyOrBuilder getAmountOrBuilder();

  /**
   *
   *
   * <pre>
   * Issued or cleared Status of the payment
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept payment_status = 21;</code>
   *
   * @return Whether the paymentStatus field is set.
   */
  boolean hasPaymentStatus();
  /**
   *
   *
   * <pre>
   * Issued or cleared Status of the payment
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept payment_status = 21;</code>
   *
   * @return The paymentStatus.
   */
  com.google.fhir.r4.core.CodeableConcept getPaymentStatus();
  /**
   *
   *
   * <pre>
   * Issued or cleared Status of the payment
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept payment_status = 21;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getPaymentStatusOrBuilder();
}