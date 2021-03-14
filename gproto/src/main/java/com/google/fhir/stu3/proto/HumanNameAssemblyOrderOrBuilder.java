// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface HumanNameAssemblyOrderOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.HumanNameAssemblyOrder)
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
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.HumanNameAssemblyOrderCode value_code = 3;</code>
   *
   * @return Whether the valueCode field is set.
   */
  boolean hasValueCode();
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.HumanNameAssemblyOrderCode value_code = 3;</code>
   *
   * @return The valueCode.
   */
  com.google.fhir.stu3.proto.HumanNameAssemblyOrderCode getValueCode();
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.HumanNameAssemblyOrderCode value_code = 3;</code>
   */
  com.google.fhir.stu3.proto.HumanNameAssemblyOrderCodeOrBuilder getValueCodeOrBuilder();
}
