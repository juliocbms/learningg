package com.jbraga.learningg.repositories;

import com.jbraga.learningg.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
