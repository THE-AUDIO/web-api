package com.api.web_api.controler;

import com.api.web_api.model.UserEntity;
import com.api.web_api.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationControler {
    @Autowired
    private CustomUserDetailsService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping(value = "req/signup", consumes = "application/json")
    public UserEntity Regsistration(@RequestBody UserEntity newUser) {
        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
        return this.userService.registry(newUser);
    }

}
