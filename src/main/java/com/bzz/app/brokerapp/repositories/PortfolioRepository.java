package com.bzz.app.brokerapp.repositories;

import com.bzz.app.brokerapp.Entities.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {

    @Query("SELECT p FROM Portfolio p WHERE p.user = ?1")
    Optional<Portfolio> findPortfolioByUser(String name);

}