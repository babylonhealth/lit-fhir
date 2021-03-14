// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/implementation_guide.proto

package com.google.fhir.r4.core;

public interface ImplementationGuideOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.ImplementationGuide)
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
   * Canonical identifier for this implementation guide, represented as a URI
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
   * Canonical identifier for this implementation guide, represented as a URI
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
   * Canonical identifier for this implementation guide, represented as a URI
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
   * Business version of the implementation guide
   * </pre>
   *
   * <code>.google.fhir.r4.core.String version = 11;</code>
   *
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   *
   *
   * <pre>
   * Business version of the implementation guide
   * </pre>
   *
   * <code>.google.fhir.r4.core.String version = 11;</code>
   *
   * @return The version.
   */
  com.google.fhir.r4.core.String getVersion();
  /**
   *
   *
   * <pre>
   * Business version of the implementation guide
   * </pre>
   *
   * <code>.google.fhir.r4.core.String version = 11;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * Name for this implementation guide (computer friendly)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String name = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name for this implementation guide (computer friendly)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String name = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The name.
   */
  com.google.fhir.r4.core.String getName();
  /**
   *
   *
   * <pre>
   * Name for this implementation guide (computer friendly)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.String name = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.StringOrBuilder getNameOrBuilder();

  /**
   *
   *
   * <pre>
   * Name for this implementation guide (human friendly)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String title = 13;</code>
   *
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   *
   *
   * <pre>
   * Name for this implementation guide (human friendly)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String title = 13;</code>
   *
   * @return The title.
   */
  com.google.fhir.r4.core.String getTitle();
  /**
   *
   *
   * <pre>
   * Name for this implementation guide (human friendly)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String title = 13;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getTitleOrBuilder();

  /**
   * <code>
   * .google.fhir.r4.core.ImplementationGuide.StatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>
   * .google.fhir.r4.core.ImplementationGuide.StatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.r4.core.ImplementationGuide.StatusCode getStatus();
  /**
   * <code>
   * .google.fhir.r4.core.ImplementationGuide.StatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.ImplementationGuide.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean experimental = 15;</code>
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
   * <code>.google.fhir.r4.core.Boolean experimental = 15;</code>
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
   * <code>.google.fhir.r4.core.Boolean experimental = 15;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getExperimentalOrBuilder();

  /**
   *
   *
   * <pre>
   * Date last changed
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date = 16;</code>
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
   * <code>.google.fhir.r4.core.DateTime date = 16;</code>
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
   * <code>.google.fhir.r4.core.DateTime date = 16;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String publisher = 17;</code>
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
   * <code>.google.fhir.r4.core.String publisher = 17;</code>
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
   * <code>.google.fhir.r4.core.String publisher = 17;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getPublisherOrBuilder();

  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 18;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactDetail> getContactList();
  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 18;</code>
   */
  com.google.fhir.r4.core.ContactDetail getContact(int index);
  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 18;</code>
   */
  int getContactCount();
  /**
   *
   *
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 18;</code>
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
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 18;</code>
   */
  com.google.fhir.r4.core.ContactDetailOrBuilder getContactOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Natural language description of the implementation guide
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown description = 19;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * Natural language description of the implementation guide
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown description = 19;</code>
   *
   * @return The description.
   */
  com.google.fhir.r4.core.Markdown getDescription();
  /**
   *
   *
   * <pre>
   * Natural language description of the implementation guide
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown description = 19;</code>
   */
  com.google.fhir.r4.core.MarkdownOrBuilder getDescriptionOrBuilder();

  /**
   *
   *
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 20;</code>
   */
  java.util.List<com.google.fhir.r4.core.UsageContext> getUseContextList();
  /**
   *
   *
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 20;</code>
   */
  com.google.fhir.r4.core.UsageContext getUseContext(int index);
  /**
   *
   *
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 20;</code>
   */
  int getUseContextCount();
  /**
   *
   *
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 20;</code>
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
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 20;</code>
   */
  com.google.fhir.r4.core.UsageContextOrBuilder getUseContextOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Intended jurisdiction for implementation guide (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 21;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getJurisdictionList();
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for implementation guide (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 21;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getJurisdiction(int index);
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for implementation guide (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 21;</code>
   */
  int getJurisdictionCount();
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for implementation guide (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 21;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getJurisdictionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Intended jurisdiction for implementation guide (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 21;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getJurisdictionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Use and/or publishing restrictions
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown copyright = 22;</code>
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
   * <code>.google.fhir.r4.core.Markdown copyright = 22;</code>
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
   * <code>.google.fhir.r4.core.Markdown copyright = 22;</code>
   */
  com.google.fhir.r4.core.MarkdownOrBuilder getCopyrightOrBuilder();

  /**
   *
   *
   * <pre>
   * NPM Package name for IG
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Id package_id = 23 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the packageId field is set.
   */
  boolean hasPackageId();
  /**
   *
   *
   * <pre>
   * NPM Package name for IG
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Id package_id = 23 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The packageId.
   */
  com.google.fhir.r4.core.Id getPackageId();
  /**
   *
   *
   * <pre>
   * NPM Package name for IG
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Id package_id = 23 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.IdOrBuilder getPackageIdOrBuilder();

  /**
   * <code>.google.fhir.r4.core.ImplementationGuide.LicenseCode license = 24;</code>
   *
   * @return Whether the license field is set.
   */
  boolean hasLicense();
  /**
   * <code>.google.fhir.r4.core.ImplementationGuide.LicenseCode license = 24;</code>
   *
   * @return The license.
   */
  com.google.fhir.r4.core.ImplementationGuide.LicenseCode getLicense();
  /** <code>.google.fhir.r4.core.ImplementationGuide.LicenseCode license = 24;</code> */
  com.google.fhir.r4.core.ImplementationGuide.LicenseCodeOrBuilder getLicenseOrBuilder();

  /**
   * <code>
   * repeated .google.fhir.r4.core.ImplementationGuide.FhirVersionCode fhir_version = 25 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.ImplementationGuide.FhirVersionCode> getFhirVersionList();
  /**
   * <code>
   * repeated .google.fhir.r4.core.ImplementationGuide.FhirVersionCode fhir_version = 25 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.ImplementationGuide.FhirVersionCode getFhirVersion(int index);
  /**
   * <code>
   * repeated .google.fhir.r4.core.ImplementationGuide.FhirVersionCode fhir_version = 25 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  int getFhirVersionCount();
  /**
   * <code>
   * repeated .google.fhir.r4.core.ImplementationGuide.FhirVersionCode fhir_version = 25 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ImplementationGuide.FhirVersionCodeOrBuilder>
      getFhirVersionOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.r4.core.ImplementationGuide.FhirVersionCode fhir_version = 25 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.ImplementationGuide.FhirVersionCodeOrBuilder getFhirVersionOrBuilder(
      int index);

  /** <code>repeated .google.fhir.r4.core.ImplementationGuide.DependsOn depends_on = 26;</code> */
  java.util.List<com.google.fhir.r4.core.ImplementationGuide.DependsOn> getDependsOnList();
  /** <code>repeated .google.fhir.r4.core.ImplementationGuide.DependsOn depends_on = 26;</code> */
  com.google.fhir.r4.core.ImplementationGuide.DependsOn getDependsOn(int index);
  /** <code>repeated .google.fhir.r4.core.ImplementationGuide.DependsOn depends_on = 26;</code> */
  int getDependsOnCount();
  /** <code>repeated .google.fhir.r4.core.ImplementationGuide.DependsOn depends_on = 26;</code> */
  java.util.List<? extends com.google.fhir.r4.core.ImplementationGuide.DependsOnOrBuilder>
      getDependsOnOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.ImplementationGuide.DependsOn depends_on = 26;</code> */
  com.google.fhir.r4.core.ImplementationGuide.DependsOnOrBuilder getDependsOnOrBuilder(int index);

  /** <code>repeated .google.fhir.r4.core.ImplementationGuide.Global global = 27;</code> */
  java.util.List<com.google.fhir.r4.core.ImplementationGuide.Global> getGlobalList();
  /** <code>repeated .google.fhir.r4.core.ImplementationGuide.Global global = 27;</code> */
  com.google.fhir.r4.core.ImplementationGuide.Global getGlobal(int index);
  /** <code>repeated .google.fhir.r4.core.ImplementationGuide.Global global = 27;</code> */
  int getGlobalCount();
  /** <code>repeated .google.fhir.r4.core.ImplementationGuide.Global global = 27;</code> */
  java.util.List<? extends com.google.fhir.r4.core.ImplementationGuide.GlobalOrBuilder>
      getGlobalOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.ImplementationGuide.Global global = 27;</code> */
  com.google.fhir.r4.core.ImplementationGuide.GlobalOrBuilder getGlobalOrBuilder(int index);

  /**
   * <code>.google.fhir.r4.core.ImplementationGuide.Definition definition = 28;</code>
   *
   * @return Whether the definition field is set.
   */
  boolean hasDefinition();
  /**
   * <code>.google.fhir.r4.core.ImplementationGuide.Definition definition = 28;</code>
   *
   * @return The definition.
   */
  com.google.fhir.r4.core.ImplementationGuide.Definition getDefinition();
  /** <code>.google.fhir.r4.core.ImplementationGuide.Definition definition = 28;</code> */
  com.google.fhir.r4.core.ImplementationGuide.DefinitionOrBuilder getDefinitionOrBuilder();

  /**
   * <code>.google.fhir.r4.core.ImplementationGuide.Manifest manifest = 29;</code>
   *
   * @return Whether the manifest field is set.
   */
  boolean hasManifest();
  /**
   * <code>.google.fhir.r4.core.ImplementationGuide.Manifest manifest = 29;</code>
   *
   * @return The manifest.
   */
  com.google.fhir.r4.core.ImplementationGuide.Manifest getManifest();
  /** <code>.google.fhir.r4.core.ImplementationGuide.Manifest manifest = 29;</code> */
  com.google.fhir.r4.core.ImplementationGuide.ManifestOrBuilder getManifestOrBuilder();
}