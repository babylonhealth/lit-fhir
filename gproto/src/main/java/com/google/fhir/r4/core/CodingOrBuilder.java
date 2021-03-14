// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/datatypes.proto

package com.google.fhir.r4.core;

public interface CodingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.Coding)
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
   * Identity of the terminology system
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri system = 3;</code>
   *
   * @return Whether the system field is set.
   */
  boolean hasSystem();
  /**
   *
   *
   * <pre>
   * Identity of the terminology system
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri system = 3;</code>
   *
   * @return The system.
   */
  com.google.fhir.r4.core.Uri getSystem();
  /**
   *
   *
   * <pre>
   * Identity of the terminology system
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri system = 3;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getSystemOrBuilder();

  /**
   *
   *
   * <pre>
   * Version of the system - if relevant
   * </pre>
   *
   * <code>.google.fhir.r4.core.String version = 4;</code>
   *
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   *
   *
   * <pre>
   * Version of the system - if relevant
   * </pre>
   *
   * <code>.google.fhir.r4.core.String version = 4;</code>
   *
   * @return The version.
   */
  com.google.fhir.r4.core.String getVersion();
  /**
   *
   *
   * <pre>
   * Version of the system - if relevant
   * </pre>
   *
   * <code>.google.fhir.r4.core.String version = 4;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * Symbol in syntax defined by the system
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code code = 5;</code>
   *
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   *
   *
   * <pre>
   * Symbol in syntax defined by the system
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code code = 5;</code>
   *
   * @return The code.
   */
  com.google.fhir.r4.core.Code getCode();
  /**
   *
   *
   * <pre>
   * Symbol in syntax defined by the system
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code code = 5;</code>
   */
  com.google.fhir.r4.core.CodeOrBuilder getCodeOrBuilder();

  /**
   *
   *
   * <pre>
   * Representation defined by the system
   * </pre>
   *
   * <code>.google.fhir.r4.core.String display = 6;</code>
   *
   * @return Whether the display field is set.
   */
  boolean hasDisplay();
  /**
   *
   *
   * <pre>
   * Representation defined by the system
   * </pre>
   *
   * <code>.google.fhir.r4.core.String display = 6;</code>
   *
   * @return The display.
   */
  com.google.fhir.r4.core.String getDisplay();
  /**
   *
   *
   * <pre>
   * Representation defined by the system
   * </pre>
   *
   * <code>.google.fhir.r4.core.String display = 6;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getDisplayOrBuilder();

  /**
   *
   *
   * <pre>
   * If this coding was chosen directly by the user
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean user_selected = 7;</code>
   *
   * @return Whether the userSelected field is set.
   */
  boolean hasUserSelected();
  /**
   *
   *
   * <pre>
   * If this coding was chosen directly by the user
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean user_selected = 7;</code>
   *
   * @return The userSelected.
   */
  com.google.fhir.r4.core.Boolean getUserSelected();
  /**
   *
   *
   * <pre>
   * If this coding was chosen directly by the user
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean user_selected = 7;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getUserSelectedOrBuilder();
}
