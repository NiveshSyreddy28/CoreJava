package com.corejava.zemoso;
import java.util.Random;
public class RandomClass {
    public static void main(String[] args) {

        Random random = new Random();
        int myRandomNumber;
        myRandomNumber = random.nextInt();
        System.out.println("Random number:\t"+ myRandomNumber);

        //Random between range 0 to 1000
        myRandomNumber = random.nextInt(1000);
        System.out.println("Random Number between range 0 to 1000:\t"+myRandomNumber);

        //Shifting random number
        myRandomNumber = random.nextInt(1000)+1;
        System.out.println("Random number in the range including 0 and 1000:\t"+myRandomNumber);
    }
}
