// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/metadatatypes.proto

package com.google.fhir.stu3.proto;

public interface ParameterDefinitionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.ParameterDefinition)
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
   * Name used to access the parameter value
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Code name = 3;</code>
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
   * <code>.google.fhir.stu3.proto.Code name = 3;</code>
   *
   * @return The name.
   */
  com.google.fhir.stu3.proto.Code getName();
  /**
   *
   *
   * <pre>
   * Name used to access the parameter value
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Code name = 3;</code>
   */
  com.google.fhir.stu3.proto.CodeOrBuilder getNameOrBuilder();

  /**
   *
   *
   * <pre>
   * in | out
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.OperationParameterUseCode use = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the use field is set.
   */
  boolean hasUse();
  /**
   *
   *
   * <pre>
   * in | out
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.OperationParameterUseCode use = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The use.
   */
  com.google.fhir.stu3.proto.OperationParameterUseCode getUse();
  /**
   *
   *
   * <pre>
   * in | out
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.OperationParameterUseCode use = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.OperationParameterUseCodeOrBuilder getUseOrBuilder();

  /**
   *
   *
   * <pre>
   * Minimum cardinality
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Integer min = 5;</code>
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
   * <code>.google.fhir.stu3.proto.Integer min = 5;</code>
   *
   * @return The min.
   */
  com.google.fhir.stu3.proto.Integer getMin();
  /**
   *
   *
   * <pre>
   * Minimum cardinality
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Integer min = 5;</code>
   */
  com.google.fhir.stu3.proto.IntegerOrBuilder getMinOrBuilder();

  /**
   *
   *
   * <pre>
   * Maximum cardinality (a number of *)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String max = 6;</code>
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
   * <code>.google.fhir.stu3.proto.String max = 6;</code>
   *
   * @return The max.
   */
  com.google.fhir.stu3.proto.String getMax();
  /**
   *
   *
   * <pre>
   * Maximum cardinality (a number of *)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String max = 6;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getMaxOrBuilder();

  /**
   *
   *
   * <pre>
   * A brief description of the parameter
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String documentation = 7;</code>
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
   * <code>.google.fhir.stu3.proto.String documentation = 7;</code>
   *
   * @return The documentation.
   */
  com.google.fhir.stu3.proto.String getDocumentation();
  /**
   *
   *
   * <pre>
   * A brief description of the parameter
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String documentation = 7;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getDocumentationOrBuilder();

  /**
   *
   *
   * <pre>
   * What type of value
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.FHIRAllTypesCode type = 8 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * What type of value
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.FHIRAllTypesCode type = 8 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The type.
   */
  com.google.fhir.stu3.proto.FHIRAllTypesCode getType();
  /**
   *
   *
   * <pre>
   * What type of value
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.FHIRAllTypesCode type = 8 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.FHIRAllTypesCodeOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * What profile the value is expected to be
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference profile = 9 [(.google.fhir.proto.valid_reference_type) = "StructureDefinition"];
   * </code>
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
   * <code>
   * .google.fhir.stu3.proto.Reference profile = 9 [(.google.fhir.proto.valid_reference_type) = "StructureDefinition"];
   * </code>
   *
   * @return The profile.
   */
  com.google.fhir.stu3.proto.Reference getProfile();
  /**
   *
   *
   * <pre>
   * What profile the value is expected to be
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference profile = 9 [(.google.fhir.proto.valid_reference_type) = "StructureDefinition"];
   * </code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getProfileOrBuilder();
}
