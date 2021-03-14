// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/naming_system.proto

package com.google.fhir.r4.core;

public interface NamingSystemOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.NamingSystem)
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
   * Name for this naming system (computer friendly)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String name = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name for this naming system (computer friendly)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String name = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The name.
   */
  com.google.fhir.r4.core.String getName();
  /**
   *
   *
   * <pre>
   * Name for this naming system (computer friendly)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String name = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.StringOrBuilder getNameOrBuilder();

  /**
   * <code>
   * .google.fhir.r4.core.NamingSystem.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>
   * .google.fhir.r4.core.NamingSystem.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.r4.core.NamingSystem.StatusCode getStatus();
  /**
   * <code>
   * .google.fhir.r4.core.NamingSystem.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.NamingSystem.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <code>
   * .google.fhir.r4.core.NamingSystem.KindCode kind = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <code>
   * .google.fhir.r4.core.NamingSystem.KindCode kind = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The kind.
   */
  com.google.fhir.r4.core.NamingSystem.KindCode getKind();
  /**
   * <code>
   * .google.fhir.r4.core.NamingSystem.KindCode kind = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.NamingSystem.KindCodeOrBuilder getKindOrBuilder();

  /**
   *
   *
   * <pre>
   * Date last changed
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.DateTime date = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
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
   * <code>
   * .google.fhir.r4.core.DateTime date = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
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
   * <code>
   * .google.fhir.r4.core.DateTime date = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String publisher = 14;</code>
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
   * <code>.google.fhir.r4.core.String publisher = 14;</code>
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
   * <code>.google.fhir.r4.core.String publisher = 14;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getPublisherOrBuilder();

  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 15;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactDetail> getContactList();
  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 15;</code>
   */
  com.google.fhir.r4.core.ContactDetail getContact(int index);
  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 15;</code>
   */
  int getContactCount();
  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 15;</code>
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
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 15;</code>
   */
  com.google.fhir.r4.core.ContactDetailOrBuilder getContactOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Who maintains system namespace?
   * </pre>
   *
   * <code>.google.fhir.r4.core.String responsible = 16;</code>
   *
   * @return Whether the responsible field is set.
   */
  boolean hasResponsible();
  /**
   *
   *
   * <pre>
   * Who maintains system namespace?
   * </pre>
   *
   * <code>.google.fhir.r4.core.String responsible = 16;</code>
   *
   * @return The responsible.
   */
  com.google.fhir.r4.core.String getResponsible();
  /**
   *
   *
   * <pre>
   * Who maintains system namespace?
   * </pre>
   *
   * <code>.google.fhir.r4.core.String responsible = 16;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getResponsibleOrBuilder();

  /**
   *
   *
   * <pre>
   * e.g. driver,  provider,  patient, bank etc.
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 17;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * e.g. driver,  provider,  patient, bank etc.
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 17;</code>
   *
   * @return The type.
   */
  com.google.fhir.r4.core.CodeableConcept getType();
  /**
   *
   *
   * <pre>
   * e.g. driver,  provider,  patient, bank etc.
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 17;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Natural language description of the naming system
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown description = 18;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * Natural language description of the naming system
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown description = 18;</code>
   *
   * @return The description.
   */
  com.google.fhir.r4.core.Markdown getDescription();
  /**
   *
   *
   * <pre>
   * Natural language description of the naming system
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown description = 18;</code>
   */
  com.google.fhir.r4.core.MarkdownOrBuilder getDescriptionOrBuilder();

  /**
   *
   *
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 19;</code>
   */
  java.util.List<com.google.fhir.r4.core.UsageContext> getUseContextList();
  /**
   *
   *
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 19;</code>
   */
  com.google.fhir.r4.core.UsageContext getUseContext(int index);
  /**
   *
   *
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 19;</code>
   */
  int getUseContextCount();
  /**
   *
   *
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 19;</code>
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
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 19;</code>
   */
  com.google.fhir.r4.core.UsageContextOrBuilder getUseContextOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Intended jurisdiction for naming system (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 20;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getJurisdictionList();
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for naming system (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 20;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getJurisdiction(int index);
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for naming system (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 20;</code>
   */
  int getJurisdictionCount();
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for naming system (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 20;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getJurisdictionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for naming system (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 20;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getJurisdictionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * How/where is it used
   * </pre>
   *
   * <code>.google.fhir.r4.core.String usage = 21;</code>
   *
   * @return Whether the usage field is set.
   */
  boolean hasUsage();
  /**
   *
   *
   * <pre>
   * How/where is it used
   * </pre>
   *
   * <code>.google.fhir.r4.core.String usage = 21;</code>
   *
   * @return The usage.
   */
  com.google.fhir.r4.core.String getUsage();
  /**
   *
   *
   * <pre>
   * How/where is it used
   * </pre>
   *
   * <code>.google.fhir.r4.core.String usage = 21;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getUsageOrBuilder();

  /**
   * <code>
   * repeated .google.fhir.r4.core.NamingSystem.UniqueId unique_id = 22 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.NamingSystem.UniqueId> getUniqueIdList();
  /**
   * <code>
   * repeated .google.fhir.r4.core.NamingSystem.UniqueId unique_id = 22 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.NamingSystem.UniqueId getUniqueId(int index);
  /**
   * <code>
   * repeated .google.fhir.r4.core.NamingSystem.UniqueId unique_id = 22 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  int getUniqueIdCount();
  /**
   * <code>
   * repeated .google.fhir.r4.core.NamingSystem.UniqueId unique_id = 22 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.NamingSystem.UniqueIdOrBuilder>
      getUniqueIdOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.r4.core.NamingSystem.UniqueId unique_id = 22 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.NamingSystem.UniqueIdOrBuilder getUniqueIdOrBuilder(int index);
}
