// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/apexnova/services/post/post.proto

// Protobuf Java Version: 3.25.1
package com.apexnova.services.post;

/**
 * <pre>
 * The request message for getting a post.
 * </pre>
 *
 * Protobuf type {@code post.GetPostRequest}
 */
public  final class GetPostRequest extends
    com.google.protobuf.GeneratedMessageLite<
        GetPostRequest, GetPostRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:post.GetPostRequest)
    GetPostRequestOrBuilder {
  private GetPostRequest() {
    postId_ = "";
  }
  public static final int POSTID_FIELD_NUMBER = 1;
  private java.lang.String postId_;
  /**
   * <code>string postId = 1;</code>
   * @return The postId.
   */
  @java.lang.Override
  public java.lang.String getPostId() {
    return postId_;
  }
  /**
   * <code>string postId = 1;</code>
   * @return The bytes for postId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPostIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(postId_);
  }
  /**
   * <code>string postId = 1;</code>
   * @param value The postId to set.
   */
  private void setPostId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    postId_ = value;
  }
  /**
   * <code>string postId = 1;</code>
   */
  private void clearPostId() {

    postId_ = getDefaultInstance().getPostId();
  }
  /**
   * <code>string postId = 1;</code>
   * @param value The bytes for postId to set.
   */
  private void setPostIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    postId_ = value.toStringUtf8();

  }

  public static com.apexnova.services.post.GetPostRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.apexnova.services.post.GetPostRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.apexnova.services.post.GetPostRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.apexnova.services.post.GetPostRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.apexnova.services.post.GetPostRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.apexnova.services.post.GetPostRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.apexnova.services.post.GetPostRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.apexnova.services.post.GetPostRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.apexnova.services.post.GetPostRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.apexnova.services.post.GetPostRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.apexnova.services.post.GetPostRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.apexnova.services.post.GetPostRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.apexnova.services.post.GetPostRequest prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The request message for getting a post.
   * </pre>
   *
   * Protobuf type {@code post.GetPostRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.apexnova.services.post.GetPostRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:post.GetPostRequest)
      com.apexnova.services.post.GetPostRequestOrBuilder {
    // Construct using com.apexnova.services.post.GetPostRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string postId = 1;</code>
     * @return The postId.
     */
    @java.lang.Override
    public java.lang.String getPostId() {
      return instance.getPostId();
    }
    /**
     * <code>string postId = 1;</code>
     * @return The bytes for postId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPostIdBytes() {
      return instance.getPostIdBytes();
    }
    /**
     * <code>string postId = 1;</code>
     * @param value The postId to set.
     * @return This builder for chaining.
     */
    public Builder setPostId(
        java.lang.String value) {
      copyOnWrite();
      instance.setPostId(value);
      return this;
    }
    /**
     * <code>string postId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPostId() {
      copyOnWrite();
      instance.clearPostId();
      return this;
    }
    /**
     * <code>string postId = 1;</code>
     * @param value The bytes for postId to set.
     * @return This builder for chaining.
     */
    public Builder setPostIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPostIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:post.GetPostRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.apexnova.services.post.GetPostRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "postId_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.apexnova.services.post.GetPostRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.apexnova.services.post.GetPostRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.apexnova.services.post.GetPostRequest>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:post.GetPostRequest)
  private static final com.apexnova.services.post.GetPostRequest DEFAULT_INSTANCE;
  static {
    GetPostRequest defaultInstance = new GetPostRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetPostRequest.class, defaultInstance);
  }

  public static com.apexnova.services.post.GetPostRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetPostRequest> PARSER;

  public static com.google.protobuf.Parser<GetPostRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

