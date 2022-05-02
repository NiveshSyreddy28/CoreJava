package com.corejava.zemoso;

import java.util.Locale;

public class StringMethodsAdvanced {
    public static void main(String[] args) {
        String myname = "Nivesh Syreddy";

        String nameUpper = myname.toUpperCase(Locale.ROOT);
        String nameLower = myname.toLowerCase();

        int indexOfV = myname.indexOf("v");

        String lastName = myname.substring(7);

        System.out.println("Upper is: "+nameUpper);
        System.out.println("Lower is: "+nameLower);
        System.out.println("V is at index: "+indexOfV);
        System.out.println("Last name is: "+lastName);
    }
}
