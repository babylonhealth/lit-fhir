// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface MeasureInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.MeasureInfo)
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
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> getExtensionList();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  com.google.fhir.stu3.proto.Extension getExtension(int index);
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  int getExtensionCount();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder>
      getExtensionOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The measure being calculated
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference measure = 4;</code>
   *
   * @return Whether the measure field is set.
   */
  boolean hasMeasure();
  /**
   *
   *
   * <pre>
   * The measure being calculated
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference measure = 4;</code>
   *
   * @return The measure.
   */
  com.google.fhir.stu3.proto.Reference getMeasure();
  /**
   *
   *
   * <pre>
   * The measure being calculated
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference measure = 4;</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getMeasureOrBuilder();

  /**
   *
   *
   * <pre>
   * The group identifier
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier group_identifier = 5;</code>
   *
   * @return Whether the groupIdentifier field is set.
   */
  boolean hasGroupIdentifier();
  /**
   *
   *
   * <pre>
   * The group identifier
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier group_identifier = 5;</code>
   *
   * @return The groupIdentifier.
   */
  com.google.fhir.stu3.proto.Identifier getGroupIdentifier();
  /**
   *
   *
   * <pre>
   * The group identifier
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier group_identifier = 5;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getGroupIdentifierOrBuilder();

  /**
   *
   *
   * <pre>
   * The population identifier
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier population_identifier = 6;</code>
   *
   * @return Whether the populationIdentifier field is set.
   */
  boolean hasPopulationIdentifier();
  /**
   *
   *
   * <pre>
   * The population identifier
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier population_identifier = 6;</code>
   *
   * @return The populationIdentifier.
   */
  com.google.fhir.stu3.proto.Identifier getPopulationIdentifier();
  /**
   *
   *
   * <pre>
   * The population identifier
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier population_identifier = 6;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getPopulationIdentifierOrBuilder();
}
