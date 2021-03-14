// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface DataElementContactAddressOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.DataElementContactAddress)
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
   * <code>.google.fhir.stu3.proto.Address value_address = 3;</code>
   *
   * @return Whether the valueAddress field is set.
   */
  boolean hasValueAddress();
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Address value_address = 3;</code>
   *
   * @return The valueAddress.
   */
  com.google.fhir.stu3.proto.Address getValueAddress();
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Address value_address = 3;</code>
   */
  com.google.fhir.stu3.proto.AddressOrBuilder getValueAddressOrBuilder();
}