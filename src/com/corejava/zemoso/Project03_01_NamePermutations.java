package com.corejava.zemoso;
import java.util.*;
public class Project03_01_NamePermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        String name;
        int indexOfSpace;
        String firstName;
        String lastName;
        for (int i = 0;i<5;i++){
            System.out.println("Enter full name:");
            name = scanner.nextLine();
            indexOfSpace = name.indexOf(" ");
            firstName = name.substring(0,indexOfSpace);
            lastName = name.substring(indexOfSpace);
            firstNames.add(firstName);
            lastNames.add(lastName);
        }
//        for (int i = 0;i<5;i++){
//            System.out.println(firstNames.get(i)+lastNames.get(i));
//        }

        for (int i = 0;i<firstNames.size();i++){
            for (int j = 0;j<lastNames.size();j++){
                System.out.print(firstNames.get(i));
                System.out.println(lastNames.get(j));
            }

        }
    }
}
