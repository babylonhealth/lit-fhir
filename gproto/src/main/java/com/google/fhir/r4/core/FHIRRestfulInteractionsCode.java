// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/codes.proto

package com.google.fhir.r4.core;

/**
 *
 *
 * <pre>
 * The set of interactions defined by the RESTful part of the FHIR
 * specification. See http://hl7.org/fhir/restful-interaction
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.FHIRRestfulInteractionsCode}
 */
public final class FHIRRestfulInteractionsCode extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.FHIRRestfulInteractionsCode)
    FHIRRestfulInteractionsCodeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FHIRRestfulInteractionsCode.newBuilder() to construct.
  private FHIRRestfulInteractionsCode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FHIRRestfulInteractionsCode() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FHIRRestfulInteractionsCode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private FHIRRestfulInteractionsCode(
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
        .internal_static_google_fhir_r4_core_FHIRRestfulInteractionsCode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Codes
        .internal_static_google_fhir_r4_core_FHIRRestfulInteractionsCode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.FHIRRestfulInteractionsCode.class,
            com.google.fhir.r4.core.FHIRRestfulInteractionsCode.Builder.class);
  }

  /** Protobuf enum {@code google.fhir.r4.core.FHIRRestfulInteractionsCode.Value} */
  public enum Value implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>INVALID_UNINITIALIZED = 0;</code> */
    INVALID_UNINITIALIZED(0),
    /** <code>READ = 1;</code> */
    READ(1),
    /** <code>VREAD = 2;</code> */
    VREAD(2),
    /** <code>UPDATE = 3;</code> */
    UPDATE(3),
    /** <code>PATCH = 4;</code> */
    PATCH(4),
    /** <code>DELETE = 5;</code> */
    DELETE(5),
    /** <code>HISTORY = 6;</code> */
    HISTORY(6),
    /** <code>HISTORY_INSTANCE = 7;</code> */
    HISTORY_INSTANCE(7),
    /** <code>HISTORY_TYPE = 8;</code> */
    HISTORY_TYPE(8),
    /** <code>HISTORY_SYSTEM = 9;</code> */
    HISTORY_SYSTEM(9),
    /** <code>CREATE = 10;</code> */
    CREATE(10),
    /** <code>SEARCH = 11;</code> */
    SEARCH(11),
    /** <code>SEARCH_TYPE = 12;</code> */
    SEARCH_TYPE(12),
    /** <code>SEARCH_SYSTEM = 13;</code> */
    SEARCH_SYSTEM(13),
    /** <code>CAPABILITIES = 14;</code> */
    CAPABILITIES(14),
    /** <code>TRANSACTION = 15;</code> */
    TRANSACTION(15),
    /** <code>BATCH = 16;</code> */
    BATCH(16),
    /** <code>OPERATION = 17;</code> */
    OPERATION(17),
    UNRECOGNIZED(-1),
    ;

    /** <code>INVALID_UNINITIALIZED = 0;</code> */
    public static final int INVALID_UNINITIALIZED_VALUE = 0;
    /** <code>READ = 1;</code> */
    public static final int READ_VALUE = 1;
    /** <code>VREAD = 2;</code> */
    public static final int VREAD_VALUE = 2;
    /** <code>UPDATE = 3;</code> */
    public static final int UPDATE_VALUE = 3;
    /** <code>PATCH = 4;</code> */
    public static final int PATCH_VALUE = 4;
    /** <code>DELETE = 5;</code> */
    public static final int DELETE_VALUE = 5;
    /** <code>HISTORY = 6;</code> */
    public static final int HISTORY_VALUE = 6;
    /** <code>HISTORY_INSTANCE = 7;</code> */
    public static final int HISTORY_INSTANCE_VALUE = 7;
    /** <code>HISTORY_TYPE = 8;</code> */
    public static final int HISTORY_TYPE_VALUE = 8;
    /** <code>HISTORY_SYSTEM = 9;</code> */
    public static final int HISTORY_SYSTEM_VALUE = 9;
    /** <code>CREATE = 10;</code> */
    public static final int CREATE_VALUE = 10;
    /** <code>SEARCH = 11;</code> */
    public static final int SEARCH_VALUE = 11;
    /** <code>SEARCH_TYPE = 12;</code> */
    public static final int SEARCH_TYPE_VALUE = 12;
    /** <code>SEARCH_SYSTEM = 13;</code> */
    public static final int SEARCH_SYSTEM_VALUE = 13;
    /** <code>CAPABILITIES = 14;</code> */
    public static final int CAPABILITIES_VALUE = 14;
    /** <code>TRANSACTION = 15;</code> */
    public static final int TRANSACTION_VALUE = 15;
    /** <code>BATCH = 16;</code> */
    public static final int BATCH_VALUE = 16;
    /** <code>OPERATION = 17;</code> */
    public static final int OPERATION_VALUE = 17;

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
          return READ;
        case 2:
          return VREAD;
        case 3:
          return UPDATE;
        case 4:
          return PATCH;
        case 5:
          return DELETE;
        case 6:
          return HISTORY;
        case 7:
          return HISTORY_INSTANCE;
        case 8:
          return HISTORY_TYPE;
        case 9:
          return HISTORY_SYSTEM;
        case 10:
          return CREATE;
        case 11:
          return SEARCH;
        case 12:
          return SEARCH_TYPE;
        case 13:
          return SEARCH_SYSTEM;
        case 14:
          return CAPABILITIES;
        case 15:
          return TRANSACTION;
        case 16:
          return BATCH;
        case 17:
          return OPERATION;
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
      return com.google.fhir.r4.core.FHIRRestfulInteractionsCode.getDescriptor()
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

    // @@protoc_insertion_point(enum_scope:google.fhir.r4.core.FHIRRestfulInteractionsCode.Value)
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
    if (!(obj instanceof com.google.fhir.r4.core.FHIRRestfulInteractionsCode)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.FHIRRestfulInteractionsCode other =
        (com.google.fhir.r4.core.FHIRRestfulInteractionsCode) obj;

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

  public static com.google.fhir.r4.core.FHIRRestfulInteractionsCode parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.FHIRRestfulInteractionsCode parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.FHIRRestfulInteractionsCode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.FHIRRestfulInteractionsCode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.FHIRRestfulInteractionsCode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.FHIRRestfulInteractionsCode parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.FHIRRestfulInteractionsCode parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.FHIRRestfulInteractionsCode parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.FHIRRestfulInteractionsCode parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.FHIRRestfulInteractionsCode parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.FHIRRestfulInteractionsCode parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.FHIRRestfulInteractionsCode parseFrom(
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

  public static Builder newBuilder(com.google.fhir.r4.core.FHIRRestfulInteractionsCode prototype) {
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
   * The set of interactions defined by the RESTful part of the FHIR
   * specification. See http://hl7.org/fhir/restful-interaction
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.FHIRRestfulInteractionsCode}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.FHIRRestfulInteractionsCode)
      com.google.fhir.r4.core.FHIRRestfulInteractionsCodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.r4.core.Codes
          .internal_static_google_fhir_r4_core_FHIRRestfulInteractionsCode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Codes
          .internal_static_google_fhir_r4_core_FHIRRestfulInteractionsCode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.FHIRRestfulInteractionsCode.class,
              com.google.fhir.r4.core.FHIRRestfulInteractionsCode.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.FHIRRestfulInteractionsCode.newBuilder()
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
          .internal_static_google_fhir_r4_core_FHIRRestfulInteractionsCode_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.FHIRRestfulInteractionsCode getDefaultInstanceForType() {
      return com.google.fhir.r4.core.FHIRRestfulInteractionsCode.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.FHIRRestfulInteractionsCode build() {
      com.google.fhir.r4.core.FHIRRestfulInteractionsCode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.FHIRRestfulInteractionsCode buildPartial() {
      com.google.fhir.r4.core.FHIRRestfulInteractionsCode result =
          new com.google.fhir.r4.core.FHIRRestfulInteractionsCode(this);
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
      if (other instanceof com.google.fhir.r4.core.FHIRRestfulInteractionsCode) {
        return mergeFrom((com.google.fhir.r4.core.FHIRRestfulInteractionsCode) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.FHIRRestfulInteractionsCode other) {
      if (other == com.google.fhir.r4.core.FHIRRestfulInteractionsCode.getDefaultInstance())
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
      com.google.fhir.r4.core.FHIRRestfulInteractionsCode parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.fhir.r4.core.FHIRRestfulInteractionsCode) e.getUnfinishedMessage();
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

    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.FHIRRestfulInteractionsCode)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.FHIRRestfulInteractionsCode)
  private static final com.google.fhir.r4.core.FHIRRestfulInteractionsCode DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.FHIRRestfulInteractionsCode();
  }

  public static com.google.fhir.r4.core.FHIRRestfulInteractionsCode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FHIRRestfulInteractionsCode> PARSER =
      new com.google.protobuf.AbstractParser<FHIRRestfulInteractionsCode>() {
        @java.lang.Override
        public FHIRRestfulInteractionsCode parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new FHIRRestfulInteractionsCode(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<FHIRRestfulInteractionsCode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FHIRRestfulInteractionsCode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.FHIRRestfulInteractionsCode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}