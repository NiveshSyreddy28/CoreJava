package com.corejava.zemoso;
import java.util.Scanner;
public class SelectionControlStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("Welcome to the party!!");
        System.out.println("Please Enter your age");
        age = scanner.nextInt();
        scanner.nextLine();

        //If else statements
        if (age>=21){
            System.out.println("Here's your beer");
        }
        else if (age>=16) {
            System.out.println("Here's your coke");
            System.out.println("Atleast you can drive");
        }
        else {
            System.out.println("Here's your coke");
        }
        System.out.println("Thanks for coming to the party!");

        //Switch case
        System.out.println("Enter your grade");
        char grade = scanner.nextLine().charAt(0);
        switch (grade){
            case 'A':
            case 'a':
                System.out.println("Great Job!");
                break;

            case 'B':
            case 'b':
                System.out.println("Good job!");
                break;

            case 'C':
            case 'c':
                System.out.println("You can do better");
                break;

            case 'D':
            case 'd':
                System.out.println("You are close to fail");
                break;

            case 'F':
            case 'f':
                System.out.println("You are failing the course");
                break;
            default:
                System.out.println("You've entered invalid grade");
        }
    }
}
