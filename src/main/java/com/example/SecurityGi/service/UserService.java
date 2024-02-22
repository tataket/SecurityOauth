package com.example.SecurityGi.service;


import com.example.SecurityGi.dto.LoginUserDto;
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
                .map(e -> new UserDto(e.getUsername()))
                .toList();
    }

    public LoginUserDto addAndCreateUser(LoginUserDto loginUserDto) {
        User newUser = new User();
        newUser.setUsername(loginUserDto.getUsername());
        newUser.setPassword(loginUserDto.getPassword());
        userRepository.save(newUser);
        return loginUserDto;
    }
}
