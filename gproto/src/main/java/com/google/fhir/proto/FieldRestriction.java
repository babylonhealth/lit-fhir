// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/profile_config.proto

package com.google.fhir.proto;

/** Protobuf type {@code google.fhir.proto.FieldRestriction} */
public final class FieldRestriction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.proto.FieldRestriction)
    FieldRestrictionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FieldRestriction.newBuilder() to construct.
  private FieldRestriction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FieldRestriction() {
    fieldId_ = "";
    sizeRestriction_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FieldRestriction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private FieldRestriction(
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

              fieldId_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              sizeRestriction_ = rawValue;
              break;
            }
          case 26:
            {
              com.google.fhir.proto.ReferenceRestriction.Builder subBuilder = null;
              if (referenceRestriction_ != null) {
                subBuilder = referenceRestriction_.toBuilder();
              }
              referenceRestriction_ =
                  input.readMessage(
                      com.google.fhir.proto.ReferenceRestriction.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(referenceRestriction_);
                referenceRestriction_ = subBuilder.buildPartial();
              }

              break;
            }
          case 34:
            {
              com.google.fhir.proto.ChoiceTypeRestriction.Builder subBuilder = null;
              if (choiceTypeRestriction_ != null) {
                subBuilder = choiceTypeRestriction_.toBuilder();
              }
              choiceTypeRestriction_ =
                  input.readMessage(
                      com.google.fhir.proto.ChoiceTypeRestriction.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(choiceTypeRestriction_);
                choiceTypeRestriction_ = subBuilder.buildPartial();
              }

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
        .internal_static_google_fhir_proto_FieldRestriction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.proto.ProfileConfig
        .internal_static_google_fhir_proto_FieldRestriction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.proto.FieldRestriction.class,
            com.google.fhir.proto.FieldRestriction.Builder.class);
  }

  public static final int FIELD_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object fieldId_;
  /**
   *
   *
   * <pre>
   * Id in the Structure Definition of the field to modify.
   * e.g., Patient.birthDate
   * </pre>
   *
   * <code>string field_id = 1;</code>
   *
   * @return The fieldId.
   */
  public java.lang.String getFieldId() {
    java.lang.Object ref = fieldId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Id in the Structure Definition of the field to modify.
   * e.g., Patient.birthDate
   * </pre>
   *
   * <code>string field_id = 1;</code>
   *
   * @return The bytes for fieldId.
   */
  public com.google.protobuf.ByteString getFieldIdBytes() {
    java.lang.Object ref = fieldId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      fieldId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIZE_RESTRICTION_FIELD_NUMBER = 2;
  private int sizeRestriction_;
  /**
   *
   *
   * <pre>
   * Restriction on the size of the field.  Must be stricter than the
   * original - the new size must be a valid subset of the original.
   * </pre>
   *
   * <code>.google.fhir.proto.SizeRestriction size_restriction = 2;</code>
   *
   * @return The enum numeric value on the wire for sizeRestriction.
   */
  public int getSizeRestrictionValue() {
    return sizeRestriction_;
  }
  /**
   *
   *
   * <pre>
   * Restriction on the size of the field.  Must be stricter than the
   * original - the new size must be a valid subset of the original.
   * </pre>
   *
   * <code>.google.fhir.proto.SizeRestriction size_restriction = 2;</code>
   *
   * @return The sizeRestriction.
   */
  public com.google.fhir.proto.SizeRestriction getSizeRestriction() {
    @SuppressWarnings("deprecation")
    com.google.fhir.proto.SizeRestriction result =
        com.google.fhir.proto.SizeRestriction.valueOf(sizeRestriction_);
    return result == null ? com.google.fhir.proto.SizeRestriction.UNRECOGNIZED : result;
  }

  public static final int REFERENCE_RESTRICTION_FIELD_NUMBER = 3;
  private com.google.fhir.proto.ReferenceRestriction referenceRestriction_;
  /**
   * <code>.google.fhir.proto.ReferenceRestriction reference_restriction = 3;</code>
   *
   * @return Whether the referenceRestriction field is set.
   */
  public boolean hasReferenceRestriction() {
    return referenceRestriction_ != null;
  }
  /**
   * <code>.google.fhir.proto.ReferenceRestriction reference_restriction = 3;</code>
   *
   * @return The referenceRestriction.
   */
  public com.google.fhir.proto.ReferenceRestriction getReferenceRestriction() {
    return referenceRestriction_ == null
        ? com.google.fhir.proto.ReferenceRestriction.getDefaultInstance()
        : referenceRestriction_;
  }
  /** <code>.google.fhir.proto.ReferenceRestriction reference_restriction = 3;</code> */
  public com.google.fhir.proto.ReferenceRestrictionOrBuilder getReferenceRestrictionOrBuilder() {
    return getReferenceRestriction();
  }

  public static final int CHOICE_TYPE_RESTRICTION_FIELD_NUMBER = 4;
  private com.google.fhir.proto.ChoiceTypeRestriction choiceTypeRestriction_;
  /**
   * <code>.google.fhir.proto.ChoiceTypeRestriction choice_type_restriction = 4;</code>
   *
   * @return Whether the choiceTypeRestriction field is set.
   */
  public boolean hasChoiceTypeRestriction() {
    return choiceTypeRestriction_ != null;
  }
  /**
   * <code>.google.fhir.proto.ChoiceTypeRestriction choice_type_restriction = 4;</code>
   *
   * @return The choiceTypeRestriction.
   */
  public com.google.fhir.proto.ChoiceTypeRestriction getChoiceTypeRestriction() {
    return choiceTypeRestriction_ == null
        ? com.google.fhir.proto.ChoiceTypeRestriction.getDefaultInstance()
        : choiceTypeRestriction_;
  }
  /** <code>.google.fhir.proto.ChoiceTypeRestriction choice_type_restriction = 4;</code> */
  public com.google.fhir.proto.ChoiceTypeRestrictionOrBuilder getChoiceTypeRestrictionOrBuilder() {
    return getChoiceTypeRestriction();
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
    if (!getFieldIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fieldId_);
    }
    if (sizeRestriction_ != com.google.fhir.proto.SizeRestriction.UNKNOWN.getNumber()) {
      output.writeEnum(2, sizeRestriction_);
    }
    if (referenceRestriction_ != null) {
      output.writeMessage(3, getReferenceRestriction());
    }
    if (choiceTypeRestriction_ != null) {
      output.writeMessage(4, getChoiceTypeRestriction());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFieldIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fieldId_);
    }
    if (sizeRestriction_ != com.google.fhir.proto.SizeRestriction.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, sizeRestriction_);
    }
    if (referenceRestriction_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(3, getReferenceRestriction());
    }
    if (choiceTypeRestriction_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(4, getChoiceTypeRestriction());
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
    if (!(obj instanceof com.google.fhir.proto.FieldRestriction)) {
      return super.equals(obj);
    }
    com.google.fhir.proto.FieldRestriction other = (com.google.fhir.proto.FieldRestriction) obj;

    if (!getFieldId().equals(other.getFieldId())) return false;
    if (sizeRestriction_ != other.sizeRestriction_) return false;
    if (hasReferenceRestriction() != other.hasReferenceRestriction()) return false;
    if (hasReferenceRestriction()) {
      if (!getReferenceRestriction().equals(other.getReferenceRestriction())) return false;
    }
    if (hasChoiceTypeRestriction() != other.hasChoiceTypeRestriction()) return false;
    if (hasChoiceTypeRestriction()) {
      if (!getChoiceTypeRestriction().equals(other.getChoiceTypeRestriction())) return false;
    }
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
    hash = (37 * hash) + FIELD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFieldId().hashCode();
    hash = (37 * hash) + SIZE_RESTRICTION_FIELD_NUMBER;
    hash = (53 * hash) + sizeRestriction_;
    if (hasReferenceRestriction()) {
      hash = (37 * hash) + REFERENCE_RESTRICTION_FIELD_NUMBER;
      hash = (53 * hash) + getReferenceRestriction().hashCode();
    }
    if (hasChoiceTypeRestriction()) {
      hash = (37 * hash) + CHOICE_TYPE_RESTRICTION_FIELD_NUMBER;
      hash = (53 * hash) + getChoiceTypeRestriction().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.proto.FieldRestriction parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.FieldRestriction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.FieldRestriction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.FieldRestriction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.FieldRestriction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.FieldRestriction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.FieldRestriction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.FieldRestriction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.proto.FieldRestriction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.FieldRestriction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.proto.FieldRestriction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.FieldRestriction parseFrom(
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

  public static Builder newBuilder(com.google.fhir.proto.FieldRestriction prototype) {
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
  /** Protobuf type {@code google.fhir.proto.FieldRestriction} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.proto.FieldRestriction)
      com.google.fhir.proto.FieldRestrictionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_FieldRestriction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_FieldRestriction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.proto.FieldRestriction.class,
              com.google.fhir.proto.FieldRestriction.Builder.class);
    }

    // Construct using com.google.fhir.proto.FieldRestriction.newBuilder()
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
      fieldId_ = "";

      sizeRestriction_ = 0;

      if (referenceRestrictionBuilder_ == null) {
        referenceRestriction_ = null;
      } else {
        referenceRestriction_ = null;
        referenceRestrictionBuilder_ = null;
      }
      if (choiceTypeRestrictionBuilder_ == null) {
        choiceTypeRestriction_ = null;
      } else {
        choiceTypeRestriction_ = null;
        choiceTypeRestrictionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_FieldRestriction_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.proto.FieldRestriction getDefaultInstanceForType() {
      return com.google.fhir.proto.FieldRestriction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.proto.FieldRestriction build() {
      com.google.fhir.proto.FieldRestriction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.proto.FieldRestriction buildPartial() {
      com.google.fhir.proto.FieldRestriction result =
          new com.google.fhir.proto.FieldRestriction(this);
      result.fieldId_ = fieldId_;
      result.sizeRestriction_ = sizeRestriction_;
      if (referenceRestrictionBuilder_ == null) {
        result.referenceRestriction_ = referenceRestriction_;
      } else {
        result.referenceRestriction_ = referenceRestrictionBuilder_.build();
      }
      if (choiceTypeRestrictionBuilder_ == null) {
        result.choiceTypeRestriction_ = choiceTypeRestriction_;
      } else {
        result.choiceTypeRestriction_ = choiceTypeRestrictionBuilder_.build();
      }
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
      if (other instanceof com.google.fhir.proto.FieldRestriction) {
        return mergeFrom((com.google.fhir.proto.FieldRestriction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.proto.FieldRestriction other) {
      if (other == com.google.fhir.proto.FieldRestriction.getDefaultInstance()) return this;
      if (!other.getFieldId().isEmpty()) {
        fieldId_ = other.fieldId_;
        onChanged();
      }
      if (other.sizeRestriction_ != 0) {
        setSizeRestrictionValue(other.getSizeRestrictionValue());
      }
      if (other.hasReferenceRestriction()) {
        mergeReferenceRestriction(other.getReferenceRestriction());
      }
      if (other.hasChoiceTypeRestriction()) {
        mergeChoiceTypeRestriction(other.getChoiceTypeRestriction());
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
      com.google.fhir.proto.FieldRestriction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.proto.FieldRestriction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object fieldId_ = "";
    /**
     *
     *
     * <pre>
     * Id in the Structure Definition of the field to modify.
     * e.g., Patient.birthDate
     * </pre>
     *
     * <code>string field_id = 1;</code>
     *
     * @return The fieldId.
     */
    public java.lang.String getFieldId() {
      java.lang.Object ref = fieldId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Id in the Structure Definition of the field to modify.
     * e.g., Patient.birthDate
     * </pre>
     *
     * <code>string field_id = 1;</code>
     *
     * @return The bytes for fieldId.
     */
    public com.google.protobuf.ByteString getFieldIdBytes() {
      java.lang.Object ref = fieldId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        fieldId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Id in the Structure Definition of the field to modify.
     * e.g., Patient.birthDate
     * </pre>
     *
     * <code>string field_id = 1;</code>
     *
     * @param value The fieldId to set.
     * @return This builder for chaining.
     */
    public Builder setFieldId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      fieldId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Id in the Structure Definition of the field to modify.
     * e.g., Patient.birthDate
     * </pre>
     *
     * <code>string field_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFieldId() {

      fieldId_ = getDefaultInstance().getFieldId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Id in the Structure Definition of the field to modify.
     * e.g., Patient.birthDate
     * </pre>
     *
     * <code>string field_id = 1;</code>
     *
     * @param value The bytes for fieldId to set.
     * @return This builder for chaining.
     */
    public Builder setFieldIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      fieldId_ = value;
      onChanged();
      return this;
    }

    private int sizeRestriction_ = 0;
    /**
     *
     *
     * <pre>
     * Restriction on the size of the field.  Must be stricter than the
     * original - the new size must be a valid subset of the original.
     * </pre>
     *
     * <code>.google.fhir.proto.SizeRestriction size_restriction = 2;</code>
     *
     * @return The enum numeric value on the wire for sizeRestriction.
     */
    public int getSizeRestrictionValue() {
      return sizeRestriction_;
    }
    /**
     *
     *
     * <pre>
     * Restriction on the size of the field.  Must be stricter than the
     * original - the new size must be a valid subset of the original.
     * </pre>
     *
     * <code>.google.fhir.proto.SizeRestriction size_restriction = 2;</code>
     *
     * @param value The enum numeric value on the wire for sizeRestriction to set.
     * @return This builder for chaining.
     */
    public Builder setSizeRestrictionValue(int value) {
      sizeRestriction_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Restriction on the size of the field.  Must be stricter than the
     * original - the new size must be a valid subset of the original.
     * </pre>
     *
     * <code>.google.fhir.proto.SizeRestriction size_restriction = 2;</code>
     *
     * @return The sizeRestriction.
     */
    public com.google.fhir.proto.SizeRestriction getSizeRestriction() {
      @SuppressWarnings("deprecation")
      com.google.fhir.proto.SizeRestriction result =
          com.google.fhir.proto.SizeRestriction.valueOf(sizeRestriction_);
      return result == null ? com.google.fhir.proto.SizeRestriction.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Restriction on the size of the field.  Must be stricter than the
     * original - the new size must be a valid subset of the original.
     * </pre>
     *
     * <code>.google.fhir.proto.SizeRestriction size_restriction = 2;</code>
     *
     * @param value The sizeRestriction to set.
     * @return This builder for chaining.
     */
    public Builder setSizeRestriction(com.google.fhir.proto.SizeRestriction value) {
      if (value == null) {
        throw new NullPointerException();
      }

      sizeRestriction_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Restriction on the size of the field.  Must be stricter than the
     * original - the new size must be a valid subset of the original.
     * </pre>
     *
     * <code>.google.fhir.proto.SizeRestriction size_restriction = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSizeRestriction() {

      sizeRestriction_ = 0;
      onChanged();
      return this;
    }

    private com.google.fhir.proto.ReferenceRestriction referenceRestriction_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.proto.ReferenceRestriction,
            com.google.fhir.proto.ReferenceRestriction.Builder,
            com.google.fhir.proto.ReferenceRestrictionOrBuilder>
        referenceRestrictionBuilder_;
    /**
     * <code>.google.fhir.proto.ReferenceRestriction reference_restriction = 3;</code>
     *
     * @return Whether the referenceRestriction field is set.
     */
    public boolean hasReferenceRestriction() {
      return referenceRestrictionBuilder_ != null || referenceRestriction_ != null;
    }
    /**
     * <code>.google.fhir.proto.ReferenceRestriction reference_restriction = 3;</code>
     *
     * @return The referenceRestriction.
     */
    public com.google.fhir.proto.ReferenceRestriction getReferenceRestriction() {
      if (referenceRestrictionBuilder_ == null) {
        return referenceRestriction_ == null
            ? com.google.fhir.proto.ReferenceRestriction.getDefaultInstance()
            : referenceRestriction_;
      } else {
        return referenceRestrictionBuilder_.getMessage();
      }
    }
    /** <code>.google.fhir.proto.ReferenceRestriction reference_restriction = 3;</code> */
    public Builder setReferenceRestriction(com.google.fhir.proto.ReferenceRestriction value) {
      if (referenceRestrictionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        referenceRestriction_ = value;
        onChanged();
      } else {
        referenceRestrictionBuilder_.setMessage(value);
      }

      return this;
    }
    /** <code>.google.fhir.proto.ReferenceRestriction reference_restriction = 3;</code> */
    public Builder setReferenceRestriction(
        com.google.fhir.proto.ReferenceRestriction.Builder builderForValue) {
      if (referenceRestrictionBuilder_ == null) {
        referenceRestriction_ = builderForValue.build();
        onChanged();
      } else {
        referenceRestrictionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /** <code>.google.fhir.proto.ReferenceRestriction reference_restriction = 3;</code> */
    public Builder mergeReferenceRestriction(com.google.fhir.proto.ReferenceRestriction value) {
      if (referenceRestrictionBuilder_ == null) {
        if (referenceRestriction_ != null) {
          referenceRestriction_ =
              com.google.fhir.proto.ReferenceRestriction.newBuilder(referenceRestriction_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          referenceRestriction_ = value;
        }
        onChanged();
      } else {
        referenceRestrictionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /** <code>.google.fhir.proto.ReferenceRestriction reference_restriction = 3;</code> */
    public Builder clearReferenceRestriction() {
      if (referenceRestrictionBuilder_ == null) {
        referenceRestriction_ = null;
        onChanged();
      } else {
        referenceRestriction_ = null;
        referenceRestrictionBuilder_ = null;
      }

      return this;
    }
    /** <code>.google.fhir.proto.ReferenceRestriction reference_restriction = 3;</code> */
    public com.google.fhir.proto.ReferenceRestriction.Builder getReferenceRestrictionBuilder() {

      onChanged();
      return getReferenceRestrictionFieldBuilder().getBuilder();
    }
    /** <code>.google.fhir.proto.ReferenceRestriction reference_restriction = 3;</code> */
    public com.google.fhir.proto.ReferenceRestrictionOrBuilder getReferenceRestrictionOrBuilder() {
      if (referenceRestrictionBuilder_ != null) {
        return referenceRestrictionBuilder_.getMessageOrBuilder();
      } else {
        return referenceRestriction_ == null
            ? com.google.fhir.proto.ReferenceRestriction.getDefaultInstance()
            : referenceRestriction_;
      }
    }
    /** <code>.google.fhir.proto.ReferenceRestriction reference_restriction = 3;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.proto.ReferenceRestriction,
            com.google.fhir.proto.ReferenceRestriction.Builder,
            com.google.fhir.proto.ReferenceRestrictionOrBuilder>
        getReferenceRestrictionFieldBuilder() {
      if (referenceRestrictionBuilder_ == null) {
        referenceRestrictionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.fhir.proto.ReferenceRestriction,
                com.google.fhir.proto.ReferenceRestriction.Builder,
                com.google.fhir.proto.ReferenceRestrictionOrBuilder>(
                getReferenceRestriction(), getParentForChildren(), isClean());
        referenceRestriction_ = null;
      }
      return referenceRestrictionBuilder_;
    }

    private com.google.fhir.proto.ChoiceTypeRestriction choiceTypeRestriction_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.proto.ChoiceTypeRestriction,
            com.google.fhir.proto.ChoiceTypeRestriction.Builder,
            com.google.fhir.proto.ChoiceTypeRestrictionOrBuilder>
        choiceTypeRestrictionBuilder_;
    /**
     * <code>.google.fhir.proto.ChoiceTypeRestriction choice_type_restriction = 4;</code>
     *
     * @return Whether the choiceTypeRestriction field is set.
     */
    public boolean hasChoiceTypeRestriction() {
      return choiceTypeRestrictionBuilder_ != null || choiceTypeRestriction_ != null;
    }
    /**
     * <code>.google.fhir.proto.ChoiceTypeRestriction choice_type_restriction = 4;</code>
     *
     * @return The choiceTypeRestriction.
     */
    public com.google.fhir.proto.ChoiceTypeRestriction getChoiceTypeRestriction() {
      if (choiceTypeRestrictionBuilder_ == null) {
        return choiceTypeRestriction_ == null
            ? com.google.fhir.proto.ChoiceTypeRestriction.getDefaultInstance()
            : choiceTypeRestriction_;
      } else {
        return choiceTypeRestrictionBuilder_.getMessage();
      }
    }
    /** <code>.google.fhir.proto.ChoiceTypeRestriction choice_type_restriction = 4;</code> */
    public Builder setChoiceTypeRestriction(com.google.fhir.proto.ChoiceTypeRestriction value) {
      if (choiceTypeRestrictionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        choiceTypeRestriction_ = value;
        onChanged();
      } else {
        choiceTypeRestrictionBuilder_.setMessage(value);
      }

      return this;
    }
    /** <code>.google.fhir.proto.ChoiceTypeRestriction choice_type_restriction = 4;</code> */
    public Builder setChoiceTypeRestriction(
        com.google.fhir.proto.ChoiceTypeRestriction.Builder builderForValue) {
      if (choiceTypeRestrictionBuilder_ == null) {
        choiceTypeRestriction_ = builderForValue.build();
        onChanged();
      } else {
        choiceTypeRestrictionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /** <code>.google.fhir.proto.ChoiceTypeRestriction choice_type_restriction = 4;</code> */
    public Builder mergeChoiceTypeRestriction(com.google.fhir.proto.ChoiceTypeRestriction value) {
      if (choiceTypeRestrictionBuilder_ == null) {
        if (choiceTypeRestriction_ != null) {
          choiceTypeRestriction_ =
              com.google.fhir.proto.ChoiceTypeRestriction.newBuilder(choiceTypeRestriction_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          choiceTypeRestriction_ = value;
        }
        onChanged();
      } else {
        choiceTypeRestrictionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /** <code>.google.fhir.proto.ChoiceTypeRestriction choice_type_restriction = 4;</code> */
    public Builder clearChoiceTypeRestriction() {
      if (choiceTypeRestrictionBuilder_ == null) {
        choiceTypeRestriction_ = null;
        onChanged();
      } else {
        choiceTypeRestriction_ = null;
        choiceTypeRestrictionBuilder_ = null;
      }

      return this;
    }
    /** <code>.google.fhir.proto.ChoiceTypeRestriction choice_type_restriction = 4;</code> */
    public com.google.fhir.proto.ChoiceTypeRestriction.Builder getChoiceTypeRestrictionBuilder() {

      onChanged();
      return getChoiceTypeRestrictionFieldBuilder().getBuilder();
    }
    /** <code>.google.fhir.proto.ChoiceTypeRestriction choice_type_restriction = 4;</code> */
    public com.google.fhir.proto.ChoiceTypeRestrictionOrBuilder
        getChoiceTypeRestrictionOrBuilder() {
      if (choiceTypeRestrictionBuilder_ != null) {
        return choiceTypeRestrictionBuilder_.getMessageOrBuilder();
      } else {
        return choiceTypeRestriction_ == null
            ? com.google.fhir.proto.ChoiceTypeRestriction.getDefaultInstance()
            : choiceTypeRestriction_;
      }
    }
    /** <code>.google.fhir.proto.ChoiceTypeRestriction choice_type_restriction = 4;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.proto.ChoiceTypeRestriction,
            com.google.fhir.proto.ChoiceTypeRestriction.Builder,
            com.google.fhir.proto.ChoiceTypeRestrictionOrBuilder>
        getChoiceTypeRestrictionFieldBuilder() {
      if (choiceTypeRestrictionBuilder_ == null) {
        choiceTypeRestrictionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.fhir.proto.ChoiceTypeRestriction,
                com.google.fhir.proto.ChoiceTypeRestriction.Builder,
                com.google.fhir.proto.ChoiceTypeRestrictionOrBuilder>(
                getChoiceTypeRestriction(), getParentForChildren(), isClean());
        choiceTypeRestriction_ = null;
      }
      return choiceTypeRestrictionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.fhir.proto.FieldRestriction)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.proto.FieldRestriction)
  private static final com.google.fhir.proto.FieldRestriction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.proto.FieldRestriction();
  }

  public static com.google.fhir.proto.FieldRestriction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FieldRestriction> PARSER =
      new com.google.protobuf.AbstractParser<FieldRestriction>() {
        @java.lang.Override
        public FieldRestriction parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new FieldRestriction(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<FieldRestriction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FieldRestriction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.proto.FieldRestriction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
