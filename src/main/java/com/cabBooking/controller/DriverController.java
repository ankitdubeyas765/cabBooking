package com.cabBooking.controller;

import com.cabBooking.entity.Driver;
import com.cabBooking.entity.User;
import com.cabBooking.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/drivers")
@RequiredArgsConstructor
public class DriverController {

    private final DriverService driverService;


    @PostMapping
    public ResponseEntity<Driver> createDriver(@RequestBody Driver driver){
        Driver drivers=driverService.saveDriver(driver);
        return new ResponseEntity<>(drivers, HttpStatus.CREATED);
    }
}
