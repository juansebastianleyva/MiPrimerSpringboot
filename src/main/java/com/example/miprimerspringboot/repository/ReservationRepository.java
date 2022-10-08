package com.example.miprimerspringboot.repository;

import com.example.miprimerspringboot.entidades.Reservation;
import com.example.miprimerspringboot.repository.CRUDRepository.ReservationCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCRUDRepository reservationCRUDRepository;

    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCRUDRepository.findAll();
    }

    public Reservation save(Reservation r){
        return reservationCRUDRepository.save(r);
    }

    public List<Reservation> getReservationPeriod(Date date1, Date date2) {
        return reservationCRUDRepository.findAllByStartDateAfterAndStartDateBefore(date1,date2);
    }
}
