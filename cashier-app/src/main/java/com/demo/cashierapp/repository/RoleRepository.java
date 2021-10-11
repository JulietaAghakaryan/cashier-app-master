package com.demo.cashierapp.repository;

import com.demo.cashierapp.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role getRoleByRoleName(String roleName);
}
