package com.adamoubello;

/**
 * Created bby Bello Adamou on 3/21/2025.
 * Class: Employee.java
 */
public abstract class Employee implements TaxablePayee {

    private String name;
    private Integer bankAccount;
    private Double allowance;
    protected Double currentBonus;
    protected Double grossWage;

    public Employee(String name, Integer bankAccount, Double grossWage, Double allowance) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.grossWage = grossWage;
        this.allowance = allowance;
        currentBonus = 0.0;
    }
    public String name() {
        return name;
    }
    public Integer bankAccount() {
        return bankAccount;
    }
    public Double allowance() {
        return allowance;
    }
    public abstract void giveBonus(Double percentage);
    protected Double doCurrentBonus() {
        Double bonus = currentBonus;
        currentBonus = 0.0;
        return bonus;
    }

}
