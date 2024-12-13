package com.hotel.reservation;

import com.hotel.reservation.ReservationRequest;
import com.hotel.reservation.ReservationResponse;
import com.hotel.reservation.ReservationServiceGrpc;
import io.grpc.stub.StreamObserver;
import com.hotel.reservation.GetReservationRequest;
import com.hotel.reservation.UpdateReservationRequest;
import com.hotel.reservation.DeleteReservationResponse;
import com.hotel.reservation.DeleteReservationRequest;



public class ReservationServiceImpl extends ReservationServiceGrpc.ReservationServiceImplBase {

    @Override
    public void createReservation(ReservationRequest request, StreamObserver<ReservationResponse> responseObserver) {

        ReservationResponse response = ReservationResponse.newBuilder()
                .setReservationId("12345")
                .setMessage("Réservation créée avec succès")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getReservation(GetReservationRequest request, StreamObserver<ReservationResponse> responseObserver) {

        ReservationResponse response = ReservationResponse.newBuilder()
                .setReservationId(request.getReservationId())
                .setMessage("Détails de la réservation récupérés")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateReservation(UpdateReservationRequest request, StreamObserver<ReservationResponse> responseObserver) {

        ReservationResponse response = ReservationResponse.newBuilder()
                .setReservationId(request.getReservationId())
                .setMessage("Réservation mise à jour avec succès")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteReservation(DeleteReservationRequest request, StreamObserver<DeleteReservationResponse> responseObserver) {

        DeleteReservationResponse response = DeleteReservationResponse.newBuilder()
                .setMessage("Réservation supprimée avec succès")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
