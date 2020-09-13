package com.neill.ESPNTechInterview.model;

public class Account {
    private String name;
    private String currency;
    private Double balance;
    private boolean treasurer;

    public Account(String name, String currency, Double balance, boolean Treasurer){
        this.balance = balance;
        this.name = name;
        this.currency = currency;
        this.treasurer = false;
    }

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public Double getBalance() {
        return balance;
    }

    public boolean isTreasurer() {
        return treasurer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void printBankDetails() {
        System.out.println("Account Name: " + name);
        System.out.println("Bank Balance: " + balance);
    }

    public void transfer(double amount, Account account) {
        if (treasurer == false) {
            if(balance <= 0) {
                System.out.println("You will not be allowed to transfer anymore funds as you have reached your minimum balance");
            } else {
                balance -= amount;
                account.setBalance(getBalance() + amount);
                    System.out.println("Your new balance is £ " + balance);
            }
        } else {
            balance -= amount;
            account.setBalance(account.getBalance() + amount);
            System.out.println("Your new balance is £ " + balance);
        }
    }

}

