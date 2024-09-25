package com.api.web_api.service;

import com.api.web_api.model.UserEntity;
import com.api.web_api.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@Data
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity registry(UserEntity newUser){
        if(this.userRepository.findByUsername(newUser.getUsername())!= null){
            throw new RuntimeException("User already exist");
        }
        return   this.userRepository.save(newUser);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = this.userRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("User not found");
        } else{
            return new User(user.getUsername(), user.getPassword(), Collections.emptyList());
        }
    }

}
