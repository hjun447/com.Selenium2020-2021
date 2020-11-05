package com.freeroam;

public class Bank extends Accounts{

    public static void main(String[] args) {
        Accounts accounts = new Accounts();
        accounts.setAcctHolder("Junyoung Heo");
        accounts.setAcctNumber("1234567891234567");
        accounts.deposit(1000);
        accounts.withdraw(10);
        System.out.println("Account Holder: " + accounts.getAcctHolder());
        System.out.println("Account Number: " + accounts.getAcctNumber());
        System.out.println("Balance: $ " + accounts.getBalance());

    }

}
