package com.bzz.app.brokerapp.controllers;

import com.bzz.app.brokerapp.Entities.Portfolio;
import com.bzz.app.brokerapp.services.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/portfolios")
public class PortfolioController {

    private final PortfolioService portfolioService;

    @Autowired
    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }
    @GetMapping
    public List<Portfolio> getPortfolio(){
        return portfolioService.findPortfolioByUser();
    }
    @PostMapping
    public void registerNewPortfolio(@RequestBody Portfolio portfolio){
        portfolioService.addNewPortfolio(portfolio);
    }

}
