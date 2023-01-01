package com.codehack.springsecurity.repository;

import com.codehack.springsecurity.entity.ERole;
import com.codehack.springsecurity.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(ERole name);
}
