package com.example.zero.service;

import com.example.zero.entity.Users;
import com.example.zero.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void saveTest() {
        userRepository.save(Users.builder()
                        .name("test1")
                        .email("test@com")
                        .age(18)
                        .build());
    }
}
