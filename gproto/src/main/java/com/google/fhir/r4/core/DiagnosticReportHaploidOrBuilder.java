// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/extensions.proto

package com.google.fhir.r4.core;

public interface DiagnosticReportHaploidOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.DiagnosticReportHaploid)
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
   * haploid-locus
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept locus = 4;</code>
   *
   * @return Whether the locus field is set.
   */
  boolean hasLocus();
  /**
   *
   *
   * <pre>
   * haploid-locus
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept locus = 4;</code>
   *
   * @return The locus.
   */
  com.google.fhir.r4.core.CodeableConcept getLocus();
  /**
   *
   *
   * <pre>
   * haploid-locus
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept locus = 4;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getLocusOrBuilder();

  /**
   *
   *
   * <pre>
   * haploid-type
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 5;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * haploid-type
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 5;</code>
   *
   * @return The type.
   */
  com.google.fhir.r4.core.CodeableConcept getType();
  /**
   *
   *
   * <pre>
   * haploid-type
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 5;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * haploid-method
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept method = 6;</code>
   *
   * @return Whether the method field is set.
   */
  boolean hasMethod();
  /**
   *
   *
   * <pre>
   * haploid-method
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept method = 6;</code>
   *
   * @return The method.
   */
  com.google.fhir.r4.core.CodeableConcept getMethod();
  /**
   *
   *
   * <pre>
   * haploid-method
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept method = 6;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getMethodOrBuilder();
}