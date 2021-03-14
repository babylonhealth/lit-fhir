// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/resources/binary.proto

package com.google.fhir.r4.core;

public interface BinaryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.Binary)
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
   * <code>
   * .google.fhir.r4.core.Binary.ContentTypeCode content_type = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the contentType field is set.
   */
  boolean hasContentType();
  /**
   * <code>
   * .google.fhir.r4.core.Binary.ContentTypeCode content_type = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The contentType.
   */
  com.google.fhir.r4.core.Binary.ContentTypeCode getContentType();
  /**
   * <code>
   * .google.fhir.r4.core.Binary.ContentTypeCode content_type = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.Binary.ContentTypeCodeOrBuilder getContentTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Identifies another resource to use as proxy when enforcing access control
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference security_context = 6 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return Whether the securityContext field is set.
   */
  boolean hasSecurityContext();
  /**
   *
   *
   * <pre>
   * Identifies another resource to use as proxy when enforcing access control
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference security_context = 6 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   *
   * @return The securityContext.
   */
  com.google.fhir.r4.core.Reference getSecurityContext();
  /**
   *
   *
   * <pre>
   * Identifies another resource to use as proxy when enforcing access control
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Reference security_context = 6 [(.google.fhir.proto.valid_reference_type) = "Resource"];
   * </code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSecurityContextOrBuilder();

  /**
   *
   *
   * <pre>
   * The actual content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Base64Binary data = 7;</code>
   *
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   *
   *
   * <pre>
   * The actual content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Base64Binary data = 7;</code>
   *
   * @return The data.
   */
  com.google.fhir.r4.core.Base64Binary getData();
  /**
   *
   *
   * <pre>
   * The actual content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Base64Binary data = 7;</code>
   */
  com.google.fhir.r4.core.Base64BinaryOrBuilder getDataOrBuilder();
}