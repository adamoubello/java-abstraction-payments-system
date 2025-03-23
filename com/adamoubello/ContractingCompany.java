package com.adamoubello;

/**
 * Created bby Bello Adamou on 3/24/2025.
 * Class: ContractiongCompany.java
 */
public class ContractingCompany implements Payee {

    private String name;
    private Integer bankAccount;
    private Double currentBalance;

    public ContractingCompany(String name, Integer bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
        currentBalance = 0.0;
    }

    public String name() {
        return name;
    }

    public Double grossPayment() {
        return doPayment();
    }

    private Double doPayment() {
        Double balance = currentBalance;
        currentBalance = 0.0;
        return balance;
    }

    public Integer bankAccount() {
        return bankAccount;
    }
    public void payForServices(Double amount) {
        currentBalance += amount;
    }

}
