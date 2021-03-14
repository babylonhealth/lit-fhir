// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface CompartmentDefinitionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.CompartmentDefinition)
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
   * Logical URI to reference this compartment definition (globally unique)
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Uri url = 9 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   *
   *
   * <pre>
   * Logical URI to reference this compartment definition (globally unique)
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Uri url = 9 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The url.
   */
  com.google.fhir.stu3.proto.Uri getUrl();
  /**
   *
   *
   * <pre>
   * Logical URI to reference this compartment definition (globally unique)
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Uri url = 9 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getUrlOrBuilder();

  /**
   *
   *
   * <pre>
   * Name for this compartment definition (computer friendly)
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.String name = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name for this compartment definition (computer friendly)
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.String name = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The name.
   */
  com.google.fhir.stu3.proto.String getName();
  /**
   *
   *
   * <pre>
   * Name for this compartment definition (computer friendly)
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.String name = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getNameOrBuilder();

  /**
   *
   *
   * <pre>
   * Name for this compartment definition (human friendly)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String title = 11;</code>
   *
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   *
   *
   * <pre>
   * Name for this compartment definition (human friendly)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String title = 11;</code>
   *
   * @return The title.
   */
  com.google.fhir.stu3.proto.String getTitle();
  /**
   *
   *
   * <pre>
   * Name for this compartment definition (human friendly)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String title = 11;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getTitleOrBuilder();

  /**
   *
   *
   * <pre>
   * draft | active | retired | unknown
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.PublicationStatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * draft | active | retired | unknown
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.PublicationStatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.PublicationStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * draft | active | retired | unknown
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.PublicationStatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.PublicationStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean experimental = 13;</code>
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
   * <code>.google.fhir.stu3.proto.Boolean experimental = 13;</code>
   *
   * @return The experimental.
   */
  com.google.fhir.stu3.proto.Boolean getExperimental();
  /**
   *
   *
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean experimental = 13;</code>
   */
  com.google.fhir.stu3.proto.BooleanOrBuilder getExperimentalOrBuilder();

  /**
   *
   *
   * <pre>
   * Date this was last changed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 14;</code>
   *
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   *
   *
   * <pre>
   * Date this was last changed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 14;</code>
   *
   * @return The date.
   */
  com.google.fhir.stu3.proto.DateTime getDate();
  /**
   *
   *
   * <pre>
   * Date this was last changed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 14;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String publisher = 15;</code>
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
   * <code>.google.fhir.stu3.proto.String publisher = 15;</code>
   *
   * @return The publisher.
   */
  com.google.fhir.stu3.proto.String getPublisher();
  /**
   *
   *
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String publisher = 15;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getPublisherOrBuilder();

  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 16;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.ContactDetail> getContactList();
  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 16;</code>
   */
  com.google.fhir.stu3.proto.ContactDetail getContact(int index);
  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 16;</code>
   */
  int getContactCount();
  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 16;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ContactDetailOrBuilder>
      getContactOrBuilderList();
  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 16;</code>
   */
  com.google.fhir.stu3.proto.ContactDetailOrBuilder getContactOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Natural language description of the compartment definition
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown description = 17;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * Natural language description of the compartment definition
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown description = 17;</code>
   *
   * @return The description.
   */
  com.google.fhir.stu3.proto.Markdown getDescription();
  /**
   *
   *
   * <pre>
   * Natural language description of the compartment definition
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown description = 17;</code>
   */
  com.google.fhir.stu3.proto.MarkdownOrBuilder getDescriptionOrBuilder();

  /**
   *
   *
   * <pre>
   * Why this compartment definition is defined
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown purpose = 18;</code>
   *
   * @return Whether the purpose field is set.
   */
  boolean hasPurpose();
  /**
   *
   *
   * <pre>
   * Why this compartment definition is defined
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown purpose = 18;</code>
   *
   * @return The purpose.
   */
  com.google.fhir.stu3.proto.Markdown getPurpose();
  /**
   *
   *
   * <pre>
   * Why this compartment definition is defined
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown purpose = 18;</code>
   */
  com.google.fhir.stu3.proto.MarkdownOrBuilder getPurposeOrBuilder();

  /**
   *
   *
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 19;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.UsageContext> getUseContextList();
  /**
   *
   *
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 19;</code>
   */
  com.google.fhir.stu3.proto.UsageContext getUseContext(int index);
  /**
   *
   *
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 19;</code>
   */
  int getUseContextCount();
  /**
   *
   *
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 19;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.UsageContextOrBuilder>
      getUseContextOrBuilderList();
  /**
   *
   *
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 19;</code>
   */
  com.google.fhir.stu3.proto.UsageContextOrBuilder getUseContextOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Intended jurisdiction for compartment definition (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 20;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getJurisdictionList();
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for compartment definition (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 20;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getJurisdiction(int index);
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for compartment definition (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 20;</code>
   */
  int getJurisdictionCount();
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for compartment definition (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 20;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getJurisdictionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for compartment definition (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 20;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getJurisdictionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Patient | Encounter | RelatedPerson | Practitioner | Device
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CompartmentTypeCode code = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   *
   *
   * <pre>
   * Patient | Encounter | RelatedPerson | Practitioner | Device
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CompartmentTypeCode code = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The code.
   */
  com.google.fhir.stu3.proto.CompartmentTypeCode getCode();
  /**
   *
   *
   * <pre>
   * Patient | Encounter | RelatedPerson | Practitioner | Device
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CompartmentTypeCode code = 21 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.CompartmentTypeCodeOrBuilder getCodeOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether the search syntax is supported
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Boolean search = 22 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the search field is set.
   */
  boolean hasSearch();
  /**
   *
   *
   * <pre>
   * Whether the search syntax is supported
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Boolean search = 22 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The search.
   */
  com.google.fhir.stu3.proto.Boolean getSearch();
  /**
   *
   *
   * <pre>
   * Whether the search syntax is supported
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Boolean search = 22 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.BooleanOrBuilder getSearchOrBuilder();

  /** <code>repeated .google.fhir.stu3.proto.CompartmentDefinition.Resource resource = 23;</code> */
  java.util.List<com.google.fhir.stu3.proto.CompartmentDefinition.Resource> getResourceList();
  /** <code>repeated .google.fhir.stu3.proto.CompartmentDefinition.Resource resource = 23;</code> */
  com.google.fhir.stu3.proto.CompartmentDefinition.Resource getResource(int index);
  /** <code>repeated .google.fhir.stu3.proto.CompartmentDefinition.Resource resource = 23;</code> */
  int getResourceCount();
  /** <code>repeated .google.fhir.stu3.proto.CompartmentDefinition.Resource resource = 23;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.CompartmentDefinition.ResourceOrBuilder>
      getResourceOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.CompartmentDefinition.Resource resource = 23;</code> */
  com.google.fhir.stu3.proto.CompartmentDefinition.ResourceOrBuilder getResourceOrBuilder(
      int index);
}
