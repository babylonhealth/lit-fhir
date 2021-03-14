// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/uscore.proto

package com.google.fhir.stu3.uscore;

public interface UsCoreEncounterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.uscore.UsCoreEncounter)
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
   * Identifier(s) by which this encounter is known
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Identifier(s) by which this encounter is known
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Identifier(s) by which this encounter is known
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Identifier(s) by which this encounter is known
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.IdentifierOrBuilder>
      getIdentifierOrBuilderList();
  /**
   *
   *
   * <pre>
   * Identifier(s) by which this encounter is known
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * planned | arrived | triaged | in-progress | onleave | finished | cancelled
   * +
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.EncounterStatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * planned | arrived | triaged | in-progress | onleave | finished | cancelled
   * +
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.EncounterStatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.EncounterStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * planned | arrived | triaged | in-progress | onleave | finished | cancelled
   * +
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.EncounterStatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.EncounterStatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.StatusHistory status_history = 11;
   * </code>
   */
  java.util.List<com.google.fhir.stu3.uscore.UsCoreEncounter.StatusHistory> getStatusHistoryList();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.StatusHistory status_history = 11;
   * </code>
   */
  com.google.fhir.stu3.uscore.UsCoreEncounter.StatusHistory getStatusHistory(int index);
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.StatusHistory status_history = 11;
   * </code>
   */
  int getStatusHistoryCount();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.StatusHistory status_history = 11;
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.uscore.UsCoreEncounter.StatusHistoryOrBuilder>
      getStatusHistoryOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.StatusHistory status_history = 11;
   * </code>
   */
  com.google.fhir.stu3.uscore.UsCoreEncounter.StatusHistoryOrBuilder getStatusHistoryOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * inpatient | outpatient | ambulatory | emergency +
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Coding class_value = 12[json_name = "class", (.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the classValue field is set.
   */
  boolean hasClassValue();
  /**
   *
   *
   * <pre>
   * inpatient | outpatient | ambulatory | emergency +
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Coding class_value = 12[json_name = "class", (.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The classValue.
   */
  com.google.fhir.stu3.proto.Coding getClassValue();
  /**
   *
   *
   * <pre>
   * inpatient | outpatient | ambulatory | emergency +
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Coding class_value = 12[json_name = "class", (.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.CodingOrBuilder getClassValueOrBuilder();

  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.ClassHistory class_history = 13;</code>
   */
  java.util.List<com.google.fhir.stu3.uscore.UsCoreEncounter.ClassHistory> getClassHistoryList();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.ClassHistory class_history = 13;</code>
   */
  com.google.fhir.stu3.uscore.UsCoreEncounter.ClassHistory getClassHistory(int index);
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.ClassHistory class_history = 13;</code>
   */
  int getClassHistoryCount();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.ClassHistory class_history = 13;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.uscore.UsCoreEncounter.ClassHistoryOrBuilder>
      getClassHistoryOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.ClassHistory class_history = 13;</code>
   */
  com.google.fhir.stu3.uscore.UsCoreEncounter.ClassHistoryOrBuilder getClassHistoryOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Specific type of encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.CodeableConcept type = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getTypeList();
  /**
   *
   *
   * <pre>
   * Specific type of encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.CodeableConcept type = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getType(int index);
  /**
   *
   *
   * <pre>
   * Specific type of encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.CodeableConcept type = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  int getTypeCount();
  /**
   *
   *
   * <pre>
   * Specific type of encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.CodeableConcept type = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getTypeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Specific type of encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.CodeableConcept type = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getTypeOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Indicates the urgency of the encounter
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept priority = 15;</code>
   *
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   *
   *
   * <pre>
   * Indicates the urgency of the encounter
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept priority = 15;</code>
   *
   * @return The priority.
   */
  com.google.fhir.stu3.proto.CodeableConcept getPriority();
  /**
   *
   *
   * <pre>
   * Indicates the urgency of the encounter
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept priority = 15;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getPriorityOrBuilder();

  /**
   *
   *
   * <pre>
   * The patient ro group present at the encounter
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * The patient ro group present at the encounter
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   *
   *
   * <pre>
   * The patient ro group present at the encounter
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Episode(s) of care that this encounter should be recorded against
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference episode_of_care = 17 [(.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getEpisodeOfCareList();
  /**
   *
   *
   * <pre>
   * Episode(s) of care that this encounter should be recorded against
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference episode_of_care = 17 [(.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getEpisodeOfCare(int index);
  /**
   *
   *
   * <pre>
   * Episode(s) of care that this encounter should be recorded against
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference episode_of_care = 17 [(.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   */
  int getEpisodeOfCareCount();
  /**
   *
   *
   * <pre>
   * Episode(s) of care that this encounter should be recorded against
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference episode_of_care = 17 [(.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getEpisodeOfCareOrBuilderList();
  /**
   *
   *
   * <pre>
   * Episode(s) of care that this encounter should be recorded against
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference episode_of_care = 17 [(.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getEpisodeOfCareOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The ReferralRequest that initiated this encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference incoming_referral = 18 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getIncomingReferralList();
  /**
   *
   *
   * <pre>
   * The ReferralRequest that initiated this encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference incoming_referral = 18 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getIncomingReferral(int index);
  /**
   *
   *
   * <pre>
   * The ReferralRequest that initiated this encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference incoming_referral = 18 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  int getIncomingReferralCount();
  /**
   *
   *
   * <pre>
   * The ReferralRequest that initiated this encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference incoming_referral = 18 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getIncomingReferralOrBuilderList();
  /**
   *
   *
   * <pre>
   * The ReferralRequest that initiated this encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference incoming_referral = 18 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getIncomingReferralOrBuilder(int index);

  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Participant participant = 19;</code>
   */
  java.util.List<com.google.fhir.stu3.uscore.UsCoreEncounter.Participant> getParticipantList();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Participant participant = 19;</code>
   */
  com.google.fhir.stu3.uscore.UsCoreEncounter.Participant getParticipant(int index);
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Participant participant = 19;</code>
   */
  int getParticipantCount();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Participant participant = 19;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.uscore.UsCoreEncounter.ParticipantOrBuilder>
      getParticipantOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Participant participant = 19;</code>
   */
  com.google.fhir.stu3.uscore.UsCoreEncounter.ParticipantOrBuilder getParticipantOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The appointment that scheduled this encounter
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference appointment = 20 [(.google.fhir.proto.valid_reference_type) = "Appointment"];
   * </code>
   *
   * @return Whether the appointment field is set.
   */
  boolean hasAppointment();
  /**
   *
   *
   * <pre>
   * The appointment that scheduled this encounter
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference appointment = 20 [(.google.fhir.proto.valid_reference_type) = "Appointment"];
   * </code>
   *
   * @return The appointment.
   */
  com.google.fhir.stu3.proto.Reference getAppointment();
  /**
   *
   *
   * <pre>
   * The appointment that scheduled this encounter
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference appointment = 20 [(.google.fhir.proto.valid_reference_type) = "Appointment"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getAppointmentOrBuilder();

  /**
   *
   *
   * <pre>
   * The start and end time of the encounter
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period period = 21;</code>
   *
   * @return Whether the period field is set.
   */
  boolean hasPeriod();
  /**
   *
   *
   * <pre>
   * The start and end time of the encounter
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period period = 21;</code>
   *
   * @return The period.
   */
  com.google.fhir.stu3.proto.Period getPeriod();
  /**
   *
   *
   * <pre>
   * The start and end time of the encounter
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period period = 21;</code>
   */
  com.google.fhir.stu3.proto.PeriodOrBuilder getPeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * Quantity of time the encounter lasted (less time absent)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Duration length = 22;</code>
   *
   * @return Whether the length field is set.
   */
  boolean hasLength();
  /**
   *
   *
   * <pre>
   * Quantity of time the encounter lasted (less time absent)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Duration length = 22;</code>
   *
   * @return The length.
   */
  com.google.fhir.stu3.proto.Duration getLength();
  /**
   *
   *
   * <pre>
   * Quantity of time the encounter lasted (less time absent)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Duration length = 22;</code>
   */
  com.google.fhir.stu3.proto.DurationOrBuilder getLengthOrBuilder();

  /**
   *
   *
   * <pre>
   * Reason the encounter takes place (code)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason = 23;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getReasonList();
  /**
   *
   *
   * <pre>
   * Reason the encounter takes place (code)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason = 23;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getReason(int index);
  /**
   *
   *
   * <pre>
   * Reason the encounter takes place (code)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason = 23;</code>
   */
  int getReasonCount();
  /**
   *
   *
   * <pre>
   * Reason the encounter takes place (code)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason = 23;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getReasonOrBuilderList();
  /**
   *
   *
   * <pre>
   * Reason the encounter takes place (code)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason = 23;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getReasonOrBuilder(int index);

  /** <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Diagnosis diagnosis = 24;</code> */
  java.util.List<com.google.fhir.stu3.uscore.UsCoreEncounter.Diagnosis> getDiagnosisList();
  /** <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Diagnosis diagnosis = 24;</code> */
  com.google.fhir.stu3.uscore.UsCoreEncounter.Diagnosis getDiagnosis(int index);
  /** <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Diagnosis diagnosis = 24;</code> */
  int getDiagnosisCount();
  /** <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Diagnosis diagnosis = 24;</code> */
  java.util.List<? extends com.google.fhir.stu3.uscore.UsCoreEncounter.DiagnosisOrBuilder>
      getDiagnosisOrBuilderList();
  /** <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Diagnosis diagnosis = 24;</code> */
  com.google.fhir.stu3.uscore.UsCoreEncounter.DiagnosisOrBuilder getDiagnosisOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The set of accounts that may be used for billing for this Encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference account = 25 [(.google.fhir.proto.valid_reference_type) = "Account"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getAccountList();
  /**
   *
   *
   * <pre>
   * The set of accounts that may be used for billing for this Encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference account = 25 [(.google.fhir.proto.valid_reference_type) = "Account"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getAccount(int index);
  /**
   *
   *
   * <pre>
   * The set of accounts that may be used for billing for this Encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference account = 25 [(.google.fhir.proto.valid_reference_type) = "Account"];
   * </code>
   */
  int getAccountCount();
  /**
   *
   *
   * <pre>
   * The set of accounts that may be used for billing for this Encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference account = 25 [(.google.fhir.proto.valid_reference_type) = "Account"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getAccountOrBuilderList();
  /**
   *
   *
   * <pre>
   * The set of accounts that may be used for billing for this Encounter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference account = 25 [(.google.fhir.proto.valid_reference_type) = "Account"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getAccountOrBuilder(int index);

  /**
   * <code>.google.fhir.stu3.uscore.UsCoreEncounter.Hospitalization hospitalization = 26;</code>
   *
   * @return Whether the hospitalization field is set.
   */
  boolean hasHospitalization();
  /**
   * <code>.google.fhir.stu3.uscore.UsCoreEncounter.Hospitalization hospitalization = 26;</code>
   *
   * @return The hospitalization.
   */
  com.google.fhir.stu3.uscore.UsCoreEncounter.Hospitalization getHospitalization();
  /** <code>.google.fhir.stu3.uscore.UsCoreEncounter.Hospitalization hospitalization = 26;</code> */
  com.google.fhir.stu3.uscore.UsCoreEncounter.HospitalizationOrBuilder
      getHospitalizationOrBuilder();

  /** <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Location location = 27;</code> */
  java.util.List<com.google.fhir.stu3.uscore.UsCoreEncounter.Location> getLocationList();
  /** <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Location location = 27;</code> */
  com.google.fhir.stu3.uscore.UsCoreEncounter.Location getLocation(int index);
  /** <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Location location = 27;</code> */
  int getLocationCount();
  /** <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Location location = 27;</code> */
  java.util.List<? extends com.google.fhir.stu3.uscore.UsCoreEncounter.LocationOrBuilder>
      getLocationOrBuilderList();
  /** <code>repeated .google.fhir.stu3.uscore.UsCoreEncounter.Location location = 27;</code> */
  com.google.fhir.stu3.uscore.UsCoreEncounter.LocationOrBuilder getLocationOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The custodian organization of this Encounter record
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference service_provider = 28 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the serviceProvider field is set.
   */
  boolean hasServiceProvider();
  /**
   *
   *
   * <pre>
   * The custodian organization of this Encounter record
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference service_provider = 28 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The serviceProvider.
   */
  com.google.fhir.stu3.proto.Reference getServiceProvider();
  /**
   *
   *
   * <pre>
   * The custodian organization of this Encounter record
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference service_provider = 28 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getServiceProviderOrBuilder();

  /**
   *
   *
   * <pre>
   * Another Encounter this encounter is part of
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference part_of = 29 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return Whether the partOf field is set.
   */
  boolean hasPartOf();
  /**
   *
   *
   * <pre>
   * Another Encounter this encounter is part of
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference part_of = 29 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return The partOf.
   */
  com.google.fhir.stu3.proto.Reference getPartOf();
  /**
   *
   *
   * <pre>
   * Another Encounter this encounter is part of
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference part_of = 29 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPartOfOrBuilder();
}
