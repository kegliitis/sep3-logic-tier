// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Event.proto

package via.sep3.protobuf.event;

public final class EventOuterClass {
  private EventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateEventObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateEventObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EventObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EventObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserEventObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserEventObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReportEventObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReportEventObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LocationEventObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LocationEventObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EventsFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EventsFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EventFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EventFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ApproveEventFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ApproveEventFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ApproveEventResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ApproveEventResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EventList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EventList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Event.proto\"l\n\021CreateEventObject\022\014\n\004da" +
      "te\030\001 \001(\t\022\014\n\004time\030\002 \001(\t\022\023\n\013description\030\003 " +
      "\001(\t\022\024\n\014creatorEmail\030\004 \001(\t\022\020\n\010reportId\030\005 " +
      "\001(\t\"\315\001\n\013EventObject\022\n\n\002id\030\001 \001(\t\022\014\n\004date\030" +
      "\002 \001(\t\022\014\n\004time\030\003 \001(\t\022\023\n\013description\030\004 \001(\t" +
      "\022\027\n\nvalidation\030\005 \001(\014H\000\210\001\001\022#\n\torganiser\030\006" +
      " \001(\0132\020.UserEventObject\022\"\n\006report\030\007 \001(\0132\022" +
      ".ReportEventObject\022\020\n\010approved\030\010 \001(\010B\r\n\013" +
      "_validation\"/\n\017UserEventObject\022\n\n\002id\030\001 \001" +
      "(\t\022\020\n\010username\030\002 \001(\t\"n\n\021ReportEventObjec" +
      "t\022\022\n\005proof\030\001 \001(\014H\000\210\001\001\022\023\n\013description\030\002 \001" +
      "(\t\022&\n\010location\030\003 \001(\0132\024.LocationEventObje" +
      "ctB\010\n\006_proof\"H\n\023LocationEventObject\022\021\n\tl" +
      "ongitude\030\001 \001(\001\022\020\n\010latitude\030\002 \001(\001\022\014\n\004size" +
      "\030\003 \001(\005\"\016\n\014EventsFilter\"\031\n\013EventFilter\022\n\n" +
      "\002id\030\001 \001(\t\"1\n\022ApproveEventFilter\022\n\n\002id\030\001 " +
      "\001(\t\022\017\n\007approve\030\002 \001(\010\"*\n\022ApproveEventResu" +
      "lt\022\024\n\014confirmation\030\001 \001(\t\")\n\tEventList\022\034\n" +
      "\006events\030\001 \003(\0132\014.EventObject2\302\001\n\005Event\022/\n" +
      "\013CreateEvent\022\022.CreateEventObject\032\014.Event" +
      "Object\022&\n\tGetEvents\022\r.EventsFilter\032\n.Eve" +
      "ntList\022&\n\010GetEvent\022\014.EventFilter\032\014.Event" +
      "Object\0228\n\014ApproveEvent\022\023.ApproveEventFil" +
      "ter\032\023.ApproveEventResultB\033\n\027via.sep3.pro" +
      "tobuf.eventP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CreateEventObject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CreateEventObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateEventObject_descriptor,
        new java.lang.String[] { "Date", "Time", "Description", "CreatorEmail", "ReportId", });
    internal_static_EventObject_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_EventObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EventObject_descriptor,
        new java.lang.String[] { "Id", "Date", "Time", "Description", "Validation", "Organiser", "Report", "Approved", "Validation", });
    internal_static_UserEventObject_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_UserEventObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserEventObject_descriptor,
        new java.lang.String[] { "Id", "Username", });
    internal_static_ReportEventObject_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ReportEventObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReportEventObject_descriptor,
        new java.lang.String[] { "Proof", "Description", "Location", "Proof", });
    internal_static_LocationEventObject_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_LocationEventObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LocationEventObject_descriptor,
        new java.lang.String[] { "Longitude", "Latitude", "Size", });
    internal_static_EventsFilter_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_EventsFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EventsFilter_descriptor,
        new java.lang.String[] { });
    internal_static_EventFilter_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_EventFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EventFilter_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_ApproveEventFilter_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_ApproveEventFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ApproveEventFilter_descriptor,
        new java.lang.String[] { "Id", "Approve", });
    internal_static_ApproveEventResult_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_ApproveEventResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ApproveEventResult_descriptor,
        new java.lang.String[] { "Confirmation", });
    internal_static_EventList_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_EventList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EventList_descriptor,
        new java.lang.String[] { "Events", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
