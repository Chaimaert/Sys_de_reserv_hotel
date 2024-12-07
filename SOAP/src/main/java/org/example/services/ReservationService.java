package org.example.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.example.entities.Chambre;
import org.example.entities.Client;
import org.example.entities.Reservation;

@WebService
public interface ReservationService {

    @WebMethod
    String createReservation(Client client, Chambre chambre, String dateDebut, String dateFin, String preferences);

    @WebMethod
    Reservation getReservationDetails(int reservationId);

    @WebMethod
    String updateReservation(int reservationId, Chambre chambre, String dateDebut, String dateFin, String preferences);

    @WebMethod
    String deleteReservation(int reservationId);
}

