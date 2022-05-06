package com.corejava.zemoso.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args) {
        try {
            Scanner namesFile = new Scanner(new File(
                    "/home/niveS/IdeaProjects/CoreJava/src/com/corejava/zemoso/fileio/Student_names.txt"));
            Scanner agesFile = new Scanner(new File(
                    "/home/niveS/IdeaProjects/CoreJava/src/com/corejava/zemoso/fileio/Student_ages.txt"));
            PrintWriter printWriter = new PrintWriter(
                    "/home/niveS/IdeaProjects/CoreJava/src/com/corejava/zemoso/fileio/names_ages.txt");

            int tempAge;
            String tempName;
            while (namesFile.hasNext()){
                tempName = namesFile.nextLine();
                tempAge = agesFile.nextInt();
                printWriter.println(tempName+" is "+tempAge+" years old");
            }
            namesFile.close();
            agesFile.close();
            printWriter.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Some of the files not found");
        }
    }
}
