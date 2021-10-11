package com.demo.cashierapp.repository;

import com.demo.cashierapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {//pagination-i hamar aveli lava sa
    User findUserByUsername(String username);
}
