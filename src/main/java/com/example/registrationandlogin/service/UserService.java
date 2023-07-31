package com.example.registrationandlogin.service;

import com.example.registrationandlogin.dto.UserDto;
import com.example.registrationandlogin.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}