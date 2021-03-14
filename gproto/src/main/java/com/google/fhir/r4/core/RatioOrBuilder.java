// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/datatypes.proto

package com.google.fhir.r4.core;

public interface RatioOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.Ratio)
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
   * Numerator value
   * </pre>
   *
   * <code>.google.fhir.r4.core.Quantity numerator = 3;</code>
   *
   * @return Whether the numerator field is set.
   */
  boolean hasNumerator();
  /**
   *
   *
   * <pre>
   * Numerator value
   * </pre>
   *
   * <code>.google.fhir.r4.core.Quantity numerator = 3;</code>
   *
   * @return The numerator.
   */
  com.google.fhir.r4.core.Quantity getNumerator();
  /**
   *
   *
   * <pre>
   * Numerator value
   * </pre>
   *
   * <code>.google.fhir.r4.core.Quantity numerator = 3;</code>
   */
  com.google.fhir.r4.core.QuantityOrBuilder getNumeratorOrBuilder();

  /**
   *
   *
   * <pre>
   * Denominator value
   * </pre>
   *
   * <code>.google.fhir.r4.core.Quantity denominator = 4;</code>
   *
   * @return Whether the denominator field is set.
   */
  boolean hasDenominator();
  /**
   *
   *
   * <pre>
   * Denominator value
   * </pre>
   *
   * <code>.google.fhir.r4.core.Quantity denominator = 4;</code>
   *
   * @return The denominator.
   */
  com.google.fhir.r4.core.Quantity getDenominator();
  /**
   *
   *
   * <pre>
   * Denominator value
   * </pre>
   *
   * <code>.google.fhir.r4.core.Quantity denominator = 4;</code>
   */
  com.google.fhir.r4.core.QuantityOrBuilder getDenominatorOrBuilder();
}
