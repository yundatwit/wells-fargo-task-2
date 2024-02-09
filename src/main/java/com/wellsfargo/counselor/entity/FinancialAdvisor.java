package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FinancialAdvisor {

    @Id
    private Long advisorID;
    private String name;

    public FinancialAdvisor() {
        //Constructor
    }

    public FinancialAdvisor(String name) {
        this.name = name;
    }

    public Long getAdvisorID() {
        return advisorID;
    }

    public String getName() {
        return name;
    }

}
