// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/profile_config.proto

package com.google.fhir.proto;

/**
 *
 *
 * <pre>
 * Config for definition of Profiles that are part of an Implementation
 * Guide to be generated
 * </pre>
 *
 * Protobuf type {@code google.fhir.proto.Profiles}
 */
public final class Profiles extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.fhir.proto.Profiles)
    ProfilesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Profiles.newBuilder() to construct.
  private Profiles(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Profiles() {
    profile_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Profiles();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Profiles(
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
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                profile_ = new java.util.ArrayList<com.google.fhir.proto.Profile>();
                mutable_bitField0_ |= 0x00000001;
              }
              profile_.add(
                  input.readMessage(com.google.fhir.proto.Profile.parser(), extensionRegistry));
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
        profile_ = java.util.Collections.unmodifiableList(profile_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.fhir.proto.ProfileConfig
        .internal_static_google_fhir_proto_Profiles_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.proto.ProfileConfig
        .internal_static_google_fhir_proto_Profiles_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.proto.Profiles.class, com.google.fhir.proto.Profiles.Builder.class);
  }

  public static final int PROFILE_FIELD_NUMBER = 2;
  private java.util.List<com.google.fhir.proto.Profile> profile_;
  /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
  public java.util.List<com.google.fhir.proto.Profile> getProfileList() {
    return profile_;
  }
  /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
  public java.util.List<? extends com.google.fhir.proto.ProfileOrBuilder>
      getProfileOrBuilderList() {
    return profile_;
  }
  /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
  public int getProfileCount() {
    return profile_.size();
  }
  /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
  public com.google.fhir.proto.Profile getProfile(int index) {
    return profile_.get(index);
  }
  /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
  public com.google.fhir.proto.ProfileOrBuilder getProfileOrBuilder(int index) {
    return profile_.get(index);
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
    for (int i = 0; i < profile_.size(); i++) {
      output.writeMessage(2, profile_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < profile_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, profile_.get(i));
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
    if (!(obj instanceof com.google.fhir.proto.Profiles)) {
      return super.equals(obj);
    }
    com.google.fhir.proto.Profiles other = (com.google.fhir.proto.Profiles) obj;

    if (!getProfileList().equals(other.getProfileList())) return false;
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
    if (getProfileCount() > 0) {
      hash = (37 * hash) + PROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getProfileList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.proto.Profiles parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.Profiles parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.Profiles parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.Profiles parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.Profiles parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.fhir.proto.Profiles parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.fhir.proto.Profiles parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.Profiles parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.proto.Profiles parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.Profiles parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.fhir.proto.Profiles parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.fhir.proto.Profiles parseFrom(
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

  public static Builder newBuilder(com.google.fhir.proto.Profiles prototype) {
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
   * Config for definition of Profiles that are part of an Implementation
   * Guide to be generated
   * </pre>
   *
   * Protobuf type {@code google.fhir.proto.Profiles}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.fhir.proto.Profiles)
      com.google.fhir.proto.ProfilesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_Profiles_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_Profiles_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.proto.Profiles.class, com.google.fhir.proto.Profiles.Builder.class);
    }

    // Construct using com.google.fhir.proto.Profiles.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getProfileFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (profileBuilder_ == null) {
        profile_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        profileBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.fhir.proto.ProfileConfig
          .internal_static_google_fhir_proto_Profiles_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.proto.Profiles getDefaultInstanceForType() {
      return com.google.fhir.proto.Profiles.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.proto.Profiles build() {
      com.google.fhir.proto.Profiles result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.proto.Profiles buildPartial() {
      com.google.fhir.proto.Profiles result = new com.google.fhir.proto.Profiles(this);
      int from_bitField0_ = bitField0_;
      if (profileBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          profile_ = java.util.Collections.unmodifiableList(profile_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.profile_ = profile_;
      } else {
        result.profile_ = profileBuilder_.build();
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
      if (other instanceof com.google.fhir.proto.Profiles) {
        return mergeFrom((com.google.fhir.proto.Profiles) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.proto.Profiles other) {
      if (other == com.google.fhir.proto.Profiles.getDefaultInstance()) return this;
      if (profileBuilder_ == null) {
        if (!other.profile_.isEmpty()) {
          if (profile_.isEmpty()) {
            profile_ = other.profile_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProfileIsMutable();
            profile_.addAll(other.profile_);
          }
          onChanged();
        }
      } else {
        if (!other.profile_.isEmpty()) {
          if (profileBuilder_.isEmpty()) {
            profileBuilder_.dispose();
            profileBuilder_ = null;
            profile_ = other.profile_;
            bitField0_ = (bitField0_ & ~0x00000001);
            profileBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getProfileFieldBuilder()
                    : null;
          } else {
            profileBuilder_.addAllMessages(other.profile_);
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
      com.google.fhir.proto.Profiles parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.proto.Profiles) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.fhir.proto.Profile> profile_ =
        java.util.Collections.emptyList();

    private void ensureProfileIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        profile_ = new java.util.ArrayList<com.google.fhir.proto.Profile>(profile_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.fhir.proto.Profile,
            com.google.fhir.proto.Profile.Builder,
            com.google.fhir.proto.ProfileOrBuilder>
        profileBuilder_;

    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public java.util.List<com.google.fhir.proto.Profile> getProfileList() {
      if (profileBuilder_ == null) {
        return java.util.Collections.unmodifiableList(profile_);
      } else {
        return profileBuilder_.getMessageList();
      }
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public int getProfileCount() {
      if (profileBuilder_ == null) {
        return profile_.size();
      } else {
        return profileBuilder_.getCount();
      }
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public com.google.fhir.proto.Profile getProfile(int index) {
      if (profileBuilder_ == null) {
        return profile_.get(index);
      } else {
        return profileBuilder_.getMessage(index);
      }
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public Builder setProfile(int index, com.google.fhir.proto.Profile value) {
      if (profileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProfileIsMutable();
        profile_.set(index, value);
        onChanged();
      } else {
        profileBuilder_.setMessage(index, value);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public Builder setProfile(int index, com.google.fhir.proto.Profile.Builder builderForValue) {
      if (profileBuilder_ == null) {
        ensureProfileIsMutable();
        profile_.set(index, builderForValue.build());
        onChanged();
      } else {
        profileBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public Builder addProfile(com.google.fhir.proto.Profile value) {
      if (profileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProfileIsMutable();
        profile_.add(value);
        onChanged();
      } else {
        profileBuilder_.addMessage(value);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public Builder addProfile(int index, com.google.fhir.proto.Profile value) {
      if (profileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProfileIsMutable();
        profile_.add(index, value);
        onChanged();
      } else {
        profileBuilder_.addMessage(index, value);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public Builder addProfile(com.google.fhir.proto.Profile.Builder builderForValue) {
      if (profileBuilder_ == null) {
        ensureProfileIsMutable();
        profile_.add(builderForValue.build());
        onChanged();
      } else {
        profileBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public Builder addProfile(int index, com.google.fhir.proto.Profile.Builder builderForValue) {
      if (profileBuilder_ == null) {
        ensureProfileIsMutable();
        profile_.add(index, builderForValue.build());
        onChanged();
      } else {
        profileBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public Builder addAllProfile(
        java.lang.Iterable<? extends com.google.fhir.proto.Profile> values) {
      if (profileBuilder_ == null) {
        ensureProfileIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, profile_);
        onChanged();
      } else {
        profileBuilder_.addAllMessages(values);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public Builder clearProfile() {
      if (profileBuilder_ == null) {
        profile_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        profileBuilder_.clear();
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public Builder removeProfile(int index) {
      if (profileBuilder_ == null) {
        ensureProfileIsMutable();
        profile_.remove(index);
        onChanged();
      } else {
        profileBuilder_.remove(index);
      }
      return this;
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public com.google.fhir.proto.Profile.Builder getProfileBuilder(int index) {
      return getProfileFieldBuilder().getBuilder(index);
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public com.google.fhir.proto.ProfileOrBuilder getProfileOrBuilder(int index) {
      if (profileBuilder_ == null) {
        return profile_.get(index);
      } else {
        return profileBuilder_.getMessageOrBuilder(index);
      }
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public java.util.List<? extends com.google.fhir.proto.ProfileOrBuilder>
        getProfileOrBuilderList() {
      if (profileBuilder_ != null) {
        return profileBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(profile_);
      }
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public com.google.fhir.proto.Profile.Builder addProfileBuilder() {
      return getProfileFieldBuilder()
          .addBuilder(com.google.fhir.proto.Profile.getDefaultInstance());
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public com.google.fhir.proto.Profile.Builder addProfileBuilder(int index) {
      return getProfileFieldBuilder()
          .addBuilder(index, com.google.fhir.proto.Profile.getDefaultInstance());
    }
    /** <code>repeated .google.fhir.proto.Profile profile = 2;</code> */
    public java.util.List<com.google.fhir.proto.Profile.Builder> getProfileBuilderList() {
      return getProfileFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.fhir.proto.Profile,
            com.google.fhir.proto.Profile.Builder,
            com.google.fhir.proto.ProfileOrBuilder>
        getProfileFieldBuilder() {
      if (profileBuilder_ == null) {
        profileBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.fhir.proto.Profile,
                com.google.fhir.proto.Profile.Builder,
                com.google.fhir.proto.ProfileOrBuilder>(
                profile_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        profile_ = null;
      }
      return profileBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.fhir.proto.Profiles)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.proto.Profiles)
  private static final com.google.fhir.proto.Profiles DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.fhir.proto.Profiles();
  }

  public static com.google.fhir.proto.Profiles getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Profiles> PARSER =
      new com.google.protobuf.AbstractParser<Profiles>() {
        @java.lang.Override
        public Profiles parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Profiles(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Profiles> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Profiles> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.proto.Profiles getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
