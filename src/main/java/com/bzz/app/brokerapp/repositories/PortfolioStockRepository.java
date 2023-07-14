package com.bzz.app.brokerapp.repositories;

import com.bzz.app.brokerapp.Entities.Portfolio;
import com.bzz.app.brokerapp.Entities.PortfolioStock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PortfolioStockRepository extends JpaRepository<PortfolioStock, Long> {

    List<PortfolioStock> findByPortfolio(Portfolio portfolio);

}
