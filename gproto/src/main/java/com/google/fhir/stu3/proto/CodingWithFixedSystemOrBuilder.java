// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/datatypes.proto

package com.google.fhir.stu3.proto;

public interface CodingWithFixedSystemOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.CodingWithFixedSystem)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
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
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   *
   * @return The id.
   */
  com.google.fhir.stu3.proto.String getId();
  /**
   *
   *
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> getExtensionList();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  com.google.fhir.stu3.proto.Extension getExtension(int index);
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  int getExtensionCount();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
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
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Version of the system - if relevant
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String version = 4;</code>
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
   * <code>.google.fhir.stu3.proto.String version = 4;</code>
   *
   * @return The version.
   */
  com.google.fhir.stu3.proto.String getVersion();
  /**
   *
   *
   * <pre>
   * Version of the system - if relevant
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String version = 4;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * Symbol in syntax defined by the system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Code code = 5;</code>
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
   * <code>.google.fhir.stu3.proto.Code code = 5;</code>
   *
   * @return The code.
   */
  com.google.fhir.stu3.proto.Code getCode();
  /**
   *
   *
   * <pre>
   * Symbol in syntax defined by the system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Code code = 5;</code>
   */
  com.google.fhir.stu3.proto.CodeOrBuilder getCodeOrBuilder();

  /**
   *
   *
   * <pre>
   * Representation defined by the system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String display = 6;</code>
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
   * <code>.google.fhir.stu3.proto.String display = 6;</code>
   *
   * @return The display.
   */
  com.google.fhir.stu3.proto.String getDisplay();
  /**
   *
   *
   * <pre>
   * Representation defined by the system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String display = 6;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getDisplayOrBuilder();

  /**
   *
   *
   * <pre>
   * If this coding was chosen directly by the user
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean user_selected = 7;</code>
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
   * <code>.google.fhir.stu3.proto.Boolean user_selected = 7;</code>
   *
   * @return The userSelected.
   */
  com.google.fhir.stu3.proto.Boolean getUserSelected();
  /**
   *
   *
   * <pre>
   * If this coding was chosen directly by the user
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean user_selected = 7;</code>
   */
  com.google.fhir.stu3.proto.BooleanOrBuilder getUserSelectedOrBuilder();
}
