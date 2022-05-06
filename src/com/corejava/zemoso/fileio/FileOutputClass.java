package com.corejava.zemoso.fileio;
import java.io.*;
public class FileOutputClass {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter(
                    "/home/niveS/IdeaProjects/CoreJava/src/com/corejava/zemoso/fileio/output.txt");
            printWriter.println("Hello there");
            printWriter.println("I'm Nivesh Syreddy");
            printWriter.close();
        }

        catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Couldn't write to the file");
        }
    }
}
