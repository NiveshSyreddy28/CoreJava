package com.corejava.zemoso.oops.encapsulation;

public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(3,8,"Red");
        printHouseData(myHouse);
        System.out.println();
        printHouseData(yourHouse);
    }
    public static void printHouseData(House house){
        System.out.println("No of Stories: "+house.getNoOfStories()+" No of windows: "+house.getNoOfWindows()+
                " Color of house: "+house.getColor());
    }
}
