// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/valuesets.proto

package com.google.fhir.r4.core;

/**
 *
 *
 * <pre>
 * Real world event relating to the schedule.
 * See http://hl7.org/fhir/ValueSet/event-timing
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.EventTimingValueSet}
 */
public final class EventTimingValueSet extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.EventTimingValueSet)
    EventTimingValueSetOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EventTimingValueSet.newBuilder() to construct.
  private EventTimingValueSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EventTimingValueSet() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EventTimingValueSet();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private EventTimingValueSet(
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
        .internal_static_google_fhir_r4_core_EventTimingValueSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Valuesets
        .internal_static_google_fhir_r4_core_EventTimingValueSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.EventTimingValueSet.class,
            com.google.fhir.r4.core.EventTimingValueSet.Builder.class);
  }

  /** Protobuf enum {@code google.fhir.r4.core.EventTimingValueSet.Value} */
  public enum Value implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>INVALID_UNINITIALIZED = 0;</code> */
    INVALID_UNINITIALIZED(0),
    /**
     * <code>
     * MORN = 1 [(.google.fhir.proto.fhir_original_code) = "MORN", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    MORN(1),
    /**
     * <code>
     * MORN_EARLY = 2 [(.google.fhir.proto.fhir_original_code) = "MORN.early", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    MORN_EARLY(2),
    /**
     * <code>
     * MORN_LATE = 3 [(.google.fhir.proto.fhir_original_code) = "MORN.late", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    MORN_LATE(3),
    /**
     * <code>
     * NOON = 4 [(.google.fhir.proto.fhir_original_code) = "NOON", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    NOON(4),
    /**
     * <code>
     * AFT = 5 [(.google.fhir.proto.fhir_original_code) = "AFT", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    AFT(5),
    /**
     * <code>
     * AFT_EARLY = 6 [(.google.fhir.proto.fhir_original_code) = "AFT.early", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    AFT_EARLY(6),
    /**
     * <code>
     * AFT_LATE = 7 [(.google.fhir.proto.fhir_original_code) = "AFT.late", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    AFT_LATE(7),
    /**
     * <code>
     * EVE = 8 [(.google.fhir.proto.fhir_original_code) = "EVE", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    EVE(8),
    /**
     * <code>
     * EVE_EARLY = 9 [(.google.fhir.proto.fhir_original_code) = "EVE.early", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    EVE_EARLY(9),
    /**
     * <code>
     * EVE_LATE = 10 [(.google.fhir.proto.fhir_original_code) = "EVE.late", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    EVE_LATE(10),
    /**
     * <code>
     * NIGHT = 11 [(.google.fhir.proto.fhir_original_code) = "NIGHT", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    NIGHT(11),
    /**
     * <code>
     * PHS = 12 [(.google.fhir.proto.fhir_original_code) = "PHS", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    PHS(12),
    /**
     * <code>
     * HS = 13 [(.google.fhir.proto.fhir_original_code) = "HS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    HS(13),
    /**
     * <code>
     * WAKE = 14 [(.google.fhir.proto.fhir_original_code) = "WAKE", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    WAKE(14),
    /**
     * <code>
     * C = 15 [(.google.fhir.proto.fhir_original_code) = "C", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    C(15),
    /**
     * <code>
     * CM = 16 [(.google.fhir.proto.fhir_original_code) = "CM", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    CM(16),
    /**
     * <code>
     * CD = 17 [(.google.fhir.proto.fhir_original_code) = "CD", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    CD(17),
    /**
     * <code>
     * CV = 18 [(.google.fhir.proto.fhir_original_code) = "CV", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    CV(18),
    /**
     * <code>
     * AC = 19 [(.google.fhir.proto.fhir_original_code) = "AC", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    AC(19),
    /**
     * <code>
     * ACM = 20 [(.google.fhir.proto.fhir_original_code) = "ACM", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    ACM(20),
    /**
     * <code>
     * ACD = 21 [(.google.fhir.proto.fhir_original_code) = "ACD", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    ACD(21),
    /**
     * <code>
     * ACV = 22 [(.google.fhir.proto.fhir_original_code) = "ACV", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    ACV(22),
    /**
     * <code>
     * PC = 23 [(.google.fhir.proto.fhir_original_code) = "PC", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    PC(23),
    /**
     * <code>
     * PCM = 24 [(.google.fhir.proto.fhir_original_code) = "PCM", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    PCM(24),
    /**
     * <code>
     * PCD = 25 [(.google.fhir.proto.fhir_original_code) = "PCD", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    PCD(25),
    /**
     * <code>
     * PCV = 26 [(.google.fhir.proto.fhir_original_code) = "PCV", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    PCV(26),
    UNRECOGNIZED(-1),
    ;

    /** <code>INVALID_UNINITIALIZED = 0;</code> */
    public static final int INVALID_UNINITIALIZED_VALUE = 0;
    /**
     * <code>
     * MORN = 1 [(.google.fhir.proto.fhir_original_code) = "MORN", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    public static final int MORN_VALUE = 1;
    /**
     * <code>
     * MORN_EARLY = 2 [(.google.fhir.proto.fhir_original_code) = "MORN.early", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    public static final int MORN_EARLY_VALUE = 2;
    /**
     * <code>
     * MORN_LATE = 3 [(.google.fhir.proto.fhir_original_code) = "MORN.late", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    public static final int MORN_LATE_VALUE = 3;
    /**
     * <code>
     * NOON = 4 [(.google.fhir.proto.fhir_original_code) = "NOON", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    public static final int NOON_VALUE = 4;
    /**
     * <code>
     * AFT = 5 [(.google.fhir.proto.fhir_original_code) = "AFT", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    public static final int AFT_VALUE = 5;
    /**
     * <code>
     * AFT_EARLY = 6 [(.google.fhir.proto.fhir_original_code) = "AFT.early", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    public static final int AFT_EARLY_VALUE = 6;
    /**
     * <code>
     * AFT_LATE = 7 [(.google.fhir.proto.fhir_original_code) = "AFT.late", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    public static final int AFT_LATE_VALUE = 7;
    /**
     * <code>
     * EVE = 8 [(.google.fhir.proto.fhir_original_code) = "EVE", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    public static final int EVE_VALUE = 8;
    /**
     * <code>
     * EVE_EARLY = 9 [(.google.fhir.proto.fhir_original_code) = "EVE.early", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    public static final int EVE_EARLY_VALUE = 9;
    /**
     * <code>
     * EVE_LATE = 10 [(.google.fhir.proto.fhir_original_code) = "EVE.late", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    public static final int EVE_LATE_VALUE = 10;
    /**
     * <code>
     * NIGHT = 11 [(.google.fhir.proto.fhir_original_code) = "NIGHT", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    public static final int NIGHT_VALUE = 11;
    /**
     * <code>
     * PHS = 12 [(.google.fhir.proto.fhir_original_code) = "PHS", (.google.fhir.proto.source_code_system) = "http://hl7.org/fhir/event-timing"];
     * </code>
     */
    public static final int PHS_VALUE = 12;
    /**
     * <code>
     * HS = 13 [(.google.fhir.proto.fhir_original_code) = "HS", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    public static final int HS_VALUE = 13;
    /**
     * <code>
     * WAKE = 14 [(.google.fhir.proto.fhir_original_code) = "WAKE", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    public static final int WAKE_VALUE = 14;
    /**
     * <code>
     * C = 15 [(.google.fhir.proto.fhir_original_code) = "C", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    public static final int C_VALUE = 15;
    /**
     * <code>
     * CM = 16 [(.google.fhir.proto.fhir_original_code) = "CM", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    public static final int CM_VALUE = 16;
    /**
     * <code>
     * CD = 17 [(.google.fhir.proto.fhir_original_code) = "CD", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    public static final int CD_VALUE = 17;
    /**
     * <code>
     * CV = 18 [(.google.fhir.proto.fhir_original_code) = "CV", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    public static final int CV_VALUE = 18;
    /**
     * <code>
     * AC = 19 [(.google.fhir.proto.fhir_original_code) = "AC", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    public static final int AC_VALUE = 19;
    /**
     * <code>
     * ACM = 20 [(.google.fhir.proto.fhir_original_code) = "ACM", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    public static final int ACM_VALUE = 20;
    /**
     * <code>
     * ACD = 21 [(.google.fhir.proto.fhir_original_code) = "ACD", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    public static final int ACD_VALUE = 21;
    /**
     * <code>
     * ACV = 22 [(.google.fhir.proto.fhir_original_code) = "ACV", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    public static final int ACV_VALUE = 22;
    /**
     * <code>
     * PC = 23 [(.google.fhir.proto.fhir_original_code) = "PC", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    public static final int PC_VALUE = 23;
    /**
     * <code>
     * PCM = 24 [(.google.fhir.proto.fhir_original_code) = "PCM", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    public static final int PCM_VALUE = 24;
    /**
     * <code>
     * PCD = 25 [(.google.fhir.proto.fhir_original_code) = "PCD", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    public static final int PCD_VALUE = 25;
    /**
     * <code>
     * PCV = 26 [(.google.fhir.proto.fhir_original_code) = "PCV", (.google.fhir.proto.source_code_system) = "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"];
     * </code>
     */
    public static final int PCV_VALUE = 26;

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
          return MORN;
        case 2:
          return MORN_EARLY;
        case 3:
          return MORN_LATE;
        case 4:
          return NOON;
        case 5:
          return AFT;
        case 6:
          return AFT_EARLY;
        case 7:
          return AFT_LATE;
        case 8:
          return EVE;
        case 9:
          return EVE_EARLY;
        case 10:
          return EVE_LATE;
        case 11:
          return NIGHT;
        case 12:
          return PHS;
        case 13:
          return HS;
        case 14:
          return WAKE;
        case 15:
          return C;
        case 16:
          return CM;
        case 17:
          return CD;
        case 18:
          return CV;
        case 19:
          return AC;
        case 20:
          return ACM;
        case 21:
          return ACD;
        case 22:
          return ACV;
        case 23:
          return PC;
        case 24:
          return PCM;
        case 25:
          return PCD;
        case 26:
          return PCV;
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
      return com.google.fhir.r4.core.EventTimingValueSet.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:google.fhir.r4.core.EventTimingValueSet.Value)
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
    if (!(obj instanceof com.google.fhir.r4.core.EventTimingValueSet)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.EventTimingValueSet other =
        (com.google.fhir.r4.core.EventTimingValueSet) obj;

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

  public static com.google.fhir.r4.core.EventTimingValueSet parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.EventTimingValueSet parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.EventTimingValueSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.EventTimingValueSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.EventTimingValueSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.EventTimingValueSet parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.EventTimingValueSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.EventTimingValueSet parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.EventTimingValueSet parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.EventTimingValueSet parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.EventTimingValueSet parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.EventTimingValueSet parseFrom(
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

  public static Builder newBuilder(com.google.fhir.r4.core.EventTimingValueSet prototype) {
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
   * Real world event relating to the schedule.
   * See http://hl7.org/fhir/ValueSet/event-timing
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.EventTimingValueSet}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.EventTimingValueSet)
      com.google.fhir.r4.core.EventTimingValueSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.r4.core.Valuesets
          .internal_static_google_fhir_r4_core_EventTimingValueSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Valuesets
          .internal_static_google_fhir_r4_core_EventTimingValueSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.EventTimingValueSet.class,
              com.google.fhir.r4.core.EventTimingValueSet.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.EventTimingValueSet.newBuilder()
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
          .internal_static_google_fhir_r4_core_EventTimingValueSet_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.EventTimingValueSet getDefaultInstanceForType() {
      return com.google.fhir.r4.core.EventTimingValueSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.EventTimingValueSet build() {
      com.google.fhir.r4.core.EventTimingValueSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.EventTimingValueSet buildPartial() {
      com.google.fhir.r4.core.EventTimingValueSet result =
          new com.google.fhir.r4.core.EventTimingValueSet(this);
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
      if (other instanceof com.google.fhir.r4.core.EventTimingValueSet) {
        return mergeFrom((com.google.fhir.r4.core.EventTimingValueSet) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.EventTimingValueSet other) {
      if (other == com.google.fhir.r4.core.EventTimingValueSet.getDefaultInstance()) return this;
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
      com.google.fhir.r4.core.EventTimingValueSet parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.r4.core.EventTimingValueSet) e.getUnfinishedMessage();
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

    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.EventTimingValueSet)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.EventTimingValueSet)
  private static final com.google.fhir.r4.core.EventTimingValueSet DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.EventTimingValueSet();
  }

  public static com.google.fhir.r4.core.EventTimingValueSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventTimingValueSet> PARSER =
      new com.google.protobuf.AbstractParser<EventTimingValueSet>() {
        @java.lang.Override
        public EventTimingValueSet parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new EventTimingValueSet(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<EventTimingValueSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventTimingValueSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.EventTimingValueSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}