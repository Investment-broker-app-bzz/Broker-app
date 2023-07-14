package com.bzz.app.brokerapp.controllers;

import com.bzz.app.brokerapp.Entities.PortfolioStock;
import com.bzz.app.brokerapp.repositories.PortfolioStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/portfolio-stocks")
public class PortfolioStockController {

    private final PortfolioStockRepository portfolioStockRepository;

    @Autowired
    public PortfolioStockController(PortfolioStockRepository portfolioStockRepository) {
        this.portfolioStockRepository = portfolioStockRepository;
    }

    @PostMapping("/buy")
    public String buyStock(@ModelAttribute("portfolioStock") PortfolioStock portfolioStock) {
        // Implement your logic to buy a stock for the portfolio
        portfolioStockRepository.save(portfolioStock);
        return "redirect:/portfolios/" + portfolioStock.getPortfolio().getUser().getUsername();
    }

    @PostMapping("/sell")
    public String sellStock(@ModelAttribute("portfolioStock") PortfolioStock portfolioStock) {
        // Implement your logic to sell a stock for the portfolio
        portfolioStockRepository.delete(portfolioStock);
        return "redirect:/portfolios/" + portfolioStock.getPortfolio().getUser().getUsername();
    }
}