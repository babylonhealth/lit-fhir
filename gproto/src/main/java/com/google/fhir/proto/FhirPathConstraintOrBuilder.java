// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/profile_config.proto

package com.google.fhir.proto;

public interface FhirPathConstraintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.proto.FhirPathConstraint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.fhir.proto.FhirPathConstraint.Severity severity = 1;</code>
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   * <code>.google.fhir.proto.FhirPathConstraint.Severity severity = 1;</code>
   * @return The severity.
   */
  com.google.fhir.proto.FhirPathConstraint.Severity getSeverity();

  /**
   * <pre>
   * Human-readable description of the constraint
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Human-readable description of the constraint
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The FHIRPath expression defining the constraint
   * </pre>
   *
   * <code>string expression = 3;</code>
   * @return The expression.
   */
  java.lang.String getExpression();
  /**
   * <pre>
   * The FHIRPath expression defining the constraint
   * </pre>
   *
   * <code>string expression = 3;</code>
   * @return The bytes for expression.
   */
  com.google.protobuf.ByteString
      getExpressionBytes();
}