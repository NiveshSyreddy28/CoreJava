package com.corejava.zemoso;
import java.util.*;
public class Project02_02_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> myArrayList= new ArrayList<>();

        System.out.println("Enter a real number");
        double input = scanner.nextDouble();
        while (input>=0){
            myArrayList.add(input);

            System.out.println("Enter a real number");
            input = scanner.nextDouble();
        }
        System.out.println("Printing Array List in revere order");
        for (int i = myArrayList.size()-1;i >= 0;i--){
            System.out.println(myArrayList.get(i));
        }
    }
}
