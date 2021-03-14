// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/extensions.proto

package com.google.fhir.r4.core;

public interface ElementDefinitionAllowedUnitsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.ElementDefinitionAllowedUnits)
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
   * <code>
   * .google.fhir.r4.core.ElementDefinitionAllowedUnits.ValueX value = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>
   * .google.fhir.r4.core.ElementDefinitionAllowedUnits.ValueX value = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The value.
   */
  com.google.fhir.r4.core.ElementDefinitionAllowedUnits.ValueX getValue();
  /**
   * <code>
   * .google.fhir.r4.core.ElementDefinitionAllowedUnits.ValueX value = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.ElementDefinitionAllowedUnits.ValueXOrBuilder getValueOrBuilder();
}
