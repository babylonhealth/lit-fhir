// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/profile_config.proto

package com.google.fhir.proto;

public interface SimpleExtensionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.proto.SimpleExtension)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.fhir.proto.ElementData element_data = 1;</code>
   *
   * @return Whether the elementData field is set.
   */
  boolean hasElementData();
  /**
   * <code>.google.fhir.proto.ElementData element_data = 1;</code>
   *
   * @return The elementData.
   */
  com.google.fhir.proto.ElementData getElementData();
  /** <code>.google.fhir.proto.ElementData element_data = 1;</code> */
  com.google.fhir.proto.ElementDataOrBuilder getElementDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Must be one of the types listed in the Extension.value[x] element here:
   * http://hl7.org/fhir/extension.profile.json
   * If this field has size &gt; 1 it will generate a choice-type value
   * </pre>
   *
   * <code>repeated string type = 2;</code>
   *
   * @return A list containing the type.
   */
  java.util.List<java.lang.String> getTypeList();
  /**
   *
   *
   * <pre>
   * Must be one of the types listed in the Extension.value[x] element here:
   * http://hl7.org/fhir/extension.profile.json
   * If this field has size &gt; 1 it will generate a choice-type value
   * </pre>
   *
   * <code>repeated string type = 2;</code>
   *
   * @return The count of type.
   */
  int getTypeCount();
  /**
   *
   *
   * <pre>
   * Must be one of the types listed in the Extension.value[x] element here:
   * http://hl7.org/fhir/extension.profile.json
   * If this field has size &gt; 1 it will generate a choice-type value
   * </pre>
   *
   * <code>repeated string type = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The type at the given index.
   */
  java.lang.String getType(int index);
  /**
   *
   *
   * <pre>
   * Must be one of the types listed in the Extension.value[x] element here:
   * http://hl7.org/fhir/extension.profile.json
   * If this field has size &gt; 1 it will generate a choice-type value
   * </pre>
   *
   * <code>repeated string type = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the type at the given index.
   */
  com.google.protobuf.ByteString getTypeBytes(int index);

  /**
   *
   *
   * <pre>
   * Code types can have further specifications -
   * e.g., fixed system, proto code type, or fixed values.
   * </pre>
   *
   * <code>.google.fhir.proto.CodeData code_type = 3;</code>
   *
   * @return Whether the codeType field is set.
   */
  boolean hasCodeType();
  /**
   *
   *
   * <pre>
   * Code types can have further specifications -
   * e.g., fixed system, proto code type, or fixed values.
   * </pre>
   *
   * <code>.google.fhir.proto.CodeData code_type = 3;</code>
   *
   * @return The codeType.
   */
  com.google.fhir.proto.CodeData getCodeType();
  /**
   *
   *
   * <pre>
   * Code types can have further specifications -
   * e.g., fixed system, proto code type, or fixed values.
   * </pre>
   *
   * <code>.google.fhir.proto.CodeData code_type = 3;</code>
   */
  com.google.fhir.proto.CodeDataOrBuilder getCodeTypeOrBuilder();

  /**
   * <code>bool can_have_extensions = 4;</code>
   *
   * @return The canHaveExtensions.
   */
  boolean getCanHaveExtensions();
}
