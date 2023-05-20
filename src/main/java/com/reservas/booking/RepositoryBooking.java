package com.reservas.booking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryBooking extends JpaRepository <Booking,Long> {
}
