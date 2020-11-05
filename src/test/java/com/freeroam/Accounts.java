package com.freeroam;

public class Accounts implements Actions {

    private String AcctHolder;
    private String AcctNumber;
    private double Balance;

    Accounts() {

    }

    public void setAcctHolder(String AcctHolder) {
        this.AcctHolder = AcctHolder;

    }

    public void setAcctNumber(String AcctNumber) {
        this.AcctNumber = "************" + AcctNumber.substring(12, 16);
    }

    public String getAcctHolder() {
        return AcctHolder;

    }

    public String getAcctNumber() {
        return AcctNumber;
    }

    public double getBalance() {
        return Balance;
    }

    @Override
    public void withdraw(double Balance) {
        if (this.Balance >= Balance && Balance > 0) {
            this.Balance -= Balance;

        } else {
            System.out.println("No balance remaining");
        }
    }

    @Override
    public void deposit(double Balance) {
        this.Balance += Balance;
    }
}
