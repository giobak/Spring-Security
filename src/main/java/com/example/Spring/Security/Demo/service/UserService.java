package com.example.Spring.Security.Demo.service;

import com.example.Spring.Security.Demo.dto.UserDto;
import com.example.Spring.Security.Demo.model.User;

public interface UserService {
    User save (UserDto userDto);
}
