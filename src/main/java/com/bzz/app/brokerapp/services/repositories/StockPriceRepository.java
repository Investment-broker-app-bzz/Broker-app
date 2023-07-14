package com.bzz.app.brokerapp.services.repositories;

import com.bzz.app.brokerapp.services.DTO.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockPriceRepository extends JpaRepository<StockPrice, Integer> {
}