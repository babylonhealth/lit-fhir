// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/metadatatypes.proto

package com.google.fhir.stu3.proto;

public interface NarrativeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.Narrative)
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
   * generated | extensions | additional | empty
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.NarrativeStatusCode status = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * generated | extensions | additional | empty
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.NarrativeStatusCode status = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The status.
   */
  com.google.fhir.stu3.proto.NarrativeStatusCode getStatus();
  /**
   *
   *
   * <pre>
   * generated | extensions | additional | empty
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.NarrativeStatusCode status = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.NarrativeStatusCodeOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Limited xhtml content
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Xhtml div = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "htmlchecks()", (.google.fhir.proto.fhir_path_constraint) = "htmlchecks()"];
   * </code>
   *
   * @return Whether the div field is set.
   */
  boolean hasDiv();
  /**
   *
   *
   * <pre>
   * Limited xhtml content
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Xhtml div = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "htmlchecks()", (.google.fhir.proto.fhir_path_constraint) = "htmlchecks()"];
   * </code>
   *
   * @return The div.
   */
  com.google.fhir.stu3.proto.Xhtml getDiv();
  /**
   *
   *
   * <pre>
   * Limited xhtml content
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Xhtml div = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "htmlchecks()", (.google.fhir.proto.fhir_path_constraint) = "htmlchecks()"];
   * </code>
   */
  com.google.fhir.stu3.proto.XhtmlOrBuilder getDivOrBuilder();
}
