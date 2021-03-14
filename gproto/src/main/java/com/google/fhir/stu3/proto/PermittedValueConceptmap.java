// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

/**
 *
 *
 * <pre>
 * Auto-generated from StructureDefinition for permitted-value-conceptmap.
 * Mapping from permitted to transmitted.
 * See http://hl7.org/fhir/StructureDefinition/11179-permitted-value-conceptmap
 * </pre>
 *
 * Protobuf type {@code google.fhir.stu3.proto.PermittedValueConceptmap}
 */
public final class PermittedValueConceptmap extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.stu3.proto.PermittedValueConceptmap)
    PermittedValueConceptmapOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PermittedValueConceptmap.newBuilder() to construct.
  private PermittedValueConceptmap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PermittedValueConceptmap() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PermittedValueConceptmap();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PermittedValueConceptmap(
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
              com.google.fhir.stu3.proto.Reference.Builder subBuilder = null;
              if (valueReference_ != null) {
                subBuilder = valueReference_.toBuilder();
              }
              valueReference_ =
                  input.readMessage(
                      com.google.fhir.stu3.proto.Reference.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(valueReference_);
                valueReference_ = subBuilder.buildPartial();
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
        .internal_static_google_fhir_stu3_proto_PermittedValueConceptmap_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.stu3.proto.Extensions
        .internal_static_google_fhir_stu3_proto_PermittedValueConceptmap_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.stu3.proto.PermittedValueConceptmap.class,
            com.google.fhir.stu3.proto.PermittedValueConceptmap.Builder.class);
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

  public static final int VALUE_REFERENCE_FIELD_NUMBER = 3;
  private com.google.fhir.stu3.proto.Reference valueReference_;
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "ConceptMap"];
   * </code>
   *
   * @return Whether the valueReference field is set.
   */
  public boolean hasValueReference() {
    return valueReference_ != null;
  }
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "ConceptMap"];
   * </code>
   *
   * @return The valueReference.
   */
  public com.google.fhir.stu3.proto.Reference getValueReference() {
    return valueReference_ == null
        ? com.google.fhir.stu3.proto.Reference.getDefaultInstance()
        : valueReference_;
  }
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>
   * .google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "ConceptMap"];
   * </code>
   */
  public com.google.fhir.stu3.proto.ReferenceOrBuilder getValueReferenceOrBuilder() {
    return getValueReference();
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
    if (valueReference_ != null) {
      output.writeMessage(3, getValueReference());
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
    if (valueReference_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getValueReference());
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
    if (!(obj instanceof com.google.fhir.stu3.proto.PermittedValueConceptmap)) {
      return super.equals(obj);
    }
    com.google.fhir.stu3.proto.PermittedValueConceptmap other =
        (com.google.fhir.stu3.proto.PermittedValueConceptmap) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId().equals(other.getId())) return false;
    }
    if (hasValueReference() != other.hasValueReference()) return false;
    if (hasValueReference()) {
      if (!getValueReference().equals(other.getValueReference())) return false;
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
    if (hasValueReference()) {
      hash = (37 * hash) + VALUE_REFERENCE_FIELD_NUMBER;
      hash = (53 * hash) + getValueReference().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.stu3.proto.PermittedValueConceptmap parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.PermittedValueConceptmap parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.PermittedValueConceptmap parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.PermittedValueConceptmap parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.PermittedValueConceptmap parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.PermittedValueConceptmap parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.PermittedValueConceptmap parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.PermittedValueConceptmap parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.PermittedValueConceptmap parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.PermittedValueConceptmap parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.PermittedValueConceptmap parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.PermittedValueConceptmap parseFrom(
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

  public static Builder newBuilder(com.google.fhir.stu3.proto.PermittedValueConceptmap prototype) {
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
   * Auto-generated from StructureDefinition for permitted-value-conceptmap.
   * Mapping from permitted to transmitted.
   * See http://hl7.org/fhir/StructureDefinition/11179-permitted-value-conceptmap
   * </pre>
   *
   * Protobuf type {@code google.fhir.stu3.proto.PermittedValueConceptmap}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.stu3.proto.PermittedValueConceptmap)
      com.google.fhir.stu3.proto.PermittedValueConceptmapOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.stu3.proto.Extensions
          .internal_static_google_fhir_stu3_proto_PermittedValueConceptmap_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.stu3.proto.Extensions
          .internal_static_google_fhir_stu3_proto_PermittedValueConceptmap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.stu3.proto.PermittedValueConceptmap.class,
              com.google.fhir.stu3.proto.PermittedValueConceptmap.Builder.class);
    }

    // Construct using com.google.fhir.stu3.proto.PermittedValueConceptmap.newBuilder()
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
      if (valueReferenceBuilder_ == null) {
        valueReference_ = null;
      } else {
        valueReference_ = null;
        valueReferenceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.fhir.stu3.proto.Extensions
          .internal_static_google_fhir_stu3_proto_PermittedValueConceptmap_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.PermittedValueConceptmap getDefaultInstanceForType() {
      return com.google.fhir.stu3.proto.PermittedValueConceptmap.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.PermittedValueConceptmap build() {
      com.google.fhir.stu3.proto.PermittedValueConceptmap result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.PermittedValueConceptmap buildPartial() {
      com.google.fhir.stu3.proto.PermittedValueConceptmap result =
          new com.google.fhir.stu3.proto.PermittedValueConceptmap(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (valueReferenceBuilder_ == null) {
        result.valueReference_ = valueReference_;
      } else {
        result.valueReference_ = valueReferenceBuilder_.build();
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
      if (other instanceof com.google.fhir.stu3.proto.PermittedValueConceptmap) {
        return mergeFrom((com.google.fhir.stu3.proto.PermittedValueConceptmap) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.stu3.proto.PermittedValueConceptmap other) {
      if (other == com.google.fhir.stu3.proto.PermittedValueConceptmap.getDefaultInstance())
        return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasValueReference()) {
        mergeValueReference(other.getValueReference());
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
      com.google.fhir.stu3.proto.PermittedValueConceptmap parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.fhir.stu3.proto.PermittedValueConceptmap) e.getUnfinishedMessage();
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

    private com.google.fhir.stu3.proto.Reference valueReference_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.Reference,
            com.google.fhir.stu3.proto.Reference.Builder,
            com.google.fhir.stu3.proto.ReferenceOrBuilder>
        valueReferenceBuilder_;
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "ConceptMap"];
     * </code>
     *
     * @return Whether the valueReference field is set.
     */
    public boolean hasValueReference() {
      return valueReferenceBuilder_ != null || valueReference_ != null;
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "ConceptMap"];
     * </code>
     *
     * @return The valueReference.
     */
    public com.google.fhir.stu3.proto.Reference getValueReference() {
      if (valueReferenceBuilder_ == null) {
        return valueReference_ == null
            ? com.google.fhir.stu3.proto.Reference.getDefaultInstance()
            : valueReference_;
      } else {
        return valueReferenceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "ConceptMap"];
     * </code>
     */
    public Builder setValueReference(com.google.fhir.stu3.proto.Reference value) {
      if (valueReferenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueReference_ = value;
        onChanged();
      } else {
        valueReferenceBuilder_.setMessage(value);
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
     * <code>
     * .google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "ConceptMap"];
     * </code>
     */
    public Builder setValueReference(com.google.fhir.stu3.proto.Reference.Builder builderForValue) {
      if (valueReferenceBuilder_ == null) {
        valueReference_ = builderForValue.build();
        onChanged();
      } else {
        valueReferenceBuilder_.setMessage(builderForValue.build());
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
     * <code>
     * .google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "ConceptMap"];
     * </code>
     */
    public Builder mergeValueReference(com.google.fhir.stu3.proto.Reference value) {
      if (valueReferenceBuilder_ == null) {
        if (valueReference_ != null) {
          valueReference_ =
              com.google.fhir.stu3.proto.Reference.newBuilder(valueReference_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          valueReference_ = value;
        }
        onChanged();
      } else {
        valueReferenceBuilder_.mergeFrom(value);
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
     * <code>
     * .google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "ConceptMap"];
     * </code>
     */
    public Builder clearValueReference() {
      if (valueReferenceBuilder_ == null) {
        valueReference_ = null;
        onChanged();
      } else {
        valueReference_ = null;
        valueReferenceBuilder_ = null;
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
     * <code>
     * .google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "ConceptMap"];
     * </code>
     */
    public com.google.fhir.stu3.proto.Reference.Builder getValueReferenceBuilder() {

      onChanged();
      return getValueReferenceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "ConceptMap"];
     * </code>
     */
    public com.google.fhir.stu3.proto.ReferenceOrBuilder getValueReferenceOrBuilder() {
      if (valueReferenceBuilder_ != null) {
        return valueReferenceBuilder_.getMessageOrBuilder();
      } else {
        return valueReference_ == null
            ? com.google.fhir.stu3.proto.Reference.getDefaultInstance()
            : valueReference_;
      }
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "ConceptMap"];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.Reference,
            com.google.fhir.stu3.proto.Reference.Builder,
            com.google.fhir.stu3.proto.ReferenceOrBuilder>
        getValueReferenceFieldBuilder() {
      if (valueReferenceBuilder_ == null) {
        valueReferenceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.fhir.stu3.proto.Reference,
                com.google.fhir.stu3.proto.Reference.Builder,
                com.google.fhir.stu3.proto.ReferenceOrBuilder>(
                getValueReference(), getParentForChildren(), isClean());
        valueReference_ = null;
      }
      return valueReferenceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.fhir.stu3.proto.PermittedValueConceptmap)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.stu3.proto.PermittedValueConceptmap)
  private static final com.google.fhir.stu3.proto.PermittedValueConceptmap DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.stu3.proto.PermittedValueConceptmap();
  }

  public static com.google.fhir.stu3.proto.PermittedValueConceptmap getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PermittedValueConceptmap> PARSER =
      new com.google.protobuf.AbstractParser<PermittedValueConceptmap>() {
        @java.lang.Override
        public PermittedValueConceptmap parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PermittedValueConceptmap(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PermittedValueConceptmap> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PermittedValueConceptmap> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.stu3.proto.PermittedValueConceptmap getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
