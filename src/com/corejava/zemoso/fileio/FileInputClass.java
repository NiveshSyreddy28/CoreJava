package com.corejava.zemoso.fileio;
import java.util.Scanner;
import java.io.*;
public class FileInputClass {
    public static void main(String[] args) {
        try {
            Scanner inputFile = new Scanner(new File(
                    "/home/niveS/IdeaProjects/CoreJava/src/com/corejava/zemoso/fileio/input.txt"));
            while (inputFile.hasNext()) {
                System.out.println(inputFile.nextInt());
            }
            inputFile.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
