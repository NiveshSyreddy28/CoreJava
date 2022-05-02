package com.corejava.zemoso;
import java.util.Scanner;
public class Project01_02_DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer:\t");
        int number = scanner.nextInt();

        if (number%3==0){
            System.out.println(number+" is divisible by three");
        }
        else {
            System.out.println(number+" not divisible by three");
        }
    }
}
