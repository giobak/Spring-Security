package com.example.Spring.Security.Demo.dto;

import lombok.Data;

@Data
public class UserDto {

    private String email;
    private String password;
    private String role;
    private String fullname;
}
