// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/profile_config.proto

package com.google.fhir.proto;

public interface ElementDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.proto.ElementData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name for the element.
   * For top-level elements:
   * * This will be the name of the generated message
   * * Must TitleCased and unique within all top-level elements in the package.
   * * The url will be this name appended to Extensions#base_url.
   * For subfields:
   * * This will be the name of the field
   * * Must jsonCased and unique within the containing message.
   * * If this represents a container field, the generated message will be
   *   this name in TitleCase.
   * * The url will be equal to the name.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name for the element.
   * For top-level elements:
   * * This will be the name of the generated message
   * * Must TitleCased and unique within all top-level elements in the package.
   * * The url will be this name appended to Extensions#base_url.
   * For subfields:
   * * This will be the name of the field
   * * Must jsonCased and unique within the containing message.
   * * If this represents a container field, the generated message will be
   *   this name in TitleCase.
   * * The url will be equal to the name.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   * <code>.google.fhir.proto.SizeRestriction size_restriction = 2;</code>
   *
   * @return The enum numeric value on the wire for sizeRestriction.
   */
  int getSizeRestrictionValue();
  /**
   * <code>.google.fhir.proto.SizeRestriction size_restriction = 2;</code>
   *
   * @return The sizeRestriction.
   */
  com.google.fhir.proto.SizeRestriction getSizeRestriction();

  /**
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Short description.
   * Optional - will re-use description if absent
   * </pre>
   *
   * <code>string short = 4;</code>
   *
   * @return The short.
   */
  java.lang.String getShort();
  /**
   *
   *
   * <pre>
   * Short description.
   * Optional - will re-use description if absent
   * </pre>
   *
   * <code>string short = 4;</code>
   *
   * @return The bytes for short.
   */
  com.google.protobuf.ByteString getShortBytes();

  /**
   *
   *
   * <pre>
   * Free-form comment
   * Optional
   * </pre>
   *
   * <code>string comment = 5;</code>
   *
   * @return The comment.
   */
  java.lang.String getComment();
  /**
   *
   *
   * <pre>
   * Free-form comment
   * Optional
   * </pre>
   *
   * <code>string comment = 5;</code>
   *
   * @return The bytes for comment.
   */
  com.google.protobuf.ByteString getCommentBytes();

  /**
   *
   *
   * <pre>
   * If set, provides an override for the structure definition URL.
   * Should ONLY be used on top-level elements.
   * </pre>
   *
   * <code>string url_override = 6;</code>
   *
   * @return The urlOverride.
   */
  java.lang.String getUrlOverride();
  /**
   *
   *
   * <pre>
   * If set, provides an override for the structure definition URL.
   * Should ONLY be used on top-level elements.
   * </pre>
   *
   * <code>string url_override = 6;</code>
   *
   * @return The bytes for urlOverride.
   */
  com.google.protobuf.ByteString getUrlOverrideBytes();
}
