package com.corejava.zemoso.oops.encapsulation;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        System.out.println("Circle radius: "+circle.getRadius());
        System.out.println("Circle Area: "+String.format("%.2f",circle.area()));
        System.out.println("Circle circumference: "+String.format("%.2f",circle.circumference()));
    }
}
