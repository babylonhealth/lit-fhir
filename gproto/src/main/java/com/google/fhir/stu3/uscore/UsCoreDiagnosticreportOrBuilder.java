// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/uscore.proto

package com.google.fhir.stu3.uscore;

public interface UsCoreDiagnosticreportOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.uscore.UsCoreDiagnosticreport)
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
   * Business identifier for report
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Business identifier for report
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Business identifier for report
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Business identifier for report
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
   * Business identifier for report
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * What was requested
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getBasedOnList();
  /**
   *
   *
   * <pre>
   * What was requested
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getBasedOn(int index);
  /**
   *
   *
   * <pre>
   * What was requested
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  int getBasedOnCount();
  /**
   *
   *
   * <pre>
   * What was requested
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getBasedOnOrBuilderList();
  /**
   *
   *
   * <pre>
   * What was requested
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getBasedOnOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * registered | partial | preliminary | final +
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.DiagnosticReportStatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * registered | partial | preliminary | final +
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.DiagnosticReportStatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.DiagnosticReportStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * registered | partial | preliminary | final +
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.DiagnosticReportStatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.DiagnosticReportStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Service category
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CodeableConcept category = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the category field is set.
   */
  boolean hasCategory();
  /**
   *
   *
   * <pre>
   * Service category
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CodeableConcept category = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The category.
   */
  com.google.fhir.stu3.proto.CodeableConcept getCategory();
  /**
   *
   *
   * <pre>
   * Service category
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CodeableConcept category = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getCategoryOrBuilder();

  /**
   *
   *
   * <pre>
   * US Core Laboratory Report Order Code
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
   * US Core Laboratory Report Order Code
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
   * US Core Laboratory Report Order Code
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
   * The subject of the report - usually, but not always, the patient
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * The subject of the report - usually, but not always, the patient
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   *
   *
   * <pre>
   * The subject of the report - usually, but not always, the patient
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Health care event when test ordered
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
   * Health care event when test ordered
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
   * Health care event when test ordered
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 15 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getContextOrBuilder();

  /**
   * <code>
   * .google.fhir.stu3.uscore.UsCoreDiagnosticreport.Effective effective = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the effective field is set.
   */
  boolean hasEffective();
  /**
   * <code>
   * .google.fhir.stu3.uscore.UsCoreDiagnosticreport.Effective effective = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The effective.
   */
  com.google.fhir.stu3.uscore.UsCoreDiagnosticreport.Effective getEffective();
  /**
   * <code>
   * .google.fhir.stu3.uscore.UsCoreDiagnosticreport.Effective effective = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.uscore.UsCoreDiagnosticreport.EffectiveOrBuilder getEffectiveOrBuilder();

  /**
   *
   *
   * <pre>
   * DateTime this version was released
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Instant issued = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the issued field is set.
   */
  boolean hasIssued();
  /**
   *
   *
   * <pre>
   * DateTime this version was released
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Instant issued = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The issued.
   */
  com.google.fhir.stu3.proto.Instant getIssued();
  /**
   *
   *
   * <pre>
   * DateTime this version was released
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Instant issued = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.InstantOrBuilder getIssuedOrBuilder();

  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreDiagnosticreport.Performer performer = 18;</code>
   */
  java.util.List<com.google.fhir.stu3.uscore.UsCoreDiagnosticreport.Performer> getPerformerList();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreDiagnosticreport.Performer performer = 18;</code>
   */
  com.google.fhir.stu3.uscore.UsCoreDiagnosticreport.Performer getPerformer(int index);
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreDiagnosticreport.Performer performer = 18;</code>
   */
  int getPerformerCount();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreDiagnosticreport.Performer performer = 18;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.uscore.UsCoreDiagnosticreport.PerformerOrBuilder>
      getPerformerOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.uscore.UsCoreDiagnosticreport.Performer performer = 18;</code>
   */
  com.google.fhir.stu3.uscore.UsCoreDiagnosticreport.PerformerOrBuilder getPerformerOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Specimens this report is based on
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference specimen = 19 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getSpecimenList();
  /**
   *
   *
   * <pre>
   * Specimens this report is based on
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference specimen = 19 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getSpecimen(int index);
  /**
   *
   *
   * <pre>
   * Specimens this report is based on
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference specimen = 19 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  int getSpecimenCount();
  /**
   *
   *
   * <pre>
   * Specimens this report is based on
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference specimen = 19 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getSpecimenOrBuilderList();
  /**
   *
   *
   * <pre>
   * Specimens this report is based on
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference specimen = 19 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSpecimenOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Observations - simple, or complex nested groups
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference result = 20 [(.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getResultList();
  /**
   *
   *
   * <pre>
   * Observations - simple, or complex nested groups
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference result = 20 [(.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getResult(int index);
  /**
   *
   *
   * <pre>
   * Observations - simple, or complex nested groups
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference result = 20 [(.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  int getResultCount();
  /**
   *
   *
   * <pre>
   * Observations - simple, or complex nested groups
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference result = 20 [(.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getResultOrBuilderList();
  /**
   *
   *
   * <pre>
   * Observations - simple, or complex nested groups
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference result = 20 [(.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getResultOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Reference to full details of imaging associated with the diagnostic report
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference imaging_study = 21 [(.google.fhir.proto.valid_reference_type) = "ImagingStudy", (.google.fhir.proto.valid_reference_type) = "ImagingManifest"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getImagingStudyList();
  /**
   *
   *
   * <pre>
   * Reference to full details of imaging associated with the diagnostic report
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference imaging_study = 21 [(.google.fhir.proto.valid_reference_type) = "ImagingStudy", (.google.fhir.proto.valid_reference_type) = "ImagingManifest"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getImagingStudy(int index);
  /**
   *
   *
   * <pre>
   * Reference to full details of imaging associated with the diagnostic report
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference imaging_study = 21 [(.google.fhir.proto.valid_reference_type) = "ImagingStudy", (.google.fhir.proto.valid_reference_type) = "ImagingManifest"];
   * </code>
   */
  int getImagingStudyCount();
  /**
   *
   *
   * <pre>
   * Reference to full details of imaging associated with the diagnostic report
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference imaging_study = 21 [(.google.fhir.proto.valid_reference_type) = "ImagingStudy", (.google.fhir.proto.valid_reference_type) = "ImagingManifest"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getImagingStudyOrBuilderList();
  /**
   *
   *
   * <pre>
   * Reference to full details of imaging associated with the diagnostic report
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference imaging_study = 21 [(.google.fhir.proto.valid_reference_type) = "ImagingStudy", (.google.fhir.proto.valid_reference_type) = "ImagingManifest"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getImagingStudyOrBuilder(int index);

  /** <code>repeated .google.fhir.stu3.uscore.UsCoreDiagnosticreport.Image image = 22;</code> */
  java.util.List<com.google.fhir.stu3.uscore.UsCoreDiagnosticreport.Image> getImageList();
  /** <code>repeated .google.fhir.stu3.uscore.UsCoreDiagnosticreport.Image image = 22;</code> */
  com.google.fhir.stu3.uscore.UsCoreDiagnosticreport.Image getImage(int index);
  /** <code>repeated .google.fhir.stu3.uscore.UsCoreDiagnosticreport.Image image = 22;</code> */
  int getImageCount();
  /** <code>repeated .google.fhir.stu3.uscore.UsCoreDiagnosticreport.Image image = 22;</code> */
  java.util.List<? extends com.google.fhir.stu3.uscore.UsCoreDiagnosticreport.ImageOrBuilder>
      getImageOrBuilderList();
  /** <code>repeated .google.fhir.stu3.uscore.UsCoreDiagnosticreport.Image image = 22;</code> */
  com.google.fhir.stu3.uscore.UsCoreDiagnosticreport.ImageOrBuilder getImageOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Clinical Interpretation of test results
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String conclusion = 23;</code>
   *
   * @return Whether the conclusion field is set.
   */
  boolean hasConclusion();
  /**
   *
   *
   * <pre>
   * Clinical Interpretation of test results
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String conclusion = 23;</code>
   *
   * @return The conclusion.
   */
  com.google.fhir.stu3.proto.String getConclusion();
  /**
   *
   *
   * <pre>
   * Clinical Interpretation of test results
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String conclusion = 23;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getConclusionOrBuilder();

  /**
   *
   *
   * <pre>
   * Codes for the conclusion
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept coded_diagnosis = 24;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getCodedDiagnosisList();
  /**
   *
   *
   * <pre>
   * Codes for the conclusion
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept coded_diagnosis = 24;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getCodedDiagnosis(int index);
  /**
   *
   *
   * <pre>
   * Codes for the conclusion
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept coded_diagnosis = 24;</code>
   */
  int getCodedDiagnosisCount();
  /**
   *
   *
   * <pre>
   * Codes for the conclusion
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept coded_diagnosis = 24;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getCodedDiagnosisOrBuilderList();
  /**
   *
   *
   * <pre>
   * Codes for the conclusion
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept coded_diagnosis = 24;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getCodedDiagnosisOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Entire report as issued
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Attachment presented_form = 25;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Attachment> getPresentedFormList();
  /**
   *
   *
   * <pre>
   * Entire report as issued
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Attachment presented_form = 25;</code>
   */
  com.google.fhir.stu3.proto.Attachment getPresentedForm(int index);
  /**
   *
   *
   * <pre>
   * Entire report as issued
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Attachment presented_form = 25;</code>
   */
  int getPresentedFormCount();
  /**
   *
   *
   * <pre>
   * Entire report as issued
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Attachment presented_form = 25;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.AttachmentOrBuilder>
      getPresentedFormOrBuilderList();
  /**
   *
   *
   * <pre>
   * Entire report as issued
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Attachment presented_form = 25;</code>
   */
  com.google.fhir.stu3.proto.AttachmentOrBuilder getPresentedFormOrBuilder(int index);
}
