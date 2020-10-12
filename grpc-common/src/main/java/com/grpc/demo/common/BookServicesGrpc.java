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
    comments = "Source: Book.proto")
public final class BookServicesGrpc {

  private BookServicesGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.demo.common.BookServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.demo.common.BookOuterClass.BookId,
      com.grpc.demo.common.BookOuterClass.Book> getBookByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookById",
      requestType = com.grpc.demo.common.BookOuterClass.BookId.class,
      responseType = com.grpc.demo.common.BookOuterClass.Book.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.demo.common.BookOuterClass.BookId,
      com.grpc.demo.common.BookOuterClass.Book> getBookByIdMethod() {
    io.grpc.MethodDescriptor<com.grpc.demo.common.BookOuterClass.BookId, com.grpc.demo.common.BookOuterClass.Book> getBookByIdMethod;
    if ((getBookByIdMethod = BookServicesGrpc.getBookByIdMethod) == null) {
      synchronized (BookServicesGrpc.class) {
        if ((getBookByIdMethod = BookServicesGrpc.getBookByIdMethod) == null) {
          BookServicesGrpc.getBookByIdMethod = getBookByIdMethod = 
              io.grpc.MethodDescriptor.<com.grpc.demo.common.BookOuterClass.BookId, com.grpc.demo.common.BookOuterClass.Book>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.demo.common.BookServices", "bookById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.common.BookOuterClass.BookId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.common.BookOuterClass.Book.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServicesMethodDescriptorSupplier("bookById"))
                  .build();
          }
        }
     }
     return getBookByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.demo.common.BookOuterClass.BookId,
      com.grpc.demo.common.BookOuterClass.Book> getFindAllBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllBooks",
      requestType = com.grpc.demo.common.BookOuterClass.BookId.class,
      responseType = com.grpc.demo.common.BookOuterClass.Book.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.demo.common.BookOuterClass.BookId,
      com.grpc.demo.common.BookOuterClass.Book> getFindAllBooksMethod() {
    io.grpc.MethodDescriptor<com.grpc.demo.common.BookOuterClass.BookId, com.grpc.demo.common.BookOuterClass.Book> getFindAllBooksMethod;
    if ((getFindAllBooksMethod = BookServicesGrpc.getFindAllBooksMethod) == null) {
      synchronized (BookServicesGrpc.class) {
        if ((getFindAllBooksMethod = BookServicesGrpc.getFindAllBooksMethod) == null) {
          BookServicesGrpc.getFindAllBooksMethod = getFindAllBooksMethod = 
              io.grpc.MethodDescriptor.<com.grpc.demo.common.BookOuterClass.BookId, com.grpc.demo.common.BookOuterClass.Book>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.demo.common.BookServices", "findAllBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.common.BookOuterClass.BookId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.demo.common.BookOuterClass.Book.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServicesMethodDescriptorSupplier("findAllBooks"))
                  .build();
          }
        }
     }
     return getFindAllBooksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookServicesStub newStub(io.grpc.Channel channel) {
    return new BookServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookServicesFutureStub(channel);
  }

  /**
   */
  public static abstract class BookServicesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void bookById(com.grpc.demo.common.BookOuterClass.BookId request,
        io.grpc.stub.StreamObserver<com.grpc.demo.common.BookOuterClass.Book> responseObserver) {
      asyncUnimplementedUnaryCall(getBookByIdMethod(), responseObserver);
    }

    /**
     */
    public void findAllBooks(com.grpc.demo.common.BookOuterClass.BookId request,
        io.grpc.stub.StreamObserver<com.grpc.demo.common.BookOuterClass.Book> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllBooksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBookByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.demo.common.BookOuterClass.BookId,
                com.grpc.demo.common.BookOuterClass.Book>(
                  this, METHODID_BOOK_BY_ID)))
          .addMethod(
            getFindAllBooksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.grpc.demo.common.BookOuterClass.BookId,
                com.grpc.demo.common.BookOuterClass.Book>(
                  this, METHODID_FIND_ALL_BOOKS)))
          .build();
    }
  }

  /**
   */
  public static final class BookServicesStub extends io.grpc.stub.AbstractStub<BookServicesStub> {
    private BookServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServicesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void bookById(com.grpc.demo.common.BookOuterClass.BookId request,
        io.grpc.stub.StreamObserver<com.grpc.demo.common.BookOuterClass.Book> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllBooks(com.grpc.demo.common.BookOuterClass.BookId request,
        io.grpc.stub.StreamObserver<com.grpc.demo.common.BookOuterClass.Book> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFindAllBooksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookServicesBlockingStub extends io.grpc.stub.AbstractStub<BookServicesBlockingStub> {
    private BookServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServicesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.grpc.demo.common.BookOuterClass.Book bookById(com.grpc.demo.common.BookOuterClass.BookId request) {
      return blockingUnaryCall(
          getChannel(), getBookByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.grpc.demo.common.BookOuterClass.Book> findAllBooks(
        com.grpc.demo.common.BookOuterClass.BookId request) {
      return blockingServerStreamingCall(
          getChannel(), getFindAllBooksMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookServicesFutureStub extends io.grpc.stub.AbstractStub<BookServicesFutureStub> {
    private BookServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServicesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.demo.common.BookOuterClass.Book> bookById(
        com.grpc.demo.common.BookOuterClass.BookId request) {
      return futureUnaryCall(
          getChannel().newCall(getBookByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOOK_BY_ID = 0;
  private static final int METHODID_FIND_ALL_BOOKS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BOOK_BY_ID:
          serviceImpl.bookById((com.grpc.demo.common.BookOuterClass.BookId) request,
              (io.grpc.stub.StreamObserver<com.grpc.demo.common.BookOuterClass.Book>) responseObserver);
          break;
        case METHODID_FIND_ALL_BOOKS:
          serviceImpl.findAllBooks((com.grpc.demo.common.BookOuterClass.BookId) request,
              (io.grpc.stub.StreamObserver<com.grpc.demo.common.BookOuterClass.Book>) responseObserver);
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

  private static abstract class BookServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.demo.common.BookOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookServices");
    }
  }

  private static final class BookServicesFileDescriptorSupplier
      extends BookServicesBaseDescriptorSupplier {
    BookServicesFileDescriptorSupplier() {}
  }

  private static final class BookServicesMethodDescriptorSupplier
      extends BookServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookServicesFileDescriptorSupplier())
              .addMethod(getBookByIdMethod())
              .addMethod(getFindAllBooksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
