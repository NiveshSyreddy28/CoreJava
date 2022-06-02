package com.corejava.zemoso.lambdasandstreams;

public class LambdaExpression {
    public static void main(String[] args) {

        Cab cab = (source, destination)->{
            System.out.println("Uber X booked from "+source+" to "+destination+". Arriving soon!!");
        };
        cab.bookCab("Kukatpally", "Cyber towers");
    }
}
