package com.demo.cashierapp.service.role;

import com.demo.cashierapp.entity.Role;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RoleService {
    Role save(Role role);

    ResponseEntity<Role> getById(Long id);

    List<Role> getAll();

    void delete(Role role);

    void deleteById(Long id);
}
