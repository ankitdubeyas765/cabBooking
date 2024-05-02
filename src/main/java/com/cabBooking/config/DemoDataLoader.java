package com.cabBooking.config;

import com.cabBooking.entity.User;
import com.cabBooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoDataLoader implements CommandLineRunner {

    private final UserService userService;

    @Autowired
    public DemoDataLoader(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {

        User user = User.builder()
                .name("Ankit")
                .city("Noida")
                .email("ankit@gmail.com")
                .mobile("9113129600")
                .state("UP")
                .country("India")
                .pincode("123456")
                .password("ankit1234")
                .build();

        userService.saveUser(user);
    }
}