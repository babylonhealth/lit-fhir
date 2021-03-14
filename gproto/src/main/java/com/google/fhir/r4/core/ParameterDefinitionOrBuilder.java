// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/datatypes.proto

package com.google.fhir.r4.core;

public interface ParameterDefinitionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.ParameterDefinition)
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
   * Name used to access the parameter value
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code name = 3;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name used to access the parameter value
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code name = 3;</code>
   *
   * @return The name.
   */
  com.google.fhir.r4.core.Code getName();
  /**
   *
   *
   * <pre>
   * Name used to access the parameter value
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code name = 3;</code>
   */
  com.google.fhir.r4.core.CodeOrBuilder getNameOrBuilder();

  /**
   * <code>
   * .google.fhir.r4.core.ParameterDefinition.UseCode use = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the use field is set.
   */
  boolean hasUse();
  /**
   * <code>
   * .google.fhir.r4.core.ParameterDefinition.UseCode use = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The use.
   */
  com.google.fhir.r4.core.ParameterDefinition.UseCode getUse();
  /**
   * <code>
   * .google.fhir.r4.core.ParameterDefinition.UseCode use = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.ParameterDefinition.UseCodeOrBuilder getUseOrBuilder();

  /**
   *
   *
   * <pre>
   * Minimum cardinality
   * </pre>
   *
   * <code>.google.fhir.r4.core.Integer min = 5;</code>
   *
   * @return Whether the min field is set.
   */
  boolean hasMin();
  /**
   *
   *
   * <pre>
   * Minimum cardinality
   * </pre>
   *
   * <code>.google.fhir.r4.core.Integer min = 5;</code>
   *
   * @return The min.
   */
  com.google.fhir.r4.core.Integer getMin();
  /**
   *
   *
   * <pre>
   * Minimum cardinality
   * </pre>
   *
   * <code>.google.fhir.r4.core.Integer min = 5;</code>
   */
  com.google.fhir.r4.core.IntegerOrBuilder getMinOrBuilder();

  /**
   *
   *
   * <pre>
   * Maximum cardinality (a number of *)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String max = 6;</code>
   *
   * @return Whether the max field is set.
   */
  boolean hasMax();
  /**
   *
   *
   * <pre>
   * Maximum cardinality (a number of *)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String max = 6;</code>
   *
   * @return The max.
   */
  com.google.fhir.r4.core.String getMax();
  /**
   *
   *
   * <pre>
   * Maximum cardinality (a number of *)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String max = 6;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getMaxOrBuilder();

  /**
   *
   *
   * <pre>
   * A brief description of the parameter
   * </pre>
   *
   * <code>.google.fhir.r4.core.String documentation = 7;</code>
   *
   * @return Whether the documentation field is set.
   */
  boolean hasDocumentation();
  /**
   *
   *
   * <pre>
   * A brief description of the parameter
   * </pre>
   *
   * <code>.google.fhir.r4.core.String documentation = 7;</code>
   *
   * @return The documentation.
   */
  com.google.fhir.r4.core.String getDocumentation();
  /**
   *
   *
   * <pre>
   * A brief description of the parameter
   * </pre>
   *
   * <code>.google.fhir.r4.core.String documentation = 7;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getDocumentationOrBuilder();

  /**
   * <code>
   * .google.fhir.r4.core.ParameterDefinition.TypeCode type = 8 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>
   * .google.fhir.r4.core.ParameterDefinition.TypeCode type = 8 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The type.
   */
  com.google.fhir.r4.core.ParameterDefinition.TypeCode getType();
  /**
   * <code>
   * .google.fhir.r4.core.ParameterDefinition.TypeCode type = 8 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.r4.core.ParameterDefinition.TypeCodeOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * What profile the value is expected to be
   * </pre>
   *
   * <code>.google.fhir.r4.core.Canonical profile = 9;</code>
   *
   * @return Whether the profile field is set.
   */
  boolean hasProfile();
  /**
   *
   *
   * <pre>
   * What profile the value is expected to be
   * </pre>
   *
   * <code>.google.fhir.r4.core.Canonical profile = 9;</code>
   *
   * @return The profile.
   */
  com.google.fhir.r4.core.Canonical getProfile();
  /**
   *
   *
   * <pre>
   * What profile the value is expected to be
   * </pre>
   *
   * <code>.google.fhir.r4.core.Canonical profile = 9;</code>
   */
  com.google.fhir.r4.core.CanonicalOrBuilder getProfileOrBuilder();
}