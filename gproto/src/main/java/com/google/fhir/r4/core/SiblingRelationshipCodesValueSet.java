// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/valuesets.proto

package com.google.fhir.r4.core;

/**
 *
 *
 * <pre>
 * The value set includes the v3 RoleCode SIB (sibling) and all of its
 * specializations.  It covers the relationships needed to establish genetic
 * pedigree relationships between family members. See
 * http://hl7.org/fhir/ValueSet/sibling-relationship-codes
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.SiblingRelationshipCodesValueSet}
 */
public final class SiblingRelationshipCodesValueSet extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.SiblingRelationshipCodesValueSet)
    SiblingRelationshipCodesValueSetOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SiblingRelationshipCodesValueSet.newBuilder() to construct.
  private SiblingRelationshipCodesValueSet(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SiblingRelationshipCodesValueSet() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SiblingRelationshipCodesValueSet();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SiblingRelationshipCodesValueSet(
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
    return com.google.fhir.r4.core.Valuesets
        .internal_static_google_fhir_r4_core_SiblingRelationshipCodesValueSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Valuesets
        .internal_static_google_fhir_r4_core_SiblingRelationshipCodesValueSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.SiblingRelationshipCodesValueSet.class,
            com.google.fhir.r4.core.SiblingRelationshipCodesValueSet.Builder.class);
  }

  /** Protobuf enum {@code google.fhir.r4.core.SiblingRelationshipCodesValueSet.Value} */
  public enum Value implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>INVALID_UNINITIALIZED = 0;</code> */
    INVALID_UNINITIALIZED(0),
    /**
     * <code>
     * SIB = 1 [(.google.fhir.proto.fhir_original_code) = "SIB", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    SIB(1),
    /**
     * <code>
     * BRO = 2 [(.google.fhir.proto.fhir_original_code) = "BRO", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    BRO(2),
    /**
     * <code>
     * HBRO = 3 [(.google.fhir.proto.fhir_original_code) = "HBRO", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    HBRO(3),
    /**
     * <code>
     * NBRO = 4 [(.google.fhir.proto.fhir_original_code) = "NBRO", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    NBRO(4),
    /**
     * <code>
     * TWINBRO = 5 [(.google.fhir.proto.fhir_original_code) = "TWINBRO", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    TWINBRO(5),
    /**
     * <code>
     * FTWINBRO = 6 [(.google.fhir.proto.fhir_original_code) = "FTWINBRO", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    FTWINBRO(6),
    /**
     * <code>
     * ITWINBRO = 7 [(.google.fhir.proto.fhir_original_code) = "ITWINBRO", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    ITWINBRO(7),
    /**
     * <code>
     * STPBRO = 8 [(.google.fhir.proto.fhir_original_code) = "STPBRO", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    STPBRO(8),
    /**
     * <code>
     * HSIB = 9 [(.google.fhir.proto.fhir_original_code) = "HSIB", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    HSIB(9),
    /**
     * <code>
     * HSIS = 10 [(.google.fhir.proto.fhir_original_code) = "HSIS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    HSIS(10),
    /**
     * <code>
     * NSIB = 11 [(.google.fhir.proto.fhir_original_code) = "NSIB", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    NSIB(11),
    /**
     * <code>
     * NSIS = 12 [(.google.fhir.proto.fhir_original_code) = "NSIS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    NSIS(12),
    /**
     * <code>
     * TWINSIS = 13 [(.google.fhir.proto.fhir_original_code) = "TWINSIS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    TWINSIS(13),
    /**
     * <code>
     * FTWINSIS = 14 [(.google.fhir.proto.fhir_original_code) = "FTWINSIS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    FTWINSIS(14),
    /**
     * <code>
     * ITWINSIS = 15 [(.google.fhir.proto.fhir_original_code) = "ITWINSIS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    ITWINSIS(15),
    /**
     * <code>
     * TWIN = 16 [(.google.fhir.proto.fhir_original_code) = "TWIN", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    TWIN(16),
    /**
     * <code>
     * FTWIN = 17 [(.google.fhir.proto.fhir_original_code) = "FTWIN", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    FTWIN(17),
    /**
     * <code>
     * ITWIN = 18 [(.google.fhir.proto.fhir_original_code) = "ITWIN", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    ITWIN(18),
    /**
     * <code>
     * SIS = 19 [(.google.fhir.proto.fhir_original_code) = "SIS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    SIS(19),
    /**
     * <code>
     * STPSIS = 20 [(.google.fhir.proto.fhir_original_code) = "STPSIS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    STPSIS(20),
    /**
     * <code>
     * STPSIB = 21 [(.google.fhir.proto.fhir_original_code) = "STPSIB", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    STPSIB(21),
    UNRECOGNIZED(-1),
    ;

    /** <code>INVALID_UNINITIALIZED = 0;</code> */
    public static final int INVALID_UNINITIALIZED_VALUE = 0;
    /**
     * <code>
     * SIB = 1 [(.google.fhir.proto.fhir_original_code) = "SIB", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int SIB_VALUE = 1;
    /**
     * <code>
     * BRO = 2 [(.google.fhir.proto.fhir_original_code) = "BRO", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int BRO_VALUE = 2;
    /**
     * <code>
     * HBRO = 3 [(.google.fhir.proto.fhir_original_code) = "HBRO", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int HBRO_VALUE = 3;
    /**
     * <code>
     * NBRO = 4 [(.google.fhir.proto.fhir_original_code) = "NBRO", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int NBRO_VALUE = 4;
    /**
     * <code>
     * TWINBRO = 5 [(.google.fhir.proto.fhir_original_code) = "TWINBRO", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int TWINBRO_VALUE = 5;
    /**
     * <code>
     * FTWINBRO = 6 [(.google.fhir.proto.fhir_original_code) = "FTWINBRO", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int FTWINBRO_VALUE = 6;
    /**
     * <code>
     * ITWINBRO = 7 [(.google.fhir.proto.fhir_original_code) = "ITWINBRO", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int ITWINBRO_VALUE = 7;
    /**
     * <code>
     * STPBRO = 8 [(.google.fhir.proto.fhir_original_code) = "STPBRO", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int STPBRO_VALUE = 8;
    /**
     * <code>
     * HSIB = 9 [(.google.fhir.proto.fhir_original_code) = "HSIB", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int HSIB_VALUE = 9;
    /**
     * <code>
     * HSIS = 10 [(.google.fhir.proto.fhir_original_code) = "HSIS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int HSIS_VALUE = 10;
    /**
     * <code>
     * NSIB = 11 [(.google.fhir.proto.fhir_original_code) = "NSIB", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int NSIB_VALUE = 11;
    /**
     * <code>
     * NSIS = 12 [(.google.fhir.proto.fhir_original_code) = "NSIS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int NSIS_VALUE = 12;
    /**
     * <code>
     * TWINSIS = 13 [(.google.fhir.proto.fhir_original_code) = "TWINSIS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int TWINSIS_VALUE = 13;
    /**
     * <code>
     * FTWINSIS = 14 [(.google.fhir.proto.fhir_original_code) = "FTWINSIS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int FTWINSIS_VALUE = 14;
    /**
     * <code>
     * ITWINSIS = 15 [(.google.fhir.proto.fhir_original_code) = "ITWINSIS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int ITWINSIS_VALUE = 15;
    /**
     * <code>
     * TWIN = 16 [(.google.fhir.proto.fhir_original_code) = "TWIN", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int TWIN_VALUE = 16;
    /**
     * <code>
     * FTWIN = 17 [(.google.fhir.proto.fhir_original_code) = "FTWIN", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int FTWIN_VALUE = 17;
    /**
     * <code>
     * ITWIN = 18 [(.google.fhir.proto.fhir_original_code) = "ITWIN", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int ITWIN_VALUE = 18;
    /**
     * <code>
     * SIS = 19 [(.google.fhir.proto.fhir_original_code) = "SIS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int SIS_VALUE = 19;
    /**
     * <code>
     * STPSIS = 20 [(.google.fhir.proto.fhir_original_code) = "STPSIS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int STPSIS_VALUE = 20;
    /**
     * <code>
     * STPSIB = 21 [(.google.fhir.proto.fhir_original_code) = "STPSIB", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-RoleCode"];
     * </code>
     */
    public static final int STPSIB_VALUE = 21;

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
          return SIB;
        case 2:
          return BRO;
        case 3:
          return HBRO;
        case 4:
          return NBRO;
        case 5:
          return TWINBRO;
        case 6:
          return FTWINBRO;
        case 7:
          return ITWINBRO;
        case 8:
          return STPBRO;
        case 9:
          return HSIB;
        case 10:
          return HSIS;
        case 11:
          return NSIB;
        case 12:
          return NSIS;
        case 13:
          return TWINSIS;
        case 14:
          return FTWINSIS;
        case 15:
          return ITWINSIS;
        case 16:
          return TWIN;
        case 17:
          return FTWIN;
        case 18:
          return ITWIN;
        case 19:
          return SIS;
        case 20:
          return STPSIS;
        case 21:
          return STPSIB;
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
      return com.google.fhir.r4.core.SiblingRelationshipCodesValueSet.getDescriptor()
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

    // @@protoc_insertion_point(enum_scope:google.fhir.r4.core.SiblingRelationshipCodesValueSet.Value)
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
    if (!(obj instanceof com.google.fhir.r4.core.SiblingRelationshipCodesValueSet)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.SiblingRelationshipCodesValueSet other =
        (com.google.fhir.r4.core.SiblingRelationshipCodesValueSet) obj;

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

  public static com.google.fhir.r4.core.SiblingRelationshipCodesValueSet parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.SiblingRelationshipCodesValueSet parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.SiblingRelationshipCodesValueSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.SiblingRelationshipCodesValueSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.SiblingRelationshipCodesValueSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.SiblingRelationshipCodesValueSet parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.SiblingRelationshipCodesValueSet parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.SiblingRelationshipCodesValueSet parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.SiblingRelationshipCodesValueSet parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.SiblingRelationshipCodesValueSet parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.SiblingRelationshipCodesValueSet parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.SiblingRelationshipCodesValueSet parseFrom(
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
      com.google.fhir.r4.core.SiblingRelationshipCodesValueSet prototype) {
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
   * The value set includes the v3 RoleCode SIB (sibling) and all of its
   * specializations.  It covers the relationships needed to establish genetic
   * pedigree relationships between family members. See
   * http://hl7.org/fhir/ValueSet/sibling-relationship-codes
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.SiblingRelationshipCodesValueSet}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.SiblingRelationshipCodesValueSet)
      com.google.fhir.r4.core.SiblingRelationshipCodesValueSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.r4.core.Valuesets
          .internal_static_google_fhir_r4_core_SiblingRelationshipCodesValueSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Valuesets
          .internal_static_google_fhir_r4_core_SiblingRelationshipCodesValueSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.SiblingRelationshipCodesValueSet.class,
              com.google.fhir.r4.core.SiblingRelationshipCodesValueSet.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.SiblingRelationshipCodesValueSet.newBuilder()
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
      return com.google.fhir.r4.core.Valuesets
          .internal_static_google_fhir_r4_core_SiblingRelationshipCodesValueSet_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.SiblingRelationshipCodesValueSet getDefaultInstanceForType() {
      return com.google.fhir.r4.core.SiblingRelationshipCodesValueSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.SiblingRelationshipCodesValueSet build() {
      com.google.fhir.r4.core.SiblingRelationshipCodesValueSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.SiblingRelationshipCodesValueSet buildPartial() {
      com.google.fhir.r4.core.SiblingRelationshipCodesValueSet result =
          new com.google.fhir.r4.core.SiblingRelationshipCodesValueSet(this);
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
      if (other instanceof com.google.fhir.r4.core.SiblingRelationshipCodesValueSet) {
        return mergeFrom((com.google.fhir.r4.core.SiblingRelationshipCodesValueSet) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.SiblingRelationshipCodesValueSet other) {
      if (other == com.google.fhir.r4.core.SiblingRelationshipCodesValueSet.getDefaultInstance())
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
      com.google.fhir.r4.core.SiblingRelationshipCodesValueSet parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.fhir.r4.core.SiblingRelationshipCodesValueSet) e.getUnfinishedMessage();
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

    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.SiblingRelationshipCodesValueSet)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.SiblingRelationshipCodesValueSet)
  private static final com.google.fhir.r4.core.SiblingRelationshipCodesValueSet DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.SiblingRelationshipCodesValueSet();
  }

  public static com.google.fhir.r4.core.SiblingRelationshipCodesValueSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SiblingRelationshipCodesValueSet> PARSER =
      new com.google.protobuf.AbstractParser<SiblingRelationshipCodesValueSet>() {
        @java.lang.Override
        public SiblingRelationshipCodesValueSet parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SiblingRelationshipCodesValueSet(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SiblingRelationshipCodesValueSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SiblingRelationshipCodesValueSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.SiblingRelationshipCodesValueSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}