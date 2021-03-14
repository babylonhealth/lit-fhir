// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/datatypes.proto

package com.google.fhir.r4.core;

public interface ReferenceIdOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.ReferenceId)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Primitive value for id
   * </pre>
   *
   * <code>string value = 1;</code>
   *
   * @return The value.
   */
  java.lang.String getValue();
  /**
   *
   *
   * <pre>
   * Primitive value for id
   * </pre>
   *
   * <code>string value = 1;</code>
   *
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString getValueBytes();

  /**
   *
   *
   * <pre>
   * History version, if present.
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id history = 2;</code>
   *
   * @return Whether the history field is set.
   */
  boolean hasHistory();
  /**
   *
   *
   * <pre>
   * History version, if present.
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id history = 2;</code>
   *
   * @return The history.
   */
  com.google.fhir.r4.core.Id getHistory();
  /**
   *
   *
   * <pre>
   * History version, if present.
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id history = 2;</code>
   */
  com.google.fhir.r4.core.IdOrBuilder getHistoryOrBuilder();

  /**
   *
   *
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 3;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 3;</code>
   *
   * @return The id.
   */
  com.google.fhir.r4.core.String getId();
  /**
   *
   *
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 3;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 4;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> getExtensionList();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 4;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 4;</code>
   */
  int getExtensionCount();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 4;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> getExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 4;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(int index);
}
