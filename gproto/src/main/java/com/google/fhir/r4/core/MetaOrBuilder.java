// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/datatypes.proto

package com.google.fhir.r4.core;

public interface MetaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.Meta)
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
   * Version specific identifier
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id version_id = 3;</code>
   *
   * @return Whether the versionId field is set.
   */
  boolean hasVersionId();
  /**
   *
   *
   * <pre>
   * Version specific identifier
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id version_id = 3;</code>
   *
   * @return The versionId.
   */
  com.google.fhir.r4.core.Id getVersionId();
  /**
   *
   *
   * <pre>
   * Version specific identifier
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id version_id = 3;</code>
   */
  com.google.fhir.r4.core.IdOrBuilder getVersionIdOrBuilder();

  /**
   *
   *
   * <pre>
   * When the resource version last changed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant last_updated = 4;</code>
   *
   * @return Whether the lastUpdated field is set.
   */
  boolean hasLastUpdated();
  /**
   *
   *
   * <pre>
   * When the resource version last changed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant last_updated = 4;</code>
   *
   * @return The lastUpdated.
   */
  com.google.fhir.r4.core.Instant getLastUpdated();
  /**
   *
   *
   * <pre>
   * When the resource version last changed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant last_updated = 4;</code>
   */
  com.google.fhir.r4.core.InstantOrBuilder getLastUpdatedOrBuilder();

  /**
   *
   *
   * <pre>
   * Identifies where the resource comes from
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri source = 5;</code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   *
   *
   * <pre>
   * Identifies where the resource comes from
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri source = 5;</code>
   *
   * @return The source.
   */
  com.google.fhir.r4.core.Uri getSource();
  /**
   *
   *
   * <pre>
   * Identifies where the resource comes from
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri source = 5;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Profiles this resource claims to conform to
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical profile = 6;</code>
   */
  java.util.List<com.google.fhir.r4.core.Canonical> getProfileList();
  /**
   *
   *
   * <pre>
   * Profiles this resource claims to conform to
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical profile = 6;</code>
   */
  com.google.fhir.r4.core.Canonical getProfile(int index);
  /**
   *
   *
   * <pre>
   * Profiles this resource claims to conform to
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical profile = 6;</code>
   */
  int getProfileCount();
  /**
   *
   *
   * <pre>
   * Profiles this resource claims to conform to
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical profile = 6;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CanonicalOrBuilder> getProfileOrBuilderList();
  /**
   *
   *
   * <pre>
   * Profiles this resource claims to conform to
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical profile = 6;</code>
   */
  com.google.fhir.r4.core.CanonicalOrBuilder getProfileOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Security Labels applied to this resource
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding security = 7;</code>
   */
  java.util.List<com.google.fhir.r4.core.Coding> getSecurityList();
  /**
   *
   *
   * <pre>
   * Security Labels applied to this resource
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding security = 7;</code>
   */
  com.google.fhir.r4.core.Coding getSecurity(int index);
  /**
   *
   *
   * <pre>
   * Security Labels applied to this resource
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding security = 7;</code>
   */
  int getSecurityCount();
  /**
   *
   *
   * <pre>
   * Security Labels applied to this resource
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding security = 7;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodingOrBuilder> getSecurityOrBuilderList();
  /**
   *
   *
   * <pre>
   * Security Labels applied to this resource
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding security = 7;</code>
   */
  com.google.fhir.r4.core.CodingOrBuilder getSecurityOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Tags applied to this resource
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding tag = 8;</code>
   */
  java.util.List<com.google.fhir.r4.core.Coding> getTagList();
  /**
   *
   *
   * <pre>
   * Tags applied to this resource
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding tag = 8;</code>
   */
  com.google.fhir.r4.core.Coding getTag(int index);
  /**
   *
   *
   * <pre>
   * Tags applied to this resource
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding tag = 8;</code>
   */
  int getTagCount();
  /**
   *
   *
   * <pre>
   * Tags applied to this resource
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding tag = 8;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodingOrBuilder> getTagOrBuilderList();
  /**
   *
   *
   * <pre>
   * Tags applied to this resource
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Coding tag = 8;</code>
   */
  com.google.fhir.r4.core.CodingOrBuilder getTagOrBuilder(int index);
}
