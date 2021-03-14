// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/care_team.proto

package com.google.fhir.r4.core;

public interface CareTeamOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.CareTeam)
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
   * External Ids for this team
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * External Ids for this team
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * External Ids for this team
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * External Ids for this team
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
   * External Ids for this team
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   * <code>.google.fhir.r4.core.CareTeam.StatusCode status = 11;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.google.fhir.r4.core.CareTeam.StatusCode status = 11;</code>
   *
   * @return The status.
   */
  com.google.fhir.r4.core.CareTeam.StatusCode getStatus();
  /** <code>.google.fhir.r4.core.CareTeam.StatusCode status = 11;</code> */
  com.google.fhir.r4.core.CareTeam.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Type of team
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 12;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getCategoryList();
  /**
   *
   *
   * <pre>
   * Type of team
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getCategory(int index);
  /**
   *
   *
   * <pre>
   * Type of team
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 12;</code>
   */
  int getCategoryCount();
  /**
   *
   *
   * <pre>
   * Type of team
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 12;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getCategoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Type of team
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCategoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Name of the team, such as crisis assessment team
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 13;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of the team, such as crisis assessment team
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 13;</code>
   *
   * @return The name.
   */
  com.google.fhir.r4.core.String getName();
  /**
   *
   *
   * <pre>
   * Name of the team, such as crisis assessment team
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 13;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getNameOrBuilder();

  /**
   *
   *
   * <pre>
   * Who care team is for
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 14 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * Who care team is for
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 14 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.r4.core.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Who care team is for
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 14 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Encounter created as part of
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 15 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return Whether the encounter field is set.
   */
  boolean hasEncounter();
  /**
   *
   *
   * <pre>
   * Encounter created as part of
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 15 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return The encounter.
   */
  com.google.fhir.r4.core.Reference getEncounter();
  /**
   *
   *
   * <pre>
   * Encounter created as part of
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 15 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getEncounterOrBuilder();

  /**
   *
   *
   * <pre>
   * Time period team covers
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 16;</code>
   *
   * @return Whether the period field is set.
   */
  boolean hasPeriod();
  /**
   *
   *
   * <pre>
   * Time period team covers
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 16;</code>
   *
   * @return The period.
   */
  com.google.fhir.r4.core.Period getPeriod();
  /**
   *
   *
   * <pre>
   * Time period team covers
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 16;</code>
   */
  com.google.fhir.r4.core.PeriodOrBuilder getPeriodOrBuilder();

  /** <code>repeated .google.fhir.r4.core.CareTeam.Participant participant = 17;</code> */
  java.util.List<com.google.fhir.r4.core.CareTeam.Participant> getParticipantList();
  /** <code>repeated .google.fhir.r4.core.CareTeam.Participant participant = 17;</code> */
  com.google.fhir.r4.core.CareTeam.Participant getParticipant(int index);
  /** <code>repeated .google.fhir.r4.core.CareTeam.Participant participant = 17;</code> */
  int getParticipantCount();
  /** <code>repeated .google.fhir.r4.core.CareTeam.Participant participant = 17;</code> */
  java.util.List<? extends com.google.fhir.r4.core.CareTeam.ParticipantOrBuilder>
      getParticipantOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.CareTeam.Participant participant = 17;</code> */
  com.google.fhir.r4.core.CareTeam.ParticipantOrBuilder getParticipantOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Why the care team exists
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 18;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getReasonCodeList();
  /**
   *
   *
   * <pre>
   * Why the care team exists
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 18;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getReasonCode(int index);
  /**
   *
   *
   * <pre>
   * Why the care team exists
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 18;</code>
   */
  int getReasonCodeCount();
  /**
   *
   *
   * <pre>
   * Why the care team exists
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 18;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getReasonCodeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Why the care team exists
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 18;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getReasonCodeOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Why the care team exists
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reason_reference = 19 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getReasonReferenceList();
  /**
   *
   *
   * <pre>
   * Why the care team exists
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reason_reference = 19 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getReasonReference(int index);
  /**
   *
   *
   * <pre>
   * Why the care team exists
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reason_reference = 19 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  int getReasonReferenceCount();
  /**
   *
   *
   * <pre>
   * Why the care team exists
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reason_reference = 19 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getReasonReferenceOrBuilderList();
  /**
   *
   *
   * <pre>
   * Why the care team exists
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reason_reference = 19 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getReasonReferenceOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Organization responsible for the care team
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference managing_organization = 20 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getManagingOrganizationList();
  /**
   *
   *
   * <pre>
   * Organization responsible for the care team
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference managing_organization = 20 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getManagingOrganization(int index);
  /**
   *
   *
   * <pre>
   * Organization responsible for the care team
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference managing_organization = 20 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  int getManagingOrganizationCount();
  /**
   *
   *
   * <pre>
   * Organization responsible for the care team
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference managing_organization = 20 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getManagingOrganizationOrBuilderList();
  /**
   *
   *
   * <pre>
   * Organization responsible for the care team
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference managing_organization = 20 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getManagingOrganizationOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A contact detail for the care team (that applies to all members)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 21;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactPoint> getTelecomList();
  /**
   *
   *
   * <pre>
   * A contact detail for the care team (that applies to all members)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 21;</code>
   */
  com.google.fhir.r4.core.ContactPoint getTelecom(int index);
  /**
   *
   *
   * <pre>
   * A contact detail for the care team (that applies to all members)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 21;</code>
   */
  int getTelecomCount();
  /**
   *
   *
   * <pre>
   * A contact detail for the care team (that applies to all members)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 21;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ContactPointOrBuilder> getTelecomOrBuilderList();
  /**
   *
   *
   * <pre>
   * A contact detail for the care team (that applies to all members)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 21;</code>
   */
  com.google.fhir.r4.core.ContactPointOrBuilder getTelecomOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Comments made about the CareTeam
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 22;</code>
   */
  java.util.List<com.google.fhir.r4.core.Annotation> getNoteList();
  /**
   *
   *
   * <pre>
   * Comments made about the CareTeam
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 22;</code>
   */
  com.google.fhir.r4.core.Annotation getNote(int index);
  /**
   *
   *
   * <pre>
   * Comments made about the CareTeam
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 22;</code>
   */
  int getNoteCount();
  /**
   *
   *
   * <pre>
   * Comments made about the CareTeam
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 22;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AnnotationOrBuilder> getNoteOrBuilderList();
  /**
   *
   *
   * <pre>
   * Comments made about the CareTeam
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 22;</code>
   */
  com.google.fhir.r4.core.AnnotationOrBuilder getNoteOrBuilder(int index);
}