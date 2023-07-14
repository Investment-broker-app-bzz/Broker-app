package com.bzz.app.brokerapp.services;

import com.bzz.app.brokerapp.Entities.Portfolio;
import com.bzz.app.brokerapp.repositories.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PortfolioService {

    public PortfolioRepository portfolioRepository;
    private Portfolio portfolio;

    @Autowired
    public PortfolioService(PortfolioRepository portfolioRepository){
        this.portfolioRepository = portfolioRepository;
    }

    public List<Portfolio> findPortfolioByUser() {
        Optional<Portfolio> portfolioList = portfolioRepository.findPortfolioByUser(portfolio.getName());
        return portfolioList.stream().map(Portfolio::new).collect(Collectors.toList());
    }

    public void addNewPortfolio(Portfolio portfolio) {
        Optional<Portfolio> portfolioOptional = portfolioRepository
                .findPortfolioByUser(portfolio.getName());
        if (portfolioOptional.isPresent()){
            throw new IllegalStateException("Portfolio name is already in use");

        }
        portfolioRepository.save(portfolio);
    }

}
