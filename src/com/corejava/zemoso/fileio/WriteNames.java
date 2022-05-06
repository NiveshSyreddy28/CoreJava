package com.corejava.zemoso.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nivesh");
        names.add("Ram");
        names.add("krishna");
        names.add("Gopal");
        names.add("Lalith");

        try {
            PrintWriter printWriter = new PrintWriter(
                    "/home/niveS/IdeaProjects/CoreJava/src/com/corejava/zemoso/fileio/names.txt");

            for (String name : names) {
                printWriter.println(name);
            }
            printWriter.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Couldn't write to file");
        }
    }
}
