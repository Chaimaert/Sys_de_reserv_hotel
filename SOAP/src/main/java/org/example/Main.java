package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("SOAP Service is running...");
        System.out.println("WSDL available at: http://localhost:8080/ws/ReservationService?wsdl");
    }
}
