package com.cabBooking;

import com.cabBooking.entity.Ride;
import com.cabBooking.service.RideService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DemoDriver {

    @Autowired
    private RideService rideService;

    @Test
    public void demo() {

        Ride ride1 = new Ride();
        ride1.setSource("Sector 87");
        ride1.setDestination("delhi");
        rideService.addRide(ride1);


        Ride ride2 = new Ride();
        ride2.setSource("phase 3");
        ride2.setDestination("banglore");
        rideService.addRide(ride2);


        List<Ride> rides = rideService.findRide("Ankit", "sector 87", "delhi");
        System.out.println("Found rides:");
        for (Ride ride : rides) {
            System.out.println(ride);
        }


        Ride chosenRide = rideService.chooseRide("Ankit", "Rahul");
        System.out.println("Chosen ride: " + chosenRide);
    }
}