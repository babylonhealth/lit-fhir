// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface CommunicationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.Communication)
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
   * Unique identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Unique identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Unique identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Unique identifier
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
   * Unique identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Instantiates protocol or definition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "PlanDefinition", (.google.fhir.proto.valid_reference_type) = "ActivityDefinition"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getDefinitionList();
  /**
   *
   *
   * <pre>
   * Instantiates protocol or definition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "PlanDefinition", (.google.fhir.proto.valid_reference_type) = "ActivityDefinition"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getDefinition(int index);
  /**
   *
   *
   * <pre>
   * Instantiates protocol or definition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "PlanDefinition", (.google.fhir.proto.valid_reference_type) = "ActivityDefinition"];
   * </code>
   */
  int getDefinitionCount();
  /**
   *
   *
   * <pre>
   * Instantiates protocol or definition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "PlanDefinition", (.google.fhir.proto.valid_reference_type) = "ActivityDefinition"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getDefinitionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Instantiates protocol or definition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "PlanDefinition", (.google.fhir.proto.valid_reference_type) = "ActivityDefinition"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getDefinitionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Request fulfilled by this communication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getBasedOnList();
  /**
   *
   *
   * <pre>
   * Request fulfilled by this communication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getBasedOn(int index);
  /**
   *
   *
   * <pre>
   * Request fulfilled by this communication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  int getBasedOnCount();
  /**
   *
   *
   * <pre>
   * Request fulfilled by this communication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getBasedOnOrBuilderList();
  /**
   *
   *
   * <pre>
   * Request fulfilled by this communication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getBasedOnOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Part of this action
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getPartOfList();
  /**
   *
   *
   * <pre>
   * Part of this action
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getPartOf(int index);
  /**
   *
   *
   * <pre>
   * Part of this action
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  int getPartOfCount();
  /**
   *
   *
   * <pre>
   * Part of this action
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getPartOfOrBuilderList();
  /**
   *
   *
   * <pre>
   * Part of this action
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference part_of = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPartOfOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * preparation | in-progress | suspended | aborted | completed |
   * entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.EventStatusCode status = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * preparation | in-progress | suspended | aborted | completed |
   * entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.EventStatusCode status = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.EventStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * preparation | in-progress | suspended | aborted | completed |
   * entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.EventStatusCode status = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.EventStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Communication did not occur
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean not_done = 14;</code>
   *
   * @return Whether the notDone field is set.
   */
  boolean hasNotDone();
  /**
   *
   *
   * <pre>
   * Communication did not occur
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean not_done = 14;</code>
   *
   * @return The notDone.
   */
  com.google.fhir.stu3.proto.Boolean getNotDone();
  /**
   *
   *
   * <pre>
   * Communication did not occur
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean not_done = 14;</code>
   */
  com.google.fhir.stu3.proto.BooleanOrBuilder getNotDoneOrBuilder();

  /**
   *
   *
   * <pre>
   * Why communication did not occur
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept not_done_reason = 15;</code>
   *
   * @return Whether the notDoneReason field is set.
   */
  boolean hasNotDoneReason();
  /**
   *
   *
   * <pre>
   * Why communication did not occur
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept not_done_reason = 15;</code>
   *
   * @return The notDoneReason.
   */
  com.google.fhir.stu3.proto.CodeableConcept getNotDoneReason();
  /**
   *
   *
   * <pre>
   * Why communication did not occur
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept not_done_reason = 15;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getNotDoneReasonOrBuilder();

  /**
   *
   *
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 16;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getCategoryList();
  /**
   *
   *
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 16;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getCategory(int index);
  /**
   *
   *
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 16;</code>
   */
  int getCategoryCount();
  /**
   *
   *
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 16;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getCategoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept category = 16;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getCategoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept medium = 17;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getMediumList();
  /**
   *
   *
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept medium = 17;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getMedium(int index);
  /**
   *
   *
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept medium = 17;</code>
   */
  int getMediumCount();
  /**
   *
   *
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept medium = 17;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getMediumOrBuilderList();
  /**
   *
   *
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept medium = 17;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getMediumOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Focus of message
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 18 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * Focus of message
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 18 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Focus of message
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 18 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Message recipient
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference recipient = 19 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getRecipientList();
  /**
   *
   *
   * <pre>
   * Message recipient
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference recipient = 19 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getRecipient(int index);
  /**
   *
   *
   * <pre>
   * Message recipient
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference recipient = 19 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  int getRecipientCount();
  /**
   *
   *
   * <pre>
   * Message recipient
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference recipient = 19 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getRecipientOrBuilderList();
  /**
   *
   *
   * <pre>
   * Message recipient
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference recipient = 19 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getRecipientOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Focal resources
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference topic = 20 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getTopicList();
  /**
   *
   *
   * <pre>
   * Focal resources
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference topic = 20 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getTopic(int index);
  /**
   *
   *
   * <pre>
   * Focal resources
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference topic = 20 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  int getTopicCount();
  /**
   *
   *
   * <pre>
   * Focal resources
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference topic = 20 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getTopicOrBuilderList();
  /**
   *
   *
   * <pre>
   * Focal resources
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference topic = 20 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getTopicOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Encounter or episode leading to message
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 21 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * Encounter or episode leading to message
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 21 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   *
   * @return The context.
   */
  com.google.fhir.stu3.proto.Reference getContext();
  /**
   *
   *
   * <pre>
   * Encounter or episode leading to message
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 21 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getContextOrBuilder();

  /**
   *
   *
   * <pre>
   * When sent
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime sent = 22;</code>
   *
   * @return Whether the sent field is set.
   */
  boolean hasSent();
  /**
   *
   *
   * <pre>
   * When sent
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime sent = 22;</code>
   *
   * @return The sent.
   */
  com.google.fhir.stu3.proto.DateTime getSent();
  /**
   *
   *
   * <pre>
   * When sent
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime sent = 22;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getSentOrBuilder();

  /**
   *
   *
   * <pre>
   * When received
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime received = 23;</code>
   *
   * @return Whether the received field is set.
   */
  boolean hasReceived();
  /**
   *
   *
   * <pre>
   * When received
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime received = 23;</code>
   *
   * @return The received.
   */
  com.google.fhir.stu3.proto.DateTime getReceived();
  /**
   *
   *
   * <pre>
   * When received
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime received = 23;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getReceivedOrBuilder();

  /**
   *
   *
   * <pre>
   * Message sender
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference sender = 24 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   *
   * @return Whether the sender field is set.
   */
  boolean hasSender();
  /**
   *
   *
   * <pre>
   * Message sender
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference sender = 24 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   *
   * @return The sender.
   */
  com.google.fhir.stu3.proto.Reference getSender();
  /**
   *
   *
   * <pre>
   * Message sender
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference sender = 24 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSenderOrBuilder();

  /**
   *
   *
   * <pre>
   * Indication for message
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 25;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getReasonCodeList();
  /**
   *
   *
   * <pre>
   * Indication for message
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 25;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getReasonCode(int index);
  /**
   *
   *
   * <pre>
   * Indication for message
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 25;</code>
   */
  int getReasonCodeCount();
  /**
   *
   *
   * <pre>
   * Indication for message
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 25;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getReasonCodeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Indication for message
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 25;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getReasonCodeOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Why was communication done?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference reason_reference = 26 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getReasonReferenceList();
  /**
   *
   *
   * <pre>
   * Why was communication done?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference reason_reference = 26 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getReasonReference(int index);
  /**
   *
   *
   * <pre>
   * Why was communication done?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference reason_reference = 26 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  int getReasonReferenceCount();
  /**
   *
   *
   * <pre>
   * Why was communication done?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference reason_reference = 26 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getReasonReferenceOrBuilderList();
  /**
   *
   *
   * <pre>
   * Why was communication done?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference reason_reference = 26 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getReasonReferenceOrBuilder(int index);

  /** <code>repeated .google.fhir.stu3.proto.Communication.Payload payload = 27;</code> */
  java.util.List<com.google.fhir.stu3.proto.Communication.Payload> getPayloadList();
  /** <code>repeated .google.fhir.stu3.proto.Communication.Payload payload = 27;</code> */
  com.google.fhir.stu3.proto.Communication.Payload getPayload(int index);
  /** <code>repeated .google.fhir.stu3.proto.Communication.Payload payload = 27;</code> */
  int getPayloadCount();
  /** <code>repeated .google.fhir.stu3.proto.Communication.Payload payload = 27;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.Communication.PayloadOrBuilder>
      getPayloadOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.Communication.Payload payload = 27;</code> */
  com.google.fhir.stu3.proto.Communication.PayloadOrBuilder getPayloadOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Comments made about the communication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 28;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Annotation> getNoteList();
  /**
   *
   *
   * <pre>
   * Comments made about the communication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 28;</code>
   */
  com.google.fhir.stu3.proto.Annotation getNote(int index);
  /**
   *
   *
   * <pre>
   * Comments made about the communication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 28;</code>
   */
  int getNoteCount();
  /**
   *
   *
   * <pre>
   * Comments made about the communication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 28;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.AnnotationOrBuilder> getNoteOrBuilderList();
  /**
   *
   *
   * <pre>
   * Comments made about the communication
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 28;</code>
   */
  com.google.fhir.stu3.proto.AnnotationOrBuilder getNoteOrBuilder(int index);
}
