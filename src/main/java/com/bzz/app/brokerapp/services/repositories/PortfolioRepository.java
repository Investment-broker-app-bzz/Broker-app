package com.bzz.app.brokerapp.services.repositories;

import com.bzz.app.brokerapp.services.DTO.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Integer> {
}