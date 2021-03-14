// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/uscore.proto

package com.google.fhir.stu3.uscore;

public interface UsCoreCareplanOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.uscore.UsCoreCareplan)
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
   * <code>
   * .google.fhir.stu3.proto.Narrative text = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
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
   * <code>
   * .google.fhir.stu3.proto.Narrative text = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
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
   * <code>
   * .google.fhir.stu3.proto.Narrative text = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
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
   * External Ids for this plan
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * External Ids for this plan
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * External Ids for this plan
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * External Ids for this plan
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
   * External Ids for this plan
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Protocol or definition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "PlanDefinition", (.google.fhir.proto.valid_reference_type) = "Questionnaire"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getDefinitionList();
  /**
   *
   *
   * <pre>
   * Protocol or definition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "PlanDefinition", (.google.fhir.proto.valid_reference_type) = "Questionnaire"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getDefinition(int index);
  /**
   *
   *
   * <pre>
   * Protocol or definition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "PlanDefinition", (.google.fhir.proto.valid_reference_type) = "Questionnaire"];
   * </code>
   */
  int getDefinitionCount();
  /**
   *
   *
   * <pre>
   * Protocol or definition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "PlanDefinition", (.google.fhir.proto.valid_reference_type) = "Questionnaire"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getDefinitionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Protocol or definition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "PlanDefinition", (.google.fhir.proto.valid_reference_type) = "Questionnaire"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getDefinitionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Fulfills care plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getBasedOnList();
  /**
   *
   *
   * <pre>
   * Fulfills care plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getBasedOn(int index);
  /**
   *
   *
   * <pre>
   * Fulfills care plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  int getBasedOnCount();
  /**
   *
   *
   * <pre>
   * Fulfills care plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getBasedOnOrBuilderList();
  /**
   *
   *
   * <pre>
   * Fulfills care plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getBasedOnOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * CarePlan replaced by this CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getReplacesList();
  /**
   *
   *
   * <pre>
   * CarePlan replaced by this CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getReplaces(int index);
  /**
   *
   *
   * <pre>
   * CarePlan replaced by this CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  int getReplacesCount();
  /**
   *
   *
   * <pre>
   * CarePlan replaced by this CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getReplacesOrBuilderList();
  /**
   *
   *
   * <pre>
   * CarePlan replaced by this CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getReplacesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Part of referenced CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 13 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getPartOfList();
  /**
   *
   *
   * <pre>
   * Part of referenced CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 13 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getPartOf(int index);
  /**
   *
   *
   * <pre>
   * Part of referenced CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 13 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  int getPartOfCount();
  /**
   *
   *
   * <pre>
   * Part of referenced CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 13 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getPartOfOrBuilderList();
  /**
   *
   *
   * <pre>
   * Part of referenced CarePlan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 13 [(.google.fhir.proto.valid_reference_type) = "CarePlan"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPartOfOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * draft | active | suspended | completed | entered-in-error | cancelled |
   * unknown
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CarePlanStatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * draft | active | suspended | completed | entered-in-error | cancelled |
   * unknown
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CarePlanStatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.CarePlanStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * draft | active | suspended | completed | entered-in-error | cancelled |
   * unknown
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CarePlanStatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.CarePlanStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * proposal | plan | order | option
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CarePlanIntentCode intent = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the intent field is set.
   */
  boolean hasIntent();
  /**
   *
   *
   * <pre>
   * proposal | plan | order | option
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CarePlanIntentCode intent = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The intent.
   */
  com.google.fhir.stu3.proto.CarePlanIntentCode getIntent();
  /**
   *
   *
   * <pre>
   * proposal | plan | order | option
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CarePlanIntentCode intent = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.CarePlanIntentCodeOrBuilder getIntentOrBuilder();

  /**
   *
   *
   * <pre>
   * Type of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.CodeableConcept category = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "where(coding.system=&#92;'http://hl7.org/fhir/us/core/CodeSystem/careplan-category&#92;' and coding.code=&#92;'assess-plan&#92;').exists()"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getCategoryList();
  /**
   *
   *
   * <pre>
   * Type of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.CodeableConcept category = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "where(coding.system=&#92;'http://hl7.org/fhir/us/core/CodeSystem/careplan-category&#92;' and coding.code=&#92;'assess-plan&#92;').exists()"];
   * </code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getCategory(int index);
  /**
   *
   *
   * <pre>
   * Type of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.CodeableConcept category = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "where(coding.system=&#92;'http://hl7.org/fhir/us/core/CodeSystem/careplan-category&#92;' and coding.code=&#92;'assess-plan&#92;').exists()"];
   * </code>
   */
  int getCategoryCount();
  /**
   *
   *
   * <pre>
   * Type of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.CodeableConcept category = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "where(coding.system=&#92;'http://hl7.org/fhir/us/core/CodeSystem/careplan-category&#92;' and coding.code=&#92;'assess-plan&#92;').exists()"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getCategoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Type of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.CodeableConcept category = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "where(coding.system=&#92;'http://hl7.org/fhir/us/core/CodeSystem/careplan-category&#92;' and coding.code=&#92;'assess-plan&#92;').exists()"];
   * </code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getCategoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Human-friendly name for the CarePlan
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String title = 17;</code>
   *
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   *
   *
   * <pre>
   * Human-friendly name for the CarePlan
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String title = 17;</code>
   *
   * @return The title.
   */
  com.google.fhir.stu3.proto.String getTitle();
  /**
   *
   *
   * <pre>
   * Human-friendly name for the CarePlan
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String title = 17;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getTitleOrBuilder();

  /**
   *
   *
   * <pre>
   * Summary of nature of plan
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 18;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * Summary of nature of plan
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 18;</code>
   *
   * @return The description.
   */
  com.google.fhir.stu3.proto.String getDescription();
  /**
   *
   *
   * <pre>
   * Summary of nature of plan
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 18;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getDescriptionOrBuilder();

  /**
   *
   *
   * <pre>
   * Who care plan is for
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * Who care plan is for
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Who care plan is for
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Created in context of
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 20 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * Created in context of
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 20 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   *
   * @return The context.
   */
  com.google.fhir.stu3.proto.Reference getContext();
  /**
   *
   *
   * <pre>
   * Created in context of
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 20 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getContextOrBuilder();

  /**
   *
   *
   * <pre>
   * Time period plan covers
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
   * Time period plan covers
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
   * Time period plan covers
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period period = 21;</code>
   */
  com.google.fhir.stu3.proto.PeriodOrBuilder getPeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * Who is responsible for contents of the plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference author = 22 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getAuthorList();
  /**
   *
   *
   * <pre>
   * Who is responsible for contents of the plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference author = 22 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getAuthor(int index);
  /**
   *
   *
   * <pre>
   * Who is responsible for contents of the plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference author = 22 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  int getAuthorCount();
  /**
   *
   *
   * <pre>
   * Who is responsible for contents of the plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference author = 22 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getAuthorOrBuilderList();
  /**
   *
   *
   * <pre>
   * Who is responsible for contents of the plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference author = 22 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getAuthorOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Who's involved in plan?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference care_team = 23 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getCareTeamList();
  /**
   *
   *
   * <pre>
   * Who's involved in plan?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference care_team = 23 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getCareTeam(int index);
  /**
   *
   *
   * <pre>
   * Who's involved in plan?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference care_team = 23 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  int getCareTeamCount();
  /**
   *
   *
   * <pre>
   * Who's involved in plan?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference care_team = 23 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getCareTeamOrBuilderList();
  /**
   *
   *
   * <pre>
   * Who's involved in plan?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference care_team = 23 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getCareTeamOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Health issues this plan addresses
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference addresses = 24 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getAddressesList();
  /**
   *
   *
   * <pre>
   * Health issues this plan addresses
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference addresses = 24 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getAddresses(int index);
  /**
   *
   *
   * <pre>
   * Health issues this plan addresses
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference addresses = 24 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  int getAddressesCount();
  /**
   *
   *
   * <pre>
   * Health issues this plan addresses
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference addresses = 24 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getAddressesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Health issues this plan addresses
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference addresses = 24 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getAddressesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Information considered as part of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference supporting_info = 25 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getSupportingInfoList();
  /**
   *
   *
   * <pre>
   * Information considered as part of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference supporting_info = 25 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getSupportingInfo(int index);
  /**
   *
   *
   * <pre>
   * Information considered as part of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference supporting_info = 25 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  int getSupportingInfoCount();
  /**
   *
   *
   * <pre>
   * Information considered as part of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference supporting_info = 25 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getSupportingInfoOrBuilderList();
  /**
   *
   *
   * <pre>
   * Information considered as part of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference supporting_info = 25 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSupportingInfoOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Desired outcome of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference goal = 26 [(.google.fhir.proto.valid_reference_type) = "Goal"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getGoalList();
  /**
   *
   *
   * <pre>
   * Desired outcome of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference goal = 26 [(.google.fhir.proto.valid_reference_type) = "Goal"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getGoal(int index);
  /**
   *
   *
   * <pre>
   * Desired outcome of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference goal = 26 [(.google.fhir.proto.valid_reference_type) = "Goal"];
   * </code>
   */
  int getGoalCount();
  /**
   *
   *
   * <pre>
   * Desired outcome of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference goal = 26 [(.google.fhir.proto.valid_reference_type) = "Goal"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getGoalOrBuilderList();
  /**
   *
   *
   * <pre>
   * Desired outcome of plan
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference goal = 26 [(.google.fhir.proto.valid_reference_type) = "Goal"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getGoalOrBuilder(int index);

  /**
   * <code>
   * repeated .google.fhir.stu3.uscore.UsCoreCareplan.Activity activity = 27 [(.google.fhir.proto.fhir_path_constraint) = "detail.empty() or reference.empty()"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.uscore.UsCoreCareplan.Activity> getActivityList();
  /**
   * <code>
   * repeated .google.fhir.stu3.uscore.UsCoreCareplan.Activity activity = 27 [(.google.fhir.proto.fhir_path_constraint) = "detail.empty() or reference.empty()"];
   * </code>
   */
  com.google.fhir.stu3.uscore.UsCoreCareplan.Activity getActivity(int index);
  /**
   * <code>
   * repeated .google.fhir.stu3.uscore.UsCoreCareplan.Activity activity = 27 [(.google.fhir.proto.fhir_path_constraint) = "detail.empty() or reference.empty()"];
   * </code>
   */
  int getActivityCount();
  /**
   * <code>
   * repeated .google.fhir.stu3.uscore.UsCoreCareplan.Activity activity = 27 [(.google.fhir.proto.fhir_path_constraint) = "detail.empty() or reference.empty()"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.uscore.UsCoreCareplan.ActivityOrBuilder>
      getActivityOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.stu3.uscore.UsCoreCareplan.Activity activity = 27 [(.google.fhir.proto.fhir_path_constraint) = "detail.empty() or reference.empty()"];
   * </code>
   */
  com.google.fhir.stu3.uscore.UsCoreCareplan.ActivityOrBuilder getActivityOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Comments about the plan
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 28;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Annotation> getNoteList();
  /**
   *
   *
   * <pre>
   * Comments about the plan
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 28;</code>
   */
  com.google.fhir.stu3.proto.Annotation getNote(int index);
  /**
   *
   *
   * <pre>
   * Comments about the plan
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 28;</code>
   */
  int getNoteCount();
  /**
   *
   *
   * <pre>
   * Comments about the plan
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 28;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.AnnotationOrBuilder> getNoteOrBuilderList();
  /**
   *
   *
   * <pre>
   * Comments about the plan
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 28;</code>
   */
  com.google.fhir.stu3.proto.AnnotationOrBuilder getNoteOrBuilder(int index);
}
