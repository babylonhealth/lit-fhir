// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface ProcedureScheduleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.ProcedureSchedule)
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
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
   *
   * @return Whether the valueTiming field is set.
   */
  boolean hasValueTiming();
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
   *
   * @return The valueTiming.
   */
  com.google.fhir.stu3.proto.Timing getValueTiming();
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
   */
  com.google.fhir.stu3.proto.TimingOrBuilder getValueTimingOrBuilder();
}
