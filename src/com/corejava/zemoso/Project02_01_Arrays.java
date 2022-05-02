package com.corejava.zemoso;
import java.util.Scanner;
public class Project02_01_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[5];

        System.out.println("Enter 5 integers");
        for (int i =0;i<myArray.length;i++){
            myArray[i] = scanner.nextInt();
        }
        System.out.println("Array Elements after multiplying with 2:");
        for (int i=0; i< myArray.length;i++){
            System.out.println(myArray[i] * 2);
        }
    }
}
