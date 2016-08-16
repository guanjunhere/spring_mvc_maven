// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/UserVo.proto

package com.spring.mvc.entity.proto;

public final class UserVoProto {
  private UserVoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface UserVoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.spring.mvc.entity.proto.UserVo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional int32 age = 2;</code>
     */
    boolean hasAge();
    /**
     * <code>optional int32 age = 2;</code>
     */
    int getAge();

    /**
     * <code>optional int64 phone = 3;</code>
     */
    boolean hasPhone();
    /**
     * <code>optional int64 phone = 3;</code>
     */
    long getPhone();

    /**
     * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
     */
    java.util.List<com.spring.mvc.entity.proto.UserVoProto.UserVo> 
        getFriendsList();
    /**
     * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
     */
    com.spring.mvc.entity.proto.UserVoProto.UserVo getFriends(int index);
    /**
     * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
     */
    int getFriendsCount();
    /**
     * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
     */
    java.util.List<? extends com.spring.mvc.entity.proto.UserVoProto.UserVoOrBuilder> 
        getFriendsOrBuilderList();
    /**
     * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
     */
    com.spring.mvc.entity.proto.UserVoProto.UserVoOrBuilder getFriendsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code com.spring.mvc.entity.proto.UserVo}
   */
  public static final class UserVo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.spring.mvc.entity.proto.UserVo)
      UserVoOrBuilder {
    // Use UserVo.newBuilder() to construct.
    private UserVo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private UserVo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final UserVo defaultInstance;
    public static UserVo getDefaultInstance() {
      return defaultInstance;
    }

    public UserVo getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private UserVo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              name_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              age_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              phone_ = input.readInt64();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                friends_ = new java.util.ArrayList<com.spring.mvc.entity.proto.UserVoProto.UserVo>();
                mutable_bitField0_ |= 0x00000008;
              }
              friends_.add(input.readMessage(com.spring.mvc.entity.proto.UserVoProto.UserVo.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          friends_ = java.util.Collections.unmodifiableList(friends_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.spring.mvc.entity.proto.UserVoProto.internal_static_com_spring_mvc_entity_proto_UserVo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.spring.mvc.entity.proto.UserVoProto.internal_static_com_spring_mvc_entity_proto_UserVo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.spring.mvc.entity.proto.UserVoProto.UserVo.class, com.spring.mvc.entity.proto.UserVoProto.UserVo.Builder.class);
    }

    public static com.google.protobuf.Parser<UserVo> PARSER =
        new com.google.protobuf.AbstractParser<UserVo>() {
      public UserVo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserVo(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<UserVo> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    /**
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 2;
    private int age_;
    /**
     * <code>optional int32 age = 2;</code>
     */
    public boolean hasAge() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 age = 2;</code>
     */
    public int getAge() {
      return age_;
    }

    public static final int PHONE_FIELD_NUMBER = 3;
    private long phone_;
    /**
     * <code>optional int64 phone = 3;</code>
     */
    public boolean hasPhone() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 phone = 3;</code>
     */
    public long getPhone() {
      return phone_;
    }

    public static final int FRIENDS_FIELD_NUMBER = 4;
    private java.util.List<com.spring.mvc.entity.proto.UserVoProto.UserVo> friends_;
    /**
     * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
     */
    public java.util.List<com.spring.mvc.entity.proto.UserVoProto.UserVo> getFriendsList() {
      return friends_;
    }
    /**
     * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
     */
    public java.util.List<? extends com.spring.mvc.entity.proto.UserVoProto.UserVoOrBuilder> 
        getFriendsOrBuilderList() {
      return friends_;
    }
    /**
     * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
     */
    public int getFriendsCount() {
      return friends_.size();
    }
    /**
     * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
     */
    public com.spring.mvc.entity.proto.UserVoProto.UserVo getFriends(int index) {
      return friends_.get(index);
    }
    /**
     * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
     */
    public com.spring.mvc.entity.proto.UserVoProto.UserVoOrBuilder getFriendsOrBuilder(
        int index) {
      return friends_.get(index);
    }

    private void initFields() {
      name_ = "";
      age_ = 0;
      phone_ = 0L;
      friends_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, age_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, phone_);
      }
      for (int i = 0; i < friends_.size(); i++) {
        output.writeMessage(4, friends_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, age_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, phone_);
      }
      for (int i = 0; i < friends_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, friends_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.spring.mvc.entity.proto.UserVoProto.UserVo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spring.mvc.entity.proto.UserVoProto.UserVo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spring.mvc.entity.proto.UserVoProto.UserVo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spring.mvc.entity.proto.UserVoProto.UserVo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spring.mvc.entity.proto.UserVoProto.UserVo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.spring.mvc.entity.proto.UserVoProto.UserVo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.spring.mvc.entity.proto.UserVoProto.UserVo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.spring.mvc.entity.proto.UserVoProto.UserVo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.spring.mvc.entity.proto.UserVoProto.UserVo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.spring.mvc.entity.proto.UserVoProto.UserVo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.spring.mvc.entity.proto.UserVoProto.UserVo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.spring.mvc.entity.proto.UserVo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.spring.mvc.entity.proto.UserVo)
        com.spring.mvc.entity.proto.UserVoProto.UserVoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.spring.mvc.entity.proto.UserVoProto.internal_static_com_spring_mvc_entity_proto_UserVo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.spring.mvc.entity.proto.UserVoProto.internal_static_com_spring_mvc_entity_proto_UserVo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.spring.mvc.entity.proto.UserVoProto.UserVo.class, com.spring.mvc.entity.proto.UserVoProto.UserVo.Builder.class);
      }

      // Construct using com.spring.mvc.entity.proto.UserVoProto.UserVo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getFriendsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        age_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        phone_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (friendsBuilder_ == null) {
          friends_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          friendsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.spring.mvc.entity.proto.UserVoProto.internal_static_com_spring_mvc_entity_proto_UserVo_descriptor;
      }

      public com.spring.mvc.entity.proto.UserVoProto.UserVo getDefaultInstanceForType() {
        return com.spring.mvc.entity.proto.UserVoProto.UserVo.getDefaultInstance();
      }

      public com.spring.mvc.entity.proto.UserVoProto.UserVo build() {
        com.spring.mvc.entity.proto.UserVoProto.UserVo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.spring.mvc.entity.proto.UserVoProto.UserVo buildPartial() {
        com.spring.mvc.entity.proto.UserVoProto.UserVo result = new com.spring.mvc.entity.proto.UserVoProto.UserVo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.age_ = age_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.phone_ = phone_;
        if (friendsBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            friends_ = java.util.Collections.unmodifiableList(friends_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.friends_ = friends_;
        } else {
          result.friends_ = friendsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.spring.mvc.entity.proto.UserVoProto.UserVo) {
          return mergeFrom((com.spring.mvc.entity.proto.UserVoProto.UserVo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.spring.mvc.entity.proto.UserVoProto.UserVo other) {
        if (other == com.spring.mvc.entity.proto.UserVoProto.UserVo.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasAge()) {
          setAge(other.getAge());
        }
        if (other.hasPhone()) {
          setPhone(other.getPhone());
        }
        if (friendsBuilder_ == null) {
          if (!other.friends_.isEmpty()) {
            if (friends_.isEmpty()) {
              friends_ = other.friends_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureFriendsIsMutable();
              friends_.addAll(other.friends_);
            }
            onChanged();
          }
        } else {
          if (!other.friends_.isEmpty()) {
            if (friendsBuilder_.isEmpty()) {
              friendsBuilder_.dispose();
              friendsBuilder_ = null;
              friends_ = other.friends_;
              bitField0_ = (bitField0_ & ~0x00000008);
              friendsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getFriendsFieldBuilder() : null;
            } else {
              friendsBuilder_.addAllMessages(other.friends_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.spring.mvc.entity.proto.UserVoProto.UserVo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.spring.mvc.entity.proto.UserVoProto.UserVo) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>optional int32 age = 2;</code>
       */
      public boolean hasAge() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 age = 2;</code>
       */
      public int getAge() {
        return age_;
      }
      /**
       * <code>optional int32 age = 2;</code>
       */
      public Builder setAge(int value) {
        bitField0_ |= 0x00000002;
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 age = 2;</code>
       */
      public Builder clearAge() {
        bitField0_ = (bitField0_ & ~0x00000002);
        age_ = 0;
        onChanged();
        return this;
      }

      private long phone_ ;
      /**
       * <code>optional int64 phone = 3;</code>
       */
      public boolean hasPhone() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int64 phone = 3;</code>
       */
      public long getPhone() {
        return phone_;
      }
      /**
       * <code>optional int64 phone = 3;</code>
       */
      public Builder setPhone(long value) {
        bitField0_ |= 0x00000004;
        phone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 phone = 3;</code>
       */
      public Builder clearPhone() {
        bitField0_ = (bitField0_ & ~0x00000004);
        phone_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<com.spring.mvc.entity.proto.UserVoProto.UserVo> friends_ =
        java.util.Collections.emptyList();
      private void ensureFriendsIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          friends_ = new java.util.ArrayList<com.spring.mvc.entity.proto.UserVoProto.UserVo>(friends_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.spring.mvc.entity.proto.UserVoProto.UserVo, com.spring.mvc.entity.proto.UserVoProto.UserVo.Builder, com.spring.mvc.entity.proto.UserVoProto.UserVoOrBuilder> friendsBuilder_;

      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public java.util.List<com.spring.mvc.entity.proto.UserVoProto.UserVo> getFriendsList() {
        if (friendsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(friends_);
        } else {
          return friendsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public int getFriendsCount() {
        if (friendsBuilder_ == null) {
          return friends_.size();
        } else {
          return friendsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public com.spring.mvc.entity.proto.UserVoProto.UserVo getFriends(int index) {
        if (friendsBuilder_ == null) {
          return friends_.get(index);
        } else {
          return friendsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public Builder setFriends(
          int index, com.spring.mvc.entity.proto.UserVoProto.UserVo value) {
        if (friendsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFriendsIsMutable();
          friends_.set(index, value);
          onChanged();
        } else {
          friendsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public Builder setFriends(
          int index, com.spring.mvc.entity.proto.UserVoProto.UserVo.Builder builderForValue) {
        if (friendsBuilder_ == null) {
          ensureFriendsIsMutable();
          friends_.set(index, builderForValue.build());
          onChanged();
        } else {
          friendsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public Builder addFriends(com.spring.mvc.entity.proto.UserVoProto.UserVo value) {
        if (friendsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFriendsIsMutable();
          friends_.add(value);
          onChanged();
        } else {
          friendsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public Builder addFriends(
          int index, com.spring.mvc.entity.proto.UserVoProto.UserVo value) {
        if (friendsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFriendsIsMutable();
          friends_.add(index, value);
          onChanged();
        } else {
          friendsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public Builder addFriends(
          com.spring.mvc.entity.proto.UserVoProto.UserVo.Builder builderForValue) {
        if (friendsBuilder_ == null) {
          ensureFriendsIsMutable();
          friends_.add(builderForValue.build());
          onChanged();
        } else {
          friendsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public Builder addFriends(
          int index, com.spring.mvc.entity.proto.UserVoProto.UserVo.Builder builderForValue) {
        if (friendsBuilder_ == null) {
          ensureFriendsIsMutable();
          friends_.add(index, builderForValue.build());
          onChanged();
        } else {
          friendsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public Builder addAllFriends(
          java.lang.Iterable<? extends com.spring.mvc.entity.proto.UserVoProto.UserVo> values) {
        if (friendsBuilder_ == null) {
          ensureFriendsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, friends_);
          onChanged();
        } else {
          friendsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public Builder clearFriends() {
        if (friendsBuilder_ == null) {
          friends_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          friendsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public Builder removeFriends(int index) {
        if (friendsBuilder_ == null) {
          ensureFriendsIsMutable();
          friends_.remove(index);
          onChanged();
        } else {
          friendsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public com.spring.mvc.entity.proto.UserVoProto.UserVo.Builder getFriendsBuilder(
          int index) {
        return getFriendsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public com.spring.mvc.entity.proto.UserVoProto.UserVoOrBuilder getFriendsOrBuilder(
          int index) {
        if (friendsBuilder_ == null) {
          return friends_.get(index);  } else {
          return friendsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public java.util.List<? extends com.spring.mvc.entity.proto.UserVoProto.UserVoOrBuilder> 
           getFriendsOrBuilderList() {
        if (friendsBuilder_ != null) {
          return friendsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(friends_);
        }
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public com.spring.mvc.entity.proto.UserVoProto.UserVo.Builder addFriendsBuilder() {
        return getFriendsFieldBuilder().addBuilder(
            com.spring.mvc.entity.proto.UserVoProto.UserVo.getDefaultInstance());
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public com.spring.mvc.entity.proto.UserVoProto.UserVo.Builder addFriendsBuilder(
          int index) {
        return getFriendsFieldBuilder().addBuilder(
            index, com.spring.mvc.entity.proto.UserVoProto.UserVo.getDefaultInstance());
      }
      /**
       * <code>repeated .com.spring.mvc.entity.proto.UserVo friends = 4;</code>
       */
      public java.util.List<com.spring.mvc.entity.proto.UserVoProto.UserVo.Builder> 
           getFriendsBuilderList() {
        return getFriendsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.spring.mvc.entity.proto.UserVoProto.UserVo, com.spring.mvc.entity.proto.UserVoProto.UserVo.Builder, com.spring.mvc.entity.proto.UserVoProto.UserVoOrBuilder> 
          getFriendsFieldBuilder() {
        if (friendsBuilder_ == null) {
          friendsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.spring.mvc.entity.proto.UserVoProto.UserVo, com.spring.mvc.entity.proto.UserVoProto.UserVo.Builder, com.spring.mvc.entity.proto.UserVoProto.UserVoOrBuilder>(
                  friends_,
                  ((bitField0_ & 0x00000008) == 0x00000008),
                  getParentForChildren(),
                  isClean());
          friends_ = null;
        }
        return friendsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:com.spring.mvc.entity.proto.UserVo)
    }

    static {
      defaultInstance = new UserVo(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.spring.mvc.entity.proto.UserVo)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_spring_mvc_entity_proto_UserVo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_spring_mvc_entity_proto_UserVo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021PATH/UserVo.proto\022\033com.spring.mvc.enti" +
      "ty.proto\"h\n\006UserVo\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030" +
      "\002 \001(\005\022\r\n\005phone\030\003 \001(\003\0224\n\007friends\030\004 \003(\0132#." +
      "com.spring.mvc.entity.proto.UserVoB*\n\033co" +
      "m.spring.mvc.entity.protoB\013UserVoProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_spring_mvc_entity_proto_UserVo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_spring_mvc_entity_proto_UserVo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_spring_mvc_entity_proto_UserVo_descriptor,
        new java.lang.String[] { "Name", "Age", "Phone", "Friends", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}