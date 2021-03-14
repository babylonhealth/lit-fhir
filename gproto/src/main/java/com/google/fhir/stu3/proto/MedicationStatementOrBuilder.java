// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface MedicationStatementOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.MedicationStatement)
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
   * External identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * External identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * External identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * External identifier
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
   * External identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Fulfils plan, proposal or order
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getBasedOnList();
  /**
   *
   *
   * <pre>
   * Fulfils plan, proposal or order
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getBasedOn(int index);
  /**
   *
   *
   * <pre>
   * Fulfils plan, proposal or order
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  int getBasedOnCount();
  /**
   *
   *
   * <pre>
   * Fulfils plan, proposal or order
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getBasedOnOrBuilderList();
  /**
   *
   *
   * <pre>
   * Fulfils plan, proposal or order
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "ReferralRequest"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getBasedOnOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Part of referenced event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 11 [(.google.fhir.proto.valid_reference_type) = "MedicationAdministration", (.google.fhir.proto.valid_reference_type) = "MedicationDispense", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getPartOfList();
  /**
   *
   *
   * <pre>
   * Part of referenced event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 11 [(.google.fhir.proto.valid_reference_type) = "MedicationAdministration", (.google.fhir.proto.valid_reference_type) = "MedicationDispense", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getPartOf(int index);
  /**
   *
   *
   * <pre>
   * Part of referenced event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 11 [(.google.fhir.proto.valid_reference_type) = "MedicationAdministration", (.google.fhir.proto.valid_reference_type) = "MedicationDispense", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  int getPartOfCount();
  /**
   *
   *
   * <pre>
   * Part of referenced event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 11 [(.google.fhir.proto.valid_reference_type) = "MedicationAdministration", (.google.fhir.proto.valid_reference_type) = "MedicationDispense", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getPartOfOrBuilderList();
  /**
   *
   *
   * <pre>
   * Part of referenced event
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 11 [(.google.fhir.proto.valid_reference_type) = "MedicationAdministration", (.google.fhir.proto.valid_reference_type) = "MedicationDispense", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPartOfOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Encounter / Episode associated with MedicationStatement
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 12 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * Encounter / Episode associated with MedicationStatement
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 12 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   *
   * @return The context.
   */
  com.google.fhir.stu3.proto.Reference getContext();
  /**
   *
   *
   * <pre>
   * Encounter / Episode associated with MedicationStatement
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 12 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getContextOrBuilder();

  /**
   *
   *
   * <pre>
   * active | completed | entered-in-error | intended | stopped | on-hold
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.MedicationStatementStatusCode status = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * active | completed | entered-in-error | intended | stopped | on-hold
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.MedicationStatementStatusCode status = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.MedicationStatementStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * active | completed | entered-in-error | intended | stopped | on-hold
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.MedicationStatementStatusCode status = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.MedicationStatementStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Type of medication usage
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept category = 14;</code>
   *
   * @return Whether the category field is set.
   */
  boolean hasCategory();
  /**
   *
   *
   * <pre>
   * Type of medication usage
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept category = 14;</code>
   *
   * @return The category.
   */
  com.google.fhir.stu3.proto.CodeableConcept getCategory();
  /**
   *
   *
   * <pre>
   * Type of medication usage
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept category = 14;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getCategoryOrBuilder();

  /**
   * <code>
   * .google.fhir.stu3.proto.MedicationStatement.Medication medication = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the medication field is set.
   */
  boolean hasMedication();
  /**
   * <code>
   * .google.fhir.stu3.proto.MedicationStatement.Medication medication = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The medication.
   */
  com.google.fhir.stu3.proto.MedicationStatement.Medication getMedication();
  /**
   * <code>
   * .google.fhir.stu3.proto.MedicationStatement.Medication medication = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.MedicationStatement.MedicationOrBuilder getMedicationOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.MedicationStatement.Effective effective = 16;</code>
   *
   * @return Whether the effective field is set.
   */
  boolean hasEffective();
  /**
   * <code>.google.fhir.stu3.proto.MedicationStatement.Effective effective = 16;</code>
   *
   * @return The effective.
   */
  com.google.fhir.stu3.proto.MedicationStatement.Effective getEffective();
  /** <code>.google.fhir.stu3.proto.MedicationStatement.Effective effective = 16;</code> */
  com.google.fhir.stu3.proto.MedicationStatement.EffectiveOrBuilder getEffectiveOrBuilder();

  /**
   *
   *
   * <pre>
   * When the statement was asserted?
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date_asserted = 17;</code>
   *
   * @return Whether the dateAsserted field is set.
   */
  boolean hasDateAsserted();
  /**
   *
   *
   * <pre>
   * When the statement was asserted?
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date_asserted = 17;</code>
   *
   * @return The dateAsserted.
   */
  com.google.fhir.stu3.proto.DateTime getDateAsserted();
  /**
   *
   *
   * <pre>
   * When the statement was asserted?
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date_asserted = 17;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getDateAssertedOrBuilder();

  /**
   *
   *
   * <pre>
   * Person or organization that provided the information about the taking of
   * this medication
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference information_source = 18 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the informationSource field is set.
   */
  boolean hasInformationSource();
  /**
   *
   *
   * <pre>
   * Person or organization that provided the information about the taking of
   * this medication
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference information_source = 18 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The informationSource.
   */
  com.google.fhir.stu3.proto.Reference getInformationSource();
  /**
   *
   *
   * <pre>
   * Person or organization that provided the information about the taking of
   * this medication
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference information_source = 18 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getInformationSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Who is/was taking  the medication
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * Who is/was taking  the medication
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Who is/was taking  the medication
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional supporting information
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference derived_from = 20 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getDerivedFromList();
  /**
   *
   *
   * <pre>
   * Additional supporting information
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference derived_from = 20 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getDerivedFrom(int index);
  /**
   *
   *
   * <pre>
   * Additional supporting information
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference derived_from = 20 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  int getDerivedFromCount();
  /**
   *
   *
   * <pre>
   * Additional supporting information
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference derived_from = 20 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getDerivedFromOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional supporting information
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference derived_from = 20 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getDerivedFromOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * y | n | unk | na
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.MedicationStatementTakenCode taken = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the taken field is set.
   */
  boolean hasTaken();
  /**
   *
   *
   * <pre>
   * y | n | unk | na
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.MedicationStatementTakenCode taken = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The taken.
   */
  com.google.fhir.stu3.proto.MedicationStatementTakenCode getTaken();
  /**
   *
   *
   * <pre>
   * y | n | unk | na
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.MedicationStatementTakenCode taken = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.MedicationStatementTakenCodeOrBuilder getTakenOrBuilder();

  /**
   *
   *
   * <pre>
   * True if asserting medication was not given
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_not_taken = 22;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getReasonNotTakenList();
  /**
   *
   *
   * <pre>
   * True if asserting medication was not given
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_not_taken = 22;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getReasonNotTaken(int index);
  /**
   *
   *
   * <pre>
   * True if asserting medication was not given
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_not_taken = 22;</code>
   */
  int getReasonNotTakenCount();
  /**
   *
   *
   * <pre>
   * True if asserting medication was not given
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_not_taken = 22;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getReasonNotTakenOrBuilderList();
  /**
   *
   *
   * <pre>
   * True if asserting medication was not given
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_not_taken = 22;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getReasonNotTakenOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Reason for why the medication is being/was taken
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 23;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getReasonCodeList();
  /**
   *
   *
   * <pre>
   * Reason for why the medication is being/was taken
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 23;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getReasonCode(int index);
  /**
   *
   *
   * <pre>
   * Reason for why the medication is being/was taken
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 23;</code>
   */
  int getReasonCodeCount();
  /**
   *
   *
   * <pre>
   * Reason for why the medication is being/was taken
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 23;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getReasonCodeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Reason for why the medication is being/was taken
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 23;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getReasonCodeOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Condition or observation that supports why the medication is being/was
   * taken
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference reason_reference = 24 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getReasonReferenceList();
  /**
   *
   *
   * <pre>
   * Condition or observation that supports why the medication is being/was
   * taken
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference reason_reference = 24 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getReasonReference(int index);
  /**
   *
   *
   * <pre>
   * Condition or observation that supports why the medication is being/was
   * taken
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference reason_reference = 24 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  int getReasonReferenceCount();
  /**
   *
   *
   * <pre>
   * Condition or observation that supports why the medication is being/was
   * taken
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference reason_reference = 24 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getReasonReferenceOrBuilderList();
  /**
   *
   *
   * <pre>
   * Condition or observation that supports why the medication is being/was
   * taken
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference reason_reference = 24 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getReasonReferenceOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Further information about the statement
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 25;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Annotation> getNoteList();
  /**
   *
   *
   * <pre>
   * Further information about the statement
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 25;</code>
   */
  com.google.fhir.stu3.proto.Annotation getNote(int index);
  /**
   *
   *
   * <pre>
   * Further information about the statement
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 25;</code>
   */
  int getNoteCount();
  /**
   *
   *
   * <pre>
   * Further information about the statement
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 25;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.AnnotationOrBuilder> getNoteOrBuilderList();
  /**
   *
   *
   * <pre>
   * Further information about the statement
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 25;</code>
   */
  com.google.fhir.stu3.proto.AnnotationOrBuilder getNoteOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Details of how medication is/was taken or should be taken
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Dosage dosage = 26;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Dosage> getDosageList();
  /**
   *
   *
   * <pre>
   * Details of how medication is/was taken or should be taken
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Dosage dosage = 26;</code>
   */
  com.google.fhir.stu3.proto.Dosage getDosage(int index);
  /**
   *
   *
   * <pre>
   * Details of how medication is/was taken or should be taken
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Dosage dosage = 26;</code>
   */
  int getDosageCount();
  /**
   *
   *
   * <pre>
   * Details of how medication is/was taken or should be taken
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Dosage dosage = 26;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.DosageOrBuilder> getDosageOrBuilderList();
  /**
   *
   *
   * <pre>
   * Details of how medication is/was taken or should be taken
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Dosage dosage = 26;</code>
   */
  com.google.fhir.stu3.proto.DosageOrBuilder getDosageOrBuilder(int index);
}
