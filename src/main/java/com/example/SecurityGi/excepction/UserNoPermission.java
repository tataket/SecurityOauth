package com.example.SecurityGi.excepction;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class UserNoPermission extends RuntimeException{

    public UserNoPermission (String message) {
        super();
    }
}
