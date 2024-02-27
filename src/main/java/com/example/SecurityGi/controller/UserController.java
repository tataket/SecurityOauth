package com.example.SecurityGi.controller;

import com.example.SecurityGi.dto.UserDto;
import com.example.SecurityGi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/useroauth")
@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addAndCreateUser(@RequestBody UserDto userDto) {
        userService.addAndCreateUser(userDto);

    }
}

