// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Report.proto

package via.sep3.protobuf.report;

public interface LocationObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LocationObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double latitude = 1;</code>
   * @return The latitude.
   */
  double getLatitude();

  /**
   * <code>double longitude = 2;</code>
   * @return The longitude.
   */
  double getLongitude();

  /**
   * <pre>
   *there is no byte type, so it is a bit inefficient
   * </pre>
   *
   * <code>int32 size = 3;</code>
   * @return The size.
   */
  int getSize();
}
