// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/datatypes.proto

package com.google.fhir.stu3.proto;

public interface PeriodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.Period)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   * @return The id.
   */
  com.google.fhir.stu3.proto.String getId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  com.google.fhir.stu3.proto.Extension getExtension(int index);
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Starting time with inclusive boundary
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime start = 3;</code>
   * @return Whether the start field is set.
   */
  boolean hasStart();
  /**
   * <pre>
   * Starting time with inclusive boundary
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime start = 3;</code>
   * @return The start.
   */
  com.google.fhir.stu3.proto.DateTime getStart();
  /**
   * <pre>
   * Starting time with inclusive boundary
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime start = 3;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getStartOrBuilder();

  /**
   * <pre>
   * End time with inclusive boundary, if not ongoing
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime end = 4;</code>
   * @return Whether the end field is set.
   */
  boolean hasEnd();
  /**
   * <pre>
   * End time with inclusive boundary, if not ongoing
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime end = 4;</code>
   * @return The end.
   */
  com.google.fhir.stu3.proto.DateTime getEnd();
  /**
   * <pre>
   * End time with inclusive boundary, if not ongoing
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime end = 4;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getEndOrBuilder();
}
