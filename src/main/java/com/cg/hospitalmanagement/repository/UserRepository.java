package com.cg.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.hospitalmanagement.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
