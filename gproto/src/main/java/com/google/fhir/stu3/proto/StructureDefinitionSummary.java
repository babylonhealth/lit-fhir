// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

/**
 *
 *
 * <pre>
 * Auto-generated from StructureDefinition for summary.
 * Additional text for the summary presentation.
 * See http://hl7.org/fhir/StructureDefinition/structuredefinition-summary
 * </pre>
 *
 * Protobuf type {@code google.fhir.stu3.proto.StructureDefinitionSummary}
 */
public final class StructureDefinitionSummary extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.stu3.proto.StructureDefinitionSummary)
    StructureDefinitionSummaryOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StructureDefinitionSummary.newBuilder() to construct.
  private StructureDefinitionSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StructureDefinitionSummary() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StructureDefinitionSummary();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private StructureDefinitionSummary(
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
              com.google.fhir.stu3.proto.Markdown.Builder subBuilder = null;
              if (valueMarkdown_ != null) {
                subBuilder = valueMarkdown_.toBuilder();
              }
              valueMarkdown_ =
                  input.readMessage(
                      com.google.fhir.stu3.proto.Markdown.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(valueMarkdown_);
                valueMarkdown_ = subBuilder.buildPartial();
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
        .internal_static_google_fhir_stu3_proto_StructureDefinitionSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.stu3.proto.Extensions
        .internal_static_google_fhir_stu3_proto_StructureDefinitionSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.stu3.proto.StructureDefinitionSummary.class,
            com.google.fhir.stu3.proto.StructureDefinitionSummary.Builder.class);
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

  public static final int VALUE_MARKDOWN_FIELD_NUMBER = 3;
  private com.google.fhir.stu3.proto.Markdown valueMarkdown_;
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown value_markdown = 3;</code>
   *
   * @return Whether the valueMarkdown field is set.
   */
  public boolean hasValueMarkdown() {
    return valueMarkdown_ != null;
  }
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown value_markdown = 3;</code>
   *
   * @return The valueMarkdown.
   */
  public com.google.fhir.stu3.proto.Markdown getValueMarkdown() {
    return valueMarkdown_ == null
        ? com.google.fhir.stu3.proto.Markdown.getDefaultInstance()
        : valueMarkdown_;
  }
  /**
   *
   *
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown value_markdown = 3;</code>
   */
  public com.google.fhir.stu3.proto.MarkdownOrBuilder getValueMarkdownOrBuilder() {
    return getValueMarkdown();
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
    if (valueMarkdown_ != null) {
      output.writeMessage(3, getValueMarkdown());
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
    if (valueMarkdown_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getValueMarkdown());
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
    if (!(obj instanceof com.google.fhir.stu3.proto.StructureDefinitionSummary)) {
      return super.equals(obj);
    }
    com.google.fhir.stu3.proto.StructureDefinitionSummary other =
        (com.google.fhir.stu3.proto.StructureDefinitionSummary) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId().equals(other.getId())) return false;
    }
    if (hasValueMarkdown() != other.hasValueMarkdown()) return false;
    if (hasValueMarkdown()) {
      if (!getValueMarkdown().equals(other.getValueMarkdown())) return false;
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
    if (hasValueMarkdown()) {
      hash = (37 * hash) + VALUE_MARKDOWN_FIELD_NUMBER;
      hash = (53 * hash) + getValueMarkdown().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.stu3.proto.StructureDefinitionSummary parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.StructureDefinitionSummary parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.StructureDefinitionSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.StructureDefinitionSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.StructureDefinitionSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.stu3.proto.StructureDefinitionSummary parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.StructureDefinitionSummary parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.StructureDefinitionSummary parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.StructureDefinitionSummary parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.StructureDefinitionSummary parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.stu3.proto.StructureDefinitionSummary parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.stu3.proto.StructureDefinitionSummary parseFrom(
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
      com.google.fhir.stu3.proto.StructureDefinitionSummary prototype) {
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
   * Auto-generated from StructureDefinition for summary.
   * Additional text for the summary presentation.
   * See http://hl7.org/fhir/StructureDefinition/structuredefinition-summary
   * </pre>
   *
   * Protobuf type {@code google.fhir.stu3.proto.StructureDefinitionSummary}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.stu3.proto.StructureDefinitionSummary)
      com.google.fhir.stu3.proto.StructureDefinitionSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.stu3.proto.Extensions
          .internal_static_google_fhir_stu3_proto_StructureDefinitionSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.stu3.proto.Extensions
          .internal_static_google_fhir_stu3_proto_StructureDefinitionSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.stu3.proto.StructureDefinitionSummary.class,
              com.google.fhir.stu3.proto.StructureDefinitionSummary.Builder.class);
    }

    // Construct using com.google.fhir.stu3.proto.StructureDefinitionSummary.newBuilder()
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
      if (valueMarkdownBuilder_ == null) {
        valueMarkdown_ = null;
      } else {
        valueMarkdown_ = null;
        valueMarkdownBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.fhir.stu3.proto.Extensions
          .internal_static_google_fhir_stu3_proto_StructureDefinitionSummary_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.StructureDefinitionSummary getDefaultInstanceForType() {
      return com.google.fhir.stu3.proto.StructureDefinitionSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.StructureDefinitionSummary build() {
      com.google.fhir.stu3.proto.StructureDefinitionSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.StructureDefinitionSummary buildPartial() {
      com.google.fhir.stu3.proto.StructureDefinitionSummary result =
          new com.google.fhir.stu3.proto.StructureDefinitionSummary(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (valueMarkdownBuilder_ == null) {
        result.valueMarkdown_ = valueMarkdown_;
      } else {
        result.valueMarkdown_ = valueMarkdownBuilder_.build();
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
      if (other instanceof com.google.fhir.stu3.proto.StructureDefinitionSummary) {
        return mergeFrom((com.google.fhir.stu3.proto.StructureDefinitionSummary) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.stu3.proto.StructureDefinitionSummary other) {
      if (other == com.google.fhir.stu3.proto.StructureDefinitionSummary.getDefaultInstance())
        return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasValueMarkdown()) {
        mergeValueMarkdown(other.getValueMarkdown());
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
      com.google.fhir.stu3.proto.StructureDefinitionSummary parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.fhir.stu3.proto.StructureDefinitionSummary) e.getUnfinishedMessage();
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

    private com.google.fhir.stu3.proto.Markdown valueMarkdown_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.Markdown,
            com.google.fhir.stu3.proto.Markdown.Builder,
            com.google.fhir.stu3.proto.MarkdownOrBuilder>
        valueMarkdownBuilder_;
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Markdown value_markdown = 3;</code>
     *
     * @return Whether the valueMarkdown field is set.
     */
    public boolean hasValueMarkdown() {
      return valueMarkdownBuilder_ != null || valueMarkdown_ != null;
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Markdown value_markdown = 3;</code>
     *
     * @return The valueMarkdown.
     */
    public com.google.fhir.stu3.proto.Markdown getValueMarkdown() {
      if (valueMarkdownBuilder_ == null) {
        return valueMarkdown_ == null
            ? com.google.fhir.stu3.proto.Markdown.getDefaultInstance()
            : valueMarkdown_;
      } else {
        return valueMarkdownBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Markdown value_markdown = 3;</code>
     */
    public Builder setValueMarkdown(com.google.fhir.stu3.proto.Markdown value) {
      if (valueMarkdownBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueMarkdown_ = value;
        onChanged();
      } else {
        valueMarkdownBuilder_.setMessage(value);
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
     * <code>.google.fhir.stu3.proto.Markdown value_markdown = 3;</code>
     */
    public Builder setValueMarkdown(com.google.fhir.stu3.proto.Markdown.Builder builderForValue) {
      if (valueMarkdownBuilder_ == null) {
        valueMarkdown_ = builderForValue.build();
        onChanged();
      } else {
        valueMarkdownBuilder_.setMessage(builderForValue.build());
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
     * <code>.google.fhir.stu3.proto.Markdown value_markdown = 3;</code>
     */
    public Builder mergeValueMarkdown(com.google.fhir.stu3.proto.Markdown value) {
      if (valueMarkdownBuilder_ == null) {
        if (valueMarkdown_ != null) {
          valueMarkdown_ =
              com.google.fhir.stu3.proto.Markdown.newBuilder(valueMarkdown_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          valueMarkdown_ = value;
        }
        onChanged();
      } else {
        valueMarkdownBuilder_.mergeFrom(value);
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
     * <code>.google.fhir.stu3.proto.Markdown value_markdown = 3;</code>
     */
    public Builder clearValueMarkdown() {
      if (valueMarkdownBuilder_ == null) {
        valueMarkdown_ = null;
        onChanged();
      } else {
        valueMarkdown_ = null;
        valueMarkdownBuilder_ = null;
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
     * <code>.google.fhir.stu3.proto.Markdown value_markdown = 3;</code>
     */
    public com.google.fhir.stu3.proto.Markdown.Builder getValueMarkdownBuilder() {

      onChanged();
      return getValueMarkdownFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Markdown value_markdown = 3;</code>
     */
    public com.google.fhir.stu3.proto.MarkdownOrBuilder getValueMarkdownOrBuilder() {
      if (valueMarkdownBuilder_ != null) {
        return valueMarkdownBuilder_.getMessageOrBuilder();
      } else {
        return valueMarkdown_ == null
            ? com.google.fhir.stu3.proto.Markdown.getDefaultInstance()
            : valueMarkdown_;
      }
    }
    /**
     *
     *
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Markdown value_markdown = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.Markdown,
            com.google.fhir.stu3.proto.Markdown.Builder,
            com.google.fhir.stu3.proto.MarkdownOrBuilder>
        getValueMarkdownFieldBuilder() {
      if (valueMarkdownBuilder_ == null) {
        valueMarkdownBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.fhir.stu3.proto.Markdown,
                com.google.fhir.stu3.proto.Markdown.Builder,
                com.google.fhir.stu3.proto.MarkdownOrBuilder>(
                getValueMarkdown(), getParentForChildren(), isClean());
        valueMarkdown_ = null;
      }
      return valueMarkdownBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.fhir.stu3.proto.StructureDefinitionSummary)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.stu3.proto.StructureDefinitionSummary)
  private static final com.google.fhir.stu3.proto.StructureDefinitionSummary DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.stu3.proto.StructureDefinitionSummary();
  }

  public static com.google.fhir.stu3.proto.StructureDefinitionSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StructureDefinitionSummary> PARSER =
      new com.google.protobuf.AbstractParser<StructureDefinitionSummary>() {
        @java.lang.Override
        public StructureDefinitionSummary parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new StructureDefinitionSummary(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<StructureDefinitionSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StructureDefinitionSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.stu3.proto.StructureDefinitionSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
