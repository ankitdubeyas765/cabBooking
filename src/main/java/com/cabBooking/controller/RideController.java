package com.cabBooking.controller;

import com.cabBooking.entity.Ride;
import com.cabBooking.service.RideService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rides")
@RequiredArgsConstructor
public class RideController {
    private final RideService rideService;

    @PostMapping("/add")
    public Ride addRide(@RequestBody Ride ride) {
        return rideService.addRide(ride);
    }
//http://localhost:8080/api/rides/find?username={username}&source={source}&destination={destination}
    @GetMapping("/find")
    public List<Ride> findRide(@RequestParam String username,
                               @RequestParam String source,
                               @RequestParam String destination) {
        return rideService.findRide(username, source, destination);

    }
    @PostMapping("/choose")
    public Ride chooseRide(@RequestParam String username,
                           @RequestParam String driverName) {
        return rideService.chooseRide(username, driverName);
    }
}

