package com.corejava.zemoso;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        String city;

        System.out.println("What is your name?");
        name = scanner.nextLine();

        System.out.println("What is you age?");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What city do you live in?");
        city = scanner.nextLine();

        System.out.println("Hello, "+name);
        System.out.println("Your age = "+age);
        System.out.println("You live in: "+city);
    }
}
