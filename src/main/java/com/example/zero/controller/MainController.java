package com.example.zero.controller;

import com.example.zero.repository.UserRepository;
import com.example.zero.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final UserService userService;
    private final UserRepository userRepository;

    @GetMapping("/")
    public void getUsers() {
        userService.saveUser();
    }

    @GetMapping("/find")
    public void findUser() {
        System.out.println(userService.findUser());
    }
}
