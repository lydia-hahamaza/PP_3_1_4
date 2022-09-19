package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    void add(User user);

    List<User> getAll();

    User findByUserId(int id);

    void update(User user);

    void delete(int id);

    User getUserByLogin(String username);

    User passwordCoder(User user);
}
