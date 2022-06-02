package com.corejava.zemoso.lambdasandstreams.methodreference;

public class ScientificCalculator {

    //static method
    public static void addition(int num1, int num2){
        System.out.println(num1+ " + " + num2 + " = " + (num1+num2));
    }

    //Non-static method
    public void addTwoNumbers(int num1, int num2){
        System.out.println("Addition of " + num1 + " + " + num2 + " = " + (num1+num2));
    }
}
