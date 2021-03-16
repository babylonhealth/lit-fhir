// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/extensions.proto

package com.google.fhir.r4.core;

public interface DiagnosticReportAnalysisOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.DiagnosticReportAnalysis)
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
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Analysis type
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Analysis type
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The type.
   */
  com.google.fhir.r4.core.CodeableConcept getType();
  /**
   * <pre>
   * Analysis type
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   * <pre>
   * Analysis interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept interpretation = 5;</code>
   * @return Whether the interpretation field is set.
   */
  boolean hasInterpretation();
  /**
   * <pre>
   * Analysis interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept interpretation = 5;</code>
   * @return The interpretation.
   */
  com.google.fhir.r4.core.CodeableConcept getInterpretation();
  /**
   * <pre>
   * Analysis interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept interpretation = 5;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getInterpretationOrBuilder();
}
