// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

/**
 *
 *
 * <pre>
 * Auto-generated from StructureDefinition for wg.
 * Owning Work Group.
 * See http://hl7.org/fhir/StructureDefinition/structuredefinition-wg
 * </pre>
 *
 * Protobuf type {@code google.fhir.stu3.proto.Wg}
 */
public final class Wg extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.stu3.proto.Wg)
    WgOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Wg.newBuilder() to construct.
  private Wg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Wg() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Wg();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Wg(
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
              com.google.fhir.stu3.proto.HL7WorkgroupCode.Builder subBuilder = null;
              if (valueCode_ != null) {
                subBuilder = valueCode_.toBuilder();
              }
              valueCode_ =
                  input.readMessage(
                      com.google.fhir.stu3.proto.HL7WorkgroupCode.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(valueCode_);
                valueCode_ = subBuilder.buildPartial();
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
        .internal_static_google_fhir_stu3_proto_Wg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.stu3.proto.Extensions
        .internal_static_google_fhir_stu3_proto_Wg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.stu3.proto.Wg.class, com.google.fhir.stu3.proto.Wg.Builder.class);
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

  public static final int VALUE_CODE_FIELD_NUMBER = 3;
  private com.google.fhir.stu3.proto.HL7WorkgroupCode valueCode_;
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.HL7WorkgroupCode value_code = 3;</code>
   *
   * @return Whether the valueCode field is set.
   */
  public boolean hasValueCode() {
    return valueCode_ != null;
  }
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.HL7WorkgroupCode value_code = 3;</code>
   *
   * @return The valueCode.
   */
  public com.google.fhir.stu3.proto.HL7WorkgroupCode getValueCode() {
    return valueCode_ == null
        ? com.google.fhir.stu3.proto.HL7WorkgroupCode.getDefaultInstance()
        : valueCode_;
  }
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.HL7WorkgroupCode value_code = 3;</code>
   */
  public com.google.fhir.stu3.proto.HL7WorkgroupCodeOrBuilder getValueCodeOrBuilder() {
    return getValueCode();
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
    if (valueCode_ != null) {
      output.writeMessage(3, getValueCode());
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
    if (valueCode_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getValueCode());
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
    if (!(obj instanceof com.google.fhir.stu3.proto.Wg)) {
      return super.equals(obj);
    }
    com.google.fhir.stu3.proto.Wg other = (com.google.fhir.stu3.proto.Wg) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId().equals(other.getId())) return false;
    }
    if (hasValueCode() != other.hasValueCode()) return false;
    if (hasValueCode()) {
      if (!getValueCode().equals(other.getValueCode())) return false;
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
    if (hasValueCode()) {
      hash = (37 * hash) + VALUE_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getValueCode().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.stu3.proto.Wg parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.Wg parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.Wg parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.Wg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.Wg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.Wg parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.Wg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.Wg parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.Wg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.Wg parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.Wg parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.Wg parseFrom(
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

  public static Builder newBuilder(com.google.fhir.stu3.proto.Wg prototype) {
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
   * Auto-generated from StructureDefinition for wg.
   * Owning Work Group.
   * See http://hl7.org/fhir/StructureDefinition/structuredefinition-wg
   * </pre>
   *
   * Protobuf type {@code google.fhir.stu3.proto.Wg}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.stu3.proto.Wg)
      com.google.fhir.stu3.proto.WgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.stu3.proto.Extensions
          .internal_static_google_fhir_stu3_proto_Wg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.stu3.proto.Extensions
          .internal_static_google_fhir_stu3_proto_Wg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.stu3.proto.Wg.class, com.google.fhir.stu3.proto.Wg.Builder.class);
    }

    // Construct using com.google.fhir.stu3.proto.Wg.newBuilder()
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
      if (valueCodeBuilder_ == null) {
        valueCode_ = null;
      } else {
        valueCode_ = null;
        valueCodeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.fhir.stu3.proto.Extensions
          .internal_static_google_fhir_stu3_proto_Wg_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.Wg getDefaultInstanceForType() {
      return com.google.fhir.stu3.proto.Wg.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.Wg build() {
      com.google.fhir.stu3.proto.Wg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.Wg buildPartial() {
      com.google.fhir.stu3.proto.Wg result = new com.google.fhir.stu3.proto.Wg(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (valueCodeBuilder_ == null) {
        result.valueCode_ = valueCode_;
      } else {
        result.valueCode_ = valueCodeBuilder_.build();
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
      if (other instanceof com.google.fhir.stu3.proto.Wg) {
        return mergeFrom((com.google.fhir.stu3.proto.Wg) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.stu3.proto.Wg other) {
      if (other == com.google.fhir.stu3.proto.Wg.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasValueCode()) {
        mergeValueCode(other.getValueCode());
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
      com.google.fhir.stu3.proto.Wg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.stu3.proto.Wg) e.getUnfinishedMessage();
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

    private com.google.fhir.stu3.proto.HL7WorkgroupCode valueCode_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.HL7WorkgroupCode,
            com.google.fhir.stu3.proto.HL7WorkgroupCode.Builder,
            com.google.fhir.stu3.proto.HL7WorkgroupCodeOrBuilder>
        valueCodeBuilder_;
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.HL7WorkgroupCode value_code = 3;</code>
     *
     * @return Whether the valueCode field is set.
     */
    public boolean hasValueCode() {
      return valueCodeBuilder_ != null || valueCode_ != null;
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.HL7WorkgroupCode value_code = 3;</code>
     *
     * @return The valueCode.
     */
    public com.google.fhir.stu3.proto.HL7WorkgroupCode getValueCode() {
      if (valueCodeBuilder_ == null) {
        return valueCode_ == null
            ? com.google.fhir.stu3.proto.HL7WorkgroupCode.getDefaultInstance()
            : valueCode_;
      } else {
        return valueCodeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.HL7WorkgroupCode value_code = 3;</code>
     */
    public Builder setValueCode(com.google.fhir.stu3.proto.HL7WorkgroupCode value) {
      if (valueCodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueCode_ = value;
        onChanged();
      } else {
        valueCodeBuilder_.setMessage(value);
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
     * <code>.google.fhir.stu3.proto.HL7WorkgroupCode value_code = 3;</code>
     */
    public Builder setValueCode(
        com.google.fhir.stu3.proto.HL7WorkgroupCode.Builder builderForValue) {
      if (valueCodeBuilder_ == null) {
        valueCode_ = builderForValue.build();
        onChanged();
      } else {
        valueCodeBuilder_.setMessage(builderForValue.build());
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
     * <code>.google.fhir.stu3.proto.HL7WorkgroupCode value_code = 3;</code>
     */
    public Builder mergeValueCode(com.google.fhir.stu3.proto.HL7WorkgroupCode value) {
      if (valueCodeBuilder_ == null) {
        if (valueCode_ != null) {
          valueCode_ =
              com.google.fhir.stu3.proto.HL7WorkgroupCode.newBuilder(valueCode_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          valueCode_ = value;
        }
        onChanged();
      } else {
        valueCodeBuilder_.mergeFrom(value);
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
     * <code>.google.fhir.stu3.proto.HL7WorkgroupCode value_code = 3;</code>
     */
    public Builder clearValueCode() {
      if (valueCodeBuilder_ == null) {
        valueCode_ = null;
        onChanged();
      } else {
        valueCode_ = null;
        valueCodeBuilder_ = null;
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
     * <code>.google.fhir.stu3.proto.HL7WorkgroupCode value_code = 3;</code>
     */
    public com.google.fhir.stu3.proto.HL7WorkgroupCode.Builder getValueCodeBuilder() {

      onChanged();
      return getValueCodeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.HL7WorkgroupCode value_code = 3;</code>
     */
    public com.google.fhir.stu3.proto.HL7WorkgroupCodeOrBuilder getValueCodeOrBuilder() {
      if (valueCodeBuilder_ != null) {
        return valueCodeBuilder_.getMessageOrBuilder();
      } else {
        return valueCode_ == null
            ? com.google.fhir.stu3.proto.HL7WorkgroupCode.getDefaultInstance()
            : valueCode_;
      }
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.HL7WorkgroupCode value_code = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.HL7WorkgroupCode,
            com.google.fhir.stu3.proto.HL7WorkgroupCode.Builder,
            com.google.fhir.stu3.proto.HL7WorkgroupCodeOrBuilder>
        getValueCodeFieldBuilder() {
      if (valueCodeBuilder_ == null) {
        valueCodeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.fhir.stu3.proto.HL7WorkgroupCode,
                com.google.fhir.stu3.proto.HL7WorkgroupCode.Builder,
                com.google.fhir.stu3.proto.HL7WorkgroupCodeOrBuilder>(
                getValueCode(), getParentForChildren(), isClean());
        valueCode_ = null;
      }
      return valueCodeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.fhir.stu3.proto.Wg)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.stu3.proto.Wg)
  private static final com.google.fhir.stu3.proto.Wg DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.stu3.proto.Wg();
  }

  public static com.google.fhir.stu3.proto.Wg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Wg> PARSER =
      new com.google.protobuf.AbstractParser<Wg>() {
        @java.lang.Override
        public Wg parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Wg(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Wg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Wg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.stu3.proto.Wg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
