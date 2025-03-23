package com.adamoubello;

public class PaymentApplication {
    public static void main(final String... args) {
        // Initialization
        PaymentSystem paymentSystem = new PaymentSystem();
        CommissionEmployee johnSmith = new CommissionEmployee("John Smith", 1111, 300.0, 100.0);
        paymentSystem.addPayee(johnSmith);
        CommissionEmployee paulJones = new CommissionEmployee("Paul Jones", 2222, 350.0, 125.0);
        paymentSystem.addPayee(paulJones);
        SalaryEmployee maryBrown = new SalaryEmployee("Mary Brown", 3333, 500.0, 110.0);
        paymentSystem.addPayee(maryBrown);
        SalaryEmployee susanWhite = new SalaryEmployee("Susan White", 4444, 470.0, 130.0);
        paymentSystem.addPayee(susanWhite);
        ContractingCompany acmeInc = new ContractingCompany("Acme Inc", 5555);
        paymentSystem.addPayee(acmeInc);
        ContractingCompany javaCodeGeeks = new ContractingCompany("javacodegeeks.com", 6666);
        paymentSystem.addPayee(javaCodeGeeks);
        // Simulate Week
        johnSmith.giveCommission(40.0);
        johnSmith.giveCommission(35.0);
        johnSmith.giveCommission(45.0);
        johnSmith.giveBonus(5.0);
        paulJones.giveCommission(45.0);
        paulJones.giveCommission(51.0);
        paulJones.giveCommission(23.0);
        paulJones.giveCommission(14.5);
        paulJones.giveCommission(57.3);
        paulJones.giveBonus(6.5);
        maryBrown.giveBonus(3.0);
        susanWhite.giveBonus(7.5);
        acmeInc.payForServices(100.0);
        acmeInc.payForServices(250.0);
        acmeInc.payForServices(300.0);
        javaCodeGeeks.payForServices(400.0);
        javaCodeGeeks.payForServices(250.0);
        // Process Weekly Payment
        paymentSystem.processPayments();
    }
}
