// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Auth.proto

package via.sep3.protobuf.auth;

public final class AuthOuterClass {
  private AuthOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RegisterUserInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegisterUserInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LoginUserInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LoginUserInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetUserByEmailInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetUserByEmailInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserOutput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserOutput_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nAuth.proto\"F\n\021RegisterUserInput\022\020\n\010use" +
      "rname\030\001 \001(\t\022\r\n\005email\030\002 \001(\t\022\020\n\010password\030\003" +
      " \001(\t\"1\n\016LoginUserInput\022\r\n\005email\030\001 \001(\t\022\020\n" +
      "\010password\030\002 \001(\t\"$\n\023GetUserByEmailInput\022\r" +
      "\n\005email\030\001 \001(\t\"Y\n\nUserOutput\022\n\n\002id\030\001 \001(\t\022" +
      "\020\n\010username\030\002 \001(\t\022\r\n\005email\030\003 \001(\t\022\020\n\010pass" +
      "word\030\004 \001(\t\022\014\n\004role\030\005 \001(\t2\223\001\n\004Auth\022+\n\010Reg" +
      "ister\022\022.RegisterUserInput\032\013.UserOutput\022)" +
      "\n\tLoginUser\022\017.LoginUserInput\032\013.UserOutpu" +
      "t\0223\n\016GetUserByEmail\022\024.GetUserByEmailInpu" +
      "t\032\013.UserOutputB\032\n\026via.sep3.protobuf.auth" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RegisterUserInput_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RegisterUserInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegisterUserInput_descriptor,
        new java.lang.String[] { "Username", "Email", "Password", });
    internal_static_LoginUserInput_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_LoginUserInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LoginUserInput_descriptor,
        new java.lang.String[] { "Email", "Password", });
    internal_static_GetUserByEmailInput_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GetUserByEmailInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetUserByEmailInput_descriptor,
        new java.lang.String[] { "Email", });
    internal_static_UserOutput_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_UserOutput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserOutput_descriptor,
        new java.lang.String[] { "Id", "Username", "Email", "Password", "Role", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
