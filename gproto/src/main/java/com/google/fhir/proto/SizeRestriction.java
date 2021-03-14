// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/profile_config.proto

package com.google.fhir.proto;

/** Protobuf enum {@code google.fhir.proto.SizeRestriction} */
public enum SizeRestriction implements com.google.protobuf.ProtocolMessageEnum {
  /** <code>UNKNOWN = 0;</code> */
  UNKNOWN(0),
  /** <code>ABSENT = 1;</code> */
  ABSENT(1),
  /** <code>REQUIRED = 2;</code> */
  REQUIRED(2),
  /** <code>OPTIONAL = 3;</code> */
  OPTIONAL(3),
  /**
   *
   *
   * <pre>
   * Repeated field that should have at least one value.
   * </pre>
   *
   * <code>AT_LEAST_ONE = 4;</code>
   */
  AT_LEAST_ONE(4),
  /** <code>REPEATED = 5;</code> */
  REPEATED(5),
  UNRECOGNIZED(-1),
  ;

  /** <code>UNKNOWN = 0;</code> */
  public static final int UNKNOWN_VALUE = 0;
  /** <code>ABSENT = 1;</code> */
  public static final int ABSENT_VALUE = 1;
  /** <code>REQUIRED = 2;</code> */
  public static final int REQUIRED_VALUE = 2;
  /** <code>OPTIONAL = 3;</code> */
  public static final int OPTIONAL_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Repeated field that should have at least one value.
   * </pre>
   *
   * <code>AT_LEAST_ONE = 4;</code>
   */
  public static final int AT_LEAST_ONE_VALUE = 4;
  /** <code>REPEATED = 5;</code> */
  public static final int REPEATED_VALUE = 5;

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
  public static SizeRestriction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SizeRestriction forNumber(int value) {
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return ABSENT;
      case 2:
        return REQUIRED;
      case 3:
        return OPTIONAL;
      case 4:
        return AT_LEAST_ONE;
      case 5:
        return REPEATED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SizeRestriction> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<SizeRestriction> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<SizeRestriction>() {
        public SizeRestriction findValueByNumber(int number) {
          return SizeRestriction.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.fhir.proto.ProfileConfig.getDescriptor().getEnumTypes().get(0);
  }

  private static final SizeRestriction[] VALUES = values();

  public static SizeRestriction valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SizeRestriction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.fhir.proto.SizeRestriction)
}