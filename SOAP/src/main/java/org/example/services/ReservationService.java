package org.example.services;

import org.example.entities.Reservation;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;

@WebService
public interface ReservationService {
    @WebMethod
    Reservation creerReservation(Reservation reservation);

    @WebMethod
    Reservation consulterReservation(Long id);

    @WebMethod
    Reservation modifierReservation(Long id, Reservation reservation);

    @WebMethod
    boolean supprimerReservation(Long id);

    @WebMethod
    List<Reservation> listerReservations();
}
