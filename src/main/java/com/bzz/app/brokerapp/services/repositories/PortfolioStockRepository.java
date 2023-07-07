package com.bzz.app.brokerapp.services.repositories;

import com.bzz.app.brokerapp.services.DTO.PortfolioStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioStockRepository extends JpaRepository<PortfolioStock, Integer> {
}