// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/consent.proto

package com.google.fhir.r4.core;

public interface ConsentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.Consent)
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
   * Identifier for this record (external references)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Identifier for this record (external references)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Identifier for this record (external references)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Identifier for this record (external references)
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
   * Identifier for this record (external references)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   * <code>
   * .google.fhir.r4.core.Consent.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>
   * .google.fhir.r4.core.Consent.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.r4.core.Consent.StatusCode getStatus();
  /**
   * <code>
   * .google.fhir.r4.core.Consent.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.Consent.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Which of the four areas this resource covers (extensible)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.CodeableConcept scope = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the scope field is set.
   */
  boolean hasScope();
  /**
   *
   *
   * <pre>
   * Which of the four areas this resource covers (extensible)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.CodeableConcept scope = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The scope.
   */
  com.google.fhir.r4.core.CodeableConcept getScope();
  /**
   *
   *
   * <pre>
   * Which of the four areas this resource covers (extensible)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.CodeableConcept scope = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getScopeOrBuilder();

  /**
   *
   *
   * <pre>
   * Classification of the consent statement - for indexing/retrieval
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getCategoryList();
  /**
   *
   *
   * <pre>
   * Classification of the consent statement - for indexing/retrieval
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.CodeableConcept getCategory(int index);
  /**
   *
   *
   * <pre>
   * Classification of the consent statement - for indexing/retrieval
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  int getCategoryCount();
  /**
   *
   *
   * <pre>
   * Classification of the consent statement - for indexing/retrieval
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getCategoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Classification of the consent statement - for indexing/retrieval
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCategoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Who the consent applies to
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference patient = 14 [(.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return Whether the patient field is set.
   */
  boolean hasPatient();
  /**
   *
   *
   * <pre>
   * Who the consent applies to
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference patient = 14 [(.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return The patient.
   */
  com.google.fhir.r4.core.Reference getPatient();
  /**
   *
   *
   * <pre>
   * Who the consent applies to
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference patient = 14 [(.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPatientOrBuilder();

  /**
   *
   *
   * <pre>
   * When this Consent was created or indexed
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date_time = 15;</code>
   *
   * @return Whether the dateTime field is set.
   */
  boolean hasDateTime();
  /**
   *
   *
   * <pre>
   * When this Consent was created or indexed
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date_time = 15;</code>
   *
   * @return The dateTime.
   */
  com.google.fhir.r4.core.DateTime getDateTime();
  /**
   *
   *
   * <pre>
   * When this Consent was created or indexed
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date_time = 15;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getDateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Who is agreeing to the policy and rules
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference performer = 16 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getPerformerList();
  /**
   *
   *
   * <pre>
   * Who is agreeing to the policy and rules
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference performer = 16 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getPerformer(int index);
  /**
   *
   *
   * <pre>
   * Who is agreeing to the policy and rules
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference performer = 16 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];
   * </code>
   */
  int getPerformerCount();
  /**
   *
   *
   * <pre>
   * Who is agreeing to the policy and rules
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference performer = 16 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getPerformerOrBuilderList();
  /**
   *
   *
   * <pre>
   * Who is agreeing to the policy and rules
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference performer = 16 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPerformerOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Custodian of the consent
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference organization = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getOrganizationList();
  /**
   *
   *
   * <pre>
   * Custodian of the consent
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference organization = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getOrganization(int index);
  /**
   *
   *
   * <pre>
   * Custodian of the consent
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference organization = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  int getOrganizationCount();
  /**
   *
   *
   * <pre>
   * Custodian of the consent
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference organization = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getOrganizationOrBuilderList();
  /**
   *
   *
   * <pre>
   * Custodian of the consent
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference organization = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getOrganizationOrBuilder(int index);

  /**
   * <code>.google.fhir.r4.core.Consent.SourceX source = 18;</code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <code>.google.fhir.r4.core.Consent.SourceX source = 18;</code>
   *
   * @return The source.
   */
  com.google.fhir.r4.core.Consent.SourceX getSource();
  /** <code>.google.fhir.r4.core.Consent.SourceX source = 18;</code> */
  com.google.fhir.r4.core.Consent.SourceXOrBuilder getSourceOrBuilder();

  /** <code>repeated .google.fhir.r4.core.Consent.Policy policy = 19;</code> */
  java.util.List<com.google.fhir.r4.core.Consent.Policy> getPolicyList();
  /** <code>repeated .google.fhir.r4.core.Consent.Policy policy = 19;</code> */
  com.google.fhir.r4.core.Consent.Policy getPolicy(int index);
  /** <code>repeated .google.fhir.r4.core.Consent.Policy policy = 19;</code> */
  int getPolicyCount();
  /** <code>repeated .google.fhir.r4.core.Consent.Policy policy = 19;</code> */
  java.util.List<? extends com.google.fhir.r4.core.Consent.PolicyOrBuilder>
      getPolicyOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.Consent.Policy policy = 19;</code> */
  com.google.fhir.r4.core.Consent.PolicyOrBuilder getPolicyOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Regulation that this consents to
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept policy_rule = 20;</code>
   *
   * @return Whether the policyRule field is set.
   */
  boolean hasPolicyRule();
  /**
   *
   *
   * <pre>
   * Regulation that this consents to
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept policy_rule = 20;</code>
   *
   * @return The policyRule.
   */
  com.google.fhir.r4.core.CodeableConcept getPolicyRule();
  /**
   *
   *
   * <pre>
   * Regulation that this consents to
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept policy_rule = 20;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getPolicyRuleOrBuilder();

  /** <code>repeated .google.fhir.r4.core.Consent.Verification verification = 21;</code> */
  java.util.List<com.google.fhir.r4.core.Consent.Verification> getVerificationList();
  /** <code>repeated .google.fhir.r4.core.Consent.Verification verification = 21;</code> */
  com.google.fhir.r4.core.Consent.Verification getVerification(int index);
  /** <code>repeated .google.fhir.r4.core.Consent.Verification verification = 21;</code> */
  int getVerificationCount();
  /** <code>repeated .google.fhir.r4.core.Consent.Verification verification = 21;</code> */
  java.util.List<? extends com.google.fhir.r4.core.Consent.VerificationOrBuilder>
      getVerificationOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.Consent.Verification verification = 21;</code> */
  com.google.fhir.r4.core.Consent.VerificationOrBuilder getVerificationOrBuilder(int index);

  /**
   * <code>.google.fhir.r4.core.Consent.Provision provision = 22;</code>
   *
   * @return Whether the provision field is set.
   */
  boolean hasProvision();
  /**
   * <code>.google.fhir.r4.core.Consent.Provision provision = 22;</code>
   *
   * @return The provision.
   */
  com.google.fhir.r4.core.Consent.Provision getProvision();
  /** <code>.google.fhir.r4.core.Consent.Provision provision = 22;</code> */
  com.google.fhir.r4.core.Consent.ProvisionOrBuilder getProvisionOrBuilder();
}