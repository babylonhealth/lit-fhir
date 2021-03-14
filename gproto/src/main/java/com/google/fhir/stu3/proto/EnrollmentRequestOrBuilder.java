// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface EnrollmentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.EnrollmentRequest)
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
   * Business Identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Business Identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Business Identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Business Identifier
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
   * Business Identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * active | cancelled | draft | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.FinancialResourceStatusCode status = 10;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * active | cancelled | draft | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.FinancialResourceStatusCode status = 10;</code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.FinancialResourceStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * active | cancelled | draft | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.FinancialResourceStatusCode status = 10;</code>
   */
  com.google.fhir.stu3.proto.FinancialResourceStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Creation date
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime created = 11;</code>
   *
   * @return Whether the created field is set.
   */
  boolean hasCreated();
  /**
   *
   *
   * <pre>
   * Creation date
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime created = 11;</code>
   *
   * @return The created.
   */
  com.google.fhir.stu3.proto.DateTime getCreated();
  /**
   *
   *
   * <pre>
   * Creation date
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime created = 11;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getCreatedOrBuilder();

  /**
   *
   *
   * <pre>
   * Target
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference insurer = 12 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the insurer field is set.
   */
  boolean hasInsurer();
  /**
   *
   *
   * <pre>
   * Target
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference insurer = 12 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The insurer.
   */
  com.google.fhir.stu3.proto.Reference getInsurer();
  /**
   *
   *
   * <pre>
   * Target
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference insurer = 12 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getInsurerOrBuilder();

  /**
   *
   *
   * <pre>
   * Responsible practitioner
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference provider = 13 [(.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   *
   * @return Whether the provider field is set.
   */
  boolean hasProvider();
  /**
   *
   *
   * <pre>
   * Responsible practitioner
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference provider = 13 [(.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   *
   * @return The provider.
   */
  com.google.fhir.stu3.proto.Reference getProvider();
  /**
   *
   *
   * <pre>
   * Responsible practitioner
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference provider = 13 [(.google.fhir.proto.valid_reference_type) = "Practitioner"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getProviderOrBuilder();

  /**
   *
   *
   * <pre>
   * Responsible organization
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference organization = 14 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the organization field is set.
   */
  boolean hasOrganization();
  /**
   *
   *
   * <pre>
   * Responsible organization
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference organization = 14 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The organization.
   */
  com.google.fhir.stu3.proto.Reference getOrganization();
  /**
   *
   *
   * <pre>
   * Responsible organization
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference organization = 14 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getOrganizationOrBuilder();

  /**
   *
   *
   * <pre>
   * The subject of the Products and Services
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 15 [(.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * The subject of the Products and Services
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 15 [(.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   *
   *
   * <pre>
   * The subject of the Products and Services
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 15 [(.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Insurance information
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference coverage = 16 [(.google.fhir.proto.valid_reference_type) = "Coverage"];
   * </code>
   *
   * @return Whether the coverage field is set.
   */
  boolean hasCoverage();
  /**
   *
   *
   * <pre>
   * Insurance information
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference coverage = 16 [(.google.fhir.proto.valid_reference_type) = "Coverage"];
   * </code>
   *
   * @return The coverage.
   */
  com.google.fhir.stu3.proto.Reference getCoverage();
  /**
   *
   *
   * <pre>
   * Insurance information
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference coverage = 16 [(.google.fhir.proto.valid_reference_type) = "Coverage"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getCoverageOrBuilder();
}