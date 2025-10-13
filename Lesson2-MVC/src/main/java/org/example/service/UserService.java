package org.example.service;

import org.example.dto.UserDto;
import org.example.web.RegisterForm;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDto> findAll();
    Optional<UserDto> findById(Long id);
    UserDto create (RegisterForm registerForm);
    Optional <UserDto> findByName(String name);
}
