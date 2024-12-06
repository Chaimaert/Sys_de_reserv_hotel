package org.example;

import jakarta.xml.ws.Endpoint;
import org.example.Service.ReservationServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig implements CommandLineRunner {

    @Override
    public void run(String... args) {
        try {
            // Publish the SOAP service
            Endpoint.publish("http://localhost:8080/ReservationService", new ReservationServiceImpl());
            System.out.println("SOAP Service is running at http://localhost:8080/ReservationService");
        } catch (Exception e) {
            System.err.println("Failed to publish SOAP service: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
