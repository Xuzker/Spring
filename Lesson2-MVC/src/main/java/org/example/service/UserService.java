package org.example.service;

import org.example.dto.UserDto;
import org.example.web.RegisterForm;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();
    UserDto findById(Long id);
    UserDto create (RegisterForm registerForm);
}
