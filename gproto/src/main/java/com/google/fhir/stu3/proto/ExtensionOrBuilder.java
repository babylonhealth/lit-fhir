// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/datatypes.proto

package com.google.fhir.stu3.proto;

public interface ExtensionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.Extension)
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
   * identifies the meaning of the extension
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Uri url = 2 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   *
   *
   * <pre>
   * identifies the meaning of the extension
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Uri url = 2 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The url.
   */
  com.google.fhir.stu3.proto.Uri getUrl();
  /**
   *
   *
   * <pre>
   * identifies the meaning of the extension
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Uri url = 2 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getUrlOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.Extension.ValueX value = 3;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.google.fhir.stu3.proto.Extension.ValueX value = 3;</code>
   *
   * @return The value.
   */
  com.google.fhir.stu3.proto.Extension.ValueX getValue();
  /** <code>.google.fhir.stu3.proto.Extension.ValueX value = 3;</code> */
  com.google.fhir.stu3.proto.Extension.ValueXOrBuilder getValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 4;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> getExtensionList();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 4;</code>
   */
  com.google.fhir.stu3.proto.Extension getExtension(int index);
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 4;</code>
   */
  int getExtensionCount();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 4;</code>
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
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 4;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(int index);
}
