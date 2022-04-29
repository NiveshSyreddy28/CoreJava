package com.corejava.zemoso;
import java.util.Scanner;
public class AverageOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum,secondNum,thirdNum;

        System.out.println("Enter the first real number:");
        firstNum = scanner.nextDouble();

        System.out.println("Enter the second real number:");
        secondNum = scanner.nextDouble();

        System.out.println("Enter the third real number:");
        thirdNum = scanner.nextDouble();

        System.out.println("Average of three numbers is = "+(firstNum+secondNum+thirdNum)/3);
    }
}
