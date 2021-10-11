package com.demo.cashierapp.service.user;

import com.demo.cashierapp.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    User save(User user);

    ResponseEntity<User> getById(Long id);

    List<User> getAll();

    void delete(User user);

    void deleteById(Long id);

    User getUserByUsername(String username);
}
