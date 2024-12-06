package org.example.Service;

import org.springframework.stereotype.Service;
import jakarta.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@Service
@WebService(endpointInterface = "org.example.Service.ReservationService")
public class ReservationServiceImpl implements ReservationService {

    private final List<String> reservations = new ArrayList<>();

    @Override
    public String createReservation(String clientName, String roomType, String checkInDate, String checkOutDate) {
        String reservation = String.format("Reservation for %s in %s from %s to %s", clientName, roomType, checkInDate, checkOutDate);
        reservations.add(reservation);
        return "Reservation created: " + reservation;
    }

    @Override
    public List<String> getReservations() {
        return reservations;
    }

    @Override
    public String updateReservation(Long id, String roomType) {
        if (id < reservations.size()) {
            String updatedReservation = reservations.get(id.intValue()) + " - Updated to room type: " + roomType;
            reservations.set(id.intValue(), updatedReservation);
            return "Reservation updated: " + updatedReservation;
        }
        return "Reservation not found.";
    }

    @Override
    public String deleteReservation(Long id) {
        if (id < reservations.size()) {
            reservations.remove(id.intValue());
            return "Reservation deleted.";
        }
        return "Reservation not found.";
    }
}

