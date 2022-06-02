package com.corejava.zemoso.lambdasandstreams;

//Regular way of implementing the Interface

class UberX implements Cab{

    @Override
    public void bookCab(String source, String destination) {
        System.out.println("Cab booked from "+source+" to "+destination);
    }
}
