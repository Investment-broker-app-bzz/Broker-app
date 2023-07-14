package com.bzz.app.brokerapp.services.repositories;

import com.bzz.app.brokerapp.services.DTO.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {
}