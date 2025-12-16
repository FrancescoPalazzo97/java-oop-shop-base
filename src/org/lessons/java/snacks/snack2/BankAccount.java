package org.lessons.java.snacks.snack2;

import java.math.BigDecimal;

public class BankAccount {
    private String accountCode;
    private BigDecimal accountBalance;

    public BankAccount(String accountCode) {
        if (accountCode.trim() != "") {
            this.accountCode = accountCode;
            this.accountBalance = BigDecimal.ZERO;
        } else {
            System.out.println("INserimento non valido!");
        }
    }

    public String getAccountCode() {
        return this.accountCode;
    }

    public void makeADeposit(BigDecimal deposit) {
        this.accountBalance = this.accountBalance.add(deposit);
        System.out.println("Deposito effettuato di: " + deposit + " / Nuovo saldo: " + this.accountBalance);
    }

    public BigDecimal makeAWithdrawal(BigDecimal withdrawal) {
        if (withdrawal.compareTo(BigDecimal.ZERO) > 0) {
            this.accountBalance = this.accountBalance.subtract(withdrawal);
            System.out.println("Prelievo effettuato");
            return withdrawal;
        } else {
            System.out.println("Prelievo non effettuato!");
            return BigDecimal.ZERO;
        }
    }

    public BigDecimal getAccountBalance() {
        return this.accountBalance;
    }
}
