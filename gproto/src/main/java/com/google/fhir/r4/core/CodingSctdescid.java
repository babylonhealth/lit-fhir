// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/extensions.proto

package com.google.fhir.r4.core;

/**
 *
 *
 * <pre>
 * Auto-generated from StructureDefinition for sctdescid.
 * SNOMED CT Description ID.
 * See http://hl7.org/fhir/StructureDefinition/coding-sctdescid
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.CodingSctdescid}
 */
public final class CodingSctdescid extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.CodingSctdescid)
    CodingSctdescidOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CodingSctdescid.newBuilder() to construct.
  private CodingSctdescid(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CodingSctdescid() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CodingSctdescid();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CodingSctdescid(
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
          case 10:
            {
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
          case 26:
            {
              com.google.fhir.r4.core.Id.Builder subBuilder = null;
              if (valueId_ != null) {
                subBuilder = valueId_.toBuilder();
              }
              valueId_ = input.readMessage(com.google.fhir.r4.core.Id.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(valueId_);
                valueId_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.fhir.r4.core.Extensions
        .internal_static_google_fhir_r4_core_CodingSctdescid_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Extensions
        .internal_static_google_fhir_r4_core_CodingSctdescid_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.CodingSctdescid.class,
            com.google.fhir.r4.core.CodingSctdescid.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.google.fhir.r4.core.String id_;
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
  public boolean hasId() {
    return id_ != null;
  }
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
  public com.google.fhir.r4.core.String getId() {
    return id_ == null ? com.google.fhir.r4.core.String.getDefaultInstance() : id_;
  }
  /**
   *
   *
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   */
  public com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int VALUE_ID_FIELD_NUMBER = 3;
  private com.google.fhir.r4.core.Id valueId_;
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Id value_id = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the valueId field is set.
   */
  public boolean hasValueId() {
    return valueId_ != null;
  }
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Id value_id = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The valueId.
   */
  public com.google.fhir.r4.core.Id getValueId() {
    return valueId_ == null ? com.google.fhir.r4.core.Id.getDefaultInstance() : valueId_;
  }
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Id value_id = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  public com.google.fhir.r4.core.IdOrBuilder getValueIdOrBuilder() {
    return getValueId();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (valueId_ != null) {
      output.writeMessage(3, getValueId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getId());
    }
    if (valueId_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getValueId());
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
    if (!(obj instanceof com.google.fhir.r4.core.CodingSctdescid)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.CodingSctdescid other = (com.google.fhir.r4.core.CodingSctdescid) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId().equals(other.getId())) return false;
    }
    if (hasValueId() != other.hasValueId()) return false;
    if (hasValueId()) {
      if (!getValueId().equals(other.getValueId())) return false;
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
    if (hasValueId()) {
      hash = (37 * hash) + VALUE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getValueId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.r4.core.CodingSctdescid parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.CodingSctdescid parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.CodingSctdescid parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.CodingSctdescid parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.CodingSctdescid parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.CodingSctdescid parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.CodingSctdescid parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.CodingSctdescid parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.CodingSctdescid parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.CodingSctdescid parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.CodingSctdescid parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.CodingSctdescid parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.fhir.r4.core.CodingSctdescid prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Auto-generated from StructureDefinition for sctdescid.
   * SNOMED CT Description ID.
   * See http://hl7.org/fhir/StructureDefinition/coding-sctdescid
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.CodingSctdescid}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.CodingSctdescid)
      com.google.fhir.r4.core.CodingSctdescidOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.r4.core.Extensions
          .internal_static_google_fhir_r4_core_CodingSctdescid_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Extensions
          .internal_static_google_fhir_r4_core_CodingSctdescid_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.CodingSctdescid.class,
              com.google.fhir.r4.core.CodingSctdescid.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.CodingSctdescid.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
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
      if (valueIdBuilder_ == null) {
        valueId_ = null;
      } else {
        valueId_ = null;
        valueIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.fhir.r4.core.Extensions
          .internal_static_google_fhir_r4_core_CodingSctdescid_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.CodingSctdescid getDefaultInstanceForType() {
      return com.google.fhir.r4.core.CodingSctdescid.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.CodingSctdescid build() {
      com.google.fhir.r4.core.CodingSctdescid result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.CodingSctdescid buildPartial() {
      com.google.fhir.r4.core.CodingSctdescid result =
          new com.google.fhir.r4.core.CodingSctdescid(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (valueIdBuilder_ == null) {
        result.valueId_ = valueId_;
      } else {
        result.valueId_ = valueIdBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.fhir.r4.core.CodingSctdescid) {
        return mergeFrom((com.google.fhir.r4.core.CodingSctdescid) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.CodingSctdescid other) {
      if (other == com.google.fhir.r4.core.CodingSctdescid.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasValueId()) {
        mergeValueId(other.getValueId());
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
      com.google.fhir.r4.core.CodingSctdescid parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.r4.core.CodingSctdescid) e.getUnfinishedMessage();
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
            com.google.fhir.r4.core.String,
            com.google.fhir.r4.core.String.Builder,
            com.google.fhir.r4.core.StringOrBuilder>
        idBuilder_;
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
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
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
    public com.google.fhir.r4.core.String getId() {
      if (idBuilder_ == null) {
        return id_ == null ? com.google.fhir.r4.core.String.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     *
     *
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
     *
     *
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public Builder setId(com.google.fhir.r4.core.String.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public Builder mergeId(com.google.fhir.r4.core.String value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ = com.google.fhir.r4.core.String.newBuilder(id_).mergeFrom(value).buildPartial();
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
     *
     *
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
     *
     *
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
     *
     *
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
        return id_ == null ? com.google.fhir.r4.core.String.getDefaultInstance() : id_;
      }
    }
    /**
     *
     *
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.r4.core.String,
            com.google.fhir.r4.core.String.Builder,
            com.google.fhir.r4.core.StringOrBuilder>
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.fhir.r4.core.String,
                com.google.fhir.r4.core.String.Builder,
                com.google.fhir.r4.core.StringOrBuilder>(
                getId(), getParentForChildren(), isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private com.google.fhir.r4.core.Id valueId_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.r4.core.Id,
            com.google.fhir.r4.core.Id.Builder,
            com.google.fhir.r4.core.IdOrBuilder>
        valueIdBuilder_;
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.r4.core.Id value_id = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     *
     * @return Whether the valueId field is set.
     */
    public boolean hasValueId() {
      return valueIdBuilder_ != null || valueId_ != null;
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.r4.core.Id value_id = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     *
     * @return The valueId.
     */
    public com.google.fhir.r4.core.Id getValueId() {
      if (valueIdBuilder_ == null) {
        return valueId_ == null ? com.google.fhir.r4.core.Id.getDefaultInstance() : valueId_;
      } else {
        return valueIdBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.r4.core.Id value_id = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     */
    public Builder setValueId(com.google.fhir.r4.core.Id value) {
      if (valueIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueId_ = value;
        onChanged();
      } else {
        valueIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.r4.core.Id value_id = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     */
    public Builder setValueId(com.google.fhir.r4.core.Id.Builder builderForValue) {
      if (valueIdBuilder_ == null) {
        valueId_ = builderForValue.build();
        onChanged();
      } else {
        valueIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.r4.core.Id value_id = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     */
    public Builder mergeValueId(com.google.fhir.r4.core.Id value) {
      if (valueIdBuilder_ == null) {
        if (valueId_ != null) {
          valueId_ =
              com.google.fhir.r4.core.Id.newBuilder(valueId_).mergeFrom(value).buildPartial();
        } else {
          valueId_ = value;
        }
        onChanged();
      } else {
        valueIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.r4.core.Id value_id = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     */
    public Builder clearValueId() {
      if (valueIdBuilder_ == null) {
        valueId_ = null;
        onChanged();
      } else {
        valueId_ = null;
        valueIdBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.r4.core.Id value_id = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     */
    public com.google.fhir.r4.core.Id.Builder getValueIdBuilder() {

      onChanged();
      return getValueIdFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.r4.core.Id value_id = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     */
    public com.google.fhir.r4.core.IdOrBuilder getValueIdOrBuilder() {
      if (valueIdBuilder_ != null) {
        return valueIdBuilder_.getMessageOrBuilder();
      } else {
        return valueId_ == null ? com.google.fhir.r4.core.Id.getDefaultInstance() : valueId_;
      }
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.r4.core.Id value_id = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.r4.core.Id,
            com.google.fhir.r4.core.Id.Builder,
            com.google.fhir.r4.core.IdOrBuilder>
        getValueIdFieldBuilder() {
      if (valueIdBuilder_ == null) {
        valueIdBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.fhir.r4.core.Id,
                com.google.fhir.r4.core.Id.Builder,
                com.google.fhir.r4.core.IdOrBuilder>(
                getValueId(), getParentForChildren(), isClean());
        valueId_ = null;
      }
      return valueIdBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.CodingSctdescid)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.CodingSctdescid)
  private static final com.google.fhir.r4.core.CodingSctdescid DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.CodingSctdescid();
  }

  public static com.google.fhir.r4.core.CodingSctdescid getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CodingSctdescid> PARSER =
      new com.google.protobuf.AbstractParser<CodingSctdescid>() {
        @java.lang.Override
        public CodingSctdescid parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CodingSctdescid(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CodingSctdescid> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CodingSctdescid> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.CodingSctdescid getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}