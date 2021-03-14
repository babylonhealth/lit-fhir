// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/profiles.proto

package com.google.fhir.stu3.proto;

public interface LdlCholesterolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.LdlCholesterol)
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
   * Business Identifier for observation
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Business Identifier for observation
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Business Identifier for observation
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Business Identifier for observation
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
   * Business Identifier for observation
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Fulfills plan, proposal or order
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "DeviceRequest", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getBasedOnList();
  /**
   *
   *
   * <pre>
   * Fulfills plan, proposal or order
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "DeviceRequest", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getBasedOn(int index);
  /**
   *
   *
   * <pre>
   * Fulfills plan, proposal or order
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "DeviceRequest", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  int getBasedOnCount();
  /**
   *
   *
   * <pre>
   * Fulfills plan, proposal or order
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "DeviceRequest", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getBasedOnOrBuilderList();
  /**
   *
   *
   * <pre>
   * Fulfills plan, proposal or order
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "DeviceRequest", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getBasedOnOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * registered | preliminary | final | amended +
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.ObservationStatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * registered | preliminary | final | amended +
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.ObservationStatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.ObservationStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * registered | preliminary | final | amended +
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.ObservationStatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.ObservationStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Classification of  type of observation
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 12;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getCategoryList();
  /**
   *
   *
   * <pre>
   * Classification of  type of observation
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 12;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getCategory(int index);
  /**
   *
   *
   * <pre>
   * Classification of  type of observation
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 12;</code>
   */
  int getCategoryCount();
  /**
   *
   *
   * <pre>
   * Classification of  type of observation
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 12;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getCategoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Classification of  type of observation
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 12;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getCategoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * LDL Cholesterol -measured or calculated per code
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CodeableConcept code = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   *
   *
   * <pre>
   * LDL Cholesterol -measured or calculated per code
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CodeableConcept code = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The code.
   */
  com.google.fhir.stu3.proto.CodeableConcept getCode();
  /**
   *
   *
   * <pre>
   * LDL Cholesterol -measured or calculated per code
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CodeableConcept code = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getCodeOrBuilder();

  /**
   *
   *
   * <pre>
   * Who and/or what this is about
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 14 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * Who and/or what this is about
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 14 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Who and/or what this is about
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 14 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Healthcare event during which this observation is made
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 15 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * Healthcare event during which this observation is made
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 15 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   *
   * @return The context.
   */
  com.google.fhir.stu3.proto.Reference getContext();
  /**
   *
   *
   * <pre>
   * Healthcare event during which this observation is made
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 15 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getContextOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.LdlCholesterol.Effective effective = 16;</code>
   *
   * @return Whether the effective field is set.
   */
  boolean hasEffective();
  /**
   * <code>.google.fhir.stu3.proto.LdlCholesterol.Effective effective = 16;</code>
   *
   * @return The effective.
   */
  com.google.fhir.stu3.proto.LdlCholesterol.Effective getEffective();
  /** <code>.google.fhir.stu3.proto.LdlCholesterol.Effective effective = 16;</code> */
  com.google.fhir.stu3.proto.LdlCholesterol.EffectiveOrBuilder getEffectiveOrBuilder();

  /**
   *
   *
   * <pre>
   * Date/Time this was made available
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Instant issued = 17;</code>
   *
   * @return Whether the issued field is set.
   */
  boolean hasIssued();
  /**
   *
   *
   * <pre>
   * Date/Time this was made available
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Instant issued = 17;</code>
   *
   * @return The issued.
   */
  com.google.fhir.stu3.proto.Instant getIssued();
  /**
   *
   *
   * <pre>
   * Date/Time this was made available
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Instant issued = 17;</code>
   */
  com.google.fhir.stu3.proto.InstantOrBuilder getIssuedOrBuilder();

  /**
   *
   *
   * <pre>
   * Who is responsible for the observation
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference performer = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getPerformerList();
  /**
   *
   *
   * <pre>
   * Who is responsible for the observation
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference performer = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getPerformer(int index);
  /**
   *
   *
   * <pre>
   * Who is responsible for the observation
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference performer = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  int getPerformerCount();
  /**
   *
   *
   * <pre>
   * Who is responsible for the observation
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference performer = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getPerformerOrBuilderList();
  /**
   *
   *
   * <pre>
   * Who is responsible for the observation
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference performer = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPerformerOrBuilder(int index);

  /**
   * <code>.google.fhir.stu3.proto.LdlCholesterol.Value value = 19;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.google.fhir.stu3.proto.LdlCholesterol.Value value = 19;</code>
   *
   * @return The value.
   */
  com.google.fhir.stu3.proto.LdlCholesterol.Value getValue();
  /** <code>.google.fhir.stu3.proto.LdlCholesterol.Value value = 19;</code> */
  com.google.fhir.stu3.proto.LdlCholesterol.ValueOrBuilder getValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Why the result is missing
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept data_absent_reason = 20;</code>
   *
   * @return Whether the dataAbsentReason field is set.
   */
  boolean hasDataAbsentReason();
  /**
   *
   *
   * <pre>
   * Why the result is missing
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept data_absent_reason = 20;</code>
   *
   * @return The dataAbsentReason.
   */
  com.google.fhir.stu3.proto.CodeableConcept getDataAbsentReason();
  /**
   *
   *
   * <pre>
   * Why the result is missing
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept data_absent_reason = 20;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getDataAbsentReasonOrBuilder();

  /**
   *
   *
   * <pre>
   * + | ++ | +++ | - | -- | ---
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept interpretation = 21;</code>
   *
   * @return Whether the interpretation field is set.
   */
  boolean hasInterpretation();
  /**
   *
   *
   * <pre>
   * + | ++ | +++ | - | -- | ---
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept interpretation = 21;</code>
   *
   * @return The interpretation.
   */
  com.google.fhir.stu3.proto.CodeableConcept getInterpretation();
  /**
   *
   *
   * <pre>
   * + | ++ | +++ | - | -- | ---
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept interpretation = 21;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getInterpretationOrBuilder();

  /**
   *
   *
   * <pre>
   * Comments about result
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String comment = 22;</code>
   *
   * @return Whether the comment field is set.
   */
  boolean hasComment();
  /**
   *
   *
   * <pre>
   * Comments about result
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String comment = 22;</code>
   *
   * @return The comment.
   */
  com.google.fhir.stu3.proto.String getComment();
  /**
   *
   *
   * <pre>
   * Comments about result
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String comment = 22;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getCommentOrBuilder();

  /**
   *
   *
   * <pre>
   * Observed body part
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept body_site = 23;</code>
   *
   * @return Whether the bodySite field is set.
   */
  boolean hasBodySite();
  /**
   *
   *
   * <pre>
   * Observed body part
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept body_site = 23;</code>
   *
   * @return The bodySite.
   */
  com.google.fhir.stu3.proto.CodeableConcept getBodySite();
  /**
   *
   *
   * <pre>
   * Observed body part
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept body_site = 23;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getBodySiteOrBuilder();

  /**
   *
   *
   * <pre>
   * How it was done
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept method = 24;</code>
   *
   * @return Whether the method field is set.
   */
  boolean hasMethod();
  /**
   *
   *
   * <pre>
   * How it was done
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept method = 24;</code>
   *
   * @return The method.
   */
  com.google.fhir.stu3.proto.CodeableConcept getMethod();
  /**
   *
   *
   * <pre>
   * How it was done
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept method = 24;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getMethodOrBuilder();

  /**
   *
   *
   * <pre>
   * Specimen used for this observation
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference specimen = 25 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   *
   * @return Whether the specimen field is set.
   */
  boolean hasSpecimen();
  /**
   *
   *
   * <pre>
   * Specimen used for this observation
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference specimen = 25 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   *
   * @return The specimen.
   */
  com.google.fhir.stu3.proto.Reference getSpecimen();
  /**
   *
   *
   * <pre>
   * Specimen used for this observation
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference specimen = 25 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSpecimenOrBuilder();

  /**
   *
   *
   * <pre>
   * (Measurement) Device
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference device = 26 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "DeviceMetric"];
   * </code>
   *
   * @return Whether the device field is set.
   */
  boolean hasDevice();
  /**
   *
   *
   * <pre>
   * (Measurement) Device
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference device = 26 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "DeviceMetric"];
   * </code>
   *
   * @return The device.
   */
  com.google.fhir.stu3.proto.Reference getDevice();
  /**
   *
   *
   * <pre>
   * (Measurement) Device
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference device = 26 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "DeviceMetric"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getDeviceOrBuilder();

  /**
   * <code>
   * .google.fhir.stu3.proto.LdlCholesterol.ReferenceRange reference_range = 27 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "low.exists() or high.exists() or text.exists()"];
   * </code>
   *
   * @return Whether the referenceRange field is set.
   */
  boolean hasReferenceRange();
  /**
   * <code>
   * .google.fhir.stu3.proto.LdlCholesterol.ReferenceRange reference_range = 27 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "low.exists() or high.exists() or text.exists()"];
   * </code>
   *
   * @return The referenceRange.
   */
  com.google.fhir.stu3.proto.LdlCholesterol.ReferenceRange getReferenceRange();
  /**
   * <code>
   * .google.fhir.stu3.proto.LdlCholesterol.ReferenceRange reference_range = 27 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "low.exists() or high.exists() or text.exists()"];
   * </code>
   */
  com.google.fhir.stu3.proto.LdlCholesterol.ReferenceRangeOrBuilder getReferenceRangeOrBuilder();

  /** <code>repeated .google.fhir.stu3.proto.LdlCholesterol.Component component = 29;</code> */
  java.util.List<com.google.fhir.stu3.proto.LdlCholesterol.Component> getComponentList();
  /** <code>repeated .google.fhir.stu3.proto.LdlCholesterol.Component component = 29;</code> */
  com.google.fhir.stu3.proto.LdlCholesterol.Component getComponent(int index);
  /** <code>repeated .google.fhir.stu3.proto.LdlCholesterol.Component component = 29;</code> */
  int getComponentCount();
  /** <code>repeated .google.fhir.stu3.proto.LdlCholesterol.Component component = 29;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.LdlCholesterol.ComponentOrBuilder>
      getComponentOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.LdlCholesterol.Component component = 29;</code> */
  com.google.fhir.stu3.proto.LdlCholesterol.ComponentOrBuilder getComponentOrBuilder(int index);
}
