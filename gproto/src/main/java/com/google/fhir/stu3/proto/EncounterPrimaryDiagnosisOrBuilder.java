// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface EncounterPrimaryDiagnosisOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.EncounterPrimaryDiagnosis)
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
   * <code>.google.fhir.stu3.proto.PositiveInt value_positive_int = 3;</code>
   *
   * @return Whether the valuePositiveInt field is set.
   */
  boolean hasValuePositiveInt();
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.PositiveInt value_positive_int = 3;</code>
   *
   * @return The valuePositiveInt.
   */
  com.google.fhir.stu3.proto.PositiveInt getValuePositiveInt();
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.PositiveInt value_positive_int = 3;</code>
   */
  com.google.fhir.stu3.proto.PositiveIntOrBuilder getValuePositiveIntOrBuilder();
}
