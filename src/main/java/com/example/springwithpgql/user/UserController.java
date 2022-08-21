package com.example.springwithpgql.user;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("/users")
    private List<User> getAllUsers() {
        return service.findAllUsers();
    }

    @PostMapping("/user")
    private void addNewUser(@RequestBody User user) {
        service.saveUser(user);
    }

    @DeleteMapping("/user/{userId}")
    private void deleteUser(@PathVariable("userId") Long userId) {
        service.deleteUserById(userId);
    }
}
