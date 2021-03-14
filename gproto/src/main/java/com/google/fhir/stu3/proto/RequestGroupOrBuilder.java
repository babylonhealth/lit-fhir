// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface RequestGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.RequestGroup)
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
   * Instantiates protocol or definition
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "Resource"];
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
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "Resource"];
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
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "Resource"];
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
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "Resource"];
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
   * repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getDefinitionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Fulfills plan, proposal, or order
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
   * Fulfills plan, proposal, or order
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
   * Fulfills plan, proposal, or order
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
   * Fulfills plan, proposal, or order
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
   * Fulfills plan, proposal, or order
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
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getReplacesList();
  /**
   *
   *
   * <pre>
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getReplaces(int index);
  /**
   *
   *
   * <pre>
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  int getReplacesCount();
  /**
   *
   *
   * <pre>
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder>
      getReplacesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getReplacesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Composite request this is part of
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier group_identifier = 13;</code>
   *
   * @return Whether the groupIdentifier field is set.
   */
  boolean hasGroupIdentifier();
  /**
   *
   *
   * <pre>
   * Composite request this is part of
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier group_identifier = 13;</code>
   *
   * @return The groupIdentifier.
   */
  com.google.fhir.stu3.proto.Identifier getGroupIdentifier();
  /**
   *
   *
   * <pre>
   * Composite request this is part of
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier group_identifier = 13;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getGroupIdentifierOrBuilder();

  /**
   *
   *
   * <pre>
   * draft | active | suspended | cancelled | completed | entered-in-error |
   * unknown
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.RequestStatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * draft | active | suspended | cancelled | completed | entered-in-error |
   * unknown
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.RequestStatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.RequestStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * draft | active | suspended | cancelled | completed | entered-in-error |
   * unknown
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.RequestStatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.RequestStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * proposal | plan | order
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.RequestIntentCode intent = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the intent field is set.
   */
  boolean hasIntent();
  /**
   *
   *
   * <pre>
   * proposal | plan | order
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.RequestIntentCode intent = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The intent.
   */
  com.google.fhir.stu3.proto.RequestIntentCode getIntent();
  /**
   *
   *
   * <pre>
   * proposal | plan | order
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.RequestIntentCode intent = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.RequestIntentCodeOrBuilder getIntentOrBuilder();

  /**
   *
   *
   * <pre>
   * routine | urgent | asap | stat
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestPriorityCode priority = 16;</code>
   *
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   *
   *
   * <pre>
   * routine | urgent | asap | stat
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestPriorityCode priority = 16;</code>
   *
   * @return The priority.
   */
  com.google.fhir.stu3.proto.RequestPriorityCode getPriority();
  /**
   *
   *
   * <pre>
   * routine | urgent | asap | stat
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestPriorityCode priority = 16;</code>
   */
  com.google.fhir.stu3.proto.RequestPriorityCodeOrBuilder getPriorityOrBuilder();

  /**
   *
   *
   * <pre>
   * Who the request group is about
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 17 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * Who the request group is about
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 17 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Who the request group is about
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 17 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Encounter or Episode for the request group
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 18 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * Encounter or Episode for the request group
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 18 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   *
   * @return The context.
   */
  com.google.fhir.stu3.proto.Reference getContext();
  /**
   *
   *
   * <pre>
   * Encounter or Episode for the request group
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference context = 18 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getContextOrBuilder();

  /**
   *
   *
   * <pre>
   * When the request group was authored
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime authored_on = 19;</code>
   *
   * @return Whether the authoredOn field is set.
   */
  boolean hasAuthoredOn();
  /**
   *
   *
   * <pre>
   * When the request group was authored
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime authored_on = 19;</code>
   *
   * @return The authoredOn.
   */
  com.google.fhir.stu3.proto.DateTime getAuthoredOn();
  /**
   *
   *
   * <pre>
   * When the request group was authored
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime authored_on = 19;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getAuthoredOnOrBuilder();

  /**
   *
   *
   * <pre>
   * Device or practitioner that authored the request group
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference author = 20 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   *
   * @return Whether the author field is set.
   */
  boolean hasAuthor();
  /**
   *
   *
   * <pre>
   * Device or practitioner that authored the request group
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference author = 20 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   *
   * @return The author.
   */
  com.google.fhir.stu3.proto.Reference getAuthor();
  /**
   *
   *
   * <pre>
   * Device or practitioner that authored the request group
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference author = 20 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getAuthorOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.RequestGroup.Reason reason = 21;</code>
   *
   * @return Whether the reason field is set.
   */
  boolean hasReason();
  /**
   * <code>.google.fhir.stu3.proto.RequestGroup.Reason reason = 21;</code>
   *
   * @return The reason.
   */
  com.google.fhir.stu3.proto.RequestGroup.Reason getReason();
  /** <code>.google.fhir.stu3.proto.RequestGroup.Reason reason = 21;</code> */
  com.google.fhir.stu3.proto.RequestGroup.ReasonOrBuilder getReasonOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional notes about the response
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 22;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Annotation> getNoteList();
  /**
   *
   *
   * <pre>
   * Additional notes about the response
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 22;</code>
   */
  com.google.fhir.stu3.proto.Annotation getNote(int index);
  /**
   *
   *
   * <pre>
   * Additional notes about the response
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 22;</code>
   */
  int getNoteCount();
  /**
   *
   *
   * <pre>
   * Additional notes about the response
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 22;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.AnnotationOrBuilder> getNoteOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional notes about the response
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 22;</code>
   */
  com.google.fhir.stu3.proto.AnnotationOrBuilder getNoteOrBuilder(int index);

  /**
   * <code>
   * repeated .google.fhir.stu3.proto.RequestGroup.Action action = 23 [(.google.fhir.proto.fhir_path_constraint) = "resource.exists() != action.exists()"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.RequestGroup.Action> getActionList();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.RequestGroup.Action action = 23 [(.google.fhir.proto.fhir_path_constraint) = "resource.exists() != action.exists()"];
   * </code>
   */
  com.google.fhir.stu3.proto.RequestGroup.Action getAction(int index);
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.RequestGroup.Action action = 23 [(.google.fhir.proto.fhir_path_constraint) = "resource.exists() != action.exists()"];
   * </code>
   */
  int getActionCount();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.RequestGroup.Action action = 23 [(.google.fhir.proto.fhir_path_constraint) = "resource.exists() != action.exists()"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.RequestGroup.ActionOrBuilder>
      getActionOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.RequestGroup.Action action = 23 [(.google.fhir.proto.fhir_path_constraint) = "resource.exists() != action.exists()"];
   * </code>
   */
  com.google.fhir.stu3.proto.RequestGroup.ActionOrBuilder getActionOrBuilder(int index);
}
