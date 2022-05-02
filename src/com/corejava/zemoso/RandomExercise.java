package com.corejava.zemoso;
import java.util.Random;

public class RandomExercise {
    public static void main(String[] args) {
        Random random = new Random();

        int dieFaceValue;
        for (int iter = 1;iter <= 10;iter++){
            dieFaceValue = random.nextInt(6)+1;
            System.out.print(dieFaceValue+"\t");
        }
    }
}
