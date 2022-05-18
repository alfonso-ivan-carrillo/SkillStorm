package com.codeup.skillstorm;

public class Enchanced {

    static void loop(int[] array){
        for(int i : array){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        loop(new int[] {1, 2, 3, 4, 5});

        int[] newArray = new int[5];
        newArray[0] = 6;
        newArray[1] = 7;
        newArray[2] = 8;
        newArray[3] = 9;
        newArray[4] = 10;

        loop(newArray);

    }
}
