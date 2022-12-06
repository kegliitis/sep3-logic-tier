package via.sep3.protobuf.report;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Report.proto")
public final class ReportGrpc {

  private ReportGrpc() {}

  public static final String SERVICE_NAME = "Report";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.protobuf.report.ReportsFilter,
      via.sep3.protobuf.report.ReportList> getGetReportsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReports",
      requestType = via.sep3.protobuf.report.ReportsFilter.class,
      responseType = via.sep3.protobuf.report.ReportList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.protobuf.report.ReportsFilter,
      via.sep3.protobuf.report.ReportList> getGetReportsMethod() {
    io.grpc.MethodDescriptor<via.sep3.protobuf.report.ReportsFilter, via.sep3.protobuf.report.ReportList> getGetReportsMethod;
    if ((getGetReportsMethod = ReportGrpc.getGetReportsMethod) == null) {
      synchronized (ReportGrpc.class) {
        if ((getGetReportsMethod = ReportGrpc.getGetReportsMethod) == null) {
          ReportGrpc.getGetReportsMethod = getGetReportsMethod =
              io.grpc.MethodDescriptor.<via.sep3.protobuf.report.ReportsFilter, via.sep3.protobuf.report.ReportList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReports"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.report.ReportsFilter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.report.ReportList.getDefaultInstance()))
              .setSchemaDescriptor(new ReportMethodDescriptorSupplier("GetReports"))
              .build();
        }
      }
    }
    return getGetReportsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.protobuf.report.CreateReportObject,
      via.sep3.protobuf.report.ReportObject> getCreateReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReport",
      requestType = via.sep3.protobuf.report.CreateReportObject.class,
      responseType = via.sep3.protobuf.report.ReportObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.protobuf.report.CreateReportObject,
      via.sep3.protobuf.report.ReportObject> getCreateReportMethod() {
    io.grpc.MethodDescriptor<via.sep3.protobuf.report.CreateReportObject, via.sep3.protobuf.report.ReportObject> getCreateReportMethod;
    if ((getCreateReportMethod = ReportGrpc.getCreateReportMethod) == null) {
      synchronized (ReportGrpc.class) {
        if ((getCreateReportMethod = ReportGrpc.getCreateReportMethod) == null) {
          ReportGrpc.getCreateReportMethod = getCreateReportMethod =
              io.grpc.MethodDescriptor.<via.sep3.protobuf.report.CreateReportObject, via.sep3.protobuf.report.ReportObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.report.CreateReportObject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.report.ReportObject.getDefaultInstance()))
              .setSchemaDescriptor(new ReportMethodDescriptorSupplier("CreateReport"))
              .build();
        }
      }
    }
    return getCreateReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.protobuf.report.ToReviewReport,
      via.sep3.protobuf.report.ReviewedReport> getReviewReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReviewReport",
      requestType = via.sep3.protobuf.report.ToReviewReport.class,
      responseType = via.sep3.protobuf.report.ReviewedReport.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.protobuf.report.ToReviewReport,
      via.sep3.protobuf.report.ReviewedReport> getReviewReportMethod() {
    io.grpc.MethodDescriptor<via.sep3.protobuf.report.ToReviewReport, via.sep3.protobuf.report.ReviewedReport> getReviewReportMethod;
    if ((getReviewReportMethod = ReportGrpc.getReviewReportMethod) == null) {
      synchronized (ReportGrpc.class) {
        if ((getReviewReportMethod = ReportGrpc.getReviewReportMethod) == null) {
          ReportGrpc.getReviewReportMethod = getReviewReportMethod =
              io.grpc.MethodDescriptor.<via.sep3.protobuf.report.ToReviewReport, via.sep3.protobuf.report.ReviewedReport>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReviewReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.report.ToReviewReport.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.report.ReviewedReport.getDefaultInstance()))
              .setSchemaDescriptor(new ReportMethodDescriptorSupplier("ReviewReport"))
              .build();
        }
      }
    }
    return getReviewReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.protobuf.report.ReportId,
      via.sep3.protobuf.report.ReportObject> getGetReportByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReportById",
      requestType = via.sep3.protobuf.report.ReportId.class,
      responseType = via.sep3.protobuf.report.ReportObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.protobuf.report.ReportId,
      via.sep3.protobuf.report.ReportObject> getGetReportByIdMethod() {
    io.grpc.MethodDescriptor<via.sep3.protobuf.report.ReportId, via.sep3.protobuf.report.ReportObject> getGetReportByIdMethod;
    if ((getGetReportByIdMethod = ReportGrpc.getGetReportByIdMethod) == null) {
      synchronized (ReportGrpc.class) {
        if ((getGetReportByIdMethod = ReportGrpc.getGetReportByIdMethod) == null) {
          ReportGrpc.getGetReportByIdMethod = getGetReportByIdMethod =
              io.grpc.MethodDescriptor.<via.sep3.protobuf.report.ReportId, via.sep3.protobuf.report.ReportObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReportById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.report.ReportId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.protobuf.report.ReportObject.getDefaultInstance()))
              .setSchemaDescriptor(new ReportMethodDescriptorSupplier("GetReportById"))
              .build();
        }
      }
    }
    return getGetReportByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReportStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReportStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReportStub>() {
        @java.lang.Override
        public ReportStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReportStub(channel, callOptions);
        }
      };
    return ReportStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReportBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReportBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReportBlockingStub>() {
        @java.lang.Override
        public ReportBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReportBlockingStub(channel, callOptions);
        }
      };
    return ReportBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReportFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReportFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReportFutureStub>() {
        @java.lang.Override
        public ReportFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReportFutureStub(channel, callOptions);
        }
      };
    return ReportFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ReportImplBase implements io.grpc.BindableService {

    /**
     */
    public void getReports(via.sep3.protobuf.report.ReportsFilter request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.report.ReportList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReportsMethod(), responseObserver);
    }

    /**
     */
    public void createReport(via.sep3.protobuf.report.CreateReportObject request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.report.ReportObject> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateReportMethod(), responseObserver);
    }

    /**
     */
    public void reviewReport(via.sep3.protobuf.report.ToReviewReport request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.report.ReviewedReport> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReviewReportMethod(), responseObserver);
    }

    /**
     */
    public void getReportById(via.sep3.protobuf.report.ReportId request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.report.ReportObject> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReportByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetReportsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.protobuf.report.ReportsFilter,
                via.sep3.protobuf.report.ReportList>(
                  this, METHODID_GET_REPORTS)))
          .addMethod(
            getCreateReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.protobuf.report.CreateReportObject,
                via.sep3.protobuf.report.ReportObject>(
                  this, METHODID_CREATE_REPORT)))
          .addMethod(
            getReviewReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.protobuf.report.ToReviewReport,
                via.sep3.protobuf.report.ReviewedReport>(
                  this, METHODID_REVIEW_REPORT)))
          .addMethod(
            getGetReportByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.protobuf.report.ReportId,
                via.sep3.protobuf.report.ReportObject>(
                  this, METHODID_GET_REPORT_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ReportStub extends io.grpc.stub.AbstractAsyncStub<ReportStub> {
    private ReportStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReportStub(channel, callOptions);
    }

    /**
     */
    public void getReports(via.sep3.protobuf.report.ReportsFilter request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.report.ReportList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReportsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createReport(via.sep3.protobuf.report.CreateReportObject request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.report.ReportObject> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reviewReport(via.sep3.protobuf.report.ToReviewReport request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.report.ReviewedReport> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReviewReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReportById(via.sep3.protobuf.report.ReportId request,
        io.grpc.stub.StreamObserver<via.sep3.protobuf.report.ReportObject> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReportByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReportBlockingStub extends io.grpc.stub.AbstractBlockingStub<ReportBlockingStub> {
    private ReportBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReportBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.protobuf.report.ReportList getReports(via.sep3.protobuf.report.ReportsFilter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReportsMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.protobuf.report.ReportObject createReport(via.sep3.protobuf.report.CreateReportObject request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateReportMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.protobuf.report.ReviewedReport reviewReport(via.sep3.protobuf.report.ToReviewReport request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReviewReportMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.protobuf.report.ReportObject getReportById(via.sep3.protobuf.report.ReportId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReportByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReportFutureStub extends io.grpc.stub.AbstractFutureStub<ReportFutureStub> {
    private ReportFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReportFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.protobuf.report.ReportList> getReports(
        via.sep3.protobuf.report.ReportsFilter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReportsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.protobuf.report.ReportObject> createReport(
        via.sep3.protobuf.report.CreateReportObject request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateReportMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.protobuf.report.ReviewedReport> reviewReport(
        via.sep3.protobuf.report.ToReviewReport request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReviewReportMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.protobuf.report.ReportObject> getReportById(
        via.sep3.protobuf.report.ReportId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReportByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REPORTS = 0;
  private static final int METHODID_CREATE_REPORT = 1;
  private static final int METHODID_REVIEW_REPORT = 2;
  private static final int METHODID_GET_REPORT_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReportImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReportImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REPORTS:
          serviceImpl.getReports((via.sep3.protobuf.report.ReportsFilter) request,
              (io.grpc.stub.StreamObserver<via.sep3.protobuf.report.ReportList>) responseObserver);
          break;
        case METHODID_CREATE_REPORT:
          serviceImpl.createReport((via.sep3.protobuf.report.CreateReportObject) request,
              (io.grpc.stub.StreamObserver<via.sep3.protobuf.report.ReportObject>) responseObserver);
          break;
        case METHODID_REVIEW_REPORT:
          serviceImpl.reviewReport((via.sep3.protobuf.report.ToReviewReport) request,
              (io.grpc.stub.StreamObserver<via.sep3.protobuf.report.ReviewedReport>) responseObserver);
          break;
        case METHODID_GET_REPORT_BY_ID:
          serviceImpl.getReportById((via.sep3.protobuf.report.ReportId) request,
              (io.grpc.stub.StreamObserver<via.sep3.protobuf.report.ReportObject>) responseObserver);
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

  private static abstract class ReportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReportBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.protobuf.report.ReportOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Report");
    }
  }

  private static final class ReportFileDescriptorSupplier
      extends ReportBaseDescriptorSupplier {
    ReportFileDescriptorSupplier() {}
  }

  private static final class ReportMethodDescriptorSupplier
      extends ReportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReportMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReportGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReportFileDescriptorSupplier())
              .addMethod(getGetReportsMethod())
              .addMethod(getCreateReportMethod())
              .addMethod(getReviewReportMethod())
              .addMethod(getGetReportByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
