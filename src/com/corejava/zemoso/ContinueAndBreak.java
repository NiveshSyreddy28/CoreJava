package com.corejava.zemoso;

public class ContinueAndBreak {
    public static void main(String[] args) {
        int count = 0;

        while (count <= 20){
            if (count % 2 != 0){
                count++;
                continue;
            }
            System.out.println(count);
            count++;
        }
    }
}
