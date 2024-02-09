package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Client {

    @Id
    private Long clientID;
    private String name;

    @ManyToOne
    private FinancialAdvisor financialAdvisor;

    public Client() {
        //Constructor
    }

    public Client(String name, FinancialAdvisor financialAdvisor) {
        this.name = name;
        this.financialAdvisor = financialAdvisor;
    }

    public Long getClientID() {
        return clientID;
    }

    public String getName() {
        return name;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

}
