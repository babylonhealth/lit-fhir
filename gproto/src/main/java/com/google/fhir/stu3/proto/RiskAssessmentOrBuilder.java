// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface RiskAssessmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.RiskAssessment)
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
   * Unique identifier for the assessment
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 9;</code>
   *
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   *
   *
   * <pre>
   * Unique identifier for the assessment
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 9;</code>
   *
   * @return The identifier.
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier();
  /**
   *
   *
   * <pre>
   * Unique identifier for the assessment
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder();

  /**
   *
   *
   * <pre>
   * Request fulfilled by this assessment
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return Whether the basedOn field is set.
   */
  boolean hasBasedOn();
  /**
   *
   *
   * <pre>
   * Request fulfilled by this assessment
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return The basedOn.
   */
  com.google.fhir.stu3.proto.Reference getBasedOn();
  /**
   *
   *
   * <pre>
   * Request fulfilled by this assessment
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference based_on = 10 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getBasedOnOrBuilder();

  /**
   *
   *
   * <pre>
   * Part of this occurrence
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference parent = 11 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return Whether the parent field is set.
   */
  boolean hasParent();
  /**
   *
   *
   * <pre>
   * Part of this occurrence
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference parent = 11 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return The parent.
   */
  com.google.fhir.stu3.proto.Reference getParent();
  /**
   *
   *
   * <pre>
   * Part of this occurrence
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference parent = 11 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getParentOrBuilder();

  /**
   *
   *
   * <pre>
   * registered | preliminary | final | amended +
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.ObservationStatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
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
   * .google.fhir.stu3.proto.ObservationStatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
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
   * .google.fhir.stu3.proto.ObservationStatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.ObservationStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Evaluation mechanism
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept method = 13;</code>
   *
   * @return Whether the method field is set.
   */
  boolean hasMethod();
  /**
   *
   *
   * <pre>
   * Evaluation mechanism
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept method = 13;</code>
   *
   * @return The method.
   */
  com.google.fhir.stu3.proto.CodeableConcept getMethod();
  /**
   *
   *
   * <pre>
   * Evaluation mechanism
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept method = 13;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getMethodOrBuilder();

  /**
   *
   *
   * <pre>
   * Type of assessment
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept code = 14;</code>
   *
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   *
   *
   * <pre>
   * Type of assessment
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept code = 14;</code>
   *
   * @return The code.
   */
  com.google.fhir.stu3.proto.CodeableConcept getCode();
  /**
   *
   *
   * <pre>
   * Type of assessment
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept code = 14;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getCodeOrBuilder();

  /**
   *
   *
   * <pre>
   * Who/what does assessment apply to?
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 15 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * Who/what does assessment apply to?
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 15 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Who/what does assessment apply to?
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 15 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Where was assessment performed?
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 16 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * Where was assessment performed?
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 16 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   *
   * @return The context.
   */
  com.google.fhir.stu3.proto.Reference getContext();
  /**
   *
   *
   * <pre>
   * Where was assessment performed?
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 16 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getContextOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.RiskAssessment.Occurrence occurrence = 17;</code>
   *
   * @return Whether the occurrence field is set.
   */
  boolean hasOccurrence();
  /**
   * <code>.google.fhir.stu3.proto.RiskAssessment.Occurrence occurrence = 17;</code>
   *
   * @return The occurrence.
   */
  com.google.fhir.stu3.proto.RiskAssessment.Occurrence getOccurrence();
  /** <code>.google.fhir.stu3.proto.RiskAssessment.Occurrence occurrence = 17;</code> */
  com.google.fhir.stu3.proto.RiskAssessment.OccurrenceOrBuilder getOccurrenceOrBuilder();

  /**
   *
   *
   * <pre>
   * Condition assessed
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference condition = 18 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   *
   * @return Whether the condition field is set.
   */
  boolean hasCondition();
  /**
   *
   *
   * <pre>
   * Condition assessed
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference condition = 18 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   *
   * @return The condition.
   */
  com.google.fhir.stu3.proto.Reference getCondition();
  /**
   *
   *
   * <pre>
   * Condition assessed
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference condition = 18 [(.google.fhir.proto.valid_reference_type) = "Condition"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getConditionOrBuilder();

  /**
   *
   *
   * <pre>
   * Who did assessment?
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference performer = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Device"];
   * </code>
   *
   * @return Whether the performer field is set.
   */
  boolean hasPerformer();
  /**
   *
   *
   * <pre>
   * Who did assessment?
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference performer = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Device"];
   * </code>
   *
   * @return The performer.
   */
  com.google.fhir.stu3.proto.Reference getPerformer();
  /**
   *
   *
   * <pre>
   * Who did assessment?
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference performer = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Device"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPerformerOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.RiskAssessment.Reason reason = 20;</code>
   *
   * @return Whether the reason field is set.
   */
  boolean hasReason();
  /**
   * <code>.google.fhir.stu3.proto.RiskAssessment.Reason reason = 20;</code>
   *
   * @return The reason.
   */
  com.google.fhir.stu3.proto.RiskAssessment.Reason getReason();
  /** <code>.google.fhir.stu3.proto.RiskAssessment.Reason reason = 20;</code> */
  com.google.fhir.stu3.proto.RiskAssessment.ReasonOrBuilder getReasonOrBuilder();

  /**
   *
   *
   * <pre>
   * Information used in assessment
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference basis = 21 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getBasisList();
  /**
   *
   *
   * <pre>
   * Information used in assessment
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference basis = 21 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getBasis(int index);
  /**
   *
   *
   * <pre>
   * Information used in assessment
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference basis = 21 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  int getBasisCount();
  /**
   *
   *
   * <pre>
   * Information used in assessment
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference basis = 21 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getBasisOrBuilderList();
  /**
   *
   *
   * <pre>
   * Information used in assessment
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference basis = 21 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getBasisOrBuilder(int index);

  /** <code>repeated .google.fhir.stu3.proto.RiskAssessment.Prediction prediction = 22;</code> */
  java.util.List<com.google.fhir.stu3.proto.RiskAssessment.Prediction> getPredictionList();
  /** <code>repeated .google.fhir.stu3.proto.RiskAssessment.Prediction prediction = 22;</code> */
  com.google.fhir.stu3.proto.RiskAssessment.Prediction getPrediction(int index);
  /** <code>repeated .google.fhir.stu3.proto.RiskAssessment.Prediction prediction = 22;</code> */
  int getPredictionCount();
  /** <code>repeated .google.fhir.stu3.proto.RiskAssessment.Prediction prediction = 22;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.RiskAssessment.PredictionOrBuilder>
      getPredictionOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.RiskAssessment.Prediction prediction = 22;</code> */
  com.google.fhir.stu3.proto.RiskAssessment.PredictionOrBuilder getPredictionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * How to reduce risk
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String mitigation = 23;</code>
   *
   * @return Whether the mitigation field is set.
   */
  boolean hasMitigation();
  /**
   *
   *
   * <pre>
   * How to reduce risk
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String mitigation = 23;</code>
   *
   * @return The mitigation.
   */
  com.google.fhir.stu3.proto.String getMitigation();
  /**
   *
   *
   * <pre>
   * How to reduce risk
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String mitigation = 23;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getMitigationOrBuilder();

  /**
   *
   *
   * <pre>
   * Comments on the risk assessment
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String comment = 24;</code>
   *
   * @return Whether the comment field is set.
   */
  boolean hasComment();
  /**
   *
   *
   * <pre>
   * Comments on the risk assessment
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String comment = 24;</code>
   *
   * @return The comment.
   */
  com.google.fhir.stu3.proto.String getComment();
  /**
   *
   *
   * <pre>
   * Comments on the risk assessment
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String comment = 24;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getCommentOrBuilder();
}