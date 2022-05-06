package com.corejava.zemoso.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CircleIODemo {
    public static void main(String[] args) {
        ArrayList<CircleIO> circleIOArrayList = new ArrayList<>();
        fillCircle(circleIOArrayList);
        printCircle(circleIOArrayList);
        printCircleToFile(circleIOArrayList);
    }

    public static void fillCircle(ArrayList<CircleIO> circleIOArrayList){
        try {
            Scanner inputFile = new Scanner(new File(
                    "/home/niveS/IdeaProjects/CoreJava/src/com/corejava/zemoso/fileio/Circle_data.txt"));
            double radius;
            while (inputFile.hasNext()){
                radius = inputFile.nextDouble();
                circleIOArrayList.add(new CircleIO(radius));
            }
            inputFile.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static void printCircleToFile(ArrayList<CircleIO>circleIOArrayList){
        try {
            PrintWriter printWriter = new PrintWriter(
                    "/home/niveS/IdeaProjects/CoreJava/src/com/corejava/zemoso/fileio/Circles_output.txt");
            for (CircleIO circle: circleIOArrayList) {
                printWriter.println("Radius: "+circle.getRadius());
                printWriter.println("Area: "+circle.getRadius());
                printWriter.println("Circumference: "+circle.circumference());
                printWriter.println();
            }
            printWriter.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Output file not found");
        }
    }
    public static void printCircle(ArrayList<CircleIO>circleIOArrayList){
        for (CircleIO circle: circleIOArrayList) {
            System.out.println("Radius: "+circle.getRadius());
            System.out.println("Area: "+circle.getRadius());
            System.out.println("Circumference: "+circle.circumference());
            System.out.println();
        }
    }
}
