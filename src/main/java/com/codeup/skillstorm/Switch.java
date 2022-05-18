package com.codeup.skillstorm;

public class Switch {

    static void switchCase(String val){
        switch (val){
            case "A":
                System.out.println("one");
                break;
            case "B":
                System.out.println("two");
                break;
            case "C":
                System.out.println("three");
                break;
            default:
                System.out.println("fall");
                break;
        }
    }

    public static void main(String[] args) {

        switchCase("A");
        switchCase("C");
    }
}
