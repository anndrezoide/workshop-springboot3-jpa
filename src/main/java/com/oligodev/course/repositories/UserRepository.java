package com.oligodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oligodev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
