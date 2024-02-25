package com.example.SecurityGi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.management.relation.Role;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class UserDto {

    private String username;
    private String password;
    private Role role;

}

