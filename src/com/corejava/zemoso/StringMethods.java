package com.corejava.zemoso;

public class StringMethods {
    public static void main(String[] args) {
        String myName = "Nivesh";
        String yourName = "Krishna";
        String name = "Nivesh";

        for (int i = 0;i<myName.length();i++){
            System.out.print(myName.charAt(i)+" ");
        }

        System.out.println();
        if (myName.equals(name)){
            System.out.println("Names are equal");
        }
        else {
            System.out.println("Names are not equal");
        }

        if (myName.compareTo(yourName)>0){
            System.out.println("My name > Your name");
        }
        else {
            System.out.println("My name < Your name");
        }
    }
}
