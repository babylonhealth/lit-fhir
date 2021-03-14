// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/extensions.proto

package com.google.fhir.r4.core;

public interface CodeSystemHistoryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.CodeSystemHistory)
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
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> getExtensionList();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  int getExtensionCount();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> getExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The name of this set of history entries
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 4;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * The name of this set of history entries
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 4;</code>
   *
   * @return The name.
   */
  com.google.fhir.r4.core.String getName();
  /**
   *
   *
   * <pre>
   * The name of this set of history entries
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 4;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getNameOrBuilder();

  /** <code>repeated .google.fhir.r4.core.CodeSystemHistory.Revision revision = 5;</code> */
  java.util.List<com.google.fhir.r4.core.CodeSystemHistory.Revision> getRevisionList();
  /** <code>repeated .google.fhir.r4.core.CodeSystemHistory.Revision revision = 5;</code> */
  com.google.fhir.r4.core.CodeSystemHistory.Revision getRevision(int index);
  /** <code>repeated .google.fhir.r4.core.CodeSystemHistory.Revision revision = 5;</code> */
  int getRevisionCount();
  /** <code>repeated .google.fhir.r4.core.CodeSystemHistory.Revision revision = 5;</code> */
  java.util.List<? extends com.google.fhir.r4.core.CodeSystemHistory.RevisionOrBuilder>
      getRevisionOrBuilderList();
  /** <code>repeated .google.fhir.r4.core.CodeSystemHistory.Revision revision = 5;</code> */
  com.google.fhir.r4.core.CodeSystemHistory.RevisionOrBuilder getRevisionOrBuilder(int index);
}