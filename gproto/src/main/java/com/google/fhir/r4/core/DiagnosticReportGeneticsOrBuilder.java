// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/profiles/diagnostic_report_genetics.proto

package com.google.fhir.r4.core;

public interface DiagnosticReportGeneticsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.DiagnosticReportGenetics)
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
   * Extension
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> getExtensionList();
  /**
   *
   *
   * <pre>
   * Extension
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   *
   *
   * <pre>
   * Extension
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  int getExtensionCount();
  /**
   *
   *
   * <pre>
   * Extension
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> getExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Extension
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
   * Business identifier for report
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Business identifier for report
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Business identifier for report
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Business identifier for report
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
   * Business identifier for report
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * What was requested
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getBasedOnList();
  /**
   *
   *
   * <pre>
   * What was requested
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getBasedOn(int index);
  /**
   *
   *
   * <pre>
   * What was requested
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest"];
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
   * repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getBasedOnOrBuilderList();
  /**
   *
   *
   * <pre>
   * What was requested
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getBasedOnOrBuilder(int index);

  /**
   * <code>
   * .google.fhir.r4.core.DiagnosticReportGenetics.StatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>
   * .google.fhir.r4.core.DiagnosticReportGenetics.StatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.r4.core.DiagnosticReportGenetics.StatusCode getStatus();
  /**
   * <code>
   * .google.fhir.r4.core.DiagnosticReportGenetics.StatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.DiagnosticReportGenetics.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Service category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 13;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getCategoryList();
  /**
   *
   *
   * <pre>
   * Service category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 13;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getCategory(int index);
  /**
   *
   *
   * <pre>
   * Service category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 13;</code>
   */
  int getCategoryCount();
  /**
   *
   *
   * <pre>
   * Service category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 13;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getCategoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Service category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 13;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCategoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Name/Code for this diagnostic report
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.CodeableConcept code = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   *
   *
   * <pre>
   * Name/Code for this diagnostic report
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.CodeableConcept code = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The code.
   */
  com.google.fhir.r4.core.CodeableConcept getCode();
  /**
   *
   *
   * <pre>
   * Name/Code for this diagnostic report
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.CodeableConcept code = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCodeOrBuilder();

  /**
   *
   *
   * <pre>
   * The subject of the report - usually, but not always, the patient
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 15 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Location"];
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
   * .google.fhir.r4.core.Reference subject = 15 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.r4.core.Reference getSubject();
  /**
   *
   *
   * <pre>
   * The subject of the report - usually, but not always, the patient
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 15 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Location"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Health care event when test ordered
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 16 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return Whether the encounter field is set.
   */
  boolean hasEncounter();
  /**
   *
   *
   * <pre>
   * Health care event when test ordered
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 16 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return The encounter.
   */
  com.google.fhir.r4.core.Reference getEncounter();
  /**
   *
   *
   * <pre>
   * Health care event when test ordered
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 16 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getEncounterOrBuilder();

  /**
   * <code>.google.fhir.r4.core.DiagnosticReportGenetics.EffectiveX effective = 17;</code>
   *
   * @return Whether the effective field is set.
   */
  boolean hasEffective();
  /**
   * <code>.google.fhir.r4.core.DiagnosticReportGenetics.EffectiveX effective = 17;</code>
   *
   * @return The effective.
   */
  com.google.fhir.r4.core.DiagnosticReportGenetics.EffectiveX getEffective();
  /** <code>.google.fhir.r4.core.DiagnosticReportGenetics.EffectiveX effective = 17;</code> */
  com.google.fhir.r4.core.DiagnosticReportGenetics.EffectiveXOrBuilder getEffectiveOrBuilder();

  /**
   *
   *
   * <pre>
   * DateTime this version was made
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant issued = 18;</code>
   *
   * @return Whether the issued field is set.
   */
  boolean hasIssued();
  /**
   *
   *
   * <pre>
   * DateTime this version was made
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant issued = 18;</code>
   *
   * @return The issued.
   */
  com.google.fhir.r4.core.Instant getIssued();
  /**
   *
   *
   * <pre>
   * DateTime this version was made
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant issued = 18;</code>
   */
  com.google.fhir.r4.core.InstantOrBuilder getIssuedOrBuilder();

  /**
   *
   *
   * <pre>
   * Responsible Diagnostic Service
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference performer = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getPerformerList();
  /**
   *
   *
   * <pre>
   * Responsible Diagnostic Service
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference performer = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getPerformer(int index);
  /**
   *
   *
   * <pre>
   * Responsible Diagnostic Service
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference performer = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  int getPerformerCount();
  /**
   *
   *
   * <pre>
   * Responsible Diagnostic Service
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference performer = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getPerformerOrBuilderList();
  /**
   *
   *
   * <pre>
   * Responsible Diagnostic Service
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference performer = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPerformerOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Primary result interpreter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference results_interpreter = 20 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getResultsInterpreterList();
  /**
   *
   *
   * <pre>
   * Primary result interpreter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference results_interpreter = 20 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getResultsInterpreter(int index);
  /**
   *
   *
   * <pre>
   * Primary result interpreter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference results_interpreter = 20 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  int getResultsInterpreterCount();
  /**
   *
   *
   * <pre>
   * Primary result interpreter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference results_interpreter = 20 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getResultsInterpreterOrBuilderList();
  /**
   *
   *
   * <pre>
   * Primary result interpreter
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference results_interpreter = 20 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getResultsInterpreterOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Specimens this report is based on
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference specimen = 21 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getSpecimenList();
  /**
   *
   *
   * <pre>
   * Specimens this report is based on
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference specimen = 21 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getSpecimen(int index);
  /**
   *
   *
   * <pre>
   * Specimens this report is based on
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference specimen = 21 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
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
   * repeated .google.fhir.r4.core.Reference specimen = 21 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getSpecimenOrBuilderList();
  /**
   *
   *
   * <pre>
   * Specimens this report is based on
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference specimen = 21 [(.google.fhir.proto.valid_reference_type) = "Specimen"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSpecimenOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Observations
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference result = 22 [(.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getResultList();
  /**
   *
   *
   * <pre>
   * Observations
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference result = 22 [(.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getResult(int index);
  /**
   *
   *
   * <pre>
   * Observations
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference result = 22 [(.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  int getResultCount();
  /**
   *
   *
   * <pre>
   * Observations
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference result = 22 [(.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getResultOrBuilderList();
  /**
   *
   *
   * <pre>
   * Observations
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference result = 22 [(.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getResultOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Reference to full details of imaging associated with the diagnostic report
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference imaging_study = 23 [(.google.fhir.proto.valid_reference_type) = "ImagingStudy"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getImagingStudyList();
  /**
   *
   *
   * <pre>
   * Reference to full details of imaging associated with the diagnostic report
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference imaging_study = 23 [(.google.fhir.proto.valid_reference_type) = "ImagingStudy"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getImagingStudy(int index);
  /**
   *
   *
   * <pre>
   * Reference to full details of imaging associated with the diagnostic report
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference imaging_study = 23 [(.google.fhir.proto.valid_reference_type) = "ImagingStudy"];
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
   * repeated .google.fhir.r4.core.Reference imaging_study = 23 [(.google.fhir.proto.valid_reference_type) = "ImagingStudy"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getImagingStudyOrBuilderList();
  /**
   *
   *
   * <pre>
   * Reference to full details of imaging associated with the diagnostic report
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference imaging_study = 23 [(.google.fhir.proto.valid_reference_type) = "ImagingStudy"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getImagingStudyOrBuilder(int index);

  /** <code>repeated .google.fhir.r4.core.DiagnosticReportGenetics.Media media = 24;</code> */
  java.util.List<com.google.fhir.r4.core.DiagnosticReportGenetics.Media> getMediaList();
  /** <code>repeated .google.fhir.r4.core.DiagnosticReportGenetics.Media media = 24;</code> */
  com.google.fhir.r4.core.DiagnosticReportGenetics.Media getMedia(int index);
  /** <code>repeated .google.fhir.r4.core.DiagnosticReportGenetics.Media media = 24;</code> */
  int getMediaCount();
  /** <code>repeated .google.fhir.r4.core.DiagnosticReportGenetics.Media media = 24;</code> */
  java.util.List<? extends com.google.fhir.r4.core.DiagnosticReportGenetics.MediaOrBuilder>
      getMediaOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.DiagnosticReportGenetics.Media media = 24;</code> */
  com.google.fhir.r4.core.DiagnosticReportGenetics.MediaOrBuilder getMediaOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Clinical conclusion (interpretation) of test results
   * </pre>
   *
   * <code>.google.fhir.r4.core.String conclusion = 25;</code>
   *
   * @return Whether the conclusion field is set.
   */
  boolean hasConclusion();
  /**
   *
   *
   * <pre>
   * Clinical conclusion (interpretation) of test results
   * </pre>
   *
   * <code>.google.fhir.r4.core.String conclusion = 25;</code>
   *
   * @return The conclusion.
   */
  com.google.fhir.r4.core.String getConclusion();
  /**
   *
   *
   * <pre>
   * Clinical conclusion (interpretation) of test results
   * </pre>
   *
   * <code>.google.fhir.r4.core.String conclusion = 25;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getConclusionOrBuilder();

  /**
   *
   *
   * <pre>
   * Entire report as issued
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment presented_form = 27;</code>
   */
  java.util.List<com.google.fhir.r4.core.Attachment> getPresentedFormList();
  /**
   *
   *
   * <pre>
   * Entire report as issued
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment presented_form = 27;</code>
   */
  com.google.fhir.r4.core.Attachment getPresentedForm(int index);
  /**
   *
   *
   * <pre>
   * Entire report as issued
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment presented_form = 27;</code>
   */
  int getPresentedFormCount();
  /**
   *
   *
   * <pre>
   * Entire report as issued
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment presented_form = 27;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AttachmentOrBuilder>
      getPresentedFormOrBuilderList();
  /**
   *
   *
   * <pre>
   * Entire report as issued
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment presented_form = 27;</code>
   */
  com.google.fhir.r4.core.AttachmentOrBuilder getPresentedFormOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * AssessedCondition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference assessed_condition = 28[json_name = "AssessedCondition", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsAssessedCondition"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getAssessedConditionList();
  /**
   *
   *
   * <pre>
   * AssessedCondition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference assessed_condition = 28[json_name = "AssessedCondition", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsAssessedCondition"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getAssessedCondition(int index);
  /**
   *
   *
   * <pre>
   * AssessedCondition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference assessed_condition = 28[json_name = "AssessedCondition", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsAssessedCondition"];
   * </code>
   */
  int getAssessedConditionCount();
  /**
   *
   *
   * <pre>
   * AssessedCondition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference assessed_condition = 28[json_name = "AssessedCondition", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsAssessedCondition"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getAssessedConditionOrBuilderList();
  /**
   *
   *
   * <pre>
   * AssessedCondition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference assessed_condition = 28[json_name = "AssessedCondition", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsAssessedCondition"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getAssessedConditionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * FamilyHistory
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference family_member_history = 29[json_name = "FamilyMemberHistory", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsFamilyMemberHistory"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getFamilyMemberHistoryList();
  /**
   *
   *
   * <pre>
   * FamilyHistory
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference family_member_history = 29[json_name = "FamilyMemberHistory", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsFamilyMemberHistory"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getFamilyMemberHistory(int index);
  /**
   *
   *
   * <pre>
   * FamilyHistory
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference family_member_history = 29[json_name = "FamilyMemberHistory", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsFamilyMemberHistory"];
   * </code>
   */
  int getFamilyMemberHistoryCount();
  /**
   *
   *
   * <pre>
   * FamilyHistory
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference family_member_history = 29[json_name = "FamilyMemberHistory", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsFamilyMemberHistory"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getFamilyMemberHistoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * FamilyHistory
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference family_member_history = 29[json_name = "FamilyMemberHistory", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsFamilyMemberHistory"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getFamilyMemberHistoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Analysis
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.DiagnosticReportAnalysis analysis = 30[json_name = "Analysis", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsAnalysis"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.DiagnosticReportAnalysis> getAnalysisList();
  /**
   *
   *
   * <pre>
   * Analysis
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.DiagnosticReportAnalysis analysis = 30[json_name = "Analysis", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsAnalysis"];
   * </code>
   */
  com.google.fhir.r4.core.DiagnosticReportAnalysis getAnalysis(int index);
  /**
   *
   *
   * <pre>
   * Analysis
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.DiagnosticReportAnalysis analysis = 30[json_name = "Analysis", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsAnalysis"];
   * </code>
   */
  int getAnalysisCount();
  /**
   *
   *
   * <pre>
   * Analysis
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.DiagnosticReportAnalysis analysis = 30[json_name = "Analysis", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsAnalysis"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.DiagnosticReportAnalysisOrBuilder>
      getAnalysisOrBuilderList();
  /**
   *
   *
   * <pre>
   * Analysis
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.DiagnosticReportAnalysis analysis = 30[json_name = "Analysis", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsAnalysis"];
   * </code>
   */
  com.google.fhir.r4.core.DiagnosticReportAnalysisOrBuilder getAnalysisOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * References
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.DiagnosticReportReferences references = 31[json_name = "References", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsReferences"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.DiagnosticReportReferences> getReferencesList();
  /**
   *
   *
   * <pre>
   * References
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.DiagnosticReportReferences references = 31[json_name = "References", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsReferences"];
   * </code>
   */
  com.google.fhir.r4.core.DiagnosticReportReferences getReferences(int index);
  /**
   *
   *
   * <pre>
   * References
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.DiagnosticReportReferences references = 31[json_name = "References", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsReferences"];
   * </code>
   */
  int getReferencesCount();
  /**
   *
   *
   * <pre>
   * References
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.DiagnosticReportReferences references = 31[json_name = "References", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsReferences"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.DiagnosticReportReferencesOrBuilder>
      getReferencesOrBuilderList();
  /**
   *
   *
   * <pre>
   * References
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.DiagnosticReportReferences references = 31[json_name = "References", (.google.fhir.proto.fhir_inlined_extension_url) = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsReferences"];
   * </code>
   */
  com.google.fhir.r4.core.DiagnosticReportReferencesOrBuilder getReferencesOrBuilder(int index);
}
