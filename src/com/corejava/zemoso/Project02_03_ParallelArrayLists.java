package com.corejava.zemoso;
import java.util.*;
public class Project02_03_ParallelArrayLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namesList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();

        for (int i = 0;i < 5; i++){
            System.out.println("Enter a name:\t");
            String name = scanner.nextLine();
            namesList.add(name);

            System.out.println("Enter the age:\t");
            int age = scanner.nextInt();
            scanner.nextLine();
            ageList.add(age);
        }
        for (int i = 0;i<namesList.size();i++){
            System.out.println(namesList.get(i)+" is "+ageList.get(i) +" years old");
        }
    }
}
