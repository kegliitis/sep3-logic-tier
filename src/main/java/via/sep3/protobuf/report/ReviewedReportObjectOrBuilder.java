// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Report.proto

package via.sep3.protobuf.report;

public interface ReviewedReportObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ReviewedReportObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string date = 1;</code>
   * @return The date.
   */
  java.lang.String getDate();
  /**
   * <code>string date = 1;</code>
   * @return The bytes for date.
   */
  com.google.protobuf.ByteString
      getDateBytes();

  /**
   * <code>string time = 2;</code>
   * @return The time.
   */
  java.lang.String getTime();
  /**
   * <code>string time = 2;</code>
   * @return The bytes for time.
   */
  com.google.protobuf.ByteString
      getTimeBytes();

  /**
   * <code>bytes proof = 3;</code>
   * @return The proof.
   */
  com.google.protobuf.ByteString getProof();

  /**
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string updatedStatus = 5;</code>
   * @return The updatedStatus.
   */
  java.lang.String getUpdatedStatus();
  /**
   * <code>string updatedStatus = 5;</code>
   * @return The bytes for updatedStatus.
   */
  com.google.protobuf.ByteString
      getUpdatedStatusBytes();

  /**
   * <code>.LocationObject location = 6;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <code>.LocationObject location = 6;</code>
   * @return The location.
   */
  via.sep3.protobuf.report.LocationObject getLocation();
  /**
   * <code>.LocationObject location = 6;</code>
   */
  via.sep3.protobuf.report.LocationObjectOrBuilder getLocationOrBuilder();

  /**
   * <code>string creatorEmail = 7;</code>
   * @return The creatorEmail.
   */
  java.lang.String getCreatorEmail();
  /**
   * <code>string creatorEmail = 7;</code>
   * @return The bytes for creatorEmail.
   */
  com.google.protobuf.ByteString
      getCreatorEmailBytes();
}
