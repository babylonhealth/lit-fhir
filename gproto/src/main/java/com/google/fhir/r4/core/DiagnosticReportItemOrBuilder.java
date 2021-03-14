// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/extensions.proto

package com.google.fhir.r4.core;

public interface DiagnosticReportItemOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.DiagnosticReportItem)
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
   * Code to indicate the item (test, panel or sequence variant) being ordered
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.CodeableConcept code = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   *
   *
   * <pre>
   * Code to indicate the item (test, panel or sequence variant) being ordered
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.CodeableConcept code = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The code.
   */
  com.google.fhir.r4.core.CodeableConcept getCode();
  /**
   *
   *
   * <pre>
   * Code to indicate the item (test, panel or sequence variant) being ordered
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.CodeableConcept code = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCodeOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicate the genetic variant ordered to be tested
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference genetics_observation = 5;</code>
   *
   * @return Whether the geneticsObservation field is set.
   */
  boolean hasGeneticsObservation();
  /**
   *
   *
   * <pre>
   * Indicate the genetic variant ordered to be tested
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference genetics_observation = 5;</code>
   *
   * @return The geneticsObservation.
   */
  com.google.fhir.r4.core.Reference getGeneticsObservation();
  /**
   *
   *
   * <pre>
   * Indicate the genetic variant ordered to be tested
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference genetics_observation = 5;</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getGeneticsObservationOrBuilder();

  /**
   *
   *
   * <pre>
   * If this item relates to specific specimens
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference specimen = 6;</code>
   *
   * @return Whether the specimen field is set.
   */
  boolean hasSpecimen();
  /**
   *
   *
   * <pre>
   * If this item relates to specific specimens
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference specimen = 6;</code>
   *
   * @return The specimen.
   */
  com.google.fhir.r4.core.Reference getSpecimen();
  /**
   *
   *
   * <pre>
   * If this item relates to specific specimens
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference specimen = 6;</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSpecimenOrBuilder();

  /**
   *
   *
   * <pre>
   * proposed | draft | planned | requested | received | accepted | in-progress
   * | review | completed | cancelled | suspended | rejected | failed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code status = 7;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * proposed | draft | planned | requested | received | accepted | in-progress
   * | review | completed | cancelled | suspended | rejected | failed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code status = 7;</code>
   *
   * @return The status.
   */
  com.google.fhir.r4.core.Code getStatus();
  /**
   *
   *
   * <pre>
   * proposed | draft | planned | requested | received | accepted | in-progress
   * | review | completed | cancelled | suspended | rejected | failed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code status = 7;</code>
   */
  com.google.fhir.r4.core.CodeOrBuilder getStatusOrBuilder();
}
