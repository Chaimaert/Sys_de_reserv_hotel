package org.example.Service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;

@WebService
public interface ReservationService {

    @WebMethod
    String createReservation(String clientName, String roomType, String checkInDate, String checkOutDate);

    @WebMethod
    List<String> getReservations();

    @WebMethod
    String updateReservation(Long id, String roomType);

    @WebMethod
    String deleteReservation(Long id);
}

