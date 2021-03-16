// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/datatypes.proto

package com.google.fhir.stu3.proto;

public interface RangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.Range)
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
   * Low limit
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.SimpleQuantity low = 3;</code>
   * @return Whether the low field is set.
   */
  boolean hasLow();
  /**
   * <pre>
   * Low limit
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.SimpleQuantity low = 3;</code>
   * @return The low.
   */
  com.google.fhir.stu3.proto.SimpleQuantity getLow();
  /**
   * <pre>
   * Low limit
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.SimpleQuantity low = 3;</code>
   */
  com.google.fhir.stu3.proto.SimpleQuantityOrBuilder getLowOrBuilder();

  /**
   * <pre>
   * High limit
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.SimpleQuantity high = 4;</code>
   * @return Whether the high field is set.
   */
  boolean hasHigh();
  /**
   * <pre>
   * High limit
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.SimpleQuantity high = 4;</code>
   * @return The high.
   */
  com.google.fhir.stu3.proto.SimpleQuantity getHigh();
  /**
   * <pre>
   * High limit
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.SimpleQuantity high = 4;</code>
   */
  com.google.fhir.stu3.proto.SimpleQuantityOrBuilder getHighOrBuilder();
}
