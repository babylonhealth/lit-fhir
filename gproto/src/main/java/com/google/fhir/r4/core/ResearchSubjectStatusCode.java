// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/codes.proto

package com.google.fhir.r4.core;

/**
 *
 *
 * <pre>
 * Indicates the progression of a study subject through a study.
 * See http://hl7.org/fhir/research-subject-status
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.ResearchSubjectStatusCode}
 */
public final class ResearchSubjectStatusCode extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.ResearchSubjectStatusCode)
    ResearchSubjectStatusCodeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ResearchSubjectStatusCode.newBuilder() to construct.
  private ResearchSubjectStatusCode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ResearchSubjectStatusCode() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ResearchSubjectStatusCode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ResearchSubjectStatusCode(
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
        .internal_static_google_fhir_r4_core_ResearchSubjectStatusCode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Codes
        .internal_static_google_fhir_r4_core_ResearchSubjectStatusCode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.ResearchSubjectStatusCode.class,
            com.google.fhir.r4.core.ResearchSubjectStatusCode.Builder.class);
  }

  /** Protobuf enum {@code google.fhir.r4.core.ResearchSubjectStatusCode.Value} */
  public enum Value implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>INVALID_UNINITIALIZED = 0;</code> */
    INVALID_UNINITIALIZED(0),
    /** <code>CANDIDATE = 1;</code> */
    CANDIDATE(1),
    /** <code>ELIGIBLE = 2;</code> */
    ELIGIBLE(2),
    /** <code>FOLLOW_UP = 3;</code> */
    FOLLOW_UP(3),
    /** <code>INELIGIBLE = 4;</code> */
    INELIGIBLE(4),
    /** <code>NOT_REGISTERED = 5;</code> */
    NOT_REGISTERED(5),
    /** <code>OFF_STUDY = 6;</code> */
    OFF_STUDY(6),
    /** <code>ON_STUDY = 7;</code> */
    ON_STUDY(7),
    /** <code>ON_STUDY_INTERVENTION = 8;</code> */
    ON_STUDY_INTERVENTION(8),
    /** <code>ON_STUDY_OBSERVATION = 9;</code> */
    ON_STUDY_OBSERVATION(9),
    /** <code>PENDING_ON_STUDY = 10;</code> */
    PENDING_ON_STUDY(10),
    /** <code>POTENTIAL_CANDIDATE = 11;</code> */
    POTENTIAL_CANDIDATE(11),
    /** <code>SCREENING = 12;</code> */
    SCREENING(12),
    /** <code>WITHDRAWN = 13;</code> */
    WITHDRAWN(13),
    UNRECOGNIZED(-1),
    ;

    /** <code>INVALID_UNINITIALIZED = 0;</code> */
    public static final int INVALID_UNINITIALIZED_VALUE = 0;
    /** <code>CANDIDATE = 1;</code> */
    public static final int CANDIDATE_VALUE = 1;
    /** <code>ELIGIBLE = 2;</code> */
    public static final int ELIGIBLE_VALUE = 2;
    /** <code>FOLLOW_UP = 3;</code> */
    public static final int FOLLOW_UP_VALUE = 3;
    /** <code>INELIGIBLE = 4;</code> */
    public static final int INELIGIBLE_VALUE = 4;
    /** <code>NOT_REGISTERED = 5;</code> */
    public static final int NOT_REGISTERED_VALUE = 5;
    /** <code>OFF_STUDY = 6;</code> */
    public static final int OFF_STUDY_VALUE = 6;
    /** <code>ON_STUDY = 7;</code> */
    public static final int ON_STUDY_VALUE = 7;
    /** <code>ON_STUDY_INTERVENTION = 8;</code> */
    public static final int ON_STUDY_INTERVENTION_VALUE = 8;
    /** <code>ON_STUDY_OBSERVATION = 9;</code> */
    public static final int ON_STUDY_OBSERVATION_VALUE = 9;
    /** <code>PENDING_ON_STUDY = 10;</code> */
    public static final int PENDING_ON_STUDY_VALUE = 10;
    /** <code>POTENTIAL_CANDIDATE = 11;</code> */
    public static final int POTENTIAL_CANDIDATE_VALUE = 11;
    /** <code>SCREENING = 12;</code> */
    public static final int SCREENING_VALUE = 12;
    /** <code>WITHDRAWN = 13;</code> */
    public static final int WITHDRAWN_VALUE = 13;

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
          return CANDIDATE;
        case 2:
          return ELIGIBLE;
        case 3:
          return FOLLOW_UP;
        case 4:
          return INELIGIBLE;
        case 5:
          return NOT_REGISTERED;
        case 6:
          return OFF_STUDY;
        case 7:
          return ON_STUDY;
        case 8:
          return ON_STUDY_INTERVENTION;
        case 9:
          return ON_STUDY_OBSERVATION;
        case 10:
          return PENDING_ON_STUDY;
        case 11:
          return POTENTIAL_CANDIDATE;
        case 12:
          return SCREENING;
        case 13:
          return WITHDRAWN;
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
      return com.google.fhir.r4.core.ResearchSubjectStatusCode.getDescriptor()
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

    // @@protoc_insertion_point(enum_scope:google.fhir.r4.core.ResearchSubjectStatusCode.Value)
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
    if (!(obj instanceof com.google.fhir.r4.core.ResearchSubjectStatusCode)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.ResearchSubjectStatusCode other =
        (com.google.fhir.r4.core.ResearchSubjectStatusCode) obj;

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

  public static com.google.fhir.r4.core.ResearchSubjectStatusCode parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.ResearchSubjectStatusCode parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ResearchSubjectStatusCode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.ResearchSubjectStatusCode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ResearchSubjectStatusCode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.ResearchSubjectStatusCode parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ResearchSubjectStatusCode parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.ResearchSubjectStatusCode parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ResearchSubjectStatusCode parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.ResearchSubjectStatusCode parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ResearchSubjectStatusCode parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.ResearchSubjectStatusCode parseFrom(
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

  public static Builder newBuilder(com.google.fhir.r4.core.ResearchSubjectStatusCode prototype) {
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
   * Indicates the progression of a study subject through a study.
   * See http://hl7.org/fhir/research-subject-status
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.ResearchSubjectStatusCode}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.ResearchSubjectStatusCode)
      com.google.fhir.r4.core.ResearchSubjectStatusCodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.r4.core.Codes
          .internal_static_google_fhir_r4_core_ResearchSubjectStatusCode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Codes
          .internal_static_google_fhir_r4_core_ResearchSubjectStatusCode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.ResearchSubjectStatusCode.class,
              com.google.fhir.r4.core.ResearchSubjectStatusCode.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.ResearchSubjectStatusCode.newBuilder()
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
          .internal_static_google_fhir_r4_core_ResearchSubjectStatusCode_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.ResearchSubjectStatusCode getDefaultInstanceForType() {
      return com.google.fhir.r4.core.ResearchSubjectStatusCode.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.ResearchSubjectStatusCode build() {
      com.google.fhir.r4.core.ResearchSubjectStatusCode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.ResearchSubjectStatusCode buildPartial() {
      com.google.fhir.r4.core.ResearchSubjectStatusCode result =
          new com.google.fhir.r4.core.ResearchSubjectStatusCode(this);
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
      if (other instanceof com.google.fhir.r4.core.ResearchSubjectStatusCode) {
        return mergeFrom((com.google.fhir.r4.core.ResearchSubjectStatusCode) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.ResearchSubjectStatusCode other) {
      if (other == com.google.fhir.r4.core.ResearchSubjectStatusCode.getDefaultInstance())
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
      com.google.fhir.r4.core.ResearchSubjectStatusCode parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.fhir.r4.core.ResearchSubjectStatusCode) e.getUnfinishedMessage();
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

    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.ResearchSubjectStatusCode)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.ResearchSubjectStatusCode)
  private static final com.google.fhir.r4.core.ResearchSubjectStatusCode DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.ResearchSubjectStatusCode();
  }

  public static com.google.fhir.r4.core.ResearchSubjectStatusCode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResearchSubjectStatusCode> PARSER =
      new com.google.protobuf.AbstractParser<ResearchSubjectStatusCode>() {
        @java.lang.Override
        public ResearchSubjectStatusCode parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ResearchSubjectStatusCode(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ResearchSubjectStatusCode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResearchSubjectStatusCode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.ResearchSubjectStatusCode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}