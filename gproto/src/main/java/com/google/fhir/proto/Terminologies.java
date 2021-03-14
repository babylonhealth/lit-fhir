// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/profile_config.proto

package com.google.fhir.proto;

/**
 *
 *
 * <pre>
 * Config for definition of Terminologies (CodeSysems and ValueSets) that are
 * part of an Implementation Guide to be generated
 * </pre>
 *
 * Protobuf type {@code google.fhir.proto.Terminologies}
 */
public final class Terminologies extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.proto.Terminologies)
    TerminologiesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Terminologies.newBuilder() to construct.
  private Terminologies(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Terminologies() {
    codeSystem_ = java.util.Collections.emptyList();
    valueSet_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Terminologies();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Terminologies(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                codeSystem_ = new java.util.ArrayList<com.google.fhir.proto.CodeSystemConfig>();
                mutable_bitField0_ |= 0x00000001;
              }
              codeSystem_.add(
                  input.readMessage(
                      com.google.fhir.proto.CodeSystemConfig.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                valueSet_ = new java.util.ArrayList<com.google.fhir.proto.ValueSetConfig>();
                mutable_bitField0_ |= 0x00000002;
              }
              valueSet_.add(
                  input.readMessage(
                      com.google.fhir.proto.ValueSetConfig.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        codeSystem_ = java.util.Collections.unmodifiableList(codeSystem_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        valueSet_ = java.util.Collections.unmodifiableList(valueSet_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.fhir.proto.ProfileConfig
        .internal_static_google_fhir_proto_Terminologies_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.proto.ProfileConfig
        .internal_static_google_fhir_proto_Terminologies_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.proto.Terminologies.class,
            com.google.fhir.proto.Terminologies.Builder.class);
  }

  public static final int CODE_SYSTEM_FIELD_NUMBER = 1;
  private java.util.List<com.google.fhir.proto.CodeSystemConfig> codeSystem_;
  /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
  public java.util.List<com.google.fhir.proto.CodeSystemConfig> getCodeSystemList() {
    return codeSystem_;
  }
  /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
  public java.util.List<? extends com.google.fhir.proto.CodeSystemConfigOrBuilder>
      getCodeSystemOrBuilderList() {
    return codeSystem_;
  }
  /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
  public int getCodeSystemCount() {
    return codeSystem_.size();
  }
  /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
  public com.google.fhir.proto.CodeSystemConfig getCodeSystem(int index) {
    return codeSystem_.get(index);
  }
  /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
  public com.google.fhir.proto.CodeSystemConfigOrBuilder getCodeSystemOrBuilder(int index) {
    return codeSystem_.get(index);
  }

  public static final int VALUE_SET_FIELD_NUMBER = 2;
  private java.util.List<com.google.fhir.proto.ValueSetConfig> valueSet_;
  /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
  public java.util.List<com.google.fhir.proto.ValueSetConfig> getValueSetList() {
    return valueSet_;
  }
  /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
  public java.util.List<? extends com.google.fhir.proto.ValueSetConfigOrBuilder>
      getValueSetOrBuilderList() {
    return valueSet_;
  }
  /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
  public int getValueSetCount() {
    return valueSet_.size();
  }
  /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
  public com.google.fhir.proto.ValueSetConfig getValueSet(int index) {
    return valueSet_.get(index);
  }
  /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
  public com.google.fhir.proto.ValueSetConfigOrBuilder getValueSetOrBuilder(int index) {
    return valueSet_.get(index);
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
    for (int i = 0; i < codeSystem_.size(); i++) {
      output.writeMessage(1, codeSystem_.get(i));
    }
    for (int i = 0; i < valueSet_.size(); i++) {
      output.writeMessage(2, valueSet_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < codeSystem_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, codeSystem_.get(i));
    }
    for (int i = 0; i < valueSet_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, valueSet_.get(i));
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
    if (!(obj instanceof com.google.fhir.proto.Terminologies)) {
      return super.equals(obj);
    }
    com.google.fhir.proto.Terminologies other = (com.google.fhir.proto.Terminologies) obj;

    if (!getCodeSystemList().equals(other.getCodeSystemList())) return false;
    if (!getValueSetList().equals(other.getValueSetList())) return false;
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
    if (getCodeSystemCount() > 0) {
      hash = (37 * hash) + CODE_SYSTEM_FIELD_NUMBER;
      hash = (53 * hash) + getCodeSystemList().hashCode();
    }
    if (getValueSetCount() > 0) {
      hash = (37 * hash) + VALUE_SET_FIELD_NUMBER;
      hash = (53 * hash) + getValueSetList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.proto.Terminologies parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.Terminologies parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.Terminologies parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.Terminologies parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.Terminologies parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.Terminologies parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.Terminologies parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.Terminologies parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.proto.Terminologies parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.Terminologies parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.proto.Terminologies parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.Terminologies parseFrom(
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

  public static Builder newBuilder(com.google.fhir.proto.Terminologies prototype) {
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
   * Config for definition of Terminologies (CodeSysems and ValueSets) that are
   * part of an Implementation Guide to be generated
   * </pre>
   *
   * Protobuf type {@code google.fhir.proto.Terminologies}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.proto.Terminologies)
      com.google.fhir.proto.TerminologiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_Terminologies_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_Terminologies_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.proto.Terminologies.class,
              com.google.fhir.proto.Terminologies.Builder.class);
    }

    // Construct using com.google.fhir.proto.Terminologies.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getCodeSystemFieldBuilder();
        getValueSetFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (codeSystemBuilder_ == null) {
        codeSystem_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        codeSystemBuilder_.clear();
      }
      if (valueSetBuilder_ == null) {
        valueSet_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        valueSetBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_Terminologies_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.proto.Terminologies getDefaultInstanceForType() {
      return com.google.fhir.proto.Terminologies.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.proto.Terminologies build() {
      com.google.fhir.proto.Terminologies result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.proto.Terminologies buildPartial() {
      com.google.fhir.proto.Terminologies result = new com.google.fhir.proto.Terminologies(this);
      int from_bitField0_ = bitField0_;
      if (codeSystemBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          codeSystem_ = java.util.Collections.unmodifiableList(codeSystem_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.codeSystem_ = codeSystem_;
      } else {
        result.codeSystem_ = codeSystemBuilder_.build();
      }
      if (valueSetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          valueSet_ = java.util.Collections.unmodifiableList(valueSet_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.valueSet_ = valueSet_;
      } else {
        result.valueSet_ = valueSetBuilder_.build();
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
      if (other instanceof com.google.fhir.proto.Terminologies) {
        return mergeFrom((com.google.fhir.proto.Terminologies) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.proto.Terminologies other) {
      if (other == com.google.fhir.proto.Terminologies.getDefaultInstance()) return this;
      if (codeSystemBuilder_ == null) {
        if (!other.codeSystem_.isEmpty()) {
          if (codeSystem_.isEmpty()) {
            codeSystem_ = other.codeSystem_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCodeSystemIsMutable();
            codeSystem_.addAll(other.codeSystem_);
          }
          onChanged();
        }
      } else {
        if (!other.codeSystem_.isEmpty()) {
          if (codeSystemBuilder_.isEmpty()) {
            codeSystemBuilder_.dispose();
            codeSystemBuilder_ = null;
            codeSystem_ = other.codeSystem_;
            bitField0_ = (bitField0_ & ~0x00000001);
            codeSystemBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCodeSystemFieldBuilder()
                    : null;
          } else {
            codeSystemBuilder_.addAllMessages(other.codeSystem_);
          }
        }
      }
      if (valueSetBuilder_ == null) {
        if (!other.valueSet_.isEmpty()) {
          if (valueSet_.isEmpty()) {
            valueSet_ = other.valueSet_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureValueSetIsMutable();
            valueSet_.addAll(other.valueSet_);
          }
          onChanged();
        }
      } else {
        if (!other.valueSet_.isEmpty()) {
          if (valueSetBuilder_.isEmpty()) {
            valueSetBuilder_.dispose();
            valueSetBuilder_ = null;
            valueSet_ = other.valueSet_;
            bitField0_ = (bitField0_ & ~0x00000002);
            valueSetBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getValueSetFieldBuilder()
                    : null;
          } else {
            valueSetBuilder_.addAllMessages(other.valueSet_);
          }
        }
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
      com.google.fhir.proto.Terminologies parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.proto.Terminologies) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.fhir.proto.CodeSystemConfig> codeSystem_ =
        java.util.Collections.emptyList();

    private void ensureCodeSystemIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        codeSystem_ = new java.util.ArrayList<com.google.fhir.proto.CodeSystemConfig>(codeSystem_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.fhir.proto.CodeSystemConfig,
            com.google.fhir.proto.CodeSystemConfig.Builder,
            com.google.fhir.proto.CodeSystemConfigOrBuilder>
        codeSystemBuilder_;

    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public java.util.List<com.google.fhir.proto.CodeSystemConfig> getCodeSystemList() {
      if (codeSystemBuilder_ == null) {
        return java.util.Collections.unmodifiableList(codeSystem_);
      } else {
        return codeSystemBuilder_.getMessageList();
      }
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public int getCodeSystemCount() {
      if (codeSystemBuilder_ == null) {
        return codeSystem_.size();
      } else {
        return codeSystemBuilder_.getCount();
      }
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public com.google.fhir.proto.CodeSystemConfig getCodeSystem(int index) {
      if (codeSystemBuilder_ == null) {
        return codeSystem_.get(index);
      } else {
        return codeSystemBuilder_.getMessage(index);
      }
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public Builder setCodeSystem(int index, com.google.fhir.proto.CodeSystemConfig value) {
      if (codeSystemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCodeSystemIsMutable();
        codeSystem_.set(index, value);
        onChanged();
      } else {
        codeSystemBuilder_.setMessage(index, value);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public Builder setCodeSystem(
        int index, com.google.fhir.proto.CodeSystemConfig.Builder builderForValue) {
      if (codeSystemBuilder_ == null) {
        ensureCodeSystemIsMutable();
        codeSystem_.set(index, builderForValue.build());
        onChanged();
      } else {
        codeSystemBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public Builder addCodeSystem(com.google.fhir.proto.CodeSystemConfig value) {
      if (codeSystemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCodeSystemIsMutable();
        codeSystem_.add(value);
        onChanged();
      } else {
        codeSystemBuilder_.addMessage(value);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public Builder addCodeSystem(int index, com.google.fhir.proto.CodeSystemConfig value) {
      if (codeSystemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCodeSystemIsMutable();
        codeSystem_.add(index, value);
        onChanged();
      } else {
        codeSystemBuilder_.addMessage(index, value);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public Builder addCodeSystem(com.google.fhir.proto.CodeSystemConfig.Builder builderForValue) {
      if (codeSystemBuilder_ == null) {
        ensureCodeSystemIsMutable();
        codeSystem_.add(builderForValue.build());
        onChanged();
      } else {
        codeSystemBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public Builder addCodeSystem(
        int index, com.google.fhir.proto.CodeSystemConfig.Builder builderForValue) {
      if (codeSystemBuilder_ == null) {
        ensureCodeSystemIsMutable();
        codeSystem_.add(index, builderForValue.build());
        onChanged();
      } else {
        codeSystemBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public Builder addAllCodeSystem(
        java.lang.Iterable<? extends com.google.fhir.proto.CodeSystemConfig> values) {
      if (codeSystemBuilder_ == null) {
        ensureCodeSystemIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, codeSystem_);
        onChanged();
      } else {
        codeSystemBuilder_.addAllMessages(values);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public Builder clearCodeSystem() {
      if (codeSystemBuilder_ == null) {
        codeSystem_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        codeSystemBuilder_.clear();
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public Builder removeCodeSystem(int index) {
      if (codeSystemBuilder_ == null) {
        ensureCodeSystemIsMutable();
        codeSystem_.remove(index);
        onChanged();
      } else {
        codeSystemBuilder_.remove(index);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public com.google.fhir.proto.CodeSystemConfig.Builder getCodeSystemBuilder(int index) {
      return getCodeSystemFieldBuilder().getBuilder(index);
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public com.google.fhir.proto.CodeSystemConfigOrBuilder getCodeSystemOrBuilder(int index) {
      if (codeSystemBuilder_ == null) {
        return codeSystem_.get(index);
      } else {
        return codeSystemBuilder_.getMessageOrBuilder(index);
      }
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public java.util.List<? extends com.google.fhir.proto.CodeSystemConfigOrBuilder>
        getCodeSystemOrBuilderList() {
      if (codeSystemBuilder_ != null) {
        return codeSystemBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(codeSystem_);
      }
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public com.google.fhir.proto.CodeSystemConfig.Builder addCodeSystemBuilder() {
      return getCodeSystemFieldBuilder()
          .addBuilder(com.google.fhir.proto.CodeSystemConfig.getDefaultInstance());
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public com.google.fhir.proto.CodeSystemConfig.Builder addCodeSystemBuilder(int index) {
      return getCodeSystemFieldBuilder()
          .addBuilder(index, com.google.fhir.proto.CodeSystemConfig.getDefaultInstance());
    }
    /** <code>repeated .google.fhir.proto.CodeSystemConfig code_system = 1;</code> */
    public java.util.List<com.google.fhir.proto.CodeSystemConfig.Builder>
        getCodeSystemBuilderList() {
      return getCodeSystemFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.fhir.proto.CodeSystemConfig,
            com.google.fhir.proto.CodeSystemConfig.Builder,
            com.google.fhir.proto.CodeSystemConfigOrBuilder>
        getCodeSystemFieldBuilder() {
      if (codeSystemBuilder_ == null) {
        codeSystemBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.fhir.proto.CodeSystemConfig,
                com.google.fhir.proto.CodeSystemConfig.Builder,
                com.google.fhir.proto.CodeSystemConfigOrBuilder>(
                codeSystem_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        codeSystem_ = null;
      }
      return codeSystemBuilder_;
    }

    private java.util.List<com.google.fhir.proto.ValueSetConfig> valueSet_ =
        java.util.Collections.emptyList();

    private void ensureValueSetIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        valueSet_ = new java.util.ArrayList<com.google.fhir.proto.ValueSetConfig>(valueSet_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.fhir.proto.ValueSetConfig,
            com.google.fhir.proto.ValueSetConfig.Builder,
            com.google.fhir.proto.ValueSetConfigOrBuilder>
        valueSetBuilder_;

    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public java.util.List<com.google.fhir.proto.ValueSetConfig> getValueSetList() {
      if (valueSetBuilder_ == null) {
        return java.util.Collections.unmodifiableList(valueSet_);
      } else {
        return valueSetBuilder_.getMessageList();
      }
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public int getValueSetCount() {
      if (valueSetBuilder_ == null) {
        return valueSet_.size();
      } else {
        return valueSetBuilder_.getCount();
      }
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public com.google.fhir.proto.ValueSetConfig getValueSet(int index) {
      if (valueSetBuilder_ == null) {
        return valueSet_.get(index);
      } else {
        return valueSetBuilder_.getMessage(index);
      }
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public Builder setValueSet(int index, com.google.fhir.proto.ValueSetConfig value) {
      if (valueSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValueSetIsMutable();
        valueSet_.set(index, value);
        onChanged();
      } else {
        valueSetBuilder_.setMessage(index, value);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public Builder setValueSet(
        int index, com.google.fhir.proto.ValueSetConfig.Builder builderForValue) {
      if (valueSetBuilder_ == null) {
        ensureValueSetIsMutable();
        valueSet_.set(index, builderForValue.build());
        onChanged();
      } else {
        valueSetBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public Builder addValueSet(com.google.fhir.proto.ValueSetConfig value) {
      if (valueSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValueSetIsMutable();
        valueSet_.add(value);
        onChanged();
      } else {
        valueSetBuilder_.addMessage(value);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public Builder addValueSet(int index, com.google.fhir.proto.ValueSetConfig value) {
      if (valueSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValueSetIsMutable();
        valueSet_.add(index, value);
        onChanged();
      } else {
        valueSetBuilder_.addMessage(index, value);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public Builder addValueSet(com.google.fhir.proto.ValueSetConfig.Builder builderForValue) {
      if (valueSetBuilder_ == null) {
        ensureValueSetIsMutable();
        valueSet_.add(builderForValue.build());
        onChanged();
      } else {
        valueSetBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public Builder addValueSet(
        int index, com.google.fhir.proto.ValueSetConfig.Builder builderForValue) {
      if (valueSetBuilder_ == null) {
        ensureValueSetIsMutable();
        valueSet_.add(index, builderForValue.build());
        onChanged();
      } else {
        valueSetBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public Builder addAllValueSet(
        java.lang.Iterable<? extends com.google.fhir.proto.ValueSetConfig> values) {
      if (valueSetBuilder_ == null) {
        ensureValueSetIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, valueSet_);
        onChanged();
      } else {
        valueSetBuilder_.addAllMessages(values);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public Builder clearValueSet() {
      if (valueSetBuilder_ == null) {
        valueSet_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        valueSetBuilder_.clear();
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public Builder removeValueSet(int index) {
      if (valueSetBuilder_ == null) {
        ensureValueSetIsMutable();
        valueSet_.remove(index);
        onChanged();
      } else {
        valueSetBuilder_.remove(index);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public com.google.fhir.proto.ValueSetConfig.Builder getValueSetBuilder(int index) {
      return getValueSetFieldBuilder().getBuilder(index);
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public com.google.fhir.proto.ValueSetConfigOrBuilder getValueSetOrBuilder(int index) {
      if (valueSetBuilder_ == null) {
        return valueSet_.get(index);
      } else {
        return valueSetBuilder_.getMessageOrBuilder(index);
      }
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public java.util.List<? extends com.google.fhir.proto.ValueSetConfigOrBuilder>
        getValueSetOrBuilderList() {
      if (valueSetBuilder_ != null) {
        return valueSetBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(valueSet_);
      }
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public com.google.fhir.proto.ValueSetConfig.Builder addValueSetBuilder() {
      return getValueSetFieldBuilder()
          .addBuilder(com.google.fhir.proto.ValueSetConfig.getDefaultInstance());
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public com.google.fhir.proto.ValueSetConfig.Builder addValueSetBuilder(int index) {
      return getValueSetFieldBuilder()
          .addBuilder(index, com.google.fhir.proto.ValueSetConfig.getDefaultInstance());
    }
    /** <code>repeated .google.fhir.proto.ValueSetConfig value_set = 2;</code> */
    public java.util.List<com.google.fhir.proto.ValueSetConfig.Builder> getValueSetBuilderList() {
      return getValueSetFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.fhir.proto.ValueSetConfig,
            com.google.fhir.proto.ValueSetConfig.Builder,
            com.google.fhir.proto.ValueSetConfigOrBuilder>
        getValueSetFieldBuilder() {
      if (valueSetBuilder_ == null) {
        valueSetBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.fhir.proto.ValueSetConfig,
                com.google.fhir.proto.ValueSetConfig.Builder,
                com.google.fhir.proto.ValueSetConfigOrBuilder>(
                valueSet_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        valueSet_ = null;
      }
      return valueSetBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.fhir.proto.Terminologies)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.proto.Terminologies)
  private static final com.google.fhir.proto.Terminologies DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.proto.Terminologies();
  }

  public static com.google.fhir.proto.Terminologies getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Terminologies> PARSER =
      new com.google.protobuf.AbstractParser<Terminologies>() {
        @java.lang.Override
        public Terminologies parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Terminologies(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Terminologies> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Terminologies> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.proto.Terminologies getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}