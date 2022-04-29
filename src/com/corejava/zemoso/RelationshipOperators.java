package com.corejava.zemoso;

public class RelationshipOperators {
    public static void main(String[] args) {
        int myAge = 22;
        int yourAge = 24;
        int ramsAge = 24;
        String myName = "Nivesh";
        String yourName = "Nivesh";

        System.out.println("My age = "+myAge+"\n"+"Your age = "+yourAge+"\n"+"Ram's age = "+ramsAge);
        System.out.println("My age > Your age? "+(myAge > yourAge));
        System.out.println("Your age > Ram's age? "+(yourAge > ramsAge));
        System.out.println("Your age == Ram's age? "+(yourAge == ramsAge));

        System.out.println("My name = "+myName+"\n"+"Your name = "+yourName);
        System.out.println("Does our names match? "+(myName.equals(yourName)));
    }
}
