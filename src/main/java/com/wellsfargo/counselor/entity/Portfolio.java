package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {

    @Id
    private Long portfolioID;

    @OneToOne
    private Client client;

    public Portfolio() {
        //Constructor
    }

    public Portfolio(Client client) {
        this.client = client;
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public Client getClient() {
        return client;
    }

}
