package org.example.service;

import org.example.dto.UserDto;
import org.example.web.RegisterForm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class InMemoryUserService implements UserService {
    private final Map<Long, UserDto> users = new ConcurrentHashMap<>();
    private final AtomicLong counter = new AtomicLong(1);

    @Override
    public List<UserDto> findAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public Optional<UserDto> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public UserDto create(RegisterForm registerForm) {
        Long id = counter.getAndIncrement();
        UserDto userDto = new UserDto(id, registerForm.getName());
        users.put(id, userDto);
        return userDto;
    }

    @Override
    public Optional<UserDto> findByName(String name) {
        List<UserDto> allusers = findAll();
        for (int i = 0; i < allusers.size(); i++) {
            if (allusers.get(i).getName().equals(name)) {
                return Optional.ofNullable(allusers.get(i));
            }

        }
        return Optional.empty();
    }

}
