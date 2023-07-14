package com.bzz.app.brokerapp.controllers;

import com.bzz.app.brokerapp.Entities.Portfolio;
import com.bzz.app.brokerapp.Entities.PortfolioStock;
import com.bzz.app.brokerapp.repositories.PortfolioRepository;
import com.bzz.app.brokerapp.repositories.PortfolioStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/portfolios")
public class PortfolioController {

    private final PortfolioRepository portfolioRepository;
    private final PortfolioStockRepository portfolioStockRepository;

    @Autowired
    public PortfolioController(PortfolioRepository portfolioRepository, PortfolioStockRepository portfolioStockRepository) {
        this.portfolioRepository = portfolioRepository;
        this.portfolioStockRepository = portfolioStockRepository;
    }

    @GetMapping("/{username}")
    public String getPortfolioByUsername(@PathVariable String username, Model model) {
        Optional<Portfolio> portfolioOptional = portfolioRepository.findPortfolioByUser(username);
        if (portfolioOptional.isPresent()) {
            Portfolio portfolio = portfolioOptional.get();
            model.addAttribute("portfolio", portfolio);

            List<PortfolioStock> portfolioStocks = portfolioStockRepository.findByPortfolio(portfolio);
            model.addAttribute("portfolioStocks", portfolioStocks);
        }
        return "portfolio";
    }
}