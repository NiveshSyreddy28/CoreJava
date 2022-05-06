package com.corejava.zemoso.oops.encapsulation;

public class Rectangle {
    private Double length;
    private Double width;
    private static int numOfRectangles;

    public Rectangle(){
        this(1.0,1.0);
    }
    public Rectangle(Double length, Double width){
        this.length = length;
        this.width = width;
        numOfRectangles++;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public static int getNumOfRectangles(){
        return numOfRectangles;
    }

    public double area(){
        return this.length * this.width;
    }
    public double perimiter(){
        return 2*(this.length + this.width);
    }
}
