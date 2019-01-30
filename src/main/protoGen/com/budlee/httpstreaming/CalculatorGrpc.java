package com.budlee.httpstreaming;

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
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: calculator.proto")
public final class CalculatorGrpc {

  private CalculatorGrpc() {}

  public static final String SERVICE_NAME = "Calculator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest,
      com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse> getCalculateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Calculate",
      requestType = com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest.class,
      responseType = com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest,
      com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse> getCalculateMethod() {
    io.grpc.MethodDescriptor<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest, com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse> getCalculateMethod;
    if ((getCalculateMethod = CalculatorGrpc.getCalculateMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getCalculateMethod = CalculatorGrpc.getCalculateMethod) == null) {
          CalculatorGrpc.getCalculateMethod = getCalculateMethod = 
              io.grpc.MethodDescriptor.<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest, com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Calculator", "Calculate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("Calculate"))
                  .build();
          }
        }
     }
     return getCalculateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest,
      com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse> getCalculaterRecursiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculaterRecursive",
      requestType = com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest.class,
      responseType = com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest,
      com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse> getCalculaterRecursiveMethod() {
    io.grpc.MethodDescriptor<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest, com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse> getCalculaterRecursiveMethod;
    if ((getCalculaterRecursiveMethod = CalculatorGrpc.getCalculaterRecursiveMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getCalculaterRecursiveMethod = CalculatorGrpc.getCalculaterRecursiveMethod) == null) {
          CalculatorGrpc.getCalculaterRecursiveMethod = getCalculaterRecursiveMethod = 
              io.grpc.MethodDescriptor.<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest, com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Calculator", "CalculaterRecursive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("CalculaterRecursive"))
                  .build();
          }
        }
     }
     return getCalculaterRecursiveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorStub newStub(io.grpc.Channel channel) {
    return new CalculatorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalculatorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalculatorFutureStub(channel);
  }

  /**
   */
  public static abstract class CalculatorImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculate(com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest request,
        io.grpc.stub.StreamObserver<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculateMethod(), responseObserver);
    }

    /**
     */
    public void calculaterRecursive(com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest request,
        io.grpc.stub.StreamObserver<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculaterRecursiveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest,
                com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse>(
                  this, METHODID_CALCULATE)))
          .addMethod(
            getCalculaterRecursiveMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest,
                com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse>(
                  this, METHODID_CALCULATER_RECURSIVE)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorStub extends io.grpc.stub.AbstractStub<CalculatorStub> {
    private CalculatorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorStub(channel, callOptions);
    }

    /**
     */
    public void calculate(com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest request,
        io.grpc.stub.StreamObserver<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calculaterRecursive(com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest request,
        io.grpc.stub.StreamObserver<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCalculaterRecursiveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorBlockingStub extends io.grpc.stub.AbstractStub<CalculatorBlockingStub> {
    private CalculatorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse calculate(com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse> calculaterRecursive(
        com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getCalculaterRecursiveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorFutureStub extends io.grpc.stub.AbstractStub<CalculatorFutureStub> {
    private CalculatorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse> calculate(
        com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE = 0;
  private static final int METHODID_CALCULATER_RECURSIVE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE:
          serviceImpl.calculate((com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest) request,
              (io.grpc.stub.StreamObserver<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse>) responseObserver);
          break;
        case METHODID_CALCULATER_RECURSIVE:
          serviceImpl.calculaterRecursive((com.budlee.httpstreaming.CalculatorOuterClass.CalculatorRequest) request,
              (io.grpc.stub.StreamObserver<com.budlee.httpstreaming.CalculatorOuterClass.CalculatorResponse>) responseObserver);
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

  private static abstract class CalculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.budlee.httpstreaming.CalculatorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Calculator");
    }
  }

  private static final class CalculatorFileDescriptorSupplier
      extends CalculatorBaseDescriptorSupplier {
    CalculatorFileDescriptorSupplier() {}
  }

  private static final class CalculatorMethodDescriptorSupplier
      extends CalculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorMethodDescriptorSupplier(String methodName) {
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
      synchronized (CalculatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorFileDescriptorSupplier())
              .addMethod(getCalculateMethod())
              .addMethod(getCalculaterRecursiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
