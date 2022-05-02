package com.corejava.zemoso;
import java.util.ArrayList;

public class ArrayListWrapperClass {
    public static void main(String[] args) {
        ArrayList<Integer> myIntegerArrayList = new ArrayList<>();
        myIntegerArrayList.add(10);
        myIntegerArrayList.add(20);
        myIntegerArrayList.add(30);
        myIntegerArrayList.add(40);

        for (int i = 0;i<myIntegerArrayList.size();i++){
            System.out.println(myIntegerArrayList.get(i));
        }
        // Converting String to Double
        String numericString = "3.14159";
        Double doubleValue = Double.parseDouble(numericString);

        //Doing math with converted Double
        doubleValue+=1.0;
        System.out.println(doubleValue);

    }
}
