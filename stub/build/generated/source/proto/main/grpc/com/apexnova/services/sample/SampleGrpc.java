package com.apexnova.services.sample;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The sample definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: com/apexnova/services/sample/sample.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SampleGrpc {

  private SampleGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sample.Sample";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.apexnova.services.sample.SampleRequest,
      com.apexnova.services.sample.SampleReply> getSendSampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendSample",
      requestType = com.apexnova.services.sample.SampleRequest.class,
      responseType = com.apexnova.services.sample.SampleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.apexnova.services.sample.SampleRequest,
      com.apexnova.services.sample.SampleReply> getSendSampleMethod() {
    io.grpc.MethodDescriptor<com.apexnova.services.sample.SampleRequest, com.apexnova.services.sample.SampleReply> getSendSampleMethod;
    if ((getSendSampleMethod = SampleGrpc.getSendSampleMethod) == null) {
      synchronized (SampleGrpc.class) {
        if ((getSendSampleMethod = SampleGrpc.getSendSampleMethod) == null) {
          SampleGrpc.getSendSampleMethod = getSendSampleMethod =
              io.grpc.MethodDescriptor.<com.apexnova.services.sample.SampleRequest, com.apexnova.services.sample.SampleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendSample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.apexnova.services.sample.SampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.apexnova.services.sample.SampleReply.getDefaultInstance()))
              .setSchemaDescriptor(new SampleMethodDescriptorSupplier("SendSample"))
              .build();
        }
      }
    }
    return getSendSampleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SampleStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleStub>() {
        @java.lang.Override
        public SampleStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleStub(channel, callOptions);
        }
      };
    return SampleStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SampleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleBlockingStub>() {
        @java.lang.Override
        public SampleBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleBlockingStub(channel, callOptions);
        }
      };
    return SampleBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SampleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleFutureStub>() {
        @java.lang.Override
        public SampleFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleFutureStub(channel, callOptions);
        }
      };
    return SampleFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The sample definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sends a sample request
     * </pre>
     */
    default void sendSample(com.apexnova.services.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<com.apexnova.services.sample.SampleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendSampleMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Sample.
   * <pre>
   * The sample definition.
   * </pre>
   */
  public static abstract class SampleImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SampleGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Sample.
   * <pre>
   * The sample definition.
   * </pre>
   */
  public static final class SampleStub
      extends io.grpc.stub.AbstractAsyncStub<SampleStub> {
    private SampleStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a sample request
     * </pre>
     */
    public void sendSample(com.apexnova.services.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<com.apexnova.services.sample.SampleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendSampleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Sample.
   * <pre>
   * The sample definition.
   * </pre>
   */
  public static final class SampleBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SampleBlockingStub> {
    private SampleBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a sample request
     * </pre>
     */
    public com.apexnova.services.sample.SampleReply sendSample(com.apexnova.services.sample.SampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendSampleMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Sample.
   * <pre>
   * The sample definition.
   * </pre>
   */
  public static final class SampleFutureStub
      extends io.grpc.stub.AbstractFutureStub<SampleFutureStub> {
    private SampleFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a sample request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.apexnova.services.sample.SampleReply> sendSample(
        com.apexnova.services.sample.SampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendSampleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_SAMPLE = 0;

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
        case METHODID_SEND_SAMPLE:
          serviceImpl.sendSample((com.apexnova.services.sample.SampleRequest) request,
              (io.grpc.stub.StreamObserver<com.apexnova.services.sample.SampleReply>) responseObserver);
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
          getSendSampleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.apexnova.services.sample.SampleRequest,
              com.apexnova.services.sample.SampleReply>(
                service, METHODID_SEND_SAMPLE)))
        .build();
  }

  private static abstract class SampleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SampleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.apexnova.services.sample.SampleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sample");
    }
  }

  private static final class SampleFileDescriptorSupplier
      extends SampleBaseDescriptorSupplier {
    SampleFileDescriptorSupplier() {}
  }

  private static final class SampleMethodDescriptorSupplier
      extends SampleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SampleMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SampleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SampleFileDescriptorSupplier())
              .addMethod(getSendSampleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
