// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/codes.proto

package com.google.fhir.r4.core;

/**
 * <pre>
 * All published FHIR Versions.
 * See http://hl7.org/fhir/FHIR-version
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.FHIRVersionCode}
 */
public final class FHIRVersionCode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.FHIRVersionCode)
    FHIRVersionCodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FHIRVersionCode.newBuilder() to construct.
  private FHIRVersionCode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FHIRVersionCode() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FHIRVersionCode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FHIRVersionCode(
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
    return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_FHIRVersionCode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_FHIRVersionCode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.FHIRVersionCode.class, com.google.fhir.r4.core.FHIRVersionCode.Builder.class);
  }

  /**
   * Protobuf enum {@code google.fhir.r4.core.FHIRVersionCode.Value}
   */
  public enum Value
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INVALID_UNINITIALIZED = 0;</code>
     */
    INVALID_UNINITIALIZED(0),
    /**
     * <code>V_0_01 = 1 [(.google.fhir.proto.fhir_original_code) = "0.01"];</code>
     */
    V_0_01(1),
    /**
     * <code>V_0_05 = 2 [(.google.fhir.proto.fhir_original_code) = "0.05"];</code>
     */
    V_0_05(2),
    /**
     * <code>V_0_06 = 3 [(.google.fhir.proto.fhir_original_code) = "0.06"];</code>
     */
    V_0_06(3),
    /**
     * <code>V_0_11 = 4 [(.google.fhir.proto.fhir_original_code) = "0.11"];</code>
     */
    V_0_11(4),
    /**
     * <code>V_0_0_80 = 5 [(.google.fhir.proto.fhir_original_code) = "0.0.80"];</code>
     */
    V_0_0_80(5),
    /**
     * <code>V_0_0_81 = 6 [(.google.fhir.proto.fhir_original_code) = "0.0.81"];</code>
     */
    V_0_0_81(6),
    /**
     * <code>V_0_0_82 = 7 [(.google.fhir.proto.fhir_original_code) = "0.0.82"];</code>
     */
    V_0_0_82(7),
    /**
     * <code>V_0_4_0 = 8 [(.google.fhir.proto.fhir_original_code) = "0.4.0"];</code>
     */
    V_0_4_0(8),
    /**
     * <code>V_0_5_0 = 9 [(.google.fhir.proto.fhir_original_code) = "0.5.0"];</code>
     */
    V_0_5_0(9),
    /**
     * <code>V_1_0_0 = 10 [(.google.fhir.proto.fhir_original_code) = "1.0.0"];</code>
     */
    V_1_0_0(10),
    /**
     * <code>V_1_0_1 = 11 [(.google.fhir.proto.fhir_original_code) = "1.0.1"];</code>
     */
    V_1_0_1(11),
    /**
     * <code>V_1_0_2 = 12 [(.google.fhir.proto.fhir_original_code) = "1.0.2"];</code>
     */
    V_1_0_2(12),
    /**
     * <code>V_1_1_0 = 13 [(.google.fhir.proto.fhir_original_code) = "1.1.0"];</code>
     */
    V_1_1_0(13),
    /**
     * <code>V_1_4_0 = 14 [(.google.fhir.proto.fhir_original_code) = "1.4.0"];</code>
     */
    V_1_4_0(14),
    /**
     * <code>V_1_6_0 = 15 [(.google.fhir.proto.fhir_original_code) = "1.6.0"];</code>
     */
    V_1_6_0(15),
    /**
     * <code>V_1_8_0 = 16 [(.google.fhir.proto.fhir_original_code) = "1.8.0"];</code>
     */
    V_1_8_0(16),
    /**
     * <code>V_3_0_0 = 17 [(.google.fhir.proto.fhir_original_code) = "3.0.0"];</code>
     */
    V_3_0_0(17),
    /**
     * <code>V_3_0_1 = 18 [(.google.fhir.proto.fhir_original_code) = "3.0.1"];</code>
     */
    V_3_0_1(18),
    /**
     * <code>V_3_3_0 = 19 [(.google.fhir.proto.fhir_original_code) = "3.3.0"];</code>
     */
    V_3_3_0(19),
    /**
     * <code>V_3_5_0 = 20 [(.google.fhir.proto.fhir_original_code) = "3.5.0"];</code>
     */
    V_3_5_0(20),
    /**
     * <code>V_4_0_0 = 21 [(.google.fhir.proto.fhir_original_code) = "4.0.0"];</code>
     */
    V_4_0_0(21),
    /**
     * <code>V_4_0_1 = 22 [(.google.fhir.proto.fhir_original_code) = "4.0.1"];</code>
     */
    V_4_0_1(22),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>INVALID_UNINITIALIZED = 0;</code>
     */
    public static final int INVALID_UNINITIALIZED_VALUE = 0;
    /**
     * <code>V_0_01 = 1 [(.google.fhir.proto.fhir_original_code) = "0.01"];</code>
     */
    public static final int V_0_01_VALUE = 1;
    /**
     * <code>V_0_05 = 2 [(.google.fhir.proto.fhir_original_code) = "0.05"];</code>
     */
    public static final int V_0_05_VALUE = 2;
    /**
     * <code>V_0_06 = 3 [(.google.fhir.proto.fhir_original_code) = "0.06"];</code>
     */
    public static final int V_0_06_VALUE = 3;
    /**
     * <code>V_0_11 = 4 [(.google.fhir.proto.fhir_original_code) = "0.11"];</code>
     */
    public static final int V_0_11_VALUE = 4;
    /**
     * <code>V_0_0_80 = 5 [(.google.fhir.proto.fhir_original_code) = "0.0.80"];</code>
     */
    public static final int V_0_0_80_VALUE = 5;
    /**
     * <code>V_0_0_81 = 6 [(.google.fhir.proto.fhir_original_code) = "0.0.81"];</code>
     */
    public static final int V_0_0_81_VALUE = 6;
    /**
     * <code>V_0_0_82 = 7 [(.google.fhir.proto.fhir_original_code) = "0.0.82"];</code>
     */
    public static final int V_0_0_82_VALUE = 7;
    /**
     * <code>V_0_4_0 = 8 [(.google.fhir.proto.fhir_original_code) = "0.4.0"];</code>
     */
    public static final int V_0_4_0_VALUE = 8;
    /**
     * <code>V_0_5_0 = 9 [(.google.fhir.proto.fhir_original_code) = "0.5.0"];</code>
     */
    public static final int V_0_5_0_VALUE = 9;
    /**
     * <code>V_1_0_0 = 10 [(.google.fhir.proto.fhir_original_code) = "1.0.0"];</code>
     */
    public static final int V_1_0_0_VALUE = 10;
    /**
     * <code>V_1_0_1 = 11 [(.google.fhir.proto.fhir_original_code) = "1.0.1"];</code>
     */
    public static final int V_1_0_1_VALUE = 11;
    /**
     * <code>V_1_0_2 = 12 [(.google.fhir.proto.fhir_original_code) = "1.0.2"];</code>
     */
    public static final int V_1_0_2_VALUE = 12;
    /**
     * <code>V_1_1_0 = 13 [(.google.fhir.proto.fhir_original_code) = "1.1.0"];</code>
     */
    public static final int V_1_1_0_VALUE = 13;
    /**
     * <code>V_1_4_0 = 14 [(.google.fhir.proto.fhir_original_code) = "1.4.0"];</code>
     */
    public static final int V_1_4_0_VALUE = 14;
    /**
     * <code>V_1_6_0 = 15 [(.google.fhir.proto.fhir_original_code) = "1.6.0"];</code>
     */
    public static final int V_1_6_0_VALUE = 15;
    /**
     * <code>V_1_8_0 = 16 [(.google.fhir.proto.fhir_original_code) = "1.8.0"];</code>
     */
    public static final int V_1_8_0_VALUE = 16;
    /**
     * <code>V_3_0_0 = 17 [(.google.fhir.proto.fhir_original_code) = "3.0.0"];</code>
     */
    public static final int V_3_0_0_VALUE = 17;
    /**
     * <code>V_3_0_1 = 18 [(.google.fhir.proto.fhir_original_code) = "3.0.1"];</code>
     */
    public static final int V_3_0_1_VALUE = 18;
    /**
     * <code>V_3_3_0 = 19 [(.google.fhir.proto.fhir_original_code) = "3.3.0"];</code>
     */
    public static final int V_3_3_0_VALUE = 19;
    /**
     * <code>V_3_5_0 = 20 [(.google.fhir.proto.fhir_original_code) = "3.5.0"];</code>
     */
    public static final int V_3_5_0_VALUE = 20;
    /**
     * <code>V_4_0_0 = 21 [(.google.fhir.proto.fhir_original_code) = "4.0.0"];</code>
     */
    public static final int V_4_0_0_VALUE = 21;
    /**
     * <code>V_4_0_1 = 22 [(.google.fhir.proto.fhir_original_code) = "4.0.1"];</code>
     */
    public static final int V_4_0_1_VALUE = 22;


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
        case 0: return INVALID_UNINITIALIZED;
        case 1: return V_0_01;
        case 2: return V_0_05;
        case 3: return V_0_06;
        case 4: return V_0_11;
        case 5: return V_0_0_80;
        case 6: return V_0_0_81;
        case 7: return V_0_0_82;
        case 8: return V_0_4_0;
        case 9: return V_0_5_0;
        case 10: return V_1_0_0;
        case 11: return V_1_0_1;
        case 12: return V_1_0_2;
        case 13: return V_1_1_0;
        case 14: return V_1_4_0;
        case 15: return V_1_6_0;
        case 16: return V_1_8_0;
        case 17: return V_3_0_0;
        case 18: return V_3_0_1;
        case 19: return V_3_3_0;
        case 20: return V_3_5_0;
        case 21: return V_4_0_0;
        case 22: return V_4_0_1;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Value>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Value> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Value>() {
            public Value findValueByNumber(int number) {
              return Value.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.fhir.r4.core.FHIRVersionCode.getDescriptor().getEnumTypes().get(0);
    }

    private static final Value[] VALUES = values();

    public static Value valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
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

    // @@protoc_insertion_point(enum_scope:google.fhir.r4.core.FHIRVersionCode.Value)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.fhir.r4.core.FHIRVersionCode)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.FHIRVersionCode other = (com.google.fhir.r4.core.FHIRVersionCode) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.r4.core.FHIRVersionCode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.FHIRVersionCode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.FHIRVersionCode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.FHIRVersionCode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.FHIRVersionCode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.FHIRVersionCode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.FHIRVersionCode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.FHIRVersionCode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.r4.core.FHIRVersionCode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.FHIRVersionCode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.r4.core.FHIRVersionCode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.FHIRVersionCode parseFrom(
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
  public static Builder newBuilder(com.google.fhir.r4.core.FHIRVersionCode prototype) {
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
   * All published FHIR Versions.
   * See http://hl7.org/fhir/FHIR-version
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.FHIRVersionCode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.FHIRVersionCode)
      com.google.fhir.r4.core.FHIRVersionCodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_FHIRVersionCode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_FHIRVersionCode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.FHIRVersionCode.class, com.google.fhir.r4.core.FHIRVersionCode.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.FHIRVersionCode.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_FHIRVersionCode_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.FHIRVersionCode getDefaultInstanceForType() {
      return com.google.fhir.r4.core.FHIRVersionCode.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.FHIRVersionCode build() {
      com.google.fhir.r4.core.FHIRVersionCode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.FHIRVersionCode buildPartial() {
      com.google.fhir.r4.core.FHIRVersionCode result = new com.google.fhir.r4.core.FHIRVersionCode(this);
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
      if (other instanceof com.google.fhir.r4.core.FHIRVersionCode) {
        return mergeFrom((com.google.fhir.r4.core.FHIRVersionCode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.FHIRVersionCode other) {
      if (other == com.google.fhir.r4.core.FHIRVersionCode.getDefaultInstance()) return this;
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
      com.google.fhir.r4.core.FHIRVersionCode parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.r4.core.FHIRVersionCode) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.FHIRVersionCode)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.FHIRVersionCode)
  private static final com.google.fhir.r4.core.FHIRVersionCode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.FHIRVersionCode();
  }

  public static com.google.fhir.r4.core.FHIRVersionCode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FHIRVersionCode>
      PARSER = new com.google.protobuf.AbstractParser<FHIRVersionCode>() {
    @java.lang.Override
    public FHIRVersionCode parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FHIRVersionCode(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FHIRVersionCode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FHIRVersionCode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.FHIRVersionCode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

