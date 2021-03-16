// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/enrollment_response.proto

package com.google.fhir.r4.core;

public interface EnrollmentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.EnrollmentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   * @return The id.
   */
  com.google.fhir.r4.core.Id getId();
  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   */
  com.google.fhir.r4.core.IdOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   * @return The meta.
   */
  com.google.fhir.r4.core.Meta getMeta();
  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   */
  com.google.fhir.r4.core.MetaOrBuilder getMetaOrBuilder();

  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   * @return Whether the implicitRules field is set.
   */
  boolean hasImplicitRules();
  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   * @return The implicitRules.
   */
  com.google.fhir.r4.core.Uri getImplicitRules();
  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getImplicitRulesOrBuilder();

  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   * @return Whether the language field is set.
   */
  boolean hasLanguage();
  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   * @return The language.
   */
  com.google.fhir.r4.core.Code getLanguage();
  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   */
  com.google.fhir.r4.core.CodeOrBuilder getLanguageOrBuilder();

  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   * @return The text.
   */
  com.google.fhir.r4.core.Narrative getText();
  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   */
  com.google.fhir.r4.core.NarrativeOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getContainedList();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  com.google.protobuf.Any getContained(int index);
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  int getContainedCount();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getContainedOrBuilderList();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  com.google.protobuf.AnyOrBuilder getContainedOrBuilder(
      int index);

  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> 
      getModifierExtensionList();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  com.google.fhir.r4.core.Extension getModifierExtension(int index);
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  int getModifierExtensionCount();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> 
      getModifierExtensionOrBuilderList();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getModifierExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Business Identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * Business Identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   * <pre>
   * Business Identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * Business Identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * Business Identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <code>.google.fhir.r4.core.EnrollmentResponse.StatusCode status = 11;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.google.fhir.r4.core.EnrollmentResponse.StatusCode status = 11;</code>
   * @return The status.
   */
  com.google.fhir.r4.core.EnrollmentResponse.StatusCode getStatus();
  /**
   * <code>.google.fhir.r4.core.EnrollmentResponse.StatusCode status = 11;</code>
   */
  com.google.fhir.r4.core.EnrollmentResponse.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Claim reference
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference request = 12 [(.google.fhir.proto.valid_reference_type) = "EnrollmentRequest"];</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <pre>
   * Claim reference
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference request = 12 [(.google.fhir.proto.valid_reference_type) = "EnrollmentRequest"];</code>
   * @return The request.
   */
  com.google.fhir.r4.core.Reference getRequest();
  /**
   * <pre>
   * Claim reference
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference request = 12 [(.google.fhir.proto.valid_reference_type) = "EnrollmentRequest"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getRequestOrBuilder();

  /**
   * <code>.google.fhir.r4.core.EnrollmentResponse.OutcomeCode outcome = 13;</code>
   * @return Whether the outcome field is set.
   */
  boolean hasOutcome();
  /**
   * <code>.google.fhir.r4.core.EnrollmentResponse.OutcomeCode outcome = 13;</code>
   * @return The outcome.
   */
  com.google.fhir.r4.core.EnrollmentResponse.OutcomeCode getOutcome();
  /**
   * <code>.google.fhir.r4.core.EnrollmentResponse.OutcomeCode outcome = 13;</code>
   */
  com.google.fhir.r4.core.EnrollmentResponse.OutcomeCodeOrBuilder getOutcomeOrBuilder();

  /**
   * <pre>
   * Disposition Message
   * </pre>
   *
   * <code>.google.fhir.r4.core.String disposition = 14;</code>
   * @return Whether the disposition field is set.
   */
  boolean hasDisposition();
  /**
   * <pre>
   * Disposition Message
   * </pre>
   *
   * <code>.google.fhir.r4.core.String disposition = 14;</code>
   * @return The disposition.
   */
  com.google.fhir.r4.core.String getDisposition();
  /**
   * <pre>
   * Disposition Message
   * </pre>
   *
   * <code>.google.fhir.r4.core.String disposition = 14;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getDispositionOrBuilder();

  /**
   * <pre>
   * Creation date
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime created = 15;</code>
   * @return Whether the created field is set.
   */
  boolean hasCreated();
  /**
   * <pre>
   * Creation date
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime created = 15;</code>
   * @return The created.
   */
  com.google.fhir.r4.core.DateTime getCreated();
  /**
   * <pre>
   * Creation date
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime created = 15;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getCreatedOrBuilder();

  /**
   * <pre>
   * Insurer
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference organization = 16 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return Whether the organization field is set.
   */
  boolean hasOrganization();
  /**
   * <pre>
   * Insurer
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference organization = 16 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return The organization.
   */
  com.google.fhir.r4.core.Reference getOrganization();
  /**
   * <pre>
   * Insurer
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference organization = 16 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getOrganizationOrBuilder();

  /**
   * <pre>
   * Responsible practitioner
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference request_provider = 17 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return Whether the requestProvider field is set.
   */
  boolean hasRequestProvider();
  /**
   * <pre>
   * Responsible practitioner
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference request_provider = 17 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return The requestProvider.
   */
  com.google.fhir.r4.core.Reference getRequestProvider();
  /**
   * <pre>
   * Responsible practitioner
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference request_provider = 17 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getRequestProviderOrBuilder();
}
