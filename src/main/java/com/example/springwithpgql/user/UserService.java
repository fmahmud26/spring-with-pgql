package com.example.springwithpgql.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;

    public List<User> findAllUsers() {
        return repository.findAll();
    }

    public void saveUser(User user) {
        repository.save(user);
    }

    public void deleteUserById(Long userId) {
        boolean exists = repository.existsById(userId);
        if (!exists) {
            throw new IllegalStateException("No user found with id = " + userId);
        }
        repository.deleteById(userId);
    }

}
