// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/profile_config.proto

package com.google.fhir.proto;

/**
 *
 *
 * <pre>
 * Describes a code type with additional metadata
 * (e.g., fixed system, binding name, or value)
 * </pre>
 *
 * Protobuf type {@code google.fhir.proto.CodeData}
 */
public final class CodeData extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.proto.CodeData)
    CodeDataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CodeData.newBuilder() to construct.
  private CodeData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CodeData() {
    system_ = "";
    bindingStrength_ = 0;
    fixedValue_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CodeData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CodeData(
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
              java.lang.String s = input.readStringRequireUtf8();

              system_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              bindingStrength_ = rawValue;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              fixedValue_ = s;
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
    return com.google.fhir.proto.ProfileConfig
        .internal_static_google_fhir_proto_CodeData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.proto.ProfileConfig
        .internal_static_google_fhir_proto_CodeData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.proto.CodeData.class, com.google.fhir.proto.CodeData.Builder.class);
  }

  public static final int SYSTEM_FIELD_NUMBER = 1;
  private volatile java.lang.Object system_;
  /**
   *
   *
   * <pre>
   * Fixed Url of the value set to use
   * </pre>
   *
   * <code>string system = 1;</code>
   *
   * @return The system.
   */
  public java.lang.String getSystem() {
    java.lang.Object ref = system_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      system_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Fixed Url of the value set to use
   * </pre>
   *
   * <code>string system = 1;</code>
   *
   * @return The bytes for system.
   */
  public com.google.protobuf.ByteString getSystemBytes() {
    java.lang.Object ref = system_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      system_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BINDING_STRENGTH_FIELD_NUMBER = 2;
  private int bindingStrength_;
  /**
   *
   *
   * <pre>
   * "Strength" of value set binding - i.e., whether to allow codes that
   * are not in that value set.
   * Optional - defaults to required.
   * </pre>
   *
   * <code>.google.fhir.r4.core.BindingStrengthCode.Value binding_strength = 2;</code>
   *
   * @return The enum numeric value on the wire for bindingStrength.
   */
  public int getBindingStrengthValue() {
    return bindingStrength_;
  }
  /**
   *
   *
   * <pre>
   * "Strength" of value set binding - i.e., whether to allow codes that
   * are not in that value set.
   * Optional - defaults to required.
   * </pre>
   *
   * <code>.google.fhir.r4.core.BindingStrengthCode.Value binding_strength = 2;</code>
   *
   * @return The bindingStrength.
   */
  public com.google.fhir.r4.core.BindingStrengthCode.Value getBindingStrength() {
    @SuppressWarnings("deprecation")
    com.google.fhir.r4.core.BindingStrengthCode.Value result =
        com.google.fhir.r4.core.BindingStrengthCode.Value.valueOf(bindingStrength_);
    return result == null ? com.google.fhir.r4.core.BindingStrengthCode.Value.UNRECOGNIZED : result;
  }

  public static final int FIXED_VALUE_FIELD_NUMBER = 3;
  private volatile java.lang.Object fixedValue_;
  /**
   *
   *
   * <pre>
   * Optional - if set, this code will have a fixed value, and will not be
   * inlined as a field.
   * </pre>
   *
   * <code>string fixed_value = 3;</code>
   *
   * @return The fixedValue.
   */
  public java.lang.String getFixedValue() {
    java.lang.Object ref = fixedValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fixedValue_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional - if set, this code will have a fixed value, and will not be
   * inlined as a field.
   * </pre>
   *
   * <code>string fixed_value = 3;</code>
   *
   * @return The bytes for fixedValue.
   */
  public com.google.protobuf.ByteString getFixedValueBytes() {
    java.lang.Object ref = fixedValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      fixedValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getSystemBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, system_);
    }
    if (bindingStrength_
        != com.google.fhir.r4.core.BindingStrengthCode.Value.INVALID_UNINITIALIZED.getNumber()) {
      output.writeEnum(2, bindingStrength_);
    }
    if (!getFixedValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fixedValue_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSystemBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, system_);
    }
    if (bindingStrength_
        != com.google.fhir.r4.core.BindingStrengthCode.Value.INVALID_UNINITIALIZED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, bindingStrength_);
    }
    if (!getFixedValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fixedValue_);
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
    if (!(obj instanceof com.google.fhir.proto.CodeData)) {
      return super.equals(obj);
    }
    com.google.fhir.proto.CodeData other = (com.google.fhir.proto.CodeData) obj;

    if (!getSystem().equals(other.getSystem())) return false;
    if (bindingStrength_ != other.bindingStrength_) return false;
    if (!getFixedValue().equals(other.getFixedValue())) return false;
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
    hash = (37 * hash) + SYSTEM_FIELD_NUMBER;
    hash = (53 * hash) + getSystem().hashCode();
    hash = (37 * hash) + BINDING_STRENGTH_FIELD_NUMBER;
    hash = (53 * hash) + bindingStrength_;
    hash = (37 * hash) + FIXED_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getFixedValue().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.proto.CodeData parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.CodeData parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.CodeData parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.CodeData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.CodeData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.CodeData parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.CodeData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.CodeData parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.proto.CodeData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.CodeData parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.proto.CodeData parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.CodeData parseFrom(
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

  public static Builder newBuilder(com.google.fhir.proto.CodeData prototype) {
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
   * Describes a code type with additional metadata
   * (e.g., fixed system, binding name, or value)
   * </pre>
   *
   * Protobuf type {@code google.fhir.proto.CodeData}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.proto.CodeData)
      com.google.fhir.proto.CodeDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_CodeData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_CodeData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.proto.CodeData.class, com.google.fhir.proto.CodeData.Builder.class);
    }

    // Construct using com.google.fhir.proto.CodeData.newBuilder()
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
      system_ = "";

      bindingStrength_ = 0;

      fixedValue_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_CodeData_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.proto.CodeData getDefaultInstanceForType() {
      return com.google.fhir.proto.CodeData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.proto.CodeData build() {
      com.google.fhir.proto.CodeData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.proto.CodeData buildPartial() {
      com.google.fhir.proto.CodeData result = new com.google.fhir.proto.CodeData(this);
      result.system_ = system_;
      result.bindingStrength_ = bindingStrength_;
      result.fixedValue_ = fixedValue_;
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
      if (other instanceof com.google.fhir.proto.CodeData) {
        return mergeFrom((com.google.fhir.proto.CodeData) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.proto.CodeData other) {
      if (other == com.google.fhir.proto.CodeData.getDefaultInstance()) return this;
      if (!other.getSystem().isEmpty()) {
        system_ = other.system_;
        onChanged();
      }
      if (other.bindingStrength_ != 0) {
        setBindingStrengthValue(other.getBindingStrengthValue());
      }
      if (!other.getFixedValue().isEmpty()) {
        fixedValue_ = other.fixedValue_;
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
      com.google.fhir.proto.CodeData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.proto.CodeData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object system_ = "";
    /**
     *
     *
     * <pre>
     * Fixed Url of the value set to use
     * </pre>
     *
     * <code>string system = 1;</code>
     *
     * @return The system.
     */
    public java.lang.String getSystem() {
      java.lang.Object ref = system_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        system_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Fixed Url of the value set to use
     * </pre>
     *
     * <code>string system = 1;</code>
     *
     * @return The bytes for system.
     */
    public com.google.protobuf.ByteString getSystemBytes() {
      java.lang.Object ref = system_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        system_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Fixed Url of the value set to use
     * </pre>
     *
     * <code>string system = 1;</code>
     *
     * @param value The system to set.
     * @return This builder for chaining.
     */
    public Builder setSystem(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      system_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fixed Url of the value set to use
     * </pre>
     *
     * <code>string system = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSystem() {

      system_ = getDefaultInstance().getSystem();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fixed Url of the value set to use
     * </pre>
     *
     * <code>string system = 1;</code>
     *
     * @param value The bytes for system to set.
     * @return This builder for chaining.
     */
    public Builder setSystemBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      system_ = value;
      onChanged();
      return this;
    }

    private int bindingStrength_ = 0;
    /**
     *
     *
     * <pre>
     * "Strength" of value set binding - i.e., whether to allow codes that
     * are not in that value set.
     * Optional - defaults to required.
     * </pre>
     *
     * <code>.google.fhir.r4.core.BindingStrengthCode.Value binding_strength = 2;</code>
     *
     * @return The enum numeric value on the wire for bindingStrength.
     */
    public int getBindingStrengthValue() {
      return bindingStrength_;
    }
    /**
     *
     *
     * <pre>
     * "Strength" of value set binding - i.e., whether to allow codes that
     * are not in that value set.
     * Optional - defaults to required.
     * </pre>
     *
     * <code>.google.fhir.r4.core.BindingStrengthCode.Value binding_strength = 2;</code>
     *
     * @param value The enum numeric value on the wire for bindingStrength to set.
     * @return This builder for chaining.
     */
    public Builder setBindingStrengthValue(int value) {
      bindingStrength_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * "Strength" of value set binding - i.e., whether to allow codes that
     * are not in that value set.
     * Optional - defaults to required.
     * </pre>
     *
     * <code>.google.fhir.r4.core.BindingStrengthCode.Value binding_strength = 2;</code>
     *
     * @return The bindingStrength.
     */
    public com.google.fhir.r4.core.BindingStrengthCode.Value getBindingStrength() {
      @SuppressWarnings("deprecation")
      com.google.fhir.r4.core.BindingStrengthCode.Value result =
          com.google.fhir.r4.core.BindingStrengthCode.Value.valueOf(bindingStrength_);
      return result == null
          ? com.google.fhir.r4.core.BindingStrengthCode.Value.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * "Strength" of value set binding - i.e., whether to allow codes that
     * are not in that value set.
     * Optional - defaults to required.
     * </pre>
     *
     * <code>.google.fhir.r4.core.BindingStrengthCode.Value binding_strength = 2;</code>
     *
     * @param value The bindingStrength to set.
     * @return This builder for chaining.
     */
    public Builder setBindingStrength(com.google.fhir.r4.core.BindingStrengthCode.Value value) {
      if (value == null) {
        throw new NullPointerException();
      }

      bindingStrength_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * "Strength" of value set binding - i.e., whether to allow codes that
     * are not in that value set.
     * Optional - defaults to required.
     * </pre>
     *
     * <code>.google.fhir.r4.core.BindingStrengthCode.Value binding_strength = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBindingStrength() {

      bindingStrength_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fixedValue_ = "";
    /**
     *
     *
     * <pre>
     * Optional - if set, this code will have a fixed value, and will not be
     * inlined as a field.
     * </pre>
     *
     * <code>string fixed_value = 3;</code>
     *
     * @return The fixedValue.
     */
    public java.lang.String getFixedValue() {
      java.lang.Object ref = fixedValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fixedValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional - if set, this code will have a fixed value, and will not be
     * inlined as a field.
     * </pre>
     *
     * <code>string fixed_value = 3;</code>
     *
     * @return The bytes for fixedValue.
     */
    public com.google.protobuf.ByteString getFixedValueBytes() {
      java.lang.Object ref = fixedValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        fixedValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional - if set, this code will have a fixed value, and will not be
     * inlined as a field.
     * </pre>
     *
     * <code>string fixed_value = 3;</code>
     *
     * @param value The fixedValue to set.
     * @return This builder for chaining.
     */
    public Builder setFixedValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      fixedValue_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional - if set, this code will have a fixed value, and will not be
     * inlined as a field.
     * </pre>
     *
     * <code>string fixed_value = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFixedValue() {

      fixedValue_ = getDefaultInstance().getFixedValue();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional - if set, this code will have a fixed value, and will not be
     * inlined as a field.
     * </pre>
     *
     * <code>string fixed_value = 3;</code>
     *
     * @param value The bytes for fixedValue to set.
     * @return This builder for chaining.
     */
    public Builder setFixedValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      fixedValue_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.fhir.proto.CodeData)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.proto.CodeData)
  private static final com.google.fhir.proto.CodeData DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.proto.CodeData();
  }

  public static com.google.fhir.proto.CodeData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CodeData> PARSER =
      new com.google.protobuf.AbstractParser<CodeData>() {
        @java.lang.Override
        public CodeData parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CodeData(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CodeData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CodeData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.proto.CodeData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
