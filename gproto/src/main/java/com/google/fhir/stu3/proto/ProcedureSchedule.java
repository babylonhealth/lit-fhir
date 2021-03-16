// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

/**
 * <pre>
 * Auto-generated from StructureDefinition for schedule.
 * Schedule followed.
 * See http://hl7.org/fhir/StructureDefinition/procedure-schedule
 * </pre>
 *
 * Protobuf type {@code google.fhir.stu3.proto.ProcedureSchedule}
 */
public final class ProcedureSchedule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.fhir.stu3.proto.ProcedureSchedule)
    ProcedureScheduleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProcedureSchedule.newBuilder() to construct.
  private ProcedureSchedule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProcedureSchedule() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProcedureSchedule();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProcedureSchedule(
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
          case 10: {
            com.google.fhir.stu3.proto.String.Builder subBuilder = null;
            if (id_ != null) {
              subBuilder = id_.toBuilder();
            }
            id_ = input.readMessage(com.google.fhir.stu3.proto.String.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(id_);
              id_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.fhir.stu3.proto.Timing.Builder subBuilder = null;
            if (valueTiming_ != null) {
              subBuilder = valueTiming_.toBuilder();
            }
            valueTiming_ = input.readMessage(com.google.fhir.stu3.proto.Timing.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(valueTiming_);
              valueTiming_ = subBuilder.buildPartial();
            }

            break;
          }
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
    return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_ProcedureSchedule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_ProcedureSchedule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.stu3.proto.ProcedureSchedule.class, com.google.fhir.stu3.proto.ProcedureSchedule.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.google.fhir.stu3.proto.String id_;
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public com.google.fhir.stu3.proto.String getId() {
    return id_ == null ? com.google.fhir.stu3.proto.String.getDefaultInstance() : id_;
  }
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   */
  @java.lang.Override
  public com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int VALUE_TIMING_FIELD_NUMBER = 3;
  private com.google.fhir.stu3.proto.Timing valueTiming_;
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
   * @return Whether the valueTiming field is set.
   */
  @java.lang.Override
  public boolean hasValueTiming() {
    return valueTiming_ != null;
  }
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
   * @return The valueTiming.
   */
  @java.lang.Override
  public com.google.fhir.stu3.proto.Timing getValueTiming() {
    return valueTiming_ == null ? com.google.fhir.stu3.proto.Timing.getDefaultInstance() : valueTiming_;
  }
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
   */
  @java.lang.Override
  public com.google.fhir.stu3.proto.TimingOrBuilder getValueTimingOrBuilder() {
    return getValueTiming();
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
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (valueTiming_ != null) {
      output.writeMessage(3, getValueTiming());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getId());
    }
    if (valueTiming_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getValueTiming());
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
    if (!(obj instanceof com.google.fhir.stu3.proto.ProcedureSchedule)) {
      return super.equals(obj);
    }
    com.google.fhir.stu3.proto.ProcedureSchedule other = (com.google.fhir.stu3.proto.ProcedureSchedule) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasValueTiming() != other.hasValueTiming()) return false;
    if (hasValueTiming()) {
      if (!getValueTiming()
          .equals(other.getValueTiming())) return false;
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
    if (hasValueTiming()) {
      hash = (37 * hash) + VALUE_TIMING_FIELD_NUMBER;
      hash = (53 * hash) + getValueTiming().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.stu3.proto.ProcedureSchedule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.ProcedureSchedule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.ProcedureSchedule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.ProcedureSchedule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.ProcedureSchedule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.ProcedureSchedule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.ProcedureSchedule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.ProcedureSchedule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.ProcedureSchedule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.ProcedureSchedule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.ProcedureSchedule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.ProcedureSchedule parseFrom(
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
  public static Builder newBuilder(com.google.fhir.stu3.proto.ProcedureSchedule prototype) {
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
   * Auto-generated from StructureDefinition for schedule.
   * Schedule followed.
   * See http://hl7.org/fhir/StructureDefinition/procedure-schedule
   * </pre>
   *
   * Protobuf type {@code google.fhir.stu3.proto.ProcedureSchedule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.fhir.stu3.proto.ProcedureSchedule)
      com.google.fhir.stu3.proto.ProcedureScheduleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_ProcedureSchedule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_ProcedureSchedule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.stu3.proto.ProcedureSchedule.class, com.google.fhir.stu3.proto.ProcedureSchedule.Builder.class);
    }

    // Construct using com.google.fhir.stu3.proto.ProcedureSchedule.newBuilder()
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
      if (idBuilder_ == null) {
        id_ = null;
      } else {
        id_ = null;
        idBuilder_ = null;
      }
      if (valueTimingBuilder_ == null) {
        valueTiming_ = null;
      } else {
        valueTiming_ = null;
        valueTimingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_ProcedureSchedule_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.ProcedureSchedule getDefaultInstanceForType() {
      return com.google.fhir.stu3.proto.ProcedureSchedule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.ProcedureSchedule build() {
      com.google.fhir.stu3.proto.ProcedureSchedule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.ProcedureSchedule buildPartial() {
      com.google.fhir.stu3.proto.ProcedureSchedule result = new com.google.fhir.stu3.proto.ProcedureSchedule(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (valueTimingBuilder_ == null) {
        result.valueTiming_ = valueTiming_;
      } else {
        result.valueTiming_ = valueTimingBuilder_.build();
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
      if (other instanceof com.google.fhir.stu3.proto.ProcedureSchedule) {
        return mergeFrom((com.google.fhir.stu3.proto.ProcedureSchedule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.stu3.proto.ProcedureSchedule other) {
      if (other == com.google.fhir.stu3.proto.ProcedureSchedule.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasValueTiming()) {
        mergeValueTiming(other.getValueTiming());
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
      com.google.fhir.stu3.proto.ProcedureSchedule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.stu3.proto.ProcedureSchedule) e.getUnfinishedMessage();
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
        com.google.fhir.stu3.proto.String, com.google.fhir.stu3.proto.String.Builder, com.google.fhir.stu3.proto.StringOrBuilder> idBuilder_;
    /**
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
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
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    public Builder setId(
        com.google.fhir.stu3.proto.String.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    public Builder mergeId(com.google.fhir.stu3.proto.String value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ =
            com.google.fhir.stu3.proto.String.newBuilder(id_).mergeFrom(value).buildPartial();
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
        return id_ == null ?
            com.google.fhir.stu3.proto.String.getDefaultInstance() : id_;
      }
    }
    /**
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.stu3.proto.String, com.google.fhir.stu3.proto.String.Builder, com.google.fhir.stu3.proto.StringOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.String, com.google.fhir.stu3.proto.String.Builder, com.google.fhir.stu3.proto.StringOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private com.google.fhir.stu3.proto.Timing valueTiming_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.stu3.proto.Timing, com.google.fhir.stu3.proto.Timing.Builder, com.google.fhir.stu3.proto.TimingOrBuilder> valueTimingBuilder_;
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
     * @return Whether the valueTiming field is set.
     */
    public boolean hasValueTiming() {
      return valueTimingBuilder_ != null || valueTiming_ != null;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
     * @return The valueTiming.
     */
    public com.google.fhir.stu3.proto.Timing getValueTiming() {
      if (valueTimingBuilder_ == null) {
        return valueTiming_ == null ? com.google.fhir.stu3.proto.Timing.getDefaultInstance() : valueTiming_;
      } else {
        return valueTimingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
     */
    public Builder setValueTiming(com.google.fhir.stu3.proto.Timing value) {
      if (valueTimingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueTiming_ = value;
        onChanged();
      } else {
        valueTimingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
     */
    public Builder setValueTiming(
        com.google.fhir.stu3.proto.Timing.Builder builderForValue) {
      if (valueTimingBuilder_ == null) {
        valueTiming_ = builderForValue.build();
        onChanged();
      } else {
        valueTimingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
     */
    public Builder mergeValueTiming(com.google.fhir.stu3.proto.Timing value) {
      if (valueTimingBuilder_ == null) {
        if (valueTiming_ != null) {
          valueTiming_ =
            com.google.fhir.stu3.proto.Timing.newBuilder(valueTiming_).mergeFrom(value).buildPartial();
        } else {
          valueTiming_ = value;
        }
        onChanged();
      } else {
        valueTimingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
     */
    public Builder clearValueTiming() {
      if (valueTimingBuilder_ == null) {
        valueTiming_ = null;
        onChanged();
      } else {
        valueTiming_ = null;
        valueTimingBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
     */
    public com.google.fhir.stu3.proto.Timing.Builder getValueTimingBuilder() {
      
      onChanged();
      return getValueTimingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
     */
    public com.google.fhir.stu3.proto.TimingOrBuilder getValueTimingOrBuilder() {
      if (valueTimingBuilder_ != null) {
        return valueTimingBuilder_.getMessageOrBuilder();
      } else {
        return valueTiming_ == null ?
            com.google.fhir.stu3.proto.Timing.getDefaultInstance() : valueTiming_;
      }
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Timing value_timing = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.stu3.proto.Timing, com.google.fhir.stu3.proto.Timing.Builder, com.google.fhir.stu3.proto.TimingOrBuilder> 
        getValueTimingFieldBuilder() {
      if (valueTimingBuilder_ == null) {
        valueTimingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.Timing, com.google.fhir.stu3.proto.Timing.Builder, com.google.fhir.stu3.proto.TimingOrBuilder>(
                getValueTiming(),
                getParentForChildren(),
                isClean());
        valueTiming_ = null;
      }
      return valueTimingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.fhir.stu3.proto.ProcedureSchedule)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.stu3.proto.ProcedureSchedule)
  private static final com.google.fhir.stu3.proto.ProcedureSchedule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.fhir.stu3.proto.ProcedureSchedule();
  }

  public static com.google.fhir.stu3.proto.ProcedureSchedule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProcedureSchedule>
      PARSER = new com.google.protobuf.AbstractParser<ProcedureSchedule>() {
    @java.lang.Override
    public ProcedureSchedule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProcedureSchedule(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProcedureSchedule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProcedureSchedule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.stu3.proto.ProcedureSchedule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

