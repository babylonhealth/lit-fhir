// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/codes.proto

package com.google.fhir.stu3.proto;

/**
 *
 *
 * <pre>
 * Type if a sequence -- DNA, RNA, or amino acid sequence
 * See http://hl7.org/fhir/ValueSet/sequence-type
 * </pre>
 *
 * Protobuf type {@code google.fhir.stu3.proto.SequenceTypeCode}
 */
public final class SequenceTypeCode extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.stu3.proto.SequenceTypeCode)
    SequenceTypeCodeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SequenceTypeCode.newBuilder() to construct.
  private SequenceTypeCode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SequenceTypeCode() {
    value_ = 0;
    extension_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SequenceTypeCode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SequenceTypeCode(
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
          case 8:
            {
              int rawValue = input.readEnum();

              value_ = rawValue;
              break;
            }
          case 18:
            {
              com.google.fhir.stu3.proto.String.Builder subBuilder = null;
              if (id_ != null) {
                subBuilder = id_.toBuilder();
              }
              id_ =
                  input.readMessage(com.google.fhir.stu3.proto.String.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(id_);
                id_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                extension_ = new java.util.ArrayList<com.google.fhir.stu3.proto.Extension>();
                mutable_bitField0_ |= 0x00000001;
              }
              extension_.add(
                  input.readMessage(
                      com.google.fhir.stu3.proto.Extension.parser(), extensionRegistry));
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
    return com.google.fhir.stu3.proto.Codes
        .internal_static_google_fhir_stu3_proto_SequenceTypeCode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.stu3.proto.Codes
        .internal_static_google_fhir_stu3_proto_SequenceTypeCode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.stu3.proto.SequenceTypeCode.class,
            com.google.fhir.stu3.proto.SequenceTypeCode.Builder.class);
  }

  /** Protobuf enum {@code google.fhir.stu3.proto.SequenceTypeCode.Value} */
  public enum Value implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>INVALID_UNINITIALIZED = 0;</code> */
    INVALID_UNINITIALIZED(0),
    /** <code>AA = 1;</code> */
    AA(1),
    /** <code>DNA = 2;</code> */
    DNA(2),
    /** <code>RNA = 3;</code> */
    RNA(3),
    UNRECOGNIZED(-1),
    ;

    /** <code>INVALID_UNINITIALIZED = 0;</code> */
    public static final int INVALID_UNINITIALIZED_VALUE = 0;
    /** <code>AA = 1;</code> */
    public static final int AA_VALUE = 1;
    /** <code>DNA = 2;</code> */
    public static final int DNA_VALUE = 2;
    /** <code>RNA = 3;</code> */
    public static final int RNA_VALUE = 3;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Value valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Value forNumber(int value) {
      switch (value) {
        case 0:
          return INVALID_UNINITIALIZED;
        case 1:
          return AA;
        case 2:
          return DNA;
        case 3:
          return RNA;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Value> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Value> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Value>() {
          public Value findValueByNumber(int number) {
            return Value.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.fhir.stu3.proto.SequenceTypeCode.getDescriptor().getEnumTypes().get(0);
    }

    private static final Value[] VALUES = values();

    public static Value valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Value(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.fhir.stu3.proto.SequenceTypeCode.Value)
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private int value_;
  /**
   * <code>.google.fhir.stu3.proto.SequenceTypeCode.Value value = 1;</code>
   *
   * @return The enum numeric value on the wire for value.
   */
  public int getValueValue() {
    return value_;
  }
  /**
   * <code>.google.fhir.stu3.proto.SequenceTypeCode.Value value = 1;</code>
   *
   * @return The value.
   */
  public com.google.fhir.stu3.proto.SequenceTypeCode.Value getValue() {
    @SuppressWarnings("deprecation")
    com.google.fhir.stu3.proto.SequenceTypeCode.Value result =
        com.google.fhir.stu3.proto.SequenceTypeCode.Value.valueOf(value_);
    return result == null ? com.google.fhir.stu3.proto.SequenceTypeCode.Value.UNRECOGNIZED : result;
  }

  public static final int ID_FIELD_NUMBER = 2;
  private com.google.fhir.stu3.proto.String id_;
  /**
   * <code>.google.fhir.stu3.proto.String id = 2;</code>
   *
   * @return Whether the id field is set.
   */
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <code>.google.fhir.stu3.proto.String id = 2;</code>
   *
   * @return The id.
   */
  public com.google.fhir.stu3.proto.String getId() {
    return id_ == null ? com.google.fhir.stu3.proto.String.getDefaultInstance() : id_;
  }
  /** <code>.google.fhir.stu3.proto.String id = 2;</code> */
  public com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int EXTENSION_FIELD_NUMBER = 3;
  private java.util.List<com.google.fhir.stu3.proto.Extension> extension_;
  /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
  public java.util.List<com.google.fhir.stu3.proto.Extension> getExtensionList() {
    return extension_;
  }
  /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
  public java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder>
      getExtensionOrBuilderList() {
    return extension_;
  }
  /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
  public int getExtensionCount() {
    return extension_.size();
  }
  /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
  public com.google.fhir.stu3.proto.Extension getExtension(int index) {
    return extension_.get(index);
  }
  /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
  public com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(int index) {
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
    if (value_
        != com.google.fhir.stu3.proto.SequenceTypeCode.Value.INVALID_UNINITIALIZED.getNumber()) {
      output.writeEnum(1, value_);
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
    if (value_
        != com.google.fhir.stu3.proto.SequenceTypeCode.Value.INVALID_UNINITIALIZED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, value_);
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
    if (!(obj instanceof com.google.fhir.stu3.proto.SequenceTypeCode)) {
      return super.equals(obj);
    }
    com.google.fhir.stu3.proto.SequenceTypeCode other =
        (com.google.fhir.stu3.proto.SequenceTypeCode) obj;

    if (value_ != other.value_) return false;
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
    hash = (53 * hash) + value_;
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

  public static com.google.fhir.stu3.proto.SequenceTypeCode parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.SequenceTypeCode parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.SequenceTypeCode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.SequenceTypeCode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.SequenceTypeCode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.SequenceTypeCode parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.SequenceTypeCode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.SequenceTypeCode parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.SequenceTypeCode parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.SequenceTypeCode parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.SequenceTypeCode parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.SequenceTypeCode parseFrom(
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

  public static Builder newBuilder(com.google.fhir.stu3.proto.SequenceTypeCode prototype) {
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
   * Type if a sequence -- DNA, RNA, or amino acid sequence
   * See http://hl7.org/fhir/ValueSet/sequence-type
   * </pre>
   *
   * Protobuf type {@code google.fhir.stu3.proto.SequenceTypeCode}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.stu3.proto.SequenceTypeCode)
      com.google.fhir.stu3.proto.SequenceTypeCodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.stu3.proto.Codes
          .internal_static_google_fhir_stu3_proto_SequenceTypeCode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.stu3.proto.Codes
          .internal_static_google_fhir_stu3_proto_SequenceTypeCode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.stu3.proto.SequenceTypeCode.class,
              com.google.fhir.stu3.proto.SequenceTypeCode.Builder.class);
    }

    // Construct using com.google.fhir.stu3.proto.SequenceTypeCode.newBuilder()
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
      value_ = 0;

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
      return com.google.fhir.stu3.proto.Codes
          .internal_static_google_fhir_stu3_proto_SequenceTypeCode_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.SequenceTypeCode getDefaultInstanceForType() {
      return com.google.fhir.stu3.proto.SequenceTypeCode.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.SequenceTypeCode build() {
      com.google.fhir.stu3.proto.SequenceTypeCode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.SequenceTypeCode buildPartial() {
      com.google.fhir.stu3.proto.SequenceTypeCode result =
          new com.google.fhir.stu3.proto.SequenceTypeCode(this);
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
      if (other instanceof com.google.fhir.stu3.proto.SequenceTypeCode) {
        return mergeFrom((com.google.fhir.stu3.proto.SequenceTypeCode) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.stu3.proto.SequenceTypeCode other) {
      if (other == com.google.fhir.stu3.proto.SequenceTypeCode.getDefaultInstance()) return this;
      if (other.value_ != 0) {
        setValueValue(other.getValueValue());
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
      com.google.fhir.stu3.proto.SequenceTypeCode parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.stu3.proto.SequenceTypeCode) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private int value_ = 0;
    /**
     * <code>.google.fhir.stu3.proto.SequenceTypeCode.Value value = 1;</code>
     *
     * @return The enum numeric value on the wire for value.
     */
    public int getValueValue() {
      return value_;
    }
    /**
     * <code>.google.fhir.stu3.proto.SequenceTypeCode.Value value = 1;</code>
     *
     * @param value The enum numeric value on the wire for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueValue(int value) {
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.google.fhir.stu3.proto.SequenceTypeCode.Value value = 1;</code>
     *
     * @return The value.
     */
    public com.google.fhir.stu3.proto.SequenceTypeCode.Value getValue() {
      @SuppressWarnings("deprecation")
      com.google.fhir.stu3.proto.SequenceTypeCode.Value result =
          com.google.fhir.stu3.proto.SequenceTypeCode.Value.valueOf(value_);
      return result == null
          ? com.google.fhir.stu3.proto.SequenceTypeCode.Value.UNRECOGNIZED
          : result;
    }
    /**
     * <code>.google.fhir.stu3.proto.SequenceTypeCode.Value value = 1;</code>
     *
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(com.google.fhir.stu3.proto.SequenceTypeCode.Value value) {
      if (value == null) {
        throw new NullPointerException();
      }

      value_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.google.fhir.stu3.proto.SequenceTypeCode.Value value = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValue() {

      value_ = 0;
      onChanged();
      return this;
    }

    private com.google.fhir.stu3.proto.String id_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.String,
            com.google.fhir.stu3.proto.String.Builder,
            com.google.fhir.stu3.proto.StringOrBuilder>
        idBuilder_;
    /**
     * <code>.google.fhir.stu3.proto.String id = 2;</code>
     *
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <code>.google.fhir.stu3.proto.String id = 2;</code>
     *
     * @return The id.
     */
    public com.google.fhir.stu3.proto.String getId() {
      if (idBuilder_ == null) {
        return id_ == null ? com.google.fhir.stu3.proto.String.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /** <code>.google.fhir.stu3.proto.String id = 2;</code> */
    public Builder setId(com.google.fhir.stu3.proto.String value) {
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
    /** <code>.google.fhir.stu3.proto.String id = 2;</code> */
    public Builder setId(com.google.fhir.stu3.proto.String.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /** <code>.google.fhir.stu3.proto.String id = 2;</code> */
    public Builder mergeId(com.google.fhir.stu3.proto.String value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ = com.google.fhir.stu3.proto.String.newBuilder(id_).mergeFrom(value).buildPartial();
        } else {
          id_ = value;
        }
        onChanged();
      } else {
        idBuilder_.mergeFrom(value);
      }

      return this;
    }
    /** <code>.google.fhir.stu3.proto.String id = 2;</code> */
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
    /** <code>.google.fhir.stu3.proto.String id = 2;</code> */
    public com.google.fhir.stu3.proto.String.Builder getIdBuilder() {

      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /** <code>.google.fhir.stu3.proto.String id = 2;</code> */
    public com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ? com.google.fhir.stu3.proto.String.getDefaultInstance() : id_;
      }
    }
    /** <code>.google.fhir.stu3.proto.String id = 2;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.String,
            com.google.fhir.stu3.proto.String.Builder,
            com.google.fhir.stu3.proto.StringOrBuilder>
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.fhir.stu3.proto.String,
                com.google.fhir.stu3.proto.String.Builder,
                com.google.fhir.stu3.proto.StringOrBuilder>(
                getId(), getParentForChildren(), isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private java.util.List<com.google.fhir.stu3.proto.Extension> extension_ =
        java.util.Collections.emptyList();

    private void ensureExtensionIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        extension_ = new java.util.ArrayList<com.google.fhir.stu3.proto.Extension>(extension_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.fhir.stu3.proto.Extension,
            com.google.fhir.stu3.proto.Extension.Builder,
            com.google.fhir.stu3.proto.ExtensionOrBuilder>
        extensionBuilder_;

    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public java.util.List<com.google.fhir.stu3.proto.Extension> getExtensionList() {
      if (extensionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(extension_);
      } else {
        return extensionBuilder_.getMessageList();
      }
    }
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public int getExtensionCount() {
      if (extensionBuilder_ == null) {
        return extension_.size();
      } else {
        return extensionBuilder_.getCount();
      }
    }
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public com.google.fhir.stu3.proto.Extension getExtension(int index) {
      if (extensionBuilder_ == null) {
        return extension_.get(index);
      } else {
        return extensionBuilder_.getMessage(index);
      }
    }
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public Builder setExtension(int index, com.google.fhir.stu3.proto.Extension value) {
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
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public Builder setExtension(
        int index, com.google.fhir.stu3.proto.Extension.Builder builderForValue) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.set(index, builderForValue.build());
        onChanged();
      } else {
        extensionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public Builder addExtension(com.google.fhir.stu3.proto.Extension value) {
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
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public Builder addExtension(int index, com.google.fhir.stu3.proto.Extension value) {
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
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public Builder addExtension(com.google.fhir.stu3.proto.Extension.Builder builderForValue) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.add(builderForValue.build());
        onChanged();
      } else {
        extensionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public Builder addExtension(
        int index, com.google.fhir.stu3.proto.Extension.Builder builderForValue) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.add(index, builderForValue.build());
        onChanged();
      } else {
        extensionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public Builder addAllExtension(
        java.lang.Iterable<? extends com.google.fhir.stu3.proto.Extension> values) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, extension_);
        onChanged();
      } else {
        extensionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
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
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
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
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public com.google.fhir.stu3.proto.Extension.Builder getExtensionBuilder(int index) {
      return getExtensionFieldBuilder().getBuilder(index);
    }
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(int index) {
      if (extensionBuilder_ == null) {
        return extension_.get(index);
      } else {
        return extensionBuilder_.getMessageOrBuilder(index);
      }
    }
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder>
        getExtensionOrBuilderList() {
      if (extensionBuilder_ != null) {
        return extensionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(extension_);
      }
    }
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public com.google.fhir.stu3.proto.Extension.Builder addExtensionBuilder() {
      return getExtensionFieldBuilder()
          .addBuilder(com.google.fhir.stu3.proto.Extension.getDefaultInstance());
    }
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public com.google.fhir.stu3.proto.Extension.Builder addExtensionBuilder(int index) {
      return getExtensionFieldBuilder()
          .addBuilder(index, com.google.fhir.stu3.proto.Extension.getDefaultInstance());
    }
    /** <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code> */
    public java.util.List<com.google.fhir.stu3.proto.Extension.Builder> getExtensionBuilderList() {
      return getExtensionFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.fhir.stu3.proto.Extension,
            com.google.fhir.stu3.proto.Extension.Builder,
            com.google.fhir.stu3.proto.ExtensionOrBuilder>
        getExtensionFieldBuilder() {
      if (extensionBuilder_ == null) {
        extensionBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.fhir.stu3.proto.Extension,
                com.google.fhir.stu3.proto.Extension.Builder,
                com.google.fhir.stu3.proto.ExtensionOrBuilder>(
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

    // @@protoc_insertion_point(builder_scope:google.fhir.stu3.proto.SequenceTypeCode)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.stu3.proto.SequenceTypeCode)
  private static final com.google.fhir.stu3.proto.SequenceTypeCode DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.stu3.proto.SequenceTypeCode();
  }

  public static com.google.fhir.stu3.proto.SequenceTypeCode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SequenceTypeCode> PARSER =
      new com.google.protobuf.AbstractParser<SequenceTypeCode>() {
        @java.lang.Override
        public SequenceTypeCode parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SequenceTypeCode(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SequenceTypeCode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SequenceTypeCode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.stu3.proto.SequenceTypeCode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
