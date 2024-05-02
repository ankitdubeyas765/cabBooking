package com.cabBooking.config;

import com.cabBooking.entity.Driver;
import com.cabBooking.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DriverDataLoader implements CommandLineRunner {

    private final DriverService driverService;

    @Autowired
    public DriverDataLoader(DriverService driverService) {
        this.driverService = driverService;
    }

    @Override
    public void run(String... args) throws Exception {
        Driver driver = Driver.builder()
                .name("Rahul")
                .email("rahul@example.com")
                .mobile("927373892")
                .vehicleNumber("ABC123")
                .vehicleModel("Toyota Camry")
                .currentLocation("Sector 70")
                .build();

        driverService.saveDriver(driver);
    }
}
