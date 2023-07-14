package com.bzz.app.brokerapp.services.repositories;

import com.bzz.app.brokerapp.services.DTO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}