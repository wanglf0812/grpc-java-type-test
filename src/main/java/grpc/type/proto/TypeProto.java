// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: type.proto

package grpc.type.proto;

public final class TypeProto {
  private TypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_type_RequestId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_type_RequestId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_type_ReplyType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_type_ReplyType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_type_ReplyTypeWrapper_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_type_ReplyTypeWrapper_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntype.proto\022\004type\032\036google/protobuf/wrap" +
      "pers.proto\"\027\n\tRequestId\022\n\n\002id\030\001 \001(\003\"\352\002\n\t" +
      "ReplyType\022\n\n\002id\030\001 \001(\003\022\024\n\014type_varchar\030\002 " +
      "\001(\t\022\021\n\ttype_char\030\003 \001(\t\022\021\n\ttype_text\030\004 \001(" +
      "\t\022\024\n\014type_integer\030\005 \001(\005\022\024\n\014type_tinyint\030" +
      "\006 \001(\005\022\025\n\rtype_smallint\030\007 \001(\005\022\026\n\016type_med" +
      "iumint\030\010 \001(\005\022\023\n\013type_bigint\030\t \001(\003\022\022\n\ntyp" +
      "e_float\030\n \001(\002\022\023\n\013type_double\030\013 \001(\001\022\024\n\014ty" +
      "pe_decimal\030\014 \001(\t\022\021\n\ttype_date\030\r \001(\t\022\025\n\rt" +
      "ype_datetime\030\016 \001(\t\022\021\n\ttype_time\030\017 \001(\t\022\026\n" +
      "\016type_timestamp\030\020 \001(\t\022\021\n\ttype_blob\030\021 \001(\014" +
      "\"\347\006\n\020ReplyTypeWrapper\022\'\n\002id\030\001 \001(\0132\033.goog" +
      "le.protobuf.Int64Value\0222\n\014type_varchar\030\002" +
      " \001(\0132\034.google.protobuf.StringValue\022/\n\tty" +
      "pe_char\030\003 \001(\0132\034.google.protobuf.StringVa" +
      "lue\022/\n\ttype_text\030\004 \001(\0132\034.google.protobuf" +
      ".StringValue\0221\n\014type_integer\030\005 \001(\0132\033.goo" +
      "gle.protobuf.Int32Value\0221\n\014type_tinyint\030" +
      "\006 \001(\0132\033.google.protobuf.Int32Value\0222\n\rty" +
      "pe_smallint\030\007 \001(\0132\033.google.protobuf.Int3" +
      "2Value\0223\n\016type_mediumint\030\010 \001(\0132\033.google." +
      "protobuf.Int32Value\0220\n\013type_bigint\030\t \001(\013" +
      "2\033.google.protobuf.Int64Value\022/\n\ntype_fl" +
      "oat\030\n \001(\0132\033.google.protobuf.FloatValue\0221" +
      "\n\013type_double\030\013 \001(\0132\034.google.protobuf.Do" +
      "ubleValue\0222\n\014type_decimal\030\014 \001(\0132\034.google" +
      ".protobuf.StringValue\022/\n\ttype_date\030\r \001(\013" +
      "2\034.google.protobuf.StringValue\0223\n\rtype_d" +
      "atetime\030\016 \001(\0132\034.google.protobuf.StringVa" +
      "lue\022/\n\ttype_time\030\017 \001(\0132\034.google.protobuf" +
      ".StringValue\0224\n\016type_timestamp\030\020 \001(\0132\034.g" +
      "oogle.protobuf.StringValue\022.\n\ttype_blob\030" +
      "\021 \001(\0132\033.google.protobuf.BytesValue2z\n\004Ty" +
      "pe\0221\n\013GetTypeById\022\017.type.RequestId\032\017.typ" +
      "e.ReplyType\"\000\022?\n\022GetTypeWrapperById\022\017.ty" +
      "pe.RequestId\032\026.type.ReplyTypeWrapper\"\000B\036" +
      "\n\017grpc.type.protoB\tTypeProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_type_RequestId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_type_RequestId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_type_RequestId_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_type_ReplyType_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_type_ReplyType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_type_ReplyType_descriptor,
        new java.lang.String[] { "Id", "TypeVarchar", "TypeChar", "TypeText", "TypeInteger", "TypeTinyint", "TypeSmallint", "TypeMediumint", "TypeBigint", "TypeFloat", "TypeDouble", "TypeDecimal", "TypeDate", "TypeDatetime", "TypeTime", "TypeTimestamp", "TypeBlob", });
    internal_static_type_ReplyTypeWrapper_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_type_ReplyTypeWrapper_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_type_ReplyTypeWrapper_descriptor,
        new java.lang.String[] { "Id", "TypeVarchar", "TypeChar", "TypeText", "TypeInteger", "TypeTinyint", "TypeSmallint", "TypeMediumint", "TypeBigint", "TypeFloat", "TypeDouble", "TypeDecimal", "TypeDate", "TypeDatetime", "TypeTime", "TypeTimestamp", "TypeBlob", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}