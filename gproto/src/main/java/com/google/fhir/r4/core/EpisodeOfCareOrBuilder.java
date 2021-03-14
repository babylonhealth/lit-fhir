// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/episode_of_care.proto

package com.google.fhir.r4.core;

public interface EpisodeOfCareOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.EpisodeOfCare)
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
   * Business Identifier(s) relevant for this EpisodeOfCare
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Business Identifier(s) relevant for this EpisodeOfCare
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Business Identifier(s) relevant for this EpisodeOfCare
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Business Identifier(s) relevant for this EpisodeOfCare
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
   * Business Identifier(s) relevant for this EpisodeOfCare
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   * <code>
   * .google.fhir.r4.core.EpisodeOfCare.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>
   * .google.fhir.r4.core.EpisodeOfCare.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.r4.core.EpisodeOfCare.StatusCode getStatus();
  /**
   * <code>
   * .google.fhir.r4.core.EpisodeOfCare.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.EpisodeOfCare.StatusCodeOrBuilder getStatusOrBuilder();

  /** <code>repeated .google.fhir.r4.core.EpisodeOfCare.StatusHistory status_history = 12;</code> */
  java.util.List<com.google.fhir.r4.core.EpisodeOfCare.StatusHistory> getStatusHistoryList();
  /** <code>repeated .google.fhir.r4.core.EpisodeOfCare.StatusHistory status_history = 12;</code> */
  com.google.fhir.r4.core.EpisodeOfCare.StatusHistory getStatusHistory(int index);
  /** <code>repeated .google.fhir.r4.core.EpisodeOfCare.StatusHistory status_history = 12;</code> */
  int getStatusHistoryCount();
  /** <code>repeated .google.fhir.r4.core.EpisodeOfCare.StatusHistory status_history = 12;</code> */
  java.util.List<? extends com.google.fhir.r4.core.EpisodeOfCare.StatusHistoryOrBuilder>
      getStatusHistoryOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.EpisodeOfCare.StatusHistory status_history = 12;</code> */
  com.google.fhir.r4.core.EpisodeOfCare.StatusHistoryOrBuilder getStatusHistoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Type/class  - e.g. specialist referral, disease management
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 13;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getTypeList();
  /**
   *
   *
   * <pre>
   * Type/class  - e.g. specialist referral, disease management
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 13;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getType(int index);
  /**
   *
   *
   * <pre>
   * Type/class  - e.g. specialist referral, disease management
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 13;</code>
   */
  int getTypeCount();
  /**
   *
   *
   * <pre>
   * Type/class  - e.g. specialist referral, disease management
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 13;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> getTypeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Type/class  - e.g. specialist referral, disease management
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept type = 13;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getTypeOrBuilder(int index);

  /** <code>repeated .google.fhir.r4.core.EpisodeOfCare.Diagnosis diagnosis = 14;</code> */
  java.util.List<com.google.fhir.r4.core.EpisodeOfCare.Diagnosis> getDiagnosisList();
  /** <code>repeated .google.fhir.r4.core.EpisodeOfCare.Diagnosis diagnosis = 14;</code> */
  com.google.fhir.r4.core.EpisodeOfCare.Diagnosis getDiagnosis(int index);
  /** <code>repeated .google.fhir.r4.core.EpisodeOfCare.Diagnosis diagnosis = 14;</code> */
  int getDiagnosisCount();
  /** <code>repeated .google.fhir.r4.core.EpisodeOfCare.Diagnosis diagnosis = 14;</code> */
  java.util.List<? extends com.google.fhir.r4.core.EpisodeOfCare.DiagnosisOrBuilder>
      getDiagnosisOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.EpisodeOfCare.Diagnosis diagnosis = 14;</code> */
  com.google.fhir.r4.core.EpisodeOfCare.DiagnosisOrBuilder getDiagnosisOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The patient who is the focus of this episode of care
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference patient = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return Whether the patient field is set.
   */
  boolean hasPatient();
  /**
   *
   *
   * <pre>
   * The patient who is the focus of this episode of care
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference patient = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return The patient.
   */
  com.google.fhir.r4.core.Reference getPatient();
  /**
   *
   *
   * <pre>
   * The patient who is the focus of this episode of care
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference patient = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPatientOrBuilder();

  /**
   *
   *
   * <pre>
   * Organization that assumes care
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference managing_organization = 16 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the managingOrganization field is set.
   */
  boolean hasManagingOrganization();
  /**
   *
   *
   * <pre>
   * Organization that assumes care
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference managing_organization = 16 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The managingOrganization.
   */
  com.google.fhir.r4.core.Reference getManagingOrganization();
  /**
   *
   *
   * <pre>
   * Organization that assumes care
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference managing_organization = 16 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getManagingOrganizationOrBuilder();

  /**
   *
   *
   * <pre>
   * Interval during responsibility is assumed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 17;</code>
   *
   * @return Whether the period field is set.
   */
  boolean hasPeriod();
  /**
   *
   *
   * <pre>
   * Interval during responsibility is assumed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 17;</code>
   *
   * @return The period.
   */
  com.google.fhir.r4.core.Period getPeriod();
  /**
   *
   *
   * <pre>
   * Interval during responsibility is assumed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 17;</code>
   */
  com.google.fhir.r4.core.PeriodOrBuilder getPeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * Originating Referral Request(s)
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference referral_request = 18 [(.google.fhir.proto.valid_reference_type) = "ServiceRequest"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getReferralRequestList();
  /**
   *
   *
   * <pre>
   * Originating Referral Request(s)
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference referral_request = 18 [(.google.fhir.proto.valid_reference_type) = "ServiceRequest"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getReferralRequest(int index);
  /**
   *
   *
   * <pre>
   * Originating Referral Request(s)
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference referral_request = 18 [(.google.fhir.proto.valid_reference_type) = "ServiceRequest"];
   * </code>
   */
  int getReferralRequestCount();
  /**
   *
   *
   * <pre>
   * Originating Referral Request(s)
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference referral_request = 18 [(.google.fhir.proto.valid_reference_type) = "ServiceRequest"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getReferralRequestOrBuilderList();
  /**
   *
   *
   * <pre>
   * Originating Referral Request(s)
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference referral_request = 18 [(.google.fhir.proto.valid_reference_type) = "ServiceRequest"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getReferralRequestOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Care manager/care coordinator for the patient
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference care_manager = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];
   * </code>
   *
   * @return Whether the careManager field is set.
   */
  boolean hasCareManager();
  /**
   *
   *
   * <pre>
   * Care manager/care coordinator for the patient
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference care_manager = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];
   * </code>
   *
   * @return The careManager.
   */
  com.google.fhir.r4.core.Reference getCareManager();
  /**
   *
   *
   * <pre>
   * Care manager/care coordinator for the patient
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference care_manager = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getCareManagerOrBuilder();

  /**
   *
   *
   * <pre>
   * Other practitioners facilitating this episode of care
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference team = 20 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getTeamList();
  /**
   *
   *
   * <pre>
   * Other practitioners facilitating this episode of care
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference team = 20 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getTeam(int index);
  /**
   *
   *
   * <pre>
   * Other practitioners facilitating this episode of care
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference team = 20 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  int getTeamCount();
  /**
   *
   *
   * <pre>
   * Other practitioners facilitating this episode of care
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference team = 20 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getTeamOrBuilderList();
  /**
   *
   *
   * <pre>
   * Other practitioners facilitating this episode of care
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference team = 20 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getTeamOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The set of accounts that may be used for billing for this EpisodeOfCare
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference account = 21 [(.google.fhir.proto.valid_reference_type) = "Account"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getAccountList();
  /**
   *
   *
   * <pre>
   * The set of accounts that may be used for billing for this EpisodeOfCare
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference account = 21 [(.google.fhir.proto.valid_reference_type) = "Account"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getAccount(int index);
  /**
   *
   *
   * <pre>
   * The set of accounts that may be used for billing for this EpisodeOfCare
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference account = 21 [(.google.fhir.proto.valid_reference_type) = "Account"];
   * </code>
   */
  int getAccountCount();
  /**
   *
   *
   * <pre>
   * The set of accounts that may be used for billing for this EpisodeOfCare
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference account = 21 [(.google.fhir.proto.valid_reference_type) = "Account"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getAccountOrBuilderList();
  /**
   *
   *
   * <pre>
   * The set of accounts that may be used for billing for this EpisodeOfCare
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference account = 21 [(.google.fhir.proto.valid_reference_type) = "Account"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getAccountOrBuilder(int index);
}