// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Report.proto

package via.sep3.protobuf.report;

/**
 * Protobuf type {@code LocationObject}
 */
public final class LocationObject extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LocationObject)
    LocationObjectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocationObject.newBuilder() to construct.
  private LocationObject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocationObject() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LocationObject();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LocationObject(
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
          case 9: {

            latitude_ = input.readDouble();
            break;
          }
          case 17: {

            longitude_ = input.readDouble();
            break;
          }
          case 24: {

            size_ = input.readInt32();
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
    return via.sep3.protobuf.report.ReportOuterClass.internal_static_LocationObject_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sep3.protobuf.report.ReportOuterClass.internal_static_LocationObject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sep3.protobuf.report.LocationObject.class, via.sep3.protobuf.report.LocationObject.Builder.class);
  }

  public static final int LATITUDE_FIELD_NUMBER = 1;
  private double latitude_;
  /**
   * <code>double latitude = 1;</code>
   * @return The latitude.
   */
  @java.lang.Override
  public double getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private double longitude_;
  /**
   * <code>double longitude = 2;</code>
   * @return The longitude.
   */
  @java.lang.Override
  public double getLongitude() {
    return longitude_;
  }

  public static final int SIZE_FIELD_NUMBER = 3;
  private int size_;
  /**
   * <pre>
   *there is no byte type, so it is a bit inefficient
   * </pre>
   *
   * <code>int32 size = 3;</code>
   * @return The size.
   */
  @java.lang.Override
  public int getSize() {
    return size_;
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
    if (java.lang.Double.doubleToRawLongBits(latitude_) != 0) {
      output.writeDouble(1, latitude_);
    }
    if (java.lang.Double.doubleToRawLongBits(longitude_) != 0) {
      output.writeDouble(2, longitude_);
    }
    if (size_ != 0) {
      output.writeInt32(3, size_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(latitude_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, latitude_);
    }
    if (java.lang.Double.doubleToRawLongBits(longitude_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, longitude_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, size_);
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
    if (!(obj instanceof via.sep3.protobuf.report.LocationObject)) {
      return super.equals(obj);
    }
    via.sep3.protobuf.report.LocationObject other = (via.sep3.protobuf.report.LocationObject) obj;

    if (java.lang.Double.doubleToLongBits(getLatitude())
        != java.lang.Double.doubleToLongBits(
            other.getLatitude())) return false;
    if (java.lang.Double.doubleToLongBits(getLongitude())
        != java.lang.Double.doubleToLongBits(
            other.getLongitude())) return false;
    if (getSize()
        != other.getSize()) return false;
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
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLatitude()));
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLongitude()));
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sep3.protobuf.report.LocationObject parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.protobuf.report.LocationObject parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.protobuf.report.LocationObject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.protobuf.report.LocationObject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.protobuf.report.LocationObject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.protobuf.report.LocationObject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.protobuf.report.LocationObject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.protobuf.report.LocationObject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.protobuf.report.LocationObject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sep3.protobuf.report.LocationObject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.protobuf.report.LocationObject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.protobuf.report.LocationObject parseFrom(
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
  public static Builder newBuilder(via.sep3.protobuf.report.LocationObject prototype) {
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
   * Protobuf type {@code LocationObject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LocationObject)
      via.sep3.protobuf.report.LocationObjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sep3.protobuf.report.ReportOuterClass.internal_static_LocationObject_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sep3.protobuf.report.ReportOuterClass.internal_static_LocationObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sep3.protobuf.report.LocationObject.class, via.sep3.protobuf.report.LocationObject.Builder.class);
    }

    // Construct using via.sep3.protobuf.report.LocationObject.newBuilder()
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
      latitude_ = 0D;

      longitude_ = 0D;

      size_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sep3.protobuf.report.ReportOuterClass.internal_static_LocationObject_descriptor;
    }

    @java.lang.Override
    public via.sep3.protobuf.report.LocationObject getDefaultInstanceForType() {
      return via.sep3.protobuf.report.LocationObject.getDefaultInstance();
    }

    @java.lang.Override
    public via.sep3.protobuf.report.LocationObject build() {
      via.sep3.protobuf.report.LocationObject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sep3.protobuf.report.LocationObject buildPartial() {
      via.sep3.protobuf.report.LocationObject result = new via.sep3.protobuf.report.LocationObject(this);
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
      result.size_ = size_;
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
      if (other instanceof via.sep3.protobuf.report.LocationObject) {
        return mergeFrom((via.sep3.protobuf.report.LocationObject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sep3.protobuf.report.LocationObject other) {
      if (other == via.sep3.protobuf.report.LocationObject.getDefaultInstance()) return this;
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
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
      via.sep3.protobuf.report.LocationObject parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sep3.protobuf.report.LocationObject) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double latitude_ ;
    /**
     * <code>double latitude = 1;</code>
     * @return The latitude.
     */
    @java.lang.Override
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <code>double latitude = 1;</code>
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(double value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double latitude = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      
      latitude_ = 0D;
      onChanged();
      return this;
    }

    private double longitude_ ;
    /**
     * <code>double longitude = 2;</code>
     * @return The longitude.
     */
    @java.lang.Override
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <code>double longitude = 2;</code>
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(double value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double longitude = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      
      longitude_ = 0D;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <pre>
     *there is no byte type, so it is a bit inefficient
     * </pre>
     *
     * <code>int32 size = 3;</code>
     * @return The size.
     */
    @java.lang.Override
    public int getSize() {
      return size_;
    }
    /**
     * <pre>
     *there is no byte type, so it is a bit inefficient
     * </pre>
     *
     * <code>int32 size = 3;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *there is no byte type, so it is a bit inefficient
     * </pre>
     *
     * <code>int32 size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      
      size_ = 0;
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


    // @@protoc_insertion_point(builder_scope:LocationObject)
  }

  // @@protoc_insertion_point(class_scope:LocationObject)
  private static final via.sep3.protobuf.report.LocationObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sep3.protobuf.report.LocationObject();
  }

  public static via.sep3.protobuf.report.LocationObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationObject>
      PARSER = new com.google.protobuf.AbstractParser<LocationObject>() {
    @java.lang.Override
    public LocationObject parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LocationObject(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LocationObject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationObject> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sep3.protobuf.report.LocationObject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

