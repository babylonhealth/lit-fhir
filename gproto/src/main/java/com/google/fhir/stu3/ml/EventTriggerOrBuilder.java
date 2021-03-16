// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/ml_extensions.proto

package com.google.fhir.stu3.ml;

public interface EventTriggerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.ml.EventTrigger)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   * @return The id.
   */
  com.google.fhir.stu3.proto.String getId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The type of trigger, part of the prediction task definition.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Coding type = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "extension.exists() != value.exists()"];</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * The type of trigger, part of the prediction task definition.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Coding type = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "extension.exists() != value.exists()"];</code>
   * @return The type.
   */
  com.google.fhir.stu3.proto.Coding getType();
  /**
   * <pre>
   * The type of trigger, part of the prediction task definition.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Coding type = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "extension.exists() != value.exists()"];</code>
   */
  com.google.fhir.stu3.proto.CodingOrBuilder getTypeOrBuilder();

  /**
   * <pre>
   * Prediction event time, more recent data will be elided.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime event_time = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "extension.exists() != value.exists()"];</code>
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   * <pre>
   * Prediction event time, more recent data will be elided.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime event_time = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "extension.exists() != value.exists()"];</code>
   * @return The eventTime.
   */
  com.google.fhir.stu3.proto.DateTime getEventTime();
  /**
   * <pre>
   * Prediction event time, more recent data will be elided.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime event_time = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.fhir_path_constraint) = "extension.exists() != value.exists()"];</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getEventTimeOrBuilder();

  /**
   * <pre>
   * Resource that owns this trigger.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference source = 6 [(.google.fhir.proto.fhir_path_constraint) = "extension.exists() != value.exists()"];</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <pre>
   * Resource that owns this trigger.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference source = 6 [(.google.fhir.proto.fhir_path_constraint) = "extension.exists() != value.exists()"];</code>
   * @return The source.
   */
  com.google.fhir.stu3.proto.Reference getSource();
  /**
   * <pre>
   * Resource that owns this trigger.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference source = 6 [(.google.fhir.proto.fhir_path_constraint) = "extension.exists() != value.exists()"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSourceOrBuilder();
}
