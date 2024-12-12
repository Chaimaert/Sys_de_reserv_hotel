package org.example.config;

import org.example.services.ReservationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.xml.ws.Endpoint;

@Configuration
public class SoapConfig {

    @Bean
    public Endpoint reservationEndpoint(ReservationServiceImpl reservationService) {
        String url = "http://localhost:8080/ws/ReservationService"; // SOAP URL
        return Endpoint.publish(url, reservationService);
    }
}
