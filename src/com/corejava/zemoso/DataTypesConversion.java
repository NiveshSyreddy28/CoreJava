package com.corejava.zemoso;

public class DataTypesConversion {
    public static void main(String[] args) {
        double myDouble = 3.14;
        float myFloat = 3.14f; //narrowing/lossy conversion
        double yourDouble = myFloat; //widening/lossless conversion
        System.out.println("Standard Double: "+myDouble);
        System.out.println("Standard Float: "+myFloat);
        System.out.println("Float converted to Double: "+yourDouble);
    }
}
