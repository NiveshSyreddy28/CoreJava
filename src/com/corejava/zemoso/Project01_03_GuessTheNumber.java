package com.corejava.zemoso;
import java.util.Scanner;
import java.util.Random;
public class Project01_03_GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your integer guess between 1 to 100");
        int guess = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;

        int numberOfGuesses=1;
        while(guess != randomNumber){
            numberOfGuesses +=1;
            if (guess < randomNumber){
                System.out.println("Your guess is too low");
            }
            else{
                System.out.println("Your guess is too high");
            }
            System.out.println("Enter your integer guess");
            guess = scanner.nextInt();
        }
        System.out.println("Congratulations! you guessed the right number in "+numberOfGuesses+" guesses! Thanks for playing!");
    }
}
