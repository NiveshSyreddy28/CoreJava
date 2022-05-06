package com.corejava.zemoso.oops.encapsulation;

public class House {
    private int noOfStories;
    private int noOfWindows;
    private String color;

    public House(){
        noOfStories = 2;
        noOfWindows = 4;
        color = "Yellow";
    }
    public House(int noOfStories, int noOfWindows, String color){
        this.noOfStories = noOfStories;
        this.noOfWindows = noOfWindows;
        this.color = color;
    }

    public int getNoOfStories() {
        return noOfStories;
    }

    public void setNoOfStories(int noOfStories) {
        this.noOfStories = noOfStories;
    }

    public int getNoOfWindows() {
        return noOfWindows;
    }

    public void setNoOfWindows(int noOfWindows) {
        this.noOfWindows = noOfWindows;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
