// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/extensions.proto

package com.google.fhir.r4.core;

public interface ValueSetExpressionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.ValueSetExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   * @return The id.
   */
  com.google.fhir.r4.core.String getId();
  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.r4.core.Expression value_expression = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the valueExpression field is set.
   */
  boolean hasValueExpression();
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.r4.core.Expression value_expression = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The valueExpression.
   */
  com.google.fhir.r4.core.Expression getValueExpression();
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.r4.core.Expression value_expression = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.ExpressionOrBuilder getValueExpressionOrBuilder();
}
