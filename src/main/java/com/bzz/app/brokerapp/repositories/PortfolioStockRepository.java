package com.bzz.app.brokerapp.repositories;

import com.bzz.app.brokerapp.Entities.PortfolioStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioStockRepository extends JpaRepository<PortfolioStock, Long> {
}