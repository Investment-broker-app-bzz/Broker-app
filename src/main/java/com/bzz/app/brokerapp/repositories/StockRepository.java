package com.bzz.app.brokerapp.repositories;

import com.bzz.app.brokerapp.Entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}