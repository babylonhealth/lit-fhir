// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/extensions.proto

package com.google.fhir.r4.core;

public interface MeasureInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.MeasureInfo)
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
   * The measure being calculated
   * </pre>
   *
   * <code>.google.fhir.r4.core.Canonical measure = 4;</code>
   * @return Whether the measure field is set.
   */
  boolean hasMeasure();
  /**
   * <pre>
   * The measure being calculated
   * </pre>
   *
   * <code>.google.fhir.r4.core.Canonical measure = 4;</code>
   * @return The measure.
   */
  com.google.fhir.r4.core.Canonical getMeasure();
  /**
   * <pre>
   * The measure being calculated
   * </pre>
   *
   * <code>.google.fhir.r4.core.Canonical measure = 4;</code>
   */
  com.google.fhir.r4.core.CanonicalOrBuilder getMeasureOrBuilder();

  /**
   * <pre>
   * The group identifier
   * </pre>
   *
   * <code>.google.fhir.r4.core.String group_id = 5;</code>
   * @return Whether the groupId field is set.
   */
  boolean hasGroupId();
  /**
   * <pre>
   * The group identifier
   * </pre>
   *
   * <code>.google.fhir.r4.core.String group_id = 5;</code>
   * @return The groupId.
   */
  com.google.fhir.r4.core.String getGroupId();
  /**
   * <pre>
   * The group identifier
   * </pre>
   *
   * <code>.google.fhir.r4.core.String group_id = 5;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getGroupIdOrBuilder();

  /**
   * <pre>
   * The population identifier
   * </pre>
   *
   * <code>.google.fhir.r4.core.String population_id = 6;</code>
   * @return Whether the populationId field is set.
   */
  boolean hasPopulationId();
  /**
   * <pre>
   * The population identifier
   * </pre>
   *
   * <code>.google.fhir.r4.core.String population_id = 6;</code>
   * @return The populationId.
   */
  com.google.fhir.r4.core.String getPopulationId();
  /**
   * <pre>
   * The population identifier
   * </pre>
   *
   * <code>.google.fhir.r4.core.String population_id = 6;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getPopulationIdOrBuilder();
}
