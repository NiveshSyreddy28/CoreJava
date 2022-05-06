package com.corejava.zemoso.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RectangleIODemo {
    public static void main(String[] args) {
        ArrayList<RectangleIO> rectangleArrayList = new ArrayList<>();

        fillArray(rectangleArrayList);
        printRectangle(rectangleArrayList);
    }

        public static void fillArray(ArrayList<RectangleIO> rectangleArrayList) {
            try {
                Scanner inputFile = new Scanner(new File(
                        "/home/niveS/IdeaProjects/CoreJava/src/com/corejava/zemoso/fileio/rectangle_data.txt"));
                double length;
                double width;

                while (inputFile.hasNext()) {
                    length = inputFile.nextDouble();
                    width = inputFile.nextDouble();
                    rectangleArrayList.add(new RectangleIO(length, width));
                }
                inputFile.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }

        public static void printRectangle(ArrayList<RectangleIO> rectangles){
            for (RectangleIO rectangle:rectangles) {
                System.out.println("Length: "+rectangle.getLength());
                System.out.println("Width:"+rectangle.getWidth());
                System.out.println("Area: "+rectangle.area());
                System.out.println("Perimeter: "+rectangle.perimiter());
                System.out.println();
            }

    }
}
