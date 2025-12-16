package org.lessons.java.snacks.snack2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("s5f6s-dsad09f-dasfas9d8f");

        System.out.println("Il tuo saldo attuale è: " + account1.getAccountBalance());

        account1.makeADeposit(BigDecimal.valueOf(150));

        System.out.println("Il tuo saldo attuale è: " + account1.getAccountBalance());

        BigDecimal withdrawal1 = account1.makeAWithdrawal(BigDecimal.valueOf(50));

        System.out.println("Prelievo di: " + withdrawal1);

        System.out.println("Il tuo saldo attuale è: " + account1.getAccountBalance());
    }
}
