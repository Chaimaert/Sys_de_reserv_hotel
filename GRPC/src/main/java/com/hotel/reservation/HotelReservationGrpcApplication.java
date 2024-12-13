package com.hotel.reservation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import io.grpc.Server;
import io.grpc.ServerBuilder;

@SpringBootApplication
public class HotelReservationGrpcApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelReservationGrpcApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {

			Server server = ServerBuilder.forPort(9090)
					.addService(new ReservationServiceImpl())
					.build();
			server.start();
			System.out.println("gRPC server started on port 9090");
			server.awaitTermination();
		};
	}
}
