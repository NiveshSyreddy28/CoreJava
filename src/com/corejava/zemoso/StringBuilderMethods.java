package com.corejava.zemoso;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Nivesh ");

        name.append("is awesome");
        System.out.println(name);

        name.insert(7,"Syreddy ");
        System.out.println(name);

        name.replace(18,25,"amazing");
        System.out.println(name);

        name.delete(7,15);
        System.out.println(name);
    }
}
