package com.corejava.zemoso.lambdasandstreams;

public class AnonymousClass {
    public static void main(String[] args) {

        //Anonymous class implementation
        Cab cab = new Cab() {
            @Override
            public void bookCab(String source, String destination) {
                System.out.println("Cab booked from "+source+" to "+destination);
            }
        };
        cab.bookCab("Raidurgam","Hi-tech city");
    }
}
