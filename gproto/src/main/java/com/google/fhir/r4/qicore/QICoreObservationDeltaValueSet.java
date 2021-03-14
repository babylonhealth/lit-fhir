// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/qicore/codes.proto

package com.google.fhir.r4.qicore;

/**
 *
 *
 * <pre>
 * Code indicating how the current observation compares to previous observations
 * - e.g., no change, rising trend, decreasing trend, etc... See
 * http://hl7.org/fhir/us/qicore/ValueSet/qicore-observation-delta
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.qicore.QICoreObservationDeltaValueSet}
 */
public final class QICoreObservationDeltaValueSet extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.qicore.QICoreObservationDeltaValueSet)
    QICoreObservationDeltaValueSetOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use QICoreObservationDeltaValueSet.newBuilder() to construct.
  private QICoreObservationDeltaValueSet(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private QICoreObservationDeltaValueSet() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new QICoreObservationDeltaValueSet();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private QICoreObservationDeltaValueSet(
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
    return com.google.fhir.r4.qicore.Codes
        .internal_static_google_fhir_r4_qicore_QICoreObservationDeltaValueSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.qicore.Codes
        .internal_static_google_fhir_r4_qicore_QICoreObservationDeltaValueSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet.class,
            com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet.Builder.class);
  }

  /** Protobuf enum {@code google.fhir.r4.qicore.QICoreObservationDeltaValueSet.Value} */
  public enum Value implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>INVALID_UNINITIALIZED = 0;</code> */
    INVALID_UNINITIALIZED(0),
    /**
     * <code>
     * B = 1 [(.google.fhir.proto.fhir_original_code) = "B", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v2-0078"];
     * </code>
     */
    B(1),
    /**
     * <code>
     * D = 2 [(.google.fhir.proto.fhir_original_code) = "D", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v2-0078"];
     * </code>
     */
    D(2),
    /**
     * <code>
     * U = 3 [(.google.fhir.proto.fhir_original_code) = "U", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v2-0078"];
     * </code>
     */
    U(3),
    /**
     * <code>
     * W = 4 [(.google.fhir.proto.fhir_original_code) = "W", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v2-0078"];
     * </code>
     */
    W(4),
    UNRECOGNIZED(-1),
    ;

    /** <code>INVALID_UNINITIALIZED = 0;</code> */
    public static final int INVALID_UNINITIALIZED_VALUE = 0;
    /**
     * <code>
     * B = 1 [(.google.fhir.proto.fhir_original_code) = "B", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v2-0078"];
     * </code>
     */
    public static final int B_VALUE = 1;
    /**
     * <code>
     * D = 2 [(.google.fhir.proto.fhir_original_code) = "D", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v2-0078"];
     * </code>
     */
    public static final int D_VALUE = 2;
    /**
     * <code>
     * U = 3 [(.google.fhir.proto.fhir_original_code) = "U", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v2-0078"];
     * </code>
     */
    public static final int U_VALUE = 3;
    /**
     * <code>
     * W = 4 [(.google.fhir.proto.fhir_original_code) = "W", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v2-0078"];
     * </code>
     */
    public static final int W_VALUE = 4;

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
          return B;
        case 2:
          return D;
        case 3:
          return U;
        case 4:
          return W;
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
      return com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet.getDescriptor()
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

    // @@protoc_insertion_point(enum_scope:google.fhir.r4.qicore.QICoreObservationDeltaValueSet.Value)
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
    if (!(obj instanceof com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet other =
        (com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet) obj;

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

  public static com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet parseFrom(
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

  public static Builder newBuilder(
      com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet prototype) {
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
   * Code indicating how the current observation compares to previous observations
   * - e.g., no change, rising trend, decreasing trend, etc... See
   * http://hl7.org/fhir/us/qicore/ValueSet/qicore-observation-delta
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.qicore.QICoreObservationDeltaValueSet}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.qicore.QICoreObservationDeltaValueSet)
      com.google.fhir.r4.qicore.QICoreObservationDeltaValueSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.r4.qicore.Codes
          .internal_static_google_fhir_r4_qicore_QICoreObservationDeltaValueSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.qicore.Codes
          .internal_static_google_fhir_r4_qicore_QICoreObservationDeltaValueSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet.class,
              com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet.Builder.class);
    }

    // Construct using com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet.newBuilder()
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
      return com.google.fhir.r4.qicore.Codes
          .internal_static_google_fhir_r4_qicore_QICoreObservationDeltaValueSet_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet getDefaultInstanceForType() {
      return com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet build() {
      com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet buildPartial() {
      com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet result =
          new com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet(this);
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
      if (other instanceof com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet) {
        return mergeFrom((com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet other) {
      if (other == com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet.getDefaultInstance())
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
      com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet) e.getUnfinishedMessage();
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

    // @@protoc_insertion_point(builder_scope:google.fhir.r4.qicore.QICoreObservationDeltaValueSet)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.qicore.QICoreObservationDeltaValueSet)
  private static final com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet();
  }

  public static com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QICoreObservationDeltaValueSet> PARSER =
      new com.google.protobuf.AbstractParser<QICoreObservationDeltaValueSet>() {
        @java.lang.Override
        public QICoreObservationDeltaValueSet parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new QICoreObservationDeltaValueSet(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<QICoreObservationDeltaValueSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QICoreObservationDeltaValueSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.qicore.QICoreObservationDeltaValueSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
