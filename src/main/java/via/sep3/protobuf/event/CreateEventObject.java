// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Event.proto

package via.sep3.protobuf.event;

/**
 * Protobuf type {@code CreateEventObject}
 */
public final class CreateEventObject extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CreateEventObject)
    CreateEventObjectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateEventObject.newBuilder() to construct.
  private CreateEventObject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateEventObject() {
    date_ = "";
    time_ = "";
    description_ = "";
    status_ = "";
    creatorEmail_ = "";
    reportId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateEventObject();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateEventObject(
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

            date_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            time_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            creatorEmail_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            reportId_ = s;
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
    return via.sep3.protobuf.event.EventOuterClass.internal_static_CreateEventObject_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sep3.protobuf.event.EventOuterClass.internal_static_CreateEventObject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sep3.protobuf.event.CreateEventObject.class, via.sep3.protobuf.event.CreateEventObject.Builder.class);
  }

  public static final int DATE_FIELD_NUMBER = 1;
  private volatile java.lang.Object date_;
  /**
   * <code>string date = 1;</code>
   * @return The date.
   */
  @java.lang.Override
  public java.lang.String getDate() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      date_ = s;
      return s;
    }
  }
  /**
   * <code>string date = 1;</code>
   * @return The bytes for date.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDateBytes() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      date_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_FIELD_NUMBER = 2;
  private volatile java.lang.Object time_;
  /**
   * <code>string time = 2;</code>
   * @return The time.
   */
  @java.lang.Override
  public java.lang.String getTime() {
    java.lang.Object ref = time_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      time_ = s;
      return s;
    }
  }
  /**
   * <code>string time = 2;</code>
   * @return The bytes for time.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTimeBytes() {
    java.lang.Object ref = time_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      time_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 3;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 4;
  private volatile java.lang.Object status_;
  /**
   * <code>string status = 4;</code>
   * @return The status.
   */
  @java.lang.Override
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <code>string status = 4;</code>
   * @return The bytes for status.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATOREMAIL_FIELD_NUMBER = 5;
  private volatile java.lang.Object creatorEmail_;
  /**
   * <code>string creatorEmail = 5;</code>
   * @return The creatorEmail.
   */
  @java.lang.Override
  public java.lang.String getCreatorEmail() {
    java.lang.Object ref = creatorEmail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      creatorEmail_ = s;
      return s;
    }
  }
  /**
   * <code>string creatorEmail = 5;</code>
   * @return The bytes for creatorEmail.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCreatorEmailBytes() {
    java.lang.Object ref = creatorEmail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      creatorEmail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPORTID_FIELD_NUMBER = 6;
  private volatile java.lang.Object reportId_;
  /**
   * <code>string reportId = 6;</code>
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
   * <code>string reportId = 6;</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(date_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, date_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(time_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, time_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(status_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creatorEmail_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, creatorEmail_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reportId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, reportId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(date_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, date_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(time_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, time_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(status_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creatorEmail_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, creatorEmail_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reportId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, reportId_);
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
    if (!(obj instanceof via.sep3.protobuf.event.CreateEventObject)) {
      return super.equals(obj);
    }
    via.sep3.protobuf.event.CreateEventObject other = (via.sep3.protobuf.event.CreateEventObject) obj;

    if (!getDate()
        .equals(other.getDate())) return false;
    if (!getTime()
        .equals(other.getTime())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getStatus()
        .equals(other.getStatus())) return false;
    if (!getCreatorEmail()
        .equals(other.getCreatorEmail())) return false;
    if (!getReportId()
        .equals(other.getReportId())) return false;
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
    hash = (37 * hash) + DATE_FIELD_NUMBER;
    hash = (53 * hash) + getDate().hashCode();
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + getTime().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (37 * hash) + CREATOREMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getCreatorEmail().hashCode();
    hash = (37 * hash) + REPORTID_FIELD_NUMBER;
    hash = (53 * hash) + getReportId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sep3.protobuf.event.CreateEventObject parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.protobuf.event.CreateEventObject parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.protobuf.event.CreateEventObject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.protobuf.event.CreateEventObject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.protobuf.event.CreateEventObject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.protobuf.event.CreateEventObject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.protobuf.event.CreateEventObject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.protobuf.event.CreateEventObject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.protobuf.event.CreateEventObject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sep3.protobuf.event.CreateEventObject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.protobuf.event.CreateEventObject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.protobuf.event.CreateEventObject parseFrom(
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
  public static Builder newBuilder(via.sep3.protobuf.event.CreateEventObject prototype) {
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
   * Protobuf type {@code CreateEventObject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CreateEventObject)
      via.sep3.protobuf.event.CreateEventObjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sep3.protobuf.event.EventOuterClass.internal_static_CreateEventObject_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sep3.protobuf.event.EventOuterClass.internal_static_CreateEventObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sep3.protobuf.event.CreateEventObject.class, via.sep3.protobuf.event.CreateEventObject.Builder.class);
    }

    // Construct using via.sep3.protobuf.event.CreateEventObject.newBuilder()
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
      date_ = "";

      time_ = "";

      description_ = "";

      status_ = "";

      creatorEmail_ = "";

      reportId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sep3.protobuf.event.EventOuterClass.internal_static_CreateEventObject_descriptor;
    }

    @java.lang.Override
    public via.sep3.protobuf.event.CreateEventObject getDefaultInstanceForType() {
      return via.sep3.protobuf.event.CreateEventObject.getDefaultInstance();
    }

    @java.lang.Override
    public via.sep3.protobuf.event.CreateEventObject build() {
      via.sep3.protobuf.event.CreateEventObject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sep3.protobuf.event.CreateEventObject buildPartial() {
      via.sep3.protobuf.event.CreateEventObject result = new via.sep3.protobuf.event.CreateEventObject(this);
      result.date_ = date_;
      result.time_ = time_;
      result.description_ = description_;
      result.status_ = status_;
      result.creatorEmail_ = creatorEmail_;
      result.reportId_ = reportId_;
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
      if (other instanceof via.sep3.protobuf.event.CreateEventObject) {
        return mergeFrom((via.sep3.protobuf.event.CreateEventObject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sep3.protobuf.event.CreateEventObject other) {
      if (other == via.sep3.protobuf.event.CreateEventObject.getDefaultInstance()) return this;
      if (!other.getDate().isEmpty()) {
        date_ = other.date_;
        onChanged();
      }
      if (!other.getTime().isEmpty()) {
        time_ = other.time_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (!other.getCreatorEmail().isEmpty()) {
        creatorEmail_ = other.creatorEmail_;
        onChanged();
      }
      if (!other.getReportId().isEmpty()) {
        reportId_ = other.reportId_;
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
      via.sep3.protobuf.event.CreateEventObject parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sep3.protobuf.event.CreateEventObject) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object date_ = "";
    /**
     * <code>string date = 1;</code>
     * @return The date.
     */
    public java.lang.String getDate() {
      java.lang.Object ref = date_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        date_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string date = 1;</code>
     * @return The bytes for date.
     */
    public com.google.protobuf.ByteString
        getDateBytes() {
      java.lang.Object ref = date_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        date_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string date = 1;</code>
     * @param value The date to set.
     * @return This builder for chaining.
     */
    public Builder setDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      date_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string date = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDate() {
      
      date_ = getDefaultInstance().getDate();
      onChanged();
      return this;
    }
    /**
     * <code>string date = 1;</code>
     * @param value The bytes for date to set.
     * @return This builder for chaining.
     */
    public Builder setDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      date_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object time_ = "";
    /**
     * <code>string time = 2;</code>
     * @return The time.
     */
    public java.lang.String getTime() {
      java.lang.Object ref = time_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        time_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string time = 2;</code>
     * @return The bytes for time.
     */
    public com.google.protobuf.ByteString
        getTimeBytes() {
      java.lang.Object ref = time_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        time_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string time = 2;</code>
     * @param value The time to set.
     * @return This builder for chaining.
     */
    public Builder setTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string time = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTime() {
      
      time_ = getDefaultInstance().getTime();
      onChanged();
      return this;
    }
    /**
     * <code>string time = 2;</code>
     * @param value The bytes for time to set.
     * @return This builder for chaining.
     */
    public Builder setTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      time_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 3;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <code>string status = 4;</code>
     * @return The status.
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string status = 4;</code>
     * @return The bytes for status.
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string status = 4;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string status = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string status = 4;</code>
     * @param value The bytes for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object creatorEmail_ = "";
    /**
     * <code>string creatorEmail = 5;</code>
     * @return The creatorEmail.
     */
    public java.lang.String getCreatorEmail() {
      java.lang.Object ref = creatorEmail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        creatorEmail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string creatorEmail = 5;</code>
     * @return The bytes for creatorEmail.
     */
    public com.google.protobuf.ByteString
        getCreatorEmailBytes() {
      java.lang.Object ref = creatorEmail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        creatorEmail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string creatorEmail = 5;</code>
     * @param value The creatorEmail to set.
     * @return This builder for chaining.
     */
    public Builder setCreatorEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      creatorEmail_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string creatorEmail = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreatorEmail() {
      
      creatorEmail_ = getDefaultInstance().getCreatorEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string creatorEmail = 5;</code>
     * @param value The bytes for creatorEmail to set.
     * @return This builder for chaining.
     */
    public Builder setCreatorEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      creatorEmail_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object reportId_ = "";
    /**
     * <code>string reportId = 6;</code>
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
     * <code>string reportId = 6;</code>
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
     * <code>string reportId = 6;</code>
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
     * <code>string reportId = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearReportId() {
      
      reportId_ = getDefaultInstance().getReportId();
      onChanged();
      return this;
    }
    /**
     * <code>string reportId = 6;</code>
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


    // @@protoc_insertion_point(builder_scope:CreateEventObject)
  }

  // @@protoc_insertion_point(class_scope:CreateEventObject)
  private static final via.sep3.protobuf.event.CreateEventObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sep3.protobuf.event.CreateEventObject();
  }

  public static via.sep3.protobuf.event.CreateEventObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEventObject>
      PARSER = new com.google.protobuf.AbstractParser<CreateEventObject>() {
    @java.lang.Override
    public CreateEventObject parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateEventObject(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateEventObject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEventObject> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sep3.protobuf.event.CreateEventObject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

