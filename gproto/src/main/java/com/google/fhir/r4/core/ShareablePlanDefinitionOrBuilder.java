// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/profiles/shareable_plan_definition.proto

package com.google.fhir.r4.core;

public interface ShareablePlanDefinitionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.ShareablePlanDefinition)
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
   * Canonical identifier for this plan definition, represented as a URI
   * (globally unique)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Uri url = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   *
   *
   * <pre>
   * Canonical identifier for this plan definition, represented as a URI
   * (globally unique)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Uri url = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The url.
   */
  com.google.fhir.r4.core.Uri getUrl();
  /**
   *
   *
   * <pre>
   * Canonical identifier for this plan definition, represented as a URI
   * (globally unique)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Uri url = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.UriOrBuilder getUrlOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional identifier for the plan definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 11;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Additional identifier for the plan definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 11;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Additional identifier for the plan definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 11;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Additional identifier for the plan definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 11;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder>
      getIdentifierOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional identifier for the plan definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 11;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Business version of the plan definition
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String version = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   *
   *
   * <pre>
   * Business version of the plan definition
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String version = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The version.
   */
  com.google.fhir.r4.core.String getVersion();
  /**
   *
   *
   * <pre>
   * Business version of the plan definition
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String version = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.StringOrBuilder getVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * Name for this plan definition (computer friendly)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String name = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name for this plan definition (computer friendly)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String name = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The name.
   */
  com.google.fhir.r4.core.String getName();
  /**
   *
   *
   * <pre>
   * Name for this plan definition (computer friendly)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String name = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.StringOrBuilder getNameOrBuilder();

  /**
   *
   *
   * <pre>
   * Name for this plan definition (human friendly)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String title = 14;</code>
   *
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   *
   *
   * <pre>
   * Name for this plan definition (human friendly)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String title = 14;</code>
   *
   * @return The title.
   */
  com.google.fhir.r4.core.String getTitle();
  /**
   *
   *
   * <pre>
   * Name for this plan definition (human friendly)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String title = 14;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getTitleOrBuilder();

  /**
   *
   *
   * <pre>
   * Subordinate title of the plan definition
   * </pre>
   *
   * <code>.google.fhir.r4.core.String subtitle = 15;</code>
   *
   * @return Whether the subtitle field is set.
   */
  boolean hasSubtitle();
  /**
   *
   *
   * <pre>
   * Subordinate title of the plan definition
   * </pre>
   *
   * <code>.google.fhir.r4.core.String subtitle = 15;</code>
   *
   * @return The subtitle.
   */
  com.google.fhir.r4.core.String getSubtitle();
  /**
   *
   *
   * <pre>
   * Subordinate title of the plan definition
   * </pre>
   *
   * <code>.google.fhir.r4.core.String subtitle = 15;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getSubtitleOrBuilder();

  /**
   *
   *
   * <pre>
   * order-set | clinical-protocol | eca-rule | workflow-definition
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 16;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * order-set | clinical-protocol | eca-rule | workflow-definition
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 16;</code>
   *
   * @return The type.
   */
  com.google.fhir.r4.core.CodeableConcept getType();
  /**
   *
   *
   * <pre>
   * order-set | clinical-protocol | eca-rule | workflow-definition
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 16;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   * <code>
   * .google.fhir.r4.core.ShareablePlanDefinition.StatusCode status = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>
   * .google.fhir.r4.core.ShareablePlanDefinition.StatusCode status = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.r4.core.ShareablePlanDefinition.StatusCode getStatus();
  /**
   * <code>
   * .google.fhir.r4.core.ShareablePlanDefinition.StatusCode status = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.ShareablePlanDefinition.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Boolean experimental = 18 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the experimental field is set.
   */
  boolean hasExperimental();
  /**
   *
   *
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Boolean experimental = 18 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The experimental.
   */
  com.google.fhir.r4.core.Boolean getExperimental();
  /**
   *
   *
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Boolean experimental = 18 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getExperimentalOrBuilder();

  /**
   * <code>.google.fhir.r4.core.ShareablePlanDefinition.SubjectX subject = 19;</code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   * <code>.google.fhir.r4.core.ShareablePlanDefinition.SubjectX subject = 19;</code>
   *
   * @return The subject.
   */
  com.google.fhir.r4.core.ShareablePlanDefinition.SubjectX getSubject();
  /** <code>.google.fhir.r4.core.ShareablePlanDefinition.SubjectX subject = 19;</code> */
  com.google.fhir.r4.core.ShareablePlanDefinition.SubjectXOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Date last changed
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date = 20;</code>
   *
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   *
   *
   * <pre>
   * Date last changed
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date = 20;</code>
   *
   * @return The date.
   */
  com.google.fhir.r4.core.DateTime getDate();
  /**
   *
   *
   * <pre>
   * Date last changed
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date = 20;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String publisher = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the publisher field is set.
   */
  boolean hasPublisher();
  /**
   *
   *
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String publisher = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The publisher.
   */
  com.google.fhir.r4.core.String getPublisher();
  /**
   *
   *
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String publisher = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.StringOrBuilder getPublisherOrBuilder();

  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 22;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactDetail> getContactList();
  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 22;</code>
   */
  com.google.fhir.r4.core.ContactDetail getContact(int index);
  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 22;</code>
   */
  int getContactCount();
  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 22;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ContactDetailOrBuilder>
      getContactOrBuilderList();
  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 22;</code>
   */
  com.google.fhir.r4.core.ContactDetailOrBuilder getContactOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Natural language description of the plan definition
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Markdown description = 23 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * Natural language description of the plan definition
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Markdown description = 23 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The description.
   */
  com.google.fhir.r4.core.Markdown getDescription();
  /**
   *
   *
   * <pre>
   * Natural language description of the plan definition
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Markdown description = 23 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.MarkdownOrBuilder getDescriptionOrBuilder();

  /**
   *
   *
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 24;</code>
   */
  java.util.List<com.google.fhir.r4.core.UsageContext> getUseContextList();
  /**
   *
   *
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 24;</code>
   */
  com.google.fhir.r4.core.UsageContext getUseContext(int index);
  /**
   *
   *
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 24;</code>
   */
  int getUseContextCount();
  /**
   *
   *
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 24;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.UsageContextOrBuilder>
      getUseContextOrBuilderList();
  /**
   *
   *
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 24;</code>
   */
  com.google.fhir.r4.core.UsageContextOrBuilder getUseContextOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Intended jurisdiction for plan definition (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 25;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getJurisdictionList();
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for plan definition (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 25;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getJurisdiction(int index);
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for plan definition (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 25;</code>
   */
  int getJurisdictionCount();
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for plan definition (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 25;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getJurisdictionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for plan definition (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 25;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getJurisdictionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Why this plan definition is defined
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown purpose = 26;</code>
   *
   * @return Whether the purpose field is set.
   */
  boolean hasPurpose();
  /**
   *
   *
   * <pre>
   * Why this plan definition is defined
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown purpose = 26;</code>
   *
   * @return The purpose.
   */
  com.google.fhir.r4.core.Markdown getPurpose();
  /**
   *
   *
   * <pre>
   * Why this plan definition is defined
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown purpose = 26;</code>
   */
  com.google.fhir.r4.core.MarkdownOrBuilder getPurposeOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes the clinical usage of the plan
   * </pre>
   *
   * <code>.google.fhir.r4.core.String usage = 27;</code>
   *
   * @return Whether the usage field is set.
   */
  boolean hasUsage();
  /**
   *
   *
   * <pre>
   * Describes the clinical usage of the plan
   * </pre>
   *
   * <code>.google.fhir.r4.core.String usage = 27;</code>
   *
   * @return The usage.
   */
  com.google.fhir.r4.core.String getUsage();
  /**
   *
   *
   * <pre>
   * Describes the clinical usage of the plan
   * </pre>
   *
   * <code>.google.fhir.r4.core.String usage = 27;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getUsageOrBuilder();

  /**
   *
   *
   * <pre>
   * Use and/or publishing restrictions
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown copyright = 28;</code>
   *
   * @return Whether the copyright field is set.
   */
  boolean hasCopyright();
  /**
   *
   *
   * <pre>
   * Use and/or publishing restrictions
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown copyright = 28;</code>
   *
   * @return The copyright.
   */
  com.google.fhir.r4.core.Markdown getCopyright();
  /**
   *
   *
   * <pre>
   * Use and/or publishing restrictions
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown copyright = 28;</code>
   */
  com.google.fhir.r4.core.MarkdownOrBuilder getCopyrightOrBuilder();

  /**
   *
   *
   * <pre>
   * When the plan definition was approved by publisher
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date approval_date = 29;</code>
   *
   * @return Whether the approvalDate field is set.
   */
  boolean hasApprovalDate();
  /**
   *
   *
   * <pre>
   * When the plan definition was approved by publisher
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date approval_date = 29;</code>
   *
   * @return The approvalDate.
   */
  com.google.fhir.r4.core.Date getApprovalDate();
  /**
   *
   *
   * <pre>
   * When the plan definition was approved by publisher
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date approval_date = 29;</code>
   */
  com.google.fhir.r4.core.DateOrBuilder getApprovalDateOrBuilder();

  /**
   *
   *
   * <pre>
   * When the plan definition was last reviewed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date last_review_date = 30;</code>
   *
   * @return Whether the lastReviewDate field is set.
   */
  boolean hasLastReviewDate();
  /**
   *
   *
   * <pre>
   * When the plan definition was last reviewed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date last_review_date = 30;</code>
   *
   * @return The lastReviewDate.
   */
  com.google.fhir.r4.core.Date getLastReviewDate();
  /**
   *
   *
   * <pre>
   * When the plan definition was last reviewed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date last_review_date = 30;</code>
   */
  com.google.fhir.r4.core.DateOrBuilder getLastReviewDateOrBuilder();

  /**
   *
   *
   * <pre>
   * When the plan definition is expected to be used
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period effective_period = 31;</code>
   *
   * @return Whether the effectivePeriod field is set.
   */
  boolean hasEffectivePeriod();
  /**
   *
   *
   * <pre>
   * When the plan definition is expected to be used
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period effective_period = 31;</code>
   *
   * @return The effectivePeriod.
   */
  com.google.fhir.r4.core.Period getEffectivePeriod();
  /**
   *
   *
   * <pre>
   * When the plan definition is expected to be used
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period effective_period = 31;</code>
   */
  com.google.fhir.r4.core.PeriodOrBuilder getEffectivePeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * E.g. Education, Treatment, Assessment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept topic = 32;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getTopicList();
  /**
   *
   *
   * <pre>
   * E.g. Education, Treatment, Assessment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept topic = 32;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getTopic(int index);
  /**
   *
   *
   * <pre>
   * E.g. Education, Treatment, Assessment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept topic = 32;</code>
   */
  int getTopicCount();
  /**
   *
   *
   * <pre>
   * E.g. Education, Treatment, Assessment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept topic = 32;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getTopicOrBuilderList();
  /**
   *
   *
   * <pre>
   * E.g. Education, Treatment, Assessment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept topic = 32;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getTopicOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Who authored the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail author = 33;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactDetail> getAuthorList();
  /**
   *
   *
   * <pre>
   * Who authored the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail author = 33;</code>
   */
  com.google.fhir.r4.core.ContactDetail getAuthor(int index);
  /**
   *
   *
   * <pre>
   * Who authored the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail author = 33;</code>
   */
  int getAuthorCount();
  /**
   *
   *
   * <pre>
   * Who authored the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail author = 33;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ContactDetailOrBuilder> getAuthorOrBuilderList();
  /**
   *
   *
   * <pre>
   * Who authored the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail author = 33;</code>
   */
  com.google.fhir.r4.core.ContactDetailOrBuilder getAuthorOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Who edited the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail editor = 34;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactDetail> getEditorList();
  /**
   *
   *
   * <pre>
   * Who edited the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail editor = 34;</code>
   */
  com.google.fhir.r4.core.ContactDetail getEditor(int index);
  /**
   *
   *
   * <pre>
   * Who edited the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail editor = 34;</code>
   */
  int getEditorCount();
  /**
   *
   *
   * <pre>
   * Who edited the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail editor = 34;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ContactDetailOrBuilder> getEditorOrBuilderList();
  /**
   *
   *
   * <pre>
   * Who edited the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail editor = 34;</code>
   */
  com.google.fhir.r4.core.ContactDetailOrBuilder getEditorOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Who reviewed the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail reviewer = 35;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactDetail> getReviewerList();
  /**
   *
   *
   * <pre>
   * Who reviewed the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail reviewer = 35;</code>
   */
  com.google.fhir.r4.core.ContactDetail getReviewer(int index);
  /**
   *
   *
   * <pre>
   * Who reviewed the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail reviewer = 35;</code>
   */
  int getReviewerCount();
  /**
   *
   *
   * <pre>
   * Who reviewed the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail reviewer = 35;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ContactDetailOrBuilder>
      getReviewerOrBuilderList();
  /**
   *
   *
   * <pre>
   * Who reviewed the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail reviewer = 35;</code>
   */
  com.google.fhir.r4.core.ContactDetailOrBuilder getReviewerOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Who endorsed the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail endorser = 36;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactDetail> getEndorserList();
  /**
   *
   *
   * <pre>
   * Who endorsed the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail endorser = 36;</code>
   */
  com.google.fhir.r4.core.ContactDetail getEndorser(int index);
  /**
   *
   *
   * <pre>
   * Who endorsed the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail endorser = 36;</code>
   */
  int getEndorserCount();
  /**
   *
   *
   * <pre>
   * Who endorsed the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail endorser = 36;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ContactDetailOrBuilder>
      getEndorserOrBuilderList();
  /**
   *
   *
   * <pre>
   * Who endorsed the content
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail endorser = 36;</code>
   */
  com.google.fhir.r4.core.ContactDetailOrBuilder getEndorserOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Additional documentation, citations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.RelatedArtifact related_artifact = 37;</code>
   */
  java.util.List<com.google.fhir.r4.core.RelatedArtifact> getRelatedArtifactList();
  /**
   *
   *
   * <pre>
   * Additional documentation, citations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.RelatedArtifact related_artifact = 37;</code>
   */
  com.google.fhir.r4.core.RelatedArtifact getRelatedArtifact(int index);
  /**
   *
   *
   * <pre>
   * Additional documentation, citations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.RelatedArtifact related_artifact = 37;</code>
   */
  int getRelatedArtifactCount();
  /**
   *
   *
   * <pre>
   * Additional documentation, citations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.RelatedArtifact related_artifact = 37;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.RelatedArtifactOrBuilder>
      getRelatedArtifactOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional documentation, citations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.RelatedArtifact related_artifact = 37;</code>
   */
  com.google.fhir.r4.core.RelatedArtifactOrBuilder getRelatedArtifactOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Logic used by the plan definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical library = 38;</code>
   */
  java.util.List<com.google.fhir.r4.core.Canonical> getLibraryList();
  /**
   *
   *
   * <pre>
   * Logic used by the plan definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical library = 38;</code>
   */
  com.google.fhir.r4.core.Canonical getLibrary(int index);
  /**
   *
   *
   * <pre>
   * Logic used by the plan definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical library = 38;</code>
   */
  int getLibraryCount();
  /**
   *
   *
   * <pre>
   * Logic used by the plan definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical library = 38;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CanonicalOrBuilder> getLibraryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Logic used by the plan definition
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical library = 38;</code>
   */
  com.google.fhir.r4.core.CanonicalOrBuilder getLibraryOrBuilder(int index);

  /** <code>repeated .google.fhir.r4.core.ShareablePlanDefinition.Goal goal = 39;</code> */
  java.util.List<com.google.fhir.r4.core.ShareablePlanDefinition.Goal> getGoalList();
  /** <code>repeated .google.fhir.r4.core.ShareablePlanDefinition.Goal goal = 39;</code> */
  com.google.fhir.r4.core.ShareablePlanDefinition.Goal getGoal(int index);
  /** <code>repeated .google.fhir.r4.core.ShareablePlanDefinition.Goal goal = 39;</code> */
  int getGoalCount();
  /** <code>repeated .google.fhir.r4.core.ShareablePlanDefinition.Goal goal = 39;</code> */
  java.util.List<? extends com.google.fhir.r4.core.ShareablePlanDefinition.GoalOrBuilder>
      getGoalOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.ShareablePlanDefinition.Goal goal = 39;</code> */
  com.google.fhir.r4.core.ShareablePlanDefinition.GoalOrBuilder getGoalOrBuilder(int index);

  /** <code>repeated .google.fhir.r4.core.ShareablePlanDefinition.Action action = 40;</code> */
  java.util.List<com.google.fhir.r4.core.ShareablePlanDefinition.Action> getActionList();
  /** <code>repeated .google.fhir.r4.core.ShareablePlanDefinition.Action action = 40;</code> */
  com.google.fhir.r4.core.ShareablePlanDefinition.Action getAction(int index);
  /** <code>repeated .google.fhir.r4.core.ShareablePlanDefinition.Action action = 40;</code> */
  int getActionCount();
  /** <code>repeated .google.fhir.r4.core.ShareablePlanDefinition.Action action = 40;</code> */
  java.util.List<? extends com.google.fhir.r4.core.ShareablePlanDefinition.ActionOrBuilder>
      getActionOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.ShareablePlanDefinition.Action action = 40;</code> */
  com.google.fhir.r4.core.ShareablePlanDefinition.ActionOrBuilder getActionOrBuilder(int index);
}
