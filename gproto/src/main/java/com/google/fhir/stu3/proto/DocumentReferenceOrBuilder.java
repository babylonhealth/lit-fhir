// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface DocumentReferenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.DocumentReference)
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
   * Master Version Specific Identifier
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier master_identifier = 9;</code>
   *
   * @return Whether the masterIdentifier field is set.
   */
  boolean hasMasterIdentifier();
  /**
   *
   *
   * <pre>
   * Master Version Specific Identifier
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier master_identifier = 9;</code>
   *
   * @return The masterIdentifier.
   */
  com.google.fhir.stu3.proto.Identifier getMasterIdentifier();
  /**
   *
   *
   * <pre>
   * Master Version Specific Identifier
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier master_identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getMasterIdentifierOrBuilder();

  /**
   *
   *
   * <pre>
   * Other identifiers for the document
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Other identifiers for the document
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 10;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Other identifiers for the document
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Other identifiers for the document
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.IdentifierOrBuilder>
      getIdentifierOrBuilderList();
  /**
   *
   *
   * <pre>
   * Other identifiers for the document
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 10;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * current | superseded | entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.DocumentReferenceStatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * current | superseded | entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.DocumentReferenceStatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.DocumentReferenceStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * current | superseded | entered-in-error
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.DocumentReferenceStatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.DocumentReferenceStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * preliminary | final | appended | amended | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CompositionStatusCode doc_status = 12;</code>
   *
   * @return Whether the docStatus field is set.
   */
  boolean hasDocStatus();
  /**
   *
   *
   * <pre>
   * preliminary | final | appended | amended | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CompositionStatusCode doc_status = 12;</code>
   *
   * @return The docStatus.
   */
  com.google.fhir.stu3.proto.CompositionStatusCode getDocStatus();
  /**
   *
   *
   * <pre>
   * preliminary | final | appended | amended | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CompositionStatusCode doc_status = 12;</code>
   */
  com.google.fhir.stu3.proto.CompositionStatusCodeOrBuilder getDocStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Kind of document (LOINC if possible)
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CodeableConcept type = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * Kind of document (LOINC if possible)
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CodeableConcept type = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The type.
   */
  com.google.fhir.stu3.proto.CodeableConcept getType();
  /**
   *
   *
   * <pre>
   * Kind of document (LOINC if possible)
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.CodeableConcept type = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Categorization of document
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept class_value = 14[json_name = "class"];</code>
   *
   * @return Whether the classValue field is set.
   */
  boolean hasClassValue();
  /**
   *
   *
   * <pre>
   * Categorization of document
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept class_value = 14[json_name = "class"];</code>
   *
   * @return The classValue.
   */
  com.google.fhir.stu3.proto.CodeableConcept getClassValue();
  /**
   *
   *
   * <pre>
   * Categorization of document
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept class_value = 14[json_name = "class"];</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getClassValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Who/what is the subject of the document
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 15 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device"];
   * </code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * Who/what is the subject of the document
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 15 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Who/what is the subject of the document
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference subject = 15 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * Document creation time
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime created = 16;</code>
   *
   * @return Whether the created field is set.
   */
  boolean hasCreated();
  /**
   *
   *
   * <pre>
   * Document creation time
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime created = 16;</code>
   *
   * @return The created.
   */
  com.google.fhir.stu3.proto.DateTime getCreated();
  /**
   *
   *
   * <pre>
   * Document creation time
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime created = 16;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getCreatedOrBuilder();

  /**
   *
   *
   * <pre>
   * When this document reference was created
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Instant indexed = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the indexed field is set.
   */
  boolean hasIndexed();
  /**
   *
   *
   * <pre>
   * When this document reference was created
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Instant indexed = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The indexed.
   */
  com.google.fhir.stu3.proto.Instant getIndexed();
  /**
   *
   *
   * <pre>
   * When this document reference was created
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Instant indexed = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.InstantOrBuilder getIndexedOrBuilder();

  /**
   *
   *
   * <pre>
   * Who and/or what authored the document
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference author = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> getAuthorList();
  /**
   *
   *
   * <pre>
   * Who and/or what authored the document
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference author = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  com.google.fhir.stu3.proto.Reference getAuthor(int index);
  /**
   *
   *
   * <pre>
   * Who and/or what authored the document
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference author = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  int getAuthorCount();
  /**
   *
   *
   * <pre>
   * Who and/or what authored the document
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference author = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> getAuthorOrBuilderList();
  /**
   *
   *
   * <pre>
   * Who and/or what authored the document
   * </pre>
   *
   * <code>
   * repeated .google.fhir.stu3.proto.Reference author = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getAuthorOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Who/what authenticated the document
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference authenticator = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the authenticator field is set.
   */
  boolean hasAuthenticator();
  /**
   *
   *
   * <pre>
   * Who/what authenticated the document
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference authenticator = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The authenticator.
   */
  com.google.fhir.stu3.proto.Reference getAuthenticator();
  /**
   *
   *
   * <pre>
   * Who/what authenticated the document
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference authenticator = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getAuthenticatorOrBuilder();

  /**
   *
   *
   * <pre>
   * Organization which maintains the document
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference custodian = 20 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return Whether the custodian field is set.
   */
  boolean hasCustodian();
  /**
   *
   *
   * <pre>
   * Organization which maintains the document
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference custodian = 20 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The custodian.
   */
  com.google.fhir.stu3.proto.Reference getCustodian();
  /**
   *
   *
   * <pre>
   * Organization which maintains the document
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference custodian = 20 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getCustodianOrBuilder();

  /** <code>repeated .google.fhir.stu3.proto.DocumentReference.RelatesTo relates_to = 21;</code> */
  java.util.List<com.google.fhir.stu3.proto.DocumentReference.RelatesTo> getRelatesToList();
  /** <code>repeated .google.fhir.stu3.proto.DocumentReference.RelatesTo relates_to = 21;</code> */
  com.google.fhir.stu3.proto.DocumentReference.RelatesTo getRelatesTo(int index);
  /** <code>repeated .google.fhir.stu3.proto.DocumentReference.RelatesTo relates_to = 21;</code> */
  int getRelatesToCount();
  /** <code>repeated .google.fhir.stu3.proto.DocumentReference.RelatesTo relates_to = 21;</code> */
  java.util.List<? extends com.google.fhir.stu3.proto.DocumentReference.RelatesToOrBuilder>
      getRelatesToOrBuilderList();
  /** <code>repeated .google.fhir.stu3.proto.DocumentReference.RelatesTo relates_to = 21;</code> */
  com.google.fhir.stu3.proto.DocumentReference.RelatesToOrBuilder getRelatesToOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Human-readable description (title)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 22;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * Human-readable description (title)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 22;</code>
   *
   * @return The description.
   */
  com.google.fhir.stu3.proto.String getDescription();
  /**
   *
   *
   * <pre>
   * Human-readable description (title)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 22;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getDescriptionOrBuilder();

  /**
   *
   *
   * <pre>
   * Document security-tags
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept security_label = 23;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> getSecurityLabelList();
  /**
   *
   *
   * <pre>
   * Document security-tags
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept security_label = 23;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getSecurityLabel(int index);
  /**
   *
   *
   * <pre>
   * Document security-tags
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept security_label = 23;</code>
   */
  int getSecurityLabelCount();
  /**
   *
   *
   * <pre>
   * Document security-tags
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept security_label = 23;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder>
      getSecurityLabelOrBuilderList();
  /**
   *
   *
   * <pre>
   * Document security-tags
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept security_label = 23;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getSecurityLabelOrBuilder(int index);

  /**
   * <code>
   * repeated .google.fhir.stu3.proto.DocumentReference.Content content = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<com.google.fhir.stu3.proto.DocumentReference.Content> getContentList();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.DocumentReference.Content content = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.DocumentReference.Content getContent(int index);
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.DocumentReference.Content content = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  int getContentCount();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.DocumentReference.Content content = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.DocumentReference.ContentOrBuilder>
      getContentOrBuilderList();
  /**
   * <code>
   * repeated .google.fhir.stu3.proto.DocumentReference.Content content = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.DocumentReference.ContentOrBuilder getContentOrBuilder(int index);

  /**
   * <code>.google.fhir.stu3.proto.DocumentReference.Context context = 25;</code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   * <code>.google.fhir.stu3.proto.DocumentReference.Context context = 25;</code>
   *
   * @return The context.
   */
  com.google.fhir.stu3.proto.DocumentReference.Context getContext();
  /** <code>.google.fhir.stu3.proto.DocumentReference.Context context = 25;</code> */
  com.google.fhir.stu3.proto.DocumentReference.ContextOrBuilder getContextOrBuilder();
}
