// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/datatypes.proto

package com.google.fhir.r4.core;

/**
 *
 *
 * <pre>
 * Auto-generated from StructureDefinition for uuid, last updated
 * 2019-11-01T09:29:23.356+11:00. Primitive Type uuid. See
 * http://hl7.org/fhir/StructureDefinition/uuid
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.Uuid}
 */
public final class Uuid extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.Uuid)
    UuidOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Uuid.newBuilder() to construct.
  private Uuid(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Uuid() {
    value_ = "";
    extension_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Uuid();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Uuid(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              java.lang.String s = input.readStringRequireUtf8();

              value_ = s;
              break;
            }
          case 18:
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                extension_ = new java.util.ArrayList<com.google.fhir.r4.core.Extension>();
                mutable_bitField0_ |= 0x00000001;
              }
              extension_.add(
                  input.readMessage(com.google.fhir.r4.core.Extension.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        extension_ = java.util.Collections.unmodifiableList(extension_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.fhir.r4.core.Datatypes.internal_static_google_fhir_r4_core_Uuid_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Datatypes
        .internal_static_google_fhir_r4_core_Uuid_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.Uuid.class, com.google.fhir.r4.core.Uuid.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private volatile java.lang.Object value_;
  /**
   *
   *
   * <pre>
   * Primitive value for uuid
   * </pre>
   *
   * <code>string value = 1;</code>
   *
   * @return The value.
   */
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Primitive value for uuid
   * </pre>
   *
   * <code>string value = 1;</code>
   *
   * @return The bytes for value.
   */
  public com.google.protobuf.ByteString getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 2;
  private com.google.fhir.r4.core.String id_;
  /**
   *
   *
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 2;</code>
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
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 2;</code>
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
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 2;</code>
   */
  public com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int EXTENSION_FIELD_NUMBER = 3;
  private java.util.List<com.google.fhir.r4.core.Extension> extension_;
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
   */
  public java.util.List<com.google.fhir.r4.core.Extension> getExtensionList() {
    return extension_;
  }
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
   */
  public java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder>
      getExtensionOrBuilderList() {
    return extension_;
  }
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
   */
  public int getExtensionCount() {
    return extension_.size();
  }
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
   */
  public com.google.fhir.r4.core.Extension getExtension(int index) {
    return extension_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
   */
  public com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(int index) {
    return extension_.get(index);
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
    if (!getValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, value_);
    }
    if (id_ != null) {
      output.writeMessage(2, getId());
    }
    for (int i = 0; i < extension_.size(); i++) {
      output.writeMessage(3, extension_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, value_);
    }
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getId());
    }
    for (int i = 0; i < extension_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, extension_.get(i));
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
    if (!(obj instanceof com.google.fhir.r4.core.Uuid)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.Uuid other = (com.google.fhir.r4.core.Uuid) obj;

    if (!getValue().equals(other.getValue())) return false;
    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId().equals(other.getId())) return false;
    }
    if (!getExtensionList().equals(other.getExtensionList())) return false;
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (getExtensionCount() > 0) {
      hash = (37 * hash) + EXTENSION_FIELD_NUMBER;
      hash = (53 * hash) + getExtensionList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.r4.core.Uuid parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.Uuid parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.Uuid parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.Uuid parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.Uuid parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.Uuid parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.Uuid parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.Uuid parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.Uuid parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.Uuid parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.Uuid parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.Uuid parseFrom(
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

  public static Builder newBuilder(com.google.fhir.r4.core.Uuid prototype) {
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
   * Auto-generated from StructureDefinition for uuid, last updated
   * 2019-11-01T09:29:23.356+11:00. Primitive Type uuid. See
   * http://hl7.org/fhir/StructureDefinition/uuid
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.Uuid}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.Uuid)
      com.google.fhir.r4.core.UuidOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.r4.core.Datatypes.internal_static_google_fhir_r4_core_Uuid_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Datatypes
          .internal_static_google_fhir_r4_core_Uuid_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.Uuid.class, com.google.fhir.r4.core.Uuid.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.Uuid.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getExtensionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      value_ = "";

      if (idBuilder_ == null) {
        id_ = null;
      } else {
        id_ = null;
        idBuilder_ = null;
      }
      if (extensionBuilder_ == null) {
        extension_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        extensionBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.fhir.r4.core.Datatypes.internal_static_google_fhir_r4_core_Uuid_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.Uuid getDefaultInstanceForType() {
      return com.google.fhir.r4.core.Uuid.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.Uuid build() {
      com.google.fhir.r4.core.Uuid result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.Uuid buildPartial() {
      com.google.fhir.r4.core.Uuid result = new com.google.fhir.r4.core.Uuid(this);
      int from_bitField0_ = bitField0_;
      result.value_ = value_;
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (extensionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          extension_ = java.util.Collections.unmodifiableList(extension_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.extension_ = extension_;
      } else {
        result.extension_ = extensionBuilder_.build();
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
      if (other instanceof com.google.fhir.r4.core.Uuid) {
        return mergeFrom((com.google.fhir.r4.core.Uuid) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.Uuid other) {
      if (other == com.google.fhir.r4.core.Uuid.getDefaultInstance()) return this;
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        onChanged();
      }
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (extensionBuilder_ == null) {
        if (!other.extension_.isEmpty()) {
          if (extension_.isEmpty()) {
            extension_ = other.extension_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExtensionIsMutable();
            extension_.addAll(other.extension_);
          }
          onChanged();
        }
      } else {
        if (!other.extension_.isEmpty()) {
          if (extensionBuilder_.isEmpty()) {
            extensionBuilder_.dispose();
            extensionBuilder_ = null;
            extension_ = other.extension_;
            bitField0_ = (bitField0_ & ~0x00000001);
            extensionBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getExtensionFieldBuilder()
                    : null;
          } else {
            extensionBuilder_.addAllMessages(other.extension_);
          }
        }
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
      com.google.fhir.r4.core.Uuid parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.r4.core.Uuid) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object value_ = "";
    /**
     *
     *
     * <pre>
     * Primitive value for uuid
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Primitive value for uuid
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Primitive value for uuid
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      value_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Primitive value for uuid
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValue() {

      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Primitive value for uuid
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      value_ = value;
      onChanged();
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
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 2;</code>
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
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 2;</code>
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
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 2;</code>
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
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 2;</code>
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
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 2;</code>
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
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 2;</code>
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
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 2;</code>
     */
    public com.google.fhir.r4.core.String.Builder getIdBuilder() {

      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 2;</code>
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
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 2;</code>
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

    private java.util.List<com.google.fhir.r4.core.Extension> extension_ =
        java.util.Collections.emptyList();

    private void ensureExtensionIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        extension_ = new java.util.ArrayList<com.google.fhir.r4.core.Extension>(extension_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.fhir.r4.core.Extension,
            com.google.fhir.r4.core.Extension.Builder,
            com.google.fhir.r4.core.ExtensionOrBuilder>
        extensionBuilder_;

    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public java.util.List<com.google.fhir.r4.core.Extension> getExtensionList() {
      if (extensionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(extension_);
      } else {
        return extensionBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public int getExtensionCount() {
      if (extensionBuilder_ == null) {
        return extension_.size();
      } else {
        return extensionBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public com.google.fhir.r4.core.Extension getExtension(int index) {
      if (extensionBuilder_ == null) {
        return extension_.get(index);
      } else {
        return extensionBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public Builder setExtension(int index, com.google.fhir.r4.core.Extension value) {
      if (extensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtensionIsMutable();
        extension_.set(index, value);
        onChanged();
      } else {
        extensionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public Builder setExtension(
        int index, com.google.fhir.r4.core.Extension.Builder builderForValue) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.set(index, builderForValue.build());
        onChanged();
      } else {
        extensionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public Builder addExtension(com.google.fhir.r4.core.Extension value) {
      if (extensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtensionIsMutable();
        extension_.add(value);
        onChanged();
      } else {
        extensionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public Builder addExtension(int index, com.google.fhir.r4.core.Extension value) {
      if (extensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtensionIsMutable();
        extension_.add(index, value);
        onChanged();
      } else {
        extensionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public Builder addExtension(com.google.fhir.r4.core.Extension.Builder builderForValue) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.add(builderForValue.build());
        onChanged();
      } else {
        extensionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public Builder addExtension(
        int index, com.google.fhir.r4.core.Extension.Builder builderForValue) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.add(index, builderForValue.build());
        onChanged();
      } else {
        extensionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public Builder addAllExtension(
        java.lang.Iterable<? extends com.google.fhir.r4.core.Extension> values) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, extension_);
        onChanged();
      } else {
        extensionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public Builder clearExtension() {
      if (extensionBuilder_ == null) {
        extension_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        extensionBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public Builder removeExtension(int index) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.remove(index);
        onChanged();
      } else {
        extensionBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public com.google.fhir.r4.core.Extension.Builder getExtensionBuilder(int index) {
      return getExtensionFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(int index) {
      if (extensionBuilder_ == null) {
        return extension_.get(index);
      } else {
        return extensionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder>
        getExtensionOrBuilderList() {
      if (extensionBuilder_ != null) {
        return extensionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(extension_);
      }
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public com.google.fhir.r4.core.Extension.Builder addExtensionBuilder() {
      return getExtensionFieldBuilder()
          .addBuilder(com.google.fhir.r4.core.Extension.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public com.google.fhir.r4.core.Extension.Builder addExtensionBuilder(int index) {
      return getExtensionFieldBuilder()
          .addBuilder(index, com.google.fhir.r4.core.Extension.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Additional content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.r4.core.Extension extension = 3;</code>
     */
    public java.util.List<com.google.fhir.r4.core.Extension.Builder> getExtensionBuilderList() {
      return getExtensionFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.fhir.r4.core.Extension,
            com.google.fhir.r4.core.Extension.Builder,
            com.google.fhir.r4.core.ExtensionOrBuilder>
        getExtensionFieldBuilder() {
      if (extensionBuilder_ == null) {
        extensionBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.fhir.r4.core.Extension,
                com.google.fhir.r4.core.Extension.Builder,
                com.google.fhir.r4.core.ExtensionOrBuilder>(
                extension_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        extension_ = null;
      }
      return extensionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.Uuid)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.Uuid)
  private static final com.google.fhir.r4.core.Uuid DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.Uuid();
  }

  public static com.google.fhir.r4.core.Uuid getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Uuid> PARSER =
      new com.google.protobuf.AbstractParser<Uuid>() {
        @java.lang.Override
        public Uuid parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Uuid(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Uuid> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Uuid> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.Uuid getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
