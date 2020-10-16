package com.grpc.demo.common;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Author.proto")
public final class AuthorServicesGrpc {

  private AuthorServicesGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.demo.common.AuthorServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.demo.common.AuthorOuterClass.AuthorId,
      com.grpc.demo.common.AuthorOuterClass.Author> getAuthorByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "authorById",
      requestType = com.grpc.demo.common.AuthorOuterClass.AuthorId.class,
      responseType = com.grpc.demo.common.AuthorOuterClass.Author.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.demo.common.AuthorOuterClass.AuthorId,
      com.grpc.demo.common.AuthorOuterClass.Author> getAuthorByIdMethod() {
    io.grpc.MethodDescriptor<com.grpc.demo.common.AuthorOuterClass.AuthorId, com.grpc.demo.common.AuthorOuterClass.Author> getAuthorByIdMethod;
    if ((getAuthorByIdMethod = AuthorServicesGrpc.getAuthorByIdMethod) == null) {
      synchronized (AuthorServicesGrpc.class) {
        if ((getAuthorByIdMethod = AuthorServicesGrpc.getAuthorByIdMethod) == null) {
          AuthorServicesGrpc.getAuthorByIdMethod = getAuthorByIdMethod = 
              io.grpc.MethodDescriptor.<com.grpc.demo.common.AuthorOuterClass.AuthorId, com.grpc.demo.common.AuthorOuterClass.Author>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.demo.common.AuthorServices", "authorById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.common.AuthorOuterClass.AuthorId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.common.AuthorOuterClass.Author.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthorServicesMethodDescriptorSupplier("authorById"))
                  .build();
          }
        }
     }
     return getAuthorByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthorServicesStub newStub(io.grpc.Channel channel) {
    return new AuthorServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthorServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthorServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthorServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthorServicesFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthorServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void authorById(com.grpc.demo.common.AuthorOuterClass.AuthorId request,
        io.grpc.stub.StreamObserver<com.grpc.demo.common.AuthorOuterClass.Author> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthorByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthorByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.demo.common.AuthorOuterClass.AuthorId,
                com.grpc.demo.common.AuthorOuterClass.Author>(
                  this, METHODID_AUTHOR_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class AuthorServicesStub extends io.grpc.stub.AbstractStub<AuthorServicesStub> {
    private AuthorServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorServicesStub(channel, callOptions);
    }

    /**
     */
    public void authorById(com.grpc.demo.common.AuthorOuterClass.AuthorId request,
        io.grpc.stub.StreamObserver<com.grpc.demo.common.AuthorOuterClass.Author> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthorByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthorServicesBlockingStub extends io.grpc.stub.AbstractStub<AuthorServicesBlockingStub> {
    private AuthorServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.demo.common.AuthorOuterClass.Author authorById(com.grpc.demo.common.AuthorOuterClass.AuthorId request) {
      return blockingUnaryCall(
          getChannel(), getAuthorByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthorServicesFutureStub extends io.grpc.stub.AbstractStub<AuthorServicesFutureStub> {
    private AuthorServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.demo.common.AuthorOuterClass.Author> authorById(
        com.grpc.demo.common.AuthorOuterClass.AuthorId request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthorByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHOR_BY_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthorServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthorServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHOR_BY_ID:
          serviceImpl.authorById((com.grpc.demo.common.AuthorOuterClass.AuthorId) request,
              (io.grpc.stub.StreamObserver<com.grpc.demo.common.AuthorOuterClass.Author>) responseObserver);
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

  private static abstract class AuthorServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthorServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.demo.common.AuthorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthorServices");
    }
  }

  private static final class AuthorServicesFileDescriptorSupplier
      extends AuthorServicesBaseDescriptorSupplier {
    AuthorServicesFileDescriptorSupplier() {}
  }

  private static final class AuthorServicesMethodDescriptorSupplier
      extends AuthorServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthorServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthorServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthorServicesFileDescriptorSupplier())
              .addMethod(getAuthorByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
