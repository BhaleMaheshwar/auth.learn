package com.auth1.auth.learn.controller;

import com.auth1.auth.learn.dtos.SignupRequestDto;
import com.auth1.auth.learn.models.User;
import com.auth1.auth.learn.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;
    @PostMapping("/signup")
    public User signUp(@RequestBody SignupRequestDto requestDto){

    }
}
