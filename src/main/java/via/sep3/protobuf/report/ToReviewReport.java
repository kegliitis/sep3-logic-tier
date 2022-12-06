// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Report.proto

package via.sep3.protobuf.report;

/**
 * Protobuf type {@code ToReviewReport}
 */
public final class ToReviewReport extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ToReviewReport)
    ToReviewReportOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ToReviewReport.newBuilder() to construct.
  private ToReviewReport(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ToReviewReport() {
    reportId_ = "";
    updatedStatus_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ToReviewReport();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ToReviewReport(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            reportId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            updatedStatus_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.sep3.protobuf.report.ReportOuterClass.internal_static_ToReviewReport_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sep3.protobuf.report.ReportOuterClass.internal_static_ToReviewReport_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sep3.protobuf.report.ToReviewReport.class, via.sep3.protobuf.report.ToReviewReport.Builder.class);
  }

  public static final int REPORTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object reportId_;
  /**
   * <code>string reportId = 1;</code>
   * @return The reportId.
   */
  @java.lang.Override
  public java.lang.String getReportId() {
    java.lang.Object ref = reportId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reportId_ = s;
      return s;
    }
  }
  /**
   * <code>string reportId = 1;</code>
   * @return The bytes for reportId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReportIdBytes() {
    java.lang.Object ref = reportId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reportId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPDATEDSTATUS_FIELD_NUMBER = 2;
  private volatile java.lang.Object updatedStatus_;
  /**
   * <code>string updatedStatus = 2;</code>
   * @return The updatedStatus.
   */
  @java.lang.Override
  public java.lang.String getUpdatedStatus() {
    java.lang.Object ref = updatedStatus_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      updatedStatus_ = s;
      return s;
    }
  }
  /**
   * <code>string updatedStatus = 2;</code>
   * @return The bytes for updatedStatus.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUpdatedStatusBytes() {
    java.lang.Object ref = updatedStatus_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      updatedStatus_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reportId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reportId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(updatedStatus_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, updatedStatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reportId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, reportId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(updatedStatus_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, updatedStatus_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof via.sep3.protobuf.report.ToReviewReport)) {
      return super.equals(obj);
    }
    via.sep3.protobuf.report.ToReviewReport other = (via.sep3.protobuf.report.ToReviewReport) obj;

    if (!getReportId()
        .equals(other.getReportId())) return false;
    if (!getUpdatedStatus()
        .equals(other.getUpdatedStatus())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REPORTID_FIELD_NUMBER;
    hash = (53 * hash) + getReportId().hashCode();
    hash = (37 * hash) + UPDATEDSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + getUpdatedStatus().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sep3.protobuf.report.ToReviewReport parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.protobuf.report.ToReviewReport parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.protobuf.report.ToReviewReport parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.protobuf.report.ToReviewReport parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.protobuf.report.ToReviewReport parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.protobuf.report.ToReviewReport parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.protobuf.report.ToReviewReport parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.protobuf.report.ToReviewReport parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.protobuf.report.ToReviewReport parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sep3.protobuf.report.ToReviewReport parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.protobuf.report.ToReviewReport parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.protobuf.report.ToReviewReport parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(via.sep3.protobuf.report.ToReviewReport prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ToReviewReport}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ToReviewReport)
      via.sep3.protobuf.report.ToReviewReportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sep3.protobuf.report.ReportOuterClass.internal_static_ToReviewReport_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sep3.protobuf.report.ReportOuterClass.internal_static_ToReviewReport_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sep3.protobuf.report.ToReviewReport.class, via.sep3.protobuf.report.ToReviewReport.Builder.class);
    }

    // Construct using via.sep3.protobuf.report.ToReviewReport.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      reportId_ = "";

      updatedStatus_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sep3.protobuf.report.ReportOuterClass.internal_static_ToReviewReport_descriptor;
    }

    @java.lang.Override
    public via.sep3.protobuf.report.ToReviewReport getDefaultInstanceForType() {
      return via.sep3.protobuf.report.ToReviewReport.getDefaultInstance();
    }

    @java.lang.Override
    public via.sep3.protobuf.report.ToReviewReport build() {
      via.sep3.protobuf.report.ToReviewReport result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sep3.protobuf.report.ToReviewReport buildPartial() {
      via.sep3.protobuf.report.ToReviewReport result = new via.sep3.protobuf.report.ToReviewReport(this);
      result.reportId_ = reportId_;
      result.updatedStatus_ = updatedStatus_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.sep3.protobuf.report.ToReviewReport) {
        return mergeFrom((via.sep3.protobuf.report.ToReviewReport)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sep3.protobuf.report.ToReviewReport other) {
      if (other == via.sep3.protobuf.report.ToReviewReport.getDefaultInstance()) return this;
      if (!other.getReportId().isEmpty()) {
        reportId_ = other.reportId_;
        onChanged();
      }
      if (!other.getUpdatedStatus().isEmpty()) {
        updatedStatus_ = other.updatedStatus_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.sep3.protobuf.report.ToReviewReport parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sep3.protobuf.report.ToReviewReport) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object reportId_ = "";
    /**
     * <code>string reportId = 1;</code>
     * @return The reportId.
     */
    public java.lang.String getReportId() {
      java.lang.Object ref = reportId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reportId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reportId = 1;</code>
     * @return The bytes for reportId.
     */
    public com.google.protobuf.ByteString
        getReportIdBytes() {
      java.lang.Object ref = reportId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reportId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reportId = 1;</code>
     * @param value The reportId to set.
     * @return This builder for chaining.
     */
    public Builder setReportId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      reportId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string reportId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReportId() {
      
      reportId_ = getDefaultInstance().getReportId();
      onChanged();
      return this;
    }
    /**
     * <code>string reportId = 1;</code>
     * @param value The bytes for reportId to set.
     * @return This builder for chaining.
     */
    public Builder setReportIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      reportId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object updatedStatus_ = "";
    /**
     * <code>string updatedStatus = 2;</code>
     * @return The updatedStatus.
     */
    public java.lang.String getUpdatedStatus() {
      java.lang.Object ref = updatedStatus_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        updatedStatus_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string updatedStatus = 2;</code>
     * @return The bytes for updatedStatus.
     */
    public com.google.protobuf.ByteString
        getUpdatedStatusBytes() {
      java.lang.Object ref = updatedStatus_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        updatedStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string updatedStatus = 2;</code>
     * @param value The updatedStatus to set.
     * @return This builder for chaining.
     */
    public Builder setUpdatedStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      updatedStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string updatedStatus = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdatedStatus() {
      
      updatedStatus_ = getDefaultInstance().getUpdatedStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string updatedStatus = 2;</code>
     * @param value The bytes for updatedStatus to set.
     * @return This builder for chaining.
     */
    public Builder setUpdatedStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      updatedStatus_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ToReviewReport)
  }

  // @@protoc_insertion_point(class_scope:ToReviewReport)
  private static final via.sep3.protobuf.report.ToReviewReport DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sep3.protobuf.report.ToReviewReport();
  }

  public static via.sep3.protobuf.report.ToReviewReport getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ToReviewReport>
      PARSER = new com.google.protobuf.AbstractParser<ToReviewReport>() {
    @java.lang.Override
    public ToReviewReport parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ToReviewReport(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ToReviewReport> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ToReviewReport> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sep3.protobuf.report.ToReviewReport getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

