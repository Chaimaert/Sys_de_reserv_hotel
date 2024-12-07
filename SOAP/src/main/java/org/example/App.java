package org.example;

import jakarta.xml.ws.Endpoint;
import org.example.services.ReservationServiceImpl;

public class App {
    public static void main(String[] args) {
        String url = "http://localhost:8080/ws/reservation";
        Endpoint.publish(url, new ReservationServiceImpl());
        System.out.println("SOAP Service is running at: " + url + "?wsdl");
    }
}
