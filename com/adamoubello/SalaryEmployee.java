package com.adamoubello;

/**
 * Created bby Bello Adamou on 3/21/2025.
 * Class: SalaryEmployee.java
 */
public class SalaryEmployee extends Employee {

    public SalaryEmployee(String name, Integer bankAccount, Double grossWage, Double allowance) {
        super(name, bankAccount, grossWage, allowance);
    }

    @Override
    public void giveBonus(Double percentage) {
        currentBonus += grossWage * (percentage/100.0);
    }

    @Override
    public Double grossPayment() {
        return grossWage + doCurrentBonus();
    }

}
