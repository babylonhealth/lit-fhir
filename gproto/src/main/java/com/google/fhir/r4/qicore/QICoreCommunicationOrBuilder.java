// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/qicore/qicore.proto

package com.google.fhir.r4.qicore;

public interface QICoreCommunicationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.qicore.QICoreCommunication)
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
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> getExtensionList();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  int getExtensionCount();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> getExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
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
   * Unique identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Unique identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Unique identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Unique identifier
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
   * Unique identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  java.util.List<com.google.fhir.r4.core.Canonical> getInstantiatesCanonicalList();
  /**
   *
   *
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  com.google.fhir.r4.core.Canonical getInstantiatesCanonical(int index);
  /**
   *
   *
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  int getInstantiatesCanonicalCount();
  /**
   *
   *
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CanonicalOrBuilder>
      getInstantiatesCanonicalOrBuilderList();
  /**
   *
   *
   * <pre>
   * Instantiates FHIR protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates_canonical = 11;</code>
   */
  com.google.fhir.r4.core.CanonicalOrBuilder getInstantiatesCanonicalOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  java.util.List<com.google.fhir.r4.core.Uri> getInstantiatesUriList();
  /**
   *
   *
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  com.google.fhir.r4.core.Uri getInstantiatesUri(int index);
  /**
   *
   *
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  int getInstantiatesUriCount();
  /**
   *
   *
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.UriOrBuilder> getInstantiatesUriOrBuilderList();
  /**
   *
   *
   * <pre>
   * Instantiates external protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Uri instantiates_uri = 12;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getInstantiatesUriOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Request fulfilled by this communication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 13 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getBasedOnList();
  /**
   *
   *
   * <pre>
   * Request fulfilled by this communication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 13 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getBasedOn(int index);
  /**
   *
   *
   * <pre>
   * Request fulfilled by this communication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 13 [(.google.fhir.proto.valid_reference_type) = "Resource"];
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
   * repeated .google.fhir.r4.core.Reference based_on = 13 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getBasedOnOrBuilderList();
  /**
   *
   *
   * <pre>
   * Request fulfilled by this communication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference based_on = 13 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getBasedOnOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Part of this action
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference part_of = 14 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getPartOfList();
  /**
   *
   *
   * <pre>
   * Part of this action
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference part_of = 14 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getPartOf(int index);
  /**
   *
   *
   * <pre>
   * Part of this action
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference part_of = 14 [(.google.fhir.proto.valid_reference_type) = "Resource"];
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
   * repeated .google.fhir.r4.core.Reference part_of = 14 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getPartOfOrBuilderList();
  /**
   *
   *
   * <pre>
   * Part of this action
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference part_of = 14 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPartOfOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Reply to
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference in_response_to = 15 [(.google.fhir.proto.valid_reference_type) = "Communication"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getInResponseToList();
  /**
   *
   *
   * <pre>
   * Reply to
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference in_response_to = 15 [(.google.fhir.proto.valid_reference_type) = "Communication"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getInResponseTo(int index);
  /**
   *
   *
   * <pre>
   * Reply to
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference in_response_to = 15 [(.google.fhir.proto.valid_reference_type) = "Communication"];
   * </code>
   */
  int getInResponseToCount();
  /**
   *
   *
   * <pre>
   * Reply to
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference in_response_to = 15 [(.google.fhir.proto.valid_reference_type) = "Communication"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getInResponseToOrBuilderList();
  /**
   *
   *
   * <pre>
   * Reply to
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference in_response_to = 15 [(.google.fhir.proto.valid_reference_type) = "Communication"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getInResponseToOrBuilder(int index);

  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreCommunication.StatusCode status = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreCommunication.StatusCode status = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.r4.qicore.QICoreCommunication.StatusCode getStatus();
  /**
   * <code>
   * .google.fhir.r4.qicore.QICoreCommunication.StatusCode status = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreCommunication.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Reason for current status
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status_reason = 17;</code>
   *
   * @return Whether the statusReason field is set.
   */
  boolean hasStatusReason();
  /**
   *
   *
   * <pre>
   * Reason for current status
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status_reason = 17;</code>
   *
   * @return The statusReason.
   */
  com.google.fhir.r4.core.CodeableConcept getStatusReason();
  /**
   *
   *
   * <pre>
   * Reason for current status
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status_reason = 17;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getStatusReasonOrBuilder();

  /**
   *
   *
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 18;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getCategoryList();
  /**
   *
   *
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 18;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getCategory(int index);
  /**
   *
   *
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 18;</code>
   */
  int getCategoryCount();
  /**
   *
   *
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 18;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getCategoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 18;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCategoryOrBuilder(int index);

  /**
   * <code>.google.fhir.r4.qicore.QICoreCommunication.PriorityCode priority = 19;</code>
   *
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   * <code>.google.fhir.r4.qicore.QICoreCommunication.PriorityCode priority = 19;</code>
   *
   * @return The priority.
   */
  com.google.fhir.r4.qicore.QICoreCommunication.PriorityCode getPriority();
  /** <code>.google.fhir.r4.qicore.QICoreCommunication.PriorityCode priority = 19;</code> */
  com.google.fhir.r4.qicore.QICoreCommunication.PriorityCodeOrBuilder getPriorityOrBuilder();

  /**
   *
   *
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept medium = 20;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getMediumList();
  /**
   *
   *
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept medium = 20;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getMedium(int index);
  /**
   *
   *
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept medium = 20;</code>
   */
  int getMediumCount();
  /**
   *
   *
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept medium = 20;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getMediumOrBuilderList();
  /**
   *
   *
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept medium = 20;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getMediumOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Focus of message
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 21 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
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
   * .google.fhir.r4.core.Reference subject = 21 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.r4.core.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Focus of message
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 21 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Description of the purpose/content
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept topic = 22;</code>
   *
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   *
   *
   * <pre>
   * Description of the purpose/content
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept topic = 22;</code>
   *
   * @return The topic.
   */
  com.google.fhir.r4.core.CodeableConcept getTopic();
  /**
   *
   *
   * <pre>
   * Description of the purpose/content
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept topic = 22;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getTopicOrBuilder();

  /**
   *
   *
   * <pre>
   * Resources that pertain to this communication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference about = 23 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getAboutList();
  /**
   *
   *
   * <pre>
   * Resources that pertain to this communication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference about = 23 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getAbout(int index);
  /**
   *
   *
   * <pre>
   * Resources that pertain to this communication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference about = 23 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  int getAboutCount();
  /**
   *
   *
   * <pre>
   * Resources that pertain to this communication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference about = 23 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getAboutOrBuilderList();
  /**
   *
   *
   * <pre>
   * Resources that pertain to this communication
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference about = 23 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getAboutOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Encounter created as part of
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 24 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return Whether the encounter field is set.
   */
  boolean hasEncounter();
  /**
   *
   *
   * <pre>
   * Encounter created as part of
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 24 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return The encounter.
   */
  com.google.fhir.r4.core.Reference getEncounter();
  /**
   *
   *
   * <pre>
   * Encounter created as part of
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 24 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getEncounterOrBuilder();

  /**
   *
   *
   * <pre>
   * When sent
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime sent = 25;</code>
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
   * <code>.google.fhir.r4.core.DateTime sent = 25;</code>
   *
   * @return The sent.
   */
  com.google.fhir.r4.core.DateTime getSent();
  /**
   *
   *
   * <pre>
   * When sent
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime sent = 25;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getSentOrBuilder();

  /**
   *
   *
   * <pre>
   * When received
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime received = 26;</code>
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
   * <code>.google.fhir.r4.core.DateTime received = 26;</code>
   *
   * @return The received.
   */
  com.google.fhir.r4.core.DateTime getReceived();
  /**
   *
   *
   * <pre>
   * When received
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime received = 26;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getReceivedOrBuilder();

  /**
   *
   *
   * <pre>
   * Message recipient
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference recipient = 27 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getRecipientList();
  /**
   *
   *
   * <pre>
   * Message recipient
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference recipient = 27 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getRecipient(int index);
  /**
   *
   *
   * <pre>
   * Message recipient
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference recipient = 27 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group"];
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
   * repeated .google.fhir.r4.core.Reference recipient = 27 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getRecipientOrBuilderList();
  /**
   *
   *
   * <pre>
   * Message recipient
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference recipient = 27 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getRecipientOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Message sender
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference sender = 28 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
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
   * .google.fhir.r4.core.Reference sender = 28 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   *
   * @return The sender.
   */
  com.google.fhir.r4.core.Reference getSender();
  /**
   *
   *
   * <pre>
   * Message sender
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference sender = 28 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSenderOrBuilder();

  /**
   *
   *
   * <pre>
   * Indication for message
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getReasonCodeList();
  /**
   *
   *
   * <pre>
   * Indication for message
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getReasonCode(int index);
  /**
   *
   *
   * <pre>
   * Indication for message
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  int getReasonCodeCount();
  /**
   *
   *
   * <pre>
   * Indication for message
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getReasonCodeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Indication for message
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getReasonCodeOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Why was communication done?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getReasonReferenceList();
  /**
   *
   *
   * <pre>
   * Why was communication done?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getReasonReference(int index);
  /**
   *
   *
   * <pre>
   * Why was communication done?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
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
   * repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getReasonReferenceOrBuilderList();
  /**
   *
   *
   * <pre>
   * Why was communication done?
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getReasonReferenceOrBuilder(int index);

  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreCommunication.Payload payload = 31 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.qicore.QICoreCommunication.Payload> getPayloadList();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreCommunication.Payload payload = 31 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreCommunication.Payload getPayload(int index);
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreCommunication.Payload payload = 31 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  int getPayloadCount();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreCommunication.Payload payload = 31 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.qicore.QICoreCommunication.PayloadOrBuilder>
      getPayloadOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.r4.qicore.QICoreCommunication.Payload payload = 31 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];
   * </code>
   */
  com.google.fhir.r4.qicore.QICoreCommunication.PayloadOrBuilder getPayloadOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Comments made about the communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  java.util.List<com.google.fhir.r4.core.Annotation> getNoteList();
  /**
   *
   *
   * <pre>
   * Comments made about the communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  com.google.fhir.r4.core.Annotation getNote(int index);
  /**
   *
   *
   * <pre>
   * Comments made about the communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  int getNoteCount();
  /**
   *
   *
   * <pre>
   * Comments made about the communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AnnotationOrBuilder> getNoteOrBuilderList();
  /**
   *
   *
   * <pre>
   * Comments made about the communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  com.google.fhir.r4.core.AnnotationOrBuilder getNoteOrBuilder(int index);
}