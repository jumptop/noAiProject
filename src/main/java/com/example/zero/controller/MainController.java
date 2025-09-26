package com.example.zero.controller;

import com.example.zero.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final UserService userService;

    @GetMapping("/")
    public String mainGet() {
        System.out.println(userService.saveTest());

        return "index";
    }
}
