package com.demo.cashierapp.controller;

import com.demo.cashierapp.entity.Role;
import com.demo.cashierapp.service.role.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/role")
@RequiredArgsConstructor
public class RoleController {
    private final RoleService roleService;

    @GetMapping
    public List<Role> getAll() {
        return roleService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Role> getRoleById(@PathVariable Long id) {
        return roleService.getById(id);
    }

    @PostMapping
    public Role save(@RequestBody Role role) {
        return roleService.save(role);
    }

    @DeleteMapping
    public void delete(@RequestBody Role role) {
        roleService.delete(role);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        roleService.deleteById(id);
    }

}
