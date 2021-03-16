// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/codes.proto

package com.google.fhir.r4.core;

/**
 * <pre>
 * This value set contract specific codes for status.
 * See http://hl7.org/fhir/contract-status
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.ContractResourceStatusCode}
 */
public final class ContractResourceStatusCode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.ContractResourceStatusCode)
    ContractResourceStatusCodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContractResourceStatusCode.newBuilder() to construct.
  private ContractResourceStatusCode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContractResourceStatusCode() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContractResourceStatusCode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ContractResourceStatusCode(
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
    return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_ContractResourceStatusCode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_ContractResourceStatusCode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.ContractResourceStatusCode.class, com.google.fhir.r4.core.ContractResourceStatusCode.Builder.class);
  }

  /**
   * Protobuf enum {@code google.fhir.r4.core.ContractResourceStatusCode.Value}
   */
  public enum Value
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INVALID_UNINITIALIZED = 0;</code>
     */
    INVALID_UNINITIALIZED(0),
    /**
     * <code>AMENDED = 1;</code>
     */
    AMENDED(1),
    /**
     * <code>APPENDED = 2;</code>
     */
    APPENDED(2),
    /**
     * <code>CANCELLED = 3;</code>
     */
    CANCELLED(3),
    /**
     * <code>DISPUTED = 4;</code>
     */
    DISPUTED(4),
    /**
     * <code>ENTERED_IN_ERROR = 5;</code>
     */
    ENTERED_IN_ERROR(5),
    /**
     * <code>EXECUTABLE = 6;</code>
     */
    EXECUTABLE(6),
    /**
     * <code>EXECUTED = 7;</code>
     */
    EXECUTED(7),
    /**
     * <code>NEGOTIABLE = 8;</code>
     */
    NEGOTIABLE(8),
    /**
     * <code>OFFERED = 9;</code>
     */
    OFFERED(9),
    /**
     * <code>POLICY = 10;</code>
     */
    POLICY(10),
    /**
     * <code>REJECTED = 11;</code>
     */
    REJECTED(11),
    /**
     * <code>RENEWED = 12;</code>
     */
    RENEWED(12),
    /**
     * <code>REVOKED = 13;</code>
     */
    REVOKED(13),
    /**
     * <code>RESOLVED = 14;</code>
     */
    RESOLVED(14),
    /**
     * <code>TERMINATED = 15;</code>
     */
    TERMINATED(15),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>INVALID_UNINITIALIZED = 0;</code>
     */
    public static final int INVALID_UNINITIALIZED_VALUE = 0;
    /**
     * <code>AMENDED = 1;</code>
     */
    public static final int AMENDED_VALUE = 1;
    /**
     * <code>APPENDED = 2;</code>
     */
    public static final int APPENDED_VALUE = 2;
    /**
     * <code>CANCELLED = 3;</code>
     */
    public static final int CANCELLED_VALUE = 3;
    /**
     * <code>DISPUTED = 4;</code>
     */
    public static final int DISPUTED_VALUE = 4;
    /**
     * <code>ENTERED_IN_ERROR = 5;</code>
     */
    public static final int ENTERED_IN_ERROR_VALUE = 5;
    /**
     * <code>EXECUTABLE = 6;</code>
     */
    public static final int EXECUTABLE_VALUE = 6;
    /**
     * <code>EXECUTED = 7;</code>
     */
    public static final int EXECUTED_VALUE = 7;
    /**
     * <code>NEGOTIABLE = 8;</code>
     */
    public static final int NEGOTIABLE_VALUE = 8;
    /**
     * <code>OFFERED = 9;</code>
     */
    public static final int OFFERED_VALUE = 9;
    /**
     * <code>POLICY = 10;</code>
     */
    public static final int POLICY_VALUE = 10;
    /**
     * <code>REJECTED = 11;</code>
     */
    public static final int REJECTED_VALUE = 11;
    /**
     * <code>RENEWED = 12;</code>
     */
    public static final int RENEWED_VALUE = 12;
    /**
     * <code>REVOKED = 13;</code>
     */
    public static final int REVOKED_VALUE = 13;
    /**
     * <code>RESOLVED = 14;</code>
     */
    public static final int RESOLVED_VALUE = 14;
    /**
     * <code>TERMINATED = 15;</code>
     */
    public static final int TERMINATED_VALUE = 15;


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
        case 1: return AMENDED;
        case 2: return APPENDED;
        case 3: return CANCELLED;
        case 4: return DISPUTED;
        case 5: return ENTERED_IN_ERROR;
        case 6: return EXECUTABLE;
        case 7: return EXECUTED;
        case 8: return NEGOTIABLE;
        case 9: return OFFERED;
        case 10: return POLICY;
        case 11: return REJECTED;
        case 12: return RENEWED;
        case 13: return REVOKED;
        case 14: return RESOLVED;
        case 15: return TERMINATED;
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
      return com.google.fhir.r4.core.ContractResourceStatusCode.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:google.fhir.r4.core.ContractResourceStatusCode.Value)
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
    if (!(obj instanceof com.google.fhir.r4.core.ContractResourceStatusCode)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.ContractResourceStatusCode other = (com.google.fhir.r4.core.ContractResourceStatusCode) obj;

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

  public static com.google.fhir.r4.core.ContractResourceStatusCode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.ContractResourceStatusCode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.ContractResourceStatusCode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.ContractResourceStatusCode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.ContractResourceStatusCode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.ContractResourceStatusCode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.ContractResourceStatusCode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.ContractResourceStatusCode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.r4.core.ContractResourceStatusCode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.ContractResourceStatusCode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.r4.core.ContractResourceStatusCode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.ContractResourceStatusCode parseFrom(
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
  public static Builder newBuilder(com.google.fhir.r4.core.ContractResourceStatusCode prototype) {
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
   * This value set contract specific codes for status.
   * See http://hl7.org/fhir/contract-status
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.ContractResourceStatusCode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.ContractResourceStatusCode)
      com.google.fhir.r4.core.ContractResourceStatusCodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_ContractResourceStatusCode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_ContractResourceStatusCode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.ContractResourceStatusCode.class, com.google.fhir.r4.core.ContractResourceStatusCode.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.ContractResourceStatusCode.newBuilder()
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
      return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_ContractResourceStatusCode_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.ContractResourceStatusCode getDefaultInstanceForType() {
      return com.google.fhir.r4.core.ContractResourceStatusCode.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.ContractResourceStatusCode build() {
      com.google.fhir.r4.core.ContractResourceStatusCode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.ContractResourceStatusCode buildPartial() {
      com.google.fhir.r4.core.ContractResourceStatusCode result = new com.google.fhir.r4.core.ContractResourceStatusCode(this);
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
      if (other instanceof com.google.fhir.r4.core.ContractResourceStatusCode) {
        return mergeFrom((com.google.fhir.r4.core.ContractResourceStatusCode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.ContractResourceStatusCode other) {
      if (other == com.google.fhir.r4.core.ContractResourceStatusCode.getDefaultInstance()) return this;
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
      com.google.fhir.r4.core.ContractResourceStatusCode parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.r4.core.ContractResourceStatusCode) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.ContractResourceStatusCode)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.ContractResourceStatusCode)
  private static final com.google.fhir.r4.core.ContractResourceStatusCode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.ContractResourceStatusCode();
  }

  public static com.google.fhir.r4.core.ContractResourceStatusCode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContractResourceStatusCode>
      PARSER = new com.google.protobuf.AbstractParser<ContractResourceStatusCode>() {
    @java.lang.Override
    public ContractResourceStatusCode parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ContractResourceStatusCode(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ContractResourceStatusCode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContractResourceStatusCode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.ContractResourceStatusCode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

