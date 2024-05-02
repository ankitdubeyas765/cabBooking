package com.cabBooking.config;

import com.cabBooking.entity.Driver;
import com.cabBooking.entity.Ride;
import com.cabBooking.service.DriverService;
import com.cabBooking.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RideDataLoader implements CommandLineRunner {

    private final RideService rideService;
    private final DriverService driverService;

    @Autowired
    public RideDataLoader(RideService rideService, DriverService driverService) {
        this.rideService = rideService;
        this.driverService = driverService;
    }

    @Override
    public void run(String... args) throws Exception {
        Driver driver = driverService.findDriverById(1L);
        Ride ride = Ride.builder()
                .driver(driver)
                .source("sector 70")
                .destination("sector 132")
                .build();

        rideService.addRide(ride);
    }
}