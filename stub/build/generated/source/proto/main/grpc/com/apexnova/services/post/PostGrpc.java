package com.apexnova.services.post;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The post service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: com/apexnova/services/post/post.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PostGrpc {

  private PostGrpc() {}

  public static final java.lang.String SERVICE_NAME = "post.Post";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.apexnova.services.post.PostRequest,
      com.apexnova.services.post.PostReply> getCreatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePost",
      requestType = com.apexnova.services.post.PostRequest.class,
      responseType = com.apexnova.services.post.PostReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.apexnova.services.post.PostRequest,
      com.apexnova.services.post.PostReply> getCreatePostMethod() {
    io.grpc.MethodDescriptor<com.apexnova.services.post.PostRequest, com.apexnova.services.post.PostReply> getCreatePostMethod;
    if ((getCreatePostMethod = PostGrpc.getCreatePostMethod) == null) {
      synchronized (PostGrpc.class) {
        if ((getCreatePostMethod = PostGrpc.getCreatePostMethod) == null) {
          PostGrpc.getCreatePostMethod = getCreatePostMethod =
              io.grpc.MethodDescriptor.<com.apexnova.services.post.PostRequest, com.apexnova.services.post.PostReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.apexnova.services.post.PostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.apexnova.services.post.PostReply.getDefaultInstance()))
              .setSchemaDescriptor(new PostMethodDescriptorSupplier("CreatePost"))
              .build();
        }
      }
    }
    return getCreatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.apexnova.services.post.GetPostRequest,
      com.apexnova.services.post.PostReply> getGetPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPost",
      requestType = com.apexnova.services.post.GetPostRequest.class,
      responseType = com.apexnova.services.post.PostReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.apexnova.services.post.GetPostRequest,
      com.apexnova.services.post.PostReply> getGetPostMethod() {
    io.grpc.MethodDescriptor<com.apexnova.services.post.GetPostRequest, com.apexnova.services.post.PostReply> getGetPostMethod;
    if ((getGetPostMethod = PostGrpc.getGetPostMethod) == null) {
      synchronized (PostGrpc.class) {
        if ((getGetPostMethod = PostGrpc.getGetPostMethod) == null) {
          PostGrpc.getGetPostMethod = getGetPostMethod =
              io.grpc.MethodDescriptor.<com.apexnova.services.post.GetPostRequest, com.apexnova.services.post.PostReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.apexnova.services.post.GetPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.apexnova.services.post.PostReply.getDefaultInstance()))
              .setSchemaDescriptor(new PostMethodDescriptorSupplier("GetPost"))
              .build();
        }
      }
    }
    return getGetPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.apexnova.services.post.ListPostsRequest,
      com.apexnova.services.post.PostReply> getListPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPosts",
      requestType = com.apexnova.services.post.ListPostsRequest.class,
      responseType = com.apexnova.services.post.PostReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.apexnova.services.post.ListPostsRequest,
      com.apexnova.services.post.PostReply> getListPostsMethod() {
    io.grpc.MethodDescriptor<com.apexnova.services.post.ListPostsRequest, com.apexnova.services.post.PostReply> getListPostsMethod;
    if ((getListPostsMethod = PostGrpc.getListPostsMethod) == null) {
      synchronized (PostGrpc.class) {
        if ((getListPostsMethod = PostGrpc.getListPostsMethod) == null) {
          PostGrpc.getListPostsMethod = getListPostsMethod =
              io.grpc.MethodDescriptor.<com.apexnova.services.post.ListPostsRequest, com.apexnova.services.post.PostReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.apexnova.services.post.ListPostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.apexnova.services.post.PostReply.getDefaultInstance()))
              .setSchemaDescriptor(new PostMethodDescriptorSupplier("ListPosts"))
              .build();
        }
      }
    }
    return getListPostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.apexnova.services.post.DeletePostRequest,
      com.apexnova.services.post.DeletePostReply> getDeletePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePost",
      requestType = com.apexnova.services.post.DeletePostRequest.class,
      responseType = com.apexnova.services.post.DeletePostReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.apexnova.services.post.DeletePostRequest,
      com.apexnova.services.post.DeletePostReply> getDeletePostMethod() {
    io.grpc.MethodDescriptor<com.apexnova.services.post.DeletePostRequest, com.apexnova.services.post.DeletePostReply> getDeletePostMethod;
    if ((getDeletePostMethod = PostGrpc.getDeletePostMethod) == null) {
      synchronized (PostGrpc.class) {
        if ((getDeletePostMethod = PostGrpc.getDeletePostMethod) == null) {
          PostGrpc.getDeletePostMethod = getDeletePostMethod =
              io.grpc.MethodDescriptor.<com.apexnova.services.post.DeletePostRequest, com.apexnova.services.post.DeletePostReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.apexnova.services.post.DeletePostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.apexnova.services.post.DeletePostReply.getDefaultInstance()))
              .setSchemaDescriptor(new PostMethodDescriptorSupplier("DeletePost"))
              .build();
        }
      }
    }
    return getDeletePostMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PostStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostStub>() {
        @java.lang.Override
        public PostStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostStub(channel, callOptions);
        }
      };
    return PostStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PostBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostBlockingStub>() {
        @java.lang.Override
        public PostBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostBlockingStub(channel, callOptions);
        }
      };
    return PostBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PostFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostFutureStub>() {
        @java.lang.Override
        public PostFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostFutureStub(channel, callOptions);
        }
      };
    return PostFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The post service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sends a post
     * </pre>
     */
    default void createPost(com.apexnova.services.post.PostRequest request,
        io.grpc.stub.StreamObserver<com.apexnova.services.post.PostReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePostMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a post
     * </pre>
     */
    default void getPost(com.apexnova.services.post.GetPostRequest request,
        io.grpc.stub.StreamObserver<com.apexnova.services.post.PostReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all posts
     * </pre>
     */
    default void listPosts(com.apexnova.services.post.ListPostsRequest request,
        io.grpc.stub.StreamObserver<com.apexnova.services.post.PostReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPostsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a post
     * </pre>
     */
    default void deletePost(com.apexnova.services.post.DeletePostRequest request,
        io.grpc.stub.StreamObserver<com.apexnova.services.post.DeletePostReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePostMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Post.
   * <pre>
   * The post service definition.
   * </pre>
   */
  public static abstract class PostImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PostGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Post.
   * <pre>
   * The post service definition.
   * </pre>
   */
  public static final class PostStub
      extends io.grpc.stub.AbstractAsyncStub<PostStub> {
    private PostStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a post
     * </pre>
     */
    public void createPost(com.apexnova.services.post.PostRequest request,
        io.grpc.stub.StreamObserver<com.apexnova.services.post.PostReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a post
     * </pre>
     */
    public void getPost(com.apexnova.services.post.GetPostRequest request,
        io.grpc.stub.StreamObserver<com.apexnova.services.post.PostReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all posts
     * </pre>
     */
    public void listPosts(com.apexnova.services.post.ListPostsRequest request,
        io.grpc.stub.StreamObserver<com.apexnova.services.post.PostReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListPostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a post
     * </pre>
     */
    public void deletePost(com.apexnova.services.post.DeletePostRequest request,
        io.grpc.stub.StreamObserver<com.apexnova.services.post.DeletePostReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Post.
   * <pre>
   * The post service definition.
   * </pre>
   */
  public static final class PostBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PostBlockingStub> {
    private PostBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a post
     * </pre>
     */
    public com.apexnova.services.post.PostReply createPost(com.apexnova.services.post.PostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePostMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a post
     * </pre>
     */
    public com.apexnova.services.post.PostReply getPost(com.apexnova.services.post.GetPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all posts
     * </pre>
     */
    public java.util.Iterator<com.apexnova.services.post.PostReply> listPosts(
        com.apexnova.services.post.ListPostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListPostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a post
     * </pre>
     */
    public com.apexnova.services.post.DeletePostReply deletePost(com.apexnova.services.post.DeletePostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePostMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Post.
   * <pre>
   * The post service definition.
   * </pre>
   */
  public static final class PostFutureStub
      extends io.grpc.stub.AbstractFutureStub<PostFutureStub> {
    private PostFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.apexnova.services.post.PostReply> createPost(
        com.apexnova.services.post.PostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.apexnova.services.post.PostReply> getPost(
        com.apexnova.services.post.GetPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.apexnova.services.post.DeletePostReply> deletePost(
        com.apexnova.services.post.DeletePostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POST = 0;
  private static final int METHODID_GET_POST = 1;
  private static final int METHODID_LIST_POSTS = 2;
  private static final int METHODID_DELETE_POST = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_POST:
          serviceImpl.createPost((com.apexnova.services.post.PostRequest) request,
              (io.grpc.stub.StreamObserver<com.apexnova.services.post.PostReply>) responseObserver);
          break;
        case METHODID_GET_POST:
          serviceImpl.getPost((com.apexnova.services.post.GetPostRequest) request,
              (io.grpc.stub.StreamObserver<com.apexnova.services.post.PostReply>) responseObserver);
          break;
        case METHODID_LIST_POSTS:
          serviceImpl.listPosts((com.apexnova.services.post.ListPostsRequest) request,
              (io.grpc.stub.StreamObserver<com.apexnova.services.post.PostReply>) responseObserver);
          break;
        case METHODID_DELETE_POST:
          serviceImpl.deletePost((com.apexnova.services.post.DeletePostRequest) request,
              (io.grpc.stub.StreamObserver<com.apexnova.services.post.DeletePostReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreatePostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.apexnova.services.post.PostRequest,
              com.apexnova.services.post.PostReply>(
                service, METHODID_CREATE_POST)))
        .addMethod(
          getGetPostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.apexnova.services.post.GetPostRequest,
              com.apexnova.services.post.PostReply>(
                service, METHODID_GET_POST)))
        .addMethod(
          getListPostsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.apexnova.services.post.ListPostsRequest,
              com.apexnova.services.post.PostReply>(
                service, METHODID_LIST_POSTS)))
        .addMethod(
          getDeletePostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.apexnova.services.post.DeletePostRequest,
              com.apexnova.services.post.DeletePostReply>(
                service, METHODID_DELETE_POST)))
        .build();
  }

  private static abstract class PostBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PostBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.apexnova.services.post.PostProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Post");
    }
  }

  private static final class PostFileDescriptorSupplier
      extends PostBaseDescriptorSupplier {
    PostFileDescriptorSupplier() {}
  }

  private static final class PostMethodDescriptorSupplier
      extends PostBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PostMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PostGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PostFileDescriptorSupplier())
              .addMethod(getCreatePostMethod())
              .addMethod(getGetPostMethod())
              .addMethod(getListPostsMethod())
              .addMethod(getDeletePostMethod())
              .build();
        }
      }
    }
    return result;
  }
}
