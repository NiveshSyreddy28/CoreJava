package com.corejava.zemoso.oops.encapsulation;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner){
        this.owner = owner;
        this.balance = 0;
    }

    public  BankAccount(String owner, int balance){
        if(balance>0) {
            this.owner = owner;
            this.balance = balance;
        }
        else{
            System.out.println("Invalid balance. Balance should be greater than 0");
        }
    }

    public void deposit(int amount){
        if (amount>0) {
            this.balance += amount;
            System.out.println(amount+" Deposited successfully");
        }
        else {
            System.out.println("Invalid amount. Deposit amount should be greater than 0");
        }
    }

    public void withdraw(int amount){
        if (amount>0 && amount<=this.balance){
            this.balance -= amount;
            System.out.println(amount+" withdrawn successfully");
        }
        else{
            System.out.println("Invalid amount. Withdraw amount should be greater than zero " +
                    "and less than or equal to balance");
        }
    }

    public void printAccountDetails(){
        System.out.println("Account owner: "+this.owner);
        System.out.println("Account balance: "+this.balance);
    }


}
