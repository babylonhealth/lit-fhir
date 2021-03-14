// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface ConsentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.Consent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id id = 1;</code>
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
   * <code>.google.fhir.stu3.proto.Id id = 1;</code>
   *
   * @return The id.
   */
  com.google.fhir.stu3.proto.Id getId();
  /**
   *
   *
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id id = 1;</code>
   */
  com.google.fhir.stu3.proto.IdOrBuilder getIdOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Meta meta = 2;</code>
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
   * <code>.google.fhir.stu3.proto.Meta meta = 2;</code>
   *
   * @return The meta.
   */
  com.google.fhir.stu3.proto.Meta getMeta();
  /**
   *
   *
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Meta meta = 2;</code>
   */
  com.google.fhir.stu3.proto.MetaOrBuilder getMetaOrBuilder();

  /**
   *
   *
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri implicit_rules = 3;</code>
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
   * <code>.google.fhir.stu3.proto.Uri implicit_rules = 3;</code>
   *
   * @return The implicitRules.
   */
  com.google.fhir.stu3.proto.Uri getImplicitRules();
  /**
   *
   *
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri implicit_rules = 3;</code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getImplicitRulesOrBuilder();

  /**
   *
   *
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LanguageCode language = 4;</code>
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
   * <code>.google.fhir.stu3.proto.LanguageCode language = 4;</code>
   *
   * @return The language.
   */
  com.google.fhir.stu3.proto.LanguageCode getLanguage();
  /**
   *
   *
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LanguageCode language = 4;</code>
   */
  com.google.fhir.stu3.proto.LanguageCodeOrBuilder getLanguageOrBuilder();

  /**
   *
   *
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Narrative text = 5;</code>
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
   * <code>.google.fhir.stu3.proto.Narrative text = 5;</code>
   *
   * @return The text.
   */
  com.google.fhir.stu3.proto.Narrative getText();
  /**
   *
   *
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Narrative text = 5;</code>
   */
  com.google.fhir.stu3.proto.NarrativeOrBuilder getTextOrBuilder();

  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.ContainedResource> getContainedList();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  com.google.fhir.stu3.proto.ContainedResource getContained(int index);
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  int getContainedCount();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ContainedResourceOrBuilder>
      getContainedOrBuilderList();
  /**
   *
   *
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  com.google.fhir.stu3.proto.ContainedResourceOrBuilder getContainedOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> getExtensionList();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  com.google.fhir.stu3.proto.Extension getExtension(int index);
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  int getExtensionCount();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder>
      getExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> getModifierExtensionList();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  com.google.fhir.stu3.proto.Extension getModifierExtension(int index);
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  int getModifierExtensionCount();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder>
      getModifierExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getModifierExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Identifier for this record (external references)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 9;</code>
   *
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   *
   *
   * <pre>
   * Identifier for this record (external references)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 9;</code>
   *
   * @return The identifier.
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier();
  /**
   *
   *
   * <pre>
   * Identifier for this record (external references)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder();

  /**
   *
   *
   * <pre>
   * draft | proposed | active | rejected | inactive | entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.ConsentStateCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * draft | proposed | active | rejected | inactive | entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.ConsentStateCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.ConsentStateCode getStatus();
  /**
   *
   *
   * <pre>
   * draft | proposed | active | rejected | inactive | entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.ConsentStateCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.ConsentStateCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Classification of the consent statement - for indexing/retrieval
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 11;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getCategoryList();
  /**
   *
   *
   * <pre>
   * Classification of the consent statement - for indexing/retrieval
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 11;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getCategory(int index);
  /**
   *
   *
   * <pre>
   * Classification of the consent statement - for indexing/retrieval
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 11;</code>
   */
  int getCategoryCount();
  /**
   *
   *
   * <pre>
   * Classification of the consent statement - for indexing/retrieval
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 11;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getCategoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Classification of the consent statement - for indexing/retrieval
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 11;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getCategoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Who the consent applies to
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference patient = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
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
   * .google.fhir.stu3.proto.Reference patient = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return The patient.
   */
  com.google.fhir.stu3.proto.Reference getPatient();
  /**
   *
   *
   * <pre>
   * Who the consent applies to
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference patient = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPatientOrBuilder();

  /**
   *
   *
   * <pre>
   * Period that this consent applies
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period period = 13;</code>
   *
   * @return Whether the period field is set.
   */
  boolean hasPeriod();
  /**
   *
   *
   * <pre>
   * Period that this consent applies
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period period = 13;</code>
   *
   * @return The period.
   */
  com.google.fhir.stu3.proto.Period getPeriod();
  /**
   *
   *
   * <pre>
   * Period that this consent applies
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period period = 13;</code>
   */
  com.google.fhir.stu3.proto.PeriodOrBuilder getPeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * When this Consent was created or indexed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date_time = 14;</code>
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
   * <code>.google.fhir.stu3.proto.DateTime date_time = 14;</code>
   *
   * @return The dateTime.
   */
  com.google.fhir.stu3.proto.DateTime getDateTime();
  /**
   *
   *
   * <pre>
   * When this Consent was created or indexed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date_time = 14;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getDateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Who is agreeing to the policy and exceptions
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference consenting_party = 15 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getConsentingPartyList();
  /**
   *
   *
   * <pre>
   * Who is agreeing to the policy and exceptions
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference consenting_party = 15 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getConsentingParty(int index);
  /**
   *
   *
   * <pre>
   * Who is agreeing to the policy and exceptions
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference consenting_party = 15 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  int getConsentingPartyCount();
  /**
   *
   *
   * <pre>
   * Who is agreeing to the policy and exceptions
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference consenting_party = 15 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getConsentingPartyOrBuilderList();
  /**
   *
   *
   * <pre>
   * Who is agreeing to the policy and exceptions
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference consenting_party = 15 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getConsentingPartyOrBuilder(int index);

  /** <code>repeated .google.fhir.stu3.proto.Consent.Actor actor = 16;</code> */
  java.util.List<com.google.fhir.stu3.proto.Consent.Actor> getActorList();
  /** <code>repeated .google.fhir.stu3.proto.Consent.Actor actor = 16;</code> */
  com.google.fhir.stu3.proto.Consent.Actor getActor(int index);
  /** <code>repeated .google.fhir.stu3.proto.Consent.Actor actor = 16;</code> */
  int getActorCount();
  /** <code>repeated .google.fhir.stu3.proto.Consent.Actor actor = 16;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.Consent.ActorOrBuilder>
      getActorOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.Consent.Actor actor = 16;</code> */
  com.google.fhir.stu3.proto.Consent.ActorOrBuilder getActorOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Actions controlled by this consent
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept action = 17;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getActionList();
  /**
   *
   *
   * <pre>
   * Actions controlled by this consent
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept action = 17;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getAction(int index);
  /**
   *
   *
   * <pre>
   * Actions controlled by this consent
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept action = 17;</code>
   */
  int getActionCount();
  /**
   *
   *
   * <pre>
   * Actions controlled by this consent
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept action = 17;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getActionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Actions controlled by this consent
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept action = 17;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getActionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Custodian of the consent
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference organization = 18 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getOrganizationList();
  /**
   *
   *
   * <pre>
   * Custodian of the consent
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference organization = 18 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getOrganization(int index);
  /**
   *
   *
   * <pre>
   * Custodian of the consent
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference organization = 18 [(.google.fhir.proto.valid_reference_type) = "Organization"];
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
   * repeated .google.fhir.stu3.proto.Reference organization = 18 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getOrganizationOrBuilderList();
  /**
   *
   *
   * <pre>
   * Custodian of the consent
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference organization = 18 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getOrganizationOrBuilder(int index);

  /**
   * <code>.google.fhir.stu3.proto.Consent.Source source = 19;</code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <code>.google.fhir.stu3.proto.Consent.Source source = 19;</code>
   *
   * @return The source.
   */
  com.google.fhir.stu3.proto.Consent.Source getSource();
  /** <code>.google.fhir.stu3.proto.Consent.Source source = 19;</code> */
  com.google.fhir.stu3.proto.Consent.SourceOrBuilder getSourceOrBuilder();

  /** <code>repeated .google.fhir.stu3.proto.Consent.Policy policy = 20;</code> */
  java.util.List<com.google.fhir.stu3.proto.Consent.Policy> getPolicyList();
  /** <code>repeated .google.fhir.stu3.proto.Consent.Policy policy = 20;</code> */
  com.google.fhir.stu3.proto.Consent.Policy getPolicy(int index);
  /** <code>repeated .google.fhir.stu3.proto.Consent.Policy policy = 20;</code> */
  int getPolicyCount();
  /** <code>repeated .google.fhir.stu3.proto.Consent.Policy policy = 20;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.Consent.PolicyOrBuilder>
      getPolicyOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.Consent.Policy policy = 20;</code> */
  com.google.fhir.stu3.proto.Consent.PolicyOrBuilder getPolicyOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Policy that this consents to
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri policy_rule = 21;</code>
   *
   * @return Whether the policyRule field is set.
   */
  boolean hasPolicyRule();
  /**
   *
   *
   * <pre>
   * Policy that this consents to
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri policy_rule = 21;</code>
   *
   * @return The policyRule.
   */
  com.google.fhir.stu3.proto.Uri getPolicyRule();
  /**
   *
   *
   * <pre>
   * Policy that this consents to
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri policy_rule = 21;</code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getPolicyRuleOrBuilder();

  /**
   *
   *
   * <pre>
   * Security Labels that define affected resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding security_label = 22;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Coding> getSecurityLabelList();
  /**
   *
   *
   * <pre>
   * Security Labels that define affected resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding security_label = 22;</code>
   */
  com.google.fhir.stu3.proto.Coding getSecurityLabel(int index);
  /**
   *
   *
   * <pre>
   * Security Labels that define affected resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding security_label = 22;</code>
   */
  int getSecurityLabelCount();
  /**
   *
   *
   * <pre>
   * Security Labels that define affected resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding security_label = 22;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodingOrBuilder>
      getSecurityLabelOrBuilderList();
  /**
   *
   *
   * <pre>
   * Security Labels that define affected resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding security_label = 22;</code>
   */
  com.google.fhir.stu3.proto.CodingOrBuilder getSecurityLabelOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Context of activities for which the agreement is made
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding purpose = 23;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Coding> getPurposeList();
  /**
   *
   *
   * <pre>
   * Context of activities for which the agreement is made
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding purpose = 23;</code>
   */
  com.google.fhir.stu3.proto.Coding getPurpose(int index);
  /**
   *
   *
   * <pre>
   * Context of activities for which the agreement is made
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding purpose = 23;</code>
   */
  int getPurposeCount();
  /**
   *
   *
   * <pre>
   * Context of activities for which the agreement is made
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding purpose = 23;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodingOrBuilder> getPurposeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Context of activities for which the agreement is made
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding purpose = 23;</code>
   */
  com.google.fhir.stu3.proto.CodingOrBuilder getPurposeOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Timeframe for data controlled by this consent
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period data_period = 24;</code>
   *
   * @return Whether the dataPeriod field is set.
   */
  boolean hasDataPeriod();
  /**
   *
   *
   * <pre>
   * Timeframe for data controlled by this consent
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period data_period = 24;</code>
   *
   * @return The dataPeriod.
   */
  com.google.fhir.stu3.proto.Period getDataPeriod();
  /**
   *
   *
   * <pre>
   * Timeframe for data controlled by this consent
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period data_period = 24;</code>
   */
  com.google.fhir.stu3.proto.PeriodOrBuilder getDataPeriodOrBuilder();

  /** <code>repeated .google.fhir.stu3.proto.Consent.Data data = 25;</code> */
  java.util.List<com.google.fhir.stu3.proto.Consent.Data> getDataList();
  /** <code>repeated .google.fhir.stu3.proto.Consent.Data data = 25;</code> */
  com.google.fhir.stu3.proto.Consent.Data getData(int index);
  /** <code>repeated .google.fhir.stu3.proto.Consent.Data data = 25;</code> */
  int getDataCount();
  /** <code>repeated .google.fhir.stu3.proto.Consent.Data data = 25;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.Consent.DataOrBuilder> getDataOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.Consent.Data data = 25;</code> */
  com.google.fhir.stu3.proto.Consent.DataOrBuilder getDataOrBuilder(int index);

  /** <code>repeated .google.fhir.stu3.proto.Consent.Except except = 26;</code> */
  java.util.List<com.google.fhir.stu3.proto.Consent.Except> getExceptList();
  /** <code>repeated .google.fhir.stu3.proto.Consent.Except except = 26;</code> */
  com.google.fhir.stu3.proto.Consent.Except getExcept(int index);
  /** <code>repeated .google.fhir.stu3.proto.Consent.Except except = 26;</code> */
  int getExceptCount();
  /** <code>repeated .google.fhir.stu3.proto.Consent.Except except = 26;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.Consent.ExceptOrBuilder>
      getExceptOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.Consent.Except except = 26;</code> */
  com.google.fhir.stu3.proto.Consent.ExceptOrBuilder getExceptOrBuilder(int index);
}
