// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/codes.proto

package com.google.fhir.r4.core;

/**
 *
 *
 * <pre>
 * Indicates the degree of adherence to a specified behavior or capability
 * expected for a system to be deemed conformant with a specification. See
 * http://terminology.hl7.org/CodeSystem/conformance-expectation
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.ConformanceExpectationCode}
 */
public final class ConformanceExpectationCode extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.ConformanceExpectationCode)
    ConformanceExpectationCodeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ConformanceExpectationCode.newBuilder() to construct.
  private ConformanceExpectationCode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConformanceExpectationCode() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConformanceExpectationCode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ConformanceExpectationCode(
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
    return com.google.fhir.r4.core.Codes
        .internal_static_google_fhir_r4_core_ConformanceExpectationCode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Codes
        .internal_static_google_fhir_r4_core_ConformanceExpectationCode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.ConformanceExpectationCode.class,
            com.google.fhir.r4.core.ConformanceExpectationCode.Builder.class);
  }

  /** Protobuf enum {@code google.fhir.r4.core.ConformanceExpectationCode.Value} */
  public enum Value implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>INVALID_UNINITIALIZED = 0;</code> */
    INVALID_UNINITIALIZED(0),
    /** <code>SHALL = 1 [(.google.fhir.proto.fhir_original_code) = "SHALL"];</code> */
    SHALL(1),
    /** <code>SHOULD = 2 [(.google.fhir.proto.fhir_original_code) = "SHOULD"];</code> */
    SHOULD(2),
    /** <code>MAY = 3 [(.google.fhir.proto.fhir_original_code) = "MAY"];</code> */
    MAY(3),
    /** <code>SHOULD_NOT = 4 [(.google.fhir.proto.fhir_original_code) = "SHOULD-NOT"];</code> */
    SHOULD_NOT(4),
    UNRECOGNIZED(-1),
    ;

    /** <code>INVALID_UNINITIALIZED = 0;</code> */
    public static final int INVALID_UNINITIALIZED_VALUE = 0;
    /** <code>SHALL = 1 [(.google.fhir.proto.fhir_original_code) = "SHALL"];</code> */
    public static final int SHALL_VALUE = 1;
    /** <code>SHOULD = 2 [(.google.fhir.proto.fhir_original_code) = "SHOULD"];</code> */
    public static final int SHOULD_VALUE = 2;
    /** <code>MAY = 3 [(.google.fhir.proto.fhir_original_code) = "MAY"];</code> */
    public static final int MAY_VALUE = 3;
    /** <code>SHOULD_NOT = 4 [(.google.fhir.proto.fhir_original_code) = "SHOULD-NOT"];</code> */
    public static final int SHOULD_NOT_VALUE = 4;

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
          return SHALL;
        case 2:
          return SHOULD;
        case 3:
          return MAY;
        case 4:
          return SHOULD_NOT;
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
      return com.google.fhir.r4.core.ConformanceExpectationCode.getDescriptor()
          .getEnumTypes()
          .get(0);
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

    // @@protoc_insertion_point(enum_scope:google.fhir.r4.core.ConformanceExpectationCode.Value)
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
    if (!(obj instanceof com.google.fhir.r4.core.ConformanceExpectationCode)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.ConformanceExpectationCode other =
        (com.google.fhir.r4.core.ConformanceExpectationCode) obj;

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

  public static com.google.fhir.r4.core.ConformanceExpectationCode parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.ConformanceExpectationCode parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ConformanceExpectationCode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.ConformanceExpectationCode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ConformanceExpectationCode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.ConformanceExpectationCode parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ConformanceExpectationCode parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.ConformanceExpectationCode parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ConformanceExpectationCode parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.ConformanceExpectationCode parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ConformanceExpectationCode parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.ConformanceExpectationCode parseFrom(
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

  public static Builder newBuilder(com.google.fhir.r4.core.ConformanceExpectationCode prototype) {
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
   * Indicates the degree of adherence to a specified behavior or capability
   * expected for a system to be deemed conformant with a specification. See
   * http://terminology.hl7.org/CodeSystem/conformance-expectation
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.ConformanceExpectationCode}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.ConformanceExpectationCode)
      com.google.fhir.r4.core.ConformanceExpectationCodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.r4.core.Codes
          .internal_static_google_fhir_r4_core_ConformanceExpectationCode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Codes
          .internal_static_google_fhir_r4_core_ConformanceExpectationCode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.ConformanceExpectationCode.class,
              com.google.fhir.r4.core.ConformanceExpectationCode.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.ConformanceExpectationCode.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.fhir.r4.core.Codes
          .internal_static_google_fhir_r4_core_ConformanceExpectationCode_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.ConformanceExpectationCode getDefaultInstanceForType() {
      return com.google.fhir.r4.core.ConformanceExpectationCode.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.ConformanceExpectationCode build() {
      com.google.fhir.r4.core.ConformanceExpectationCode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.ConformanceExpectationCode buildPartial() {
      com.google.fhir.r4.core.ConformanceExpectationCode result =
          new com.google.fhir.r4.core.ConformanceExpectationCode(this);
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
      if (other instanceof com.google.fhir.r4.core.ConformanceExpectationCode) {
        return mergeFrom((com.google.fhir.r4.core.ConformanceExpectationCode) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.ConformanceExpectationCode other) {
      if (other == com.google.fhir.r4.core.ConformanceExpectationCode.getDefaultInstance())
        return this;
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
      com.google.fhir.r4.core.ConformanceExpectationCode parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.fhir.r4.core.ConformanceExpectationCode) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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

    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.ConformanceExpectationCode)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.ConformanceExpectationCode)
  private static final com.google.fhir.r4.core.ConformanceExpectationCode DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.ConformanceExpectationCode();
  }

  public static com.google.fhir.r4.core.ConformanceExpectationCode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConformanceExpectationCode> PARSER =
      new com.google.protobuf.AbstractParser<ConformanceExpectationCode>() {
        @java.lang.Override
        public ConformanceExpectationCode parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ConformanceExpectationCode(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ConformanceExpectationCode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConformanceExpectationCode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.ConformanceExpectationCode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
