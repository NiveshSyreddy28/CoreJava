package com.corejava.zemoso;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<String> namesList= new ArrayList<>();
        namesList.add("Nivesh");
        namesList.add("Krishna");
        namesList.add("Ramesh");
        namesList.add("Ram");
        namesList.add("Seetha");
        namesList.add("Lakshman");

//        for (int i = 0;i<namesList.size();i++){
//            System.out.println(namesList.get(i));
//        }
        for (String name: namesList) {
            System.out.println(name);
        }
    }
}
