package com.bzz.app.brokerapp.DTO;

import com.bzz.app.brokerapp.Entities.Portfolio;
import com.bzz.app.brokerapp.Entities.User;

public class PortfolioDTO {

    private final Portfolio porfolio;

    public PortfolioDTO(Portfolio portfolio){
        this.porfolio = portfolio;
    }

    public String getName() {
        return this.porfolio.getName();
    }

    public User getUser(){
        return this.porfolio.getUser();
    }

}
