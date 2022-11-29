package via.sep3.protobuf.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Auth.proto")
public final class AuthGrpc {

  private AuthGrpc() {}

  public static final String SERVICE_NAME = "Auth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.protobuf.auth.RegisterUserInput,
      via.sep3.protobuf.auth.UserOutput> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = via.sep3.protobuf.auth.RegisterUserInput.class,
      responseType = via.sep3.protobuf.auth.UserOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.protobuf.auth.RegisterUserInput,
      via.sep3.protobuf.auth.UserOutput> getRegisterMethod() {
    io.grpc.MethodDescriptor<via.sep3.protobuf.auth.RegisterUserInput, via.sep3.protobuf.auth.UserOutput> getRegisterMethod;
    if ((getRegisterMethod = AuthGrpc.getRegisterMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRegisterMethod = AuthGrpc.getRegisterMethod) == null) {
          AuthGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<via.sep3.protobuf.auth.RegisterUserInput, via.sep3.protobuf.auth.UserOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.auth.RegisterUserInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.auth.UserOutput.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.protobuf.auth.LoginUserInput,
      via.sep3.protobuf.auth.UserOutput> getLoginUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginUser",
      requestType = via.sep3.protobuf.auth.LoginUserInput.class,
      responseType = via.sep3.protobuf.auth.UserOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.protobuf.auth.LoginUserInput,
      via.sep3.protobuf.auth.UserOutput> getLoginUserMethod() {
    io.grpc.MethodDescriptor<via.sep3.protobuf.auth.LoginUserInput, via.sep3.protobuf.auth.UserOutput> getLoginUserMethod;
    if ((getLoginUserMethod = AuthGrpc.getLoginUserMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getLoginUserMethod = AuthGrpc.getLoginUserMethod) == null) {
          AuthGrpc.getLoginUserMethod = getLoginUserMethod =
              io.grpc.MethodDescriptor.<via.sep3.protobuf.auth.LoginUserInput, via.sep3.protobuf.auth.UserOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoginUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.auth.LoginUserInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.auth.UserOutput.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("LoginUser"))
              .build();
        }
      }
    }
    return getLoginUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthStub>() {
        @java.lang.Override
        public AuthStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthStub(channel, callOptions);
        }
      };
    return AuthStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthBlockingStub>() {
        @java.lang.Override
        public AuthBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthBlockingStub(channel, callOptions);
        }
      };
    return AuthBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthFutureStub>() {
        @java.lang.Override
        public AuthFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthFutureStub(channel, callOptions);
        }
      };
    return AuthFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AuthImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(via.sep3.protobuf.auth.RegisterUserInput request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.auth.UserOutput> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void loginUser(via.sep3.protobuf.auth.LoginUserInput request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.auth.UserOutput> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.protobuf.auth.RegisterUserInput,
                via.sep3.protobuf.auth.UserOutput>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getLoginUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.protobuf.auth.LoginUserInput,
                via.sep3.protobuf.auth.UserOutput>(
                  this, METHODID_LOGIN_USER)))
          .build();
    }
  }

  /**
   */
  public static final class AuthStub extends io.grpc.stub.AbstractAsyncStub<AuthStub> {
    private AuthStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthStub(channel, callOptions);
    }

    /**
     */
    public void register(via.sep3.protobuf.auth.RegisterUserInput request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.auth.UserOutput> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loginUser(via.sep3.protobuf.auth.LoginUserInput request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.auth.UserOutput> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthBlockingStub> {
    private AuthBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.protobuf.auth.UserOutput register(via.sep3.protobuf.auth.RegisterUserInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.protobuf.auth.UserOutput loginUser(via.sep3.protobuf.auth.LoginUserInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthFutureStub extends io.grpc.stub.AbstractFutureStub<AuthFutureStub> {
    private AuthFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.protobuf.auth.UserOutput> register(
        via.sep3.protobuf.auth.RegisterUserInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.protobuf.auth.UserOutput> loginUser(
        via.sep3.protobuf.auth.LoginUserInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_LOGIN_USER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((via.sep3.protobuf.auth.RegisterUserInput) request,
              (io.grpc.stub.StreamObserver<via.sep3.protobuf.auth.UserOutput>) responseObserver);
          break;
        case METHODID_LOGIN_USER:
          serviceImpl.loginUser((via.sep3.protobuf.auth.LoginUserInput) request,
              (io.grpc.stub.StreamObserver<via.sep3.protobuf.auth.UserOutput>) responseObserver);
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

  private static abstract class AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.protobuf.auth.AuthOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Auth");
    }
  }

  private static final class AuthFileDescriptorSupplier
      extends AuthBaseDescriptorSupplier {
    AuthFileDescriptorSupplier() {}
  }

  private static final class AuthMethodDescriptorSupplier
      extends AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getLoginUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
