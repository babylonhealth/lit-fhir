// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

/**
 *
 *
 * <pre>
 * Auto-generated from StructureDefinition for duration.
 * How long Manifestations persisted.
 * See http://hl7.org/fhir/StructureDefinition/allergyintolerance-duration
 * </pre>
 *
 * Protobuf type {@code google.fhir.stu3.proto.AllergyIntoleranceDuration}
 */
public final class AllergyIntoleranceDuration extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.stu3.proto.AllergyIntoleranceDuration)
    AllergyIntoleranceDurationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AllergyIntoleranceDuration.newBuilder() to construct.
  private AllergyIntoleranceDuration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AllergyIntoleranceDuration() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AllergyIntoleranceDuration();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AllergyIntoleranceDuration(
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
              com.google.fhir.stu3.proto.String.Builder subBuilder = null;
              if (id_ != null) {
                subBuilder = id_.toBuilder();
              }
              id_ =
                  input.readMessage(com.google.fhir.stu3.proto.String.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(id_);
                id_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              com.google.fhir.stu3.proto.Duration.Builder subBuilder = null;
              if (valueDuration_ != null) {
                subBuilder = valueDuration_.toBuilder();
              }
              valueDuration_ =
                  input.readMessage(
                      com.google.fhir.stu3.proto.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(valueDuration_);
                valueDuration_ = subBuilder.buildPartial();
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
    return com.google.fhir.stu3.proto.Extensions
        .internal_static_google_fhir_stu3_proto_AllergyIntoleranceDuration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.stu3.proto.Extensions
        .internal_static_google_fhir_stu3_proto_AllergyIntoleranceDuration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.stu3.proto.AllergyIntoleranceDuration.class,
            com.google.fhir.stu3.proto.AllergyIntoleranceDuration.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.google.fhir.stu3.proto.String id_;
  /**
   *
   *
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   *
   * @return Whether the id field is set.
   */
  public boolean hasId() {
    return id_ != null;
  }
  /**
   *
   *
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   *
   * @return The id.
   */
  public com.google.fhir.stu3.proto.String getId() {
    return id_ == null ? com.google.fhir.stu3.proto.String.getDefaultInstance() : id_;
  }
  /**
   *
   *
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   */
  public com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int VALUE_DURATION_FIELD_NUMBER = 3;
  private com.google.fhir.stu3.proto.Duration valueDuration_;
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Duration value_duration = 3;</code>
   *
   * @return Whether the valueDuration field is set.
   */
  public boolean hasValueDuration() {
    return valueDuration_ != null;
  }
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Duration value_duration = 3;</code>
   *
   * @return The valueDuration.
   */
  public com.google.fhir.stu3.proto.Duration getValueDuration() {
    return valueDuration_ == null
        ? com.google.fhir.stu3.proto.Duration.getDefaultInstance()
        : valueDuration_;
  }
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Duration value_duration = 3;</code>
   */
  public com.google.fhir.stu3.proto.DurationOrBuilder getValueDurationOrBuilder() {
    return getValueDuration();
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
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (valueDuration_ != null) {
      output.writeMessage(3, getValueDuration());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getId());
    }
    if (valueDuration_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getValueDuration());
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
    if (!(obj instanceof com.google.fhir.stu3.proto.AllergyIntoleranceDuration)) {
      return super.equals(obj);
    }
    com.google.fhir.stu3.proto.AllergyIntoleranceDuration other =
        (com.google.fhir.stu3.proto.AllergyIntoleranceDuration) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId().equals(other.getId())) return false;
    }
    if (hasValueDuration() != other.hasValueDuration()) return false;
    if (hasValueDuration()) {
      if (!getValueDuration().equals(other.getValueDuration())) return false;
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
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasValueDuration()) {
      hash = (37 * hash) + VALUE_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getValueDuration().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.stu3.proto.AllergyIntoleranceDuration parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.AllergyIntoleranceDuration parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.AllergyIntoleranceDuration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.AllergyIntoleranceDuration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.AllergyIntoleranceDuration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.AllergyIntoleranceDuration parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.AllergyIntoleranceDuration parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.AllergyIntoleranceDuration parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.AllergyIntoleranceDuration parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.AllergyIntoleranceDuration parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.AllergyIntoleranceDuration parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.AllergyIntoleranceDuration parseFrom(
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
      com.google.fhir.stu3.proto.AllergyIntoleranceDuration prototype) {
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
   * Auto-generated from StructureDefinition for duration.
   * How long Manifestations persisted.
   * See http://hl7.org/fhir/StructureDefinition/allergyintolerance-duration
   * </pre>
   *
   * Protobuf type {@code google.fhir.stu3.proto.AllergyIntoleranceDuration}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.stu3.proto.AllergyIntoleranceDuration)
      com.google.fhir.stu3.proto.AllergyIntoleranceDurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.stu3.proto.Extensions
          .internal_static_google_fhir_stu3_proto_AllergyIntoleranceDuration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.stu3.proto.Extensions
          .internal_static_google_fhir_stu3_proto_AllergyIntoleranceDuration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.stu3.proto.AllergyIntoleranceDuration.class,
              com.google.fhir.stu3.proto.AllergyIntoleranceDuration.Builder.class);
    }

    // Construct using com.google.fhir.stu3.proto.AllergyIntoleranceDuration.newBuilder()
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
      if (idBuilder_ == null) {
        id_ = null;
      } else {
        id_ = null;
        idBuilder_ = null;
      }
      if (valueDurationBuilder_ == null) {
        valueDuration_ = null;
      } else {
        valueDuration_ = null;
        valueDurationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.fhir.stu3.proto.Extensions
          .internal_static_google_fhir_stu3_proto_AllergyIntoleranceDuration_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.AllergyIntoleranceDuration getDefaultInstanceForType() {
      return com.google.fhir.stu3.proto.AllergyIntoleranceDuration.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.AllergyIntoleranceDuration build() {
      com.google.fhir.stu3.proto.AllergyIntoleranceDuration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.AllergyIntoleranceDuration buildPartial() {
      com.google.fhir.stu3.proto.AllergyIntoleranceDuration result =
          new com.google.fhir.stu3.proto.AllergyIntoleranceDuration(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (valueDurationBuilder_ == null) {
        result.valueDuration_ = valueDuration_;
      } else {
        result.valueDuration_ = valueDurationBuilder_.build();
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
      if (other instanceof com.google.fhir.stu3.proto.AllergyIntoleranceDuration) {
        return mergeFrom((com.google.fhir.stu3.proto.AllergyIntoleranceDuration) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.stu3.proto.AllergyIntoleranceDuration other) {
      if (other == com.google.fhir.stu3.proto.AllergyIntoleranceDuration.getDefaultInstance())
        return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasValueDuration()) {
        mergeValueDuration(other.getValueDuration());
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
      com.google.fhir.stu3.proto.AllergyIntoleranceDuration parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.fhir.stu3.proto.AllergyIntoleranceDuration) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.fhir.stu3.proto.String id_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.String,
            com.google.fhir.stu3.proto.String.Builder,
            com.google.fhir.stu3.proto.StringOrBuilder>
        idBuilder_;
    /**
     *
     *
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     *
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     *
     *
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     *
     * @return The id.
     */
    public com.google.fhir.stu3.proto.String getId() {
      if (idBuilder_ == null) {
        return id_ == null ? com.google.fhir.stu3.proto.String.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    public Builder setId(com.google.fhir.stu3.proto.String value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
        onChanged();
      } else {
        idBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    public Builder setId(com.google.fhir.stu3.proto.String.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    public Builder mergeId(com.google.fhir.stu3.proto.String value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ = com.google.fhir.stu3.proto.String.newBuilder(id_).mergeFrom(value).buildPartial();
        } else {
          id_ = value;
        }
        onChanged();
      } else {
        idBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    public Builder clearId() {
      if (idBuilder_ == null) {
        id_ = null;
        onChanged();
      } else {
        id_ = null;
        idBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    public com.google.fhir.stu3.proto.String.Builder getIdBuilder() {

      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    public com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ? com.google.fhir.stu3.proto.String.getDefaultInstance() : id_;
      }
    }
    /**
     *
     *
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.String,
            com.google.fhir.stu3.proto.String.Builder,
            com.google.fhir.stu3.proto.StringOrBuilder>
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.fhir.stu3.proto.String,
                com.google.fhir.stu3.proto.String.Builder,
                com.google.fhir.stu3.proto.StringOrBuilder>(
                getId(), getParentForChildren(), isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private com.google.fhir.stu3.proto.Duration valueDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.Duration,
            com.google.fhir.stu3.proto.Duration.Builder,
            com.google.fhir.stu3.proto.DurationOrBuilder>
        valueDurationBuilder_;
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Duration value_duration = 3;</code>
     *
     * @return Whether the valueDuration field is set.
     */
    public boolean hasValueDuration() {
      return valueDurationBuilder_ != null || valueDuration_ != null;
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Duration value_duration = 3;</code>
     *
     * @return The valueDuration.
     */
    public com.google.fhir.stu3.proto.Duration getValueDuration() {
      if (valueDurationBuilder_ == null) {
        return valueDuration_ == null
            ? com.google.fhir.stu3.proto.Duration.getDefaultInstance()
            : valueDuration_;
      } else {
        return valueDurationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Duration value_duration = 3;</code>
     */
    public Builder setValueDuration(com.google.fhir.stu3.proto.Duration value) {
      if (valueDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueDuration_ = value;
        onChanged();
      } else {
        valueDurationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Duration value_duration = 3;</code>
     */
    public Builder setValueDuration(com.google.fhir.stu3.proto.Duration.Builder builderForValue) {
      if (valueDurationBuilder_ == null) {
        valueDuration_ = builderForValue.build();
        onChanged();
      } else {
        valueDurationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Duration value_duration = 3;</code>
     */
    public Builder mergeValueDuration(com.google.fhir.stu3.proto.Duration value) {
      if (valueDurationBuilder_ == null) {
        if (valueDuration_ != null) {
          valueDuration_ =
              com.google.fhir.stu3.proto.Duration.newBuilder(valueDuration_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          valueDuration_ = value;
        }
        onChanged();
      } else {
        valueDurationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Duration value_duration = 3;</code>
     */
    public Builder clearValueDuration() {
      if (valueDurationBuilder_ == null) {
        valueDuration_ = null;
        onChanged();
      } else {
        valueDuration_ = null;
        valueDurationBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Duration value_duration = 3;</code>
     */
    public com.google.fhir.stu3.proto.Duration.Builder getValueDurationBuilder() {

      onChanged();
      return getValueDurationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Duration value_duration = 3;</code>
     */
    public com.google.fhir.stu3.proto.DurationOrBuilder getValueDurationOrBuilder() {
      if (valueDurationBuilder_ != null) {
        return valueDurationBuilder_.getMessageOrBuilder();
      } else {
        return valueDuration_ == null
            ? com.google.fhir.stu3.proto.Duration.getDefaultInstance()
            : valueDuration_;
      }
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Duration value_duration = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.Duration,
            com.google.fhir.stu3.proto.Duration.Builder,
            com.google.fhir.stu3.proto.DurationOrBuilder>
        getValueDurationFieldBuilder() {
      if (valueDurationBuilder_ == null) {
        valueDurationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.fhir.stu3.proto.Duration,
                com.google.fhir.stu3.proto.Duration.Builder,
                com.google.fhir.stu3.proto.DurationOrBuilder>(
                getValueDuration(), getParentForChildren(), isClean());
        valueDuration_ = null;
      }
      return valueDurationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.fhir.stu3.proto.AllergyIntoleranceDuration)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.stu3.proto.AllergyIntoleranceDuration)
  private static final com.google.fhir.stu3.proto.AllergyIntoleranceDuration DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.stu3.proto.AllergyIntoleranceDuration();
  }

  public static com.google.fhir.stu3.proto.AllergyIntoleranceDuration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllergyIntoleranceDuration> PARSER =
      new com.google.protobuf.AbstractParser<AllergyIntoleranceDuration>() {
        @java.lang.Override
        public AllergyIntoleranceDuration parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AllergyIntoleranceDuration(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AllergyIntoleranceDuration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllergyIntoleranceDuration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.stu3.proto.AllergyIntoleranceDuration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
