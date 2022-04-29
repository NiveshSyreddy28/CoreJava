package com.corejava.zemoso;
import java.util.Scanner;
public class ControlStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("Enter your age");
        age = scanner.nextInt();

        if (age>=16){
            System.out.println("You can drive");
        }
        else {
            System.out.println("You can't drive yet");
        }

        for (int iter=0;iter<=age;iter++){
            System.out.println("Happy Birthday "+iter);
        }
    }
}
