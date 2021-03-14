// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/uscore.proto

package com.google.fhir.r4.uscore;

public interface USCoreDocumentReferenceProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.uscore.USCoreDocumentReferenceProfile)
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
   * Master Version Specific Identifier
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier master_identifier = 10;</code>
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
   * <code>.google.fhir.r4.core.Identifier master_identifier = 10;</code>
   *
   * @return The masterIdentifier.
   */
  com.google.fhir.r4.core.Identifier getMasterIdentifier();
  /**
   *
   *
   * <pre>
   * Master Version Specific Identifier
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier master_identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getMasterIdentifierOrBuilder();

  /**
   *
   *
   * <pre>
   * Other identifiers for the document
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 11;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> getIdentifierList();
  /**
   *
   *
   * <pre>
   * Other identifiers for the document
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 11;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   *
   *
   * <pre>
   * Other identifiers for the document
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 11;</code>
   */
  int getIdentifierCount();
  /**
   *
   *
   * <pre>
   * Other identifiers for the document
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
   * Other identifiers for the document
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 11;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(int index);

  /**
   * <code>
   * .google.fhir.r4.uscore.USCoreDocumentReferenceProfile.StatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>
   * .google.fhir.r4.uscore.USCoreDocumentReferenceProfile.StatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.StatusCode getStatus();
  /**
   * <code>
   * .google.fhir.r4.uscore.USCoreDocumentReferenceProfile.StatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <code>.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.DocStatusCode doc_status = 13;
   * </code>
   *
   * @return Whether the docStatus field is set.
   */
  boolean hasDocStatus();
  /**
   * <code>.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.DocStatusCode doc_status = 13;
   * </code>
   *
   * @return The docStatus.
   */
  com.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.DocStatusCode getDocStatus();
  /**
   * <code>.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.DocStatusCode doc_status = 13;
   * </code>
   */
  com.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.DocStatusCodeOrBuilder
      getDocStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Kind of document (LOINC if possible)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.CodeableConcept type = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
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
   * .google.fhir.r4.core.CodeableConcept type = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The type.
   */
  com.google.fhir.r4.core.CodeableConcept getType();
  /**
   *
   *
   * <pre>
   * Kind of document (LOINC if possible)
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.CodeableConcept type = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Categorization of document
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getCategoryList();
  /**
   *
   *
   * <pre>
   * Categorization of document
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.CodeableConcept getCategory(int index);
  /**
   *
   *
   * <pre>
   * Categorization of document
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  int getCategoryCount();
  /**
   *
   *
   * <pre>
   * Categorization of document
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getCategoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Categorization of document
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.CodeableConcept category = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCategoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Who/what is the subject of the document
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
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
   * .google.fhir.r4.core.Reference subject = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   *
   * @return The subject.
   */
  com.google.fhir.r4.core.Reference getSubject();
  /**
   *
   *
   * <pre>
   * Who/what is the subject of the document
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference subject = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * When this document reference was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant date = 17;</code>
   *
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   *
   *
   * <pre>
   * When this document reference was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant date = 17;</code>
   *
   * @return The date.
   */
  com.google.fhir.r4.core.Instant getDate();
  /**
   *
   *
   * <pre>
   * When this document reference was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant date = 17;</code>
   */
  com.google.fhir.r4.core.InstantOrBuilder getDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Who and/or what authored the document
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference author = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> getAuthorList();
  /**
   *
   *
   * <pre>
   * Who and/or what authored the document
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference author = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  com.google.fhir.r4.core.Reference getAuthor(int index);
  /**
   *
   *
   * <pre>
   * Who and/or what authored the document
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference author = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
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
   * repeated .google.fhir.r4.core.Reference author = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> getAuthorOrBuilderList();
  /**
   *
   *
   * <pre>
   * Who and/or what authored the document
   * </pre>
   *
   * <code>
   * repeated .google.fhir.r4.core.Reference author = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getAuthorOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Who/what authenticated the document
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference authenticator = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
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
   * .google.fhir.r4.core.Reference authenticator = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The authenticator.
   */
  com.google.fhir.r4.core.Reference getAuthenticator();
  /**
   *
   *
   * <pre>
   * Who/what authenticated the document
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference authenticator = 19 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getAuthenticatorOrBuilder();

  /**
   *
   *
   * <pre>
   * Organization which maintains the document
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference custodian = 20 [(.google.fhir.proto.valid_reference_type) = "Organization"];
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
   * .google.fhir.r4.core.Reference custodian = 20 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   *
   * @return The custodian.
   */
  com.google.fhir.r4.core.Reference getCustodian();
  /**
   *
   *
   * <pre>
   * Organization which maintains the document
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference custodian = 20 [(.google.fhir.proto.valid_reference_type) = "Organization"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getCustodianOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreDocumentReferenceProfile.RelatesTo relates_to = 21;
   * </code>
   */
  java.util.List<com.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.RelatesTo>
      getRelatesToList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreDocumentReferenceProfile.RelatesTo relates_to = 21;
   * </code>
   */
  com.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.RelatesTo getRelatesTo(int index);
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreDocumentReferenceProfile.RelatesTo relates_to = 21;
   * </code>
   */
  int getRelatesToCount();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreDocumentReferenceProfile.RelatesTo relates_to = 21;
   * </code>
   */
  java.util.List<
          ? extends com.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.RelatesToOrBuilder>
      getRelatesToOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreDocumentReferenceProfile.RelatesTo relates_to = 21;
   * </code>
   */
  com.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.RelatesToOrBuilder getRelatesToOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Human-readable description
   * </pre>
   *
   * <code>.google.fhir.r4.core.String description = 22;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * Human-readable description
   * </pre>
   *
   * <code>.google.fhir.r4.core.String description = 22;</code>
   *
   * @return The description.
   */
  com.google.fhir.r4.core.String getDescription();
  /**
   *
   *
   * <pre>
   * Human-readable description
   * </pre>
   *
   * <code>.google.fhir.r4.core.String description = 22;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getDescriptionOrBuilder();

  /**
   *
   *
   * <pre>
   * Document security-tags
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept security_label = 23;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> getSecurityLabelList();
  /**
   *
   *
   * <pre>
   * Document security-tags
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept security_label = 23;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getSecurityLabel(int index);
  /**
   *
   *
   * <pre>
   * Document security-tags
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept security_label = 23;</code>
   */
  int getSecurityLabelCount();
  /**
   *
   *
   * <pre>
   * Document security-tags
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept security_label = 23;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder>
      getSecurityLabelOrBuilderList();
  /**
   *
   *
   * <pre>
   * Document security-tags
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept security_label = 23;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getSecurityLabelOrBuilder(int index);

  /**
   * <code>
   * .google.fhir.r4.uscore.USCoreDocumentReferenceProfile.Content content = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <code>
   * .google.fhir.r4.uscore.USCoreDocumentReferenceProfile.Content content = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The content.
   */
  com.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.Content getContent();
  /**
   * <code>
   * .google.fhir.r4.uscore.USCoreDocumentReferenceProfile.Content content = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.ContentOrBuilder getContentOrBuilder();

  /**
   * <code>.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.Context context = 25;</code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   * <code>.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.Context context = 25;</code>
   *
   * @return The context.
   */
  com.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.Context getContext();
  /** <code>.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.Context context = 25;</code> */
  com.google.fhir.r4.uscore.USCoreDocumentReferenceProfile.ContextOrBuilder getContextOrBuilder();
}
