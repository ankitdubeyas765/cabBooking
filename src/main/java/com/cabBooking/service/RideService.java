package com.cabBooking.service;

import com.cabBooking.entity.Ride;
import com.cabBooking.exception.NotFoundException;
import com.cabBooking.repository.RideRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RideService {

    private final RideRepository rideRepository;
    public List<Ride> findRide(String username, String source, String destination) {
        return rideRepository.findBySourceAndDestination(source, destination);
    }

    public Ride addRide(Ride ride) {
       return rideRepository.save(ride);
    }

    public Ride chooseRide(String username, String driverName) {
        List<Ride> rides = rideRepository.findByDriverName(driverName);
        if (!rides.isEmpty()) {
            return rides.get(0);
        } else {
            throw new NotFoundException("No ride found for driver: " + driverName);
        }
    }
    }

