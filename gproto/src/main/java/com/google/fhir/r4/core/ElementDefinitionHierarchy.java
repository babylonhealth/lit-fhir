// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/r4/core/extensions.proto

package com.google.fhir.r4.core;

/**
 *
 *
 * <pre>
 * Auto-generated from StructureDefinition for hierarchy.
 * Whether a circular reference is allowed to (transitively) point back to the
 * same instance. See
 * http://hl7.org/fhir/StructureDefinition/structuredefinition-hierarchy
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.ElementDefinitionHierarchy}
 */
public final class ElementDefinitionHierarchy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.ElementDefinitionHierarchy)
    ElementDefinitionHierarchyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ElementDefinitionHierarchy.newBuilder() to construct.
  private ElementDefinitionHierarchy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ElementDefinitionHierarchy() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ElementDefinitionHierarchy();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ElementDefinitionHierarchy(
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
              com.google.fhir.r4.core.String.Builder subBuilder = null;
              if (id_ != null) {
                subBuilder = id_.toBuilder();
              }
              id_ = input.readMessage(com.google.fhir.r4.core.String.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(id_);
                id_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              com.google.fhir.r4.core.Boolean.Builder subBuilder = null;
              if (valueBoolean_ != null) {
                subBuilder = valueBoolean_.toBuilder();
              }
              valueBoolean_ =
                  input.readMessage(com.google.fhir.r4.core.Boolean.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(valueBoolean_);
                valueBoolean_ = subBuilder.buildPartial();
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
    return com.google.fhir.r4.core.Extensions
        .internal_static_google_fhir_r4_core_ElementDefinitionHierarchy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Extensions
        .internal_static_google_fhir_r4_core_ElementDefinitionHierarchy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.ElementDefinitionHierarchy.class,
            com.google.fhir.r4.core.ElementDefinitionHierarchy.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.google.fhir.r4.core.String id_;
  /**
   *
   *
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
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
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   *
   * @return The id.
   */
  public com.google.fhir.r4.core.String getId() {
    return id_ == null ? com.google.fhir.r4.core.String.getDefaultInstance() : id_;
  }
  /**
   *
   *
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   */
  public com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int VALUE_BOOLEAN_FIELD_NUMBER = 3;
  private com.google.fhir.r4.core.Boolean valueBoolean_;
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Boolean value_boolean = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return Whether the valueBoolean field is set.
   */
  public boolean hasValueBoolean() {
    return valueBoolean_ != null;
  }
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Boolean value_boolean = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   *
   * @return The valueBoolean.
   */
  public com.google.fhir.r4.core.Boolean getValueBoolean() {
    return valueBoolean_ == null
        ? com.google.fhir.r4.core.Boolean.getDefaultInstance()
        : valueBoolean_;
  }
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>
   * .google.fhir.r4.core.Boolean value_boolean = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
   * </code>
   */
  public com.google.fhir.r4.core.BooleanOrBuilder getValueBooleanOrBuilder() {
    return getValueBoolean();
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
    if (valueBoolean_ != null) {
      output.writeMessage(3, getValueBoolean());
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
    if (valueBoolean_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getValueBoolean());
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
    if (!(obj instanceof com.google.fhir.r4.core.ElementDefinitionHierarchy)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.ElementDefinitionHierarchy other =
        (com.google.fhir.r4.core.ElementDefinitionHierarchy) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId().equals(other.getId())) return false;
    }
    if (hasValueBoolean() != other.hasValueBoolean()) return false;
    if (hasValueBoolean()) {
      if (!getValueBoolean().equals(other.getValueBoolean())) return false;
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
    if (hasValueBoolean()) {
      hash = (37 * hash) + VALUE_BOOLEAN_FIELD_NUMBER;
      hash = (53 * hash) + getValueBoolean().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.r4.core.ElementDefinitionHierarchy parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.ElementDefinitionHierarchy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ElementDefinitionHierarchy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.ElementDefinitionHierarchy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ElementDefinitionHierarchy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.r4.core.ElementDefinitionHierarchy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ElementDefinitionHierarchy parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.ElementDefinitionHierarchy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ElementDefinitionHierarchy parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.ElementDefinitionHierarchy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.r4.core.ElementDefinitionHierarchy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.r4.core.ElementDefinitionHierarchy parseFrom(
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

  public static Builder newBuilder(com.google.fhir.r4.core.ElementDefinitionHierarchy prototype) {
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
   * Auto-generated from StructureDefinition for hierarchy.
   * Whether a circular reference is allowed to (transitively) point back to the
   * same instance. See
   * http://hl7.org/fhir/StructureDefinition/structuredefinition-hierarchy
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.ElementDefinitionHierarchy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.ElementDefinitionHierarchy)
      com.google.fhir.r4.core.ElementDefinitionHierarchyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.r4.core.Extensions
          .internal_static_google_fhir_r4_core_ElementDefinitionHierarchy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Extensions
          .internal_static_google_fhir_r4_core_ElementDefinitionHierarchy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.ElementDefinitionHierarchy.class,
              com.google.fhir.r4.core.ElementDefinitionHierarchy.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.ElementDefinitionHierarchy.newBuilder()
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
      if (valueBooleanBuilder_ == null) {
        valueBoolean_ = null;
      } else {
        valueBoolean_ = null;
        valueBooleanBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.fhir.r4.core.Extensions
          .internal_static_google_fhir_r4_core_ElementDefinitionHierarchy_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.ElementDefinitionHierarchy getDefaultInstanceForType() {
      return com.google.fhir.r4.core.ElementDefinitionHierarchy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.ElementDefinitionHierarchy build() {
      com.google.fhir.r4.core.ElementDefinitionHierarchy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.ElementDefinitionHierarchy buildPartial() {
      com.google.fhir.r4.core.ElementDefinitionHierarchy result =
          new com.google.fhir.r4.core.ElementDefinitionHierarchy(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (valueBooleanBuilder_ == null) {
        result.valueBoolean_ = valueBoolean_;
      } else {
        result.valueBoolean_ = valueBooleanBuilder_.build();
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
      if (other instanceof com.google.fhir.r4.core.ElementDefinitionHierarchy) {
        return mergeFrom((com.google.fhir.r4.core.ElementDefinitionHierarchy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.ElementDefinitionHierarchy other) {
      if (other == com.google.fhir.r4.core.ElementDefinitionHierarchy.getDefaultInstance())
        return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasValueBoolean()) {
        mergeValueBoolean(other.getValueBoolean());
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
      com.google.fhir.r4.core.ElementDefinitionHierarchy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.fhir.r4.core.ElementDefinitionHierarchy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.fhir.r4.core.String id_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.r4.core.String,
            com.google.fhir.r4.core.String.Builder,
            com.google.fhir.r4.core.StringOrBuilder>
        idBuilder_;
    /**
     *
     *
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
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
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     *
     * @return The id.
     */
    public com.google.fhir.r4.core.String getId() {
      if (idBuilder_ == null) {
        return id_ == null ? com.google.fhir.r4.core.String.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public Builder setId(com.google.fhir.r4.core.String value) {
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
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public Builder setId(com.google.fhir.r4.core.String.Builder builderForValue) {
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
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public Builder mergeId(com.google.fhir.r4.core.String value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ = com.google.fhir.r4.core.String.newBuilder(id_).mergeFrom(value).buildPartial();
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
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
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
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public com.google.fhir.r4.core.String.Builder getIdBuilder() {

      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ? com.google.fhir.r4.core.String.getDefaultInstance() : id_;
      }
    }
    /**
     *
     *
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.r4.core.String,
            com.google.fhir.r4.core.String.Builder,
            com.google.fhir.r4.core.StringOrBuilder>
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.fhir.r4.core.String,
                com.google.fhir.r4.core.String.Builder,
                com.google.fhir.r4.core.StringOrBuilder>(
                getId(), getParentForChildren(), isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private com.google.fhir.r4.core.Boolean valueBoolean_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.r4.core.Boolean,
            com.google.fhir.r4.core.Boolean.Builder,
            com.google.fhir.r4.core.BooleanOrBuilder>
        valueBooleanBuilder_;
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.r4.core.Boolean value_boolean = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     *
     * @return Whether the valueBoolean field is set.
     */
    public boolean hasValueBoolean() {
      return valueBooleanBuilder_ != null || valueBoolean_ != null;
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.r4.core.Boolean value_boolean = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     *
     * @return The valueBoolean.
     */
    public com.google.fhir.r4.core.Boolean getValueBoolean() {
      if (valueBooleanBuilder_ == null) {
        return valueBoolean_ == null
            ? com.google.fhir.r4.core.Boolean.getDefaultInstance()
            : valueBoolean_;
      } else {
        return valueBooleanBuilder_.getMessage();
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
     * .google.fhir.r4.core.Boolean value_boolean = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     */
    public Builder setValueBoolean(com.google.fhir.r4.core.Boolean value) {
      if (valueBooleanBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueBoolean_ = value;
        onChanged();
      } else {
        valueBooleanBuilder_.setMessage(value);
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
     * .google.fhir.r4.core.Boolean value_boolean = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     */
    public Builder setValueBoolean(com.google.fhir.r4.core.Boolean.Builder builderForValue) {
      if (valueBooleanBuilder_ == null) {
        valueBoolean_ = builderForValue.build();
        onChanged();
      } else {
        valueBooleanBuilder_.setMessage(builderForValue.build());
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
     * .google.fhir.r4.core.Boolean value_boolean = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     */
    public Builder mergeValueBoolean(com.google.fhir.r4.core.Boolean value) {
      if (valueBooleanBuilder_ == null) {
        if (valueBoolean_ != null) {
          valueBoolean_ =
              com.google.fhir.r4.core.Boolean.newBuilder(valueBoolean_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          valueBoolean_ = value;
        }
        onChanged();
      } else {
        valueBooleanBuilder_.mergeFrom(value);
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
     * .google.fhir.r4.core.Boolean value_boolean = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     */
    public Builder clearValueBoolean() {
      if (valueBooleanBuilder_ == null) {
        valueBoolean_ = null;
        onChanged();
      } else {
        valueBoolean_ = null;
        valueBooleanBuilder_ = null;
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
     * .google.fhir.r4.core.Boolean value_boolean = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     */
    public com.google.fhir.r4.core.Boolean.Builder getValueBooleanBuilder() {

      onChanged();
      return getValueBooleanFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>
     * .google.fhir.r4.core.Boolean value_boolean = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     */
    public com.google.fhir.r4.core.BooleanOrBuilder getValueBooleanOrBuilder() {
      if (valueBooleanBuilder_ != null) {
        return valueBooleanBuilder_.getMessageOrBuilder();
      } else {
        return valueBoolean_ == null
            ? com.google.fhir.r4.core.Boolean.getDefaultInstance()
            : valueBoolean_;
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
     * .google.fhir.r4.core.Boolean value_boolean = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.r4.core.Boolean,
            com.google.fhir.r4.core.Boolean.Builder,
            com.google.fhir.r4.core.BooleanOrBuilder>
        getValueBooleanFieldBuilder() {
      if (valueBooleanBuilder_ == null) {
        valueBooleanBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.fhir.r4.core.Boolean,
                com.google.fhir.r4.core.Boolean.Builder,
                com.google.fhir.r4.core.BooleanOrBuilder>(
                getValueBoolean(), getParentForChildren(), isClean());
        valueBoolean_ = null;
      }
      return valueBooleanBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.ElementDefinitionHierarchy)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.ElementDefinitionHierarchy)
  private static final com.google.fhir.r4.core.ElementDefinitionHierarchy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.ElementDefinitionHierarchy();
  }

  public static com.google.fhir.r4.core.ElementDefinitionHierarchy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ElementDefinitionHierarchy> PARSER =
      new com.google.protobuf.AbstractParser<ElementDefinitionHierarchy>() {
        @java.lang.Override
        public ElementDefinitionHierarchy parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ElementDefinitionHierarchy(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ElementDefinitionHierarchy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ElementDefinitionHierarchy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.ElementDefinitionHierarchy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
