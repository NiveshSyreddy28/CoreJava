package com.corejava.zemoso.oops.encapsulation;

public class BookDemo {
    public static void main(String[] args) {
        Book TheSecret = new Book("The Secret","Rhonda","Self help",200);
        Book RichDad = new Book("Rich Dad Poor Dad","Kiyoski","Financial",250);

        TheSecret.printBook();
        RichDad.printBook();
    }
}
