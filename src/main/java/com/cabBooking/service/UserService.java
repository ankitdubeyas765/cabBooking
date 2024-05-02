package com.cabBooking.service;

import com.cabBooking.entity.User;
import com.cabBooking.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public User saveUser(User user) {
       return userRepository.save(user);

    }
}
