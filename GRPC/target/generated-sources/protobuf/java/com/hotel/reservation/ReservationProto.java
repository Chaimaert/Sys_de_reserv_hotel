// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: reservation.proto
// Protobuf Java Version: 4.29.1

package com.hotel.reservation;

public final class ReservationProto {
  private ReservationProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      ReservationProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReservationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ReservationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReservationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ReservationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetReservationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GetReservationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateReservationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_UpdateReservationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteReservationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DeleteReservationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteReservationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DeleteReservationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021reservation.proto\"m\n\022ReservationReques" +
      "t\022\025\n\rcustomer_name\030\001 \001(\t\022\025\n\rcheck_in_dat" +
      "e\030\002 \001(\t\022\026\n\016check_out_date\030\003 \001(\t\022\021\n\troom_" +
      "type\030\004 \001(\t\">\n\023ReservationResponse\022\026\n\016res" +
      "ervation_id\030\001 \001(\t\022\017\n\007message\030\002 \001(\t\"/\n\025Ge" +
      "tReservationRequest\022\026\n\016reservation_id\030\001 " +
      "\001(\t\"a\n\030UpdateReservationRequest\022\026\n\016reser" +
      "vation_id\030\001 \001(\t\022\025\n\rcheck_in_date\030\002 \001(\t\022\026" +
      "\n\016check_out_date\030\003 \001(\t\"2\n\030DeleteReservat" +
      "ionRequest\022\026\n\016reservation_id\030\001 \001(\t\",\n\031De" +
      "leteReservationResponse\022\017\n\007message\030\001 \001(\t" +
      "2\246\002\n\022ReservationService\022>\n\021CreateReserva" +
      "tion\022\023.ReservationRequest\032\024.ReservationR" +
      "esponse\022>\n\016GetReservation\022\026.GetReservati" +
      "onRequest\032\024.ReservationResponse\022D\n\021Updat" +
      "eReservation\022\031.UpdateReservationRequest\032" +
      "\024.ReservationResponse\022J\n\021DeleteReservati" +
      "on\022\031.DeleteReservationRequest\032\032.DeleteRe" +
      "servationResponseB+\n\025com.hotel.reservati" +
      "onB\020ReservationProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReservationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReservationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ReservationRequest_descriptor,
        new java.lang.String[] { "CustomerName", "CheckInDate", "CheckOutDate", "RoomType", });
    internal_static_ReservationResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ReservationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ReservationResponse_descriptor,
        new java.lang.String[] { "ReservationId", "Message", });
    internal_static_GetReservationRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GetReservationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_GetReservationRequest_descriptor,
        new java.lang.String[] { "ReservationId", });
    internal_static_UpdateReservationRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_UpdateReservationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_UpdateReservationRequest_descriptor,
        new java.lang.String[] { "ReservationId", "CheckInDate", "CheckOutDate", });
    internal_static_DeleteReservationRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_DeleteReservationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_DeleteReservationRequest_descriptor,
        new java.lang.String[] { "ReservationId", });
    internal_static_DeleteReservationResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_DeleteReservationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_DeleteReservationResponse_descriptor,
        new java.lang.String[] { "Message", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
