package com.cabBooking.repository;

import com.cabBooking.entity.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RideRepository extends JpaRepository<Ride,Long> {
    List<Ride> findBySourceAndDestination(String source, String destination);
    List<Ride> findByDriverName(String driverName);
}
