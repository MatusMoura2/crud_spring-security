package com.matus.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matus.springsecurity.entities.Role;

@Repository
public interface RoleReposytory extends JpaRepository<Role, Long>{

}
