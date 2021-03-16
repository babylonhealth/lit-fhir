// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/extensions.proto

package com.google.fhir.r4.core;

public interface ValueSetOtherNameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.ValueSetOtherName)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   * @return The id.
   */
  com.google.fhir.r4.core.String getId();
  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Human readable, short and specific
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Human readable, short and specific
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The name.
   */
  com.google.fhir.r4.core.String getName();
  /**
   * <pre>
   * Human readable, short and specific
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Which name is preferred for this language
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean preferred = 5;</code>
   * @return Whether the preferred field is set.
   */
  boolean hasPreferred();
  /**
   * <pre>
   * Which name is preferred for this language
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean preferred = 5;</code>
   * @return The preferred.
   */
  com.google.fhir.r4.core.Boolean getPreferred();
  /**
   * <pre>
   * Which name is preferred for this language
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean preferred = 5;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getPreferredOrBuilder();
}
