package com.auth1.auth.learn.service;

import com.auth1.auth.learn.models.User;
import com.auth1.auth.learn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private UserRepository userRepository;
    public User signup(String email, String name, String password){

        User user= new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword();
        return userRepository.save(user);
    }
}
