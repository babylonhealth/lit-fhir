// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface QuestionnaireResponseAuthorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.QuestionnaireResponseAuthor)
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
   * <code>
   * .google.fhir.stu3.proto.QuestionnaireResponseAuthor.Value value = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>
   * .google.fhir.stu3.proto.QuestionnaireResponseAuthor.Value value = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The value.
   */
  com.google.fhir.stu3.proto.QuestionnaireResponseAuthor.Value getValue();
  /**
   * <code>
   * .google.fhir.stu3.proto.QuestionnaireResponseAuthor.Value value = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  com.google.fhir.stu3.proto.QuestionnaireResponseAuthor.ValueOrBuilder getValueOrBuilder();
}
