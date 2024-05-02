package com.cabBooking.service;

import com.cabBooking.entity.Driver;
import com.cabBooking.exception.NotFoundException;
import com.cabBooking.repository.DriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriverService {

    private final DriverRepository driverRepository;

    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    public Driver findDriverById(long id) {
        return driverRepository.findDriverById(id)
                .orElseThrow(() -> new NotFoundException("Driver not found with id: " + id));
    }
}
