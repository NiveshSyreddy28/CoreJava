package com.corejava.zemoso.oops.encapsulation;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIceCream = new IceCream("vanilla", 120,2);
        myIceCream.addToppings("nuts");
        myIceCream.addToppings("cherries");
        System.out.println("Name: "+myIceCream.getName());
        System.out.println("Price: "+myIceCream.getCost());
        myIceCream.printToppings();

        IceCream yourIceCream = new IceCream("Chocolate",100,2);
        yourIceCream.addToppings("Sprinkles");
        System.out.println(yourIceCream.getName());
        System.out.println(yourIceCream.getCost());
        yourIceCream.printToppings();

    }
}
