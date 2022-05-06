package com.corejava.zemoso.oops.encapsulation;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("Nivesh Syreddy");
//        myAccount.printAccountDetails();
//        myAccount.withdraw(500);
//        myAccount.printAccountDetails();
//        myAccount.deposit(-500);
//        myAccount.printAccountDetails();
//        myAccount.deposit(500);
//        myAccount.printAccountDetails();
//        myAccount.withdraw(600);
//        myAccount.printAccountDetails();
//        myAccount.withdraw(400);
//        myAccount.printAccountDetails();

        BankAccount yourAccount = new BankAccount("Ram",1000);
        yourAccount.printAccountDetails();
        yourAccount.withdraw(-1000);
        yourAccount.withdraw(0);
        yourAccount.deposit(0);
        yourAccount.deposit(10);
        yourAccount.withdraw(500);


    }
}
