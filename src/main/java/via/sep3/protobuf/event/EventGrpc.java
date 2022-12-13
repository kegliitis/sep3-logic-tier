package via.sep3.protobuf.event;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Event.proto")
public final class EventGrpc {

  private EventGrpc() {}

  public static final String SERVICE_NAME = "Event";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.protobuf.event.CreateEventObject,
      via.sep3.protobuf.event.EventObject> getCreateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEvent",
      requestType = via.sep3.protobuf.event.CreateEventObject.class,
      responseType = via.sep3.protobuf.event.EventObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.protobuf.event.CreateEventObject,
      via.sep3.protobuf.event.EventObject> getCreateEventMethod() {
    io.grpc.MethodDescriptor<via.sep3.protobuf.event.CreateEventObject, via.sep3.protobuf.event.EventObject> getCreateEventMethod;
    if ((getCreateEventMethod = EventGrpc.getCreateEventMethod) == null) {
      synchronized (EventGrpc.class) {
        if ((getCreateEventMethod = EventGrpc.getCreateEventMethod) == null) {
          EventGrpc.getCreateEventMethod = getCreateEventMethod =
              io.grpc.MethodDescriptor.<via.sep3.protobuf.event.CreateEventObject, via.sep3.protobuf.event.EventObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.event.CreateEventObject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.event.EventObject.getDefaultInstance()))
              .setSchemaDescriptor(new EventMethodDescriptorSupplier("CreateEvent"))
              .build();
        }
      }
    }
    return getCreateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.protobuf.event.EventsFilter,
      via.sep3.protobuf.event.EventList> getGetEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvents",
      requestType = via.sep3.protobuf.event.EventsFilter.class,
      responseType = via.sep3.protobuf.event.EventList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.protobuf.event.EventsFilter,
      via.sep3.protobuf.event.EventList> getGetEventsMethod() {
    io.grpc.MethodDescriptor<via.sep3.protobuf.event.EventsFilter, via.sep3.protobuf.event.EventList> getGetEventsMethod;
    if ((getGetEventsMethod = EventGrpc.getGetEventsMethod) == null) {
      synchronized (EventGrpc.class) {
        if ((getGetEventsMethod = EventGrpc.getGetEventsMethod) == null) {
          EventGrpc.getGetEventsMethod = getGetEventsMethod =
              io.grpc.MethodDescriptor.<via.sep3.protobuf.event.EventsFilter, via.sep3.protobuf.event.EventList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.event.EventsFilter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.event.EventList.getDefaultInstance()))
              .setSchemaDescriptor(new EventMethodDescriptorSupplier("GetEvents"))
              .build();
        }
      }
    }
    return getGetEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.protobuf.event.EventFilter,
      via.sep3.protobuf.event.EventObject> getGetEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvent",
      requestType = via.sep3.protobuf.event.EventFilter.class,
      responseType = via.sep3.protobuf.event.EventObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.protobuf.event.EventFilter,
      via.sep3.protobuf.event.EventObject> getGetEventMethod() {
    io.grpc.MethodDescriptor<via.sep3.protobuf.event.EventFilter, via.sep3.protobuf.event.EventObject> getGetEventMethod;
    if ((getGetEventMethod = EventGrpc.getGetEventMethod) == null) {
      synchronized (EventGrpc.class) {
        if ((getGetEventMethod = EventGrpc.getGetEventMethod) == null) {
          EventGrpc.getGetEventMethod = getGetEventMethod =
              io.grpc.MethodDescriptor.<via.sep3.protobuf.event.EventFilter, via.sep3.protobuf.event.EventObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.event.EventFilter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.event.EventObject.getDefaultInstance()))
              .setSchemaDescriptor(new EventMethodDescriptorSupplier("GetEvent"))
              .build();
        }
      }
    }
    return getGetEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.protobuf.event.ApproveEventFilter,
      via.sep3.protobuf.event.ApproveEventResult> getApproveEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveEvent",
      requestType = via.sep3.protobuf.event.ApproveEventFilter.class,
      responseType = via.sep3.protobuf.event.ApproveEventResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.protobuf.event.ApproveEventFilter,
      via.sep3.protobuf.event.ApproveEventResult> getApproveEventMethod() {
    io.grpc.MethodDescriptor<via.sep3.protobuf.event.ApproveEventFilter, via.sep3.protobuf.event.ApproveEventResult> getApproveEventMethod;
    if ((getApproveEventMethod = EventGrpc.getApproveEventMethod) == null) {
      synchronized (EventGrpc.class) {
        if ((getApproveEventMethod = EventGrpc.getApproveEventMethod) == null) {
          EventGrpc.getApproveEventMethod = getApproveEventMethod =
              io.grpc.MethodDescriptor.<via.sep3.protobuf.event.ApproveEventFilter, via.sep3.protobuf.event.ApproveEventResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.event.ApproveEventFilter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.event.ApproveEventResult.getDefaultInstance()))
              .setSchemaDescriptor(new EventMethodDescriptorSupplier("ApproveEvent"))
              .build();
        }
      }
    }
    return getApproveEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.protobuf.event.EventToAttend,
      via.sep3.protobuf.event.EventToAttendConfirmation> getAttendEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AttendEvent",
      requestType = via.sep3.protobuf.event.EventToAttend.class,
      responseType = via.sep3.protobuf.event.EventToAttendConfirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.protobuf.event.EventToAttend,
      via.sep3.protobuf.event.EventToAttendConfirmation> getAttendEventMethod() {
    io.grpc.MethodDescriptor<via.sep3.protobuf.event.EventToAttend, via.sep3.protobuf.event.EventToAttendConfirmation> getAttendEventMethod;
    if ((getAttendEventMethod = EventGrpc.getAttendEventMethod) == null) {
      synchronized (EventGrpc.class) {
        if ((getAttendEventMethod = EventGrpc.getAttendEventMethod) == null) {
          EventGrpc.getAttendEventMethod = getAttendEventMethod =
              io.grpc.MethodDescriptor.<via.sep3.protobuf.event.EventToAttend, via.sep3.protobuf.event.EventToAttendConfirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AttendEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.event.EventToAttend.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.event.EventToAttendConfirmation.getDefaultInstance()))
              .setSchemaDescriptor(new EventMethodDescriptorSupplier("AttendEvent"))
              .build();
        }
      }
    }
    return getAttendEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.protobuf.event.Validation,
      via.sep3.protobuf.event.ValidationConfirmation> getSubmitValidationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitValidation",
      requestType = via.sep3.protobuf.event.Validation.class,
      responseType = via.sep3.protobuf.event.ValidationConfirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.protobuf.event.Validation,
      via.sep3.protobuf.event.ValidationConfirmation> getSubmitValidationMethod() {
    io.grpc.MethodDescriptor<via.sep3.protobuf.event.Validation, via.sep3.protobuf.event.ValidationConfirmation> getSubmitValidationMethod;
    if ((getSubmitValidationMethod = EventGrpc.getSubmitValidationMethod) == null) {
      synchronized (EventGrpc.class) {
        if ((getSubmitValidationMethod = EventGrpc.getSubmitValidationMethod) == null) {
          EventGrpc.getSubmitValidationMethod = getSubmitValidationMethod =
              io.grpc.MethodDescriptor.<via.sep3.protobuf.event.Validation, via.sep3.protobuf.event.ValidationConfirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitValidation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.event.Validation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.event.ValidationConfirmation.getDefaultInstance()))
              .setSchemaDescriptor(new EventMethodDescriptorSupplier("SubmitValidation"))
              .build();
        }
      }
    }
    return getSubmitValidationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventStub>() {
        @java.lang.Override
        public EventStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventStub(channel, callOptions);
        }
      };
    return EventStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventBlockingStub>() {
        @java.lang.Override
        public EventBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventBlockingStub(channel, callOptions);
        }
      };
    return EventBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventFutureStub>() {
        @java.lang.Override
        public EventFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventFutureStub(channel, callOptions);
        }
      };
    return EventFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EventImplBase implements io.grpc.BindableService {

    /**
     */
    public void createEvent(via.sep3.protobuf.event.CreateEventObject request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.event.EventObject> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEventMethod(), responseObserver);
    }

    /**
     */
    public void getEvents(via.sep3.protobuf.event.EventsFilter request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.event.EventList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsMethod(), responseObserver);
    }

    /**
     */
    public void getEvent(via.sep3.protobuf.event.EventFilter request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.event.EventObject> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventMethod(), responseObserver);
    }

    /**
     */
    public void approveEvent(via.sep3.protobuf.event.ApproveEventFilter request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.event.ApproveEventResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveEventMethod(), responseObserver);
    }

    /**
     */
    public void attendEvent(via.sep3.protobuf.event.EventToAttend request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.event.EventToAttendConfirmation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAttendEventMethod(), responseObserver);
    }

    /**
     */
    public void submitValidation(via.sep3.protobuf.event.Validation request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.event.ValidationConfirmation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitValidationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.protobuf.event.CreateEventObject,
                via.sep3.protobuf.event.EventObject>(
                  this, METHODID_CREATE_EVENT)))
          .addMethod(
            getGetEventsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.protobuf.event.EventsFilter,
                via.sep3.protobuf.event.EventList>(
                  this, METHODID_GET_EVENTS)))
          .addMethod(
            getGetEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.protobuf.event.EventFilter,
                via.sep3.protobuf.event.EventObject>(
                  this, METHODID_GET_EVENT)))
          .addMethod(
            getApproveEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.protobuf.event.ApproveEventFilter,
                via.sep3.protobuf.event.ApproveEventResult>(
                  this, METHODID_APPROVE_EVENT)))
          .addMethod(
            getAttendEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.protobuf.event.EventToAttend,
                via.sep3.protobuf.event.EventToAttendConfirmation>(
                  this, METHODID_ATTEND_EVENT)))
          .addMethod(
            getSubmitValidationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.protobuf.event.Validation,
                via.sep3.protobuf.event.ValidationConfirmation>(
                  this, METHODID_SUBMIT_VALIDATION)))
          .build();
    }
  }

  /**
   */
  public static final class EventStub extends io.grpc.stub.AbstractAsyncStub<EventStub> {
    private EventStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventStub(channel, callOptions);
    }

    /**
     */
    public void createEvent(via.sep3.protobuf.event.CreateEventObject request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.event.EventObject> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEvents(via.sep3.protobuf.event.EventsFilter request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.event.EventList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEvent(via.sep3.protobuf.event.EventFilter request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.event.EventObject> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void approveEvent(via.sep3.protobuf.event.ApproveEventFilter request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.event.ApproveEventResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void attendEvent(via.sep3.protobuf.event.EventToAttend request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.event.EventToAttendConfirmation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAttendEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitValidation(via.sep3.protobuf.event.Validation request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.event.ValidationConfirmation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitValidationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EventBlockingStub extends io.grpc.stub.AbstractBlockingStub<EventBlockingStub> {
    private EventBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.protobuf.event.EventObject createEvent(via.sep3.protobuf.event.CreateEventObject request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.protobuf.event.EventList getEvents(via.sep3.protobuf.event.EventsFilter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.protobuf.event.EventObject getEvent(via.sep3.protobuf.event.EventFilter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.protobuf.event.ApproveEventResult approveEvent(via.sep3.protobuf.event.ApproveEventFilter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.protobuf.event.EventToAttendConfirmation attendEvent(via.sep3.protobuf.event.EventToAttend request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAttendEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.protobuf.event.ValidationConfirmation submitValidation(via.sep3.protobuf.event.Validation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitValidationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EventFutureStub extends io.grpc.stub.AbstractFutureStub<EventFutureStub> {
    private EventFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.protobuf.event.EventObject> createEvent(
        via.sep3.protobuf.event.CreateEventObject request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.protobuf.event.EventList> getEvents(
        via.sep3.protobuf.event.EventsFilter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.protobuf.event.EventObject> getEvent(
        via.sep3.protobuf.event.EventFilter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.protobuf.event.ApproveEventResult> approveEvent(
        via.sep3.protobuf.event.ApproveEventFilter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.protobuf.event.EventToAttendConfirmation> attendEvent(
        via.sep3.protobuf.event.EventToAttend request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAttendEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.protobuf.event.ValidationConfirmation> submitValidation(
        via.sep3.protobuf.event.Validation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitValidationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_EVENT = 0;
  private static final int METHODID_GET_EVENTS = 1;
  private static final int METHODID_GET_EVENT = 2;
  private static final int METHODID_APPROVE_EVENT = 3;
  private static final int METHODID_ATTEND_EVENT = 4;
  private static final int METHODID_SUBMIT_VALIDATION = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_EVENT:
          serviceImpl.createEvent((via.sep3.protobuf.event.CreateEventObject) request,
              (io.grpc.stub.StreamObserver<via.sep3.protobuf.event.EventObject>) responseObserver);
          break;
        case METHODID_GET_EVENTS:
          serviceImpl.getEvents((via.sep3.protobuf.event.EventsFilter) request,
              (io.grpc.stub.StreamObserver<via.sep3.protobuf.event.EventList>) responseObserver);
          break;
        case METHODID_GET_EVENT:
          serviceImpl.getEvent((via.sep3.protobuf.event.EventFilter) request,
              (io.grpc.stub.StreamObserver<via.sep3.protobuf.event.EventObject>) responseObserver);
          break;
        case METHODID_APPROVE_EVENT:
          serviceImpl.approveEvent((via.sep3.protobuf.event.ApproveEventFilter) request,
              (io.grpc.stub.StreamObserver<via.sep3.protobuf.event.ApproveEventResult>) responseObserver);
          break;
        case METHODID_ATTEND_EVENT:
          serviceImpl.attendEvent((via.sep3.protobuf.event.EventToAttend) request,
              (io.grpc.stub.StreamObserver<via.sep3.protobuf.event.EventToAttendConfirmation>) responseObserver);
          break;
        case METHODID_SUBMIT_VALIDATION:
          serviceImpl.submitValidation((via.sep3.protobuf.event.Validation) request,
              (io.grpc.stub.StreamObserver<via.sep3.protobuf.event.ValidationConfirmation>) responseObserver);
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

  private static abstract class EventBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.protobuf.event.EventOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Event");
    }
  }

  private static final class EventFileDescriptorSupplier
      extends EventBaseDescriptorSupplier {
    EventFileDescriptorSupplier() {}
  }

  private static final class EventMethodDescriptorSupplier
      extends EventBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventFileDescriptorSupplier())
              .addMethod(getCreateEventMethod())
              .addMethod(getGetEventsMethod())
              .addMethod(getGetEventMethod())
              .addMethod(getApproveEventMethod())
              .addMethod(getAttendEventMethod())
              .addMethod(getSubmitValidationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
