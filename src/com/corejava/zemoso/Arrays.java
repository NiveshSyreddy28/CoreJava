package com.corejava.zemoso;

public class Arrays {
    public static void main(String[] args) {
        int [] myArray = new int[5];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;

        for (int num: myArray) {
            System.out.println(num);
        }
    }
}
