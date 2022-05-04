package com.corejava.zemoso;

import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] myArray = new int[3][3];
        fillArray(myArray);
        printArray(myArray);

        twiceArray(myArray);
        System.out.println();
        printArray(myArray);
    }

    public static void fillArray(int[][] array){
        Random random = new Random();
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                array[i][j] = random.nextInt(100);
            }
        }
    }

    public static void printArray(int[][] array){
        for (int[] row: array) {
            for (int column: row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void twiceArray(int[][] array){
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                array[i][j] *= 2;
            }
        }
    }
}
