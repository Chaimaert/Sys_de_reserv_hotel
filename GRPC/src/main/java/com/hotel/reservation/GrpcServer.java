/*package com.hotel.reservation;

import com.hotel.reservation.ReservationServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new ReservationServiceImpl())
                .build();

        System.out.println("Serveur gRPC démarré sur le port 8080...");
        server.start();
        server.awaitTermination();
    }
}
*/