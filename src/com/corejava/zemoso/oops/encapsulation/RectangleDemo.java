package com.corejava.zemoso.oops.encapsulation;

import org.w3c.dom.css.Rect;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5.0,10.0);
        Rectangle r3 = new Rectangle(2.5,4.0);

        System.out.println(r1.area());
        System.out.println(r1.perimiter());

        System.out.println(r2.area());
        System.out.println(r2.perimiter());

        System.out.println(r3.area());
        System.out.println(r3.perimiter());

        System.out.println("Number of Rectangles created: "+Rectangle.getNumOfRectangles());
    }
}
