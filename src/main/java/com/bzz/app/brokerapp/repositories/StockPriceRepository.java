package com.bzz.app.brokerapp.repositories;

import com.bzz.app.brokerapp.Entities.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockPriceRepository extends JpaRepository<StockPrice, Long> {
}