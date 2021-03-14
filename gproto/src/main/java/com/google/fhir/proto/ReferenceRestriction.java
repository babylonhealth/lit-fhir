// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/profile_config.proto

package com.google.fhir.proto;

/**
 *
 *
 * <pre>
 * For Reference types, additional restrictions to apply
 * </pre>
 *
 * Protobuf type {@code google.fhir.proto.ReferenceRestriction}
 */
public final class ReferenceRestriction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.proto.ReferenceRestriction)
    ReferenceRestrictionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReferenceRestriction.newBuilder() to construct.
  private ReferenceRestriction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReferenceRestriction() {
    allowed_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReferenceRestriction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ReferenceRestriction(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                allowed_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              allowed_.add(s);
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
        allowed_ = allowed_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.fhir.proto.ProfileConfig
        .internal_static_google_fhir_proto_ReferenceRestriction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.proto.ProfileConfig
        .internal_static_google_fhir_proto_ReferenceRestriction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.proto.ReferenceRestriction.class,
            com.google.fhir.proto.ReferenceRestriction.Builder.class);
  }

  public static final int ALLOWED_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList allowed_;
  /**
   *
   *
   * <pre>
   * Allowed types to refer to.
   * Must use unprofiled FHIR resource type name,
   * e.g., Patient, Observation, Medication
   * </pre>
   *
   * <code>repeated string allowed = 1;</code>
   *
   * @return A list containing the allowed.
   */
  public com.google.protobuf.ProtocolStringList getAllowedList() {
    return allowed_;
  }
  /**
   *
   *
   * <pre>
   * Allowed types to refer to.
   * Must use unprofiled FHIR resource type name,
   * e.g., Patient, Observation, Medication
   * </pre>
   *
   * <code>repeated string allowed = 1;</code>
   *
   * @return The count of allowed.
   */
  public int getAllowedCount() {
    return allowed_.size();
  }
  /**
   *
   *
   * <pre>
   * Allowed types to refer to.
   * Must use unprofiled FHIR resource type name,
   * e.g., Patient, Observation, Medication
   * </pre>
   *
   * <code>repeated string allowed = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The allowed at the given index.
   */
  public java.lang.String getAllowed(int index) {
    return allowed_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Allowed types to refer to.
   * Must use unprofiled FHIR resource type name,
   * e.g., Patient, Observation, Medication
   * </pre>
   *
   * <code>repeated string allowed = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allowed at the given index.
   */
  public com.google.protobuf.ByteString getAllowedBytes(int index) {
    return allowed_.getByteString(index);
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
    for (int i = 0; i < allowed_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, allowed_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < allowed_.size(); i++) {
        dataSize += computeStringSizeNoTag(allowed_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAllowedList().size();
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
    if (!(obj instanceof com.google.fhir.proto.ReferenceRestriction)) {
      return super.equals(obj);
    }
    com.google.fhir.proto.ReferenceRestriction other =
        (com.google.fhir.proto.ReferenceRestriction) obj;

    if (!getAllowedList().equals(other.getAllowedList())) return false;
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
    if (getAllowedCount() > 0) {
      hash = (37 * hash) + ALLOWED_FIELD_NUMBER;
      hash = (53 * hash) + getAllowedList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.proto.ReferenceRestriction parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.ReferenceRestriction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.ReferenceRestriction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.ReferenceRestriction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.ReferenceRestriction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.ReferenceRestriction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.ReferenceRestriction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.ReferenceRestriction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.proto.ReferenceRestriction parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.ReferenceRestriction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.proto.ReferenceRestriction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.ReferenceRestriction parseFrom(
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

  public static Builder newBuilder(com.google.fhir.proto.ReferenceRestriction prototype) {
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
   * For Reference types, additional restrictions to apply
   * </pre>
   *
   * Protobuf type {@code google.fhir.proto.ReferenceRestriction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.proto.ReferenceRestriction)
      com.google.fhir.proto.ReferenceRestrictionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_ReferenceRestriction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_ReferenceRestriction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.proto.ReferenceRestriction.class,
              com.google.fhir.proto.ReferenceRestriction.Builder.class);
    }

    // Construct using com.google.fhir.proto.ReferenceRestriction.newBuilder()
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
      allowed_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_ReferenceRestriction_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.proto.ReferenceRestriction getDefaultInstanceForType() {
      return com.google.fhir.proto.ReferenceRestriction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.proto.ReferenceRestriction build() {
      com.google.fhir.proto.ReferenceRestriction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.proto.ReferenceRestriction buildPartial() {
      com.google.fhir.proto.ReferenceRestriction result =
          new com.google.fhir.proto.ReferenceRestriction(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        allowed_ = allowed_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.allowed_ = allowed_;
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
      if (other instanceof com.google.fhir.proto.ReferenceRestriction) {
        return mergeFrom((com.google.fhir.proto.ReferenceRestriction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.proto.ReferenceRestriction other) {
      if (other == com.google.fhir.proto.ReferenceRestriction.getDefaultInstance()) return this;
      if (!other.allowed_.isEmpty()) {
        if (allowed_.isEmpty()) {
          allowed_ = other.allowed_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAllowedIsMutable();
          allowed_.addAll(other.allowed_);
        }
        onChanged();
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
      com.google.fhir.proto.ReferenceRestriction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.proto.ReferenceRestriction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList allowed_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureAllowedIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        allowed_ = new com.google.protobuf.LazyStringArrayList(allowed_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Allowed types to refer to.
     * Must use unprofiled FHIR resource type name,
     * e.g., Patient, Observation, Medication
     * </pre>
     *
     * <code>repeated string allowed = 1;</code>
     *
     * @return A list containing the allowed.
     */
    public com.google.protobuf.ProtocolStringList getAllowedList() {
      return allowed_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Allowed types to refer to.
     * Must use unprofiled FHIR resource type name,
     * e.g., Patient, Observation, Medication
     * </pre>
     *
     * <code>repeated string allowed = 1;</code>
     *
     * @return The count of allowed.
     */
    public int getAllowedCount() {
      return allowed_.size();
    }
    /**
     *
     *
     * <pre>
     * Allowed types to refer to.
     * Must use unprofiled FHIR resource type name,
     * e.g., Patient, Observation, Medication
     * </pre>
     *
     * <code>repeated string allowed = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The allowed at the given index.
     */
    public java.lang.String getAllowed(int index) {
      return allowed_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Allowed types to refer to.
     * Must use unprofiled FHIR resource type name,
     * e.g., Patient, Observation, Medication
     * </pre>
     *
     * <code>repeated string allowed = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the allowed at the given index.
     */
    public com.google.protobuf.ByteString getAllowedBytes(int index) {
      return allowed_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Allowed types to refer to.
     * Must use unprofiled FHIR resource type name,
     * e.g., Patient, Observation, Medication
     * </pre>
     *
     * <code>repeated string allowed = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The allowed to set.
     * @return This builder for chaining.
     */
    public Builder setAllowed(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAllowedIsMutable();
      allowed_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Allowed types to refer to.
     * Must use unprofiled FHIR resource type name,
     * e.g., Patient, Observation, Medication
     * </pre>
     *
     * <code>repeated string allowed = 1;</code>
     *
     * @param value The allowed to add.
     * @return This builder for chaining.
     */
    public Builder addAllowed(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAllowedIsMutable();
      allowed_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Allowed types to refer to.
     * Must use unprofiled FHIR resource type name,
     * e.g., Patient, Observation, Medication
     * </pre>
     *
     * <code>repeated string allowed = 1;</code>
     *
     * @param values The allowed to add.
     * @return This builder for chaining.
     */
    public Builder addAllAllowed(java.lang.Iterable<java.lang.String> values) {
      ensureAllowedIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, allowed_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Allowed types to refer to.
     * Must use unprofiled FHIR resource type name,
     * e.g., Patient, Observation, Medication
     * </pre>
     *
     * <code>repeated string allowed = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowed() {
      allowed_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Allowed types to refer to.
     * Must use unprofiled FHIR resource type name,
     * e.g., Patient, Observation, Medication
     * </pre>
     *
     * <code>repeated string allowed = 1;</code>
     *
     * @param value The bytes of the allowed to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureAllowedIsMutable();
      allowed_.add(value);
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.fhir.proto.ReferenceRestriction)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.proto.ReferenceRestriction)
  private static final com.google.fhir.proto.ReferenceRestriction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.proto.ReferenceRestriction();
  }

  public static com.google.fhir.proto.ReferenceRestriction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReferenceRestriction> PARSER =
      new com.google.protobuf.AbstractParser<ReferenceRestriction>() {
        @java.lang.Override
        public ReferenceRestriction parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReferenceRestriction(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ReferenceRestriction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReferenceRestriction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.proto.ReferenceRestriction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
