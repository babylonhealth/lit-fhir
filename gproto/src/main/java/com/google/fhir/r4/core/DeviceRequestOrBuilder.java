// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/device_request.proto

package com.google.fhir.r4.core;

public interface DeviceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.DeviceRequest)
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
   * External Request identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * External Request identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * External Request identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * External Request identifier
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
   * External Request identifier
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
   * What request fulfills
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
   * What request fulfills
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
   * What request fulfills
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
   * What request fulfills
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
   * What request fulfills
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
   * What request replaces
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference prior_request = 14 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getPriorRequestList();
  /**
   *
   *
   * <pre>
   * What request replaces
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference prior_request = 14 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getPriorRequest(int index);
  /**
   *
   *
   * <pre>
   * What request replaces
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference prior_request = 14 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  int getPriorRequestCount();
  /**
   *
   *
   * <pre>
   * What request replaces
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference prior_request = 14 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getPriorRequestOrBuilderList();
  /**
   *
   *
   * <pre>
   * What request replaces
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference prior_request = 14 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPriorRequestOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Identifier of composite request
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier group_identifier = 15;</code>
   *
   * @return Whether the groupIdentifier field is set.
   */
  boolean hasGroupIdentifier();
  /**
   *
   *
   * <pre>
   * Identifier of composite request
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier group_identifier = 15;</code>
   *
   * @return The groupIdentifier.
   */
  com.google.fhir.r4.core.Identifier getGroupIdentifier();
  /**
   *
   *
   * <pre>
   * Identifier of composite request
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier group_identifier = 15;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getGroupIdentifierOrBuilder();

  /**
   * <code>.google.fhir.r4.core.DeviceRequest.StatusCode status = 16;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.google.fhir.r4.core.DeviceRequest.StatusCode status = 16;</code>
   *
   * @return The status.
   */
  com.google.fhir.r4.core.DeviceRequest.StatusCode getStatus();
  /** <code>.google.fhir.r4.core.DeviceRequest.StatusCode status = 16;</code> */
  com.google.fhir.r4.core.DeviceRequest.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <code>
   * .google.fhir.r4.core.DeviceRequest.IntentCode intent = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the intent field is set.
   */
  boolean hasIntent();
  /**
   * <code>
   * .google.fhir.r4.core.DeviceRequest.IntentCode intent = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The intent.
   */
  com.google.fhir.r4.core.DeviceRequest.IntentCode getIntent();
  /**
   * <code>
   * .google.fhir.r4.core.DeviceRequest.IntentCode intent = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.DeviceRequest.IntentCodeOrBuilder getIntentOrBuilder();

  /**
   * <code>.google.fhir.r4.core.DeviceRequest.PriorityCode priority = 18;</code>
   *
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   * <code>.google.fhir.r4.core.DeviceRequest.PriorityCode priority = 18;</code>
   *
   * @return The priority.
   */
  com.google.fhir.r4.core.DeviceRequest.PriorityCode getPriority();
  /** <code>.google.fhir.r4.core.DeviceRequest.PriorityCode priority = 18;</code> */
  com.google.fhir.r4.core.DeviceRequest.PriorityCodeOrBuilder getPriorityOrBuilder();

  /**
   * <code>
   * .google.fhir.r4.core.DeviceRequest.CodeX code = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   * <code>
   * .google.fhir.r4.core.DeviceRequest.CodeX code = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The code.
   */
  com.google.fhir.r4.core.DeviceRequest.CodeX getCode();
  /**
   * <code>
   * .google.fhir.r4.core.DeviceRequest.CodeX code = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.DeviceRequest.CodeXOrBuilder getCodeOrBuilder();

  /** <code>repeated .google.fhir.r4.core.DeviceRequest.Parameter parameter = 20;</code> */
  java.util.List<com.google.fhir.r4.core.DeviceRequest.Parameter> getParameterList();
  /** <code>repeated .google.fhir.r4.core.DeviceRequest.Parameter parameter = 20;</code> */
  com.google.fhir.r4.core.DeviceRequest.Parameter getParameter(int index);
  /** <code>repeated .google.fhir.r4.core.DeviceRequest.Parameter parameter = 20;</code> */
  int getParameterCount();
  /** <code>repeated .google.fhir.r4.core.DeviceRequest.Parameter parameter = 20;</code> */
  java.util.List<? extends com.google.fhir.r4.core.DeviceRequest.ParameterOrBuilder>
      getParameterOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.DeviceRequest.Parameter parameter = 20;</code> */
  com.google.fhir.r4.core.DeviceRequest.ParameterOrBuilder getParameterOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Focus of request
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Location", (.google.fhir.proto.valid_reference_type) = "Device"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * Focus of request
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Location", (.google.fhir.proto.valid_reference_type) = "Device"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.r4.core.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Focus of request
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Location", (.google.fhir.proto.valid_reference_type) = "Device"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Encounter motivating request
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 22 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return Whether the encounter field is set.
   */
  boolean hasEncounter();
  /**
   *
   *
   * <pre>
   * Encounter motivating request
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 22 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   *
   * @return The encounter.
   */
  com.google.fhir.r4.core.Reference getEncounter();
  /**
   *
   *
   * <pre>
   * Encounter motivating request
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference encounter = 22 [(.google.fhir.proto.valid_reference_type) = "Encounter"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getEncounterOrBuilder();

  /**
   * <code>.google.fhir.r4.core.DeviceRequest.OccurrenceX occurrence = 23;</code>
   *
   * @return Whether the occurrence field is set.
   */
  boolean hasOccurrence();
  /**
   * <code>.google.fhir.r4.core.DeviceRequest.OccurrenceX occurrence = 23;</code>
   *
   * @return The occurrence.
   */
  com.google.fhir.r4.core.DeviceRequest.OccurrenceX getOccurrence();
  /** <code>.google.fhir.r4.core.DeviceRequest.OccurrenceX occurrence = 23;</code> */
  com.google.fhir.r4.core.DeviceRequest.OccurrenceXOrBuilder getOccurrenceOrBuilder();

  /**
   *
   *
   * <pre>
   * When recorded
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime authored_on = 24;</code>
   *
   * @return Whether the authoredOn field is set.
   */
  boolean hasAuthoredOn();
  /**
   *
   *
   * <pre>
   * When recorded
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime authored_on = 24;</code>
   *
   * @return The authoredOn.
   */
  com.google.fhir.r4.core.DateTime getAuthoredOn();
  /**
   *
   *
   * <pre>
   * When recorded
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime authored_on = 24;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getAuthoredOnOrBuilder();

  /**
   *
   *
   * <pre>
   * Who/what is requesting diagnostics
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference requester = 25 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the requester field is set.
   */
  boolean hasRequester();
  /**
   *
   *
   * <pre>
   * Who/what is requesting diagnostics
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference requester = 25 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The requester.
   */
  com.google.fhir.r4.core.Reference getRequester();
  /**
   *
   *
   * <pre>
   * Who/what is requesting diagnostics
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference requester = 25 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getRequesterOrBuilder();

  /**
   *
   *
   * <pre>
   * Filler role
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept performer_type = 26;</code>
   *
   * @return Whether the performerType field is set.
   */
  boolean hasPerformerType();
  /**
   *
   *
   * <pre>
   * Filler role
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept performer_type = 26;</code>
   *
   * @return The performerType.
   */
  com.google.fhir.r4.core.CodeableConcept getPerformerType();
  /**
   *
   *
   * <pre>
   * Filler role
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept performer_type = 26;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getPerformerTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Requested Filler
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference performer = 27 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam", (.google.fhir.proto.valid_reference_type) = "HealthcareService", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   *
   * @return Whether the performer field is set.
   */
  boolean hasPerformer();
  /**
   *
   *
   * <pre>
   * Requested Filler
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference performer = 27 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam", (.google.fhir.proto.valid_reference_type) = "HealthcareService", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   *
   * @return The performer.
   */
  com.google.fhir.r4.core.Reference getPerformer();
  /**
   *
   *
   * <pre>
   * Requested Filler
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference performer = 27 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam", (.google.fhir.proto.valid_reference_type) = "HealthcareService", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPerformerOrBuilder();

  /**
   *
   *
   * <pre>
   * Coded Reason for request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 28;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getReasonCodeList();
  /**
   *
   *
   * <pre>
   * Coded Reason for request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 28;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getReasonCode(int index);
  /**
   *
   *
   * <pre>
   * Coded Reason for request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 28;</code>
   */
  int getReasonCodeCount();
  /**
   *
   *
   * <pre>
   * Coded Reason for request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 28;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getReasonCodeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Coded Reason for request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 28;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getReasonCodeOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Linked Reason for request
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reason_reference = 29 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getReasonReferenceList();
  /**
   *
   *
   * <pre>
   * Linked Reason for request
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reason_reference = 29 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getReasonReference(int index);
  /**
   *
   *
   * <pre>
   * Linked Reason for request
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reason_reference = 29 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  int getReasonReferenceCount();
  /**
   *
   *
   * <pre>
   * Linked Reason for request
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reason_reference = 29 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getReasonReferenceOrBuilderList();
  /**
   *
   *
   * <pre>
   * Linked Reason for request
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference reason_reference = 29 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getReasonReferenceOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Associated insurance coverage
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference insurance = 30 [(.google.fhir.proto.valid_reference_type) = "Coverage", (.google.fhir.proto.valid_reference_type) = "ClaimResponse"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getInsuranceList();
  /**
   *
   *
   * <pre>
   * Associated insurance coverage
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference insurance = 30 [(.google.fhir.proto.valid_reference_type) = "Coverage", (.google.fhir.proto.valid_reference_type) = "ClaimResponse"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getInsurance(int index);
  /**
   *
   *
   * <pre>
   * Associated insurance coverage
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference insurance = 30 [(.google.fhir.proto.valid_reference_type) = "Coverage", (.google.fhir.proto.valid_reference_type) = "ClaimResponse"];
   * </code>
   */
  int getInsuranceCount();
  /**
   *
   *
   * <pre>
   * Associated insurance coverage
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference insurance = 30 [(.google.fhir.proto.valid_reference_type) = "Coverage", (.google.fhir.proto.valid_reference_type) = "ClaimResponse"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getInsuranceOrBuilderList();
  /**
   *
   *
   * <pre>
   * Associated insurance coverage
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference insurance = 30 [(.google.fhir.proto.valid_reference_type) = "Coverage", (.google.fhir.proto.valid_reference_type) = "ClaimResponse"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getInsuranceOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Additional clinical information
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference supporting_info = 31 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getSupportingInfoList();
  /**
   *
   *
   * <pre>
   * Additional clinical information
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference supporting_info = 31 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getSupportingInfo(int index);
  /**
   *
   *
   * <pre>
   * Additional clinical information
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference supporting_info = 31 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  int getSupportingInfoCount();
  /**
   *
   *
   * <pre>
   * Additional clinical information
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference supporting_info = 31 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getSupportingInfoOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional clinical information
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference supporting_info = 31 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSupportingInfoOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Notes or comments
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  java.util.List<com.google.fhir.r4.core.Annotation> getNoteList();
  /**
   *
   *
   * <pre>
   * Notes or comments
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  com.google.fhir.r4.core.Annotation getNote(int index);
  /**
   *
   *
   * <pre>
   * Notes or comments
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  int getNoteCount();
  /**
   *
   *
   * <pre>
   * Notes or comments
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AnnotationOrBuilder> getNoteOrBuilderList();
  /**
   *
   *
   * <pre>
   * Notes or comments
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 32;</code>
   */
  com.google.fhir.r4.core.AnnotationOrBuilder getNoteOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Request provenance
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference relevant_history = 33 [(.google.fhir.proto.valid_reference_type) = "Provenance"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getRelevantHistoryList();
  /**
   *
   *
   * <pre>
   * Request provenance
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference relevant_history = 33 [(.google.fhir.proto.valid_reference_type) = "Provenance"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getRelevantHistory(int index);
  /**
   *
   *
   * <pre>
   * Request provenance
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference relevant_history = 33 [(.google.fhir.proto.valid_reference_type) = "Provenance"];
   * </code>
   */
  int getRelevantHistoryCount();
  /**
   *
   *
   * <pre>
   * Request provenance
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference relevant_history = 33 [(.google.fhir.proto.valid_reference_type) = "Provenance"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder>
      getRelevantHistoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Request provenance
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference relevant_history = 33 [(.google.fhir.proto.valid_reference_type) = "Provenance"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getRelevantHistoryOrBuilder(int index);
}