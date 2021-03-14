// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/extensions.proto

package com.google.fhir.r4.core;

public interface OperationDefinitionProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.OperationDefinitionProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   *
   * @return The id.
   */
  com.google.fhir.r4.core.String getId();
  /**
   *
   *
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder();

  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the valueUri field is set.
   */
  boolean hasValueUri();
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The valueUri.
   */
  com.google.fhir.r4.core.Uri getValueUri();
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.UriOrBuilder getValueUriOrBuilder();
}
