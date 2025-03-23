package com.adamoubello;

import java.util.ArrayList;
import java.util.List;


/**
 * Created bby Bello Adamou on 3/21/2025.
 * Class: PaymentSystem.java
 */
public class PaymentSystem {

    private List<Payee> payees;
    private Double taxRate = 0.2;
    public PaymentSystem() {
        payees = new ArrayList<>();
    }
    public void addPayee(Payee payee) {
        if (!payees.contains(payee)) {
            payees.add(payee);
        }
    }
    public void processPayments() {
        for (Payee payee : payees) {
            Double grossPayment = payee.grossPayment();
            Double tax = 0.0;
            if (payee instanceof TaxablePayee) {
                Double taxableIncome = grossPayment - ((TaxablePayee)payee).allowance();
                tax = taxableIncome * taxRate;
            }
            Double netPayment = grossPayment - tax;
            System.out.println("Paying to " + payee.name());
            System.out.println("\tGross\t" + grossPayment);
            System.out.println("\tTax\t\t-" + tax);
            System.out.println("\tNet\t\t" + netPayment);
            System.out.println("\tTransferred to Account: " + payee.bankAccount());
        }
    }

}
