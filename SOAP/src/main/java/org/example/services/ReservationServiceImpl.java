package org.example.services;

import org.example.entities.Reservation;
import org.example.repositories.ReservationRepository;

import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@WebService(endpointInterface = "org.example.services.ReservationService")
@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation creerReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation consulterReservation(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public Reservation modifierReservation(Long id, Reservation reservation) {
        reservation.setId(id);
        return reservationRepository.save(reservation);
    }

    @Override
    public boolean supprimerReservation(Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Reservation> listerReservations() {
        return reservationRepository.findAll();
    }
}


