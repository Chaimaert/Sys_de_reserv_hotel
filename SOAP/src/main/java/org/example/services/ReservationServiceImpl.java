package org.example.services;


import jakarta.jws.WebService;
import org.example.entities.Chambre;
import org.example.entities.Client;
import org.example.entities.Reservation;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "org.example.services.ReservationService")
public class ReservationServiceImpl implements ReservationService {

    private Map<Integer, Reservation> reservations = new HashMap<>();
    private int reservationCounter = 1;

    @Override
    public String createReservation(Client client, Chambre chambre, String dateDebut, String dateFin, String preferences) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = sdf.parse(dateDebut);
            Date endDate = sdf.parse(dateFin);

            Reservation reservation = new Reservation();
            reservation.setId(reservationCounter++);
            reservation.setClient(client);
            reservation.setChambre(chambre);
            reservation.setDateDebut(startDate);
            reservation.setDateFin(endDate);
            reservation.setPreferences(preferences);
            reservations.put(reservation.getId(), reservation);
            return "Reservation created with ID: " + reservation.getId();
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format. Expected yyyy-MM-dd.");
        }
    }

    @Override
    public Reservation getReservationDetails(int reservationId) {
        return reservations.get(reservationId);
    }

    @Override
    public String updateReservation(int reservationId, Chambre chambre, String dateDebut, String dateFin, String preferences) {
        Reservation reservation = reservations.get(reservationId);
        System.out.println("Current Reservations: " + reservations);

        if (reservation == null) {
            return "Reservation not found";
        }

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = sdf.parse(dateDebut);
            Date endDate = sdf.parse(dateFin);

            // Update reservation details
            if (chambre != null) {
                reservation.setChambre(chambre);
            }
            reservation.setDateDebut(startDate);
            reservation.setDateFin(endDate);
            reservation.setPreferences(preferences);

            return "Reservation updated successfully";
        } catch (ParseException e) {
            return "Invalid date format. Expected yyyy-MM-dd.";
        }
    }


    @Override
    public String deleteReservation(int reservationId) {
        if (reservations.remove(reservationId) != null) {
            return "Reservation deleted successfully";
        }
        return "Reservation not found";
    }
}

