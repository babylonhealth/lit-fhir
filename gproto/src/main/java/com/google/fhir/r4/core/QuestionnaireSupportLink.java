// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/extensions.proto

package com.google.fhir.r4.core;

/**
 * <pre>
 * Auto-generated from StructureDefinition for supportLink.
 * Supporting information.
 * See http://hl7.org/fhir/StructureDefinition/questionnaire-supportLink
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.QuestionnaireSupportLink}
 */
public final class QuestionnaireSupportLink extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.QuestionnaireSupportLink)
    QuestionnaireSupportLinkOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuestionnaireSupportLink.newBuilder() to construct.
  private QuestionnaireSupportLink(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuestionnaireSupportLink() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuestionnaireSupportLink();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QuestionnaireSupportLink(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.fhir.r4.core.String.Builder subBuilder = null;
            if (id_ != null) {
              subBuilder = id_.toBuilder();
            }
            id_ = input.readMessage(com.google.fhir.r4.core.String.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(id_);
              id_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.fhir.r4.core.Uri.Builder subBuilder = null;
            if (valueUri_ != null) {
              subBuilder = valueUri_.toBuilder();
            }
            valueUri_ = input.readMessage(com.google.fhir.r4.core.Uri.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(valueUri_);
              valueUri_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_QuestionnaireSupportLink_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_QuestionnaireSupportLink_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.QuestionnaireSupportLink.class, com.google.fhir.r4.core.QuestionnaireSupportLink.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.google.fhir.r4.core.String id_;
  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public com.google.fhir.r4.core.String getId() {
    return id_ == null ? com.google.fhir.r4.core.String.getDefaultInstance() : id_;
  }
  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   */
  @java.lang.Override
  public com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int VALUE_URI_FIELD_NUMBER = 3;
  private com.google.fhir.r4.core.Uri valueUri_;
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the valueUri field is set.
   */
  @java.lang.Override
  public boolean hasValueUri() {
    return valueUri_ != null;
  }
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The valueUri.
   */
  @java.lang.Override
  public com.google.fhir.r4.core.Uri getValueUri() {
    return valueUri_ == null ? com.google.fhir.r4.core.Uri.getDefaultInstance() : valueUri_;
  }
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  @java.lang.Override
  public com.google.fhir.r4.core.UriOrBuilder getValueUriOrBuilder() {
    return getValueUri();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (valueUri_ != null) {
      output.writeMessage(3, getValueUri());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getId());
    }
    if (valueUri_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getValueUri());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.fhir.r4.core.QuestionnaireSupportLink)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.QuestionnaireSupportLink other = (com.google.fhir.r4.core.QuestionnaireSupportLink) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasValueUri() != other.hasValueUri()) return false;
    if (hasValueUri()) {
      if (!getValueUri()
          .equals(other.getValueUri())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasValueUri()) {
      hash = (37 * hash) + VALUE_URI_FIELD_NUMBER;
      hash = (53 * hash) + getValueUri().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.r4.core.QuestionnaireSupportLink parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.QuestionnaireSupportLink parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.QuestionnaireSupportLink parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.QuestionnaireSupportLink parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.QuestionnaireSupportLink parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.QuestionnaireSupportLink parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.QuestionnaireSupportLink parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.QuestionnaireSupportLink parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.r4.core.QuestionnaireSupportLink parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.QuestionnaireSupportLink parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.r4.core.QuestionnaireSupportLink parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.QuestionnaireSupportLink parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.fhir.r4.core.QuestionnaireSupportLink prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Auto-generated from StructureDefinition for supportLink.
   * Supporting information.
   * See http://hl7.org/fhir/StructureDefinition/questionnaire-supportLink
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.QuestionnaireSupportLink}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.QuestionnaireSupportLink)
      com.google.fhir.r4.core.QuestionnaireSupportLinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_QuestionnaireSupportLink_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_QuestionnaireSupportLink_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.QuestionnaireSupportLink.class, com.google.fhir.r4.core.QuestionnaireSupportLink.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.QuestionnaireSupportLink.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (idBuilder_ == null) {
        id_ = null;
      } else {
        id_ = null;
        idBuilder_ = null;
      }
      if (valueUriBuilder_ == null) {
        valueUri_ = null;
      } else {
        valueUri_ = null;
        valueUriBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_QuestionnaireSupportLink_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.QuestionnaireSupportLink getDefaultInstanceForType() {
      return com.google.fhir.r4.core.QuestionnaireSupportLink.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.QuestionnaireSupportLink build() {
      com.google.fhir.r4.core.QuestionnaireSupportLink result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.QuestionnaireSupportLink buildPartial() {
      com.google.fhir.r4.core.QuestionnaireSupportLink result = new com.google.fhir.r4.core.QuestionnaireSupportLink(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (valueUriBuilder_ == null) {
        result.valueUri_ = valueUri_;
      } else {
        result.valueUri_ = valueUriBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.fhir.r4.core.QuestionnaireSupportLink) {
        return mergeFrom((com.google.fhir.r4.core.QuestionnaireSupportLink)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.QuestionnaireSupportLink other) {
      if (other == com.google.fhir.r4.core.QuestionnaireSupportLink.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasValueUri()) {
        mergeValueUri(other.getValueUri());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.fhir.r4.core.QuestionnaireSupportLink parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.r4.core.QuestionnaireSupportLink) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.fhir.r4.core.String id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.r4.core.String, com.google.fhir.r4.core.String.Builder, com.google.fhir.r4.core.StringOrBuilder> idBuilder_;
    /**
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     * @return The id.
     */
    public com.google.fhir.r4.core.String getId() {
      if (idBuilder_ == null) {
        return id_ == null ? com.google.fhir.r4.core.String.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public Builder setId(com.google.fhir.r4.core.String value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
        onChanged();
      } else {
        idBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public Builder setId(
        com.google.fhir.r4.core.String.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public Builder mergeId(com.google.fhir.r4.core.String value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ =
            com.google.fhir.r4.core.String.newBuilder(id_).mergeFrom(value).buildPartial();
        } else {
          id_ = value;
        }
        onChanged();
      } else {
        idBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public Builder clearId() {
      if (idBuilder_ == null) {
        id_ = null;
        onChanged();
      } else {
        id_ = null;
        idBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public com.google.fhir.r4.core.String.Builder getIdBuilder() {
      
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            com.google.fhir.r4.core.String.getDefaultInstance() : id_;
      }
    }
    /**
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.r4.core.String, com.google.fhir.r4.core.String.Builder, com.google.fhir.r4.core.StringOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.r4.core.String, com.google.fhir.r4.core.String.Builder, com.google.fhir.r4.core.StringOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private com.google.fhir.r4.core.Uri valueUri_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.r4.core.Uri, com.google.fhir.r4.core.Uri.Builder, com.google.fhir.r4.core.UriOrBuilder> valueUriBuilder_;
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     * @return Whether the valueUri field is set.
     */
    public boolean hasValueUri() {
      return valueUriBuilder_ != null || valueUri_ != null;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     * @return The valueUri.
     */
    public com.google.fhir.r4.core.Uri getValueUri() {
      if (valueUriBuilder_ == null) {
        return valueUri_ == null ? com.google.fhir.r4.core.Uri.getDefaultInstance() : valueUri_;
      } else {
        return valueUriBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     */
    public Builder setValueUri(com.google.fhir.r4.core.Uri value) {
      if (valueUriBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueUri_ = value;
        onChanged();
      } else {
        valueUriBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     */
    public Builder setValueUri(
        com.google.fhir.r4.core.Uri.Builder builderForValue) {
      if (valueUriBuilder_ == null) {
        valueUri_ = builderForValue.build();
        onChanged();
      } else {
        valueUriBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     */
    public Builder mergeValueUri(com.google.fhir.r4.core.Uri value) {
      if (valueUriBuilder_ == null) {
        if (valueUri_ != null) {
          valueUri_ =
            com.google.fhir.r4.core.Uri.newBuilder(valueUri_).mergeFrom(value).buildPartial();
        } else {
          valueUri_ = value;
        }
        onChanged();
      } else {
        valueUriBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     */
    public Builder clearValueUri() {
      if (valueUriBuilder_ == null) {
        valueUri_ = null;
        onChanged();
      } else {
        valueUri_ = null;
        valueUriBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     */
    public com.google.fhir.r4.core.Uri.Builder getValueUriBuilder() {
      
      onChanged();
      return getValueUriFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     */
    public com.google.fhir.r4.core.UriOrBuilder getValueUriOrBuilder() {
      if (valueUriBuilder_ != null) {
        return valueUriBuilder_.getMessageOrBuilder();
      } else {
        return valueUri_ == null ?
            com.google.fhir.r4.core.Uri.getDefaultInstance() : valueUri_;
      }
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Uri value_uri = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.r4.core.Uri, com.google.fhir.r4.core.Uri.Builder, com.google.fhir.r4.core.UriOrBuilder> 
        getValueUriFieldBuilder() {
      if (valueUriBuilder_ == null) {
        valueUriBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.r4.core.Uri, com.google.fhir.r4.core.Uri.Builder, com.google.fhir.r4.core.UriOrBuilder>(
                getValueUri(),
                getParentForChildren(),
                isClean());
        valueUri_ = null;
      }
      return valueUriBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.QuestionnaireSupportLink)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.QuestionnaireSupportLink)
  private static final com.google.fhir.r4.core.QuestionnaireSupportLink DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.QuestionnaireSupportLink();
  }

  public static com.google.fhir.r4.core.QuestionnaireSupportLink getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuestionnaireSupportLink>
      PARSER = new com.google.protobuf.AbstractParser<QuestionnaireSupportLink>() {
    @java.lang.Override
    public QuestionnaireSupportLink parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QuestionnaireSupportLink(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QuestionnaireSupportLink> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuestionnaireSupportLink> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.QuestionnaireSupportLink getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

