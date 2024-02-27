package com.example.SecurityGi.role;

import lombok.Getter;

@Getter
public enum UserRole {
    USER,
    ADMIN;

    private String role;

    UserRole() {
    }
}