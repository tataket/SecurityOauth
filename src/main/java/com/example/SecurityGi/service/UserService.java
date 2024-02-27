package com.example.SecurityGi.service;


import com.example.SecurityGi.dto.UserDto;
import com.example.SecurityGi.entity.User;
import com.example.SecurityGi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(e -> UserDto.builder().username(e.getUsername()).build())
                .toList();
    }

    public void addAndCreateUser(UserDto userDto) {
        User newUser = new User();
        newUser.setUsername(userDto.getUsername());
        newUser.setPassword(userDto.getPassword());
        newUser.setUserRole(userDto.getUserRole());
        userRepository.save(newUser);
    }
}
