// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface ClinicalImpressionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.ClinicalImpression)
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
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Business identifier
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
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * draft | completed | entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.ClinicalImpressionStatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * draft | completed | entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.ClinicalImpressionStatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.ClinicalImpressionStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * draft | completed | entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.ClinicalImpressionStatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.ClinicalImpressionStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Kind of assessment performed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept code = 11;</code>
   *
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   *
   *
   * <pre>
   * Kind of assessment performed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept code = 11;</code>
   *
   * @return The code.
   */
  com.google.fhir.stu3.proto.CodeableConcept getCode();
  /**
   *
   *
   * <pre>
   * Kind of assessment performed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept code = 11;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getCodeOrBuilder();

  /**
   *
   *
   * <pre>
   * Why/how the assessment was performed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 12;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * Why/how the assessment was performed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 12;</code>
   *
   * @return The description.
   */
  com.google.fhir.stu3.proto.String getDescription();
  /**
   *
   *
   * <pre>
   * Why/how the assessment was performed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 12;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getDescriptionOrBuilder();

  /**
   *
   *
   * <pre>
   * Patient or group assessed
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * Patient or group assessed
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Patient or group assessed
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Encounter or Episode created from
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 14 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * Encounter or Episode created from
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 14 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   *
   * @return The context.
   */
  com.google.fhir.stu3.proto.Reference getContext();
  /**
   *
   *
   * <pre>
   * Encounter or Episode created from
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 14 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getContextOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.ClinicalImpression.Effective effective = 15;</code>
   *
   * @return Whether the effective field is set.
   */
  boolean hasEffective();
  /**
   * <code>.google.fhir.stu3.proto.ClinicalImpression.Effective effective = 15;</code>
   *
   * @return The effective.
   */
  com.google.fhir.stu3.proto.ClinicalImpression.Effective getEffective();
  /** <code>.google.fhir.stu3.proto.ClinicalImpression.Effective effective = 15;</code> */
  com.google.fhir.stu3.proto.ClinicalImpression.EffectiveOrBuilder getEffectiveOrBuilder();

  /**
   *
   *
   * <pre>
   * When the assessment was documented
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 16;</code>
   *
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   *
   *
   * <pre>
   * When the assessment was documented
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 16;</code>
   *
   * @return The date.
   */
  com.google.fhir.stu3.proto.DateTime getDate();
  /**
   *
   *
   * <pre>
   * When the assessment was documented
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 16;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getDateOrBuilder();

  /**
   *
   *
   * <pre>
   * The clinician performing the assessment
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference assessor = 17 [(.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   *
   * @return Whether the assessor field is set.
   */
  boolean hasAssessor();
  /**
   *
   *
   * <pre>
   * The clinician performing the assessment
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference assessor = 17 [(.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   *
   * @return The assessor.
   */
  com.google.fhir.stu3.proto.Reference getAssessor();
  /**
   *
   *
   * <pre>
   * The clinician performing the assessment
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference assessor = 17 [(.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getAssessorOrBuilder();

  /**
   *
   *
   * <pre>
   * Reference to last assessment
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference previous = 18 [(.google.fhir.proto.valid_reference_type) = "ClinicalImpression"];
   * </code>
   *
   * @return Whether the previous field is set.
   */
  boolean hasPrevious();
  /**
   *
   *
   * <pre>
   * Reference to last assessment
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference previous = 18 [(.google.fhir.proto.valid_reference_type) = "ClinicalImpression"];
   * </code>
   *
   * @return The previous.
   */
  com.google.fhir.stu3.proto.Reference getPrevious();
  /**
   *
   *
   * <pre>
   * Reference to last assessment
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference previous = 18 [(.google.fhir.proto.valid_reference_type) = "ClinicalImpression"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPreviousOrBuilder();

  /**
   *
   *
   * <pre>
   * Relevant impressions of patient state
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference problem = 19 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getProblemList();
  /**
   *
   *
   * <pre>
   * Relevant impressions of patient state
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference problem = 19 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getProblem(int index);
  /**
   *
   *
   * <pre>
   * Relevant impressions of patient state
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference problem = 19 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance"];
   * </code>
   */
  int getProblemCount();
  /**
   *
   *
   * <pre>
   * Relevant impressions of patient state
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference problem = 19 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getProblemOrBuilderList();
  /**
   *
   *
   * <pre>
   * Relevant impressions of patient state
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference problem = 19 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "AllergyIntolerance"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getProblemOrBuilder(int index);

  /**
   * <code>repeated .google.fhir.stu3.proto.ClinicalImpression.Investigation investigation = 20;
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.ClinicalImpression.Investigation>
      getInvestigationList();
  /**
   * <code>repeated .google.fhir.stu3.proto.ClinicalImpression.Investigation investigation = 20;
   * </code>
   */
  com.google.fhir.stu3.proto.ClinicalImpression.Investigation getInvestigation(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.ClinicalImpression.Investigation investigation = 20;
   * </code>
   */
  int getInvestigationCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.ClinicalImpression.Investigation investigation = 20;
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ClinicalImpression.InvestigationOrBuilder>
      getInvestigationOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.ClinicalImpression.Investigation investigation = 20;
   * </code>
   */
  com.google.fhir.stu3.proto.ClinicalImpression.InvestigationOrBuilder getInvestigationOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Clinical Protocol followed
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Uri protocol = 21;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Uri> getProtocolList();
  /**
   *
   *
   * <pre>
   * Clinical Protocol followed
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Uri protocol = 21;</code>
   */
  com.google.fhir.stu3.proto.Uri getProtocol(int index);
  /**
   *
   *
   * <pre>
   * Clinical Protocol followed
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Uri protocol = 21;</code>
   */
  int getProtocolCount();
  /**
   *
   *
   * <pre>
   * Clinical Protocol followed
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Uri protocol = 21;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.UriOrBuilder> getProtocolOrBuilderList();
  /**
   *
   *
   * <pre>
   * Clinical Protocol followed
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Uri protocol = 21;</code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getProtocolOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Summary of the assessment
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String summary = 22;</code>
   *
   * @return Whether the summary field is set.
   */
  boolean hasSummary();
  /**
   *
   *
   * <pre>
   * Summary of the assessment
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String summary = 22;</code>
   *
   * @return The summary.
   */
  com.google.fhir.stu3.proto.String getSummary();
  /**
   *
   *
   * <pre>
   * Summary of the assessment
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String summary = 22;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getSummaryOrBuilder();

  /** <code>repeated .google.fhir.stu3.proto.ClinicalImpression.Finding finding = 23;</code> */
  java.util.List<com.google.fhir.stu3.proto.ClinicalImpression.Finding> getFindingList();
  /** <code>repeated .google.fhir.stu3.proto.ClinicalImpression.Finding finding = 23;</code> */
  com.google.fhir.stu3.proto.ClinicalImpression.Finding getFinding(int index);
  /** <code>repeated .google.fhir.stu3.proto.ClinicalImpression.Finding finding = 23;</code> */
  int getFindingCount();
  /** <code>repeated .google.fhir.stu3.proto.ClinicalImpression.Finding finding = 23;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.ClinicalImpression.FindingOrBuilder>
      getFindingOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.ClinicalImpression.Finding finding = 23;</code> */
  com.google.fhir.stu3.proto.ClinicalImpression.FindingOrBuilder getFindingOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Estimate of likely outcome
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept prognosis_codeable_concept = 24;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getPrognosisCodeableConceptList();
  /**
   *
   *
   * <pre>
   * Estimate of likely outcome
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept prognosis_codeable_concept = 24;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getPrognosisCodeableConcept(int index);
  /**
   *
   *
   * <pre>
   * Estimate of likely outcome
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept prognosis_codeable_concept = 24;</code>
   */
  int getPrognosisCodeableConceptCount();
  /**
   *
   *
   * <pre>
   * Estimate of likely outcome
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept prognosis_codeable_concept = 24;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getPrognosisCodeableConceptOrBuilderList();
  /**
   *
   *
   * <pre>
   * Estimate of likely outcome
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept prognosis_codeable_concept = 24;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getPrognosisCodeableConceptOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * RiskAssessment expressing likely outcome
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference prognosis_reference = 25 [(.google.fhir.proto.valid_reference_type) = "RiskAssessment"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getPrognosisReferenceList();
  /**
   *
   *
   * <pre>
   * RiskAssessment expressing likely outcome
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference prognosis_reference = 25 [(.google.fhir.proto.valid_reference_type) = "RiskAssessment"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getPrognosisReference(int index);
  /**
   *
   *
   * <pre>
   * RiskAssessment expressing likely outcome
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference prognosis_reference = 25 [(.google.fhir.proto.valid_reference_type) = "RiskAssessment"];
   * </code>
   */
  int getPrognosisReferenceCount();
  /**
   *
   *
   * <pre>
   * RiskAssessment expressing likely outcome
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference prognosis_reference = 25 [(.google.fhir.proto.valid_reference_type) = "RiskAssessment"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getPrognosisReferenceOrBuilderList();
  /**
   *
   *
   * <pre>
   * RiskAssessment expressing likely outcome
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference prognosis_reference = 25 [(.google.fhir.proto.valid_reference_type) = "RiskAssessment"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPrognosisReferenceOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Action taken as part of assessment procedure
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference action = 26 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "Appointment"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getActionList();
  /**
   *
   *
   * <pre>
   * Action taken as part of assessment procedure
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference action = 26 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "Appointment"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getAction(int index);
  /**
   *
   *
   * <pre>
   * Action taken as part of assessment procedure
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference action = 26 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "Appointment"];
   * </code>
   */
  int getActionCount();
  /**
   *
   *
   * <pre>
   * Action taken as part of assessment procedure
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference action = 26 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "Appointment"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getActionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Action taken as part of assessment procedure
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference action = 26 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "Appointment"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getActionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Comments made about the ClinicalImpression
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 27;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Annotation> getNoteList();
  /**
   *
   *
   * <pre>
   * Comments made about the ClinicalImpression
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 27;</code>
   */
  com.google.fhir.stu3.proto.Annotation getNote(int index);
  /**
   *
   *
   * <pre>
   * Comments made about the ClinicalImpression
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 27;</code>
   */
  int getNoteCount();
  /**
   *
   *
   * <pre>
   * Comments made about the ClinicalImpression
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 27;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.AnnotationOrBuilder> getNoteOrBuilderList();
  /**
   *
   *
   * <pre>
   * Comments made about the ClinicalImpression
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 27;</code>
   */
  com.google.fhir.stu3.proto.AnnotationOrBuilder getNoteOrBuilder(int index);
}
