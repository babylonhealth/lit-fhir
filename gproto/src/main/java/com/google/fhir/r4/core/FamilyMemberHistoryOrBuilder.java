// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/family_member_history.proto

package com.google.fhir.r4.core;

public interface FamilyMemberHistoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.FamilyMemberHistory)
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
   * External Id(s) for this record
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * External Id(s) for this record
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   * <pre>
   * External Id(s) for this record
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * External Id(s) for this record
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * External Id(s) for this record
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  java.util.List<com.google.fhir.r4.core.Canonical> 
      getInstantiatesCanonicalList();
  /**
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  com.google.fhir.r4.core.Canonical getInstantiatesCanonical(int index);
  /**
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  int getInstantiatesCanonicalCount();
  /**
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CanonicalOrBuilder> 
      getInstantiatesCanonicalOrBuilderList();
  /**
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  com.google.fhir.r4.core.CanonicalOrBuilder getInstantiatesCanonicalOrBuilder(
      int index);

  /**
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  java.util.List<com.google.fhir.r4.core.Uri> 
      getInstantiatesUriList();
  /**
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  com.google.fhir.r4.core.Uri getInstantiatesUri(int index);
  /**
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  int getInstantiatesUriCount();
  /**
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.UriOrBuilder> 
      getInstantiatesUriOrBuilderList();
  /**
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getInstantiatesUriOrBuilder(
      int index);

  /**
   * <code>.google.fhir.r4.core.FamilyMemberHistory.StatusCode status = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.google.fhir.r4.core.FamilyMemberHistory.StatusCode status = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The status.
   */
  com.google.fhir.r4.core.FamilyMemberHistory.StatusCode getStatus();
  /**
   * <code>.google.fhir.r4.core.FamilyMemberHistory.StatusCode status = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.FamilyMemberHistory.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * subject-unknown | withheld | unable-to-obtain | deferred
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept data_absent_reason = 14;</code>
   * @return Whether the dataAbsentReason field is set.
   */
  boolean hasDataAbsentReason();
  /**
   * <pre>
   * subject-unknown | withheld | unable-to-obtain | deferred
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept data_absent_reason = 14;</code>
   * @return The dataAbsentReason.
   */
  com.google.fhir.r4.core.CodeableConcept getDataAbsentReason();
  /**
   * <pre>
   * subject-unknown | withheld | unable-to-obtain | deferred
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept data_absent_reason = 14;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getDataAbsentReasonOrBuilder();

  /**
   * <pre>
   * Patient history is about
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference patient = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return Whether the patient field is set.
   */
  boolean hasPatient();
  /**
   * <pre>
   * Patient history is about
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference patient = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return The patient.
   */
  com.google.fhir.r4.core.Reference getPatient();
  /**
   * <pre>
   * Patient history is about
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference patient = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPatientOrBuilder();

  /**
   * <pre>
   * When history was recorded or last updated
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date = 16;</code>
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   * <pre>
   * When history was recorded or last updated
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date = 16;</code>
   * @return The date.
   */
  com.google.fhir.r4.core.DateTime getDate();
  /**
   * <pre>
   * When history was recorded or last updated
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date = 16;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getDateOrBuilder();

  /**
   * <pre>
   * The family member described
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 17;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The family member described
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 17;</code>
   * @return The name.
   */
  com.google.fhir.r4.core.String getName();
  /**
   * <pre>
   * The family member described
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 17;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Relationship to the subject
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept relationship = 18 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the relationship field is set.
   */
  boolean hasRelationship();
  /**
   * <pre>
   * Relationship to the subject
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept relationship = 18 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The relationship.
   */
  com.google.fhir.r4.core.CodeableConcept getRelationship();
  /**
   * <pre>
   * Relationship to the subject
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept relationship = 18 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getRelationshipOrBuilder();

  /**
   * <pre>
   * male | female | other | unknown
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept sex = 19;</code>
   * @return Whether the sex field is set.
   */
  boolean hasSex();
  /**
   * <pre>
   * male | female | other | unknown
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept sex = 19;</code>
   * @return The sex.
   */
  com.google.fhir.r4.core.CodeableConcept getSex();
  /**
   * <pre>
   * male | female | other | unknown
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept sex = 19;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getSexOrBuilder();

  /**
   * <code>.google.fhir.r4.core.FamilyMemberHistory.BornX born = 20;</code>
   * @return Whether the born field is set.
   */
  boolean hasBorn();
  /**
   * <code>.google.fhir.r4.core.FamilyMemberHistory.BornX born = 20;</code>
   * @return The born.
   */
  com.google.fhir.r4.core.FamilyMemberHistory.BornX getBorn();
  /**
   * <code>.google.fhir.r4.core.FamilyMemberHistory.BornX born = 20;</code>
   */
  com.google.fhir.r4.core.FamilyMemberHistory.BornXOrBuilder getBornOrBuilder();

  /**
   * <code>.google.fhir.r4.core.FamilyMemberHistory.AgeX age = 21;</code>
   * @return Whether the age field is set.
   */
  boolean hasAge();
  /**
   * <code>.google.fhir.r4.core.FamilyMemberHistory.AgeX age = 21;</code>
   * @return The age.
   */
  com.google.fhir.r4.core.FamilyMemberHistory.AgeX getAge();
  /**
   * <code>.google.fhir.r4.core.FamilyMemberHistory.AgeX age = 21;</code>
   */
  com.google.fhir.r4.core.FamilyMemberHistory.AgeXOrBuilder getAgeOrBuilder();

  /**
   * <pre>
   * Age is estimated?
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean estimated_age = 22;</code>
   * @return Whether the estimatedAge field is set.
   */
  boolean hasEstimatedAge();
  /**
   * <pre>
   * Age is estimated?
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean estimated_age = 22;</code>
   * @return The estimatedAge.
   */
  com.google.fhir.r4.core.Boolean getEstimatedAge();
  /**
   * <pre>
   * Age is estimated?
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean estimated_age = 22;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getEstimatedAgeOrBuilder();

  /**
   * <code>.google.fhir.r4.core.FamilyMemberHistory.DeceasedX deceased = 23;</code>
   * @return Whether the deceased field is set.
   */
  boolean hasDeceased();
  /**
   * <code>.google.fhir.r4.core.FamilyMemberHistory.DeceasedX deceased = 23;</code>
   * @return The deceased.
   */
  com.google.fhir.r4.core.FamilyMemberHistory.DeceasedX getDeceased();
  /**
   * <code>.google.fhir.r4.core.FamilyMemberHistory.DeceasedX deceased = 23;</code>
   */
  com.google.fhir.r4.core.FamilyMemberHistory.DeceasedXOrBuilder getDeceasedOrBuilder();

  /**
   * <pre>
   * Why was family member history performed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 24;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getReasonCodeList();
  /**
   * <pre>
   * Why was family member history performed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 24;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getReasonCode(int index);
  /**
   * <pre>
   * Why was family member history performed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 24;</code>
   */
  int getReasonCodeCount();
  /**
   * <pre>
   * Why was family member history performed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 24;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getReasonCodeOrBuilderList();
  /**
   * <pre>
   * Why was family member history performed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 24;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getReasonCodeOrBuilder(
      int index);

  /**
   * <pre>
   * Why was family member history performed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 25 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance", (.google.fhir.proto.valid_reference_type) = "QuestionnaireResponse", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getReasonReferenceList();
  /**
   * <pre>
   * Why was family member history performed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 25 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance", (.google.fhir.proto.valid_reference_type) = "QuestionnaireResponse", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];</code>
   */
  com.google.fhir.r4.core.Reference getReasonReference(int index);
  /**
   * <pre>
   * Why was family member history performed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 25 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance", (.google.fhir.proto.valid_reference_type) = "QuestionnaireResponse", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];</code>
   */
  int getReasonReferenceCount();
  /**
   * <pre>
   * Why was family member history performed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 25 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance", (.google.fhir.proto.valid_reference_type) = "QuestionnaireResponse", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getReasonReferenceOrBuilderList();
  /**
   * <pre>
   * Why was family member history performed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 25 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance", (.google.fhir.proto.valid_reference_type) = "QuestionnaireResponse", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getReasonReferenceOrBuilder(
      int index);

  /**
   * <pre>
   * General note about related person
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 26;</code>
   */
  java.util.List<com.google.fhir.r4.core.Annotation> 
      getNoteList();
  /**
   * <pre>
   * General note about related person
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 26;</code>
   */
  com.google.fhir.r4.core.Annotation getNote(int index);
  /**
   * <pre>
   * General note about related person
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 26;</code>
   */
  int getNoteCount();
  /**
   * <pre>
   * General note about related person
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 26;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AnnotationOrBuilder> 
      getNoteOrBuilderList();
  /**
   * <pre>
   * General note about related person
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 26;</code>
   */
  com.google.fhir.r4.core.AnnotationOrBuilder getNoteOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.core.FamilyMemberHistory.Condition condition = 27;</code>
   */
  java.util.List<com.google.fhir.r4.core.FamilyMemberHistory.Condition> 
      getConditionList();
  /**
   * <code>repeated .google.fhir.r4.core.FamilyMemberHistory.Condition condition = 27;</code>
   */
  com.google.fhir.r4.core.FamilyMemberHistory.Condition getCondition(int index);
  /**
   * <code>repeated .google.fhir.r4.core.FamilyMemberHistory.Condition condition = 27;</code>
   */
  int getConditionCount();
  /**
   * <code>repeated .google.fhir.r4.core.FamilyMemberHistory.Condition condition = 27;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.FamilyMemberHistory.ConditionOrBuilder> 
      getConditionOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.FamilyMemberHistory.Condition condition = 27;</code>
   */
  com.google.fhir.r4.core.FamilyMemberHistory.ConditionOrBuilder getConditionOrBuilder(
      int index);
}
