package com.example.zero.service;

import com.example.zero.entity.Users;
import com.example.zero.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void saveUser() {
        userRepository.save(Users.builder()
                        .name("test1")
                        .email("test@gmail.com")
                        .age(19)
                        .build());
    }

    public List<Users> findUser() {
        List<Users> users = userRepository.findAll();
        return users;
    }
}
