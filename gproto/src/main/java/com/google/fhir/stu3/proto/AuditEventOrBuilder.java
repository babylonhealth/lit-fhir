// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface AuditEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.AuditEvent)
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
   * Type/identifier of event
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Coding type = 9 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * Type/identifier of event
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Coding type = 9 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The type.
   */
  com.google.fhir.stu3.proto.Coding getType();
  /**
   *
   *
   * <pre>
   * Type/identifier of event
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Coding type = 9 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.CodingOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * More specific type/id for the event
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding subtype = 10;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Coding> getSubtypeList();
  /**
   *
   *
   * <pre>
   * More specific type/id for the event
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding subtype = 10;</code>
   */
  com.google.fhir.stu3.proto.Coding getSubtype(int index);
  /**
   *
   *
   * <pre>
   * More specific type/id for the event
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding subtype = 10;</code>
   */
  int getSubtypeCount();
  /**
   *
   *
   * <pre>
   * More specific type/id for the event
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding subtype = 10;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodingOrBuilder> getSubtypeOrBuilderList();
  /**
   *
   *
   * <pre>
   * More specific type/id for the event
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Coding subtype = 10;</code>
   */
  com.google.fhir.stu3.proto.CodingOrBuilder getSubtypeOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Type of action performed during the event
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AuditEventActionCode action = 11;</code>
   *
   * @return Whether the action field is set.
   */
  boolean hasAction();
  /**
   *
   *
   * <pre>
   * Type of action performed during the event
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AuditEventActionCode action = 11;</code>
   *
   * @return The action.
   */
  com.google.fhir.stu3.proto.AuditEventActionCode getAction();
  /**
   *
   *
   * <pre>
   * Type of action performed during the event
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AuditEventActionCode action = 11;</code>
   */
  com.google.fhir.stu3.proto.AuditEventActionCodeOrBuilder getActionOrBuilder();

  /**
   *
   *
   * <pre>
   * Time when the event occurred on source
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Instant recorded = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the recorded field is set.
   */
  boolean hasRecorded();
  /**
   *
   *
   * <pre>
   * Time when the event occurred on source
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Instant recorded = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The recorded.
   */
  com.google.fhir.stu3.proto.Instant getRecorded();
  /**
   *
   *
   * <pre>
   * Time when the event occurred on source
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Instant recorded = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.InstantOrBuilder getRecordedOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether the event succeeded or failed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AuditEventOutcomeCode outcome = 13;</code>
   *
   * @return Whether the outcome field is set.
   */
  boolean hasOutcome();
  /**
   *
   *
   * <pre>
   * Whether the event succeeded or failed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AuditEventOutcomeCode outcome = 13;</code>
   *
   * @return The outcome.
   */
  com.google.fhir.stu3.proto.AuditEventOutcomeCode getOutcome();
  /**
   *
   *
   * <pre>
   * Whether the event succeeded or failed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.AuditEventOutcomeCode outcome = 13;</code>
   */
  com.google.fhir.stu3.proto.AuditEventOutcomeCodeOrBuilder getOutcomeOrBuilder();

  /**
   *
   *
   * <pre>
   * Description of the event outcome
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String outcome_desc = 14;</code>
   *
   * @return Whether the outcomeDesc field is set.
   */
  boolean hasOutcomeDesc();
  /**
   *
   *
   * <pre>
   * Description of the event outcome
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String outcome_desc = 14;</code>
   *
   * @return The outcomeDesc.
   */
  com.google.fhir.stu3.proto.String getOutcomeDesc();
  /**
   *
   *
   * <pre>
   * Description of the event outcome
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String outcome_desc = 14;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getOutcomeDescOrBuilder();

  /**
   *
   *
   * <pre>
   * The purposeOfUse of the event
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept purpose_of_event = 15;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getPurposeOfEventList();
  /**
   *
   *
   * <pre>
   * The purposeOfUse of the event
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept purpose_of_event = 15;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getPurposeOfEvent(int index);
  /**
   *
   *
   * <pre>
   * The purposeOfUse of the event
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept purpose_of_event = 15;</code>
   */
  int getPurposeOfEventCount();
  /**
   *
   *
   * <pre>
   * The purposeOfUse of the event
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept purpose_of_event = 15;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getPurposeOfEventOrBuilderList();
  /**
   *
   *
   * <pre>
   * The purposeOfUse of the event
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept purpose_of_event = 15;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getPurposeOfEventOrBuilder(int index);

  /**
   * <code>
   * repeated .google.fhir.stu3.proto.AuditEvent.Agent agent = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.AuditEvent.Agent> getAgentList();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.AuditEvent.Agent agent = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.AuditEvent.Agent getAgent(int index);
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.AuditEvent.Agent agent = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  int getAgentCount();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.AuditEvent.Agent agent = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.AuditEvent.AgentOrBuilder>
      getAgentOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.AuditEvent.Agent agent = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.AuditEvent.AgentOrBuilder getAgentOrBuilder(int index);

  /**
   * <code>
   * .google.fhir.stu3.proto.AuditEvent.Source source = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <code>
   * .google.fhir.stu3.proto.AuditEvent.Source source = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The source.
   */
  com.google.fhir.stu3.proto.AuditEvent.Source getSource();
  /**
   * <code>
   * .google.fhir.stu3.proto.AuditEvent.Source source = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.AuditEvent.SourceOrBuilder getSourceOrBuilder();

  /**
   * <code>
   * repeated .google.fhir.stu3.proto.AuditEvent.Entity entity = 18 [(.google.fhir.proto.fhir_path_constraint) = "name.empty() or query.empty()"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.AuditEvent.Entity> getEntityList();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.AuditEvent.Entity entity = 18 [(.google.fhir.proto.fhir_path_constraint) = "name.empty() or query.empty()"];
   * </code>
   */
  com.google.fhir.stu3.proto.AuditEvent.Entity getEntity(int index);
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.AuditEvent.Entity entity = 18 [(.google.fhir.proto.fhir_path_constraint) = "name.empty() or query.empty()"];
   * </code>
   */
  int getEntityCount();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.AuditEvent.Entity entity = 18 [(.google.fhir.proto.fhir_path_constraint) = "name.empty() or query.empty()"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.AuditEvent.EntityOrBuilder>
      getEntityOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.AuditEvent.Entity entity = 18 [(.google.fhir.proto.fhir_path_constraint) = "name.empty() or query.empty()"];
   * </code>
   */
  com.google.fhir.stu3.proto.AuditEvent.EntityOrBuilder getEntityOrBuilder(int index);
}